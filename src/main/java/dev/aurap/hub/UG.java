package dev.aurap.hub;

import mvggs.modules.animations.swinganimations;
import mvggs.modules.client.clickgui;
import mvggs.modules.combat.deatheffect;
import mvggs.modules.combat.killeffect;
import mvggs.modules.hud.hudstyle;
import mvggs.modules.world.motionblur;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public final class UG {
    private static boolean f;
    private static boolean g;
    public static final int W;

    private UG() {
    }

    public static void fe(Ud var0) {
        boolean var201 = false;
        motionblur var210 = null;
        label291: {
            int var136;
            int var174;
            label308: {
                var136 = W;
                var136 ^= -141630644;
                int var2 = System.identityHashCode(var0);
                Integer var3 = var2;
                if (var3 != null) {
                    var136 = switch (var136) {
                        case -1561052723 -> var136 ^ 1140396619;
                        default -> var136 ^ -462859699;
                        case -544419930 -> {
                            var136 += -587810419;
                            var136 ^= -778322736;
                            var136 <<= 19;
                            yield var136 ^ -360797330;
                        }
                    };
                    Screen var163 = i_2.vB();
                    if (var163 == null) {
                        var136 = switch (var136) {
                            default -> var136 ^ 2025742224;
                            case -248056766 -> var136 ^ -2029976833;
                            case 1164356462 -> {
                                var136 >>= 12;
                                yield var136 ^ -174961237;
                            }
                        };
                        var3 = var136;
                        if (var3 == null) {
                            break label291;
                        }

                        var174 = 1;
                        var136 += 94242731;
                        var136 ^= -295706102;
                    } else {
                        var136 &= 604797843;
                        var136 &= -1348745405;
                        var136 -= 212560119;
                        var136 >>= 29;
                        var136 ^= -1761597718;
                        long var4 = var136;
                        long var6 = var4 + 1L;
                        var6 = var4 * var6;
                        var4 = var6 & 1L;
                        long var328;
                        int var176 = (var328 = var4 - 0L) == 0L ? 0 : (var328 < 0L ? -1 : 1);
                        if (var176 != 0) {
                            break label291;
                        }

                        var174 = 0;
                        var136 >>>= 27;
                        var136 ^= 359383403;
                    }

                    int var177 = var136 + 1;
                    var177 = var136 * var177;
                    int var5 = var136 + 2;
                    var177 *= var5;
                    var5 = var136 + 3;
                    var177 *= var5;
                    var177 &= 7;
                    if (var177 != 0) {
                        break label291;
                    }

                    long var182 = var2;
                    long var276 = var182 + 1L;
                    var276 = var182 * var276;
                    long var8 = var182 + 2L;
                    var276 *= var8;
                    long var183 = var182 + 3L;
                    var276 *= var183;
                    long var184 = var276 & 7L;
                    long var329;
                    var177 = (var329 = var184 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                    if (var177 != 0) {
                        var136 |= 548748504;
                        var136 ^= -220989077;
                    } else {
                        label333: {
                            label296: {
                                var136 += -2020847331;
                                var136 ^= 164610774;
                                if (var174 != 0) {
                                    var136 |= 680699983;
                                    var136 += 21010658;
                                    var136 -= -2037547952;
                                    var136 ^= -1810161447;
                                    var177 = var136 + 1;
                                    var177 = var136 * var177;
                                    var5 = var136 + 2;
                                    var177 *= var5;
                                    var5 = var136 + 3;
                                    var177 *= var5;
                                    var177 &= 7;
                                    if (var177 != 0) {
                                        break label291;
                                    }

                                    NW var191 = var0.sP();
                                    Yn var192 = var191.tG(clickgui.class);
                                    long var214 = var2;
                                    long var7 = var214 + 1L;
                                    var7 = var214 * var7;
                                    long var215 = var7 & 1L;
                                    long var330;
                                    var5 = (var330 = var215 - 0L) == 0L ? 0 : (var330 < 0L ? -1 : 1);
                                    if (var5 != 0) {
                                        var136 *= -1191994093;
                                        var136 *= -1939777895;
                                        var136 -= -1027050687;
                                        var136 ^= -903847326;
                                        break label333;
                                    }

                                    var136 += 1722178380;
                                    var136 -= -915881760;
                                    var136 ^= 1677405635;
                                    var5 = var136 + 1;
                                    var5 = var136 * var5;
                                    int var280 = var136 + 2;
                                    var5 *= var280;
                                    int var281 = var136 + 3;
                                    var5 *= var281;
                                    var5 &= 7;
                                    if (var5 != 0) {
                                        break label291;
                                    }

                                    clickgui var193 = (clickgui)var192;
                                    var177 = var193.P();
                                    int var195 = (i_2.R(var177)) ? 1 : 0;
                                    if (var195 != 0) {
                                        var136 = switch (var136) {
                                            default -> var136 ^ -131163108;
                                            case -786520672 -> var136 ^ 1365861027;
                                            case 710337367 -> {
                                                var136 |= -2111147318;
                                                var136 >>= 27;
                                                var136 |= 1382614483;
                                                yield var136 ^ -292735390;
                                            }
                                        };
                                        var195 = var136 + 1;
                                        var195 = var136 * var195;
                                        var5 = var136 + 2;
                                        var195 *= var5;
                                        var5 = var136 + 3;
                                        var195 *= var5;
                                        var195 &= 7;
                                        if (var195 != 0) {
                                            break label291;
                                        }

                                        var201 = true;
                                        var136 ^= 121455155;
                                        var136 >>= 4;
                                        var136 |= 684479798;
                                        var136 ^= -986138725;
                                        break label296;
                                    }

                                    switch (var136) {
                                        case -1843182053:
                                        default:
                                            var136 ^= -629636432;
                                            break;
                                        case 243203291:
                                            var136 ^= 217691807;
                                            break;
                                        case 710337367:
                                            var136 ^= 48506522;
                                            var136 ^= -1215509464;
                                    }
                                } else {
                                    var136 += 42449238;
                                    var136 |= -106504601;
                                    var136 ^= 1619121674;
                                }

                                long var224 = var136;
                                long var305 = var224 + 1L;
                                var305 = var224 * var305;
                                long var225 = var305 & 1L;
                                long var331;
                                var5 = (var331 = var225 - 0L) == 0L ? 0 : (var331 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label291;
                                }

                                var201 = false;
                                var136 += 173557318;
                                var136 |= 520760383;
                                var136 |= -1205104437;
                                var136 &= 1723777435;
                                var136 ^= -898987330;
                            }

                            Integer var227 = var136;
                            if (var227 == null) {
                                break label291;
                            }

                            long var228 = var2;
                            long var307 = var228 + 1L;
                            var307 = var228 * var307;
                            long var229 = var307 & 1L;
                            long var332;
                            int var230 = (var332 = var229 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                            if (var230 != 0) {
                                switch (var136) {
                                    case -321631707:
                                        var136 += 1432337594;
                                        var136 ^= 1175666167;
                                        var136 ^= -1022672963;
                                        break label333;
                                    case 360664515:
                                        var136 ^= 398018976;
                                        break label333;
                                    case 433733285:
                                    default:
                                        var136 ^= 1012751997;
                                }
                            } else {
                                var136 |= -756303224;
                                var136 ^= 1898361700;
                                if (var201) {
                                    var136 = switch (var136) {
                                        case -1881585207 -> {
                                            var136 |= 820235553;
                                            yield var136 ^ 603535455;
                                        }
                                        default -> var136 ^ -2044397166;
                                        case -59886259 -> var136 ^ 1879569609;
                                    };
                                    long var231 = var136;
                                    var307 = var231 + 1L;
                                    var307 = var231 * var307;
                                    long var232 = var307 & 1L;
                                    long var333;
                                    var230 = (var333 = var232 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                                    if (var230 != 0) {
                                        break label291;
                                    }

                                    int var234 = f ? 1 : 0;
                                    Integer var282 = var2;
                                    if (var282 == null) {
                                        var136 >>>= 11;
                                        var136 ^= -952138549;
                                        break label333;
                                    }
                                    var136 = switch (var136) {
                                        case -1677527626 -> {
                                            var136 &= 1713639280;
                                            var136 *= 1245212221;
                                            var136 *= 496517491;
                                            var136 *= -346417245;
                                            yield var136 ^ -1699095534;
                                        }
                                        case -473416175 -> var136 ^ -677039584;
                                        default -> var136 ^ 111519056;
                                    };
                                    int var283 = var136 + 1;
                                    int var284 = var136 * var283;
                                    int var311 = var136 + 2;
                                    int var285 = var284 * var311;
                                    int var312 = var136 + 3;
                                    int var286 = var285 * var312;
                                    int var287 = var286 & 7;
                                    if (var287 != 0) {
                                        break label291;
                                    }

                                    if (var234 == 0) {
                                        var136 = switch (var136) {
                                            case -1667671838 -> {
                                                var136 -= 1432752209;
                                                yield var136 ^ -1535393582;
                                            }
                                            default -> var136 ^ -64382739;
                                            case 1024584326 -> var136 ^ -1292941009;
                                        };
                                        var234 = var136 + 1;
                                        var234 = var136 * var234;
                                        int var288 = var136 + 2;
                                        var234 *= var288;
                                        int var289 = var136 + 3;
                                        var234 *= var289;
                                        var234 &= 7;
                                        if (var234 != 0) {
                                            break label291;
                                        }

                                        i_2.W();
                                        var136 += -5336717;
                                        var136 += -1174313545;
                                        var136 &= -1158469873;
                                        var136 ^= -589839837;
                                    } else {
                                        var136 ^= -103619631;
                                        var136 += -939688395;
                                        var136 ^= 1768873030;
                                    }
                                } else {
                                    var136 -= 609988271;
                                    var136 |= -698595761;
                                    var136 += -1611177284;
                                    var136 ^= -615340235;
                                }

                                var230 = var136 + 1;
                                var230 = var136 * var230;
                                int var290 = var136 + 2;
                                var230 *= var290;
                                int var291 = var136 + 3;
                                var230 *= var291;
                                var230 &= 7;
                                if (var230 != 0) {
                                    break label291;
                                }

                                f = var201;
                                long var202 = var2;
                                var276 = var202 + 1L;
                                var276 = var202 * var276;
                                long var203 = var276 & 1L;
                                long var334;
                                var177 = (var334 = var203 - 0L) == 0L ? 0 : (var334 < 0L ? -1 : 1);
                                if (var177 == 0) {
                                    var136 |= 585460938;
                                    var136 *= -1151766633;
                                    var136 *= -218556669;
                                    var136 ^= 236597136;
                                    var136 ^= 582440596;
                                    long var205 = var136;
                                    var276 = var205 + 1L;
                                    var276 = var205 * var276;
                                    long var206 = var276 & 1L;
                                    long var335;
                                    var177 = (var335 = var206 - 0L) == 0L ? 0 : (var335 < 0L ? -1 : 1);
                                    if (var177 != 0) {
                                        break label291;
                                    }

                                    label303: {
                                        NW var208 = var0.sP();
                                        Yn var209 = var208.tG(motionblur.class);
                                        var210 = (motionblur)var209;
                                        if (var174 != 0) {
                                            var136 &= 1060488901;
                                            var136 -= -2017587704;
                                            var136 ^= 1425856610;
                                            var136 ^= -564387443;
                                            long var245 = var136;
                                            var307 = var245 + 1L;
                                            var307 = var245 * var307;
                                            long var9 = var245 + 2L;
                                            var307 *= var9;
                                            long var246 = var245 + 3L;
                                            var307 *= var246;
                                            long var247 = var307 & 7L;
                                            long var336;
                                            var174 = (var336 = var247 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                                            if (var174 != 0) {
                                                break label291;
                                            }

                                            int var167 = var210.X();
                                            int var168 = (i_2.R(var167)) ? 1 : 0;
                                            var230 = var2 + 1;
                                            var230 = var2 * var230;
                                            var230 &= 1;
                                            if (var230 != 0) {
                                                var136 >>>= 5;
                                                var136 &= 345219893;
                                                var136 ^= 656346747;
                                                var136 |= -1998035089;
                                                var136 ^= 1757506554;
                                                break label333;
                                            }

                                            var136 += 604204923;
                                            var136 ^= 607739064;
                                            long var251 = var136;
                                            var307 = var251 + 1L;
                                            var307 = var251 * var307;
                                            var9 = var251 + 2L;
                                            var307 *= var9;
                                            long var252 = var251 + 3L;
                                            var307 *= var252;
                                            long var253 = var307 & 7L;
                                            long var337;
                                            var230 = (var337 = var253 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                                            if (var230 != 0) {
                                                break label291;
                                            }

                                            if (var168 != 0) {
                                                var136 *= -1985937017;
                                                var136 += -1870923826;
                                                var136 *= -13491593;
                                                var136 *= 256526947;
                                                var136 ^= -545165367;
                                                var168 = var136 + 1;
                                                var168 = var136 * var168;
                                                var230 = var136 + 2;
                                                var168 *= var230;
                                                var230 = var136 + 3;
                                                var168 *= var230;
                                                var168 &= 7;
                                                if (var168 != 0) {
                                                    break label291;
                                                }

                                                var174 = 1;
                                                var136 &= -39758257;
                                                var136 |= 1592191449;
                                                var136 ^= 1581251248;
                                                var136 ^= -207616792;
                                                break label303;
                                            }

                                            switch (var136) {
                                                case -330725187:
                                                default:
                                                    var136 ^= 926822403;
                                                    break;
                                                case 78872176:
                                                    var136 ^= -503844130;
                                                    break;
                                                case 1206920490:
                                                    var136 *= -1257212883;
                                                    var136 ^= 2023924248;
                                                    var136 ^= -1679487179;
                                                    var136 += -2113794939;
                                                    var136 ^= -310332564;
                                            }
                                        } else {
                                            var136 ^= 1080233864;
                                            var136 += -1404830108;
                                            var136 |= -469227005;
                                            var136 ^= 455393719;
                                        }

                                        var230 = var136 + 1;
                                        var230 = var136 * var230;
                                        int var296 = var136 + 2;
                                        var230 *= var296;
                                        int var297 = var136 + 3;
                                        var230 *= var297;
                                        var230 &= 7;
                                        if (var230 != 0) {
                                            break label291;
                                        }

                                        var174 = 0;
                                        switch (var136) {
                                            case -2117313960:
                                            default:
                                                var136 ^= -919845672;
                                                break;
                                            case -160630088:
                                                var136 &= 310780415;
                                                var136 |= 1435023368;
                                                var136 ^= -1510691011;
                                                break;
                                            case 1150786130:
                                                var136 ^= -56964785;
                                        }
                                    }

                                    Integer var262 = var136;
                                    if (var262 == null) {
                                        break label291;
                                    }

                                    int var263 = var2 + 1;
                                    var263 = var2 * var263;
                                    int var298 = var2 + 2;
                                    var263 *= var298;
                                    int var299 = var2 + 3;
                                    var263 *= var299;
                                    var263 &= 7;
                                    if (var263 == 0) {
                                        var136 = switch (var136) {
                                            default -> var136 ^ -1182393492;
                                            case -227010683 -> {
                                                var136 += 551269442;
                                                var136 |= 1020902922;
                                                var136 *= 38735147;
                                                var136 |= 91293463;
                                                yield var136 ^ -1554107013;
                                            }
                                            case 1748548654 -> var136 ^ -681203009;
                                        };
                                        if (var174 == 0) {
                                            var136 *= 1150868631;
                                            var136 += 1814417269;
                                            var136 ^= 818779405;
                                            var136 >>= 6;
                                            var136 ^= 198520961;
                                            break label308;
                                        }
                                        var136 = switch (var136) {
                                            case -693286228 -> {
                                                var136 &= -1154472055;
                                                yield var136 ^ 1033275303;
                                            }
                                            case 1283898933 -> var136 ^ -188988798;
                                            default -> var136 ^ 167279738;
                                        };
                                        Integer var268 = var136;
                                        if (var268 == null) {
                                            break label291;
                                        }

                                        boolean var269 = g;
                                        var276 = var2;
                                        var8 = var276 + 1L;
                                        var8 = var276 * var8;
                                        long var10 = var276 + 2L;
                                        var8 *= var10;
                                        var276 += 3L;
                                        var8 *= var276;
                                        var276 = var8 & 7L;
                                        long var338;
                                        int var303 = (var338 = var276 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                                        if (var303 == 0) {
                                            var136 ^= -1693731411;
                                            var136 *= -865457205;
                                            var136 *= -143315841;
                                            var136 ^= 1138924692;
                                            var136 ^= 856372138;
                                            if (var269) {
                                                var136 ^= 1580993159;
                                                var136 ^= 1422656557;
                                                break label308;
                                            }

                                            var136 |= 1427999374;
                                            var136 ^= 1585683098;
                                            var268 = var136;
                                            if (var268 == null) {
                                                break label291;
                                            }

                                            var210.bq();
                                            int var271 = var2 + 1;
                                            var271 = var2 * var271;
                                            var2 = var271 & 1;
                                            if (var2 == 0) {
                                                var136 *= 1717291453;
                                                var136 -= -426082560;
                                                var136 ^= -502719692;
                                                long var273 = var136;
                                                var307 = var273 + 1L;
                                                var307 = var273 * var307;
                                                long var274 = var307 & 1L;
                                                long var339;
                                                var2 = (var339 = var274 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                                                if (var2 != 0) {
                                                    break label291;
                                                }

                                                var2 = var136 + 1556441622;
                                                var2 |= -1699389133;
                                                var2 ^= 881503664;
                                                var2 ^= 4574903;
                                                String var161 = ep(var210, var2);
                                                i_2.Je(var161);
                                                var136 *= 1053788091;
                                                var136 += 1702806602;
                                                var136 += 439467616;
                                                var136 += 555882045;
                                                var136 ^= -1372116839;
                                                break label308;
                                            }

                                            var136 *= 953715359;
                                            var136 |= -289844190;
                                            var136 ^= 697430699;
                                        } else {
                                            var136 -= -1623439351;
                                            var136 ^= 1154470546;
                                            var136 += 1472253898;
                                            var136 -= 941063152;
                                            var136 ^= -1284290789;
                                        }
                                    } else {
                                        var136 += -1593481832;
                                        var136 >>>= 7;
                                        var136 &= -342691643;
                                        var136 ^= -970001323;
                                    }
                                } else {
                                    var136 |= 469681682;
                                    var136 ^= -1730944085;
                                }
                            }
                        }
                    }
                } else {
                    switch (var136) {
                        case -544419930:
                            var136 >>= 26;
                            var136 ^= 953416546;
                            break;
                        case -109151747:
                        default:
                            var136 ^= -1813145389;
                            break;
                        case 1588910932:
                            var136 ^= 194703342;
                    }
                }

                Integer var152 = var136;
                if (var152 != null) {
                    AssertionError var153 = new AssertionError();
                    throw var153;
                }
                break label291;
            }

            Integer var162 = var136;
            if (var162 != null) {
                g = var174 != 0;
                return;
            }
        }

        RuntimeException var154 = new RuntimeException();
        throw var154;
    }

    public static void pE(Ud var0) {
        int var1 = W;
        var1 ^= -250529583;
        int var2 = System.identityHashCode(var0);
        Event var3 = ClientCommandRegistrationCallback.EVENT;
        ClientCommandRegistrationCallback var4 = (var1x, var2x) -> {
            label216: {
                int var38;
                var38 = W;
                var38 ^= -946771583;
                int var4x = System.identityHashCode(var0);
                Integer var5x = var4x;
                label215:
                if (var5x != null) {
                    var38 -= -1626049065;
                    var38 ^= 1008300569;
                    int var143 = var38 + 1;
                    var143 = var38 * var143;
                    int var6 = var38 + 2;
                    var143 *= var6;
                    var6 = var38 + 3;
                    var143 *= var6;
                    var143 &= 7;
                    if (var143 != 0) {
                        break label216;
                    }

                    List var148 = en.Wc();
                    Stream var149 = var148.stream();
                    Predicate var174 = var0xx -> {
                        label71: {
                            int var35x;
                            int var54x;
                            label75: {
                                var35x = W;
                                var35x ^= 888446938;
                                var54x = System.identityHashCode(var0xx);
                                int var3xx = (var0xx.equals("none")) ? 1 : 0;
                                long var4xx = var54x;
                                long var6x = var4xx + 1L;
                                var6x = var4xx * var6x;
                                long var8x = var4xx + 2L;
                                var6x *= var8x;
                                var4xx += 3L;
                                var6x *= var4xx;
                                var4xx = var6x & 7L;
                                long var90x;
                                int var68x = (var90x = var4xx - 0L) == 0L ? 0 : (var90x < 0L ? -1 : 1);
                                label68:
                                if (var68x == 0) {
                                    var35x >>>= 10;
                                    var35x ^= -44156062;
                                    var4xx = var35x;
                                    var6x = var4xx + 1L;
                                    var6x = var4xx * var6x;
                                    var4xx = var6x & 1L;
                                    long var91x;
                                    int var71x = (var91x = var4xx - 0L) == 0L ? 0 : (var91x < 0L ? -1 : 1);
                                    if (var71x != 0) {
                                        break label71;
                                    }

                                    if (var3xx == 0) {
                                        var35x &= 577346007;
                                        var35x ^= -237246824;
                                        var35x &= 1876120489;
                                        var35x ^= 1281902600;
                                        var35x ^= 599412879;
                                        long var55x = var35x;
                                        long var5xx = var55x + 1L;
                                        var5xx = var55x * var5xx;
                                        long var7xx = var55x + 2L;
                                        var5xx *= var7xx;
                                        long var56x = var55x + 3L;
                                        var5xx *= var56x;
                                        long var57x = var5xx & 7L;
                                        long var92x;
                                        var3xx = (var92x = var57x - 0L) == 0L ? 0 : (var92x < 0L ? -1 : 1);
                                        if (var3xx != 0) {
                                            break label71;
                                        }

                                        String var59x = en.YR((String)var0xx);
                                        Integer var48x = var54x;
                                        if (var48x == null) {
                                            var35x *= 1971683185;
                                            var35x |= -1386594235;
                                            var35x >>>= 24;
                                            var35x ^= -522657623;
                                            break label68;
                                        }

                                        var35x &= 1172061091;
                                        var35x *= -504593613;
                                        var35x |= 1059684173;
                                        var35x ^= 584456611;
                                        var35x ^= -1746478614;
                                        var4xx = var35x;
                                        var6x = var4xx + 1L;
                                        var6x = var4xx * var6x;
                                        var8x = var4xx + 2L;
                                        var6x *= var8x;
                                        var4xx += 3L;
                                        var6x *= var4xx;
                                        var4xx = var6x & 7L;
                                        long var93x;
                                        int var49x = (var93x = var4xx - 0L) == 0L ? 0 : (var93x < 0L ? -1 : 1);
                                        if (var49x != 0) {
                                            break label71;
                                        }

                                        var49x = ia.WW(var59x);
                                        if (var49x == -1) {
                                            var35x &= -1131822440;
                                            var35x ^= -157489391;
                                            var35x ^= -342399282;
                                            var49x = var35x + 1;
                                            var49x = var35x * var49x;
                                            var49x &= 1;
                                            if (var49x != 0) {
                                                break label71;
                                            }

                                            var54x = 0;
                                            var35x &= 1342644323;
                                            var35x -= -414467770;
                                            var35x += -26207742;
                                            var35x ^= -628351847;
                                            break label75;
                                        }

                                        switch (var35x) {
                                            case -1978941676:
                                                var35x *= 1765746653;
                                                var35x *= 1142000255;
                                                var35x &= 1779042593;
                                                var35x ^= 1372929141;
                                                break;
                                            case -1873593276:
                                                var35x ^= -1473942491;
                                                break;
                                            case 1365760215:
                                            default:
                                                var35x ^= 1077129777;
                                        }
                                    } else {
                                        switch (var35x) {
                                            case -44497202:
                                                var35x *= -986655207;
                                                var35x |= 1976164343;
                                                var35x ^= -2079003990;
                                                break;
                                            case 1480911491:
                                            default:
                                                var35x ^= 1302960046;
                                                break;
                                            case 1662871794:
                                                var35x ^= 359054526;
                                        }
                                    }

                                    long var62x = var35x;
                                    long var78x = var62x + 1L;
                                    var78x = var62x * var78x;
                                    long var63x = var78x & 1L;
                                    long var94x;
                                    var3xx = (var94x = var63x - 0L) == 0L ? 0 : (var94x < 0L ? -1 : 1);
                                    if (var3xx != 0) {
                                        break label71;
                                    }

                                    var54x = 1;
                                    var35x ^= 835549520;
                                    var35x -= -911877953;
                                    var35x ^= -2051010784;
                                    break label75;
                                } else {
                                    var35x *= -1825045917;
                                    var35x ^= 60115846;
                                }

                                long var39x = var35x;
                                long var60x = var39x + 1L;
                                long var61x = var39x * var60x;
                                long var40x = var61x & 1L;
                                long var95x;
                                var35x = (var95x = var40x - 0L) == 0L ? 0 : (var95x < 0L ? -1 : 1);
                                if (var35x == 0) {
                                    IllegalArgumentException var42x = new IllegalArgumentException();
                                    throw var42x;
                                }
                                break label71;
                            }

                            Integer var65x = var35x;
                            if (var65x != null) {
                                return (var54x != 0);
                            }
                        }

                        UnsupportedOperationException var47x = new UnsupportedOperationException();
                        throw var47x;
                    };
                    Stream var150 = var149.filter(var174);
                    List var151 = var150.toList();
                    NW var175 = var0.sP();
                    List var176 = var175.dG();
                    Stream var177 = var176.stream();
                    Predicate<Yn> var7x = var0xx -> {
                        boolean var54x;
                        label82: {
                            int var1xx = W;
                            var1xx ^= -1317213939;
                            int var2xx = System.identityHashCode(var0xx);
                            int var3xx = (var0xx.jp()) ? 1 : 0;
                            int var4xx = var2xx + 1;
                            var4xx = var2xx * var4xx;
                            var4xx &= 1;
                            if (var4xx != 0) {
                                var1xx -= -853604156;
                                var1xx += 847298134;
                                var1xx |= 669504934;
                                var1xx ^= -1593368325;
                            } else {
                                label84: {
                                    label79: {
                                        var1xx *= 1601759221;
                                        var1xx >>>= 12;
                                        var1xx ^= -1626302884;
                                        var1xx ^= -1701926376;
                                        if (var3xx != 0) {
                                            var1xx &= 1099708485;
                                            var1xx >>= 28;
                                            var1xx ^= -1475151668;
                                            var3xx = var1xx + 1;
                                            var3xx = var1xx * var3xx;
                                            var3xx &= 1;
                                            if (var3xx != 0) {
                                                break label82;
                                            }

                                            int var60x = (var0xx.y()) ? 1 : 0;
                                            var4xx = var2xx + 1;
                                            var4xx = var2xx * var4xx;
                                            int var5xx = var2xx + 2;
                                            var4xx *= var5xx;
                                            var2xx += 3;
                                            var4xx *= var2xx;
                                            var2xx = var4xx & 7;
                                            if (var2xx != 0) {
                                                var1xx += 1963282988;
                                                var1xx ^= 1140364796;
                                                break label84;
                                            }

                                            var1xx |= -1230571673;
                                            var1xx ^= 1088654338;
                                            var2xx = var1xx + 1;
                                            var2xx = var1xx * var2xx;
                                            var4xx = var1xx + 2;
                                            var2xx *= var4xx;
                                            var4xx = var1xx + 3;
                                            var2xx *= var4xx;
                                            var2xx &= 7;
                                            if (var2xx != 0) {
                                                break label82;
                                            }

                                            if (var60x == 0) {
                                                var1xx *= 797337975;
                                                var1xx ^= -1101265930;
                                                var1xx ^= 1519051900;
                                                long var50x = var1xx;
                                                long var76x = var50x + 1L;
                                                long var77x = var50x * var76x;
                                                long var6x = var50x + 2L;
                                                long var78x = var77x * var6x;
                                                long var51x = var50x + 3L;
                                                long var79x = var78x * var51x;
                                                long var52x = var79x & 7L;
                                                long var89x;
                                                var2xx = (var89x = var52x - 0L) == 0L ? 0 : (var89x < 0L ? -1 : 1);
                                                if (var2xx != 0) {
                                                    break label82;
                                                }

                                                var54x = true;
                                                switch (var1xx) {
                                                    case -1819934815:
                                                        var1xx -= -714667078;
                                                        var1xx <<= 3;
                                                        var1xx >>>= 27;
                                                        var1xx &= 1501758694;
                                                        var1xx ^= 977495836;
                                                        break label79;
                                                    case -35592346:
                                                    default:
                                                        var1xx ^= 607102175;
                                                        break label79;
                                                    case 1368074396:
                                                        var1xx ^= -1101829036;
                                                        break label79;
                                                }
                                            }

                                            var1xx -= 776972247;
                                            var1xx ^= -688773320;
                                        } else {
                                            switch (var1xx) {
                                                case -1817914609:
                                                    var1xx ^= -1513968780;
                                                    break;
                                                case -249929093:
                                                default:
                                                    var1xx ^= 1200999575;
                                                    break;
                                                case 93503145:
                                                    var1xx <<= 9;
                                                    var1xx &= 332317707;
                                                    var1xx |= 1538403067;
                                                    var1xx ^= 1560904149;
                                            }
                                        }

                                        long var61x = var1xx;
                                        long var80x = var61x + 1L;
                                        var80x = var61x * var80x;
                                        long var7xx = var61x + 2L;
                                        var80x *= var7xx;
                                        long var62x = var61x + 3L;
                                        var80x *= var62x;
                                        long var63x = var80x & 7L;
                                        long var90x;
                                        var3xx = (var90x = var63x - 0L) == 0L ? 0 : (var90x < 0L ? -1 : 1);
                                        if (var3xx != 0) {
                                            break label82;
                                        }

                                        var54x = false;
                                        switch (var1xx) {
                                            case -908463771:
                                            default:
                                                var1xx ^= -188253420;
                                                break;
                                            case 116910894:
                                                var1xx |= -498958870;
                                                var1xx &= -843214290;
                                                var1xx ^= -1248130785;
                                                var1xx += -509414321;
                                                var1xx ^= 1754458266;
                                                break;
                                            case 1245037659:
                                                var1xx ^= 1264573066;
                                        }
                                    }

                                    long var65x = var1xx;
                                    long var84x = var65x + 1L;
                                    var84x = var65x * var84x;
                                    long var88x = var65x + 2L;
                                    var84x *= var88x;
                                    long var66x = var65x + 3L;
                                    var84x *= var66x;
                                    long var67x = var84x & 7L;
                                    long var91x;
                                    var1xx = (var91x = var67x - 0L) == 0L ? 0 : (var91x < 0L ? -1 : 1);
                                    if (var1xx == 0) {
                                        return var54x;
                                    }
                                    break label82;
                                }
                            }

                            Integer var55x = var1xx;
                            if (var55x != null) {
                                IllegalStateException var56x = new IllegalStateException();
                                throw var56x;
                            }
                        }

                        UnsupportedOperationException var42x = new UnsupportedOperationException();
                        throw var42x;
                    };
                    Stream var178 = var177.filter(var7x);
                    Function<Yn, String> var186 = Yn::F;
                    Stream var179 = var178.map(var186);
                    List var180 = var179.toList();
                    LiteralArgumentBuilder var187 = ClientCommandManager.literal("swing");
                    Command var8 = var0xx -> {
                        int var1xx = W;
                        var1xx ^= -2007318039;
                        int var2xx = System.identityHashCode(var0xx);
                        FabricClientCommandSource var3xx = (FabricClientCommandSource)var0xx.getSource();
                        var3xx = var3xx;
                        D[] var4xx = D.values();
                        Stream var31xx = Arrays.stream(var4xx);
                        Function var5xx = var0xxx -> {
                            int var1xxx = W;
                            var1xxx ^= 70679046;
                            int var2xxx = System.identityHashCode(var0xxx);
                            String var3xxx = ((Enum<?>)var0xxx).name();
                            Locale var4xxx = Locale.ROOT;
                            long var5xxx = var2xxx;
                            long var7xxx = var5xxx + 1L;
                            var7xxx = var5xxx * var7xxx;
                            long var9xxx = var5xxx + 2L;
                            var7xxx *= var9xxx;
                            var5xxx += 3L;
                            var7xxx *= var5xxx;
                            var5xxx = var7xxx & 7L;
                            long var38xx;
                            var2xxx = (var38xx = var5xxx - 0L) == 0L ? 0 : (var38xx < 0L ? -1 : 1);
                            if (var2xxx != 0) {
                                var5xxx = switch (var1xxx) {
                                    case -2078615444 -> var1xxx ^ 1406269868;
                                    case 741627628 -> {
                                        var1xxx ^= -313108318;
                                        var1xxx ^= 1283623528;
                                        var1xxx += 1646656894;
                                        yield var1xxx ^ 1081511191;
                                    }
                                    default -> var1xxx ^ 2110048255;
                                };
                                var7xxx = var5xxx + 1L;
                                var7xxx = var5xxx * var7xxx;
                                var5xxx = var7xxx & 1L;
                                long var39xx;
                                var2xxx = (var39xx = var5xxx - 0L) == 0L ? 0 : (var39xx < 0L ? -1 : 1);
                                if (var2xxx == 0) {
                                    RuntimeException var26xxx = new RuntimeException();
                                    throw var26xxx;
                                }
                            } else {
                                var1xxx |= 227561017;
                                var1xxx |= 1495435810;
                                var1xxx ^= -210535166;
                                var1xxx ^= -1576829869;
                                long var20xxx = var1xxx;
                                var5xxx = var20xxx + 1L;
                                var5xxx = var20xxx * var5xxx;
                                long var21xx = var5xxx & 1L;
                                long var40xx;
                                var1xxx = (var40xx = var21xx - 0L) == 0L ? 0 : (var40xx < 0L ? -1 : 1);
                                if (var1xxx == 0) {
                                    return var3xxx.toLowerCase(var4xxx);
                                }
                            }

                            RuntimeException var23xxx = new RuntimeException();
                            throw var23xxx;
                        };
                        Stream var32xx = var31xx.map(var5xx);
                        Collector var36x = Collectors.joining(", ");
                        String var34x = (String)var32xx.collect(var36x);
                        String var35x = "§7Swing styles: §f" + var34x;
                        long var37x = var2xx;
                        long var7xx = var37x + 1L;
                        var7xx = var37x * var7xx;
                        long var9xx = var37x + 2L;
                        var7xx *= var9xx;
                        long var38x = var37x + 3L;
                        var7xx *= var38x;
                        long var39x = var7xx & 7L;
                        long var47x;
                        var2xx = (var47x = var39x - 0L) == 0L ? 0 : (var47x < 0L ? -1 : 1);
                        if (var2xx == 0) {
                            var1xx &= 1730402003;
                            var1xx ^= 750411579;
                            var1xx &= 1129155619;
                            var1xx += -1265038390;
                            var1xx ^= 731543528;
                            long var40x = var1xx;
                            var7xx = var40x + 1L;
                            var7xx = var40x * var7xx;
                            long var41x = var7xx & 1L;
                            long var48x;
                            var2xx = (var48x = var41x - 0L) == 0L ? 0 : (var48x < 0L ? -1 : 1);
                            if (var2xx == 0) {
                                MutableText var27xx = Text.literal(var35x);
                                var3xx.sendFeedback(var27xx);
                                return 1;
                            }
                        } else {
                            var1xx *= 1666642525;
                            var1xx += 890650623;
                            var1xx ^= -1168595635;
                            long var20xx = var1xx;
                            long var29xx = var20xx + 1L;
                            long var30xx = var20xx * var29xx;
                            long var21x = var30xx & 1L;
                            long var49x;
                            var1xx = (var49x = var21x - 0L) == 0L ? 0 : (var49x < 0L ? -1 : 1);
                            if (var1xx == 0) {
                                IllegalArgumentException var24xx = new IllegalArgumentException();
                                throw var24xx;
                            }
                        }

                        IllegalArgumentException var23xx = new IllegalArgumentException();
                        throw var23xx;
                    };
                    ArgumentBuilder var188 = var187.executes(var8);
                    LiteralArgumentBuilder var189 = (LiteralArgumentBuilder)var188;
                    LiteralArgumentBuilder var190 = var189;
                    D[] var191 = D.values();
                    D[] var192 = var191;
                    int var9x = var191.length;
                    var9x = var9x;
                    int var10x = 0;
                    var10x = var10x;

                    var38 = switch (var38) {
                        case -310992514 -> var38 ^ 1362268146;
                        default -> var38 ^ 987334752;
                        case 1818738061 -> {
                            var38 += 732082712;
                            var38 *= 1786424829;
                            yield var38 ^ 1275712863;
                        }
                    };

                    while (var10x < var9x) {
                        var38 = switch (var38) {
                            case -2042620031 -> var38 ^ -1214460365;
                            case -1704132018 -> {
                                var38 &= 365608173;
                                var38 -= -2061505045;
                                yield var38 ^ 1838398243;
                            }
                            default -> var38 ^ -873933951;
                        };
                        Integer var11x = var38;
                        if (var11x == null) {
                            break label216;
                        }

                        D var225 = var192[var10x];
                        long var12x = var4x;
                        long var14x = var12x + 1L;
                        var14x = var12x * var14x;
                        long var16x = var12x + 2L;
                        var14x *= var16x;
                        var12x += 3L;
                        var14x *= var12x;
                        var12x = var14x & 7L;
                        long var432;
                        int var252 = (var432 = var12x - 0L) == 0L ? 0 : (var432 < 0L ? -1 : 1);
                        if (var252 != 0) {
                            switch (var38) {
                                case -1314343802:
                                default:
                                    var38 ^= 811457944;
                                    break label215;
                                case -701056586:
                                    var38 ^= 1187189368;
                                    break label215;
                                case -423909054:
                                    var38 |= -1663679936;
                                    var38 ^= 1858249766;
                                    break label215;
                            }
                        }
                        var38 = switch (var38) {
                            default -> var38 ^ -1538694229;
                            case -423909054 -> {
                                var38 *= 1417250737;
                                var38 -= -354008372;
                                var38 |= -752366861;
                                var38 >>>= 4;
                                yield var38 ^ 1723068561;
                            }
                            case -150065420 -> var38 ^ -1163517385;
                        };
                        String var253 = var225.name();
                        Locale var13x = Locale.ROOT;
                        String var254 = var253.toLowerCase(var13x);
                        LiteralArgumentBuilder var255 = ClientCommandManager.literal(var254);
                        Command var226 = var2xx -> {
                            int var3xx = W;
                            var3xx ^= -724533369;
                            int var4xx = System.identityHashCode(var0);
                            NW var5xx = var0.sP();
                            Yn var29xx = var5xx.tG(swinganimations.class);
                            swinganimations var30xx = (swinganimations)var29xx;
                            int var6x = var4xx + 1;
                            var6x = var4xx * var6x;
                            int var7xx = var4xx + 2;
                            var6x *= var7xx;
                            var4xx += 3;
                            var6x *= var4xx;
                            var4xx = var6x & 7;
                            if (var4xx == 0) {
                                var3xx ^= 1605551486;
                                var3xx |= 1709265697;
                                var3xx *= -1177830491;
                                var3xx >>>= 18;
                                var3xx ^= -1431754529;
                                long var37x = var3xx;
                                long var8x = var37x + 1L;
                                var8x = var37x * var8x;
                                long var10xx = var37x + 2L;
                                var8x *= var10xx;
                                long var38x = var37x + 3L;
                                var8x *= var38x;
                                long var39x = var8x & 7L;
                                long var43x;
                                var4xx = (var43x = var39x - 0L) == 0L ? 0 : (var43x < 0L ? -1 : 1);
                                if (var4xx == 0) {
                                    var30xx.sR(var225);
                                    var30xx.xt(true);
                                    Object var27xx = var2xx.getSource();
                                    FabricClientCommandSource var28xx = (FabricClientCommandSource)var27xx;
                                    String var31xx = r_2.R(var225);
                                    String var32xx = "§7Swing §f" + var31xx;
                                    MutableText var33xx = Text.literal(var32xx);
                                    var28xx.sendFeedback(var33xx);
                                    return 1;
                                }
                            } else {
                                var3xx -= 297273149;
                                var3xx ^= 823350359;
                                var3xx ^= -2033414724;
                                Integer var21x = var3xx;
                                if (var21x != null) {
                                    UnsupportedOperationException var23xx = new UnsupportedOperationException();
                                    throw var23xx;
                                }
                            }

                            IllegalStateException var22xx = new IllegalStateException();
                            throw var22xx;
                        };
                        ArgumentBuilder var227 = var255.executes(var226);
                        ArgumentBuilder var228 = var190.then(var227);
                        int var229 = var10x + 1;
                        var10x = var229;
                        var38 *= -457217485;
                        var38 ^= 1252372068;
                    }

                    var38 &= 1716376394;
                    var38 ^= 345763969;
                    var38 ^= -1813064731;
                    int var193 = var38 + 1;
                    int var194 = var38 * var193;
                    int var195 = var194 & 1;
                    if (var195 != 0) {
                        break label216;
                    }

                    LiteralArgumentBuilder var196 = ClientCommandManager.literal("kill");
                    var9x = var4x + 1;
                    var9x = var4x * var9x;
                    var9x &= 1;
                    if (var9x == 0) {
                        var38 |= 1553378653;
                        var38 |= 333768779;
                        var38 *= 683913977;
                        var38 ^= -609274017;
                        Command var204 = var1xx -> {
                            int var2xx = W;
                            var2xx ^= 223924661;
                            int var3xx = System.identityHashCode(var0);
                            FabricClientCommandSource var4xx = (FabricClientCommandSource)var1xx.getSource();
                            var4xx = var4xx;
                            NW var5xx = var0.sP();
                            Yn var26xx = var5xx.tG(killeffect.class);
                            killeffect var27xx = (killeffect)var26xx;
                            ws var28xx = var27xx.cm();
                            String var29xx = r_2.R(var28xx);
                            String var30xx = "§7Kill Effect §f" + var29xx + "§7 · opcje: §flight, sahur";
                            MutableText var31xx = Text.literal(var30xx);
                            long var6x = var3xx;
                            long var8x = var6x + 1L;
                            var8x = var6x * var8x;
                            long var10xx = var6x + 2L;
                            var8x *= var10xx;
                            var6x += 3L;
                            var8x *= var6x;
                            var6x = var8x & 7L;
                            long var37x;
                            var3xx = (var37x = var6x - 0L) == 0L ? 0 : (var37x < 0L ? -1 : 1);
                            if (var3xx != 0) {
                                var2xx &= 1141107397;
                                var2xx ^= -1512692787;
                                var2xx -= -1419950505;
                                var2xx ^= -725748681;
                                IllegalStateException var24xx = new IllegalStateException();
                                throw var24xx;
                            } else {
                                var2xx = switch (var2xx) {
                                    default -> var2xx ^ -1786083737;
                                    case 376389682 -> var2xx ^ -1807961825;
                                    case 626720095 -> {
                                        var2xx |= 1152333896;
                                        yield var2xx ^ 335863483;
                                    }
                                };
                                var3xx = var2xx + 1;
                                var3xx = var2xx * var3xx;
                                var2xx = var3xx & 1;
                                if (var2xx == 0) {
                                    var4xx.sendFeedback(var31xx);
                                    return 1;
                                } else {
                                    AssertionError var16xx = new AssertionError();
                                    throw var16xx;
                                }
                            }
                        };
                        ArgumentBuilder var197 = var196.executes(var204);
                        LiteralArgumentBuilder var198 = (LiteralArgumentBuilder)var197;
                        LiteralArgumentBuilder var199 = var198;
                        ws[] var205 = ws.values();
                        ws[] var206 = var205;
                        var10x = var205.length;
                        var10x = var10x;
                        int var230 = 0;
                        var230 = var230;

                        var38 = switch (var38) {
                            case 75200984 -> {
                                var38 *= -391574591;
                                var38 >>>= 3;
                                var38 -= 808952465;
                                yield var38 ^ 987011944;
                            }
                            case 212140669 -> var38 ^ 1056869936;
                            default -> var38 ^ -1450913060;
                        };

                        label201:
                        while (true) {
                            Integer var256 = var38;
                            if (var256 == null) {
                                break label216;
                            }

                            if (var230 >= var10x) {
                                var38 *= 1989263697;
                                var38 ^= -1663026025;
                                var38 ^= 977928901;
                                LiteralArgumentBuilder var207 = ClientCommandManager.literal("death");
                                Command var214 = var1xx -> {
                                    int var2xx = W;
                                    var2xx ^= -1911947207;
                                    int var3xx = System.identityHashCode(var0);
                                    FabricClientCommandSource var4xx = (FabricClientCommandSource)var1xx.getSource();
                                    var4xx = var4xx;
                                    long var5xx = var3xx;
                                    long var7xx = var5xx + 1L;
                                    var7xx = var5xx * var7xx;
                                    long var9xx = var5xx + 2L;
                                    var7xx *= var9xx;
                                    var5xx += 3L;
                                    var7xx *= var5xx;
                                    var5xx = var7xx & 7L;
                                    long var48x;
                                    var3xx = (var48x = var5xx - 0L) == 0L ? 0 : (var48x < 0L ? -1 : 1);
                                    if (var3xx != 0) {
                                        var2xx >>= 16;
                                        var2xx &= -692896543;
                                        var2xx ^= -1498690143;
                                        var3xx = var2xx + 1;
                                        var3xx = var2xx * var3xx;
                                        var3xx &= 1;
                                        if (var3xx == 0) {
                                            AssertionError var32xx = new AssertionError();
                                            throw var32xx;
                                        }
                                    } else {
                                        var2xx = switch (var2xx) {
                                            case -1509413677 -> {
                                                var2xx ^= -378921436;
                                                var2xx ^= -636483184;
                                                var2xx |= -1510731412;
                                                yield var2xx ^ -1409568411;
                                            }
                                            default -> var2xx ^ -86386912;
                                            case 1722477686 -> var2xx ^ 143726549;
                                        };
                                        var3xx = var2xx + 1;
                                        var3xx = var2xx * var3xx;
                                        var2xx = var3xx & 1;
                                        if (var2xx == 0) {
                                            NW var21x = var0.sP();
                                            Yn var22xx = var21x.tG(deatheffect.class);
                                            deatheffect var23xx = (deatheffect)var22xx;
                                            d_2 var24xx = var23xx.O();
                                            String var25xx = r_2.R(var24xx);
                                            d_2[] var35x = d_2.values();
                                            Stream var36x = Arrays.stream(var35x);
                                            Function var43x = var0xxx -> {
                                                int var1xxx = W;
                                                var1xxx ^= -1907752930;
                                                int var2xxx = System.identityHashCode(var0xxx);
                                                Integer var13xxx = var2xxx;
                                                if (var13xxx != null) {
                                                    var1xxx += -87768385;
                                                    var1xxx += -676041880;
                                                    var1xxx += 156272507;
                                                    var1xxx -= 750402936;
                                                    var1xxx ^= -245899131;
                                                    String var14xxx = ((Enum<?>)var0xxx).name();
                                                    Locale var3xxx = Locale.ROOT;
                                                    return var14xxx.toLowerCase(var3xxx);
                                                } else {
                                                    var1xxx &= -2041085598;
                                                    var1xxx ^= -68100363;
                                                    IllegalStateException var7xxx = new IllegalStateException();
                                                    throw var7xxx;
                                                }
                                            };
                                            Stream var37x = var36x.map(var43x);
                                            Collector var44x = Collectors.joining(", ");
                                            Object var38x = var37x.collect(var44x);
                                            String var39x = (String)var38x;
                                            String var26xx = "§7Death Effect §f" + var25xx + "§7 · options: §f" + var39x;
                                            MutableText var27xx = Text.literal(var26xx);
                                            var4xx.sendFeedback(var27xx);
                                            return 1;
                                        }
                                    }

                                    UnsupportedOperationException var20xx = new UnsupportedOperationException();
                                    throw var20xx;
                                };
                                ArgumentBuilder var208 = var207.executes(var214);
                                LiteralArgumentBuilder var209 = (LiteralArgumentBuilder)var208;
                                LiteralArgumentBuilder var210 = var209;
                                d_2[] var215 = d_2.values();
                                long var232 = var4x;
                                long var298 = var232 + 1L;
                                var298 = var232 * var298;
                                long var368 = var232 + 2L;
                                var298 *= var368;
                                long var233 = var232 + 3L;
                                var298 *= var233;
                                long var234 = var298 & 7L;
                                long var433;
                                var230 = (var433 = var234 - 0L) == 0L ? 0 : (var433 < 0L ? -1 : 1);
                                if (var230 == 0) {
                                    var38 &= 878071253;
                                    var38 &= -186743747;
                                    var38 ^= -715745354;
                                    var38 ^= -1254089469;
                                    var38 ^= -1574516112;
                                    d_2[] var216 = var215;
                                    var230 = var215.length;
                                    var230 = var230;
                                    byte var262 = 0;
                                    int var263 = var262;
                                    var38 >>= 16;
                                    var38 &= -1773239705;
                                    var38 -= -64020554;
                                    var38 += -810974654;
                                    var38 ^= 1845172656;

                                    while (true) {
                                        Integer var302 = var38;
                                        if (var302 == null) {
                                            break label216;
                                        }

                                        if (var263 >= var230) {
                                            var38 = switch (var38) {
                                                case 70515996 -> {
                                                    var38 += 54621954;
                                                    yield var38 ^ -568245472;
                                                }
                                                default -> var38 ^ 138389060;
                                                case 2147260954 -> var38 ^ 245821481;
                                            };
                                            long var217 = var38;
                                            long var264 = var217 + 1L;
                                            long var265 = var217 * var264;
                                            long var333 = var217 + 2L;
                                            long var266 = var265 * var333;
                                            long var218 = var217 + 3L;
                                            long var267 = var266 * var218;
                                            long var219 = var267 & 7L;
                                            long var434;
                                            var10x = (var434 = var219 - 0L) == 0L ? 0 : (var434 < 0L ? -1 : 1);
                                            if (var10x != 0) {
                                                break label216;
                                            }

                                            LiteralArgumentBuilder var221 = ClientCommandManager.literal("theme");
                                            Command var238 = var1xx -> {
                                                int var2xx = W;
                                                var2xx ^= 351453111;
                                                int var3xx = System.identityHashCode(var0);
                                                eG[] var4xx = eG.values();
                                                Stream var26xx = Arrays.stream(var4xx);
                                                Function var5xx = var0xxx -> {
                                                    int var1xxx = W;
                                                    var1xxx ^= 1384314349;
                                                    int var2xxx = System.identityHashCode(var0xxx);
                                                    String var3xxx = ((Enum<?>)var0xxx).name();
                                                    long var4xxx = var2xxx;
                                                    long var6xx = var4xxx + 1L;
                                                    var6xx = var4xxx * var6xx;
                                                    long var8xx = var4xxx + 2L;
                                                    var6xx *= var8xx;
                                                    var4xxx += 3L;
                                                    var6xx *= var4xxx;
                                                    var4xxx = var6xx & 7L;
                                                    long var28xxx;
                                                    var2xxx = (var28xxx = var4xxx - 0L) == 0L ? 0 : (var28xxx < 0L ? -1 : 1);
                                                    if (var2xxx == 0) {
                                                        switch (var1xxx) {
                                                            case -1017191246:
                                                                var1xxx ^= -1106279226;
                                                                break;
                                                            case 804700626:
                                                            default:
                                                                var1xxx ^= 1105443144;
                                                                break;
                                                            case 2055264519:
                                                                var1xxx ^= -509260158;
                                                                var1xxx |= -1969052429;
                                                                var1xxx ^= 557237928;
                                                        }

                                                        Locale var22xxx = Locale.ROOT;
                                                        return var3xxx.toLowerCase(var22xxx);
                                                    } else {
                                                        var1xxx += 96739988;
                                                        var1xxx &= 1333396573;
                                                        var1xxx ^= -975571575;
                                                        var1xxx ^= 942815358;
                                                        IllegalArgumentException var15xxx = new IllegalArgumentException();
                                                        throw var15xxx;
                                                    }
                                                };
                                                Stream var27xx = var26xx.map(var5xx);
                                                Collector var30xx = Collectors.joining(", ");
                                                String var29xx = (String)var27xx.collect(var30xx);
                                                FabricClientCommandSource var32xx = (FabricClientCommandSource)var1xx.getSource();
                                                NW var6x = var0.sP();
                                                Yn var33xx = var6x.tG(hudstyle.class);
                                                hudstyle var34x = (hudstyle)var33xx;
                                                int var7xx = var3xx + 1;
                                                var7xx = var3xx * var7xx;
                                                var3xx = var7xx & 1;
                                                if (var3xx != 0) {
                                                    var2xx *= 375779867;
                                                    var2xx &= 523299414;
                                                    var2xx -= -880501204;
                                                    var2xx ^= -697378542;
                                                    Integer var24xx = var2xx;
                                                    if (var24xx != null) {
                                                        IllegalStateException var25xx = new IllegalStateException();
                                                        throw var25xx;
                                                    }
                                                } else {
                                                    var2xx ^= -716626937;
                                                    var2xx += -799189435;
                                                    var2xx &= -1816067039;
                                                    var2xx ^= -1532777578;
                                                    Integer var17xx = var2xx;
                                                    if (var17xx != null) {
                                                        eG var19xx = var34x.zf();
                                                        String var20xx = r_2.R(var19xx);
                                                        String var21x = "§7HUD theme §f" + var20xx + "§7 · options: §f" + var29xx;
                                                        MutableText var22xx = Text.literal(var21x);
                                                        var32xx.sendFeedback(var22xx);
                                                        return 1;
                                                    }
                                                }

                                                AssertionError var18xx = new AssertionError();
                                                throw var18xx;
                                            };
                                            ArgumentBuilder var222 = var221.executes(var238);
                                            LiteralArgumentBuilder var223 = (LiteralArgumentBuilder)var222;
                                            LiteralArgumentBuilder var224 = var223;
                                            eG[] var239 = eG.values();
                                            eG[] var240 = var239;
                                            var263 = var4x + 1;
                                            var263 = var4x * var263;
                                            var263 &= 1;
                                            if (var263 != 0) {
                                                var38 &= 2146016751;
                                                var38 >>= 13;
                                                var38 *= 569788973;
                                                var38 >>>= 8;
                                                var38 ^= -1864913178;
                                            } else {
                                                var38 ^= 345244632;
                                                var38 *= -1578046441;
                                                var38 &= 1738805904;
                                                var38 &= 313416782;
                                                var38 ^= 1405069046;
                                                long var271 = var38;
                                                var333 = var271 + 1L;
                                                var333 = var271 * var333;
                                                long var399 = var271 + 2L;
                                                var333 *= var399;
                                                long var272 = var271 + 3L;
                                                var333 *= var272;
                                                long var273 = var333 & 7L;
                                                long var435;
                                                var263 = (var435 = var273 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
                                                if (var263 != 0) {
                                                    break label216;
                                                }

                                                var263 = var239.length;
                                                var263 = var263;
                                                byte var312 = 0;
                                                int var313 = var312;
                                                var38 ^= -8525224;
                                                var38 &= 940842405;
                                                var38 &= -741355801;
                                                var38 ^= 258793373;

                                                while (var313 < var263) {
                                                    var38 <<= 20;
                                                    var38 ^= -900138505;
                                                    int var338 = var38 + 1;
                                                    int var339 = var38 * var338;
                                                    int var381 = var38 + 2;
                                                    int var340 = var339 * var381;
                                                    int var382 = var38 + 3;
                                                    int var341 = var340 * var382;
                                                    int var342 = var341 & 7;
                                                    if (var342 != 0) {
                                                        break label216;
                                                    }

                                                    eG var343 = var240[var313];
                                                    String var383 = var343.name();
                                                    Locale var400 = Locale.ROOT;
                                                    String var384 = var383.toLowerCase(var400);
                                                    LiteralArgumentBuilder var385 = ClientCommandManager.literal(var384);
                                                    var399 = var4x;
                                                    long var18x = var399 + 1L;
                                                    var18x = var399 * var18x;
                                                    long var20x = var399 + 2L;
                                                    var18x *= var20x;
                                                    var399 += 3L;
                                                    var18x *= var399;
                                                    var399 = var18x & 7L;
                                                    long var436;
                                                    int var404 = (var436 = var399 - 0L) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                                                    if (var404 != 0) {
                                                        var38 &= -1082016315;
                                                        var38 ^= 700315297;
                                                        break label201;
                                                    }
                                                    var38 = switch (var38) {
                                                        default -> var38 ^ -1471739976;
                                                        case -104269321 -> {
                                                            var38 *= 1322486059;
                                                            var38 += 886115148;
                                                            var38 *= 326596645;
                                                            yield var38 ^ 369498389;
                                                        }
                                                        case 1063491696 -> var38 ^ -721054769;
                                                    };
                                                    Command var344 = var2xx -> {
                                                        int var3xx = W;
                                                        var3xx ^= 1506692546;
                                                        int var4xx = System.identityHashCode(var0);
                                                        NW var5xx = var0.sP();
                                                        Yn var26xx = var5xx.tG(hudstyle.class);
                                                        hudstyle var27xx = (hudstyle)var26xx;
                                                        var27xx.Wf(var343);
                                                        FabricClientCommandSource var28xx = (FabricClientCommandSource)var2xx.getSource();
                                                        var28xx = var28xx;
                                                        String var6x = r_2.R(var343);
                                                        var6x = "§7HUD theme §f" + var6x;
                                                        MutableText var31xx = Text.literal(var6x);
                                                        int var7xx = var4xx + 1;
                                                        var7xx = var4xx * var7xx;
                                                        var4xx = var7xx & 1;
                                                        if (var4xx == 0) {
                                                            var3xx ^= -1080353930;
                                                            var3xx ^= 1453551046;
                                                            long var33xx = var3xx;
                                                            long var9xx = var33xx + 1L;
                                                            var9xx = var33xx * var9xx;
                                                            long var11xx = var33xx + 2L;
                                                            var9xx *= var11xx;
                                                            long var34x = var33xx + 3L;
                                                            var9xx *= var34x;
                                                            long var35x = var9xx & 7L;
                                                            long var39x;
                                                            var4xx = (var39x = var35x - 0L) == 0L ? 0 : (var39x < 0L ? -1 : 1);
                                                            if (var4xx == 0) {
                                                                var28xx.sendFeedback(var31xx);
                                                                return 1;
                                                            }
                                                        } else {
                                                            var3xx ^= -280612133;
                                                            var3xx -= -1125117354;
                                                            var3xx &= -1254227338;
                                                            var3xx -= 501376951;
                                                            var3xx ^= -856100668;
                                                            Integer var21x = var3xx;
                                                            if (var21x != null) {
                                                                RuntimeException var23xx = new RuntimeException();
                                                                throw var23xx;
                                                            }
                                                        }

                                                        IllegalStateException var22xx = new IllegalStateException();
                                                        throw var22xx;
                                                    };
                                                    ArgumentBuilder var345 = var385.executes(var344);
                                                    ArgumentBuilder var346 = var224.then(var345);
                                                    int var347 = var313 + 1;
                                                    var313 = var347;
                                                    var38 += -1994650136;
                                                    var38 ^= -142058544;
                                                    var38 <<= 8;
                                                    var38 ^= -75562183;
                                                }

                                                var38 *= -182844673;
                                                var38 ^= -287122242;
                                                var38 += 1971821607;
                                                var38 ^= -2132958921;
                                                var38 ^= 1639032749;
                                                Integer var241 = var38;
                                                if (var241 == null) {
                                                    break label216;
                                                }

                                                LiteralArgumentBuilder var242 = ClientCommandManager.literal("clickgui");
                                                Command var277 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 253627455;
                                                    int var3xx = System.identityHashCode(var0);
                                                    long var4xx = var3xx;
                                                    long var6x = var4xx + 1L;
                                                    var6x = var4xx * var6x;
                                                    var4xx = var6x & 1L;
                                                    long var84x;
                                                    int var50x = (var84x = var4xx - 0L) == 0L ? 0 : (var84x < 0L ? -1 : 1);
                                                    if (var50x != 0) {
                                                        switch (var2xx) {
                                                            case 41936926:
                                                                var2xx ^= -1680658452;
                                                                break;
                                                            case 656154837:
                                                                var2xx -= 199570290;
                                                                var2xx ^= -1568631505;
                                                                break;
                                                            case 852132780:
                                                            default:
                                                                var2xx ^= -1613018631;
                                                        }
                                                    } else {
                                                        label68: {
                                                            var2xx -= 1869510055;
                                                            var2xx ^= -1190472331;
                                                            int var51x = var2xx + 1;
                                                            int var52x = var2xx * var51x;
                                                            int var53x = var52x & 1;
                                                            label57:
                                                            if (var53x == 0) {
                                                                NW var54x = var0.sP();
                                                                Yn var55x = var54x.tG(clickgui.class);
                                                                clickgui var56x = (clickgui)var55x;
                                                                ia var57x = var56x.fA();
                                                                FabricClientCommandSource var5xx = (FabricClientCommandSource)var1xx.getSource();
                                                                var5xx = var5xx;
                                                                int var65x = (var57x.r()) ? 1 : 0;
                                                                String var61x;
                                                                if (var65x != 0) {
                                                                    var2xx |= 244334574;
                                                                    var2xx ^= 970039537;
                                                                    int var58x = var57x.JQ();
                                                                    String var59x = i_2.Q(var58x);
                                                                    String var60x = "§7Click GUI pod klawiszem §f"
                                                                        + var59x
                                                                        + " §8· §7zmiana: §f/aura clickgui <klawisz>";
                                                                    int var66x = var3xx + 1;
                                                                    int var67x = var3xx * var66x;
                                                                    int var7xx = var3xx + 2;
                                                                    int var68x = var67x * var7xx;
                                                                    var7xx = var3xx + 3;
                                                                    int var69x = var68x * var7xx;
                                                                    int var70x = var69x & 7;
                                                                    if (var70x != 0) {
                                                                        var2xx *= -155493439;
                                                                        var2xx += -2113942929;
                                                                        var2xx *= -1088619107;
                                                                        var2xx ^= 90932581;
                                                                        break label68;
                                                                    }

                                                                    var2xx -= -693781912;
                                                                    var2xx -= 2006922462;
                                                                    var2xx &= 110241825;
                                                                    var2xx ^= -2031072165;
                                                                    var2xx ^= 2086932436;
                                                                    var6x = var2xx;
                                                                    long var8x = var6x + 1L;
                                                                    var8x = var6x * var8x;
                                                                    long var10xx = var6x + 2L;
                                                                    var8x *= var10xx;
                                                                    var6x += 3L;
                                                                    var8x *= var6x;
                                                                    var6x = var8x & 7L;
                                                                    long var85x;
                                                                    int var74x = (var85x = var6x - 0L) == 0L ? 0 : (var85x < 0L ? -1 : 1);
                                                                    if (var74x != 0) {
                                                                        break label57;
                                                                    }

                                                                    var61x = var60x;
                                                                    switch (var2xx) {
                                                                        case -2019856935:
                                                                            var2xx ^= -2093175352;
                                                                            break;
                                                                        case -90936433:
                                                                            var2xx >>>= 20;
                                                                            var2xx ^= -108144380;
                                                                            break;
                                                                        case 1647789160:
                                                                        default:
                                                                            var2xx ^= 1416128973;
                                                                    }
                                                                } else {
                                                                    var2xx &= -1920853034;
                                                                    var2xx ^= 1304818850;
                                                                    var61x = "§7Click GUI bez klawisza §8· §7ustaw: §f/aura clickgui <klawisz>";
                                                                    switch (var2xx) {
                                                                        case -1970077920:
                                                                        default:
                                                                            var2xx ^= 1099373646;
                                                                            break;
                                                                        case 700680705:
                                                                            var2xx ^= 2098545920;
                                                                            break;
                                                                        case 1095233264:
                                                                            var2xx ^= 1411695457;
                                                                            var2xx *= -744153351;
                                                                            var2xx ^= -1211201884;
                                                                    }
                                                                }

                                                                MutableText var62x = Text.literal(var61x);
                                                                int var75x = var3xx + 1;
                                                                int var76x = var3xx * var75x;
                                                                int var80x = var3xx + 2;
                                                                int var77x = var76x * var80x;
                                                                var3xx += 3;
                                                                int var78x = var77x * var3xx;
                                                                var3xx = var78x & 7;
                                                                if (var3xx != 0) {
                                                                    var2xx += 935828723;
                                                                    var2xx *= 1961890443;
                                                                    var2xx *= 504840891;
                                                                    var2xx ^= -881002260;
                                                                    break label68;
                                                                }

                                                                var2xx -= 1221076275;
                                                                var2xx &= -1774597346;
                                                                var2xx &= 1015927177;
                                                                var2xx ^= 1267484596;
                                                                Integer var47x = var2xx;
                                                                if (var47x != null) {
                                                                    var5xx.sendFeedback(var62x);
                                                                    return 1;
                                                                }
                                                            }

                                                            RuntimeException var48x = new RuntimeException();
                                                            throw var48x;
                                                        }
                                                    }

                                                    IllegalStateException var44x = new IllegalStateException();
                                                    throw var44x;
                                                };
                                                ArgumentBuilder var243 = var242.executes(var277);
                                                LiteralArgumentBuilder var244 = (LiteralArgumentBuilder)var243;
                                                StringArgumentType var278 = StringArgumentType.word();
                                                RequiredArgumentBuilder var279 = ClientCommandManager.argument("key", var278);
                                                SuggestionProvider var152 = (var1xx, var2xx) -> {
                                                    int var3xx = W;
                                                    var3xx ^= 225269599;
                                                    int var4xx = System.identityHashCode(var151);
                                                    long var18xx = var4xx;
                                                    long var6x = var18xx + 1L;
                                                    var6x = var18xx * var6x;
                                                    long var8x = var18xx + 2L;
                                                    var6x *= var8x;
                                                    long var19xx = var18xx + 3L;
                                                    var6x *= var19xx;
                                                    long var20xx = var6x & 7L;
                                                    long var36x;
                                                    var4xx = (var36x = var20xx - 0L) == 0L ? 0 : (var36x < 0L ? -1 : 1);
                                                    if (var4xx == 0) {
                                                        var3xx = switch (var3xx) {
                                                            default -> var3xx ^ -1202560439;
                                                            case -277579324 -> var3xx ^ -1637431317;
                                                            case 628063157 -> {
                                                                var3xx += 1981771153;
                                                                yield var3xx ^ -978368052;
                                                            }
                                                        };
                                                        var4xx = var3xx + 1;
                                                        var4xx = var3xx * var4xx;
                                                        int var5xx = var3xx + 2;
                                                        var4xx *= var5xx;
                                                        var5xx = var3xx + 3;
                                                        var4xx *= var5xx;
                                                        var4xx &= 7;
                                                        if (var4xx == 0) {
                                                            var4xx = var3xx >>> 22;
                                                            var4xx >>>= 16;
                                                            var4xx *= 1705241051;
                                                            var4xx >>= 18;
                                                            var4xx ^= -841992171;
                                                            return V(var151, var2xx, var4xx);
                                                        }
                                                    } else {
                                                        var3xx *= 1767595923;
                                                        var3xx ^= 385948517;
                                                        Integer var15xx = var3xx;
                                                        if (var15xx != null) {
                                                            AssertionError var17xx = new AssertionError();
                                                            throw var17xx;
                                                        }
                                                    }

                                                    IllegalStateException var16xx = new IllegalStateException();
                                                    throw var16xx;
                                                };
                                                RequiredArgumentBuilder var153 = var279.suggests(var152);
                                                Command var280 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 1090627607;
                                                    int var3xx = System.identityHashCode(var0);
                                                    Object var4xx = var1xx.getSource();
                                                    Integer var17xx = var3xx;
                                                    if (var17xx != null) {
                                                        var2xx *= 191123985;
                                                        var2xx |= 969956692;
                                                        var2xx += -1552679010;
                                                        var2xx ^= -1852462856;
                                                        FabricClientCommandSource var18xx = (FabricClientCommandSource)var4xx;
                                                        var4xx = StringArgumentType.getString(var1xx, "key");
                                                        int var5xx = var2xx << 24;
                                                        var5xx |= 879938105;
                                                        var5xx *= 739724333;
                                                        var5xx ^= -151705400;
                                                        return H(var0, var18xx, (String)var4xx, var5xx);
                                                    } else {
                                                        var2xx &= 791406873;
                                                        var2xx |= -493637826;
                                                        var2xx ^= 1892178858;
                                                        Integer var10xx = var2xx;
                                                        if (var10xx == null) {
                                                            UnsupportedOperationException var12xx = new UnsupportedOperationException();
                                                            throw var12xx;
                                                        } else {
                                                            UnsupportedOperationException var11xx = new UnsupportedOperationException();
                                                            throw var11xx;
                                                        }
                                                    }
                                                };
                                                ArgumentBuilder var154 = var153.executes(var280);
                                                ArgumentBuilder var155 = var244.then(var154);
                                                LiteralArgumentBuilder var156 = (LiteralArgumentBuilder)var155;
                                                LiteralArgumentBuilder var245 = ClientCommandManager.literal("license");
                                                Command var281 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= -2005324446;
                                                    int var3xx = System.identityHashCode(var0);
                                                    gj var4xx = var0.gE();
                                                    Runnable var5xx = () -> {
                                                        int var1xxx = W;
                                                        var1xxx ^= 1552393454;
                                                        int var2xxx = System.identityHashCode(var0);
                                                        Integer var17xxx = var2xxx;
                                                        if (var17xxx != null) {
                                                            var1xxx <<= 15;
                                                            var1xxx += -1954604092;
                                                            var1xxx &= -391601150;
                                                            var1xxx += -750751664;
                                                            var1xxx ^= -582279252;
                                                            int var18xxx = var1xxx + 1;
                                                            var18xxx = var1xxx * var18xxx;
                                                            var18xxx &= 1;
                                                            if (var18xxx == 0) {
                                                                Na var21xx = new Na(var0);
                                                                i_2.m(var21xx);
                                                                return;
                                                            }
                                                        } else {
                                                            var1xxx |= -1361368393;
                                                            var1xxx -= -969112407;
                                                            var1xxx += -33378638;
                                                            var1xxx += -1538540359;
                                                            var1xxx ^= -508247389;
                                                            int var22xxx = var1xxx + 1;
                                                            var22xxx = var1xxx * var22xxx;
                                                            var1xxx = var22xxx & 1;
                                                            if (var1xxx == 0) {
                                                                RuntimeException var16xxx = new RuntimeException();
                                                                throw var16xxx;
                                                            }
                                                        }

                                                        IllegalStateException var15xxx = new IllegalStateException();
                                                        throw var15xxx;
                                                    };
                                                    long var6x = var3xx;
                                                    long var8x = var6x + 1L;
                                                    var8x = var6x * var8x;
                                                    var6x = var8x & 1L;
                                                    long var36x;
                                                    var3xx = (var36x = var6x - 0L) == 0L ? 0 : (var36x < 0L ? -1 : 1);
                                                    if (var3xx == 0) {
                                                        var2xx ^= -1022587739;
                                                        var2xx ^= 1834906781;
                                                        var6x = var2xx;
                                                        var8x = var6x + 1L;
                                                        var8x = var6x * var8x;
                                                        long var10xx = var6x + 2L;
                                                        var8x *= var10xx;
                                                        var6x += 3L;
                                                        var8x *= var6x;
                                                        var6x = var8x & 7L;
                                                        long var37x;
                                                        var3xx = (var37x = var6x - 0L) == 0L ? 0 : (var37x < 0L ? -1 : 1);
                                                        if (var3xx == 0) {
                                                            var4xx.Zl(50L, var5xx);
                                                            return 1;
                                                        }
                                                    } else {
                                                        var2xx += -1734760782;
                                                        var2xx >>>= 7;
                                                        var2xx ^= -1643257377;
                                                        long var18xx = var2xx;
                                                        long var25xx = var18xx + 1L;
                                                        long var26xx = var18xx * var25xx;
                                                        long var19xx = var26xx & 1L;
                                                        long var38x;
                                                        var2xx = (var38x = var19xx - 0L) == 0L ? 0 : (var38x < 0L ? -1 : 1);
                                                        if (var2xx == 0) {
                                                            AssertionError var22xx = new AssertionError();
                                                            throw var22xx;
                                                        }
                                                    }

                                                    RuntimeException var21x = new RuntimeException();
                                                    throw var21x;
                                                };
                                                ArgumentBuilder var246 = var245.executes(var281);
                                                LiteralArgumentBuilder var247 = (LiteralArgumentBuilder)var246;
                                                LiteralArgumentBuilder var282 = ClientCommandManager.literal("retry");
                                                Command var314 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= -48511884;
                                                    int var3xx = System.identityHashCode(var0);
                                                    xy var4xx = var0.nT();
                                                    var4xx.Wr();
                                                    Integer var18xx = var3xx;
                                                    if (var18xx != null) {
                                                        var2xx ^= -1615263049;
                                                        var2xx &= 1648140859;
                                                        var2xx ^= 1249915546;
                                                        int var19xx = var2xx + 1;
                                                        var19xx = var2xx * var19xx;
                                                        var19xx &= 1;
                                                        if (var19xx == 0) {
                                                            Object var22xx = var1xx.getSource();
                                                            FabricClientCommandSource var23xx = (FabricClientCommandSource)var22xx;
                                                            MutableText var24xx = Text.literal("§7Licencja: ponawiam połączenie…");
                                                            var23xx.sendFeedback(var24xx);
                                                            return 1;
                                                        }
                                                    } else {
                                                        var2xx ^= -1987848350;
                                                        var2xx <<= 1;
                                                        var2xx ^= 2029020652;
                                                        long var13xx = var2xx;
                                                        long var25xx = var13xx + 1L;
                                                        long var26xx = var13xx * var25xx;
                                                        long var14xx = var26xx & 1L;
                                                        long var27xx;
                                                        var2xx = (var27xx = var14xx - 0L) == 0L ? 0 : (var27xx < 0L ? -1 : 1);
                                                        if (var2xx == 0) {
                                                            IllegalStateException var17xx = new IllegalStateException();
                                                            throw var17xx;
                                                        }
                                                    }

                                                    RuntimeException var16xx = new RuntimeException();
                                                    throw var16xx;
                                                };
                                                ArgumentBuilder var283 = var282.executes(var314);
                                                ArgumentBuilder var248 = var247.then(var283);
                                                LiteralArgumentBuilder var249 = (LiteralArgumentBuilder)var248;
                                                LiteralArgumentBuilder var284 = ClientCommandManager.literal("motionblur");
                                                Command var315 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 2090609228;
                                                    int var3xx = System.identityHashCode(var0);
                                                    NW var4xx = var0.sP();
                                                    Yn var32xx = var4xx.tG(motionblur.class);
                                                    motionblur var33xx = (motionblur)var32xx;
                                                    var33xx.bq();
                                                    FabricClientCommandSource var5xx = (FabricClientCommandSource)var1xx.getSource();
                                                    var5xx = var5xx;
                                                    int var6x = var2xx * 1399224211;
                                                    var6x ^= 448296349;
                                                    var6x ^= 925928191;
                                                    String var34x = ep(var33xx, var6x);
                                                    MutableText var35x = Text.literal(var34x);
                                                    Integer var25xx = var3xx;
                                                    if (var25xx == null) {
                                                        var2xx &= -1514730933;
                                                        var2xx *= -1783251547;
                                                        var2xx += -1098499267;
                                                        var2xx ^= -11465341;
                                                        int var26xx = var2xx + 1;
                                                        var26xx = var2xx * var26xx;
                                                        var6x = var2xx + 2;
                                                        var26xx *= var6x;
                                                        var6x = var2xx + 3;
                                                        var26xx *= var6x;
                                                        var26xx &= 7;
                                                        if (var26xx == 0) {
                                                            AssertionError var31xx = new AssertionError();
                                                            throw var31xx;
                                                        }
                                                    } else {
                                                        var2xx >>= 12;
                                                        var2xx ^= -549076148;
                                                        var2xx += 1463683502;
                                                        var2xx *= -27650931;
                                                        var2xx ^= -1729800189;
                                                        long var20xx = var2xx;
                                                        long var41x = var20xx + 1L;
                                                        long var42x = var20xx * var41x;
                                                        long var8x = var20xx + 2L;
                                                        long var43x = var42x * var8x;
                                                        long var21x = var20xx + 3L;
                                                        long var44x = var43x * var21x;
                                                        long var22xx = var44x & 7L;
                                                        long var45x;
                                                        var2xx = (var45x = var22xx - 0L) == 0L ? 0 : (var45x < 0L ? -1 : 1);
                                                        if (var2xx == 0) {
                                                            var5xx.sendFeedback(var35x);
                                                            return 1;
                                                        }
                                                    }

                                                    IllegalStateException var24xx = new IllegalStateException();
                                                    throw var24xx;
                                                };
                                                ArgumentBuilder var285 = var284.executes(var315);
                                                LiteralArgumentBuilder var286 = (LiteralArgumentBuilder)var285;
                                                FloatArgumentType var316 = FloatArgumentType.floatArg(0.0F, 2.0F);
                                                RequiredArgumentBuilder var317 = ClientCommandManager.argument("strength", var316);
                                                Command var348 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= -1495120688;
                                                    int var3xx = System.identityHashCode(var0);
                                                    NW var4xx = var0.sP();
                                                    Yn var27xx = var4xx.tG(motionblur.class);
                                                    motionblur var28xx = (motionblur)var27xx;
                                                    int var5xx = var3xx + 1;
                                                    var5xx = var3xx * var5xx;
                                                    int var6x = var3xx + 2;
                                                    var5xx *= var6x;
                                                    var3xx += 3;
                                                    var5xx *= var3xx;
                                                    var3xx = var5xx & 7;
                                                    if (var3xx != 0) {
                                                        var2xx -= 610019458;
                                                        var2xx ^= 1281949807;
                                                        var2xx ^= -739586226;
                                                        IllegalArgumentException var26xx = new IllegalArgumentException();
                                                        throw var26xx;
                                                    } else {
                                                        Integer var11xx = switch (var2xx) {
                                                            case -1897895878 -> {
                                                                var2xx |= 1899526487;
                                                                var2xx ^= -949346992;
                                                                yield var2xx ^ 937677968;
                                                            }
                                                            case -1238767108 -> var2xx ^ -1132915017;
                                                            default -> var2xx ^ 2105055963;
                                                        };
                                                        if (var11xx == null) {
                                                            AssertionError var17xx = new AssertionError();
                                                            throw var17xx;
                                                        } else {
                                                            float var23xx = FloatArgumentType.getFloat(var1xx, "strength");
                                                            var28xx.hJ(var23xx);
                                                            var28xx.xt(true);
                                                            Object var24xx = var1xx.getSource();
                                                            FabricClientCommandSource var25xx = (FabricClientCommandSource)var24xx;
                                                            Locale var29xx = Locale.ROOT;
                                                            Object[] var33xx = new Object[1];
                                                            float var13xx = var28xx.p();
                                                            Float var14xx = var13xx;
                                                            var33xx[0] = var14xx;
                                                            String var15xx = String.format(var29xx, "§7Siła Motion Blur §f%.2f", var33xx);
                                                            MutableText var16xx = Text.literal(var15xx);
                                                            var25xx.sendFeedback(var16xx);
                                                            return 1;
                                                        }
                                                    }
                                                };
                                                ArgumentBuilder var318 = var317.executes(var348);
                                                ArgumentBuilder var287 = var286.then(var318);
                                                LiteralArgumentBuilder var288 = (LiteralArgumentBuilder)var287;
                                                LiteralArgumentBuilder var319 = ClientCommandManager.literal("ghost");
                                                Command var349 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 1293535789;
                                                    int var3xx = System.identityHashCode(var0);
                                                    int var4xx = var3xx + 1;
                                                    var4xx = var3xx * var4xx;
                                                    var3xx = var4xx & 1;
                                                    if (var3xx == 0) {
                                                        var2xx >>= 1;
                                                        var2xx *= -516170297;
                                                        var2xx -= 1885806895;
                                                        var2xx ^= -266814324;
                                                        var3xx = var2xx + 1343109173;
                                                        var3xx >>= 11;
                                                        var3xx -= 880387168;
                                                        var3xx -= 820113319;
                                                        var3xx ^= -824895666;
                                                        return HC(var0, var3xx);
                                                    } else {
                                                        var2xx = switch (var2xx) {
                                                            case 656352045 -> var2xx ^ -450215911;
                                                            default -> var2xx ^ 1141090033;
                                                            case 1696327367 -> {
                                                                var2xx += -1992483053;
                                                                var2xx -= 809143842;
                                                                var2xx &= 62841470;
                                                                var2xx -= 66004064;
                                                                yield var2xx ^ -2034672295;
                                                            }
                                                        };
                                                        var3xx = var2xx + 1;
                                                        var3xx = var2xx * var3xx;
                                                        var4xx = var2xx + 2;
                                                        var3xx *= var4xx;
                                                        var2xx += 3;
                                                        var3xx *= var2xx;
                                                        var2xx = var3xx & 7;
                                                        if (var2xx != 0) {
                                                            IllegalStateException var14xx = new IllegalStateException();
                                                            throw var14xx;
                                                        } else {
                                                            AssertionError var13xx = new AssertionError();
                                                            throw var13xx;
                                                        }
                                                    }
                                                };
                                                ArgumentBuilder var320 = var319.executes(var349);
                                                LiteralArgumentBuilder var321 = (LiteralArgumentBuilder)var320;
                                                LiteralArgumentBuilder var350 = ClientCommandManager.literal("reset");
                                                Command var386 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= -1305668674;
                                                    int var3xx = System.identityHashCode(var0);
                                                    Integer var18xx = var3xx;
                                                    if (var18xx == null) {
                                                        long var19xx = switch (var2xx) {
                                                            case -1708179628 -> {
                                                                var2xx |= -1704500914;
                                                                yield var2xx ^ -100092094;
                                                            }
                                                            default -> var2xx ^ 223995847;
                                                            case 1074458487 -> var2xx ^ -1182533104;
                                                        };
                                                        long var5xx = var19xx + 1L;
                                                        var5xx = var19xx * var5xx;
                                                        long var20xx = var5xx & 1L;
                                                        long var25xx;
                                                        int var21x = (var25xx = var20xx - 0L) == 0L ? 0 : (var25xx < 0L ? -1 : 1);
                                                        if (var21x == 0) {
                                                            IllegalStateException var22xx = new IllegalStateException();
                                                            throw var22xx;
                                                        }
                                                    } else {
                                                        var2xx &= 2045856509;
                                                        var2xx += -1506590038;
                                                        var2xx &= -1416037941;
                                                        var2xx >>>= 31;
                                                        var2xx ^= 1563390640;
                                                        var18xx = var2xx;
                                                        if (var18xx != null) {
                                                            var2xx <<= 13;
                                                            var2xx ^= -1172336183;
                                                            return HC(var0, var2xx);
                                                        }
                                                    }

                                                    IllegalArgumentException var15xx = new IllegalArgumentException();
                                                    throw var15xx;
                                                };
                                                ArgumentBuilder var351 = var350.executes(var386);
                                                ArgumentBuilder var322 = var321.then(var351);
                                                LiteralArgumentBuilder var323 = (LiteralArgumentBuilder)var322;
                                                LiteralArgumentBuilder var352 = ClientCommandManager.literal("remove");
                                                Command var387 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= -265104545;
                                                    int var3xx = System.identityHashCode(var0);
                                                    Y var4xx = var0.M();
                                                    var4xx.remove();
                                                    long var20xx = var3xx;
                                                    long var5xx = var20xx + 1L;
                                                    var5xx = var20xx * var5xx;
                                                    long var21x = var5xx & 1L;
                                                    long var32xx;
                                                    var3xx = (var32xx = var21x - 0L) == 0L ? 0 : (var32xx < 0L ? -1 : 1);
                                                    if (var3xx == 0) {
                                                        long var23xx = switch (var2xx) {
                                                            default -> var2xx ^ -67981999;
                                                            case -667877451 -> {
                                                                var2xx >>>= 12;
                                                                var2xx >>>= 30;
                                                                var2xx -= 521488463;
                                                                var2xx ^= -1628420292;
                                                                yield var2xx ^ 171447194;
                                                            }
                                                            case 1257729556 -> var2xx ^ 933442879;
                                                        };
                                                        var5xx = var23xx + 1L;
                                                        var5xx = var23xx * var5xx;
                                                        long var24xx = var5xx & 1L;
                                                        long var33xx;
                                                        var3xx = (var33xx = var24xx - 0L) == 0L ? 0 : (var33xx < 0L ? -1 : 1);
                                                        if (var3xx == 0) {
                                                            Object var26xx = var1xx.getSource();
                                                            FabricClientCommandSource var27xx = (FabricClientCommandSource)var26xx;
                                                            MutableText var28xx = Text.literal("§7Ghost usunięty.");
                                                            var27xx.sendFeedback(var28xx);
                                                            return 1;
                                                        }
                                                    } else {
                                                        var2xx ^= -1097696336;
                                                        var2xx >>= 18;
                                                        var2xx += 1844837372;
                                                        var2xx ^= -173643493;
                                                        Integer var17xx = var2xx;
                                                        if (var17xx != null) {
                                                            AssertionError var19xx = new AssertionError();
                                                            throw var19xx;
                                                        }
                                                    }

                                                    IllegalArgumentException var18xx = new IllegalArgumentException();
                                                    throw var18xx;
                                                };
                                                ArgumentBuilder var353 = var352.executes(var387);
                                                ArgumentBuilder var324 = var323.then(var353);
                                                LiteralArgumentBuilder var325 = (LiteralArgumentBuilder)var324;
                                                LiteralArgumentBuilder var354 = ClientCommandManager.literal("config");
                                                Command var388 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 1922080627;
                                                    int var3xx = System.identityHashCode(var0);
                                                    C var4xx = var0.VP();
                                                    Integer var18xx = var3xx;
                                                    if (var18xx != null) {
                                                        var2xx -= 391989686;
                                                        var2xx += -385948;
                                                        var2xx ^= -524615745;
                                                        var2xx ^= 646491902;
                                                        var4xx.t();
                                                        return 1;
                                                    } else {
                                                        var2xx |= -1130974270;
                                                        var2xx |= 463975349;
                                                        var2xx += 213989265;
                                                        var2xx &= -652652319;
                                                        var2xx ^= 102414978;
                                                        int var19xx = var2xx + 1;
                                                        var19xx = var2xx * var19xx;
                                                        var2xx = var19xx & 1;
                                                        if (var2xx == 0) {
                                                            UnsupportedOperationException var13xx = new UnsupportedOperationException();
                                                            throw var13xx;
                                                        } else {
                                                            IllegalStateException var12xx = new IllegalStateException();
                                                            throw var12xx;
                                                        }
                                                    }
                                                };
                                                ArgumentBuilder var355 = var354.executes(var388);
                                                LiteralArgumentBuilder var356 = (LiteralArgumentBuilder)var355;
                                                LiteralArgumentBuilder var389 = ClientCommandManager.literal("share");
                                                Command var405 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 1183554652;
                                                    int var3xx = System.identityHashCode(var0);
                                                    int var4xx = var3xx + 1;
                                                    var4xx = var3xx * var4xx;
                                                    int var5xx = var3xx + 2;
                                                    var4xx *= var5xx;
                                                    var3xx += 3;
                                                    var4xx *= var3xx;
                                                    var3xx = var4xx & 7;
                                                    if (var3xx != 0) {
                                                        var2xx <<= 25;
                                                        var2xx &= 377770176;
                                                        var2xx &= 564363678;
                                                        var2xx ^= 1719019658;
                                                        UnsupportedOperationException var19xx = new UnsupportedOperationException();
                                                        throw var19xx;
                                                    } else {
                                                        var2xx += 2094286645;
                                                        var2xx += 501602515;
                                                        var2xx *= 474840253;
                                                        var2xx += -49292470;
                                                        var2xx ^= 2002657945;
                                                        C var12xx = var0.VP();
                                                        var12xx.M();
                                                        return 1;
                                                    }
                                                };
                                                ArgumentBuilder var390 = var389.executes(var405);
                                                ArgumentBuilder var357 = var356.then(var390);
                                                LiteralArgumentBuilder var358 = (LiteralArgumentBuilder)var357;
                                                LiteralArgumentBuilder var391 = ClientCommandManager.literal("load");
                                                StringArgumentType var406 = StringArgumentType.word();
                                                RequiredArgumentBuilder var407 = ClientCommandManager.argument("code", var406);
                                                Command var422 = var1xx -> {
                                                    int var2xx = W;
                                                    var2xx ^= 1600914704;
                                                    int var3xx = System.identityHashCode(var0);
                                                    Integer var16xx = var3xx;
                                                    if (var16xx != null) {
                                                        var2xx = switch (var2xx) {
                                                            default -> var2xx ^ 1394924348;
                                                            case 979911331 -> var2xx ^ -180931656;
                                                            case 2003708410 -> {
                                                                var2xx |= 1488563783;
                                                                var2xx ^= -414705941;
                                                                yield var2xx ^ 119630046;
                                                            }
                                                        };
                                                        int var17xx = var2xx + 1;
                                                        var17xx = var2xx * var17xx;
                                                        var17xx &= 1;
                                                        if (var17xx == 0) {
                                                            C var20xx = var0.VP();
                                                            String var4xx = StringArgumentType.getString(var1xx, "code");
                                                            var20xx.o(var4xx);
                                                            return 1;
                                                        }
                                                    } else {
                                                        var2xx |= -1529070773;
                                                        var2xx ^= 1315071956;
                                                        var2xx ^= -557634367;
                                                        int var21x = var2xx + 1;
                                                        var21x = var2xx * var21x;
                                                        int var25xx = var2xx + 2;
                                                        var21x *= var25xx;
                                                        var2xx += 3;
                                                        var21x *= var2xx;
                                                        var2xx = var21x & 7;
                                                        if (var2xx == 0) {
                                                            IllegalStateException var15xx = new IllegalStateException();
                                                            throw var15xx;
                                                        }
                                                    }

                                                    IllegalStateException var14xx = new IllegalStateException();
                                                    throw var14xx;
                                                };
                                                ArgumentBuilder var408 = var407.executes(var422);
                                                ArgumentBuilder var392 = var391.then(var408);
                                                ArgumentBuilder var359 = var358.then(var392);
                                                LiteralArgumentBuilder var360 = (LiteralArgumentBuilder)var359;
                                                LiteralArgumentBuilder var393 = ClientCommandManager.literal("undo");
                                                int var409 = var4x + 1;
                                                int var410 = var4x * var409;
                                                int var423 = var4x + 2;
                                                int var411 = var410 * var423;
                                                var4x += 3;
                                                int var412 = var411 * var4x;
                                                var4x = var412 & 7;
                                                if (var4x == 0) {
                                                    var38 *= 311575397;
                                                    var38 ^= 1436312898;
                                                    var399 = var38;
                                                    long var427 = var399 + 1L;
                                                    var427 = var399 * var427;
                                                    long var431 = var399 + 2L;
                                                    var427 *= var431;
                                                    var399 += 3L;
                                                    var427 *= var399;
                                                    var399 = var427 & 7L;
                                                    long var437;
                                                    var4x = (var437 = var399 - 0L) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                                                    if (var4x == 0) {
                                                        Command var130 = var1xx -> {
                                                            int var2xx = W;
                                                            var2xx ^= -1459469505;
                                                            int var3xx = System.identityHashCode(var0);
                                                            Integer var18xx = var3xx;
                                                            if (var18xx != null) {
                                                                var2xx -= -1412830814;
                                                                var2xx <<= 21;
                                                                var2xx ^= 1733046629;
                                                                C var19xx = var0.VP();
                                                                var19xx.iV();
                                                                return 1;
                                                            } else {
                                                                long var10xx = switch (var2xx) {
                                                                    case -2130677803 -> {
                                                                        var2xx |= 1419030362;
                                                                        var2xx -= -1736999037;
                                                                        yield var2xx ^ -1703861151;
                                                                    }
                                                                    default -> var2xx ^ -84289264;
                                                                    case -983909475 -> var2xx ^ -756255129;
                                                                };
                                                                long var4xx = var10xx + 1L;
                                                                var4xx = var10xx * var4xx;
                                                                long var11xx = var4xx & 1L;
                                                                long var21x;
                                                                var2xx = (var21x = var11xx - 0L) == 0L ? 0 : (var21x < 0L ? -1 : 1);
                                                                if (var2xx == 0) {
                                                                    IllegalStateException var14xx = new IllegalStateException();
                                                                    throw var14xx;
                                                                } else {
                                                                    AssertionError var13xx = new AssertionError();
                                                                    throw var13xx;
                                                                }
                                                            }
                                                        };
                                                        ArgumentBuilder var131 = var393.executes(var130);
                                                        ArgumentBuilder var132 = var360.then(var131);
                                                        LiteralArgumentBuilder var133 = (LiteralArgumentBuilder)var132;
                                                        LiteralArgumentBuilder var361 = ClientCommandManager.literal("sync");
                                                        Command var394 = var1xx -> {
                                                            int var2xx = W;
                                                            var2xx ^= 1528668388;
                                                            int var3xx = System.identityHashCode(var0);
                                                            int var4xx = var3xx + 1;
                                                            var4xx = var3xx * var4xx;
                                                            var3xx = var4xx & 1;
                                                            if (var3xx != 0) {
                                                                var2xx = switch (var2xx) {
                                                                    default -> var2xx ^ -770832819;
                                                                    case -1928951229 -> var2xx ^ -569578052;
                                                                    case 1931447310 -> {
                                                                        var2xx >>= 7;
                                                                        var2xx &= -1940078369;
                                                                        var2xx *= 369248089;
                                                                        var2xx ^= 686482035;
                                                                        yield var2xx ^ -821625949;
                                                                    }
                                                                };
                                                                var3xx = var2xx + 1;
                                                                var3xx = var2xx * var3xx;
                                                                var4xx = var2xx + 2;
                                                                var3xx *= var4xx;
                                                                var4xx = var2xx + 3;
                                                                var3xx *= var4xx;
                                                                var3xx &= 7;
                                                                if (var3xx == 0) {
                                                                    AssertionError var22xx = new AssertionError();
                                                                    throw var22xx;
                                                                } else {
                                                                    IllegalStateException var21x = new IllegalStateException();
                                                                    throw var21x;
                                                                }
                                                            } else {
                                                                var2xx &= 1984344539;
                                                                var2xx *= -463459553;
                                                                var2xx ^= 1403910807;
                                                                C var9xx = var0.VP();
                                                                var9xx.x();
                                                                return 1;
                                                            }
                                                        };
                                                        ArgumentBuilder var362 = var361.executes(var394);
                                                        ArgumentBuilder var134 = var133.then(var362);
                                                        LiteralArgumentBuilder var135 = (LiteralArgumentBuilder)var134;
                                                        LiteralArgumentBuilder var363 = ClientCommandManager.literal("toggle");
                                                        StringArgumentType var395 = StringArgumentType.word();
                                                        RequiredArgumentBuilder var396 = ClientCommandManager.argument("module", var395);
                                                        SuggestionProvider var181 = (var1xx, var2xx) -> {
                                                            int var3xx = W;
                                                            var3xx ^= -623396026;
                                                            int var4xx = System.identityHashCode(var180);
                                                            Integer var22xx = var4xx;
                                                            if (var22xx != null) {
                                                                var3xx &= 31434834;
                                                                var3xx += 1762866168;
                                                                var3xx ^= -73244991;
                                                                var3xx ^= -1779245914;
                                                                var22xx = var3xx;
                                                                if (var22xx != null) {
                                                                    int var24xx = var3xx & 1635927422;
                                                                    var24xx <<= 1;
                                                                    var24xx *= 1696434149;
                                                                    var24xx |= -125082886;
                                                                    var24xx ^= 824957931;
                                                                    return V(var180, var2xx, var24xx);
                                                                }
                                                            } else {
                                                                var3xx += -876887988;
                                                                var3xx ^= -886495481;
                                                                var3xx &= 689030390;
                                                                var3xx -= -985621403;
                                                                var3xx ^= 1212273215;
                                                                long var17xx = var3xx;
                                                                long var5xx = var17xx + 1L;
                                                                var5xx = var17xx * var5xx;
                                                                long var18xx = var5xx & 1L;
                                                                long var30xx;
                                                                var3xx = (var30xx = var18xx - 0L) == 0L ? 0 : (var30xx < 0L ? -1 : 1);
                                                                if (var3xx == 0) {
                                                                    RuntimeException var21x = new RuntimeException();
                                                                    throw var21x;
                                                                }
                                                            }

                                                            IllegalStateException var20xx = new IllegalStateException();
                                                            throw var20xx;
                                                        };
                                                        RequiredArgumentBuilder var182 = var396.suggests(var181);
                                                        Command var397 = var1xx -> {
                                                            int var2xx = W;
                                                            var2xx ^= 43763660;
                                                            int var3xx = System.identityHashCode(var0);
                                                            int var4xx = var3xx + 1;
                                                            var4xx = var3xx * var4xx;
                                                            int var5xx = var3xx + 2;
                                                            var4xx *= var5xx;
                                                            var3xx += 3;
                                                            var4xx *= var3xx;
                                                            var3xx = var4xx & 7;
                                                            if (var3xx != 0) {
                                                                var2xx &= 546780852;
                                                                var2xx *= -1468714045;
                                                                var2xx ^= -354876015;
                                                                var2xx |= -311553956;
                                                                var2xx ^= 344728673;
                                                                long var23xx = var2xx;
                                                                long var35x = var23xx + 1L;
                                                                long var36x = var23xx * var35x;
                                                                long var24xx = var36x & 1L;
                                                                long var37x;
                                                                var3xx = (var37x = var24xx - 0L) == 0L ? 0 : (var37x < 0L ? -1 : 1);
                                                                if (var3xx == 0) {
                                                                    IllegalStateException var26xx = new IllegalStateException();
                                                                    throw var26xx;
                                                                }
                                                            } else {
                                                                var2xx = switch (var2xx) {
                                                                    default -> var2xx ^ -218594140;
                                                                    case -1502521506 -> var2xx ^ -220159837;
                                                                    case 714730278 -> {
                                                                        var2xx &= -634829515;
                                                                        var2xx |= 856802877;
                                                                        var2xx += -1217932390;
                                                                        yield var2xx ^ 1587482708;
                                                                    }
                                                                };
                                                                Integer var27xx = var2xx;
                                                                if (var27xx != null) {
                                                                    FabricClientCommandSource var30xx = (FabricClientCommandSource)var1xx.getSource();
                                                                    String var34x = StringArgumentType.getString(var1xx, "module");
                                                                    var2xx += -1413872081;
                                                                    var2xx >>>= 14;
                                                                    var2xx ^= 2013453257;
                                                                    var2xx ^= 555549071;
                                                                    return Z(var0, var30xx, var34x, var2xx);
                                                                }
                                                            }

                                                            AssertionError var28xx = new AssertionError();
                                                            throw var28xx;
                                                        };
                                                        ArgumentBuilder var183 = var182.executes(var397);
                                                        ArgumentBuilder var184 = var363.then(var183);
                                                        LiteralArgumentBuilder var185 = (LiteralArgumentBuilder)var184;
                                                        LiteralArgumentBuilder var364 = ClientCommandManager.literal("aura");
                                                        Command var398 = var1xx -> {
                                                            int var2xx = W;
                                                            var2xx ^= 152376935;
                                                            int var3xx = System.identityHashCode(var0);
                                                            int var4xx = var3xx + 1;
                                                            var4xx = var3xx * var4xx;
                                                            var3xx = var4xx & 1;
                                                            if (var3xx != 0) {
                                                                var2xx >>= 1;
                                                                var2xx *= -298273233;
                                                                var2xx <<= 30;
                                                                var2xx <<= 7;
                                                                var2xx ^= -1079386204;
                                                                Integer var22xx = var2xx;
                                                                if (var22xx != null) {
                                                                    AssertionError var23xx = new AssertionError();
                                                                    throw var23xx;
                                                                }
                                                            } else {
                                                                long var16xx = switch (var2xx) {
                                                                    case 555170445 -> {
                                                                        var2xx -= 769888023;
                                                                        var2xx += 960193458;
                                                                        var2xx += 1941137681;
                                                                        yield var2xx ^ 1013877421;
                                                                    }
                                                                    default -> var2xx ^ -1492102823;
                                                                    case 1401827056 -> var2xx ^ -1534938925;
                                                                };
                                                                long var26xx = var16xx + 1L;
                                                                long var27xx = var16xx * var26xx;
                                                                long var17xx = var27xx & 1L;
                                                                long var28xx;
                                                                var2xx = (var28xx = var17xx - 0L) == 0L ? 0 : (var28xx < 0L ? -1 : 1);
                                                                if (var2xx == 0) {
                                                                    gj var20xx = var0.gE();
                                                                    Runnable var24xx = i_2::W;
                                                                    var20xx.Zl(50L, var24xx);
                                                                    return 1;
                                                                }
                                                            }

                                                            IllegalStateException var19xx = new IllegalStateException();
                                                            throw var19xx;
                                                        };
                                                        ArgumentBuilder var365 = var364.executes(var398);
                                                        LiteralArgumentBuilder var366 = (LiteralArgumentBuilder)var365;
                                                        ArgumentBuilder var157 = var366.then(var156);
                                                        LiteralArgumentBuilder var158 = (LiteralArgumentBuilder)var157;
                                                        ArgumentBuilder var159 = var158.then(var249);
                                                        LiteralArgumentBuilder var160 = (LiteralArgumentBuilder)var159;
                                                        ArgumentBuilder var161 = var160.then(var288);
                                                        LiteralArgumentBuilder var162 = (LiteralArgumentBuilder)var161;
                                                        ArgumentBuilder var163 = var162.then(var325);
                                                        LiteralArgumentBuilder var164 = (LiteralArgumentBuilder)var163;
                                                        ArgumentBuilder var165 = var164.then(var190);
                                                        LiteralArgumentBuilder var166 = (LiteralArgumentBuilder)var165;
                                                        ArgumentBuilder var167 = var166.then(var210);
                                                        LiteralArgumentBuilder var168 = (LiteralArgumentBuilder)var167;
                                                        ArgumentBuilder var169 = var168.then(var199);
                                                        LiteralArgumentBuilder var170 = (LiteralArgumentBuilder)var169;
                                                        ArgumentBuilder var171 = var170.then(var185);
                                                        LiteralArgumentBuilder var172 = (LiteralArgumentBuilder)var171;
                                                        ArgumentBuilder var136 = var172.then(var135);
                                                        LiteralArgumentBuilder var137 = (LiteralArgumentBuilder)var136;
                                                        ArgumentBuilder var138 = var137.then(var224);
                                                        LiteralArgumentBuilder var139 = (LiteralArgumentBuilder)var138;
                                                        LiteralCommandNode var140 = var1x.register(var139);
                                                        return;
                                                    }
                                                    break label216;
                                                }

                                                var38 += -1460146158;
                                                var38 &= 390717823;
                                                var38 -= -1125707319;
                                                var38 ^= -1492035847;
                                                var38 ^= 1682863646;
                                            }
                                            break label201;
                                        }

                                        var38 *= 1221937531;
                                        var38 -= 73476097;
                                        var38 *= 144515963;
                                        var38 ^= -222748481;
                                        var298 = var38;
                                        var368 = var298 + 1L;
                                        var368 = var298 * var368;
                                        long var17x = var298 + 2L;
                                        var368 *= var17x;
                                        var298 += 3L;
                                        var368 *= var298;
                                        var298 = var368 & 7L;
                                        long var438;
                                        int var306 = (var438 = var298 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                                        if (var306 != 0) {
                                            break label216;
                                        }

                                        d_2 var307 = var216[var263];
                                        String var330 = var307.name();
                                        Locale var373 = Locale.ROOT;
                                        var330 = var330.toLowerCase(var373);
                                        LiteralArgumentBuilder var332 = ClientCommandManager.literal(var330);
                                        Command var308 = var2xx -> {
                                            int var3xx = W;
                                            var3xx ^= 593822783;
                                            int var4xx = System.identityHashCode(var0);
                                            Integer var24xx = var4xx;
                                            if (var24xx != null) {
                                                var3xx += 2085951948;
                                                var3xx += 2135055243;
                                                var3xx -= 148873003;
                                                var3xx ^= -1715283657;
                                                long var25xx = var3xx;
                                                long var6x = var25xx + 1L;
                                                var6x = var25xx * var6x;
                                                long var8x = var25xx + 2L;
                                                var6x *= var8x;
                                                long var26xx = var25xx + 3L;
                                                var6x *= var26xx;
                                                long var27xx = var6x & 7L;
                                                long var46x;
                                                int var28xx = (var46x = var27xx - 0L) == 0L ? 0 : (var46x < 0L ? -1 : 1);
                                                if (var28xx == 0) {
                                                    NW var29xx = var0.sP();
                                                    Yn var30xx = var29xx.tG(deatheffect.class);
                                                    deatheffect var31xx = (deatheffect)var30xx;
                                                    var31xx.PA(var307);
                                                    var31xx.xt(true);
                                                    gj var5xx = var0.gE();
                                                    Object var45x = Objects.requireNonNull(var31xx);
                                                    Runnable var32xx = var31xx::gO;
                                                    var5xx.Zl(50L, var32xx);
                                                    Object var33xx = var2xx.getSource();
                                                    FabricClientCommandSource var34x = (FabricClientCommandSource)var33xx;
                                                    String var35x = r_2.R(var307);
                                                    String var36x = "§7Death Effect §f" + var35x;
                                                    MutableText var37x = Text.literal(var36x);
                                                    var34x.sendFeedback(var37x);
                                                    return 1;
                                                }
                                            } else {
                                                long var18xx = switch (var3xx) {
                                                    default -> var3xx ^ 1854465653;
                                                    case 191310037 -> {
                                                        var3xx *= -2073045693;
                                                        var3xx |= -424693291;
                                                        yield var3xx ^ -1519570519;
                                                    }
                                                    case 795802138 -> var3xx ^ -191928745;
                                                };
                                                long var38x = var18xx + 1L;
                                                var38x = var18xx * var38x;
                                                long var7xx = var18xx + 2L;
                                                var38x *= var7xx;
                                                long var19xx = var18xx + 3L;
                                                var38x *= var19xx;
                                                long var20xx = var38x & 7L;
                                                long var47x;
                                                var3xx = (var47x = var20xx - 0L) == 0L ? 0 : (var47x < 0L ? -1 : 1);
                                                if (var3xx == 0) {
                                                    AssertionError var23xx = new AssertionError();
                                                    throw var23xx;
                                                }
                                            }

                                            AssertionError var22xx = new AssertionError();
                                            throw var22xx;
                                        };
                                        var368 = var4x;
                                        var17x = var368 + 1L;
                                        var17x = var368 * var17x;
                                        long var19x = var368 + 2L;
                                        var17x *= var19x;
                                        var368 += 3L;
                                        var17x *= var368;
                                        var368 = var17x & 7L;
                                        long var439;
                                        int var377 = (var439 = var368 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                                        if (var377 != 0) {
                                            switch (var38) {
                                                case -1237260164:
                                                    var38 ^= 1577968267;
                                                    break label201;
                                                case -178802410:
                                                default:
                                                    var38 ^= 832100486;
                                                    break label201;
                                                case 1383850238:
                                                    var38 ^= -1752383389;
                                                    var38 ^= 1439330297;
                                                    break label201;
                                            }
                                        }

                                        var38 ^= -1459301688;
                                        var38 ^= -24764156;
                                        var368 = var38;
                                        var17x = var368 + 1L;
                                        var17x = var368 * var17x;
                                        var368 = var17x & 1L;
                                        long var440;
                                        int var380 = (var440 = var368 - 0L) == 0L ? 0 : (var440 < 0L ? -1 : 1);
                                        if (var380 != 0) {
                                            break label216;
                                        }

                                        ArgumentBuilder var309 = var332.executes(var308);
                                        ArgumentBuilder var310 = var210.then(var309);
                                        int var311 = var263 + 1;
                                        var263 = var311;
                                        var38 += 551927134;
                                        var38 ^= 585969036;
                                    }
                                } else {
                                    var38 += -1628715971;
                                    var38 += 1304668069;
                                    var38 |= 522634906;
                                    var38 ^= -1344632642;
                                    break;
                                }
                            }
                            var38 = switch (var38) {
                                default -> var38 ^ 1897572694;
                                case -781100414 -> {
                                    var38 -= 467870273;
                                    yield var38 ^ 940221634;
                                }
                                case -734500700 -> var38 ^ 1818851011;
                            };
                            ws var257 = var206[var230];
                            int var289 = var4x + 1;
                            var289 = var4x * var289;
                            var289 &= 1;
                            if (var289 != 0) {
                                var38 |= 243855574;
                                var38 ^= 531739571;
                                break;
                            }
                            var38 = switch (var38) {
                                case -1920689021 -> {
                                    var38 ^= -1919725821;
                                    var38 -= 292572473;
                                    var38 *= 1503220691;
                                    var38 *= -102571691;
                                    yield var38 ^ -2045559321;
                                }
                                case 984777997 -> var38 ^ 2135506757;
                                default -> var38 ^ -1890973873;
                            };
                            long var292 = var38;
                            long var15x = var292 + 1L;
                            var15x = var292 * var15x;
                            long var293 = var15x & 1L;
                            long var441;
                            var289 = (var441 = var293 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                            if (var289 != 0) {
                                break label216;
                            }

                            String var295 = var257.name();
                            Locale var329 = Locale.ROOT;
                            String var296 = var295.toLowerCase(var329);
                            LiteralArgumentBuilder var297 = ClientCommandManager.literal(var296);
                            Command var258 = var2xx -> {
                                int var3xx = W;
                                var3xx ^= -61899371;
                                int var4xx = System.identityHashCode(var0);
                                NW var5xx = var0.sP();
                                Yn var25xx = var5xx.tG(killeffect.class);
                                killeffect var26xx = (killeffect)var25xx;
                                var26xx.z(var257);
                                var26xx.xt(true);
                                FabricClientCommandSource var27xx = (FabricClientCommandSource)var2xx.getSource();
                                var27xx = var27xx;
                                String var6x = r_2.R(var257);
                                var6x = "§7Kill Effect §f" + var6x;
                                MutableText var30xx = Text.literal(var6x);
                                int var7xx = var4xx + 1;
                                var7xx = var4xx * var7xx;
                                int var8x = var4xx + 2;
                                var7xx *= var8x;
                                var4xx += 3;
                                var7xx *= var4xx;
                                var4xx = var7xx & 7;
                                if (var4xx == 0) {
                                    switch (var3xx) {
                                        case -1591801429:
                                            var3xx ^= 1514011163;
                                            break;
                                        case -733130369:
                                            var3xx ^= -942352321;
                                            var3xx >>>= 28;
                                            var3xx ^= 2013589247;
                                            break;
                                        case -531363726:
                                        default:
                                            var3xx ^= 304643284;
                                    }

                                    var27xx.sendFeedback(var30xx);
                                    return 1;
                                } else {
                                    var3xx &= 463870615;
                                    var3xx &= -2069436742;
                                    var3xx |= 159349746;
                                    var3xx |= -1598079291;
                                    var3xx ^= -228366397;
                                    Integer var15xx = var3xx;
                                    if (var15xx != null) {
                                        IllegalStateException var17xx = new IllegalStateException();
                                        throw var17xx;
                                    } else {
                                        AssertionError var16xx = new AssertionError();
                                        throw var16xx;
                                    }
                                }
                            };
                            ArgumentBuilder var259 = var297.executes(var258);
                            ArgumentBuilder var260 = var199.then(var259);
                            int var261 = var230 + 1;
                            var230 = var261;
                            var38 -= 615787639;
                            var38 ^= 301983189;
                        }
                    } else {
                        switch (var38) {
                            case -2059919058:
                                var38 *= 1273401597;
                                var38 ^= 340518162;
                                break;
                            case 439437782:
                                var38 ^= -1896497824;
                                break;
                            case 675036989:
                            default:
                                var38 ^= -1180936621;
                        }
                    }
                } else {
                    switch (var38) {
                        case -2033953540:
                        default:
                            var38 ^= 1380880200;
                            break;
                        case -740413625:
                            var38 ^= -113248075;
                            break;
                        case -275561109:
                            var38 += 497241605;
                            var38 |= 174315633;
                            var38 += 1039709450;
                            var38 *= -86637643;
                            var38 ^= 1730467987;
                    }
                }

                var4x = var38 + 1;
                var4x = var38 * var4x;
                var38 = var4x & 1;
                if (var38 == 0) {
                    RuntimeException var126 = new RuntimeException();
                    throw var126;
                }
            }

            IllegalStateException var125 = new IllegalStateException();
            throw var125;
        };
        long var5 = var2;
        long var7 = var5 + 1L;
        var7 = var5 * var7;
        var5 = var7 & 1L;
        long var33;
        var2 = (var33 = var5 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 |= -1114030818;
            var1 ^= -231066817;
            var1 &= -1640467434;
            var1 -= 636877209;
            var1 ^= 1616369919;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var30 = var1 + 2;
            var2 *= var30;
            int var31 = var1 + 3;
            var2 *= var31;
            var2 &= 7;
            if (var2 == 0) {
                RuntimeException var28 = new RuntimeException();
                throw var28;
            }
        } else {
            var1 -= -195816163;
            var1 >>>= 9;
            var1 += -1233541521;
            var1 -= 1444181091;
            var1 ^= 1368164366;
            Integer var20 = var1;
            if (var20 != null) {
                var3.register(var4);
                return;
            }
        }

        AssertionError var21 = new AssertionError();
        throw var21;
    }

    private static int H(Ud var0, FabricClientCommandSource var1, String var2, int var3) {
        label185: {
            int var5 = System.identityHashCode(var0);
            NW var6 = var0.sP();
            Yn var126 = var6.tG(clickgui.class);
            clickgui var127 = (clickgui)var126;
            ia var128 = var127.fA();
            Integer var7 = var5;
            int var16;
            if (var7 == null) {
                var16 = var3 & 1811720498;
                var16 -= -826025166;
                var16 ^= 830095479;
            } else {
                var16 = var3 ^ 885275172;
                var16 += -2066785668;
                var16 |= -717586835;
                var16 &= 639460358;
                var16 ^= 1628075806;
                long var134 = var16;
                long var9 = var134 + 1L;
                var9 = var134 * var9;
                long var135 = var9 & 1L;
                long var241;
                int var136 = (var241 = var135 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                if (var136 != 0) {
                    break label185;
                }

                String var137 = en.YR(var2);
                int var8 = ("none".equals(var137)) ? 1 : 0;
                if (var8 != 0) {
                    var16 -= 922252267;
                    var16 >>>= 12;
                    var16 &= -105559831;
                    var16 ^= -1311551586;
                    var128.y(-1);
                    MutableText var142 = Text.literal("§7Click GUI bez klawisza §8· §7otwierasz go przez §f/aura");
                    Integer var181 = var5;
                    if (var181 != null) {
                        var16 |= 1101862836;
                        var16 += -1723571068;
                        var16 *= -1401364749;
                        var16 += -689518980;
                        var16 ^= -869794855;
                        var1.sendFeedback(var142);
                        return 1;
                    }

                    var16 += -1464384861;
                    var16 ^= -614329046;
                    var16 ^= -1989310339;
                    var16 ^= 1612949556;
                } else {
                    label187: {
                        var16 += -1714211959;
                        var16 |= -561779961;
                        var16 >>>= 7;
                        var16 ^= -6254901;
                        var16 ^= 1666458900;
                        var8 = var16 + 1;
                        var8 = var16 * var8;
                        int var182 = var16 + 2;
                        var8 *= var182;
                        int var183 = var16 + 3;
                        var8 *= var183;
                        var8 &= 7;
                        if (var8 != 0) {
                            break label185;
                        }

                        if (var137 == null) {
                            var16 += 436575856;
                            var16 >>>= 29;
                            var16 ^= -1991640199;
                            Integer var148 = var16;
                            if (var148 == null) {
                                break label185;
                            }

                            var8 = -1;
                            var16 += -1824259556;
                            var16 ^= -160343631;
                        } else {
                            var16 ^= -36716588;
                            var16 |= -1084422772;
                            var16 ^= -431430921;
                            var9 = var16;
                            long var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var242;
                            int var187 = (var242 = var9 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                            if (var187 != 0) {
                                break label185;
                            }

                            var136 = ia.WW(var137);
                            int var188 = var5 + 1;
                            int var189 = var5 * var188;
                            int var10 = var5 + 2;
                            int var190 = var189 * var10;
                            var10 = var5 + 3;
                            int var191 = var190 * var10;
                            int var192 = var191 & 7;
                            if (var192 != 0) {
                                var16 += -82561530;
                                var16 |= 1976263530;
                                var16 <<= 12;
                                var16 ^= -544090951;
                                break label187;
                            }

                            var16 >>>= 30;
                            var16 &= -1879749370;
                            var16 |= 1063090838;
                            var16 &= 1070996994;
                            var16 ^= -1693686218;
                            var8 = var136;
                            var16 &= 826618888;
                            var16 += -602011302;
                            var16 ^= 379754867;
                        }

                        var9 = var16;
                        long var229 = var9 + 1L;
                        var229 = var9 * var229;
                        var9 = var229 & 1L;
                        long var243;
                        var136 = (var243 = var9 - 0L) == 0L ? 0 : (var243 < 0L ? -1 : 1);
                        if (var136 != 0) {
                            break label185;
                        }

                        Integer var150 = var5;
                        if (var150 == null) {
                            var16 |= 838654957;
                            var16 |= 856821714;
                            var16 ^= -1822909626;
                        } else {
                            var16 = switch (var16) {
                                case -777990341 -> var16 ^ -1542090554;
                                case -352541655 -> {
                                    var16 ^= -1753930742;
                                    yield var16 ^ 2064535029;
                                }
                                default -> var16 ^ -38045682;
                            };
                            int var151 = var16 + 1;
                            var151 = var16 * var151;
                            var151 &= 1;
                            if (var151 != 0) {
                                break label185;
                            }

                            if (var8 == -1) {
                                var16 ^= 33533825;
                                var16 &= -730240946;
                                var16 ^= 1128140122;
                                var151 = var16 + 1;
                                var151 = var16 * var151;
                                var151 &= 1;
                                if (var151 != 0) {
                                    break label185;
                                }

                                String var157 = "Nie ma klawisza \"" + var2 + "\" · Tab podpowie nazwy";
                                Integer var195 = var5;
                                if (var195 != null) {
                                    var16 |= 2133453604;
                                    var16 *= 831795691;
                                    var16 ^= -46405412;
                                    Integer var196 = var16;
                                    if (var196 != null) {
                                        MutableText var158 = Text.literal(var157);
                                        var1.sendError(var158);
                                        return 0;
                                    }
                                    break label185;
                                }

                                var16 &= 431719751;
                                var16 <<= 14;
                                var16 -= 397047169;
                                var16 *= 389086743;
                                var16 ^= 1382422480;
                            } else {
                                var16 >>= 16;
                                var16 -= -1693009269;
                                var16 ^= -429392004;
                                long var159 = var16;
                                long var214 = var159 + 1L;
                                var214 = var159 * var214;
                                long var160 = var214 & 1L;
                                long var244;
                                var151 = (var244 = var160 - 0L) == 0L ? 0 : (var244 < 0L ? -1 : 1);
                                if (var151 != 0) {
                                    break label185;
                                }

                                if (var8 == 256) {
                                    var16 |= -1050614;
                                    var16 *= 313126653;
                                    var16 -= 1975384632;
                                    var16 ^= 1162898354;
                                    long var162 = var16;
                                    var214 = var162 + 1L;
                                    var214 = var162 * var214;
                                    long var12 = var162 + 2L;
                                    var214 *= var12;
                                    long var163 = var162 + 3L;
                                    var214 *= var163;
                                    long var164 = var214 & 7L;
                                    long var245;
                                    var151 = (var245 = var164 - 0L) == 0L ? 0 : (var245 < 0L ? -1 : 1);
                                    if (var151 != 0) {
                                        break label185;
                                    }

                                    MutableText var166 = Text.literal("Escape zamyka menu · wybierz inny klawisz");
                                    var9 = var5;
                                    var229 = var9 + 1L;
                                    var229 = var9 * var229;
                                    long var239 = var9 + 2L;
                                    var229 *= var239;
                                    var9 += 3L;
                                    var229 *= var9;
                                    var9 = var229 & 7L;
                                    long var246;
                                    int var200 = (var246 = var9 - 0L) == 0L ? 0 : (var246 < 0L ? -1 : 1);
                                    if (var200 == 0) {
                                        var16 *= -2094449577;
                                        var16 ^= 1491606161;
                                        int var201 = var16 + 1;
                                        int var202 = var16 * var201;
                                        int var203 = var202 & 1;
                                        if (var203 == 0) {
                                            var1.sendError(var166);
                                            return 0;
                                        }
                                        break label185;
                                    }

                                    switch (var16) {
                                        case -853511508:
                                            var16 ^= -868571462;
                                            break;
                                        case 1191218584:
                                            var16 *= -518682505;
                                            var16 ^= -380308207;
                                            break;
                                        case 1367913656:
                                        default:
                                            var16 ^= 1938197504;
                                    }
                                } else {
                                    var16 = switch (var16) {
                                        case -2104576896 -> {
                                            var16 |= 887123893;
                                            var16 &= -1165207498;
                                            yield var16 ^ -885767709;
                                        }
                                        default -> var16 ^ 1438383661;
                                        case 264635377 -> var16 ^ 226931463;
                                    };
                                    var128.y(var8);
                                    Integer var167 = var5;
                                    if (var167 == null) {
                                        var16 *= -1945687419;
                                        var16 ^= -781855222;
                                    } else {
                                        label207: {
                                            var16 = switch (var16) {
                                                default -> var16 ^ 892926352;
                                                case 964296613 -> var16 ^ 479696784;
                                                case 2042108375 -> {
                                                    var16 += -855297295;
                                                    var16 -= 962579711;
                                                    var16 |= 475719106;
                                                    var16 ^= 1113893016;
                                                    yield var16 ^ -776071741;
                                                }
                                            };
                                            long var168 = var16;
                                            var214 = var168 + 1L;
                                            var214 = var168 * var214;
                                            long var169 = var214 & 1L;
                                            long var247;
                                            int var170 = (var247 = var169 - 0L) == 0L ? 0 : (var247 < 0L ? -1 : 1);
                                            if (var170 != 0) {
                                                break label185;
                                            }

                                            var170 = var16 | 884365465;
                                            var170 ^= 1585274867;
                                            var170 |= 547136671;
                                            var170 ^= 535948004;
                                            List var129 = G(var0, var128, var8, var170);
                                            String var141 = i_2.Q(var8);
                                            int var175 = (var129.isEmpty()) ? 1 : 0;
                                            String var179;
                                            if (var175 != 0) {
                                                var16 = switch (var16) {
                                                    case -1903869296 -> {
                                                        var16 |= -2100965050;
                                                        yield var16 ^ 1072843593;
                                                    }
                                                    case -768605109 -> var16 ^ 1156090865;
                                                    default -> var16 ^ 1862671503;
                                                };
                                                long var176 = var16;
                                                var214 = var176 + 1L;
                                                var214 = var176 * var214;
                                                long var177 = var214 & 1L;
                                                long var248;
                                                var175 = (var248 = var177 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                                                if (var175 != 0) {
                                                    break label185;
                                                }

                                                var179 = "";
                                                var16 ^= -465632623;
                                                var16 *= -1741366885;
                                                var16 += -1150937504;
                                                var16 ^= 2128944707;
                                            } else {
                                                var16 >>>= 18;
                                                var16 *= 1113407995;
                                                var16 |= 958277223;
                                                var16 <<= 5;
                                                var16 ^= 1462443955;
                                                String var130 = String.join(", ", var129);
                                                String var131 = " §8· §7na tym klawiszu też: §f" + var130;
                                                Integer var204 = var5;
                                                if (var204 == null) {
                                                    var16 += 2116837890;
                                                    var16 &= -1601988908;
                                                    var16 |= 856975492;
                                                    var16 <<= 13;
                                                    var16 ^= -2047023943;
                                                    break label207;
                                                }
                                                var16 = switch (var16) {
                                                    case -1968450594 -> var16 ^ 963227218;
                                                    case -522788781 -> {
                                                        var16 |= -1624652067;
                                                        var16 -= 1968186578;
                                                        var16 *= -1563960439;
                                                        var16 |= -151587886;
                                                        yield var16 ^ -136772348;
                                                    }
                                                    default -> var16 ^ 976858170;
                                                };
                                                int var205 = var16 + 1;
                                                int var206 = var16 * var205;
                                                int var224 = var16 + 2;
                                                int var207 = var206 * var224;
                                                int var225 = var16 + 3;
                                                int var208 = var207 * var225;
                                                int var209 = var208 & 7;
                                                if (var209 != 0) {
                                                    break label185;
                                                }

                                                var179 = var131;
                                                var16 ^= -336540826;
                                                var16 <<= 24;
                                                var16 ^= -1741199808;
                                                var16 ^= 1859863257;
                                            }

                                            var9 = var16;
                                            var229 = var9 + 1L;
                                            var229 = var9 * var229;
                                            long var240 = var9 + 2L;
                                            var229 *= var240;
                                            var9 += 3L;
                                            var229 *= var9;
                                            var9 = var229 & 7L;
                                            long var249;
                                            int var132 = (var249 = var9 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                                            if (var132 != 0) {
                                                break label185;
                                            }

                                            String var133 = "§7Click GUI pod klawiszem §f" + var141 + var179;
                                            Integer var124 = var5;
                                            if (var124 != null) {
                                                var16 -= -1961619793;
                                                var16 -= -1796293938;
                                                var16 += -828231551;
                                                var16 ^= -1297262045;
                                                MutableText var125 = Text.literal(var133);
                                                var1.sendFeedback(var125);
                                                return 1;
                                            }

                                            var16 += -1232747493;
                                            var16 |= -1082549658;
                                            var16 ^= 421300782;
                                            var16 |= -1006133762;
                                            var16 ^= -1899914937;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Integer var121 = var16;
            if (var121 != null) {
                IllegalStateException var122 = new IllegalStateException();
                throw var122;
            }
        }

        IllegalStateException var123 = new IllegalStateException();
        throw var123;
    }

    private static List G(Ud var0, ia var1, int var2, int var3) {
        label182: {
            int var5 = var2;
            int var6 = System.identityHashCode(var0);
            List var8 = i_2.Hw(var2);
            ArrayList var7 = new ArrayList(var8);
            var7 = var7;
            NW var119 = var0.sP();
            Integer var9 = var6;
            if (var9 == null) {
                int var116 = var3 | -302928567;
                var116 ^= -1368190403;
            } else {
                int var4 = var3 >> 29;
                var4 ^= 407687425;
                var9 = var2;
                if (var9 == null) {
                    break label182;
                }

                var8 = var119.dG();
                Iterator var121 = var8.iterator();
                Iterator var122 = var121;
                var4 *= 1322698571;
                var4 += 1384772280;
                var4 ^= -566244586;

                label171:
                while (true) {
                    boolean var124 = var122.hasNext();
                    long var10 = var6;
                    long var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var218;
                    int var129 = (var218 = var10 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                    if (var129 != 0) {
                        var4 ^= 1657273821;
                        var4 -= -1969209195;
                        var4 &= -1519316945;
                        var4 *= -731062113;
                        var4 ^= 341872410;
                        break;
                    }
                    var4 = switch (var4) {
                        case -136584652 -> {
                            var4 *= -1693604599;
                            yield var4 ^ 1913010512;
                        }
                        default -> var4 ^ 1376833525;
                        case 536760677 -> var4 ^ 1445662504;
                    };
                    var10 = var5;
                    var12 = var10 + 1L;
                    var12 = var10 * var12;
                    var10 = var12 & 1L;
                    long var219;
                    int var132 = (var219 = var10 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                    if (var132 != 0) {
                        break label182;
                    }

                    if (!var124) {
                        var4 |= 149823792;
                        var4 *= 520646213;
                        var4 >>= 29;
                        var4 ^= -265366685;
                        var4 = var5 + 1;
                        var4 = var5 * var4;
                        var4 &= 1;
                        if (var4 == 0) {
                            return var7;
                        }
                        break label182;
                    }

                    var4 |= 301820320;
                    var4 >>>= 10;
                    var4 *= -965951001;
                    var4 &= 387878982;
                    var4 ^= -976725129;
                    Object var9Module = var122.next();
                    int var133 = var6 + 1;
                    int var134 = var6 * var133;
                    int var135 = var134 & 1;
                    if (var135 != 0) {
                        var4 |= -450465584;
                        var4 *= 1495688379;
                        var4 += 495724786;
                        var4 ^= 370024415;
                        var4 ^= 93814218;
                        break;
                    }
                    var4 = switch (var4) {
                        case -992978061 -> {
                            var4 += 789287395;
                            var4 -= 1314235178;
                            var4 &= -1517525961;
                            var4 >>>= 21;
                            yield var4 ^ 1689803388;
                        }
                        default -> var4 ^ -193748707;
                        case 560296697 -> var4 ^ -1937849007;
                    };
                    int var136 = var5 + 1;
                    int var137 = var5 * var136;
                    int var11 = var5 + 2;
                    int var138 = var137 * var11;
                    var11 = var5 + 3;
                    int var139 = var138 * var11;
                    int var140 = var139 & 7;
                    if (var140 != 0) {
                        break label182;
                    }

                    Yn var126 = (Yn)var9Module;
                    Yn var127 = var126;
                    List var141 = var126.GS();
                    Iterator var142 = var141.iterator();
                    Iterator var143 = var142;
                    var4 ^= -837681220;
                    var4 ^= 1522881011;

                    while (true) {
                        int var145 = (var143.hasNext()) ? 1 : 0;
                        int var162 = var6 + 1;
                        int var163 = var6 * var162;
                        int var13 = var6 + 2;
                        int var164 = var163 * var13;
                        var13 = var6 + 3;
                        int var165 = var164 * var13;
                        int var166 = var165 & 7;
                        if (var166 != 0) {
                            switch (var4) {
                                case -261295841:
                                    var4 += -874351490;
                                    var4 >>= 1;
                                    var4 += -1338252527;
                                    var4 -= -195147360;
                                    var4 ^= -880168615;
                                    break label171;
                                case 921317510:
                                default:
                                    var4 ^= -1855042649;
                                    break label171;
                                case 1482059546:
                                    var4 ^= 1580838096;
                                    break label171;
                            }
                        }
                        var4 = switch (var4) {
                            case -261295841 -> {
                                var4 &= 394531982;
                                var4 -= 795241968;
                                var4 &= 2135448508;
                                var4 |= 922108802;
                                yield var4 ^ 234427073;
                            }
                            default -> var4 ^ -630441491;
                            case 1901587970 -> var4 ^ 1802050024;
                        };
                        var12 = var5;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var220;
                        int var169 = (var220 = var12 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                        if (var169 != 0) {
                            break label182;
                        }

                        if (var145 == 0) {
                            var4 &= -111420504;
                            var4 |= 2115243823;
                            var4 &= 2010797563;
                            var4 ^= 1957890126;
                            var4 <<= 9;
                            var4 ^= -1251923916;
                            break;
                        }

                        var4 += 2042078096;
                        var4 ^= 1364878336;
                        long var146 = var5;
                        long var188 = var146 + 1L;
                        long var189 = var146 * var188;
                        long var147 = var189 & 1L;
                        long var221;
                        var145 = (var221 = var147 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                        if (var145 != 0) {
                            break label182;
                        }

                        Object var149 = var143.next();
                        Integer var170 = var6;
                        if (var170 == null) {
                            var4 -= -1987508010;
                            var4 ^= 1305965951;
                            break label171;
                        }

                        var4 &= -986027448;
                        var4 <<= 14;
                        var4 ^= 832854012;
                        xB var150 = (xB)var149;
                        if (var150 != var1) {
                            var4 &= -390233590;
                            var4 ^= -123845532;
                            int var171 = var5 + 1;
                            int var172 = var5 * var171;
                            var13 = var5 + 2;
                            int var173 = var172 * var13;
                            var13 = var5 + 3;
                            int var174 = var173 * var13;
                            int var175 = var174 & 7;
                            if (var175 != 0) {
                                break label182;
                            }

                            boolean var176 = var150 instanceof ia;
                            long var192 = var6;
                            long var15 = var192 + 1L;
                            var15 = var192 * var15;
                            long var17 = var192 + 2L;
                            var15 *= var17;
                            long var193 = var192 + 3L;
                            var15 *= var193;
                            long var194 = var15 & 7L;
                            long var222;
                            var13 = (var222 = var194 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                            if (var13 != 0) {
                                switch (var4) {
                                    case -668318100:
                                        var4 *= -5287063;
                                        var4 -= 568577888;
                                        var4 ^= -1517229174;
                                        break label171;
                                    case -104510942:
                                        var4 ^= -1693202240;
                                        break label171;
                                    case 1154261580:
                                    default:
                                        var4 ^= 578205707;
                                        break label171;
                                }
                            }

                            var4 -= -2060822800;
                            var4 ^= 1517904968;
                            var13 = var5 + 1;
                            var13 = var5 * var13;
                            int var207 = var5 + 2;
                            var13 *= var207;
                            int var208 = var5 + 3;
                            var13 *= var208;
                            var13 &= 7;
                            if (var13 != 0) {
                                break label182;
                            }

                            if (var176) {
                                var4 = switch (var4) {
                                    default -> var4 ^ 970457450;
                                    case 143035188 -> {
                                        var4 |= -1652951697;
                                        var4 ^= -1590110937;
                                        var4 += 1696566899;
                                        yield var4 ^ 863753694;
                                    }
                                    case 458636126 -> var4 ^ -175361352;
                                };
                                var12 = var5;
                                var14 = var12 + 1L;
                                var14 = var12 * var14;
                                long var16 = var12 + 2L;
                                var14 *= var16;
                                var12 += 3L;
                                var14 *= var12;
                                var12 = var14 & 7L;
                                long var223;
                                int var180 = (var223 = var12 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                                if (var180 != 0) {
                                    break label182;
                                }

                                ia var151 = (ia)var150;
                                Integer var181 = var6;
                                if (var181 == null) {
                                    var4 += -146400328;
                                    var4 &= -33983786;
                                    var4 += -941018708;
                                    var4 ^= 4640534;
                                    break label171;
                                }

                                var4 &= 623189451;
                                var4 ^= 459586668;
                                int var182 = var151.JQ();
                                if (var182 == var2) {
                                    var4 = switch (var4) {
                                        case -1444824116 -> var4 ^ -214538338;
                                        case 459387245 -> {
                                            var4 ^= 269198577;
                                            var4 ^= -834888725;
                                            var4 ^= -356829593;
                                            var4 |= 1737106924;
                                            yield var4 ^ 2024975770;
                                        }
                                        default -> var4 ^ 506240461;
                                    };
                                    var12 = var5;
                                    var14 = var12 + 1L;
                                    var14 = var12 * var14;
                                    var12 = var14 & 1L;
                                    long var224;
                                    int var185 = (var224 = var12 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                                    if (var185 != 0) {
                                        break label182;
                                    }

                                    String var186 = var127.UJ();
                                    var13 = var6 + 1;
                                    var13 = var6 * var13;
                                    var13 &= 1;
                                    if (var13 != 0) {
                                        var4 -= -765111775;
                                        var4 *= 196350047;
                                        var4 |= 1264316894;
                                        var4 ^= -1965881671;
                                        break label171;
                                    }

                                    var4 *= 24374113;
                                    var4 ^= -278780106;
                                    String var152 = var151.Tp();
                                    String var153 = var186 + " " + var152;
                                    boolean var154 = var7.add(var153);
                                    var4 &= -1825214602;
                                    var4 ^= -1286574198;
                                } else {
                                    var4 >>= 21;
                                    var4 ^= 810549313;
                                }
                            } else {
                                var4 &= -1443183899;
                                var4 -= 164496246;
                                var4 ^= -823886284;
                            }
                        } else {
                            var4 |= 1779880980;
                            var4 ^= 1273419622;
                        }

                        long var155 = var5;
                        long var204 = var155 + 1L;
                        long var205 = var155 * var204;
                        long var156 = var205 & 1L;
                        long var225;
                        var145 = (var225 = var156 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                        if (var145 != 0) {
                            break label182;
                        }

                        var4 >>= 24;
                        var4 ^= -261295825;
                    }
                }
            }

            RuntimeException var158 = new RuntimeException();
            throw var158;
        }

        AssertionError var115 = new AssertionError();
        throw var115;
    }

    private static int Z(Ud var0, FabricClientCommandSource var1, String var2, int var3) {
        label113: {
            int var5 = System.identityHashCode(var0);
            long var6 = var5;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var173;
            int var78 = (var173 = var6 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
            int var17;
            if (var78 != 0) {
                var17 = var3 >>> 23;
                var17 >>>= 29;
                var17 -= -1150479993;
                var17 += 1375643201;
                var17 ^= -872461302;
            } else {
                label115: {
                    var17 = var3 & 311603873;
                    var17 ^= -559355628;
                    int var79 = var17 + 1;
                    int var80 = var17 * var79;
                    int var7 = var17 + 2;
                    int var81 = var80 * var7;
                    var7 = var17 + 3;
                    int var82 = var81 * var7;
                    int var83 = var82 & 7;
                    if (var83 != 0) {
                        break label113;
                    }

                    NW var84 = var0.sP();
                    Optional var85 = var84.p(var2);
                    Object var86 = var85.orElse(null);
                    Yn var87 = (Yn)var86;
                    if (var87 != null) {
                        var17 |= -1132814993;
                        var17 *= -762832433;
                        var17 += 621701403;
                        var17 ^= 870460651;
                        var7 = var17 + 1;
                        var7 = var17 * var7;
                        int var134 = var17 + 2;
                        var7 *= var134;
                        int var135 = var17 + 3;
                        var7 *= var135;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label113;
                        }

                        int var101 = var87.y() ? 1 : 0;
                        var8 = var5;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        long var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var174;
                        int var139 = (var174 = var8 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                        if (var139 != 0) {
                            var17 |= -2040777633;
                            var17 |= -587271796;
                            var17 ^= -2104480433;
                            break label115;
                        }

                        var17 ^= 187977422;
                        var17 ^= -1343774603;
                        Integer var140 = var17;
                        if (var140 == null) {
                            break label113;
                        }

                        if (var101 == 0) {
                            var17 -= 909809145;
                            var17 ^= 1664237380;
                            var101 = var17 + 1;
                            var101 = var17 * var101;
                            int var141 = var17 + 2;
                            var101 *= var141;
                            int var142 = var17 + 3;
                            var101 *= var142;
                            var101 &= 7;
                            if (var101 != 0) {
                                break label113;
                            }

                            int var107 = (var87.jp()) ? 1 : 0;
                            int var143 = var5 + 1;
                            int var144 = var5 * var143;
                            int var9 = var5 + 2;
                            int var145 = var144 * var9;
                            var9 = var5 + 3;
                            int var146 = var145 * var9;
                            int var147 = var146 & 7;
                            if (var147 != 0) {
                                var17 ^= -1379444007;
                                var17 &= 335463636;
                                var17 ^= 1565186212;
                            } else {
                                var17 += -1227188332;
                                var17 |= 1742672776;
                                var17 -= -1478935117;
                                var17 -= 1018008327;
                                var17 ^= 1806882181;
                                if (var107 == 0) {
                                    var17 >>>= 3;
                                    var17 ^= -1491795102;
                                    long var108 = var17;
                                    long var156 = var108 + 1L;
                                    long var157 = var108 * var156;
                                    long var109 = var157 & 1L;
                                    long var175;
                                    var107 = (var175 = var109 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                                    if (var107 != 0) {
                                        break label113;
                                    }

                                    String var111 = var87.UJ();
                                    String var112 = var111 + " jest zawsze włączony";
                                    int var148 = var5 + 1;
                                    int var149 = var5 * var148;
                                    int var150 = var149 & 1;
                                    if (var150 == 0) {
                                        var17 ^= 1142534258;
                                        var17 -= 609158673;
                                        var17 += -93474685;
                                        var17 ^= 391790807;
                                        MutableText var113 = Text.literal(var112);
                                        var1.sendError(var113);
                                        return 0;
                                    }

                                    switch (var17) {
                                        case -1190363718:
                                            var17 |= 569203327;
                                            var17 += -16739288;
                                            var17 |= -265729351;
                                            var17 ^= -1518238193;
                                            break label115;
                                        case 214432131:
                                            var17 ^= 248016010;
                                            break label115;
                                        case 1633405390:
                                        default:
                                            var17 ^= -287658568;
                                    }
                                } else {
                                    var17 = switch (var17) {
                                        default -> var17 ^ -1055735863;
                                        case -255068476 -> {
                                            var17 <<= 9;
                                            var17 |= -269582307;
                                            var17 &= 1393921647;
                                            var17 *= 1718766063;
                                            yield var17 ^ 3234420;
                                        }
                                        case 1426720321 -> var17 ^ -736094755;
                                    };
                                    long var114 = var17;
                                    long var158 = var114 + 1L;
                                    long var159 = var114 * var158;
                                    long var11 = var114 + 2L;
                                    long var160 = var159 * var11;
                                    long var115 = var114 + 3L;
                                    long var161 = var160 * var115;
                                    long var116 = var161 & 7L;
                                    long var176;
                                    var107 = (var176 = var116 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                    if (var107 != 0) {
                                        break label113;
                                    }

                                    var87.bq();
                                    Integer var118 = var5;
                                    if (var118 != null) {
                                        var17 |= 838832075;
                                        var17 ^= -1810839929;
                                        var118 = var17;
                                        if (var118 != null) {
                                            int var120 = var17 | 1972669327;
                                            var120 += 397391621;
                                            var120 -= -1409486520;
                                            var120 ^= 1203926444;
                                            String var88 = ep(var87, var120);
                                            MutableText var89 = Text.literal(var88);
                                            var1.sendFeedback(var89);
                                            return 1;
                                        }
                                        break label113;
                                    }

                                    var17 <<= 12;
                                    var17 += 84061726;
                                    var17 -= 1203276653;
                                    var17 ^= -166639103;
                                }
                            }
                            break label115;
                        }

                        var17 -= -1178952384;
                        var17 ^= 1615058157;
                        var17 ^= -657002997;
                    } else {
                        var17 -= 1285329947;
                        var17 &= 2009635066;
                        var17 ^= -976370526;
                    }

                    var6 = var17;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var177;
                    int var93 = (var177 = var6 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                    if (var93 != 0) {
                        break label113;
                    }

                    String var94 = "Nie ma modułu \"" + var2 + "\" · Tab podpowie nazwy";
                    Integer var73 = var5;
                    if (var73 != null) {
                        long var67 = switch (var17) {
                            default -> var17 ^ 892836935;
                            case -1810538699 -> var17 ^ -2095380149;
                            case -943369030 -> {
                                var17 *= -669798031;
                                var17 += 135728846;
                                yield var17 ^ -1329962185;
                            }
                        };
                        long var127 = var67 + 1L;
                        long var128 = var67 * var127;
                        long var166 = var67 + 2L;
                        long var129 = var128 * var166;
                        long var68 = var67 + 3L;
                        long var130 = var129 * var68;
                        long var69 = var130 & 7L;
                        long var178;
                        var17 = (var178 = var69 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                        if (var17 == 0) {
                            MutableText var71 = Text.literal(var94);
                            var1.sendError(var71);
                            return 0;
                        }
                        break label113;
                    }

                    var17 &= -300614261;
                    var17 <<= 4;
                    var17 ^= 2075277910;
                    var17 ^= 1184475718;
                }
            }

            long var124 = var17;
            long var162 = var124 + 1L;
            var162 = var124 * var162;
            long var172 = var124 + 2L;
            var162 *= var172;
            var124 += 3L;
            var162 *= var124;
            var124 = var162 & 7L;
            long var179;
            var5 = (var179 = var124 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
            if (var5 == 0) {
                IllegalArgumentException var75 = new IllegalArgumentException();
                throw var75;
            }
        }

        IllegalStateException var72 = new IllegalStateException();
        throw var72;
    }

    private static String ep(Yn var0, int var1) {
        int var3 = System.identityHashCode(var0);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 != 0) {
            int var23 = var1 * 1324726761;
            var23 += -1707832765;
            var23 *= 753257791;
            var23 ^= 283586135;
            UnsupportedOperationException var27 = new UnsupportedOperationException();
            throw var27;
        } else {
            int var2 = var1 ^ -1343476521;
            var2 -= -1013498627;
            var2 ^= 602174259;
            String var29 = var0.UJ();
            int var31 = (var0.B()) ? 1 : 0;
            if (var31 != 0) {
                var2 |= -1013138105;
                var2 *= 261224947;
                var2 |= -1759873921;
                var2 ^= 2063995670;
                var31 = var2 + 1;
                var31 = var2 * var31;
                var31 &= 1;
                if (var31 == 0) {
                    String var35 = " §aon";
                    switch (var2) {
                        case -1979569048:
                        default:
                            var2 ^= 290195890;
                            return "§7" + var29 + var35;
                        case -565460513:
                            var2 ^= 1147297376;
                            return "§7" + var29 + var35;
                        case -453417239:
                            var2 ^= 2139013972;
                            var2 ^= -1625665834;
                            var2 <<= 12;
                            var2 ^= -711904816;
                            return "§7" + var29 + var35;
                    }
                }
            } else {
                var2 = switch (var2) {
                    default -> var2 ^ -1278591806;
                    case 501258457 -> {
                        var2 ^= -429681457;
                        var2 += 439085651;
                        yield var2 ^ 387157982;
                    }
                    case 1912680136 -> var2 ^ -1245026034;
                };
                Integer var5 = var2;
                if (var5 != null) {
                    String var37 = " §coff";
                    var2 *= -1800254885;
                    var2 ^= 551594973;
                    return "§7" + var29 + var37;
                }
            }

            AssertionError var36 = new AssertionError();
            throw var36;
        }
    }

    private static CompletableFuture V(List var0, SuggestionsBuilder var1, int var2) {
        label74: {
            int var4 = System.identityHashCode(var0);
            String var5 = var1.getRemainingLowerCase();
            var5 = var5;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var100;
            int var67 = (var100 = var6 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
            int var44;
            if (var67 == 0) {
                var44 = switch (var2) {
                    default -> var2 ^ -971546420;
                    case -841992171 -> {
                        var44 = var2 | 258530749;
                        var44 += -521018782;
                        var44 <<= 20;
                        var44 += 339543978;
                        yield var44 ^ 1562365919;
                    }
                    case -93378178 -> var2 ^ 2136172026;
                };
                int var68 = var44 + 1;
                int var69 = var44 * var68;
                int var70 = var69 & 1;
                if (var70 != 0) {
                    break label74;
                }

                Iterator var71 = var0.iterator();
                Iterator var72 = var71;
                var44 -= -1289187351;
                var44 |= -310741114;
                var44 &= 425223157;
                var44 |= 1928652486;
                var44 ^= -519453879;

                label71:
                while (true) {
                    long var7 = var44;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var101;
                    int var74 = (var101 = var7 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        break label74;
                    }

                    boolean var75 = var72.hasNext();
                    int var82 = var4 + 1;
                    int var83 = var4 * var82;
                    int var96 = var4 + 2;
                    int var84 = var83 * var96;
                    int var97 = var4 + 3;
                    int var85 = var84 * var97;
                    int var86 = var85 & 7;
                    if (var86 != 0) {
                        var44 &= 1456268897;
                        var44 += 1452331652;
                        var44 >>= 26;
                        var44 ^= -122906123;
                        break;
                    }

                    var44 -= 1194507614;
                    var44 ^= -1167217157;
                    var44 |= 547814219;
                    var44 -= -229192356;
                    var44 ^= 549256715;
                    int var87 = var44 + 1;
                    int var88 = var44 * var87;
                    int var98 = var44 + 2;
                    int var89 = var88 * var98;
                    int var99 = var44 + 3;
                    int var90 = var89 * var99;
                    int var91 = var90 & 7;
                    if (var91 != 0) {
                        break label74;
                    }

                    if (!var75) {
                        var44 *= -1731050271;
                        var44 ^= 548956254;
                        var4 = var44 + 1;
                        var4 = var44 * var4;
                        var4 &= 1;
                        if (var4 == 0) {
                            return var1.buildFuture();
                        }
                        break label74;
                    }

                    var44 *= 536582881;
                    var44 &= -168003070;
                    var44 *= -44177131;
                    var44 ^= -63899197;
                    Object var76 = var72.next();
                    String var77 = (String)var76;
                    Integer var92 = var4;
                    if (var92 == null) {
                        switch (var44) {
                            case -2014831687:
                            default:
                                var44 ^= 521848623;
                                break label71;
                            case -1717244989:
                                var44 <<= 27;
                                var44 ^= -525559313;
                                break label71;
                            case -825965262:
                                var44 ^= -1207537217;
                                break label71;
                        }
                    }

                    var44 |= 1080631527;
                    var44 *= 1468480559;
                    var44 *= -416563505;
                    var44 ^= -437448430;
                    Integer var93 = var44;
                    if (var93 == null) {
                        break label74;
                    }

                    boolean var94 = var77.startsWith(var5);
                    if (var94) {
                        var44 -= -425606855;
                        var44 += 1541644082;
                        var44 ^= 1244855805;
                        SuggestionsBuilder var78 = var1.suggest(var77);
                        var44 &= -1470302509;
                        var44 *= -2047119147;
                        var44 |= 731050058;
                        var44 += 1074723600;
                        var44 ^= 1382191577;
                    } else {
                        var44 += -1967515167;
                        var44 ^= 1689789392;
                    }

                    var44 |= 1037415432;
                    var44 ^= -1491018879;
                }
            } else {
                var44 = var2 ^ 342343515;
                var44 *= 1059202681;
                var44 >>= 8;
                var44 ^= -117659288;
            }

            long var54 = var44;
            long var63 = var54 + 1L;
            long var64 = var54 * var63;
            long var55 = var64 & 1L;
            long var102;
            var44 = (var102 = var55 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
            if (var44 == 0) {
                UnsupportedOperationException var58 = new UnsupportedOperationException();
                throw var58;
            }
        }

        AssertionError var57 = new AssertionError();
        throw var57;
    }

    private static int HC(Ud var0, int var1) {
        label77: {
            int var3 = System.identityHashCode(var0);
            Y var4 = var0.M();
            Integer var5 = var3;
            int var12;
            if (var5 == null) {
                var12 = var1 + -853950725;
                var12 ^= -1319867536;
            } else {
                var12 = var1 * 362631837;
                var12 ^= -2085638277;
                boolean var58 = var4.spawn();
                String var74;
                if (var58) {
                    var12 <<= 26;
                    var12 ^= 728676993;
                    var12 ^= -1099364571;
                    var12 += 687939122;
                    var12 ^= -2127504076;
                    int var69 = var12 + 1;
                    var69 = var12 * var69;
                    int var6 = var12 + 2;
                    var69 *= var6;
                    var6 = var12 + 3;
                    var69 *= var6;
                    var69 &= 7;
                    if (var69 != 0) {
                        break label77;
                    }

                    var74 = "§bTop1_Grzybalson §7· ghost lokalny · 20 HP · znika po 2:30. §f/aura ghost reset §7odnawia.";
                    switch (var12) {
                        case -1253272015:
                        default:
                            var12 ^= -1334785158;
                            break;
                        case 388499170:
                            var12 += 1963387562;
                            var12 |= 2096772973;
                            var12 ^= 1950412377;
                            break;
                        case 1199328013:
                            var12 ^= 1582792262;
                    }
                } else {
                    var12 += -277950481;
                    var12 += 1005963488;
                    var12 |= 1096832825;
                    var12 ^= -579302562;
                    var12 ^= -2110716846;
                    long var76 = var12;
                    long var8 = var76 + 1L;
                    var8 = var76 * var8;
                    long var10 = var76 + 2L;
                    var8 *= var10;
                    var76 += 3L;
                    var8 *= var76;
                    var76 = var8 & 7L;
                    long var90;
                    int var79 = (var90 = var76 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                    if (var79 != 0) {
                        break label77;
                    }

                    var74 = "§cNie można postawić ghosta. Zrób miejsce przed sobą i spróbuj ponownie.";
                    var12 ^= 477558842;
                    var12 ^= -1259720257;
                }

                int var80 = var12 + 1;
                var80 = var12 * var80;
                int var7 = var12 + 2;
                var80 *= var7;
                var7 = var12 + 3;
                var80 *= var7;
                var80 &= 7;
                if (var80 != 0) {
                    break label77;
                }

                i_2.Je(var74);
                Integer var56 = var3;
                if (var56 != null) {
                    var12 = switch (var12) {
                        case -2026579070 -> var12 ^ -494963399;
                        case -2000807500 -> {
                            var12 |= 939566127;
                            var12 >>>= 18;
                            var12 += 1849393454;
                            yield var12 ^ -339441438;
                        }
                        default -> var12 ^ 1535089981;
                    };
                    byte var57;
                    if (var58) {
                        var12 -= 965936619;
                        var12 *= -31267003;
                        var12 &= -846754020;
                        var12 ^= 389394506;
                        var57 = 1;
                        var12 &= 431191612;
                        var12 ^= -668118213;
                    } else {
                        var12 += 775366317;
                        var12 ^= -1370739684;
                        var12 ^= 45099804;
                        int var63 = var12 + 1;
                        int var64 = var12 * var63;
                        int var65 = var64 & 1;
                        if (var65 != 0) {
                            break label77;
                        }

                        var57 = 0;
                        switch (var12) {
                            case -343041386:
                                var12 ^= 1227878916;
                                break;
                            case 415910252:
                                var12 -= -389685310;
                                var12 *= 370853973;
                                var12 *= -961109983;
                                var12 *= -407376993;
                                var12 ^= 1294041273;
                                break;
                            case 694722420:
                            default:
                                var12 ^= -577386416;
                        }
                    }

                    int var66 = var12 + 1;
                    int var67 = var12 * var66;
                    int var68 = var67 & 1;
                    if (var68 == 0) {
                        return var57;
                    }
                    break label77;
                }

                switch (var12) {
                    case -2000807500:
                        var12 |= 688855291;
                        var12 |= 1835947638;
                        var12 *= -576338621;
                        var12 >>= 13;
                        var12 ^= 1875481398;
                        break;
                    case -1475701861:
                    default:
                        var12 ^= 410693530;
                        break;
                    case 1795365514:
                        var12 ^= -297625932;
                }
            }

            long var33 = var12;
            long var59 = var33 + 1L;
            long var60 = var33 * var59;
            long var85 = var33 + 2L;
            long var61 = var60 * var85;
            long var34 = var33 + 3L;
            long var62 = var61 * var34;
            long var35 = var62 & 7L;
            long var91;
            var12 = (var91 = var35 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
            if (var12 == 0) {
                AssertionError var37 = new AssertionError();
                throw var37;
            }
        }

        RuntimeException var55 = new RuntimeException();
        throw var55;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -43349454;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        W = var4;
    }
}
