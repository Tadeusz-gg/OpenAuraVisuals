package dev.skidware.visuals.mixin;

import java.util.Map;
import net.minecraft.entity.player.ItemCooldownManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ItemCooldownManager.class})
public interface ItemCooldownsAccessor {
    @Accessor("entries")
    Map aura$cooldowns();

    @Accessor("tick")
    int aura$tickCount();
}
