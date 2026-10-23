package dev.aurap.hub;

import java.util.Map;

/** Keeps legacy obfuscation lookups stable while implementation classes use readable names. */
public final class LegacyClassCompatibility {
    private static final Map<String, String> LEGACY_NAMES = Map.ofEntries(
        Map.entry("dev.aurap.hub.ClientRuntime", "dev.aurap.hub.Ud"),
        Map.entry("dev.aurap.hub.Module", "dev.aurap.hub.Yn"),
        Map.entry("dev.aurap.hub.Setting", "dev.aurap.hub.xB"),
        Map.entry("dev.aurap.hub.BooleanSetting", "dev.aurap.hub.JL"),
        Map.entry("dev.aurap.hub.NumberSetting", "dev.aurap.hub.Uq"),
        Map.entry("dev.aurap.hub.ModeSetting", "dev.aurap.hub.r_2"),
        Map.entry("dev.aurap.hub.ColorSetting", "dev.aurap.hub.Fk"),
        Map.entry("dev.aurap.hub.KeybindSetting", "dev.aurap.hub.ia"),
        Map.entry("dev.aurap.hub.ActionSetting", "dev.aurap.hub.cS"),
        Map.entry("dev.aurap.hub.ModuleManager", "dev.aurap.hub.NW"),
        Map.entry("dev.aurap.hub.ModuleRegistry", "dev.aurap.hub.l_2"),
        Map.entry("dev.aurap.hub.HudModule", "dev.aurap.hub.tR_2"),
        Map.entry("dev.aurap.hub.ModuleCategory", "dev.aurap.hub.AJ"),
        Map.entry("dev.aurap.hub.EventBus", "dev.aurap.hub.PH"),
        Map.entry("dev.aurap.hub.EventListener", "dev.aurap.hub.wD"),
        Map.entry("dev.aurap.hub.EventSubscription", "dev.aurap.hub.kf"),
        Map.entry("dev.aurap.hub.RenderEvent", "dev.aurap.hub.T"),
        Map.entry("dev.aurap.hub.TickEvent", "dev.aurap.hub.sE"),
        Map.entry("dev.aurap.hub.HitEvent", "dev.aurap.hub.Hm"),
        Map.entry("dev.aurap.hub.KillEvent", "dev.aurap.hub.I"),
        Map.entry("dev.aurap.hub.TotemPopEvent", "dev.aurap.hub.Vt"),
        Map.entry("dev.aurap.hub.Cancellable", "dev.aurap.hub.IE"),
        Map.entry("dev.aurap.hub.CancellableEvent", "dev.aurap.hub.zB"),
        Map.entry("dev.aurap.hub.SoundPlaybackEvent", "dev.aurap.hub.Kl")
    );

    private LegacyClassCompatibility() {}

    public static String originalName(Class<?> type) {
        String name = type.getName();
        String moduleName = legacyModuleName(name);
        String legacyName = moduleName != null ? moduleName : LEGACY_NAMES.getOrDefault(name, name);
        return legacyName.replaceFirst("_[0-9]+$", "");
    }

    private static String legacyModuleName(String name) {
        return switch (name) {
            case "mvggs.modules.combat.hitmarker" -> "dev.aurap.hub.wQ";
            case "mvggs.modules.combat.damagenumbers" -> "dev.aurap.hub.Qt";
            case "mvggs.modules.combat.hitparticles" -> "dev.aurap.hub.hd";
            case "mvggs.modules.combat.hitbubbles" -> "dev.aurap.hub.ss";
            case "mvggs.modules.combat.targetesp" -> "dev.aurap.hub.eU";
            case "mvggs.modules.combat.killeffect" -> "dev.aurap.hub.n";
            case "mvggs.modules.combat.deatheffect" -> "dev.aurap.hub.U";
            case "mvggs.modules.combat.totempop" -> "dev.aurap.hub.L";
            case "mvggs.modules.combat.hitcolor" -> "dev.aurap.hub.tn";
            case "mvggs.modules.combat.hitboxcustomizer" -> "dev.aurap.hub.a";
            case "mvggs.modules.hud.hudstyle" -> "dev.aurap.hub.E";
            case "mvggs.modules.hud.targethud" -> "dev.aurap.hub.Td";
            case "mvggs.modules.hud.watermark" -> "dev.aurap.hub.fm";
            case "mvggs.modules.hud.dynamicisland" -> "dev.aurap.hub.Hv";
            case "mvggs.modules.hud.potions" -> "dev.aurap.hub.y";
            case "mvggs.modules.hud.cooldowns" -> "dev.aurap.hub.Ld";
            case "mvggs.modules.hud.combocounter" -> "dev.aurap.hub.G";
            case "mvggs.modules.hud.cooldownring" -> "dev.aurap.hub.hZ";
            case "mvggs.modules.hud.crosshair" -> "dev.aurap.hub.F";
            case "mvggs.modules.animations.swinganimations" -> "dev.aurap.hub.VZ";
            case "mvggs.modules.animations.knife" -> "dev.aurap.hub.M";
            case "mvggs.modules.animations.hurtcam" -> "dev.aurap.hub.ya";
            case "mvggs.modules.sound.hitsounds" -> "dev.aurap.hub.PO";
            case "mvggs.modules.world.jumpcircles" -> "dev.aurap.hub.is";
            case "mvggs.modules.world.jumpparticles" -> "dev.aurap.hub.k";
            case "mvggs.modules.world.ambientparticles" -> "dev.aurap.hub.W";
            case "mvggs.modules.world.trails" -> "dev.aurap.hub.cA";
            case "mvggs.modules.world.halo" -> "dev.aurap.hub.ek";
            case "mvggs.modules.world.chinahat" -> "dev.aurap.hub.Ko";
            case "mvggs.modules.world.atmosphere" -> "dev.aurap.hub.iY";
            case "mvggs.modules.world.motionblur" -> "dev.aurap.hub.A";
            case "mvggs.modules.world.colorsaturation" -> "dev.aurap.hub.qh";
            case "mvggs.modules.world.aspectratio" -> "dev.aurap.hub.Cy";
            case "mvggs.modules.world.fullbright" -> "dev.aurap.hub.cC";
            case "mvggs.modules.client.clickgui" -> "dev.aurap.hub.ZW";
            case "mvggs.modules.client.performance" -> "dev.aurap.hub.JT";
            default -> null;
        };
    }
}
