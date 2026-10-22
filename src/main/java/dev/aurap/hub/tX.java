package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class tX {
    public static final int[] v;
    public static final int jX;

    static {
        jX = of_2.kj(MethodHandles.lookup().lookupClass(), -25445481, 0);
        v = new int[Gu.values().length];
        try { v[Gu.TOGGLE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { v[Gu.NEXT.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { v[Gu.PREVIOUS.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { v[Gu.RESTART.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { v[Gu.SEEK.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
    }
}
