package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record AC(FX track, IOException failure, byte[] art) {
    public static final int Zh;




    public FX track() {
        int var1 = Zh;
        var1 ^= 1059605820;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 == null) {
            var1 *= 229819433;
            var1 *= -25519805;
            var1 >>>= 14;
            var1 -= 748710914;
            var1 ^= -250606183;
            RuntimeException var19 = new RuntimeException();
            throw var19;
        } else {
            var1 += -966001198;
            var1 *= -493449577;
            var1 ^= 1543701091;
            long var9 = var1;
            long var3 = var9 + 1L;
            var3 = var9 * var3;
            long var10 = var3 & 1L;
            long var21;
            var1 = (var21 = var10 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.track;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    public IOException failure() {
        int var1 = Zh;
        var1 ^= 854485598;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 != null) {
            var1 ^= -1628872273;
            var1 ^= -1683215312;
            var11 = var1;
            if (var11 != null) {
                return this.failure;
            }
        } else {
            var1 &= 1564982082;
            var1 ^= -1890148098;
            int var13 = var1 + 1;
            var13 = var1 * var13;
            var1 = var13 & 1;
            if (var1 == 0) {
                UnsupportedOperationException var10 = new UnsupportedOperationException();
                throw var10;
            }
        }

        RuntimeException var9 = new RuntimeException();
        throw var9;
    }

    public byte[] art() {
        int var1 = Zh;
        var1 ^= 121162542;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var33;
        var2 = (var33 = var18 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= 1146832914;
            var1 ^= -1536621261;
            long var20 = var1;
            var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var34;
            var2 = (var34 = var22 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.art;
            }
        } else {
            var1 = switch (var1) {
                case -415535499 -> var1 ^ 1220777288;
                default -> var1 ^ 695803219;
                case 1484189335 -> {
                    var1 ^= 1073574846;
                    yield var1 ^ -234343417;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -419750698;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Zh = var4;
    }
}
