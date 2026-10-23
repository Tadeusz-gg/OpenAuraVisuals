package mvggs.modules.client;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.FrameContext;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public final class clickgui extends Module {
    private static final float w = 540.0F;
    private final KeybindSetting mK;
    private final NumberSetting SC;
    private final BooleanSetting Y;
    private final NumberSetting jN;
    private final NumberSetting kC;
    private final BooleanSetting V;
    private final ModeSetting jL;
    public static final int VO;

    public clickgui() {
        super("click_gui", "Click GUI", ModuleCategory.CLIENT);
        ModuleCategory var1 = ModuleCategory.CLIENT;

        KeybindSetting var3 = new KeybindSetting("key", "Open Key", 344);
        Setting var4 = this.addSetting(var3);
        KeybindSetting var5 = (KeybindSetting)var4;
        this.mK = var5;
        NumberSetting var6 = new NumberSetting("scale", "UI Scale", 1.0F, 0.7F, 1.5F);
        NumberSetting var7 = var6.W(0.05F);
        NumberSetting var8 = var7.L("x");
        Setting var9 = this.addSetting(var8);
        NumberSetting var10 = (NumberSetting)var9;
        this.SC = var10;
        BooleanSetting var11 = new BooleanSetting("liquid_glass", "Liquid Glass", true);
        Setting var12 = this.addSetting(var11);
        BooleanSetting var13 = (BooleanSetting)var12;
        this.Y = var13;
        NumberSetting var14 = new NumberSetting("blur", "Background Blur", 2.0F, 0.0F, 6.0F);
        NumberSetting var15 = var14.W(1.0F);
        Setting var16 = this.addSetting(var15);
        NumberSetting var17 = (NumberSetting)var16;
        this.jN = var17;
        NumberSetting var18 = new NumberSetting("dim", "Background Dim", 0.4F, 0.0F, 0.9F);
        NumberSetting var19 = var18.W(0.05F);
        Setting var20 = this.addSetting(var19);
        NumberSetting var21 = (NumberSetting)var20;
        this.kC = var21;
        BooleanSetting var22 = new BooleanSetting("sounds", "Interface Sounds", true);
        Setting var23 = this.addSetting(var22);
        BooleanSetting var24 = (BooleanSetting)var23;
        this.V = var24;
        K var2 = K.BLIP;
        ModeSetting var25 = new ModeSetting("toggle_sound", "Toggle Sound", var2);
        BooleanSupplier var30 = this::cP;
        Setting var26 = var25.Pt(var30);
        ModeSetting var27 = (ModeSetting)var26;
        Setting var28 = this.addSetting(var27);
        ModeSetting var29 = (ModeSetting)var28;
        this.jL = var29;
        this.dy("Look and feel of this menu.");
        this.ao();
    }

    public int P() {
        int var1 = VO;
        var1 ^= 889212507;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var37;
        var2 = (var37 = var22 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        int var3 = of_2.iP;
        var1 ^= var3;
        var1 ^= 380143496;
        of_2.iP = 380143496;
        var3 = of_2.JL;
        var1 ^= var3;
        var1 ^= -567047411;
        of_2.JL = -567047411;
        if (var2 == 0) {
            var1 *= 1350098675;
            var1 &= -1266736581;
            var1 ^= 747311028;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var25 = var4 & 1L;
            long var38;
            var2 = (var38 = var25 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var2 == 0) {
                KeybindSetting var27 = this.mK;
                return var27.JQ();
            }
        } else {
            var1 -= -1953202579;
            var1 &= 354696032;
            var1 ^= -1265920968;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public KeybindSetting fA() {
        int var1 = VO;
        var1 ^= -1094671686;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.iP;
        var1 ^= var3;
        var1 ^= 380143496;
        var3 = of_2.JL;
        var1 ^= var3;
        var1 ^= -567047411;
        if (var2 != 0) {
            var1 += -432396790;
            var1 ^= -226177319;
            Integer var19 = var1;
            if (var19 == null) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            } else {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        } else {
            var1 &= -1143163823;
            var1 *= -2048607987;
            var1 &= 292847849;
            var1 ^= -646470014;
            var1 ^= 983828758;
            return this.mK;
        }
    }

    public boolean i() {
        int var1 = VO;
        var1 ^= -1284932053;
        int var2 = System.identityHashCode(this);
        BooleanSetting var3 = this.Y;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 != 0) {
            switch (var1) {
                case 1194656958:
                default:
                    var1 ^= -940028424;
                    break;
                case 1300659398:
                    var1 ^= 1834777266;
                    break;
                case 2046134995:
                    var1 |= 228841661;
                    var1 ^= -1016653777;
            }

            IllegalArgumentException var15 = new IllegalArgumentException();
            throw var15;
        } else {
            var1 -= 2075550236;
            var1 ^= 1636983348;
            Integer var8 = var1;
            if (var8 == null) {
                IllegalArgumentException var9 = new IllegalArgumentException();
                throw var9;
            } else {
                return var3.vb();
            }
        }
    }

    public int ed() {
        int var1 = VO;
        var1 ^= 564409513;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 == null) {
            var1 += -1120107014;
            var1 ^= 2076219380;
            long var14 = var1;
            long var4 = var14 + 1L;
            var4 = var14 * var4;
            long var15 = var4 & 1L;
            long var20;
            int var16 = (var20 = var15 - 0L) == 0L ? 0 : (var20 < 0L ? -1 : 1);
            if (var16 != 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            } else {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        } else {
            var1 >>>= 18;
            var1 <<= 20;
            var1 ^= -2025066079;
            NumberSetting var10 = this.jN;
            return var10.B();
        }
    }

    public float k() {
        int var1 = VO;
        var1 ^= -556961764;
        int var2 = System.identityHashCode(this);
        NumberSetting var3 = this.kC;
        Integer var22 = var2;
        if (var22 == null) {
            var1 *= 1364732631;
            var1 += 1584705346;
            var1 -= -1330526791;
            var1 ^= 167283361;
            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var30;
            int var23 = (var30 = var4 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var23 == 0) {
                RuntimeException var24 = new RuntimeException();
                throw var24;
            }
        } else {
            Integer var20 = switch (var1) {
                default -> var1 ^ -110744524;
                case 340886756 -> {
                    var1 ^= 2031048942;
                    var1 |= 453826976;
                    var1 += 1222837892;
                    var1 *= 1098715193;
                    yield var1 ^ 983471826;
                }
                case 1353742436 -> var1 ^ 1177681620;
            };
            if (var20 != null) {
                return var3.WM();
            }
        }

        IllegalStateException var21 = new IllegalStateException();
        throw var21;
    }

    public boolean cP() {
        int var1 = VO;
        var1 ^= 893040070;
        int var2 = System.identityHashCode(this);
        BooleanSetting var3 = this.V;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -1789319164:
                default:
                    var1 ^= 753585007;
                    break;
                case -5881538:
                    var1 *= -2109763351;
                    var1 ^= 1067260026;
                    var1 -= -978362235;
                    var1 &= -565859212;
                    var1 ^= 1117716;
                    break;
                case 590642766:
                    var1 ^= 807774069;
            }

            return var3.vb();
        } else {
            var1 ^= -1931280540;
            var1 >>>= 30;
            var1 ^= 255784285;
            Integer var9 = var1;
            if (var9 != null) {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            } else {
                UnsupportedOperationException var10 = new UnsupportedOperationException();
                throw var10;
            }
        }
    }

    public boolean v() {
        int var1 = VO;
        var1 ^= 447907440;
        int var2 = System.identityHashCode(this);
        ModeSetting var3 = this.jL;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 != 0) {
            var1 *= 169736701;
            var1 *= -172939401;
            var1 += -1542460288;
            var1 ^= -505839598;
            IllegalStateException var24 = new IllegalStateException();
            throw var24;
        } else {
            var1 &= 1940800429;
            var1 += -152411205;
            var1 ^= -1438309306;
            var1 ^= 1300982607;
            long var13 = var1;
            long var26 = var13 + 1L;
            long var27 = var13 * var26;
            long var6 = var13 + 2L;
            long var28 = var27 * var6;
            long var14 = var13 + 3L;
            long var29 = var28 * var14;
            long var15 = var29 & 7L;
            long var30;
            var1 = (var30 = var15 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 != 0) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            } else {
                K var17 = K.CHIME;
                return var3.TJ(var17);
            }
        }
    }

    public float t(FrameContext var1) {
        int var2 = VO;
        var2 ^= 1808540081;
        int var3 = System.identityHashCode(this);
        int var4 = var1.framebufferHeight();
        float var29 = var4;
        float var30 = Math.max(1.0F, var29);
        float var31 = var30 / 540.0F;
        NumberSetting var5 = this.SC;
        int var6 = var3 + 1;
        var6 = var3 * var6;
        int var7 = var3 + 2;
        var6 *= var7;
        var3 += 3;
        var6 *= var3;
        var3 = var6 & 7;
        if (var3 != 0) {
            var2 *= 1947341535;
            var2 |= 288144963;
            var2 ^= -867098871;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                AssertionError var26 = new AssertionError();
                throw var26;
            }
        } else {
            var2 = switch (var2) {
                case -1588538039 -> {
                    var2 *= 969958497;
                    var2 *= 1881756327;
                    var2 |= 2021972216;
                    var2 ^= -727363593;
                    yield var2 ^ 2101994839;
                }
                default -> var2 ^ -1256323425;
                case 1366882086 -> var2 ^ -755290464;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                float var19 = var5.WM();
                float var20 = var31 * var19;
                return Math.max(0.5F, var20);
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 264508002;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        VO = var4;
    }
}
