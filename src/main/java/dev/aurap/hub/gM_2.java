package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record gM_2(long pz, long Q, long kA, long ao) {
    public static final gM_2 DEFAULT;
    public static final int GM;




    public long playingMs() {
        int var1 = GM;
        var1 ^= 368264136;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 |= 55383936;
            var1 ^= 642324874;
            return this.pz;
        } else {
            var1 -= 1396730688;
            var1 -= -1647114065;
            var1 ^= 1062576311;
            Integer var8 = var1;
            if (var8 == null) {
                UnsupportedOperationException var10 = new UnsupportedOperationException();
                throw var10;
            } else {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            }
        }
    }

    public long pausedMs() {
        int var1 = GM;
        var1 ^= -1045915600;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var35;
        var2 = (var35 = var22 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -216680730;
            var1 += 1133627976;
            var1 ^= 1599446459;
            var1 >>>= 17;
            var1 ^= -1514342925;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var25 = var4 & 1L;
            long var36;
            var2 = (var36 = var25 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        } else {
            var1 ^= 1072165622;
            var1 >>>= 22;
            var1 |= 2011749849;
            var1 ^= 1145305708;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.Q;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public long idleMs() {
        int var1 = GM;
        var1 ^= -744229445;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var30;
        var2 = (var30 = var23 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 == 0) {
            Integer var25 = switch (var1) {
                case -1142248800 -> {
                    var1 += 720429196;
                    var1 <<= 3;
                    var1 ^= -916960687;
                    var1 += 1697710249;
                    yield var1 ^ 805929773;
                }
                case -854675419 -> var1 ^ -1626234015;
                default -> var1 ^ 1597327090;
            };
            if (var25 != null) {
                return this.kA;
            } else {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            switch (var1) {
                case -1142248800:
                    var1 -= -2115636943;
                    var1 ^= 2122814274;
                    var1 -= -971349952;
                    var1 ^= 1685302176;
                    break;
                case -252448037:
                default:
                    var1 ^= -927669518;
                    break;
                case 1677664769:
                    var1 ^= -1935160869;
            }

            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        }
    }

    public long errorMaxMs() {
        int var1 = GM;
        var1 ^= -174692512;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var6 = var16 + 2L;
        var4 *= var6;
        long var17 = var16 + 3L;
        var4 *= var17;
        long var18 = var4 & 7L;
        long var29;
        var2 = (var29 = var18 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= 1629406346;
            var1 ^= 36770406;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.ao;
            }
        } else {
            var1 -= -1425474435;
            var1 ^= 2142925687;
            Integer var13 = var1;
            if (var13 != null) {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }

        IllegalStateException var14 = new IllegalStateException();
        throw var14;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1270060870;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        GM = var4;
        gM_2 var5 = new gM_2(1000L, 1500L, 3000L, 15000L);
        DEFAULT = var5;
    }
}
