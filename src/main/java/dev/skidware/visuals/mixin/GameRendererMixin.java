package dev.skidware.visuals.mixin;

import dev.aurap.hub.ClientRuntime;
import mvggs.modules.animations.hurtcam;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public abstract class GameRendererMixin {
    private static final String GUI_DRAW = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V";
    private static final String TILT = "Lcom/mojang/math/Axis;rotationDegrees(F)Lorg/joml/Quaternionf;";
    private static final int TILT_ARG = 0;

    public GameRendererMixin() {
    }

    @Inject(
        method = {"render"},
        at = {@At("HEAD")}
    )
    private void aura$frameStart(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().frameStart();
        }
    }

    @Inject(
        method = {"render"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"
        )}
    )
    private void aura$beforeGui(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().beforeGui();
        }
    }

    @Inject(
        method = {"render"},
        at = {@At("TAIL")}
    )
    private void aura$afterGui(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().afterGui();
        }
    }

    @Inject(
        method = {"renderWorld"},
        at = {@At("TAIL")}
    )
    private void aura$sceneRendered(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().sceneRendered();
        }
    }

    @ModifyArg(
        method = {"tiltViewWhenHurt"},
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/util/math/RotationAxis;rotationDegrees(F)Lorg/joml/Quaternionf;",
            ordinal = 2
        ),
        index = 0
    )
    private float aura$hurtTilt(float degrees) {
        return hurtcam.C(degrees);
    }
}
