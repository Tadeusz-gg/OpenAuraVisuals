package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record o_2(Entity g, float Q) {
    public static final int F;




    public Entity target() {
        int var1 = F;
        var1 ^= 1714077720;
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
            Integer var20 = switch (var1) {
                case -1783696713 -> var1 ^ -1657816907;
                default -> var1 ^ -1316817887;
                case 1303013855 -> {
                    var1 -= 1563526347;
                    yield var1 ^ -1517389976;
                }
            };
            if (var20 == null) {
                AssertionError var21 = new AssertionError();
                throw var21;
            } else {
                return this.g;
            }
        } else {
            var1 ^= -711823556;
            var1 |= -532064950;
            var1 ^= 19688973;
            var1 ^= 1653590485;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    public float attackStrength() {
        int var1 = F;
        var1 ^= 991249856;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var29;
        var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -2090408582:
                    var1 ^= -1585803385;
                    break;
                case 278260743:
                    var1 |= 530098934;
                    var1 ^= -1613177217;
                    var1 ^= 85704682;
                    break;
                case 1615722602:
                default:
                    var1 ^= -2066843374;
            }

            IllegalArgumentException var24 = new IllegalArgumentException();
            throw var24;
        } else {
            var1 ^= 1434839033;
            var1 ^= 1880485597;
            long var11 = var1;
            long var3 = var11 + 1L;
            var3 = var11 * var3;
            long var12 = var3 & 1L;
            long var30;
            var1 = (var30 = var12 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.Q;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 126944946;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        F = var4;
    }
}
