package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class Z {
    public static final int[] eM;
    public static final int YM;

    static {
        YM = of_2.xF(MethodHandles.lookup().lookupClass(), 482259292, 0);
        eM = new int[AJ.values().length];
        try { eM[AJ.COMBAT.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { eM[AJ.HUD.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { eM[AJ.ANIMATIONS.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { eM[AJ.SOUND.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { eM[AJ.WORLD.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
        try { eM[AJ.CLIENT.ordinal()] = 6; } catch (NoSuchFieldError ignored) {}
    }
}
