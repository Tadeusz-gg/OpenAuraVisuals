package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.List;

public class PZ implements hs {
    public final C fZ;
    public static final int ve;

    public PZ(C var1) {
        this.fZ = var1;
    }

    @Override
    public void F(List var1) {
        int var2 = ve;
        var2 ^= -1016648;
        int var3 = System.identityHashCode(this);
        int var4 = var1.size();
        int var5 = var1.size();
        int var6 = var2 - -346649748;
        var6 -= 925238905;
        var6 ^= -984413661;
        String var31 = C.modules(var5, var6);
        Integer var24 = var3;
        if (var24 == null) {
            var2 -= -2095741627;
            var2 += -1795462806;
            var2 ^= 470272203;
            long var34 = var2;
            long var8 = var34 + 1L;
            var8 = var34 * var8;
            long var10 = var34 + 2L;
            var8 *= var10;
            long var35 = var34 + 3L;
            var8 *= var35;
            long var36 = var8 & 7L;
            long var41;
            int var25 = (var41 = var36 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var25 == 0) {
                RuntimeException var26 = new RuntimeException();
                throw var26;
            }
        } else {
            var2 = switch (var2) {
                case -1843695619 -> {
                    var2 >>= 21;
                    var2 |= 385295170;
                    var2 >>>= 10;
                    yield var2 ^ -171621609;
                }
                case 1574807918 -> var2 ^ 215199401;
                default -> var2 ^ 368573727;
            };
            int var27 = var2 + 1;
            var27 = var2 * var27;
            var6 = var2 + 2;
            var27 *= var6;
            var2 += 3;
            var27 *= var2;
            var2 = var27 & 7;
            if (var2 == 0) {
                String var23 = "§7Config wczytany z chmury §f(" + var4 + " " + var31 + ")§7. Poprzedni lokalny jest w §fauravisuals.json.before-cloud§7.";
                i_2.Je(var23);
                return;
            }
        }

        IllegalArgumentException var22 = new IllegalArgumentException();
        throw var22;
    }

    @Override
    public void o(String var1) {
        label40: {
            int var2 = ve;
            var2 ^= 1544253876;
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            if (var4 == null) {
                var2 -= 2118317754;
                var2 &= 386862207;
                var2 |= -1985688545;
                var2 ^= 1699963416;
                var2 ^= -1320189832;
            } else {
                var2 ^= -1888996590;
                var2 *= 944895831;
                var2 |= -2106889250;
                var2 ^= -1981884514;
                int var37 = var2 + 1;
                var37 = var2 * var37;
                var37 &= 1;
                if (var37 != 0) {
                    break label40;
                }

                long var40 = System.currentTimeMillis();
                C var6 = this.fZ;
                long var42 = var6.lastFailureNotice;
                long var43 = var40 - var42;
                long var53;
                int var44 = (var53 = var43 - 600000L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                if (var44 < 0) {
                    var2 *= -1902012095;
                    var2 |= 1609135003;
                    var2 ^= -1196120298;
                    long var46 = var2;
                    long var8 = var46 + 1L;
                    var8 = var46 * var8;
                    long var10 = var46 + 2L;
                    var8 *= var10;
                    long var47 = var46 + 3L;
                    var8 *= var47;
                    long var48 = var8 & 7L;
                    long var54;
                    int var49 = (var54 = var48 - 0L) == 0L ? 0 : (var54 < 0L ? -1 : 1);
                    if (var49 == 0) {
                        return;
                    }
                    break label40;
                }

                var2 <<= 25;
                var2 ^= -1587165048;
                var6 = this.fZ;
                var6.lastFailureNotice = var40;
                String var41 = "§7Synchronizacja configu: §c" + var1;
                Integer var36 = var3;
                if (var36 != null) {
                    var2 |= -324491919;
                    var2 |= 407339007;
                    var2 += -1046498836;
                    var2 <<= 7;
                    var2 ^= -1347074669;
                    i_2.Je(var41);
                    return;
                }

                switch (var2) {
                    case 1073227133:
                    default:
                        var2 ^= -2091967343;
                        break;
                    case 1397542937:
                        var2 ^= 368853467;
                        break;
                    case 1667614856:
                        var2 &= 1510863209;
                        var2 ^= 229961303;
                }
            }

            Integer var25 = var2;
            if (var25 != null) {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1352291094;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ve = var4;
    }
}
