package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.LivingEntity;

public record KillEvent(LivingEntity gR, int ju) {
    public static final int lA;




    public LivingEntity victim() {
        int var1 = lA;
        var1 ^= -271841111;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 &= -1379594624;
            var1 ^= -1112918869;
            int var13 = var1 + 1;
            var13 = var1 * var13;
            var13 &= 1;
            if (var13 == 0) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        } else {
            var1 &= 237046357;
            var1 <<= 2;
            var1 |= 194462573;
            var1 ^= -1018201680;
            Integer var10 = var1;
            if (var10 != null) {
                return this.gR;
            }
        }

        RuntimeException var11 = new RuntimeException();
        throw var11;
    }

    public int combo() {
        int var1 = lA;
        var1 ^= -457516298;
        int var2 = System.identityHashCode(this);
        Integer var26 = var2;
        if (var26 != null) {
            switch (var1) {
                case -841212520:
                    var1 ^= -792399844;
                    break;
                case 99190977:
                    var1 -= 978638632;
                    var1 &= 1386573368;
                    var1 *= -1254889473;
                    var1 -= 720407904;
                    var1 ^= 840791913;
                    break;
                case 1269364690:
                default:
                    var1 ^= -452678196;
            }

            return this.ju;
        } else {
            var1 |= -1188451508;
            var1 -= -605651858;
            var1 ^= 1242314231;
            var1 |= -402237976;
            var1 ^= 50698094;
            long var13 = var1;
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var5 = var13 + 2L;
            var3 *= var5;
            long var14 = var13 + 3L;
            var3 *= var14;
            long var15 = var3 & 7L;
            long var30;
            var1 = (var30 = var15 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 != 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 640702379;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        lA = var4;
    }
}
