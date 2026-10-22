package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record X(Entity gI) {
    public static final int l;




    public Entity entity() {
        int var1 = l;
        var1 ^= 722945969;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 &= -1433433674;
            var1 &= -842614986;
            var1 ^= 1026612870;
            var18 = var1;
            if (var18 != null) {
                return this.gI;
            }
        } else {
            var1 -= -1427615631;
            var1 -= -549805572;
            var1 ^= -915587412;
            var1 ^= 1409047984;
            long var13 = var1;
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var14 = var3 & 1L;
            long var21;
            var1 = (var21 = var14 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -748058771;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        l = var4;
    }
}
