package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public record mQ(String fs, List<Yn> h) {
    public static final int OF;




    public String code() {
        int var1 = OF;
        var1 ^= 1563314192;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        int var3 = of_2.fY;
        var1 ^= var3;
        var1 ^= -870294130;
        var3 = of_2.e;
        var1 ^= var3;
        var1 ^= -811273439;
        if (var16 == null) {
            var1 &= -811537379;
            var1 ^= 1926072141;
            RuntimeException var17 = new RuntimeException();
            throw var17;
        } else {
            var1 *= -668731451;
            var1 -= 895988197;
            var1 ^= -486256523;
            Integer var12 = var1;
            if (var12 == null) {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            } else {
                return this.fs;
            }
        }
    }

    public List changed() {
        int var1 = OF;
        var1 ^= 131817794;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var28;
        var2 = (var28 = var22 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        int var3 = of_2.fY;
        var1 ^= var3;
        var1 ^= -870294130;
        of_2.fY = -870294130;
        var3 = of_2.e;
        var1 ^= var3;
        var1 ^= -811273439;
        of_2.e = -811273439;
        if (var2 == 0) {
            var1 ^= 589114081;
            var1 ^= 1074411157;
            var1 ^= -1664803621;
            return this.h;
        } else {
            var1 += -1539710853;
            var1 ^= -613799133;
            long var13 = var1;
            long var25 = var13 + 1L;
            long var26 = var13 * var25;
            long var14 = var26 & 1L;
            long var29;
            var1 = (var29 = var14 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            } else {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1447769451;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        OF = var4;
    }
}
