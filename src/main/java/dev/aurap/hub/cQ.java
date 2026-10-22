package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class cQ {
    public static final int[] Z;
    public static final int[] X;
    public static final int mG;

    static {
        mG = of_2.xF(MethodHandles.lookup().lookupClass(), -1655384065, 0);
        X = new int[H.values().length];
        try { X[H.DENIED.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { X[H.MISSING_TOOL.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { X[H.UNSUPPORTED.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        Z = new int[Gu.values().length];
        try { Z[Gu.TOGGLE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { Z[Gu.RESTART.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { Z[Gu.SEEK.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
    }
}
