package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record GN(Entity yY) {
    public static final int k;




    public Entity entity() {
        int var1 = k;
        var1 ^= 1848498080;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        int var3 = of_2.c;
        var1 ^= var3;
        var1 ^= 1699975548;
        var3 = of_2.Po;
        var1 ^= var3;
        var1 ^= 153549896;
        if (var18 != null) {
            var1 = switch (var1) {
                default -> var1 ^ 669175612;
                case 1560891298 -> var1 ^ -564415800;
                case 1769291127 -> {
                    var1 -= -1362780906;
                    var1 >>>= 16;
                    var1 *= 200873501;
                    yield var1 ^ 1619013360;
                }
            };
            int var19 = var1 + 1;
            var19 = var1 * var19;
            var19 &= 1;
            if (var19 == 0) {
                return this.yY;
            }
        } else {
            var1 += 536653224;
            var1 ^= 959551040;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            var1 = var22 & 1;
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
        int var1 = 521826818;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        k = var4;
    }
}
