package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import mvggs.modules.world.fullbright;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({LightmapTextureManager.class})
public abstract class FullbrightMixin {
    private static final String UPDATE = "updateLightTexture";
    private static final String NIGHT_VISION = "Lnet/minecraft/client/renderer/GameRenderer;getNightVisionScale(Lnet/minecraft/world/entity/LivingEntity;F)F";

    public FullbrightMixin() {
    }

    @ModifyExpressionValue(
        method = {"update"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/network/ClientPlayerEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z",
            ordinal = 0
        )}
    )
    private boolean aura$useNightVision(boolean original) {
        return original || fullbright.g() > 0.0F;
    }

    @WrapOperation(
        method = {"update"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/render/GameRenderer;getNightVisionStrength(Lnet/minecraft/entity/LivingEntity;F)F"
        )}
    )
    private float aura$lightmapStrength(LivingEntity entity, float partialTick, Operation original) {
        float vanilla = entity.hasStatusEffect(StatusEffects.NIGHT_VISION) ? (Float)original.call(new Object[]{entity, partialTick}) : 0.0F;
        return Math.max(vanilla, fullbright.g());
    }
}
