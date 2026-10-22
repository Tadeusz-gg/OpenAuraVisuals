package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import mvggs.modules.combat.totempop;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({InGameOverlayRenderer.class})
public abstract class ItemActivationMixin {
    private static final String ITEM_DRAW = "Lnet/minecraft/client/renderer/item/ItemStackRenderState;submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;III)V";

    public ItemActivationMixin() {
    }

    @WrapOperation(
        method = {"renderFloatingItem"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V"
        )}
    )
    private void aura$totemScale(MatrixStack pose, float x, float y, float z, Operation original) {
        float k = totempop.O();
        original.call(new Object[]{pose, x * k, y * k, z * k});
    }

    @WrapOperation(
        method = {"renderFloatingItem"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/render/item/ItemRenderState;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;III)V"
        )}
    )
    private void aura$totemTint(
        ItemRenderState item, MatrixStack pose, OrderedRenderCommandQueue collector, int light, int overlay, int outline, Operation original
    ) {
        totempop.F = totempop.BM();

        try {
            original.call(new Object[]{item, pose, collector, light, overlay, outline});
        } finally {
            totempop.F = 0;
        }
    }
}
