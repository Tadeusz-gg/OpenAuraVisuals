package dev.aurap.hub;

import mvggs.modules.animations.hurtcam;
import mvggs.modules.animations.knife;
import mvggs.modules.animations.swinganimations;
import mvggs.modules.client.clickgui;
import mvggs.modules.client.performance;
import mvggs.modules.combat.damagenumbers;
import mvggs.modules.combat.deatheffect;
import mvggs.modules.combat.hitboxcustomizer;
import mvggs.modules.combat.hitbubbles;
import mvggs.modules.combat.hitcolor;
import mvggs.modules.combat.hitmarker;
import mvggs.modules.combat.hitparticles;
import mvggs.modules.combat.killeffect;
import mvggs.modules.combat.targetesp;
import mvggs.modules.combat.totempop;
import mvggs.modules.hud.combocounter;
import mvggs.modules.hud.cooldownring;
import mvggs.modules.hud.cooldowns;
import mvggs.modules.hud.crosshair;
import mvggs.modules.hud.dynamicisland;
import mvggs.modules.hud.hudstyle;
import mvggs.modules.hud.potions;
import mvggs.modules.hud.targethud;
import mvggs.modules.hud.watermark;
import mvggs.modules.sound.hitsounds;
import mvggs.modules.world.ambientparticles;
import mvggs.modules.world.aspectratio;
import mvggs.modules.world.atmosphere;
import mvggs.modules.world.chinahat;
import mvggs.modules.world.colorsaturation;
import mvggs.modules.world.fullbright;
import mvggs.modules.world.halo;
import mvggs.modules.world.jumpcircles;
import mvggs.modules.world.jumpparticles;
import mvggs.modules.world.motionblur;
import mvggs.modules.world.trails;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ModuleRegistry {
    public static final int a;

    private ModuleRegistry() {
    }

    public static void registerModules(ClientRuntime var0) {
        label92: {
            int var1 = a;
            var1 ^= -546080992;
            int var2 = System.identityHashCode(var0);
            ModuleManager var3 = var0.sP();
            hitmarker var4 = new hitmarker();
            Module var59 = var3.register(var4);
            damagenumbers var60 = new damagenumbers();
            Module var61 = var3.register(var60);
            hitparticles var62 = new hitparticles();
            Module var63 = var3.register(var62);
            hitbubbles var64 = new hitbubbles();
            Module var65 = var3.register(var64);
            targetesp var66 = new targetesp();
            Module var67 = var3.register(var66);
            killeffect var68 = new killeffect();
            Module var69 = var3.register(var68);
            deatheffect var70 = new deatheffect();
            Module var71 = var3.register(var70);
            totempop var72 = new totempop();
            Module var73 = var3.register(var72);
            hitcolor var74 = new hitcolor();
            Module var75 = var3.register(var74);
            hitboxcustomizer var76 = new hitboxcustomizer();
            Module var77 = var3.register(var76);
            hudstyle var78 = new hudstyle();
            Module var79 = var3.register(var78);
            targethud var80 = new targethud();
            Module var81 = var3.register(var80);
            watermark var82 = new watermark();
            Module var83 = var3.register(var82);
            dynamicisland var84 = new dynamicisland();
            Module var85 = var3.register(var84);
            potions var86 = new potions();
            Module var87 = var3.register(var86);
            cooldowns var88 = new cooldowns();
            Module var89 = var3.register(var88);
            combocounter var90 = new combocounter();
            Module var91 = var3.register(var90);
            cooldownring var92 = new cooldownring();
            Module var93 = var3.register(var92);
            crosshair var94 = new crosshair();
            Module var95 = var3.register(var94);
            swinganimations var96 = new swinganimations();
            Module var97 = var3.register(var96);
            knife var98 = new knife();
            Module var99 = var3.register(var98);
            hurtcam var100 = new hurtcam();
            Module var101 = var3.register(var100);
            hitsounds var102 = new hitsounds();
            Module var103 = var3.register(var102);
            jumpcircles var104 = new jumpcircles();
            Module var105 = var3.register(var104);
            jumpparticles var106 = new jumpparticles();
            Module var107 = var3.register(var106);
            ambientparticles var108 = new ambientparticles();
            Module var109 = var3.register(var108);
            trails var110 = new trails();
            int var5 = var2 + 1;
            var5 = var2 * var5;
            var5 &= 1;
            if (var5 != 0) {
                var1 -= -486413665;
                var1 ^= 1466165017;
            } else {
                var1 &= -553144234;
                var1 |= -1128950101;
                var1 ^= 850486973;
                Module var111 = var3.register(var110);
                halo var112 = new halo();
                Module var113 = var3.register(var112);
                chinahat var114 = new chinahat();
                Module var115 = var3.register(var114);
                atmosphere var116 = new atmosphere();
                Module var117 = var3.register(var116);
                motionblur var118 = new motionblur();
                Module var119 = var3.register(var118);
                colorsaturation var120 = new colorsaturation();
                Module var121 = var3.register(var120);
                aspectratio var122 = new aspectratio();
                Module var123 = var3.register(var122);
                fullbright var124 = new fullbright();
                Module var125 = var3.register(var124);
                clickgui var126 = new clickgui();
                Module var127 = var3.register(var126);
                performance var128 = new performance();
                Module var129 = var3.register(var128);
                var4 = null;
                Set var131 = Set.of("click_gui", "performance", "discord_presence");
                Set var132 = var131;
                List var56 = var3.dG();
                Iterator var57 = var56.iterator();
                Iterator var58 = var57;
                var1 -= -890715114;
                var1 ^= 914142382;

                while (true) {
                    long var135 = var1;
                    long var7 = var135 + 1L;
                    var7 = var135 * var7;
                    long var9 = var135 + 2L;
                    var7 *= var9;
                    long var136 = var135 + 3L;
                    var7 *= var136;
                    long var137 = var7 & 7L;
                    long var179;
                    var5 = (var179 = var137 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label92;
                    }

                    int var139 = (var58.hasNext()) ? 1 : 0;
                    int var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        var1 &= -1507976223;
                        var1 |= 593967313;
                        var1 += -729943627;
                        var1 += -862229129;
                        var1 ^= 1181648824;
                        break;
                    }

                    var1 ^= -416779880;
                    var1 ^= -1273398799;
                    var6 = var1 + 1;
                    var6 = var1 * var6;
                    int var163 = var1 + 2;
                    var6 *= var163;
                    int var164 = var1 + 3;
                    var6 *= var164;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label92;
                    }

                    if (var139 == 0) {
                        Integer var55 = switch (var1) {
                            default -> var1 ^ 965946379;
                            case -1504464649 -> {
                                var1 -= -1929429169;
                                var1 <<= 28;
                                var1 *= 4304013;
                                var1 &= 1725571941;
                                yield var1 ^ 1763153689;
                            }
                            case 1574392682 -> var1 ^ 792597396;
                        };
                        if (var55 != null) {
                            return;
                        }
                        break label92;
                    }

                    var1 >>= 16;
                    var1 ^= 154503774;
                    var139 = var1 + 1;
                    var139 = var1 * var139;
                    var6 = var1 + 2;
                    var139 *= var6;
                    var6 = var1 + 3;
                    var139 *= var6;
                    var139 &= 7;
                    if (var139 != 0) {
                        break label92;
                    }

                    Object var145 = var58.next();
                    Module var146 = (Module)var145;
                    String var157 = var146.F();
                    int var165 = var2 + 1;
                    int var166 = var2 * var165;
                    int var8 = var2 + 2;
                    int var167 = var166 * var8;
                    var8 = var2 + 3;
                    int var168 = var167 * var8;
                    int var169 = var168 & 7;
                    if (var169 != 0) {
                        var1 *= -1843555169;
                        var1 += -621212571;
                        var1 *= 1582912067;
                        var1 |= -1411037918;
                        var1 ^= -519485649;
                        break;
                    }

                    var1 ^= -881907781;
                    var1 *= -641559317;
                    var1 -= -68668904;
                    var1 ^= 1095380816;
                    var7 = var1;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var180;
                    int var173 = (var180 = var7 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                    if (var173 != 0) {
                        break label92;
                    }

                    boolean var158 = var132.contains(var157);
                    if (!var158) {
                        var1 &= -887115812;
                        var1 ^= -1245020826;
                        Integer var159 = var1;
                        if (var159 == null) {
                            break label92;
                        }

                        var146.Ze("aura.full");
                        var1 |= -1375121369;
                        var1 -= 913661655;
                        var1 ^= -1782386134;
                    } else {
                        var1 ^= -388358948;
                        var1 *= 840447435;
                        var1 <<= 1;
                        var1 *= 411195079;
                        var1 ^= 1569987534;
                    }

                    Integer var147 = var1;
                    if (var147 == null) {
                        break label92;
                    }

                    switch (var1) {
                        case 1553238834:
                            var1 += -168392248;
                            var1 ^= -1477858204;
                            break;
                        case 1663629053:
                        default:
                            var1 ^= -1187382399;
                            break;
                        case 2071110574:
                            var1 ^= -30954602;
                    }
                }
            }

            Integer var52 = var1;
            if (var52 != null) {
                AssertionError var54 = new AssertionError();
                throw var54;
            }
        }

        IllegalStateException var53 = new IllegalStateException();
        throw var53;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1113127051;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        a = var4;
    }
}
