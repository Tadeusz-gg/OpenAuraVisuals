package dev.aurap.hub;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.SceneStage;
import dev.skidware.visuals.render.RenderTarget;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record pT(SceneStage mo, RenderTarget LO, FrameContext wU) {
    public static final int iK;




    public SceneStage stage() {
        int var1 = iK;
        var1 ^= -1591986749;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var32;
        var2 = (var32 = var20 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += 1109312535;
            var1 -= -1283332304;
            var1 &= 1041662549;
            var1 &= -1480554990;
            var1 ^= -521691702;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            } else {
                return this.mo;
            }
        } else {
            var1 *= -191978629;
            var1 += -1897960683;
            var1 ^= -1697848558;
            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        }
    }

    public RenderTarget target() {
        int var1 = iK;
        var1 ^= -414807689;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.sS;
        var1 ^= var3;
        var1 ^= -1964026;
        of_2.sS = -1964026;
        var3 = of_2.mH;
        var1 ^= var3;
        var1 ^= -1618411195;
        of_2.mH = -1618411195;
        if (var2 == 0) {
            long var17 = switch (var1) {
                case -2082045995 -> {
                    var1 >>>= 17;
                    yield var1 ^ -2107793445;
                }
                default -> var1 ^ 284988648;
                case 1704389395 -> var1 ^ 1950623291;
            };
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var25;
            var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.LO;
            } else {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        } else {
            var1 |= -496663087;
            var1 ^= 764577783;
            IllegalArgumentException var13 = new IllegalArgumentException();
            throw var13;
        }
    }

    public FrameContext frame() {
        int var1 = iK;
        var1 ^= 1961683445;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.sS;
        var1 ^= var3;
        var1 ^= -1964026;
        var3 = of_2.mH;
        var1 ^= var3;
        var1 ^= -1618411195;
        if (var2 == 0) {
            Integer var23 = switch (var1) {
                case 273424215 -> {
                    var1 += -1805668203;
                    var1 &= -367784316;
                    var1 ^= -1162840564;
                    yield var1 ^ -1046348491;
                }
                default -> var1 ^ 435316686;
                case 1423190007 -> var1 ^ -393519366;
            };
            if (var23 != null) {
                return this.wU;
            }
        } else {
            var1 += 1246897049;
            var1 -= -1136415916;
            var1 *= -423392637;
            var1 ^= -1406753722;
            Integer var18 = var1;
            if (var18 != null) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -580494220;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        iK = var4;
    }
}
