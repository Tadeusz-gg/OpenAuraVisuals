package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Be {
    NONE(),
    HORIZONTAL(),
    QUAD(),
    STAR();

    public static final int nP;

    private Be() {
    }

    public Be next() {
        int var1 = nP;
        var1 ^= 1945750062;
        int var2 = System.identityHashCode(this);
        Be[] var3 = values();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var36;
        var2 = (var36 = var4 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 2056803337;
            var1 ^= -696456617;
            var1 ^= -1838816384;
            var1 *= 485074463;
            var1 ^= 1766383100;
            Integer var28 = var1;
            if (var28 != null) {
                RuntimeException var30 = new RuntimeException();
                throw var30;
            } else {
                IllegalArgumentException var29 = new IllegalArgumentException();
                throw var29;
            }
        } else {
            switch (var1) {
                case -1791227284:
                default:
                    var1 ^= -1385844123;
                    break;
                case -1063450110:
                    var1 ^= -1821770900;
                    break;
                case 1160041228:
                    var1 &= 1287397387;
                    var1 += -218249757;
                    var1 ^= -871064698;
                    var1 ^= 1147097002;
            }

            var1 = this.ordinal();
            var1++;
            Be[] var26 = values();
            var2 = var26.length;
            var1 %= var2;
            return var3[var1];
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1763048374;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        nP = var4;
    }
}
