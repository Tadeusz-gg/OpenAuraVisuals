package dev.aurap.hub;

import java.io.IOException;

public interface Co extends AutoCloseable {
    String name();

    FX poll() throws IOException;

    default gM_2 timing() {
        int var1 = -1331869219;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 |= -1323779905;
            var1 &= 320492653;
            var1 += 1722412109;
            var1 ^= -1898292983;
            long var23 = var1;
            long var4 = var23 + 1L;
            var4 = var23 * var4;
            long var24 = var4 & 1L;
            long var32;
            var2 = (var32 = var24 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                return gM_2.DEFAULT;
            }
        } else {
            long var16 = switch (var1) {
                case -1331869219 -> {
                    var1 ^= 1681016607;
                    var1 &= -1147255907;
                    var1 >>>= 7;
                    var1 ^= -1535510894;
                    yield var1 ^ -1909884869;
                }
                case 607206720 -> var1 ^ 1578484842;
                default -> var1 ^ -489811801;
            };
            long var27 = var16 + 1L;
            long var28 = var16 * var27;
            long var5 = var16 + 2L;
            long var29 = var28 * var5;
            long var17 = var16 + 3L;
            long var30 = var29 * var17;
            long var18 = var30 & 7L;
            long var33;
            var1 = (var33 = var18 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        }

        RuntimeException var20 = new RuntimeException();
        throw var20;
    }

    void send(Ar var1) throws IOException;

    default byte[] artwork(String var1) throws IOException {
        int var2 = -735917458;
        int var3 = System.identityHashCode(this);
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var7 = var19 + 2L;
        var5 *= var7;
        long var20 = var19 + 3L;
        var5 *= var20;
        long var21 = var5 & 7L;
        long var28;
        var3 = (var28 = var21 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var3 != 0) {
            Integer var23 = switch (var2) {
                default -> var2 ^ 1166171648;
                case -1090805820 -> var2 ^ -1800412575;
                case -735917458 -> {
                    var2 -= 517321745;
                    var2 -= 629660411;
                    var2 ^= 30921824;
                    yield var2 ^ -29882842;
                }
            };
            if (var23 != null) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var2 += 1531163965;
            var2 <<= 14;
            var2 <<= 17;
            var2 ^= -678343112;
            Integer var17 = var2;
            if (var17 != null) {
                return OfflineProfile.remoteImage(var1);
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    @Override
    default void close() {
        int var1 = System.identityHashCode(this);
    }
}
