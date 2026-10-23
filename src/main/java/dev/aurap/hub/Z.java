package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class Z {
    public static final int[] eM;
    public static final int YM;

    static {
        YM = of_2.xF(MethodHandles.lookup().lookupClass(), 482259292, 0);
        eM = new int[ModuleCategory.values().length];
        try { eM[ModuleCategory.COMBAT.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { eM[ModuleCategory.HUD.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { eM[ModuleCategory.ANIMATIONS.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { eM[ModuleCategory.SOUND.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { eM[ModuleCategory.WORLD.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
        try { eM[ModuleCategory.CLIENT.ordinal()] = 6; } catch (NoSuchFieldError ignored) {}
    }
}
