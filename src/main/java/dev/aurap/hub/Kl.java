package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class Kl extends zB {
    private final String my;
    public static final int J;

    public Kl(String var1) {
        this.my = var1;
    }

    public String P() {
        int var1 = J;
        var1 ^= 713829539;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case 625601348:
                default:
                    var1 ^= -1756887637;
                    break;
                case 732629526:
                    var1 &= 2079295530;
                    var1 >>>= 5;
                    var1 ^= -553924309;
                    break;
                case 1934854314:
                    var1 ^= 126821984;
            }

            return this.my;
        } else {
            var1 &= 1815716591;
            var1 *= 2061966595;
            var1 ^= -495831393;
            IllegalStateException var8 = new IllegalStateException();
            throw var8;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 940888462;
        int var2 = zB.E;
        int var4 = of_2.ro(var3, var1, var2);
        J = var4;
    }
}
