package dev.aurap.hub;

import dev.skidware.visuals.render.image.RgbaImage;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record R(String key, RgbaImage[] mips, int accent) {
    public static final int pN;




    public String key() {
        int var1 = pN;
        var1 ^= 782568104;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            Integer var18 = switch (var1) {
                case -718795481 -> {
                    var1 -= 532359191;
                    var1 -= 1092472956;
                    yield var1 ^ 434966231;
                }
                case 497191120 -> var1 ^ -1572520460;
                default -> var1 ^ -553970968;
            };
            if (var18 != null) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            }
        } else {
            var1 *= 1414134667;
            var1 >>= 28;
            var1 <<= 3;
            var1 ^= 2138767221;
            long var13 = var1;
            long var21 = var13 + 1L;
            long var22 = var13 * var21;
            long var14 = var22 & 1L;
            long var23;
            var1 = (var23 = var14 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.key;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    public RgbaImage[] mips() {
        int var1 = pN;
        var1 ^= -1771842870;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 == null) {
            var1 &= -1549582258;
            var1 ^= 603936959;
            var1 *= -1143657755;
            var1 ^= 195118612;
            RuntimeException var17 = new RuntimeException();
            throw var17;
        } else {
            var1 <<= 17;
            var1 ^= 925532781;
            long var8 = var1;
            long var3 = var8 + 1L;
            var3 = var8 * var3;
            long var9 = var3 & 1L;
            long var19;
            var1 = (var19 = var9 - 0L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
            if (var1 != 0) {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            } else {
                return this.mips;
            }
        }
    }

    public int accent() {
        int var1 = pN;
        var1 ^= -1167397829;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 ^= -1064944602;
            var1 -= 2126990516;
            var1 ^= 1976030589;
            var1 |= -2073890640;
            var1 ^= 411323163;
            return this.accent;
        } else {
            var1 |= 1474286248;
            var1 |= -952700952;
            var1 += -1399286480;
            var1 ^= -1901795409;
            IllegalArgumentException var10 = new IllegalArgumentException();
            throw var10;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1058889706;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        pN = var4;
    }
}
