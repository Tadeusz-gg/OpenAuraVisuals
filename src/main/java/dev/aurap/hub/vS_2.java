package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.fx.ScreenEffects;
import dev.skidware.visuals.render.text.Wordmark;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class vS_2 {
    private static final Logger i;
    public static final int Ol;

    static {
        Ol = of_2.kj(MethodHandles.lookup().lookupClass(), 1360606462, 0);
        i = LoggerFactory.getLogger("auravisuals/death");
    }

    public vS_2() {
    }

    public static vS_2[] xU() {
        int var0 = Ol;
        var0 ^= 346339779;
        vS_2[] var1 = new vS_2[4];
        QK var2 = new QK();
        var0 |= 1635282438;
        var0 &= 341516357;
        var0 |= -1799274864;
        var0 ^= 1013906596;
        var1[0] = var2;
        GO var8 = new GO();
        var1[1] = var8;
        yt var9 = new yt();
        var1[2] = var9;
        mF var10 = new mF();
        var1[3] = var10;
        return var1;
    }

    public abstract float w();

    public abstract float Vb();

    public abstract String K();

    public void N(XK var1) {
        int var2 = System.identityHashCode(this);
    }

    public void Az() {
        int var1 = System.identityHashCode(this);
    }

    public abstract void l(ScreenEffects var1, XK var2);

    public abstract void XE(Canvas var1, XK var2);

    protected static float qB(float var0, float var1, float var2) {
        int var3 = Ol;
        var3 ^= 1716166657;
        int var4 = (int)var0;
        float var5 = var0 - var1;
        var5 /= var2;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var35;
        var4 = (var35 = var6 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var4 != 0) {
            var3 |= -1251495278;
            var3 |= 2010765409;
            var3 ^= 1687913305;
            var3 ^= 2139084563;
            Integer var25 = var3;
            if (var25 != null) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var3 += 1244903512;
            var3 *= -1795545921;
            var3 ^= 1949877988;
            long var20 = var3;
            var6 = var20 + 1L;
            var6 = var20 * var6;
            long var21 = var6 & 1L;
            long var36;
            var3 = (var36 = var21 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var3 == 0) {
                return TP.S(var5);
            }
        }

        AssertionError var23 = new AssertionError();
        throw var23;
    }

    protected static void nS(Canvas var0, float var1, float var2, float var3, float var4, int var5) {
        label91: {
            label90: {
                int var6 = Ol;
                var6 ^= 1390981938;
                int var8 = System.identityHashCode(var0);
                int var9 = DP.R(var5);
                long var10 = var8;
                long var12 = var10 + 1L;
                var12 = var10 * var12;
                var10 = var12 & 1L;
                long var101;
                int var77 = (var101 = var10 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                if (var77 == 0) {
                    var6 = switch (var6) {
                        default -> var6 ^ -582646277;
                        case 746274872 -> {
                            var6 *= -1863702397;
                            var6 -= -996527367;
                            yield var6 ^ 415585960;
                        }
                        case 2050072643 -> var6 ^ -2061992493;
                    };
                    var10 = var5;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var102;
                    int var80 = (var102 = var10 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                    if (var80 != 0) {
                        break label91;
                    }

                    if (var9 == 0) {
                        var6 &= 840994789;
                        var6 += -1092187276;
                        var6 ^= 773973829;
                        var9 = var5 + 1;
                        var9 = var5 * var9;
                        int var89 = var5 + 2;
                        var9 *= var89;
                        int var90 = var5 + 3;
                        var9 *= var90;
                        var9 &= 7;
                        if (var9 == 0) {
                            return;
                        }
                        break label91;
                    }

                    var6 &= -1770423215;
                    var6 |= 1903369751;
                    var6 |= 831177530;
                    var6 ^= -1620561370;
                    var9 = var5 + 1;
                    var9 = var5 * var9;
                    int var81 = var5 + 2;
                    var9 *= var81;
                    int var82 = var5 + 3;
                    var9 *= var82;
                    var9 &= 7;
                    if (var9 != 0) {
                        break label91;
                    }

                    var9 = DP.U(var5, 0);
                    float var83 = var2 - var3;
                    int var11 = var8 + 1;
                    var11 = var8 * var11;
                    var11 &= 1;
                    if (var11 == 0) {
                        var6 = switch (var6) {
                            default -> var6 ^ -1641330915;
                            case -1041432853 -> var6 ^ 37282424;
                            case -325858023 -> {
                                var6 &= -525819096;
                                var6 &= 1357982245;
                                var6 |= 264421026;
                                yield var6 ^ -322780406;
                            }
                        };
                        float var93 = var3 * 2.0F;
                        var0.rect(0.0F, var83, var1, var93, var5);
                        float var103;
                        int var84 = (var103 = var4 - 0.0F) == 0.0F ? 0 : (var103 < 0.0F ? -1 : 1);
                        if (var84 <= 0) {
                            var6 *= -1825930765;
                            var6 &= 1314347779;
                            var6 *= -1978134927;
                            var6 |= 1672470008;
                            var6 ^= -1979014356;
                            break label90;
                        }
                        var6 = switch (var6) {
                            default -> var6 ^ 439932820;
                            case -1560248920 -> {
                                var6 -= 1729110639;
                                yield var6 ^ 866057010;
                            }
                            case -921231949 -> var6 ^ -2081940037;
                        };
                        Integer var85 = var5;
                        if (var85 == null) {
                            break label91;
                        }

                        float var86 = var2 - var3;
                        float var87 = var86 - var4;
                        Paint var94 = Paint.vertical(var9, var5);
                        var0.rect(0.0F, var87, var1, var4, var94);
                        float var88 = var2 + var3;
                        long var95 = var8;
                        long var13 = var95 + 1L;
                        var13 = var95 * var13;
                        long var96 = var13 & 1L;
                        long var104;
                        var8 = (var104 = var96 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var8 == 0) {
                            var6 = switch (var6) {
                                default -> var6 ^ 2038663723;
                                case 141467659 -> {
                                    var6 |= -271533922;
                                    yield var6 ^ 1216234770;
                                }
                                case 2050585844 -> var6 ^ -1485388431;
                            };
                            Integer var61 = var5;
                            if (var61 == null) {
                                break label91;
                            }

                            Paint var62 = Paint.vertical(var5, var9);
                            var0.rect(0.0F, var88, var1, var4, var62);
                            switch (var6) {
                                case -1484718707:
                                    var6 -= 1009281396;
                                    var6 |= 1829998311;
                                    var6 ^= 45007403;
                                    break label90;
                                case 653915002:
                                    var6 ^= 1310656237;
                                    break label90;
                                case 1803963928:
                                default:
                                    var6 ^= 1883246978;
                                    break label90;
                            }
                        }

                        var6 <<= 4;
                        var6 ^= 1151664414;
                    } else {
                        var6 *= 432653807;
                        var6 ^= -700532999;
                    }
                } else {
                    var6 += -834352482;
                    var6 ^= -977448407;
                    var6 ^= 525235808;
                    var6 ^= -20390624;
                    var6 ^= 481620497;
                }

                var6 = var5 + 1;
                var6 = var5 * var6;
                var8 = var5 + 2;
                var6 *= var8;
                int var7 = var5 + 3;
                var6 *= var7;
                var6 &= 7;
                if (var6 == 0) {
                    IllegalStateException var59 = new IllegalStateException();
                    throw var59;
                }
                break label91;
            }

            Integer var63 = var5;
            if (var63 != null) {
                return;
            }
        }

        AssertionError var58 = new AssertionError();
        throw var58;
    }

    protected static Wordmark fF(String name) {
        String path = "assets/auravisuals/death/" + name + ".png";
        try (java.io.InputStream in = vS_2.class.getClassLoader().getResourceAsStream(path)) {
            if (in == null) {
                i.warn("Death Effect artwork {} unavailable, drawing text instead", name, (Object) null);
                return null;
            }
            byte[] bytes = in.readAllBytes();
            return dev.skidware.visuals.render.text.Wordmark.decode(bytes);
        } catch (Exception e) {
            i.warn("Death Effect artwork {} unavailable, drawing text instead", name, e);
            return null;
        }
    }

    private static Throwable j(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
