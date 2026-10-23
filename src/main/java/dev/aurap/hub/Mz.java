package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Mz extends XR {
    private final BooleanSetting r;
    private final XF Kg;
    public static final int ig;

    public Mz(BooleanSetting var1) {
        this.r = var1;
        XF var2;
        boolean var3 = var1.vb();
        float var5;
        if (var3) {
            var5 = 1.0F;
        } else {
            var5 = 0.0F;
        }

        kE_2 var4 = kE_2.SNAPPY;
        var2 = new XF(var5, var4);
        this.Kg = var2;
    }

    @Override
    public Setting W() {
        int var1 = ig;
        var1 ^= 1133760002;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            switch (var1) {
                case -1422380092:
                    var1 += -1256193797;
                    var1 >>= 22;
                    var1 ^= 889353848;
                    break;
                case -168267295:
                default:
                    var1 ^= 692939350;
                    break;
                case 1167687598:
                    var1 ^= -197179372;
            }

            AssertionError var18 = new AssertionError();
            throw var18;
        } else {
            switch (var1) {
                case -1638801072:
                default:
                    var1 ^= -1895762716;
                    break;
                case -1422380092:
                    var1 *= 1599356999;
                    var1 += -1831352581;
                    var1 ^= -808933562;
                    break;
                case -974951783:
                    var1 ^= -906008883;
            }

            return this.r;
        }
    }

    @Override
    public float v() {
        int var1 = System.identityHashCode(this);
        return 16.0F;
    }

    @Override
    public void ol(float var1) {
        label54: {
            int var2 = ig;
            var2 ^= -716848713;
            int var3 = System.identityHashCode(this);
            XF var4 = this.Kg;
            BooleanSetting var5 = this.r;
            Integer var6 = var3;
            if (var6 == null) {
                var2 ^= -1097660058;
                var2 -= -1152242838;
                var2 ^= 1266859665;
            } else {
                var2 |= 455307469;
                var2 |= 1691217676;
                var2 ^= -1063444293;
                long var58 = var2;
                long var8 = var58 + 1L;
                var8 = var58 * var8;
                long var59 = var8 & 1L;
                long var67;
                int var60 = (var67 = var59 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                if (var60 != 0) {
                    break label54;
                }

                boolean var51 = var5.vb();
                float var56;
                if (var51) {
                    var2 ^= 201311011;
                    var2 -= -1153842816;
                    var2 |= -1055049448;
                    var2 ^= 2065634794;
                    long var52 = var2;
                    long var7 = var52 + 1L;
                    var7 = var52 * var7;
                    long var9 = var52 + 2L;
                    var7 *= var9;
                    long var53 = var52 + 3L;
                    var7 *= var53;
                    long var54 = var7 & 7L;
                    long var68;
                    int var55 = (var68 = var54 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                    if (var55 != 0) {
                        break label54;
                    }

                    var56 = 1.0F;
                    switch (var2) {
                        case -2109706729:
                            var2 |= -4466157;
                            var2 ^= -779871075;
                            var2 ^= 1825925239;
                            break;
                        case -824308669:
                            var2 ^= 1556015586;
                            break;
                        case 406424413:
                        default:
                            var2 ^= -1004853305;
                    }
                } else {
                    var2 <<= 2;
                    var2 |= -218742123;
                    var2 += -521841921;
                    var2 ^= -357062272;
                    Integer var61 = var2;
                    if (var61 == null) {
                        break label54;
                    }

                    var56 = 0.0F;
                    var2 += 1142406458;
                    var2 *= 1658927159;
                    var2 &= -601008679;
                    var2 ^= -561263963;
                }

                Integer var62 = var2;
                if (var62 == null) {
                    break label54;
                }

                var4.H(var56);
                int var47 = var3 + 1;
                int var48 = var3 * var47;
                int var57 = var3 + 2;
                int var49 = var48 * var57;
                var3 += 3;
                int var50 = var49 * var3;
                var3 = var50 & 7;
                if (var3 == 0) {
                    var2 ^= 1755671260;
                    var2 ^= 1815568554;
                    var2 ^= -1848515992;
                    Integer var37 = var2;
                    if (var37 != null) {
                        XF var38 = this.Kg;
                        float var39 = var38.N(var1);
                        return;
                    }
                    break label54;
                }

                var2 |= 820093995;
                var2 ^= -482417349;
                var2 ^= 310181112;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                IllegalStateException var46 = new IllegalStateException();
                throw var46;
            }
        }

        IllegalArgumentException var40 = new IllegalArgumentException();
        throw var40;
    }

    @Override
    protected void R(Canvas var1, jX var2, float var3) {
        int var4 = ig;
        var4 ^= 2123536271;
        int var5 = System.identityHashCode(this);
        long var21 = var5;
        long var7 = var21 + 1L;
        var7 = var21 * var7;
        long var9 = var21 + 2L;
        var7 *= var9;
        long var22 = var21 + 3L;
        var7 *= var22;
        long var23 = var7 & 7L;
        long var47;
        var5 = (var47 = var23 - 0L) == 0L ? 0 : (var47 < 0L ? -1 : 1);
        if (var5 == 0) {
            Integer var25 = switch (var4) {
                case -1774622135 -> {
                    var4 &= -238805295;
                    var4 &= 351974884;
                    var4 |= 1895818523;
                    yield var4 ^ -667551365;
                }
                default -> var4 ^ 2045442557;
                case 1350850662 -> var4 ^ 616253316;
            };
            if (var25 != null) {
                BooleanSetting var27 = this.r;
                String var28 = var27.Tp();
                float var6 = this.U;
                float var39 = this.fb;
                float var40 = var39 + 4.0F;
                TextStyle var8 = lt;
                TextStyle var44 = lt;
                int var45 = var44.color();
                int var46 = DP.nq(var45, var3);
                var8 = var8.color(var46);
                float var29 = var1.text(var28, var6, var40, var8);
                float var30 = this.U;
                var6 = this.pP;
                float var31 = var30 + var6;
                float var32 = var31 - 10.0F;
                var6 = this.fb;
                var6 += 3.0F;
                XF var41 = this.Kg;
                float var42 = var41.bs();
                Hc.j(var1, var32, var6, var42, var3);
            } else {
                UnsupportedOperationException var26 = new UnsupportedOperationException();
                throw var26;
            }
        } else {
            switch (var4) {
                case -1774622135:
                    var4 &= -677143872;
                    var4 ^= 1625637231;
                    break;
                case -380125269:
                default:
                    var4 ^= -1252512226;
                    break;
                case 2136563443:
                    var4 ^= -393460710;
            }

            UnsupportedOperationException var16 = new UnsupportedOperationException();
            throw var16;
        }
    }

    @Override
    public boolean i(jX var1, float var2, float var3, int var4) {
        label52: {
            int var5 = ig;
            var5 ^= -672709687;
            int var7 = System.identityHashCode(this);
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var77;
            int var63 = (var77 = var8 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
            if (var63 == 0) {
                var5 = switch (var5) {
                    case 880945584 -> var5 ^ -63785811;
                    case 1061993999 -> {
                        var5 |= 807388057;
                        var5 &= 250364767;
                        var5 ^= -337576238;
                        yield var5 ^ -234675597;
                    }
                    default -> var5 ^ 510586451;
                };
                if (var4 != 0) {
                    var5 |= 1190109495;
                    var5 ^= -483954279;
                    Integer var71 = var4;
                    if (var71 != null) {
                        return false;
                    }
                    break label52;
                }

                var5 -= 646316977;
                var5 ^= 1531292602;
                var5 ^= 154502642;
                var8 = var4;
                var10 = var8 + 1L;
                var10 = var8 * var10;
                var8 = var10 & 1L;
                long var78;
                int var66 = (var78 = var8 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                if (var66 != 0) {
                    break label52;
                }

                BooleanSetting var67 = this.r;
                var67.lK();
                BooleanSetting var68 = this.r;
                boolean var69 = var68.vb();
                Integer var57 = var7;
                if (var57 != null) {
                    var5 ^= 52573805;
                    var5 += 915617681;
                    var5 += -254744285;
                    var5 >>>= 17;
                    var5 ^= -764104507;
                    String var58;
                    if (var69) {
                        var5 *= -1760633853;
                        var5 ^= -659404430;
                        var58 = "ui_toggle_on";
                        var5 &= -689350349;
                        var5 ^= 539969520;
                    } else {
                        var5 ^= -309546292;
                        var5 *= 864315911;
                        var5 -= 958003182;
                        var5 *= -1677901631;
                        var5 ^= 1290302125;
                        var58 = "ui_toggle_off";
                        var5 &= -1313707238;
                        var5 <<= 2;
                        var5 ^= 1672368246;
                        var5 ^= -1853796410;
                    }

                    Integer var70 = var4;
                    if (var70 != null) {
                        var1.Ht(var58);
                        return true;
                    }
                    break label52;
                }

                var5 >>>= 30;
                var5 *= -417779577;
                var5 -= 1847666236;
                var5 ^= -1915532272;
                var5 ^= 435789726;
            } else {
                var5 += 1388625118;
                var5 |= -485439799;
                var5 *= 1749963985;
                var5 += -1603668072;
                var5 ^= 432878153;
            }

            long var52 = var4;
            long var59 = var52 + 1L;
            long var60 = var52 * var59;
            long var53 = var60 & 1L;
            long var79;
            var5 = (var79 = var53 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
            if (var5 == 0) {
                RuntimeException var56 = new RuntimeException();
                throw var56;
            }
        }

        AssertionError var55 = new AssertionError();
        throw var55;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -400182205;
        int var2 = XR.Mz;
        int var4 = of_2.kj(var3, var1, var2);
        ig = var4;
    }
}
