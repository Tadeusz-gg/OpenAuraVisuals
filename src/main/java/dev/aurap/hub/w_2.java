package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.text.Text;
import org.slf4j.Logger;

public class w_2 implements CommandOutput {
    public static final int vb;

    public w_2() {
    }

    public void sendMessage(Text message) {
        int var2 = vb;
        var2 ^= 196177268;
        int var3 = System.identityHashCode(this);
        Logger var4 = i_2.LOG;
        String var5 = message.getString();
        Integer var24 = var3;
        if (var24 == null) {
            var2 += -1679316108;
            var2 ^= -794216992;
            var2 ^= -548688093;
            var2 ^= 45464687;
            long var6 = var2;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var34;
            int var25 = (var34 = var6 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var25 == 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            }
        } else {
            var2 ^= -113101504;
            var2 -= 904235141;
            var2 ^= 1626469443;
            long var20 = var2;
            long var29 = var20 + 1L;
            var29 = var20 * var29;
            long var21 = var29 & 1L;
            long var35;
            var2 = (var35 = var21 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var2 == 0) {
                var4.warn("Command feedback: {}", var5);
                return;
            }
        }

        AssertionError var23 = new AssertionError();
        throw var23;
    }

    public boolean shouldReceiveFeedback() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    public boolean shouldTrackOutput() {
        int var1 = System.identityHashCode(this);
        return true;
    }

    public boolean shouldBroadcastConsoleToOps() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1883197247;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        vb = var4;
    }
}
