package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.LongSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class If {
    private static final Logger xB;
    public static final long Fd = 1500L;
    private final Co tl;
    private final gM_2 C;
    private final LongSupplier w;
    private final Object dT;
    private final Deque wh;
    private boolean J;
    private Thread z;
    private volatile FX VD;
    private volatile YG g;
    private volatile Cj v;
    private volatile String d;
    private volatile long F;
    public static final int V;

    public If(Co var1, LongSupplier var2) {
        this(var1, var1.timing(), var2);
    }

    public If(Co var1, gM_2 var2, LongSupplier var3) {
        Object var4 = new Object();
        this.dT = var4;
        var4 = new ArrayDeque();
        this.wh = (Deque)var4;
        var4 = Cj.OFF;
        this.v = (Cj)var4;
        this.d = "";
        this.tl = var1;
        this.C = var2;
        this.w = var3;
    }

    public String y() {
        int var1 = V;
        var1 ^= 637110638;
        int var2 = System.identityHashCode(this);
        Co var3 = this.tl;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var27;
        var2 = (var27 = var4 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 >>= 29;
            var1 |= -1733920629;
            var1 |= 2096524539;
            var1 *= -1442847425;
            var1 ^= -133048718;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return var3.name();
            } else {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1868460322:
                    var1 ^= 428911677;
                    var1 *= 1730897963;
                    var1 ^= 1562712206;
                    break;
                case -1733014158:
                    var1 ^= 1756140308;
                    break;
                case 1889528375:
                default:
                    var1 ^= 1203517002;
            }

            IllegalArgumentException var14 = new IllegalArgumentException();
            throw var14;
        }
    }

    public FX c() {
        int var1 = V;
        var1 ^= -1064466890;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 *= 488251377;
            var1 *= -954537503;
            var1 ^= -383012738;
            var1 ^= 1316475302;
            return this.VD;
        } else {
            var1 |= 72381767;
            var1 ^= -1410874664;
            UnsupportedOperationException var7 = new UnsupportedOperationException();
            throw var7;
        }
    }

    public YG ZQ() {
        int var1 = V;
        var1 ^= -1600523640;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var14 = switch (var1) {
                case -1969884685 -> var1 ^ 277194219;
                default -> var1 ^ -1290942257;
                case 365032760 -> {
                    var1 |= 1170738007;
                    var1 += 1350107605;
                    var1 |= 1016106040;
                    yield var1 ^ 1136868680;
                }
            };
            if (var14 != null) {
                return this.g;
            }
        } else {
            var1 += -1035282135;
            var1 += -1584037316;
            var1 ^= 872755497;
            int var16 = var1 + 1;
            var16 = var1 * var16;
            var1 = var16 & 1;
            if (var1 == 0) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            }
        }

        IllegalArgumentException var12 = new IllegalArgumentException();
        throw var12;
    }

    public Cj L() {
        int var1 = V;
        var1 ^= -2078927141;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            long var18 = switch (var1) {
                case 785862309 -> var1 ^ 632604439;
                case 827199851 -> {
                    var1 -= -1441120575;
                    yield var1 ^ 1286760844;
                }
                default -> var1 ^ 1580319665;
            };
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var22;
            int var20 = (var22 = var19 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var20 == 0) {
                return this.v;
            }
        } else {
            var1 ^= 361291944;
            var1 &= 860970314;
            var1 -= -208910521;
            var1 >>= 5;
            var1 ^= 1011577694;
            Integer var14 = var1;
            if (var14 != null) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    public String v() {
        int var1 = V;
        var1 ^= 1200128395;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var26;
        var2 = (var26 = var19 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -433498599;
            var1 -= 1496285178;
            var1 ^= 1042252760;
            return this.d;
        } else {
            var1 += 289485319;
            var1 -= -736477779;
            var1 -= 1658116647;
            var1 ^= 23379365;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            }
        }
    }

    public synchronized void E() {
    if (this.z == null || !this.z.isAlive()) {
        this.J = true;
        this.z = new Thread(this::I, "Aura Media");
        this.z.setDaemon(true);
        this.z.start();
    }
}


    public synchronized void Em() {
    this.J = false;
    if (this.z != null) {
        this.z.interrupt();
        this.z = null;
    }
    try {
        this.tl.close();
    } catch (Exception ignored) {}
}


    public void Wf(Ar var1) {
        boolean var214 = false;
        FX var266 = null;
        int var2 = V;
        var2 ^= 1253352011;
        Object var3 = null;
        FX var4 = this.VD;
        int var5 = of_2.Kx;
        var2 ^= var5;
        var2 ^= -194859278;
        var5 = of_2.qa;
        var2 ^= var5;
        var2 ^= -1022963785;

        var2 = switch (var2) {
            default -> var2 ^ -701368361;
            case -1268229 -> {
                var2 += -1780353800;
                var2 ^= 421520561;
                var2 &= -1116652278;
                var2 -= 450663295;
                yield var2 ^ 1319127465;
            }
            case 540174595 -> var2 ^ -359647384;
        };
        var5 = var2 + 1;
        var5 = var2 * var5;
        int var6 = var2 + 2;
        var5 *= var6;
        var6 = var2 + 3;
        var5 *= var6;
        var5 &= 7;
        label226:
        if (var5 == 0) {
            if (var4 != null) {
                var2 ^= 1146211472;
                var2 ^= -858132546;
                Integer var231 = var2;
                if (var231 == null) {
                    break label226;
                }

                LongSupplier var232 = this.w;
                long var233 = var232.getAsLong();
                var2 >>= 9;
                var2 <<= 18;
                var2 *= 2032747401;
                var2 <<= 18;
                var2 ^= -1061640124;
                int var7 = var2 + 1;
                var7 = var2 * var7;
                int var8 = var2 + 2;
                var7 *= var8;
                var8 = var2 + 3;
                var7 *= var8;
                var7 &= 7;
                if (var7 != 0) {
                    break label226;
                }

                int[] var264 = cQ.Z;
                Gu var278 = var1.kind();
                var8 = var278.ordinal();
                var7 = var264[var8];
                label218:
                switch (var7) {
                    case 1:
                        var2 -= 339915590;
                        var2 ^= -1822728228;
                        boolean var287 = var4.playing();

                        var2 = switch (var2) {
                            default -> var2 ^ -1998202714;
                            case 940567246 -> var2 ^ -1656969085;
                            case 1060023074 -> {
                                var2 |= 100435268;
                                var2 += 1980756157;
                                var2 *= 1277231863;
                                var2 |= 1402323705;
                                yield var2 ^ 374535183;
                            }
                        };
                        Integer var302 = var2;
                        if (var302 == null) {
                            break label226;
                        }

                        if (!var287) {
                            var2 ^= -1887281978;
                            var2 += 2095900402;
                            var2 += 1420700068;
                            var2 >>>= 27;
                            var2 ^= 1708688282;
                            Integer var288 = var2;
                            if (var288 == null) {
                                break label226;
                            }

                            var287 = true;
                            var2 >>>= 30;
                            var2 -= -722718872;
                            var2 += -94534721;
                            var2 ^= -1332495006;
                        } else {
                            var2 += -85649711;
                            var2 &= -468053156;
                            var2 ^= -412536264;
                            int var303 = var2 + 1;
                            var303 = var2 * var303;
                            int var311 = var2 + 2;
                            var303 *= var311;
                            var311 = var2 + 3;
                            var303 *= var311;
                            var303 &= 7;
                            if (var303 != 0) {
                                break label226;
                            }

                            var287 = false;
                            var2 <<= 29;
                            var2 ^= -2121054650;
                            var2 -= 263102844;
                            var2 >>>= 8;
                            var2 ^= -1785524834;
                        }

                        var302 = var2;
                        if (var302 == null) {
                            break label226;
                        }

                        long var309 = var4.positionAt(var233);
                        var2 |= 674325714;
                        var2 &= -1116940143;
                        var2 ^= -545052843;
                        var4 = var4.withPlayback(var287, var309, var233);
                        var266 = var4;
                        var2 *= 1895188417;
                        var2 ^= 1046130196;
                        break;
                    case 2:
                        var2 = switch (var2) {
                            case -1467719504 -> var2 ^ 428104843;
                            case -1061640124 -> {
                                var2 -= -1967562195;
                                var2 -= 1380727638;
                                var2 |= -492730343;
                                var2 -= 406288401;
                                yield var2 ^ 1910101280;
                            }
                            default -> var2 ^ 1363615610;
                        };
                        Integer var284 = var2;
                        if (var284 == null) {
                            break label226;
                        }

                        boolean var285 = var4.playing();
                        FX var286 = var4.withPlayback(var285, 0L, var233);

                        var2 = switch (var2) {
                            case -1163540504 -> {
                                var2 -= -1868417739;
                                var2 -= -1204336070;
                                yield var2 ^ 119210824;
                            }
                            default -> var2 ^ -388507941;
                            case 2096747376 -> var2 ^ -328573445;
                        };
                        long var9 = var2;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var316;
                        int var301 = (var316 = var9 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                        if (var301 != 0) {
                            break label226;
                        }

                        var266 = var286;
                        switch (var2) {
                            case 96306309:
                            default:
                                var2 ^= -1309230952;
                                break label218;
                            case 1018092450:
                                var2 ^= -1296422622;
                                break label218;
                            case 1993820977:
                                var2 ^= 2132858078;
                                var2 ^= 1801193890;
                                var2 ^= 5529308;
                                break label218;
                        }
                    case 3:
                        var2 -= -159784787;
                        var2 ^= -1029510954;
                        var2 -= 399855021;
                        var2 ^= -1385607555;
                        boolean var267 = var4.playing();
                        long var282 = var1.argument();
                        FX var268 = var4.withPlayback(var267, var282, var233);
                        var2 &= 717566376;
                        var2 += -1029457423;
                        var2 *= 1327584451;
                        var2 &= -1964202746;
                        var2 ^= -329725615;
                        Integer var283 = var2;
                        if (var283 == null) {
                            break label226;
                        }

                        var266 = var268;
                        var2 -= 2066378594;
                        var2 += 1358096250;
                        var2 <<= 1;
                        var2 += -1459530060;
                        var2 ^= 2096357147;
                        break;
                    default:
                        var2 *= -496379167;
                        var2 ^= 854208469;
                        long var280 = var2;
                        long var10 = var280 + 1L;
                        var10 = var280 * var10;
                        long var281 = var10 & 1L;
                        long var317;
                        int var203 = (var317 = var281 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                        if (var203 != 0) {
                            break label226;
                        }

                        var266 = null;
                        var2 |= -847879306;
                        var2 ^= -50392653;
                        var2 += -727598768;
                        var2 ^= -1789560699;
                }
                var2 = switch (var2) {
                    default -> var2 ^ 1974464375;
                    case 1261817399 -> var2 ^ 1579916156;
                    case 1660930193 -> {
                        var2 ^= 1023821741;
                        var2 |= -58332402;
                        yield var2 ^ -771445766;
                    }
                };
                var7 = var2 + 1;
                var7 = var2 * var7;
                var8 = var2 + 2;
                var7 *= var8;
                var8 = var2 + 3;
                var7 *= var8;
                var7 &= 7;
                if (var7 != 0) {
                    break label226;
                }

                if (var266 != null) {
                    var2 -= -948081613;
                    var2 += -1931201650;
                    var2 &= 1854561203;
                    var2 ^= -804313774;
                    Integer var274 = var2;
                    if (var274 == null) {
                        break label226;
                    }

                    this.VD = var266;
                    var2 |= -338565915;
                    var2 -= -1703868054;
                    var2 *= 26854605;
                    var2 -= -103265865;
                    var2 ^= -1719772086;
                    Integer var206 = var2;
                    if (var206 == null) {
                        break label226;
                    }

                    long var207 = var233 + 1500L;
                    this.F = var207;
                    var2 |= 708160905;
                    var2 ^= -1844721404;
                } else {
                    var2 *= 1008192403;
                    var2 -= -1527556630;
                    var2 ^= 1885795885;
                }
            } else {
                var2 ^= -367502917;
                var2 ^= 771283998;
            }

            long var208 = var2;
            long var238 = var208 + 1L;
            long var239 = var208 * var238;
            long var209 = var239 & 1L;
            long var318;
            int var210 = (var318 = var209 - 0L) == 0L ? 0 : (var318 < 0L ? -1 : 1);
            if (var210 == 0) {
                Object var211 = this.dT;
                var2 |= -165200772;
                var2 += -1847075932;
                var2 ^= 1775918605;
                Object var234 = var211;
                synchronized (var211){}
                var2 -= -1646421871;
                var2 &= 938639702;
                var2 &= -900469272;
                var2 ^= -1854438842;
                var211 = var2;
                label186:
                if (var211 != null) {
                    label272: {
                        try {
                            var2 += 122775947;
                            var2 ^= -1798051793;
                            var214 = this.J;
                            var2 -= 508656833;
                            var2 *= -2114986071;
                            var2 += 1744855870;
                            var2 ^= -465032169;
                        } catch (Throwable var21) {
                            int var119 = V;
                            int var120 = var119 ^ -1369587444;
                            var211 = var21;
                            int var121 = var120 * 490413999;
                            int var122 = var121 ^ -1560112581;
                            var2 = var122 ^ -444325714;
                            Integer var240 = var2;
                            if (var240 == null) {
                                break label186;
                            }
                            break label272;
                        }

                        var6 = var2 + 1;
                        var6 = var2 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            break label186;
                        }

                        label294: {
                            try {
                                if (!var214) {
                                    break label294;
                                }
                            } catch (Throwable var20) {
                                int var130 = V;
                                int var131 = var130 ^ -1369587444;
                                var211 = var20;
                                int var132 = var131 * 490413999;
                                int var133 = var132 ^ -1560112581;
                                var2 = var133 ^ -444325714;
                                Integer var244 = var2;
                                if (var244 == null) {
                                    break label186;
                                }
                                break label272;
                            }

                            var2 += -1205283706;
                            var2 += -437265716;
                            var2 &= 130193285;
                            var2 ^= -1168279741;
                            var211 = var2;
                            if (var211 == null) {
                                break label186;
                            }
                            var2 = switch (var2) {
                                case -2131834783 -> var2 ^ -65148755;
                                default -> var2 ^ 1289334480;
                                case -1138759737 -> {
                                    var2 -= -1741230211;
                                    yield var2 ^ 1661908024;
                                }
                            };
                            int var216 = var2 + 1;
                            int var217 = var2 * var216;
                            int var218 = var217 & 1;
                            if (var218 != 0) {
                                break label186;
                            }

                            try {
                                var211 = this.wh;
                                var2 += 850652087;
                                var2 *= -991071275;
                                var2 >>= 21;
                                var2 |= 2105332457;
                                var2 ^= 1073779632;
                            } catch (Throwable var19) {
                                int var140 = V;
                                int var141 = var140 ^ -1369587444;
                                var211 = var19;
                                int var142 = var141 * 490413999;
                                int var143 = var142 ^ -1560112581;
                                var2 = var143 ^ -444325714;
                                Integer var245 = var2;
                                if (var245 == null) {
                                    break label186;
                                }
                                break label272;
                            }

                            Integer var246 = var2;
                            if (var246 == null) {
                                break label186;
                            }

                            try {
                                ((Deque)var211).addLast(var1);
                                var2 <<= 16;
                                var2 &= -829887322;
                                var2 ^= -1136046913;
                                var211 = this.dT;
                                var2 <<= 15;
                                var2 &= -1758782210;
                                var2 ^= -160594011;
                            } catch (Throwable var18) {
                                int var149 = V;
                                int var150 = var149 ^ -1369587444;
                                var211 = var18;
                                int var151 = var150 * 490413999;
                                int var152 = var151 ^ -1560112581;
                                var2 = var152 ^ -444325714;
                                var246 = var2;
                                if (var246 == null) {
                                    break label186;
                                }
                                break label272;
                            }

                            long var248 = var2;
                            long var292 = var248 + 1L;
                            var292 = var248 * var292;
                            long var313 = var248 + 2L;
                            var292 *= var313;
                            long var249 = var248 + 3L;
                            var292 *= var249;
                            long var250 = var292 & 7L;
                            long var319;
                            int var251 = (var319 = var250 - 0L) == 0L ? 0 : (var319 < 0L ? -1 : 1);
                            if (var251 != 0) {
                                break label186;
                            }

                            try {
                                ((Deque)var211).notifyAll();
                                var2 *= 1993090375;
                                var2 ^= 1696606194;
                            } catch (Throwable var17) {
                                int var159 = V;
                                int var160 = var159 ^ -1369587444;
                                var211 = var17;
                                int var161 = var160 * 490413999;
                                int var162 = var161 ^ -1560112581;
                                var2 = var162 ^ -444325714;
                                Integer var252 = var2;
                                if (var252 == null) {
                                    break label186;
                                }
                                break label272;
                            }

                            long var253 = var2;
                            var292 = var253 + 1L;
                            var292 = var253 * var292;
                            var313 = var253 + 2L;
                            var292 *= var313;
                            long var254 = var253 + 3L;
                            var292 *= var254;
                            long var255 = var292 & 7L;
                            long var320;
                            int var221 = (var320 = var255 - 0L) == 0L ? 0 : (var320 < 0L ? -1 : 1);
                            if (var221 != 0) {
                                break label186;
                            }

                            try {
                                var2 <<= 15;
                                var2 >>>= 10;
                                var2 ^= -1282005391;
                            } catch (Throwable var16) {
                                int var165 = V;
                                int var166 = var165 ^ -1369587444;
                                var211 = var16;
                                int var167 = var166 * 490413999;
                                int var168 = var167 ^ -1560112581;
                                var2 = var168 ^ -444325714;
                                Integer var256 = var2;
                                if (var256 == null) {
                                    break label186;
                                }
                                break label272;
                            }

                            var2 >>= 12;
                            var2 >>>= 16;
                            var2 &= 1005567820;
                            var2 >>>= 2;
                            var2 ^= -1256663985;
                            return;
                        }

                        var2 ^= -580031436;
                        var2 ^= 1068420222;

                        try {
                            var2 ^= -753245572;
                            var2 ^= 1477736207;
                        } catch (Throwable var15) {
                            int var179 = V;
                            int var180 = var179 ^ -1369587444;
                            var211 = var15;
                            int var181 = var180 * 490413999;
                            int var182 = var181 ^ -1560112581;
                            var2 = var182 ^ -444325714;
                            Integer var257 = var2;
                            if (var257 == null) {
                                break label186;
                            }
                            break label272;
                        }

                        int var222 = var2 + 1;
                        int var223 = var2 * var222;
                        int var224 = var223 & 1;
                        if (var224 != 0) {
                            break label186;
                        }

                        try {
                            var2 >>>= 4;
                            var2 -= -938946171;
                            var2 *= 1611567039;
                            var2 ^= 442793908;
                            return;
                        } catch (Throwable var14) {
                            int var185 = V;
                            int var186 = var185 ^ -1369587444;
                            var211 = var14;
                            int var187 = var186 * 490413999;
                            int var188 = var187 ^ -1560112581;
                            var2 = var188 ^ -444325714;
                            Integer var258 = var2;
                            if (var258 == null) {
                                break label186;
                            }
                        }
                    }

                    while (true) {
                        try {
                            var2 -= -138984716;
                            var2 += -337843232;
                            var2 += 1089505972;
                            var2 ^= -1164527040;
                        } catch (Throwable var13) {
                            int var189 = V;
                            int var190 = var189 ^ -1369587444;
                            var211 = var13;
                            int var191 = var190 * 490413999;
                            int var192 = var191 ^ -1560112581;
                            var2 = var192 ^ -444325714;
                            Integer var259 = var2;
                            if (var259 == null) {
                                break;
                            }
                            continue;
                        }

                        long var235 = var2;
                        long var275 = var235 + 1L;
                        var275 = var235 * var275;
                        long var236 = var275 & 1L;
                        long var321;
                        int var202 = (var321 = var236 - 0L) == 0L ? 0 : (var321 < 0L ? -1 : 1);
                        if (var202 == 0) {
                            throw UncheckedExceptions.rethrow((Throwable)var211);
                        }
                        break;
                    }
                }
            }
        }

        UnsupportedOperationException var201 = new UnsupportedOperationException();
        throw var201;
    }

    private void I() {
    while (this.J) {
        try {
            FX track = this.tl.poll();
            this.VD = track;
            long sleepMs = (track != null && track.xo()) ? this.C.playingMs() : this.C.pausedMs();
            Thread.sleep(Math.max(50L, sleepMs));
        } catch (InterruptedException e) {
            break;
        } catch (Exception e) {
            try {
                Thread.sleep(this.C.errorMaxMs());
            } catch (InterruptedException ie) {
                break;
            }
        }
    }
}


    private static boolean dI(FX var0, FX var1, long var2, int var4) {
        boolean var53 = false;
        label69: {
            int var6 = System.identityHashCode(var0);
            int var7 = var6 + 1;
            var7 = var6 * var7;
            var7 &= 1;
            if (var7 != 0) {
                switch (var4) {
                    case -1315169643:
                        int var15 = var4 ^ -367858979;
                        break;
                    case -530856786:
                    default:
                        int var14 = var4 ^ 662345262;
                        break;
                    case 452160969:
                        int var5 = var4 & -1167782575;
                        var5 ^= -1490140644;
                }
            } else {
                label78: {
                    int var16 = var4 + 92818637;
                    var16 += 1571589760;
                    var16 += -1392605340;
                    var16 ^= 1975975519;
                    long var57 = var16;
                    long var9 = var57 + 1L;
                    var9 = var57 * var9;
                    long var11 = var57 + 2L;
                    var9 *= var11;
                    long var58 = var57 + 3L;
                    var9 *= var58;
                    long var59 = var9 & 7L;
                    long var73;
                    var7 = (var73 = var59 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label69;
                    }

                    label72: {
                        boolean var61 = var0.playing();
                        boolean var8 = var1.playing();
                        if (var61 == var8) {
                            var16 = switch (var16) {
                                case 785299610 -> var16 ^ 1938243180;
                                case 1591750181 -> {
                                    var16 ^= -1531825650;
                                    var16 += 40106045;
                                    yield var16 ^ 1687461620;
                                }
                                default -> var16 ^ 693946275;
                            };
                            Integer var62 = var16;
                            if (var62 == null) {
                                break label69;
                            }

                            long var63 = var0.positionAt(var2);
                            Integer var48 = var6;
                            if (var48 == null) {
                                var16 += -605043233;
                                var16 ^= -1736789407;
                                var16 ^= 1361554759;
                                break label78;
                            }

                            var16 *= -549398123;
                            var16 &= 1472396391;
                            var16 ^= 32543231;
                            var16 ^= -915712058;
                            var9 = var16;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            var9 = var11 & 1L;
                            long var74;
                            int var49 = (var74 = var9 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                            if (var49 != 0) {
                                break label69;
                            }

                            var9 = var1.positionAt(var2);
                            long var50 = var63 - var9;
                            long var51 = Math.abs(var50);
                            long var75;
                            var49 = (var75 = var51 - 1500L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                            if (var49 < 0) {
                                var16 ^= -2024025768;
                                var16 &= 149165593;
                                var16 &= -1639336602;
                                var16 |= -793806690;
                                var16 ^= 1484913030;
                                var53 = true;
                                var16 -= -874791386;
                                var16 ^= -15151235;
                                break label72;
                            }

                            switch (var16) {
                                case -1642385795:
                                    var16 >>= 13;
                                    var16 >>>= 19;
                                    var16 |= -586886337;
                                    var16 ^= 1513790979;
                                    break;
                                case 339620827:
                                default:
                                    var16 ^= -1160438815;
                                    break;
                                case 1074964785:
                                    var16 ^= 576666769;
                            }
                        } else {
                            var16 &= 796852909;
                            var16 ^= -1902338618;
                            var16 |= -485541943;
                            var16 *= -726031629;
                            var16 ^= 389456877;
                        }

                        Integer var64 = var16;
                        if (var64 == null) {
                            break label69;
                        }

                        var53 = false;
                        var16 &= 577445394;
                        var16 ^= 1235224991;
                    }

                    Integer var46 = var16;
                    if (var46 != null) {
                        return var53;
                    }
                    break label69;
                }
            }

            RuntimeException var54 = new RuntimeException();
            throw var54;
        }

        UnsupportedOperationException var47 = new UnsupportedOperationException();
        throw var47;
    }

    private void P(Ar var1, int var2) {
        Co var43 = null;
        label76: {
            int var37;
            label85: {
                label79: {
                    Object[] var6;
                    Exception var12;
                    Logger var42;
                    label73: {
                        label72: {
                            label71: {
                                label86: {
                                    try {
                                        Object var13 = null;
                                        var37 = var2 | 1824256553;
                                        var37 ^= -2138172435;
                                        var43 = this.tl;
                                    } catch (RuntimeException var11) {
                                        var37 = V;
                                        var37 ^= -464628882;
                                        Throwable var5 = VN(var11);
                                        var12 = (Exception)var5;
                                        var12 = var12;
                                        var42 = xB;
                                        var6 = new Object[3];
                                        Co var7 = this.tl;
                                        String var54 = var7.name();
                                        var6[0] = var54;
                                        Gu var55 = var1.kind();
                                        var6[1] = var55;
                                        String var56 = var12.toString();
                                        var6[2] = var56;
                                        switch (var37) {
                                            case 345036171:
                                            default:
                                                break label72;
                                            case 783155598:
                                                break label86;
                                            case 1360418014:
                                                break label71;
                                        }
                                    }
                                    var37 = switch (var37) {
                                        default -> var37 ^ 1774526150;
                                        case -556916417 -> var37 ^ -66433423;
                                        case -281680432 -> {
                                            var37 += -211148610;
                                            var37 >>= 16;
                                            var37 ^= -683109138;
                                            yield var37 ^ 2015565326;
                                        }
                                    };
                                    long var51 = var37;
                                    long var8 = var51 + 1L;
                                    var8 = var51 * var8;
                                    long var52 = var8 & 1L;
                                    long var68;
                                    int var53 = (var68 = var52 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                                    if (var53 != 0) {
                                        break label76;
                                    }

                                    try {
                                        var43.send(var1);
                                        break label79;
                                    } catch (RuntimeException | IOException var10) {
                                        var37 = V;
                                        var37 ^= -464628882;
                                        Throwable var44 = VN(var10);
                                        var12 = (Exception)var44;
                                        var12 = var12;
                                        var42 = xB;
                                        var6 = new Object[3];
                                        Co var57 = this.tl;
                                        String var58 = var57.name();
                                        var6[0] = var58;
                                        Gu var59 = var1.kind();
                                        var6[1] = var59;
                                        String var60 = var12.toString();
                                        var6[2] = var60;
                                        switch (var37) {
                                            case 345036171:
                                            default:
                                                break label72;
                                            case 783155598:
                                                break;
                                            case 1360418014:
                                                break label71;
                                        }
                                    }
                                }

                                var37 ^= -2115887681;
                                break label73;
                            }

                            var37 -= -435699776;
                            var37 ^= -1486558589;
                            break label73;
                        }

                        var37 ^= 1692738792;
                    }

                    int var61 = var37 + 1;
                    var61 = var37 * var61;
                    var61 &= 1;
                    if (var61 != 0) {
                        break label76;
                    }

                    var42.info("{} command {} failed ({})", var6);
                    String var15 = var12.getMessage();
                    String var16 = String.valueOf(var15);
                    this.d = var16;
                    var37 *= 1613628201;
                    var37 *= -1723834117;
                    var37 *= -458054705;
                    var37 &= 1567362400;
                    var37 ^= -1524399009;
                    break label85;
                }
                var37 = switch (var37) {
                    default -> var37 ^ 1903165715;
                    case 1273562764 -> var37 ^ -476908557;
                    case 1351901248 -> {
                        var37 |= 1053748466;
                        var37 -= -647845602;
                        yield var37 ^ 1502200186;
                    }
                };
                long var45 = var37;
                long var64 = var45 + 1L;
                var64 = var45 * var64;
                var45 = var64 & 1L;
                long var69;
                int var17 = (var69 = var45 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                if (var17 != 0) {
                    break label76;
                }

                switch (var37) {
                    case -1174401531:
                    default:
                        var37 ^= -1701374473;
                        break;
                    case -51019090:
                        var37 *= 185448809;
                        var37 ^= -122167711;
                        break;
                    case 1740060901:
                        var37 ^= 1835974700;
                }
            }

            long var18 = var37;
            long var47 = var18 + 1L;
            var47 = var18 * var47;
            long var66 = var18 + 2L;
            var47 *= var66;
            var18 += 3L;
            var47 *= var18;
            var18 = var47 & 7L;
            long var70;
            int var21 = (var70 = var18 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
            if (var21 == 0) {
                return;
            }
        }

        IllegalStateException var22 = new IllegalStateException();
        throw var22;
    }

    private void p(FX var1, int var2) {
        Object var240 = null;
        Co var241 = null;
        byte[] var242 = null;
        String var284 = null;
        label289: {
            Exception var4 = null;
            FX var5 = this.VD;
            LongSupplier var6 = this.w;
            long var209 = var6.getAsLong();
            int var3 = var2 + -437942420;
            var3 ^= -2111502041;
            var3 -= 1812749906;
            var3 ^= -805579200;
            var3 ^= 917782312;
            if (var1 != null) {
                var3 >>= 30;
                var3 ^= -876240313;
                if (var5 != null) {
                    var3 |= -1383469253;
                    var3 ^= 1090960083;
                    int var8 = var1.sameTrack(var5) ? 1 : 0;
                    var3 >>>= 17;
                    var3 ^= 1749163079;
                    var3 |= 1917449398;
                    var3 |= -1490725668;
                    var3 ^= -944964763;
                    long var9 = var3;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var328;
                    int var297 = (var328 = var9 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                    if (var297 != 0) {
                        break label289;
                    }

                    if (var8 != 0) {
                        var3 = switch (var3) {
                            default -> var3 ^ -355674696;
                            case -352026761 -> var3 ^ 1070266438;
                            case 952304795 -> {
                                var3 += 641619940;
                                var3 &= 1603118551;
                                yield var3 ^ -1297857526;
                            }
                        };
                        var8 = var3 + 1;
                        var8 = var3 * var8;
                        int var298 = var3 + 2;
                        var8 *= var298;
                        int var299 = var3 + 3;
                        var8 *= var299;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label289;
                        }

                        long var254 = this.F;
                        var3 *= -211171437;
                        var3 |= -2107627264;
                        var3 += -264253212;
                        var3 *= -1024549689;
                        var3 ^= 1818700021;
                        long var10 = var3;
                        long var12 = var10 + 1L;
                        var12 = var10 * var12;
                        long var14 = var10 + 2L;
                        var12 *= var14;
                        var10 += 3L;
                        var12 *= var10;
                        var10 = var12 & 7L;
                        long var329;
                        int var312 = (var329 = var10 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                        if (var312 != 0) {
                            break label289;
                        }

                        long var330;
                        var8 = (var330 = var209 - var254) == 0L ? 0 : (var330 < 0L ? -1 : 1);
                        if (var8 < 0) {
                            var3 = switch (var3) {
                                case -2023256081 -> var3 ^ -868348036;
                                case -1151128392 -> {
                                    var3 += 2109703278;
                                    yield var3 ^ 1099888434;
                                }
                                default -> var3 ^ 515900600;
                            };
                            long var256 = var3;
                            var10 = var256 + 1L;
                            var10 = var256 * var10;
                            long var257 = var10 & 1L;
                            long var331;
                            var8 = (var331 = var257 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                            if (var8 != 0) {
                                break label289;
                            }

                            var8 = var3 + -711859531;
                            var8 ^= 1422738688;
                            boolean var210 = dI(var1, var5, var209, var8);

                            var3 = switch (var3) {
                                default -> var3 ^ -1043926514;
                                case 1219257000 -> var3 ^ 1820083417;
                                case 2024556052 -> {
                                    var3 |= 369489930;
                                    var3 >>= 13;
                                    var3 |= 2090606200;
                                    var3 += -2038442654;
                                    yield var3 ^ 1956189397;
                                }
                            };
                            if (!var210) {
                                var3 ^= -764301327;
                                var3 *= 164235729;
                                var3 >>= 17;
                                var3 *= 1252656703;
                                var3 ^= 1984331211;
                                long var211 = var3;
                                long var261 = var211 + 1L;
                                long var262 = var211 * var261;
                                long var212 = var262 & 1L;
                                long var332;
                                int var213 = (var332 = var212 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                                if (var213 != 0) {
                                    break label289;
                                }

                                var1 = var5;
                                var3 ^= 504162120;
                                var3 *= 1127891349;
                                var3 ^= 635069567;
                                var3 &= 718518026;
                                var3 ^= 839018094;
                            } else {
                                var3 -= -1381709771;
                                var3 >>= 15;
                                var3 &= 1203222210;
                                var3 += -429741428;
                                var3 ^= 383310370;
                            }
                        } else {
                            switch (var3) {
                                case -1151128392:
                                    var3 -= 1488166018;
                                    var3 -= -387308866;
                                    var3 ^= 1091013140;
                                    break;
                                case -872944668:
                                default:
                                    var3 ^= -982409517;
                                    break;
                                case 880677770:
                                    var3 ^= 114356353;
                            }
                        }
                    } else {
                        switch (var3) {
                            case 952304795:
                                var3 |= -145556201;
                                var3 += -566168577;
                                var3 <<= 26;
                                var3 >>= 15;
                                var3 ^= 952244076;
                                break;
                            case 980661328:
                            default:
                                var3 ^= -646351674;
                                break;
                            case 1003928743:
                                var3 ^= 1035684448;
                        }
                    }
                } else {
                    var3 |= 1429139986;
                    var3 ^= -416475845;
                }
            } else {
                switch (var3) {
                    case -274034722:
                    default:
                        var3 ^= 2047375410;
                        break;
                    case 389230001:
                        var3 -= 1462286643;
                        var3 <<= 27;
                        var3 ^= 680055;
                        var3 *= -91827141;
                        var3 ^= -1504567295;
                        break;
                    case 1442834533:
                        var3 ^= -1054218152;
                }
            }

            this.VD = var1;

            var3 = switch (var3) {
                case -1644395559 -> var3 ^ -1548666745;
                default -> var3 ^ 1188761566;
                case 952297324 -> {
                    var3 *= -741844869;
                    yield var3 ^ -1551372746;
                }
            };
            long var214 = var3;
            long var263 = var214 + 1L;
            var263 = var214 * var263;
            long var215 = var263 & 1L;
            long var333;
            int var216 = (var333 = var215 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
            label220:
            if (var216 == 0) {
                if (var1 != null) {
                    var3 |= -1667805590;
                    var3 += 1037875398;
                    var3 -= -39547017;
                    var3 += 189575240;
                    var3 ^= -1046714236;
                    Integer var217 = var3;
                    if (var217 == null) {
                        break label220;
                    }

                    String var218 = var1.artKey();
                    boolean var219 = var218.isEmpty();
                    var3 -= 360046506;
                    var3 -= 355400124;
                    var3 ^= 980467039;
                    var3 ^= -1098160671;
                    Integer var7 = var3;
                    if (var7 == null) {
                        break label220;
                    }

                    if (!var219) {
                        var3 ^= -1928776032;
                        var3 ^= -1625654938;
                        long var220 = var3;
                        var263 = var220 + 1L;
                        var263 = var220 * var263;
                        long var315 = var220 + 2L;
                        var263 *= var315;
                        long var221 = var220 + 3L;
                        var263 *= var221;
                        long var222 = var263 & 7L;
                        long var334;
                        int var223 = (var334 = var222 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                        if (var223 != 0) {
                            break label220;
                        }

                        YG var224 = this.g;

                        var3 = switch (var3) {
                            default -> var3 ^ -427596019;
                            case 909328855 -> {
                                var3 >>>= 22;
                                yield var3 ^ -2052021108;
                            }
                            case 1218640959 -> var3 ^ 1804658422;
                        };
                        long var234 = var3;
                        long var300 = var234 + 1L;
                        var300 = var234 * var300;
                        long var235 = var300 & 1L;
                        long var335;
                        int var236 = (var335 = var235 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                        if (var236 != 0) {
                            break label220;
                        }

                        if (var224 != null) {
                            var3 *= 476698149;
                            var3 >>= 19;
                            var3 |= 347617526;
                            var3 ^= -1795866097;
                            String var225 = var224.key();
                            String var237 = var1.artKey();
                            boolean var226 = var225.equals(var237);
                            var3 += 625939517;
                            var3 ^= -1994255461;
                            Integer var238 = var3;
                            if (var238 == null) {
                                break label220;
                            }

                            if (var226) {
                                switch (var3) {
                                    case 427548342:
                                        var3 &= -249507131;
                                        var3 |= 955360568;
                                        var3 ^= 1692233627;
                                        break;
                                    case 1053431273:
                                        var3 ^= -1521747408;
                                        break;
                                    case 1330273629:
                                    default:
                                        var3 ^= 1359856134;
                                }

                                return;
                            }

                            var3 -= -25833316;
                            var3 -= -424093873;
                            var3 &= 1717938206;
                            var3 *= -1739241881;
                            var3 ^= 1493427886;
                        } else {
                            var3 *= -2110010305;
                            var3 -= -464547336;
                            var3 <<= 23;
                            var3 ^= 317146792;
                        }

                        long var227 = var3;
                        var263 = var227 + 1L;
                        var263 = var227 * var263;
                        var315 = var227 + 2L;
                        var263 *= var315;
                        long var228 = var227 + 3L;
                        var263 *= var228;
                        long var229 = var263 & 7L;
                        long var336;
                        int var230 = (var336 = var229 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                        if (var230 != 0) {
                            break label220;
                        }

                        byte[] var231 = null;
                        var3 |= 1589234235;
                        var3 *= -222039955;
                        var3 >>>= 18;
                        var3 ^= -1176222936;
                        Integer var239 = var3;
                        if (var239 == null) {
                            break label220;
                        }

                        label274: {
                            label257: {
                                label275: {
                                    try {
                                        var3 &= 287363114;
                                        var3 -= 1006991773;
                                        var3 &= 26274241;
                                        var3 ^= -664644062;
                                        var241 = this.tl;
                                        var3 |= -803929720;
                                        var3 &= -829236278;
                                        var3 ^= 145007896;
                                    } catch (RuntimeException var19) {
                                        int var116 = V;
                                        int var117 = var116 ^ 1560111601;
                                        var240 = VN(var19);
                                        int var118 = var117 & -1684401070;
                                        int var119 = var118 & 29978722;
                                        int var120 = var119 >> 5;
                                        var3 = var120 ^ -2133094937;
                                        int var273 = var3 + 1;
                                        int var274 = var3 * var273;
                                        int var275 = var274 & 1;
                                        if (var275 != 0) {
                                            break label220;
                                        }
                                        break label275;
                                    }

                                    int var276 = var3 + 1;
                                    int var277 = var3 * var276;
                                    int var302 = var3 + 2;
                                    int var278 = var277 * var302;
                                    int var303 = var3 + 3;
                                    int var279 = var278 * var303;
                                    int var280 = var279 & 7;
                                    if (var280 != 0) {
                                        break label220;
                                    }

                                    try {
                                        var284 = var1.artKey();
                                        var3 += -1185115002;
                                        var3 |= 1840094015;
                                        var3 ^= -1184310987;
                                    } catch (RuntimeException var18) {
                                        int var129 = V;
                                        int var130 = var129 ^ 1560111601;
                                        var240 = VN(var18);
                                        int var131 = var130 & -1684401070;
                                        int var132 = var131 & 29978722;
                                        int var133 = var132 >> 5;
                                        var3 = var133 ^ -2133094937;
                                        int var281 = var3 + 1;
                                        int var282 = var3 * var281;
                                        int var283 = var282 & 1;
                                        if (var283 != 0) {
                                            break label220;
                                        }
                                        break label275;
                                    }

                                    int var304 = var3 + 1;
                                    int var305 = var3 * var304;
                                    int var317 = var3 + 2;
                                    int var306 = var305 * var317;
                                    int var318 = var3 + 3;
                                    int var307 = var306 * var318;
                                    int var308 = var307 & 7;
                                    if (var308 != 0) {
                                        break label220;
                                    }

                                    try {
                                        var242 = var241.artwork(var284);
                                        var3 -= 2034131326;
                                        var3 ^= -1243542241;
                                    } catch (RuntimeException | IOException var17) {
                                        int var137 = V;
                                        int var138 = var137 ^ 1560111601;
                                        var240 = VN(var17);
                                        int var139 = var138 & -1684401070;
                                        int var140 = var139 & 29978722;
                                        int var141 = var140 >> 5;
                                        var3 = var141 ^ -2133094937;
                                        int var285 = var3 + 1;
                                        int var286 = var3 * var285;
                                        int var287 = var286 & 1;
                                        if (var287 != 0) {
                                            break label220;
                                        }
                                        break label275;
                                    }

                                    var263 = var3;
                                    var315 = var263 + 1L;
                                    var315 = var263 * var315;
                                    long var327 = var263 + 2L;
                                    var315 *= var327;
                                    var263 += 3L;
                                    var315 *= var263;
                                    var263 = var315 & 7L;
                                    long var337;
                                    int var291 = (var337 = var263 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                                    if (var291 != 0) {
                                        break label220;
                                    }

                                    try {
                                        var231 = var242;
                                        var3 >>>= 26;
                                        var3 ^= 916657134;
                                        var3 ^= 1599917660;
                                        break label257;
                                    } catch (RuntimeException var16) {
                                        int var144 = V;
                                        int var145 = var144 ^ 1560111601;
                                        var240 = VN(var16);
                                        int var146 = var145 & -1684401070;
                                        int var147 = var146 & 29978722;
                                        int var148 = var147 >> 5;
                                        var3 = var148 ^ -2133094937;
                                        int var292 = var3 + 1;
                                        int var293 = var3 * var292;
                                        int var294 = var293 & 1;
                                        if (var294 != 0) {
                                            break label220;
                                        }
                                    }
                                }

                                var4 = (Exception)var240;
                                Logger var243 = xB;
                                String var295 = var1.title();
                                String var192 = var4.toString();
                                var243.debug("Artwork of {} not loaded ({})", var295, var192);
                                var3 <<= 23;
                                var3 |= -1576252981;
                                var3 ^= -1121076775;
                                break label274;
                            }

                            int var193 = var3 + 1;
                            int var194 = var3 * var193;
                            int var195 = var194 & 1;
                            if (var195 != 0) {
                                break label220;
                            }

                            var3 *= -1446497803;
                            var3 &= -740973819;
                            var3 ^= -1893371370;
                        }

                        String var244 = var1.artKey();
                        YG var196 = new YG(var244, var231);
                        switch (var3) {
                            case -1988062345:
                            default:
                                var3 ^= -600743379;
                                break;
                            case 758363279:
                                var3 ^= -546871836;
                                break;
                            case 1336012818:
                                var3 += 1624164467;
                                var3 <<= 4;
                                var3 >>>= 24;
                                var3 ^= 2029756367;
                        }

                        this.g = var196;
                        return;
                    }

                    var3 &= 92318958;
                    var3 += -972264654;
                    var3 ^= 1473309015;
                    var3 += -654793599;
                    var3 ^= -513235223;
                } else {
                    var3 += 129009384;
                    var3 >>>= 23;
                    var3 >>= 14;
                    var3 &= -291770132;
                    var3 ^= -1749162993;
                }

                int var197 = var3 + 1;
                int var198 = var3 * var197;
                int var232 = var3 + 2;
                int var199 = var198 * var232;
                int var233 = var3 + 3;
                int var200 = var199 * var233;
                int var201 = var200 & 7;
                label194:
                if (var201 == 0) {
                    label276: {
                        if (var1 != null) {
                            var3 -= -1234202112;
                            var3 |= -1927856851;
                            var3 ^= -1701212605;
                            if (var5 != null) {
                                var3 += 431317810;
                                var3 ^= -247557767;
                                Integer var202 = var3;
                                if (var202 == null) {
                                    break label194;
                                }

                                boolean var203 = var1.sameTrack(var5);
                                var3 += -1247292490;
                                var3 ^= -1477061665;
                                long var205 = var3;
                                long var245 = var205 + 1L;
                                var245 = var205 * var245;
                                long var309 = var205 + 2L;
                                var245 *= var309;
                                long var206 = var205 + 3L;
                                var245 *= var206;
                                long var207 = var245 & 7L;
                                long var338;
                                int var208 = (var338 = var207 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                                if (var208 != 0) {
                                    break label194;
                                }

                                if (var203) {
                                    var3 |= 2087847891;
                                    var3 ^= 826383967;
                                    break label276;
                                }

                                var3 ^= -1302570138;
                                var3 *= 1793533777;
                                var3 ^= -1731909432;
                            } else {
                                var3 <<= 4;
                                var3 -= -382959116;
                                var3 += 919326035;
                                var3 *= 1405215633;
                                var3 ^= 219402275;
                            }
                        } else {
                            var3 |= -585160980;
                            var3 += 1781698112;
                            var3 -= 38197550;
                            var3 ^= 1933466797;
                        }

                        Integer var204 = var3;
                        if (var204 == null) {
                            break label194;
                        }

                        this.g = null;
                        var3 ^= -25373678;
                        var3 += 287387911;
                        var3 >>>= 18;
                        var3 ^= -817961330;
                    }

                    Integer var189 = var3;
                    if (var189 != null) {
                        return;
                    }
                }
            }
        }

        RuntimeException var190 = new RuntimeException();
        throw var190;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -236143187;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        V = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/media");
        xB = var5;
    }

    private static Throwable VN(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
