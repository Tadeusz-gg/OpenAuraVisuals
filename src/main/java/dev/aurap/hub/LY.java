package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class LY implements nb_2 {
    public static final int u;

    public LY() {
    }

    @Override
    public void Xs(String var1, float var2, float var3, HP var4) {
        int var5 = u;
        var5 ^= -977149949;
        int var6 = System.identityHashCode(this);
        Integer var18 = var6;
        if (var18 != null) {
            switch (var5) {
                case -920125251:
                    var5 ^= 1589040514;
                    break;
                case 493008536:
                    var5 -= 926537526;
                    var5 ^= -1749002495;
                    break;
                case 1700029408:
                default:
                    var5 ^= -145949383;
            }

            i_2.zf(var1, var2, var3, var4);
        } else {
            var5 += 1511786305;
            var5 ^= -201502860;
            var5 ^= 1441843072;
            int var19 = var5 + 1;
            var19 = var5 * var19;
            var5 = var19 & 1;
            if (var5 != 0) {
                AssertionError var13 = new AssertionError();
                throw var13;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2090225339;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        u = var4;
    }
}
