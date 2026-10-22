package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record m_2(String M, int[] textures, int[] sizes, int accent) {
    public static final int eC;




    public String key() {
        int var1 = eC;
        var1 ^= -615204214;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            switch (var1) {
                case -1665972967:
                    var1 ^= -1427236996;
                    break;
                case -515176635:
                default:
                    var1 ^= 774835834;
                    break;
                case 2034014498:
                    var1 -= 1373970525;
                    var1 &= 608922679;
                    var1 ^= -339417969;
            }

            RuntimeException var18 = new RuntimeException();
            throw var18;
        } else {
            var1 |= 400896604;
            var1 >>= 28;
            var1 ^= 1162045980;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            } else {
                return this.M;
            }
        }
    }

    public int[] textures() {
        int var1 = eC;
        var1 ^= -1057190267;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            var1 *= 1835055775;
            var1 &= 232544501;
            var1 *= 1080975023;
            var1 ^= -242366257;
            RuntimeException var22 = new RuntimeException();
            throw var22;
        } else {
            var1 += -317267969;
            var1 ^= 1125867653;
            var1 += 66213499;
            var1 >>= 8;
            var1 ^= 52237949;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            int var3 = var1 + 2;
            var18 *= var3;
            var1 += 3;
            var18 *= var1;
            var1 = var18 & 7;
            if (var1 == 0) {
                return this.textures;
            } else {
                UnsupportedOperationException var12 = new UnsupportedOperationException();
                throw var12;
            }
        }
    }

    public int[] sizes() {
        int var1 = eC;
        var1 ^= -1443257678;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 *= -1239572863;
            var1 <<= 25;
            var1 -= -1405831207;
            var1 -= -796256416;
            var1 ^= 1343850271;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        } else {
            var1 >>= 8;
            var1 &= -715362689;
            var1 &= 1991224470;
            var1 ^= 285915716;
            return this.sizes;
        }
    }

    public int accent() {
        int var1 = eC;
        var1 ^= -381402392;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 == null) {
            var1 = switch (var1) {
                case -1171847163 -> var1 ^ 1053672201;
                case 1261199680 -> {
                    var1 &= -1378289201;
                    var1 *= 722867723;
                    yield var1 ^ 1962882526;
                }
                default -> var1 ^ -517715133;
            };
            int var16 = var1 + 1;
            var16 = var1 * var16;
            int var3 = var1 + 2;
            var16 *= var3;
            var3 = var1 + 3;
            var16 *= var3;
            var16 &= 7;
            if (var16 != 0) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            } else {
                AssertionError var21 = new AssertionError();
                throw var21;
            }
        } else {
            switch (var1) {
                case -1461345212:
                    var1 ^= 356487351;
                    break;
                case -915777115:
                default:
                    var1 ^= -1693783018;
                    break;
                case 1261199680:
                    var1 |= -116048342;
                    var1 -= -1102095683;
                    var1 += -1150734650;
                    var1 *= -961211145;
                    var1 ^= 517261189;
            }

            return this.accent;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -450363601;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        eC = var4;
    }
}
