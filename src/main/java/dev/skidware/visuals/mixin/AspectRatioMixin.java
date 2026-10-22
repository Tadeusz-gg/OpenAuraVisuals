package dev.skidware.visuals.mixin;

import mvggs.modules.world.aspectratio;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({GameRenderer.class})
public abstract class AspectRatioMixin {
    public AspectRatioMixin() {
    }

    @ModifyArg(
        method = {"getBasicProjectionMatrix"},
        at = @At(
            value = "INVOKE",
            target = "Lorg/joml/Matrix4f;perspective(FFFF)Lorg/joml/Matrix4f;"
        ),
        index = 1
    )
    private float aura$aspect(float nativeRatio) {
        return aspectratio.P(nativeRatio);
    }
}
