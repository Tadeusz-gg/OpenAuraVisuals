package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public abstract class CancellableEvent implements Cancellable {
    private boolean Vb;
    public static final int E;

    public CancellableEvent() {
    }

    @Override
    public boolean v() {
        int var1 = E;
        var1 ^= 1128874185;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 += -290150760;
            var1 *= 902297741;
            var1 <<= 29;
            var1 -= 1166566288;
            var1 ^= 782331293;
            return this.Vb;
        } else {
            var1 -= 1372759880;
            var1 ^= -839465529;
            var1 -= 1515545286;
            var1 ^= -170617980;
            Integer var10 = var1;
            if (var10 == null) {
                UnsupportedOperationException var12 = new UnsupportedOperationException();
                throw var12;
            } else {
                AssertionError var11 = new AssertionError();
                throw var11;
            }
        }
    }

    @Override
    public void fa(boolean var1) {
        int var2 = E;
        var2 ^= 1501953522;
        int var3 = System.identityHashCode(this);
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var7 = var19 + 2L;
        var5 *= var7;
        long var20 = var19 + 3L;
        var5 *= var20;
        long var21 = var5 & 7L;
        long var33;
        var3 = (var33 = var21 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 |= 1018580120;
            var2 &= -1914127534;
            var2 ^= -975394612;
            var2 ^= -435475394;
            long var23 = var2;
            var5 = var23 + 1L;
            var5 = var23 * var5;
            long var24 = var5 & 1L;
            long var34;
            var3 = (var34 = var24 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var3 == 0) {
                RuntimeException var27 = new RuntimeException();
                throw var27;
            } else {
                UnsupportedOperationException var26 = new UnsupportedOperationException();
                throw var26;
            }
        } else {
            var2 -= -1862341637;
            var2 += 1208757590;
            var2 ^= 1336924329;
            var2 >>= 28;
            var2 ^= -2064838652;
            this.Vb = var1;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1373859832;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        E = var4;
    }
}
