package dev.aurap.hub;

import java.lang.invoke.MethodHandles;

public class TR {
    public static final int[] g;
    public static final int[] C;
    public static final int Rz;

    static {
        Rz = of_2.xF(MethodHandles.lookup().lookupClass(), -666424651, 0);
        C = new int[Py.values().length];
        try { C[Py.UNAVAILABLE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { C[Py.SERVER_ERROR.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { C[Py.SESSION_UNKNOWN.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { C[Py.CHALLENGE_INVALID.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { C[Py.REPLAY.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
        try { C[Py.CLOCK_SKEW.ordinal()] = 6; } catch (NoSuchFieldError ignored) {}
        try { C[Py.NOT_FOUND.ordinal()] = 7; } catch (NoSuchFieldError ignored) {}
        try { C[Py.RATE_LIMITED.ordinal()] = 8; } catch (NoSuchFieldError ignored) {}
        try { C[Py.PAYLOAD_TOO_LARGE.ordinal()] = 9; } catch (NoSuchFieldError ignored) {}
        try { C[Py.MALFORMED.ordinal()] = 10; } catch (NoSuchFieldError ignored) {}
        g = new int[BR.values().length];
        try { g[BR.OFFLINE.ordinal()] = 1; } catch (NoSuchFieldError ignored) {}
        try { g[BR.SYNCING.ordinal()] = 2; } catch (NoSuchFieldError ignored) {}
        try { g[BR.SYNCED.ordinal()] = 3; } catch (NoSuchFieldError ignored) {}
        try { g[BR.PENDING.ordinal()] = 4; } catch (NoSuchFieldError ignored) {}
        try { g[BR.FAILED.ordinal()] = 5; } catch (NoSuchFieldError ignored) {}
    }
}
