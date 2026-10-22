package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum cK implements oF {
    SLASH("/"),
    BAR("|"),
    DOT("·");

    public final String glyph;
    public static final int Ol;

    private cK(String var3) {
        this.glyph = var3;
    }

    @Override
    public String displayName() {
        int var1 = Ol;
        var1 ^= -1529432721;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var24;
        var2 = (var24 = var17 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 = switch (var1) {
                case 10055772 -> var1 ^ 1673166334;
                case 159021593 -> {
                    var1 += 1107247055;
                    var1 += 83680346;
                    var1 -= -146979218;
                    yield var1 ^ -1023881239;
                }
                default -> var1 ^ -1875192749;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                AssertionError var22 = new AssertionError();
                throw var22;
            }
        } else {
            var1 &= 517752151;
            var1 >>= 22;
            var1 ^= -1400157362;
            Integer var14 = var1;
            if (var14 != null) {
                return this.glyph;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1263939935;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        Ol = var4;
    }
}
