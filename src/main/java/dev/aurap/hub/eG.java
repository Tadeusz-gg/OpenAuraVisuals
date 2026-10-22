package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Glass;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum eG {
    CLASSIC(createClassic()),
    PURPLE(createPurple()),
    SUNSET(createSunset()),
    CUSTOM(null);

    private final Oo eZ;
    public static final int WN;

    private eG(Oo var3) {
        this.eZ = var3;
    }

    public Oo palette() {
        int var1 = WN;
        var1 ^= -502527052;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var28;
        var2 = (var28 = var21 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += -1767621166;
            var1 <<= 3;
            var1 ^= -1475183612;
            Integer var23 = var1;
            if (var23 != null) {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            Integer var17 = switch (var1) {
                default -> var1 ^ -1128712958;
                case -1485620162 -> {
                    var1 &= 1118191114;
                    var1 *= -1510112775;
                    var1 -= 563318927;
                    var1 -= -148144057;
                    yield var1 ^ -598865591;
                }
                case 1984942270 -> var1 ^ -947498425;
            };
            if (var17 != null) {
                return this.eZ;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 453359600;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        WN = var4;
        
    }

    private static Oo createClassic() {
        Glass var10 = new Glass(3, -1340328361, 4.0F, 3.0F, 0.015F, 0.16F, -2167041);
        zG var11 = Oo.r(var10, -15456192);
        zG var12 = var11.v(1292309286);
        zG var13 = var12.wr(902948351, 550626815, 0.6F);
        zG var14 = var13.DP(449175295, 550626815);
        zG var15 = var14.zX(382854655);
        zG var16 = var15.P(650501887, 0);
        zG var17 = var16.E(-854017, -2299657, -4075035, -7494977);
        zG var18 = var17.Ke(-7684353, -10773515);
        zG var19 = var18.ng(-11559425);
        zG var20 = var19.e(-1601135);
        return var20.tB();
    }

    private static Oo createPurple() {
        zG var22 = Oo.T(-15724522);
        zG var23 = var22.h(234881023);
        zG var24 = var23.wr(352321535, 352321535, 0.5F);
        zG var25 = var24.DP(-434694369, 352321535);
        zG var26 = var25.zX(285212671);
        zG var27 = var26.P(218103807, -14935260);
        zG var28 = var27.E(-723721, -2236954, -6645080, -10526868);
        zG var29 = var28.Ke(-9546254, -11559425);
        zG var30 = var29.ng(-7705601);
        zG var31 = var30.e(-30070);
        return var31.tB();
    }

    private static Oo createSunset() {
        zG var33 = Oo.T(-15462639);
        zG var34 = var33.h(234877675);
        zG var35 = var34.wr(385871590, 318762726, 0.5F);
        zG var36 = var35.DP(-434235623, 352317158);
        zG var37 = var36.zX(285208294);
        zG var38 = var37.P(218099946, -14213599);
        zG var39 = var38.E(-2319, -1122344, -5004388, -9280417);
        zG var40 = var39.Ke(-30147, -45699);
        zG var41 = var40.ng(-34243);
        zG var42 = var41.e(-30070);
        return var42.tB();
    }
}
