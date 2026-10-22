package dev.skidware.visuals.mixin;

import mvggs.modules.animations.knife;
import mvggs.modules.combat.deatheffect;
import mvggs.modules.animations.swinganimations;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({LivingEntity.class})
public abstract class LivingEntityMixin {
    public LivingEntityMixin() {
    }

    @Inject(
        method = {"getHandSwingDuration"},
        at = {@At("RETURN")},
        cancellable = true
    )
    private void aura$swingDuration(CallbackInfoReturnable cir) {
        if ((Object)this == MinecraftClient.getInstance().player) {
            cir.setReturnValue(swinganimations.K(cir.getReturnValueI()));
        }
    }

    @Inject(
        method = {"swingHand(Lnet/minecraft/util/Hand;Z)V"},
        at = {@At(
            value = "FIELD",
            target = "Lnet/minecraft/entity/LivingEntity;handSwingTicks:I",
            opcode = 181
        )}
    )
    private void aura$swingStarted(Hand hand, boolean self, CallbackInfo ci) {
        if ((Object)this == MinecraftClient.getInstance().player) {
            knife.EM(hand);
        }
    }

    @Inject(
        method = {"addDeathParticles"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$ownDeathCloud(CallbackInfo ci) {
        if ((Object)this == MinecraftClient.getInstance().player && deatheffect.b()) {
            ci.cancel();
        }
    }
}
