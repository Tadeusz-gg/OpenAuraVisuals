package dev.aurap.hub;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class Jh extends Thread {
    private final InputStream YU;
    private final ByteArrayOutputStream uX;
    public static final int lB;

    public Jh(InputStream var1) {
        super("Aura Media Output");
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        this.uX = var2;
        this.setDaemon(true);
        this.YU = var1;
    }

    @Override
    public void run() {
        try (java.io.InputStream in = this.YU) {
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) != -1) {
                int remaining = 262144 - this.uX.size();
                if (remaining > 0) {
                    this.uX.write(buf, 0, Math.min(n, remaining));
                }
            }
        } catch (Throwable ignored) {
        }
    }

    public String text() {
        int var1 = lB;
        var1 ^= 929485568;
        int var2 = System.identityHashCode(this);
        ByteArrayOutputStream var3 = this.uX;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var35;
        var2 = (var35 = var4 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1914023845;
            var1 -= 1187436794;
            var1 ^= 1453519108;
            var4 = var1;
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var36;
            var2 = (var36 = var4 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            }
        } else {
            var1 |= 1292086800;
            var1 ^= -151217006;
            long var16 = var1;
            var4 = var16 + 1L;
            var4 = var16 * var4;
            long var17 = var4 & 1L;
            long var37;
            var1 = (var37 = var17 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                Charset var20 = StandardCharsets.UTF_8;
                return var3.toString(var20);
            }
        }

        AssertionError var19 = new AssertionError();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -243461269;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        lB = var4;
    }
}
