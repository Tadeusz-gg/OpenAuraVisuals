package dev.skidware.visuals.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(
    targets = {"net/minecraft/entity/player/ItemCooldownManager$Entry"}
)
public interface CooldownInstanceAccessor {
    @Accessor("startTick")
    int aura$startTime();

    @Accessor("endTick")
    int aura$endTime();
}
