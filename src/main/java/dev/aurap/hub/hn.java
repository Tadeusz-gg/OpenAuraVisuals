package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;

public final class hn {
    private final String tO;
    private final ArrayList H;
    private int G;
    private float n;
    private int AD;
    private int sJ;
    public static final int ln;

    public hn(String var1) {
        ArrayList var2 = new ArrayList();
        this.H = var2;
        this.sJ = 1500;
        this.tO = var1;
    }

    public hn Y(WK var1) {
        int var2 = ln;
        var2 ^= -1172876757;
        int var3 = System.identityHashCode(this);
        ArrayList var4 = this.H;
        Integer var19 = var3;
        int var5 = of_2.I;
        var2 ^= var5;
        var2 ^= 1186804733;
        var5 = of_2.B;
        var2 ^= var5;
        var2 ^= -1330247516;
        if (var19 == null) {
            var2 ^= 634322206;
            var2 -= 926113007;
            var2 ^= -992199717;
            UnsupportedOperationException var20 = new UnsupportedOperationException();
            throw var20;
        } else {
            var2 ^= 637868963;
            var2 |= 576058735;
            var2 += -941568030;
            var2 ^= -955139993;
            boolean var15 = var4.add(var1);
            return this;
        }
    }

    public hn d(int var1) {
        int var2 = ln;
        var2 ^= 1556479459;
        int var4 = System.identityHashCode(this);
        long var28 = var4;
        long var6 = var28 + 1L;
        var6 = var28 * var6;
        long var8 = var28 + 2L;
        var6 *= var8;
        long var29 = var28 + 3L;
        var6 *= var29;
        long var30 = var6 & 7L;
        long var37;
        var4 = (var37 = var30 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var4 != 0) {
            switch (var2) {
                case -1729345910:
                default:
                    var2 ^= 1601085455;
                    break;
                case -1247603142:
                    var2 &= -1053228619;
                    var2 |= -977561758;
                    var2 &= -65442549;
                    var2 *= -1614086573;
                    var2 ^= 2089508441;
                    break;
                case 1530853121:
                    var2 ^= 1555182689;
            }

            AssertionError var33 = new AssertionError();
            throw var33;
        } else {
            var2 |= 428893646;
            var2 &= -1722403208;
            var2 *= -1367808901;
            var2 ^= -2023855734;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var4 = var1 + 2;
            var2 *= var4;
            int var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                this.G = var1;
                return this;
            } else {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        }
    }

    public hn Xp(float var1, int var2, int var3) {
        int var4 = ln;
        var4 ^= -1971482732;
        int var6 = System.identityHashCode(this);
        this.n = var1;
        int var7 = var6 + 1;
        var7 = var6 * var7;
        var6 = var7 & 1;
        if (var6 == 0) {
            var4 &= 1960539050;
            var4 *= 1560723105;
            var4 ^= 1901613861;
            this.AD = var2;
            this.sJ = var3;
            return this;
        } else {
            var4 -= -1595291547;
            var4 ^= -1113989274;
            long var11 = var2;
            long var20 = var11 + 1L;
            long var21 = var11 * var20;
            long var12 = var21 & 1L;
            long var23;
            var4 = (var23 = var12 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var4 != 0) {
                UnsupportedOperationException var15 = new UnsupportedOperationException();
                throw var15;
            } else {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            }
        }
    }

    public Pd gI() {
        int var1 = ln;
        var1 ^= -658300889;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 != null) {
            var1 |= -2109100910;
            var1 ^= -2134190525;
            String var3 = this.tO;
            ArrayList var4 = this.H;
            int var5 = this.G;
            float var6 = this.n;
            int var7 = this.AD;
            int var8 = this.sJ;
            return new Pd(var3, var4, var5, var6, var7, var8);
        } else {
            var1 ^= 1356242737;
            var1 >>>= 6;
            var1 ^= 1379385900;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1663982760;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        ln = var4;
    }
}
