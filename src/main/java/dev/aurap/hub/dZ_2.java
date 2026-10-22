package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class dZ_2 {
    private final Map S;
    private final float duration;
    public static final int pN;

    public dZ_2(Map var1) {
        Map var2 = Map.copyOf(var1);
        this.S = var2;
        float var5 = 0.0F;
        Collection var3 = var1.values();
        Iterator var7 = var3.iterator();
        Iterator var8 = var7;
        float var6 = var5;

        while (true) {
            boolean var4 = var8.hasNext();
            if (!var4) {
                this.duration = var6;
                return;
            }

            Object var9 = var8.next();
            LH var10 = (LH)var9;
            float var11 = var10.S();
            float var12 = Math.max(var6, var11);
            var6 = var12;
        }
    }

    public static ik a() {
        return new ik();
    }

    public float aw() {
        int var1 = pN;
        var1 ^= -912207588;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 &= 396931396;
            var1 ^= -1030664327;
            long var21 = var1;
            long var30 = var21 + 1L;
            long var31 = var21 * var30;
            long var6 = var21 + 2L;
            long var32 = var31 * var6;
            long var22 = var21 + 3L;
            long var33 = var32 * var22;
            long var23 = var33 & 7L;
            long var34;
            var2 = (var34 = var23 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.duration;
            }
        } else {
            var1 ^= -202889900;
            var1 |= -2134557701;
            var1 &= 1579360554;
            var1 |= -1045783498;
            var1 ^= -51196612;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public LH U(String var1) {
        int var2 = pN;
        var2 ^= 532153512;
        int var3 = System.identityHashCode(this);
        Integer var27 = var3;
        if (var27 == null) {
            var2 += 201849110;
            var2 ^= -83601294;
            var2 ^= 274424638;
            int var28 = var2 + 1;
            var28 = var2 * var28;
            int var4 = var2 + 2;
            var28 *= var4;
            var4 = var2 + 3;
            var28 *= var4;
            var28 &= 7;
            if (var28 == 0) {
                IllegalArgumentException var33 = new IllegalArgumentException();
                throw var33;
            }
        } else {
            var2 &= -68178460;
            var2 *= -2131347587;
            var2 ^= -1829753569;
            var2 += 1830124530;
            var2 ^= -119845577;
            long var34 = var2;
            long var5 = var34 + 1L;
            var5 = var34 * var5;
            long var7 = var34 + 2L;
            var5 *= var7;
            long var35 = var34 + 3L;
            var5 *= var35;
            long var36 = var5 & 7L;
            long var48;
            int var37 = (var48 = var36 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var37 == 0) {
                Map var39 = this.S;
                Object var40 = var39.get(var1);
                LH var41 = (LH)var40;
                if (var41 == null) {
                    var2 >>= 27;
                    var2 -= 1031632913;
                    var2 &= -1721440051;
                    var2 -= -1931325071;
                    var2 ^= -1980483412;
                    String var47 = "No track '" + var1 + "'";
                    IllegalArgumentException var43 = new IllegalArgumentException(var47);
                    throw var43;
                }

                switch (var2) {
                    case -2074560758:
                        var2 >>>= 27;
                        var2 ^= -1435460556;
                        break;
                    case -1796452526:
                    default:
                        var2 ^= 1428224301;
                        break;
                    case 958308923:
                        var2 ^= 956066126;
                }

                return var41;
            }
        }

        UnsupportedOperationException var38 = new UnsupportedOperationException();
        throw var38;
    }

    public YH zV() {
        int var1 = pN;
        var1 ^= -278398457;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var28;
        var2 = (var28 = var19 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 |= 322095371;
            var1 *= -412901969;
            var1 ^= -506371148;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            } else {
                return new YH(this);
            }
        } else {
            var1 *= -369525365;
            var1 *= -1999555157;
            var1 ^= -1222092676;
            var1 ^= -1034644603;
            RuntimeException var13 = new RuntimeException();
            throw var13;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1223885987;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        pN = var4;
    }
}
