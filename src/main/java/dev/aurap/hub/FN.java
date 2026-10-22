package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record FN(int yQ, String em, String ZZ) {
    public static final int ub;




    public int exitCode() {
        int var1 = ub;
        var1 ^= 995767147;
        int var2 = System.identityHashCode(this);
        long var23 = var2;
        long var4 = var23 + 1L;
        var4 = var23 * var4;
        long var6 = var23 + 2L;
        var4 *= var6;
        long var24 = var23 + 3L;
        var4 *= var24;
        long var25 = var4 & 7L;
        long var40;
        var2 = (var40 = var25 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        int var3 = of_2.Kx;
        var1 ^= var3;
        var1 ^= -194859278;
        var3 = of_2.pM;
        var1 ^= var3;
        var1 ^= -1511944105;
        if (var2 != 0) {
            var1 <<= 19;
            var1 -= -1222741866;
            var1 &= 443860895;
            var1 ^= 19645212;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                RuntimeException var33 = new RuntimeException();
                throw var33;
            } else {
                IllegalArgumentException var32 = new IllegalArgumentException();
                throw var32;
            }
        } else {
            switch (var1) {
                case -1610332670:
                    var1 -= 1995759169;
                    var1 *= -2104394661;
                    var1 ^= 1781452444;
                    var1 ^= -2066586314;
                    break;
                case -1265546542:
                default:
                    var1 ^= -260259550;
                    break;
                case -416214637:
                    var1 ^= 1861688837;
            }

            return this.yQ;
        }
    }

    public String stdout() {
        int var1 = ub;
        var1 ^= -1305824724;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= 2042361973;
            var1 |= -1254897041;
            var1 |= -201446420;
            var1 ^= 661956110;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            } else {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            var1 >>= 15;
            var1 &= 120297303;
            var1 ^= 88182308;
            return this.em;
        }
    }

    public String stderr() {
        int var1 = ub;
        var1 ^= 1833133534;
        int var2 = System.identityHashCode(this);
        Integer var10 = var2;
        if (var10 == null) {
            var10 = switch (var1) {
                case -165867337 -> {
                    var1 |= 1756819309;
                    var1 *= -375262789;
                    var1 &= 908553954;
                    yield var1 ^ -1836934852;
                }
                default -> var1 ^ 1228094702;
                case 596378889 -> var1 ^ -183713720;
            };
            if (var10 == null) {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            } else {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            }
        } else {
            var1 += -253645304;
            var1 ^= 1786829847;
            return this.ZZ;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 325115797;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ub = var4;
    }
}
