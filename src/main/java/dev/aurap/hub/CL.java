package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record CL(int priority, wD listener) {
    public static final int fN;




    public int priority() {
        int var1 = fN;
        var1 ^= -418190258;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 *= 1761970437;
            var1 ^= 1023836748;
            long var17 = var1;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var6 = var17 + 2L;
            var4 *= var6;
            long var18 = var17 + 3L;
            var4 *= var18;
            long var19 = var4 & 7L;
            long var26;
            var2 = (var26 = var19 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        } else {
            var1 -= 2049495058;
            var1 += -1951948108;
            var1 ^= -684409924;
            Integer var14 = var1;
            if (var14 != null) {
                return this.priority;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public wD listener() {
        int var1 = fN;
        var1 ^= 1801497996;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 = switch (var1) {
                case -1710999430 -> {
                    var1 -= -1841163506;
                    var1 ^= 225433873;
                    yield var1 ^ 748781900;
                }
                case -552872307 -> var1 ^ -472899007;
                default -> var1 ^ 646422355;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        } else {
            var1 *= -1596202939;
            var1 >>>= 22;
            var1 ^= 1550095113;
            var1 -= 1566418936;
            var1 ^= -733132706;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.listener;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1906241350;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        fN = var4;
    }
}
