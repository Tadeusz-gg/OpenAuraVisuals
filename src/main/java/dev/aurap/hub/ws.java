package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum ws implements oF {
    LIGHT(),
    SAHUR();

    public static final int oT;

    private ws() {
    }

    @Override
    public String displayName() {
        int var1 = oT;
        var1 ^= -1379172722;
        int var2 = System.identityHashCode(this);
        Integer var35 = var2;
        if (var35 != null) {
            var1 &= 979937925;
            var1 *= -102931291;
            var1 -= -446328180;
            var1 ^= -927226468;
            long var36 = var1;
            long var4 = var36 + 1L;
            var4 = var36 * var4;
            long var37 = var4 & 1L;
            long var49;
            int var38 = (var49 = var37 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
            label43:
            if (var38 == 0) {
                ws var39 = LIGHT;
                String var41;
                if (this == var39) {
                    var1 += 1995430252;
                    var1 ^= -1126190659;
                    Integer var40 = var1;
                    if (var40 == null) {
                        break label43;
                    }

                    var41 = "Light";
                    var1 <<= 19;
                    var1 ^= -1065341389;
                } else {
                    var1 -= 1703133132;
                    var1 -= -2138894759;
                    var1 -= 1251580611;
                    var1 ^= 1453415688;
                    long var3 = var1;
                    long var5 = var3 + 1L;
                    var5 = var3 * var5;
                    long var7 = var3 + 2L;
                    var5 *= var7;
                    var3 += 3L;
                    var5 *= var3;
                    var3 = var5 & 7L;
                    long var50;
                    int var44 = (var50 = var3 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
                    if (var44 != 0) {
                        break label43;
                    }

                    var41 = "Tung Tung Tung Sahur";
                    switch (var1) {
                        case -2120031078:
                        default:
                            var1 ^= 2043155570;
                            break;
                        case 800781505:
                            var1 ^= -1045075637;
                            var1 ^= 658367786;
                            var1 |= -31785969;
                            var1 >>>= 3;
                            var1 ^= 845640102;
                            break;
                        case 1402614549:
                            var1 ^= 1890875859;
                    }
                }

                return var41;
            }
        } else {
            Integer var13 = switch (var1) {
                default -> var1 ^ 1329904958;
                case 804317649 -> var1 ^ -1821311185;
                case 1238193637 -> {
                    var1 >>= 18;
                    var1 ^= -939989304;
                    yield var1 ^ 116063231;
                }
            };
            if (var13 != null) {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            }
        }

        IllegalArgumentException var34 = new IllegalArgumentException();
        throw var34;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1344080026;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        oT = var4;
    }
}
