package dev.aurap.hub;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.LongSupplier;

public final class zf implements Co {
    public static final double READ_EVERY_S = 0.5;
    private static final long iG = 2500L;
    private static final String e = "function state() {\n  try {\n    var app = Application('Spotify');\n    if (!app.running()) return {s: 'closed'};\n    var st = app.playerState();\n    if (st === 'stopped') return {s: 'stopped'};\n    var t = app.currentTrack;\n    return {s: st, id: t.id(), name: t.name(), artist: t.artist(), album: t.album(),\n            duration: t.duration(), position: app.playerPosition(), art: t.artworkUrl()};\n  } catch (e) {\n    var n = e.errorNumber;\n    return {s: n === -1743 ? 'denied' : (n === -2700 || n === -10814) ? 'missing' : 'error', msg: String(e) + ' (' + n + ')'};\n  }\n}\n";
    private static final String A = "function state() {\n  try {\n    var app = Application('Spotify');\n    if (!app.running()) return {s: 'closed'};\n    var st = app.playerState();\n    if (st === 'stopped') return {s: 'stopped'};\n    var t = app.currentTrack;\n    return {s: st, id: t.id(), name: t.name(), artist: t.artist(), album: t.album(),\n            duration: t.duration(), position: app.playerPosition(), art: t.artworkUrl()};\n  } catch (e) {\n    var n = e.errorNumber;\n    return {s: n === -1743 ? 'denied' : (n === -2700 || n === -10814) ? 'missing' : 'error', msg: String(e) + ' (' + n + ')'};\n  }\n}\nObjC.import('Foundation');\nfunction run(argv) {\n  var out = $.NSFileHandle.fileHandleWithStandardOutput;\n  var every = parseFloat(argv[0]);\n  while (true) {\n    out.writeData($(JSON.stringify(state()) + '\\n').dataUsingEncoding($.NSUTF8StringEncoding));\n    delay(every);\n  }\n}\n";
    private final LongSupplier x;
    private final qg K;
    private final Object m;
    private HJ d;
    public static final int Wg;

    public zf(LongSupplier var1) {
        Object var2 = new Object();
        this.m = var2;
        this.x = var1;
        String var3 = String.valueOf(0.5);
        List var6 = List.of(
            "osascript",
            "-l",
            "JavaScript",
            "-e",
            "function state() {\n  try {\n    var app = Application('Spotify');\n    if (!app.running()) return {s: 'closed'};\n    var st = app.playerState();\n    if (st === 'stopped') return {s: 'stopped'};\n    var t = app.currentTrack;\n    return {s: st, id: t.id(), name: t.name(), artist: t.artist(), album: t.album(),\n            duration: t.duration(), position: app.playerPosition(), art: t.artworkUrl()};\n  } catch (e) {\n    var n = e.errorNumber;\n    return {s: n === -1743 ? 'denied' : (n === -2700 || n === -10814) ? 'missing' : 'error', msg: String(e) + ' (' + n + ')'};\n  }\n}\nObjC.import('Foundation');\nfunction run(argv) {\n  var out = $.NSFileHandle.fileHandleWithStandardOutput;\n  var every = parseFloat(argv[0]);\n  while (true) {\n    out.writeData($(JSON.stringify(state()) + '\\n').dataUsingEncoding($.NSUTF8StringEncoding));\n    delay(every);\n  }\n}\n",
            var3
        );
        Consumer var4 = var4y2 -> this.z((String)var4y2);
        var2 = new qg(var6, var4, var1);
        this.K = (qg)var2;
    }

    @Override
    public String name() {
        int var1 = System.identityHashCode(this);
        return "Spotify";
    }

    @Override
    public gM_2 timing() {
        int var1 = Wg;
        var1 ^= -1974279850;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var26;
        var2 = (var26 = var20 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 1144239542;
            var1 *= 556897505;
            var1 |= -908063988;
            var1 *= 1132377277;
            var1 ^= 1687105437;
            RuntimeException var22 = new RuntimeException();
            throw var22;
        } else {
            switch (var1) {
                case -2136755026:
                    var1 ^= 1708249886;
                    break;
                case -572861390:
                    var1 -= 403933803;
                    var1 ^= 1538286210;
                    break;
                case 78851905:
                default:
                    var1 ^= 1467637940;
            }

            return new gM_2(250L, 250L, 500L, 15000L);
        }
    }
    @Override
public FX poll() throws IOException {
    if (!this.K.ensureRunning()) {
        return null;
    }
    if (this.d != null && this.d.failure() != null) {
        throw this.d.failure();
    }
    return this.d != null ? this.d.track() : null;
}


    @Override
    public void send(Ar var1) throws IOException {
        String var114 = null;
        label141: {
            int var14;
            var14 = Wg;
            var14 ^= -845750666;
            int var3 = System.identityHashCode(this);
            int[] var4 = MA.l;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            label131:
            if (var5 == 0) {
                var14 += -273913070;
                var14 -= 1876024093;
                var14 ^= -412995816;
                Integer var123 = var14;
                if (var123 == null) {
                    break label141;
                }

                Gu var124 = var1.kind();
                int var125 = var124.ordinal();
                int var107 = var4[var125];
                label127:
                switch (var107) {
                    case 1:
                        var14 >>= 3;
                        var14 ^= -41202716;
                        Integer var130 = var14;
                        if (var130 == null) {
                            break label141;
                        }

                        var114 = "app.playpause();";
                        var14 &= -1289093910;
                        var14 |= 2085657943;
                        var14 *= -1804481227;
                        var14 ^= 1674202809;
                        break;
                    case 2:
                        var14 -= -14805658;
                        var14 &= 164688347;
                        var14 &= -1441729850;
                        var14 ^= -175694664;
                        var114 = "app.nextTrack();";
                        switch (var14) {
                            case -1356486065:
                                var14 ^= 1196632024;
                                break label127;
                            case -40424392:
                                var14 >>= 7;
                                var14 ^= 967828546;
                                break label127;
                            case 1879610247:
                            default:
                                var14 ^= -972389294;
                                break label127;
                        }
                    case 3:
                        var14 += 1221345817;
                        var14 -= -49936433;
                        var14 &= -910245830;
                        var14 ^= 697926923;
                        var14 ^= -1237916193;
                        var114 = "app.previousTrack();";
                        var14 -= 300166415;
                        var14 ^= 67074551;
                        break;
                    case 4:
                        var14 = switch (var14) {
                            default -> var14 ^ -1049832164;
                            case -1220437207 -> var14 ^ 1557686752;
                            case -23374817 -> {
                                var14 ^= 1359196500;
                                var14 >>>= 27;
                                var14 += -1833212700;
                                yield var14 ^ -1900557722;
                            }
                        };
                        long var126 = var14;
                        long var7 = var126 + 1L;
                        var7 = var126 * var7;
                        long var9 = var126 + 2L;
                        var7 *= var9;
                        long var127 = var126 + 3L;
                        var7 *= var127;
                        long var128 = var7 & 7L;
                        long var179;
                        var125 = (var179 = var128 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                        if (var125 != 0) {
                            break label141;
                        }

                        var114 = "app.playerPosition = 0;";
                        var14 -= -1175484511;
                        var14 -= -141107214;
                        var14 <<= 19;
                        var14 ^= -30094822;
                        break;
                    case 5:
                        var14 = switch (var14) {
                            case -282636350 -> var14 ^ -824555256;
                            case -23374817 -> {
                                var14 >>>= 19;
                                var14 *= -736412889;
                                var14 += -7380961;
                                yield var14 ^ 990580407;
                            }
                            default -> var14 ^ 590754122;
                        };
                        long var110 = var1.argument();
                        double var111 = var110;
                        double var112 = var111 / 1000.0;
                        Integer var153 = var3;
                        if (var153 == null) {
                            var14 += -1011938336;
                            var14 ^= 1639842306;
                            break label131;
                        }

                        var14 *= 852689471;
                        var14 >>>= 14;
                        var14 -= -145954231;
                        var14 ^= 362075446;
                        String var113 = "app.playerPosition = " + var112 + ";";
                        var114 = var113;
                        var14 &= -330699357;
                        var14 ^= -900429896;
                        break;
                    default:
                        var14 &= -1599037712;
                        var14 <<= 2;
                        var14 ^= -553725111;
                        var3 = var14 + 1;
                        var3 = var14 * var3;
                        int var108 = var14 + 2;
                        var3 *= var108;
                        int var109 = var14 + 3;
                        var3 *= var109;
                        var3 &= 7;
                        if (var3 == 0) {
                            MatchException var103 = new MatchException(null, null);
                            throw var103;
                        }
                        break label141;
                }

                Integer var131 = var14;
                if (var131 == null) {
                    break label141;
                }

                String var115 = "function state() {\n  try {\n    var app = Application('Spotify');\n    if (!app.running()) return {s: 'closed'};\n    var st = app.playerState();\n    if (st === 'stopped') return {s: 'stopped'};\n    var t = app.currentTrack;\n    return {s: st, id: t.id(), name: t.name(), artist: t.artist(), album: t.album(),\n            duration: t.duration(), position: app.playerPosition(), art: t.artworkUrl()};\n  } catch (e) {\n    var n = e.errorNumber;\n    return {s: n === -1743 ? 'denied' : (n === -2700 || n === -10814) ? 'missing' : 'error', msg: String(e) + ' (' + n + ')'};\n  }\n}\nfunction run() { var app = Application('Spotify'); if (app.running()) { "
                    + var114
                    + " delay(0.15); } return JSON.stringify(state()); }";
                List var116 = List.of("osascript", "-l", "JavaScript", "-e", var115);
                FN var117 = CG.XK(4000L, var116);
                var131 = var3;
                if (var131 == null) {
                    var14 &= 702292119;
                    var14 ^= -624609362;
                    var14 ^= 1966916757;
                    var14 &= 1004223268;
                    var14 ^= -1561865743;
                } else {
                    var14 = switch (var14) {
                        case -967521766 -> {
                            var14 &= -592141829;
                            var14 >>>= 23;
                            var14 -= 1268573500;
                            yield var14 ^ 1831226892;
                        }
                        case 518220557 -> var14 ^ -2499142;
                        default -> var14 ^ -6290783;
                    };
                    var131 = var14;
                    if (var131 == null) {
                        break label141;
                    }

                    int var134 = var117.exitCode();
                    if (var134 != 0) {
                        var14 ^= -654814603;
                        var14 &= -1201052591;
                        var14 |= 1155459969;
                        var14 ^= 919283864;
                        String var135 = var117.stderr();
                        Integer var154 = var3;
                        if (var154 != null) {
                            var14 += -1551205165;
                            var14 ^= 1199188519;
                            long var155 = var14;
                            long var8 = var155 + 1L;
                            var8 = var155 * var8;
                            long var156 = var8 & 1L;
                            long var180;
                            int var157 = (var180 = var156 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                            if (var157 == 0) {
                                int var136 = (var135.contains("-1743")) ? 1 : 0;
                                if (var136 != 0) {
                                    var14 &= 789145247;
                                    var14 >>>= 27;
                                    var14 += 2120232436;
                                    var14 |= -1168155018;
                                    var14 ^= 555432872;
                                    long var137 = var14;
                                    long var164 = var137 + 1L;
                                    var164 = var137 * var164;
                                    long var138 = var164 & 1L;
                                    long var181;
                                    var136 = (var181 = var138 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                                    if (var136 == 0) {
                                        yq var140 = Q();
                                        throw var140;
                                    }
                                } else {
                                    var14 *= 689473511;
                                    var14 >>= 5;
                                    var14 *= 283425117;
                                    var14 >>= 26;
                                    var14 ^= -521728446;
                                    long var141 = var14;
                                    long var166 = var141 + 1L;
                                    var166 = var141 * var166;
                                    long var177 = var141 + 2L;
                                    var166 *= var177;
                                    long var142 = var141 + 3L;
                                    var166 *= var142;
                                    long var143 = var166 & 7L;
                                    long var182;
                                    var136 = (var182 = var143 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                                    if (var136 == 0) {
                                        String var158 = var117.stderr();
                                        String var159 = var158.strip();
                                        String var160 = "osascript: " + var159;
                                        IOException var145 = new IOException(var160);
                                        throw var145;
                                    }
                                }
                            }
                            break label141;
                        }

                        var14 *= -459165069;
                        var14 ^= -1711746615;
                        var14 |= 1531163132;
                        var14 ^= -411173529;
                        var14 ^= 357605448;
                    } else {
                        var14 |= 1197107224;
                        var14 *= 930747745;
                        var14 |= 372749635;
                        var14 ^= 779158966;
                        Integer var146 = var14;
                        if (var146 == null) {
                            break label141;
                        }

                        String var118 = var117.stdout();
                        long var147 = var3;
                        long var170 = var147 + 1L;
                        var170 = var147 * var170;
                        long var178 = var147 + 2L;
                        var170 *= var178;
                        long var148 = var147 + 3L;
                        var170 *= var148;
                        long var149 = var170 & 7L;
                        long var183;
                        var3 = (var183 = var149 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var14 *= -1771231199;
                            var14 >>>= 24;
                            var14 *= 1331256783;
                            var14 ^= 298694240;
                            long var150 = var14;
                            var170 = var150 + 1L;
                            var170 = var150 * var170;
                            long var151 = var170 & 1L;
                            long var184;
                            var3 = (var184 = var151 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
                            if (var3 == 0) {
                                String var106 = var118.strip();
                                this.z(var106);
                                return;
                            }
                            break label141;
                        }

                        switch (var14) {
                            case -1874414867:
                                var14 ^= -1535607600;
                                var14 &= 425713240;
                                var14 += 51951527;
                                var14 >>>= 20;
                                var14 ^= -1989221406;
                                break;
                            case 883390897:
                                var14 ^= -512128125;
                                break;
                            case 1049737131:
                            default:
                                var14 ^= -526911142;
                        }
                    }
                }
            } else {
                var14 *= -940291765;
                var14 += 445195963;
                var14 ^= -1801009712;
            }

            Integer var91 = var14;
            if (var91 != null) {
                IllegalArgumentException var92 = new IllegalArgumentException();
                throw var92;
            }
        }

        IllegalStateException var97 = new IllegalStateException();
        throw var97;
    }

    @Override
    public void close() {
        int var1 = Wg;
        var1 ^= 1827833580;
        Object var2 = null;
        qg var3 = this.K;
        var3.close();
        var1 += -1426551995;
        var1 ^= -640739553;
        var1 &= 1630621827;
        var1 -= 1396280470;
        var1 ^= 590443786;
        Throwable var62 = null;
        Object var4 = var62;
        synchronized (var62){}
        var1 += 1993761616;
        var1 >>= 18;
        var1 &= 1136722813;
        var1 &= -147733345;
        var1 ^= 1553620826;
        int var63 = var1 + 1;
        int var64 = var1 * var63;
        int var5 = var1 + 2;
        int var65 = var64 * var5;
        var5 = var1 + 3;
        int var66 = var65 * var5;
        int var67 = var66 & 7;
        label35:
        if (var67 == 0) {
            label52: {
                label53: {
                    try {
                        var1 -= 2950559;
                        var1 &= 2018460428;
                        var1 *= -2112670283;
                        var1 ^= -838015165;
                        var1 ^= -304922427;
                        this.d = null;
                        var1 >>= 4;
                        var1 |= 1859623509;
                        var1 ^= 1311029623;
                    } catch (Throwable var13) {
                        int var25 = Wg;
                        int var26 = var25 ^ 735725264;
                        var62 = var13;
                        int var27 = var26 - -1046067878;
                        int var28 = var27 | -1535055086;
                        int var29 = var28 ^ -13428289;
                        var1 = var29 ^ 690748970;
                        var5 = var1 + 1;
                        var5 = var1 * var5;
                        int var6 = var1 + 2;
                        var5 *= var6;
                        var6 = var1 + 3;
                        var5 *= var6;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label35;
                        }
                        break label53;
                    }

                    long var76 = var1;
                    long var7 = var76 + 1L;
                    var7 = var76 * var7;
                    long var9 = var76 + 2L;
                    var7 *= var9;
                    long var77 = var76 + 3L;
                    var7 *= var77;
                    long var78 = var7 & 7L;
                    long var97;
                    int var69 = (var97 = var78 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                    if (var69 != 0) {
                        break label35;
                    }

                    try {
                        var1 -= 788952191;
                        var1 *= 339067833;
                        var1 -= -1762076362;
                        var1 ^= 1600878856;
                        break label52;
                    } catch (Throwable var12) {
                        int var39 = Wg;
                        int var40 = var39 ^ 735725264;
                        var62 = var12;
                        int var41 = var40 - -1046067878;
                        int var42 = var41 | -1535055086;
                        int var43 = var42 ^ -13428289;
                        var1 = var43 ^ 690748970;
                        var5 = var1 + 1;
                        var5 = var1 * var5;
                        int var90 = var1 + 2;
                        var5 *= var90;
                        var90 = var1 + 3;
                        var5 *= var90;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label35;
                        }
                    }
                }

                while (true) {
                    try {
                        var1 += -1297004643;
                        var1 += 1103473732;
                        var1 &= 386154162;
                        var1 >>>= 27;
                        var1 ^= 1259789538;
                        throw var62;
                    } catch (Throwable var11) {
                        int var44 = Wg;
                        int var45 = var44 ^ 735725264;
                        var62 = var11;
                        int var46 = var45 - -1046067878;
                        int var47 = var46 | -1535055086;
                        int var48 = var47 ^ -13428289;
                        var1 = var48 ^ 690748970;
                        var5 = var1 + 1;
                        var5 = var1 * var5;
                        int var92 = var1 + 2;
                        var5 *= var92;
                        var92 = var1 + 3;
                        var5 *= var92;
                        var5 &= 7;
                        if (var5 != 0) {
                            break label35;
                        }
                    }
                }
            }

            var2 = var1;
            if (var2 != null) {
                var1 |= -556658539;
                var1 ^= 287845557;
                return;
            }
        }

        IllegalStateException var60 = new IllegalStateException();
        throw var60;
    }

    private void z(String var1) {
        LongSupplier var157 = null;
        long var158 = 0L;
        Throwable var3 = null;
        Throwable var31 = null;
        label183: {
            HJ var28;
            int var96;
            label184: {
                HJ var160;
                label196: {
                    int var7;
                    label197: {
                        try {
                            var96 = Wg;
                            var96 ^= 1920307983;
                            Object var5 = null;
                            var96 ^= 1838421870;
                            var96 &= 910028449;
                            var96 *= -1661716973;
                            var96 ^= 740129346;
                        } catch (Throwable var24) {
                            var3 = var24;
                            int var4 = Wg;
                            int var32 = var4 ^ -470524556;
                            var7 = (var24 instanceof IOException) ? 1 : 0;
                            int var33 = var32 * -1203738831;
                            int var34 = var33 >>> 3;
                            int var35 = var34 | -1175638035;
                            int var36 = var35 | -1474239436;
                            var96 = var36 ^ 249543243;
                            long var8 = var96;
                            long var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var8 = var10 & 1L;
                            long var224;
                            int var181 = (var224 = var8 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                            if (var181 != 0) {
                                break label183;
                            }
                            break label197;
                        }

                        Integer var6 = var96;
                        if (var6 == null) {
                            break label183;
                        }

                        try {
                            Object var2 = null;
                            var96 ^= -727328145;
                            var96 ^= 879540512;
                        } catch (Throwable var23) {
                            var3 = var23;
                            int var44 = Wg;
                            int var45 = var44 ^ -470524556;
                            var7 = (var23 instanceof IOException) ? 1 : 0;
                            int var46 = var45 * -1203738831;
                            int var47 = var46 >>> 3;
                            int var48 = var47 | -1175638035;
                            int var49 = var48 | -1474239436;
                            var96 = var49 ^ 249543243;
                            long var182 = var96;
                            long var212 = var182 + 1L;
                            var212 = var182 * var212;
                            var182 = var212 & 1L;
                            long var225;
                            int var184 = (var225 = var182 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                            if (var184 != 0) {
                                break label183;
                            }
                            break label197;
                        }

                        Integer var156 = var96;
                        if (var156 == null) {
                            break label183;
                        }

                        try {
                            var157 = this.x;
                        } catch (Throwable var22) {
                            var3 = var22;
                            int var52 = Wg;
                            int var53 = var52 ^ -470524556;
                            var7 = (var22 instanceof IOException) ? 1 : 0;
                            int var54 = var53 * -1203738831;
                            int var55 = var54 >>> 3;
                            int var56 = var55 | -1175638035;
                            int var57 = var56 | -1474239436;
                            var96 = var57 ^ 249543243;
                            long var185 = var96;
                            long var214 = var185 + 1L;
                            var214 = var185 * var214;
                            var185 = var214 & 1L;
                            long var226;
                            int var187 = (var226 = var185 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                            if (var187 != 0) {
                                break label183;
                            }
                            break label197;
                        }
                        var96 = switch (var96) {
                            case 723455774 -> {
                                var96 *= 2088840177;
                                var96 &= 1015725182;
                                var96 *= 1787319165;
                                yield var96 ^ -94309077;
                            }
                            case 1091486241 -> var96 ^ -1964731466;
                            default -> var96 ^ -1869027400;
                        };
                        long var162 = var96;
                        long var9 = var162 + 1L;
                        var9 = var162 * var9;
                        long var11 = var162 + 2L;
                        var9 *= var11;
                        long var163 = var162 + 3L;
                        var9 *= var163;
                        long var164 = var9 & 7L;
                        long var227;
                        var7 = (var227 = var164 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label183;
                        }

                        try {
                            var158 = var157.getAsLong();
                            var96 *= 582503697;
                            var96 += 1270311689;
                            var96 |= -893663276;
                            var96 -= -2024945642;
                            var96 ^= -334480072;
                        } catch (Throwable var21) {
                            var3 = var21;
                            int var62 = Wg;
                            int var63 = var62 ^ -470524556;
                            var7 = (var21 instanceof IOException) ? 1 : 0;
                            int var64 = var63 * -1203738831;
                            int var65 = var64 >>> 3;
                            int var66 = var65 | -1175638035;
                            int var67 = var66 | -1474239436;
                            var96 = var67 ^ 249543243;
                            long var188 = var96;
                            long var216 = var188 + 1L;
                            var216 = var188 * var216;
                            var188 = var216 & 1L;
                            long var228;
                            int var190 = (var228 = var188 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                            if (var190 != 0) {
                                break label183;
                            }
                            break label197;
                        }

                        Integer var191 = var96;
                        if (var191 == null) {
                            break label183;
                        }

                        try {
                            var160 = yT(var1, var158);
                            var96 |= 1120565886;
                            var96 ^= -904665415;
                        } catch (Throwable var20) {
                            var3 = var20;
                            int var73 = Wg;
                            int var74 = var73 ^ -470524556;
                            var7 = (var20 instanceof IOException) ? 1 : 0;
                            int var75 = var74 * -1203738831;
                            int var76 = var75 >>> 3;
                            int var77 = var76 | -1175638035;
                            int var78 = var77 | -1474239436;
                            var96 = var78 ^ 249543243;
                            long var192 = var96;
                            long var218 = var192 + 1L;
                            var218 = var192 * var218;
                            long var193 = var218 & 1L;
                            long var229;
                            int var194 = (var229 = var193 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label183;
                            }
                            break label197;
                        }

                        long var166 = var96;
                        var9 = var166 + 1L;
                        var9 = var166 * var9;
                        long var167 = var9 & 1L;
                        long var230;
                        var7 = (var230 = var167 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label183;
                        }

                        try {
                            var160 = var160;
                            var96 -= 989446820;
                            var96 *= -1559227621;
                            var96 ^= 1141250762;
                            var96 ^= -1256354429;
                            break label196;
                        } catch (Throwable var19) {
                            var3 = var19;
                            int var81 = Wg;
                            int var82 = var81 ^ -470524556;
                            var7 = (var19 instanceof IOException) ? 1 : 0;
                            int var83 = var82 * -1203738831;
                            int var84 = var83 >>> 3;
                            int var85 = var84 | -1175638035;
                            int var86 = var85 | -1474239436;
                            var96 = var86 ^ 249543243;
                            long var195 = var96;
                            long var220 = var195 + 1L;
                            var220 = var195 * var220;
                            long var196 = var220 & 1L;
                            long var231;
                            int var197 = (var231 = var196 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                            if (var197 != 0) {
                                break label183;
                            }
                        }
                    }

                    if (var7 == 0) {
                        var96 += 2051422641;
                        var96 -= 1645105839;
                        var96 -= -360529263;
                        var96 ^= 1911052395;
                        var7 = var96 + 1;
                        var7 = var96 * var7;
                        var7 &= 1;
                        if (var7 == 0) {
                            throw UncheckedExceptions.rethrow(var3);
                        }
                        break label183;
                    }
                    var96 = switch (var96) {
                        default -> var96 ^ -960240858;
                        case -1256041036 -> {
                            var96 >>= 5;
                            var96 *= -503799043;
                            var96 |= -770574710;
                            yield var96 ^ -2063133283;
                        }
                        case -692059019 -> var96 ^ -952547394;
                    };
                    IOException var146 = (IOException)var3;

                    var96 = switch (var96) {
                        case -1589173335 -> var96 ^ 1593447364;
                        default -> var96 ^ 1562728059;
                        case 1469508454 -> {
                            var96 >>>= 7;
                            yield var96 ^ 1445884360;
                        }
                    };
                    HJ var147 = new HJ(null, var146);
                    var96 += 947022278;
                    var96 ^= 1052275285;
                    Integer var27 = var96;
                    if (var27 == null) {
                        break label183;
                    }

                    var28 = var147;
                    var96 ^= 736464461;
                    var96 ^= -345364411;
                    break label184;
                }

                Integer var148 = var96;
                if (var148 == null) {
                    break label183;
                }

                var28 = var160;
                var96 *= 864826613;
                var96 ^= 1817584985;
                var96 -= -983771384;
                var96 &= 2057755800;
                var96 ^= 708839841;
            }

            Object var149 = this.m;
            var96 ^= 958296554;
            var96 ^= 2106940862;
            Object var161 = var149;
            synchronized (var149){}
            var96 *= -166755849;
            var96 ^= -1426806026;
            var96 |= 858011397;
            var96 += -1603371587;
            var96 ^= 615059856;

            Throwable var10000;
            label198: {
                try {
                    var96 += -696068112;
                    var96 ^= -113208317;
                } catch (Throwable var18) {
                    var10000 = var18;
                    break label198;
                }

                long var172 = var96;
                long var203 = var172 + 1L;
                var203 = var172 * var203;
                long var222 = var172 + 2L;
                var203 *= var222;
                var172 += 3L;
                var203 *= var172;
                var172 = var203 & 7L;
                long var232;
                int var150 = (var232 = var172 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                if (var150 != 0) {
                    break label183;
                }

                try {
                    this.d = var28;
                } catch (Throwable var17) {
                    var10000 = var17;
                    break label198;
                }
                var96 = switch (var96) {
                    default -> var96 ^ -380219511;
                    case -393975687 -> {
                        var96 *= -392789275;
                        yield var96 ^ 195384700;
                    }
                    case 2128397372 -> var96 ^ 1439827623;
                };

                try {
                    var28 = (HJ)this.m;
                    var96 -= 1336445725;
                    var96 &= 1860808207;
                    var96 >>= 9;
                    var96 |= 859620814;
                    var96 ^= 1041282698;
                } catch (Throwable var16) {
                    var10000 = var16;
                    break label198;
                }

                int var151 = var96 + 1;
                int var152 = var96 * var151;
                int var175 = var96 + 2;
                int var153 = var152 * var175;
                int var176 = var96 + 3;
                int var154 = var153 * var176;
                int var155 = var154 & 7;
                if (var155 != 0) {
                    break label183;
                }

                try {
                    var28.notifyAll();
                    var96 -= -147939427;
                    var96 &= -1313983146;
                    var96 *= 2140568981;
                    var96 ^= 95656474;
                    var96 ^= 943951052;
                } catch (Throwable var15) {
                    var10000 = var15;
                    break label198;
                }

                var172 = var96;
                var203 = var172 + 1L;
                var203 = var172 * var203;
                var222 = var172 + 2L;
                var203 *= var222;
                var172 += 3L;
                var203 *= var172;
                var172 = var203 & 7L;
                long var233;
                int var30 = (var233 = var172 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                if (var30 != 0) {
                    break label183;
                }

                try {
                    var96 >>>= 11;
                    var96 |= -1224072817;
                    var96 += 32441022;
                    var96 ^= 790564738;
                } catch (Throwable var14) {
                    var10000 = var14;
                    break label198;
                }

                var96 ^= 198337393;
                var96 += 437476233;
                var96 ^= -568496208;
                return;
            }

            while (true) {
                try {
                    Throwable var25 = var10000;
                    var96 = Wg;
                    var96 ^= -771138469;
                    var31 = var25;
                    var96 >>>= 22;
                    var96 ^= 149707776;
                    break;
                } catch (Throwable var13) {
                    var10000 = var13;
                }
            }

            switch (var96) {
                case -471590439:
                    var96 ^= -331724842;
                    break;
                case 149708310:
                    var96 &= -1393802962;
                    var96 += -35271413;
                    var96 ^= -409131952;
                    break;
                case 2024862222:
                default:
                    var96 ^= -1417182860;
            }

            throw UncheckedExceptions.rethrow(var31);
        }

        RuntimeException var26 = new RuntimeException();
        throw var26;
    }

    public static HJ yT(String var0, long var1) throws IOException {
        com.google.gson.JsonElement var5 = null;
        label399: {
            int var54;
            JsonObject var233;
            label351: {
                RuntimeException var3;
                label350: {
                    label349: {
                        label348: {
                            label400: {
                                try {
                                    var54 = Wg;
                                    var54 ^= 113725405;
                                    var3 = null;
                                    var54 ^= -1367015156;
                                    var54 &= 1882032166;
                                    var54 += -1435307637;
                                    var54 ^= 1388127652;
                                    var5 = JsonParser.parseString(var0);
                                } catch (IllegalStateException | JsonParseException var21) {
                                    var54 = Wg;
                                    var54 ^= 906563092;
                                    Throwable var6 = a(var21);
                                    var3 = (RuntimeException)var6;
                                    switch (var54) {
                                        case 394448268:
                                        default:
                                            break label349;
                                        case 1545006719:
                                            break label400;
                                        case 1635859312:
                                            break label348;
                                    }
                                }
                                var54 = switch (var54) {
                                    case 928048072 -> var54 ^ 2113071306;
                                    case 1221057547 -> {
                                        var54 <<= 21;
                                        var54 -= 480189575;
                                        var54 -= -1107837048;
                                        yield var54 ^ 1447276359;
                                    }
                                    default -> var54 ^ 278930758;
                                };

                                try {
                                    var233 = var5.getAsJsonObject();
                                    var54 &= -1044299169;
                                    var54 -= 1007456375;
                                    var54 >>= 28;
                                    var54 ^= -618796879;
                                } catch (IllegalStateException | JsonParseException var20) {
                                    var54 = Wg;
                                    var54 ^= 906563092;
                                    Throwable var234 = a(var20);
                                    var3 = (RuntimeException)var234;
                                    switch (var54) {
                                        case 394448268:
                                        default:
                                            break label349;
                                        case 1545006719:
                                            break label400;
                                        case 1635859312:
                                            break label348;
                                    }
                                }

                                long var235 = var54;
                                long var8 = var235 + 1L;
                                var8 = var235 * var8;
                                long var10 = var235 + 2L;
                                var8 *= var10;
                                var235 += 3L;
                                var8 *= var235;
                                var235 = var8 & 7L;
                                long var385;
                                int var238 = (var385 = var235 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                                if (var238 != 0) {
                                    break label399;
                                }

                                try {
                                    var233 = var233;
                                    var54 -= 1221251098;
                                    var54 |= 764687341;
                                    var54 &= 1020039364;
                                    var54 ^= -1684351490;
                                    break label351;
                                } catch (IllegalStateException | JsonParseException var19) {
                                    var54 = Wg;
                                    var54 ^= 906563092;
                                    Throwable var239 = a(var19);
                                    var3 = (RuntimeException)var239;
                                    switch (var54) {
                                        case 394448268:
                                        default:
                                            break label349;
                                        case 1545006719:
                                            break;
                                        case 1635859312:
                                            break label348;
                                    }
                                }
                            }

                            var54 ^= -145177992;
                            break label350;
                        }

                        var54 >>= 5;
                        var54 |= 1889182495;
                        var54 += 470851558;
                        var54 *= 213098389;
                        var54 ^= 863380220;
                        break label350;
                    }

                    var54 ^= 467426561;
                }

                IOException var240 = new IOException("unreadable osascript line", var3);
                throw var240;
            }
            var54 = switch (var54) {
                case -1491155654 -> {
                    var54 *= -1640223827;
                    yield var54 ^ 440114243;
                }
                case -1190306243 -> var54 ^ -1882223845;
                default -> var54 ^ -1891074261;
            };
            String var23 = dT.N(var233, "s", "");

            var54 = switch (var54) {
                case -1301136778 -> var54 ^ 1782950867;
                default -> var54 ^ -1666454444;
                case 985635441 -> {
                    var54 += 1274282807;
                    yield var54 ^ 1654615468;
                }
            };
            int var241 = var54 + 1;
            var241 = var54 * var241;
            var241 &= 1;
            label305:
            if (var241 == 0) {
                int var272;
                int var7 = -1;
                var272 = var23.hashCode();
                label304:
                switch (var272) {
                    case -1884319283:
                        var54 += 2128686639;
                        var54 ^= 952036120;
                        var54 *= -2117733747;
                        var54 >>>= 7;
                        var54 ^= 285070904;
                        int var323 = var54 + 1;
                        var323 = var54 * var323;
                        var323 &= 1;
                        if (var323 != 0) {
                            break label305;
                        }

                        int var244 = (var23.equals("stopped")) ? 1 : 0;
                        var54 ^= 365592845;
                        var54 ^= -1673416904;
                        Integer var326 = var54;
                        if (var326 == null) {
                            break label305;
                        }

                        if (var244 != 0) {
                            var54 ^= 1717725602;
                            var54 ^= -89972549;
                            var244 = var54 + 1;
                            var244 = var54 * var244;
                            var244 &= 1;
                            if (var244 != 0) {
                                break label305;
                            }

                            byte var248 = 3;
                            var54 -= 243614003;
                            var54 ^= 1678512556;
                            long var327 = var54;
                            long var365 = var327 + 1L;
                            var365 = var327 * var365;
                            long var328 = var365 & 1L;
                            long var394;
                            int var329 = (var394 = var328 - 0L) == 0L ? 0 : (var394 < 0L ? -1 : 1);
                            if (var329 != 0) {
                                break label305;
                            }

                            var272 = var248;
                            var54 |= -1246226344;
                            var54 ^= 1877243424;
                        } else {
                            var54 = switch (var54) {
                                case -1723049648 -> {
                                    var54 += -618332062;
                                    var54 >>>= 5;
                                    var54 *= -1902261607;
                                    yield var54 ^ -1674589215;
                                }
                                case -881281309 -> var54 ^ 2119782629;
                                default -> var54 ^ -1341223726;
                            };
                            Integer var249 = var54;
                            if (var249 == null) {
                                break label305;
                            }

                            var272 = var7;
                            switch (var54) {
                                case -1848410780:
                                    var54 &= 1116317311;
                                    var54 ^= 1045851047;
                                    var54 ^= 160375495;
                                    var54 ^= -1547542092;
                                    var54 ^= 1288021098;
                                    break label304;
                                case -467578522:
                                    var54 ^= 528661867;
                                    break label304;
                                case 260281717:
                                default:
                                    var54 ^= -205793073;
                            }
                        }
                        break;
                    case -1357520532:
                        var54 = switch (var54) {
                            case -466817020 -> {
                                var54 ^= -11234896;
                                yield var54 ^ -656301674;
                            }
                            default -> var54 ^ -1940787098;
                            case 1941424832 -> var54 ^ -1834916687;
                        };
                        int var313 = (var23.equals("closed")) ? 1 : 0;
                        var54 >>>= 8;
                        var54 >>>= 1;
                        var54 &= 1857338004;
                        var54 -= -411899298;
                        var54 ^= -1417701109;
                        int var344 = var54 + 1;
                        var344 = var54 * var344;
                        var344 &= 1;
                        if (var344 != 0) {
                            break label305;
                        }

                        if (var313 != 0) {
                            var54 += -1723933660;
                            var54 ^= 433253088;
                            long var314 = var54;
                            long var363 = var314 + 1L;
                            var363 = var314 * var363;
                            long var315 = var363 & 1L;
                            long var393;
                            var313 = (var393 = var315 - 0L) == 0L ? 0 : (var393 < 0L ? -1 : 1);
                            if (var313 != 0) {
                                break label305;
                            }

                            byte var317 = 2;
                            var54 ^= 1262911535;
                            var54 *= -1151547711;
                            var54 ^= -1566373130;
                            var272 = var317;
                            var54 >>>= 4;
                            var54 &= -2092959315;
                            var54 ^= -664110761;
                        } else {
                            var54 = switch (var54) {
                                case -1278081239 -> {
                                    var54 += 1676768982;
                                    var54 >>>= 20;
                                    yield var54 ^ 856701076;
                                }
                                case -838665127 -> var54 ^ 1019372228;
                                default -> var54 ^ 389710621;
                            };
                            var313 = var54 + 1;
                            var313 = var54 * var313;
                            var344 = var54 + 2;
                            var313 *= var344;
                            var344 = var54 + 3;
                            var313 *= var344;
                            var313 &= 7;
                            if (var313 != 0) {
                                break label305;
                            }

                            var272 = var7;
                            var54 &= -1113256638;
                            var54 *= -1319268695;
                            var54 ^= 574108570;
                        }
                        break;
                    case -1335395429:
                        var54 |= -2128898879;
                        var54 -= 394675779;
                        var54 ^= 704307456;
                        var54 |= 557828560;
                        var54 ^= 1786778602;
                        int var308 = (var23.equals("denied")) ? 1 : 0;
                        var54 ^= -1122003320;
                        var54 -= -2137710285;
                        var54 *= -379797341;
                        var54 ^= 1476388278;
                        if (var308 != 0) {
                            var54 |= 1673576827;
                            var54 ^= -249858248;
                            var308 = (byte)5;

                            var54 = switch (var54) {
                                case -1304047829 -> var54 ^ -626025831;
                                case 381794371 -> {
                                    var54 |= 1364319776;
                                    var54 *= -879773949;
                                    yield var54 ^ -472501525;
                                }
                                default -> var54 ^ -754462726;
                            };
                            long var340 = var54;
                            long var373 = var340 + 1L;
                            var373 = var340 * var373;
                            long var381 = var340 + 2L;
                            var373 *= var381;
                            var340 += 3L;
                            var373 *= var340;
                            var340 = var373 & 7L;
                            long var392;
                            int var343 = (var392 = var340 - 0L) == 0L ? 0 : (var392 < 0L ? -1 : 1);
                            if (var343 != 0) {
                                break label305;
                            }

                            var272 = var308;
                            var54 *= -817071519;
                            var54 -= 226405115;
                            var54 |= -330346152;
                            var54 ^= 906001669;
                        } else {
                            var54 = switch (var54) {
                                case -988098783 -> {
                                    var54 *= 1595031839;
                                    var54 &= -1810489053;
                                    var54 &= 681256705;
                                    var54 *= 1451057243;
                                    yield var54 ^ 1637766437;
                                }
                                default -> var54 ^ -1166051733;
                                case 370478454 -> var54 ^ -1291740252;
                            };
                            var308 = var54 + 1;
                            var308 = var54 * var308;
                            var308 &= 1;
                            if (var308 != 0) {
                                break label305;
                            }

                            var272 = var7;
                            var54 >>= 27;
                            var54 <<= 13;
                            var54 |= 282363934;
                            var54 ^= -930398012;
                        }
                        break;
                    case -995321554:
                        var54 = switch (var54) {
                            default -> var54 ^ 254946570;
                            case -466817020 -> {
                                var54 -= 1407846602;
                                var54 &= 389918673;
                                var54 -= 855317478;
                                yield var54 ^ -1949680418;
                            }
                            case -16001102 -> var54 ^ 2031855593;
                        };
                        long var301 = var54;
                        long var359 = var301 + 1L;
                        var359 = var301 * var359;
                        long var379 = var301 + 2L;
                        var359 *= var379;
                        var301 += 3L;
                        var359 *= var301;
                        var301 = var359 & 7L;
                        long var390;
                        int var304 = (var390 = var301 - 0L) == 0L ? 0 : (var390 < 0L ? -1 : 1);
                        if (var304 != 0) {
                            break label305;
                        }

                        boolean var305 = var23.equals("paused");
                        var54 &= 587497459;
                        var54 &= -133101379;
                        var54 >>>= 14;
                        var54 ^= -239141268;
                        long var337 = var54;
                        long var371 = var337 + 1L;
                        var371 = var337 * var371;
                        var337 = var371 & 1L;
                        long var391;
                        int var339 = (var391 = var337 - 0L) == 0L ? 0 : (var391 < 0L ? -1 : 1);
                        if (var339 != 0) {
                            break label305;
                        }

                        if (var305) {
                            var54 |= -2097086142;
                            var54 ^= -1203566269;
                            Integer var306 = var54;
                            if (var306 == null) {
                                break label305;
                            }

                            byte var307 = 1;

                            var54 = switch (var54) {
                                case -467980603 -> var54 ^ 1470127151;
                                default -> var54 ^ 374467423;
                                case 1274869293 -> {
                                    var54 -= 1958224228;
                                    var54 -= 1845158044;
                                    var54 ^= -1531562523;
                                    yield var54 ^ -235418200;
                                }
                            };
                            var272 = var307;
                            switch (var54) {
                                case -1990469490:
                                default:
                                    var54 ^= -1316035129;
                                    break label304;
                                case -1011781285:
                                    var54 ^= 1706923752;
                                    break label304;
                                case 1007160416:
                                    var54 &= 2146630226;
                                    var54 ^= -463495014;
                            }
                        } else {
                            var54 >>= 17;
                            var54 *= -467542365;
                            var54 |= 552310232;
                            var54 ^= -546278851;
                            var272 = var7;
                            var54 |= -1503839092;
                            var54 ^= 796923158;
                        }
                        break;
                    case -493563858:
                        var54 = switch (var54) {
                            case -2008209483 -> var54 ^ 2107631455;
                            case -466817020 -> {
                                var54 |= 1315471113;
                                yield var54 ^ -1081831382;
                            }
                            default -> var54 ^ 1949315138;
                        };
                        int var289 = var54 + 1;
                        var289 = var54 * var289;
                        var289 &= 1;
                        if (var289 != 0) {
                            break label305;
                        }

                        int var292 = (var23.equals("playing")) ? 1 : 0;
                        var54 ^= 39951838;
                        var54 *= 1717149057;
                        var54 ^= 797920504;
                        long var333 = var54;
                        long var12 = var333 + 1L;
                        var12 = var333 * var12;
                        long var14 = var333 + 2L;
                        var12 *= var14;
                        var333 += 3L;
                        var12 *= var333;
                        var333 = var12 & 7L;
                        long var387;
                        int var336 = (var387 = var333 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                        if (var336 != 0) {
                            break label305;
                        }

                        if (var292 != 0) {
                            var54 = switch (var54) {
                                case -1482990184 -> var54 ^ -1310732125;
                                default -> var54 ^ 1686227186;
                                case 1318611073 -> {
                                    var54 ^= -1660298777;
                                    var54 &= 101068770;
                                    var54 &= 2008800620;
                                    yield var54 ^ 2125490924;
                                }
                            };
                            long var293 = var54;
                            long var353 = var293 + 1L;
                            var353 = var293 * var353;
                            long var294 = var353 & 1L;
                            long var388;
                            var292 = (var388 = var294 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                            if (var292 != 0) {
                                break label305;
                            }

                            byte var296 = 0;
                            var54 *= 5907305;
                            var54 += 927260454;
                            var54 ^= -2049788410;
                            var272 = var296;
                            var54 *= -667966635;
                            var54 += 1730149464;
                            var54 ^= -162058586;
                        } else {
                            var54 *= -217299905;
                            var54 |= -532133511;
                            var54 *= -1814927693;
                            var54 += -1821695578;
                            var54 ^= -1463178621;
                            long var297 = var54;
                            long var355 = var297 + 1L;
                            var355 = var297 * var355;
                            long var378 = var297 + 2L;
                            var355 *= var378;
                            long var298 = var297 + 3L;
                            var355 *= var298;
                            long var299 = var355 & 7L;
                            long var389;
                            var292 = (var389 = var299 - 0L) == 0L ? 0 : (var389 < 0L ? -1 : 1);
                            if (var292 != 0) {
                                break label305;
                            }

                            var272 = var7;
                            var54 += -1322399985;
                            var54 += -1060600317;
                            var54 ^= -774866728;
                            var54 ^= -1594004672;
                            var54 ^= 1114122944;
                        }
                        break;
                    case 1069449574:
                        var54 ^= 457933192;
                        var54 += -523550440;
                        var54 ^= -159317853;
                        Integer var273 = var54;
                        if (var273 == null) {
                            break label305;
                        }

                        boolean var274 = var23.equals("missing");
                        var54 -= -242273971;
                        var54 ^= 1153220946;
                        long var9 = var54;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var386;
                        int var287 = (var386 = var9 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                        if (var287 != 0) {
                            break label305;
                        }

                        if (var274) {
                            var54 <<= 25;
                            var54 ^= 223385761;
                            var54 -= -441620965;
                            var54 *= 179784673;
                            var54 ^= 71624856;
                            byte var275 = 4;

                            var54 = switch (var54) {
                                case -733855394 -> {
                                    var54 |= 1822607901;
                                    yield var54 ^ 1477355474;
                                }
                                case -200623196 -> var54 ^ -295012676;
                                default -> var54 ^ 1168203392;
                            };
                            var272 = var275;
                            var54 |= 1150181212;
                            var54 >>= 3;
                            var54 -= -612654627;
                            var54 ^= -109214012;
                        } else {
                            var54 |= -165475128;
                            var54 += 277743569;
                            var54 ^= 1288192260;
                            Integer var288 = var54;
                            if (var288 == null) {
                                break label305;
                            }

                            var272 = var7;
                            var54 ^= -1346752449;
                            var54 ^= -1694382496;
                            var54 >>= 13;
                            var54 ^= -665048819;
                        }
                        break;
                    default:
                        var54 ^= -1218701289;
                        var54 ^= -1062515766;
                        var272 = var7;
                        var54 ^= -426804689;
                        var54 <<= 13;
                        var54 ^= 2043317597;
                        var54 ^= 984343943;
                }

                label421: {
                    switch (var272) {
                        case 0:
                            var54 &= 1278050872;
                            var54 ^= -1185662405;
                            break;
                        case 1:
                            var54 ^= 910283277;
                            var54 |= 386063557;
                            var54 >>>= 28;
                            var54 ^= -245777876;
                            break;
                        case 2:
                            var54 &= 1919175928;
                            var54 ^= -1418381738;
                            break label421;
                        case 3:
                            var54 &= -627224104;
                            var54 &= -1311509077;
                            var54 ^= 1797275142;
                            break label421;
                        case 4:
                            var54 += -385527109;
                            var54 *= 242411659;
                            var54 ^= 1327275881;
                            break label421;
                        case 5:
                            var54 &= 690913919;
                            var54 ^= -1976829093;
                            long var251 = var54;
                            long var277 = var251 + 1L;
                            long var278 = var251 * var277;
                            long var252 = var278 & 1L;
                            long var395;
                            var241 = (var395 = var252 - 0L) == 0L ? 0 : (var395 < 0L ? -1 : 1);
                            if (var241 != 0) {
                                break label305;
                            }

                            yq var259 = Q();
                            HJ var254 = new HJ(null, var259);

                            var54 = switch (var54) {
                                case -2111472895 -> {
                                    var54 -= 294921047;
                                    yield var54 ^ -924367968;
                                }
                                case -2049097965 -> var54 ^ 1089571810;
                                default -> var54 ^ -5887104;
                            } & 1968667915;
                            var54 ^= 545136310;
                            var54 ^= -1143504219;
                            return var254;
                        default:
                            var54 = switch (var54) {
                                case -1898126180 -> var54 ^ -1102874087;
                                default -> var54 ^ -468318436;
                                case -664819494 -> {
                                    var54 += -745564417;
                                    yield var54 ^ 132024334;
                                }
                            };
                            var7 = var54 + 1;
                            var7 = var54 * var7;
                            var7 &= 1;
                            if (var7 != 0) {
                                break label305;
                            }

                            var23 = dT.N(var233, "msg", var23);
                            var23 = "Spotify: " + var23;
                            IOException var276 = new IOException(var23);
                            HJ var258 = new HJ(null, var276);

                            var54 = switch (var54) {
                                case -1406027817 -> {
                                    var54 -= -2070511590;
                                    yield var54 ^ -29399006;
                                }
                                default -> var54 ^ 1526512394;
                                case 1459282420 -> var54 ^ -316926943;
                            } + 42793293;
                            var54 ^= -2109221572;
                            var54 ^= -175569463;
                            return var258;
                    }

                    var7 = var54 + 1;
                    var7 = var54 * var7;
                    var7 &= 1;
                    if (var7 != 0) {
                        break label305;
                    }

                    String var330 = dT.N(var233, "id", "");
                    String var349 = dT.N(var233, "name", "");
                    String var367 = dT.N(var233, "artist", "");
                    String var377 = dT.N(var233, "album", "");
                    long var380 = dT.M(var233, "duration");
                    double var15 = dT.Ka(var233, "position");
                    var15 *= 1000.0;
                    long var383 = Math.round(var15);
                    boolean var17 = var23.equals("playing");
                    String var18 = dT.N(var233, "art", "");
                    var18 = e(var18);
                    FX var279 = new FX("Spotify", var330, var349, var367, var377, var380, var383, var1, var17, var18, true);
                    HJ var267 = new HJ(var279, null);
                    var54 -= 700954889;
                    var54 |= 84664499;
                    var54 ^= -854149354;
                    var272 = var54 + 1;
                    var272 = var54 * var272;
                    int var331 = var54 + 2;
                    var272 *= var331;
                    int var332 = var54 + 3;
                    var272 *= var332;
                    var272 &= 7;
                    if (var272 != 0) {
                        break label305;
                    }

                    var54 *= 1844409881;
                    var54 ^= 1773911292;
                    return var267;
                }

                var7 = var54 + 1;
                var7 = var54 * var7;
                var7 &= 1;
                if (var7 == 0) {
                    HJ var263 = new HJ(null, null);
                    var54 += 695717829;
                    var54 ^= -1170427073;
                    var54 += 1822813543;
                    var54 += -474173698;
                    var54 ^= 1190620665;
                    var54 ^= 2085911392;
                    var54 -= -253865195;
                    var54 += 658381040;
                    var54 ^= -1589338822;
                    return var263;
                }
            }
        }

        AssertionError var26 = new AssertionError();
        throw var26;
    }

    public static String e(String var0) {
        label56: {
            int var25;
            String var36;
            label55: {
                var25 = Wg;
                var25 ^= 210771887;
                int var2 = System.identityHashCode(var0);
                int var3 = (var0.contains("/ab67616d0000b273")) ? 1 : 0;
                int var4 = var2 + 1;
                var4 = var2 * var4;
                int var5 = var2 + 2;
                var4 *= var5;
                var5 = var2 + 3;
                var4 *= var5;
                var4 &= 7;
                var5 = of_2.Kx;
                var25 ^= var5;
                var25 ^= -194859278;
                of_2.Kx = -194859278;
                var5 = of_2.pM;
                var25 ^= var5;
                var25 ^= -1511944105;
                of_2.pM = -1511944105;
                if (var4 == 0) {
                    var25 = switch (var25) {
                        default -> var25 ^ -1158289036;
                        case 351979010 -> var25 ^ 1733283024;
                        case 1528310475 -> {
                            var25 <<= 20;
                            yield var25 ^ -530197953;
                        }
                    };
                    long var54 = var25;
                    long var6 = var54 + 1L;
                    var6 = var54 * var6;
                    long var55 = var6 & 1L;
                    long var75;
                    var4 = (var75 = var55 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label56;
                    }

                    if (var3 == 0) {
                        var25 ^= -288429304;
                        var25 ^= -411824948;
                        var3 = var25 + 1;
                        var3 = var25 * var3;
                        var4 = var25 + 2;
                        var3 *= var4;
                        var4 = var25 + 3;
                        var3 *= var4;
                        var3 &= 7;
                        if (var3 != 0) {
                            break label56;
                        }

                        var36 = var0;
                        var25 <<= 11;
                        var25 &= 365017970;
                        var25 ^= 1777165585;
                        break label55;
                    }

                    var25 -= -988351038;
                    var25 ^= 1227309677;
                    long var37 = var25;
                    long var66 = var37 + 1L;
                    long var67 = var37 * var66;
                    long var38 = var67 & 1L;
                    long var76;
                    var3 = (var76 = var38 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label56;
                    }

                    String var40 = var0.replace("/ab67616d0000b273", "/ab67616d00001e02");
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    int var34 = var4 & 1;
                    if (var34 == 0) {
                        var25 >>= 16;
                        var25 ^= -1880014439;
                        var25 ^= -536988690;
                        long var59 = var25;
                        var6 = var59 + 1L;
                        var6 = var59 * var6;
                        long var60 = var6 & 1L;
                        long var77;
                        int var35 = (var77 = var60 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                        if (var35 != 0) {
                            break label56;
                        }

                        var36 = var40;
                        var25 |= 912203168;
                        var25 *= -184873825;
                        var25 ^= 896852931;
                        break label55;
                    }

                    var25 &= -1798844982;
                    var25 ^= 683540443;
                } else {
                    var25 *= -1909967057;
                    var25 ^= -1738208354;
                }

                Integer var31 = var25;
                if (var31 != null) {
                    RuntimeException var33 = new RuntimeException();
                    throw var33;
                }
                break label56;
            }

            long var46 = var25;
            long var68 = var46 + 1L;
            var68 = var46 * var68;
            long var7 = var46 + 2L;
            var68 *= var7;
            var46 += 3L;
            var68 *= var46;
            var46 = var68 & 7L;
            long var78;
            int var49 = (var78 = var46 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
            if (var49 == 0) {
                return var36;
            }
        }

        UnsupportedOperationException var32 = new UnsupportedOperationException();
        throw var32;
    }

    private static yq Q() {
        H var1 = H.DENIED;
        return new yq(var1, "Allow Minecraft to control Spotify: System Settings → Privacy & Security → Automation");
    }

    private static String v(String var0, int var1) {
        int var3 = System.identityHashCode(var0);
        boolean var4 = var0.isEmpty();
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        long var9 = var5 + 2L;
        var7 *= var9;
        var5 += 3L;
        var7 *= var5;
        var5 = var7 & 7L;
        long var50;
        int var43 = (var50 = var5 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
        if (var43 != 0) {
            int var36 = var1 >>> 1;
            var36 ^= -326366166;
        } else {
            label49: {
                int var2 = switch (var1) {
                    default -> var1 ^ -1121001175;
                    case -252746706 -> {
                        int var11 = var1 & 473045570;
                        var11 -= -1755913714;
                        yield var11 ^ 449019161;
                    }
                    case 1042243077 -> var1 ^ 2104945825;
                };
                Integer var44 = var2;
                if (var44 == null) {
                    AssertionError var46 = new AssertionError();
                    throw var46;
                }

                String var40;
                if (var4) {
                    var2 += -2085443605;
                    var2 ^= 1326302321;
                    var40 = "";
                    var2 -= -1728613901;
                    var2 *= -1248529001;
                    var2 <<= 22;
                    var2 += -216850894;
                    var2 ^= -1476872358;
                } else {
                    var2 ^= -959467621;
                    var2 |= 659333327;
                    var2 ^= 95265442;
                    String var45 = ": " + var0;
                    Integer var39 = var3;
                    if (var39 == null) {
                        var2 ^= -2135277098;
                        var2 -= 421226881;
                        var2 ^= 1708000833;
                        var2 ^= -125232266;
                        break label49;
                    }
                    var2 = switch (var2) {
                        case -1618801169 -> var2 ^ -430578830;
                        case -1570615971 -> {
                            var2 |= -383909641;
                            var2 &= -1396578933;
                            var2 *= -1947310973;
                            yield var2 ^ -227714208;
                        }
                        default -> var2 ^ 1496122906;
                    };
                    var40 = var45;
                    var2 |= 1506176034;
                    var2 -= -781576576;
                    var2 >>>= 31;
                    var2 &= -467286820;
                    var2 ^= 1852549480;
                }

                return var40;
            }
        }

        IllegalArgumentException var38 = new IllegalArgumentException();
        throw var38;
    }

    private static Throwable a(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1670757543;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Wg = var4;
    }
}
