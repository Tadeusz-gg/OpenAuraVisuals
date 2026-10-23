package dev.aurap.hub;

import mvggs.modules.client.clickgui;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;

public final class mD extends Screen {
    private final bS RX;
    private boolean x;
    public static final int AS;

    public mD(bS var1) {
        super(Text.literal("Aura Visuals"));
        this.RX = var1;
    }

    protected void init() {
        label56: {
            int var25;
            label55: {
                var25 = AS;
                var25 ^= -1999518693;
                int var2 = System.identityHashCode(this);
                boolean var3 = this.x;
                int var4 = var2 + 1;
                var4 = var2 * var4;
                int var5 = var2 + 2;
                var4 *= var5;
                var5 = var2 + 3;
                var4 *= var5;
                var4 &= 7;
                if (var4 == 0) {
                    var25 *= -315495905;
                    var25 -= 360074798;
                    var25 ^= 1811891793;
                    var25 ^= 110800983;
                    long var51 = var25;
                    long var6 = var51 + 1L;
                    var6 = var51 * var6;
                    long var52 = var6 & 1L;
                    long var58;
                    var4 = (var58 = var52 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label56;
                    }

                    if (var3) {
                        var25 *= 1102538079;
                        var25 ^= -1247717841;
                        var25 |= 475165594;
                        var25 |= 1242665103;
                        var25 ^= -1639897879;
                        break label55;
                    }

                    var25 += 196978005;
                    var25 ^= 22309993;
                    this.x = true;
                    bS var44 = this.RX;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    var2 = var4 & 1;
                    if (var2 == 0) {
                        var25 = switch (var25) {
                            case -2105419190 -> var25 ^ -1310359365;
                            default -> var25 ^ 532040454;
                            case 1329529507 -> {
                                var25 += -1012533576;
                                var25 &= 1129184732;
                                yield var25 ^ 2076829308;
                            }
                        };
                        var2 = var25 + 1;
                        var2 = var25 * var2;
                        var2 &= 1;
                        if (var2 != 0) {
                            break label56;
                        }

                        var44.dh();
                        switch (var25) {
                            case -804249046:
                            default:
                                var25 ^= 1822914434;
                                break label55;
                            case 599919950:
                                var25 ^= 699337992;
                                break label55;
                            case 2039291684:
                                var25 *= -1210204325;
                                var25 &= -386518274;
                                var25 >>>= 22;
                                var25 ^= 1631247127;
                                break label55;
                        }
                    }

                    switch (var25) {
                        case -1917243198:
                            var25 ^= 853335754;
                            break;
                        case 231466684:
                        default:
                            var25 ^= -54563637;
                            break;
                        case 1329529507:
                            var25 |= -1881177253;
                            var25 ^= -400738480;
                            var25 += -1217483598;
                            var25 ^= 1602425800;
                    }
                } else {
                    var25 -= -647757369;
                    var25 ^= -1563544633;
                    var25 ^= 2127843114;
                }

                Integer var32 = var25;
                if (var32 != null) {
                    RuntimeException var34 = new RuntimeException();
                    throw var34;
                }
                break label56;
            }

            int var39 = var25 + 1;
            var39 = var25 * var39;
            int var45 = var25 + 2;
            var39 *= var45;
            var45 = var25 + 3;
            var39 *= var45;
            var39 &= 7;
            if (var39 == 0) {
                return;
            }
        }

        IllegalArgumentException var33 = new IllegalArgumentException();
        throw var33;
    }

    public boolean shouldPause() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    public void close() {
        int var1 = AS;
        var1 ^= -694308256;
        int var2 = System.identityHashCode(this);
        bS var3 = this.RX;
        Integer var17 = var2;
        if (var17 == null) {
            var1 -= 731153270;
            var1 >>= 2;
            var1 ^= 1934598737;
            var1 ^= 598679013;
            var17 = var1;
            if (var17 == null) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            } else {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        } else {
            switch (var1) {
                case -437337307:
                    var1 ^= -740302953;
                    break;
                case 1751148100:
                    var1 &= 1134663045;
                    var1 += 262431762;
                    var1 |= 263142177;
                    var1 <<= 22;
                    var1 ^= -1061920457;
                    break;
                case 1934772155:
                default:
                    var1 ^= -759602206;
            }

            Runnable var12 = () -> {
                int var1x = AS;
                var1x ^= 1223394669;
                int var2x = System.identityHashCode(this);
                int var3x = var2x + 1;
                var3x = var2x * var3x;
                var2x = var3x & 1;
                if (var2x == 0) {
                    var1x -= 1314633875;
                    var1x <<= 27;
                    var1x ^= -689427511;
                    var2x = var1x + 1;
                    var2x = var1x * var2x;
                    var2x &= 1;
                    if (var2x == 0) {
                        super.close();
                        return;
                    }
                } else {
                    var1x ^= 1295728089;
                    var1x -= -145114761;
                    var1x >>>= 10;
                    var1x ^= 454871522;
                    Integer var12x = var1x;
                    if (var12x != null) {
                        IllegalArgumentException var14x = new IllegalArgumentException();
                        throw var14x;
                    }
                }

                UnsupportedOperationException var13x = new UnsupportedOperationException();
                throw var13x;
            };
            var3.Jn(var12);
        }
    }

    public void tick() {
        int var1 = AS;
        var1 ^= 1870429197;
        int var2 = System.identityHashCode(this);
        bS var3 = this.RX;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        if (var2 == 0) {
            long var27 = switch (var1) {
                default -> var1 ^ -1306391296;
                case -780031959 -> {
                    var1 ^= 188609406;
                    var1 *= -336801473;
                    var1 ^= -44952030;
                    yield var1 ^ -1698755854;
                }
                case 169068328 -> var1 ^ 637931031;
            };
            long var6 = var27 + 1L;
            var6 = var27 * var6;
            long var28 = var6 & 1L;
            long var30;
            var2 = (var30 = var28 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var2 == 0) {
                var3.q();
                return;
            }
        } else {
            Integer var18 = switch (var1) {
                default -> var1 ^ 944306789;
                case -780031959 -> {
                    var1 ^= -498412011;
                    var1 ^= 61340952;
                    var1 |= 9008887;
                    var1 &= -1707128633;
                    yield var1 ^ 1413592049;
                }
                case 1885246209 -> var1 ^ -1917165319;
            };
            if (var18 != null) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        }

        RuntimeException var19 = new RuntimeException();
        throw var19;
    }

    public void removed() {
        int var1 = AS;
        var1 ^= -1910024351;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var3 &= 1;
        if (var3 != 0) {
            var1 *= 1470119515;
            var1 += -1122809435;
            var1 ^= -1316753676;
        } else {
            label39: {
                label33: {
                    var1 -= -1108023682;
                    var1 ^= -1723436059;
                    bS var42 = this.RX;
                    boolean var43 = var42.A();
                    if (var43) {
                        var1 ^= 1363593551;
                        var1 ^= 698562023;
                        bS var44 = this.RX;
                        int var4 = var2 + 1;
                        var4 = var2 * var4;
                        int var5 = var2 + 2;
                        var4 *= var5;
                        var2 += 3;
                        var4 *= var2;
                        var2 = var4 & 7;
                        if (var2 != 0) {
                            var1 ^= -604089142;
                            var1 *= 687651541;
                            var1 &= -358731036;
                            var1 ^= -1119926376;
                            break label39;
                        }

                        var1 ^= 1429561301;
                        var1 |= -1524787617;
                        var1 ^= -719143140;
                        long var48 = var1;
                        long var6 = var48 + 1L;
                        var6 = var48 * var6;
                        long var8 = var48 + 2L;
                        var6 *= var8;
                        long var49 = var48 + 3L;
                        var6 *= var49;
                        long var50 = var6 & 7L;
                        long var59;
                        var2 = (var59 = var50 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            break label33;
                        }

                        var44.B();
                        var1 >>= 12;
                        var1 |= -88287878;
                        var1 ^= -1481464851;
                    } else {
                        var1 += -1129373215;
                        var1 -= 865418357;
                        var1 |= 1012119556;
                        var1 ^= 569551517;
                    }

                    long var35 = var1;
                    long var51 = var35 + 1L;
                    var51 = var35 * var51;
                    long var58 = var35 + 2L;
                    var51 *= var58;
                    long var36 = var35 + 3L;
                    var51 *= var36;
                    long var37 = var51 & 7L;
                    long var60;
                    var2 = (var60 = var37 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return;
                    }
                }

                IllegalArgumentException var39 = new IllegalArgumentException();
                throw var39;
            }
        }

        AssertionError var31 = new AssertionError();
        throw var31;
    }

    public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
        int var5 = System.identityHashCode(this);
    }

    public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
        int var5 = System.identityHashCode(this);
    }

    private boolean MJ(int var1, int var2) {
        label84: {
            int var65;
            label88: {
                var65 = System.identityHashCode(this);
                ClientRuntime var6 = ClientRuntime.Z();
                ModuleManager var68 = var6.sP();
                Module var69 = var68.tG(clickgui.class);
                long var7 = var65;
                long var9 = var7 + 1L;
                var9 = var7 * var9;
                long var11 = var7 + 2L;
                var9 *= var11;
                var7 += 3L;
                var9 *= var7;
                var7 = var9 & 7L;
                long var91;
                int var82 = (var91 = var7 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                label81:
                if (var82 == 0) {
                    int var19 = var2 * -637406437;
                    var19 ^= -1818022029;
                    clickgui var70 = (clickgui)var69;
                    int var71 = var70.P();
                    if (var1 == var71) {
                        var19 = switch (var19) {
                            case 37272489 -> var19 ^ -932750175;
                            case 344466846 -> {
                                var19 ^= 685708881;
                                var19 ^= -1907044528;
                                var19 -= -1149665742;
                                var19 -= -111551850;
                                yield var19 ^ 8681892;
                            }
                            default -> var19 ^ -753305506;
                        };
                        Integer var72 = var1;
                        if (var72 == null) {
                            break label84;
                        }

                        bS var73 = this.RX;
                        boolean var74 = var73.gn();
                        Integer var59 = var65;
                        if (var59 == null) {
                            var19 -= -155359707;
                            var19 -= 155661821;
                            var19 -= 657818196;
                            var19 -= -1719723214;
                            var19 ^= 1094200701;
                            break label81;
                        }
                        var19 = switch (var19) {
                            case -1994259041 -> var19 ^ 447338405;
                            case -38479245 -> {
                                var19 ^= 1022247366;
                                var19 *= 506815755;
                                yield var19 ^ -1095531837;
                            }
                            default -> var19 ^ -1526953145;
                        };
                        int var60 = var1 + 1;
                        var60 = var1 * var60;
                        int var83 = var1 + 2;
                        var60 *= var83;
                        int var84 = var1 + 3;
                        var60 *= var84;
                        var60 &= 7;
                        if (var60 != 0) {
                            break label84;
                        }

                        if (!var74) {
                            var19 = switch (var19) {
                                default -> var19 ^ 2130483989;
                                case 280255162 -> var19 ^ -1629649708;
                                case 1048550148 -> {
                                    var19 &= -352395475;
                                    yield var19 ^ 576037121;
                                }
                            };
                            var65 = 1;
                            switch (var19) {
                                case 137050629:
                                    var19 += 1698068846;
                                    var19 &= 72853985;
                                    var19 += 1858682399;
                                    var19 ^= 1061194279;
                                    break label88;
                                case 244389589:
                                default:
                                    var19 ^= 1922077643;
                                    break label88;
                                case 1695583259:
                                    var19 ^= 712441254;
                                    break label88;
                            }
                        }

                        var19 &= 706897332;
                        var19 &= 1005127059;
                        var19 <<= 22;
                        var19 |= -1253433118;
                        var19 ^= 701210245;
                    } else {
                        var19 += -1547492619;
                        var19 ^= 1691023092;
                    }

                    long var75 = var1;
                    long var8 = var75 + 1L;
                    var8 = var75 * var8;
                    long var10 = var75 + 2L;
                    var8 *= var10;
                    long var76 = var75 + 3L;
                    var8 *= var76;
                    long var77 = var8 & 7L;
                    long var92;
                    int var78 = (var92 = var77 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                    if (var78 != 0) {
                        break label84;
                    }

                    var65 = 0;
                    switch (var19) {
                        case -2052963901:
                        default:
                            var19 ^= 943789584;
                            break label88;
                        case -595476889:
                            var19 += -483253188;
                            var19 += 1408780414;
                            var19 += 794675389;
                            var19 ^= 256091769;
                            break label88;
                        case 1984209321:
                            var19 ^= 1350402638;
                            break label88;
                    }
                } else {
                    switch (var2) {
                        case -1399816296:
                        default:
                            int var18 = var2 ^ 290121031;
                            break;
                        case -321760617:
                            int var13 = var2 & -258871934;
                            var13 ^= -1300093583;
                            var13 += 1312950357;
                            var13 <<= 20;
                            var13 ^= -1723626058;
                            break;
                        case 1557438846:
                            int var3 = var2 ^ -993987007;
                    }
                }

                long var47 = var1;
                long var66 = var47 + 1L;
                long var67 = var47 * var66;
                var47 = var67 & 1L;
                long var93;
                int var49 = (var93 = var47 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                if (var49 == 0) {
                    IllegalArgumentException var50 = new IllegalArgumentException();
                    throw var50;
                }
                break label84;
            }

            Integer var79 = var1;
            if (var79 != null) {
                return (var65 != 0);
            }
        }

        AssertionError var58 = new AssertionError();
        throw var58;
    }

    private static int n(int var0, int var1) {
        int var5 = var0 + 1;
        var5 = var0 * var5;
        int var4 = var5 & 1;
        if (var4 == 0) {
            int var2 = var1 + 1927755492;
            var2 ^= -1389273363;
            if (var0 == 0) {
                var2 |= 217228897;
                var2 &= -839198166;
                var2 >>= 7;
                var2 ^= 235066596;
                var4 = var0 + 1;
                var4 = var0 * var4;
                var4 &= 1;
                if (var4 == 0) {
                    return 0;
                }
            } else {
                var2 += -2045666990;
                var2 -= 823998338;
                var2 += 1435234384;
                var2 += -1218836062;
                var2 ^= 2139792680;
                Integer var39 = var0;
                if (var39 != null) {
                    if (var0 == 1) {
                        var2 &= 2124656967;
                        var2 *= -1089217269;
                        var2 ^= -819216452;
                        long var40 = var0;
                        long var6 = var40 + 1L;
                        var6 = var40 * var6;
                        long var8 = var40 + 2L;
                        var6 *= var8;
                        long var41 = var40 + 3L;
                        var6 *= var41;
                        long var42 = var6 & 7L;
                        long var57;
                        int var43 = (var57 = var42 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                        if (var43 == 0) {
                            return 1;
                        }
                    } else {
                        var2 &= -296030691;
                        var2 *= 1410777035;
                        var2 ^= 474340815;
                        long var44 = var0;
                        long var52 = var44 + 1L;
                        var52 = var44 * var52;
                        long var56 = var44 + 2L;
                        var52 *= var56;
                        long var45 = var44 + 3L;
                        var52 *= var45;
                        long var46 = var52 & 7L;
                        long var58;
                        int var47 = (var58 = var46 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                        if (var47 == 0) {
                            return 2;
                        }
                    }
                }
            }
        } else {
            int var26 = var1 + 533224051;
            var26 |= -876606254;
            var26 -= -1895406661;
            var26 -= -425138580;
            var26 ^= 640141059;
            var26 = var0 + 1;
            var26 = var0 * var26;
            var26 &= 1;
            if (var26 == 0) {
                UnsupportedOperationException var35 = new UnsupportedOperationException();
                throw var35;
            }
        }

        IllegalArgumentException var34 = new IllegalArgumentException();
        throw var34;
    }

    public void mouseMoved(double mouseX, double mouseY) {
        int var5 = AS;
        var5 ^= -233367092;
        int var6 = System.identityHashCode(this);
        long var22 = var6;
        long var8 = var22 + 1L;
        var8 = var22 * var8;
        long var10 = var22 + 2L;
        var8 *= var10;
        long var23 = var22 + 3L;
        var8 *= var23;
        long var24 = var8 & 7L;
        long var32;
        var6 = (var32 = var24 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var6 == 0) {
            Integer var26 = switch (var5) {
                case -1918348193 -> var5 ^ -1813995837;
                default -> var5 ^ 232413309;
                case 1290456552 -> {
                    var5 |= 550173257;
                    var5 <<= 16;
                    yield var5 ^ -514246107;
                }
            };
            if (var26 == null) {
                IllegalArgumentException var28 = new IllegalArgumentException();
                throw var28;
            } else {
                bS var27 = this.RX;
                var27.M(mouseX, mouseY);
            }
        } else {
            var5 += 386344587;
            var5 &= 1235117129;
            var5 ^= -1827625156;
            var5 *= 1911798185;
            var5 ^= -258802827;
            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        }
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        int var9 = AS;
        var9 ^= -597180694;
        int var10 = System.identityHashCode(this);
        bS var11 = this.RX;
        int var12 = var10 + 1;
        var12 = var10 * var12;
        int var13 = var10 + 2;
        var12 *= var13;
        var10 += 3;
        var12 *= var10;
        var10 = var12 & 7;
        if (var10 == 0) {
            var9 &= 892933092;
            var9 &= 2019162094;
            var9 ^= -8317647;
            Integer var28 = var9;
            if (var28 != null) {
                return var11.Lt(mouseX, mouseY, verticalAmount);
            }
        } else {
            long var21 = switch (var9) {
                default -> var9 ^ -1136369894;
                case 693786308 -> var9 ^ 2060299456;
                case 1654287054 -> {
                    var9 ^= 1771098133;
                    var9 &= 1285845666;
                    yield var9 ^ -1757505079;
                }
            };
            long var29 = var21 + 1L;
            long var30 = var21 * var29;
            long var22 = var30 & 1L;
            long var34;
            var9 = (var34 = var22 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var9 == 0) {
                IllegalArgumentException var25 = new IllegalArgumentException();
                throw var25;
            }
        }

        IllegalArgumentException var24 = new IllegalArgumentException();
        throw var24;
    }

    public boolean mouseClicked(Click click, boolean doubled) {
        int var3 = AS;
        var3 ^= -624368359;
        int var4 = System.identityHashCode(this);
        bS var5 = this.RX;
        double var6 = click.x();
        double var8 = click.y();
        int var10 = click.button();
        int var11 = var3 - 1089456339;
        var11 ^= -957889447;
        var10 = n(var10, var11);
        Integer var23 = var4;
        if (var23 != null) {
            var3 |= 1767536564;
            var3 |= -1675196318;
            var3 |= 372939887;
            var3 ^= 677890184;
            return var5.g(var6, var8, var10);
        } else {
            switch (var3) {
                case -2085909493:
                default:
                    var3 ^= 682725456;
                    break;
                case -1690510948:
                    var3 ^= 205836867;
                    break;
                case 1681207613:
                    var3 += -868327432;
                    var3 -= 1817613228;
                    var3 ^= -307357739;
            }

            UnsupportedOperationException var18 = new UnsupportedOperationException();
            throw var18;
        }
    }

    public boolean mouseReleased(Click click) {
        int var2 = AS;
        var2 ^= 1334027205;
        int var3 = System.identityHashCode(this);
        bS var4 = this.RX;
        Integer var17 = var3;
        if (var17 == null) {
            var2 >>>= 24;
            var2 -= -409857753;
            var2 *= -1275435031;
            var2 ^= -188009936;
            IllegalArgumentException var20 = new IllegalArgumentException();
            throw var20;
        } else {
            var2 &= -1687126442;
            var2 ^= 251761000;
            int var18 = var2 + 1;
            var18 = var2 * var18;
            var2 = var18 & 1;
            if (var2 != 0) {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            } else {
                double var11 = click.x();
                double var5 = click.y();
                return var4.vi(var11, var5);
            }
        }
    }

    public boolean mouseDragged(Click click, double offsetX, double offsetY) {
        int var6 = AS;
        var6 ^= -1535425249;
        int var7 = System.identityHashCode(this);
        bS var8 = this.RX;
        double var9 = click.x();
        Integer var23 = var7;
        if (var23 == null) {
            var23 = switch (var6) {
                case -714497467 -> var6 ^ 722696635;
                default -> var6 ^ -61568341;
                case 445026619 -> {
                    var6 &= 1136667812;
                    var6 += 690086545;
                    var6 -= -1959827098;
                    var6 |= 40545768;
                    yield var6 ^ -1109904673;
                }
            };
            if (var23 != null) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        } else {
            var6 >>>= 10;
            var6 -= 1665331196;
            var6 ^= -929946107;
            Integer var20 = var6;
            if (var20 != null) {
                double var22 = click.y();
                return var8.y(var9, var22);
            }
        }

        IllegalArgumentException var21 = new IllegalArgumentException();
        throw var21;
    }

    public boolean keyPressed(KeyInput input) {
        label61: {
            int var2 = AS;
            var2 ^= -1314299004;
            int var3 = System.identityHashCode(this);
            bS var4 = this.RX;
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var76;
            int var62 = (var76 = var5 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
            if (var62 == 0) {
                var2 = switch (var2) {
                    case 257210272 -> {
                        var2 ^= -699741982;
                        yield var2 ^ 723595630;
                    }
                    case 1454411977 -> var2 ^ -2034330273;
                    default -> var2 ^ 1220229025;
                };
                Integer var63 = var2;
                if (var63 == null) {
                    break label61;
                }

                int var64 = input.key();
                boolean var6 = input.hasCtrl();
                boolean var55 = var4.d(var64, var6);
                if (var55) {
                    var2 += -1050146709;
                    var2 ^= 115627296;
                    return true;
                }

                var2 *= -601433259;
                var2 &= -422527681;
                var2 ^= 1573109552;
                var2 ^= 675018926;
                int var56 = input.key();
                int var65 = var2 | -1692729612;
                int var66 = var65 ^ 325627233;
                boolean var57 = this.MJ(var56, var66);
                var5 = var3;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var77;
                var3 = (var77 = var5 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var2 = switch (var2) {
                        case 42261839 -> var2 ^ -406246942;
                        default -> var2 ^ 852265458;
                        case 1975050114 -> {
                            var2 += 495170283;
                            var2 -= -2088920642;
                            var2 += 757749704;
                            var2 -= -1715184343;
                            yield var2 ^ 419154874;
                        }
                    };
                    var5 = var2;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var78;
                    var3 = (var78 = var5 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        if (var57) {
                            var2 |= 1825646253;
                            var2 |= -17550796;
                            var2 ^= 156674335;
                            var2 |= 1863343525;
                            var2 ^= -488710526;
                            this.close();
                            return true;
                        }
                        var2 = switch (var2) {
                            case -1142998796 -> {
                                var2 &= 376278291;
                                var2 += -182550344;
                                var2 ^= -1711512827;
                                var2 |= 1249935566;
                                yield var2 ^ 1645546310;
                            }
                            case -956096528 -> var2 ^ -70907064;
                            default -> var2 ^ 1217043030;
                        };
                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        int var58 = var2 + 2;
                        var3 *= var58;
                        int var59 = var2 + 3;
                        var3 *= var59;
                        var3 &= 7;
                        if (var3 == 0) {
                            return super.keyPressed(input);
                        }
                    }
                    break label61;
                }

                var2 -= 845070702;
                var2 += -968010192;
                var2 ^= 2122818415;
            } else {
                var2 &= 646635119;
                var2 &= 477036607;
                var2 |= 199708888;
                var2 |= 1774244951;
                var2 ^= 415695828;
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var60 = var2 + 2;
            var3 *= var60;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalArgumentException var43 = new IllegalArgumentException();
                throw var43;
            }
        }

        RuntimeException var42 = new RuntimeException();
        throw var42;
    }

    public boolean charTyped(CharInput input) {
        int var2 = AS;
        var2 ^= 1245217800;
        int var3 = System.identityHashCode(this);
        long var24 = var3;
        long var5 = var24 + 1L;
        var5 = var24 * var5;
        long var7 = var24 + 2L;
        var5 *= var7;
        long var25 = var24 + 3L;
        var5 *= var25;
        long var26 = var5 & 7L;
        long var34;
        var3 = (var34 = var26 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        if (var3 == 0) {
            var2 += -837521851;
            var2 *= 626206533;
            var2 |= 1851780998;
            var2 |= 1151794473;
            var2 ^= 902176946;
            bS var28 = this.RX;
            int var30 = input.codepoint();
            return var28.iz(var30);
        } else {
            long var14 = switch (var2) {
                default -> var2 ^ 325543423;
                case -188395476 -> {
                    var2 |= 153610799;
                    var2 &= -308013719;
                    var2 ^= -1859332312;
                    yield var2 ^ -425087861;
                }
                case 1691939793 -> var2 ^ -1618749892;
            };
            long var4 = var14 + 1L;
            var4 = var14 * var4;
            long var15 = var4 & 1L;
            long var35;
            var2 = (var35 = var15 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            } else {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -499449226;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        AS = var4;
    }
}
