package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class De {
    public static final int[] E;
    public static final int d;

    static {
        d = of_2.kj(MethodHandles.lookup().lookupClass(), 1267657689, 0);
        E = new int[Gu.values().length];
        try { E[Gu.TOGGLE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { E[Gu.NEXT.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { E[Gu.PREVIOUS.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { E[Gu.RESTART.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { E[Gu.SEEK.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
    }
}
