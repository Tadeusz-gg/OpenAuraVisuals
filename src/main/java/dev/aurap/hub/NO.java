package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class NO {
    public static final int[] C;
    public static final int JS;

    static {
        JS = of_2.ro(MethodHandles.lookup().lookupClass(), -175585678, 0);
        C = new int[Uo.values().length];
        try { C[Uo.ACTIVE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { C[Uo.CONNECTING.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { C[Uo.RETRYING.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { C[Uo.EXPIRED.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { C[Uo.REVOKED.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
        try { C[Uo.ERROR.ordinal()] = 6; } catch (NoSuchFieldError ignored) {}
    }
}
