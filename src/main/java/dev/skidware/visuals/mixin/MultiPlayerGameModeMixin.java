package dev.skidware.visuals.mixin;

import dev.aurap.hub.ClientRuntime;
import dev.aurap.hub.o_2;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ClientPlayerInteractionManager.class})
public abstract class MultiPlayerGameModeMixin {
    public MultiPlayerGameModeMixin() {
    }

    @Inject(
        method = {"interactEntity"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$interact(PlayerEntity player, Entity target, Hand hand, CallbackInfoReturnable cir) {
        if (ClientRuntime.y() && ClientRuntime.Z().M().owns(target)) {
            cir.setReturnValue(ActionResult.PASS);
        }
    }

    @Inject(
        method = {"interactEntityAtLocation"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$interactAt(PlayerEntity player, Entity target, EntityHitResult hit, Hand hand, CallbackInfoReturnable cir) {
        if (ClientRuntime.y() && ClientRuntime.Z().M().owns(target)) {
            cir.setReturnValue(ActionResult.PASS);
        }
    }

    @Inject(
        method = {"attackEntity"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$attack(PlayerEntity player, Entity target, CallbackInfo ci) {
        if (ClientRuntime.y() && player == MinecraftClient.getInstance().player) {
            float strength = player.getAttackCooldownProgress(0.5F);
            ClientRuntime.Z().ZM().A(new o_2(target, strength));
            if (ClientRuntime.Z().M().owns(target)) {
                ClientRuntime.Z().M().attack(player, strength);
                player.resetTicksSince();
                ci.cancel();
            }
        }
    }
}
