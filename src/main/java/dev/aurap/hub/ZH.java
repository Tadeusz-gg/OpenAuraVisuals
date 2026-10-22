package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;

public record ZH(String r, String s, String Ez) {
    public static final int eP;




    public String logo() {
        int var1 = eP;
        var1 ^= 1076012310;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 = switch (var1) {
                default -> var1 ^ 557786830;
                case 1303713843 -> var1 ^ -1520673412;
                case 2079874676 -> {
                    var1 ^= 1248107429;
                    var1 += 1381414614;
                    yield var1 ^ 591411676;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            var1 |= -628450997;
            var1 |= -469890497;
            var1 -= -2067421489;
            var1 ^= -1260198341;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.r;
            }
        }

        IllegalStateException var13 = new IllegalStateException();
        throw var13;
    }

    public String logoText() {
        int var1 = eP;
        var1 ^= -123930887;
        int var2 = System.identityHashCode(this);
        Integer var10 = var2;
        if (var10 != null) {
            var1 &= 548680800;
            var1 |= -1732608659;
            var1 ^= 1138364393;
            var10 = var1;
            if (var10 == null) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            } else {
                return this.s;
            }
        } else {
            var1 >>= 13;
            var1 ^= -814845518;
            AssertionError var6 = new AssertionError();
            throw var6;
        }
    }

    public String inviteUrl() {
        int var1 = eP;
        var1 ^= -1152348359;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 -= -431716463;
            var1 += -1954506327;
            var1 += -1874532382;
            var1 ^= -849047546;
            return this.Ez;
        } else {
            var1 *= 901344225;
            var1 += 1089346295;
            var1 += 2138602143;
            var1 *= -891037929;
            var1 ^= 1564966123;
            RuntimeException var10 = new RuntimeException();
            throw var10;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 913544808;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        eP = var4;
    }
}
