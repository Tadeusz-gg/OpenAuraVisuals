package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.LivingEntity;

public record tZ(LivingEntity d, float dP, float he) {
    public static final int rn;

    public float delta() {
        int var1 = rn;
        var1 ^= 2073413439;
        int var2 = System.identityHashCode(this);
        float var3 = this.he;
        float var4 = this.dP;
        Integer var18 = var2;
        if (var18 != null) {
            var1 += -258133118;
            var1 *= 776794321;
            var1 ^= -107653335;
            var1 &= -1480501643;
            var1 ^= 1844028392;
            return var3 - var4;
        } else {
            var1 >>= 12;
            var1 -= -1739398837;
            var1 -= -908494588;
            var1 ^= 866871093;
            int var19 = var1 + 1;
            var19 = var1 * var19;
            var1 = var19 & 1;
            if (var1 == 0) {
                IllegalStateException var12 = new IllegalStateException();
                throw var12;
            } else {
                AssertionError var11 = new AssertionError();
                throw var11;
            }
        }
    }




    public LivingEntity entity() {
        int var1 = rn;
        var1 ^= -1163329342;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        int var3 = of_2.GI;
        var1 ^= var3;
        var1 ^= 970741366;
        of_2.GI = 970741366;
        var3 = of_2.H;
        var1 ^= var3;
        var1 ^= -221589153;
        of_2.H = -221589153;
        if (var17 != null) {
            var17 = switch (var1) {
                default -> var1 ^ 732120605;
                case 424026523 -> {
                    var1 *= -1670843957;
                    var1 |= 973683467;
                    yield var1 ^ 1148363975;
                }
                case 836828962 -> var1 ^ -1381384282;
            };
            if (var17 != null) {
                return this.d;
            }
        } else {
            var1 ^= 292440155;
            var1 ^= 1170141097;
            Integer var14 = var1;
            if (var14 != null) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        IllegalArgumentException var15 = new IllegalArgumentException();
        throw var15;
    }

    public float oldHealth() {
        int var1 = rn;
        var1 ^= -2145642089;
        int var2 = System.identityHashCode(this);
        long var14 = var2;
        long var4 = var14 + 1L;
        var4 = var14 * var4;
        long var15 = var4 & 1L;
        long var23;
        var2 = (var23 = var15 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 = switch (var1) {
                case 270421584 -> var1 ^ -2029383990;
                case 603142350 -> {
                    var1 |= 1871236601;
                    var1 ^= -593838681;
                    yield var1 ^ -1935051466;
                }
                default -> var1 ^ 1946718692;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            } else {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        } else {
            switch (var1) {
                case 603142350:
                    var1 *= 802295407;
                    var1 ^= 2023380002;
                    break;
                case 1580113613:
                default:
                    var1 ^= 1989522555;
                    break;
                case 2012372530:
                    var1 ^= 1080992466;
            }

            return this.dP;
        }
    }

    public float newHealth() {
        int var1 = rn;
        var1 ^= 1767014883;
        int var2 = System.identityHashCode(this);
        Integer var11 = var2;
        if (var11 == null) {
            var1 -= 2143653054;
            var1 ^= 722888143;
            var1 ^= -5101749;
            RuntimeException var12 = new RuntimeException();
            throw var12;
        } else {
            var1 -= 1973481190;
            var1 |= -815804161;
            var1 &= 209325537;
            var1 ^= -1628362890;
            return this.he;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 146817975;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        rn = var4;
    }
}
