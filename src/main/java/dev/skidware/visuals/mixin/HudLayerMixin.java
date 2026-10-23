package dev.skidware.visuals.mixin;

import mvggs.modules.hud.crosshair;
import mvggs.modules.combat.deatheffect;
import dev.aurap.hub.ClientRuntime;
import mvggs.modules.hud.potions;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({InGameHud.class})
public abstract class HudLayerMixin {
    public HudLayerMixin() {
    }

    @Inject(
        method = {"renderStatusEffectOverlay"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$hideVanillaEffects(CallbackInfo ci) {
        if (ClientRuntime.y() && ((potions)ClientRuntime.Z().sP().tG(potions.class)).jC()) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"renderCrosshair"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$hideCrosshair(CallbackInfo ci) {
        if (deatheffect.VC() || crosshair.NS()) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V"},
        at = {@At("TAIL")}
    )
    private void aura$itemLayer(DrawContext graphics, RenderTickCounter delta, CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Kx().px(graphics);
        }
    }
}
