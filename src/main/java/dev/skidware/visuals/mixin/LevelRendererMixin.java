package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import dev.aurap.hub.ClientRuntime;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.WorldRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({WorldRenderer.class})
public abstract class LevelRendererMixin {
    private static final float[] VIEW = new float[16];
    private static final float[] PROJECTION = new float[16];

    public LevelRendererMixin() {
    }

    @Inject(
        method = {"render"},
        at = {@At("HEAD")}
    )
    private void aura$capture(
        CallbackInfo ci,
        @Local(argsOnly = true) Camera camera,
        @Local(argsOnly = true,ordinal = 0) Matrix4f view,
        @Local(argsOnly = true,ordinal = 1) Matrix4f projection
    ) {
        if (ClientRuntime.y()) {
            view.get(VIEW);
            projection.get(PROJECTION);
            ClientRuntime.Z().Ul().worldRendered(VIEW, PROJECTION, camera.getCameraPos().x, camera.getCameraPos().y, camera.getCameraPos().z);
        }
    }

    @Inject(
        method = {"pushEntityRenders"},
        at = {@At("HEAD")}
    )
    private void aura$terrainRendered(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().terrainRendered();
        }
    }

    @Inject(
        method = {"render"},
        at = {@At("TAIL")}
    )
    private void aura$levelRendered(CallbackInfo ci) {
        if (ClientRuntime.y()) {
            ClientRuntime.Z().Ul().levelRendered();
        }
    }
}
