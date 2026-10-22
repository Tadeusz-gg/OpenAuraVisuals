package dev.aurap.hub;

public interface IE {
    boolean v();

    void fa(boolean var1);

    default void wq() {
        int var1 = -1073644775;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 == null) {
            var1 *= 1295055661;
            var1 <<= 4;
            var1 ^= 929699398;
            var1 -= 776494892;
            var1 ^= -1622746525;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var27;
            int var20 = (var27 = var19 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var20 == 0) {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            var1 *= -850292413;
            var1 ^= -499251290;
            var1 ^= -1580358879;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            int var3 = var1 + 2;
            var22 *= var3;
            var1 += 3;
            var22 *= var1;
            var1 = var22 & 7;
            if (var1 == 0) {
                this.fa(true);
                return;
            }
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }
}
