package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum KI {
    LOADING(),
    MENU(),
    SINGLEPLAYER(),
    MULTIPLAYER(),
    LAN(),
    REALMS();

    public static final int gw;

    private KI() {
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1693966547;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        gw = var4;
    }
}
