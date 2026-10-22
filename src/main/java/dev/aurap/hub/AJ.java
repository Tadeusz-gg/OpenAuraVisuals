package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum AJ {
    COMBAT("Combat", "Hit feedback, kill effects, damage numbers"),
    HUD("HUD", "Target HUD, indicators, overlays"),
    ANIMATIONS("Animations", "Swing, item and camera animations"),
    SOUND("Sound", "Hit sounds and audio cues"),
    WORLD("World", "In-world effects and post-processing"),
    CLIENT("Client", "Interface, theme and engine settings");

    private final String J;
    private final String F;
    public static final int JY;

    private AJ(String var3, String var4) {
        this.J = var3;
        this.F = var4;
    }

    public String displayName() {
        int var1 = JY;
        var1 ^= -1545518306;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 *= -1130194331;
            var1 ^= 1420668805;
            long var16 = var1;
            long var24 = var16 + 1L;
            long var25 = var16 * var24;
            long var6 = var16 + 2L;
            long var26 = var25 * var6;
            long var17 = var16 + 3L;
            long var27 = var26 * var17;
            long var18 = var27 & 7L;
            long var28;
            var2 = (var28 = var18 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
            if (var2 != 0) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            } else {
                return this.J;
            }
        } else {
            var1 ^= -470402707;
            var1 ^= 501875317;
            RuntimeException var11 = new RuntimeException();
            throw var11;
        }
    }

    public String description() {
        int var1 = JY;
        var1 ^= -373690158;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            switch (var1) {
                case -1658192147:
                    var1 ^= -1569033972;
                    break;
                case -1456411664:
                default:
                    var1 ^= -2002515718;
                    break;
                case -798805337:
                    var1 -= -701026122;
                    var1 ^= 294400942;
            }

            AssertionError var13 = new AssertionError();
            throw var13;
        } else {
            var1 *= 210270175;
            var1 ^= 1425397968;
            Integer var6 = var1;
            if (var6 == null) {
                IllegalStateException var7 = new IllegalStateException();
                throw var7;
            } else {
                return this.F;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -835820206;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        JY = var4;
    }
}
