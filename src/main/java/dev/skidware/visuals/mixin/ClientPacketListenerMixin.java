package dev.skidware.visuals.mixin;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import dev.aurap.hub.GN;
import mvggs.modules.combat.totempop;
import dev.aurap.hub.PC;
import dev.aurap.hub.EventBus;
import dev.aurap.hub.ClientRuntime;
import dev.aurap.hub.TotemPopEvent;
import dev.aurap.hub.X;
import dev.aurap.hub.Yb;
import dev.aurap.hub.tc;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.network.packet.s2c.play.DamageTiltS2CPacket;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.particle.ParticleEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientPlayNetworkHandler.class})
public abstract class ClientPacketListenerMixin {
    private static final String ON_MAIN_THREAD = "Lnet/minecraft/network/protocol/PacketUtils;ensureRunningOnSameThread(Lnet/minecraft/network/protocol/Packet;Lnet/minecraft/network/PacketListener;Lnet/minecraft/network/PacketProcessor;)V";
    private static final byte EVENT_DEATH = 3;
    private static final byte EVENT_TOTEM = 35;

    public ClientPacketListenerMixin() {
    }

    private static ClientWorld aura$level() {
        return MinecraftClient.getInstance().world;
    }

    @Inject(
        method = {"onEntityAnimation"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/network/PacketApplyBatcher;)V",
            shift = Shift.AFTER
        )}
    )
    private void aura$animate(EntityAnimationS2CPacket packet, CallbackInfo ci) {
        int action = packet.getAnimationId();
        if (ClientRuntime.y() && aura$level() != null) {
            if (action == 4 || action == 5) {
                Entity entity = aura$level().getEntityById(packet.getEntityId());
                if (entity != null) {
                    ClientRuntime.Z().ZM().A(new Yb(entity, action == 5));
                }
            }
        }
    }

    @Inject(
        method = {"onDamageTilt"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/network/PacketApplyBatcher;)V",
            shift = Shift.AFTER
        )}
    )
    private void aura$hurt(DamageTiltS2CPacket packet, CallbackInfo ci) {
        if (ClientRuntime.y() && aura$level() != null) {
            Entity entity = aura$level().getEntityById(packet.id());
            if (entity != null) {
                ClientRuntime.Z().ZM().A(new GN(entity));
            }
        }
    }

    @Inject(
        method = {"onEntityDamage"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/network/PacketApplyBatcher;)V",
            shift = Shift.AFTER
        )}
    )
    private void aura$damage(EntityDamageS2CPacket packet, CallbackInfo ci) {
        ClientWorld level = aura$level();
        if (ClientRuntime.y() && level != null) {
            EventBus events = ClientRuntime.Z().ZM();
            if (events.l(PC.class)) {
                Entity victim = level.getEntityById(packet.entityId());
                if (victim != null) {
                    DamageSource source = packet.createDamageSource(level);
                    Entity cause = source.getAttacker();
                    Entity direct = source.getSource();
                    Entity player = MinecraftClient.getInstance().player;
                    events.A(new PC(victim, cause, direct, player != null && (cause == player || direct == player)));
                }
            }
        }
    }

    @Inject(
        method = {"onEntityStatus"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/network/PacketApplyBatcher;)V",
            shift = Shift.AFTER
        )}
    )
    private void aura$entityEvent(EntityStatusS2CPacket packet, CallbackInfo ci) {
        byte id = packet.getStatus();
        if (ClientRuntime.y() && aura$level() != null && (id == 3 || id == 35)) {
            Entity entity = packet.getEntity(aura$level());
            if (entity != null) {
                ClientRuntime.Z().ZM().A(id == 35 ? new TotemPopEvent(entity) : new X(entity));
            }
        }
    }

    @Inject(
        method = {"onDeathMessage"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/network/NetworkThreadUtils;forceMainThread(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;Lnet/minecraft/network/PacketApplyBatcher;)V",
            shift = Shift.AFTER
        )}
    )
    private void aura$localDeath(DeathMessageS2CPacket packet, CallbackInfo ci) {
        Entity player = MinecraftClient.getInstance().player;
        if (ClientRuntime.y() && player != null && packet.playerId() == player.getId()) {
            ClientRuntime.Z().ZM().A(new tc(packet.message() == null ? "" : packet.message().getString()));
        }
    }

    @WrapWithCondition(
        method = {"onEntityStatus"},
        at = {@At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/particle/ParticleManager;addEmitter(Lnet/minecraft/entity/Entity;Lnet/minecraft/particle/ParticleEffect;I)V"
        )}
    )
    private boolean aura$vanillaTotemParticles(ParticleManager engine, Entity entity, ParticleEffect particle, int lifetime) {
        return !totempop.HP();
    }
}
