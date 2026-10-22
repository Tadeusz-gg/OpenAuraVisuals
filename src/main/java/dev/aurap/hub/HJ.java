package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record HJ(FX track, IOException failure) {
    public static final int hD;




    public FX track() {
        int var1 = hD;
        var1 ^= 438959010;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 == null) {
            var1 *= -1850101131;
            var1 -= -467684724;
            var1 |= -681596992;
            var1 *= 455073829;
            var1 ^= 934677028;
            AssertionError var19 = new AssertionError();
            throw var19;
        } else {
            var1 -= 1536933105;
            var1 &= -1325014427;
            var1 *= 823820979;
            var1 ^= 1027930204;
            var1 ^= 279524927;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            var1 = var17 & 1;
            if (var1 != 0) {
                UnsupportedOperationException var10 = new UnsupportedOperationException();
                throw var10;
            } else {
                return this.track;
            }
        }
    }

    public IOException failure() {
        int var1 = hD;
        var1 ^= 1902382850;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            switch (var1) {
                case -1078833518:
                    var1 ^= -977795921;
                    break;
                case 133297093:
                    var1 *= -1022392767;
                    var1 &= 470547950;
                    var1 ^= -2006304461;
                    break;
                case 203334963:
                default:
                    var1 ^= -921196472;
            }

            UnsupportedOperationException var13 = new UnsupportedOperationException();
            throw var13;
        } else {
            var1 -= 479344476;
            var1 += -1287484141;
            var1 ^= -418066346;
            return this.failure;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 458412002;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        hD = var4;
    }
}
