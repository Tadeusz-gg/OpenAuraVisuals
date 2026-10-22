package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum q_2 implements oF {
    MINIMAL("Cover & Waveform"),
    TITLE("Title"),
    LYRICS("Lyrics");

    private final String C;
    public static final int vT;

    private q_2(String var3) {
        this.C = var3;
    }

    @Override
    public String displayName() {
        int var1 = vT;
        var1 ^= -2005173331;
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
        if (var2 == 0) {
            var1 *= -395464491;
            var1 ^= 1697903559;
            var1 ^= 107519990;
            var1 ^= -431097343;
            return this.C;
        } else {
            var1 += 431011408;
            var1 += 48867093;
            var1 &= 1940468783;
            var1 &= 587976241;
            var1 ^= 2134439560;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            } else {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2054986694;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        vT = var4;
    }
}
