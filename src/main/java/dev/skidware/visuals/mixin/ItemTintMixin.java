package dev.skidware.visuals.mixin;

import mvggs.modules.combat.totempop;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(
    targets = {"net/minecraft/client/render/item/ItemRenderState$LayerRenderState"}
)
public abstract class ItemTintMixin {
    public ItemTintMixin() {
    }

    @ModifyArg(
        method = {"render"},
        index = 5,
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;submitItem(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/item/ItemDisplayContext;III[ILjava/util/List;Lnet/minecraft/client/render/RenderLayer;Lnet/minecraft/client/render/item/ItemRenderState$Glint;)V"
        )
    )
    private int[] aura$tint(int[] tints) {
        return totempop.C(tints);
    }
}
