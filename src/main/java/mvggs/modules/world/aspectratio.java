package mvggs.modules.world;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public final class aspectratio extends Module {
    private final ModeSetting jo;
    private final NumberSetting e;
    public static final int H;

    public aspectratio() {
        super("aspect_ratio", "Aspect Ratio", ModuleCategory.WORLD);
        ModuleCategory var1 = ModuleCategory.WORLD;

        rB var2 = rB.CLASSIC;
        ModeSetting var3 = new ModeSetting("preset", "Ratio", var2);
        Setting var4 = this.addSetting(var3);
        ModeSetting var5 = (ModeSetting)var4;
        this.jo = var5;
        NumberSetting var6 = new NumberSetting("ratio", "Custom Ratio", 1.33F, 0.75F, 3.0F);
        NumberSetting var7 = var6.W(0.01F);
        BooleanSupplier var12 = () -> {
            int var1x = H;
            var1x ^= -181374530;
            int var2x = System.identityHashCode(this);
            ModeSetting var3x = this.jo;
            rB var4x = rB.CUSTOM;
            long var5x = var2x;
            long var7x = var5x + 1L;
            var7x = var5x * var7x;
            long var9x = var5x + 2L;
            var7x *= var9x;
            var5x += 3L;
            var7x *= var5x;
            var5x = var7x & 7L;
            long var29;
            var2x = (var29 = var5x - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2x != 0) {
                var1x ^= -140947503;
                var1x ^= 1222466062;
                var2x = var1x + 1;
                var2x = var1x * var2x;
                var2x &= 1;
                if (var2x == 0) {
                    IllegalStateException var23 = new IllegalStateException();
                    throw var23;
                }
            } else {
                var1x += 1852128829;
                var1x ^= 1771669274;
                var1x ^= 208713251;
                Integer var17 = var1x;
                if (var17 != null) {
                    return var3x.TJ(var4x);
                }
            }

            UnsupportedOperationException var18 = new UnsupportedOperationException();
            throw var18;
        };
        Setting var8 = var7.Pt(var12);
        NumberSetting var9 = (NumberSetting)var8;
        Setting var10 = this.addSetting(var9);
        NumberSetting var11 = (NumberSetting)var10;
        this.e = var11;
        this.dy("Stretch the 3D view with 4:3, 5:4, widescreen or a custom ratio. HUD stays crisp.");
    }

    public static float P(float var0) {
        label126: {
            int var71;
            label125: {
                var71 = H;
                var71 ^= -244678190;
                int var2 = (int)var0;
                long var3 = var2;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                long var7 = var3 + 2L;
                var5 *= var7;
                var3 += 3L;
                var5 *= var3;
                var3 = var5 & 7L;
                long var172;
                int var96 = (var172 = var3 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                if (var96 == 0) {
                    var71 *= -315710573;
                    var71 >>= 5;
                    var71 &= 729331110;
                    var71 += 1387182786;
                    var71 ^= -1666421982;
                    var3 = var71;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var7 = var3 + 2L;
                    var5 *= var7;
                    var3 += 3L;
                    var5 *= var3;
                    var3 = var5 & 7L;
                    long var173;
                    int var100 = (var173 = var3 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                    if (var100 != 0) {
                        break label126;
                    }

                    boolean var101 = ClientRuntime.y();
                    if (!var101) {
                        var71 ^= -1858218676;
                        var71 += 1423332108;
                        var71 -= -1546010885;
                        var71 ^= -447368566;
                        var71 ^= -171160005;
                        Integer var110 = var71;
                        if (var110 != null) {
                            return var0;
                        }
                        break label126;
                    }
                    var71 = switch (var71) {
                        case -1496887500 -> var71 ^ -1785311020;
                        case -809827130 -> {
                            var71 += 1013157214;
                            var71 ^= 304402479;
                            var71 ^= 768098059;
                            var71 |= 283958754;
                            yield var71 ^ -1805809747;
                        }
                        default -> var71 ^ 635211181;
                    };
                    ClientRuntime var102 = ClientRuntime.Z();
                    ModuleManager var103 = var102.sP();
                    Module var104 = var103.tG(aspectratio.class);
                    aspectratio var105 = (aspectratio)var104;
                    Integer var4 = var2;
                    if (var4 != null) {
                        var71 &= -575004867;
                        var71 >>>= 28;
                        var71 *= -1929730945;
                        var71 ^= 518672635;
                        boolean var111 = var105.IU();
                        if (!var111) {
                            var71 &= -816930073;
                            var71 *= 755895453;
                            var71 ^= 1228273373;
                            break label125;
                        }

                        var71 &= -1114922205;
                        var71 ^= 862478890;
                        long var112 = var71;
                        long var6 = var112 + 1L;
                        var6 = var112 * var6;
                        long var113 = var6 & 1L;
                        long var174;
                        int var114 = (var174 = var113 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                        if (var114 != 0) {
                            break label126;
                        }

                        ModeSetting var115 = var105.jo;
                        rB var137 = rB.NATIVE;
                        var6 = var2;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var175;
                        int var152 = (var175 = var6 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                        if (var152 == 0) {
                            var71 &= -666080034;
                            var71 &= 66675817;
                            var71 ^= -1751991852;
                            int var153 = var71 + 1;
                            int var154 = var71 * var153;
                            int var155 = var154 & 1;
                            if (var155 != 0) {
                                break label126;
                            }

                            int var116 = (var115.TJ(var137)) ? 1 : 0;
                            if (var116 != 0) {
                                var71 <<= 27;
                                var71 *= 1816393049;
                                var71 &= 664014864;
                                var71 ^= -1286010614;
                                break label125;
                            }

                            var71 *= 664109105;
                            var71 |= 380123205;
                            var71 += 862574560;
                            var71 *= 271636283;
                            var71 ^= -1331854198;
                            long var117 = var71;
                            var6 = var117 + 1L;
                            var6 = var117 * var6;
                            var8 = var117 + 2L;
                            var6 *= var8;
                            long var118 = var117 + 3L;
                            var6 *= var118;
                            long var119 = var6 & 7L;
                            long var176;
                            var116 = (var176 = var119 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                            if (var116 != 0) {
                                break label126;
                            }

                            ModeSetting var121 = var105.jo;
                            rB var138 = rB.CUSTOM;
                            int var122 = (var121.TJ(var138)) ? 1 : 0;
                            var5 = var2;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var177;
                            int var141 = (var177 = var5 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                            if (var141 != 0) {
                                var71 -= -1203106976;
                                var71 &= -273954622;
                                var71 -= -2070615810;
                                var71 ^= 1911062785;
                            } else {
                                var71 |= 2126706231;
                                var71 *= 1023758785;
                                var71 ^= 508597311;
                                if (var122 != 0) {
                                    var71 &= -1125716052;
                                    var71 ^= -1973790448;
                                    long var123 = var71;
                                    var6 = var123 + 1L;
                                    var6 = var123 * var6;
                                    var8 = var123 + 2L;
                                    var6 *= var8;
                                    long var124 = var123 + 3L;
                                    var6 *= var124;
                                    long var125 = var6 & 7L;
                                    long var178;
                                    var122 = (var178 = var125 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                    if (var122 != 0) {
                                        break label126;
                                    }

                                    NumberSetting var127 = var105.e;
                                    int var142 = var2 + 1;
                                    int var143 = var2 * var142;
                                    int var144 = var143 & 1;
                                    if (var144 == 0) {
                                        var71 *= 1881911809;
                                        var71 -= -1255665215;
                                        var71 -= 292489404;
                                        var71 |= 342366126;
                                        var71 ^= 1105689798;
                                        int var145 = var71 + 1;
                                        int var146 = var71 * var145;
                                        int var147 = var146 & 1;
                                        if (var147 != 0) {
                                            break label126;
                                        }

                                        float var128 = var127.WM();
                                        var71 |= 591684557;
                                        var71 -= 808133846;
                                        var71 ^= -682963795;
                                        return var128;
                                    }

                                    switch (var71) {
                                        case -1572981864:
                                            var71 ^= 591953866;
                                            var71 ^= 1265474129;
                                            break;
                                        case -1387100450:
                                        default:
                                            var71 ^= -1325966728;
                                            break;
                                        case 1215722506:
                                            var71 ^= -37406669;
                                    }
                                } else {
                                    var71 &= -964349554;
                                    var71 *= -306427415;
                                    var71 += 388689124;
                                    var71 ^= -1622101475;
                                    ModeSetting var106 = var105.jo;
                                    Enum var107 = var106.A();
                                    rB var108 = (rB)var107;
                                    float var109 = var108.ratio;
                                    Integer var89 = var2;
                                    if (var89 != null) {
                                        var71 &= 465403524;
                                        var71 -= -684421367;
                                        var71 <<= 18;
                                        var71 ^= -1871461973;
                                        var89 = var71;
                                        if (var89 == null) {
                                            break label126;
                                        }

                                        switch (var71) {
                                            case -1667772891:
                                                var71 ^= -296835076;
                                                return var109;
                                            case -1649426005:
                                                var71 += -1341477226;
                                                var71 ^= -1655569461;
                                                return var109;
                                            case -351897983:
                                            default:
                                                var71 ^= 741630286;
                                                return var109;
                                        }
                                    }

                                    var71 += -1031417038;
                                    var71 ^= -226692128;
                                }
                            }
                        } else {
                            var71 >>>= 21;
                            var71 <<= 6;
                            var71 &= -103797740;
                            var71 ^= -904146429;
                        }
                    } else {
                        switch (var71) {
                            case -1569070996:
                            default:
                                var71 ^= 1528629865;
                                break;
                            case -1482458545:
                                var71 *= -1061730669;
                                var71 *= -1772303435;
                                var71 ^= 1883983810;
                                break;
                            case 1807794633:
                                var71 ^= 1303229646;
                        }
                    }
                } else {
                    var71 += -970562433;
                    var71 *= 219582999;
                    var71 ^= -1482322670;
                }

                var2 = var71 + 1;
                var2 = var71 * var2;
                var71 = var2 & 1;
                if (var71 == 0) {
                    IllegalStateException var88 = new IllegalStateException();
                    throw var88;
                }
                break label126;
            }

            Integer var91 = var71;
            if (var91 != null) {
                return var0;
            }
        }

        RuntimeException var87 = new RuntimeException();
        throw var87;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1988664930;
        int var2 = Module.C;
        int var4 = of_2.ro(var3, var1, var2);
        H = var4;
    }
}
