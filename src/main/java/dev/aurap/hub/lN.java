package dev.aurap.hub;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class lN implements Co {
    public static final int kB;

    public lN() {
    }

    @Override
    public String name() {
        int var1 = System.identityHashCode(this);
        return "Spotify";
    }

    @Override
    public FX poll() throws IOException {
        int var1 = kB;
        var1 ^= 961238296;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var32;
        var2 = (var32 = var23 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -1440505732:
                    var1 &= -416030783;
                    var1 ^= -562297738;
                    break;
                case -862473414:
                    var1 ^= -2014700239;
                    break;
                case -432317119:
                default:
                    var1 ^= -935407945;
            }

            IllegalArgumentException var28 = new IllegalArgumentException();
            throw var28;
        } else {
            var1 >>= 19;
            var1 &= -169055242;
            var1 |= -624422622;
            var1 ^= -1911550043;
            var1 ^= -1547941472;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            } else {
                H var27 = H.UNSUPPORTED;
                yq var15 = new yq(var27, "No music player integration for this system");
                throw var15;
            }
        }
    }

    @Override
    public void send(Ar var1) {
        int var2 = System.identityHashCode(this);
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1052160126;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        kB = var4;
    }
}
