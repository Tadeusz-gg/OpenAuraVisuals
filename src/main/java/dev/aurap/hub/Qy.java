package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class Qy {
    public static final int[] Q;
    public static final int i;

    static {
        i = of_2.xF(MethodHandles.lookup().lookupClass(), 880572808, 0);
        Q = new int[BA.values().length];
        try { Q[BA.LOADING.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { Q[BA.MISSING.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { Q[BA.ERROR.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { Q[BA.FOUND.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { Q[BA.IDLE.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
    }
}
