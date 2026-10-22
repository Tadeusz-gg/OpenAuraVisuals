package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ik {
    private final Map D;
    public static final int B;

    public ik() {
        LinkedHashMap var1 = new LinkedHashMap();
        this.D = var1;
    }

    public ik LQ(String var1, LH var2) {
        int var3 = B;
        var3 ^= -1436951118;
        int var4 = System.identityHashCode(this);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var4 += 3;
        var5 *= var4;
        var4 = var5 & 7;
        if (var4 != 0) {
            var3 -= 1658592873;
            var3 += 460958158;
            var3 -= -46048023;
            var3 <<= 11;
            var3 ^= -2104760481;
            Integer var22 = var3;
            if (var22 != null) {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            }
        } else {
            var3 -= 1364187851;
            var3 <<= 3;
            var3 ^= 266765389;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 == 0) {
                Map var18 = this.D;
                Object var19 = var18.put(var1, var2);
                return this;
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    public dZ_2 z() {
        int var1 = B;
        var1 ^= 1292246210;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 -= 953378128;
            var1 ^= 89173142;
            var1 &= 885250510;
            var1 ^= -1987285652;
            RuntimeException var18 = new RuntimeException();
            throw var18;
        } else {
            var1 >>= 29;
            var1 *= -2052975275;
            var1 |= 1892670943;
            var1 -= 1291453787;
            var1 ^= 2075733386;
            Map var17 = this.D;
            return new dZ_2(var17);
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2064499983;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        B = var4;
    }
}
