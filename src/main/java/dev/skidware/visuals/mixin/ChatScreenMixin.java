package dev.skidware.visuals.mixin;

import dev.aurap.hub.ClientRuntime;
import dev.aurap.hub.i_2;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ChatScreen.class})
public abstract class ChatScreenMixin {
    public ChatScreenMixin() {
    }

    @Inject(
        method = {"mouseClicked(Lnet/minecraft/client/gui/Click;Z)Z"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$hudEditorClick(Click event, boolean doubleClick, CallbackInfoReturnable cir) {
        if (ClientRuntime.y() && ClientRuntime.Z().Kx().Z().Wy(i_2.Tr(event.button()))) {
            cir.setReturnValue(true);
        }
    }

    @Inject(
        method = {"mouseScrolled(DDDD)Z"},
        at = {@At("HEAD")},
        cancellable = true
    )
    private void aura$hudEditorScroll(double x, double y, double scrollX, double scrollY, CallbackInfoReturnable cir) {
        if (ClientRuntime.y() && ClientRuntime.Z().Kx().Z().I(scrollY)) {
            cir.setReturnValue(true);
        }
    }
}
