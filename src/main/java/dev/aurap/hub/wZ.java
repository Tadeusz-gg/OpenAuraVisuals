package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import dev.skidware.visuals.client.render.SceneStage;
public class wZ {
    public static final int[] X;
    public static final int r;

    static {
        r = of_2.kj(MethodHandles.lookup().lookupClass(), 1920174757, 0);
        X = new int[SceneStage.values().length];
        try { X[SceneStage.LEVEL_START.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { X[SceneStage.TERRAIN.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { X[SceneStage.LEVEL.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { X[SceneStage.SCENE.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
    }
}
