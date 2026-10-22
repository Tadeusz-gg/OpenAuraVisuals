package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class pk {
    public static final float VH = 24.0F;
    private static final float bI = 7.0F;
    private final Yn mr;
    private final List mm;
    private final zz cD;
    private final XF dJ;
    private final XF WS;
    private final XF vy;
    private boolean e;
    private float D;
    private float IK;
    private float iG;
    private float sX;
    public static final int OB;

    public pk(Yn var1) {
        ArrayList var2 = new ArrayList();
        this.mm = var2;
        Object var3 = kE_2.SMOOTH;
        XF var5 = new XF(0.0F, (kE_2)var3);
        this.WS = var5;
        var3 = kE_2.uY(0.38F, 0.92F);
        XF var6 = new XF(0.0F, (kE_2)var3);
        this.vy = var6;
        this.mr = var1;
        List var7 = var1.GS();
        Iterator var8 = var7.iterator();
        Iterator var9 = var8;

        while (true) {
            boolean var13 = var9.hasNext();
            if (!var13) {
                boolean var10 = var1.B();
                float var11;
                if (var10) {
                    var11 = 1.0F;
                } else {
                    var11 = 0.0F;
                }

                kE_2 var20 = kE_2.uY(0.32F, 0.62F);
                zz var18 = new zz(var20, var11);
                this.cD = var18;
                var20 = kE_2.SMOOTH;
                XF var19 = new XF(var11, var20);
                this.dJ = var19;
                return;
            }

            var3 = var9.next();
            xB var15 = (xB)var3;
            List var4 = this.mm;
            XR var16 = XR.n(var15);
            boolean var17 = var4.add(var16);
        }
    }

    public Yn JQ() {
        int var1 = OB;
        var1 ^= 107328401;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        var3 = of_2.ZD;
        var1 ^= var3;
        var1 ^= 734780311;
        if (var2 == 0) {
            var1 >>>= 10;
            var1 ^= 956598008;
            return this.mr;
        } else {
            var1 >>>= 21;
            var1 += -669723762;
            var1 ^= -2081372525;
            var1 ^= 1207404023;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    public float V() {
        int var1 = OB;
        var1 ^= -340191280;
        int var2 = System.identityHashCode(this);
        XF var3 = this.vy;
        float var28 = var3.bs();
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var2 += 3;
        var4 *= var2;
        var2 = var4 & 7;
        var4 = of_2.y;
        var1 ^= var4;
        var1 ^= -864320044;
        of_2.y = -864320044;
        var4 = of_2.ZD;
        var1 ^= var4;
        var1 ^= 734780311;
        of_2.ZD = 734780311;
        if (var2 == 0) {
            var1 += -1127471648;
            var1 &= -1777828975;
            var1 >>= 13;
            var1 |= -1326412578;
            var1 ^= 1857461379;
            var2 = var1 * 1369479561;
            var2 |= 1792075658;
            var2 ^= -1769213969;
            float var26 = this.R(var2);
            float var27 = var28 * var26;
            return 24.0F + var27;
        } else {
            switch (var1) {
                case 569070545:
                    var1 -= -882771434;
                    var1 ^= 1307683178;
                    break;
                case 1845981312:
                default:
                    var1 ^= -1908053802;
                    break;
                case 1905760004:
                    var1 ^= -2065383613;
            }

            IllegalStateException var15 = new IllegalStateException();
            throw var15;
        }
    }

    private float R(int var1) {
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var5 = var3 + 3;
        var4 *= var5;
        var4 &= 7;
        label122:
        if (var4 == 0) {
            int var16 = switch (var1) {
                default -> var1 ^ 904620867;
                case -44498863 -> {
                    int var17 = var1 ^ -1991095943;
                    yield var17 ^ 706319031;
                }
                case 425501252 -> var1 ^ -1680671492;
            };
            long var104 = var16;
            long var6 = var104 + 1L;
            var6 = var104 * var6;
            long var105 = var6 & 1L;
            long var172;
            var4 = (var172 = var105 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
            if (var4 == 0) {
                float var107 = 0.0F;
                List var111 = this.mm;
                Iterator var112 = var111.iterator();
                Iterator var113 = var112;
                float var108 = var107;
                var16 |= -1067316901;
                var16 ^= 1998550906;
                var16 >>>= 14;
                var16 -= 1039943736;
                var16 ^= -83483646;

                while (true) {
                    boolean var123 = var113.hasNext();
                    long var7 = var3;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var173;
                    int var150 = (var173 = var7 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                    if (var150 != 0) {
                        var16 <<= 6;
                        var16 <<= 6;
                        var16 ^= 1599657658;
                        break label122;
                    }

                    var16 *= -781264565;
                    var16 <<= 12;
                    var16 ^= 952482744;
                    if (!var123) {
                        var16 ^= -1799393819;
                        var16 ^= -2006290449;
                        var16 ^= 606936334;
                        var5 = var16 + 1;
                        var5 = var16 * var5;
                        int var133 = var16 + 2;
                        var5 *= var133;
                        int var134 = var16 + 3;
                        var5 *= var134;
                        var5 &= 7;
                        if (var5 != 0) {
                            break;
                        }

                        float var174;
                        var5 = (var174 = var108 - 0.0F) == 0.0F ? 0 : (var174 < 0.0F ? -1 : 1);
                        int var135 = var3 + 1;
                        int var136 = var3 * var135;
                        int var162 = var3 + 2;
                        int var137 = var136 * var162;
                        int var163 = var3 + 3;
                        int var138 = var137 * var163;
                        int var139 = var138 & 7;
                        if (var139 != 0) {
                            var16 |= -300402173;
                            var16 &= 1986021961;
                            var16 >>= 31;
                            var16 ^= 1489966778;
                            break label122;
                        }

                        var16 <<= 26;
                        var16 ^= -1842448499;
                        int var140 = var16 + 1;
                        int var141 = var16 * var140;
                        int var164 = var16 + 2;
                        int var142 = var141 * var164;
                        int var165 = var16 + 3;
                        int var143 = var142 * var165;
                        int var144 = var143 & 7;
                        if (var144 != 0) {
                            break;
                        }

                        float var121;
                        if (var5 == 0) {
                            var16 += 913206198;
                            var16 ^= -45271096;
                            Integer var120 = var16;
                            if (var120 == null) {
                                break;
                            }

                            var121 = 0.0F;
                            var16 *= 1455780363;
                            var16 *= 609366067;
                            var16 ^= 810697974;
                            var16 ^= -1095001184;
                        } else {
                            var16 >>= 2;
                            var16 >>>= 23;
                            var16 *= -1135508971;
                            var16 |= 1500497600;
                            var16 ^= 962424177;
                            float var109 = var108 + 7.0F;
                            int var145 = var3 + 1;
                            int var146 = var3 * var145;
                            int var166 = var3 + 2;
                            int var147 = var146 * var166;
                            var3 += 3;
                            int var148 = var147 * var3;
                            var3 = var148 & 7;
                            if (var3 != 0) {
                                var16 &= 7907789;
                                var16 += -1612474335;
                                var16 >>>= 14;
                                var16 ^= 1489868458;
                                break label122;
                            }

                            var16 *= 1593746477;
                            var16 ^= -1885361928;
                            var121 = var109;
                            var16 -= 187227323;
                            var16 ^= 1353777260;
                        }

                        Integer var98 = var16;
                        if (var98 != null) {
                            return var121;
                        }
                        break;
                    }

                    var16 -= 2099966165;
                    var16 *= -375917735;
                    var16 -= 72137316;
                    var16 >>>= 28;
                    var16 ^= 1547742479;
                    int var124 = var16 + 1;
                    int var125 = var16 * var124;
                    int var126 = var125 & 1;
                    if (var126 != 0) {
                        break;
                    }

                    Object var127 = var113.next();
                    XR var128 = (XR)var127;
                    var7 = var3;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var7 = var9 & 1L;
                    long var175;
                    int var153 = (var175 = var7 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                    if (var153 != 0) {
                        var16 |= 666000749;
                        var16 *= 1234171199;
                        var16 -= 1953044921;
                        var16 ^= 1627423648;
                        break label122;
                    }

                    var16 ^= -2114238105;
                    var16 -= -387563306;
                    var16 >>= 22;
                    var16 &= 1517490866;
                    var16 ^= -826457044;
                    xB var154 = var128.W();
                    boolean var155 = var154.gQ();
                    float var132;
                    if (var155) {
                        var16 ^= -1289135424;
                        var16 |= 1240328147;
                        var16 ^= -547054120;
                        Integer var156 = var16;
                        if (var156 == null) {
                            break;
                        }

                        float var129 = var128.v();
                        Integer var157 = var3;
                        if (var157 == null) {
                            switch (var16) {
                                case -1333038553:
                                    var16 *= 1871628533;
                                    var16 ^= -1479034309;
                                    var16 &= 515239878;
                                    var16 |= -1969640954;
                                    var16 ^= -698959364;
                                    break label122;
                                case 618444:
                                    var16 ^= -1585752942;
                                    break label122;
                                case 1258146447:
                                default:
                                    var16 ^= -1191893579;
                                    break label122;
                            }
                        }

                        var16 &= -1340415231;
                        var16 -= 232685152;
                        var16 ^= -926046309;
                        Integer var158 = var16;
                        if (var158 == null) {
                            break;
                        }

                        float var130 = var129 + 2.0F;
                        float var131 = var108 + var130;
                        var132 = var131;
                        switch (var16) {
                            case -1233281949:
                                var16 ^= 1466673624;
                                break;
                            case 419082821:
                            default:
                                var16 ^= 1368618067;
                                break;
                            case 1793475642:
                                var16 -= 1758350229;
                                var16 -= -84419746;
                                var16 ^= 176661542;
                                var16 ^= 1723838495;
                        }
                    } else {
                        var16 >>= 12;
                        var16 *= 304680749;
                        var16 ^= 1858512314;
                        var7 = var16;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var176;
                        int var161 = (var176 = var7 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var161 != 0) {
                            break;
                        }

                        var132 = var108;
                        var16 >>= 13;
                        var16 -= -206740577;
                        var16 *= -222572999;
                        var16 -= 2032539121;
                        var16 ^= 505018292;
                    }

                    var108 = var132;
                    var16 += -1865447333;
                    var16 ^= -1024989019;
                }
            }

            IllegalArgumentException var99 = new IllegalArgumentException();
            throw var99;
        } else {
            switch (var1) {
                case -137871435:
                    int var15 = var1 ^ 1119358746;
                    break;
                case -44498863:
                    int var11 = var1 + -611131029;
                    var11 |= -1589222471;
                    var11 -= -280911483;
                    var11 ^= 1382110338;
                    break;
                case 1627396537:
                default:
                    int var2 = var1 ^ 1488956739;
            }
        }

        RuntimeException var95 = new RuntimeException();
        throw var95;
    }

    public float p() {
        int var1 = OB;
        var1 ^= -273331373;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var28;
        var2 = (var28 = var22 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -434653025;
            var1 >>>= 9;
            var1 -= -1361232993;
            var1 ^= 2077875593;
            Integer var24 = var1;
            if (var24 != null) {
                return this.sX;
            }
        } else {
            var1 += 743853328;
            var1 &= 769380642;
            var1 += 1106041768;
            var1 ^= -1678707050;
            Integer var17 = var1;
            if (var17 != null) {
                RuntimeException var19 = new RuntimeException();
                throw var19;
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public void X(jX var1, float var2) {
        float var229 = 0.0F;
        label294: {
            int var3 = OB;
            var3 ^= 948832451;
            int var4 = System.identityHashCode(this);
            zz var5 = this.cD;
            Yn var6 = this.mr;
            boolean var218 = var6.B();
            Integer var7 = var4;
            if (var7 != null) {
                var3 = switch (var3) {
                    case -2036716336 -> var3 ^ -804071659;
                    default -> var3 ^ -89738009;
                    case -220443454 -> {
                        var3 ^= 2071421337;
                        var3 ^= 972920920;
                        var3 |= -1978673902;
                        yield var3 ^ -2046910449;
                    }
                };
                float var219;
                if (var218) {
                    var3 >>>= 16;
                    var3 ^= -1383232462;
                    var3 ^= -1903830261;
                    var219 = 1.0F;
                    switch (var3) {
                        case -166405937:
                            var3 ^= -1826897489;
                            break;
                        case -59806432:
                        default:
                            var3 ^= 1626301849;
                            break;
                        case 587753624:
                            var3 |= -331390782;
                            var3 &= 1342101222;
                            var3 ^= -402689295;
                    }
                } else {
                    var3 *= -1858447623;
                    var3 |= 610667022;
                    var3 |= -1554540398;
                    var3 ^= 993913912;
                    int var260 = var3 + 1;
                    var260 = var3 * var260;
                    var260 &= 1;
                    if (var260 != 0) {
                        break label294;
                    }

                    var219 = 0.0F;
                    switch (var3) {
                        case -2067638650:
                            var3 -= 1276033306;
                            var3 ^= -1871532193;
                            break;
                        case -1507036699:
                            var3 ^= 1246815110;
                            break;
                        case 816001201:
                        default:
                            var3 ^= -1967364147;
                    }
                }

                var7 = var3;
                if (var7 == null) {
                    break label294;
                }

                var5.Td(var219);
                var5 = this.cD;
                float var185 = var5.et(var2);
                XF var186 = this.dJ;
                var6 = this.mr;
                boolean var221 = var6.B();
                var7 = var4;
                if (var7 == null) {
                    switch (var3) {
                        case -1463733709:
                            var3 >>= 3;
                            var3 += -1484947574;
                            var3 |= 2072009321;
                            var3 ^= 1963267387;
                            break;
                        case 1631667810:
                        default:
                            var3 ^= 1296569974;
                            break;
                        case 1772097325:
                            var3 ^= -537597722;
                    }
                } else {
                    label298: {
                        label299: {
                            var3 -= 846934622;
                            var3 -= -112814686;
                            var3 &= 1395416048;
                            var3 ^= -809673098;
                            if (!var221) {
                                var3 -= -2009565537;
                                var3 ^= -1550782408;
                                var3 |= 457509930;
                                var3 ^= 940219883;
                                int var222 = var3 + 1;
                                int var223 = var3 * var222;
                                int var224 = var223 & 1;
                                if (var224 != 0) {
                                    break label294;
                                }

                                boolean var225 = this.e;
                                long var265 = var4;
                                long var9 = var265 + 1L;
                                var9 = var265 * var9;
                                long var11 = var265 + 2L;
                                var9 *= var11;
                                long var266 = var265 + 3L;
                                var9 *= var266;
                                long var267 = var9 & 7L;
                                long var347;
                                int var268 = (var347 = var267 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                                if (var268 != 0) {
                                    var3 |= -1938600261;
                                    var3 ^= 90641469;
                                    break label298;
                                }

                                var3 ^= 536916275;
                                var3 *= -1976729075;
                                var3 ^= -730385740;
                                var3 ^= 2130036743;
                                if (!var225) {
                                    var3 += 805286422;
                                    var3 -= 1454219537;
                                    var3 *= 83952013;
                                    var3 |= 2121476931;
                                    var3 ^= -345498769;
                                    long var226 = var3;
                                    long var8 = var226 + 1L;
                                    var8 = var226 * var8;
                                    long var227 = var8 & 1L;
                                    long var348;
                                    int var228 = (var348 = var227 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                                    if (var228 != 0) {
                                        break label294;
                                    }

                                    var229 = 0.0F;
                                    switch (var3) {
                                        case -1801457532:
                                            var3 <<= 18;
                                            var3 *= 1827481513;
                                            var3 &= -319274067;
                                            var3 ^= 2045562653;
                                            break label299;
                                        case -675185328:
                                        default:
                                            var3 ^= 499661780;
                                            break label299;
                                        case 1112847607:
                                            var3 ^= 1413336056;
                                            break label299;
                                    }
                                }

                                switch (var3) {
                                    case -1102553624:
                                        var3 ^= 621252948;
                                        break;
                                    case -996908259:
                                    default:
                                        var3 ^= -782445272;
                                        break;
                                    case 334322312:
                                        var3 &= 1529382831;
                                        var3 ^= -207558023;
                                }
                            } else {
                                var3 ^= 94161634;
                                var3 &= -2059669938;
                                var3 >>>= 24;
                                var3 ^= -527898511;
                            }

                            var7 = var3;
                            if (var7 == null) {
                                break label294;
                            }

                            var229 = 1.0F;
                            var3 -= 577845651;
                            var3 >>>= 26;
                            var3 ^= -176369870;
                        }

                        int var270 = var3 + 1;
                        var270 = var3 * var270;
                        int var314 = var3 + 2;
                        var270 *= var314;
                        var314 = var3 + 3;
                        var270 *= var314;
                        var270 &= 7;
                        if (var270 != 0) {
                            break label294;
                        }

                        var186.H(var229);
                        XF var187 = this.dJ;
                        float var188 = var187.N(var2);
                        long var189 = var4;
                        long var275 = var189 + 1L;
                        long var276 = var189 * var275;
                        long var330 = var189 + 2L;
                        long var277 = var276 * var330;
                        long var190 = var189 + 3L;
                        long var278 = var277 * var190;
                        long var191 = var278 & 7L;
                        long var349;
                        int var192 = (var349 = var191 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                        if (var192 != 0) {
                            var3 ^= -575625725;
                            var3 ^= 13484011;
                            var3 ^= 855398313;
                            var3 >>= 4;
                            var3 ^= -1958792489;
                        } else {
                            var3 |= -630089191;
                            var3 ^= -1602254772;
                            long var193 = var3;
                            long var279 = var193 + 1L;
                            long var280 = var193 * var279;
                            var330 = var193 + 2L;
                            long var281 = var280 * var330;
                            long var194 = var193 + 3L;
                            long var282 = var281 * var194;
                            long var195 = var282 & 7L;
                            long var350;
                            int var196 = (var350 = var195 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                            if (var196 != 0) {
                                break label294;
                            }

                            XF var197 = this.vy;
                            boolean var230 = this.e;
                            float var236;
                            if (var230) {
                                var3 += -545478404;
                                var3 -= 1967052437;
                                var3 ^= -652479828;
                                int var231 = var3 + 1;
                                int var232 = var3 * var231;
                                var270 = var3 + 2;
                                int var233 = var232 * var270;
                                var270 = var3 + 3;
                                int var234 = var233 * var270;
                                int var235 = var234 & 7;
                                if (var235 != 0) {
                                    break label294;
                                }

                                var236 = 1.0F;
                                switch (var3) {
                                    case -1755310485:
                                        var3 ^= 1194512261;
                                        break;
                                    case 274455316:
                                        var3 |= 861920504;
                                        var3 *= -1419871867;
                                        var3 ^= 1963919929;
                                        break;
                                    case 1856030000:
                                    default:
                                        var3 ^= -1818751488;
                                }
                            } else {
                                var3 -= 1646410635;
                                var3 -= -1655070422;
                                var3 *= -1268187043;
                                var3 ^= -1280442348;
                                long var285 = var3;
                                var330 = var285 + 1L;
                                var330 = var285 * var330;
                                long var286 = var330 & 1L;
                                long var351;
                                var270 = (var351 = var286 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                if (var270 != 0) {
                                    break label294;
                                }

                                var236 = 0.0F;
                                switch (var3) {
                                    case -1389893868:
                                        var3 ^= 1601598754;
                                        break;
                                    case -49007282:
                                    default:
                                        var3 ^= 889945863;
                                        break;
                                    case 511216312:
                                        var3 += -250432016;
                                        var3 -= 1781310819;
                                        var3 &= -522827042;
                                        var3 ^= 1097628049;
                                }
                            }

                            var197.H(var236);
                            XF var198 = this.vy;
                            float var199 = var198.N(var2);
                            float var200 = this.D;
                            float var237 = this.IK;
                            float var288 = this.iG;
                            boolean var201 = var1.hQ(var200, var237, var288, 24.0F);
                            long var238 = var4;
                            long var316 = var238 + 1L;
                            long var317 = var238 * var316;
                            long var239 = var317 & 1L;
                            long var352;
                            int var240 = (var352 = var239 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                            if (var240 != 0) {
                                switch (var3) {
                                    case -516262955:
                                        var3 *= 1912259511;
                                        var3 *= 807115865;
                                        var3 >>>= 11;
                                        var3 ^= -1971044800;
                                        break;
                                    case -492375515:
                                    default:
                                        var3 ^= 2092762760;
                                        break;
                                    case 118473761:
                                        var3 ^= 1985242909;
                                }
                            } else {
                                var3 |= -1348884418;
                                var3 >>>= 8;
                                var3 ^= -2011004072;
                                int var241 = var3 + 1;
                                int var242 = var3 * var241;
                                int var243 = var242 & 1;
                                if (var243 != 0) {
                                    break label294;
                                }

                                XF var244 = this.WS;
                                float var294;
                                if (var201) {
                                    var3 |= 955627728;
                                    var3 ^= -1976721323;
                                    var270 = var3 + 1;
                                    var270 = var3 * var270;
                                    var314 = var3 + 2;
                                    var270 *= var314;
                                    var314 = var3 + 3;
                                    var270 *= var314;
                                    var270 &= 7;
                                    if (var270 != 0) {
                                        break label294;
                                    }

                                    var294 = 1.0F;
                                    var3 ^= -867667562;
                                    var3 ^= -1393648709;
                                } else {
                                    var3 <<= 10;
                                    var3 |= -753491577;
                                    var3 ^= 1486484714;
                                    Integer var320 = var3;
                                    if (var320 == null) {
                                        break label294;
                                    }

                                    var294 = 0.0F;
                                    switch (var3) {
                                        case -1351657107:
                                            var3 &= 487314613;
                                            var3 >>= 26;
                                            var3 &= 2072623901;
                                            var3 *= 33133811;
                                            var3 ^= 1401906808;
                                            break;
                                        case 1386438309:
                                        default:
                                            var3 ^= 1107261562;
                                            break;
                                        case 1642410571:
                                            var3 ^= -2142935607;
                                    }
                                }

                                long var321 = var3;
                                long var10 = var321 + 1L;
                                var10 = var321 * var10;
                                long var12 = var321 + 2L;
                                var10 *= var12;
                                long var322 = var321 + 3L;
                                var10 *= var322;
                                long var323 = var10 & 7L;
                                long var353;
                                var314 = (var353 = var323 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                                if (var314 != 0) {
                                    break label294;
                                }

                                var244.H(var294);
                                XF var245 = this.WS;
                                Integer var295 = var4;
                                if (var295 == null) {
                                    var3 -= -479024885;
                                    var3 -= 48624976;
                                    var3 |= 458625733;
                                    var3 |= 397684318;
                                    var3 ^= -177302467;
                                } else {
                                    label303: {
                                        var3 ^= -782018726;
                                        var3 -= 1753031302;
                                        var3 >>>= 10;
                                        var3 += -907642278;
                                        var3 ^= -67507121;
                                        long var296 = var3;
                                        var330 = var296 + 1L;
                                        var330 = var296 * var330;
                                        long var345 = var296 + 2L;
                                        var330 *= var345;
                                        long var297 = var296 + 3L;
                                        var330 *= var297;
                                        long var298 = var330 & 7L;
                                        long var354;
                                        int var299 = (var354 = var298 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                                        if (var299 != 0) {
                                            break label294;
                                        }

                                        float var246 = var245.N(var2);
                                        float var204;
                                        if (var201) {
                                            var3 *= -464872565;
                                            var3 |= 975268736;
                                            var3 ^= 919499404;
                                            float var202 = this.sX;
                                            float var203 = var202 + var2;
                                            Integer var247 = var4;
                                            if (var247 == null) {
                                                var3 ^= -401587257;
                                                var3 *= -1314283425;
                                                var3 &= 87501988;
                                                var3 ^= -1901998490;
                                                break label303;
                                            }
                                            var3 = switch (var3) {
                                                default -> var3 ^ -1974361098;
                                                case 145722699 -> {
                                                    var3 |= 1452928112;
                                                    yield var3 ^ -1789013658;
                                                }
                                                case 1355060090 -> var3 ^ -543756235;
                                            };
                                            var204 = var203;
                                            var3 += 1465084694;
                                            var3 ^= 1831258454;
                                            var3 ^= 1905681150;
                                            var3 &= 1660123126;
                                            var3 ^= 711248135;
                                        } else {
                                            var3 *= 1690677981;
                                            var3 ^= 1158731974;
                                            var204 = 0.0F;
                                            switch (var3) {
                                                case -810878201:
                                                    var3 += 1268077022;
                                                    var3 ^= 329613680;
                                                    break;
                                                case -112955025:
                                                    var3 ^= -658623792;
                                                    break;
                                                case 1406733098:
                                                default:
                                                    var3 ^= -1482481756;
                                            }
                                        }

                                        this.sX = var204;
                                        int var205 = var4 + 1;
                                        int var206 = var4 * var205;
                                        int var248 = var4 + 2;
                                        int var207 = var206 * var248;
                                        int var249 = var4 + 3;
                                        int var208 = var207 * var249;
                                        int var209 = var208 & 7;
                                        if (var209 == 0) {
                                            var3 = switch (var3) {
                                                case -1860136784 -> var3 ^ -1637574919;
                                                case 149278101 -> {
                                                    var3 += -1907832078;
                                                    var3 += -633841291;
                                                    var3 *= 166059623;
                                                    yield var3 ^ 235158562;
                                                }
                                                default -> var3 ^ 398923044;
                                            };
                                            XF var210 = this.vy;
                                            float var211 = var210.bs();
                                            float var355;
                                            int var212 = (var355 = var211 - 0.001F) == 0.0F ? 0 : (var355 < 0.0F ? -1 : 1);
                                            if (var212 <= 0) {
                                                var3 |= 363827302;
                                                var3 |= 1076676644;
                                                var3 ^= 1567624047;
                                                return;
                                            }

                                            var3 &= 1645962171;
                                            var3 |= -851899238;
                                            var3 ^= 1906172651;
                                            Integer var213 = var3;
                                            if (var213 == null) {
                                                break label294;
                                            }

                                            List var214 = this.mm;
                                            Integer var250 = var4;
                                            if (var250 != null) {
                                                var3 ^= 442007889;
                                                var3 |= 1562653627;
                                                var3 <<= 11;
                                                var3 ^= -1039002330;
                                                Integer var251 = var3;
                                                if (var251 == null) {
                                                    break label294;
                                                }

                                                Iterator var215 = var214.iterator();
                                                Iterator var216 = var215;

                                                var3 = switch (var3) {
                                                    case -223521520 -> var3 ^ -538020114;
                                                    case 871353638 -> {
                                                        var3 >>= 24;
                                                        yield var3 ^ -523882405;
                                                    }
                                                    default -> var3 ^ 986421685;
                                                };

                                                while (true) {
                                                    int var252 = var3 + 1;
                                                    int var253 = var3 * var252;
                                                    var299 = var3 + 2;
                                                    int var254 = var253 * var299;
                                                    var299 = var3 + 3;
                                                    int var255 = var254 * var299;
                                                    int var256 = var255 & 7;
                                                    if (var256 != 0) {
                                                        break label294;
                                                    }

                                                    boolean var257 = var216.hasNext();
                                                    var299 = var4 + 1;
                                                    var299 = var4 * var299;
                                                    var314 = var4 + 2;
                                                    var299 *= var314;
                                                    var314 = var4 + 3;
                                                    var299 *= var314;
                                                    var299 &= 7;
                                                    if (var299 != 0) {
                                                        var3 |= -1558467882;
                                                        var3 ^= 1305934674;
                                                        var3 &= -188872607;
                                                        var3 |= 872873243;
                                                        var3 ^= 1050548217;
                                                        break;
                                                    }
                                                    var3 = switch (var3) {
                                                        default -> var3 ^ 336083215;
                                                        case -523882392 -> {
                                                            var3 ^= -224557145;
                                                            var3 |= 1005929635;
                                                            yield var3 ^ 1278280719;
                                                        }
                                                        case 1284556628 -> var3 ^ -363358564;
                                                    };
                                                    Integer var307 = var3;
                                                    if (var307 == null) {
                                                        break label294;
                                                    }

                                                    if (!var257) {
                                                        switch (var3) {
                                                            case -927693222:
                                                            default:
                                                                var3 ^= 1499368582;
                                                                return;
                                                            case 326358824:
                                                                var3 ^= -718833761;
                                                                return;
                                                            case 2010051552:
                                                                var3 -= -106427285;
                                                                var3 |= -1477898182;
                                                                var3 |= 1873436751;
                                                                var3 &= -674483291;
                                                                var3 ^= -49029076;
                                                                return;
                                                        }
                                                    }

                                                    var3 |= 1924994786;
                                                    var3 *= -879907151;
                                                    var3 &= 50728200;
                                                    var3 ^= 680766409;
                                                    XR var258 = (XR)var216.next();
                                                    var307 = var4;
                                                    if (var307 == null) {
                                                        var3 ^= 1285171591;
                                                        var3 <<= 16;
                                                        var3 &= 2064680540;
                                                        var3 ^= -2121209150;
                                                        break;
                                                    }

                                                    var3 |= 995986801;
                                                    var3 += 1073729982;
                                                    var3 &= -852241637;
                                                    var3 *= 1336816987;
                                                    var3 ^= 1811093166;
                                                    long var309 = var3;
                                                    var330 = var309 + 1L;
                                                    var330 = var309 * var330;
                                                    var345 = var309 + 2L;
                                                    var330 *= var345;
                                                    long var310 = var309 + 3L;
                                                    var330 *= var310;
                                                    long var311 = var330 & 7L;
                                                    long var356;
                                                    int var312 = (var356 = var311 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                                                    if (var312 != 0) {
                                                        break label294;
                                                    }

                                                    var258 = var258;
                                                    var258.ol(var2);
                                                    var3 >>>= 24;
                                                    var3 ^= 858085573;
                                                    var3 *= -734751531;
                                                    var3 += 558173169;
                                                    var3 ^= -26398961;
                                                }
                                            } else {
                                                var3 &= 521561712;
                                                var3 <<= 1;
                                                var3 ^= -1231247838;
                                            }
                                        } else {
                                            switch (var3) {
                                                case -2077531724:
                                                default:
                                                    var3 ^= 1366901526;
                                                    break;
                                                case 149278101:
                                                    var3 *= -1514950293;
                                                    var3 *= 1159273693;
                                                    var3 ^= -1630404215;
                                                    break;
                                                case 1243056686:
                                                    var3 ^= 709460133;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                var3 += 1912760168;
                var3 >>= 26;
                var3 ^= -1970214181;
            }

            var4 = var3 + 1;
            var4 = var3 * var4;
            int var217 = var3 + 2;
            var4 *= var217;
            var3 += 3;
            var4 *= var3;
            var3 = var4 & 7;
            if (var3 == 0) {
                RuntimeException var179 = new RuntimeException();
                throw var179;
            }
        }

        IllegalArgumentException var178 = new IllegalArgumentException();
        throw var178;
    }

    public void mo(Canvas var1, jX var2, float var3, float var4, float var5, float var6) {
        int var7 = OB;
        var7 ^= 661770570;
        int var8 = System.identityHashCode(this);
        this.D = var3;
        this.IK = var4;
        this.iG = var5;
        float var9 = this.V();
        int var10 = var8 + 1;
        var10 = var8 * var10;
        int var11 = var8 + 2;
        var10 *= var11;
        var11 = var8 + 3;
        var10 *= var11;
        var10 &= 7;
        if (var10 != 0) {
            switch (var7) {
                case -316435125:
                    var7 &= -923517009;
                    var7 += -155669233;
                    var7 *= 1516745769;
                    var7 ^= 915105508;
                    break;
                case 1677475841:
                    var7 ^= -1613975820;
                    break;
                case 1909633350:
                default:
                    var7 ^= -2037046679;
            }
        } else {
            label369: {
                var7 |= 885782751;
                var7 -= 760263780;
                var7 ^= -99874472;
                long var245 = var7;
                long var12 = var245 + 1L;
                var12 = var245 * var12;
                long var246 = var12 & 1L;
                long var494;
                var10 = (var494 = var246 - 0L) == 0L ? 0 : (var494 < 0L ? -1 : 1);
                label347:
                if (var10 == 0) {
                    XF var248 = this.dJ;
                    float var249 = var248.bs();
                    float var250 = TP.S(var249);
                    XF var277 = this.WS;
                    float var278 = var277.bs();
                    var11 = DP.nq(163962623, var278);
                    var11 = DP.Z(var11, 314957567, var250);
                    int var347 = DP.R(var11);
                    if (var347 > 0) {
                        var7 |= 294704180;
                        var7 ^= 1366894618;
                        var12 = var7;
                        long var14 = var12 + 1L;
                        var14 = var12 * var14;
                        long var16 = var12 + 2L;
                        var14 *= var16;
                        var12 += 3L;
                        var14 *= var12;
                        var12 = var14 & 7L;
                        long var495;
                        int var351 = (var495 = var12 - 0L) == 0L ? 0 : (var495 < 0L ? -1 : 1);
                        if (var351 != 0) {
                            break label347;
                        }

                        var11 = DP.nq(var11, var6);
                        var12 = var8;
                        var14 = var12 + 1L;
                        var14 = var12 * var14;
                        var12 = var14 & 1L;
                        long var496;
                        int var354 = (var496 = var12 - 0L) == 0L ? 0 : (var496 < 0L ? -1 : 1);
                        if (var354 != 0) {
                            var7 += 193108256;
                            var7 >>>= 29;
                            var7 += -900493095;
                            var7 -= 1934287459;
                            var7 ^= 1411684023;
                            break label369;
                        }

                        var7 &= -1795727899;
                        var7 ^= -369412443;
                        var1.roundRect(var3, var4, var5, var9, 7.0F, var11);
                        var7 >>= 7;
                        var7 *= 1840213419;
                        var7 ^= 1289795732;
                    } else {
                        switch (var7) {
                            case -377886455:
                                var7 ^= 1247498959;
                                break;
                            case 714555427:
                                var7 >>>= 2;
                                var7 ^= 189896155;
                                break;
                            case 1504644744:
                            default:
                                var7 ^= -2042636986;
                        }
                    }

                    Yn var282 = this.mr;
                    int var283 = (var282.B()) ? 1 : 0;
                    var12 = var8;
                    long var449 = var12 + 1L;
                    var449 = var12 * var449;
                    long var484 = var12 + 2L;
                    var449 *= var484;
                    var12 += 3L;
                    var449 *= var12;
                    var12 = var449 & 7L;
                    long var497;
                    int var358 = (var497 = var12 - 0L) == 0L ? 0 : (var497 < 0L ? -1 : 1);
                    if (var358 == 0) {
                        var7 = switch (var7) {
                            case 32785875 -> {
                                var7 &= -807204810;
                                yield var7 ^ -796086176;
                            }
                            case 1936013525 -> var7 ^ -684161612;
                            default -> var7 ^ 14873103;
                        };
                        if (var283 != 0) {
                            var7 *= -1993760801;
                            var7 |= -1711320273;
                            var7 &= 1494220999;
                            var7 ^= -1225600801;
                            var7 ^= 1189279741;
                            var283 = var7 + 1;
                            var283 = var7 * var283;
                            var283 &= 1;
                            if (var283 != 0) {
                                break label347;
                            }

                            Yn var287 = this.mr;
                            int var288 = (var287.jp()) ? 1 : 0;
                            int var359 = var8 + 1;
                            int var360 = var8 * var359;
                            int var13 = var8 + 2;
                            int var361 = var360 * var13;
                            var13 = var8 + 3;
                            int var362 = var361 * var13;
                            int var363 = var362 & 7;
                            if (var363 != 0) {
                                switch (var7) {
                                    case -385865883:
                                        var7 ^= -1310068370;
                                        var7 -= 706299712;
                                        var7 >>= 30;
                                        var7 += -1766995350;
                                        var7 ^= -1786645852;
                                        break label369;
                                    case 2048080241:
                                    default:
                                        var7 ^= -614168128;
                                        break label369;
                                    case 2073323723:
                                        var7 ^= -2119903425;
                                        break label369;
                                }
                            }

                            var7 -= 1377939396;
                            var7 -= 1080398939;
                            var7 += 1436705098;
                            var7 -= -712229255;
                            var7 ^= -567184380;
                            if (var288 != 0) {
                                var7 = switch (var7) {
                                    default -> var7 ^ 1678143632;
                                    case 61333793 -> var7 ^ -1471034952;
                                    case 146698771 -> {
                                        var7 |= 804011771;
                                        yield var7 ^ 1257835412;
                                    }
                                };
                                long var289 = var7;
                                long var407 = var289 + 1L;
                                long var408 = var289 * var407;
                                long var290 = var408 & 1L;
                                long var498;
                                var288 = (var498 = var290 - 0L) == 0L ? 0 : (var498 < 0L ? -1 : 1);
                                if (var288 != 0) {
                                    break label347;
                                }

                                float var292 = var3 + 3.0F;
                                float var364 = var4 + 9.0F;
                                Integer var409 = var8;
                                if (var409 == null) {
                                    var7 >>>= 13;
                                    var7 ^= 53416181;
                                    break label369;
                                }

                                var7 *= -541391041;
                                var7 &= -1568492695;
                                var7 ^= 2028813296;
                                var409 = var7;
                                if (var409 == null) {
                                    break label347;
                                }

                                int var411 = DP.nq(-7684353, var6);
                                var1.roundRect(var292, var364, 1.5F, 6.0F, 0.75F, var411);
                                var7 ^= 424733568;
                                var7 &= -1867401761;
                                var7 ^= 692082737;
                                var7 *= -880198911;
                                var7 ^= -1901872709;
                            } else {
                                var7 ^= -38199717;
                                var7 ^= -1796268845;
                            }
                        } else {
                            var7 <<= 2;
                            var7 -= -1826212253;
                            var7 ^= -748356610;
                        }

                        var283 = var7 + 1;
                        var283 = var7 * var283;
                        int var365 = var7 + 2;
                        var283 *= var365;
                        int var366 = var7 + 3;
                        var283 *= var366;
                        var283 &= 7;
                        if (var283 != 0) {
                            break label347;
                        }

                        Yn var298 = this.mr;
                        int var299 = (var298.jp()) ? 1 : 0;
                        Integer var367 = var8;
                        if (var367 == null) {
                            var7 ^= -579070500;
                            var7 |= -1667656443;
                            var7 &= 1461895907;
                            var7 |= 882700032;
                            var7 ^= 934336397;
                            break label369;
                        }

                        var7 ^= -1385646084;
                        var7 ^= 265084265;
                        var7 *= 1622899359;
                        var7 ^= 2073028729;
                        Integer var368 = var7;
                        if (var368 == null) {
                            break label347;
                        }

                        if (var299 != 0) {
                            var7 |= 1713602616;
                            var7 ^= 1708996672;
                            List var300 = this.mm;
                            var299 = var300.isEmpty() ? 1 : 0;
                            int var369 = var8 + 1;
                            int var370 = var8 * var369;
                            int var371 = var370 & 1;
                            if (var371 != 0) {
                                var7 += 2039444358;
                                var7 |= 2000612489;
                                var7 *= 868297487;
                                var7 ^= -1678211063;
                                break label369;
                            }

                            var7 -= -152826564;
                            var7 ^= -42352300;
                            Integer var372 = var7;
                            if (var372 == null) {
                                break label347;
                            }

                            if (var299 == 0) {
                                var7 ^= -1954805420;
                                var7 &= 348768729;
                                var7 &= 1112975576;
                                var7 ^= -522320107;
                                float var302 = var3 + var5;
                                float var303 = var302 - 33.0F;
                                float var373 = var4 + 12.0F;
                                XF var412 = this.vy;
                                int var453 = var8 + 1;
                                int var454 = var8 * var453;
                                int var15 = var8 + 2;
                                int var455 = var454 * var15;
                                var15 = var8 + 3;
                                int var456 = var455 * var15;
                                int var457 = var456 & 7;
                                if (var457 != 0) {
                                    var7 <<= 11;
                                    var7 *= -355799841;
                                    var7 ^= -1511218994;
                                    break label369;
                                }

                                var7 <<= 9;
                                var7 -= 1939543637;
                                var7 &= 466896338;
                                var7 &= 113437169;
                                var7 ^= -1217819148;
                                int var458 = var7 + 1;
                                int var459 = var7 * var458;
                                int var460 = var459 & 1;
                                if (var460 != 0) {
                                    break label347;
                                }

                                float var413 = var412.bs();
                                XF var461 = this.WS;
                                float var462 = var461.bs();
                                float var463 = var462 * 0.55F;
                                float var464 = 0.45F + var463;
                                float var465 = var6 * var464;
                                int var466 = DP.nq(-6639411, var465);
                                Hc.D(var1, var303, var373, var413, var466);
                                var7 |= 1279919225;
                                var7 ^= 762964936;
                                var7 *= 101892445;
                                var7 -= -362472370;
                                var7 ^= -1272037896;
                            } else {
                                var7 += -1362321915;
                                var7 ^= 1583768251;
                            }
                        } else {
                            var7 += 426568624;
                            var7 -= 717105605;
                            var7 ^= -384840643;
                        }

                        var299 = var7 + 1;
                        var299 = var7 * var299;
                        var299 &= 1;
                        if (var299 != 0) {
                            break label347;
                        }

                        var10 = DP.Z(-4075035, -854017, var250);
                        var10 = DP.nq(var10, var6);
                        TextStyle var253 = TextStyle.of(8.8F, var10);
                        TextStyle var254 = var253.medium();
                        zz var307 = this.cD;
                        float var308 = var307.qm();
                        float var309 = TP.S(var308);
                        float var310 = 0.06F * var309;
                        TextStyle var255 = var254.weight(var310);
                        Yn var311 = this.mr;
                        String var312 = var311.UJ();
                        float var374 = var3 + 10.0F;
                        float var414 = var4 + 12.0F;
                        int var467 = var8 + 1;
                        int var468 = var8 * var467;
                        int var469 = var468 & 1;
                        if (var469 != 0) {
                            var7 &= -1212313186;
                            var7 ^= 808724548;
                            break label369;
                        }

                        var7 <<= 7;
                        var7 ^= 455063518;
                        var7 -= 1633529924;
                        var7 ^= 1727888848;
                        var449 = var7;
                        var484 = var449 + 1L;
                        var484 = var449 * var484;
                        long var18 = var449 + 2L;
                        var484 *= var18;
                        var449 += 3L;
                        var484 *= var449;
                        var449 = var484 & 7L;
                        long var499;
                        int var473 = (var499 = var449 - 0L) == 0L ? 0 : (var499 < 0L ? -1 : 1);
                        if (var473 != 0) {
                            break label347;
                        }

                        var414 -= 5.2F;
                        float var256 = var1.text(var312, var374, var414, var255);
                        Yn var257 = this.mr;
                        int var258 = (var257.jp()) ? 1 : 0;
                        if (var258 != 0) {
                            var7 ^= -2058310412;
                            var7 ^= 1453773329;
                            float var259 = var3 + var5;
                            float var260 = var259 - 27.0F;
                            float var313 = var4 + 12.0F;
                            float var314 = var313 - 6.0F;
                            zz var375 = this.cD;
                            float var376 = var375.qm();
                            zz var416 = this.cD;
                            Integer var474 = var8;
                            if (var474 == null) {
                                var7 >>>= 29;
                                var7 ^= 53229770;
                                break label369;
                            }

                            var7 &= 1647316372;
                            var7 |= -567294648;
                            var7 &= -966610146;
                            var7 ^= 2100196769;
                            var449 = var7;
                            var484 = var449 + 1L;
                            var484 = var449 * var484;
                            var18 = var449 + 2L;
                            var484 *= var18;
                            var449 += 3L;
                            var484 *= var449;
                            var449 = var484 & 7L;
                            long var500;
                            int var478 = (var500 = var449 - 0L) == 0L ? 0 : (var500 < 0L ? -1 : 1);
                            if (var478 != 0) {
                                break label347;
                            }

                            var414 = var416.f();
                            Hc.e(var1, var260, var314, var376, var414, var6);
                            switch (var7) {
                                case -1156778835:
                                    var7 += -1474806322;
                                    var7 <<= 1;
                                    var7 ^= 143033009;
                                    break;
                                case -455954589:
                                default:
                                    var7 ^= -1685941789;
                                    break;
                                case -15689236:
                                    var7 ^= -1763590639;
                            }
                        } else {
                            var7 += 1118822596;
                            var7 &= -1637648271;
                            var7 ^= -967052938;
                            Integer var261 = var7;
                            if (var261 == null) {
                                break label347;
                            }

                            List var262 = this.mm;
                            var258 = var262.isEmpty() ? 1 : 0;
                            long var315 = var8;
                            long var418 = var315 + 1L;
                            long var419 = var315 * var418;
                            long var316 = var419 & 1L;
                            long var501;
                            var299 = (var501 = var316 - 0L) == 0L ? 0 : (var501 < 0L ? -1 : 1);
                            if (var299 != 0) {
                                switch (var7) {
                                    case -1262543099:
                                    default:
                                        var7 ^= 620146497;
                                        break label369;
                                    case 714382504:
                                        var7 ^= 1957158872;
                                        break label369;
                                    case 1381552502:
                                        var7 <<= 23;
                                        var7 &= -1508376443;
                                        var7 ^= -1456610006;
                                        var7 |= 2131481567;
                                        var7 ^= 2080624433;
                                        break label369;
                                }
                            }

                            var7 -= 1038702825;
                            var7 >>>= 6;
                            var7 += 342084540;
                            var7 >>>= 18;
                            var7 ^= -1388707559;
                            long var318 = var7;
                            long var420 = var318 + 1L;
                            long var421 = var318 * var420;
                            long var482 = var318 + 2L;
                            long var422 = var421 * var482;
                            long var319 = var318 + 3L;
                            long var423 = var422 * var319;
                            long var320 = var423 & 7L;
                            long var502;
                            var299 = (var502 = var320 - 0L) == 0L ? 0 : (var502 < 0L ? -1 : 1);
                            if (var299 != 0) {
                                break label347;
                            }

                            if (var258 == 0) {
                                var7 -= -1277847772;
                                var7 *= 2064928725;
                                var7 ^= 1629989489;
                                long var264 = var7;
                                var12 = var264 + 1L;
                                var12 = var264 * var12;
                                long var265 = var12 & 1L;
                                long var503;
                                var258 = (var503 = var265 - 0L) == 0L ? 0 : (var503 < 0L ? -1 : 1);
                                if (var258 != 0) {
                                    break label347;
                                }

                                float var267 = var3 + var5;
                                float var268 = var267 - 12.0F;
                                long var322 = var8;
                                long var424 = var322 + 1L;
                                long var425 = var322 * var424;
                                long var323 = var425 & 1L;
                                long var504;
                                var299 = (var504 = var323 - 0L) == 0L ? 0 : (var504 < 0L ? -1 : 1);
                                if (var299 != 0) {
                                    switch (var7) {
                                        case -766442463:
                                            var7 &= -1734336171;
                                            var7 |= 206702987;
                                            var7 <<= 15;
                                            var7 ^= 132757710;
                                            break label369;
                                        case 1392930379:
                                            var7 ^= -2048662759;
                                            break label369;
                                        case 1528789133:
                                        default:
                                            var7 ^= 1819725849;
                                            break label369;
                                    }
                                }

                                var7 &= 179444261;
                                var7 += -1673995845;
                                var7 *= 1496402987;
                                var7 &= 976011186;
                                var7 ^= 411236273;
                                float var325 = var4 + 12.0F;
                                XF var379 = this.vy;
                                float var380 = var379.bs();
                                int var426 = DP.nq(-1711276033, var6);
                                Hc.D(var1, var268, var325, var380, var426);
                                switch (var7) {
                                    case -1799250369:
                                    default:
                                        var7 ^= 1372402025;
                                        break;
                                    case 981880833:
                                        var7 &= -1595543454;
                                        var7 ^= -297224633;
                                        break;
                                    case 1245094640:
                                        var7 ^= 206563198;
                                }
                            } else {
                                var7 += -278743391;
                                var7 += 1992834741;
                                var7 ^= -576184371;
                            }
                        }

                        XF var269 = this.vy;
                        float var270 = var269.bs();
                        float var271 = TP.S(var270);
                        float var505;
                        var299 = (var505 = var271 - 0.01F) == 0.0F ? 0 : (var505 < 0.0F ? -1 : 1);
                        Integer var381 = var8;
                        if (var381 == null) {
                            var7 -= -1506111206;
                            var7 -= -1136909694;
                            var7 -= -478772517;
                            var7 ^= -1946970338;
                            break label369;
                        }

                        var7 *= 174585501;
                        var7 ^= -735658684;
                        Integer var382 = var7;
                        if (var382 == null) {
                            break label347;
                        }

                        if (var299 <= 0) {
                            var7 = switch (var7) {
                                case -600162578 -> var7 ^ -2128793586;
                                default -> var7 ^ 1682793669;
                                case -240857393 -> {
                                    var7 *= 1501732823;
                                    var7 *= -2065492803;
                                    yield var7 ^ -1334817726;
                                }
                            };
                            var299 = var7 + 1;
                            var299 = var7 * var299;
                            var299 &= 1;
                            if (var299 == 0) {
                                return;
                            }
                            break label347;
                        }

                        var7 ^= -1525031529;
                        var7 += -1662310015;
                        var7 &= 536263142;
                        var7 ^= -444099849;
                        long var327 = var7;
                        long var427 = var327 + 1L;
                        long var428 = var327 * var427;
                        long var483 = var327 + 2L;
                        long var429 = var428 * var483;
                        long var328 = var327 + 3L;
                        long var430 = var429 * var328;
                        long var329 = var430 & 7L;
                        long var506;
                        var299 = (var506 = var329 - 0L) == 0L ? 0 : (var506 < 0L ? -1 : 1);
                        if (var299 != 0) {
                            break label347;
                        }

                        var1.save();
                        float var331 = var4 + 24.0F;
                        float var332 = var331 - 2.0F;
                        var9 -= 24.0F;
                        var9 += 2.0F;
                        var1.clip(var3, var332, var5, var9, 4.0F);
                        Integer var235 = var8;
                        if (var235 == null) {
                            var7 &= -1450763513;
                            var7 -= 1302880211;
                            var7 *= -2097948223;
                            var7 ^= 1277976058;
                            break label369;
                        }

                        var7 += 96326229;
                        var7 += 1723212100;
                        var7 *= 1110837707;
                        var7 <<= 27;
                        var7 ^= -832318482;
                        Integer var236 = var7;
                        if (var236 == null) {
                            break label347;
                        }

                        var1.alpha(var271);
                        var9 = var4 + 24.0F;
                        var9++;
                        float var272 = var3 + 8.0F;
                        float var333 = var9 - 1.0F;
                        float var383 = var5 - 16.0F;
                        int var431 = DP.nq(550626815, var6);
                        var1.rect(var272, var333, var383, 0.6F, var431);
                        var9 += 3.0F;
                        List var273 = this.mm;
                        Iterator var274 = var273.iterator();
                        Iterator var275 = var274;
                        var9 = var9;
                        var7 <<= 20;
                        var7 ^= -1281051715;

                        while (true) {
                            long var334 = var7;
                            long var432 = var334 + 1L;
                            long var433 = var334 * var432;
                            long var335 = var433 & 1L;
                            long var507;
                            var299 = (var507 = var335 - 0L) == 0L ? 0 : (var507 < 0L ? -1 : 1);
                            if (var299 != 0) {
                                break label347;
                            }

                            boolean var337 = var275.hasNext();
                            int var384 = var8 + 1;
                            int var385 = var8 * var384;
                            int var434 = var8 + 2;
                            int var386 = var385 * var434;
                            int var435 = var8 + 3;
                            int var387 = var386 * var435;
                            int var388 = var387 & 7;
                            if (var388 != 0) {
                                switch (var7) {
                                    case -1924877379:
                                        var7 >>>= 26;
                                        var7 ^= 53229805;
                                        break label369;
                                    case -1604700848:
                                    default:
                                        var7 ^= 1770360157;
                                        break label369;
                                    case 529373942:
                                        var7 ^= -1680596441;
                                        break label369;
                                }
                            }
                            var7 = switch (var7) {
                                case -2141708879 -> var7 ^ -1041628986;
                                case -1924877379 -> {
                                    var7 ^= -409849440;
                                    var7 >>= 24;
                                    yield var7 ^ -1915189636;
                                }
                                default -> var7 ^ -1170718428;
                            };
                            var12 = var7;
                            var449 = var12 + 1L;
                            var449 = var12 * var449;
                            var12 = var449 & 1L;
                            long var508;
                            int var391 = (var508 = var12 - 0L) == 0L ? 0 : (var508 < 0L ? -1 : 1);
                            if (var391 != 0) {
                                break label347;
                            }

                            if (!var337) {
                                Integer var231 = switch (var7) {
                                    case -1915189738 -> {
                                        var7 &= -863172598;
                                        var7 &= -2097751038;
                                        var7 += -458271516;
                                        yield var7 ^ -2026715537;
                                    }
                                    case -428333789 -> var7 ^ 784345808;
                                    default -> var7 ^ 473665301;
                                };
                                if (var231 != null) {
                                    var1.restore();
                                    return;
                                }
                                break label347;
                            }
                            var7 = switch (var7) {
                                case -1915189738 -> {
                                    var7 -= 159678742;
                                    var7 += -365908992;
                                    var7 ^= -204070120;
                                    var7 -= 719385972;
                                    yield var7 ^ 1369739268;
                                }
                                default -> var7 ^ -711120993;
                                case -689235283 -> var7 ^ -1745028706;
                            };
                            Object var338 = var275.next();
                            XR var339 = (XR)var338;
                            xB var392 = var339.W();
                            boolean var393 = var392.gQ();
                            int var436 = var8 + 1;
                            int var437 = var8 * var436;
                            int var438 = var437 & 1;
                            if (var438 != 0) {
                                var7 += -1833147906;
                                var7 += 1490260519;
                                var7 ^= 206125067;
                                break label369;
                            }

                            var7 *= -1956148735;
                            var7 ^= 157373664;
                            if (!var393) {
                                var7 = switch (var7) {
                                    case -127788992 -> {
                                        var7 += -1036053331;
                                        yield var7 ^ -1796491532;
                                    }
                                    case 481370907 -> var7 ^ 1876632589;
                                    default -> var7 ^ -2079983875;
                                };
                                int var394 = var7 + 1;
                                int var395 = var7 * var394;
                                int var439 = var7 + 2;
                                int var396 = var395 * var439;
                                int var440 = var7 + 3;
                                int var397 = var396 * var440;
                                int var398 = var397 & 7;
                                if (var398 != 0) {
                                    break label347;
                                }

                                var9 = var9;
                                var7 += -1267886326;
                                var7 ^= 1878819486;
                            } else {
                                var7 += -876446851;
                                var7 += 2097170782;
                                var7 ^= 1948959970;
                                float var399 = var3 + 9.0F;
                                var414 = var5 - 18.0F;
                                var339.Ar(var1, var2, var399, var9, var414, var6);
                                int var400 = var8 + 1;
                                int var401 = var8 * var400;
                                int var442 = var8 + 2;
                                int var402 = var401 * var442;
                                int var443 = var8 + 3;
                                int var403 = var402 * var443;
                                int var404 = var403 & 7;
                                if (var404 != 0) {
                                    switch (var7) {
                                        case -1263094534:
                                        default:
                                            var7 ^= -539921071;
                                            break label369;
                                        case -1241053203:
                                            var7 ^= 1813217209;
                                            break label369;
                                        case 890116601:
                                            var7 &= 689892314;
                                            var7 ^= -1932624878;
                                            var7 -= -1799807751;
                                            var7 ^= 439050271;
                                            break label369;
                                    }
                                }

                                var7 |= -661375302;
                                var7 |= -416471291;
                                var7 -= -1511159322;
                                var7 ^= 16553422;
                                Integer var405 = var7;
                                if (var405 == null) {
                                    break label347;
                                }

                                float var340 = var339.v();
                                float var341 = var340 + 2.0F;
                                float var342 = var9 + var341;
                                var9 = var342;
                                switch (var7) {
                                    case -1811570926:
                                        var7 ^= 382832901;
                                        break;
                                    case -44512420:
                                    default:
                                        var7 ^= 1977557738;
                                        break;
                                    case 1496130519:
                                        var7 *= -1008011943;
                                        var7 ^= 1841553399;
                                        var7 ^= -777093897;
                                        var7 &= 969975713;
                                        var7 ^= -1937493988;
                                }
                            }
                        }
                    }

                    var7 += 1013675344;
                    var7 ^= 1030980589;
                    break label369;
                }

                IllegalStateException var232 = new IllegalStateException();
                throw var232;
            }
        }

        IllegalArgumentException var230 = new IllegalArgumentException();
        throw var230;
    }

    public boolean K(jX var1, float var2, float var3, int var4) {
        boolean var322 = false;
        label521: {
            label488: {
                int var5 = OB;
                int var6 = var4;
                var5 ^= 1278343281;
                int var7 = System.identityHashCode(this);
                float var8 = this.D;
                float var9 = this.IK;
                float var10 = this.iG;
                float var11 = this.V();
                Integer var12 = var7;
                if (var12 == null) {
                    switch (var5) {
                        case -2040284048:
                            var5 |= 1545273943;
                            var5 <<= 23;
                            var5 &= 799442929;
                            var5 ^= -1575894609;
                            break;
                        case -1998087617:
                        default:
                            var5 ^= 985880636;
                            break;
                        case -448215994:
                            var5 ^= 223664954;
                    }
                } else {
                    var5 += -1105465563;
                    var5 -= -1591204295;
                    var5 *= -1143398181;
                    var5 -= 1672357690;
                    var5 ^= 1111486179;
                    boolean var294 = var1.hQ(var8, var9, var10, var11);
                    if (!var294) {
                        var5 |= -633245744;
                        var5 |= 1247241948;
                        var5 ^= -1187680604;
                        Integer var363 = var4;
                        if (var363 != null) {
                            return false;
                        }
                        break label521;
                    }
                    var5 = switch (var5) {
                        case -1014110480 -> var5 ^ -2056053620;
                        case -974684007 -> {
                            var5 <<= 1;
                            yield var5 ^ 1582862775;
                        }
                        default -> var5 ^ 1450843247;
                    };
                    int var295 = var4 + 1;
                    int var296 = var4 * var295;
                    int var364 = var4 + 2;
                    int var297 = var296 * var364;
                    int var365 = var4 + 3;
                    int var298 = var297 * var365;
                    int var299 = var298 & 7;
                    if (var299 != 0) {
                        break label521;
                    }

                    var8 = this.IK;
                    int var366 = var7 + 1;
                    int var367 = var7 * var366;
                    int var452 = var7 + 2;
                    int var368 = var367 * var452;
                    int var453 = var7 + 3;
                    int var369 = var368 * var453;
                    int var370 = var369 & 7;
                    if (var370 != 0) {
                        var5 ^= -12795683;
                        var5 ^= -1556442633;
                    } else {
                        var5 -= 1506195791;
                        var5 &= -1787575782;
                        var5 ^= -160823561;
                        int var371 = var4 + 1;
                        int var372 = var4 * var371;
                        int var454 = var4 + 2;
                        int var373 = var372 * var454;
                        int var455 = var4 + 3;
                        int var374 = var373 * var455;
                        int var375 = var374 & 7;
                        if (var375 != 0) {
                            break label521;
                        }

                        var8 += 24.0F;
                        float var546;
                        int var302 = (var546 = var3 - var8) == 0.0F ? 0 : (var546 < 0.0F ? -1 : 1);
                        if (var302 < 0) {
                            var5 += 683788255;
                            var5 ^= 1077787422;
                            int var311 = var4 + 1;
                            int var312 = var4 * var311;
                            int var313 = var312 & 1;
                            if (var313 != 0) {
                                break label521;
                            }

                            var8 = this.D;
                            var9 = this.iG;
                            long var468 = var7;
                            long var532 = var468 + 1L;
                            long var533 = var468 * var532;
                            long var469 = var533 & 1L;
                            long var547;
                            int var470 = (var547 = var469 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                            label447:
                            if (var470 == 0) {
                                var5 *= -1535088757;
                                var5 |= -991050776;
                                var5 |= 1498122969;
                                var5 ^= 865546122;
                                Integer var471 = var4;
                                if (var471 == null) {
                                    break label521;
                                }

                                label472: {
                                    var8 += var9;
                                    var8 -= 39.0F;
                                    float var548;
                                    int var317 = (var548 = var2 - var8) == 0.0F ? 0 : (var548 < 0.0F ? -1 : 1);
                                    if (var317 >= 0) {
                                        var5 = switch (var5) {
                                            case -2008958482 -> var5 ^ -452244421;
                                            default -> var5 ^ 697920373;
                                            case -830937995 -> {
                                                var5 += -165468631;
                                                var5 ^= 829601856;
                                                var5 |= -471374583;
                                                var5 += 1902328372;
                                                yield var5 ^ 2075941206;
                                            }
                                        };
                                        var8 = this.D;
                                        var9 = this.iG;
                                        var8 += var9;
                                        var8 -= 27.0F;
                                        int var396 = var7 + 1;
                                        int var397 = var7 * var396;
                                        int var472 = var7 + 2;
                                        int var398 = var397 * var472;
                                        int var473 = var7 + 3;
                                        int var399 = var398 * var473;
                                        int var400 = var399 & 7;
                                        if (var400 != 0) {
                                            var5 += -1112674621;
                                            var5 *= 804147809;
                                            var5 ^= 343174311;
                                            break label447;
                                        }

                                        var5 |= -1018070195;
                                        var5 ^= 1896329209;
                                        float var549;
                                        int var321 = (var549 = var2 - var8) == 0.0F ? 0 : (var549 < 0.0F ? -1 : 1);
                                        if (var321 < 0) {
                                            var5 <<= 18;
                                            var5 ^= -1503905841;
                                            var322 = true;
                                            var5 &= -1558759514;
                                            var5 ^= 1913543989;
                                            var5 ^= -2004459849;
                                            break label472;
                                        }

                                        var5 >>>= 7;
                                        var5 ^= 2143959222;
                                    } else {
                                        var5 |= -1640235373;
                                        var5 *= 145917949;
                                        var5 ^= 1026748932;
                                    }

                                    Integer var401 = var4;
                                    if (var401 == null) {
                                        break label521;
                                    }

                                    var322 = false;
                                    var5 += 1985043201;
                                    var5 ^= -1368584156;
                                }

                                int var402 = var4 + 1;
                                int var403 = var4 * var402;
                                int var404 = var403 & 1;
                                if (var404 != 0) {
                                    break label521;
                                }

                                int var405 = var7 + 1;
                                int var406 = var7 * var405;
                                int var474 = var7 + 2;
                                int var407 = var406 * var474;
                                int var475 = var7 + 3;
                                int var408 = var407 * var475;
                                int var409 = var408 & 7;
                                if (var409 != 0) {
                                    var5 *= 195268263;
                                    var5 &= 1507566697;
                                    var5 &= 486327102;
                                    var5 -= 1157461459;
                                    var5 ^= 843795354;
                                } else {
                                    label511: {
                                        var5 = switch (var5) {
                                            default -> var5 ^ 1534234043;
                                            case -222682108 -> var5 ^ -1467095020;
                                            case 1519137796 -> {
                                                var5 += -620437330;
                                                yield var5 ^ 1176047692;
                                            }
                                        };
                                        Integer var410 = var4;
                                        if (var410 == null) {
                                            break label521;
                                        }

                                        label474: {
                                            if (var4 != 1) {
                                                var5 >>= 8;
                                                var5 >>= 23;
                                                var5 -= 1733797752;
                                                var5 >>= 27;
                                                var5 ^= -483525149;
                                                if (var4 != 0) {
                                                    var5 &= 1349422798;
                                                    var5 |= 997403490;
                                                    var5 *= -262753497;
                                                    var5 -= 39889212;
                                                    var5 ^= 192567878;
                                                    break label474;
                                                }
                                                var5 = switch (var5) {
                                                    case 483525136 -> {
                                                        var5 >>>= 9;
                                                        yield var5 ^ 57859501;
                                                    }
                                                    case 822780577 -> var5 ^ -1080908286;
                                                    default -> var5 ^ 1071572765;
                                                };
                                                int var411 = var4 + 1;
                                                int var412 = var4 * var411;
                                                int var476 = var4 + 2;
                                                int var413 = var412 * var476;
                                                int var477 = var4 + 3;
                                                int var414 = var413 * var477;
                                                int var415 = var414 & 7;
                                                if (var415 != 0) {
                                                    break label521;
                                                }

                                                Yn var416 = this.mr;
                                                boolean var417 = var416.jp();
                                                int var478 = var7 + 1;
                                                int var479 = var7 * var478;
                                                int var480 = var479 & 1;
                                                if (var480 != 0) {
                                                    var5 |= 266434911;
                                                    var5 &= 136049345;
                                                    var5 |= -977001838;
                                                    var5 ^= 1145844604;
                                                    break label511;
                                                }

                                                var5 &= -1608406593;
                                                var5 ^= -204039017;
                                                if (var417) {
                                                    var5 *= 447793753;
                                                    var5 -= 65856206;
                                                    var5 <<= 21;
                                                    var5 ^= -1372568789;
                                                    if (!var322) {
                                                        var5 ^= -900759037;
                                                        var5 >>= 21;
                                                        var5 ^= 219554402;
                                                        break label474;
                                                    }

                                                    var5 &= -903905421;
                                                    var5 ^= -1522390338;
                                                    var5 ^= 1453812541;
                                                } else {
                                                    switch (var5) {
                                                        case -1597108189:
                                                        default:
                                                            var5 ^= 1569052508;
                                                            break;
                                                        case -1453111650:
                                                            var5 ^= -533630321;
                                                            break;
                                                        case -201966533:
                                                            var5 ^= 845131867;
                                                            var5 ^= -559599381;
                                                            var5 ^= 620346923;
                                                    }
                                                }
                                            } else {
                                                switch (var5) {
                                                    case -1996933403:
                                                    default:
                                                        var5 ^= 333784353;
                                                        break;
                                                    case 83292935:
                                                        var5 ^= -35917159;
                                                        break;
                                                    case 1938294014:
                                                        var5 &= -1120531398;
                                                        var5 ^= 183830170;
                                                }
                                            }

                                            long var348 = var4;
                                            long var491 = var348 + 1L;
                                            long var492 = var348 * var491;
                                            long var536 = var348 + 2L;
                                            long var493 = var492 * var536;
                                            long var349 = var348 + 3L;
                                            long var494 = var493 * var349;
                                            long var350 = var494 & 7L;
                                            long var550;
                                            int var351 = (var550 = var350 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                                            if (var351 != 0) {
                                                break label521;
                                            }

                                            List var352 = this.mm;
                                            boolean var353 = var352.isEmpty();
                                            int var432 = var7 + 1;
                                            int var433 = var7 * var432;
                                            int var434 = var433 & 1;
                                            if (var434 == 0) {
                                                var5 = switch (var5) {
                                                    case -1918045687 -> var5 ^ -450300030;
                                                    default -> var5 ^ -1415144074;
                                                    case 1005912736 -> {
                                                        var5 += -345554828;
                                                        yield var5 ^ 990246608;
                                                    }
                                                };
                                                Integer var435 = var4;
                                                if (var435 == null) {
                                                    break label521;
                                                }

                                                if (var353) {
                                                    switch (var5) {
                                                        case -318365178:
                                                            var5 ^= 1521444829;
                                                            break label488;
                                                        case 475641284:
                                                            var5 -= 1046175103;
                                                            var5 |= -1110114584;
                                                            var5 += 1458408366;
                                                            var5 |= 14818214;
                                                            var5 ^= -1056169127;
                                                            break label488;
                                                        case 1461499300:
                                                        default:
                                                            var5 ^= 1831720896;
                                                            break label488;
                                                    }
                                                }
                                                var5 = switch (var5) {
                                                    default -> var5 ^ -413611071;
                                                    case 475641284 -> {
                                                        var5 += -1833012156;
                                                        var5 -= -2049450415;
                                                        yield var5 ^ 21148974;
                                                    }
                                                    case 617913430 -> var5 ^ -930024442;
                                                };
                                                Integer var354 = var4;
                                                if (var354 == null) {
                                                    break label521;
                                                }

                                                boolean var355 = this.e;
                                                long var436 = var7;
                                                long var518 = var436 + 1L;
                                                long var519 = var436 * var518;
                                                long var544 = var436 + 2L;
                                                long var520 = var519 * var544;
                                                long var437 = var436 + 3L;
                                                long var521 = var520 * var437;
                                                long var438 = var521 & 7L;
                                                long var551;
                                                int var439 = (var551 = var438 - 0L) == 0L ? 0 : (var551 < 0L ? -1 : 1);
                                                if (var439 == 0) {
                                                    var5 = switch (var5) {
                                                        case -1795784976 -> var5 ^ -1165132298;
                                                        case 671284889 -> {
                                                            var5 *= 993936295;
                                                            var5 ^= 1143206783;
                                                            var5 >>>= 30;
                                                            var5 += -1208277541;
                                                            yield var5 ^ 1246384257;
                                                        }
                                                        default -> var5 ^ 1784839852;
                                                    };
                                                    long var440 = var4;
                                                    long var522 = var440 + 1L;
                                                    long var523 = var440 * var522;
                                                    var544 = var440 + 2L;
                                                    long var524 = var523 * var544;
                                                    long var441 = var440 + 3L;
                                                    long var525 = var524 * var441;
                                                    long var442 = var525 & 7L;
                                                    long var552;
                                                    int var443 = (var552 = var442 - 0L) == 0L ? 0 : (var552 < 0L ? -1 : 1);
                                                    if (var443 != 0) {
                                                        break label521;
                                                    }

                                                    boolean var356;
                                                    if (!var355) {
                                                        var5 += 1159734904;
                                                        var5 ^= 935571145;
                                                        var356 = true;
                                                        var5 |= 1479767873;
                                                        var5 += 354843128;
                                                        var5 += 862507155;
                                                        var5 ^= 1533452267;
                                                    } else {
                                                        var5 &= 346951972;
                                                        var5 ^= 1960891406;
                                                        long var444 = var4;
                                                        long var526 = var444 + 1L;
                                                        long var527 = var444 * var526;
                                                        long var445 = var527 & 1L;
                                                        long var553;
                                                        int var446 = (var553 = var445 - 0L) == 0L ? 0 : (var553 < 0L ? -1 : 1);
                                                        if (var446 != 0) {
                                                            break label521;
                                                        }

                                                        var356 = false;
                                                        var5 -= -745146106;
                                                        var5 ^= 302944775;
                                                    }

                                                    int var447 = var4 + 1;
                                                    int var448 = var4 * var447;
                                                    int var495 = var4 + 2;
                                                    int var449 = var448 * var495;
                                                    int var496 = var4 + 3;
                                                    int var450 = var449 * var496;
                                                    int var451 = var450 & 7;
                                                    if (var451 != 0) {
                                                        break label521;
                                                    }

                                                    this.e = var356;
                                                    int var357 = var7 + 1;
                                                    int var358 = var7 * var357;
                                                    int var359 = var358 & 1;
                                                    if (var359 == 0) {
                                                        var5 <<= 9;
                                                        var5 &= -729592915;
                                                        var5 *= 2054347465;
                                                        var5 += 1387498052;
                                                        var5 ^= 1364212185;
                                                        var1.Ht("ui_click");
                                                        var5 |= 1082303920;
                                                        var5 *= -586446233;
                                                        var5 ^= -1609291283;
                                                        break label488;
                                                    }

                                                    var5 -= -521967275;
                                                    var5 ^= -977662126;
                                                    var5 += 185597836;
                                                    var5 += -1233664972;
                                                    var5 ^= -1282179565;
                                                } else {
                                                    switch (var5) {
                                                        case -815770725:
                                                            var5 ^= -361515389;
                                                            break label511;
                                                        case -454074470:
                                                        default:
                                                            var5 ^= -1757045909;
                                                            break label511;
                                                        case 671284889:
                                                            var5 *= -1801230669;
                                                            var5 ^= 361918000;
                                                            var5 -= 676440628;
                                                            var5 ^= -857876954;
                                                            var5 ^= -1035731682;
                                                    }
                                                }
                                            } else {
                                                var5 *= 1574161693;
                                                var5 ^= -836063857;
                                            }
                                            break label511;
                                        }

                                        int var323 = var4 + 1;
                                        int var324 = var4 * var323;
                                        int var325 = var324 & 1;
                                        if (var325 != 0) {
                                            break label521;
                                        }

                                        if (var4 != 0) {
                                            var5 ^= 967426736;
                                            var5 |= -1375251386;
                                            var5 >>>= 10;
                                            var5 ^= -1781721317;
                                            break label488;
                                        }

                                        var5 -= -2019928780;
                                        var5 ^= 1389739537;
                                        var5 &= 1906245355;
                                        var5 ^= -2011707918;
                                        Yn var326 = this.mr;
                                        boolean var327 = var326.jp();
                                        long var418 = var7;
                                        long var510 = var418 + 1L;
                                        long var511 = var418 * var510;
                                        long var542 = var418 + 2L;
                                        long var512 = var511 * var542;
                                        long var419 = var418 + 3L;
                                        long var513 = var512 * var419;
                                        long var420 = var513 & 7L;
                                        long var554;
                                        int var421 = (var554 = var420 - 0L) == 0L ? 0 : (var554 < 0L ? -1 : 1);
                                        if (var421 != 0) {
                                            switch (var5) {
                                                case -1687219716:
                                                default:
                                                    var5 ^= 1794599924;
                                                    break;
                                                case -779872841:
                                                    var5 ^= 1537543464;
                                                    break;
                                                case -644237517:
                                                    var5 *= 589361279;
                                                    var5 ^= 1743811554;
                                            }
                                        } else {
                                            var5 ^= -1800331433;
                                            var5 ^= 1840660272;
                                            var5 ^= -809835872;
                                            int var422 = var4 + 1;
                                            int var423 = var4 * var422;
                                            int var424 = var423 & 1;
                                            if (var424 != 0) {
                                                break label521;
                                            }

                                            if (!var327) {
                                                switch (var5) {
                                                    case -1614332394:
                                                        var5 ^= -252254233;
                                                        break label488;
                                                    case -282823180:
                                                        var5 ^= -368184689;
                                                        var5 |= 2035667409;
                                                        var5 ^= -392204515;
                                                        break label488;
                                                    case 1294806996:
                                                    default:
                                                        var5 ^= -290793989;
                                                        break label488;
                                                }
                                            }
                                            var5 = switch (var5) {
                                                case -282823180 -> {
                                                    var5 -= -1307800429;
                                                    var5 *= 2016036929;
                                                    var5 |= -62482234;
                                                    var5 &= -678145658;
                                                    yield var5 ^ -723009630;
                                                }
                                                default -> var5 ^ 1838811373;
                                                case 1602430415 -> var5 ^ -2056028844;
                                            };
                                            long var328 = var4;
                                            long var481 = var328 + 1L;
                                            long var482 = var328 * var481;
                                            long var329 = var482 & 1L;
                                            long var555;
                                            int var330 = (var555 = var329 - 0L) == 0L ? 0 : (var555 < 0L ? -1 : 1);
                                            if (var330 != 0) {
                                                break label521;
                                            }

                                            Yn var331 = this.mr;
                                            var331.bq();
                                            long var332 = var7;
                                            long var483 = var332 + 1L;
                                            long var484 = var332 * var483;
                                            long var534 = var332 + 2L;
                                            long var485 = var484 * var534;
                                            long var333 = var332 + 3L;
                                            long var486 = var485 * var333;
                                            long var334 = var486 & 7L;
                                            long var556;
                                            int var335 = (var556 = var334 - 0L) == 0L ? 0 : (var556 < 0L ? -1 : 1);
                                            if (var335 == 0) {
                                                var5 -= 860300163;
                                                var5 -= 473190024;
                                                var5 += -1970066760;
                                                var5 ^= 2040826116;
                                                long var336 = var4;
                                                long var487 = var336 + 1L;
                                                long var488 = var336 * var487;
                                                long var535 = var336 + 2L;
                                                long var489 = var488 * var535;
                                                long var337 = var336 + 3L;
                                                long var490 = var489 * var337;
                                                long var338 = var490 & 7L;
                                                long var557;
                                                int var339 = (var557 = var338 - 0L) == 0L ? 0 : (var557 < 0L ? -1 : 1);
                                                if (var339 != 0) {
                                                    break label521;
                                                }

                                                Yn var340 = this.mr;
                                                boolean var341 = var340.B();
                                                String var347;
                                                if (var341) {
                                                    var5 ^= 1515903720;
                                                    var5 -= -803972276;
                                                    var5 ^= 29630051;
                                                    int var342 = var4 + 1;
                                                    int var343 = var4 * var342;
                                                    int var425 = var4 + 2;
                                                    int var344 = var343 * var425;
                                                    int var426 = var4 + 3;
                                                    int var345 = var344 * var426;
                                                    int var346 = var345 & 7;
                                                    if (var346 != 0) {
                                                        break label521;
                                                    }

                                                    var347 = "ui_toggle_on";
                                                    var5 *= 934655113;
                                                    var5 -= -979078385;
                                                    var5 <<= 9;
                                                    var5 &= -1045240283;
                                                    var5 ^= -1846613931;
                                                } else {
                                                    var5 -= -1658835113;
                                                    var5 *= 1271485665;
                                                    var5 &= -742459166;
                                                    var5 |= -272733168;
                                                    var5 ^= 413670706;
                                                    long var427 = var4;
                                                    long var514 = var427 + 1L;
                                                    long var515 = var427 * var514;
                                                    var542 = var427 + 2L;
                                                    long var516 = var515 * var542;
                                                    long var428 = var427 + 3L;
                                                    long var517 = var516 * var428;
                                                    long var429 = var517 & 7L;
                                                    long var558;
                                                    int var430 = (var558 = var429 - 0L) == 0L ? 0 : (var558 < 0L ? -1 : 1);
                                                    if (var430 != 0) {
                                                        break label521;
                                                    }

                                                    var347 = "ui_toggle_off";
                                                    var5 |= 1609959433;
                                                    var5 >>>= 2;
                                                    var5 += 462399986;
                                                    var5 -= 354108633;
                                                    var5 ^= -677581522;
                                                }

                                                Integer var431 = var4;
                                                if (var431 == null) {
                                                    break label521;
                                                }

                                                var1.Ht(var347);
                                                switch (var5) {
                                                    case -1846620587:
                                                        var5 >>= 31;
                                                        var5 &= -1327709807;
                                                        var5 ^= 624851319;
                                                        break label488;
                                                    case -1637538584:
                                                    default:
                                                        var5 ^= 1893629415;
                                                        break label488;
                                                    case -1495560202:
                                                        var5 ^= 815174351;
                                                        break label488;
                                                }
                                            }

                                            var5 -= 88791664;
                                            var5 ^= -1522712268;
                                            var5 ^= -779857105;
                                        }
                                    }
                                }
                            } else {
                                switch (var5) {
                                    case 155342757:
                                        var5 ^= 1826984575;
                                        break;
                                    case 1151972381:
                                    default:
                                        var5 ^= 1351507836;
                                        break;
                                    case 1338062810:
                                        var5 |= 559533927;
                                        var5 &= -9250180;
                                        var5 ^= -423552045;
                                }
                            }
                        } else {
                            var5 |= 1358151405;
                            var5 ^= -992843548;
                            Integer var303 = var4;
                            if (var303 == null) {
                                break label521;
                            }

                            XF var304 = this.vy;
                            long var376 = var7;
                            long var497 = var376 + 1L;
                            long var498 = var376 * var497;
                            long var377 = var498 & 1L;
                            long var559;
                            int var378 = (var559 = var377 - 0L) == 0L ? 0 : (var559 < 0L ? -1 : 1);
                            if (var378 != 0) {
                                var5 += 1363206082;
                                var5 <<= 11;
                                var5 -= 1525035780;
                                var5 ^= 1901716819;
                            } else {
                                var5 -= -1795876540;
                                var5 &= -1819816519;
                                var5 ^= 1504033928;
                                int var379 = var4 + 1;
                                int var380 = var4 * var379;
                                int var456 = var4 + 2;
                                int var381 = var380 * var456;
                                int var457 = var4 + 3;
                                int var382 = var381 * var457;
                                int var383 = var382 & 7;
                                if (var383 != 0) {
                                    break label521;
                                }

                                var8 = var304.bs();
                                float var560;
                                int var306 = (var560 = var8 - 0.5F) == 0.0F ? 0 : (var560 < 0.0F ? -1 : 1);
                                if (var306 < 0) {
                                    var5 <<= 24;
                                    var5 >>>= 17;
                                    var5 &= -2036743324;
                                    var5 <<= 26;
                                    var5 ^= -1138518589;
                                    Integer var310 = var4;
                                    if (var310 != null) {
                                        return true;
                                    }
                                    break label521;
                                }

                                var5 -= 2101519363;
                                var5 |= 1080736787;
                                var5 += 98276581;
                                var5 -= 1379829036;
                                var5 ^= 1916351207;
                                List var307 = this.mm;
                                Integer var384 = var7;
                                if (var384 == null) {
                                    switch (var5) {
                                        case -795879496:
                                        default:
                                            var5 ^= 2081078450;
                                            break;
                                        case -255859136:
                                            var5 ^= -1317403748;
                                            break;
                                        case 1881422135:
                                            var5 += 683234049;
                                            var5 >>>= 17;
                                            var5 ^= -1986949695;
                                    }
                                } else {
                                    var5 = switch (var5) {
                                        default -> var5 ^ -1564666653;
                                        case 1881422135 -> {
                                            var5 >>= 20;
                                            var5 *= -452015265;
                                            var5 <<= 1;
                                            yield var5 ^ -86794747;
                                        }
                                        case 1898274815 -> var5 ^ 978398559;
                                    };
                                    Iterator var308 = var307.iterator();
                                    Iterator var309 = var308;
                                    var5 -= -169195103;
                                    var5 *= -555198433;
                                    var5 >>>= 31;
                                    var5 ^= -860585636;

                                    label461:
                                    while (true) {
                                        boolean var385 = var309.hasNext();
                                        long var458 = var7;
                                        long var528 = var458 + 1L;
                                        long var529 = var458 * var528;
                                        long var459 = var529 & 1L;
                                        long var561;
                                        int var460 = (var561 = var459 - 0L) == 0L ? 0 : (var561 < 0L ? -1 : 1);
                                        if (var460 != 0) {
                                            var5 += -1459429242;
                                            var5 ^= -64577460;
                                            break;
                                        }
                                        var5 = switch (var5) {
                                            default -> var5 ^ -888645650;
                                            case -860585635 -> {
                                                var5 *= 1220040117;
                                                yield var5 ^ 910799678;
                                            }
                                            case 1244484099 -> var5 ^ 1860209450;
                                        };
                                        if (!var385) {
                                            var5 *= 1423982719;
                                            var5 |= 1394144485;
                                            var5 *= -1242767291;
                                            var5 ^= -701312194;
                                            long var290 = var6;
                                            long var392 = var290 + 1L;
                                            long var393 = var290 * var392;
                                            long var291 = var393 & 1L;
                                            long var566;
                                            var7 = (var566 = var291 - 0L) == 0L ? 0 : (var566 < 0L ? -1 : 1);
                                            if (var7 == 0) {
                                                return true;
                                            }
                                            break label521;
                                        }
                                        var5 = switch (var5) {
                                            case -81599233 -> {
                                                var5 *= 755897027;
                                                var5 |= -1161742732;
                                                var5 += 1949985763;
                                                yield var5 ^ -601777824;
                                            }
                                            case 575461805 -> var5 ^ 725520090;
                                            default -> var5 ^ 1802915520;
                                        };
                                        long var386 = var6;
                                        long var499 = var386 + 1L;
                                        long var500 = var386 * var499;
                                        long var387 = var500 & 1L;
                                        long var562;
                                        int var388 = (var562 = var387 - 0L) == 0L ? 0 : (var562 < 0L ? -1 : 1);
                                        if (var388 != 0) {
                                            break label521;
                                        }

                                        Object var389 = var309.next();
                                        XR var390 = (XR)var389;
                                        xB var461 = var390.W();
                                        long var501 = var7;
                                        long var13 = var501 + 1L;
                                        var13 = var501 * var13;
                                        long var15 = var501 + 2L;
                                        var13 *= var15;
                                        long var502 = var501 + 3L;
                                        var13 *= var502;
                                        long var503 = var13 & 7L;
                                        long var563;
                                        int var504 = (var563 = var503 - 0L) == 0L ? 0 : (var563 < 0L ? -1 : 1);
                                        if (var504 != 0) {
                                            switch (var5) {
                                                case -1794885596:
                                                    var5 ^= 470148546;
                                                    break label461;
                                                case -666445545:
                                                default:
                                                    var5 ^= -1672844117;
                                                    break label461;
                                                case -214273280:
                                                    var5 >>= 27;
                                                    var5 &= 878701695;
                                                    var5 -= -1632390954;
                                                    var5 ^= 473823751;
                                                    break label461;
                                            }
                                        }

                                        var5 += -775687146;
                                        var5 += 999653054;
                                        var5 *= -181402269;
                                        var5 ^= 1281059159;
                                        Integer var505 = var6;
                                        if (var505 == null) {
                                            break label521;
                                        }

                                        boolean var462 = var461.gQ();
                                        if (var462) {
                                            var5 *= -1656892271;
                                            var5 *= -1044594101;
                                            var5 >>= 9;
                                            var5 ^= -1581129205;
                                            Integer var463 = var6;
                                            if (var463 == null) {
                                                break label521;
                                            }

                                            boolean var464 = var390.CG(var2, var3);
                                            Integer var506 = var7;
                                            if (var506 == null) {
                                                var5 -= 492248842;
                                                var5 *= 1926404761;
                                                var5 *= 2132692347;
                                                var5 ^= 778614192;
                                                break;
                                            }

                                            var5 ^= 1752734572;
                                            var5 ^= -1605009487;
                                            long var507 = var6;
                                            var13 = var507 + 1L;
                                            var13 = var507 * var13;
                                            long var508 = var13 & 1L;
                                            long var564;
                                            int var509 = (var564 = var508 - 0L) == 0L ? 0 : (var564 < 0L ? -1 : 1);
                                            if (var509 != 0) {
                                                break label521;
                                            }

                                            if (var464) {
                                                var5 |= -1436595529;
                                                var5 ^= 1356612428;
                                                long var465 = var6;
                                                long var530 = var465 + 1L;
                                                long var531 = var465 * var530;
                                                long var466 = var531 & 1L;
                                                long var565;
                                                int var467 = (var565 = var466 - 0L) == 0L ? 0 : (var565 < 0L ? -1 : 1);
                                                if (var467 == 0) {
                                                    return var390.i(var1, var2, var3, var4);
                                                }
                                                break label521;
                                            }

                                            var5 += 542712864;
                                            var5 >>= 10;
                                            var5 ^= 330721589;
                                        } else {
                                            var5 -= -1120501860;
                                            var5 <<= 10;
                                            var5 >>= 3;
                                            var5 ^= 313314330;
                                        }

                                        Integer var391 = var6;
                                        if (var391 == null) {
                                            break label521;
                                        }

                                        switch (var5) {
                                            case -362003748:
                                                var5 ^= -489803918;
                                                break;
                                            case -329528422:
                                                var5 <<= 8;
                                                var5 ^= -1753277603;
                                                break;
                                            case -28740780:
                                            default:
                                                var5 ^= 634294143;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                var5 = var6 + 1;
                var5 = var6 * var5;
                var7 = var6 + 2;
                var5 *= var7;
                var6 += 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 == 0) {
                    AssertionError var288 = new AssertionError();
                    throw var288;
                }
                break label521;
            }

            int var360 = var4 + 1;
            var360 = var4 * var360;
            var360 &= 1;
            if (var360 == 0) {
                return true;
            }
        }

        IllegalArgumentException var287 = new IllegalArgumentException();
        throw var287;
    }

    public boolean WC(jX var1, int var2) {
        label78: {
            int var3 = OB;
            int var4 = var2;
            var3 ^= 863998918;
            int var5 = System.identityHashCode(this);
            List var6 = this.mm;
            Integer var7 = var5;
            if (var7 != null) {
                var3 |= -969133757;
                var3 -= -1029554517;
                var3 *= 1398052617;
                var3 -= 187258943;
                var3 ^= 1754822745;
                Iterator var66 = var6.iterator();
                Iterator var67 = var66;
                var3 >>= 21;
                var3 ^= 1072733585;

                while (true) {
                    boolean var68 = var67.hasNext();
                    long var8 = var5;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var87;
                    int var78 = (var87 = var8 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var78 != 0) {
                        var3 |= -613037817;
                        var3 -= -99441989;
                        var3 &= -990483983;
                        var3 ^= -541037689;
                        break;
                    }

                    var3 &= -1868014019;
                    var3 |= -311097009;
                    var3 *= -1782343433;
                    var3 &= 1953222199;
                    var3 ^= -608456078;
                    var8 = var4;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var88;
                    int var81 = (var88 = var8 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var81 != 0) {
                        break label78;
                    }

                    if (!var68) {
                        var3 |= -1681100296;
                        var3 ^= 1456592593;
                        return false;
                    }

                    var3 &= 1091426247;
                    var3 <<= 25;
                    var3 += 1250982139;
                    var3 ^= 19617663;
                    int var69 = var4 + 1;
                    var69 = var4 * var69;
                    var69 &= 1;
                    if (var69 != 0) {
                        break label78;
                    }

                    Object var72 = var67.next();
                    Integer var82 = var5;
                    if (var82 == null) {
                        var3 >>>= 8;
                        var3 ^= 527798664;
                        break;
                    }

                    var3 |= -536662658;
                    var3 += 1972848113;
                    var3 &= -65983248;
                    var3 ^= 878999899;
                    Integer var83 = var4;
                    if (var83 == null) {
                        break label78;
                    }

                    XR var73 = (XR)var72;
                    boolean var74 = var73.E(var1, var2);
                    if (var74) {
                        switch (var3) {
                            case 706072726:
                                var3 ^= -1698225665;
                                break;
                            case 1349803451:
                                var3 &= 1936673738;
                                var3 ^= -1097050138;
                                break;
                            case 1943074010:
                            default:
                                var3 ^= -1016854408;
                        }

                        return true;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ 800758680;
                        case 1240289624 -> var3 ^ 129624083;
                        case 1349803451 -> {
                            var3 &= -1340756471;
                            var3 |= -364390019;
                            yield var3 ^ 1093256466;
                        }
                    };
                    Integer var75 = var4;
                    if (var75 == null) {
                        break label78;
                    }

                    var3 |= -611883945;
                    var3 &= -171334847;
                    var3 -= 1150882910;
                    var3 ^= 1832872763;
                }
            } else {
                switch (var3) {
                    case -114436153:
                        var3 ^= -362845791;
                        var3 |= 2137163297;
                        var3 ^= 1624675520;
                        break;
                    case 612063104:
                    default:
                        var3 ^= -1923626328;
                        break;
                    case 1958261690:
                        var3 ^= -1083754356;
                }
            }

            long var56 = var4;
            long var62 = var56 + 1L;
            long var63 = var56 * var62;
            long var76 = var56 + 2L;
            long var64 = var63 * var76;
            long var57 = var56 + 3L;
            long var65 = var64 * var57;
            long var58 = var65 & 7L;
            long var89;
            var3 = (var89 = var58 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalArgumentException var61 = new IllegalArgumentException();
                throw var61;
            }
        }

        RuntimeException var60 = new RuntimeException();
        throw var60;
    }

    public void JP(boolean var1) {
        int var2 = OB;
        var2 ^= -1095076527;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        var3 = var4 & 1;
        if (var3 == 0) {
            var2 ^= -1457954552;
            var2 *= -1920654607;
            var2 ^= 665329259;
            var2 ^= -2109189345;
            var2 ^= 963836000;
            long var24 = var2;
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
                this.e = var1;
                return;
            }
        } else {
            var2 += 1284201966;
            var2 *= -1569925849;
            var2 >>>= 26;
            var2 |= 1269085682;
            var2 ^= 1365214973;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 == 0) {
                UnsupportedOperationException var22 = new UnsupportedOperationException();
                throw var22;
            }
        }

        IllegalStateException var21 = new IllegalStateException();
        throw var21;
    }

    public void v(String var1) {
        int var2 = OB;
        var2 ^= 40205061;
        int var3 = System.identityHashCode(this);
        Integer var4 = var3;
        if (var4 == null) {
            var2 &= 1114939218;
            var2 &= -1190243906;
            var2 |= -792878349;
            var2 ^= 1184982761;
        } else {
            var2 *= -1843955645;
            var2 ^= 1188289237;
            List var60 = this.mm;
            Iterator var61 = var60.iterator();
            Iterator var62 = var61;
            var2 ^= -2037628940;
            var2 >>>= 24;
            var2 &= 2052103615;
            var2 *= -901507221;
            var2 ^= -2039646196;

            while (true) {
                Object var5 = var2;
                if (var5 != null) {
                    boolean var63 = var62.hasNext();
                    long var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var94;
                    int var72 = (var94 = var6 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                    if (var72 != 0) {
                        var2 &= 1842345829;
                        var2 -= 123926311;
                        var2 ^= -1363546336;
                        break;
                    }

                    var2 ^= -1948976944;
                    var2 ^= 1367644393;
                    var2 -= 548034384;
                    var2 >>>= 23;
                    var2 ^= 1042730458;
                    if (!var63) {
                        var2 &= 531686014;
                        var2 |= 795469019;
                        var2 ^= -293588618;
                        return;
                    }
                    var2 = switch (var2) {
                        default -> var2 ^ -1788349910;
                        case -253596884 -> var2 ^ -1418362817;
                        case 1042730005 -> {
                            var2 >>= 3;
                            yield var2 ^ -584681375;
                        }
                    };
                    var5 = var2;
                    if (var5 != null) {
                        var5 = var62.next();
                        XR var66 = (XR)var5;
                        xB var73 = var66.W();
                        long var7 = var3;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var95;
                        int var78 = (var95 = var7 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                        if (var78 != 0) {
                            var2 <<= 8;
                            var2 |= 841018404;
                            var2 += -315995981;
                            var2 |= 678420154;
                            var2 ^= 1777543909;
                            break;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ -633144967;
                            case -936681451 -> var2 ^ 2007007960;
                            case -622681629 -> {
                                var2 >>= 1;
                                var2 *= 442133879;
                                yield var2 ^ -914164685;
                            }
                        };
                        var7 = var2;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var96;
                        int var82 = (var96 = var7 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                        if (var82 == 0) {
                            String var74 = var73.oQ();
                            boolean var75 = var74.equals(var1);
                            if (var75) {
                                var2 ^= 2009438443;
                                var2 *= 355434291;
                                var2 |= 659075746;
                                var2 -= 127766861;
                                var2 ^= -1981896909;
                                var66.zx(true);
                                var2 -= 1497220484;
                                var2 ^= -419656683;
                            } else {
                                switch (var2) {
                                    case -1425405436:
                                    default:
                                        var2 ^= -266208281;
                                        break;
                                    case 892283757:
                                        var2 ^= -217170486;
                                        break;
                                    case 1147128116:
                                        var2 -= -934385190;
                                        var2 -= -1091341346;
                                        var2 += -218416885;
                                        var2 ^= 64072095;
                                }
                            }

                            int var67 = var2 + 1;
                            var67 = var2 * var67;
                            var67 &= 1;
                            if (var67 == 0) {
                                var2 ^= 1233823061;
                                var2 ^= -1890584973;
                                var2 ^= -1490686003;
                                continue;
                            }
                        }
                    }
                }

                IllegalStateException var59 = new IllegalStateException();
                throw var59;
            }
        }

        UnsupportedOperationException var58 = new UnsupportedOperationException();
        throw var58;
    }

    public boolean n() {
        int var1 = OB;
        var1 ^= 1288871262;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 == null) {
            var1 <<= 15;
            var1 += 1125872303;
            var1 *= 547934685;
            var1 ^= -9087713;
            var19 = var1;
            if (var19 != null) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        } else {
            long var14 = switch (var1) {
                case -2038376097 -> {
                    var1 += -1267785080;
                    yield var1 ^ 389079336;
                }
                case 433318012 -> var1 ^ 2100559256;
                default -> var1 ^ -974506825;
            };
            long var3 = var14 + 1L;
            var3 = var14 * var3;
            long var5 = var14 + 2L;
            var3 *= var5;
            long var15 = var14 + 3L;
            var3 *= var15;
            long var16 = var3 & 7L;
            long var25;
            var1 = (var25 = var16 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.e;
            }
        }

        AssertionError var18 = new AssertionError();
        throw var18;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -889142559;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        OB = var4;
    }
}
