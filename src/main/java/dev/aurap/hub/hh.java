package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class hh extends Exception {
    private static final long Y = 1L;
    private final Py h;
    private final long J;
    public static final int Ut;

    public hh(Py var1, String var2) {
        this(var1, var2, 0L);
    }

    public hh(Py var1, String var2, long var3) {
        super(var2);
        this.h = var1;
        long var5 = Math.max(0L, var3);
        this.J = var5;
    }

    public hh(Py var1, String var2, Throwable var3) {
        super(var2, var3);
        this.h = var1;
        this.J = 0L;
    }

    public Py code() {
        int var1 = Ut;
        var1 ^= -580780731;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.fY;
        var1 ^= var3;
        var1 ^= -870294130;
        var3 = of_2.dy;
        var1 ^= var3;
        var1 ^= -1713622799;
        if (var2 != 0) {
            var1 ^= 287661865;
            var1 -= -364064348;
            var1 *= -1295965207;
            var1 += 1550505161;
            var1 ^= -1944020012;
            UnsupportedOperationException var19 = new UnsupportedOperationException();
            throw var19;
        } else {
            var1 += 129058770;
            var1 ^= -448160474;
            var1 *= -617316817;
            var1 ^= -1545896821;
            return this.h;
        }
    }

    public fy recovery() {
        int var1 = Ut;
        var1 ^= -1383913032;
        int var2 = System.identityHashCode(this);
        Py var3 = this.h;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 != 0) {
            var1 &= -696355176;
            var1 >>= 8;
            var1 &= 1819320669;
            var1 ^= 1221568800;
            long var27 = var1;
            long var6 = var27 + 1L;
            var6 = var27 * var6;
            long var28 = var6 & 1L;
            long var30;
            var2 = (var30 = var28 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var23 = new UnsupportedOperationException();
                throw var23;
            }
        } else {
            var1 &= 1606381836;
            var1 &= 1518934531;
            var1 *= -744075989;
            var1 *= 1206341117;
            var1 ^= -918701431;
            Integer var18 = var1;
            if (var18 != null) {
                return var3.recovery();
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public long retryAfterMillis() {
        int var1 = Ut;
        var1 ^= 312144449;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            switch (var1) {
                case -1665140639:
                    var1 ^= -70359006;
                    break;
                case -687457616:
                default:
                    var1 ^= -1465894255;
                    break;
                case -182762305:
                    var1 &= -1259881503;
                    var1 ^= -701260242;
            }

            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        } else {
            long var8 = switch (var1) {
                case -182762305 -> {
                    var1 *= -1327432781;
                    yield var1 ^ -1545709245;
                }
                default -> var1 ^ -1033387875;
                case 662525394 -> var1 ^ -1249371355;
            };
            long var22 = var8 + 1L;
            long var23 = var8 * var22;
            long var9 = var23 & 1L;
            long var24;
            var1 = (var24 = var9 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.J;
            } else {
                AssertionError var11 = new AssertionError();
                throw var11;
            }
        }
    }

    public static hh ug(String var0) {
        int var1 = Ut;
        var1 ^= -951347648;
        int var2 = System.identityHashCode(var0);
        Integer var16 = var2;
        int var3 = of_2.fY;
        var1 ^= var3;
        var1 ^= -870294130;
        of_2.fY = -870294130;
        var3 = of_2.dy;
        var1 ^= var3;
        var1 ^= -1713622799;
        of_2.dy = -1713622799;
        if (var16 == null) {
            long var18 = switch (var1) {
                case -1176211214 -> var1 ^ -2071589928;
                case 550117566 -> {
                    var1 ^= -1204077201;
                    var1 ^= -1647668796;
                    yield var1 ^ 558659141;
                }
                default -> var1 ^ -671556716;
            };
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var25;
            int var20 = (var25 = var19 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var20 != 0) {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            } else {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            }
        } else {
            var1 &= -2101672561;
            var1 ^= 1979181576;
            Py var17 = Py.MALFORMED;
            return new hh(var17, var0);
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1395641500;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Ut = var4;
    }
}
