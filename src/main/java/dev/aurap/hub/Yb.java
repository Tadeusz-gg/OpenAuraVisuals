package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record Yb(Entity O, boolean LI) {
    public static final int Hz;




    public Entity target() {
        int var1 = Hz;
        var1 ^= 1114467212;
        int var2 = System.identityHashCode(this);
        Integer var21 = var2;
        if (var21 == null) {
            var1 >>= 14;
            var1 ^= -453732470;
            var1 ^= -509350834;
            var21 = var1;
            if (var21 != null) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var1 |= -283228153;
            var1 ^= 2067500454;
            var1 &= 1744001852;
            var1 >>>= 21;
            var1 ^= -1294887689;
            long var16 = var1;
            long var3 = var16 + 1L;
            var3 = var16 * var3;
            long var5 = var16 + 2L;
            var3 *= var5;
            long var17 = var16 + 3L;
            var3 *= var17;
            long var18 = var3 & 7L;
            long var27;
            var1 = (var27 = var18 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.O;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public boolean magic() {
        int var1 = Hz;
        var1 ^= 756953283;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 == null) {
            var11 = switch (var1) {
                case -803937852 -> {
                    var1 >>>= 28;
                    yield var1 ^ 1738935018;
                }
                case 559581095 -> var1 ^ 969529774;
                default -> var1 ^ 1237215224;
            };
            if (var11 != null) {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            }
        } else {
            var1 ^= -1396604488;
            var1 |= -1306374870;
            var1 ^= 1235628213;
            Integer var9 = var1;
            if (var9 != null) {
                return this.LI;
            }
        }

        UnsupportedOperationException var10 = new UnsupportedOperationException();
        throw var10;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 2117678100;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        Hz = var4;
    }
}
