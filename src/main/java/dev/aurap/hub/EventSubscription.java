package dev.aurap.hub;

@FunctionalInterface
public interface EventSubscription extends AutoCloseable {
    void unsubscribe();

    @Override
    default void close() {
        int var1 = -897577862;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 |= -1674318529;
            var1 ^= -966975218;
            this.unsubscribe();
        } else {
            var1 |= -1893528090;
            var1 += -898865822;
            var1 ^= -1225752104;
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }
}
