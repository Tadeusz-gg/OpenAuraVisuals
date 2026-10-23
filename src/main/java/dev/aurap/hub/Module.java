package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Module {
    private static final Logger o;
    private final String vJ;
    private final String Jg;
    private final ModuleCategory T;
    private String Gq = "";
    private boolean E;
    private boolean B;
    private boolean tq = true;
    private boolean g;
    private String Un;
    private boolean P = true;
    private boolean jV = true;
    private final List A;
    private final List V;
    private final List LQ;
    private boolean eC;
    private EventBus F;
    private Runnable e;
    public static final int C;

    protected Module(String var1, String var2, ModuleCategory var3) {
        ArrayList var4 = new ArrayList();
        this.A = var4;
        var4 = new ArrayList();
        this.V = var4;
        var4 = new ArrayList();
        this.LQ = var4;
        Runnable var8 = () -> {};
        this.e = var8;
        boolean var9 = var1.matches("[a-z0-9_]+");
        if (!var9) {
            String var5 = "Module id must be [a-z0-9_]+: " + var1;
            IllegalArgumentException var10 = new IllegalArgumentException(var5);
            throw var10;
        } else {
            this.vJ = var1;
            this.Jg = var2;
            this.T = var3;
        }
    }

    public final String getId() {
        int var1 = C;
        var1 ^= 818793751;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        of_2.y = -864320044;
        var3 = of_2.UR;
        var1 ^= var3;
        var1 ^= 175242712;
        of_2.UR = 175242712;
        if (var2 != 0) {
            var1 -= 800640569;
            var1 *= -519861415;
            var1 += -270116923;
            var1 ^= 1978804206;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                IllegalStateException var30 = new IllegalStateException();
                throw var30;
            }
        } else {
            var1 &= -1906476776;
            var1 ^= 20461943;
            var1 ^= 1045925993;
            long var19 = var1;
            long var36 = var19 + 1L;
            long var37 = var19 * var36;
            long var5 = var19 + 2L;
            long var38 = var37 * var5;
            long var20 = var19 + 3L;
            long var39 = var38 * var20;
            long var21 = var39 & 7L;
            long var40;
            var1 = (var40 = var21 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.vJ;
            }
        }

        RuntimeException var23 = new RuntimeException();
        throw var23;
    }

    public final String F() { return this.getId(); }

    public final String getName() {
        int var1 = C;
        var1 ^= 864825837;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var35;
        var2 = (var35 = var22 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 <<= 23;
            var1 ^= -1861390162;
            var1 &= -1324941127;
            var1 ^= 2020335560;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.Jg;
            }
        } else {
            var1 ^= 1131623942;
            var1 |= -1845281094;
            var1 ^= -1179605286;
            var1 ^= 1159883971;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    public final String UJ() { return this.getName(); }

    public final ModuleCategory getCategory() {
        int var1 = C;
        var1 ^= 1619217452;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= -1322089213;
            var1 ^= 1298956736;
            long var17 = var1;
            long var23 = var17 + 1L;
            long var24 = var17 * var23;
            long var18 = var24 & 1L;
            long var25;
            var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.T;
            }
        } else {
            var1 <<= 6;
            var1 >>= 18;
            var1 ^= 964106730;
            Integer var12 = var1;
            if (var12 != null) {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            }
        }

        UnsupportedOperationException var13 = new UnsupportedOperationException();
        throw var13;
    }

    public final ModuleCategory bZ() { return this.getCategory(); }

    public final String getDescription() {
        int var1 = C;
        var1 ^= -155603381;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var30;
        var2 = (var30 = var21 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= 710785519;
            var1 &= -1317522375;
            var1 *= 895111829;
            var1 ^= -132694098;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.Gq;
            } else {
                UnsupportedOperationException var26 = new UnsupportedOperationException();
                throw var26;
            }
        } else {
            var1 *= 1140131291;
            var1 -= -532748524;
            var1 >>= 3;
            var1 ^= 607857742;
            var1 ^= -63462285;
            RuntimeException var14 = new RuntimeException();
            throw var14;
        }
    }

    public final String Rm() { return this.getDescription(); }

    public final List<Setting<?>> getSettings() {
        int var1 = C;
        var1 ^= -774387102;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 >>= 29;
            var1 -= -676143194;
            var1 += 771927696;
            var1 ^= 302331898;
            var18 = var1;
            if (var18 != null) {
                List var20 = this.A;
                return Collections.unmodifiableList(var20);
            }
        } else {
            var1 |= 844492462;
            var1 ^= -499060298;
            var1 ^= 1126413064;
            long var13 = var1;
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var14 = var3 & 1L;
            long var22;
            var1 = (var22 = var14 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalStateException var17 = new IllegalStateException();
                throw var17;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public final List GS() { return this.getSettings(); }

    public final boolean B() {
        int var1 = C;
        var1 ^= 1061556096;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        var3 = of_2.UR;
        var1 ^= var3;
        var1 ^= 175242712;
        if (var2 == 0) {
            switch (var1) {
                case -1814486769:
                    var1 ^= 1946006578;
                    break;
                case -735867699:
                default:
                    var1 ^= -911256386;
                    break;
                case -638570213:
                    var1 += 1444376003;
                    var1 ^= -1002820427;
            }

            return this.B;
        } else {
            switch (var1) {
                case -638570213:
                    var1 &= 663233811;
                    var1 ^= 876108540;
                    break;
                case 192447433:
                    var1 ^= -726802265;
                    break;
                case 796567382:
                default:
                    var1 ^= 817758304;
            }

            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    public final boolean Sz() {
        int var1 = C;
        var1 ^= 910714967;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var31;
        var2 = (var31 = var19 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += -1875304037;
            var1 ^= 373961851;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.P;
            } else {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var1 -= -550908176;
            var1 -= -160581340;
            var1 &= 939244010;
            var1 |= -1065670199;
            var1 ^= -2141932505;
            RuntimeException var14 = new RuntimeException();
            throw var14;
        }
    }

    public final boolean IU() {
        boolean var46 = false;
        label54: {
            int var1 = C;
            var1 ^= -655851670;
            int var2 = System.identityHashCode(this);
            Integer var3 = var2;
            if (var3 == null) {
                var1 *= -531070207;
                var1 |= -217931539;
                var1 += 1421591421;
                var1 ^= 2108347442;
            } else {
                label53: {
                    label46: {
                        var1 -= -1623250801;
                        var1 *= 971019319;
                        var1 -= -1208449751;
                        var1 ^= 638629022;
                        boolean var48 = this.B;
                        if (var48) {
                            var1 ^= -404810473;
                            var1 ^= -1702864775;
                            int var49 = var1 + 1;
                            var49 = var1 * var49;
                            int var4 = var1 + 2;
                            var49 *= var4;
                            var4 = var1 + 3;
                            var49 *= var4;
                            var49 &= 7;
                            if (var49 != 0) {
                                break label54;
                            }

                            boolean var54 = this.P;
                            long var60 = var2;
                            long var6 = var60 + 1L;
                            var6 = var60 * var6;
                            long var61 = var6 & 1L;
                            long var64;
                            var2 = (var64 = var61 - 0L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 ^= -1136061817;
                                var1 >>= 3;
                                var1 += 772709932;
                                var1 ^= 279675286;
                                break label53;
                            }

                            var1 -= -1913464673;
                            var1 &= -1215679220;
                            var1 &= -1206114709;
                            var1 ^= 1795844051;
                            if (var54) {
                                var1 -= -1468553333;
                                var1 *= 346887801;
                                var1 >>>= 6;
                                var1 ^= -1993923702;
                                var2 = var1 + 1;
                                var2 = var1 * var2;
                                var2 &= 1;
                                if (var2 != 0) {
                                    break label54;
                                }

                                var46 = true;
                                var1 -= 1346362005;
                                var1 ^= -911705186;
                                break label46;
                            }

                            var1 -= -1326294865;
                            var1 -= 907696479;
                            var1 |= 441658726;
                            var1 ^= -623408568;
                        } else {
                            var1 |= 1737190829;
                            var1 ^= -1097115568;
                        }

                        var46 = false;
                        var1 ^= 801099530;
                        var1 ^= 518074278;
                    }

                    int var55 = var1 + 1;
                    var55 = var1 * var55;
                    int var62 = var1 + 2;
                    var55 *= var62;
                    var1 += 3;
                    var55 *= var1;
                    var1 = var55 & 7;
                    if (var1 == 0) {
                        return var46;
                    }
                    break label54;
                }
            }

            AssertionError var47 = new AssertionError();
            throw var47;
        }

        AssertionError var37 = new AssertionError();
        throw var37;
    }

    public final String H() {
        int var1 = C;
        var1 ^= -547301958;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 ^= 1908302291;
            var1 *= 765161643;
            var1 += 304502126;
            var1 -= -1439849789;
            var1 ^= -854516055;
            Integer var18 = var1;
            if (var18 == null) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                return this.Un;
            }
        } else {
            var1 ^= -1093254909;
            var1 ^= 1491778753;
            var1 *= 437725173;
            var1 ^= -707341330;
            AssertionError var10 = new AssertionError();
            throw var10;
        }
    }

    public final boolean Bv() {
        int var1 = C;
        var1 ^= 1989579934;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 = switch (var1) {
                case -1876907515 -> {
                    var1 |= 1101823277;
                    var1 *= -531128809;
                    var1 &= 44714844;
                    var1 -= 255630046;
                    yield var1 ^ -1779772169;
                }
                case -629294031 -> var1 ^ -1758826763;
                default -> var1 ^ 1208437408;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            } else {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            }
        } else {
            var1 <<= 3;
            var1 -= 977244616;
            var1 ^= -861404623;
            var1 <<= 21;
            var1 ^= 204891229;
            return this.E;
        }
    }

    public final boolean jp() {
        int var1 = C;
        var1 ^= -1203669494;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 -= 1273966087;
            var1 |= -413450625;
            var1 &= -410601791;
            var1 ^= -487627972;
            return this.tq;
        } else {
            switch (var1) {
                case -242555131:
                default:
                    var1 ^= -1940327613;
                    break;
                case 29388746:
                    var1 ^= -514708577;
                    break;
                case 1593264273:
                    var1 ^= -679746391;
                    var1 ^= -564343077;
            }

            IllegalArgumentException var8 = new IllegalArgumentException();
            throw var8;
        }
    }

    public final boolean y() {
        int var1 = C;
        var1 ^= 2065391024;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 != null) {
            var1 *= 823697843;
            var1 >>>= 3;
            var1 ^= -1077148501;
            long var16 = var1;
            long var4 = var16 + 1L;
            var4 = var16 * var4;
            long var17 = var4 & 1L;
            long var21;
            int var18 = (var21 = var17 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var18 == 0) {
                return this.g;
            } else {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        } else {
            var1 += -1822125640;
            var1 ^= -2040085308;
            var1 -= -1683616802;
            var1 ^= 261556036;
            UnsupportedOperationException var11 = new UnsupportedOperationException();
            throw var11;
        }
    }

    public final void bq() {
        int var1 = C;
        var1 ^= 458313124;
        int var2 = System.identityHashCode(this);
        boolean var3 = this.B;
        Integer var35 = var2;
        if (var35 == null) {
            var1 >>= 21;
            var1 ^= 1377226573;
            var35 = var1;
            if (var35 != null) {
                IllegalStateException var42 = new IllegalStateException();
                throw var42;
            }
        } else {
            var1 <<= 29;
            var1 += -1796574358;
            var1 ^= 989303049;
            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var51;
            int var36 = (var51 = var4 - 0L) == 0L ? 0 : (var51 < 0L ? -1 : 1);
            label33:
            if (var36 == 0) {
                int var40;
                if (!var3) {
                    var1 >>>= 4;
                    var1 >>= 13;
                    var1 ^= 1874322169;
                    var1 *= -1400216445;
                    var1 ^= -1582596317;
                    long var37 = var1;
                    var4 = var37 + 1L;
                    var4 = var37 * var4;
                    long var38 = var4 & 1L;
                    long var52;
                    var40 = (var52 = var38 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var40 != 0) {
                        break label33;
                    }

                    var40 = 1;
                    var1 |= 1695135759;
                    var1 -= 575741529;
                    var1 >>>= 7;
                    var1 *= -376955353;
                    var1 ^= -1211172017;
                } else {
                    var1 *= -1688042139;
                    var1 *= -2147322955;
                    var1 ^= -1418068827;
                    var1 ^= -829760271;
                    Integer var43 = var1;
                    if (var43 == null) {
                        break label33;
                    }

                    var40 = 0;
                    var1 &= 1554437185;
                    var1 |= 1637920445;
                    var1 |= -441133402;
                    var1 ^= -2104937687;
                }

                this.xt((var40 != 0));
                return;
            }
        }

        RuntimeException var34 = new RuntimeException();
        throw var34;
    }

    public final void xt(boolean var1) {
        label98: {
            int var2 = C;
            var2 ^= -1451298046;
            int var3 = System.identityHashCode(this);
            int var4 = (this.tq ? 1 : 0);
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var107;
            int var76 = (var107 = var5 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
            if (var76 != 0) {
                var2 -= 712303195;
                var2 -= 18328793;
                var2 += -778154552;
                var2 |= 971229793;
                var2 ^= -934011998;
            } else {
                label100: {
                    var2 -= 1672123896;
                    var2 &= -1895363406;
                    var2 += 1596985980;
                    var2 ^= -1292068278;
                    var5 = var2;
                    var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var108;
                    int var79 = (var108 = var5 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                    if (var79 != 0) {
                        break label98;
                    }

                    if (var4 == 0) {
                        var2 *= 1876044415;
                        var2 ^= -569601440;
                        long var67 = var2;
                        long var6 = var67 + 1L;
                        var6 = var67 * var6;
                        long var68 = var6 & 1L;
                        long var109;
                        var4 = (var109 = var68 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label98;
                        }

                        boolean var70 = true;
                        int var80 = var3 + 1;
                        int var81 = var3 * var80;
                        int var82 = var81 & 1;
                        if (var82 != 0) {
                            switch (var2) {
                                case -1613892670:
                                    var2 ^= -1084348794;
                                    break label100;
                                case -550196278:
                                    var2 &= 636738770;
                                    var2 ^= 815750413;
                                    break label100;
                                case 1716955013:
                                default:
                                    var2 ^= 1575450854;
                                    break label100;
                            }
                        }

                        var2 &= 399516354;
                        var2 &= -259382085;
                        var2 ^= 1733063722;
                        int var83 = var2 + 1;
                        int var84 = var2 * var83;
                        int var85 = var84 & 1;
                        if (var85 != 0) {
                            break label98;
                        }

                        var4 = var70 ? 1 : 0;
                        switch (var2) {
                            case -460710146:
                                var2 ^= -1370861968;
                                break;
                            case 1141256091:
                            default:
                                var2 ^= 563105847;
                                break;
                            case 2001491112:
                                var2 -= -2125599387;
                                var2 += 1439045465;
                                var2 ^= 1509538349;
                        }
                    } else {
                        var2 -= -823092151;
                        var2 -= -1050300068;
                        var2 >>= 16;
                        var2 |= 118137969;
                        var2 ^= -694861685;
                        var4 = var1 ? 1 : 0;
                        var2 &= -719284858;
                        var2 &= 2107673006;
                        var2 ^= 320685367;
                    }

                    int var86 = var2 + 1;
                    int var87 = var2 * var86;
                    int var88 = var87 & 1;
                    if (var88 != 0) {
                        break label98;
                    }

                    boolean var89 = this.B;
                    int var99 = var3 + 1;
                    var99 = var3 * var99;
                    var99 &= 1;
                    if (var99 == 0) {
                        var2 ^= -1851650662;
                        var2 |= 953054107;
                        var2 &= -803664481;
                        var2 *= 926919323;
                        var2 ^= 1355781839;
                        if ((var4 != 0) == var89) {
                            Integer var97 = switch (var2) {
                                case -647944170 -> {
                                    var2 |= 1593849598;
                                    var2 ^= -439022117;
                                    var2 >>>= 18;
                                    var2 ^= -1982175863;
                                    yield var2 ^ 1250407231;
                                }
                                case -479759504 -> var2 ^ 522057712;
                                default -> var2 ^ -91241111;
                            };
                            if (var97 != null) {
                                return;
                            }
                            break label98;
                        }
                        var2 = switch (var2) {
                            case -647944170 -> {
                                var2 |= 1581344083;
                                var2 &= 969995450;
                                var2 *= -8737577;
                                yield var2 ^ 601155467;
                            }
                            case 1748202596 -> var2 ^ -877052037;
                            default -> var2 ^ -1073315679;
                        };
                        int var90 = var2 + 1;
                        int var91 = var2 * var90;
                        var99 = var2 + 2;
                        int var92 = var91 * var99;
                        var99 = var2 + 3;
                        int var93 = var92 * var99;
                        int var94 = var93 & 7;
                        if (var94 != 0) {
                            break label98;
                        }

                        this.B = (var4 != 0);
                        var4 = var2 << 3;
                        var4 ^= 435960885;
                        this.w(var4);
                        Runnable var74 = this.e;
                        int var95 = var3 + 1;
                        int var96 = var3 * var95;
                        var3 = var96 & 1;
                        if (var3 == 0) {
                            var2 &= -1844955669;
                            var2 -= 143775184;
                            var2 >>>= 28;
                            var2 |= -1714878632;
                            var2 ^= 2041818748;
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var3 &= 1;
                            if (var3 == 0) {
                                var74.run();
                                return;
                            }
                            break label98;
                        }

                        var2 |= -1546394139;
                        var2 *= 1145904559;
                        var2 |= 1958229608;
                        var2 ^= -900717900;
                    } else {
                        switch (var2) {
                            case -1783745316:
                            default:
                                var2 ^= -949569780;
                                break;
                            case -197304871:
                                var2 ^= -1385812439;
                                break;
                            case 306037937:
                                var2 -= -157704345;
                                var2 ^= 772534405;
                        }
                    }
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                RuntimeException var59 = new RuntimeException();
                throw var59;
            }
        }

        AssertionError var60 = new AssertionError();
        throw var60;
    }

    public final void vY(boolean var1) {
        int var2 = C;
        var2 ^= 1011856602;
        int var3 = System.identityHashCode(this);
        int var4 = (this.P ? 1 : 0);
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        label36:
        if (var5 == 0) {
            var2 *= -1045322715;
            var2 ^= -1541998655;
            if (var1 == (var4 != 0)) {
                var2 |= -218224789;
                var2 ^= -302415623;
                var2 ^= -428738535;
                return;
            }
            var2 = switch (var2) {
                case -1727068719 -> var2 ^ 731373902;
                case -1098553180 -> {
                    var2 ^= -2100768184;
                    var2 += -199460590;
                    var2 |= -759355326;
                    var2 -= -1515181998;
                    yield var2 ^ -835867216;
                }
                default -> var2 ^ -1697609246;
            };
            long var40 = var2;
            long var6 = var40 + 1L;
            var6 = var40 * var6;
            long var41 = var6 & 1L;
            long var48;
            var4 = (var48 = var41 - 0L) == 0L ? 0 : (var48 < 0L ? -1 : 1);
            if (var4 == 0) {
                this.P = var1;
                Integer var30 = var3;
                if (var30 == null) {
                    var2 ^= -1148509104;
                    var2 |= -1624415976;
                    var2 *= 609267775;
                    var2 += 952797101;
                    var2 ^= -1949037436;
                    break label36;
                }

                var2 += -1333892888;
                var2 ^= 1776267071;
                long var31 = var2;
                long var45 = var31 + 1L;
                long var46 = var31 * var45;
                long var32 = var46 & 1L;
                long var49;
                int var33 = (var49 = var32 - 0L) == 0L ? 0 : (var49 < 0L ? -1 : 1);
                if (var33 == 0) {
                    var33 = var2 + -622751044;
                    var33 -= 758127725;
                    var33 += -1933945684;
                    var33 += -1537024786;
                    var33 ^= -1988679495;
                    this.w(var33);
                    return;
                }
            }

            IllegalStateException var34 = new IllegalStateException();
            throw var34;
        } else {
            var2 += -1991700999;
            var2 |= 394814544;
            var2 ^= 1911837615;
        }

        RuntimeException var26 = new RuntimeException();
        throw var26;
    }

    protected final void dy(String var1) {
        int var2 = C;
        var2 ^= 1248819073;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            var2 *= -167640945;
            var2 *= -1930698759;
            var2 -= 1846729062;
            var2 ^= 142125079;
            IllegalArgumentException var18 = new IllegalArgumentException();
            throw var18;
        } else {
            var2 *= 306015869;
            var2 &= -1491102199;
            var2 ^= -1525056724;
            Integer var10 = var2;
            if (var10 == null) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                this.Gq = var1;
            }
        }
    }

    protected final void fJ(boolean var1) {
        int var2 = C;
        var2 ^= 293419484;
        int var3 = System.identityHashCode(this);
        this.E = var1;
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            var2 = switch (var2) {
                case -137689273 -> {
                    var2 += -1125413523;
                    yield var2 ^ 1376437118;
                }
                default -> var2 ^ -514869536;
                case 125349757 -> var2 ^ 768821760;
            };
            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 != 0) {
                RuntimeException var21 = new RuntimeException();
                throw var21;
            } else {
                this.B = var1;
            }
        } else {
            var2 -= 821147035;
            var2 &= 1312034319;
            var2 <<= 20;
            var2 ^= 1787083952;
            UnsupportedOperationException var11 = new UnsupportedOperationException();
            throw var11;
        }
    }

    protected final void ao() {
        int var1 = C;
        var1 ^= -914763508;
        int var2 = System.identityHashCode(this);
        this.fJ(true);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var6 = var15 + 2L;
        var4 *= var6;
        long var16 = var15 + 3L;
        var4 *= var16;
        long var17 = var4 & 7L;
        long var23;
        var2 = (var23 = var17 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 ^= 105378698;
            var1 -= -767669687;
            var1 ^= 1990827786;
            AssertionError var19 = new AssertionError();
            throw var19;
        } else {
            var1 *= 79088265;
            var1 *= 763414797;
            var1 ^= -1919354745;
            this.tq = false;
        }
    }

    protected final void pQ() {
        int var1 = C;
        var1 ^= -927967275;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 -= -987408323;
            var1 |= 1586459193;
            var1 ^= 906000238;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            int var3 = var1 + 2;
            var20 *= var3;
            var3 = var1 + 3;
            var20 *= var3;
            var20 &= 7;
            if (var20 == 0) {
                this.jV = false;
                return;
            }
        } else {
            long var13 = switch (var1) {
                default -> var1 ^ 1427145340;
                case 772172110 -> {
                    var1 ^= -309039449;
                    yield var1 ^ 1074706631;
                }
                case 2022048219 -> var1 ^ -1800088809;
            };
            long var26 = var13 + 1L;
            var26 = var13 * var26;
            long var5 = var13 + 2L;
            var26 *= var5;
            long var14 = var13 + 3L;
            var26 *= var14;
            long var15 = var26 & 7L;
            long var30;
            var1 = (var30 = var15 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public final boolean nS() {
        int var1 = C;
        var1 ^= -350160895;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= 1391547309;
            var1 += 1532522301;
            var1 *= -1139623385;
            var1 ^= 717135550;
            Integer var17 = var1;
            if (var17 != null) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        } else {
            var1 <<= 11;
            var1 ^= 586310682;
            var1 *= -117073919;
            var1 += 247354939;
            var1 ^= -1458232059;
            return this.jV;
        }
    }

    protected final void He(boolean var1) {
        int var2 = C;
        var2 ^= 777053365;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            var2 ^= 1913569311;
            var2 >>= 22;
            var2 ^= -1505312127;
            var2 *= 1653938329;
            var2 ^= 491394389;
            this.g = var1;
        } else {
            switch (var2) {
                case -1952905112:
                default:
                    var2 ^= 1874115459;
                    break;
                case -924394962:
                    var2 |= -817375174;
                    var2 *= -1262403721;
                    var2 ^= -1336578455;
                    break;
                case 513471328:
                    var2 ^= 1103088042;
            }

            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        }
    }

    public final void setKeybind(String var1) {
        int var2 = C;
        var2 ^= 198727481;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            var2 += -2012195464;
            var2 -= 2067984637;
            var2 ^= -619413258;
            var2 ^= -1871309918;
            var2 ^= -281955574;
            this.Un = var1;
        } else {
            var2 &= 1937334153;
            var2 |= 638898478;
            var2 ^= 1319784954;
            var2 ^= 814145164;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            } else {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            }
        }
    }

    public final void Ze(String value) { this.setKeybind(value); }

    protected final <T extends Setting<?>> T addSetting(T var1) {
        label103: {
            int var2 = C;
            var2 ^= -999327865;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var2 &= -1777793702;
                var2 -= -2060567988;
                var2 += -1797260299;
                var2 ^= -91341731;
            } else {
                var2 = switch (var2) {
                    default -> var2 ^ -514984864;
                    case 242761663 -> var2 ^ 839049607;
                    case 584665372 -> {
                        var2 >>= 11;
                        var2 -= 837911589;
                        yield var2 ^ 1815794792;
                    }
                };
                List var72 = this.A;
                Iterator var73 = var72.iterator();
                Iterator var74 = var73;
                var2 &= -112977023;
                var2 ^= -221107993;

                label100:
                while (true) {
                    Integer var78 = var2;
                    if (var78 == null) {
                        break label103;
                    }

                    boolean var79 = var74.hasNext();
                    long var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var121;
                    int var103 = (var121 = var6 - 0L) == 0L ? 0 : (var121 < 0L ? -1 : 1);
                    if (var103 != 0) {
                        var2 &= -332434432;
                        var2 += -251856898;
                        var2 ^= -607393438;
                        break;
                    }

                    var2 -= -612036949;
                    var2 ^= 1497461596;
                    var2 >>= 7;
                    var2 <<= 16;
                    var2 ^= -1955786350;
                    if (!var79) {
                        var2 *= 626050605;
                        var2 -= -115296859;
                        var2 ^= -1783653175;
                        List var75 = this.A;
                        boolean var76 = var75.add(var1);
                        long var58 = var3;
                        long var96 = var58 + 1L;
                        long var97 = var58 * var96;
                        long var116 = var58 + 2L;
                        long var98 = var97 * var116;
                        long var59 = var58 + 3L;
                        long var99 = var98 * var59;
                        long var60 = var99 & 7L;
                        long var122;
                        var3 = (var122 = var60 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var2 = switch (var2) {
                                default -> var2 ^ -128207260;
                                case 496619980 -> {
                                    var2 |= -318040163;
                                    yield var2 ^ 1402120146;
                                }
                                case 1332617196 -> var2 ^ 2023047647;
                            };
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            var2 = var3 & 1;
                            if (var2 == 0) {
                                Runnable var54 = () -> {
                                    int var1x = C;
                                    var1x ^= 615409897;
                                    int var2x = System.identityHashCode(this);
                                    int var3x = var2x + 1;
                                    var3x = var2x * var3x;
                                    var2x = var3x & 1;
                                    if (var2x != 0) {
                                        var1x = switch (var1x) {
                                            case -1208159429 -> var1x ^ -521086755;
                                            case -1038592398 -> {
                                                var1x |= -956591516;
                                                var1x &= -1208205964;
                                                yield var1x ^ 148998426;
                                            }
                                            default -> var1x ^ -299375267;
                                        };
                                        var2x = var1x + 1;
                                        var2x = var1x * var2x;
                                        var3x = var1x + 2;
                                        var2x *= var3x;
                                        var3x = var1x + 3;
                                        var2x *= var3x;
                                        var2x &= 7;
                                        if (var2x == 0) {
                                            AssertionError var22x = new AssertionError();
                                            throw var22x;
                                        }
                                    } else {
                                        var1x += -101320452;
                                        var1x |= -753086433;
                                        var1x >>>= 4;
                                        var1x |= 770820851;
                                        var1x ^= -545720124;
                                        Integer var13x = var1x;
                                        if (var13x != null) {
                                            Runnable var15x = this.e;
                                            var15x.run();
                                            return;
                                        }
                                    }

                                    IllegalArgumentException var14x = new IllegalArgumentException();
                                    throw var14x;
                                };
                                var1.k(var54);
                                return var1;
                            }
                            break label103;
                        }

                        var2 += -1662865953;
                        var2 += 1993601380;
                        var2 &= 975268975;
                        var2 -= -175546731;
                        var2 ^= -784072730;
                        break;
                    }
                    var2 = switch (var2) {
                        case -1817112174 -> {
                            var2 ^= 1360938842;
                            yield var2 ^ -1835539213;
                        }
                        default -> var2 ^ 386441704;
                        case -1263810584 -> var2 ^ 788045960;
                    };
                    int var80 = var2 + 1;
                    var80 = var2 * var80;
                    var80 &= 1;
                    if (var80 != 0) {
                        break label103;
                    }

                    Object var83 = var74.next();
                    Setting var84 = (Setting)var83;
                    String var85 = var84.oQ();
                    String var104 = var1.oQ();
                    long var7 = var3;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var123;
                    int var111 = (var123 = var7 - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                    if (var111 != 0) {
                        switch (var2) {
                            case -317629841:
                                var2 ^= -57174623;
                                break label100;
                            case 415958384:
                            default:
                                var2 ^= -1437231356;
                                break label100;
                            case 1345892923:
                                var2 &= -187383403;
                                var2 &= 2137498446;
                                var2 ^= -1154187620;
                                break label100;
                        }
                    }

                    var2 *= 775855805;
                    var2 &= -1638360664;
                    var2 |= 784568358;
                    var2 *= 153841751;
                    var2 ^= -1710744906;
                    Integer var112 = var2;
                    if (var112 == null) {
                        break label103;
                    }

                    int var86 = (var85.equals(var104)) ? 1 : 0;
                    if (var86 != 0) {
                        long var92 = switch (var2) {
                            default -> var2 ^ -771709383;
                            case -806928236 -> {
                                var2 += -815722124;
                                var2 -= -13584627;
                                yield var2 ^ 1728887411;
                            }
                            case -454831049 -> var2 ^ 1473518316;
                        };
                        var7 = var92 + 1L;
                        var7 = var92 * var7;
                        long var93 = var7 & 1L;
                        long var124;
                        var86 = (var124 = var93 - 0L) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                        if (var86 == 0) {
                            String var107 = var1.oQ();
                            String var115 = this.vJ;
                            String var108 = "Duplicate setting " + var107 + " in " + var115;
                            IllegalArgumentException var95 = new IllegalArgumentException(var108);
                            throw var95;
                        }
                        break label103;
                    }
                    var2 = switch (var2) {
                        default -> var2 ^ 1877778645;
                        case -806928236 -> {
                            var2 &= -1584474788;
                            var2 &= -560776803;
                            yield var2 ^ -505682079;
                        }
                        case 75943852 -> var2 ^ -500445159;
                    };
                    var86 = var2 + 1;
                    var86 = var2 * var86;
                    int var105 = var2 + 2;
                    var86 *= var105;
                    int var106 = var2 + 3;
                    var86 *= var106;
                    var86 &= 7;
                    if (var86 != 0) {
                        break label103;
                    }

                    var2 &= 1322841331;
                    var2 ^= 311086998;
                }
            }

            long var64 = var2;
            long var100 = var64 + 1L;
            long var101 = var64 * var100;
            long var65 = var101 & 1L;
            long var125;
            var3 = (var125 = var65 - 0L) == 0L ? 0 : (var125 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var67 = new IllegalArgumentException();
                throw var67;
            }
        }

        IllegalArgumentException var57 = new IllegalArgumentException();
        throw var57;
    }

    protected final Setting vn(Setting setting) { return this.addSetting(setting); }

    protected final nM bU(nM var1) {
        label63: {
            int var2 = C;
            var2 ^= 1935120790;
            int var3 = System.identityHashCode(this);
            List var4 = var1.o();
            Iterator var50 = var4.iterator();
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            if (var5 == 0) {
                var2 -= 566970766;
                var2 ^= 2032840961;
                var5 = var2 + 1;
                var5 = var2 * var5;
                int var6 = var2 + 2;
                var5 *= var6;
                var6 = var2 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label63;
                }

                Iterator var51 = var50;
                var2 &= -69783813;
                var2 <<= 23;
                var2 &= 1166883323;
                var2 ^= 2026536228;

                label60:
                while (true) {
                    var5 = var2 + 1;
                    var5 = var2 * var5;
                    var5 &= 1;
                    if (var5 != 0) {
                        break label63;
                    }

                    int var64 = (var51.hasNext()) ? 1 : 0;
                    Integer var73 = var3;
                    if (var73 == null) {
                        var2 -= -697871143;
                        var2 *= -1963888447;
                        var2 -= -2140821762;
                        var2 *= 320409375;
                        var2 ^= 1414670721;
                        break;
                    }

                    var2 &= -61076177;
                    var2 ^= -674272787;
                    int var74 = var2 + 1;
                    var74 = var2 * var74;
                    var74 &= 1;
                    if (var74 != 0) {
                        break label63;
                    }

                    if (var64 == 0) {
                        var2 *= 304422177;
                        var2 ^= 1428874277;
                        return var1;
                    }

                    var2 -= 614577573;
                    var2 |= 1703271180;
                    var2 &= 687755521;
                    var2 ^= 1227525052;
                    long var65 = var2;
                    long var7 = var65 + 1L;
                    var7 = var65 * var7;
                    long var9 = var65 + 2L;
                    var7 *= var9;
                    long var66 = var65 + 3L;
                    var7 *= var66;
                    long var67 = var7 & 7L;
                    long var90;
                    var64 = (var90 = var67 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                    if (var64 != 0) {
                        break label63;
                    }

                    Object var69 = var51.next();
                    Setting var70 = (Setting)var69;
                    long var77 = var3;
                    long var8 = var77 + 1L;
                    var8 = var77 * var8;
                    long var10 = var77 + 2L;
                    var8 *= var10;
                    long var78 = var77 + 3L;
                    var8 *= var78;
                    long var79 = var8 & 7L;
                    long var91;
                    var74 = (var91 = var79 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        switch (var2) {
                            case -452092153:
                            default:
                                var2 ^= 1520527357;
                                break label60;
                            case 1775164092:
                                var2 -= -1240299913;
                                var2 ^= -1379690793;
                                break label60;
                            case 2065286992:
                                var2 ^= -1538449034;
                                break label60;
                        }
                    }

                    var2 ^= 1405322476;
                    var2 *= 229819983;
                    var2 ^= -1635589086;
                    var2 ^= -10026087;
                    var74 = var2 + 1;
                    var74 = var2 * var74;
                    var74 &= 1;
                    if (var74 != 0) {
                        break label63;
                    }

                    Setting var71 = this.vn(var70);
                    var2 *= -1654289965;
                    var2 &= -829003528;
                    var2 *= 1782746841;
                    var2 &= 159310369;
                    var2 ^= 1972919588;
                }
            } else {
                var2 |= 547387001;
                var2 |= -722019886;
                var2 >>>= 27;
                var2 &= -1480151553;
                var2 ^= 511689356;
            }

            long var45 = var2;
            long var52 = var45 + 1L;
            long var53 = var45 * var52;
            long var46 = var53 & 1L;
            long var92;
            var2 = (var92 = var46 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var49 = new IllegalArgumentException();
                throw var49;
            }
        }

        RuntimeException var48 = new RuntimeException();
        throw var48;
    }

    protected final <E> void onEvent(Class<E> var1, EventListener<E> var2) {
        int var3 = C;
        var3 ^= -1490760066;
        int var4 = System.identityHashCode(this);
        Integer var13 = var4;
        if (var13 == null) {
            var3 -= 1276668420;
            var3 -= 1840435839;
            var3 += 176197705;
            var3 ^= -1889253893;
            AssertionError var14 = new AssertionError();
            throw var14;
        } else {
            var3 ^= -260535738;
            var3 |= 360194253;
            var3 ^= 1442642160;
            this.onEventAtPriority(var1, 0, var2);
        }
    }

    protected final <E> void onEventAtPriority(Class<E> var1, int var2, EventListener<E> var3) {
        int var4 = C;
        var4 ^= 1212076778;
        int var6 = System.identityHashCode(this);
        long var26 = var6;
        long var8 = var26 + 1L;
        var8 = var26 * var8;
        long var27 = var8 & 1L;
        long var37;
        var6 = (var37 = var27 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var6 != 0) {
            var4 |= 702789243;
            var4 -= -1321787043;
            var4 += -1553669624;
            var4 ^= 2112970836;
            Integer var29 = var2;
            if (var29 != null) {
                IllegalArgumentException var30 = new IllegalArgumentException();
                throw var30;
            }
        } else {
            var4 ^= -21557333;
            var4 += -159976020;
            var4 <<= 6;
            var4 ^= -1607643083;
            long var19 = var2;
            long var31 = var19 + 1L;
            long var32 = var19 * var31;
            var8 = var19 + 2L;
            long var33 = var32 * var8;
            long var20 = var19 + 3L;
            long var34 = var33 * var20;
            long var21 = var34 & 7L;
            long var38;
            var4 = (var38 = var21 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var4 == 0) {
                List var24 = this.V;
                oK var5 = new oK(var1, var2, var3);
                boolean var25 = var24.add(var5);
                return;
            }
        }

        IllegalArgumentException var23 = new IllegalArgumentException();
        throw var23;
    }

    protected void eF() {
        int var1 = System.identityHashCode(this);
    }

    protected void J() {
        int var1 = System.identityHashCode(this);
    }

    public final void Xc(EventBus var1, Runnable var2) {
        label51: {
            int var3 = C;
            var3 ^= 975208115;
            int var4 = System.identityHashCode(this);
            EventBus var5 = this.F;
            Integer var6 = var4;
            if (var6 == null) {
                switch (var3) {
                    case -1906751164:
                        var3 ^= 1337137081;
                        break;
                    case -594132952:
                        var3 |= 1030359552;
                        var3 &= 1769583654;
                        var3 &= -1731585064;
                        var3 *= -384587117;
                        var3 ^= -1490988133;
                        break;
                    case 1435464593:
                    default:
                        var3 ^= -1801731219;
                }
            } else {
                var3 |= 177156811;
                var3 |= 1816530857;
                var3 &= -1896460829;
                var3 ^= 343668876;
                var3 ^= 1537103154;
                int var49 = var3 + 1;
                var49 = var3 * var49;
                int var7 = var3 + 2;
                var49 *= var7;
                var7 = var3 + 3;
                var49 *= var7;
                var49 &= 7;
                if (var49 != 0) {
                    break label51;
                }

                if (var5 != null) {
                    var3 += -1807127798;
                    var3 &= 1251703619;
                    var3 *= -775641495;
                    var3 |= -1056743010;
                    var3 ^= 325877132;
                    Integer var47 = var3;
                    if (var47 != null) {
                        String var54 = this.vJ;
                        String var55 = "Module " + var54 + " registered twice";
                        IllegalStateException var48 = new IllegalStateException(var55);
                        throw var48;
                    }
                    break label51;
                }

                var3 &= -980235235;
                var3 ^= -1959784975;
                long var44 = var3;
                long var57 = var44 + 1L;
                long var58 = var44 * var57;
                long var45 = var58 & 1L;
                long var59;
                int var46 = (var59 = var45 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                if (var46 != 0) {
                    break label51;
                }

                this.F = var1;
                Integer var38 = var4;
                if (var38 != null) {
                    var3 |= 910581583;
                    var3 |= 672932274;
                    var3 += -619184792;
                    var3 ^= 179105674;
                    var38 = var3;
                    if (var38 != null) {
                        this.e = var2;
                        var3 &= 26080869;
                        var3 ^= -1317926152;
                        this.w(var3);
                        return;
                    }
                    break label51;
                }

                switch (var3) {
                    case -1571140934:
                        var3 ^= -1366380932;
                        break;
                    case -1347985611:
                    default:
                        var3 ^= -59952583;
                        break;
                    case 1243794924:
                        var3 *= 538658117;
                        var3 ^= 183231238;
                        var3 &= -1400722213;
                        var3 -= 437691983;
                        var3 ^= 1200838096;
                }
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                RuntimeException var42 = new RuntimeException();
                throw var42;
            }
        }

        AssertionError var37 = new AssertionError();
        throw var37;
    }

    private void w(int var1) {
        label93: {
            int var3 = System.identityHashCode(this);
            Integer var4 = var3;
            int var2;
            if (var4 == null) {
                switch (var1) {
                    case -1334175587:
                        var2 = var1 >>> 12;
                        var2 += 1199698114;
                        var2 -= -1000117680;
                        var2 &= 813250514;
                        var2 ^= -1593756205;
                        break;
                    case -149856747:
                    default:
                        var2 = var1 ^ 968022296;
                        break;
                    case 1475429585:
                        var2 = var1 ^ -2128125330;
                }
            } else {
                var2 = var1 + 1153606268;
                var2 -= -304175588;
                var2 ^= -561235286;
                int var73 = var2 + 1;
                var73 = var2 * var73;
                var73 &= 1;
                if (var73 != 0) {
                    break label93;
                }

                EventBus var76 = this.F;
                if (var76 == null) {
                    var2 = switch (var2) {
                        case -1252391226 -> var2 ^ -2032291617;
                        default -> var2 ^ 1872418007;
                        case -640537001 -> {
                            var2 |= -898994231;
                            var2 -= 1832391655;
                            yield var2 ^ 678477615;
                        }
                    };
                    var73 = var2 + 1;
                    var73 = var2 * var73;
                    int var98 = var2 + 2;
                    var73 *= var98;
                    var98 = var2 + 3;
                    var73 *= var98;
                    var73 &= 7;
                    if (var73 == 0) {
                        return;
                    }
                    break label93;
                }
                var2 = switch (var2) {
                    case -1828739789 -> var2 ^ 2056012970;
                    case -640537001 -> {
                        var2 |= -287427624;
                        yield var2 ^ 674469996;
                    }
                    default -> var2 ^ -1608422090;
                };
                var73 = var2 + 1;
                var73 = var2 * var73;
                int var5 = var2 + 2;
                var73 *= var5;
                var5 = var2 + 3;
                var73 *= var5;
                var73 &= 7;
                if (var73 != 0) {
                    break label93;
                }

                boolean var82 = this.IU();
                boolean var91 = this.eC;
                long var6 = var3;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var102;
                var3 = (var102 = var6 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var2 = switch (var2) {
                        case -672290893 -> {
                            var2 += 691842074;
                            var2 &= 2084126146;
                            yield var2 ^ -1950985660;
                        }
                        case 1009637733 -> var2 ^ -472300456;
                        default -> var2 ^ -1108078420;
                    };
                    if (var82 == var91) {
                        var2 -= -1930489997;
                        var2 -= -381936485;
                        var2 ^= -360025913;
                        Integer var57 = var2;
                        if (var57 != null) {
                            return;
                        }
                    } else {
                        var2 >>= 6;
                        var2 &= -2063311707;
                        var2 &= 1878378989;
                        var2 |= -1461206935;
                        var2 ^= 63980935;
                        if (var82) {
                            var2 *= 1185630299;
                            var2 ^= 860821039;
                            var2 -= 310398502;
                            var2 &= -909008751;
                            var2 ^= -472886069;
                            var3 = var2 * 2105169181;
                            var3 >>= 8;
                            var3 *= -1351997453;
                            var3 ^= -1077900749;
                            this.oY(var3);
                            var2 += -1407754820;
                            var2 ^= -1464647111;
                        } else {
                            var2 += 741044629;
                            var2 *= -1817126543;
                            var2 += -607951574;
                            var2 |= 1888162060;
                            var2 ^= 1986210788;
                            long var62 = var2;
                            long var92 = var62 + 1L;
                            long var93 = var62 * var92;
                            long var7 = var62 + 2L;
                            long var94 = var93 * var7;
                            long var63 = var62 + 3L;
                            long var95 = var94 * var63;
                            long var64 = var95 & 7L;
                            long var103;
                            var3 = (var103 = var64 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                            if (var3 != 0) {
                                break label93;
                            }

                            var3 = var2 >>> 11;
                            var3 *= -2030838617;
                            var3 -= 47085045;
                            var3 ^= -1591311918;
                            this.tA(var3);
                            switch (var2) {
                                case 129562841:
                                    var2 ^= -1107986737;
                                    var2 += -2013134063;
                                    var2 <<= 10;
                                    var2 ^= -2128581585;
                                    break;
                                case 278455010:
                                    var2 ^= -1135335363;
                                    break;
                                case 524521462:
                                default:
                                    var2 ^= -1168378159;
                            }
                        }

                        long var70 = var2;
                        long var96 = var70 + 1L;
                        long var97 = var70 * var96;
                        long var71 = var97 & 1L;
                        long var104;
                        var3 = (var104 = var71 - 0L) == 0L ? 0 : (var104 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                    }
                    break label93;
                }

                switch (var2) {
                    case -672290893:
                        var2 -= -1921838716;
                        var2 ^= -894197950;
                        var2 ^= 1062835714;
                        var2 ^= 515419310;
                        break;
                    case 503260235:
                    default:
                        var2 ^= -1052412724;
                        break;
                    case 1401618648:
                        var2 ^= 2009934009;
                }
            }

            long var22 = var2;
            long var83 = var22 + 1L;
            long var84 = var22 * var83;
            long var23 = var84 & 1L;
            long var105;
            var2 = (var105 = var23 - 0L) == 0L ? 0 : (var105 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            }
        }

        IllegalArgumentException var55 = new IllegalArgumentException();
        throw var55;
    }

    private void oY(int var1) {
        boolean var86 = false;
        Logger var4 = null;
        int var3 = var1 | -404493102;
        var3 ^= -108026413;
        Integer var5 = var3;
        if (var5 != null) {
            List var77 = this.V;
            Iterator var78 = var77.iterator();
            Iterator var79 = var78;
            var3 *= 1066958435;
            var3 ^= -25751697;

            while (true) {
                int var6 = var3 + 1;
                var6 = var3 * var6;
                int var7 = var3 + 2;
                var6 *= var7;
                var7 = var3 + 3;
                var6 *= var7;
                var6 &= 7;
                if (var6 != 0) {
                    break;
                }

                int var97 = (var79.hasNext()) ? 1 : 0;
                var3 -= 1668941132;
                var3 ^= 1339597615;
                if (var97 == 0) {
                    var3 += -182639859;
                    var3 ^= -1274769168;
                    long var80 = var3;
                    long var116 = var80 + 1L;
                    long var117 = var80 * var116;
                    long var81 = var117 & 1L;
                    long var130;
                    int var82 = (var130 = var81 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                    if (var82 != 0) {
                        break;
                    }

                    this.eC = true;

                    var3 = switch (var3) {
                        default -> var3 ^ -177975892;
                        case -1197143799 -> {
                            var3 *= 1526394949;
                            var3 += 1208855958;
                            var3 -= -32503002;
                            var3 ^= 624729124;
                            yield var3 ^ -235573131;
                        }
                        case 1116177462 -> var3 ^ -1858516843;
                    };
                    var82 = var3 + 1;
                    var82 = var3 * var82;
                    var82 &= 1;
                    if (var82 != 0) {
                        break;
                    }

                    label115: {
                        Throwable var2;
                        label116: {
                            try {
                                var3 -= 2068000844;
                                var3 |= 2092303109;
                                var3 ^= -1443793741;
                            } catch (Throwable var13) {
                                var2 = var13;
                                int var36 = C;
                                int var37 = var36 ^ -482562494;
                                var86 = var13 instanceof RuntimeException;
                                int var38 = var37 | -757244703;
                                int var39 = var38 - 412752953;
                                var3 = var39 ^ -592397780;
                                long var103 = var3;
                                long var121 = var103 + 1L;
                                var121 = var103 * var121;
                                long var10 = var103 + 2L;
                                var121 *= var10;
                                long var104 = var103 + 3L;
                                var121 *= var104;
                                long var105 = var121 & 7L;
                                long var131;
                                var97 = (var131 = var105 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                                if (var97 != 0) {
                                    break;
                                }
                                break label116;
                            }

                            var82 = var3 + 1;
                            var82 = var3 * var82;
                            var97 = var3 + 2;
                            var82 *= var97;
                            var97 = var3 + 3;
                            var82 *= var97;
                            var82 &= 7;
                            if (var82 != 0) {
                                break;
                            }

                            try {
                                this.eF();
                                var3 += 1753902744;
                                var3 ^= -1833761706;
                                var3 ^= -1483967114;
                                break label115;
                            } catch (Throwable var12) {
                                var2 = var12;
                                int var44 = C;
                                int var45 = var44 ^ -482562494;
                                var86 = var12 instanceof RuntimeException;
                                int var46 = var45 | -757244703;
                                int var47 = var46 - 412752953;
                                var3 = var47 ^ -592397780;
                                long var109 = var3;
                                long var125 = var109 + 1L;
                                var125 = var109 * var125;
                                long var129 = var109 + 2L;
                                var125 *= var129;
                                long var110 = var109 + 3L;
                                var125 *= var110;
                                long var111 = var125 & 7L;
                                long var132;
                                var97 = (var132 = var111 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                                if (var97 != 0) {
                                    break;
                                }
                            }
                        }

                        if (!var86) {
                            var3 -= -1481469201;
                            var3 |= 1989408401;
                            var3 ^= 1734436508;
                            if (var2 instanceof RuntimeException re) throw re;
                            if (var2 instanceof Error err) throw err;
                            throw new RuntimeException(var2);
                        }

                        var3 ^= 1823272489;
                        var3 -= -716217493;
                        var3 &= 472246889;
                        var3 ^= 2128550081;
                        RuntimeException varEx = (RuntimeException)var2;
                        var3 &= 128967547;
                        var3 |= 485199806;
                        var3 <<= 18;
                        var3 ^= -637123010;
                        Integer var14 = var3;
                        if (var14 == null) {
                            break;
                        }

                        var4 = o;
                        String var92 = this.vJ;
                        var3 >>= 24;
                        var3 ^= -201803003;
                        Integer var113 = var3;
                        if (var113 == null) {
                            break;
                        }

                        var4.error("{}.onEnable() failed", var92, varEx);
                        switch (var3) {
                            case -1140384810:
                                var3 ^= -167319828;
                                return;
                            case -776044867:
                            default:
                                var3 ^= -364532845;
                                return;
                            case -201802911:
                                var3 <<= 29;
                                var3 += 1365024305;
                                var3 -= 918917996;
                                var3 |= 89769752;
                                var3 ^= -550123451;
                                return;
                        }
                    }

                    Integer var16 = var3;
                    if (var16 == null) {
                        break;
                    }

                    var3 += -2142941893;
                    var3 *= -1372929075;
                    var3 += 218573735;
                    var3 ^= -725770588;
                    return;
                }

                var3 |= 1724028377;
                var3 ^= -1846589601;
                Integer var98 = var3;
                if (var98 == null) {
                    break;
                }

                // next
                oK var100 = (oK)var79.next();
                List var115 = this.LQ;
                EventBus var8 = this.F;
                EventSubscription var101 = var100.subscribe(var8);

                var3 = switch (var3) {
                    case -433475422 -> {
                        var3 &= 2000657612;
                        var3 &= -390170359;
                        yield var3 ^ 1367137368;
                    }
                    case 973574798 -> var3 ^ 1956510624;
                    default -> var3 ^ -166981870;
                };
                int var118 = var3 + 1;
                int var119 = var3 * var118;
                int var120 = var119 & 1;
                if (var120 != 0) {
                    break;
                }

                boolean var102 = var115.add(var101);
                var3 += -1622610745;
                var3 ^= 1800102416;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    private void tA(int param1) {
    for (Object subObj : this.LQ) {
        EventSubscription sub = (EventSubscription)subObj;
        if (sub != null) {
            sub.unsubscribe();
        }
    }
    this.LQ.clear();
    this.eC = false;
    this.J();
}


    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 45722951;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        C = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/modules");
        o = var5;
    }
}
