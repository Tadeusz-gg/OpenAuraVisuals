package dev.aurap.hub;

import dev.skidware.visuals.client.render.FrameContext;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record p_2(FrameContext J) {
    public static final int W;




    public FrameContext frame() {
        int var1 = W;
        var1 ^= -1685762984;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var6 = var22 + 2L;
        var4 *= var6;
        long var23 = var22 + 3L;
        var4 *= var23;
        long var24 = var4 & 7L;
        long var33;
        var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        int var3 = of_2.Ny;
        var1 ^= var3;
        var1 ^= 130860231;
        of_2.Ny = 130860231;
        var3 = of_2.u;
        var1 ^= var3;
        var1 ^= -1719481648;
        of_2.u = -1719481648;
        if (var2 != 0) {
            var1 >>>= 6;
            var1 *= -724624861;
            var1 ^= -20060595;
            UnsupportedOperationException var28 = new UnsupportedOperationException();
            throw var28;
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 1812006274;
                case 1123946723 -> {
                    var1 ^= -1353682350;
                    var1 >>>= 17;
                    var1 >>>= 9;
                    yield var1 ^ -1640220635;
                }
                case 1505568007 -> var1 ^ -591537894;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            } else {
                return this.J;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 46498094;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        W = var4;
    }
}
