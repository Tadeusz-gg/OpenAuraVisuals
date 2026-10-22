package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import mvggs.modules.sound.hitsounds;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({SoundSystem.class})
public abstract class SoundEngineMixin {
    public SoundEngineMixin() {
    }

    @ModifyArg(
        method = {"play"},
        index = 0,
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/sound/SoundSystem;getAdjustedVolume(FLnet/minecraft/sound/SoundCategory;)F"
        )
    )
    private float aura$startVolume(float volume, @Local(argsOnly = true) SoundInstance sound) {
        return volume * hitsounds.r(sound);
    }

    @ModifyReturnValue(
        method = {"getAdjustedVolume(Lnet/minecraft/client/sound/SoundInstance;)F"},
        at = @At("RETURN")
    )
    private float aura$refreshVolume(float volume, SoundInstance sound) {
        return volume * hitsounds.r(sound);
    }
}
