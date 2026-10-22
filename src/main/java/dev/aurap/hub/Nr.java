package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;

public final class Nr {
    public static final long UY = 200L;
    private static final float xC = 3.4F;
    private static final float M = 7.0F;
    private static final float qH = 1.16F;
    private static final float i = 0.3F;
    private final TextStyle Z;
    private final TextStyle a;
    private Za mF;
    private float pw = -1.0F;
    private String[][] cu;
    private float[] On;
    private float[] aS;
    private float Vh;
    private float[] s;
    private float[] Mp;
    private float[] V;
    private boolean xt;
    private int q;
    private float I;
    private float e;
    private float n;
    private float Qv;
    private int kS;
    public static final int dQ;

    public Nr(TextStyle var1, TextStyle var2) {
        String[][] var3 = new String[0][];
        this.cu = var3;
        float[] var4 = new float[0];
        this.On = var4;
        float[] var5 = new float[0];
        this.aS = var5;
        float[] var6 = new float[0];
        this.s = var6;
        float[] var7 = new float[0];
        this.Mp = var7;
        float[] var8 = new float[0];
        this.V = var8;
        this.xt = true;
        this.q = -1;
        this.kS = -1;
        this.Z = var1;
        this.a = var2;
    }

    public void FO() {
        int var1 = dQ;
        var1 ^= -330355907;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 ^= -1249197112;
            var1 *= -345234425;
            var1 <<= 10;
            var1 >>>= 11;
            var1 ^= 457149237;
            RuntimeException var22 = new RuntimeException();
            throw var22;
        } else {
            var1 &= 1082734595;
            var1 *= 496285959;
            var1 >>= 30;
            var1 ^= 776844418;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                this.xt = true;
            }
        }
    }

    public static int G(Za var0, long var1) {
        label57: {
            int var33;
            int var47;
            label56: {
                var33 = dQ;
                var33 ^= -556975603;
                int var4 = System.identityHashCode(var0);
                Integer var5 = var4;
                if (var5 == null) {
                    var33 |= 824111111;
                    var33 &= 580723193;
                    var33 ^= -380582982;
                } else {
                    var33 &= -1215446305;
                    var33 |= -1307782978;
                    var33 |= 403818314;
                    var33 <<= 2;
                    var33 ^= -301128071;
                    if (var0 == null) {
                        var33 = switch (var33) {
                            default -> var33 ^ 1697199647;
                            case -1096646547 -> var33 ^ 400265913;
                            case 377125249 -> {
                                var33 -= -178386981;
                                var33 &= 6394277;
                                var33 *= -1932775251;
                                yield var33 ^ -1838452892;
                            }
                        };
                        int var48 = var33 + 1;
                        var48 = var33 * var48;
                        var48 &= 1;
                        if (var48 != 0) {
                            break label57;
                        }

                        var47 = -1;
                        var33 *= -1533353361;
                        var33 &= 485101393;
                        var33 ^= -611107549;
                        break label56;
                    }
                    var33 = switch (var33) {
                        default -> var33 ^ -321608814;
                        case 377125249 -> {
                            var33 *= -1599421261;
                            yield var33 ^ -1933070626;
                        }
                        case 1099956348 -> var33 ^ 540222192;
                    };
                    int var6 = var33 + 1;
                    var6 = var33 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label57;
                    }

                    long var53 = var1 + 200L;
                    var6 = var0.Q(var53);
                    int var7 = var4 + 1;
                    var7 = var4 * var7;
                    int var8 = var4 + 2;
                    var7 *= var8;
                    var4 += 3;
                    var7 *= var4;
                    var4 = var7 & 7;
                    if (var4 == 0) {
                        var33 -= 1700871365;
                        var33 |= -1934728435;
                        var33 ^= 1602721316;
                        var33 -= 1079048843;
                        var33 ^= -1595686844;
                        Integer var43 = var33;
                        if (var43 == null) {
                            break label57;
                        }

                        var47 = var6;
                        var33 ^= 1270865184;
                        var33 -= 971469351;
                        var33 ^= 1505610112;
                        break label56;
                    }

                    var33 &= -1904987045;
                    var33 ^= 869619484;
                    var33 ^= -91446874;
                }

                long var22 = var33;
                long var45 = var22 + 1L;
                long var46 = var22 * var45;
                long var23 = var46 & 1L;
                long var58;
                var33 = (var58 = var23 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                if (var33 == 0) {
                    RuntimeException var25 = new RuntimeException();
                    throw var25;
                }
                break label57;
            }

            Integer var44 = var33;
            if (var44 != null) {
                return var47;
            }
        }

        UnsupportedOperationException var40 = new UnsupportedOperationException();
        throw var40;
    }

    public void on(
        Canvas var1,
        be_2 var2,
        String var3,
        long var4,
        float var6,
        float var7,
        float var8,
        float var9,
        float var10,
        float var11,
        double var12,
        float var14,
        float var15
    ) {
        boolean var1170 = false;
        Za var747 = null;
        boolean var873 = false;
        label1329: {
            int var715;
            label1249: {
                var715 = dQ;
                var715 ^= -1814808699;
                int var17 = System.identityHashCode(this);
                this.I = var7;
                this.e = var8;
                this.n = var9;
                this.Qv = var10;
                long var18 = var17;
                long var20 = var18 + 1L;
                var20 = var18 * var20;
                long var22 = var18 + 2L;
                var20 *= var22;
                var18 += 3L;
                var20 *= var18;
                var18 = var20 & 7L;
                long var1465;
                int var740 = (var1465 = var18 - 0L) == 0L ? 0 : (var1465 < 0L ? -1 : 1);
                if (var740 != 0) {
                    var715 ^= 1322330151;
                    var715 ^= -552931028;
                } else {
                    label1239: {
                        var715 >>>= 29;
                        var715 += 1555921505;
                        var715 ^= 1148050626;
                        var715 -= 1282159852;
                        var715 ^= -965583036;
                        Integer var741 = var715;
                        if (var741 == null) {
                            break label1329;
                        }

                        label1197: {
                            this.kS = -1;
                            if (var2 != null) {
                                var715 &= -237786219;
                                var715 &= 291270210;
                                var715 *= -495650989;
                                var715 |= -1553993886;
                                var715 ^= 519808876;
                                var18 = var715;
                                var20 = var18 + 1L;
                                var20 = var18 * var20;
                                var18 = var20 & 1L;
                                long var1466;
                                int var744 = (var1466 = var18 - 0L) == 0L ? 0 : (var1466 < 0L ? -1 : 1);
                                if (var744 != 0) {
                                    break label1329;
                                }

                                BA var745 = var2.state();
                                int var19 = var17 + 1;
                                var19 = var17 * var19;
                                var19 &= 1;
                                if (var19 != 0) {
                                    switch (var715) {
                                        case -1707399774:
                                            var715 ^= -612960184;
                                            break label1239;
                                        case -1188800498:
                                            var715 += -3870364;
                                            var715 += -799186008;
                                            var715 ^= 32628433;
                                            break label1239;
                                        case 1198697182:
                                        default:
                                            var715 ^= 311814704;
                                            break label1239;
                                    }
                                }

                                var715 *= 614830697;
                                var715 ^= 998931990;
                                var715 ^= -1497126698;
                                BA var753 = BA.FOUND;
                                if (var745 == var753) {
                                    var715 ^= -671465277;
                                    var715 &= 1568153974;
                                    var715 <<= 12;
                                    var715 ^= 1592826909;
                                    Za var746 = var2.lyrics();
                                    var19 = var17 + 1;
                                    var19 = var17 * var19;
                                    int var789 = var17 + 2;
                                    var19 *= var789;
                                    int var790 = var17 + 3;
                                    var19 *= var790;
                                    var19 &= 7;
                                    if (var19 != 0) {
                                        switch (var715) {
                                            case -1228803337:
                                            default:
                                                var715 ^= 163917056;
                                                break label1239;
                                            case 1591991325:
                                                var715 -= 1667443177;
                                                var715 ^= 1579217533;
                                                var715 ^= 756495234;
                                                break label1239;
                                            case 1926920812:
                                                var715 ^= -2056992278;
                                                break label1239;
                                        }
                                    }

                                    var715 -= -573959943;
                                    var715 += 1018359883;
                                    var715 ^= -1168309716;
                                    var747 = var746;
                                    var715 &= -931541725;
                                    var715 *= -1470117439;
                                    var715 &= -520075180;
                                    var715 ^= -782722157;
                                    break label1197;
                                }

                                var715 -= -1980952269;
                                var715 *= -1236175291;
                                var715 ^= 384357927;
                                var715 ^= -445871747;
                            } else {
                                var715 |= -974382390;
                                var715 ^= 2062314280;
                                var715 ^= -1459838068;
                                var715 >>= 9;
                                var715 ^= -1054575594;
                            }

                            var747 = null;
                            var715 -= 1027985851;
                            var715 >>>= 18;
                            var715 ^= 1884863274;
                        }

                        Za var748 = var747;
                        long var759 = var17;
                        long var21 = var759 + 1L;
                        var21 = var759 * var21;
                        var759 = var21 & 1L;
                        long var1467;
                        int var761 = (var1467 = var759 - 0L) == 0L ? 0 : (var1467 < 0L ? -1 : 1);
                        if (var761 != 0) {
                            switch (var715) {
                                case 894660860:
                                    var715 ^= -1912056508;
                                    break;
                                case 1849144696:
                                default:
                                    var715 ^= -714115767;
                                    break;
                                case 1884855251:
                                    var715 -= -1788770456;
                                    var715 <<= 30;
                                    var715 ^= 1219982283;
                            }
                        } else {
                            var715 &= -1927609332;
                            var715 ^= -812418480;
                            int var762 = var715 + 1;
                            int var763 = var715 * var762;
                            int var791 = var715 + 2;
                            int var764 = var763 * var791;
                            int var792 = var715 + 3;
                            int var765 = var764 * var792;
                            int var766 = var765 & 7;
                            if (var766 != 0) {
                                break label1329;
                            }

                            if (var747 == null) {
                                var715 *= -992008841;
                                var715 += -1057510771;
                                var715 -= 787644716;
                                var715 <<= 14;
                                var715 ^= -23636558;
                                break label1249;
                            }

                            var715 ^= -1673488760;
                            var715 >>>= 21;
                            var715 &= 1642832539;
                            var715 ^= -6028152;
                            var759 = var715;
                            var21 = var759 + 1L;
                            var21 = var759 * var21;
                            long var23 = var759 + 2L;
                            var21 *= var23;
                            var759 += 3L;
                            var21 *= var759;
                            var759 = var21 & 7L;
                            long var1468;
                            int var770 = (var1468 = var759 - 0L) == 0L ? 0 : (var1468 < 0L ? -1 : 1);
                            if (var770 != 0) {
                                break label1329;
                            }

                            boolean var771 = var747.O();
                            Integer var793 = var17;
                            if (var793 == null) {
                                var715 += -1270441936;
                                var715 -= -256710544;
                                var715 ^= 1266730521;
                            } else {
                                var715 |= 114940688;
                                var715 ^= -1516918559;
                                var20 = var715;
                                var22 = var20 + 1L;
                                var22 = var20 * var22;
                                long var24 = var20 + 2L;
                                var22 *= var24;
                                var20 += 3L;
                                var22 *= var20;
                                var20 = var22 & 7L;
                                long var1469;
                                int var797 = (var1469 = var20 - 0L) == 0L ? 0 : (var1469 < 0L ? -1 : 1);
                                if (var797 != 0) {
                                    break label1329;
                                }

                                if (var771) {
                                    var715 &= -1079153500;
                                    var715 ^= -1046777582;
                                    break label1249;
                                }

                                var715 |= -206957384;
                                var715 |= 71878605;
                                var715 ^= -1486257914;
                                var715 >>>= 15;
                                var715 ^= -1436145343;
                                int var772 = var715 >>> 9;
                                int var773 = var772 | -1705404038;
                                int var774 = var773 ^ -510829470;
                                this.U(var1, var747, var9, var774);
                                var759 = var17;
                                var21 = var759 + 1L;
                                var21 = var759 * var21;
                                var759 = var21 & 1L;
                                long var1470;
                                int var777 = (var1470 = var759 - 0L) == 0L ? 0 : (var1470 < 0L ? -1 : 1);
                                if (var777 != 0) {
                                    switch (var715) {
                                        case -2132403650:
                                        default:
                                            var715 ^= -2050804186;
                                            break;
                                        case -1436116921:
                                            var715 |= -1148694722;
                                            var715 -= 840928793;
                                            var715 |= -513833249;
                                            var715 ^= -1503903055;
                                            var715 ^= -952834427;
                                            break;
                                        case -1273928402:
                                            var715 ^= 1812098109;
                                    }
                                } else {
                                    label1242: {
                                        var715 >>= 1;
                                        var715 *= -1719320805;
                                        var715 ^= -237305698;
                                        var715 ^= -705163461;
                                        var759 = var715;
                                        var21 = var759 + 1L;
                                        var21 = var759 * var21;
                                        var759 = var21 & 1L;
                                        long var1471;
                                        int var780 = (var1471 = var759 - 0L) == 0L ? 0 : (var1471 < 0L ? -1 : 1);
                                        if (var780 != 0) {
                                            break label1329;
                                        }

                                        String[][] var781 = this.cu;
                                        int var782 = var781.length;
                                        int var783 = var782;
                                        boolean var798 = var747.Gd();
                                        int var803;
                                        if (var798) {
                                            var715 ^= 1061847338;
                                            var715 ^= -1364384631;
                                            var20 = var715;
                                            var22 = var20 + 1L;
                                            var22 = var20 * var22;
                                            var20 = var22 & 1L;
                                            long var1472;
                                            int var801 = (var1472 = var20 - 0L) == 0L ? 0 : (var1472 < 0L ? -1 : 1);
                                            if (var801 != 0) {
                                                break label1329;
                                            }

                                            int var802 = G(var747, var4);
                                            Integer var814 = var17;
                                            if (var814 == null) {
                                                switch (var715) {
                                                    case 546311863:
                                                        var715 += 398287431;
                                                        var715 ^= -1325792459;
                                                        break label1242;
                                                    case 748039395:
                                                    default:
                                                        var715 ^= 1621848080;
                                                        break label1242;
                                                    case 848253674:
                                                        var715 ^= 122000005;
                                                        break label1242;
                                                }
                                            }

                                            var715 *= 192083367;
                                            var715 *= -1561409517;
                                            var715 ^= 1889777656;
                                            int var815 = var715 + 1;
                                            int var816 = var715 * var815;
                                            int var817 = var816 & 1;
                                            if (var817 != 0) {
                                                break label1329;
                                            }

                                            var803 = var802;
                                            var715 += -939327512;
                                            var715 *= -745933749;
                                            var715 ^= -443456948;
                                        } else {
                                            var715 |= 1199206440;
                                            var715 &= 1728921957;
                                            var715 *= -1323763457;
                                            var715 ^= 1333177385;
                                            Integer var818 = var715;
                                            if (var818 == null) {
                                                break label1329;
                                            }

                                            var803 = -1;
                                            var715 *= 1549506805;
                                            var715 ^= 2013988420;
                                        }

                                        int var819 = var715 + 1;
                                        int var820 = var715 * var819;
                                        int var849 = var715 + 2;
                                        int var821 = var820 * var849;
                                        int var850 = var715 + 3;
                                        int var822 = var821 * var850;
                                        int var823 = var822 & 7;
                                        if (var823 != 0) {
                                            break label1329;
                                        }

                                        int var804 = var803;
                                        var21 = var17;
                                        var23 = var21 + 1L;
                                        var23 = var21 * var23;
                                        long var25 = var21 + 2L;
                                        var23 *= var25;
                                        var21 += 3L;
                                        var23 *= var21;
                                        var21 = var23 & 7L;
                                        long var1473;
                                        int var827 = (var1473 = var21 - 0L) == 0L ? 0 : (var1473 < 0L ? -1 : 1);
                                        if (var827 != 0) {
                                            var715 ^= -102857692;
                                            var715 ^= -1804052014;
                                        } else {
                                            var715 >>= 13;
                                            var715 ^= 1990275323;
                                            var21 = var715;
                                            var23 = var21 + 1L;
                                            var23 = var21 * var23;
                                            var25 = var21 + 2L;
                                            var23 *= var25;
                                            var21 += 3L;
                                            var23 *= var21;
                                            var21 = var23 & 7L;
                                            long var1474;
                                            int var831 = (var1474 = var21 - 0L) == 0L ? 0 : (var1474 < 0L ? -1 : 1);
                                            if (var831 != 0) {
                                                break label1329;
                                            }

                                            int var832 = this.q;
                                            if (var803 != var832) {
                                                var715 = switch (var715) {
                                                    case -1990322058 -> {
                                                        var715 ^= 1477532478;
                                                        yield var715 ^ -754023334;
                                                    }
                                                    case 481508370 -> var715 ^ -580419316;
                                                    default -> var715 ^ 1279151543;
                                                };
                                                Integer var833 = var715;
                                                if (var833 == null) {
                                                    break label1329;
                                                }

                                                this.q = var803;
                                                switch (var715) {
                                                    case -807425811:
                                                    default:
                                                        var715 ^= 479742813;
                                                        break;
                                                    case 37865234:
                                                        var715 += -712868216;
                                                        var715 ^= -1049740828;
                                                        break;
                                                    case 768735798:
                                                        var715 ^= 530123336;
                                                }
                                            } else {
                                                var715 -= -387093616;
                                                var715 *= 115480219;
                                                var715 ^= -863367364;
                                            }

                                            int var834 = var715 + 1;
                                            int var835 = var715 * var834;
                                            int var851 = var715 + 2;
                                            int var836 = var835 * var851;
                                            int var852 = var715 + 3;
                                            int var837 = var836 * var852;
                                            int var838 = var837 & 7;
                                            if (var838 != 0) {
                                                break label1329;
                                            }

                                            float var839 = var10 * 0.3F;
                                            float var840 = var8 + var839;
                                            int var853 = var17 + 1;
                                            int var854 = var17 * var853;
                                            int var883 = var17 + 2;
                                            int var855 = var854 * var883;
                                            int var884 = var17 + 3;
                                            int var856 = var855 * var884;
                                            int var857 = var856 & 7;
                                            if (var857 != 0) {
                                                var715 *= -1027154491;
                                                var715 |= 1982024977;
                                                var715 ^= 255874881;
                                                var715 ^= -238486659;
                                            } else {
                                                label1244: {
                                                    var715 >>= 3;
                                                    var715 >>= 13;
                                                    var715 |= -2031363141;
                                                    var715 ^= 105454535;
                                                    boolean var858 = var747.Gd();
                                                    float var865;
                                                    if (var858) {
                                                        var715 ^= 996797161;
                                                        var715 -= -738777003;
                                                        var715 += 1898923220;
                                                        var715 &= 1755635639;
                                                        var715 ^= 1857487581;
                                                        Integer var859 = var715;
                                                        if (var859 == null) {
                                                            break label1329;
                                                        }

                                                        float var863;
                                                        if (var803 >= 0) {
                                                            var715 |= 2086230287;
                                                            var715 += -895228892;
                                                            var715 >>= 30;
                                                            var715 ^= -1326105886;
                                                            Integer var860 = var715;
                                                            if (var860 == null) {
                                                                break label1329;
                                                            }

                                                            float[] var861 = this.On;
                                                            float var862 = var861[var803];
                                                            var23 = var17;
                                                            var25 = var23 + 1L;
                                                            var25 = var23 * var25;
                                                            long var27 = var23 + 2L;
                                                            var25 *= var27;
                                                            var23 += 3L;
                                                            var25 *= var23;
                                                            var23 = var25 & 7L;
                                                            long var1475;
                                                            int var888 = (var1475 = var23 - 0L) == 0L ? 0 : (var1475 < 0L ? -1 : 1);
                                                            if (var888 != 0) {
                                                                var715 *= 1177716775;
                                                                var715 *= -502554949;
                                                                var715 ^= 505274652;
                                                                break label1244;
                                                            }

                                                            var715 -= -710926252;
                                                            var715 &= -1802782888;
                                                            var715 ^= -991157117;
                                                            var715 >>>= 8;
                                                            var715 ^= 299408229;
                                                            var23 = var715;
                                                            var25 = var23 + 1L;
                                                            var25 = var23 * var25;
                                                            var27 = var23 + 2L;
                                                            var25 *= var27;
                                                            var23 += 3L;
                                                            var25 *= var23;
                                                            var23 = var25 & 7L;
                                                            long var1476;
                                                            int var892 = (var1476 = var23 - 0L) == 0L ? 0 : (var1476 < 0L ? -1 : 1);
                                                            if (var892 != 0) {
                                                                break label1329;
                                                            }

                                                            var863 = var862;
                                                            switch (var715) {
                                                                case -66785177:
                                                                    var715 ^= -1167740547;
                                                                    break;
                                                                case 75094635:
                                                                default:
                                                                    var715 ^= 1930440572;
                                                                    break;
                                                                case 294418003:
                                                                    var715 += -1028962069;
                                                                    var715 |= 268054203;
                                                                    var715 ^= 1668840970;
                                                            }
                                                        } else {
                                                            var715 += 865451963;
                                                            var715 ^= -1368241184;
                                                            Integer var893 = var715;
                                                            if (var893 == null) {
                                                                break label1329;
                                                            }

                                                            var863 = -10.4F;
                                                            var715 <<= 14;
                                                            var715 *= -748822355;
                                                            var715 ^= 1810022837;
                                                        }

                                                        Integer var894 = var17;
                                                        if (var894 == null) {
                                                            var715 -= 968356451;
                                                            var715 ^= 175684761;
                                                            break label1244;
                                                        }
                                                        var715 = switch (var715) {
                                                            case -1131953739 -> {
                                                                var715 -= -865022176;
                                                                var715 *= -507644271;
                                                                var715 >>= 8;
                                                                yield var715 ^ -248325722;
                                                            }
                                                            case 672072315 -> var715 ^ 1540855169;
                                                            default -> var715 ^ 851691886;
                                                        };
                                                        var23 = var715;
                                                        var25 = var23 + 1L;
                                                        var25 = var23 * var25;
                                                        var23 = var25 & 1L;
                                                        long var1477;
                                                        int var897 = (var1477 = var23 - 0L) == 0L ? 0 : (var1477 < 0L ? -1 : 1);
                                                        if (var897 != 0) {
                                                            break label1329;
                                                        }

                                                        float var898 = var840 - var8;
                                                        float var864 = var863 - var898;
                                                        var865 = var864;
                                                        var715 &= -1482232852;
                                                        var715 ^= 2059676398;
                                                    } else {
                                                        var715 += -759317208;
                                                        var715 ^= -1937396958;
                                                        var715 ^= -1934153625;
                                                        float var899 = this.Vh;
                                                        float var980 = var10 * 0.65F;
                                                        float var900 = var899 - var980;
                                                        Integer var981 = var17;
                                                        if (var981 == null) {
                                                            var715 *= -503308599;
                                                            var715 <<= 4;
                                                            var715 ^= 320698715;
                                                            break label1244;
                                                        }

                                                        var715 >>>= 6;
                                                        var715 ^= 781544437;
                                                        Integer var982 = var715;
                                                        if (var982 == null) {
                                                            break label1329;
                                                        }

                                                        float var901 = Math.max(0.0F, var900);
                                                        float var902 = var6 * var901;
                                                        var865 = var902;
                                                        var715 += -607889689;
                                                        var715 &= -542373965;
                                                        var715 |= -811457023;
                                                        var715 ^= 1917138321;
                                                        var715 ^= 1712061438;
                                                    }

                                                    int var903 = var715 + 1;
                                                    int var904 = var715 * var903;
                                                    int var983 = var715 + 2;
                                                    int var905 = var904 * var983;
                                                    int var984 = var715 + 3;
                                                    int var906 = var905 * var984;
                                                    int var907 = var906 & 7;
                                                    if (var907 != 0) {
                                                        break label1329;
                                                    }

                                                    float var908 = -var11;
                                                    float var909 = var908 * 9.0F;
                                                    double var910 = var909;
                                                    double var911 = Math.exp(var910);
                                                    float var912 = (float)var911;
                                                    float var913 = 1.0F - var912;
                                                    float var914 = var913;
                                                    var24 = var17;
                                                    long var26 = var24 + 1L;
                                                    var26 = var24 * var26;
                                                    var24 = var26 & 1L;
                                                    long var1478;
                                                    int var987 = (var1478 = var24 - 0L) == 0L ? 0 : (var1478 < 0L ? -1 : 1);
                                                    if (var987 != 0) {
                                                        var715 >>= 13;
                                                        var715 &= 1105369095;
                                                        var715 ^= -917115956;
                                                    } else {
                                                        label1299: {
                                                            var715 |= 497284830;
                                                            var715 ^= -1714071557;
                                                            var715 *= 1832931511;
                                                            var715 ^= 1724944077;
                                                            byte var988 = 0;
                                                            int var989 = var988;

                                                            var715 = switch (var715) {
                                                                default -> var715 ^ 363292201;
                                                                case 922679230 -> {
                                                                    var715 <<= 15;
                                                                    yield var715 ^ 1016302464;
                                                                }
                                                                case 1455790144 -> var715 ^ -1240393186;
                                                            };

                                                            while (var989 < var783) {
                                                                var715 -= -2062022980;
                                                                var715 >>= 5;
                                                                var715 &= 1595349136;
                                                                var715 ^= 1107515472;
                                                                float[] var1037 = this.On;
                                                                float var1038 = var1037[var989];
                                                                float var1039 = var8 + var1038;
                                                                float var1040 = var1039 - var865;
                                                                var26 = var17;
                                                                long var28 = var26 + 1L;
                                                                var28 = var26 * var28;
                                                                var26 = var28 & 1L;
                                                                long var1479;
                                                                int var1052 = (var1479 = var26 - 0L) == 0L ? 0 : (var1479 < 0L ? -1 : 1);
                                                                if (var1052 != 0) {
                                                                    var715 -= 1635404223;
                                                                    var715 |= 772615671;
                                                                    var715 ^= 908745788;
                                                                    break label1299;
                                                                }

                                                                var715 += -128313756;
                                                                var715 ^= 198901966;
                                                                int var1053 = var715 + 1;
                                                                int var1054 = var715 * var1053;
                                                                int var1094 = var715 + 2;
                                                                int var1055 = var1054 * var1094;
                                                                var1094 = var715 + 3;
                                                                int var1056 = var1055 * var1094;
                                                                int var1057 = var1056 & 7;
                                                                if (var1057 != 0) {
                                                                    break label1329;
                                                                }

                                                                boolean var1058 = this.xt;
                                                                if (var1058) {
                                                                    var715 += -1131294897;
                                                                    var715 |= -279244019;
                                                                    var715 |= -979780559;
                                                                    var715 ^= 1859214911;
                                                                    var715 ^= -2054480113;
                                                                    float[] var1059 = this.s;
                                                                    var1059[var989] = var1040;
                                                                    float[] var1060 = this.Mp;
                                                                    long var1096 = var17;
                                                                    long var29 = var1096 + 1L;
                                                                    var29 = var1096 * var29;
                                                                    long var31 = var1096 + 2L;
                                                                    var29 *= var31;
                                                                    long var1097 = var1096 + 3L;
                                                                    var29 *= var1097;
                                                                    long var1098 = var29 & 7L;
                                                                    long var1480;
                                                                    var1094 = (var1480 = var1098 - 0L) == 0L ? 0 : (var1480 < 0L ? -1 : 1);
                                                                    if (var1094 != 0) {
                                                                        var715 >>>= 9;
                                                                        var715 ^= -2089758523;
                                                                        var715 ^= 198042609;
                                                                        break label1299;
                                                                    }
                                                                    var715 = switch (var715) {
                                                                        default -> var715 ^ -2079110774;
                                                                        case 344063693 -> {
                                                                            var715 >>>= 26;
                                                                            var715 >>>= 25;
                                                                            yield var715 ^ 127799210;
                                                                        }
                                                                        case 2128958972 -> var715 ^ 1239669343;
                                                                    };
                                                                    long var1100 = var715;
                                                                    var29 = var1100 + 1L;
                                                                    var29 = var1100 * var29;
                                                                    long var1101 = var29 & 1L;
                                                                    long var1481;
                                                                    var1094 = (var1481 = var1101 - 0L) == 0L ? 0 : (var1481 < 0L ? -1 : 1);
                                                                    if (var1094 != 0) {
                                                                        break label1329;
                                                                    }

                                                                    var1060[var989] = 0.0F;
                                                                    var715 >>= 13;
                                                                    var715 ^= 2135781501;
                                                                } else {
                                                                    var715 = switch (var715) {
                                                                        case -2070577178 -> var715 ^ -1187727142;
                                                                        case 532115066 -> {
                                                                            var715 >>= 15;
                                                                            var715 >>= 30;
                                                                            var715 >>= 29;
                                                                            var715 ^= -1990022497;
                                                                            yield var715 ^ 2102020001;
                                                                        }
                                                                        default -> var715 ^ -1509195991;
                                                                    };
                                                                    int var1061 = var715 + 1;
                                                                    int var1062 = var715 * var1061;
                                                                    var1094 = var715 + 2;
                                                                    int var1063 = var1062 * var1094;
                                                                    var1094 = var715 + 3;
                                                                    int var1064 = var1063 * var1094;
                                                                    int var1065 = var1064 & 7;
                                                                    if (var1065 != 0) {
                                                                        break label1329;
                                                                    }

                                                                    int var1066 = Math.max(var804, 0);
                                                                    int var1067 = var989 - var1066;
                                                                    int var1068 = Math.abs(var1067);
                                                                    long var1105 = var17;
                                                                    long var1296 = var1105 + 1L;
                                                                    var1296 = var1105 * var1296;
                                                                    long var1106 = var1296 & 1L;
                                                                    long var1482;
                                                                    var1094 = (var1482 = var1106 - 0L) == 0L ? 0 : (var1482 < 0L ? -1 : 1);
                                                                    if (var1094 != 0) {
                                                                        var715 ^= 1368711829;
                                                                        var715 <<= 14;
                                                                        var715 |= -17341025;
                                                                        var715 |= -1029986766;
                                                                        var715 ^= 2001245300;
                                                                        break label1299;
                                                                    }

                                                                    var715 |= 776453251;
                                                                    var715 *= -1565832773;
                                                                    var715 -= 181033927;
                                                                    var715 ^= -1553712619;
                                                                    var1094 = var715 + 1;
                                                                    var1094 = var715 * var1094;
                                                                    var1094 &= 1;
                                                                    if (var1094 != 0) {
                                                                        break label1329;
                                                                    }

                                                                    int var1069 = Math.min(var1068, 6);
                                                                    float var1070 = var1069;
                                                                    float var1071 = 0.035F * var1070;
                                                                    float var1111;
                                                                    if (var989 > var804) {
                                                                        var715 -= -550277197;
                                                                        var715 &= 1140381488;
                                                                        var715 >>>= 17;
                                                                        var715 ^= 617343722;
                                                                        var1111 = 1.0F;
                                                                        var715 -= -814621260;
                                                                        var715 -= 309892993;
                                                                        var715 ^= -911653775;
                                                                        var715 ^= -930383678;
                                                                    } else {
                                                                        var715 += 1824164967;
                                                                        var715 ^= 157409462;
                                                                        int var1191 = var715 + 1;
                                                                        int var1192 = var715 * var1191;
                                                                        int var1298 = var715 + 2;
                                                                        int var1193 = var1192 * var1298;
                                                                        int var1299 = var715 + 3;
                                                                        int var1194 = var1193 * var1299;
                                                                        int var1195 = var1194 & 7;
                                                                        if (var1195 != 0) {
                                                                            break label1329;
                                                                        }

                                                                        var1111 = 0.4F;
                                                                        switch (var715) {
                                                                            case -1644300081:
                                                                                var715 ^= -1417612394;
                                                                                break;
                                                                            case 623590564:
                                                                                var715 -= 1603884893;
                                                                                var715 &= -2094919052;
                                                                                var715 -= -1649713424;
                                                                                var715 &= -1494590597;
                                                                                var715 ^= -511481742;
                                                                                break;
                                                                            case 730525368:
                                                                            default:
                                                                                var715 ^= -2081032058;
                                                                        }
                                                                    }

                                                                    Integer var1196 = var715;
                                                                    if (var1196 == null) {
                                                                        break label1329;
                                                                    }

                                                                    float var1072 = var1071 * var1111;
                                                                    float var1073 = 0.2F + var1072;
                                                                    float[] var1112 = this.s;
                                                                    Integer var1197 = var17;
                                                                    if (var1197 == null) {
                                                                        var715 >>>= 23;
                                                                        var715 |= -1145669480;
                                                                        var715 ^= 1124688672;
                                                                        var715 ^= 1879599220;
                                                                        break label1299;
                                                                    }
                                                                    var715 = switch (var715) {
                                                                        default -> var715 ^ 384570733;
                                                                        case -25131802 -> var715 ^ -681622184;
                                                                        case 1136879906 -> {
                                                                            var715 ^= 1860460198;
                                                                            var715 -= 2073763480;
                                                                            var715 -= 2136105096;
                                                                            var715 ^= -451774067;
                                                                            yield var715 ^ -880594557;
                                                                        }
                                                                    };
                                                                    Integer var1198 = var715;
                                                                    if (var1198 == null) {
                                                                        break label1329;
                                                                    }

                                                                    float[] var1199 = this.s;
                                                                    float var1200 = var1199[var989];
                                                                    int var1300 = var715 >>> 20;
                                                                    int var1301 = var1300 | 507200601;
                                                                    int var1302 = var1301 - 1897069127;
                                                                    int var1303 = var1302 * -1380123965;
                                                                    int var1304 = var1303 ^ 175268750;
                                                                    float var1041 = this.K(var1200, var1040, var989, var1073, var11, var1304);
                                                                    var1112[var989] = var1041;
                                                                    switch (var715) {
                                                                        case 295831836:
                                                                            var715 ^= -259013100;
                                                                            break;
                                                                        case 480833642:
                                                                            var715 -= 1806689696;
                                                                            var715 |= 1947508934;
                                                                            var715 += -783584972;
                                                                            var715 += -1009556696;
                                                                            var715 ^= -179227737;
                                                                            break;
                                                                        case 2060431486:
                                                                        default:
                                                                            var715 ^= 622073037;
                                                                    }
                                                                }

                                                                Integer var1042 = var715;
                                                                if (var1042 == null) {
                                                                    break label1329;
                                                                }

                                                                boolean var1043 = var748.Gd();
                                                                var1094 = var17 + 1;
                                                                var1094 = var17 * var1094;
                                                                int var1201 = var17 + 2;
                                                                var1094 *= var1201;
                                                                int var1202 = var17 + 3;
                                                                var1094 *= var1202;
                                                                var1094 &= 7;
                                                                if (var1094 != 0) {
                                                                    var715 -= -1677011140;
                                                                    var715 <<= 29;
                                                                    var715 *= 1166459599;
                                                                    var715 ^= -1613182032;
                                                                    var715 ^= -143673221;
                                                                    break label1299;
                                                                }

                                                                var715 += 990214232;
                                                                var715 -= -703752632;
                                                                var715 &= 833238476;
                                                                var715 += 516032867;
                                                                var715 ^= -1201121167;
                                                                Integer var1118 = var715;
                                                                if (var1118 == null) {
                                                                    break label1329;
                                                                }

                                                                float var1045;
                                                                if (var1043) {
                                                                    var715 *= -186138933;
                                                                    var715 += -618025913;
                                                                    var715 *= 1749406517;
                                                                    var715 ^= 2077343915;
                                                                    Integer var1044 = var715;
                                                                    if (var1044 == null) {
                                                                        break label1329;
                                                                    }

                                                                    if (var989 == var804) {
                                                                        var715 = switch (var715) {
                                                                            default -> var715 ^ -987783469;
                                                                            case -137647162 -> var715 ^ -890128317;
                                                                            case 1746707886 -> {
                                                                                var715 <<= 1;
                                                                                var715 += -927573391;
                                                                                var715 ^= 1255323244;
                                                                                yield var715 ^ 1975157864;
                                                                            }
                                                                        };
                                                                        var1045 = 1.0F;
                                                                        switch (var715) {
                                                                            case -2115560432:
                                                                            default:
                                                                                var715 ^= 81087788;
                                                                                break;
                                                                            case -1484286007:
                                                                                var715 ^= 721137867;
                                                                                var715 *= -1317527337;
                                                                                var715 ^= 576900394;
                                                                                break;
                                                                            case 1474707294:
                                                                                var715 ^= 600903426;
                                                                        }
                                                                    } else {
                                                                        var715 += -413106630;
                                                                        var715 -= 1709932484;
                                                                        var715 ^= 1072340932;
                                                                        var715 |= 2033022490;
                                                                        var715 ^= -28180803;
                                                                        var1118 = var715;
                                                                        if (var1118 == null) {
                                                                            break label1329;
                                                                        }

                                                                        var1045 = 0.0F;
                                                                        var715 <<= 14;
                                                                        var715 ^= 2032685605;
                                                                        var715 ^= -133276255;
                                                                    }
                                                                } else {
                                                                    var715 &= 1101115144;
                                                                    var715 -= -1624564413;
                                                                    var715 ^= 637437937;
                                                                    var1045 = 0.72F;
                                                                    var715 |= 1866454947;
                                                                    var715 <<= 14;
                                                                    var715 -= -1224821946;
                                                                    var715 -= 729182435;
                                                                    var715 ^= 839865427;
                                                                }

                                                                int var1120 = var715 + 1;
                                                                var1120 = var715 * var1120;
                                                                int var1203 = var715 + 2;
                                                                var1120 *= var1203;
                                                                int var1204 = var715 + 3;
                                                                var1120 *= var1204;
                                                                var1120 &= 7;
                                                                if (var1120 != 0) {
                                                                    break label1329;
                                                                }

                                                                float[] var1125 = this.V;
                                                                var28 = var17;
                                                                long var30 = var28 + 1L;
                                                                var30 = var28 * var30;
                                                                var28 = var30 & 1L;
                                                                long var1483;
                                                                int var1207 = (var1483 = var28 - 0L) == 0L ? 0 : (var1483 < 0L ? -1 : 1);
                                                                if (var1207 != 0) {
                                                                    var715 *= 1449924669;
                                                                    var715 ^= -1878548033;
                                                                    break label1299;
                                                                }
                                                                var715 = switch (var715) {
                                                                    default -> var715 ^ -1544082432;
                                                                    case -1245904583 -> var715 ^ -1779571966;
                                                                    case 561500036 -> {
                                                                        var715 |= 496624997;
                                                                        var715 |= 256961483;
                                                                        yield var715 ^ -870525788;
                                                                    }
                                                                };
                                                                int var1208 = var715 + 1;
                                                                int var1209 = var715 * var1208;
                                                                int var1210 = var1209 & 1;
                                                                if (var1210 != 0) {
                                                                    break label1329;
                                                                }

                                                                boolean var1211 = this.xt;
                                                                float var1213;
                                                                if (var1211) {
                                                                    var715 &= -468802040;
                                                                    var715 ^= 1375370110;
                                                                    var715 ^= 759350892;
                                                                    Integer var1212 = var715;
                                                                    if (var1212 == null) {
                                                                        break label1329;
                                                                    }

                                                                    var1213 = var1045;
                                                                    var715 += -1317225558;
                                                                    var715 ^= -1758070443;
                                                                } else {
                                                                    var715 += 514161979;
                                                                    var715 ^= -408556764;
                                                                    float[] var1305 = this.V;
                                                                    float var1306 = var1305[var989];
                                                                    float[] var1346 = this.V;
                                                                    long var1379 = var17;
                                                                    long var33 = var1379 + 1L;
                                                                    var33 = var1379 * var33;
                                                                    var1379 = var33 & 1L;
                                                                    long var1484;
                                                                    int var1381 = (var1484 = var1379 - 0L) == 0L ? 0 : (var1484 < 0L ? -1 : 1);
                                                                    if (var1381 != 0) {
                                                                        var715 &= -1559422890;
                                                                        var715 *= -706459923;
                                                                        var715 ^= 536292881;
                                                                        break label1299;
                                                                    }

                                                                    var715 |= 809987092;
                                                                    var715 |= 2118433056;
                                                                    var715 *= -1809296895;
                                                                    var715 ^= 390096180;
                                                                    var1379 = var715;
                                                                    var33 = var1379 + 1L;
                                                                    var33 = var1379 * var33;
                                                                    var1379 = var33 & 1L;
                                                                    long var1485;
                                                                    int var1384 = (var1485 = var1379 - 0L) == 0L ? 0 : (var1485 < 0L ? -1 : 1);
                                                                    if (var1384 != 0) {
                                                                        break label1329;
                                                                    }

                                                                    float var1347 = var1346[var989];
                                                                    float var1348 = var1045 - var1347;
                                                                    float var1349 = var1348 * var914;
                                                                    float var1307 = var1306 + var1349;
                                                                    var1213 = var1307;
                                                                    var715 ^= -1124573165;
                                                                    var715 ^= 2037574912;
                                                                }

                                                                var1125[var989] = var1213;
                                                                var1120 = var989 + 1;
                                                                var28 = var17;
                                                                var30 = var28 + 1L;
                                                                var30 = var28 * var30;
                                                                var28 = var30 & 1L;
                                                                long var1486;
                                                                int var1216 = (var1486 = var28 - 0L) == 0L ? 0 : (var1486 < 0L ? -1 : 1);
                                                                if (var1216 != 0) {
                                                                    var715 *= 1629162561;
                                                                    var715 ^= 1914844091;
                                                                    var715 -= -168300370;
                                                                    var715 *= 1876094995;
                                                                    var715 ^= -35194561;
                                                                    break label1299;
                                                                }

                                                                var715 *= 431848213;
                                                                var715 *= 497858431;
                                                                var715 ^= 1666137934;
                                                                int var1217 = var715 + 1;
                                                                int var1218 = var715 * var1217;
                                                                int var1308 = var715 + 2;
                                                                int var1219 = var1218 * var1308;
                                                                var1308 = var715 + 3;
                                                                int var1220 = var1219 * var1308;
                                                                int var1221 = var1220 & 7;
                                                                if (var1221 != 0) {
                                                                    break label1329;
                                                                }

                                                                var989 = var1120;
                                                                var715 ^= 1474674545;
                                                                var715 *= 2108593037;
                                                                var715 += -1230121658;
                                                                var715 ^= -676522726;
                                                            }

                                                            var715 -= 1304811597;
                                                            var715 += 913227917;
                                                            var715 *= 918360827;
                                                            var715 ^= 1289896140;
                                                            Integer var866 = var715;
                                                            if (var866 == null) {
                                                                break label1329;
                                                            }

                                                            this.xt = false;
                                                            boolean var867 = var748.Gd();
                                                            int var915 = var17 + 1;
                                                            int var916 = var17 * var915;
                                                            int var990 = var17 + 2;
                                                            int var917 = var916 * var990;
                                                            int var991 = var17 + 3;
                                                            int var918 = var917 * var991;
                                                            int var919 = var918 & 7;
                                                            label1183:
                                                            if (var919 == 0) {
                                                                var715 &= -1442498158;
                                                                var715 <<= 2;
                                                                var715 -= -1063375472;
                                                                var715 ^= 1293749722;
                                                                Integer var920 = var715;
                                                                if (var920 == null) {
                                                                    break label1329;
                                                                }

                                                                label1220: {
                                                                    if (var867) {
                                                                        var715 -= 1417151779;
                                                                        var715 *= 488657959;
                                                                        var715 ^= 194574723;
                                                                        var715 |= -2001499485;
                                                                        var715 ^= 1027063684;
                                                                        var22 = var715;
                                                                        long var1127 = var22 + 1L;
                                                                        var1127 = var22 * var1127;
                                                                        var22 = var1127 & 1L;
                                                                        long var1487;
                                                                        int var870 = (var1487 = var22 - 0L) == 0L ? 0 : (var1487 < 0L ? -1 : 1);
                                                                        if (var870 != 0) {
                                                                            break label1329;
                                                                        }

                                                                        boolean var871 = Float.isNaN(var14);
                                                                        Integer var921 = var17;
                                                                        if (var921 == null) {
                                                                            var715 ^= 1629813194;
                                                                            var715 -= 1887206494;
                                                                            var715 ^= 199189076;
                                                                            break label1183;
                                                                        }

                                                                        var715 += 1520131691;
                                                                        var715 *= -1868731073;
                                                                        var715 *= 1207595367;
                                                                        var715 >>>= 25;
                                                                        var715 ^= 917899090;
                                                                        var23 = var715;
                                                                        var1127 = var23 + 1L;
                                                                        var1127 = var23 * var1127;
                                                                        var23 = var1127 & 1L;
                                                                        long var1488;
                                                                        int var924 = (var1488 = var23 - 0L) == 0L ? 0 : (var1488 < 0L ? -1 : 1);
                                                                        if (var924 != 0) {
                                                                            break label1329;
                                                                        }

                                                                        if (!var871) {
                                                                            var715 &= -267907452;
                                                                            var715 *= 1792142799;
                                                                            var715 |= -1397854712;
                                                                            var715 ^= 414950382;
                                                                            Integer var872 = var715;
                                                                            if (var872 == null) {
                                                                                break label1329;
                                                                            }

                                                                            var873 = true;
                                                                            switch (var715) {
                                                                                case -1492820506:
                                                                                    var715 ^= 1715650933;
                                                                                    var715 -= 2112781256;
                                                                                    var715 *= -98414373;
                                                                                    var715 ^= -1175626964;
                                                                                    break label1220;
                                                                                case -1035617874:
                                                                                    var715 ^= -1109372780;
                                                                                    break label1220;
                                                                                case 1456995951:
                                                                                default:
                                                                                    var715 ^= -140997922;
                                                                                    break label1220;
                                                                            }
                                                                        }

                                                                        var715 |= -941801803;
                                                                        var715 -= 1380985903;
                                                                        var715 += 1617092192;
                                                                        var715 ^= -663943244;
                                                                    } else {
                                                                        var715 *= 1471935525;
                                                                        var715 *= -666886773;
                                                                        var715 ^= -1430746604;
                                                                    }

                                                                    var23 = var715;
                                                                    long var1131 = var23 + 1L;
                                                                    var1131 = var23 * var1131;
                                                                    var23 = var1131 & 1L;
                                                                    long var1489;
                                                                    int var927 = (var1489 = var23 - 0L) == 0L ? 0 : (var1489 < 0L ? -1 : 1);
                                                                    if (var927 != 0) {
                                                                        break label1329;
                                                                    }

                                                                    var873 = false;
                                                                    var715 &= 1854530771;
                                                                    var715 += -338609721;
                                                                    var715 ^= -892617193;
                                                                    var715 += -151524606;
                                                                    var715 ^= 1133555093;
                                                                }

                                                                var23 = var715;
                                                                long var1133 = var23 + 1L;
                                                                var1133 = var23 * var1133;
                                                                long var1310 = var23 + 2L;
                                                                var1133 *= var1310;
                                                                var23 += 3L;
                                                                var1133 *= var23;
                                                                var23 = var1133 & 7L;
                                                                long var1490;
                                                                int var931 = (var1490 = var23 - 0L) == 0L ? 0 : (var1490 < 0L ? -1 : 1);
                                                                if (var931 != 0) {
                                                                    break label1329;
                                                                }

                                                                boolean var874 = var873;
                                                                var1.save();
                                                                float var932 = var7 - 6.0F;
                                                                float var992 = var9 + 12.0F;
                                                                var1.clip(var932, var8, var992, var10, 0.0F);
                                                                int var933 = var17 + 1;
                                                                int var934 = var17 * var933;
                                                                int var935 = var934 & 1;
                                                                if (var935 != 0) {
                                                                    var715 -= 685524630;
                                                                    var715 ^= 1913270019;
                                                                    var715 &= 1276631316;
                                                                    var715 ^= -928930865;
                                                                } else {
                                                                    var715 = switch (var715) {
                                                                        case -1449580923 -> {
                                                                            var715 >>>= 23;
                                                                            var715 ^= 2118881376;
                                                                            yield var715 ^ -503852295;
                                                                        }
                                                                        default -> var715 ^ -2101522817;
                                                                        case 2088595524 -> var715 ^ -1774581534;
                                                                    };
                                                                    Integer var936 = var715;
                                                                    if (var936 == null) {
                                                                        break label1329;
                                                                    }

                                                                    boolean var937 = var748.Gd();
                                                                    if (var937) {
                                                                        var715 = switch (var715) {
                                                                            case -1615051830 -> {
                                                                                var715 += 1981598380;
                                                                                var715 |= 2000334224;
                                                                                var715 &= -269572412;
                                                                                yield var715 ^ -1988439162;
                                                                            }
                                                                            default -> var715 ^ -437696709;
                                                                            case 960103106 -> var715 ^ 229063906;
                                                                        };
                                                                        if (var804 < 0) {
                                                                            var715 += -947385180;
                                                                            var715 ^= -180112420;
                                                                            int var938 = var715 + 1;
                                                                            int var939 = var715 * var938;
                                                                            int var940 = var939 & 1;
                                                                            if (var940 != 0) {
                                                                                break label1329;
                                                                            }

                                                                            int var941 = var715 - -965484776;
                                                                            int var942 = var941 >> 1;
                                                                            int var943 = var942 ^ -875753317;
                                                                            this.Ha(var1, var7, var840, 1.0F, var12, var943);
                                                                            switch (var715) {
                                                                                case 805262913:
                                                                                    var715 ^= -812653656;
                                                                                    break;
                                                                                case 1130050106:
                                                                                    var715 |= -1718995712;
                                                                                    var715 |= -1016992491;
                                                                                    var715 |= 736479209;
                                                                                    var715 ^= -2054775675;
                                                                                    break;
                                                                                case 1222005180:
                                                                                default:
                                                                                    var715 ^= 1610394312;
                                                                            }
                                                                        } else {
                                                                            var715 *= 1532199781;
                                                                            var715 |= 1811426173;
                                                                            var715 &= -1138871912;
                                                                            var715 ^= -765115806;
                                                                        }
                                                                    } else {
                                                                        switch (var715) {
                                                                            case -1615051830:
                                                                                var715 ^= 1170640381;
                                                                                var715 |= 415676895;
                                                                                var715 >>>= 16;
                                                                                var715 ^= 2121906564;
                                                                                break;
                                                                            case -1253997061:
                                                                            default:
                                                                                var715 ^= -1250923594;
                                                                                break;
                                                                            case 1060502743:
                                                                                var715 ^= 1108553964;
                                                                        }
                                                                    }

                                                                    byte var841 = 0;
                                                                    Integer var944 = var17;
                                                                    if (var944 == null) {
                                                                        var715 &= 428181721;
                                                                        var715 >>>= 10;
                                                                        var715 ^= -2001636469;
                                                                    } else {
                                                                        var715 -= -466475291;
                                                                        var715 ^= 264636627;
                                                                        int var945 = var715 + 1;
                                                                        int var946 = var715 * var945;
                                                                        int var993 = var715 + 2;
                                                                        int var947 = var946 * var993;
                                                                        int var994 = var715 + 3;
                                                                        int var948 = var947 * var994;
                                                                        int var949 = var948 & 7;
                                                                        if (var949 != 0) {
                                                                            break label1329;
                                                                        }

                                                                        int var842 = var841;
                                                                        var715 >>>= 23;
                                                                        var715 ^= -686370874;

                                                                        label1167:
                                                                        while (true) {
                                                                            if (var842 >= var783) {
                                                                                var715 *= -1907389195;
                                                                                var715 |= 878084722;
                                                                                var715 += 774644030;
                                                                                var715 ^= -1857533511;
                                                                                var17 = var715 + 1;
                                                                                var17 = var715 * var17;
                                                                                var17 &= 1;
                                                                                if (var17 == 0) {
                                                                                    var1.restore();
                                                                                    return;
                                                                                }
                                                                                break label1329;
                                                                            }
                                                                            var715 = switch (var715) {
                                                                                case -686371091 -> {
                                                                                    var715 >>= 30;
                                                                                    var715 *= 1608622779;
                                                                                    yield var715 ^ -1297933175;
                                                                                }
                                                                                case 1063086186 -> var715 ^ -125732285;
                                                                                default -> var715 ^ -1919603337;
                                                                            };
                                                                            var23 = var715;
                                                                            var1133 = var23 + 1L;
                                                                            var1133 = var23 * var1133;
                                                                            var23 = var1133 & 1L;
                                                                            long var1491;
                                                                            int var952 = (var1491 = var23 - 0L) == 0L ? 0 : (var1491 < 0L ? -1 : 1);
                                                                            if (var952 != 0) {
                                                                                break label1329;
                                                                            }

                                                                            float[] var953 = this.s;
                                                                            Integer var995 = var17;
                                                                            if (var995 == null) {
                                                                                var715 &= 537848541;
                                                                                var715 ^= -2000997625;
                                                                                break;
                                                                            }

                                                                            var715 *= 662796355;
                                                                            var715 ^= -594277212;
                                                                            int var996 = var715 + 1;
                                                                            int var997 = var715 * var996;
                                                                            int var998 = var997 & 1;
                                                                            if (var998 != 0) {
                                                                                break label1329;
                                                                            }

                                                                            float var954 = var953[var842];
                                                                            float var1046 = var954;
                                                                            float[] var955 = this.aS;
                                                                            float var956 = var955[var842];
                                                                            float var957 = var954 + var956;
                                                                            float var999 = var8 - 6.0F;
                                                                            float var1492;
                                                                            int var958 = (var1492 = var957 - var999) == 0.0F ? 0 : (var1492 < 0.0F ? -1 : 1);
                                                                            if (var958 >= 0) {
                                                                                var715 >>= 30;
                                                                                var715 += 31684259;
                                                                                var715 ^= 1097205293;
                                                                                var715 &= -1728741912;
                                                                                var715 ^= 1763389343;
                                                                                int var959 = var715 + 1;
                                                                                int var960 = var715 * var959;
                                                                                int var961 = var960 & 1;
                                                                                if (var961 != 0) {
                                                                                    break label1329;
                                                                                }

                                                                                float var962 = var8 + var10;
                                                                                float var963 = var962 + 6.0F;
                                                                                int var1000 = var17 + 1;
                                                                                int var1001 = var17 * var1000;
                                                                                int var1139 = var17 + 2;
                                                                                int var1002 = var1001 * var1139;
                                                                                int var1140 = var17 + 3;
                                                                                int var1003 = var1002 * var1140;
                                                                                int var1004 = var1003 & 7;
                                                                                if (var1004 != 0) {
                                                                                    switch (var715) {
                                                                                        case -469342171:
                                                                                            var715 ^= -1539645135;
                                                                                            break label1167;
                                                                                        case 574958464:
                                                                                        default:
                                                                                            var715 ^= 493236634;
                                                                                            break label1167;
                                                                                        case 1771986711:
                                                                                            var715 &= -484183480;
                                                                                            var715 *= 1557291833;
                                                                                            var715 ^= 1267544523;
                                                                                            break label1167;
                                                                                    }
                                                                                }
                                                                                var715 = switch (var715) {
                                                                                    default -> var715 ^ 1038312532;
                                                                                    case 801754790 -> var715 ^ -495162830;
                                                                                    case 1771986711 -> {
                                                                                        var715 <<= 6;
                                                                                        var715 >>>= 18;
                                                                                        yield var715 ^ -1611001608;
                                                                                    }
                                                                                };
                                                                                Integer var1005 = var715;
                                                                                if (var1005 == null) {
                                                                                    break label1329;
                                                                                }

                                                                                float var1493;
                                                                                int var964 = (var1493 = var954 - var963) == 0.0F
                                                                                    ? 0
                                                                                    : (var1493 < 0.0F ? -1 : 1);
                                                                                if (var964 > 0) {
                                                                                    var715 = switch (var715) {
                                                                                        case -1611003619 -> {
                                                                                            var715 += -1981641287;
                                                                                            var715 -= 557551437;
                                                                                            var715 += 1329199380;
                                                                                            yield var715 ^ -1938972103;
                                                                                        }
                                                                                        case -1006687150 -> var715 ^ -1556562288;
                                                                                        default -> var715 ^ 242578284;
                                                                                    };
                                                                                    int var974 = var715 + 1;
                                                                                    int var975 = var715 * var974;
                                                                                    int var1018 = var715 + 2;
                                                                                    int var976 = var975 * var1018;
                                                                                    int var1019 = var715 + 3;
                                                                                    int var977 = var976 * var1019;
                                                                                    int var978 = var977 & 7;
                                                                                    if (var978 != 0) {
                                                                                        break label1329;
                                                                                    }

                                                                                    var715 += 430463285;
                                                                                    var715 ^= -1625234544;
                                                                                } else {
                                                                                    var715 = switch (var715) {
                                                                                        case -1611003619 -> {
                                                                                            var715 ^= -375259126;
                                                                                            var715 >>>= 21;
                                                                                            var715 <<= 3;
                                                                                            var715 &= -898893913;
                                                                                            yield var715 ^ -367008220;
                                                                                        }
                                                                                        default -> var715 ^ 874863184;
                                                                                        case 1988030181 -> var715 ^ 275137572;
                                                                                    };
                                                                                    float var965 = var956 * 0.5F;
                                                                                    float var966 = var954 + var965;
                                                                                    Integer var1006 = var17;
                                                                                    if (var1006 == null) {
                                                                                        switch (var715) {
                                                                                            case -367004764:
                                                                                                var715 >>= 22;
                                                                                                var715 >>= 26;
                                                                                                var715 += -1550559488;
                                                                                                var715 ^= 723723572;
                                                                                                break label1167;
                                                                                            case 414564038:
                                                                                                var715 ^= 1223816998;
                                                                                                break label1167;
                                                                                            case 608724834:
                                                                                            default:
                                                                                                var715 ^= 1562153236;
                                                                                                break label1167;
                                                                                        }
                                                                                    }

                                                                                    var715 ^= 87947458;
                                                                                    var715 ^= -1785770402;
                                                                                    var715 ^= 705568264;
                                                                                    var1133 = var715;
                                                                                    var1310 = var1133 + 1L;
                                                                                    var1310 = var1133 * var1310;
                                                                                    long var1385 = var1133 + 2L;
                                                                                    var1310 *= var1385;
                                                                                    var1133 += 3L;
                                                                                    var1310 *= var1133;
                                                                                    var1133 = var1310 & 7L;
                                                                                    long var1494;
                                                                                    int var1007 = (var1494 = var1133 - 0L) == 0L ? 0 : (var1494 < 0L ? -1 : 1);
                                                                                    if (var1007 != 0) {
                                                                                        break label1329;
                                                                                    }

                                                                                    float var1008 = var8 - 4.0F;
                                                                                    float var1144 = var8 + 13.0F;
                                                                                    float var1009 = TP.N(var1008, var1144, var966);
                                                                                    float var1145 = var8 + var10;
                                                                                    float var1146 = var1145 - 15.0F;
                                                                                    float var1222 = var8 + var10;
                                                                                    var1222 += 4.0F;
                                                                                    float var1147 = TP.N(var1146, var1222, var966);
                                                                                    float var1148 = 1.0F - var1147;
                                                                                    float var1010 = var1009 * var1148;
                                                                                    float var1495;
                                                                                    int var1149 = (var1495 = var1010 - 0.01F) == 0.0F
                                                                                        ? 0
                                                                                        : (var1495 < 0.0F ? -1 : 1);
                                                                                    if (var1149 <= 0) {
                                                                                        var715 = switch (var715) {
                                                                                            default -> var715 ^ 1934755180;
                                                                                            case 1352882992 -> {
                                                                                                var715 >>= 20;
                                                                                                var715 *= 1002329715;
                                                                                                yield var715 ^ 1324834661;
                                                                                            }
                                                                                            case 2136128113 -> var715 ^ 1420877769;
                                                                                        };
                                                                                        int var1187 = var715 + 1;
                                                                                        int var1188 = var715 * var1187;
                                                                                        int var1189 = var1188 & 1;
                                                                                        if (var1189 != 0) {
                                                                                            break label1329;
                                                                                        }

                                                                                        var715 >>= 30;
                                                                                        var715 ^= 1688662807;
                                                                                        var715 *= -90659869;
                                                                                        var715 >>>= 19;
                                                                                        var715 ^= 1786647541;
                                                                                    } else {
                                                                                        var715 ^= -916905246;
                                                                                        var715 -= 501615203;
                                                                                        var715 >>= 21;
                                                                                        var715 += 909115632;
                                                                                        var715 ^= -69135197;
                                                                                        var1133 = var715;
                                                                                        var1310 = var1133 + 1L;
                                                                                        var1310 = var1133 * var1310;
                                                                                        var1133 = var1310 & 1L;
                                                                                        long var1496;
                                                                                        int var1152 = (var1496 = var1133 - 0L) == 0L
                                                                                            ? 0
                                                                                            : (var1496 < 0L ? -1 : 1);
                                                                                        if (var1152 != 0) {
                                                                                            break label1329;
                                                                                        }

                                                                                        hP_2 var1153 = var748.VP(var842);
                                                                                        Integer var1224 = var17;
                                                                                        if (var1224 == null) {
                                                                                            switch (var715) {
                                                                                                case -841936781:
                                                                                                    var715 |= -1703173004;
                                                                                                    var715 *= -787186565;
                                                                                                    var715 &= 153514164;
                                                                                                    var715 ^= 1223941429;
                                                                                                    var715 ^= -916390182;
                                                                                                    break label1167;
                                                                                                case -798966997:
                                                                                                    var715 ^= -363863427;
                                                                                                    break label1167;
                                                                                                case -249568911:
                                                                                                default:
                                                                                                    var715 ^= -1924135106;
                                                                                                    break label1167;
                                                                                            }
                                                                                        }
                                                                                        var715 = switch (var715) {
                                                                                            case -1164709119 -> var715 ^ -415673926;
                                                                                            case -841936781 -> {
                                                                                                var715 ^= 1971207064;
                                                                                                yield var715 ^ -1628028217;
                                                                                            }
                                                                                            default -> var715 ^ 818179166;
                                                                                        };
                                                                                        boolean var1154 = var1153.isBreak();
                                                                                        if (var1154) {
                                                                                            var715 &= 1783287144;
                                                                                            var715 ^= -18727442;
                                                                                            int var1179 = var715 + 1;
                                                                                            int var1180 = var715 * var1179;
                                                                                            int var1181 = var1180 & 1;
                                                                                            if (var1181 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float[] var1182 = this.V;
                                                                                            Integer var1280 = var17;
                                                                                            if (var1280 == null) {
                                                                                                switch (var715) {
                                                                                                    case -1389507218:
                                                                                                        var715 ^= -194805114;
                                                                                                        break label1167;
                                                                                                    case -592808762:
                                                                                                        var715 |= 2085893483;
                                                                                                        var715 ^= 1950942756;
                                                                                                        break label1167;
                                                                                                    case 934589798:
                                                                                                    default:
                                                                                                        var715 ^= 1391587760;
                                                                                                        break label1167;
                                                                                                }
                                                                                            }

                                                                                            var715 |= -1904882751;
                                                                                            var715 += -1745808625;
                                                                                            var715 *= -291472693;
                                                                                            var715 ^= -1321027259;
                                                                                            float var1183 = var1182[var842];
                                                                                            float var1497;
                                                                                            int var1184 = (var1497 = var1183 - 0.02F) == 0.0F
                                                                                                ? 0
                                                                                                : (var1497 < 0.0F ? -1 : 1);
                                                                                            if (var1184 > 0) {
                                                                                                var715 <<= 31;
                                                                                                var715 += -597520371;
                                                                                                var715 ^= 714566885;
                                                                                                float[] var1185 = this.V;
                                                                                                int var1281 = var17 + 1;
                                                                                                int var1282 = var17 * var1281;
                                                                                                int var1283 = var1282 & 1;
                                                                                                if (var1283 != 0) {
                                                                                                    var715 ^= -1297344496;
                                                                                                    var715 |= 1578115788;
                                                                                                    var715 *= -1996984611;
                                                                                                    var715 ^= -1337205689;
                                                                                                    break;
                                                                                                }

                                                                                                var715 -= -2140999319;
                                                                                                var715 *= -2120248603;
                                                                                                var715 ^= 2102279945;
                                                                                                var715 ^= 632590864;
                                                                                                long var1284 = var715;
                                                                                                long var1375 = var1284 + 1L;
                                                                                                var1375 = var1284 * var1375;
                                                                                                long var1435 = var1284 + 2L;
                                                                                                var1375 *= var1435;
                                                                                                long var1285 = var1284 + 3L;
                                                                                                var1375 *= var1285;
                                                                                                long var1286 = var1375 & 7L;
                                                                                                long var1498;
                                                                                                int var1287 = (var1498 = var1286 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1498 < 0L ? -1 : 1);
                                                                                                if (var1287 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                float var1186 = var1185[var842];
                                                                                                int var1288 = var715 - -461345399;
                                                                                                int var1289 = var1288 | -1427116027;
                                                                                                int var1290 = var1289 ^ 508642551;
                                                                                                this.Ha(var1, var7, var954, var1186, var12, var1290);
                                                                                                var715 ^= -260998367;
                                                                                                var715 += 1478550163;
                                                                                                var715 ^= -85304449;
                                                                                            } else {
                                                                                                var715 -= 173257361;
                                                                                                var715 -= -1345950352;
                                                                                                var715 >>>= 3;
                                                                                                var715 |= -122948378;
                                                                                                var715 ^= -1769607497;
                                                                                            }
                                                                                        } else {
                                                                                            var715 += 1491789943;
                                                                                            var715 <<= 14;
                                                                                            var715 |= 296309268;
                                                                                            var715 -= -1573662184;
                                                                                            var715 ^= 390262816;
                                                                                            var1133 = var715;
                                                                                            var1310 = var1133 + 1L;
                                                                                            var1310 = var1133 * var1310;
                                                                                            var1385 = var1133 + 2L;
                                                                                            var1310 *= var1385;
                                                                                            var1133 += 3L;
                                                                                            var1310 *= var1133;
                                                                                            var1133 = var1310 & 7L;
                                                                                            long var1499;
                                                                                            int var1158 = (var1499 = var1133 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1499 < 0L ? -1 : 1);
                                                                                            if (var1158 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            label1230: {
                                                                                                if (var874) {
                                                                                                    var715 ^= 644954193;
                                                                                                    var715 -= -294909564;
                                                                                                    var715 <<= 12;
                                                                                                    var715 ^= 438674502;
                                                                                                    float var1159 = var7 - 4.0F;
                                                                                                    int var1225 = var17 + 1;
                                                                                                    int var1226 = var17 * var1225;
                                                                                                    int var1227 = var1226 & 1;
                                                                                                    if (var1227 != 0) {
                                                                                                        var715 -= 15227606;
                                                                                                        var715 -= -2133925525;
                                                                                                        var715 -= 1663866001;
                                                                                                        var715 ^= 1532367039;
                                                                                                        break;
                                                                                                    }

                                                                                                    var715 &= -445680346;
                                                                                                    var715 ^= -729720061;
                                                                                                    Integer var1228 = var715;
                                                                                                    if (var1228 == null) {
                                                                                                        break label1329;
                                                                                                    }

                                                                                                    float var1500;
                                                                                                    int var1160 = (var1500 = var14 - var1159) == 0.0F
                                                                                                        ? 0
                                                                                                        : (var1500 < 0.0F ? -1 : 1);
                                                                                                    if (var1160 >= 0) {
                                                                                                        var715 *= 1869447363;
                                                                                                        var715 |= -482256343;
                                                                                                        var715 |= -322513894;
                                                                                                        var715 ^= -362348949;
                                                                                                        var715 ^= -74117685;
                                                                                                        float var1161 = var7 + var9;
                                                                                                        float var1162 = var1161 + 4.0F;
                                                                                                        float var1501;
                                                                                                        int var1163 = (var1501 = var14 - var1162) == 0.0F
                                                                                                            ? 0
                                                                                                            : (var1501 < 0.0F ? -1 : 1);
                                                                                                        Integer var1229 = var17;
                                                                                                        if (var1229 == null) {
                                                                                                            var715 <<= 14;
                                                                                                            var715 += -278600658;
                                                                                                            var715 *= -975096285;
                                                                                                            var715 ^= 1282233729;
                                                                                                            break;
                                                                                                        }

                                                                                                        var715 |= 2011356998;
                                                                                                        var715 |= -817776041;
                                                                                                        var715 <<= 20;
                                                                                                        var715 ^= -1891752118;
                                                                                                        Integer var1230 = var715;
                                                                                                        if (var1230 == null) {
                                                                                                            break label1329;
                                                                                                        }

                                                                                                        if (var1163 <= 0) {
                                                                                                            var715 += -1316527264;
                                                                                                            var715 -= 1127936039;
                                                                                                            var715 *= 878273795;
                                                                                                            var715 -= -2065303857;
                                                                                                            var715 ^= 993865283;
                                                                                                            float var1164 = var954 - 1.5F;
                                                                                                            float var1502;
                                                                                                            int var1165 = (var1502 = var15 - var1164) == 0.0F
                                                                                                                ? 0
                                                                                                                : (var1502 < 0.0F ? -1 : 1);
                                                                                                            long var1231 = var17;
                                                                                                            long var1352 = var1231 + 1L;
                                                                                                            var1352 = var1231 * var1352;
                                                                                                            long var1232 = var1352 & 1L;
                                                                                                            long var1503;
                                                                                                            int var1233 = (var1503 = var1232 - 0L) == 0L
                                                                                                                ? 0
                                                                                                                : (var1503 < 0L ? -1 : 1);
                                                                                                            if (var1233 != 0) {
                                                                                                                var715 *= 634194241;
                                                                                                                var715 -= 105702226;
                                                                                                                var715 ^= 1499690540;
                                                                                                                break;
                                                                                                            }

                                                                                                            var715 <<= 12;
                                                                                                            var715 += 318261302;
                                                                                                            var715 *= -206595089;
                                                                                                            var715 ^= 421789068;
                                                                                                            int var1234 = var715 + 1;
                                                                                                            int var1235 = var715 * var1234;
                                                                                                            int var1236 = var1235 & 1;
                                                                                                            if (var1236 != 0) {
                                                                                                                break label1329;
                                                                                                            }

                                                                                                            if (var1165 >= 0) {
                                                                                                                var715 |= 331831264;
                                                                                                                var715 -= 512530626;
                                                                                                                var715 += -1296520905;
                                                                                                                var715 ^= -536678885;
                                                                                                                Integer var1166 = var715;
                                                                                                                if (var1166 == null) {
                                                                                                                    break label1329;
                                                                                                                }

                                                                                                                float var1167 = var954 + var956;
                                                                                                                Integer var1237 = var17;
                                                                                                                if (var1237 == null) {
                                                                                                                    var715 &= 1289323074;
                                                                                                                    var715 += 2084239650;
                                                                                                                    var715 *= -679019619;
                                                                                                                    var715 ^= -1220988207;
                                                                                                                    break;
                                                                                                                }

                                                                                                                var715 ^= -87303583;
                                                                                                                var715 += -976248668;
                                                                                                                var715 |= 674381064;
                                                                                                                var715 ^= 1836823765;
                                                                                                                float var1504;
                                                                                                                int var1169 = (var1504 = var15 - ++var1167)
                                                                                                                        == 0.0F
                                                                                                                    ? 0
                                                                                                                    : (var1504 < 0.0F ? -1 : 1);
                                                                                                                if (var1169 < 0) {
                                                                                                                    var715 -= -1937083835;
                                                                                                                    var715 *= -554882601;
                                                                                                                    var715 ^= -689509354;
                                                                                                                    var1170 = true;
                                                                                                                    switch (var715) {
                                                                                                                        case -1889641949:
                                                                                                                            var715 ^= -764644013;
                                                                                                                            var715 -= 833737630;
                                                                                                                            var715 ^= 645891860;
                                                                                                                            break label1230;
                                                                                                                        case -1538439978:
                                                                                                                            var715 ^= 1969870175;
                                                                                                                            break label1230;
                                                                                                                        case 23286852:
                                                                                                                        default:
                                                                                                                            var715 ^= -843273693;
                                                                                                                            break label1230;
                                                                                                                    }
                                                                                                                }

                                                                                                                var715 ^= -547810332;
                                                                                                                var715 |= -1312484517;
                                                                                                                var715 ^= -412956987;
                                                                                                            } else {
                                                                                                                var715 ^= -1787283686;
                                                                                                                var715 += 396294140;
                                                                                                                var715 += -720546195;
                                                                                                                var715 <<= 30;
                                                                                                                var715 ^= 415178042;
                                                                                                            }
                                                                                                        } else {
                                                                                                            switch (var715) {
                                                                                                                case 1199901327:
                                                                                                                    var715 ^= 992676050;
                                                                                                                    break;
                                                                                                                case 1308492938:
                                                                                                                default:
                                                                                                                    var715 ^= 879498767;
                                                                                                                    break;
                                                                                                                case 2060330826:
                                                                                                                    var715 &= -967930944;
                                                                                                                    var715 <<= 27;
                                                                                                                    var715 ^= -1356173643;
                                                                                                                    var715 *= 536391363;
                                                                                                                    var715 ^= 911623397;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var715 *= -48383041;
                                                                                                        var715 >>>= 22;
                                                                                                        var715 &= 795829002;
                                                                                                        var715 ^= 1488919866;
                                                                                                    }
                                                                                                } else {
                                                                                                    var715 &= -1201286811;
                                                                                                    var715 |= 1041972836;
                                                                                                    var715 ^= -690034993;
                                                                                                    var715 -= -1610889452;
                                                                                                    var715 ^= 270077869;
                                                                                                }

                                                                                                Integer var1238 = var715;
                                                                                                if (var1238 == null) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                var1170 = false;
                                                                                                switch (var715) {
                                                                                                    case -1088719776:
                                                                                                    default:
                                                                                                        var715 ^= -365191071;
                                                                                                        break;
                                                                                                    case 1126936086:
                                                                                                        var715 ^= 872540444;
                                                                                                        break;
                                                                                                    case 1488919866:
                                                                                                        var715 -= -1231337982;
                                                                                                        var715 >>= 19;
                                                                                                        var715 ^= -1064758615;
                                                                                                        var715 <<= 19;
                                                                                                        var715 ^= 983030982;
                                                                                                }
                                                                                            }

                                                                                            int var1239 = var715 + 1;
                                                                                            int var1240 = var715 * var1239;
                                                                                            int var1241 = var1240 & 1;
                                                                                            if (var1241 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            long var1242 = var17;
                                                                                            long var1354 = var1242 + 1L;
                                                                                            var1354 = var1242 * var1354;
                                                                                            long var32 = var1242 + 2L;
                                                                                            var1354 *= var32;
                                                                                            long var1243 = var1242 + 3L;
                                                                                            var1354 *= var1243;
                                                                                            long var1244 = var1354 & 7L;
                                                                                            long var1505;
                                                                                            int var1245 = (var1505 = var1244 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1505 < 0L ? -1 : 1);
                                                                                            if (var1245 != 0) {
                                                                                                var715 ^= -1517500539;
                                                                                                var715 &= -1975859746;
                                                                                                var715 ^= 8745609;
                                                                                                break;
                                                                                            }

                                                                                            var715 &= -1190692409;
                                                                                            var715 ^= -1990637921;
                                                                                            long var1246 = var715;
                                                                                            var1354 = var1246 + 1L;
                                                                                            var1354 = var1246 * var1354;
                                                                                            long var1247 = var1354 & 1L;
                                                                                            long var1506;
                                                                                            int var1248 = (var1506 = var1247 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1506 < 0L ? -1 : 1);
                                                                                            if (var1248 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            if (var1170) {
                                                                                                var715 &= -53715218;
                                                                                                var715 >>= 17;
                                                                                                var715 ^= 96038999;
                                                                                                int var1249 = var715 + 1;
                                                                                                int var1250 = var715 * var1249;
                                                                                                int var1321 = var715 + 2;
                                                                                                int var1251 = var1250 * var1321;
                                                                                                int var1322 = var715 + 3;
                                                                                                int var1252 = var1251 * var1322;
                                                                                                int var1253 = var1252 & 7;
                                                                                                if (var1253 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                this.kS = var842;
                                                                                                var715 |= -1757879909;
                                                                                                var715 ^= -1936667901;
                                                                                            } else {
                                                                                                var715 += 1084928232;
                                                                                                var715 >>>= 27;
                                                                                                var715 += 43203051;
                                                                                                var715 <<= 30;
                                                                                                var715 ^= -1276232968;
                                                                                            }

                                                                                            Integer var1254 = var715;
                                                                                            if (var1254 == null) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float[] var1255 = this.V;
                                                                                            int var1323 = var17 + 1;
                                                                                            int var1324 = var17 * var1323;
                                                                                            int var1360 = var17 + 2;
                                                                                            int var1325 = var1324 * var1360;
                                                                                            int var1361 = var17 + 3;
                                                                                            int var1326 = var1325 * var1361;
                                                                                            int var1327 = var1326 & 7;
                                                                                            if (var1327 != 0) {
                                                                                                switch (var715) {
                                                                                                    case -1366699671:
                                                                                                    default:
                                                                                                        var715 ^= -1010992727;
                                                                                                        break label1167;
                                                                                                    case 34309796:
                                                                                                        var715 ^= -1003274092;
                                                                                                        break label1167;
                                                                                                    case 1944992504:
                                                                                                        var715 &= -1914887553;
                                                                                                        var715 |= 1121989121;
                                                                                                        var715 *= -1708824609;
                                                                                                        var715 ^= -1069754964;
                                                                                                        break label1167;
                                                                                                }
                                                                                            }

                                                                                            var715 -= 915843555;
                                                                                            var715 *= -321510083;
                                                                                            var715 ^= -1739452087;
                                                                                            var1222 = var1255[var842];
                                                                                            int var1328 = var842 - var804;
                                                                                            int var1329 = Math.abs(var1328);
                                                                                            float var1362;
                                                                                            if (var842 < var804) {
                                                                                                var715 += 1110482270;
                                                                                                var715 += 942362347;
                                                                                                var715 &= -765584092;
                                                                                                var715 -= -983633978;
                                                                                                var715 ^= -1838355814;
                                                                                                var1362 = 0.26F;
                                                                                                var715 += 1978416504;
                                                                                                var715 ^= 1024353028;
                                                                                                var715 += 391585319;
                                                                                                var715 ^= -716674121;
                                                                                            } else {
                                                                                                var715 = switch (var715) {
                                                                                                    default -> var715 ^ 391286830;
                                                                                                    case -869569239 -> var715 ^ 1217334852;
                                                                                                    case 1899072072 -> {
                                                                                                        var715 -= -1653488297;
                                                                                                        var715 ^= -1994272672;
                                                                                                        var715 &= -2027840442;
                                                                                                        var715 &= 862331381;
                                                                                                        yield var715 ^ -28735615;
                                                                                                    }
                                                                                                };
                                                                                                var1362 = 0.36F;
                                                                                                var715 |= -1219092285;
                                                                                                var715 |= 765564488;
                                                                                                var715 &= -1520757645;
                                                                                                var715 >>>= 21;
                                                                                                var715 ^= 633332702;
                                                                                            }

                                                                                            int var1387 = var715 + 1;
                                                                                            int var1388 = var715 * var1387;
                                                                                            int var1413 = var715 + 2;
                                                                                            int var1389 = var1388 * var1413;
                                                                                            int var1414 = var715 + 3;
                                                                                            int var1390 = var1389 * var1414;
                                                                                            int var1391 = var1390 & 7;
                                                                                            if (var1391 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float var1392 = 0.64F * var1222;
                                                                                            Integer var1415 = var17;
                                                                                            if (var1415 == null) {
                                                                                                switch (var715) {
                                                                                                    case -641659906:
                                                                                                    default:
                                                                                                        var715 ^= -1812568907;
                                                                                                        break label1167;
                                                                                                    case -605440265:
                                                                                                        var715 ^= 598515521;
                                                                                                        break label1167;
                                                                                                    case 633333492:
                                                                                                        var715 |= 1315625525;
                                                                                                        var715 ^= -414675650;
                                                                                                        break label1167;
                                                                                                }
                                                                                            }

                                                                                            var715 &= 1668646530;
                                                                                            var715 &= -1793094115;
                                                                                            var715 ^= -510556491;
                                                                                            int var1416 = var715 + 1;
                                                                                            int var1417 = var715 * var1416;
                                                                                            int var1418 = var1417 & 1;
                                                                                            if (var1418 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float var1363 = var1362 + var1392;
                                                                                            float var1393;
                                                                                            if (var1170) {
                                                                                                var715 = switch (var715) {
                                                                                                    case -1666479931 -> var715 ^ 1254990327;
                                                                                                    case -528219979 -> {
                                                                                                        var715 &= 515867153;
                                                                                                        yield var715 ^ 1221008557;
                                                                                                    }
                                                                                                    default -> var715 ^ 301421130;
                                                                                                };
                                                                                                var1393 = 0.22F;
                                                                                                var715 *= 1383728853;
                                                                                                var715 >>>= 13;
                                                                                                var715 |= -1334097809;
                                                                                                var715 ^= 1043059303;
                                                                                            } else {
                                                                                                var715 &= 1495718084;
                                                                                                var715 &= -1888522529;
                                                                                                var715 &= 1309085786;
                                                                                                var715 *= -50078301;
                                                                                                var715 ^= 453679245;
                                                                                                var1393 = 0.0F;
                                                                                                switch (var715) {
                                                                                                    case -1647764330:
                                                                                                    default:
                                                                                                        var715 ^= -1658832348;
                                                                                                        break;
                                                                                                    case -214012428:
                                                                                                        var715 ^= 156668030;
                                                                                                        break;
                                                                                                    case 1837537421:
                                                                                                        var715 -= -925689500;
                                                                                                        var715 |= 230178286;
                                                                                                        var715 ^= 602883447;
                                                                                                }
                                                                                            }

                                                                                            float var1364 = var1363 + var1393;
                                                                                            boolean var1394 = var748.Gd();
                                                                                            var32 = var17;
                                                                                            long var34 = var32 + 1L;
                                                                                            var34 = var32 * var34;
                                                                                            var32 = var34 & 1L;
                                                                                            long var1507;
                                                                                            int var1421 = (var1507 = var32 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1507 < 0L ? -1 : 1);
                                                                                            if (var1421 != 0) {
                                                                                                var715 *= 106475781;
                                                                                                var715 *= 1421510539;
                                                                                                var715 |= 1781796354;
                                                                                                var715 ^= 1716034913;
                                                                                                break;
                                                                                            }

                                                                                            var715 &= -1638905926;
                                                                                            var715 += -291419238;
                                                                                            var715 ^= -1225406417;
                                                                                            var32 = var715;
                                                                                            var34 = var32 + 1L;
                                                                                            var34 = var32 * var34;
                                                                                            long var36 = var32 + 2L;
                                                                                            var34 *= var36;
                                                                                            var32 += 3L;
                                                                                            var34 *= var32;
                                                                                            var32 = var34 & 7L;
                                                                                            long var1508;
                                                                                            int var1425 = (var1508 = var32 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1508 < 0L ? -1 : 1);
                                                                                            if (var1425 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float var1335;
                                                                                            if (var1394) {
                                                                                                var715 &= 68763931;
                                                                                                var715 >>= 9;
                                                                                                var715 ^= -1796844914;
                                                                                                var715 += -1100320225;
                                                                                                var715 ^= 514769102;
                                                                                                Integer var1395 = var715;
                                                                                                if (var1395 == null) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                float var1396 = 1.0F - var1222;
                                                                                                float var1330 = var1329;
                                                                                                Integer var1426 = var17;
                                                                                                if (var1426 == null) {
                                                                                                    var715 *= -1542249959;
                                                                                                    var715 ^= -1861492640;
                                                                                                    break;
                                                                                                }
                                                                                                var715 = switch (var715) {
                                                                                                    case -1041465969 -> var715 ^ 967261133;
                                                                                                    case 1308492899 -> {
                                                                                                        var715 &= -1533326509;
                                                                                                        var715 &= -395778270;
                                                                                                        yield var715 ^ -499778095;
                                                                                                    }
                                                                                                    default -> var715 ^ -120043398;
                                                                                                };
                                                                                                float var1331 = 0.42F * var1330;
                                                                                                float var1332 = Math.min(1.25F, var1331);
                                                                                                float var1333 = var1396 * var1332;
                                                                                                float var1401;
                                                                                                if (var1170) {
                                                                                                    var715 &= -506826887;
                                                                                                    var715 *= -1759042417;
                                                                                                    var715 >>>= 8;
                                                                                                    var715 -= 2090982385;
                                                                                                    var715 ^= -629927656;
                                                                                                    var1385 = var715;
                                                                                                    long var1439 = var1385 + 1L;
                                                                                                    var1439 = var1385 * var1439;
                                                                                                    long var35 = var1385 + 2L;
                                                                                                    var1439 *= var35;
                                                                                                    var1385 += 3L;
                                                                                                    var1439 *= var1385;
                                                                                                    var1385 = var1439 & 7L;
                                                                                                    long var1509;
                                                                                                    int var1400 = (var1509 = var1385 - 0L) == 0L
                                                                                                        ? 0
                                                                                                        : (var1509 < 0L ? -1 : 1);
                                                                                                    if (var1400 != 0) {
                                                                                                        break label1329;
                                                                                                    }

                                                                                                    var1401 = 0.3F;
                                                                                                    var715 -= 1248897290;
                                                                                                    var715 |= -1911666865;
                                                                                                    var715 ^= -778100815;
                                                                                                } else {
                                                                                                    var715 = switch (var715) {
                                                                                                        default -> var715 ^ -298790961;
                                                                                                        case -499253805 -> {
                                                                                                            var715 &= 701684855;
                                                                                                            var715 ^= -1435773534;
                                                                                                            var715 *= 1983870315;
                                                                                                            yield var715 ^ -1578932713;
                                                                                                        }
                                                                                                        case -106148636 -> var715 ^ 604615976;
                                                                                                    };
                                                                                                    var32 = var715;
                                                                                                    var34 = var32 + 1L;
                                                                                                    var34 = var32 * var34;
                                                                                                    var36 = var32 + 2L;
                                                                                                    var34 *= var36;
                                                                                                    var32 += 3L;
                                                                                                    var34 *= var32;
                                                                                                    var32 = var34 & 7L;
                                                                                                    long var1510;
                                                                                                    int var1430 = (var1510 = var32 - 0L) == 0L
                                                                                                        ? 0
                                                                                                        : (var1510 < 0L ? -1 : 1);
                                                                                                    if (var1430 != 0) {
                                                                                                        break label1329;
                                                                                                    }

                                                                                                    var1401 = 1.0F;
                                                                                                    var715 ^= -808560185;
                                                                                                    var715 += -666502520;
                                                                                                    var715 &= 99024270;
                                                                                                    var715 ^= 1339065836;
                                                                                                }

                                                                                                Integer var1431 = var715;
                                                                                                if (var1431 == null) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                float var1334 = var1333 * var1401;
                                                                                                Integer var1402 = var17;
                                                                                                if (var1402 == null) {
                                                                                                    var715 *= 16404201;
                                                                                                    var715 *= -1407304013;
                                                                                                    var715 |= -1249306072;
                                                                                                    var715 ^= 2132732209;
                                                                                                    break;
                                                                                                }

                                                                                                var715 -= 2006585233;
                                                                                                var715 ^= -1364955162;
                                                                                                Integer var1403 = var715;
                                                                                                if (var1403 == null) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                var1335 = var1334;
                                                                                                var715 *= -1609016359;
                                                                                                var715 ^= 529114251;
                                                                                                var715 ^= 1575626028;
                                                                                            } else {
                                                                                                var715 = switch (var715) {
                                                                                                    case -905673187 -> {
                                                                                                        var715 >>= 29;
                                                                                                        yield var715 ^ -964400561;
                                                                                                    }
                                                                                                    case 1711909866 -> var715 ^ -1966224271;
                                                                                                    default -> var715 ^ 1872896280;
                                                                                                };
                                                                                                var1335 = 0.0F;
                                                                                                switch (var715) {
                                                                                                    case -1582027640:
                                                                                                    default:
                                                                                                        var715 ^= -111220336;
                                                                                                        break;
                                                                                                    case -388081179:
                                                                                                        var715 ^= 448691311;
                                                                                                        break;
                                                                                                    case 964400561:
                                                                                                        var715 *= -721795941;
                                                                                                        var715 &= -836681586;
                                                                                                        var715 *= 1909392141;
                                                                                                        var715 >>>= 22;
                                                                                                        var715 ^= -1350251846;
                                                                                                }
                                                                                            }

                                                                                            int var1404 = var715 + 1;
                                                                                            int var1405 = var715 * var1404;
                                                                                            int var1406 = var1405 & 1;
                                                                                            if (var1406 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            var1222 = 0.045F * var1222;
                                                                                            Integer var1407 = var17;
                                                                                            if (var1407 == null) {
                                                                                                var715 -= -1712067266;
                                                                                                var715 ^= -1658344019;
                                                                                                break;
                                                                                            }

                                                                                            var715 += 1799901199;
                                                                                            var715 -= -1655295065;
                                                                                            var715 &= 2085202243;
                                                                                            var715 ^= 80626917;
                                                                                            var1222 = 0.955F + var1222;
                                                                                            var1.save();
                                                                                            if (var1170) {
                                                                                                var715 = switch (var715) {
                                                                                                    default -> var715 ^ 724535639;
                                                                                                    case 762406126 -> var715 ^ -1203202089;
                                                                                                    case 2022632677 -> {
                                                                                                        var715 |= -765242408;
                                                                                                        var715 += 1845260572;
                                                                                                        var715 &= -2128431832;
                                                                                                        var715 -= -703454647;
                                                                                                        yield var715 ^ -1553841273;
                                                                                                    }
                                                                                                };
                                                                                                float var1171 = var7 - 4.0F;
                                                                                                float var1408 = var954 - 1.5F;
                                                                                                float var1432 = var9 + 8.0F;
                                                                                                float var1075 = var956 + 3.0F;
                                                                                                int var1443 = var17 + 1;
                                                                                                var1443 = var17 * var1443;
                                                                                                var1443 &= 1;
                                                                                                if (var1443 != 0) {
                                                                                                    switch (var715) {
                                                                                                        case -1989391048:
                                                                                                            var715 ^= 461785886;
                                                                                                            var715 &= -51162955;
                                                                                                            var715 |= 73731300;
                                                                                                            var715 ^= 475037487;
                                                                                                            break label1167;
                                                                                                        case 834481502:
                                                                                                            var715 ^= 231416782;
                                                                                                            break label1167;
                                                                                                        case 1208946731:
                                                                                                        default:
                                                                                                            var715 ^= 1141790504;
                                                                                                            break label1167;
                                                                                                    }
                                                                                                }

                                                                                                var715 |= 1100975318;
                                                                                                var715 += 723216805;
                                                                                                var715 ^= 1524438746;
                                                                                                long var1446 = var715;
                                                                                                long var1460 = var1446 + 1L;
                                                                                                var1460 = var1446 * var1460;
                                                                                                long var37 = var1446 + 2L;
                                                                                                var1460 *= var37;
                                                                                                long var1447 = var1446 + 3L;
                                                                                                var1460 *= var1447;
                                                                                                long var1448 = var1460 & 7L;
                                                                                                long var1511;
                                                                                                var1443 = (var1511 = var1448 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1511 < 0L ? -1 : 1);
                                                                                                if (var1443 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                var1.roundRect(
                                                                                                    var1171, var1408, var1432, var1075, 4.5F, 318767103
                                                                                                );
                                                                                                switch (var715) {
                                                                                                    case -1345969799:
                                                                                                        var715 ^= -729863157;
                                                                                                        var715 *= -918873735;
                                                                                                        var715 ^= -103470546;
                                                                                                        break;
                                                                                                    case 2036037354:
                                                                                                        var715 ^= -1224423201;
                                                                                                        break;
                                                                                                    case 2087309224:
                                                                                                    default:
                                                                                                        var715 ^= -205366210;
                                                                                                }
                                                                                            } else {
                                                                                                var715 += -1090793965;
                                                                                                var715 ^= -430773196;
                                                                                            }

                                                                                            var26 = var715;
                                                                                            var1385 = var26 + 1L;
                                                                                            var1385 = var26 * var1385;
                                                                                            long var1450 = var26 + 2L;
                                                                                            var1385 *= var1450;
                                                                                            var26 += 3L;
                                                                                            var1385 *= var26;
                                                                                            var26 = var1385 & 7L;
                                                                                            long var1512;
                                                                                            int var1079 = (var1512 = var26 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1512 < 0L ? -1 : 1);
                                                                                            if (var1079 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            float var1080 = Math.min(1.0F, var1364);
                                                                                            float var1011 = var1080 * var1010;
                                                                                            var1.alpha(var1011);
                                                                                            float var1513;
                                                                                            int var1012 = (var1513 = var1335 - 0.05F) == 0.0F
                                                                                                ? 0
                                                                                                : (var1513 < 0.0F ? -1 : 1);
                                                                                            int var1081 = var17 + 1;
                                                                                            int var1082 = var17 * var1081;
                                                                                            int var1083 = var1082 & 1;
                                                                                            if (var1083 != 0) {
                                                                                                var715 >>= 19;
                                                                                                var715 &= -1700323408;
                                                                                                var715 -= 1995758795;
                                                                                                var715 ^= -1425715538;
                                                                                                break;
                                                                                            }

                                                                                            var715 &= -827691335;
                                                                                            var715 ^= -284734132;
                                                                                            var26 = var715;
                                                                                            var1354 = var26 + 1L;
                                                                                            var1354 = var26 * var1354;
                                                                                            var26 = var1354 & 1L;
                                                                                            long var1514;
                                                                                            int var1086 = (var1514 = var26 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1514 < 0L ? -1 : 1);
                                                                                            if (var1086 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            if (var1012 > 0) {
                                                                                                var715 = switch (var715) {
                                                                                                    default -> var715 ^ -678748812;
                                                                                                    case -521535889 -> var715 ^ -843539213;
                                                                                                    case 797903812 -> {
                                                                                                        var715 ^= -360320207;
                                                                                                        var715 <<= 18;
                                                                                                        var715 -= 1963540836;
                                                                                                        yield var715 ^ -1675965168;
                                                                                                    }
                                                                                                };
                                                                                                var1.blur(var1335);
                                                                                                switch (var715) {
                                                                                                    case -221219956:
                                                                                                        var715 ^= -254777825;
                                                                                                        var715 += 1297085924;
                                                                                                        var715 -= 402894444;
                                                                                                        var715 >>= 11;
                                                                                                        var715 ^= -1906174218;
                                                                                                        break;
                                                                                                    case 19282967:
                                                                                                    default:
                                                                                                        var715 ^= -745089680;
                                                                                                        break;
                                                                                                    case 794505790:
                                                                                                        var715 ^= -1333524502;
                                                                                                }
                                                                                            } else {
                                                                                                var715 |= -275805516;
                                                                                                var715 -= -165310686;
                                                                                                var715 ^= 1997341615;
                                                                                            }

                                                                                            var26 = var715;
                                                                                            var1310 = var26 + 1L;
                                                                                            var1310 = var26 * var1310;
                                                                                            var26 = var1310 & 1L;
                                                                                            long var1515;
                                                                                            int var1013 = (var1515 = var26 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1515 < 0L ? -1 : 1);
                                                                                            if (var1013 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            var1.scale(var1222, var7, var966);
                                                                                            Integer var967 = var17;
                                                                                            if (var967 == null) {
                                                                                                switch (var715) {
                                                                                                    case -1905983619:
                                                                                                        var715 &= -338691238;
                                                                                                        var715 += 564422852;
                                                                                                        var715 ^= 1520680871;
                                                                                                        var715 ^= 2046666864;
                                                                                                        break label1167;
                                                                                                    case -1778221013:
                                                                                                        var715 ^= 1481540061;
                                                                                                        break label1167;
                                                                                                    case -1291479840:
                                                                                                    default:
                                                                                                        var715 ^= -1773094771;
                                                                                                        break label1167;
                                                                                                }
                                                                                            }

                                                                                            var715 |= 2069780823;
                                                                                            var715 |= 674818661;
                                                                                            var715 -= -1116661854;
                                                                                            var715 &= 1360142523;
                                                                                            var715 ^= 942204305;
                                                                                            var23 = var715;
                                                                                            var26 = var23 + 1L;
                                                                                            var26 = var23 * var26;
                                                                                            var23 = var26 & 1L;
                                                                                            long var1516;
                                                                                            int var970 = (var1516 = var23 - 0L) == 0L
                                                                                                ? 0
                                                                                                : (var1516 < 0L ? -1 : 1);
                                                                                            if (var970 != 0) {
                                                                                                break label1329;
                                                                                            }

                                                                                            String[][] var971 = this.cu;
                                                                                            String[] var972 = var971[var842];
                                                                                            String[] var973 = var972;
                                                                                            TextStyle var1014 = this.Z;
                                                                                            float var1015 = var1014.size();
                                                                                            float var1016 = var1015 * 1.16F;
                                                                                            float var1017 = var1016;
                                                                                            byte var1091 = 0;
                                                                                            int var1092 = var1091;

                                                                                            var715 = switch (var715) {
                                                                                                case 1612428598 -> var715 ^ 183327130;
                                                                                                case 2015937800 -> {
                                                                                                    var715 *= 64311953;
                                                                                                    var715 |= -891087884;
                                                                                                    var715 <<= 31;
                                                                                                    var715 &= -981506398;
                                                                                                    yield var715 ^ 463604059;
                                                                                                }
                                                                                                default -> var715 ^ 1907928519;
                                                                                            };

                                                                                            label1127:
                                                                                            while (true) {
                                                                                                int var1172 = var973.length;
                                                                                                long var1259 = var17;
                                                                                                var1354 = var1259 + 1L;
                                                                                                var1354 = var1259 * var1354;
                                                                                                var32 = var1259 + 2L;
                                                                                                var1354 *= var32;
                                                                                                long var1260 = var1259 + 3L;
                                                                                                var1354 *= var1260;
                                                                                                long var1261 = var1354 & 7L;
                                                                                                long var1517;
                                                                                                int var1262 = (var1517 = var1261 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1517 < 0L ? -1 : 1);
                                                                                                if (var1262 != 0) {
                                                                                                    switch (var715) {
                                                                                                        case -110080268:
                                                                                                        default:
                                                                                                            var715 ^= -1516350654;
                                                                                                            break label1167;
                                                                                                        case 463604059:
                                                                                                            var715 ^= 1986649786;
                                                                                                            var715 &= -816785770;
                                                                                                            var715 <<= 25;
                                                                                                            var715 ^= -2001243189;
                                                                                                            break label1167;
                                                                                                        case 698418953:
                                                                                                            var715 ^= 80751685;
                                                                                                            break label1167;
                                                                                                    }
                                                                                                }

                                                                                                var715 &= -584591064;
                                                                                                var715 &= 855103150;
                                                                                                var715 ^= 276043707;
                                                                                                int var1263 = var715 + 1;
                                                                                                int var1264 = var715 * var1263;
                                                                                                int var1338 = var715 + 2;
                                                                                                int var1265 = var1264 * var1338;
                                                                                                int var1339 = var715 + 3;
                                                                                                int var1266 = var1265 * var1339;
                                                                                                int var1267 = var1266 & 7;
                                                                                                if (var1267 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                if (var1092 >= var1172) {
                                                                                                    var715 >>>= 6;
                                                                                                    var715 *= -1492969641;
                                                                                                    var715 -= -188422971;
                                                                                                    var715 ^= -1333314018;
                                                                                                    var1.restore();
                                                                                                    switch (var715) {
                                                                                                        case -470318339:
                                                                                                            var715 ^= 626069721;
                                                                                                            break label1127;
                                                                                                        case 893233971:
                                                                                                            var715 ^= -1653597932;
                                                                                                            var715 |= 833819698;
                                                                                                            var715 += 1846850433;
                                                                                                            var715 ^= 1114272241;
                                                                                                            break label1127;
                                                                                                        case 953601878:
                                                                                                        default:
                                                                                                            var715 ^= 1545433434;
                                                                                                            break label1127;
                                                                                                    }
                                                                                                }

                                                                                                var715 *= -32261503;
                                                                                                var715 ^= 1659915126;
                                                                                                var715 ^= -2044932111;
                                                                                                var715 += -993492821;
                                                                                                var715 ^= 1869942572;
                                                                                                var1133 = var715;
                                                                                                var1310 = var1133 + 1L;
                                                                                                var1310 = var1133 * var1310;
                                                                                                var1133 = var1310 & 1L;
                                                                                                long var1518;
                                                                                                int var1175 = (var1518 = var1133 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1518 < 0L ? -1 : 1);
                                                                                                if (var1175 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                String var1176 = var973[var1092];
                                                                                                var1222 = var1092;
                                                                                                var1222 *= var1017;
                                                                                                var1222 = var1046 + var1222;
                                                                                                TextStyle var1342 = this.Z;
                                                                                                float var1177 = var1.text(var1176, var7, var1222, var1342);
                                                                                                int var1178 = var1092 + 1;
                                                                                                long var1271 = var17;
                                                                                                var1354 = var1271 + 1L;
                                                                                                var1354 = var1271 * var1354;
                                                                                                var32 = var1271 + 2L;
                                                                                                var1354 *= var32;
                                                                                                long var1272 = var1271 + 3L;
                                                                                                var1354 *= var1272;
                                                                                                long var1273 = var1354 & 7L;
                                                                                                long var1519;
                                                                                                int var1274 = (var1519 = var1273 - 0L) == 0L
                                                                                                    ? 0
                                                                                                    : (var1519 < 0L ? -1 : 1);
                                                                                                if (var1274 != 0) {
                                                                                                    var715 |= 2041499061;
                                                                                                    var715 |= -1185152607;
                                                                                                    var715 *= 1844582795;
                                                                                                    var715 ^= 2127194582;
                                                                                                    break label1167;
                                                                                                }

                                                                                                var715 += 791538360;
                                                                                                var715 ^= -410474737;
                                                                                                var715 += -1302325377;
                                                                                                var715 -= -1695642157;
                                                                                                var715 ^= -282172417;
                                                                                                int var1275 = var715 + 1;
                                                                                                int var1276 = var715 * var1275;
                                                                                                int var1343 = var715 + 2;
                                                                                                int var1277 = var1276 * var1343;
                                                                                                int var1344 = var715 + 3;
                                                                                                int var1278 = var1277 * var1344;
                                                                                                int var1279 = var1278 & 7;
                                                                                                if (var1279 != 0) {
                                                                                                    break label1329;
                                                                                                }

                                                                                                var1092 = var1178;
                                                                                                var715 ^= -1847294791;
                                                                                                var715 *= 500476837;
                                                                                                var715 ^= 510534389;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var715 *= -1279270481;
                                                                                var715 >>= 9;
                                                                                var715 -= -564605547;
                                                                                var715 ^= 1270774347;
                                                                            }

                                                                            int var979 = var842 + 1;
                                                                            int var1020 = var17 + 1;
                                                                            int var1021 = var17 * var1020;
                                                                            int var1047 = var17 + 2;
                                                                            int var1022 = var1021 * var1047;
                                                                            int var1048 = var17 + 3;
                                                                            int var1023 = var1022 * var1048;
                                                                            int var1024 = var1023 & 7;
                                                                            if (var1024 != 0) {
                                                                                var715 &= -265053169;
                                                                                var715 += -1491231886;
                                                                                var715 <<= 27;
                                                                                var715 ^= 1341063682;
                                                                                var715 ^= 525889993;
                                                                                break;
                                                                            }
                                                                            var715 = switch (var715) {
                                                                                default -> var715 ^ 1591252459;
                                                                                case 1005699004 -> var715 ^ -1040438496;
                                                                                case 1786648649 -> {
                                                                                    var715 += 562405830;
                                                                                    var715 &= 1421633956;
                                                                                    var715 >>>= 24;
                                                                                    var715 += 851322505;
                                                                                    yield var715 ^ 830234011;
                                                                                }
                                                                            };
                                                                            Integer var1025 = var715;
                                                                            if (var1025 == null) {
                                                                                break label1329;
                                                                            }

                                                                            var842 = var979;
                                                                            var715 >>= 20;
                                                                            var715 *= -395546115;
                                                                            var715 *= 860090571;
                                                                            var715 ^= -1488169047;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                switch (var715) {
                                                                    case -902306205:
                                                                        var715 ^= 1824991277;
                                                                        break;
                                                                    case 1101037371:
                                                                    default:
                                                                        var715 ^= 717536208;
                                                                        break;
                                                                    case 1885977996:
                                                                        var715 -= -488625019;
                                                                        var715 *= -1534170089;
                                                                        var715 *= -1481215321;
                                                                        var715 += -1831501587;
                                                                        var715 ^= 1204169535;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                long var725 = var715;
                var18 = var725 + 1L;
                var18 = var725 * var18;
                long var726 = var18 & 1L;
                long var1520;
                var715 = (var1520 = var726 - 0L) == 0L ? 0 : (var1520 < 0L ? -1 : 1);
                if (var715 == 0) {
                    IllegalStateException var729 = new IllegalStateException();
                    throw var729;
                }
                break label1329;
            }

            int var733 = var715 & -293979358;
            var733 -= 670583166;
            var733 ^= 873778867;
            var733 <<= 22;
            var733 ^= -220157258;
            this.w(var1, var3, var2, var7, var8, var9, var10, var12, var733);
            return;
        }

        IllegalArgumentException var728 = new IllegalArgumentException();
        throw var728;
    }

    public int nn() {
        int var1 = dQ;
        var1 ^= 800900547;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.sZ;
        var1 ^= var3;
        var1 ^= 1468362197;
        var3 = of_2.k;
        var1 ^= var3;
        var1 ^= 793857101;
        if (var2 != 0) {
            var1 &= -1176181352;
            var1 |= -329388762;
            var1 ^= 1445046814;
            Integer var17 = var1;
            if (var17 == null) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        } else {
            switch (var1) {
                case -1526441850:
                    var1 += -2001134742;
                    var1 ^= 1600538636;
                    break;
                case -416747756:
                default:
                    var1 ^= -1512313026;
                    break;
                case 611750970:
                    var1 ^= 1031522707;
            }

            return this.kS;
        }
    }

    public boolean Y(float var1, float var2) {
        boolean var83 = false;
        label136: {
            int var3 = dQ;
            var3 ^= -1191067067;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var142;
            int var86 = (var142 = var5 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
            if (var86 != 0) {
                switch (var3) {
                    case -2122454475:
                    default:
                        var3 ^= 1426614367;
                        break;
                    case -1226405897:
                        var3 ^= -1510442763;
                        break;
                    case 867786496:
                        var3 <<= 31;
                        var3 ^= -873444861;
                }
            } else {
                label148: {
                    label131: {
                        var3 >>>= 12;
                        var3 &= -1459204520;
                        var3 &= -1353166572;
                        var3 ^= 1275152722;
                        float var87 = this.I;
                        float var88 = var87 - 6.0F;
                        float var143;
                        int var89 = (var143 = var1 - var88) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
                        if (var89 >= 0) {
                            var3 *= -1121423201;
                            var3 &= 1553333821;
                            var3 += -1964141489;
                            var3 -= 1570028560;
                            var3 ^= -1165704587;
                            int var90 = var3 + 1;
                            int var91 = var3 * var90;
                            int var6 = var3 + 2;
                            int var92 = var91 * var6;
                            var6 = var3 + 3;
                            int var93 = var92 * var6;
                            int var94 = var93 & 7;
                            if (var94 != 0) {
                                break label136;
                            }

                            float var95 = this.I;
                            float var115 = this.n;
                            float var96 = var95 + var115;
                            long var116 = var4;
                            long var8 = var116 + 1L;
                            var8 = var116 * var8;
                            long var117 = var8 & 1L;
                            long var144;
                            var6 = (var144 = var117 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                switch (var3) {
                                    case -1668244791:
                                        var3 ^= 911156472;
                                        break label148;
                                    case -941689842:
                                        var3 |= -893877747;
                                        var3 -= -480692272;
                                        var3 ^= 659944508;
                                        break label148;
                                    case 842769579:
                                    default:
                                        var3 ^= -1688132118;
                                        break label148;
                                }
                            }

                            var3 += -100097711;
                            var3 |= -1259829637;
                            var3 |= 1260838139;
                            var3 ^= -212310542;
                            Integer var119 = var3;
                            if (var119 == null) {
                                break label136;
                            }

                            float var97 = var96 + 6.0F;
                            float var145;
                            int var98 = (var145 = var1 - var97) == 0.0F ? 0 : (var145 < 0.0F ? -1 : 1);
                            if (var98 <= 0) {
                                var3 = switch (var3) {
                                    default -> var3 ^ 1740881563;
                                    case -568081224 -> var3 ^ 365388566;
                                    case 213367309 -> {
                                        var3 += 37455922;
                                        var3 *= -866138507;
                                        var3 >>>= 29;
                                        var3 -= 1988568525;
                                        yield var3 ^ 1245504946;
                                    }
                                };
                                Integer var99 = var3;
                                if (var99 == null) {
                                    break label136;
                                }

                                float var100 = this.e;
                                long var120 = var4;
                                var8 = var120 + 1L;
                                var8 = var120 * var8;
                                long var121 = var8 & 1L;
                                long var146;
                                int var122 = (var146 = var121 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                                if (var122 != 0) {
                                    var3 |= 27142044;
                                    var3 -= 837807954;
                                    var3 ^= -1014298504;
                                    var3 |= 2045490119;
                                    var3 ^= -1340100108;
                                    break label148;
                                }
                                var3 = switch (var3) {
                                    case -1018937461 -> {
                                        var3 ^= -610021532;
                                        var3 += -87495687;
                                        var3 ^= 1301976919;
                                        var3 |= 60528060;
                                        yield var3 ^ -1485141349;
                                    }
                                    default -> var3 ^ -2138787632;
                                    case 1419468028 -> var3 ^ 839966985;
                                };
                                long var123 = var3;
                                var8 = var123 + 1L;
                                var8 = var123 * var8;
                                long var124 = var8 & 1L;
                                long var147;
                                var122 = (var147 = var124 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                                if (var122 != 0) {
                                    break label136;
                                }

                                float var148;
                                int var101 = (var148 = var2 - var100) == 0.0F ? 0 : (var148 < 0.0F ? -1 : 1);
                                if (var101 >= 0) {
                                    var3 -= 470650431;
                                    var3 -= 1583430277;
                                    var3 -= 1370577628;
                                    var3 ^= -1145517695;
                                    float var102 = this.e;
                                    float var126 = this.Qv;
                                    float var103 = var102 + var126;
                                    float var149;
                                    int var104 = (var149 = var2 - var103) == 0.0F ? 0 : (var149 < 0.0F ? -1 : 1);
                                    Integer var77 = var4;
                                    if (var77 == null) {
                                        var3 += -327809540;
                                        var3 ^= 1216328706;
                                        break label148;
                                    }
                                    var3 = switch (var3) {
                                        case -1759905787 -> {
                                            var3 -= 761194855;
                                            var3 >>>= 30;
                                            var3 -= 108184506;
                                            var3 |= 1446143025;
                                            yield var3 ^ -1732019544;
                                        }
                                        default -> var3 ^ -1183395454;
                                        case -197591559 -> var3 ^ -1199616448;
                                    };
                                    var77 = var3;
                                    if (var77 == null) {
                                        break label136;
                                    }

                                    if (var104 <= 0) {
                                        var3 |= 1563517717;
                                        var3 >>= 7;
                                        var3 &= -2018692195;
                                        var3 *= -309203299;
                                        var3 ^= 368423260;
                                        long var79 = var3;
                                        long var127 = var79 + 1L;
                                        long var128 = var79 * var127;
                                        var8 = var79 + 2L;
                                        long var129 = var128 * var8;
                                        long var80 = var79 + 3L;
                                        long var130 = var129 * var80;
                                        long var81 = var130 & 7L;
                                        long var150;
                                        int var82 = (var150 = var81 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                                        if (var82 != 0) {
                                            break label136;
                                        }

                                        var83 = true;
                                        switch (var3) {
                                            case -1488240502:
                                            default:
                                                var3 ^= -1939097771;
                                                break label131;
                                            case -1098733787:
                                                var3 |= -734702648;
                                                var3 &= 617668242;
                                                var3 &= 16770653;
                                                var3 ^= 1476893764;
                                                break label131;
                                            case 501478168:
                                                var3 ^= -510266386;
                                                break label131;
                                        }
                                    }

                                    var3 += 1254592248;
                                    var3 <<= 13;
                                    var3 += -1508448941;
                                    var3 ^= 489973431;
                                } else {
                                    var3 += -978713250;
                                    var3 <<= 12;
                                    var3 ^= -1337097244;
                                }
                            } else {
                                var3 ^= -1626231094;
                                var3 ^= -1773947101;
                            }
                        } else {
                            var3 |= 1732709648;
                            var3 >>>= 9;
                            var3 ^= 97648706;
                        }

                        Integer var105 = var3;
                        if (var105 == null) {
                            break label136;
                        }

                        var83 = false;
                        var3 <<= 17;
                        var3 += -1493360793;
                        var3 |= 668439438;
                        var3 *= 520450923;
                        var3 ^= 1949593505;
                    }

                    int var106 = var3 + 1;
                    int var107 = var3 * var106;
                    var3 = var107 & 1;
                    if (var3 == 0) {
                        return var83;
                    }
                    break label136;
                }
            }

            int var108 = var3 + 1;
            int var109 = var3 * var108;
            int var131 = var3 + 2;
            int var110 = var109 * var131;
            var131 = var3 + 3;
            int var111 = var110 * var131;
            int var112 = var111 & 7;
            if (var112 == 0) {
                AssertionError var113 = new AssertionError();
                throw var113;
            }
        }

        IllegalStateException var76 = new IllegalStateException();
        throw var76;
    }

    private void w(Canvas var1, String var2, be_2 var3, float var4, float var5, float var6, float var7, double var8, int var10) {
        boolean var136 = false;
        int var12 = System.identityHashCode(this);
        int var13 = var12 + 1;
        var13 = var12 * var13;
        var13 &= 1;
        if (var13 != 0) {
            int var113 = var10 & -1471567654;
            var113 -= -601487007;
            var113 &= -1327304551;
            var113 ^= 2015503455;
            var113 ^= -1565953680;
        } else {
            label167: {
                int var11 = var10 - -1502308467;
                var11 ^= 1147865150;
                var13 = var11 + 1;
                var13 = var11 * var13;
                int var14 = var11 + 2;
                var13 *= var14;
                var14 = var11 + 3;
                var13 *= var14;
                var13 &= 7;
                label133:
                if (var13 == 0) {
                    if (var2 != null) {
                        var11 *= 1779787433;
                        var11 ^= 1709501978;
                        var11 ^= -813731654;
                        Integer var132 = var11;
                        if (var132 == null) {
                            break label133;
                        }

                        boolean var133 = var2.isEmpty();
                        Integer var149 = var12;
                        if (var149 == null) {
                            var11 -= 1571357982;
                            var11 |= -1519021957;
                            var11 += 978139554;
                            var11 *= -675826061;
                            var11 ^= 1885832505;
                            break label167;
                        }
                        var11 = switch (var11) {
                            default -> var11 ^ -1363624222;
                            case -1585147249 -> {
                                var11 |= -1521668437;
                                var11 += 181275813;
                                var11 >>>= 8;
                                var11 *= -2058269385;
                                yield var11 ^ 1158815057;
                            }
                            case 812074986 -> var11 ^ 1233025847;
                        };
                        int var150 = var11 + 1;
                        var150 = var11 * var150;
                        var150 &= 1;
                        if (var150 != 0) {
                            break label133;
                        }

                        if (!var133) {
                            label143: {
                                var11 ^= 1435055126;
                                var11 <<= 6;
                                var11 &= 1073686947;
                                var11 ^= -1350267866;
                                if (var3 != null) {
                                    var11 |= -857833264;
                                    var11 &= 578800024;
                                    var11 |= -841541224;
                                    var11 -= 493553354;
                                    var11 ^= 1167918032;
                                    BA var134 = var3.state();
                                    BA var153 = BA.LOADING;
                                    Integer var15 = var12;
                                    if (var15 == null) {
                                        switch (var11) {
                                            case -1905872814:
                                                var11 ^= 185873580;
                                                break label167;
                                            case -150367970:
                                                var11 >>>= 28;
                                                var11 ^= 1514784049;
                                                break label167;
                                            case 1874832418:
                                            default:
                                                var11 ^= 504710524;
                                                break label167;
                                        }
                                    }
                                    var11 = switch (var11) {
                                        case -2038342552 -> var11 ^ 581253422;
                                        default -> var11 ^ 1266828133;
                                        case -150367970 -> {
                                            var11 -= -816707066;
                                            var11 |= 1532684655;
                                            var11 ^= -30639124;
                                            yield var11 ^ 619924703;
                                        }
                                    };
                                    if (var134 == var153) {
                                        var11 -= 260849888;
                                        var11 >>= 7;
                                        var11 ^= -2131760631;
                                        var132 = var11;
                                        if (var132 == null) {
                                            break label133;
                                        }

                                        var136 = true;
                                        switch (var11) {
                                            case -1803062145:
                                                var11 ^= 83179999;
                                                break label143;
                                            case 2010489016:
                                            default:
                                                var11 ^= -466451334;
                                                break label143;
                                            case 2143601447:
                                                var11 -= 1837607703;
                                                var11 &= -68364052;
                                                var11 += 1346652320;
                                                var11 ^= -1272992092;
                                                break label143;
                                        }
                                    }

                                    var11 ^= 824622334;
                                    var11 >>= 7;
                                    var11 -= 1165455705;
                                    var11 *= 839450607;
                                    var11 ^= -1940764167;
                                } else {
                                    var11 |= -1738958503;
                                    var11 &= -566332344;
                                    var11 ^= 341430305;
                                }

                                var136 = false;
                                switch (var11) {
                                    case -1905793943:
                                        var11 ^= 1203604309;
                                        var11 *= 116256037;
                                        var11 *= -309377849;
                                        var11 += -647218410;
                                        var11 ^= -1973303346;
                                        break;
                                    case -1447772313:
                                        var11 ^= -1049640667;
                                        break;
                                    case -70512549:
                                    default:
                                        var11 ^= -1273120860;
                                }
                            }

                            Integer var154 = var11;
                            if (var154 == null) {
                                break label133;
                            }

                            long var155 = var12;
                            long var16 = var155 + 1L;
                            var16 = var155 * var16;
                            long var156 = var16 & 1L;
                            long var178;
                            int var157 = (var178 = var156 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                            if (var157 != 0) {
                                var11 -= 832678028;
                                var11 ^= -866569698;
                                var11 ^= 148654815;
                                var11 += 1942196536;
                                var11 ^= -1907938353;
                                break label167;
                            }
                            var11 = switch (var11) {
                                case -697315836 -> {
                                    var11 |= 1666237261;
                                    var11 |= -952013928;
                                    yield var11 ^ 1410663844;
                                }
                                default -> var11 ^ -1023608671;
                                case 2134619196 -> var11 ^ 1652447078;
                            };
                            float var144;
                            if (var136) {
                                var11 = switch (var11) {
                                    case -1553274247 -> {
                                        var11 >>= 5;
                                        var11 &= -403048837;
                                        var11 -= -1344413439;
                                        yield var11 ^ -1042940708;
                                    }
                                    default -> var11 ^ 2147188308;
                                    case 917081142 -> var11 ^ 506039583;
                                };
                                double var137 = var8 * 4.0;
                                double var138 = Math.sin(var137);
                                double var139 = 0.5 * var138;
                                double var140 = 0.5 + var139;
                                float var141 = (float)var140;
                                float var142 = 0.45F * var141;
                                float var143 = 0.55F + var142;
                                Integer var158 = var12;
                                if (var158 == null) {
                                    var11 *= 604232345;
                                    var11 >>= 15;
                                    var11 &= 1015240305;
                                    var11 ^= 1514788110;
                                    break label167;
                                }
                                var11 = switch (var11) {
                                    case -185693810 -> {
                                        var11 >>= 21;
                                        var11 |= 802211661;
                                        var11 >>>= 23;
                                        var11 ^= -421893293;
                                        yield var11 ^ -1867812143;
                                    }
                                    default -> var11 ^ -1090545869;
                                    case 2086836023 -> var11 ^ 1630912950;
                                };
                                long var159 = var11;
                                var16 = var159 + 1L;
                                var16 = var159 * var16;
                                long var160 = var16 & 1L;
                                long var179;
                                int var161 = (var179 = var160 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                                if (var161 != 0) {
                                    break label133;
                                }

                                var144 = var143;
                                var11 -= 1846907986;
                                var11 ^= -233524543;
                            } else {
                                var11 ^= -1905665403;
                                var11 -= -2100556598;
                                var11 += -521258749;
                                var11 ^= 2096505438;
                                var11 ^= 1331661126;
                                long var162 = var11;
                                var16 = var162 + 1L;
                                var16 = var162 * var16;
                                long var163 = var16 & 1L;
                                long var180;
                                var157 = (var180 = var163 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                                if (var157 != 0) {
                                    break label133;
                                }

                                var144 = 1.0F;
                                var11 *= 1630276363;
                                var11 ^= 1418927908;
                                var11 ^= 1250969359;
                                var11 <<= 19;
                                var11 ^= 745486058;
                            }

                            Integer var165 = var11;
                            if (var165 != null) {
                                TextStyle var166 = this.a;
                                float var167 = var1.measure(var2, var166);
                                var1.save();
                                var1.alpha(var144);
                                float var145 = var6 - var167;
                                float var146 = var145 * 0.5F;
                                float var147 = var4 + var146;
                                TextStyle var168 = this.a;
                                float var169 = var168.size();
                                int var171 = var12 + 1;
                                var171 = var12 * var171;
                                var12 = var171 & 1;
                                if (var12 == 0) {
                                    var11 ^= 1138489093;
                                    var11 += -1416665320;
                                    var11 <<= 28;
                                    var11 ^= -1246621968;
                                    float var120 = var7 - var169;
                                    float var121 = var120 * 0.5F;
                                    float var122 = var5 + var121;
                                    TextStyle var170 = this.a;
                                    float var123 = var1.text(var2, var147, var122, var170);
                                    var1.restore();
                                    return;
                                }

                                var11 &= -847703141;
                                var11 ^= -1845438540;
                                break label167;
                            }
                            break label133;
                        }

                        var11 *= 429893247;
                        var11 -= 58846474;
                        var11 ^= -1318951043;
                    } else {
                        var11 -= 903047526;
                        var11 &= 886833891;
                        var11 *= 2128440037;
                        var11 |= -1827095738;
                        var11 ^= 1056963088;
                    }

                    return;
                }

                RuntimeException var124 = new RuntimeException();
                throw var124;
            }
        }

        UnsupportedOperationException var118 = new UnsupportedOperationException();
        throw var118;
    }

    private void Ha(Canvas var1, float var2, float var3, float var4, double var5, int var7) {
        label80: {
            int var9 = System.identityHashCode(this);
            float var10 = TP.S(var4);
            int var11 = var9 + 1;
            var11 = var9 * var11;
            var11 &= 1;
            int var17;
            if (var11 != 0) {
                var17 = var7 << 10;
                var17 ^= 319930180;
            } else {
                var17 = var7 + 322752967;
                var17 ^= -1982964830;
                var17 |= -776212158;
                var17 |= 464725584;
                var17 ^= -1140419822;
                long var65 = var17;
                long var13 = var65 + 1L;
                var13 = var65 * var13;
                long var15 = var65 + 2L;
                var13 *= var15;
                long var66 = var65 + 3L;
                var13 *= var66;
                long var67 = var13 & 7L;
                long var127;
                var11 = (var127 = var67 - 0L) == 0L ? 0 : (var127 < 0L ? -1 : 1);
                if (var11 != 0) {
                    break label80;
                }

                var10 = 1.45F * var10;
                float var61 = var10;
                float var128;
                var11 = (var128 = var10 - 0.05F) == 0.0F ? 0 : (var128 < 0.0F ? -1 : 1);
                if (var11 < 0) {
                    var17 &= -2089115231;
                    var17 ^= -1922899047;
                    long var75 = var17;
                    var13 = var75 + 1L;
                    var13 = var75 * var13;
                    long var76 = var13 & 1L;
                    long var129;
                    var11 = (var129 = var76 - 0L) == 0L ? 0 : (var129 < 0L ? -1 : 1);
                    if (var11 == 0) {
                        return;
                    }
                    break label80;
                }

                var17 >>= 19;
                var17 &= 1964919034;
                var17 ^= -220147450;
                var11 = var17 + 1;
                var11 = var17 * var11;
                var11 &= 1;
                if (var11 != 0) {
                    break label80;
                }

                int var73 = 0;
                long var12 = var9;
                long var14 = var12 + 1L;
                var14 = var12 * var14;
                var12 = var14 & 1L;
                long var130;
                int var79 = (var130 = var12 - 0L) == 0L ? 0 : (var130 < 0L ? -1 : 1);
                if (var79 == 0) {
                    var17 += 2038708502;
                    var17 <<= 31;
                    var17 += -982110302;
                    var17 ^= -1046460634;
                    int var80 = var17 + 1;
                    int var81 = var17 * var80;
                    int var108 = var17 + 2;
                    int var82 = var81 * var108;
                    int var109 = var17 + 3;
                    int var83 = var82 * var109;
                    int var84 = var83 & 7;
                    if (var84 != 0) {
                        break label80;
                    }

                    var73 = var73;
                    var17 >>>= 25;
                    var17 |= -143470112;
                    var17 *= -2115227519;
                    var17 *= -176732113;
                    var17 ^= -346967385;

                    while (true) {
                        int var85 = var17 + 1;
                        int var86 = var17 * var85;
                        int var87 = var86 & 1;
                        if (var87 != 0) {
                            break label80;
                        }

                        if (var73 >= 3) {
                            var17 *= -450606977;
                            var17 ^= -1357001397;
                            return;
                        }
                        var17 = switch (var17) {
                            case -173783591 -> {
                                var17 ^= 245147273;
                                var17 |= -698630754;
                                var17 ^= 745216376;
                                yield var17 ^ 1405900868;
                            }
                            case 14189884 -> var17 ^ 120904508;
                            default -> var17 ^ 130135405;
                        };
                        var12 = var17;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var131;
                        int var90 = (var131 = var12 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                        if (var90 != 0) {
                            break label80;
                        }

                        double var91 = var5 * 3.2;
                        double var118 = var73;
                        double var119 = var118 * 0.7;
                        double var92 = var91 - var119;
                        double var93 = Math.sin(var92);
                        double var94 = 0.5 * var93;
                        double var95 = 0.5 + var94;
                        float var96 = (float)var95;
                        float var110 = 0.35F * var96;
                        float var111 = 0.75F + var110;
                        float var112 = var61 * var111;
                        float var120 = var2 + 1.6F;
                        float var124 = var73;
                        float var125 = var124 * 5.2F;
                        float var121 = var120 + var125;
                        float var126 = var3 + 3.5F;
                        float var97 = 0.6F * var96;
                        float var98 = 0.35F + var97;
                        float var99 = var98 * var4;
                        int var100 = DP.Y(-1, var99);
                        var1.circle(var121, var126, var112, var100);
                        var12 = var9;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var132;
                        int var103 = (var132 = var12 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                        if (var103 != 0) {
                            var17 ^= 773710874;
                            var17 &= 25592906;
                            var17 ^= 1866754651;
                            var17 ^= -2043544233;
                            break;
                        }
                        var17 = switch (var17) {
                            case -2133016862 -> {
                                var17 |= 915479451;
                                yield var17 ^ 1254048930;
                            }
                            default -> var17 ^ 1390750334;
                            case -69561464 -> var17 ^ -1125906042;
                        };
                        int var104 = var73 + 1;
                        var73 = var104;
                        var17 -= 1256051107;
                        var17 ^= 1143041135;
                    }
                } else {
                    var17 |= -682569791;
                    var17 += -1927951351;
                    var17 *= -1185957567;
                    var17 ^= -743723462;
                }
            }

            var9 = var17 + 1;
            var9 = var17 * var9;
            int var62 = var17 + 2;
            var9 *= var62;
            var17 += 3;
            var9 *= var17;
            var17 = var9 & 7;
            if (var17 == 0) {
                RuntimeException var52 = new RuntimeException();
                throw var52;
            }
        }

        IllegalStateException var55 = new IllegalStateException();
        throw var55;
    }

    private float K(float var1, float var2, int var3, float var4, float var5, int var6) {
        int var9 = System.identityHashCode(this);
        float var10 = 2.0F / var4;
        float var11 = var10 * var5;
        float var12 = 1.0F + var11;
        float var13 = 0.48F * var11;
        var13 *= var11;
        var12 += var13;
        var13 = 0.235F * var11;
        var13 *= var11;
        var11 = var13 * var11;
        var11 = var12 + var11;
        long var41 = var9;
        long var14 = var41 + 1L;
        var14 = var41 * var14;
        long var16 = var41 + 2L;
        var14 *= var16;
        long var42 = var41 + 3L;
        var14 *= var42;
        long var43 = var14 & 7L;
        long var52;
        var9 = (var52 = var43 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
        if (var9 != 0) {
            int var23 = var6 + 1620251622;
            var23 -= 59306134;
            var23 ^= -63711133;
            UnsupportedOperationException var32 = new UnsupportedOperationException();
            throw var32;
        } else {
            int var7 = var6 + 1397351005;
            var7 ^= 166099559;
            Integer var19 = var3;
            if (var19 == null) {
                UnsupportedOperationException var22 = new UnsupportedOperationException();
                throw var22;
            } else {
                float var20 = 1.0F / var11;
                float var8 = var1 - var2;
                float[] var28 = this.Mp;
                float var29 = var28[var3];
                var11 = var10 * var8;
                float var30 = var29 + var11;
                float var31 = var30 * var5;
                float[] var39 = this.Mp;
                float[] var44 = this.Mp;
                var12 = var44[var3];
                var10 *= var31;
                var10 = var12 - var10;
                var10 *= var20;
                var39[var3] = var10;
                var8 += var31;
                float var21 = var8 * var20;
                return var2 + var21;
            }
        }
    }

    private void U(Canvas var1, Za var2, float var3, int var4) {
        label283: {
            int var6 = System.identityHashCode(this);
            Integer var7 = var6;
            if (var7 == null) {
                switch (var4) {
                    case 1068712198:
                        int var25 = var4 ^ 159184783;
                        break;
                    case 1169284973:
                    default:
                        int var24 = var4 ^ 293634339;
                        break;
                    case 2077288220:
                        int var5 = var4 & 1919399091;
                        var5 |= -1544241999;
                        var5 -= -173357962;
                        var5 ^= 597789306;
                }
            } else {
                label303: {
                    int var30 = switch (var4) {
                        case -1743939282 -> var4 ^ 171494209;
                        default -> var4 ^ 910263212;
                        case 2077288220 -> {
                            int var26 = var4 * -288063183;
                            var26 >>>= 4;
                            var26 += 1780547906;
                            var26 <<= 25;
                            yield var26 ^ 1957322175;
                        }
                    };
                    int var203 = var30 + 1;
                    var203 = var30 * var203;
                    int var8 = var30 + 2;
                    var203 *= var8;
                    var8 = var30 + 3;
                    var203 *= var8;
                    var203 &= 7;
                    if (var203 != 0) {
                        break label283;
                    }

                    Za var208 = this.mF;
                    if (var2 == var208) {
                        var30 -= 23868687;
                        var30 *= 62295675;
                        var30 -= 1168710513;
                        var30 ^= -405691115;
                        float var209 = this.pw;
                        float var210 = var3 - var209;
                        float var211 = Math.abs(var210);
                        var8 = var6 + 1;
                        var8 = var6 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            switch (var30) {
                                case -1275000323:
                                default:
                                    var30 ^= 1788742720;
                                    break label303;
                                case 355972106:
                                    var30 ^= -1105064739;
                                    var30 ^= 1996343958;
                                    break label303;
                                case 2020686767:
                                    var30 ^= -1184126538;
                                    break label303;
                            }
                        }

                        var30 |= -1515915554;
                        var30 >>>= 8;
                        var30 += -225602779;
                        var30 &= 444565304;
                        var30 ^= -1209163274;
                        float var372;
                        var203 = (var372 = var211 - 0.01F) == 0.0F ? 0 : (var372 < 0.0F ? -1 : 1);
                        if (var203 < 0) {
                            var30 *= -809380951;
                            var30 -= 586483737;
                            var30 -= -1589617945;
                            var30 ^= -1853266895;
                            long var213 = var30;
                            long var9 = var213 + 1L;
                            var9 = var213 * var9;
                            long var11 = var213 + 2L;
                            var9 *= var11;
                            long var214 = var213 + 3L;
                            var9 *= var214;
                            long var215 = var9 & 7L;
                            long var373;
                            var203 = (var373 = var215 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                            if (var203 == 0) {
                                return;
                            }
                            break label283;
                        }

                        switch (var30) {
                            case -1515281682:
                                var30 |= -494209674;
                                var30 |= -190937906;
                                var30 -= -769208721;
                                var30 ^= -1656803393;
                                break;
                            case -1228281320:
                            default:
                                var30 ^= 877367728;
                                break;
                            case -965805290:
                                var30 ^= 496551152;
                        }
                    } else {
                        var30 ^= 972244534;
                        var30 ^= 2080251321;
                    }

                    long var217 = var30;
                    long var248 = var217 + 1L;
                    var248 = var217 * var248;
                    long var218 = var248 & 1L;
                    long var374;
                    var203 = (var374 = var218 - 0L) == 0L ? 0 : (var374 < 0L ? -1 : 1);
                    if (var203 != 0) {
                        break label283;
                    }

                    Za var220 = this.mF;
                    var8 = var6 + 1;
                    var8 = var6 * var8;
                    var8 &= 1;
                    if (var8 == 0) {
                        var30 = switch (var30) {
                            default -> var30 ^ -277561972;
                            case -1197013456 -> {
                                var30 -= 1486411047;
                                var30 *= -143753685;
                                var30 &= -1597092324;
                                yield var30 ^ -797368969;
                            }
                            case 902058466 -> var30 ^ -1713897564;
                        };
                        Integer var235 = var30;
                        if (var235 == null) {
                            break label283;
                        }

                        int var221;
                        if (var2 == var220) {
                            var30 ^= 1068752852;
                            var30 += -692788336;
                            var30 ^= 1107795857;
                            var221 = 1;
                            var30 &= -286359070;
                            var30 ^= 548752059;
                            var30 ^= 932144504;
                        } else {
                            var30 *= -1130304675;
                            var30 ^= 1148494541;
                            var221 = 0;
                            var30 *= 1388303649;
                            var30 += -609251152;
                            var30 &= 1132136010;
                            var30 ^= 308815907;
                        }

                        int var236 = var30 + 1;
                        var236 = var30 * var236;
                        var236 &= 1;
                        if (var236 != 0) {
                            break label283;
                        }

                        this.mF = var2;
                        this.pw = var3;
                        var236 = var2.o();
                        int var250 = var6 + 1;
                        int var251 = var6 * var250;
                        int var10 = var6 + 2;
                        int var252 = var251 * var10;
                        var10 = var6 + 3;
                        int var253 = var252 * var10;
                        int var254 = var253 & 7;
                        if (var254 != 0) {
                            var30 += 967098400;
                            var30 ^= -1856201536;
                        } else {
                            label288: {
                                var30 &= -1451038909;
                                var30 &= -2097075620;
                                var30 ^= 1833087530;
                                int var240 = var236;
                                String[][] var255 = new String[var236][];
                                this.cu = var255;
                                float[] var256 = new float[var236];
                                this.On = var256;
                                float[] var257 = new float[var236];
                                this.aS = var257;
                                TextStyle var258 = this.Z;
                                float var259 = var258.size();
                                float var260 = var259 * 1.16F;
                                float var261 = var260;
                                float var271 = 0.0F;
                                int var274 = 0;
                                float var272 = var271;
                                var274 = var274;
                                var30 += 69817327;
                                var30 += -571370476;
                                var30 ^= -2027195790;
                                var30 ^= 1477311892;

                                while (var274 < var240) {
                                    var30 &= 702257325;
                                    var30 |= -419587915;
                                    var30 ^= 1404688448;
                                    int var12 = var30 + 1;
                                    var12 = var30 * var12;
                                    var12 &= 1;
                                    if (var12 != 0) {
                                        break label283;
                                    }

                                    hP_2 var284 = var2.VP(var274);
                                    String[][] var13 = this.cu;
                                    long var14 = var6;
                                    long var16 = var14 + 1L;
                                    var16 = var14 * var16;
                                    var14 = var16 & 1L;
                                    long var375;
                                    int var303 = (var375 = var14 - 0L) == 0L ? 0 : (var375 < 0L ? -1 : 1);
                                    if (var303 != 0) {
                                        var30 -= 1817251714;
                                        var30 ^= -1709358278;
                                        break label288;
                                    }

                                    var30 &= -1183251098;
                                    var30 ^= 356081351;
                                    var30 &= 1329104664;
                                    var30 ^= -2113606613;
                                    Integer var304 = var30;
                                    if (var304 == null) {
                                        break label283;
                                    }

                                    boolean var305 = var284.isBreak();
                                    String[] var311;
                                    if (var305) {
                                        var30 *= 75842091;
                                        var30 &= -152524161;
                                        var30 ^= 2012044904;
                                        var14 = var30;
                                        var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        long var18 = var14 + 2L;
                                        var16 *= var18;
                                        var14 += 3L;
                                        var16 *= var14;
                                        var14 = var16 & 7L;
                                        long var376;
                                        int var309 = (var376 = var14 - 0L) == 0L ? 0 : (var376 < 0L ? -1 : 1);
                                        if (var309 != 0) {
                                            break label283;
                                        }

                                        String[] var310 = new String[0];
                                        long var15 = var6;
                                        long var17 = var15 + 1L;
                                        var17 = var15 * var17;
                                        long var19 = var15 + 2L;
                                        var17 *= var19;
                                        var15 += 3L;
                                        var17 *= var15;
                                        var15 = var17 & 7L;
                                        long var377;
                                        int var323 = (var377 = var15 - 0L) == 0L ? 0 : (var377 < 0L ? -1 : 1);
                                        if (var323 != 0) {
                                            var30 *= 1121786355;
                                            var30 |= 1372405740;
                                            var30 |= -927443583;
                                            var30 ^= 1510830;
                                            break label288;
                                        }
                                        var30 = switch (var30) {
                                            case -1056082863 -> {
                                                var30 *= -485940535;
                                                var30 &= 1840847583;
                                                var30 -= -2060010575;
                                                var30 *= 403558859;
                                                yield var30 ^ -443470898;
                                            }
                                            case -14958658 -> var30 ^ -1609539577;
                                            default -> var30 ^ -1503695213;
                                        };
                                        Integer var324 = var30;
                                        if (var324 == null) {
                                            break label283;
                                        }

                                        var311 = var310;
                                        var30 >>= 14;
                                        var30 -= -750266461;
                                        var30 -= -1220784816;
                                        var30 ^= -280134272;
                                    } else {
                                        var30 -= -931906983;
                                        var30 |= 1340775780;
                                        var30 ^= -759780278;
                                        var30 ^= 1531760971;
                                        long var325 = var30;
                                        long var365 = var325 + 1L;
                                        var365 = var325 * var365;
                                        long var371 = var325 + 2L;
                                        var365 *= var371;
                                        var325 += 3L;
                                        var365 *= var325;
                                        var325 = var365 & 7L;
                                        long var378;
                                        int var328 = (var378 = var325 - 0L) == 0L ? 0 : (var378 < 0L ? -1 : 1);
                                        if (var328 != 0) {
                                            break label283;
                                        }

                                        String var329 = var284.text();
                                        int var348 = var30 ^ 1763193430;
                                        int var349 = var348 ^ 441345906;
                                        String[] var330 = this.Z(var1, var329, var3, var349);
                                        int var350 = var6 + 1;
                                        int var351 = var6 * var350;
                                        int var352 = var351 & 1;
                                        if (var352 != 0) {
                                            var30 >>= 12;
                                            var30 *= 790479119;
                                            var30 *= 2060459481;
                                            var30 ^= -1726083627;
                                            break label288;
                                        }

                                        var30 >>>= 17;
                                        var30 *= -1578582977;
                                        var30 ^= 1943449674;
                                        int var353 = var30 + 1;
                                        int var354 = var30 * var353;
                                        int var369 = var30 + 2;
                                        int var355 = var354 * var369;
                                        int var370 = var30 + 3;
                                        int var356 = var355 * var370;
                                        int var357 = var356 & 7;
                                        if (var357 != 0) {
                                            break label283;
                                        }

                                        var311 = var330;
                                        switch (var30) {
                                            case -1048652110:
                                                var30 &= 727091947;
                                                var30 -= 538449019;
                                                var30 *= -1642573487;
                                                var30 &= -168259812;
                                                var30 ^= -76026125;
                                                break;
                                            case -421032841:
                                                var30 ^= -1926794150;
                                                break;
                                            case 1269802808:
                                            default:
                                                var30 ^= 1530226847;
                                        }
                                    }

                                    int var331 = var30 + 1;
                                    var331 = var30 * var331;
                                    int var358 = var30 + 2;
                                    var331 *= var358;
                                    int var359 = var30 + 3;
                                    var331 *= var359;
                                    var331 &= 7;
                                    if (var331 != 0) {
                                        break label283;
                                    }

                                    var13[var274] = var311;
                                    int var293 = var6 + 1;
                                    int var294 = var6 * var293;
                                    int var295 = var294 & 1;
                                    if (var295 != 0) {
                                        var30 |= -1490646233;
                                        var30 -= 2079535530;
                                        var30 ^= -1632842628;
                                        break label288;
                                    }

                                    var30 -= -329786521;
                                    var30 -= 1691795723;
                                    var30 ^= 1590336550;
                                    long var296 = var30;
                                    long var336 = var296 + 1L;
                                    long var337 = var296 * var336;
                                    long var297 = var337 & 1L;
                                    long var379;
                                    int var298 = (var379 = var297 - 0L) == 0L ? 0 : (var379 < 0L ? -1 : 1);
                                    if (var298 != 0) {
                                        break label283;
                                    }

                                    float[] var299 = this.aS;
                                    boolean var285 = var284.isBreak();
                                    float var287;
                                    if (var285) {
                                        var30 ^= 308040520;
                                        var30 *= 1369397965;
                                        var30 -= -189634216;
                                        var30 ^= 1393350653;
                                        Integer var286 = var30;
                                        if (var286 == null) {
                                            break label283;
                                        }

                                        var287 = 7.0F;
                                        var30 <<= 4;
                                        var30 ^= -667289808;
                                        var30 += -842809374;
                                        var30 |= -1952220609;
                                        var30 ^= 931356431;
                                    } else {
                                        var30 ^= -907863664;
                                        var30 ^= 1288699850;
                                        String[][] var312 = this.cu;
                                        String[] var313 = var312[var274];
                                        int var314 = var313.length;
                                        var331 = var6 + 1;
                                        var331 = var6 * var331;
                                        int var360 = var6 + 2;
                                        var331 *= var360;
                                        int var361 = var6 + 3;
                                        var331 *= var361;
                                        var331 &= 7;
                                        if (var331 != 0) {
                                            var30 += 23480353;
                                            var30 += 617266459;
                                            var30 *= 1997456013;
                                            var30 ^= 694662208;
                                            break label288;
                                        }
                                        var30 = switch (var30) {
                                            case -1829820151 -> {
                                                var30 ^= 1759727786;
                                                var30 -= 1225818801;
                                                var30 |= 434456797;
                                                var30 >>>= 19;
                                                yield var30 ^ -864125195;
                                            }
                                            case 404690377 -> var30 ^ 1770568014;
                                            default -> var30 ^ 196189800;
                                        };
                                        float var315 = var314;
                                        float var316 = var315 * var261;
                                        var287 = var316;
                                        var30 >>= 20;
                                        var30 += -306046751;
                                        var30 ^= 1639625944;
                                    }

                                    Integer var317 = var30;
                                    if (var317 == null) {
                                        break label283;
                                    }

                                    var299[var274] = var287;
                                    float[] var288 = this.On;
                                    var288[var274] = var272;
                                    float[] var289 = this.aS;
                                    float var290 = var289[var274];
                                    float var291 = var290 + 3.4F;
                                    float var292 = var272 + var291;
                                    int var300 = var274 + 1;
                                    int var318 = var6 + 1;
                                    int var319 = var6 * var318;
                                    int var320 = var319 & 1;
                                    if (var320 != 0) {
                                        var30 &= 1649871668;
                                        var30 *= 1360693779;
                                        var30 *= 1235088871;
                                        var30 *= 1241967913;
                                        var30 ^= 1668557617;
                                        break label288;
                                    }

                                    var30 |= -1563150096;
                                    var30 ^= 360203387;
                                    var272 = var292;
                                    var274 = var300;
                                    var30 &= -7895961;
                                    var30 &= -1110677590;
                                    var30 |= -1624490925;
                                    var30 ^= 785894360;
                                }

                                var30 -= 917642507;
                                var30 ^= -1407867998;
                                var30 ^= -1349026339;
                                this.Vh = var272;
                                Integer var262 = var6;
                                label241:
                                if (var262 != null) {
                                    label306: {
                                        var30 >>= 15;
                                        var30 ^= -1906200034;
                                        if (var221 != 0) {
                                            var30 += 2054288468;
                                            var30 -= 143883286;
                                            var30 &= 864597593;
                                            var30 ^= 1851029358;
                                            Integer var222 = var30;
                                            if (var222 == null) {
                                                break label283;
                                            }

                                            float[] var223 = this.s;
                                            var248 = var6;
                                            long var276 = var248 + 1L;
                                            long var277 = var248 * var276;
                                            long var301 = var248 + 2L;
                                            long var278 = var277 * var301;
                                            var248 += 3L;
                                            long var279 = var278 * var248;
                                            var248 = var279 & 7L;
                                            long var380;
                                            int var266 = (var380 = var248 - 0L) == 0L ? 0 : (var380 < 0L ? -1 : 1);
                                            if (var266 != 0) {
                                                switch (var30) {
                                                    case -199561659:
                                                    default:
                                                        var30 ^= -1525153812;
                                                        break label241;
                                                    case 460770526:
                                                        var30 ^= 933879793;
                                                        break label241;
                                                    case 1851541294:
                                                        var30 -= -234544375;
                                                        var30 ^= -1581296028;
                                                        break label241;
                                                }
                                            }

                                            var30 -= 1932802934;
                                            var30 ^= -1643835801;
                                            var248 = var30;
                                            long var280 = var248 + 1L;
                                            long var281 = var248 * var280;
                                            var248 = var281 & 1L;
                                            long var381;
                                            int var269 = (var381 = var248 - 0L) == 0L ? 0 : (var381 < 0L ? -1 : 1);
                                            if (var269 != 0) {
                                                break label283;
                                            }

                                            var221 = var223.length;
                                            if (var221 == var240) {
                                                var30 *= 1979901357;
                                                var30 ^= -1775248018;
                                                break label306;
                                            }

                                            switch (var30) {
                                                case -1648538845:
                                                    var30 ^= -1912879557;
                                                    break;
                                                case 1697449439:
                                                    var30 |= -728392275;
                                                    var30 -= 2060026950;
                                                    var30 ^= 1344422592;
                                                    break;
                                                case 1783636093:
                                                default:
                                                    var30 ^= 952173506;
                                            }
                                        } else {
                                            var30 -= -720096410;
                                            var30 ^= -1818585509;
                                        }

                                        float[] var225 = new float[var240];
                                        this.s = var225;
                                        float[] var226 = new float[var240];
                                        this.Mp = var226;
                                        float[] var227 = new float[var240];
                                        Integer var197 = var6;
                                        if (var197 == null) {
                                            switch (var30) {
                                                case 718691193:
                                                    var30 |= 2008494770;
                                                    var30 ^= 1478036257;
                                                    var30 ^= -100269413;
                                                    break label241;
                                                case 1645994122:
                                                default:
                                                    var30 ^= 1550918752;
                                                    break label241;
                                                case 1822131503:
                                                    var30 ^= -1212573336;
                                                    break label241;
                                            }
                                        }
                                        var30 = switch (var30) {
                                            default -> var30 ^ -1492877378;
                                            case 718691193 -> {
                                                var30 *= 1561527763;
                                                yield var30 ^ -1760760254;
                                            }
                                            case 1524251938 -> var30 ^ 423421724;
                                        };
                                        var197 = var30;
                                        if (var197 == null) {
                                            break label283;
                                        }

                                        this.V = var227;
                                        this.xt = true;
                                        var30 *= 198518889;
                                        var30 *= 1847769257;
                                        var30 &= -1303724169;
                                        var30 *= 1540671479;
                                        var30 ^= 617210986;
                                    }

                                    long var199 = var30;
                                    long var241 = var199 + 1L;
                                    long var242 = var199 * var241;
                                    long var273 = var199 + 2L;
                                    long var243 = var242 * var273;
                                    long var200 = var199 + 3L;
                                    long var244 = var243 * var200;
                                    long var201 = var244 & 7L;
                                    long var382;
                                    var6 = (var382 = var201 - 0L) == 0L ? 0 : (var382 < 0L ? -1 : 1);
                                    if (var6 == 0) {
                                        return;
                                    }
                                    break label283;
                                } else {
                                    var30 *= -2029304089;
                                    var30 ^= 758508899;
                                    var30 -= -1728913127;
                                    var30 ^= -1881767392;
                                }
                            }
                        }
                    } else {
                        switch (var30) {
                            case -2064967381:
                                var30 ^= -1387059591;
                                break;
                            case -1197013456:
                                var30 -= 1216275138;
                                var30 ^= -1379905233;
                                break;
                            case 1871313894:
                            default:
                                var30 ^= -1060523286;
                        }
                    }
                }
            }

            IllegalArgumentException var195 = new IllegalArgumentException();
            throw var195;
        }

        UnsupportedOperationException var196 = new UnsupportedOperationException();
        throw var196;
    }

    private String[] Z(Canvas var1, String var2, float var3, int var4) {
        label437: {
            int var6 = System.identityHashCode(this);
            TextStyle var7 = this.Z;
            float var274 = var1.measure(var2, var7);
            float var551;
            int var275 = (var551 = var274 - var3) == 0.0F ? 0 : (var551 < 0.0F ? -1 : 1);
            long var8 = var6;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            var8 = var10 & 1L;
            long var552;
            int var283 = (var552 = var8 - 0L) == 0L ? 0 : (var552 < 0L ? -1 : 1);
            int var28;
            if (var283 == 0) {
                var28 = var4 + 308004621;
                var28 += 1549296445;
                var28 &= -1045259089;
                var28 *= 1207618397;
                var28 ^= 1864229682;
                Integer var284 = var28;
                if (var284 == null) {
                    break label437;
                }

                if (var275 <= 0) {
                    var28 |= 805941203;
                    var28 ^= 822009375;
                    int var276 = var28 + 1;
                    int var277 = var28 * var276;
                    int var278 = var277 & 1;
                    if (var278 != 0) {
                        break label437;
                    }

                    String[] var279 = new String[1];
                    int var285 = var6 + 1;
                    int var286 = var6 * var285;
                    int var287 = var286 & 1;
                    if (var287 == 0) {
                        var28 = switch (var28) {
                            default -> var28 ^ -1035455459;
                            case 203278623 -> var28 ^ 2130239357;
                            case 1324835268 -> {
                                var28 *= -1185636741;
                                var28 *= 1914952551;
                                yield var28 ^ 1754431651;
                            }
                        };
                        int var288 = var28 + 1;
                        int var289 = var28 * var288;
                        int var290 = var289 & 1;
                        if (var290 == 0) {
                            var279[0] = var2;
                            return var279;
                        }
                        break label437;
                    }

                    switch (var28) {
                        case 501846680:
                        default:
                            var28 ^= 1748464490;
                            break;
                        case 798539744:
                            var28 ^= -1742764610;
                            break;
                        case 1324835268:
                            var28 -= -1515476234;
                            var28 ^= -145441808;
                    }
                } else {
                    var28 |= -978933132;
                    var28 >>>= 1;
                    var28 >>= 21;
                    var28 ^= 2077649498;
                    ArrayList var280 = new ArrayList(3);
                    ArrayList var281 = var280;
                    StringBuilder var291 = new StringBuilder();
                    long var9 = var6;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var553;
                    int var300 = (var553 = var9 - 0L) == 0L ? 0 : (var553 < 0L ? -1 : 1);
                    if (var300 == 0) {
                        var28 >>= 10;
                        var28 ^= 1862982539;
                        int var301 = var28 + 1;
                        int var302 = var28 * var301;
                        int var303 = var302 & 1;
                        if (var303 != 0) {
                            break label437;
                        }

                        StringBuilder var292 = var291;
                        String[] var304 = var2.split(" ");
                        String[] var305 = var304;
                        int var320 = var304.length;
                        int var321 = var320;
                        byte var329 = 0;
                        int var330 = var329;
                        var28 &= -670104213;
                        var28 ^= 719896682;

                        label431:
                        while (true) {
                            Integer var12 = var28;
                            if (var12 == null) {
                                break label437;
                            }

                            if (var330 < var321) {
                                var28 *= 1243932545;
                                var28 <<= 11;
                                var28 *= -1811909287;
                                var28 += 1692755790;
                                var28 ^= -1138917294;
                                long var347 = var28;
                                long var14 = var347 + 1L;
                                var14 = var347 * var14;
                                long var16 = var347 + 2L;
                                var14 *= var16;
                                long var348 = var347 + 3L;
                                var14 *= var348;
                                long var349 = var14 & 7L;
                                long var554;
                                int var350 = (var554 = var349 - 0L) == 0L ? 0 : (var554 < 0L ? -1 : 1);
                                if (var350 != 0) {
                                    break label437;
                                }

                                String var351 = var305[var330];
                                int var357 = var6 + 1;
                                var357 = var6 * var357;
                                var357 &= 1;
                                if (var357 == 0) {
                                    var28 *= -37718813;
                                    var28 ^= -1192631345;
                                    Integer var360 = var28;
                                    if (var360 == null) {
                                        break label437;
                                    }

                                    boolean var361 = var351.isEmpty();
                                    if (var361) {
                                        var28 ^= 1931250557;
                                        var28 ^= -1092533899;
                                        var360 = var28;
                                        if (var360 == null) {
                                            break label437;
                                        }

                                        var28 -= 1570505661;
                                        var28 &= -1152474039;
                                        var28 ^= 706763439;
                                    } else {
                                        var28 -= 195823834;
                                        var28 >>= 10;
                                        var28 <<= 10;
                                        var28 ^= -68105039;
                                        boolean var363 = var292.isEmpty();
                                        var14 = var6;
                                        var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        var14 = var16 & 1L;
                                        long var555;
                                        int var410 = (var555 = var14 - 0L) == 0L ? 0 : (var555 < 0L ? -1 : 1);
                                        if (var410 != 0) {
                                            switch (var28) {
                                                case -638995236:
                                                default:
                                                    var28 ^= 850710135;
                                                    break label431;
                                                case 1906028721:
                                                    var28 += -936620608;
                                                    var28 += 1727260808;
                                                    var28 ^= -22746169;
                                                    break label431;
                                                case 1934433783:
                                                    var28 ^= 389724172;
                                                    break label431;
                                            }
                                        }

                                        var28 >>= 13;
                                        var28 ^= -1290966201;
                                        var28 *= -871596661;
                                        var28 ^= -28091874;
                                        var14 = var28;
                                        var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        var14 = var16 & 1L;
                                        long var556;
                                        int var413 = (var556 = var14 - 0L) == 0L ? 0 : (var556 < 0L ? -1 : 1);
                                        if (var413 != 0) {
                                            break label437;
                                        }

                                        String var367;
                                        if (var363) {
                                            var28 <<= 19;
                                            var28 *= -1501081405;
                                            var28 ^= 1879865502;
                                            int var364 = var28 + 1;
                                            var364 = var28 * var364;
                                            var364 &= 1;
                                            if (var364 != 0) {
                                                break label437;
                                            }

                                            var367 = var351;
                                            var28 ^= 623621763;
                                            var28 ^= 1523871329;
                                        } else {
                                            var28 |= 1506718041;
                                            var28 |= -1896656438;
                                            var28 &= -1022332110;
                                            var28 >>>= 19;
                                            var28 ^= -1902378982;
                                            String var414 = String.valueOf(var292);
                                            String var415 = var414 + " " + var351;
                                            int var15 = var6 + 1;
                                            var15 = var6 * var15;
                                            int var515 = var6 + 2;
                                            var15 *= var515;
                                            int var516 = var6 + 3;
                                            var15 *= var516;
                                            var15 &= 7;
                                            if (var15 != 0) {
                                                switch (var28) {
                                                    case -1902372744:
                                                        var28 -= 675634441;
                                                        var28 &= -1399792295;
                                                        var28 ^= 2047841399;
                                                        break label431;
                                                    case -1887056079:
                                                    default:
                                                        var28 ^= 284535197;
                                                        break label431;
                                                    case -1685738413:
                                                        var28 ^= -419984743;
                                                        break label431;
                                                }
                                            }

                                            var28 -= -229573021;
                                            var28 >>= 23;
                                            var28 *= -2134174693;
                                            var28 |= 2097643074;
                                            var28 ^= 1898345022;
                                            var367 = var415;
                                            var28 += -1539675412;
                                            var28 *= -842388165;
                                            var28 ^= 1092286780;
                                        }

                                        var14 = var28;
                                        var16 = var14 + 1L;
                                        var16 = var14 * var16;
                                        var14 = var16 & 1L;
                                        long var557;
                                        int var418 = (var557 = var14 - 0L) == 0L ? 0 : (var557 < 0L ? -1 : 1);
                                        if (var418 != 0) {
                                            break label437;
                                        }

                                        Integer var419 = var6;
                                        if (var419 == null) {
                                            var28 |= -719497167;
                                            var28 += 957297418;
                                            var28 ^= 1326458553;
                                            break;
                                        }

                                        var28 -= -2014327082;
                                        var28 ^= 1351582223;
                                        Integer var420 = var28;
                                        if (var420 == null) {
                                            break label437;
                                        }

                                        TextStyle var421 = this.Z;
                                        float var422 = var1.measure(var367, var421);
                                        float var558;
                                        int var423 = (var558 = var422 - var3) == 0.0F ? 0 : (var558 < 0.0F ? -1 : 1);
                                        if (var423 <= 0) {
                                            var28 >>>= 15;
                                            var28 -= -505541481;
                                            var28 ^= -1318556427;
                                            var28 *= -1775982131;
                                            var28 ^= -1107425712;
                                            var292.setLength(0);
                                            int var424 = var6 + 1;
                                            int var425 = var6 * var424;
                                            int var481 = var6 + 2;
                                            int var426 = var425 * var481;
                                            var481 = var6 + 3;
                                            int var427 = var426 * var481;
                                            int var428 = var427 & 7;
                                            if (var428 != 0) {
                                                var28 >>>= 18;
                                                var28 *= -1111848107;
                                                var28 ^= 471123454;
                                                break;
                                            }
                                            var28 = switch (var28) {
                                                case -1761536332 -> {
                                                    var28 += -524145375;
                                                    yield var28 ^ -866003367;
                                                }
                                                default -> var28 ^ -653886845;
                                                case -240595357 -> var28 ^ 274784056;
                                            };
                                            var14 = var28;
                                            var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            var14 = var16 & 1L;
                                            long var559;
                                            int var431 = (var559 = var14 - 0L) == 0L ? 0 : (var559 < 0L ? -1 : 1);
                                            if (var431 != 0) {
                                                break label437;
                                            }

                                            StringBuilder var368 = var292.append(var367);
                                            var28 -= -1463390515;
                                            var28 ^= -2102231984;
                                        } else {
                                            var28 ^= -298717527;
                                            var28 *= 1930659259;
                                            var28 &= 1879412121;
                                            var28 |= 1371286600;
                                            var28 ^= 1880160459;
                                            long var369 = var28;
                                            long var483 = var369 + 1L;
                                            var483 = var369 * var483;
                                            long var17 = var369 + 2L;
                                            var483 *= var17;
                                            long var370 = var369 + 3L;
                                            var483 *= var370;
                                            long var371 = var483 & 7L;
                                            long var560;
                                            int var372 = (var560 = var371 - 0L) == 0L ? 0 : (var560 < 0L ? -1 : 1);
                                            if (var372 != 0) {
                                                break label437;
                                            }

                                            int var373 = (var292.isEmpty()) ? 1 : 0;
                                            var14 = var6;
                                            var16 = var14 + 1L;
                                            var16 = var14 * var16;
                                            long var18 = var14 + 2L;
                                            var16 *= var18;
                                            var14 += 3L;
                                            var16 *= var14;
                                            var14 = var16 & 7L;
                                            long var561;
                                            int var435 = (var561 = var14 - 0L) == 0L ? 0 : (var561 < 0L ? -1 : 1);
                                            if (var435 != 0) {
                                                switch (var28) {
                                                    case 169131956:
                                                    default:
                                                        var28 ^= -1301115523;
                                                        break label431;
                                                    case 564974979:
                                                        var28 -= -207119286;
                                                        var28 ^= 1713568264;
                                                        var28 >>= 20;
                                                        var28 >>= 5;
                                                        var28 ^= 1579093274;
                                                        break label431;
                                                    case 698080598:
                                                        var28 ^= -675705399;
                                                        break label431;
                                                }
                                            }
                                            var28 = switch (var28) {
                                                case -2124602128 -> var28 ^ -486552853;
                                                default -> var28 ^ 1278320458;
                                                case 564974979 -> {
                                                    var28 += -1125322452;
                                                    yield var28 ^ 578864790;
                                                }
                                            };
                                            int var436 = var28 + 1;
                                            int var437 = var28 * var436;
                                            int var487 = var28 + 2;
                                            int var438 = var437 * var487;
                                            int var488 = var28 + 3;
                                            int var439 = var438 * var488;
                                            int var440 = var439 & 7;
                                            if (var440 != 0) {
                                                break label437;
                                            }

                                            if (var373 == 0) {
                                                var28 &= 504192852;
                                                var28 -= -690857564;
                                                var28 ^= 1784734860;
                                                var373 = var28 + 1;
                                                var373 = var28 * var373;
                                                var373 &= 1;
                                                if (var373 != 0) {
                                                    break label437;
                                                }

                                                String var377 = var292.toString();
                                                int var441 = var6 + 1;
                                                int var442 = var6 * var441;
                                                int var443 = var442 & 1;
                                                if (var443 != 0) {
                                                    var28 += -408515244;
                                                    var28 += 19908879;
                                                    var28 <<= 28;
                                                    var28 >>= 31;
                                                    var28 ^= 1579093310;
                                                    break;
                                                }
                                                var28 = switch (var28) {
                                                    default -> var28 ^ -2010650150;
                                                    case -818416649 -> var28 ^ -1558902415;
                                                    case 794182368 -> {
                                                        var28 |= 1784428635;
                                                        yield var28 ^ -1463073371;
                                                    }
                                                };
                                                var14 = var28;
                                                var16 = var14 + 1L;
                                                var16 = var14 * var16;
                                                var18 = var14 + 2L;
                                                var16 *= var18;
                                                var14 += 3L;
                                                var16 *= var14;
                                                var14 = var16 & 7L;
                                                long var562;
                                                int var447 = (var562 = var14 - 0L) == 0L ? 0 : (var562 < 0L ? -1 : 1);
                                                if (var447 != 0) {
                                                    break label437;
                                                }

                                                boolean var378 = var281.add(var377);
                                                var28 ^= -603679758;
                                                var28 ^= -1545175399;
                                            } else {
                                                switch (var28) {
                                                    case -65470407:
                                                        var28 >>>= 29;
                                                        var28 -= 1701330736;
                                                        var28 |= 1513784645;
                                                        var28 |= 1597521980;
                                                        var28 ^= 1741166538;
                                                        break;
                                                    case 138002870:
                                                    default:
                                                        var28 ^= 581907977;
                                                        break;
                                                    case 1565161031:
                                                        var28 ^= -1804019;
                                                }
                                            }

                                            var292.setLength(0);
                                            Integer var379 = var6;
                                            if (var379 == null) {
                                                var28 &= 1746026878;
                                                var28 -= -1395431027;
                                                var28 >>>= 28;
                                                var28 >>= 27;
                                                var28 ^= 1579093310;
                                                break;
                                            }

                                            var28 &= 1497163562;
                                            var28 ^= 1662466478;
                                            var379 = var28;
                                            if (var379 == null) {
                                                break label437;
                                            }

                                            String var352 = var351;

                                            var28 = switch (var28) {
                                                case -2082627806 -> var28 ^ -1886523758;
                                                default -> var28 ^ 585978606;
                                                case 2065955726 -> {
                                                    var28 &= -646631993;
                                                    var28 ^= 1882084103;
                                                    var28 >>>= 22;
                                                    yield var28 ^ -1068490749;
                                                }
                                            };

                                            label413:
                                            while (true) {
                                                long var381 = var28;
                                                var483 = var381 + 1L;
                                                var483 = var381 * var483;
                                                var17 = var381 + 2L;
                                                var483 *= var17;
                                                long var382 = var381 + 3L;
                                                var483 *= var382;
                                                long var383 = var483 & 7L;
                                                long var563;
                                                int var384 = (var563 = var383 - 0L) == 0L ? 0 : (var563 < 0L ? -1 : 1);
                                                if (var384 != 0) {
                                                    break label437;
                                                }

                                                TextStyle var385 = this.Z;
                                                float var386 = var1.measure(var352, var385);
                                                var14 = var6;
                                                var16 = var14 + 1L;
                                                var16 = var14 * var16;
                                                var18 = var14 + 2L;
                                                var16 *= var18;
                                                var14 += 3L;
                                                var16 *= var14;
                                                var14 = var16 & 7L;
                                                long var564;
                                                int var451 = (var564 = var14 - 0L) == 0L ? 0 : (var564 < 0L ? -1 : 1);
                                                if (var451 != 0) {
                                                    var28 |= 234072743;
                                                    var28 >>= 29;
                                                    var28 |= 1293535217;
                                                    var28 ^= -1199360538;
                                                    var28 ^= 425969447;
                                                    break label431;
                                                }

                                                var28 &= -495178207;
                                                var28 *= 535437155;
                                                var28 ^= -225471490;
                                                var28 <<= 13;
                                                var28 ^= -122052419;
                                                Integer var452 = var28;
                                                if (var452 == null) {
                                                    break label437;
                                                }

                                                float var565;
                                                var384 = (var565 = var386 - var3) == 0.0F ? 0 : (var565 < 0.0F ? -1 : 1);
                                                if (var384 <= 0) {
                                                    switch (var28) {
                                                        case 756797083:
                                                        default:
                                                            var28 ^= -158794453;
                                                            break label413;
                                                        case 1203634365:
                                                            var28 -= -1106128030;
                                                            var28 *= 874986329;
                                                            var28 ^= 375418089;
                                                            var28 ^= -2048299932;
                                                            break label413;
                                                        case 2032281617:
                                                            var28 ^= -40784427;
                                                            break label413;
                                                    }
                                                }

                                                var28 += -1508321340;
                                                var28 <<= 23;
                                                var28 ^= 1588123272;
                                                Integer var388 = var28;
                                                if (var388 == null) {
                                                    break label437;
                                                }

                                                int var389 = var352.length();
                                                int var453 = var6 + 1;
                                                int var454 = var6 * var453;
                                                int var455 = var454 & 1;
                                                if (var455 != 0) {
                                                    switch (var28) {
                                                        case -88086212:
                                                            var28 ^= -1164299280;
                                                            break label431;
                                                        case 505992840:
                                                            var28 *= -1447307145;
                                                            var28 |= -881392981;
                                                            var28 >>>= 4;
                                                            var28 *= -1759038543;
                                                            var28 ^= -1083308939;
                                                            break label431;
                                                        case 1186347606:
                                                        default:
                                                            var28 ^= -804418958;
                                                            break label431;
                                                    }
                                                }

                                                var28 *= -1210032921;
                                                var28 ^= -1068970018;
                                                var28 += 1475158990;
                                                var28 ^= 665710107;
                                                if (var389 <= 1) {
                                                    var28 += -1374150328;
                                                    var28 *= 1053747301;
                                                    var28 += 2098966446;
                                                    var28 ^= -1182683761;
                                                    break;
                                                }

                                                var28 <<= 1;
                                                var28 += -836674744;
                                                var28 ^= 2086288416;
                                                long var390 = var28;
                                                var483 = var390 + 1L;
                                                var483 = var390 * var483;
                                                long var391 = var483 & 1L;
                                                long var566;
                                                var389 = (var566 = var391 - 0L) == 0L ? 0 : (var566 < 0L ? -1 : 1);
                                                if (var389 != 0) {
                                                    break label437;
                                                }

                                                var389 = var352.length();
                                                var14 = var6;
                                                var16 = var14 + 1L;
                                                var16 = var14 * var16;
                                                var18 = var14 + 2L;
                                                var16 *= var18;
                                                var14 += 3L;
                                                var16 *= var14;
                                                var14 = var16 & 7L;
                                                long var567;
                                                int var459 = (var567 = var14 - 0L) == 0L ? 0 : (var567 < 0L ? -1 : 1);
                                                if (var459 != 0) {
                                                    var28 -= -1620502624;
                                                    var28 ^= 723084504;
                                                    break label431;
                                                }

                                                var28 |= 632917924;
                                                var28 -= -1787071147;
                                                var28 ^= 295001026;
                                                var28 <<= 11;
                                                var28 ^= -1339024794;
                                                Integer var460 = var28;
                                                if (var460 == null) {
                                                    break label437;
                                                }

                                                var389 = --var389;

                                                var28 = switch (var28) {
                                                    case -409803747 -> var28 ^ -2116707682;
                                                    default -> var28 ^ 1195838353;
                                                    case 977044070 -> {
                                                        var28 &= 1896783676;
                                                        var28 += -1384657319;
                                                        var28 &= -1830713002;
                                                        var28 -= -378476626;
                                                        yield var28 ^ -1354097263;
                                                    }
                                                };

                                                while (true) {
                                                    if (var389 > 1) {
                                                        var28 &= 1636072019;
                                                        var28 += -1430604085;
                                                        var28 ^= -1682800855;
                                                        var14 = var28;
                                                        var16 = var14 + 1L;
                                                        var16 = var14 * var16;
                                                        var18 = var14 + 2L;
                                                        var16 *= var18;
                                                        var14 += 3L;
                                                        var16 *= var14;
                                                        var14 = var16 & 7L;
                                                        long var568;
                                                        int var464 = (var568 = var14 - 0L) == 0L ? 0 : (var568 < 0L ? -1 : 1);
                                                        if (var464 != 0) {
                                                            break label437;
                                                        }

                                                        String var465 = var352.substring(0, var389);
                                                        TextStyle var495 = this.Z;
                                                        float var466 = var1.measure(var465, var495);
                                                        int var496 = var6 + 1;
                                                        int var497 = var6 * var496;
                                                        int var498 = var497 & 1;
                                                        if (var498 != 0) {
                                                            var28 &= -319074442;
                                                            var28 >>>= 28;
                                                            var28 |= -96631616;
                                                            var28 ^= -1541240324;
                                                            break label431;
                                                        }
                                                        var28 = switch (var28) {
                                                            default -> var28 ^ -21464150;
                                                            case 822921719 -> {
                                                                var28 |= 670148319;
                                                                var28 -= 816445915;
                                                                var28 += -1146603923;
                                                                yield var28 ^ -1029772323;
                                                            }
                                                            case 1260772837 -> var28 ^ 145729222;
                                                        };
                                                        float var569;
                                                        int var467 = (var569 = var466 - var3) == 0.0F ? 0 : (var569 < 0.0F ? -1 : 1);
                                                        if (var467 > 0) {
                                                            var28 |= -1061382129;
                                                            var28 *= 885844411;
                                                            var28 += -251264401;
                                                            var28 ^= 1713892224;
                                                            int var468 = var28 + 1;
                                                            int var469 = var28 * var468;
                                                            int var499 = var28 + 2;
                                                            int var470 = var469 * var499;
                                                            int var500 = var28 + 3;
                                                            int var471 = var470 * var500;
                                                            int var472 = var471 & 7;
                                                            if (var472 != 0) {
                                                                break label437;
                                                            }

                                                            int var473 = var389 + -1;
                                                            var483 = var6;
                                                            var17 = var483 + 1L;
                                                            var17 = var483 * var17;
                                                            long var19 = var483 + 2L;
                                                            var17 *= var19;
                                                            var483 += 3L;
                                                            var17 *= var483;
                                                            var483 = var17 & 7L;
                                                            long var570;
                                                            int var504 = (var570 = var483 - 0L) == 0L ? 0 : (var570 < 0L ? -1 : 1);
                                                            if (var504 != 0) {
                                                                var28 >>>= 3;
                                                                var28 ^= 1320628554;
                                                                break label431;
                                                            }
                                                            var28 = switch (var28) {
                                                                case -2059279452 -> {
                                                                    var28 += -1097165539;
                                                                    var28 -= 1776340659;
                                                                    var28 ^= 1368885719;
                                                                    yield var28 ^ -1871928744;
                                                                }
                                                                case 211036462 -> var28 ^ -1399768548;
                                                                default -> var28 ^ 1707793867;
                                                            };
                                                            var389 = var473;
                                                            var28 *= 914102227;
                                                            var28 += -1235221521;
                                                            var28 ^= -788067774;
                                                            var28 &= -1144126262;
                                                            var28 ^= -1551170249;
                                                            continue;
                                                        }

                                                        var28 -= -520187339;
                                                        var28 += 1816762831;
                                                        var28 ^= 1484154692;
                                                    } else {
                                                        var28 |= 910151665;
                                                        var28 &= 1831492120;
                                                        var28 ^= -924750;
                                                    }

                                                    String var474 = var352.substring(0, var389);
                                                    boolean var475 = var281.add(var474);
                                                    String var396 = var352.substring(var389);
                                                    Integer var476 = var6;
                                                    if (var476 == null) {
                                                        var28 *= -1905324601;
                                                        var28 |= 981258488;
                                                        var28 ^= 618912704;
                                                        break label431;
                                                    }

                                                    var28 <<= 5;
                                                    var28 ^= -1174505072;
                                                    var28 ^= -975370324;
                                                    var352 = var396;
                                                    switch (var28) {
                                                        case -973473065:
                                                            var28 ^= 1675476427;
                                                            continue label413;
                                                        case -543728473:
                                                        default:
                                                            var28 ^= 1674847250;
                                                            continue label413;
                                                        case 123095676:
                                                            var28 |= 443286636;
                                                            var28 ^= -550605093;
                                                            continue label413;
                                                    }
                                                }
                                            }

                                            long var397 = var28;
                                            var483 = var397 + 1L;
                                            var483 = var397 * var483;
                                            long var398 = var483 & 1L;
                                            long var571;
                                            int var399 = (var571 = var398 - 0L) == 0L ? 0 : (var571 < 0L ? -1 : 1);
                                            if (var399 != 0) {
                                                break label437;
                                            }

                                            StringBuilder var353 = var292.append(var352);
                                            var28 *= -1761997211;
                                            var28 >>= 14;
                                            var28 >>= 4;
                                            var28 &= 854013772;
                                            var28 ^= -1871815001;
                                        }
                                    }

                                    var350 = var330 + 1;
                                    long var400 = var6;
                                    long var507 = var400 + 1L;
                                    var507 = var400 * var507;
                                    long var546 = var400 + 2L;
                                    var507 *= var546;
                                    long var401 = var400 + 3L;
                                    var507 *= var401;
                                    long var402 = var507 & 7L;
                                    long var572;
                                    int var403 = (var572 = var402 - 0L) == 0L ? 0 : (var572 < 0L ? -1 : 1);
                                    if (var403 != 0) {
                                        var28 |= -1644906256;
                                        var28 -= 135778018;
                                        var28 += -636391151;
                                        var28 ^= 837259280;
                                        break;
                                    }

                                    var28 -= -784034147;
                                    var28 |= -386762967;
                                    var28 &= 1665242011;
                                    var28 |= 484494378;
                                    var28 ^= 592845776;
                                    Integer var404 = var28;
                                    if (var404 == null) {
                                        break label437;
                                    }

                                    var330 = var350;
                                    var28 &= -1860386776;
                                    var28 += 1452188963;
                                    var28 ^= 72327456;
                                    continue;
                                }

                                var28 *= -1794129893;
                                var28 *= -1751013687;
                                var28 ^= -250094678;
                                break;
                            }

                            var28 &= 908823689;
                            var28 |= -812810437;
                            var28 <<= 4;
                            var28 ^= 607823305;
                            var28 ^= 896313089;
                            var9 = var28;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var573;
                            int var309 = (var573 = var9 - 0L) == 0L ? 0 : (var573 < 0L ? -1 : 1);
                            if (var309 != 0) {
                                break label437;
                            }

                            boolean var310 = var292.isEmpty();
                            var10 = var6;
                            long var343 = var10 + 1L;
                            long var344 = var10 * var343;
                            var10 = var344 & 1L;
                            long var574;
                            int var324 = (var574 = var10 - 0L) == 0L ? 0 : (var574 < 0L ? -1 : 1);
                            if (var324 == 0) {
                                var28 ^= 312237808;
                                var28 -= 1978247414;
                                var28 ^= -2022994458;
                                var28 += 981277237;
                                var28 ^= 726127228;
                                var10 = var28;
                                long var345 = var10 + 1L;
                                long var346 = var10 * var345;
                                var10 = var346 & 1L;
                                long var575;
                                int var327 = (var575 = var10 - 0L) == 0L ? 0 : (var575 < 0L ? -1 : 1);
                                if (var327 != 0) {
                                    break label437;
                                }

                                if (!var310) {
                                    var28 <<= 7;
                                    var28 >>>= 3;
                                    var28 ^= -641534441;
                                    var28 &= -356358065;
                                    var28 ^= -174726687;
                                    String var293 = var292.toString();
                                    Integer var311 = var6;
                                    if (var311 == null) {
                                        var28 += -1459690521;
                                        var28 &= -1400052241;
                                        var28 ^= -769931085;
                                        break;
                                    }

                                    var28 &= -1925293789;
                                    var28 ^= 2048865371;
                                    Integer var312 = var28;
                                    if (var312 == null) {
                                        break label437;
                                    }

                                    boolean var294 = var281.add(var293);
                                    switch (var28) {
                                        case -814599334:
                                            var28 ^= 2125638951;
                                            break;
                                        case 637531012:
                                        default:
                                            var28 ^= 1089524304;
                                            break;
                                        case 2131459449:
                                            var28 <<= 2;
                                            var28 += 826161850;
                                            var28 -= 368825403;
                                            var28 += -663241381;
                                            var28 ^= 1389580505;
                                    }
                                } else {
                                    var28 |= 737392522;
                                    var28 ^= 502746185;
                                    var28 -= -966481983;
                                    var28 |= -250850301;
                                    var28 ^= 1184308912;
                                }

                                int var295 = var28 + 1;
                                int var296 = var28 * var295;
                                int var297 = var296 & 1;
                                if (var297 != 0) {
                                    break label437;
                                }

                                String[] var298 = new String[0];
                                var9 = var6;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var13 = var9 + 2L;
                                var11 *= var13;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var576;
                                var6 = (var576 = var9 - 0L) == 0L ? 0 : (var576 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    var28 |= 736100098;
                                    var28 ^= -861407562;
                                    var28 -= 933735247;
                                    var28 *= -928704191;
                                    var28 ^= -2001174149;
                                    var9 = var28;
                                    var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    var13 = var9 + 2L;
                                    var11 *= var13;
                                    var9 += 3L;
                                    var11 *= var9;
                                    var9 = var11 & 7L;
                                    long var577;
                                    var6 = (var577 = var9 - 0L) == 0L ? 0 : (var577 < 0L ? -1 : 1);
                                    if (var6 == 0) {
                                        Object[] var273 = var281.toArray(var298);
                                        return (String[])var273;
                                    }
                                    break label437;
                                }

                                var28 += -1745902671;
                                var28 -= -413292658;
                                var28 |= 1137830473;
                                var28 >>>= 31;
                                var28 ^= 1579093310;
                            } else {
                                switch (var28) {
                                    case -381962945:
                                    default:
                                        var28 ^= -376171922;
                                        break label431;
                                    case -343281288:
                                        var28 *= 2078499309;
                                        var28 ^= 1183058214;
                                        break label431;
                                    case 1608214115:
                                        var28 ^= 54837105;
                                }
                            }
                            break;
                        }
                    } else {
                        var28 *= -856625003;
                        var28 ^= -56970398;
                        var28 >>>= 31;
                        var28 *= -401416853;
                        var28 ^= 1579093310;
                    }
                }
            } else {
                var28 = var4 >>> 26;
                var28 ^= 1864710586;
                var28 *= -1207013515;
                var28 -= 2058312920;
                var28 ^= 1535711137;
            }

            Integer var268 = var28;
            if (var268 != null) {
                IllegalStateException var270 = new IllegalStateException();
                throw var270;
            }
        }

        IllegalArgumentException var269 = new IllegalArgumentException();
        throw var269;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -169439172;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        dQ = var4;
    }
}
