package dev.aurap.hub;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record T(RenderPhase U, Canvas T, FrameContext RD) {
    public static final int i;




    public RenderPhase phase() {
        int var1 = i;
        var1 ^= -1910536993;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 != null) {
            var1 *= -964097161;
            var1 &= 1210407351;
            var1 |= -534634906;
            var1 ^= 629068604;
            var1 ^= 1654238211;
            return this.U;
        } else {
            var1 *= 2011535305;
            var1 ^= 991933206;
            UnsupportedOperationException var6 = new UnsupportedOperationException();
            throw var6;
        }
    }

    public Canvas canvas() {
        int var1 = i;
        var1 ^= 612402736;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.i;
        var1 ^= var3;
        var1 ^= 563708667;
        var3 = of_2.WX;
        var1 ^= var3;
        var1 ^= 800720127;
        if (var2 == 0) {
            Integer var24 = switch (var1) {
                case -1831454720 -> {
                    var1 ^= -1065881209;
                    var1 |= 1988846445;
                    yield var1 ^ -2021896560;
                }
                default -> var1 ^ 1736967031;
                case 1887482802 -> var1 ^ -574179207;
            };
            if (var24 != null) {
                return this.T;
            }
        } else {
            var1 *= 600889489;
            var1 ^= -307486839;
            var1 |= 790042308;
            var1 ^= -609315326;
            long var17 = var1;
            long var30 = var17 + 1L;
            long var31 = var17 * var30;
            long var18 = var31 & 1L;
            long var32;
            var1 = (var32 = var18 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public FrameContext frame() {
        int var1 = i;
        var1 ^= 2069323776;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var30;
        var2 = (var30 = var22 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        int var3 = of_2.i;
        var1 ^= var3;
        var1 ^= 563708667;
        of_2.i = 563708667;
        var3 = of_2.WX;
        var1 ^= var3;
        var1 ^= 800720127;
        of_2.WX = 800720127;
        if (var2 == 0) {
            var1 ^= -1337417684;
            var1 -= -1917920857;
            var1 <<= 25;
            var1 ^= -2027426653;
            Integer var24 = var1;
            if (var24 == null) {
                IllegalArgumentException var25 = new IllegalArgumentException();
                throw var25;
            } else {
                return this.RD;
            }
        } else {
            var1 += 2065148943;
            var1 ^= 1534676573;
            UnsupportedOperationException var15 = new UnsupportedOperationException();
            throw var15;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -448702073;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        i = var4;
    }
}
