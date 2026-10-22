package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record GE(String Dv, String Ud) {
    public static final int cz;




    public String label() {
        int var1 = cz;
        var1 ^= 1018395112;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var6 = var16 + 2L;
        var4 *= var6;
        long var17 = var16 + 3L;
        var4 *= var17;
        long var18 = var4 & 7L;
        long var25;
        var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 766978343;
            var1 += 1564561012;
            var1 ^= -920383490;
            Integer var20 = var1;
            if (var20 != null) {
                return this.Dv;
            } else {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            }
        } else {
            var1 += -207279615;
            var1 >>>= 5;
            var1 ^= 1316864925;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public String url() {
        int var1 = cz;
        var1 ^= 317883342;
        int var2 = System.identityHashCode(this);
        long var11 = var2;
        long var4 = var11 + 1L;
        var4 = var11 * var4;
        long var12 = var4 & 1L;
        long var16;
        var2 = (var16 = var12 - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -2065945912;
            var1 ^= -1450684192;
            AssertionError var14 = new AssertionError();
            throw var14;
        } else {
            var1 *= 1547528497;
            var1 ^= -912897821;
            return this.Ud;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1105563108;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        cz = var4;
    }
}
