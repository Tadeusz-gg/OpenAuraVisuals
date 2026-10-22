package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

public final class UN {
    private static final Map vb;
    public static final int KY;

    private UN() {
    }

    public static void tN(r_2 var0, nv var1) {
        int var2 = KY;
        var2 ^= -747715013;
        int var3 = System.identityHashCode(var0);
        Map var4 = vb;
        Integer var27 = var3;
        int var5 = of_2.c;
        var2 ^= var5;
        var2 ^= 1699975548;
        of_2.c = 1699975548;
        var5 = of_2.KY;
        var2 ^= var5;
        var2 ^= 2130719416;
        of_2.KY = 2130719416;
        if (var27 == null) {
            var2 <<= 13;
            var2 ^= 1811417535;
            long var31 = var2;
            long var7 = var31 + 1L;
            var7 = var31 * var7;
            long var32 = var7 & 1L;
            long var39;
            int var28 = (var39 = var32 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var28 == 0) {
                IllegalArgumentException var29 = new IllegalArgumentException();
                throw var29;
            }
        } else {
            var2 |= -751198015;
            var2 |= -1927987706;
            var2 |= -469120915;
            var2 -= -904405140;
            var2 ^= 235181378;
            long var21 = var2;
            long var33 = var21 + 1L;
            long var34 = var21 * var33;
            long var38 = var21 + 2L;
            long var35 = var34 * var38;
            long var22 = var21 + 3L;
            long var36 = var35 * var22;
            long var23 = var36 & 7L;
            long var40;
            var2 = (var40 = var23 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                Object var26 = var4.put(var0, var1);
                return;
            }
        }

        UnsupportedOperationException var25 = new UnsupportedOperationException();
        throw var25;
    }

    public static nv p(r_2 var0) {
        int var1 = KY;
        var1 ^= -618187972;
        int var2 = System.identityHashCode(var0);
        Map var3 = vb;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        var4 = of_2.c;
        var1 ^= var4;
        var1 ^= 1699975548;
        var4 = of_2.KY;
        var1 ^= var4;
        var1 ^= 2130719416;
        if (var2 == 0) {
            var1 &= -1870747525;
            var1 ^= 432215515;
            var1 ^= -1157230814;
            var1 &= -1900944646;
            var1 ^= 1269983375;
            Object var19 = var3.get(var0);
            return (nv)var19;
        } else {
            var1 -= 889740154;
            var1 ^= 598120200;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1674466377;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        KY = var4;
        IdentityHashMap var5 = new IdentityHashMap();
        Map var6 = Collections.synchronizedMap(var5);
        vb = var6;
    }
}
