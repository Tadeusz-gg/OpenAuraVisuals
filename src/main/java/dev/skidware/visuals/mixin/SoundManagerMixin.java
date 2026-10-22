package dev.skidware.visuals.mixin;

import dev.aurap.hub.Kl;
import dev.aurap.hub.Ud;
import dev.aurap.hub.i_2;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.client.sound.SoundSystem.PlayResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({SoundManager.class})
public abstract class SoundManagerMixin {
    public SoundManagerMixin() {
    }

    private static boolean aura$cancelled(SoundInstance sound) {
        return Ud.y() && Ud.Z().ZM().l(Kl.class) ? ((Kl)Ud.Z().ZM().A(new Kl(i_2.tS(sound)))).v() : false;
    }

    @Inject(
        method = {"play(Lnet/minecraft/client/sound/SoundInstance;)Lnet/minecraft/client/sound/SoundSystem$PlayResult;"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$play(SoundInstance sound, CallbackInfoReturnable cir) {
        if (aura$cancelled(sound)) {
            cir.setReturnValue(PlayResult.NOT_STARTED);
        }
    }
}
