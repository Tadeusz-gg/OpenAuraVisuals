package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class VA {
    public float aM = 4.0F;
    public float tJ = 2.0F;
    public float et = 1.0F;
    public boolean o;
    public float ea;
    public static final int r;

    public VA() {
    }

    public VA E(float var1, float var2, float var3, boolean var4, float var5) {
        int var6 = r;
        var6 ^= -761848312;
        int var7 = System.identityHashCode(this);
        this.aM = var1;
        long var30 = var7;
        long var9 = var30 + 1L;
        var9 = var30 * var9;
        long var11 = var30 + 2L;
        var9 *= var11;
        long var31 = var30 + 3L;
        var9 *= var31;
        long var32 = var9 & 7L;
        long var50;
        var7 = (var50 = var32 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
        int var8 = of_2.I;
        var6 ^= var8;
        var6 ^= 1186804733;
        of_2.I = 1186804733;
        var8 = of_2.lS;
        var6 ^= var8;
        var6 ^= -1057346160;
        of_2.lS = -1057346160;
        if (var7 != 0) {
            var6 += 1137529278;
            var6 *= 668574247;
            var6 ^= -1458561172;
            long var34 = var6;
            var9 = var34 + 1L;
            var9 = var34 * var9;
            var11 = var34 + 2L;
            var9 *= var11;
            long var35 = var34 + 3L;
            var9 *= var35;
            long var36 = var9 & 7L;
            long var51;
            var7 = (var51 = var36 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
            if (var7 == 0) {
                RuntimeException var38 = new RuntimeException();
                throw var38;
            }
        } else {
            long var26 = switch (var6) {
                case -906101298 -> {
                    var6 -= 1697285606;
                    var6 += 1273626489;
                    var6 *= -642806501;
                    var6 ^= 392920091;
                    yield var6 ^ 840558119;
                }
                default -> var6 ^ 39969629;
                case 1827977365 -> var6 ^ -1615228499;
            };
            long var40 = var26 + 1L;
            long var41 = var26 * var40;
            long var27 = var41 & 1L;
            long var52;
            var6 = (var52 = var27 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
            if (var6 == 0) {
                this.tJ = var2;
                this.et = var3;
                this.o = var4;
                this.ea = var5;
                return this;
            }
        }

        IllegalStateException var29 = new IllegalStateException();
        throw var29;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 352109212;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        r = var4;
    }
}
