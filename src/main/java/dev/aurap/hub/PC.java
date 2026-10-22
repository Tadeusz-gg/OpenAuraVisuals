package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record PC(Entity Ej, Entity La, Entity v, boolean hR) {
    public static final int g;




    public Entity victim() {
        int var1 = g;
        var1 ^= -924058197;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var29;
        var2 = (var29 = var18 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -882943224;
            var1 <<= 3;
            var1 ^= -1629125233;
            long var20 = var1;
            var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var30;
            var2 = (var30 = var22 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.Ej;
            }
        } else {
            var1 ^= 125825213;
            var1 ^= -1087190825;
            Integer var14 = var1;
            if (var14 != null) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    public Entity cause() {
        int var1 = g;
        var1 ^= -299340999;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var30;
        var2 = (var30 = var19 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 *= 165363585;
            var1 ^= 1191404274;
            var1 <<= 7;
            var1 ^= 1853713930;
            long var21 = var1;
            var4 = var21 + 1L;
            var4 = var21 * var4;
            long var22 = var4 & 1L;
            long var31;
            var2 = (var31 = var22 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            var1 ^= 1728052362;
            var1 ^= 278708062;
            Integer var15 = var1;
            if (var15 != null) {
                return this.La;
            }
        }

        IllegalArgumentException var16 = new IllegalArgumentException();
        throw var16;
    }

    public Entity direct() {
        int var1 = g;
        var1 ^= 1458902990;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 >>>= 12;
            var1 >>= 3;
            var1 *= -1281338689;
            var1 |= -1995919172;
            var1 ^= -360938602;
            var19 = var1;
            if (var19 != null) {
                return this.v;
            }
        } else {
            var1 -= 1411492367;
            var1 -= -2059186877;
            var1 <<= 23;
            var1 *= 897029873;
            var1 ^= 915503456;
            int var21 = var1 + 1;
            var21 = var1 * var21;
            int var3 = var1 + 2;
            var21 *= var3;
            var1 += 3;
            var21 *= var1;
            var1 = var21 & 7;
            if (var1 == 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public boolean byLocalPlayer() {
        int var1 = g;
        var1 ^= -506096668;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        if (var20 == null) {
            var20 = switch (var1) {
                case 755841923 -> var1 ^ 58237262;
                default -> var1 ^ 2099401712;
                case 1655683413 -> {
                    var1 += 826243110;
                    var1 <<= 25;
                    yield var1 ^ 512354757;
                }
            };
            if (var20 != null) {
                AssertionError var22 = new AssertionError();
                throw var22;
            }
        } else {
            var1 ^= -1426548391;
            var1 *= 2001634689;
            var1 ^= -378074446;
            var1 ^= -1090075173;
            long var15 = var1;
            long var3 = var15 + 1L;
            var3 = var15 * var3;
            long var5 = var15 + 2L;
            var3 *= var5;
            long var16 = var15 + 3L;
            var3 *= var16;
            long var17 = var3 & 7L;
            long var26;
            var1 = (var26 = var17 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.hR;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 131892700;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        g = var4;
    }
}
