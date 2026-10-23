package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Ml extends XR {
    private static final float f = 15.0F;
    private static final float W = 46.0F;
    private static final float q = 6.0F;
    private static final int[] OP;
    private final ColorSetting Tl;
    private final XF y;
    private final float[] UL;
    private boolean H;
    private Vs mO;
    public static final int Y;

    public Ml(ColorSetting var1) {
        kE_2 var3 = kE_2.uY(0.32F, 0.95F);
        XF var2 = new XF(0.0F, var3);
        this.y = var2;
        float[] var4 = new float[3];
        this.UL = var4;
        Vs var5 = Vs.NONE;
        this.mO = var5;
        this.Tl = var1;
        int var6 = var1.zz();
        float[] var8 = this.UL;
        float[] var7 = DP.l(var6, var8);
    }

    @Override
    public Setting W() {
        int var1 = Y;
        var1 ^= -298843836;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += 436582665;
            var1 += -272921818;
            var1 ^= 1474487753;
            long var20 = var1;
            long var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var28;
            var2 = (var28 = var22 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.Tl;
            }
        } else {
            Integer var16 = switch (var1) {
                default -> var1 ^ -1390716293;
                case 840481460 -> var1 ^ -684765175;
                case 1562673721 -> {
                    var1 ^= 1952051868;
                    var1 *= 1389010689;
                    var1 ^= -63544855;
                    yield var1 ^ -506741138;
                }
            };
            if (var16 != null) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        }

        AssertionError var17 = new AssertionError();
        throw var17;
    }

    private float wB(int var1) {
        label69: {
            int var3 = System.identityHashCode(this);
            ColorSetting var4 = this.Tl;
            boolean var43 = var4.hO();
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            int var2;
            if (var5 != 0) {
                switch (var1) {
                    case -1938114653:
                        var2 = var1 - 1315591403;
                        var2 ^= 61928812;
                        break;
                    case -168537348:
                        var2 = var1 ^ 1973924082;
                        break;
                    case 853393337:
                    default:
                        var2 = var1 ^ 1466396615;
                }
            } else {
                var2 = switch (var1) {
                    case -1938114653 -> {
                        var2 = var1 * 1485807563;
                        var2 -= 116653853;
                        var2 |= 1459687782;
                        var2 *= 1464338663;
                        yield var2 ^ -872247158;
                    }
                    case -1123754427 -> var1 ^ 46177016;
                    default -> var1 ^ -1243634221;
                };
                var5 = var2 + 1;
                var5 = var2 * var5;
                var6 = var2 + 2;
                var5 *= var6;
                var6 = var2 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label69;
                }

                float var44;
                if (var43) {
                    var2 = switch (var2) {
                        case -1657686209 -> var2 ^ 1087720212;
                        case -1228839040 -> {
                            var2 |= -1622042431;
                            yield var2 ^ 793116924;
                        }
                        default -> var2 ^ 1861405816;
                    };
                    var44 = 10.0F;
                    switch (var2) {
                        case -1869086915:
                            var2 -= -894671184;
                            var2 &= 340533799;
                            var2 += 285169344;
                            var2 ^= 1369749335;
                            break;
                        case 172270619:
                        default:
                            var2 ^= 1612210563;
                            break;
                        case 444894715:
                            var2 ^= -1142685395;
                    }
                } else {
                    var2 &= 1019618213;
                    var2 |= -1791863687;
                    var2 &= -1706613881;
                    var2 >>>= 1;
                    var2 ^= 767496847;
                    var5 = var2 + 1;
                    var5 = var2 * var5;
                    var6 = var2 + 2;
                    var5 *= var6;
                    var6 = var2 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label69;
                    }

                    var44 = 0.0F;
                    var2 &= -210593825;
                    var2 |= 702606019;
                    var2 |= -331358762;
                    var2 &= -1045554449;
                    var2 ^= -2058486947;
                }

                long var60 = var2;
                long var7 = var60 + 1L;
                var7 = var60 * var7;
                long var61 = var7 & 1L;
                long var69;
                var5 = (var69 = var61 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label69;
                }

                float var45 = 58.0F + var44;
                Integer var38 = var3;
                if (var38 != null) {
                    Integer var36 = switch (var2) {
                        case -1052212759 -> var2 ^ 1762381507;
                        default -> var2 ^ 1548338146;
                        case 1155785106 -> {
                            var2 += 505856140;
                            var2 >>>= 1;
                            var2 &= -1207281513;
                            yield var2 ^ 2021007464;
                        }
                    };
                    if (var36 != null) {
                        return var45 + 4.0F;
                    }
                    break label69;
                }

                var2 += 102000472;
                var2 |= -22310447;
                var2 ^= -1017426385;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                AssertionError var42 = new AssertionError();
                throw var42;
            }
        }

        UnsupportedOperationException var37 = new UnsupportedOperationException();
        throw var37;
    }

    @Override
    public float v() {
        int var1 = Y;
        var1 ^= -318083011;
        int var2 = System.identityHashCode(this);
        XF var3 = this.y;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var39;
        var2 = (var39 = var4 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ 1147838944;
                case 1262344394 -> var1 ^ -1065079246;
                case 1579086656 -> {
                    var1 -= 1642492057;
                    var1 |= 1022306972;
                    yield var1 ^ 865748384;
                }
            };
            float var25 = var3.bs();
            int var28 = var1 ^ -617161922;
            int var29 = var28 & 1953550893;
            int var30 = var29 * -2138789653;
            int var31 = var30 + -1666867710;
            int var32 = var31 ^ 298099694;
            float var33 = this.wB(var32);
            float var26 = var25 * var33;
            return 15.0F + var26;
        } else {
            var1 >>= 22;
            var1 ^= -179925951;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var27 = var1 + 2;
            var2 *= var27;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }
    }

    @Override
    public void ol(float var1) {
        int var2 = Y;
        var2 ^= -2011818542;
        int var3 = System.identityHashCode(this);
        XF var4 = this.y;
        boolean var5 = this.H;
        int var6 = var3 + 1;
        var6 = var3 * var6;
        var6 &= 1;
        if (var6 != 0) {
            var2 |= 885901122;
            var2 &= -769087764;
            var2 <<= 7;
            var2 ^= -1773679550;
        } else {
            var2 -= -1727862327;
            var2 &= 318281515;
            var2 |= 1589168031;
            var2 |= 769036899;
            var2 ^= 706545007;
            float var49;
            if (var5) {
                var2 *= -890107013;
                var2 *= 725722273;
                var2 ^= 1344312205;
                var2 ^= 1721717512;
                var49 = 1.0F;
                var2 >>= 14;
                var2 &= -1677713674;
                var2 &= 433525592;
                var2 -= -318933024;
                var2 ^= 859099156;
            } else {
                var2 = switch (var2) {
                    case -1937633667 -> var2 ^ 988047018;
                    default -> var2 ^ 738562329;
                    case 1440993936 -> {
                        var2 *= -203695097;
                        var2 <<= 20;
                        var2 ^= 737215330;
                        var2 &= 163259212;
                        yield var2 ^ -337599572;
                    }
                };
                var49 = 0.0F;
                var2 >>= 26;
                var2 |= 894482690;
                var2 ^= -406210610;
            }

            var6 = var2 + 1;
            var6 = var2 * var6;
            int var7 = var2 + 2;
            var6 *= var7;
            var7 = var2 + 3;
            var6 *= var7;
            var6 &= 7;
            if (var6 != 0) {
                AssertionError var57 = new AssertionError();
                throw var57;
            }

            var4.H(var49);
            Integer var47 = var3;
            if (var47 != null) {
                switch (var2) {
                    case -1368090473:
                        var2 ^= -572056875;
                        break;
                    case 406210612:
                        var2 &= -2001913393;
                        var2 *= 46192031;
                        var2 -= 913023081;
                        var2 += -1369462163;
                        var2 ^= -1274806301;
                        break;
                    case 1386057277:
                    default:
                        var2 ^= -1933291026;
                }

                XF var45 = this.y;
                float var46 = var45.N(var1);
                return;
            }

            switch (var2) {
                case -951631087:
                default:
                    var2 ^= 1195196970;
                    break;
                case 406210612:
                    var2 += 2058915295;
                    var2 ^= 15363153;
                    break;
                case 1281865542:
                    var2 ^= -1814664529;
            }
        }

        RuntimeException var48 = new RuntimeException();
        throw var48;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        label151: {
            int var4 = Y;
            var4 ^= 751715387;
            int var5 = System.identityHashCode(this);
            ColorSetting var6 = this.Tl;
            int var124 = var6.zz();
            ColorSetting var7 = this.Tl;
            String var128 = var7.Tp();
            float var8 = this.U;
            float var9 = this.fb;
            var9 += 3.5F;
            TextStyle var10 = lt;
            TextStyle var11 = lt;
            int var276 = var11.color();
            int var277 = DP.nq(var276, var3);
            var10 = var10.color(var277);
            float var129 = var1.text(var128, var8, var9, var10);
            float var130 = 16.0F;
            var8 = 9.0F;
            var9 = this.U;
            Integer var229 = var5;
            if (var229 == null) {
                var4 -= 268229452;
                var4 ^= 640632949;
            } else {
                var4 |= 849381801;
                var4 += -1857290079;
                var4 &= -1703650321;
                var4 *= 723549333;
                var4 ^= -800523322;
                int var230 = var4 + 1;
                int var231 = var4 * var230;
                int var232 = var231 & 1;
                if (var232 != 0) {
                    break label151;
                }

                float var233 = this.pP;
                var9 += var233;
                var9 -= var130;
                float var234 = this.fb;
                float var235 = var234 + 3.0F;
                float var335;
                int var278 = (var335 = var3 - 0.99F) == 0.0F ? 0 : (var335 < 0.0F ? -1 : 1);
                if (var278 > 0) {
                    var4 ^= -919003498;
                    var4 ^= 143004845;
                    Hc.zP(var1, var9, var235, var130, var8, 3.0F);
                    var4 += 131315228;
                    var4 ^= 2014322706;
                    var4 &= -541732741;
                    var4 &= 1266281566;
                    var4 ^= -861025488;
                } else {
                    switch (var4) {
                        case -829939386:
                            var4 >>= 1;
                            var4 |= -1744442466;
                            var4 *= -1126223367;
                            var4 ^= 1717989585;
                            var4 ^= -562491348;
                            break;
                        case 328321834:
                            var4 ^= 987554889;
                            break;
                        case 1306235398:
                        default:
                            var4 ^= 2124050264;
                    }
                }

                int var279 = DP.nq(var124, var3);
                var1.roundRect(var9, var235, var130, var8, 3.0F, var279);
                var9 += 0.5F;
                float var236 = var235 + 0.5F;
                var130--;
                var8--;
                int var280 = DP.nq(1090519039, var3);
                Paint var281 = Paint.solid(var280);
                Paint var282 = var281.stroke(0.8F);
                var1.roundRect(var9, var236, var130, var8, 2.6F, var282);
                XF var132 = this.y;
                float var133 = var132.bs();
                Integer var149 = var5;
                if (var149 == null) {
                    var4 ^= -217407662;
                    var4 |= -1540387470;
                    var4 += 630450474;
                    var4 |= 322753759;
                    var4 ^= -1299352208;
                } else {
                    var4 += -59773251;
                    var4 -= 580538954;
                    var4 ^= 656024921;
                    long var150 = var4;
                    long var237 = var150 + 1L;
                    long var238 = var150 * var237;
                    long var12 = var150 + 2L;
                    long var239 = var238 * var12;
                    long var151 = var150 + 3L;
                    long var240 = var239 * var151;
                    long var152 = var240 & 7L;
                    long var336;
                    int var153 = (var336 = var152 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                    if (var153 != 0) {
                        break label151;
                    }

                    float var134 = TP.S(var133);
                    float var337;
                    int var154 = (var337 = var134 - 0.01F) == 0.0F ? 0 : (var337 < 0.0F ? -1 : 1);
                    if (var154 <= 0) {
                        var4 ^= -270304103;
                        var4 &= -209026924;
                        var4 -= -1329291383;
                        var4 ^= 2020202473;
                        int var187 = var4 + 1;
                        int var188 = var4 * var187;
                        int var189 = var188 & 1;
                        if (var189 == 0) {
                            return;
                        }
                        break label151;
                    }
                    var4 = switch (var4) {
                        case -594157128 -> var4 ^ -727845584;
                        case 1183351540 -> {
                            var4 &= 341315178;
                            var4 |= 1512456200;
                            var4 &= -451343447;
                            var4 *= -1470965661;
                            yield var4 ^ -1528182353;
                        }
                        default -> var4 ^ -747740443;
                    };
                    long var155 = var4;
                    long var241 = var155 + 1L;
                    long var242 = var155 * var241;
                    var12 = var155 + 2L;
                    long var243 = var242 * var12;
                    long var156 = var155 + 3L;
                    long var244 = var243 * var156;
                    long var157 = var244 & 7L;
                    long var338;
                    int var158 = (var338 = var157 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                    if (var158 != 0) {
                        break label151;
                    }

                    var1.save();
                    var1.alpha(var134);
                    float var135 = this.U;
                    float var136 = var135 - 2.0F;
                    var8 = this.fb;
                    var8 += 15.0F;
                    var9 = this.pP;
                    var9 += 4.0F;
                    float var245 = this.v();
                    float var246 = var245 - 15.0F;
                    var1.clip(var136, var8, var9, var246, 0.0F);
                    float var137 = this.fb;
                    float var138 = var137 + 15.0F;
                    float var139 = var138 + 2.0F;
                    float[] var161 = this.UL;
                    var8 = var161[0];
                    int var163 = DP.SW(var8, 1.0F, 1.0F);
                    var9 = this.U;
                    float var247 = this.pP;
                    int var164 = DP.nq(var163, var3);
                    var1.roundRect(var9, var139, var247, 46.0F, 5.0F, var164);
                    var8 = this.U;
                    var9 = this.pP;
                    int var248 = DP.nq(-1, var3);
                    Paint var249 = Paint.horizontal(var248, 16777215);
                    var1.roundRect(var8, var139, var9, 46.0F, 5.0F, var249);
                    var8 = this.U;
                    var9 = this.pP;
                    int var250 = DP.nq(-16777216, var3);
                    long var283 = var5;
                    long var13 = var283 + 1L;
                    var13 = var283 * var13;
                    long var284 = var13 & 1L;
                    long var339;
                    int var285 = (var339 = var284 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                    if (var285 == 0) {
                        var4 >>= 2;
                        var4 ^= 690367562;
                        var4 *= -1923356391;
                        var4 &= -557526942;
                        var4 ^= -450941009;
                        long var286 = var4;
                        var13 = var286 + 1L;
                        var13 = var286 * var13;
                        long var15 = var286 + 2L;
                        var13 *= var15;
                        long var287 = var286 + 3L;
                        var13 *= var287;
                        long var288 = var13 & 7L;
                        long var340;
                        int var289 = (var340 = var288 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
                        if (var289 != 0) {
                            break label151;
                        }

                        Paint var251 = Paint.vertical(0, var250);
                        var1.roundRect(var8, var139, var9, 46.0F, 5.0F, var251);
                        var8 = this.U;
                        float[] var200 = this.UL;
                        var9 = var200[1];
                        float var252 = this.pP;
                        var9 *= var252;
                        var8 += var9;
                        float[] var203 = this.UL;
                        var9 = var203[2];
                        var9 = 1.0F - var9;
                        var9 *= 46.0F;
                        var9 = var139 + var9;
                        int var253 = DP.nq(-1, var3);
                        Paint var254 = Paint.solid(var253);
                        Paint var255 = var254.stroke(1.4F);
                        var1.circle(var8, var9, 3.5F, var255);
                        float var140 = var139 + 46.0F;
                        float var141 = var140 + 6.0F;
                        float var142 = var141;
                        var8 = this.pP;
                        int[] var208 = OP;
                        int var209 = var208.length;
                        var9 = --var209;
                        var8 /= var9;
                        var8 = var8;
                        var1.save();
                        var9 = this.U;
                        float var256 = this.pP;
                        var1.clip(var9, var141, var256, 6.0F, 3.0F);
                        byte var213 = 0;
                        int var214 = var213;
                        var4 &= 767886019;
                        var4 >>= 21;
                        var4 ^= -1525865080;

                        label141:
                        while (true) {
                            Integer var257 = var4;
                            if (var257 == null) {
                                break label151;
                            }

                            int[] var258 = OP;
                            int var259 = var258.length;
                            long var290 = var5;
                            var13 = var290 + 1L;
                            var13 = var290 * var13;
                            var15 = var290 + 2L;
                            var13 *= var15;
                            long var291 = var290 + 3L;
                            var13 *= var291;
                            long var292 = var13 & 7L;
                            long var341;
                            int var293 = (var341 = var292 - 0L) == 0L ? 0 : (var341 < 0L ? -1 : 1);
                            if (var293 != 0) {
                                var4 <<= 8;
                                var4 &= -1151834091;
                                var4 -= -1938492368;
                                var4 ^= -713439137;
                                break;
                            }

                            var4 -= 2115155673;
                            var4 -= 318287265;
                            var4 -= 1266447972;
                            var4 += -425783683;
                            var4 ^= 759716781;
                            int var294 = var4 + 1;
                            int var295 = var4 * var294;
                            int var296 = var295 & 1;
                            if (var296 != 0) {
                                break label151;
                            }

                            if (var214 >= --var259) {
                                var4 ^= 195841643;
                                var4 <<= 6;
                                var4 &= 120906088;
                                var4 += -2042578308;
                                var4 ^= -1965439786;
                                long var172 = var4;
                                long var265 = var172 + 1L;
                                long var266 = var172 * var265;
                                var12 = var172 + 2L;
                                long var267 = var266 * var12;
                                long var173 = var172 + 3L;
                                long var268 = var267 * var173;
                                long var174 = var268 & 7L;
                                long var342;
                                int var175 = (var342 = var174 - 0L) == 0L ? 0 : (var342 < 0L ? -1 : 1);
                                if (var175 != 0) {
                                    break label151;
                                }

                                var1.restore();
                                var8 = this.U;
                                float[] var215 = this.UL;
                                var9 = var215[0];
                                float var269 = this.pP;
                                var9 *= var269;
                                var8 += var9;
                                var9 = var142 + 3.0F;
                                Paint var270 = Paint.solid(-1);
                                Paint var271 = var270.stroke(1.3F);
                                var1.circle(var8, var9, 3.4F, var271);
                                ColorSetting var178 = this.Tl;
                                long var219 = var5;
                                long var305 = var219 + 1L;
                                long var306 = var219 * var305;
                                long var220 = var306 & 1L;
                                long var343;
                                int var221 = (var343 = var220 - 0L) == 0L ? 0 : (var343 < 0L ? -1 : 1);
                                if (var221 == 0) {
                                    var4 |= 31267909;
                                    var4 ^= -1585593837;
                                    var4 &= 1062099024;
                                    var4 ^= 1898101574;
                                    long var222 = var4;
                                    long var307 = var222 + 1L;
                                    long var308 = var222 * var307;
                                    var13 = var222 + 2L;
                                    long var309 = var308 * var13;
                                    long var223 = var222 + 3L;
                                    long var310 = var309 * var223;
                                    long var224 = var310 & 7L;
                                    long var344;
                                    int var225 = (var344 = var224 - 0L) == 0L ? 0 : (var344 < 0L ? -1 : 1);
                                    if (var225 != 0) {
                                        break label151;
                                    }

                                    boolean var179 = var178.hO();
                                    if (var179) {
                                        var4 *= 1484230761;
                                        var4 *= -1104785155;
                                        var4 |= 322974176;
                                        var4 ^= -2132809453;
                                        float var143 = var142 + 6.0F;
                                        float var144 = var143 + 4.0F;
                                        var8 = this.U;
                                        var9 = this.pP;
                                        Hc.zP(var1, var8, var144, var9, 6.0F, 3.0F);
                                        var8 = this.U;
                                        var9 = this.pP;
                                        int var272 = DP.U(var124, 0);
                                        int var311 = DP.U(var124, 255);
                                        Paint var273 = Paint.horizontal(var272, var311);
                                        var1.roundRect(var8, var144, var9, 6.0F, 3.0F, var273);
                                        int var182 = var5 + 1;
                                        int var183 = var5 * var182;
                                        var5 = var183 & 1;
                                        if (var5 != 0) {
                                            switch (var4) {
                                                case -1411375742:
                                                    var4 ^= -1792509648;
                                                    break label141;
                                                case -1224306435:
                                                    var4 += 1404386736;
                                                    var4 ^= -1555469022;
                                                    break label141;
                                                case 1887652621:
                                                default:
                                                    var4 ^= -1737955656;
                                                    break label141;
                                            }
                                        }

                                        var4 *= -48854773;
                                        var4 += -40119113;
                                        var4 ^= -1881987507;
                                        long var184 = var4;
                                        long var274 = var184 + 1L;
                                        long var275 = var184 * var274;
                                        long var185 = var275 & 1L;
                                        long var345;
                                        var5 = (var345 = var185 - 0L) == 0L ? 0 : (var345 < 0L ? -1 : 1);
                                        if (var5 != 0) {
                                            break label151;
                                        }

                                        float var121 = this.U;
                                        float var125 = DP.L(var124);
                                        var8 = this.pP;
                                        float var126 = var125 * var8;
                                        float var122 = var121 + var126;
                                        float var127 = var144 + 3.0F;
                                        Paint var145 = Paint.solid(-1);
                                        Paint var146 = var145.stroke(1.3F);
                                        var1.circle(var122, var127, 3.4F, var146);
                                        var4 += 655951474;
                                        var4 *= -370460729;
                                        var4 += -1121315963;
                                        var4 ^= 128941606;
                                    } else {
                                        switch (var4) {
                                            case -325696584:
                                            default:
                                                var4 ^= -890396628;
                                                break;
                                            case 1562567446:
                                                var4 -= 773287086;
                                                var4 ^= 1946616110;
                                                break;
                                            case 1820646323:
                                                var4 ^= 1354646985;
                                        }
                                    }

                                    Integer var123 = var4;
                                    if (var123 != null) {
                                        var1.restore();
                                        return;
                                    }
                                    break label151;
                                } else {
                                    switch (var4) {
                                        case 210321258:
                                            var4 *= -1940959401;
                                            var4 ^= -12921091;
                                            var4 &= -1676126455;
                                            var4 ^= 836941446;
                                            break label141;
                                        case 1694987847:
                                        default:
                                            var4 ^= -166044505;
                                            break label141;
                                        case 1873190898:
                                            var4 ^= -250346989;
                                            break label141;
                                    }
                                }
                            }
                            var4 = switch (var4) {
                                case -2106850516 -> {
                                    var4 &= -1456871964;
                                    var4 ^= -681755130;
                                    var4 ^= -1008778462;
                                    yield var4 ^ 310329670;
                                }
                                case -1206646444 -> var4 ^ -1462819788;
                                default -> var4 ^ -925091386;
                            };
                            float var261 = this.U;
                            float var297 = var214;
                            float var298 = var297 * var8;
                            float var262 = var261 + var298;
                            float var263 = var262 - 0.5F;
                            Integer var299 = var5;
                            if (var299 == null) {
                                var4 -= -967275217;
                                var4 |= 1928228858;
                                var4 ^= 1527536752;
                                break;
                            }

                            var4 <<= 9;
                            var4 >>>= 12;
                            var4 >>>= 15;
                            var4 ^= 1322727339;
                            var4 ^= 1878435068;
                            long var300 = var4;
                            var13 = var300 + 1L;
                            var13 = var300 * var13;
                            var15 = var300 + 2L;
                            var13 *= var15;
                            long var301 = var300 + 3L;
                            var13 *= var301;
                            long var302 = var13 & 7L;
                            long var346;
                            int var303 = (var346 = var302 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                            if (var303 != 0) {
                                break label151;
                            }

                            float var304 = var8 + 1.0F;
                            int[] var313 = OP;
                            int var314 = var313[var214];
                            int[] var330 = OP;
                            int var14 = var214 + 1;
                            int var331 = var330[var14];
                            Paint var315 = Paint.horizontal(var314, var331);
                            var1.rect(var263, var142, var304, 6.0F, var315);
                            int var264 = var214 + 1;
                            var214 = var264;
                            var4 -= -1655029362;
                            var4 ^= 650802518;
                        }
                    } else {
                        var4 <<= 17;
                        var4 |= -1588002162;
                        var4 ^= 269328641;
                    }
                }
            }

            IllegalStateException var113 = new IllegalStateException();
            throw var113;
        }

        UnsupportedOperationException var118 = new UnsupportedOperationException();
        throw var118;
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        label339: {
            int var5 = Y;
            var5 ^= -1970360013;
            int var7 = System.identityHashCode(this);
            Integer var8 = var7;
            if (var8 == null) {
                var5 -= -1214472323;
                var5 &= 803642797;
                var5 *= 248112351;
                var5 ^= 480730141;
            } else {
                var5 = switch (var5) {
                    case -35700974 -> var5 ^ 1142794692;
                    default -> var5 ^ 1121255365;
                    case 966406734 -> {
                        var5 ^= 1100763899;
                        var5 >>>= 22;
                        var5 -= 1406125349;
                        var5 *= -1742977301;
                        yield var5 ^ 1654545551;
                    }
                };
                var8 = var4;
                if (var8 == null) {
                    break label339;
                }

                if (var4 != 0) {
                    switch (var5) {
                        case -1882669786:
                            var5 &= -722290110;
                            var5 <<= 22;
                            var5 ^= -747460579;
                            break;
                        case -870650692:
                        default:
                            var5 ^= -1054939717;
                            break;
                        case 1500917606:
                            var5 ^= -1280879822;
                    }

                    int var254 = var4 + 1;
                    var254 = var4 * var254;
                    int var297 = var4 + 2;
                    var254 *= var297;
                    var297 = var4 + 3;
                    var254 *= var297;
                    var254 &= 7;
                    if (var254 == 0) {
                        return false;
                    }
                    break label339;
                }

                var5 *= -2066943873;
                var5 &= 1080421773;
                var5 |= -737535047;
                var5 -= 1839644099;
                var5 ^= 916532929;
                float var200 = this.fb;
                Integer var9 = var7;
                if (var9 != null) {
                    var5 -= 55772057;
                    var5 &= -882238499;
                    var5 -= 1391584630;
                    var5 &= 51091347;
                    var5 ^= 1630282800;
                    long var259 = var4;
                    long var11 = var259 + 1L;
                    var11 = var259 * var11;
                    long var13 = var259 + 2L;
                    var11 *= var13;
                    long var260 = var259 + 3L;
                    var11 *= var260;
                    long var261 = var11 & 7L;
                    long var359;
                    int var262 = (var359 = var261 - 0L) == 0L ? 0 : (var359 < 0L ? -1 : 1);
                    if (var262 != 0) {
                        break label339;
                    }

                    float var201 = var200 + 15.0F;
                    float var360;
                    int var202 = (var360 = var3 - var201) == 0.0F ? 0 : (var360 < 0.0F ? -1 : 1);
                    if (var202 < 0) {
                        var5 = switch (var5) {
                            case -1320057181 -> var5 ^ 608716742;
                            default -> var5 ^ 714981292;
                            case 1613505074 -> {
                                var5 += -1813125540;
                                var5 -= -743555062;
                                var5 += 60389746;
                                yield var5 ^ -941286108;
                            }
                        };
                        var202 = var4 + 1;
                        var202 = var4 * var202;
                        var262 = var4 + 2;
                        var202 *= var262;
                        var262 = var4 + 3;
                        var202 *= var262;
                        var202 &= 7;
                        if (var202 != 0) {
                            break label339;
                        }

                        int var236 = (this.H ? 1 : 0);
                        Integer var285 = var7;
                        if (var285 != null) {
                            var5 = switch (var5) {
                                default -> var5 ^ 644295968;
                                case -1065199234 -> var5 ^ 1197846459;
                                case -471835438 -> {
                                    var5 &= 1102289426;
                                    yield var5 ^ -1900820835;
                                }
                            };
                            long var286 = var4;
                            var11 = var286 + 1L;
                            var11 = var286 * var11;
                            var13 = var286 + 2L;
                            var11 *= var13;
                            long var287 = var286 + 3L;
                            var11 *= var287;
                            long var288 = var11 & 7L;
                            long var361;
                            int var289 = (var361 = var288 - 0L) == 0L ? 0 : (var361 < 0L ? -1 : 1);
                            if (var289 != 0) {
                                break label339;
                            }

                            if (var236 == 0) {
                                var5 *= 1164286641;
                                var5 &= -1837081990;
                                var5 ^= -2129361904;
                                Integer var237 = var4;
                                if (var237 == null) {
                                    break label339;
                                }

                                var236 = 1;
                                var5 |= 509482467;
                                var5 |= 1408441961;
                                var5 ^= -1469439785;
                            } else {
                                var5 = switch (var5) {
                                    default -> var5 ^ -128442727;
                                    case -820781425 -> {
                                        var5 *= 1213268315;
                                        var5 |= -1675354838;
                                        var5 -= 350005105;
                                        var5 ^= -2133643772;
                                        yield var5 ^ -343009417;
                                    }
                                    case 744069124 -> var5 ^ 923648814;
                                };
                                var236 = 0;
                                var5 += 2097129750;
                                var5 -= -1353815616;
                                var5 ^= 422092399;
                            }

                            Integer var290 = var4;
                            if (var290 == null) {
                                break label339;
                            }

                            this.H = (var236 != 0);
                            Integer var239 = var7;
                            label274:
                            if (var239 != null) {
                                var5 *= 1877153259;
                                var5 -= -2042690617;
                                var5 ^= 358495767;
                                var236 = var4 + 1;
                                int var241 = var4 * var236;
                                var241 &= 1;
                                if (var241 != 0) {
                                    break label339;
                                }

                                int var243 = (this.H ? 1 : 0);
                                if (var243 != 0) {
                                    var5 = switch (var5) {
                                        default -> var5 ^ -939635835;
                                        case -238550438 -> {
                                            var5 += 1757905681;
                                            yield var5 ^ -400309138;
                                        }
                                        case 226128863 -> var5 ^ 581813852;
                                    };
                                    long var244 = var4;
                                    long var302 = var244 + 1L;
                                    var302 = var244 * var302;
                                    long var344 = var244 + 2L;
                                    var302 *= var344;
                                    long var245 = var244 + 3L;
                                    var302 *= var245;
                                    long var246 = var302 & 7L;
                                    long var362;
                                    var243 = (var362 = var246 - 0L) == 0L ? 0 : (var362 < 0L ? -1 : 1);
                                    if (var243 != 0) {
                                        break label339;
                                    }

                                    ColorSetting var248 = this.Tl;
                                    int var291 = var7 + 1;
                                    var291 = var7 * var291;
                                    int var306 = var7 + 2;
                                    var291 *= var306;
                                    int var307 = var7 + 3;
                                    var291 *= var307;
                                    var291 &= 7;
                                    if (var291 != 0) {
                                        var5 <<= 11;
                                        var5 *= 1823009029;
                                        var5 ^= 807555138;
                                        break label274;
                                    }

                                    var5 &= 1825466101;
                                    var5 += -1096099883;
                                    var5 ^= 1841027506;
                                    var243 = var248.zz();
                                    float[] var296 = this.UL;
                                    float[] var250 = DP.l(var243, var296);
                                    switch (var5) {
                                        case -1299394968:
                                            var5 &= -2007844928;
                                            var5 ^= 494728157;
                                            break;
                                        case -1003943584:
                                            var5 ^= 23897602;
                                            break;
                                        case 1434506746:
                                        default:
                                            var5 ^= -1689373921;
                                    }
                                } else {
                                    var5 *= -660952193;
                                    var5 |= -720890445;
                                    var5 ^= 1754474538;
                                }

                                var243 = var4 + 1;
                                var243 = var4 * var243;
                                var243 &= 1;
                                if (var243 == 0) {
                                    var1.Ht("ui_click");
                                    return true;
                                }
                                break label339;
                            } else {
                                switch (var5) {
                                    case 1525296271:
                                        var5 ^= -924349224;
                                        break;
                                    case 1932922036:
                                    default:
                                        var5 ^= 1223486848;
                                        break;
                                    case 2006318908:
                                        var5 *= -1555939431;
                                        var5 ^= -983574882;
                                }
                            }
                        } else {
                            var5 += 2053733944;
                            var5 += 474655221;
                            var5 -= -1877992981;
                            var5 ^= 1278669654;
                        }
                    } else {
                        var5 ^= 399226127;
                        var5 &= -919166798;
                        var5 &= -985935482;
                        var5 *= 542923993;
                        var5 ^= -1620113351;
                        int var203 = (this.H ? 1 : 0);
                        Integer var263 = var7;
                        if (var263 == null) {
                            switch (var5) {
                                case -1910842673:
                                default:
                                    var5 ^= 1263039513;
                                    break;
                                case 55674937:
                                    var5 |= 1963444021;
                                    var5 ^= -773499009;
                                    break;
                                case 1743624867:
                                    var5 ^= -985884480;
                            }
                        } else {
                            var5 |= -615462358;
                            var5 *= -2111944185;
                            var5 ^= 237725920;
                            long var264 = var4;
                            var11 = var264 + 1L;
                            var11 = var264 * var11;
                            var13 = var264 + 2L;
                            var11 *= var13;
                            long var265 = var264 + 3L;
                            var11 *= var265;
                            long var266 = var11 & 7L;
                            long var363;
                            int var267 = (var363 = var266 - 0L) == 0L ? 0 : (var363 < 0L ? -1 : 1);
                            if (var267 != 0) {
                                break label339;
                            }

                            if (var203 == 0) {
                                switch (var5) {
                                    case -1497529089:
                                    default:
                                        var5 ^= 79184891;
                                        break;
                                    case 208519952:
                                        var5 ^= -813934205;
                                        break;
                                    case 1118895485:
                                        var5 >>= 19;
                                        var5 ^= -630411842;
                                }

                                return false;
                            }

                            var5 += 1990215637;
                            var5 += 573471337;
                            var5 >>>= 11;
                            var5 >>>= 8;
                            var5 ^= 1163396707;
                            float var204 = this.fb;
                            float var205 = var204 + 15.0F;
                            float var206 = var205 + 2.0F;
                            float var268 = var206 + 46.0F;
                            float var269 = var268 + 6.0F;
                            float var10 = var269 + 6.0F;
                            var10 += 4.0F;
                            int var315 = var7 + 1;
                            int var316 = var7 * var315;
                            int var12 = var7 + 2;
                            int var317 = var316 * var12;
                            var12 = var7 + 3;
                            int var318 = var317 * var12;
                            int var319 = var318 & 7;
                            if (var319 != 0) {
                                var5 >>= 18;
                                var5 += -2102568496;
                                var5 |= 993882448;
                                var5 &= 182958670;
                                var5 ^= -1407737340;
                            } else {
                                label374: {
                                    var5 = switch (var5) {
                                        case -1551964288 -> var5 ^ 257053268;
                                        default -> var5 ^ -1642783593;
                                        case 1163402508 -> {
                                            var5 += 304934403;
                                            var5 |= 715850727;
                                            yield var5 ^ -1546171900;
                                        }
                                    };
                                    Integer var320 = var4;
                                    if (var320 == null) {
                                        break label339;
                                    }

                                    float var207 = var206 + 46.0F;
                                    float var208 = var207 + 3.0F;
                                    float var364;
                                    var203 = (var364 = var3 - var208) == 0.0F ? 0 : (var364 < 0.0F ? -1 : 1);
                                    if (var203 < 0) {
                                        var5 &= 1764315859;
                                        var5 ^= -458199431;
                                        var5 &= 1594522680;
                                        var5 &= -1566922987;
                                        var5 ^= -2030066669;
                                        Integer var210 = var4;
                                        if (var210 == null) {
                                            break label339;
                                        }

                                        Vs var211 = Vs.SQUARE;
                                        var11 = var7;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        long var15 = var11 + 2L;
                                        var13 *= var15;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var365;
                                        int var324 = (var365 = var11 - 0L) == 0L ? 0 : (var365 < 0L ? -1 : 1);
                                        if (var324 != 0) {
                                            var5 += -1318685604;
                                            var5 |= -481392739;
                                            var5 |= 861550771;
                                            var5 ^= 1575839677;
                                            break label374;
                                        }

                                        var5 -= -1081149773;
                                        var5 ^= -1132357734;
                                        int var325 = var4 + 1;
                                        int var326 = var4 * var325;
                                        int var327 = var326 & 1;
                                        if (var327 != 0) {
                                            break label339;
                                        }

                                        this.mO = var211;
                                        var5 ^= 1863689868;
                                        var5 ^= 116010690;
                                    } else {
                                        var5 = switch (var5) {
                                            case -596098581 -> {
                                                var5 <<= 13;
                                                var5 <<= 14;
                                                yield var5 ^ -323501293;
                                            }
                                            case 437537780 -> var5 ^ 1990638982;
                                            default -> var5 ^ 1526420812;
                                        };
                                        float var212 = var269 + 6.0F;
                                        float var213 = var212 + 2.0F;
                                        float var366;
                                        var203 = (var366 = var3 - var213) == 0.0F ? 0 : (var366 < 0.0F ? -1 : 1);
                                        var11 = var7;
                                        var13 = var11 + 1L;
                                        var13 = var11 * var13;
                                        long var358 = var11 + 2L;
                                        var13 *= var358;
                                        var11 += 3L;
                                        var13 *= var11;
                                        var11 = var13 & 7L;
                                        long var367;
                                        var267 = (var367 = var11 - 0L) == 0L ? 0 : (var367 < 0L ? -1 : 1);
                                        if (var267 != 0) {
                                            var5 -= 904549642;
                                            var5 ^= -662702517;
                                            break label374;
                                        }

                                        var5 ^= 1250054618;
                                        var5 ^= -853609732;
                                        if (var203 < 0) {
                                            var5 = switch (var5) {
                                                case -216346215 -> var5 ^ -298123353;
                                                case 858480693 -> {
                                                    var5 ^= -483670998;
                                                    yield var5 ^ 796024837;
                                                }
                                                default -> var5 ^ 208656816;
                                            };
                                            Vs var215 = Vs.HUE;
                                            var267 = var7 + 1;
                                            var267 = var7 * var267;
                                            int var331 = var7 + 2;
                                            var267 *= var331;
                                            int var332 = var7 + 3;
                                            var267 *= var332;
                                            var267 &= 7;
                                            if (var267 != 0) {
                                                var5 -= 1292656904;
                                                var5 ^= 349502288;
                                                break label374;
                                            }
                                            var5 = switch (var5) {
                                                case -9255910 -> {
                                                    var5 += -644382226;
                                                    var5 >>= 5;
                                                    yield var5 ^ -1533081291;
                                                }
                                                default -> var5 ^ 612668477;
                                                case 587213702 -> var5 ^ 1066745091;
                                            };
                                            this.mO = var215;
                                            switch (var5) {
                                                case -1136171520:
                                                    var5 ^= -1686794581;
                                                    break;
                                                case -933197455:
                                                default:
                                                    var5 ^= -163732435;
                                                    break;
                                                case 1515674373:
                                                    var5 *= 1975200501;
                                                    var5 |= 1120314491;
                                                    var5 >>>= 8;
                                                    var5 ^= 314866025;
                                            }
                                        } else {
                                            var5 |= -565186090;
                                            var5 -= 188932279;
                                            var5 += -376555040;
                                            var5 ^= 1553962656;
                                            Integer var216 = var4;
                                            if (var216 == null) {
                                                break label339;
                                            }

                                            ColorSetting var217 = this.Tl;
                                            var11 = var7;
                                            var13 = var11 + 1L;
                                            var13 = var11 * var13;
                                            var11 = var13 & 1L;
                                            long var368;
                                            var267 = (var368 = var11 - 0L) == 0L ? 0 : (var368 < 0L ? -1 : 1);
                                            if (var267 != 0) {
                                                var5 *= -287573273;
                                                var5 ^= -1549777214;
                                                break label374;
                                            }

                                            var5 &= -71308943;
                                            var5 &= 1414150107;
                                            var5 ^= 2019971211;
                                            Integer var277 = var4;
                                            if (var277 == null) {
                                                break label339;
                                            }

                                            boolean var218 = var217.hO();
                                            if (!var218) {
                                                switch (var5) {
                                                    case -1832402686:
                                                    default:
                                                        var5 ^= -1527377480;
                                                        return false;
                                                    case 1413141686:
                                                        var5 ^= -1300202411;
                                                        return false;
                                                    case 2019971467:
                                                        var5 ^= -1998753436;
                                                        var5 ^= -1223179977;
                                                        return false;
                                                }
                                            }

                                            var5 *= -463646235;
                                            var5 += -1379037033;
                                            var5 += -1335906764;
                                            var5 *= 1619971125;
                                            var5 ^= -319518982;
                                            int var219 = var4 + 1;
                                            var219 = var4 * var219;
                                            var219 &= 1;
                                            if (var219 != 0) {
                                                break label339;
                                            }

                                            float var222 = var10 + 6.0F;
                                            float var223 = var222 + 3.0F;
                                            var277 = var7;
                                            if (var277 == null) {
                                                switch (var5) {
                                                    case -881958481:
                                                        var5 ^= -1614642049;
                                                        break label374;
                                                    case 2034646135:
                                                    default:
                                                        var5 ^= -1866242298;
                                                        break label374;
                                                    case 2091942128:
                                                        var5 &= 474524231;
                                                        var5 ^= -1013233039;
                                                        var5 *= 1102500419;
                                                        var5 ^= 667583633;
                                                        break label374;
                                                }
                                            }
                                            var5 = switch (var5) {
                                                default -> var5 ^ -464253278;
                                                case 1336479012 -> var5 ^ -162928347;
                                                case 2091942128 -> {
                                                    var5 &= -279958199;
                                                    var5 >>= 19;
                                                    var5 |= -353102481;
                                                    var5 -= -453648161;
                                                    yield var5 ^ -546261809;
                                                }
                                            };
                                            float var369;
                                            var219 = (var369 = var3 - var223) == 0.0F ? 0 : (var369 < 0.0F ? -1 : 1);
                                            if (var219 >= 0) {
                                                var5 += -292046337;
                                                var5 ^= -1903517178;
                                                return false;
                                            }

                                            var5 >>>= 24;
                                            var5 ^= -1491907970;
                                            Vs var225 = Vs.ALPHA;
                                            long var279 = var7;
                                            var11 = var279 + 1L;
                                            var11 = var279 * var11;
                                            var13 = var279 + 2L;
                                            var11 *= var13;
                                            long var280 = var279 + 3L;
                                            var11 *= var280;
                                            long var281 = var11 & 7L;
                                            long var370;
                                            int var282 = (var370 = var281 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                                            if (var282 != 0) {
                                                var5 += 48183180;
                                                var5 |= 264363220;
                                                var5 ^= 155272886;
                                                break label374;
                                            }

                                            var5 >>>= 11;
                                            var5 ^= -386010515;
                                            this.mO = var225;
                                            switch (var5) {
                                                case -1953679919:
                                                    var5 ^= -1152306413;
                                                    break;
                                                case -651825350:
                                                default:
                                                    var5 ^= 4520431;
                                                    break;
                                                case -387379196:
                                                    var5 -= 223041993;
                                                    var5 -= 1018610905;
                                                    var5 ^= -1930401818;
                                            }
                                        }
                                    }

                                    long var226 = var4;
                                    long var300 = var226 + 1L;
                                    long var301 = var226 * var300;
                                    long var227 = var301 & 1L;
                                    long var371;
                                    var203 = (var371 = var227 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                                    if (var203 != 0) {
                                        break label339;
                                    }

                                    var1.Q = this;
                                    Integer var198 = var7;
                                    if (var198 != null) {
                                        var5 += -976160007;
                                        var5 += 1915872587;
                                        var5 ^= -1536659817;
                                        long var6 = var4;
                                        long var229 = var6 + 1L;
                                        long var230 = var6 * var229;
                                        var6 = var230 & 1L;
                                        long var372;
                                        int var197 = (var372 = var6 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                                        if (var197 == 0) {
                                            this.M(var1, var2, var3);
                                            return true;
                                        }
                                        break label339;
                                    }

                                    var5 *= -1075485235;
                                    var5 ^= 591266806;
                                }
                            }
                        }
                    }
                } else {
                    var5 += 1576876053;
                    var5 &= 542531038;
                    var5 ^= -2035245810;
                }
            }

            IllegalArgumentException var195 = new IllegalArgumentException();
            throw var195;
        }

        IllegalArgumentException var190 = new IllegalArgumentException();
        throw var190;
    }

    @Override
    public void M(jX var1, float var2, float var3) {
        label101: {
            int var4 = Y;
            var4 ^= -950531756;
            int var5 = System.identityHashCode(this);
            float var6 = this.fb;
            var6 += 15.0F;
            var6 += 2.0F;
            float var7 = this.U;
            var7 = var2 - var7;
            float var8 = this.pP;
            var8 = Math.max(1.0F, var8);
            var7 /= var8;
            var7 = TP.S(var7);
            long var106 = var5;
            long var10 = var106 + 1L;
            var10 = var106 * var10;
            long var12 = var106 + 2L;
            var10 *= var12;
            long var107 = var106 + 3L;
            var10 *= var107;
            long var108 = var10 & 7L;
            long var178;
            int var109 = (var178 = var108 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
            if (var109 != 0) {
                var4 -= -2064522177;
                var4 -= -1118047670;
                var4 |= 1524594618;
                var4 |= 1716971458;
                var4 ^= 2025470812;
            } else {
                label104: {
                    int var116;
                    var4 += -1728360885;
                    var4 ^= 1360418207;
                    var4 <<= 21;
                    var4 -= -1944359473;
                    var4 ^= -1335759363;
                    ColorSetting var110 = this.Tl;
                    int var111 = var110.zz();
                    int var112 = DP.R(var111);
                    Vs var9 = this.mO;
                    var116 = var9.ordinal();
                    label97:
                    switch (var116) {
                        case 0:
                            var4 -= -2041920454;
                            var4 -= 266065446;
                            var4 ^= 1444854132;
                            return;
                        case 1:
                            var4 = switch (var4) {
                                case -2128248884 -> {
                                    var4 += -1361105824;
                                    var4 += -1658018379;
                                    var4 &= 125903870;
                                    yield var4 ^ 459436016;
                                }
                                default -> var4 ^ -2068769218;
                                case -1703246071 -> var4 ^ -335944857;
                            };
                            float[] var136 = this.UL;
                            var136[1] = var7;
                            float[] var102 = this.UL;
                            var6 = var3 - var6;
                            var6 /= 46.0F;
                            var6 = TP.S(var6);
                            var10 = var5;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var176 = var10 + 2L;
                            var12 *= var176;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var179;
                            int var140 = (var179 = var10 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                            if (var140 != 0) {
                                var4 |= -336346941;
                                var4 -= -115402173;
                                var4 -= -998089675;
                                var4 <<= 9;
                                var4 ^= -1548387674;
                                break label104;
                            }

                            var4 |= 1487720805;
                            var4 ^= -1950986529;
                            Integer var141 = var4;
                            if (var141 == null) {
                                break label101;
                            }

                            var6 = 1.0F - var6;
                            var102[2] = var6;
                            var116 = var112;
                            var4 &= -1495872228;
                            var4 |= -1606015574;
                            var4 ^= -726299544;
                            var4 *= 33990737;
                            var4 ^= 474159862;
                            break;
                        case 2:
                            var4 = switch (var4) {
                                case -2128248884 -> {
                                    var4 -= -901925735;
                                    var4 &= -1351248123;
                                    var4 ^= -147340154;
                                    yield var4 ^ 1614413247;
                                }
                                default -> var4 ^ -22707885;
                                case 1804116653 -> var4 ^ 345015889;
                            };
                            var10 = var4;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var175 = var10 + 2L;
                            var12 *= var175;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var180;
                            int var134 = (var180 = var10 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                            if (var134 != 0) {
                                break label101;
                            }

                            float[] var135 = this.UL;
                            long var145 = var5;
                            long var13 = var145 + 1L;
                            var13 = var145 * var13;
                            long var15 = var145 + 2L;
                            var13 *= var15;
                            var145 += 3L;
                            var13 *= var145;
                            var145 = var13 & 7L;
                            long var181;
                            int var148 = (var181 = var145 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                            if (var148 != 0) {
                                var4 *= 862463265;
                                var4 ^= 1091455855;
                                var4 ^= -104423695;
                                break label104;
                            }
                            var4 = switch (var4) {
                                case 516219091 -> var4 ^ -25305759;
                                case 829143608 -> {
                                    var4 ^= 260533971;
                                    var4 ^= -799869080;
                                    var4 *= 1127626647;
                                    var4 *= -990416059;
                                    yield var4 ^ -412574909;
                                }
                                default -> var4 ^ -1225726326;
                            };
                            Integer var149 = var4;
                            if (var149 == null) {
                                break label101;
                            }

                            float var150 = Math.min(var7, 0.9999F);
                            var135[0] = var150;
                            var116 = var112;
                            var4 |= -581259854;
                            var4 *= 1569433739;
                            var4 >>= 11;
                            var4 ^= -1436054571;
                            break;
                        case 3:
                            var4 = switch (var4) {
                                case -2128248884 -> {
                                    var4 -= -869610738;
                                    var4 &= 1794819212;
                                    var4 |= 1326766517;
                                    yield var4 ^ 2021595497;
                                }
                                case -704251034 -> var4 ^ 263291806;
                                default -> var4 ^ 1466226674;
                            };
                            float var117 = var7 * 255.0F;
                            var10 = var5;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var182;
                            int var125 = (var182 = var10 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
                            if (var125 != 0) {
                                var4 >>>= 26;
                                var4 *= 1039248159;
                                var4 ^= 855481149;
                                break label104;
                            }

                            var4 ^= -940193674;
                            var4 *= 1547286265;
                            var4 ^= -1077749780;
                            int var126 = var4 + 1;
                            int var127 = var4 * var126;
                            int var11 = var4 + 2;
                            int var128 = var127 * var11;
                            var11 = var4 + 3;
                            int var129 = var128 * var11;
                            int var130 = var129 & 7;
                            if (var130 != 0) {
                                break label101;
                            }

                            var116 = Math.round(var117);
                            var116 = var116;
                            switch (var4) {
                                case -164650370:
                                    var4 -= -1681072189;
                                    var4 >>>= 18;
                                    var4 *= 1301129537;
                                    var4 *= 808114473;
                                    var4 ^= 952154316;
                                    break label97;
                                case -43549840:
                                    var4 ^= 1064036955;
                                    break label97;
                                case 1016037231:
                                default:
                                    var4 ^= -1869330352;
                                    break label97;
                            }
                        default:
                            var4 -= 1680282695;
                            var4 ^= -1033135735;
                            Integer var93 = var4;
                            if (var93 == null) {
                                break label101;
                            }

                            var116 = var112;
                            var4 |= 17225263;
                            var4 ^= -1979225413;
                    }

                    ColorSetting var98 = this.Tl;
                    float[] var103 = this.UL;
                    var7 = var103[0];
                    float[] var113 = this.UL;
                    var8 = var113[1];
                    float[] var142 = this.UL;
                    float var143 = var142[2];
                    long var151 = var5;
                    long var171 = var151 + 1L;
                    var171 = var151 * var171;
                    long var177 = var151 + 2L;
                    var171 *= var177;
                    var151 += 3L;
                    var171 *= var151;
                    var151 = var171 & 7L;
                    long var183;
                    var5 = (var183 = var151 - 0L) == 0L ? 0 : (var183 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var4 ^= -2052585510;
                        var4 ^= -1867999730;
                        var4 = DP.SW(var7, var8, var143);
                        var4 = DP.U(var4, var116);
                        var98.L(var4);
                        return;
                    }

                    var4 |= 1584392270;
                    var4 |= -1726108331;
                    var4 ^= -732282766;
                    var4 ^= 216035595;
                }
            }

            var5 = var4 + 1;
            var5 = var4 * var5;
            int var154 = var4 + 2;
            var5 *= var154;
            var154 = var4 + 3;
            var5 *= var154;
            var5 &= 7;
            if (var5 == 0) {
                AssertionError var90 = new AssertionError();
                throw var90;
            }
        }

        UnsupportedOperationException var89 = new UnsupportedOperationException();
        throw var89;
    }

    @Override
    public void u(jX var1) {
        int var2 = Y;
        var2 ^= 1954052100;
        int var3 = System.identityHashCode(this);
        Vs var4 = Vs.NONE;
        this.mO = var4;
        Integer var25 = var3;
        if (var25 == null) {
            var2 >>= 26;
            var2 ^= -2005213010;
            var2 *= -1058980895;
            var2 ^= -493139525;
            AssertionError var33 = new AssertionError();
            throw var33;
        } else {
            var2 |= -30861463;
            var2 ^= -988749843;
            if (var1.Q == this) {
                var2 &= 159474146;
                var2 *= -2134416621;
                var2 *= 1588356559;
                var2 ^= -2084123524;
                int var27 = var2 + 1;
                var27 = var2 * var27;
                int var34 = var2 + 2;
                var27 *= var34;
                int var35 = var2 + 3;
                var27 *= var35;
                var27 &= 7;
                if (var27 != 0) {
                    AssertionError var32 = new AssertionError();
                    throw var32;
                }

                var1.Q = null;
                switch (var2) {
                    case -2091875588:
                        var2 >>= 9;
                        var2 *= -705675051;
                        var2 ^= -1274976452;
                        break;
                    case -1954450399:
                    default:
                        var2 ^= -1729300586;
                        break;
                    case 607342964:
                        var2 ^= 847334965;
                }
            } else {
                var2 ^= -1446701034;
                var2 += 347195140;
                var2 &= -548098671;
                var2 ^= 878769321;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1318157733;
        int var2 = XR.Mz;
        int var4 = of_2.kj(var3, var1, var2);
        Y = var4;
        int[] var5 = new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536};
        OP = var5;
    }
}
