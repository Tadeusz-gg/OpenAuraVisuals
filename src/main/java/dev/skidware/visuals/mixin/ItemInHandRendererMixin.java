package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import mvggs.modules.animations.knife;
import mvggs.modules.animations.swinganimations;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({HeldItemRenderer.class})
public abstract class ItemInHandRendererMixin {
    private static final String ARM = "renderArmWithItem";
    private static final String ITEM_DRAW = "Lnet/minecraft/client/renderer/ItemInHandRenderer;renderItem(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemDisplayContext;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;I)V";

    public ItemInHandRendererMixin() {
    }

    @Inject(
        method = {"applySwingOffset"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$swing(MatrixStack pose, Arm arm, float progress, CallbackInfo ci) {
        if (knife.Nt() || swinganimations.ey(pose, arm, progress)) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"applyEquipOffset"},
        at = {@At("TAIL")}
    )
    private void aura$placement(MatrixStack pose, Arm arm, float equipProgress, CallbackInfo ci) {
        swinganimations.GY(pose, arm);
    }

    @WrapMethod(
        method = {"renderFirstPersonItem"}
    )
    private void aura$knifeArm(
        AbstractClientPlayerEntity player,
        float partialTick,
        float pitch,
        Hand hand,
        float swing,
        ItemStack stack,
        float equip,
        MatrixStack pose,
        OrderedRenderCommandQueue collector,
        int light,
        Operation original
    ) {
        if (!knife.iD(hand, stack)) {
            original.call(new Object[]{player, partialTick, pitch, hand, swing, stack, equip, pose, collector, light});
        } else {
            knife.Hb(true);

            try {
                original.call(new Object[]{player, partialTick, pitch, hand, 0.0F, stack, 0.0F, pose, collector, light});
            } finally {
                knife.Hb(false);
            }
        }
    }

    @WrapOperation(
        method = {"renderFirstPersonItem"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/render/item/HeldItemRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;I)V"
        )}
    )
    private void aura$knifeItem(
        HeldItemRenderer self,
        LivingEntity entity,
        ItemStack stack,
        ItemDisplayContext context,
        MatrixStack pose,
        OrderedRenderCommandQueue collector,
        int light,
        Operation original
    ) {
        if (knife.Nt()) {
            knife.Te(pose, collector, light);
        } else {
            original.call(new Object[]{self, entity, stack, context, pose, collector, light});
        }
    }
}
