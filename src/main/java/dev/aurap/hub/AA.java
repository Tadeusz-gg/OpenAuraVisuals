package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record AA(long dueAt, long M, Runnable task) implements Comparable<AA> {
    public static final int Ba;

    public int compareTo(AA var1) {
        int var2 = Ba;
        var2 ^= -1580457433;
        int var3 = System.identityHashCode(this);
        long var4 = this.dueAt;
        long var6 = var1.dueAt();
        int var45 = Long.compare(var4, var6);
        long var5 = var3;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var76;
        int var48 = (var76 = var5 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
        if (var48 != 0) {
            var2 <<= 18;
            var2 -= 820320628;
            var2 ^= 1754117205;
        } else {
            label66: {
                var2 -= 689305714;
                var2 -= -879187387;
                var2 |= -2032156842;
                var2 *= 102617503;
                var2 ^= -1879258613;
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var77;
                int var51 = (var77 = var5 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                label55:
                if (var51 == 0) {
                    int var46;
                    if (var45 != 0) {
                        var2 *= -1224023313;
                        var2 ^= 2061912242;
                        var5 = var2;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var78;
                        int var54 = (var78 = var5 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                        if (var54 != 0) {
                            break label55;
                        }

                        var46 = var45;
                        switch (var2) {
                            case -367626347:
                                var2 += -373477148;
                                var2 ^= -1932317464;
                                break;
                            case 1361173527:
                                var2 ^= -1778199367;
                                break;
                            case 1624556814:
                            default:
                                var2 ^= -664620685;
                        }
                    } else {
                        var2 = switch (var2) {
                            default -> var2 ^ 1790488499;
                            case 594478921 -> {
                                var2 |= 354886747;
                                var2 ^= -1278635621;
                                var2 ^= 1582637704;
                                var2 -= -640838589;
                                yield var2 ^ -1702136349;
                            }
                            case 2109114862 -> var2 ^ -570008553;
                        };
                        var5 = var2;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var79;
                        int var57 = (var79 = var5 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                        if (var57 != 0) {
                            break label55;
                        }

                        var5 = this.M;
                        int var68 = var3 + 1;
                        int var69 = var3 * var68;
                        var3 = var69 & 1;
                        if (var3 != 0) {
                            var2 -= -342744024;
                            var2 ^= 1313455460;
                            var2 ^= -1267613674;
                            var2 |= -663143390;
                            var2 ^= -316641737;
                            break label66;
                        }

                        var2 <<= 31;
                        var2 ^= 1402029412;
                        var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var80;
                        var3 = (var80 = var7 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                        if (var3 != 0) {
                            break label55;
                        }

                        var7 = var1.M;
                        var3 = Long.compare(var5, var7);
                        var46 = var3;
                        var2 *= -2038718177;
                        var2 ^= -1951739957;
                        var2 &= -273356512;
                        var2 ^= -22805359;
                    }

                    var5 = var2;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var81;
                    var3 = (var81 = var5 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return var46;
                    }
                }

                IllegalArgumentException var44 = new IllegalArgumentException();
                throw var44;
            }
        }

        IllegalArgumentException var39 = new IllegalArgumentException();
        throw var39;
    }




    public long dueAt() {
        int var1 = Ba;
        var1 ^= -2036862095;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            var17 = switch (var1) {
                case -652151431 -> {
                    var1 &= 490589061;
                    yield var1 ^ -1784933637;
                }
                default -> var1 ^ -436835274;
                case 621974294 -> var1 ^ -1838391356;
            };
            if (var17 != null) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            }
        } else {
            var1 >>>= 11;
            var1 *= -1553125035;
            var1 >>= 21;
            var1 <<= 9;
            var1 ^= -596977456;
            long var13 = var1;
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var14 = var3 & 1L;
            long var21;
            var1 = (var21 = var14 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.dueAt;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public long seq() {
        int var1 = Ba;
        var1 ^= 1678422177;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            long var18 = switch (var1) {
                default -> var1 ^ 2123415761;
                case 1002288809 -> {
                    var1 |= 1357490530;
                    yield var1 ^ -1374067622;
                }
                case 1603544625 -> var1 ^ -1474079905;
            };
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var25;
            var2 = (var25 = var19 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.M;
            }
        } else {
            long var12 = switch (var1) {
                case 220756581 -> var1 ^ 1916753661;
                default -> var1 ^ -510129905;
                case 1002288809 -> {
                    var1 += -1802979925;
                    var1 -= -609910123;
                    yield var1 ^ 499472094;
                }
            };
            long var22 = var12 + 1L;
            long var23 = var12 * var22;
            long var13 = var23 & 1L;
            long var26;
            var1 = (var26 = var13 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public Runnable task() {
        int var1 = Ba;
        var1 ^= -861108023;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 == null) {
            var1 += -1383748849;
            var1 ^= -943236160;
            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        } else {
            var1 *= 1558590801;
            var1 >>= 22;
            var1 ^= 1085349458;
            Integer var7 = var1;
            if (var7 == null) {
                RuntimeException var8 = new RuntimeException();
                throw var8;
            } else {
                return this.task;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -797764042;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Ba = var4;
    }
}
