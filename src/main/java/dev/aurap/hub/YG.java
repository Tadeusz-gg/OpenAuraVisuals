package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record YG(String tV, byte[] GZ) {
    public static final int Tj;




    public String key() {
        int var1 = Tj;
        var1 ^= -1027136224;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 != null) {
            var1 ^= 1021863422;
            var1 ^= -898825937;
            var1 ^= 1954135143;
            return this.tV;
        } else {
            var1 &= 1696328483;
            var1 += 48459479;
            var1 *= -1761495585;
            var1 |= -1436604029;
            var1 ^= -448179671;
            Integer var9 = var1;
            if (var9 == null) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            }
        }
    }

    public byte[] bytes() {
        int var1 = Tj;
        var1 ^= 1694164768;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            var1 -= -1642725140;
            var1 -= 1940222593;
            var1 ^= 1147573869;
            var1 |= 655582608;
            var1 ^= 1785114752;
            return this.GZ;
        } else {
            var1 *= 1130979107;
            var1 ^= -453076666;
            int var15 = var1 + 1;
            var15 = var1 * var15;
            var1 = var15 & 1;
            if (var1 != 0) {
                IllegalArgumentException var8 = new IllegalArgumentException();
                throw var8;
            } else {
                AssertionError var7 = new AssertionError();
                throw var7;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1348960656;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Tj = var4;
    }
}
