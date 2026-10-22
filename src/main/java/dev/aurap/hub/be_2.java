package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record be_2(String trackId, BA state, Za lyrics) {
    public static final be_2 IDLE;
    public static final int ja;




    public String trackId() {
        int var1 = ja;
        var1 ^= 1881106949;
        int var2 = System.identityHashCode(this);
        long var13 = var2;
        long var4 = var13 + 1L;
        var4 = var13 * var4;
        long var14 = var4 & 1L;
        long var17;
        var2 = (var17 = var14 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += 1935714345;
            var1 ^= 1957969443;
            return this.trackId;
        } else {
            var1 |= -749331167;
            var1 >>= 25;
            var1 ^= -1800520722;
            RuntimeException var10 = new RuntimeException();
            throw var10;
        }
    }

    public BA state() {
        int var1 = ja;
        var1 ^= -779006784;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var6 = var21 + 2L;
        var4 *= var6;
        long var22 = var21 + 3L;
        var4 *= var22;
        long var23 = var4 & 7L;
        long var31;
        var2 = (var31 = var23 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 = switch (var1) {
                case -1665971792 -> var1 ^ -1698663156;
                case -66188799 -> {
                    var1 &= 497196813;
                    var1 ^= -749543330;
                    var1 *= -1336790747;
                    var1 ^= -362373041;
                    yield var1 ^ -2138596228;
                }
                default -> var1 ^ 1436840381;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.state;
            }
        } else {
            Integer var18 = switch (var1) {
                case -66188799 -> {
                    var1 <<= 19;
                    var1 &= -889414201;
                    var1 |= 2046101331;
                    yield var1 ^ 376234970;
                }
                case 180305104 -> var1 ^ 1679598022;
                default -> var1 ^ 1522445379;
            };
            if (var18 != null) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        }

        AssertionError var19 = new AssertionError();
        throw var19;
    }

    public Za lyrics() {
        int var1 = ja;
        var1 ^= -2063885986;
        int var2 = System.identityHashCode(this);
        Integer var10 = var2;
        if (var10 == null) {
            var1 += -2049943896;
            var1 ^= -105194571;
            int var11 = var1 + 1;
            var11 = var1 * var11;
            var11 &= 1;
            if (var11 == 0) {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            } else {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        } else {
            switch (var1) {
                case -1453006945:
                    var1 |= -1531909497;
                    var1 ^= 238066722;
                    break;
                case -492786945:
                    var1 ^= -1970885306;
                    break;
                case 541067616:
                default:
                    var1 ^= 1797959061;
            }

            return this.lyrics;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 479497753;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ja = var4;
        BA var6 = BA.IDLE;
        be_2 var5 = new be_2("", var6, null);
        IDLE = var5;
    }
}
