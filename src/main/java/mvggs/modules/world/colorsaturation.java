package mvggs.modules.world;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class colorsaturation extends Yn {
    private final Uq O;
    private final Uq Qq;
    private final Uq n;
    private final Uq BL;
    public static final int Z;

    public colorsaturation() {
        super("color_saturation", "Color Saturation", AJ.WORLD);
        AJ var1 = AJ.WORLD;

        Uq var2 = new Uq("saturation", "Saturation", 150.0F, 0.0F, 200.0F);
        Uq var3 = var2.W(1.0F);
        Uq var4 = var3.L("%");
        xB var5 = var4.q("Color strength: 0% grayscale, 100% unchanged, 200% double.");
        Uq var6 = (Uq)var5;
        xB var7 = this.vn(var6);
        Uq var8 = (Uq)var7;
        this.O = var8;
        Uq var9 = new Uq("contrast", "Contrast", 100.0F, 0.0F, 200.0F);
        Uq var10 = var9.W(1.0F);
        Uq var11 = var10.L("%");
        xB var12 = var11.q("0% flat grey, 100% unchanged; higher values deepen shadows and brighten highlights.");
        Uq var13 = (Uq)var12;
        xB var14 = this.vn(var13);
        Uq var15 = (Uq)var14;
        this.Qq = var15;
        Uq var16 = new Uq("brightness", "Brightness", 0.0F, -100.0F, 100.0F);
        Uq var17 = var16.W(1.0F);
        Uq var18 = var17.L("%");
        xB var19 = var18.q("Brightens or darkens the whole image; 0% unchanged.");
        Uq var20 = (Uq)var19;
        xB var21 = this.vn(var20);
        Uq var22 = (Uq)var21;
        this.n = var22;
        Uq var23 = new Uq("hue", "Hue", 0.0F, -180.0F, 180.0F);
        Uq var24 = var23.W(1.0F);
        Uq var25 = var24.L("°");
        xB var26 = var25.q("Turns every color around the color wheel; lightness stays the same.");
        Uq var27 = (Uq)var26;
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.BL = var29;
        this.dy("Saturation, contrast, brightness and hue of the world; HUD and menus keep their colors.");
        wD<p_2> var30 = (p_2 var1x) -> {
            int var2x = Z;
            var2x ^= 1499615486;
            int var3x = System.identityHashCode(this);
            Ud var4x = Ud.Z();
            AuraRenderer var22x = var4x.ZP();
            int var5x = var3x + 1;
            var5x = var3x * var5x;
            var3x = var5x & 1;
            if (var3x == 0) {
                var2x &= 908605945;
                var2x ^= -1674080806;
                var2x ^= -564005393;
                ScreenEffects var21x = var22x.screenEffects();
                Uq var25x = this.n;
                float var26x = var25x.WM();
                float var27x = var26x / 100.0F;
                Uq var31 = this.O;
                float var32 = var31.WM();
                float var33 = var32 / 100.0F;
                Uq var6x = this.Qq;
                float var34 = var6x.WM();
                float var35 = var34 / 100.0F;
                var21x.displayGrade(var27x, var33, var35);
                Uq var28x = this.BL;
                float var29x = var28x.WM();
                var21x.grade(var29x, 0.0F, 1.0F, 1.0F);
            } else {
                long var12x = switch (var2x) {
                    case -683570576 -> {
                        var2x &= -299640250;
                        var2x -= 791462284;
                        var2x -= -96595158;
                        yield var2x ^ 761430660;
                    }
                    case 1692250426 -> var2x ^ -325359687;
                    default -> var2x ^ 1265584327;
                };
                long var23x = var12x + 1L;
                long var24x = var12x * var23x;
                long var13x = var24x & 1L;
                long var36;
                var2x = (var36 = var13x - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
                if (var2x == 0) {
                    IllegalArgumentException var16x = new IllegalArgumentException();
                    throw var16x;
                } else {
                    RuntimeException var15x = new RuntimeException();
                    throw var15x;
                }
            }
        };
        this.iI(p_2.class, var30);
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1983875706;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        Z = var4;
    }
}
