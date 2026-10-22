package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Uo {
    CONNECTING(),
    ACTIVE(),
    RETRYING(),
    EXPIRED(),
    REVOKED(),
    ERROR();

    public static final int KT;

    private Uo() {
    }

    public boolean terminal() {
        boolean var46 = false;
        label67: {
            int var1 = KT;
            var1 ^= 1690612572;
            int var2 = System.identityHashCode(this);
            Uo var3 = REVOKED;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var78;
            int var53 = (var78 = var4 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
            if (var53 != 0) {
                var1 |= -1514967030;
                var1 ^= -1279399734;
            } else {
                label69: {
                    var1 += -42381977;
                    var1 ^= -1428038220;
                    var4 = var1;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var8 = var4 + 2L;
                    var6 *= var8;
                    var4 += 3L;
                    var6 *= var4;
                    var4 = var6 & 7L;
                    long var79;
                    int var57 = (var79 = var4 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                    if (var57 != 0) {
                        break label67;
                    }

                    label56: {
                        if (this != var3) {
                            var1 += 1110238622;
                            var1 *= -997434483;
                            var1 ^= -1254932458;
                            Integer var49 = var1;
                            if (var49 == null) {
                                break label67;
                            }

                            var3 = ERROR;
                            int var58 = var2 + 1;
                            int var59 = var2 * var58;
                            var2 = var59 & 1;
                            if (var2 != 0) {
                                var1 |= 1882366856;
                                var1 |= 1245449083;
                                var1 <<= 6;
                                var1 >>>= 20;
                                var1 ^= 1141774267;
                                break label69;
                            }

                            var1 += 2081750621;
                            var1 ^= 1413748628;
                            var4 = var1;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var80;
                            var2 = (var80 = var4 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                break label67;
                            }

                            if (this != var3) {
                                var1 += 310101092;
                                var1 ^= 62318448;
                                long var43 = var1;
                                var4 = var43 + 1L;
                                var4 = var43 * var4;
                                long var44 = var4 & 1L;
                                long var81;
                                var2 = (var81 = var44 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    break label67;
                                }

                                var46 = false;
                                var1 *= 1811113525;
                                var1 |= 336723104;
                                var1 += 1560183478;
                                var1 ^= -468728175;
                                break label56;
                            }

                            var1 *= -1944319627;
                            var1 -= -1378321605;
                            var1 <<= 19;
                            var1 ^= -1612342506;
                        } else {
                            var1 >>>= 7;
                            var1 -= -588355423;
                            var1 *= -652439117;
                            var1 -= -1991502737;
                            var1 ^= -221336432;
                        }

                        var46 = true;
                        var1 &= 507543866;
                        var1 ^= 1459472100;
                    }

                    Integer var38 = var1;
                    if (var38 != null) {
                        return var46;
                    }
                    break label67;
                }
            }

            Integer var47 = var1;
            if (var47 != null) {
                UnsupportedOperationException var48 = new UnsupportedOperationException();
                throw var48;
            }
        }

        RuntimeException var40 = new RuntimeException();
        throw var40;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1113914025;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        KT = var4;
    }
}
