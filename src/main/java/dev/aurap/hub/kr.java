package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.InputUtil.Key;

public class kr implements sx {
    public static final int K;

    public kr() {
    }

    @Override
    public String s(int var1) {
        int var2 = K;
        var2 ^= -382564953;
        int var4 = System.identityHashCode(this);
        int var5 = var2 - -865927334;
        var5 >>= 14;
        var5 >>= 23;
        var5 |= -1131497792;
        var5 ^= 622161675;
        Key var28 = i_2.key(var1, var5);
        Integer var21 = var4;
        if (var21 == null) {
            var2 += 1516815132;
            var2 ^= -161458906;
            long var6 = var1;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var36;
            int var22 = (var36 = var6 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var22 == 0) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var2 *= 1100441241;
            var2 <<= 11;
            var2 ^= 745867667;
            long var16 = var1;
            long var30 = var16 + 1L;
            var30 = var16 * var30;
            long var35 = var16 + 2L;
            var30 *= var35;
            long var17 = var16 + 3L;
            var30 *= var17;
            long var18 = var30 & 7L;
            long var37;
            var2 = (var37 = var18 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var2 == 0) {
                return var28.getTranslationKey();
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    @Override
    public int W(String var1) {
        label40: {
            int var39;
            int var41;
            try {
                var39 = K;
                var39 ^= -324765994;
                Object var40 = null;
                var39 |= -1063807763;
                var39 -= -2134954728;
                var39 ^= 1338670505;
                Key var5 = InputUtil.fromTranslationKey(var1);
                var39 ^= 2093753133;
                var39 ^= 2074914114;
                var39 |= 233407547;
                var39 ^= -2072061357;
                var41 = var5.getCode();
                var39 |= 561860065;
                var39 &= -866662200;
                var39 |= 791350065;
                var39 ^= -1549341381;
            } catch (Throwable var8) {
                var39 = K;
                var39 ^= 2061621269;
                int var6 = (var8 instanceof RuntimeException) ? 1 : 0;
                var39 &= -747881951;
                var39 *= -588463433;
                var39 ^= 1214207819;
                Integer var7 = var39;
                if (var7 != null) {
                    if (var6 == 0) {
                        var39 >>= 26;
                        var39 ^= 1206038152;
                        throw var8;
                    }

                    var39 *= 1371743845;
                    var39 &= -1136335477;
                    var39 ^= 1492474356;
                    RuntimeException var4 = (RuntimeException)var8;

                    var39 = switch (var39) {
                        default -> var39 ^ 1401774141;
                        case -122331780 -> {
                            var39 >>>= 22;
                            var39 *= -1016949883;
                            yield var39 ^ 895356210;
                        }
                        case 207268230 -> var39 ^ 316437980;
                    };
                    int var2 = var39 + 1;
                    var2 = var39 * var2;
                    var6 = var39 + 2;
                    var2 *= var6;
                    var6 = var39 + 3;
                    var2 *= var6;
                    var2 &= 7;
                    if (var2 == 0) {
                        return -1;
                    }
                }
                break label40;
            }

            Integer var13 = var39;
            if (var13 != null) {
                return var41;
            }
        }

        AssertionError var14 = new AssertionError();
        throw var14;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -458557049;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        K = var4;
    }
}
