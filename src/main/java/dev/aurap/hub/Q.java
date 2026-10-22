package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Q {
    public static final float[] I;
    public static final int RK;

    private Q() {
    }

    private static float[] Fp(int var0) {
        float[] var2 = new float[32768];
        int var1 = var0 ^ 1056119418;
        var1 += -1904145152;
        var1 ^= -1143101494;
        var1 ^= 1074821080;
        Integer var3 = var1;
        if (var3 != null) {
            var2 = var2;
            float[] var53 = new float[3];
            float[] var54 = var53;
            int var4 = 0;
            var4 = var4;

            var1 = switch (var1) {
                default -> var1 ^ -1153001930;
                case -1430173836 -> {
                    var1 += 456003280;
                    yield var1 ^ 1686342511;
                }
                case 729414543 -> var1 ^ -526457985;
            };

            label72:
            while (true) {
                Integer var5 = var1;
                if (var5 == null) {
                    break;
                }

                if (var4 >= 128) {
                    var1 -= 953562618;
                    var1 ^= -2126657661;
                    var1 &= -650896930;
                    var1 |= 2092287841;
                    var1 ^= 511115850;
                    int var55 = var1 + 1;
                    var55 = var1 * var55;
                    var4 = var1 + 2;
                    var55 *= var4;
                    var1 += 3;
                    var55 *= var1;
                    var1 = var55 & 7;
                    if (var1 == 0) {
                        return var2;
                    }
                    break;
                }
                var1 = switch (var1) {
                    case -1586701013 -> {
                        var1 |= 1469265271;
                        var1 -= 1554018521;
                        yield var1 ^ -560208646;
                    }
                    case -117018836 -> var1 ^ -1132242547;
                    default -> var1 ^ 1968216950;
                };
                float var61 = var4;
                var1 *= -54980647;
                var1 <<= 14;
                var1 -= 858371227;
                var1 -= 1536710450;
                var1 ^= 77328527;
                long var6 = var1;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var82;
                int var67 = (var82 = var6 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                if (var67 != 0) {
                    break;
                }

                float var62 = var61 / 127.0F;
                float var63 = var62;
                byte var68 = 0;
                int var69 = var68;

                var1 = switch (var1) {
                    case -606902507 -> var1 ^ -286069525;
                    case -483982148 -> {
                        var1 |= 461953039;
                        var1 *= -1561628455;
                        var1 &= -1460652674;
                        yield var1 ^ -1357751621;
                    }
                    default -> var1 ^ 736874738;
                };

                while (var69 < 256) {
                    var1 ^= 819909154;
                    var1 ^= 631648998;
                    var1 ^= -893789016;
                    Integer var7 = var1;
                    if (var7 == null) {
                        break label72;
                    }

                    int var70 = var4 * 256;
                    var70 += var69;
                    float var74 = var69;
                    var1 -= 1435275392;
                    var1 += -996608179;
                    var1 ^= -1970412918;
                    float var75 = (float) (Math.PI * 2) * var74;
                    float var76 = var75 / 256.0F;
                    float var77 = (float) -Math.PI + var76;
                    int var9 = var1 >>> 5;
                    var9 |= 1048355432;
                    var9 &= 1271234630;
                    var9 ^= -1643551982;
                    float var78 = dS.maxChroma(var63, var77, var54, var9);
                    var2[var70] = var78;
                    var70 = var69 + 1;
                    var69 = var70;
                    var1 *= -686836129;
                    var1 *= -1221833559;
                    var1 += 810475681;
                    var1 ^= -663775024;
                }

                var1 &= 733796081;
                var1 *= -630801589;
                var1 ^= -1984276173;
                var5 = var1;
                if (var5 == null) {
                    break;
                }

                int var65 = var4 + 1;
                var1 -= 1840962191;
                var1 ^= 429074923;
                var1 ^= 2107666594;
                var4 = var65;
                switch (var1) {
                    case -454730683:
                        var1 ^= 49500839;
                        break;
                    case 1455464801:
                    default:
                        var1 ^= -314276564;
                        break;
                    case 1600532784:
                        var1 ^= -1556033224;
                        var1 += 1520659523;
                        var1 ^= -140078752;
                }
            }
        }

        IllegalArgumentException var51 = new IllegalArgumentException();
        throw var51;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 31628395;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        RK = var4;
        float[] var5 = Fp(-59207652);
        I = var5;
    }
}
