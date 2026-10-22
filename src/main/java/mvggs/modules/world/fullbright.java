package mvggs.modules.world;

import dev.aurap.hub.*;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class fullbright extends Yn {
    private final Uq M;
    public static final int x;

    public fullbright() {
        super("fullbright", "Fullbright", AJ.WORLD);
        Uq var2 = new Uq("strength", "Strength", 100.0F, 0.0F, 100.0F);
        Uq var3 = var2.W(1.0F);
        Uq var4 = var3.L("%");
        xB var5 = this.vn(var4);
        Uq var6 = (Uq)var5;
        this.M = var6;
        this.dy("Clear, steady lighting in caves and at night, with adjustable strength.");
    }

    public static float g() {
        int var0 = x;
        var0 ^= 872163388;
        int var1 = (Ud.y()) ? 1 : 0;
        var0 += 100031475;
        var0 >>>= 13;
        var0 &= -1056442138;
        var0 += -610770451;
        var0 ^= 1406912473;
        Integer var2 = var0;
        if (var2 != null) {
            if (var1 == 0) {
                long var44 = switch (var0) {
                    case -2008799916 -> {
                        var0 += 48666271;
                        var0 ^= -85186598;
                        var0 >>>= 1;
                        yield var0 ^ -878726706;
                    }
                    case -906678625 -> var0 ^ -1651908733;
                    default -> var0 ^ 1515810364;
                };
                long var3 = var44 + 1L;
                var3 = var44 * var3;
                long var5 = var44 + 2L;
                var3 *= var5;
                long var45 = var44 + 3L;
                var3 *= var45;
                long var46 = var3 & 7L;
                long var77;
                var1 = (var77 = var46 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return 0.0F;
                }
            } else {
                var0 -= 1124335359;
                var0 *= 1722854895;
                var0 ^= 299372049;
                Integer var48 = var0;
                if (var48 != null) {
                    Ud var49 = Ud.Z();
                    NW var50 = var49.sP();
                    Yn var51 = var50.tG(fullbright.class);
                    var0 += -430680614;
                    var0 ^= 1323140968;
                    var0 |= 212549327;
                    var0 ^= -190265031;
                    var2 = var0;
                    label59:
                    if (var2 != null) {
                        fullbright var52 = (fullbright)var51;
                        boolean var58 = var52.IU();
                        float var56;
                        if (var58) {
                            var0 <<= 12;
                            var0 &= 1812522065;
                            var0 -= 174334718;
                            var0 ^= 1186222744;
                            Uq var53 = var52.M;
                            float var54 = var53.WM();
                            float var55 = var54 / 100.0F;

                            var0 = switch (var0) {
                                case -112648703 -> var0 ^ -1130583121;
                                default -> var0 ^ 1094167241;
                                case 1729130394 -> {
                                    var0 += -751659052;
                                    yield var0 ^ 183353362;
                                }
                            };
                            int var59 = var0 + 1;
                            var59 = var0 * var59;
                            int var72 = var0 + 2;
                            var59 *= var72;
                            var72 = var0 + 3;
                            var59 *= var72;
                            var59 &= 7;
                            if (var59 != 0) {
                                break label59;
                            }

                            var56 = var55;
                            var0 += -1499125702;
                            var0 += -1154644870;
                            var0 >>= 10;
                            var0 &= 1260195534;
                            var0 ^= -504967739;
                        } else {
                            var0 &= -371182675;
                            var0 *= 232224395;
                            var0 |= 892451352;
                            var0 *= 621002651;
                            var0 ^= 390147579;
                            long var64 = var0;
                            long var4 = var64 + 1L;
                            var4 = var64 * var4;
                            long var65 = var4 & 1L;
                            long var78;
                            int var66 = (var78 = var65 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                            if (var66 != 0) {
                                break label59;
                            }

                            var56 = 0.0F;
                            switch (var0) {
                                case 1431662459:
                                default:
                                    var0 ^= -1308679843;
                                    break;
                                case 1971565583:
                                    var0 >>>= 23;
                                    var0 >>= 6;
                                    var0 ^= -1427976822;
                                    break;
                                case 2001304723:
                                    var0 ^= -262622906;
                            }
                        }

                        long var67 = var0;
                        long var75 = var67 + 1L;
                        var75 = var67 * var75;
                        long var68 = var75 & 1L;
                        long var79;
                        var0 = (var79 = var68 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                        if (var0 == 0) {
                            return var56;
                        }
                    }
                }
            }
        }

        RuntimeException var43 = new RuntimeException();
        throw var43;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2004325522;
        int var2 = Yn.C;
        int var4 = of_2.xF(var3, var1, var2);
        x = var4;
    }
}
