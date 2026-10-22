package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record tc(String m) {
    public static final int M;




    public String message() {
        int var1 = M;
        var1 ^= 1655189843;
        int var2 = System.identityHashCode(this);
        Integer var9 = var2;
        if (var9 == null) {
            var1 -= 1397751831;
            var1 -= 126392137;
            var1 ^= -1007093695;
            int var10 = var1 + 1;
            var10 = var1 * var10;
            var10 &= 1;
            if (var10 == 0) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            } else {
                AssertionError var13 = new AssertionError();
                throw var13;
            }
        } else {
            var1 |= -141957150;
            var1 ^= 1045277708;
            return this.m;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2107405981;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        M = var4;
    }
}
