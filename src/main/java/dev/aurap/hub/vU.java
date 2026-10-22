package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum vU implements oF {
    COVER("Cover"),
    THEME("Theme");

    private final String rg;
    public static final int X;

    private vU(String var3) {
        this.rg = var3;
    }

    @Override
    public String displayName() {
        int var1 = X;
        var1 ^= 1465617581;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= -2020680647;
            var1 *= -223309833;
            var1 >>>= 12;
            var1 ^= 1959198102;
            return this.rg;
        } else {
            long var11 = switch (var1) {
                default -> var1 ^ -199625362;
                case -192153188 -> var1 ^ 768367735;
                case 1024347490 -> {
                    var1 &= 1895967097;
                    var1 &= -934629309;
                    var1 -= -1847982398;
                    var1 *= -1887801025;
                    yield var1 ^ -969805508;
                }
            };
            long var25 = var11 + 1L;
            long var26 = var11 * var25;
            long var12 = var26 & 1L;
            long var27;
            var1 = (var27 = var12 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 != 0) {
                AssertionError var15 = new AssertionError();
                throw var15;
            } else {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 554455330;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        X = var4;
    }
}
