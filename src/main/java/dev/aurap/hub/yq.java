package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class yq extends IOException {
    private final H mR;
    public static final int hz;

    public yq(H var1, String var2) {
        super(var2);
        this.mR = var1;
    }

    public H reason() {
        int var1 = hz;
        var1 ^= 992593457;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case 929031977:
                    var1 ^= 1155574557;
                    break;
                case 1539856406:
                    var1 += 810964792;
                    var1 &= -2124129795;
                    var1 *= 1936951997;
                    var1 ^= 603819946;
                    break;
                case 2016668008:
                default:
                    var1 ^= -91577475;
            }

            RuntimeException var23 = new RuntimeException();
            throw var23;
        } else {
            switch (var1) {
                case 390982381:
                    var1 ^= -540379537;
                    break;
                case 1539856406:
                    var1 *= -370924981;
                    var1 ^= 279352005;
                    break;
                case 1666605733:
                default:
                    var1 ^= -959917830;
            }

            return this.mR;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1866567262;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        hz = var4;
    }
}
