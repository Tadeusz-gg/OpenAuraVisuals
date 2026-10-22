package dev.aurap.hub;

import dev.skidware.visuals.render.AuraRenderer;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.List;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class gY {
    private static final Logger cb;
    public static final int eb;

    private gY() {
    }

    public static void gE() {
        int var0 = eb;
        var0 ^= 401024929;
        FabricLoader var1 = FabricLoader.getInstance();
        Path var18 = var1.getConfigDir();
        Ud var19 = Ud.kz(var18);
        UG.pE(var19);
        Event var2 = ClientTickEvents.END_CLIENT_TICK;
        EndTick var3 = var1x -> {
            var19.nT().UJ();
            int var2x = eb;
            var2x ^= -194153196;
            int var3x = System.identityHashCode(var19);
            PH var4 = var19.ZM();
            sE var5x = sE.B;
            var4.A(var5x);
            Zx var19x = var19.YT();
            int var21x = var3x + 1;
            int var22x = var3x * var21x;
            var3x = var22x & 1;
            if (var3x != 0) {
                var2x -= -1714876447;
                var2x ^= -1489532139;
                var2x ^= 696601395;
                IllegalArgumentException var18x = new IllegalArgumentException();
                throw var18x;
            } else {
                var2x ^= 829063855;
                var2x &= -1375545029;
                var2x *= 1787898897;
                var2x >>>= 14;
                var2x ^= -272668367;
                long var12x = System.currentTimeMillis();
                var19x.M(var12x);
                C var13x = var19.VP();
                var13x.k();
                UG.fe(var19);
            }
        };
        var2.register(var3);
        var2 = ClientLifecycleEvents.CLIENT_STOPPING;
        ClientStopping var23 = var1x -> {
            int var2x = eb;
            var2x ^= -1122139264;
            int var3x = System.identityHashCode(var19);
            Y var4 = var19.M();
            var4.close();
            Zx var20x = var19.YT();
            var20x.Ll();
            C var21x = var19.VP();
            var21x.Mg();
            int var22x = var3x + 1;
            int var23x = var3x * var22x;
            var3x = var23x & 1;
            if (var3x == 0) {
                var2x -= 226288482;
                var2x &= 2066695814;
                var2x *= 1597686965;
                var2x -= 1394724853;
                var2x ^= -2122860530;
                xy var18x = var19.nT();
                var18x.LM();
                AuraRenderer var19x = var19.ZP();
                var19x.close();
            } else {
                var2x *= 1919433559;
                var2x += 57689089;
                var2x += 2090963223;
                var2x += 754337252;
                var2x ^= 1565593401;
                AssertionError var11x = new AssertionError();
                throw var11x;
            }
        };
        var2.register(var23);
        xy var21 = var19.nT();
        var21.a();
        Logger var22 = cb;
        var0 *= 1802079641;
        var0 &= 1617920958;
        var0 &= 1404967039;
        var0 ^= 204414430;
        long var24 = var0;
        long var5 = var24 + 1L;
        var5 = var24 * var5;
        long var25 = var5 & 1L;
        long var27;
        var0 = (var27 = var25 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var0 == 0) {
            NW var14 = var19.sP();
            List var15 = var14.dG();
            var0 = var15.size();
            Integer var17 = var0;
            var22.info("Aura Visuals ready on Minecraft {} ({} modules)", "1.21.11", var17);
        } else {
            IllegalStateException var13 = new IllegalStateException();
            throw var13;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -232248359;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        eb = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals");
        cb = var5;
    }
}
