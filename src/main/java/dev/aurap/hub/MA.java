package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class MA {
    public static final int[] l;
    public static final int K;

    static {
        K = of_2.xF(MethodHandles.lookup().lookupClass(), -847892650, 0);
        l = new int[Gu.values().length];
        try { l[Gu.TOGGLE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { l[Gu.NEXT.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { l[Gu.PREVIOUS.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { l[Gu.RESTART.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { l[Gu.SEEK.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
    }
}
