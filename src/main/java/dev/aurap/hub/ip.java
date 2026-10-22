package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record ip(Entity uH, float oT) {
    public static final int f;




    public Entity target() {
        int var1 = f;
        var1 ^= 268339659;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 == null) {
            long var20 = switch (var1) {
                case -1726699722 -> var1 ^ 1473978980;
                case -664881971 -> {
                    var1 ^= 515693836;
                    var1 += 53031387;
                    var1 >>>= 31;
                    var1 += 1936662451;
                    yield var1 ^ -1939768969;
                }
                default -> var1 ^ -1349118830;
            };
            long var4 = var20 + 1L;
            var4 = var20 * var4;
            long var21 = var4 & 1L;
            long var25;
            int var22 = (var25 = var21 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var22 == 0) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var1 &= -1205694002;
            var1 *= -1397177075;
            var1 *= 848352579;
            var1 >>= 9;
            var1 ^= 157161834;
            Integer var17 = var1;
            if (var17 != null) {
                return this.uH;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public float strength() {
        int var1 = f;
        var1 ^= -144099512;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        int var3 = of_2.c;
        var1 ^= var3;
        var1 ^= 1699975548;
        of_2.c = 1699975548;
        var3 = of_2.Hf;
        var1 ^= var3;
        var1 ^= -1939203149;
        of_2.Hf = -1939203149;
        if (var14 == null) {
            var1 = switch (var1) {
                case 550046286 -> {
                    var1 <<= 23;
                    var1 -= -1230575897;
                    yield var1 ^ -880146568;
                }
                case 877883369 -> var1 ^ -274831512;
                default -> var1 ^ -355505163;
            };
            int var15 = var1 + 1;
            var15 = var1 * var15;
            var15 &= 1;
            if (var15 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        } else {
            var1 ^= 669769522;
            var1 ^= -1200961489;
            return this.oT;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -297016615;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        f = var4;
    }
}
