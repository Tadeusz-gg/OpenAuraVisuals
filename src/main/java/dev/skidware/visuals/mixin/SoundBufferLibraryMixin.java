package dev.skidware.visuals.mixin;

import dev.aurap.hub.bw_2;
import dev.aurap.hub.i_2;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.client.sound.SoundLoader;
import net.minecraft.client.sound.StaticSound;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({SoundLoader.class})
public abstract class SoundBufferLibraryMixin {
    @Unique
    private Map<Path, CompletableFuture<StaticSound>> aura$custom;
    @Unique
    private Map<Path, Long> aura$stamp;

    public SoundBufferLibraryMixin() {
    }

    @Inject(
        method = {"loadStatic"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$customFile(Identifier location, CallbackInfoReturnable cir) {
        Path file = bw_2.DZ(location.getNamespace(), location.getPath());
        if (file != null) {
            long stamp = bw_2.f(file);
            if (stamp != 0L) {
                if (this.aura$custom == null) {
                    this.aura$custom = new HashMap();
                    this.aura$stamp = new HashMap();
                }

                if (!this.aura$custom.containsKey(file) || !Long.valueOf(stamp).equals(this.aura$stamp.getOrDefault(file, 0L))) {
                    aura$release(this.aura$custom.remove(file));
                    this.aura$stamp.put(file, stamp);
                    this.aura$custom.put(file, CompletableFuture.supplyAsync(() -> i_2.Nk(file)));
                }

                cir.setReturnValue((Object) this.aura$custom.get(file));
            }
        }
    }

    @Inject(
        method = {"close"},
        at = {@At("HEAD")}
    )
    private void aura$clear(CallbackInfo ci) {
        this.aura$release();
    }

    @Unique
    private void aura$release() {
        if (this.aura$custom != null) {
            this.aura$custom.values().forEach(v -> aura$release(v));
            this.aura$custom.clear();
            this.aura$stamp.clear();
        }
    }

    @Unique
    private static void aura$release(CompletableFuture<StaticSound> old) {
        if (old != null) {
            old.thenAccept(buffer -> {
                if (buffer != null) {
                    buffer.close();
                }
            });
        }
    }
}
