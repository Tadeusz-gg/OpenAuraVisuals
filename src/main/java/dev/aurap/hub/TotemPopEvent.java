package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record TotemPopEvent(Entity bV) {
    public static final int C;




    public Entity entity() {
        int var1 = C;
        var1 ^= -935942468;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.Ny;
        var1 ^= var3;
        var1 ^= 130860231;
        var3 = of_2.u;
        var1 ^= var3;
        var1 ^= -1719481648;
        if (var2 != 0) {
            switch (var1) {
                case -412236225:
                    var1 ^= -266639404;
                    var1 *= 1870294283;
                    var1 <<= 29;
                    var1 ^= -1233895559;
                    break;
                case 864952766:
                default:
                    var1 ^= 838495672;
                    break;
                case 1738247052:
                    var1 ^= -121869308;
            }

            AssertionError var27 = new AssertionError();
            throw var27;
        } else {
            long var15 = switch (var1) {
                default -> var1 ^ 310831596;
                case -412236225 -> {
                    var1 *= -1621662925;
                    var1 ^= -2039138991;
                    var1 &= 1691531844;
                    var1 *= 1307733955;
                    yield var1 ^ 1655218857;
                }
                case 529290775 -> var1 ^ -558339224;
            };
            long var33 = var15 + 1L;
            long var34 = var15 * var33;
            long var16 = var34 & 1L;
            long var35;
            var1 = (var35 = var16 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.bV;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 434853912;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        C = var4;
    }
}
