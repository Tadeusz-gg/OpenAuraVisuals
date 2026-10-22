package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.function.Supplier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.command.RenderCommandQueue;
import net.minecraft.client.render.command.OrderedRenderCommandQueue.Custom;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public final class KH {
    private static final Identifier Xb;
    private static NativeImageBackedTexture dt;
    private static int Cu;
    private static RenderLayer vb;
    private static RenderLayer XX;
    public static final int HU;

    private KH() {
    }

    public static void q(int var0, int[] var1) {
        label241: {
            int var3;
            int var2 = HU;
            var3 = var0;
            var2 ^= 2041765111;
            int var4 = var0;
            NativeImageBackedTexture var5 = dt;
            int var6 = var0 + 1;
            var6 = var0 * var6;
            var6 &= 1;
            label240:
            if (var6 == 0) {
                label244: {
                    var2 = switch (var2) {
                        case -1417699683 -> {
                            var2 &= 1660708315;
                            var2 += 804170080;
                            var2 |= -390729565;
                            yield var2 ^ -1497591686;
                        }
                        default -> var2 ^ -408895103;
                        case -476021076 -> var2 ^ -236694439;
                    };
                    if (var5 != null) {
                        var2 |= -1838540108;
                        var2 -= 692027472;
                        var2 += 1343132810;
                        var2 ^= -435524035;
                        int var165 = var0 + 1;
                        int var166 = var0 * var165;
                        int var167 = var166 & 1;
                        if (var167 != 0) {
                            break label241;
                        }

                        int var168 = Cu;
                        var6 = var0 + 1;
                        var6 = var0 * var6;
                        var6 &= 1;
                        if (var6 != 0) {
                            var2 &= -1672379435;
                            var2 ^= -733046686;
                            var2 ^= 1866224566;
                            break label240;
                        }

                        var2 *= 943101735;
                        var2 -= 1983164973;
                        var2 ^= 1765291879;
                        Integer var183 = var0;
                        if (var183 == null) {
                            break label241;
                        }

                        if (var168 == var0) {
                            var2 &= -1914102980;
                            var2 ^= 2009397138;
                            var2 ^= -317847451;
                            var2 += 341563596;
                            var2 ^= -1390639146;
                            break label244;
                        }

                        var2 += 122118167;
                        var2 &= -912130406;
                        var2 ^= -1259737023;
                        var2 &= -720060301;
                        var2 ^= 154284793;
                    } else {
                        var2 -= 182471008;
                        var2 ^= 206673561;
                    }

                    var5 = dt;
                    Integer var184 = var0;
                    if (var184 == null) {
                        switch (var2) {
                            case -1205452680:
                                var2 ^= -496919675;
                                break label240;
                            case 1387671993:
                            default:
                                var2 ^= 1103188258;
                                break label240;
                            case 1563603640:
                                var2 &= 369489584;
                                var2 -= -913231910;
                                var2 -= -1056884735;
                                var2 -= -1790792208;
                                var2 ^= -817244447;
                                break label240;
                        }
                    }

                    var2 += -2096939426;
                    var2 &= 1189603320;
                    var2 ^= -1267891802;
                    if (var5 != null) {
                        var2 &= -29706084;
                        var2 |= -1369019914;
                        var2 ^= -61119404;
                        long var170 = var0;
                        long var7 = var170 + 1L;
                        var7 = var170 * var7;
                        long var171 = var7 & 1L;
                        long var299;
                        int var172 = (var299 = var171 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                        if (var172 != 0) {
                            break label241;
                        }

                        var5 = dt;
                        long var185 = var0;
                        long var8 = var185 + 1L;
                        var8 = var185 * var8;
                        long var186 = var8 & 1L;
                        long var300;
                        int var187 = (var300 = var186 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                        if (var187 != 0) {
                            var2 ^= 1655502164;
                            var2 &= 986428192;
                            var2 += -1129938818;
                            var2 ^= -430802278;
                            break label240;
                        }

                        var2 >>= 12;
                        var2 <<= 17;
                        var2 ^= 1799703650;
                        var187 = var0 + 1;
                        var187 = var0 * var187;
                        var187 &= 1;
                        if (var187 != 0) {
                            break label241;
                        }

                        var5.close();
                        var2 *= -1331366669;
                        var2 <<= 27;
                        var2 >>= 21;
                        var2 ^= 315049459;
                    } else {
                        switch (var2) {
                            case -1261760018:
                                var2 ^= -289105285;
                                break;
                            case -1156505003:
                            default:
                                var2 ^= -1928586473;
                                break;
                            case -196583242:
                                var2 += -2063589827;
                                var2 ^= 1804548736;
                        }
                    }

                    Integer var174 = var0;
                    if (var174 == null) {
                        break label241;
                    }

                    NativeImage var175 = new NativeImage(var0, var0, false);
                    Supplier var210 = () -> "auravisuals knife";
                    NativeImageBackedTexture var191 = new NativeImageBackedTexture(var210, var175);
                    long var211 = var0;
                    long var9 = var211 + 1L;
                    var9 = var211 * var9;
                    long var11 = var211 + 2L;
                    var9 *= var11;
                    long var212 = var211 + 3L;
                    var9 *= var212;
                    long var213 = var9 & 7L;
                    long var301;
                    int var214 = (var301 = var213 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                    if (var214 != 0) {
                        switch (var2) {
                            case 315049075:
                                var2 >>= 23;
                                var2 -= -1917012815;
                                var2 ^= 1226899824;
                                break label240;
                            case 577383337:
                            default:
                                var2 ^= -1918562375;
                                break label240;
                            case 2142149598:
                                var2 ^= 1181384676;
                                break label240;
                        }
                    }

                    var2 |= 213331405;
                    var2 ^= -2087083925;
                    long var215 = var0;
                    var9 = var215 + 1L;
                    var9 = var215 * var9;
                    long var216 = var9 & 1L;
                    long var302;
                    int var217 = (var302 = var216 - 0L) == 0L ? 0 : (var302 < 0L ? -1 : 1);
                    if (var217 != 0) {
                        break label241;
                    }

                    dt = var191;
                    Cu = var0;
                    MinecraftClient var192 = MinecraftClient.getInstance();
                    TextureManager var193 = var192.getTextureManager();
                    Identifier var218 = Xb;
                    NativeImageBackedTexture var230 = dt;
                    var193.registerTexture(var218, var230);
                    int var194 = var2 | 1775980689;
                    var194 -= 833233897;
                    var194 ^= 1548670329;
                    Y(var194);
                    var2 *= -1501116613;
                    var2 ^= 1537501879;
                    var2 &= 1355114844;
                    var2 ^= -2036117167;
                }

                NativeImageBackedTexture var197 = dt;
                NativeImage var198 = var197.getImage();
                long var219 = var0;
                long var253 = var219 + 1L;
                var253 = var219 * var253;
                var219 = var253 & 1L;
                long var303;
                int var221 = (var303 = var219 - 0L) == 0L ? 0 : (var303 < 0L ? -1 : 1);
                if (var221 != 0) {
                    var2 |= 794774872;
                    var2 &= -855372836;
                    var2 *= -608116597;
                    var2 ^= 1480349900;
                } else {
                    var2 &= -944885696;
                    var2 ^= -606204866;
                    var219 = var0;
                    var253 = var219 + 1L;
                    var253 = var219 * var253;
                    var219 = var253 & 1L;
                    long var304;
                    int var224 = (var304 = var219 - 0L) == 0L ? 0 : (var304 < 0L ? -1 : 1);
                    if (var224 != 0) {
                        break label241;
                    }

                    NativeImage var176 = var198;
                    if (var198 == null) {
                        switch (var2) {
                            case -1036594562:
                            default:
                                var2 ^= -913222015;
                                break;
                            case 1568414846:
                                var2 |= 1293882808;
                                var2 |= 1465551527;
                                var2 ^= 230068161;
                                break;
                            case 2036527322:
                                var2 ^= 473460673;
                        }

                        var6 = var0 + 1;
                        var6 = var0 * var6;
                        int var227 = var0 + 2;
                        var6 *= var227;
                        int var228 = var0 + 3;
                        var6 *= var228;
                        var6 &= 7;
                        if (var6 == 0) {
                            return;
                        }
                        break label241;
                    }
                    var2 = switch (var2) {
                        case -1310346069 -> var2 ^ -2057302652;
                        default -> var2 ^ 964710589;
                        case 1568414846 -> {
                            var2 &= -508456793;
                            yield var2 ^ 207361268;
                        }
                    };
                    var6 = var0 + 1;
                    var6 = var0 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label241;
                    }

                    int var202 = 0;
                    byte var225 = 0;
                    int var231 = var0 + 1;
                    var231 = var0 * var231;
                    int var257 = var0 + 2;
                    var231 *= var257;
                    int var258 = var0 + 3;
                    var231 *= var258;
                    var231 &= 7;
                    if (var231 != 0) {
                        switch (var2) {
                            case -2112962282:
                                var2 ^= 1708734889;
                                break;
                            case -1502508224:
                            default:
                                var2 ^= 1171274090;
                                break;
                            case 1298924754:
                                var2 -= -2006712398;
                                var2 ^= -26587356;
                        }
                    } else {
                        var2 &= 752132521;
                        var2 += 405394617;
                        var2 ^= 850077844;
                        var2 -= -210120069;
                        var2 ^= -1077418371;
                        var231 = var0 + 1;
                        var231 = var0 * var231;
                        var231 &= 1;
                        if (var231 != 0) {
                            break label241;
                        }

                        var202 = var202;
                        int var226 = var225;
                        var2 ^= 1881098144;
                        var2 ^= 1096079771;
                        var2 ^= -1389853466;

                        label208:
                        while (true) {
                            long var239 = var3;
                            long var10 = var239 + 1L;
                            var10 = var239 * var10;
                            long var240 = var10 & 1L;
                            long var305;
                            var231 = (var305 = var240 - 0L) == 0L ? 0 : (var305 < 0L ? -1 : 1);
                            if (var231 != 0) {
                                break label241;
                            }

                            if (var202 >= var0) {
                                var2 -= 1471491275;
                                var2 |= 214684947;
                                var2 ^= -620332409;
                                var5 = dt;
                                Integer var163 = var4;
                                if (var163 != null) {
                                    var2 |= 1156846316;
                                    var2 >>= 17;
                                    var2 *= -1764965973;
                                    var2 ^= 1367587900;
                                    var163 = var3;
                                    if (var163 != null) {
                                        var5.upload();
                                        return;
                                    }
                                    break label241;
                                }

                                var2 &= 1670231003;
                                var2 -= -491316138;
                                var2 ^= 2059776283;
                                var2 ^= 1047896037;
                                break;
                            }

                            var2 |= 267198850;
                            var2 |= -910846549;
                            var2 -= 1239198281;
                            var2 ^= -356890211;
                            var231 = var3 + 1;
                            var231 = var3 * var231;
                            var231 &= 1;
                            if (var231 != 0) {
                                break label241;
                            }

                            int var245 = 0;
                            int var259 = var226;
                            var10 = var4;
                            long var12 = var10 + 1L;
                            var12 = var10 * var12;
                            long var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var306;
                            int var264 = (var306 = var10 - 0L) == 0L ? 0 : (var306 < 0L ? -1 : 1);
                            if (var264 != 0) {
                                var2 -= -1669588031;
                                var2 |= 193162662;
                                var2 -= -2035009833;
                                var2 ^= 1871314131;
                                break;
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ 1965522129;
                                case 1180328604 -> var2 ^ -1531703415;
                                case 1822098671 -> {
                                    var2 -= -545840994;
                                    var2 -= -2008532257;
                                    var2 |= 796784192;
                                    yield var2 ^ 50722844;
                                }
                            };
                            var10 = var3;
                            var12 = var10 + 1L;
                            var12 = var10 * var12;
                            var14 = var10 + 2L;
                            var12 *= var14;
                            var10 += 3L;
                            var12 *= var10;
                            var10 = var12 & 7L;
                            long var307;
                            int var268 = (var307 = var10 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
                            if (var268 != 0) {
                                break label241;
                            }

                            var245 = var245;
                            var2 <<= 2;
                            var2 <<= 12;
                            var2 ^= -160646694;

                            while (true) {
                                int var269 = var3 + 1;
                                int var270 = var3 * var269;
                                int var282 = var3 + 2;
                                int var271 = var270 * var282;
                                var282 = var3 + 3;
                                int var272 = var271 * var282;
                                int var273 = var272 & 7;
                                if (var273 != 0) {
                                    break label241;
                                }

                                if (var245 >= var0) {
                                    var2 >>>= 19;
                                    var2 |= -1080563692;
                                    var2 -= -1011514496;
                                    var2 |= 1519301407;
                                    var2 ^= -532760597;
                                    var245 = var202 + 1;
                                    int var277 = var4 + 1;
                                    int var278 = var4 * var277;
                                    var282 = var4 + 2;
                                    int var279 = var278 * var282;
                                    var282 = var4 + 3;
                                    int var280 = var279 * var282;
                                    int var281 = var280 & 7;
                                    if (var281 != 0) {
                                        var2 *= 785975691;
                                        var2 += 1081490779;
                                        var2 *= 299694387;
                                        var2 &= 1864598863;
                                        var2 ^= 1531005505;
                                        break label208;
                                    }

                                    var2 ^= -2019503670;
                                    var2 ^= 1809864657;
                                    var202 = var245;
                                    var226 = var259;
                                    var2 <<= 27;
                                    var2 <<= 5;
                                    var2 |= -1299521219;
                                    var2 >>= 1;
                                    var2 ^= -642996468;
                                    break;
                                }
                                var2 = switch (var2) {
                                    case -1508642207 -> var2 ^ 94794779;
                                    default -> var2 ^ -319211982;
                                    case 2008496602 -> {
                                        var2 &= 1097816073;
                                        yield var2 ^ -669761373;
                                    }
                                };
                                Integer var274 = var3;
                                if (var274 == null) {
                                    break label241;
                                }

                                int var275 = var1[var259];
                                var176.setColorArgb(var245, var202, var275);
                                int var276 = var245 + 1;
                                var282 = var259 + 1;
                                var259 = var282;
                                var282 = var4 + 1;
                                var282 = var4 * var282;
                                var282 &= 1;
                                if (var282 != 0) {
                                    var2 &= -182216452;
                                    var2 -= 357869130;
                                    var2 &= 1386862859;
                                    var2 |= -990661825;
                                    var2 ^= -308692677;
                                    break label208;
                                }
                                var2 = switch (var2) {
                                    case -1737397865 -> var2 ^ 1319883053;
                                    case -1724688213 -> {
                                        var2 &= 41535720;
                                        var2 |= -1145492167;
                                        yield var2 ^ -1773323529;
                                    }
                                    default -> var2 ^ -1845413503;
                                };
                                Integer var288 = var3;
                                if (var288 == null) {
                                    break label241;
                                }

                                var245 = var276;
                                var2 >>>= 7;
                                var2 >>>= 5;
                                var2 ^= 2008409759;
                            }
                        }
                    }
                }
            } else {
                var2 *= -1745913529;
                var2 |= -1587795430;
                var2 += -62118164;
                var2 ^= -1792398461;
            }

            Integer var160 = var3;
            if (var160 != null) {
                RuntimeException var162 = new RuntimeException();
                throw var162;
            }
        }

        IllegalStateException var161 = new IllegalStateException();
        throw var161;
    }

    public static boolean A() {
        int var0 = HU;
        var0 ^= 1878376587;
        NativeImageBackedTexture var1 = dt;
        var0 += 395557239;
        var0 |= -358961947;
        var0 *= -701317941;
        var0 ^= -966084238;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        long var6 = var2 + 2L;
        var4 *= var6;
        var2 += 3L;
        var4 *= var2;
        var2 = var4 & 7L;
        long var39;
        int var35 = (var39 = var2 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        label32:
        if (var35 == 0) {
            boolean var32;
            if (var1 != null) {
                var0 ^= 2062890926;
                var0 ^= 68999139;
                int var29 = var0 + 1;
                int var30 = var0 * var29;
                int var31 = var30 & 1;
                if (var31 != 0) {
                    break label32;
                }

                var32 = true;
                var0 *= 65263609;
                var0 += 1580956289;
                var0 *= 1872164171;
                var0 &= -1377760830;
                var0 ^= 43969586;
            } else {
                var0 = switch (var0) {
                    case -869943432 -> var0 ^ -171941177;
                    case -759623187 -> {
                        var0 &= 598973511;
                        yield var0 ^ -565516447;
                    }
                    default -> var0 ^ 771451126;
                };
                var32 = false;
                switch (var0) {
                    case -1594164160:
                    default:
                        var0 ^= 438087027;
                        break;
                    case -1525253203:
                        var0 ^= -1807620628;
                        break;
                    case -587466972:
                        var0 >>>= 11;
                        var0 *= -546236183;
                        var0 += -991904042;
                        var0 ^= 457725236;
                }
            }

            return var32;
        }

        AssertionError var20 = new AssertionError();
        throw var20;
    }

    private static void Y(int var0) {
        Identifier var2 = Xb;
        RenderLayer var13 = RenderLayers.text(var2);
        vb = var13;
        var2 = Xb;
        RenderLayer var15 = RenderLayers.energySwirl(var2, 0.0F, 0.0F);
        int var1 = var0 | -143440471;
        var1 |= -293836990;
        var1 ^= -633850744;
        long var3 = var1;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        long var7 = var3 + 2L;
        var5 *= var7;
        var3 += 3L;
        var5 *= var3;
        var3 = var5 & 7L;
        long var21;
        var1 = (var21 = var3 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
        if (var1 == 0) {
            XX = var15;
        } else {
            IllegalArgumentException var12 = new IllegalArgumentException();
            throw var12;
        }
    }

    public static void IR(MatrixStack var0, Object var1, x_2 var2, gz_2 var3) {
        label130: {
            int var4 = HU;
            var4 ^= 943885068;
            int var5 = System.identityHashCode(var0);
            NativeImageBackedTexture var6 = dt;
            int var7 = var5 + 1;
            var7 = var5 * var7;
            var7 &= 1;
            if (var7 == 0) {
                var4 = switch (var4) {
                    case -359675546 -> {
                        var4 -= -466469561;
                        var4 &= 1184322919;
                        var4 -= 537018026;
                        yield var4 ^ 278750710;
                    }
                    default -> var4 ^ -1585950204;
                    case 1724934090 -> var4 ^ -1016253808;
                };
                if (var6 == null) {
                    var4 |= -174944014;
                    var4 <<= 18;
                    var4 ^= 1180450624;
                    return;
                }

                var4 |= -949625777;
                var4 ^= -1533899184;
                var4 ^= 752660762;
                Integer var106 = var4;
                if (var106 == null) {
                    break label130;
                }

                OrderedRenderCommandQueue var107 = (OrderedRenderCommandQueue)var1;
                var7 = var5 + 1;
                var7 = var5 * var7;
                var7 &= 1;
                if (var7 != 0) {
                    var4 |= 575285444;
                    var4 >>>= 11;
                    var4 |= -270198668;
                    var4 >>>= 5;
                    var4 ^= 1268392930;
                } else {
                    label133: {
                        var4 -= -1574174108;
                        var4 ^= 1820363955;
                        var7 = var4 + 1;
                        var7 = var4 * var7;
                        int var8 = var4 + 2;
                        var7 *= var8;
                        var8 = var4 + 3;
                        var7 *= var8;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label130;
                        }

                        x_2 var124 = x_2.SOLID;
                        RenderCommandQueue var129;
                        if (var2 == var124) {
                            var4 &= -1087254699;
                            var4 += 1002091653;
                            var4 |= -390127408;
                            var4 ^= -270876232;
                            long var125 = var4;
                            long var9 = var125 + 1L;
                            var9 = var125 * var9;
                            long var11 = var125 + 2L;
                            var9 *= var11;
                            long var126 = var125 + 3L;
                            var9 *= var126;
                            long var127 = var9 & 7L;
                            long var175;
                            var7 = (var175 = var127 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label130;
                            }

                            var129 = var107;
                            var4 &= -1807781056;
                            var4 *= -599443635;
                            var4 <<= 28;
                            var4 ^= 836331732;
                        } else {
                            var4 |= 780827999;
                            var4 -= -1313812115;
                            var4 ^= -1641517709;
                            Integer var134 = var4;
                            if (var134 == null) {
                                break label130;
                            }

                            RenderCommandQueue var108 = var107.getBatchingQueue(1);
                            var134 = var5;
                            if (var134 == null) {
                                var4 ^= -1913551999;
                                var4 ^= 1366433385;
                                break label133;
                            }

                            var4 += -78580031;
                            var4 += -2120609874;
                            var4 |= -1137913684;
                            var4 ^= -435075682;
                            long var136 = var4;
                            long var10 = var136 + 1L;
                            var10 = var136 * var10;
                            long var12 = var136 + 2L;
                            var10 *= var12;
                            long var137 = var136 + 3L;
                            var10 *= var137;
                            long var138 = var10 & 7L;
                            long var176;
                            int var139 = (var176 = var138 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                            if (var139 != 0) {
                                break label130;
                            }

                            var129 = var108;
                            switch (var4) {
                                case -1662884007:
                                    var4 ^= 542686958;
                                    break;
                                case -447203815:
                                default:
                                    var4 ^= 587122434;
                                    break;
                                case 1533844834:
                                    var4 -= 1467676159;
                                    var4 -= -234259659;
                                    var4 &= 1262474071;
                                    var4 ^= 821127378;
                            }
                        }

                        x_2 var130 = x_2.SOLID;
                        var8 = var5 + 1;
                        var8 = var5 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            switch (var4) {
                                case 836331732:
                                    var4 -= 1359290040;
                                    var4 -= 341852228;
                                    var4 &= -394325269;
                                    var4 >>= 8;
                                    var4 ^= -1288886263;
                                    break;
                                case 963427632:
                                default:
                                    var4 ^= -325555271;
                                    break;
                                case 1528305203:
                                    var4 ^= -1833230249;
                            }
                        } else {
                            label144: {
                                var4 = switch (var4) {
                                    default -> var4 ^ -157982460;
                                    case 594399793 -> var4 ^ -1440881800;
                                    case 836331732 -> {
                                        var4 |= 1654994753;
                                        var4 += -1834820838;
                                        var4 *= 1895565107;
                                        yield var4 ^ -1948471309;
                                    }
                                };
                                Integer var143 = var4;
                                if (var143 == null) {
                                    break label130;
                                }

                                RenderLayer var132;
                                if (var2 == var130) {
                                    var4 ^= -1115185384;
                                    var4 <<= 29;
                                    var4 ^= -774524308;
                                    RenderLayer var131 = vb;
                                    int var144 = var5 + 1;
                                    var144 = var5 * var144;
                                    var144 &= 1;
                                    if (var144 != 0) {
                                        var4 *= -885036939;
                                        var4 <<= 24;
                                        var4 &= 1740211369;
                                        var4 -= 1553281165;
                                        var4 ^= -1416653958;
                                        break label144;
                                    }

                                    var4 |= 210816203;
                                    var4 -= -648678664;
                                    var4 -= 669170233;
                                    var4 ^= 801700847;
                                    var132 = var131;
                                    var4 <<= 12;
                                    var4 ^= -1697432908;
                                    var4 &= -366628611;
                                    var4 ^= -2065216223;
                                } else {
                                    var4 = switch (var4) {
                                        case -2029223282 -> var4 ^ 1282699003;
                                        default -> var4 ^ -486448972;
                                        case 1282279790 -> {
                                            var4 *= 2141533631;
                                            var4 |= 1710116769;
                                            yield var4 ^ -177077704;
                                        }
                                    };
                                    RenderLayer var147 = XX;
                                    Integer var158 = var5;
                                    if (var158 == null) {
                                        var4 >>= 21;
                                        var4 &= 2142085072;
                                        var4 ^= 1608656537;
                                        var4 ^= 1823139456;
                                        break label144;
                                    }

                                    var4 -= 1944204834;
                                    var4 -= 1335360729;
                                    var4 >>= 20;
                                    var4 &= -1909939222;
                                    var4 ^= 826417000;
                                    long var159 = var4;
                                    long var170 = var159 + 1L;
                                    var170 = var159 * var170;
                                    long var13 = var159 + 2L;
                                    var170 *= var13;
                                    long var160 = var159 + 3L;
                                    var170 *= var160;
                                    long var161 = var170 & 7L;
                                    long var177;
                                    int var162 = (var177 = var161 - 0L) == 0L ? 0 : (var177 < 0L ? -1 : 1);
                                    if (var162 != 0) {
                                        break label130;
                                    }

                                    var132 = var147;
                                    var4 *= -703635137;
                                    var4 ^= -636892148;
                                    var4 += 492683576;
                                    var4 += -351231222;
                                    var4 ^= -539760605;
                                }

                                Objects.requireNonNull(var3);
                                int var149 = var5 + 1;
                                var149 = var5 * var149;
                                var5 = var149 & 1;
                                if (var5 == 0) {
                                    var4 += -1465383227;
                                    var4 ^= -675318947;
                                    long var151 = var4;
                                    long var166 = var151 + 1L;
                                    var166 = var151 * var166;
                                    long var174 = var151 + 2L;
                                    var166 *= var174;
                                    long var152 = var151 + 3L;
                                    var166 *= var152;
                                    long var153 = var166 & 7L;
                                    long var178;
                                    var5 = (var178 = var153 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                                    if (var5 == 0) {
                                        Custom var105 = var3::m;
                                        var129.submitCustom(var0, var132, var105);
                                        return;
                                    }
                                    break label130;
                                }

                                var4 &= -1935328136;
                                var4 ^= 1214541849;
                            }
                        }
                    }
                }
            } else {
                var4 -= 967986214;
                var4 ^= 2035088420;
                var4 >>>= 13;
                var4 += -1414548970;
                var4 ^= -414145877;
            }

            long var97 = var4;
            long var110 = var97 + 1L;
            long var111 = var97 * var110;
            long var154 = var97 + 2L;
            long var112 = var111 * var154;
            long var98 = var97 + 3L;
            long var113 = var112 * var98;
            long var99 = var113 & 7L;
            long var179;
            var4 = (var179 = var99 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
            if (var4 == 0) {
                IllegalStateException var102 = new IllegalStateException();
                throw var102;
            }
        }

        IllegalArgumentException var101 = new IllegalArgumentException();
        throw var101;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1898622241;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        HU = var4;
        Identifier var5 = Identifier.of("auravisuals:dynamic/knife");
        Xb = var5;
    }
}
