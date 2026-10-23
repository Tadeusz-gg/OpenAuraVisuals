package dev.skidware.visuals.mixin;

import dev.aurap.hub.ClientRuntime;
import dev.aurap.hub.i_2;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.BossBarHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({BossBarHud.class})
public abstract class BossHealthOverlayMixin {
    @Unique
    private boolean aura$shifted;

    public BossHealthOverlayMixin() {
    }

    @Inject(
        method = {"render(Lnet/minecraft/client/gui/DrawContext;)V"},
        at = {@At("HEAD")}
    )
    private void aura$islandOffset(DrawContext graphics, CallbackInfo ci) {
        this.aura$push(graphics);
    }

    @Inject(
        method = {"render(Lnet/minecraft/client/gui/DrawContext;)V"},
        at = {@At("RETURN")}
    )
    private void aura$islandOffsetEnd(DrawContext graphics, CallbackInfo ci) {
        this.aura$pop(graphics);
    }

    @Unique
    private void aura$push(Object graphics) {
        float inset = ClientRuntime.y() ? ClientRuntime.Z().Kx().rb() : 0.0F;
        this.aura$shifted = inset > 0.25F;
        if (this.aura$shifted) {
            i_2.Sf(graphics, 0.0F, inset);
        }
    }

    @Unique
    private void aura$pop(Object graphics) {
        if (this.aura$shifted) {
            i_2.mB(graphics);
        }

        this.aura$shifted = false;
    }
}
