package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum c_2 implements oF {
    OFF_SOUND("Silent", null),
    AURA("Aura", null),
    BELL("Bell", "bell"),
    BONK("Bonk", "bonk"),
    BUBBLE("Bubble", "bubble"),
    POK("Pok", "pok"),
    MAGIC_POK("Magic Pok", "magic"),
    GET("Get", "get"),
    ON("On", "voice_on"),
    OFF("Off", "voice_off"),
    CUSTOM("Custom", "custom");

    private final String ri;
    public final String cue;
    public static final int Xo;

    private c_2(String var3, String var4) {
        this.ri = var3;
        this.cue = var4;
    }

    @Override
    public String displayName() {
        int var1 = Xo;
        var1 ^= -1821921848;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var32;
        var2 = (var32 = var21 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 == 0) {
            long var23 = switch (var1) {
                case -1468864393 -> var1 ^ -471110225;
                case -466485186 -> {
                    var1 >>= 25;
                    var1 <<= 23;
                    yield var1 ^ 1536921840;
                }
                default -> var1 ^ -1886289689;
            };
            var4 = var23 + 1L;
            var4 = var23 * var4;
            long var24 = var4 & 1L;
            long var33;
            var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.ri;
            }
        } else {
            var1 |= 1386453994;
            var1 *= -1950170325;
            var1 ^= 826854871;
            long var14 = var1;
            long var3 = var14 + 1L;
            var3 = var14 * var3;
            long var5 = var14 + 2L;
            var3 *= var5;
            long var15 = var14 + 3L;
            var3 *= var15;
            long var16 = var3 & 7L;
            long var34;
            var1 = (var34 = var16 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 311555009;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Xo = var4;
    }
}
