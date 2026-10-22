package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Bo extends LinkedHashMap {
    public final Zq this$0;
    public static final int TI;

    public Bo(Zq var1, int var2, float var3, boolean var4) {
        super(var2, var3, var4);
        this.this$0 = var1;
    }

    @Override
    protected boolean removeEldestEntry(Entry var1) {
        int var2 = TI;
        var2 ^= -643004210;
        int var3 = System.identityHashCode(this);
        long var31 = var3;
        long var5 = var31 + 1L;
        var5 = var31 * var5;
        long var7 = var31 + 2L;
        var5 *= var7;
        long var32 = var31 + 3L;
        var5 *= var32;
        long var33 = var5 & 7L;
        long var56;
        var3 = (var56 = var33 - 0L) == 0L ? 0 : (var56 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 &= 503197349;
            var2 += -518090340;
            var2 &= -40355944;
            var2 ^= 937328923;
            long var35 = var2;
            var5 = var35 + 1L;
            var5 = var35 * var5;
            var7 = var35 + 2L;
            var5 *= var7;
            long var36 = var35 + 3L;
            var5 *= var36;
            long var37 = var5 & 7L;
            long var57;
            var3 = (var57 = var37 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
            label37:
            if (var3 == 0) {
                var3 = this.size();
                boolean var41;
                if (var3 > 48) {
                    var2 ^= -878604501;
                    var2 *= 1928368957;
                    var2 &= -1201721555;
                    var2 ^= -535827990;
                    Integer var40 = var2;
                    if (var40 == null) {
                        break label37;
                    }

                    var41 = true;
                    var2 += 1193352376;
                    var2 ^= -896460078;
                    var2 ^= -1598652034;
                } else {
                    var2 *= 1785379675;
                    var2 ^= -520799731;
                    var41 = false;
                    var2 &= -1530423813;
                    var2 *= -1536975819;
                    var2 ^= 1890382590;
                }

                int var4 = var2 + 1;
                var4 = var2 * var4;
                int var53 = var2 + 2;
                var4 *= var53;
                int var54 = var2 + 3;
                var4 *= var54;
                var4 &= 7;
                if (var4 == 0) {
                    return var41;
                }
            }
        } else {
            Integer var28 = switch (var2) {
                case -570615402 -> {
                    var2 >>>= 29;
                    var2 ^= -1651375673;
                    yield var2 ^ 1470339547;
                }
                default -> var2 ^ 694402084;
                case 401392157 -> var2 ^ 2118607009;
            };
            if (var28 != null) {
                UnsupportedOperationException var30 = new UnsupportedOperationException();
                throw var30;
            }
        }

        IllegalStateException var29 = new IllegalStateException();
        throw var29;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1808031913;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        TI = var4;
    }
}
