package dev.skidware.visuals.mixin;

import mvggs.modules.combat.deatheffect;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.screen.DeathScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({DeathScreen.class})
public abstract class DeathScreenMixin {
    public DeathScreenMixin() {
    }

    @Inject(
        method = {"render"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$intro(CallbackInfo ci) {
        if (deatheffect.BU()) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"renderBackground"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$background(CallbackInfo ci) {
        if (deatheffect.c()) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"drawTitles"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$texts(CallbackInfo ci) {
        if (deatheffect.c()) {
            ci.cancel();
        }
    }

    @Inject(
        method = {"mouseClicked"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$skip(Click event, boolean doubleClick, CallbackInfoReturnable cir) {
        if (deatheffect.xD()) {
            cir.setReturnValue(true);
        }
    }
}
