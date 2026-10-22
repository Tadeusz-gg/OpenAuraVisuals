package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class ms extends Exception {
    private final boolean f;
    public static final int Gc;

    public ms(String var1, boolean var2) {
        super(var1);
        this.f = var2;
    }

    public boolean offline() {
        int var1 = Gc;
        var1 ^= -590692984;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 -= -38382442;
            var1 |= -1127209977;
            var1 ^= -388548468;
            var14 = var1;
            if (var14 != null) {
                return this.f;
            }
        } else {
            var1 += -890051815;
            var1 += 704894550;
            var1 ^= -1701684613;
            var1 ^= 2075883517;
            Integer var11 = var1;
            if (var11 != null) {
                AssertionError var13 = new AssertionError();
                throw var13;
            }
        }

        RuntimeException var12 = new RuntimeException();
        throw var12;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1786155852;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Gc = var4;
    }
}
