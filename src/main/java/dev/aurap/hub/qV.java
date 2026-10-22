package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public class qV implements sx {
    public static final int JT;

    public qV() {
    }

    @Override
    public String s(int var1) {
        int var2 = JT;
        var2 ^= -748774430;
        int var4 = System.identityHashCode(this);
        long var22 = var4;
        long var6 = var22 + 1L;
        var6 = var22 * var6;
        long var23 = var6 & 1L;
        long var31;
        var4 = (var31 = var23 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var4 == 0) {
            switch (var2) {
                case -1668812397:
                    var2 ^= -621554260;
                    break;
                case -1339144931:
                default:
                    var2 ^= -669221977;
                    break;
                case 337301227:
                    var2 += 249999848;
                    var2 |= 390020889;
                    var2 ^= 143465946;
            }

            return Integer.toString(var1);
        } else {
            var2 ^= 246241550;
            var2 ^= -1665604898;
            long var11 = var1;
            long var25 = var11 + 1L;
            long var26 = var11 * var25;
            var6 = var11 + 2L;
            long var27 = var26 * var6;
            long var12 = var11 + 3L;
            long var28 = var27 * var12;
            long var13 = var28 & 7L;
            long var32;
            var2 = (var32 = var13 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            } else {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            }
        }
    }

    @Override
    public int W(String var1) {
        label41: {
            Throwable var2;
            int var6;
            int var16;
            label42: {
                try {
                    var16 = JT;
                    var16 ^= -1041602664;
                    Object var4 = null;
                    var16 += -553769078;
                    var16 ^= -280429979;
                } catch (Throwable var10) {
                    var2 = var10;
                    int var3 = JT;
                    int var12 = var3 ^ -2018353647;
                    var6 = (var10 instanceof NumberFormatException) ? 1 : 0;
                    int var13 = var12 + -1394387386;
                    int var14 = var13 + 1682670897;
                    int var15 = var14 ^ 75512119;
                    var16 = var15 ^ 467341993;
                    int var7 = var16 + 1;
                    var7 = var16 * var7;
                    int var8 = var16 + 2;
                    var7 *= var8;
                    var8 = var16 + 3;
                    var7 *= var8;
                    var7 &= 7;
                    if (var7 != 0) {
                        break label41;
                    }
                    break label42;
                }

                Integer var5 = var16;
                if (var5 == null) {
                    break label41;
                }

                try {
                    int var42 = Integer.parseInt(var1);
                    var16 ^= -1045854356;
                    var16 ^= 1273186009;
                    return var42;
                } catch (Throwable var9) {
                    var2 = var9;
                    int var21 = JT;
                    int var22 = var21 ^ -2018353647;
                    var6 = (var9 instanceof NumberFormatException) ? 1 : 0;
                    int var23 = var22 + -1394387386;
                    int var24 = var23 + 1682670897;
                    int var25 = var24 ^ 75512119;
                    var16 = var25 ^ 467341993;
                    int var50 = var16 + 1;
                    var50 = var16 * var50;
                    int var56 = var16 + 2;
                    var50 *= var56;
                    var56 = var16 + 3;
                    var50 *= var56;
                    var50 &= 7;
                    if (var50 != 0) {
                        break label41;
                    }
                }
            }

            if (var6 == 0) {
                var16 |= -1210582663;
                var16 <<= 15;
                var16 ^= 959295685;
                var16 ^= 1727766946;
                throw UncheckedExceptions.rethrow(var2);
            }

            var16 <<= 17;
            var16 |= 1681225031;
            var16 |= -555995906;
            var16 ^= -2040069307;
            var6 = var16 + 1;
            var6 = var16 * var6;
            var6 &= 1;
            if (var6 == 0) {
                NumberFormatException var41 = (NumberFormatException)var2;
                var16 += -282318900;
                var16 *= -27373935;
                var16 ^= -645860553;
                var16 |= 1829730909;
                var16 ^= -341250223;
                return -1;
            }
        }

        UnsupportedOperationException var11 = new UnsupportedOperationException();
        throw var11;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1583988492;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        JT = var4;
    }
}
