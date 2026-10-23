package dev.aurap.hub;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.LongSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Lh_2 {
    public static final long Yi = 30000L;
    private static final Logger g;
    private final Zx Sq;
    private final Ni ft;
    private final Path I;
    private final Executor ek;
    private final Executor rH;
    private final LongSupplier ColorSetting;
    private final hs be;
    private long HO;
    private String q = "";
    private long p;
    private boolean ml;
    private boolean j;
    private boolean ta;
    private long nJ;
    private JsonObject cP;
    private BR QJ;
    private String s;
    public static final int t;

    public Lh_2(Zx var1, Ni var2, Path var3, Executor var4, Executor var5, LongSupplier var6, hs var7) {
        BR var8 = BR.OFFLINE;
        this.QJ = var8;
        this.s = "";
        this.Sq = var1;
        this.ft = var2;
        this.I = var3;
        this.ek = var4;
        this.rH = var5;
        this.ColorSetting = var6;
        this.be = var7;
        this.cF(1404687622);
    }

    public void F(boolean var1) {
        label97: {
            int var2 = t;
            var2 ^= 1918828467;
            int var3 = System.identityHashCode(this);
            int var4 = (this.ml ? 1 : 0);
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var107;
            int var77 = (var107 = var5 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
            if (var77 != 0) {
                switch (var2) {
                    case -1854739237:
                        var2 ^= -365585617;
                        var2 <<= 5;
                        var2 ^= 1159535823;
                        break;
                    case -1293897677:
                    default:
                        var2 ^= 185341872;
                        break;
                    case -145101671:
                        var2 ^= 2060740848;
                }
            } else {
                var2 = switch (var2) {
                    case -1854739237 -> {
                        var2 &= 525816957;
                        var2 *= 830805749;
                        yield var2 ^ -762206408;
                    }
                    case 38931840 -> var2 ^ 649531051;
                    default -> var2 ^ -152904925;
                };
                var5 = var2;
                var7 = var5 + 1L;
                var7 = var5 * var7;
                var5 = var7 & 1L;
                long var108;
                int var80 = (var108 = var5 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                if (var80 != 0) {
                    break label97;
                }

                if (var1 == (var4 != 0)) {
                    var2 -= -1942997654;
                    var2 ^= -127957838;
                    return;
                }

                var2 &= 32197755;
                var2 ^= 425868815;
                var2 ^= 790418300;
                Integer var68 = var2;
                if (var68 == null) {
                    break label97;
                }

                this.ml = var1;
                var4 = (this.ml ? 1 : 0);
                int var81 = var3 + 1;
                int var82 = var3 * var81;
                int var6 = var3 + 2;
                int var83 = var82 * var6;
                var6 = var3 + 3;
                int var84 = var83 * var6;
                int var85 = var84 & 7;
                if (var85 != 0) {
                    var2 ^= -180330767;
                    var2 >>>= 1;
                    var2 <<= 14;
                    var2 ^= -629038513;
                } else {
                    label100: {
                        var2 -= -654424321;
                        var2 ^= -1921584949;
                        var5 = var2;
                        var7 = var5 + 1L;
                        var7 = var5 * var7;
                        var5 = var7 & 1L;
                        long var109;
                        int var88 = (var109 = var5 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                        if (var88 != 0) {
                            break label97;
                        }

                        if (var4 != 0) {
                            var2 >>>= 30;
                            var2 ^= -1239160409;
                            long var70 = var2;
                            long var97 = var70 + 1L;
                            long var98 = var70 * var97;
                            long var71 = var98 & 1L;
                            long var110;
                            var4 = (var110 = var71 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                            if (var4 != 0) {
                                break label97;
                            }

                            this.ta = true;
                            var2 <<= 16;
                            var2 ^= 446667289;
                        } else {
                            var2 |= -71356276;
                            var2 |= -1069758373;
                            var2 -= -311231216;
                            var2 ^= 402839790;
                            var68 = var2;
                            if (var68 == null) {
                                break label97;
                            }

                            boolean var74 = this.j;
                            var5 = var3;
                            var7 = var5 + 1L;
                            var7 = var5 * var7;
                            var5 = var7 & 1L;
                            long var111;
                            int var91 = (var111 = var5 - 0L) == 0L ? 0 : (var111 < 0L ? -1 : 1);
                            if (var91 != 0) {
                                switch (var2) {
                                    case -1336870676:
                                    default:
                                        var2 ^= 270385452;
                                        break label100;
                                    case 378525953:
                                        var2 &= -1598032421;
                                        var2 *= 370646915;
                                        var2 &= 803115254;
                                        var2 *= -1511971429;
                                        var2 ^= -1365923079;
                                        break label100;
                                    case 883998129:
                                        var2 ^= 1288070152;
                                        break label100;
                                }
                            }

                            var2 *= 229371211;
                            var2 |= -748527937;
                            var2 ^= 916266957;
                            if (!var74) {
                                var2 >>>= 25;
                                var2 -= -90986042;
                                var2 ^= 156675163;
                                var2 ^= -151250243;
                                BR var75 = BR.OFFLINE;
                                Integer var63 = var3;
                                if (var63 == null) {
                                    var2 ^= 1062410980;
                                    var2 -= -1782780538;
                                    var2 -= 2033774014;
                                    var2 ^= -1688994527;
                                    break label100;
                                }
                                var2 = switch (var2) {
                                    case -641644804 -> var2 ^ -1598383953;
                                    case -87629738 -> {
                                        var2 >>= 1;
                                        var2 ^= 194349590;
                                        yield var2 ^ -26896603;
                                    }
                                    default -> var2 ^ -1582739283;
                                };
                                this.QJ = var75;
                                switch (var2) {
                                    case -853879298:
                                        var2 ^= -1929235909;
                                        break;
                                    case 143879448:
                                        var2 += -1468979307;
                                        var2 >>>= 23;
                                        var2 ^= -214197381;
                                        break;
                                    case 861683774:
                                    default:
                                        var2 ^= -886147564;
                                }
                            } else {
                                var2 |= 207201747;
                                var2 ^= 507543530;
                            }
                        }

                        long var64 = var2;
                        var5 = var64 + 1L;
                        var5 = var64 * var5;
                        var7 = var64 + 2L;
                        var5 *= var7;
                        long var65 = var64 + 3L;
                        var5 *= var65;
                        long var66 = var5 & 7L;
                        long var112;
                        var3 = (var112 = var66 - 0L) == 0L ? 0 : (var112 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label97;
                    }
                }
            }

            IllegalArgumentException var59 = new IllegalArgumentException();
            throw var59;
        }

        AssertionError var62 = new AssertionError();
        throw var62;
    }

    public void S() {
        int var1 = t;
        var1 ^= -1101985196;
        int var2 = System.identityHashCode(this);
        int var3 = (this.ml ? 1 : 0);
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var5 = var2 + 3;
        var4 *= var5;
        var4 &= 7;
        label162:
        if (var4 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ -490907140;
                case 955593749 -> var1 ^ 989468194;
                case 1568479548 -> {
                    var1 += -1327477896;
                    var1 &= -252737992;
                    var1 |= -1755790706;
                    var1 *= 879428895;
                    yield var1 ^ -931272270;
                }
            };
            Integer var133 = var1;
            label158:
            if (var133 != null) {
                if (var3 != 0) {
                    var1 = switch (var1) {
                        default -> var1 ^ 1782660611;
                        case 450571952 -> {
                            var1 ^= -106705759;
                            yield var1 ^ 87777811;
                        }
                        case 791620623 -> var1 ^ -1993537248;
                    };
                    var3 = var1 + 1;
                    var3 = var1 * var3;
                    int var134 = var1 + 2;
                    var3 *= var134;
                    var134 = var1 + 3;
                    var3 *= var134;
                    var3 &= 7;
                    if (var3 != 0) {
                        break label158;
                    }

                    int var112 = (this.j ? 1 : 0);
                    long var136 = var2;
                    long var6 = var136 + 1L;
                    var6 = var136 * var6;
                    long var8 = var136 + 2L;
                    var6 *= var8;
                    long var137 = var136 + 3L;
                    var6 *= var137;
                    long var138 = var6 & 7L;
                    long var190;
                    var134 = (var190 = var138 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                    if (var134 != 0) {
                        var1 -= 332212305;
                        var1 |= 1990186833;
                        var1 -= 830449643;
                        var1 += -1601142384;
                        var1 ^= -2111068252;
                        break label162;
                    }

                    var1 ^= 1086672663;
                    var1 &= 1686662553;
                    var1 ^= -1710705855;
                    var1 += 177738919;
                    var1 ^= -1419334165;
                    if (var112 == 0) {
                        var1 &= -1298618243;
                        var1 ^= -546497783;
                        Integer var113 = var1;
                        if (var113 != null) {
                            var112 = (this.ta ? 1 : 0);
                            var134 = var2 + 1;
                            var134 = var2 * var134;
                            var134 &= 1;
                            if (var134 != 0) {
                                switch (var1) {
                                    case -1626682666:
                                    default:
                                        var1 ^= -422847363;
                                        break label162;
                                    case -43142379:
                                        var1 -= -624066345;
                                        var1 -= -2066322162;
                                        var1 >>= 23;
                                        var1 ^= 465889545;
                                        break label162;
                                    case 539689134:
                                        var1 ^= 1673164486;
                                        break label162;
                                }
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ 2020368561;
                                case -43142379 -> {
                                    var1 *= 290244163;
                                    var1 += -851195735;
                                    yield var1 ^ 1267909211;
                                }
                                case 1119445435 -> var1 ^ -1645817943;
                            };
                            Integer var143 = var1;
                            if (var143 != null) {
                                if (var112 != 0) {
                                    var1 >>>= 8;
                                    var1 &= 36039642;
                                    var1 *= -1938242485;
                                    var1 ^= -325553474;
                                    this.ta = false;
                                    var113 = var2;
                                    if (var113 == null) {
                                        var1 -= 488332985;
                                        var1 += 1259249185;
                                        var1 |= 498309358;
                                        var1 ^= 1502383820;
                                        break label162;
                                    }

                                    var1 *= -234718623;
                                    var1 >>= 21;
                                    var1 ^= 331517113;
                                    var113 = var1;
                                    if (var113 != null) {
                                        var112 = var1 | -227225390;
                                        int var118 = var112 + 492511955;
                                        var118 ^= -363825280;
                                        this.D(var118);
                                        return;
                                    }
                                } else {
                                    var1 = switch (var1) {
                                        case -1020975245 -> {
                                            var1 += -911428329;
                                            var1 ^= -426700450;
                                            var1 += 791363545;
                                            yield var1 ^ -844386054;
                                        }
                                        default -> var1 ^ -1076630179;
                                        case -644549886 -> var1 ^ 564830645;
                                    };
                                    var113 = var1;
                                    if (var113 != null) {
                                        LongSupplier var121 = this.ColorSetting;
                                        long var144 = var2;
                                        var6 = var144 + 1L;
                                        var6 = var144 * var6;
                                        var8 = var144 + 2L;
                                        var6 *= var8;
                                        long var145 = var144 + 3L;
                                        var6 *= var145;
                                        long var146 = var6 & 7L;
                                        long var191;
                                        int var147 = (var191 = var146 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                                        if (var147 != 0) {
                                            var1 -= 2015497717;
                                            var1 ^= -439220062;
                                            var1 ^= -582176270;
                                            break label162;
                                        }

                                        var1 &= 2096297419;
                                        var1 ^= 2107067959;
                                        Integer var148 = var1;
                                        if (var148 != null) {
                                            long var122 = var121.getAsLong();
                                            long var154 = this.nJ;
                                            long var192;
                                            var5 = (var192 = var122 - var154) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                                            if (var5 < 0) {
                                                var1 += -1061867427;
                                                var1 ^= 991475428;
                                                var1 ^= 1833581075;
                                                long var156 = var1;
                                                long var7 = var156 + 1L;
                                                var7 = var156 * var7;
                                                long var9 = var156 + 2L;
                                                var7 *= var9;
                                                long var157 = var156 + 3L;
                                                var7 *= var157;
                                                long var158 = var7 & 7L;
                                                long var193;
                                                var5 = (var193 = var158 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                                                if (var5 == 0) {
                                                    return;
                                                }
                                            } else {
                                                var1 *= 1261870887;
                                                var1 ^= 186601780;
                                                long var160 = var1;
                                                long var182 = var160 + 1L;
                                                var182 = var160 * var182;
                                                long var161 = var182 & 1L;
                                                long var194;
                                                var5 = (var194 = var161 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                                                if (var5 == 0) {
                                                    long var123 = var122 + 30000L;
                                                    this.nJ = var123;
                                                    int var124 = var1 + -878538396;
                                                    var124 -= 1383358828;
                                                    var124 ^= 1499708373;
                                                    var124 ^= 514185392;
                                                    String var128 = this.mZ(var124);
                                                    String var149 = this.q;
                                                    boolean var150 = var128.equals(var149);
                                                    var5 = var2 + 1;
                                                    var5 = var2 * var5;
                                                    var5 &= 1;
                                                    if (var5 != 0) {
                                                        var1 &= 845575443;
                                                        var1 ^= -702867678;
                                                        break label162;
                                                    }

                                                    var1 += 37073991;
                                                    var1 ^= -121032329;
                                                    long var166 = var1;
                                                    var182 = var166 + 1L;
                                                    var182 = var166 * var182;
                                                    long var189 = var166 + 2L;
                                                    var182 *= var189;
                                                    long var167 = var166 + 3L;
                                                    var182 *= var167;
                                                    long var168 = var182 & 7L;
                                                    long var195;
                                                    var5 = (var195 = var168 - 0L) == 0L ? 0 : (var195 < 0L ? -1 : 1);
                                                    if (var5 == 0) {
                                                        if (var150) {
                                                            var1 ^= 251445115;
                                                            var1 >>= 8;
                                                            var1 ^= 1926942798;
                                                            var148 = var1;
                                                            if (var148 != null) {
                                                                BR var152 = BR.SYNCED;
                                                                var5 = var2 + 1;
                                                                var5 = var2 * var5;
                                                                var2 = var5 & 1;
                                                                if (var2 != 0) {
                                                                    var1 += 1300433415;
                                                                    var1 += 1971270336;
                                                                    var1 -= -1032957100;
                                                                    var1 ^= -1760097600;
                                                                    break label162;
                                                                }

                                                                var1 |= -1343175623;
                                                                var1 &= 1212036718;
                                                                var1 |= -678079341;
                                                                var1 &= 2016750465;
                                                                var1 ^= 1168318865;
                                                                Integer var100 = var1;
                                                                if (var100 != null) {
                                                                    this.QJ = var152;
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            var1 = switch (var1) {
                                                                case 1277136552 -> {
                                                                    var1 += 555282323;
                                                                    var1 &= -796452409;
                                                                    var1 -= -486427900;
                                                                    var1 -= -2117658533;
                                                                    yield var1 ^ 1401257056;
                                                                }
                                                                case 1538509852 -> var1 ^ -2084747772;
                                                                default -> var1 ^ -1214551464;
                                                            };
                                                            Integer var101 = var1;
                                                            if (var101 != null) {
                                                                int var102 = var1 - 1724104995;
                                                                var102 -= -914749216;
                                                                var102 ^= -372317095;
                                                                this.sp(var128, var102);
                                                                return;
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
                        break label158;
                    }

                    var1 |= 1100107098;
                    var1 &= -266970971;
                    var1 ^= -1775285879;
                } else {
                    switch (var1) {
                        case -1283064743:
                            var1 ^= 91970870;
                            break;
                        case 249977836:
                        default:
                            var1 ^= -1173543914;
                            break;
                        case 450571952:
                            var1 -= 188487839;
                            var1 |= -2139422207;
                            var1 ^= 117996993;
                            var1 ^= 2127460957;
                    }
                }

                Integer var105 = var1;
                if (var105 != null) {
                    return;
                }
            }

            IllegalStateException var106 = new IllegalStateException();
            throw var106;
        } else {
            switch (var1) {
                case -1771543079:
                    var1 ^= 1843158248;
                    break;
                case 1275816543:
                default:
                    var1 ^= 304334321;
                    break;
                case 1568479548:
                    var1 *= 1559795455;
                    var1 *= -197276697;
                    var1 ^= 123688324;
                    var1 ^= -299392662;
            }
        }

        AssertionError var95 = new AssertionError();
        throw var95;
    }

    public void p() {
        label39: {
            int var1 = t;
            var1 ^= -672721750;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var52;
            int var39 = (var52 = var3 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
            if (var39 != 0) {
                var1 ^= -729473000;
                var1 ^= 607432709;
                var1 >>>= 19;
                var1 ^= 1497622605;
            } else {
                var1 += 1120478986;
                var1 |= -1785025095;
                var1 *= 1508235707;
                var1 ^= -1211422215;
                boolean var40 = this.ml;
                if (!var40) {
                    var1 -= 1173587268;
                    var1 += 1930913820;
                    var1 >>>= 4;
                    var1 ^= 321097398;
                    var1 ^= 72998242;
                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var53;
                    int var46 = (var53 = var3 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                    if (var46 == 0) {
                        return;
                    }
                    break label39;
                }

                var1 ^= 606763680;
                var1 ^= 1107413598;
                int var41 = var1 + 1;
                int var42 = var1 * var41;
                int var43 = var42 & 1;
                if (var43 != 0) {
                    break label39;
                }

                this.ta = true;
                Integer var32 = var2;
                if (var32 != null) {
                    var1 += 966997334;
                    var1 ^= 632707637;
                    int var35 = var1 + 1;
                    var35 = var1 * var35;
                    var1 = var35 & 1;
                    if (var1 == 0) {
                        this.nJ = 0L;
                        return;
                    }
                    break label39;
                }

                var1 ^= 284371167;
                var1 &= -1725106291;
                var1 |= 122770764;
                var1 ^= 1580861327;
            }

            Integer var33 = var1;
            if (var33 != null) {
                IllegalArgumentException var34 = new IllegalArgumentException();
                throw var34;
            }
        }

        IllegalArgumentException var31 = new IllegalArgumentException();
        throw var31;
    }

    public void tk() {
        LongSupplier var261 = null;
        long var263 = 0L;
        Ni var286 = null;
        nL var287 = null;
        nL var288 = null;
        long var289 = 0L;
        int var300 = 0;
        Zx var324 = null;
        com.google.gson.JsonObject var325 = null;
        byte[] var326 = null;
        int var2 = t;
        var2 ^= -1412677902;
        ms var3 = null;
        var2 *= 434504189;
        var2 ^= 303179663;
        int var4 = (this.ml ? 1 : 0);
        if (var4 == 0) {
            switch (var2) {
                case -734209970:
                default:
                    var2 ^= 745817791;
                    break;
                case -100365123:
                    var2 &= 1748891548;
                    var2 ^= 1431948828;
                    break;
                case 2126787368:
                    var2 ^= 1488796792;
            }
        } else {
            var2 = switch (var2) {
                case -2027537334 -> var2 ^ 1131643064;
                case -100365123 -> {
                    var2 ^= 510204424;
                    var2 ^= 1486646808;
                    var2 -= 1738778121;
                    yield var2 ^ -62289048;
                }
                default -> var2 ^ -1597969106;
            };
            var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 == 0) {
                var4 = var2 ^ -1447042229;
                var4 ^= 1823564402;
                String var246 = this.mZ(var4);
                String var247 = var246;
                String var277 = this.q;
                var2 -= 1276734228;
                var2 *= -881492127;
                var2 |= -1338823072;
                var2 += 2043912832;
                var2 ^= 1977720848;
                int var278 = (var246.equals(var277)) ? 1 : 0;
                if (var278 != 0) {
                    var2 ^= 656250814;
                    var2 ^= -46635667;
                    return;
                }
                var2 = switch (var2) {
                    case 823139502 -> var2 ^ -353562022;
                    default -> var2 ^ -1634764421;
                    case 1588806248 -> {
                        var2 ^= -721410354;
                        var2 ^= -29769409;
                        var2 *= -1323786077;
                        yield var2 ^ -854683029;
                    }
                };
                long var279 = var2;
                long var7 = var279 + 1L;
                var7 = var279 * var7;
                long var9 = var279 + 2L;
                var7 *= var9;
                long var280 = var279 + 3L;
                var7 *= var280;
                long var281 = var7 & 7L;
                long var346;
                var278 = (var346 = var281 - 0L) == 0L ? 0 : (var346 < 0L ? -1 : 1);
                label194:
                if (var278 == 0) {
                    label273: {
                        Exception var1;
                        label272: {
                            label317: {
                                label313: {
                                    try {
                                        var2 += 2120338239;
                                        var2 >>= 9;
                                        var2 <<= 3;
                                        var2 ^= -1369630520;
                                    } catch (Exception var28) {
                                        var1 = var28;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var248 = var28 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var248) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    var278 = var2 + 1;
                                    var278 = var2 * var278;
                                    var278 &= 1;
                                    if (var278 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var286 = this.ft;
                                    } catch (Exception var27) {
                                        var1 = var27;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var249 = var27 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var249) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        default -> var2 ^ -705448400;
                                        case 418837613 -> var2 ^ 903386491;
                                        case 1347999224 -> {
                                            var2 &= 1627413839;
                                            var2 += 348629006;
                                            var2 ^= 417697556;
                                            yield var2 ^ -715021531;
                                        }
                                    };
                                    long var6 = var2;
                                    long var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var6 = var8 & 1L;
                                    long var347;
                                    int var292 = (var347 = var6 - 0L) == 0L ? 0 : (var347 < 0L ? -1 : 1);
                                    if (var292 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var6 = this.HO;
                                        var2 <<= 20;
                                        var2 ^= -1083467853;
                                    } catch (Exception var26) {
                                        var1 = var26;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var250 = var26 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var250) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    int var319 = var2 + 1;
                                    int var320 = var2 * var319;
                                    int var337 = var2 + 2;
                                    int var321 = var320 * var337;
                                    int var338 = var2 + 3;
                                    int var322 = var321 * var338;
                                    int var323 = var322 & 7;
                                    if (var323 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var324 = this.Sq;
                                    } catch (Exception var25) {
                                        var1 = var25;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var251 = var25 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var251) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        case -2027645519 -> var2 ^ -1720636747;
                                        case -1457809485 -> {
                                            var2 *= -586447455;
                                            yield var2 ^ -133531179;
                                        }
                                        default -> var2 ^ 1913914588;
                                    };

                                    try {
                                        var325 = var324.WA(false);
                                    } catch (Exception var24) {
                                        var1 = var24;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var252 = var24 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var252) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        default -> var2 ^ -1762491498;
                                        case -214909092 -> var2 ^ -1722629187;
                                        case 1137778502 -> {
                                            var2 ^= 1389933670;
                                            var2 ^= -1571786558;
                                            yield var2 ^ -1711515675;
                                        }
                                    };

                                    try {
                                        var326 = Ke.y(var325);
                                        var2 += -1544914026;
                                        var2 |= 1495935354;
                                        var2 -= 140870451;
                                        var2 ^= -1085192790;
                                    } catch (Exception var23) {
                                        var1 = var23;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var253 = var23 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var253) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    var9 = var2;
                                    long var11 = var9 + 1L;
                                    var11 = var9 * var11;
                                    var9 = var11 & 1L;
                                    long var348;
                                    int var341 = (var348 = var9 - 0L) == 0L ? 0 : (var348 < 0L ? -1 : 1);
                                    if (var341 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var287 = var286.z(var6, 6, var326);
                                        var2 >>= 14;
                                        var2 ^= 2050955027;
                                    } catch (Exception var22) {
                                        var1 = var22;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var254 = var22 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var254) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    var6 = var2;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var6 = var8 & 1L;
                                    long var349;
                                    int var296 = (var349 = var6 - 0L) == 0L ? 0 : (var349 < 0L ? -1 : 1);
                                    if (var296 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var288 = var287;
                                        var2 += 727618760;
                                        var2 *= -1817493731;
                                        var2 += -565094663;
                                        var2 *= 383909731;
                                        var2 ^= -93485493;
                                    } catch (Exception var21) {
                                        var1 = var21;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var255 = var21 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var255) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    int var297 = var2 + 1;
                                    int var298 = var2 * var297;
                                    int var299 = var298 & 1;
                                    if (var299 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var300 = var288.nU;
                                        var2 <<= 9;
                                        var2 &= 235553329;
                                        var2 *= 560867381;
                                        var2 -= 1433122165;
                                        var2 ^= 440803467;
                                    } catch (Exception var20) {
                                        var1 = var20;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var256 = var20 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var256) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    var7 = var2;
                                    var9 = var7 + 1L;
                                    var9 = var7 * var9;
                                    var7 = var9 & 1L;
                                    long var350;
                                    int var316 = (var350 = var7 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                                    if (var316 != 0) {
                                        break label194;
                                    }

                                    try {
                                        if (var300 != 0) {
                                            break label317;
                                        }
                                    } catch (Exception var19) {
                                        var1 = var19;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var257 = var19 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var257) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        case -1847890297 -> var2 ^ 1907271143;
                                        default -> var2 ^ -193172215;
                                        case 1691511296 -> {
                                            var2 >>>= 9;
                                            yield var2 ^ -413921266;
                                        }
                                    };
                                    var6 = var2;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    long var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var351;
                                    int var304 = (var351 = var6 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                                    if (var304 != 0) {
                                        break label194;
                                    }
                                    var2 = switch (var2) {
                                        case -412714693 -> {
                                            var2 >>>= 5;
                                            var2 += 662152870;
                                            yield var2 ^ 1504648319;
                                        }
                                        case -354065837 -> var2 ^ 141741061;
                                        default -> var2 ^ 207539550;
                                    };
                                    var6 = var2;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var352;
                                    int var308 = (var352 = var6 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                                    if (var308 != 0) {
                                        break label194;
                                    }

                                    try {
                                        var289 = var288.Kx;
                                        var2 *= 1877806609;
                                        var2 *= -1606791859;
                                        var2 ^= 1983552186;
                                        var2 -= 1681845179;
                                        var2 ^= 2128658500;
                                    } catch (Exception var18) {
                                        var1 = var18;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var258 = var18 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var258) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    Integer var317 = var2;
                                    if (var317 == null) {
                                        break label194;
                                    }

                                    try {
                                        this.HO = var289;
                                    } catch (Exception var17) {
                                        var1 = var17;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var259 = var17 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var259) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        default -> var2 ^ 479062051;
                                        case 169879163 -> var2 ^ 909303122;
                                        case 1485785579 -> {
                                            var2 ^= 606695131;
                                            var2 &= 1411785529;
                                            var2 >>>= 29;
                                            yield var2 ^ 1773784956;
                                        }
                                    };

                                    try {
                                        this.q = var247;
                                        var2 -= -2109731970;
                                        var2 *= 949140387;
                                        var2 ^= -255322157;
                                        var261 = this.ColorSetting;
                                        var2 <<= 27;
                                        var2 *= -1012870711;
                                        var2 &= 1304487037;
                                        var2 ^= -1605005768;
                                    } catch (Exception var16) {
                                        var1 = var16;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var260 = var16 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var260) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    Integer var290 = var2;
                                    if (var290 == null) {
                                        break label194;
                                    }

                                    try {
                                        var263 = var261.getAsLong();
                                    } catch (Exception var15) {
                                        var1 = var15;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var262 = var15 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var262) {
                                            break label272;
                                        }
                                        break label313;
                                    }
                                    var2 = switch (var2) {
                                        case -794329930 -> var2 ^ -836596147;
                                        case -397046216 -> {
                                            var2 >>>= 14;
                                            yield var2 ^ -1728118278;
                                        }
                                        default -> var2 ^ -1559780144;
                                    };

                                    try {
                                        this.p = var263;
                                        var2 &= 1253375648;
                                        var2 *= -837709413;
                                        var2 ^= 901292716;
                                        var2 ^= 1861167236;
                                    } catch (Exception var14) {
                                        var1 = var14;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var264 = var14 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var264) {
                                            break label272;
                                        }
                                        break label313;
                                    }

                                    Integer var265 = var2;
                                    if (var265 == null) {
                                        break label194;
                                    }

                                    try {
                                        int var271 = var2 >>> 11;
                                        var271 -= 1974703040;
                                        var271 ^= -362102862;
                                        var271 *= -576964835;
                                        var271 ^= 2143786859;
                                        this.G(var271);
                                        var2 >>>= 9;
                                        var2 ^= 1954452394;
                                        break label273;
                                    } catch (Exception var13) {
                                        var1 = var13;
                                        var2 = t;
                                        var2 ^= -500287664;
                                        boolean var266 = var13 instanceof ms;
                                        var2 -= -426342820;
                                        var2 ^= 405203174;
                                        var2 <<= 31;
                                        var2 += 1312217525;
                                        var2 ^= 1459025519;
                                        if (!var266) {
                                            break label272;
                                        }
                                    }
                                }

                                var2 ^= 525543252;
                                var2 <<= 30;
                                var2 |= 992188651;
                                var2 ^= -112711673;
                                long var267 = var2;
                                long var309 = var267 + 1L;
                                var309 = var267 * var309;
                                long var268 = var309 & 1L;
                                long var353;
                                var4 = (var353 = var268 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    break label194;
                                }

                                var3 = (ms)var1;
                                var2 ^= -472096866;
                                var2 ^= -582159199;
                                Integer var29 = var2;
                                if (var29 == null) {
                                    break label194;
                                }

                                Logger var238 = g;
                                var2 *= -1764820977;
                                var2 |= 863472590;
                                var2 ^= 1600138745;
                                Integer var270 = var2;
                                if (var270 == null) {
                                    break label194;
                                }

                                String var31 = var3.getMessage();
                                var238.info("Cloud config not saved on exit: {}", var31);
                                var2 ^= 1972226447;
                                var2 ^= 1232892080;
                                return;
                            }

                            switch (var2) {
                                case -2065078096:
                                    var2 ^= -1379712477;
                                    break label273;
                                case -521267217:
                                default:
                                    var2 ^= 859323075;
                                    break label273;
                                case 1691511296:
                                    var2 <<= 15;
                                    var2 ^= -1040634838;
                                    var2 ^= -2133495883;
                                    break label273;
                            }
                        }

                        var2 ^= -79655088;
                        var2 >>>= 12;
                        var2 &= -966290989;
                        var2 &= 1591366375;
                        var2 ^= 702672970;
                        throw UncheckedExceptions.rethrow(var1);
                    }

                    int var32 = var2 + 1;
                    var32 = var2 * var32;
                    var32 &= 1;
                    if (var32 == 0) {
                        var2 *= 1240646557;
                        var2 ^= -920055838;
                        var2 |= -980870392;
                        var2 ^= 758875248;
                        return;
                    }
                }
            }

            IllegalArgumentException var35 = new IllegalArgumentException();
            throw var35;
        }
    }

    private void D(int var1) {
        int var3 = System.identityHashCode(this);
        this.j = true;
        long var11 = var3;
        long var5 = var11 + 1L;
        var5 = var11 * var5;
        long var12 = var5 & 1L;
        long var19;
        var3 = (var19 = var12 - 0L) == 0L ? 0 : (var19 < 0L ? -1 : 1);
        if (var3 == 0) {
            Integer var14 = switch (var1) {
                default -> var1 ^ 1543804123;
                case -776304812 -> var1 ^ -1149396008;
                case -83724754 -> {
                    int var9 = var1 | -1749452907;
                    yield var9 ^ 1388138971;
                }
            };
            if (var14 != null) {
                BR var16 = BR.SYNCING;
                this.QJ = var16;
                Executor var17 = this.ek;
                Runnable var4 = () -> {
                    nL var79;
                    nL var80;
                    Runnable var81;
                    Executor var92;
                    label130: {
                        int var61;
                        label132: {
                            label133: {
                                Exception var1x;
                                boolean var4x;
                                label127: {
                                    label126: {
                                        label125: {
                                            label137: {
                                                try {
                                                    var61 = t;
                                                    var61 ^= 1414826765;
                                                    Object var3x = null;
                                                    var61 |= -1135616911;
                                                    var61 ^= 64490796;
                                                    Ni var78 = this.ft;
                                                    var61 |= 2051646127;
                                                    var61 <<= 4;
                                                    var61 *= 1516653311;
                                                    var61 ^= 2094322787;
                                                    var79 = var78.sx();
                                                    var61 += -1979056746;
                                                    var61 ^= -1041693758;
                                                } catch (Exception var14x) {
                                                    var1x = var14x;
                                                    var61 = t;
                                                    var61 ^= 389242160;
                                                    var4x = var14x instanceof ms;
                                                    switch (var61) {
                                                        case -1407093038:
                                                            break label137;
                                                        case -199274920:
                                                            break label125;
                                                        case 1865388982:
                                                        default:
                                                            break label126;
                                                    }
                                                }

                                                int var5x = var61 + 1;
                                                var5x = var61 * var5x;
                                                var5x &= 1;
                                                if (var5x != 0) {
                                                    break label130;
                                                }

                                                try {
                                                    var80 = var79;
                                                    var61 >>= 11;
                                                    var61 ^= 2141878621;
                                                } catch (Exception var13x) {
                                                    var1x = var13x;
                                                    var61 = t;
                                                    var61 ^= 389242160;
                                                    var4x = var13x instanceof ms;
                                                    switch (var61) {
                                                        case -1407093038:
                                                            break label137;
                                                        case -199274920:
                                                            break label125;
                                                        case 1865388982:
                                                        default:
                                                            break label126;
                                                    }
                                                }

                                                Integer var91 = var61;
                                                if (var91 == null) {
                                                    break label130;
                                                }

                                                try {
                                                    var92 = this.rH;
                                                } catch (Exception var12x) {
                                                    var1x = var12x;
                                                    var61 = t;
                                                    var61 ^= 389242160;
                                                    var4x = var12x instanceof ms;
                                                    switch (var61) {
                                                        case -1407093038:
                                                            break label137;
                                                        case -199274920:
                                                            break label125;
                                                        case 1865388982:
                                                        default:
                                                            break label126;
                                                    }
                                                }
                                                var61 = switch (var61) {
                                                    case -2141628891 -> {
                                                        var61 <<= 28;
                                                        var61 -= 1896725261;
                                                        var61 &= 47214271;
                                                        yield var61 ^ 1098757127;
                                                    }
                                                    default -> var61 ^ 1178075617;
                                                    case 1839983244 -> var61 ^ 1819490724;
                                                };

                                                try {
                                                    var81 = () -> {
                                                        int var2xx = t;
                                                        var2xx ^= -658668232;
                                                        int var3xx = System.identityHashCode(this);
                                                        long var23x = var3xx;
                                                        long var5xx = var23x + 1L;
                                                        var5xx = var23x * var5xx;
                                                        long var24x = var5xx & 1L;
                                                        long var32x;
                                                        var3xx = (var32x = var24x - 0L) == 0L ? 0 : (var32x < 0L ? -1 : 1);
                                                        if (var3xx != 0) {
                                                            var2xx *= -183334615;
                                                            var2xx ^= 230784323;
                                                            var2xx -= -1884134523;
                                                            var2xx ^= -1030208039;
                                                            var2xx ^= 63012528;
                                                            var3xx = var2xx + 1;
                                                            var3xx = var2xx * var3xx;
                                                            var3xx &= 1;
                                                            if (var3xx == 0) {
                                                                AssertionError var30x = new AssertionError();
                                                                throw var30x;
                                                            } else {
                                                                IllegalStateException var29x = new IllegalStateException();
                                                                throw var29x;
                                                            }
                                                        } else {
                                                            var2xx |= -777957683;
                                                            var2xx |= -72893516;
                                                            var2xx &= -675179140;
                                                            var2xx >>= 13;
                                                            var2xx ^= 382666152;
                                                            var2xx &= -613926866;
                                                            var2xx += 682054977;
                                                            var2xx -= -1944461215;
                                                            var2xx += 422429188;
                                                            var2xx ^= -1462055740;
                                                            this.KS(var80, var2xx);
                                                        }
                                                    };
                                                    var61 |= 1125203233;
                                                    var61 -= -368683563;
                                                    var61 *= -556412907;
                                                    var61 ^= 1174070597;
                                                } catch (Exception var11x) {
                                                    var1x = var11x;
                                                    var61 = t;
                                                    var61 ^= 389242160;
                                                    var4x = var11x instanceof ms;
                                                    switch (var61) {
                                                        case -1407093038:
                                                            break label137;
                                                        case -199274920:
                                                            break label125;
                                                        case 1865388982:
                                                        default:
                                                            break label126;
                                                    }
                                                }

                                                int var6 = var61 + 1;
                                                var6 = var61 * var6;
                                                var6 &= 1;
                                                if (var6 != 0) {
                                                    break label130;
                                                }

                                                try {
                                                    var92.execute(var81);
                                                    var61 ^= 1961403767;
                                                    var61 >>= 13;
                                                    var61 ^= 1671734827;
                                                    break label133;
                                                } catch (Exception var10) {
                                                    var1x = var10;
                                                    var61 = t;
                                                    var61 ^= 389242160;
                                                    var4x = var10 instanceof ms;
                                                    switch (var61) {
                                                        case -1407093038:
                                                            break;
                                                        case -199274920:
                                                            break label125;
                                                        case 1865388982:
                                                        default:
                                                            break label126;
                                                    }
                                                }
                                            }

                                            var61 ^= -1528026470;
                                            break label127;
                                        }

                                        var61 |= 184176436;
                                        var61 *= 980219819;
                                        var61 ^= 318373066;
                                        break label127;
                                    }

                                    var61 ^= 401528588;
                                }

                                long var93 = var61;
                                long var7x = var93 + 1L;
                                var7x = var93 * var7x;
                                var93 = var7x & 1L;
                                long var108;
                                int var95 = (var108 = var93 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                                if (var95 != 0) {
                                    break label130;
                                }

                                if (!var4x) {
                                    var61 -= -488273257;
                                    var61 ^= 957922058;
                                    var61 *= -591582945;
                                    var61 ^= -997077893;
                                    throw UncheckedExceptions.rethrow(var1x);
                                }

                                var61 |= -1435961536;
                                var61 ^= -409778752;
                                long var82 = var61;
                                long var98 = var82 + 1L;
                                var98 = var82 * var98;
                                long var8x = var82 + 2L;
                                var98 *= var8x;
                                long var83 = var82 + 3L;
                                var98 *= var83;
                                long var84 = var98 & 7L;
                                long var109;
                                var4x = ((var109 = var84 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1)) != 0;
                                if (var4x) {
                                    break label130;
                                }

                                ms var75 = (ms)var1x;
                                var61 *= -1664296679;
                                var61 |= -1832743084;
                                var61 += 1476295738;
                                var61 ^= -262328848;
                                long var86 = var61;
                                var98 = var86 + 1L;
                                var98 = var86 * var98;
                                var8x = var86 + 2L;
                                var98 *= var8x;
                                long var87 = var86 + 3L;
                                var98 *= var87;
                                long var88 = var98 & 7L;
                                long var110;
                                int var15x = (var110 = var88 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                                if (var15x != 0) {
                                    break label130;
                                }

                                var61 &= 1863782330;
                                var61 *= 1937274547;
                                var61 >>>= 1;
                                var61 ^= 1369803994;
                                Integer var76 = var61;
                                if (var76 == null) {
                                    break label130;
                                }

                                Executor var77 = this.rH;
                                Runnable var17x = () -> {
                                    int var2xx = t;
                                    var2xx ^= -1792363869;
                                    int var3xx = System.identityHashCode(this);
                                    int var4xx = var3xx + 1;
                                    var4xx = var3xx * var4xx;
                                    var3xx = var4xx & 1;
                                    if (var3xx != 0) {
                                        var2xx >>>= 17;
                                        var2xx -= -576263487;
                                        var2xx <<= 2;
                                        var2xx -= -1780797147;
                                        var2xx ^= -2144274845;
                                        UnsupportedOperationException var17xx = new UnsupportedOperationException();
                                        throw var17xx;
                                    } else {
                                        var2xx |= -825628490;
                                        var2xx ^= 1844669521;
                                        var2xx ^= -725131499;
                                        var2xx += 1398065930;
                                        var2xx ^= -423466469;
                                        this.Z(var75, var2xx);
                                    }
                                };
                                var77.execute(var17x);
                                switch (var61) {
                                    case -2025266463:
                                    default:
                                        var61 ^= -976292404;
                                        break label132;
                                    case 695598870:
                                        var61 ^= 2082492516;
                                        var61 += 237175737;
                                        var61 ^= 431978140;
                                        break label132;
                                    case 1834628183:
                                        var61 ^= 360622906;
                                        break label132;
                                }
                            }

                            Integer var18x = var61;
                            if (var18x == null) {
                                break label130;
                            }

                            var61 &= 2062396465;
                            var61 -= -1374110651;
                            var61 *= 642159759;
                            var61 ^= 1673996205;
                            var61 ^= 1628996638;
                        }

                        int var19x = var61 + 1;
                        var19x = var61 * var19x;
                        var19x &= 1;
                        if (var19x == 0) {
                            return;
                        }
                    }

                    UnsupportedOperationException var22 = new UnsupportedOperationException();
                    throw var22;
                };
                var17.execute(var4);
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        } else {
            int var2 = var1 | -1661985586;
            var2 ^= -1332261070;
            UnsupportedOperationException var8 = new UnsupportedOperationException();
            throw var8;
        }
    }

    private void KS(nL var1, int var2) {
        label113: {
            int var58;
            BR var99;
            label120: {
                int var4 = System.identityHashCode(this);
                this.j = false;
                int var5 = var1.nU;
                Integer var6 = var4;
                if (var6 == null) {
                    var58 = var2 | -684806649;
                    var58 &= -1662371972;
                    var58 |= -495711785;
                    var58 ^= -2018677740;
                } else {
                    label119: {
                        var58 = var2 & -1578230485;
                        var58 |= -232413618;
                        var58 ^= -284603769;
                        if (var5 == 0) {
                            var58 >>>= 21;
                            var58 ^= 1291827961;
                            long var81 = var1.Kx;
                            long var7 = this.HO;
                            long var147;
                            int var82 = (var147 = var81 - var7) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                            var6 = var4;
                            if (var6 == null) {
                                var58 -= -747236023;
                                var58 ^= 140175116;
                                break label119;
                            }

                            var58 *= 75841515;
                            var58 ^= 802559192;
                            var58 ^= -146516787;
                            var6 = var58;
                            if (var6 == null) {
                                break label113;
                            }

                            if (var82 != 0) {
                                var58 += 1888461604;
                                var58 -= 1641883688;
                                var58 ^= -280975916;
                                long var83 = var58;
                                var7 = var83 + 1L;
                                var7 = var83 * var7;
                                long var9 = var83 + 2L;
                                var7 *= var9;
                                long var84 = var83 + 3L;
                                var7 *= var84;
                                long var85 = var7 & 7L;
                                long var148;
                                int var86 = (var148 = var85 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                                if (var86 == 0) {
                                    int var87 = var58 * -342298521;
                                    int var88 = var87 * -337913297;
                                    int var89 = var88 ^ 352036497;
                                    this.z(var1, var89);
                                    return;
                                }
                                break label113;
                            }

                            var58 += 673848277;
                            var58 ^= -1825757400;
                            var58 += -1239914121;
                            var58 ^= 867418908;
                        } else {
                            switch (var58) {
                                case -734913348:
                                default:
                                    var58 ^= -1126864949;
                                    break;
                                case 79504095:
                                    var58 ^= -190397997;
                                    break;
                                case 489483721:
                                    var58 <<= 6;
                                    var58 ^= -1292166763;
                            }
                        }

                        int var90 = var1.nU;
                        var6 = var4;
                        if (var6 == null) {
                            switch (var58) {
                                case -1837128344:
                                default:
                                    var58 ^= 48524203;
                                    break;
                                case -870385999:
                                    var58 ^= 984856113;
                                    break;
                                case -104829995:
                                    var58 -= -248757090;
                                    var58 ^= 1861447467;
                                    var58 ^= 397675479;
                            }
                        } else {
                            var58 |= -1665014747;
                            var58 += 1081903689;
                            var58 ^= 2033270897;
                            long var103 = var58;
                            long var8 = var103 + 1L;
                            var8 = var103 * var8;
                            long var104 = var8 & 1L;
                            long var149;
                            int var105 = (var149 = var104 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                            if (var105 != 0) {
                                break label113;
                            }

                            if (var90 == 1) {
                                var58 -= -1302638110;
                                var58 += 1181390378;
                                var58 &= -1316758031;
                                var58 -= 177950608;
                                var58 ^= 745438155;
                                this.HO = 0L;
                                var58 >>>= 31;
                                var58 ^= 2021737675;
                            } else {
                                var58 -= -174689316;
                                var58 ^= -2116797849;
                                var58 |= -1389374951;
                                var58 *= -1699022651;
                                var58 ^= -1322393445;
                            }

                            Integer var91 = var58;
                            if (var91 == null) {
                                break label113;
                            }

                            this.nJ = 0L;
                            int var92 = var58 << 10;
                            int var93 = var92 - -432336415;
                            int var94 = var93 - 1745903461;
                            int var95 = var94 ^ -623972785;
                            String var96 = this.mZ(var95);
                            String var106 = this.q;
                            long var125 = var4;
                            long var144 = var125 + 1L;
                            var144 = var125 * var144;
                            var125 = var144 & 1L;
                            long var150;
                            int var127 = (var150 = var125 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                            if (var127 == 0) {
                                var58 ^= 139461211;
                                var58 &= 1779274086;
                                var58 ^= -1500190406;
                                boolean var97 = var96.equals(var106);
                                if (var97) {
                                    var58 ^= -939914767;
                                    var58 |= 319071339;
                                    var58 ^= 279353818;
                                    var99 = BR.SYNCED;
                                    long var107 = var4;
                                    var8 = var107 + 1L;
                                    var8 = var107 * var8;
                                    long var10 = var107 + 2L;
                                    var8 *= var10;
                                    long var108 = var107 + 3L;
                                    var8 *= var108;
                                    long var109 = var8 & 7L;
                                    long var151;
                                    var105 = (var151 = var109 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                                    if (var105 == 0) {
                                        var58 >>= 18;
                                        var58 *= 62444457;
                                        var58 *= -74455167;
                                        var58 *= -1839879081;
                                        var58 ^= 824644362;
                                        long var111 = var58;
                                        var8 = var111 + 1L;
                                        var8 = var111 * var8;
                                        var10 = var111 + 2L;
                                        var8 *= var10;
                                        long var112 = var111 + 3L;
                                        var8 *= var112;
                                        long var113 = var8 & 7L;
                                        long var152;
                                        var105 = (var152 = var113 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                                        if (var105 != 0) {
                                            break label113;
                                        }

                                        var99 = var99;
                                        var58 *= -1066741169;
                                        var58 ^= -173269821;
                                        break label120;
                                    }

                                    var58 >>= 16;
                                    var58 ^= 1909669890;
                                } else {
                                    var58 *= -853196907;
                                    var58 ^= 270357631;
                                    var105 = var58 + 1;
                                    var105 = var58 * var105;
                                    int var128 = var58 + 2;
                                    var105 *= var128;
                                    int var129 = var58 + 3;
                                    var105 *= var129;
                                    var105 &= 7;
                                    if (var105 != 0) {
                                        break label113;
                                    }

                                    BR var120 = BR.PENDING;
                                    int var130 = var4 + 1;
                                    int var131 = var4 * var130;
                                    int var143 = var4 + 2;
                                    int var132 = var131 * var143;
                                    var4 += 3;
                                    int var133 = var132 * var4;
                                    var4 = var133 & 7;
                                    if (var4 == 0) {
                                        var58 |= 2106468550;
                                        var58 ^= 1876931033;
                                        var58 &= 576755259;
                                        var58 -= 1914044571;
                                        var58 ^= 956108084;
                                        var99 = var120;
                                        var58 |= 116502050;
                                        var58 ^= -692409812;
                                        break label120;
                                    }

                                    switch (var58) {
                                        case -1681204914:
                                            var58 ^= 1899482548;
                                            break;
                                        case -1324003139:
                                            var58 ^= -164290844;
                                            var58 -= -182281147;
                                            var58 ^= 539947487;
                                            break;
                                        case 2014209072:
                                        default:
                                            var58 ^= 1492377058;
                                    }
                                }
                            } else {
                                var58 |= 398352617;
                                var58 ^= 241968928;
                            }
                        }
                    }
                }

                var4 = var58 + 1;
                var4 = var58 * var4;
                var58 = var4 & 1;
                if (var58 == 0) {
                    RuntimeException var75 = new RuntimeException();
                    throw var75;
                }
                break label113;
            }

            Integer var78 = var58;
            if (var78 != null) {
                this.QJ = var99;
                return;
            }
        }

        IllegalStateException var74 = new IllegalStateException();
        throw var74;
    }

    private void sp(String var1, int var2) {
        Zx var97 = null;
        com.google.gson.JsonObject var98 = null;
        label89: {
            int var74;
            byte[] var100;
            label88: {
                Exception var3;
                int var7;
                label96: {
                    try {
                        Object var5 = null;
                        var74 = var2 & 2145304222;
                        var74 <<= 13;
                        var74 ^= -1130701691;
                    } catch (Exception var16) {
                        var3 = var16;
                        int var4 = t;
                        int var30 = var4 ^ -1182501483;
                        var7 = (var16 instanceof ms) ? 1 : 0;
                        int var31 = var30 * -1735840265;
                        var74 = var31 ^ -1122232224;
                        long var8 = var74;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var153;
                        int var122 = (var153 = var8 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
                        if (var122 != 0) {
                            break label89;
                        }
                        break label96;
                    }

                    int var6 = var74 + 1;
                    int var93 = var74 * var6;
                    var7 = var74 + 2;
                    int var94 = var93 * var7;
                    var7 = var74 + 3;
                    int var95 = var94 * var7;
                    int var96 = var95 & 7;
                    if (var96 != 0) {
                        break label89;
                    }

                    try {
                        var97 = this.Sq;
                    } catch (Exception var15) {
                        var3 = var15;
                        int var36 = t;
                        int var37 = var36 ^ -1182501483;
                        var7 = (var15 instanceof ms) ? 1 : 0;
                        int var38 = var37 * -1735840265;
                        var74 = var38 ^ -1122232224;
                        long var123 = var74;
                        long var146 = var123 + 1L;
                        var146 = var123 * var146;
                        var123 = var146 & 1L;
                        long var154;
                        int var125 = (var154 = var123 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                        if (var125 != 0) {
                            break label89;
                        }
                        break label96;
                    }
                    var74 = switch (var74) {
                        case -322315131 -> {
                            var74 -= -984863478;
                            var74 &= 832260164;
                            var74 ^= -2062123701;
                            yield var74 ^ 1742634331;
                        }
                        default -> var74 ^ -1983611794;
                        case 762869679 -> var74 ^ 1439393811;
                    };
                    long var103 = var74;
                    long var9 = var103 + 1L;
                    var9 = var103 * var9;
                    long var11 = var103 + 2L;
                    var9 *= var11;
                    long var104 = var103 + 3L;
                    var9 *= var104;
                    long var105 = var9 & 7L;
                    long var155;
                    var7 = (var155 = var105 - 0L) == 0L ? 0 : (var155 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        break label89;
                    }

                    try {
                        var98 = var97.WA(false);
                        var74 ^= 807762678;
                        var74 *= 884116581;
                        var74 <<= 26;
                        var74 ^= -1053696386;
                    } catch (Exception var14) {
                        var3 = var14;
                        int var43 = t;
                        int var44 = var43 ^ -1182501483;
                        var7 = (var14 instanceof ms) ? 1 : 0;
                        int var45 = var44 * -1735840265;
                        var74 = var45 ^ -1122232224;
                        long var126 = var74;
                        long var148 = var126 + 1L;
                        var148 = var126 * var148;
                        var126 = var148 & 1L;
                        long var156;
                        int var128 = (var156 = var126 - 0L) == 0L ? 0 : (var156 < 0L ? -1 : 1);
                        if (var128 != 0) {
                            break label89;
                        }
                        break label96;
                    }

                    var7 = var74 + 1;
                    var7 = var74 * var7;
                    int var129 = var74 + 2;
                    var7 *= var129;
                    var129 = var74 + 3;
                    var7 *= var129;
                    var7 &= 7;
                    if (var7 != 0) {
                        break label89;
                    }

                    try {
                        var100 = Ke.y(var98);
                        var74 += -640361153;
                        var74 += -648510970;
                        var74 <<= 16;
                        var74 &= -907052766;
                        var74 ^= 1215203519;
                        
                        var74 >>>= 13;
                        var74 |= 1196433629;
                        var74 >>= 27;
                        var74 &= 1194833030;
                        var74 ^= -503833693;
                        break label88;
                    } catch (Exception var13) {
                        var3 = var13;
                        int var50 = t;
                        int var51 = var50 ^ -1182501483;
                        var7 = (var13 instanceof ms) ? 1 : 0;
                        int var52 = var51 * -1735840265;
                        var74 = var52 ^ -1122232224;
                        long var131 = var74;
                        long var150 = var131 + 1L;
                        var150 = var131 * var150;
                        long var132 = var150 & 1L;
                        long var157;
                        var129 = (var157 = var132 - 0L) == 0L ? 0 : (var157 < 0L ? -1 : 1);
                        if (var129 != 0) {
                            break label89;
                        }
                    }
                }

                if (var7 == 0) {
                    long var112 = switch (var74) {
                        case -622407813 -> {
                            var74 -= -772643761;
                            yield var74 ^ -364413696;
                        }
                        default -> var74 ^ -786214538;
                        case 834940654 -> var74 ^ 1906389891;
                    };
                    long var137 = var112 + 1L;
                    var137 = var112 * var137;
                    long var113 = var137 & 1L;
                    long var158;
                    var7 = (var158 = var113 - 0L) == 0L ? 0 : (var158 < 0L ? -1 : 1);
                    if (var7 == 0) {
                        throw UncheckedExceptions.rethrow(var3);
                    }
                } else {
                    var74 |= 1700704412;
                    var74 <<= 30;
                    var74 ^= -84880301;
                    ms var85 = (ms)var3;
                    var74 >>= 15;
                    var74 ^= -701362741;
                    var74 -= 695580771;
                    var74 += -1060178205;
                    var74 ^= 1064253859;
                    var74 |= -1763156438;
                    var74 ^= 141483588;
                    long var115 = var74;
                    long var139 = var115 + 1L;
                    var139 = var115 * var139;
                    long var152 = var115 + 2L;
                    var139 *= var152;
                    long var116 = var115 + 3L;
                    var139 *= var116;
                    long var117 = var139 & 7L;
                    long var159;
                    int var86 = (var159 = var117 - 0L) == 0L ? 0 : (var159 < 0L ? -1 : 1);
                    if (var86 == 0) {
                        int var87 = var74 + -1171510646;
                        int var88 = var87 - -63879994;
                        int var89 = var88 & 495312111;
                        int var90 = var89 & 92813874;
                        int var91 = var90 ^ 2039664636;
                        this.Z(var85, var91);
                        return;
                    }
                }
                break label89;
            }

            long var118 = var74;
            long var143 = var118 + 1L;
            var143 = var118 * var143;
            var118 = var143 & 1L;
            long var160;
            int var18 = (var160 = var118 - 0L) == 0L ? 0 : (var160 < 0L ? -1 : 1);
            if (var18 == 0) {
                var74 += 1493163265;
                var74 |= 210419648;
                var74 ^= -628502087;
                var74 ^= -313983347;
                var18 = var74 + 1;
                var18 = var74 * var18;
                var18 &= 1;
                if (var18 == 0) {
                    this.j = true;
                    BR var22 = BR.SYNCING;
                    this.QJ = var22;
                    var118 = this.HO;
                    var74 *= 1768877401;
                    var74 ^= 670810018;
                    var74 >>= 11;
                    var74 ^= -1710189198;
                    var18 = var74 + 1;
                    var18 = var74 * var18;
                    int var92 = var74 + 2;
                    var18 *= var92;
                    var74 += 3;
                    var18 *= var74;
                    var18 &= 7;
                    if (var18 == 0) {
                        Executor var28 = this.ek;
                        final long syncVersion = var118;
                        final byte[] configBytes = var100;
                        Runnable var84 = () -> {
                    Executor var103x;
                    Ni var86x;
                    nL var87x;
                    nL var88x;
                            label119: {
                                int var75x;
                                label120: {
                                    Exception var5x;
                                    boolean var8x;
                                    label116: {
                                        try {
                                            var75x = t;
                                            var75x ^= -1995996411;
                                            Object var7x = null;
                                        } catch (Exception var20x) {
                                            var5x = var20x;
                                            int var6x = t;
                                            int var24x = var6x ^ 2018204790;
                                            var8x = var20x instanceof ms;
                                            int var25x = var24x & -1686607372;
                                            var75x = var25x ^ -1464384426;
                                            Integer var9x = var75x;
                                            if (var9x == null) {
                                                break label119;
                                            }
                                            break label116;
                                        }
                                        var75x = switch (var75x) {
                                            case -2127578452 -> var75x ^ 540024802;
                                            default -> var75x ^ -609720288;
                                            case 1781239917 -> {
                                                var75x |= 1933899678;
                                                yield var75x ^ 764673856;
                                            }
                                        };
                                        Integer var85x = var75x;
                                        if (var85x == null) {
                                            break label119;
                                        }

                                        try {
                                            var86x = this.ft;
                                        } catch (Exception var19x) {
                                            var5x = var19x;
                                            int var31x = t;
                                            int var32x = var31x ^ 2018204790;
                                            var8x = var19x instanceof ms;
                                            int var33x = var32x & -1686607372;
                                            var75x = var33x ^ -1464384426;
                                            Integer var90x = var75x;
                                            if (var90x == null) {
                                                break label119;
                                            }
                                            break label116;
                                        }
                                        var75x = switch (var75x) {
                                            default -> var75x ^ -320777784;
                                            case 20232862 -> var75x ^ 1325769765;
                                            case 1459357887 -> {
                                                var75x &= 1099222118;
                                                var75x *= -982851083;
                                                var75x <<= 3;
                                                yield var75x ^ -1923126141;
                                            }
                                        };
                                        int var91x = var75x + 1;
                                        var91x = var75x * var91x;
                                        int var10x = var75x + 2;
                                        var91x *= var10x;
                                        var10x = var75x + 3;
                                        var91x *= var10x;
                                        var91x &= 7;
                                        if (var91x != 0) {
                                            break label119;
                                        }

                                        try {
                                            var87x = var86x.z(syncVersion, 6, configBytes);
                                            var75x ^= 1543907124;
                                            var75x ^= 725122713;
                                        } catch (Exception var18x) {
                                            var5x = var18x;
                                            int var38x = t;
                                            int var39x = var38x ^ 2018204790;
                                            var8x = var18x instanceof ms;
                                            int var40x = var39x & -1686607372;
                                            var75x = var40x ^ -1464384426;
                                            Integer var96x = var75x;
                                            if (var96x == null) {
                                                break label119;
                                            }
                                            break label116;
                                        }

                                        var91x = var75x + 1;
                                        var91x = var75x * var91x;
                                        var10x = var75x + 2;
                                        var91x *= var10x;
                                        var10x = var75x + 3;
                                        var91x *= var10x;
                                        var91x &= 7;
                                        if (var91x != 0) {
                                            break label119;
                                        }

                                        try {
                                            var88x = var87x;
                                            var75x -= 1613962333;
                                            var75x += 644435901;
                                            var75x ^= -399374800;
                                            var103x = this.rH;
                                            var75x |= -1481435595;
                                            var75x ^= 891039431;
                                        } catch (Exception var17) {
                                            var5x = var17;
                                            int var43x = t;
                                            int var44x = var43x ^ 2018204790;
                                            var8x = var17 instanceof ms;
                                            int var45x = var44x & -1686607372;
                                            var75x = var45x ^ -1464384426;
                                            Integer var102x = var75x;
                                            if (var102x == null) {
                                                break label119;
                                            }
                                            break label116;
                                        }

                                        long var108x = var75x;
                                        long var12 = var108x + 1L;
                                        var12 = var108x * var12;
                                        long var14x = var108x + 2L;
                                        var12 *= var14x;
                                        long var109x = var108x + 3L;
                                        var12 *= var109x;
                                        long var110x = var12 & 7L;
                                        long var115x;
                                        var10x = (var115x = var110x - 0L) == 0L ? 0 : (var115x < 0L ? -1 : 1);
                                        if (var10x != 0) {
                                            break label119;
                                        }

                                        try {
                                            Runnable var89x = () -> {
                                                int var3xx = t;
                                                var3xx ^= 1847676490;
                                                int var4xx = System.identityHashCode(this);
                                                Integer var24xx = var4xx;
                                                if (var24xx != null) {
                                                    var3xx |= 1536436810;
                                                    var3xx += -2001623554;
                                                    var3xx ^= 2050269887;
                                                    int var25xx = var3xx + 1;
                                                    var25xx = var3xx * var25xx;
                                                    var25xx &= 1;
                                                    if (var25xx == 0) {
                                                        var25xx = var3xx * -662710553;
                                                        var25xx *= -181336775;
                                                        var25xx *= -1259188599;
                                                        var25xx ^= 1390660189;
                                                        this.sO(var88x, var1, var25xx);
                                                        return;
                                                    }
                                                } else {
                                                    var3xx <<= 14;
                                                    var3xx *= 1702893893;
                                                    var3xx -= -301771459;
                                                    var3xx |= 1587405648;
                                                    var3xx ^= -434112274;
                                                    long var18xx = var3xx;
                                                    long var5xx = var18xx + 1L;
                                                    var5xx = var18xx * var5xx;
                                                    long var7xx = var18xx + 2L;
                                                    var5xx *= var7xx;
                                                    long var19xx = var18xx + 3L;
                                                    var5xx *= var19xx;
                                                    long var20xx = var5xx & 7L;
                                                    long var35xx;
                                                    var3xx = (var35xx = var20xx - 0L) == 0L ? 0 : (var35xx < 0L ? -1 : 1);
                                                    if (var3xx == 0) {
                                                        IllegalStateException var23xx = new IllegalStateException();
                                                        throw var23xx;
                                                    }
                                                }

                                                IllegalArgumentException var22xx = new IllegalArgumentException();
                                                throw var22xx;
                                            };
                                            var75x |= -497249537;
                                            var75x -= -1789328507;
                                            var75x ^= 831995017;
                                            var103x.execute(var89x);
                                            var75x ^= -132306010;
                                            var75x ^= 1250681665;
                                            break label120;
                                        } catch (Exception var16x) {
                                            var5x = var16x;
                                            int var51x = t;
                                            int var52x = var51x ^ 2018204790;
                                            var8x = var16x instanceof ms;
                                            int var53 = var52x & -1686607372;
                                            var75x = var53 ^ -1464384426;
                                            Integer var104x = var75x;
                                            if (var104x == null) {
                                                break label119;
                                            }
                                        }
                                    }

                                    if (!var8x) {
                                        var75x &= -1231550289;
                                        var75x -= 30330859;
                                        var75x *= 8969407;
                                        var75x ^= -1749410170;
                                        throw UncheckedExceptions.rethrow(var5x);
                                    }
                                    var75x = switch (var75x) {
                                        case -888016767 -> var75x ^ 425824296;
                                        case 869731650 -> {
                                            var75x |= -1442833895;
                                            var75x ^= -106510271;
                                            var75x -= -941145969;
                                            var75x &= 71340965;
                                            yield var75x ^ 1847916038;
                                        }
                                        default -> var75x ^ 1870901111;
                                    };
                                    ms var83x = (ms)var5x;

                                    var75x = switch (var75x) {
                                        default -> var75x ^ 1882231199;
                                        case -8935798 -> var75x ^ -187135883;
                                        case 1847878791 -> {
                                            var75x -= -492178747;
                                            var75x -= -1600822347;
                                            yield var75x ^ 729252219;
                                        }
                                    } + 1799730619;
                                    var75x ^= 823231182;
                                    Executor var84x = this.rH;
                                    Runnable var22x = () -> {
                                        int var2x = t;
                                        var2x ^= -1511583179;
                                        int var3xx = System.identityHashCode(this);
                                        long var20xx = var3xx;
                                        long var5xx = var20xx + 1L;
                                        var5xx = var20xx * var5xx;
                                        long var21x = var5xx & 1L;
                                        long var29xx;
                                        var3xx = (var29xx = var21x - 0L) == 0L ? 0 : (var29xx < 0L ? -1 : 1);
                                        if (var3xx == 0) {
                                            var2x |= 1633411257;
                                            var2x += -1817015240;
                                            var2x ^= 535581921;
                                            var2x += 1380684321;
                                            var2x ^= 210702363;
                                            var3xx = var2x << 19;
                                            var3xx -= 2046223198;
                                            var3xx ^= 283890556;
                                            this.Z(var83x, var3xx);
                                        } else {
                                            var2x = switch (var2x) {
                                                case -2140850009 -> var2x ^ 1076120176;
                                                default -> var2x ^ -963270295;
                                                case 1187709277 -> {
                                                    var2x += 649855742;
                                                    var2x &= 1457775458;
                                                    var2x += 1781631411;
                                                    yield var2x ^ 758879424;
                                                }
                                            };
                                            var3xx = var2x + 1;
                                            var3xx = var2x * var3xx;
                                            var2x = var3xx & 1;
                                            if (var2x != 0) {
                                                RuntimeException var14xx = new RuntimeException();
                                                throw var14xx;
                                            } else {
                                                AssertionError var13x = new AssertionError();
                                                throw var13x;
                                            }
                                        }
                                    };
                                    var84x.execute(var22x);
                                    var75x |= -1934210794;
                                    var75x ^= 1640110942;
                                    var75x ^= 1393756557;
                                    return;
                                }

                                switch (var75x) {
                                    case -425262060:
                                        var75x &= -1420316081;
                                        var75x *= -1164386453;
                                        var75x &= 779844807;
                                        var75x >>>= 12;
                                        var75x ^= -1356064725;
                                        break;
                                    case -372859329:
                                        var75x ^= -68507776;
                                        break;
                                    case 1043600050:
                                    default:
                                        var75x ^= -1566873205;
                                }

                                return;
                            }

                            AssertionError var23x = new AssertionError();
                            throw var23x;
                        };
                        var28.execute(var84);
                        return;
                    }
                }
            }
        }

        AssertionError var29 = new AssertionError();
        throw var29;
    }

    private void sO(nL var1, String var2, int var3) {
        label147: {
            int var5 = System.identityHashCode(this);
            this.j = false;
            int var6 = var1.nU;
            long var7 = var5;
            long var9 = var7 + 1L;
            var9 = var7 * var9;
            long var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var184;
            int var117 = (var184 = var7 - 0L) == 0L ? 0 : (var184 < 0L ? -1 : 1);
            int var19;
            if (var117 != 0) {
                var19 = var3 | 864140092;
                var19 -= 1396507831;
                var19 ^= -2026676702;
                var19 ^= -1184578314;
            } else {
                var19 = var3 << 29;
                var19 |= 1883944076;
                var19 <<= 9;
                var19 ^= -983728504;
                var7 = var19;
                var9 = var7 + 1L;
                var9 = var7 * var9;
                var7 = var9 & 1L;
                long var185;
                int var120 = (var185 = var7 - 0L) == 0L ? 0 : (var185 < 0L ? -1 : 1);
                if (var120 != 0) {
                    break label147;
                }

                if (var6 == 0) {
                    var19 = switch (var19) {
                        case -2070140254 -> var19 ^ 1367469844;
                        default -> var19 ^ -1815113410;
                        case 1345611400 -> {
                            var19 &= -1695335177;
                            yield var19 ^ -1490203654;
                        }
                    };
                    long var98 = var1.Kx;
                    this.HO = var98;
                    this.q = var2;
                    LongSupplier var99 = this.ColorSetting;
                    var7 = var5;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var186;
                    int var128 = (var186 = var7 - 0L) == 0L ? 0 : (var186 < 0L ? -1 : 1);
                    label128:
                    if (var128 == 0) {
                        var19 &= 388113620;
                        var19 ^= -1872980665;
                        var19 >>>= 14;
                        var19 ^= -41391251;
                        var7 = var19;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var187;
                        int var132 = (var187 = var7 - 0L) == 0L ? 0 : (var187 < 0L ? -1 : 1);
                        if (var132 != 0) {
                            break label147;
                        }

                        long var100 = var99.getAsLong();
                        this.p = var100;
                        var6 = var19 ^ 154061804;
                        var6 ^= -2005417349;
                        this.G(var6);
                        var6 = var19 * 1153929149;
                        var6 += -1624309532;
                        var6 |= 1685440041;
                        var6 -= -1943955235;
                        var6 ^= -2074773785;
                        String var108 = this.mZ(var6);
                        String var133 = this.q;
                        int var109 = (var108.equals(var133)) ? 1 : 0;
                        BR var114;
                        if (var109 != 0) {
                            var19 = switch (var19) {
                                case -41257441 -> {
                                    var19 -= -208809781;
                                    var19 <<= 17;
                                    yield var19 ^ -993462145;
                                }
                                default -> var19 ^ -155925361;
                                case 255450389 -> var19 ^ -1976860123;
                            };
                            var109 = var19 + 1;
                            var109 = var19 * var109;
                            var109 &= 1;
                            if (var109 != 0) {
                                break label147;
                            }

                            BR var113 = BR.SYNCED;
                            Integer var134 = var5;
                            if (var134 == null) {
                                var19 -= -164096506;
                                var19 -= 1128838050;
                                var19 <<= 2;
                                var19 &= 402324781;
                                var19 ^= -2057856867;
                                break label128;
                            }

                            var19 ^= 1945480497;
                            var19 += -789028282;
                            var19 ^= -324089318;
                            Integer var135 = var19;
                            if (var135 == null) {
                                break label147;
                            }

                            var114 = var113;
                            switch (var19) {
                                case -820949891:
                                    var19 ^= 316336162;
                                    break;
                                case 572751246:
                                    var19 &= -1552882528;
                                    var19 += 1047062799;
                                    var19 &= -789569817;
                                    var19 -= 1557868052;
                                    var19 ^= 1202870731;
                                    break;
                                case 1897396917:
                                default:
                                    var19 ^= -150246089;
                            }
                        } else {
                            var19 = switch (var19) {
                                default -> var19 ^ 299793289;
                                case -41257441 -> {
                                    var19 *= -1379976055;
                                    var19 *= 1563601111;
                                    var19 *= 1171211567;
                                    var19 >>>= 8;
                                    yield var19 ^ 394427131;
                                }
                                case 990735891 -> var19 ^ -497797863;
                            };
                            var7 = var19;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var188;
                            int var139 = (var188 = var7 - 0L) == 0L ? 0 : (var188 < 0L ? -1 : 1);
                            if (var139 != 0) {
                                break label147;
                            }

                            BR var140 = BR.PENDING;
                            int var150 = var5 + 1;
                            var150 = var5 * var150;
                            int var172 = var5 + 2;
                            var150 *= var172;
                            int var173 = var5 + 3;
                            var150 *= var173;
                            var150 &= 7;
                            if (var150 != 0) {
                                switch (var19) {
                                    case -1071368307:
                                        var19 ^= 306070490;
                                        break label128;
                                    case -1020277513:
                                    default:
                                        var19 ^= 1479860359;
                                        break label128;
                                    case 394576980:
                                        var19 &= 1414253200;
                                        var19 ^= -2099781247;
                                        break label128;
                                }
                            }

                            var19 += 1201510132;
                            var19 >>>= 1;
                            var19 ^= 1874213802;
                            var114 = var140;
                            var19 += -1940543363;
                            var19 |= -761457767;
                            var19 ^= 2062235683;
                        }

                        var7 = var19;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var189;
                        int var143 = (var189 = var7 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                        if (var143 != 0) {
                            break label147;
                        }

                        this.QJ = var114;
                        var19 += -1346892088;
                        var19 ^= -1242101785;
                        return;
                    } else {
                        switch (var19) {
                            case -1222807686:
                                var19 += -2054437784;
                                var19 ^= -1319413185;
                                var19 ^= 149260102;
                                var19 ^= 331403018;
                                break;
                            case 111768554:
                            default:
                                var19 ^= 64006375;
                                break;
                            case 1641576974:
                                var19 ^= -1102886143;
                        }
                    }
                } else {
                    var19 = switch (var19) {
                        default -> var19 ^ -948127268;
                        case 320906489 -> var19 ^ 2114624491;
                        case 1345611400 -> {
                            var19 *= -1242014037;
                            yield var19 ^ -100348775;
                        }
                    };
                    var6 = var1.nU;
                    Integer var121 = var5;
                    if (var121 == null) {
                        var19 -= -518480727;
                        var19 ^= 1134371337;
                    } else {
                        var19 -= 1998656020;
                        var19 ^= -1727656242;
                        Integer var122 = var19;
                        if (var122 == null) {
                            break label147;
                        }

                        if (var6 == 2) {
                            var19 <<= 30;
                            var19 |= -881473119;
                            var19 -= 1416558764;
                            var19 |= -702390525;
                            var19 ^= -703724965;
                            var6 = var19 & -1523878984;
                            var6 *= 1307119571;
                            var6 ^= -1956657260;
                            this.z(var1, var6);
                            var19 &= 1839465476;
                            var19 ^= -954624669;
                            return;
                        }

                        var19 += -513291359;
                        var19 -= -1981816248;
                        var19 += -112646620;
                        var19 <<= 29;
                        var19 ^= -776828305;
                        long var90 = var19;
                        long var8 = var90 + 1L;
                        var8 = var90 * var8;
                        long var10 = var90 + 2L;
                        var8 *= var10;
                        long var91 = var90 + 3L;
                        var8 *= var91;
                        long var92 = var8 & 7L;
                        long var190;
                        var6 = (var190 = var92 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label147;
                        }

                        ms var94 = new ms("Serwer nie przyjął configu.", false);
                        int var123 = var5 + 1;
                        int var124 = var5 * var123;
                        var5 = var124 & 1;
                        if (var5 == 0) {
                            var19 -= 396548520;
                            var19 -= -1044144024;
                            var19 |= 1551140724;
                            var19 &= 455311045;
                            var19 ^= -1423313869;
                            var5 = var19 | -548183096;
                            var5 ^= -2100745184;
                            this.Z(var94, var5);
                            var19 *= 64232501;
                            var19 ^= -139371767;
                            return;
                        }

                        var19 &= -1291521214;
                        var19 += -790416628;
                        var19 ^= -147548961;
                    }
                }
            }

            var7 = var19;
            var9 = var7 + 1L;
            var9 = var7 * var9;
            var11 = var7 + 2L;
            var9 *= var11;
            var7 += 3L;
            var9 *= var7;
            var7 = var9 & 7L;
            long var191;
            var5 = (var191 = var7 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
            if (var5 == 0) {
                RuntimeException var88 = new RuntimeException();
                throw var88;
            }
        }

        RuntimeException var83 = new RuntimeException();
        throw var83;
    }

    private void z(nL var1, int var2) {
        byte[] var114 = null;
        label97: {
            Exception var3;
            int var34;
            label94: {
                JsonObject var116;
                label104: {
                    label99: {
                        try {
                            Object var5 = null;
                            var34 = var2 * 1469903221;
                            var34 ^= 919954464;
                        } catch (Exception var15) {
                            var3 = var15;
                            var34 = t;
                            var34 ^= 1446864021;
                            boolean var7 = var15 instanceof ms;
                            var34 *= -1030527299;
                            var34 <<= 28;
                            var34 >>= 31;
                            var34 ^= -2042404855;
                            if (!var7) {
                                break label94;
                            }
                            break label99;
                        }

                        Integer var6 = var34;
                        if (var6 == null) {
                            break label97;
                        }

                        try {
                            var114 = var1.E;
                            var34 ^= -785098929;
                            var34 ^= 2142375602;
                            var34 |= -89327673;
                            var34 ^= -1524578639;
                        } catch (Exception var14) {
                            var3 = var14;
                            var34 = t;
                            var34 ^= 1446864021;
                            boolean var122 = var14 instanceof ms;
                            var34 *= -1030527299;
                            var34 <<= 28;
                            var34 >>= 31;
                            var34 ^= -2042404855;
                            if (!var122) {
                                break label94;
                            }
                            break label99;
                        }

                        long var123 = var34;
                        long var9 = var123 + 1L;
                        var9 = var123 * var9;
                        var123 = var9 & 1L;
                        long var146;
                        int var125 = (var146 = var123 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                        if (var125 != 0) {
                            break label97;
                        }

                        try {
                            var116 = Ke.zS(var114);
                            var34 += 876186517;
                            var34 |= 1320773702;
                            var34 >>>= 25;
                            var34 ^= -1274602265;
                            var116 = var116;
                            var34 &= 356262397;
                            var34 ^= -805406182;
                            break label104;
                        } catch (Exception var13) {
                            var3 = var13;
                            var34 = t;
                            var34 ^= 1446864021;
                            boolean var126 = var13 instanceof ms;
                            var34 *= -1030527299;
                            var34 <<= 28;
                            var34 >>= 31;
                            var34 ^= -2042404855;
                            if (!var126) {
                                break label94;
                            }
                        }
                    }
                    var34 = switch (var34) {
                        default -> var34 ^ 1982720417;
                        case 2042404854 -> {
                            var34 ^= 516343960;
                            yield var34 ^ 1125441459;
                        }
                        case 2078657347 -> var34 ^ 876292627;
                    };
                    long var127 = var34;
                    long var138 = var127 + 1L;
                    var138 = var127 * var138;
                    var127 = var138 & 1L;
                    long var147;
                    int var129 = (var147 = var127 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                    if (var129 == 0) {
                        ms var94 = (ms)var3;
                        var34 |= 1955453534;
                        var34 |= 214860649;
                        var34 *= -600628179;
                        var34 += -1967114783;
                        var34 ^= 449849983;
                        var127 = var34;
                        var138 = var127 + 1L;
                        var138 = var127 * var138;
                        long var11 = var127 + 2L;
                        var138 *= var11;
                        var127 += 3L;
                        var138 *= var127;
                        var127 = var138 & 7L;
                        long var148;
                        int var16 = (var148 = var127 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                        if (var16 == 0) {
                            var34 *= 810364759;
                            var34 *= -1822050567;
                            var34 -= 1501930594;
                            var34 ^= 857607546;
                            int var95 = var34 & 390447585;
                            int var96 = var95 ^ 2140589855;
                            this.Z(var94, var96);
                            return;
                        }
                    }
                    break label97;
                }

                Integer var18 = var34;
                if (var18 != null) {
                    var34 = switch (var34) {
                        case -604341614 -> {
                            var34 |= -1926675161;
                            var34 -= -271635458;
                            yield var34 ^ 228093278;
                        }
                        case 95050332 -> var34 ^ 379053527;
                        default -> var34 ^ 1004046033;
                    };
                    long var133 = var34;
                    long var144 = var133 + 1L;
                    var144 = var133 * var144;
                    var133 = var144 & 1L;
                    long var149;
                    int var19 = (var149 = var133 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                    if (var19 == 0) {
                        int var20 = var34 & -1203197130;
                        int var21 = var20 & -300515290;
                        int var22 = var21 | -1141529846;
                        int var23 = var22 ^ 2087633788;
                        this.A(var23);
                        Zx var24 = this.Sq;
                        List var25 = var24.Vx(var116, false);
                        var34 &= -1129038277;
                        var34 *= 490472799;
                        var34 |= -861249782;
                        var34 -= 647839717;
                        var34 ^= 1117820823;
                        long var97 = var1.Kx;
                        this.HO = var97;
                        int var98 = var34 << 5;
                        int var99 = var98 ^ -894943793;
                        int var100 = var99 >> 23;
                        int var101 = var100 * -1320349609;
                        int var102 = var101 ^ 125961306;
                        String var103 = this.mZ(var102);
                        this.q = var103;
                        LongSupplier var104 = this.ColorSetting;
                        var97 = var104.getAsLong();
                        this.p = var97;
                        int var106 = var34 | -72299671;
                        int var107 = var106 | -871755585;
                        int var108 = var107 ^ -2094423945;
                        this.G(var108);
                        BR var109 = BR.SYNCED;
                        this.QJ = var109;
                        boolean var110 = var25.isEmpty();
                        if (!var110) {
                            var34 += -1609790284;
                            var34 -= -1024351993;
                            var34 &= 1849029047;
                            var34 ^= 1448375331;
                            hs var111 = this.be;
                            var34 ^= -1973221746;
                            var34 |= -548499263;
                            var34 ^= 1883513630;
                            int var117 = var34 + 1;
                            int var118 = var34 * var117;
                            int var135 = var34 + 2;
                            int var119 = var118 * var135;
                            int var136 = var34 + 3;
                            int var120 = var119 * var136;
                            int var121 = var120 & 7;
                            if (var121 != 0) {
                                break label97;
                            }

                            var111.F(var25);
                            var34 += -1666850631;
                            var34 |= 1218641729;
                            var34 ^= -1999699852;
                        } else {
                            var34 -= 1970724312;
                            var34 *= -106191463;
                            var34 |= 795232029;
                            var34 += -1198433114;
                            var34 ^= -455459604;
                        }

                        long var26 = var34;
                        var97 = var26 + 1L;
                        var97 = var26 * var97;
                        long var27 = var97 & 1L;
                        long var150;
                        int var28 = (var150 = var27 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                        if (var28 == 0) {
                            return;
                        }
                    }
                }
                break label97;
            }

            switch (var34) {
                case -100688796:
                default:
                    var34 ^= -1565096421;
                    break;
                case 124542654:
                    var34 ^= 2032639059;
                    break;
                case 2042404854:
                    var34 -= 1745045627;
                    var34 ^= 1301687514;
            }

            throw UncheckedExceptions.rethrow(var3);
        }

        RuntimeException var29 = new RuntimeException();
        throw var29;
    }

    private void Z(ms var1, int var2) {
        label79: {
            int var4 = System.identityHashCode(this);
            this.j = false;
            String var5 = var1.getMessage();
            this.s = var5;
            LongSupplier var60 = this.ColorSetting;
            int var6 = var4 + 1;
            var6 = var4 * var6;
            int var7 = var4 + 2;
            var6 *= var7;
            var7 = var4 + 3;
            var6 *= var7;
            var6 &= 7;
            int var30;
            if (var6 != 0) {
                var30 = var2 << 29;
                var30 ^= 696208918;
            } else {
                label86: {
                    var30 = switch (var2) {
                        case -750979637 -> var2 ^ 1126642682;
                        default -> var2 ^ -590198923;
                        case 2106773470 -> {
                            var30 = var2 | -206128042;
                            var30 |= -1137695267;
                            var30 |= -376455559;
                            yield var30 ^ -779517466;
                        }
                    };
                    var6 = var30 + 1;
                    var6 = var30 * var6;
                    var7 = var30 + 2;
                    var6 *= var7;
                    var7 = var30 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label79;
                    }

                    long var61 = var60.getAsLong();
                    long var62 = var61 + 30000L;
                    this.nJ = var62;
                    boolean var63 = var1.offline();
                    if (var63) {
                        var30 = switch (var30) {
                            case -129158048 -> var30 ^ 920373435;
                            case 775323161 -> {
                                var30 -= -235459663;
                                var30 |= 235145985;
                                var30 += -234289191;
                                var30 ^= -1561987304;
                                yield var30 ^ -631729177;
                            }
                            default -> var30 ^ 1812996338;
                        };
                        BR var64 = BR.OFFLINE;
                        this.QJ = var64;
                        boolean var65 = this.ml;
                        var6 = var4 + 1;
                        var6 = var4 * var6;
                        var7 = var4 + 2;
                        var6 *= var7;
                        var7 = var4 + 3;
                        var6 *= var7;
                        var6 &= 7;
                        if (var6 != 0) {
                            var30 >>>= 5;
                            var30 &= -249700268;
                            var30 ^= -377819646;
                            break label86;
                        }

                        var30 >>>= 5;
                        var30 -= 184190428;
                        var30 >>= 31;
                        var30 ^= -1564233407;
                        var30 ^= 109596910;
                        Integer var84 = var30;
                        if (var84 == null) {
                            break label79;
                        }

                        this.ta = var65;
                        switch (var30) {
                            case -678095484:
                            default:
                                var30 ^= -1957179299;
                                break;
                            case -254956854:
                                var30 ^= -598674040;
                                break;
                            case 1538530896:
                                var30 &= 1925871109;
                                var30 ^= 1613990628;
                                var30 ^= 684548808;
                        }
                    } else {
                        var30 = switch (var30) {
                            default -> var30 ^ -1471522838;
                            case -363121639 -> var30 ^ -1025750511;
                            case 775323161 -> {
                                var30 ^= -1301188839;
                                var30 |= 141312551;
                                var30 |= 425817402;
                                var30 *= -1177556369;
                                yield var30 ^ -664856832;
                            }
                        };
                        BR var66 = BR.FAILED;
                        long var85 = var4;
                        long var8 = var85 + 1L;
                        var8 = var85 * var8;
                        long var10 = var85 + 2L;
                        var8 *= var10;
                        long var86 = var85 + 3L;
                        var8 *= var86;
                        long var87 = var8 & 7L;
                        long var106;
                        var4 = (var106 = var87 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            var30 += 196145899;
                            var30 ^= 632561194;
                            break label86;
                        }

                        var30 *= 2100648189;
                        var30 -= -1926105503;
                        var30 ^= -1714748414;
                        var30 &= -1252042743;
                        var30 ^= -1546879968;
                        long var88 = var30;
                        var8 = var88 + 1L;
                        var8 = var88 * var8;
                        var10 = var88 + 2L;
                        var8 *= var10;
                        long var89 = var88 + 3L;
                        var8 *= var89;
                        long var90 = var8 & 7L;
                        long var107;
                        var4 = (var107 = var90 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label79;
                        }

                        this.QJ = var66;
                        hs var53 = this.be;
                        var5 = var1.getMessage();
                        var53.o(var5);
                        var30 ^= -900054988;
                        var30 ^= 1543897540;
                        var30 *= -1482879057;
                        var30 *= 1754743081;
                        var30 ^= -1487943996;
                    }

                    long var45 = var30;
                    long var68 = var45 + 1L;
                    long var69 = var45 * var68;
                    long var46 = var69 & 1L;
                    long var108;
                    var30 = (var108 = var46 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                    if (var30 == 0) {
                        return;
                    }
                    break label79;
                }
            }

            var4 = var30 + 1;
            var4 = var30 * var4;
            var6 = var30 + 2;
            var4 *= var6;
            var6 = var30 + 3;
            var4 *= var6;
            var4 &= 7;
            if (var4 == 0) {
                AssertionError var59 = new AssertionError();
                throw var59;
            }
        }

        IllegalStateException var50 = new IllegalStateException();
        throw var50;
    }

    public CompletableFuture mj() {
        Zx var119 = null;
        com.google.gson.JsonObject var120 = null;
        boolean var127 = false;
        int var2 = t;
        var2 ^= 1644559179;
        Object var3 = null;
        var2 -= 1942849167;
        var2 |= -799699838;
        var2 ^= 507598842;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var196;
        int var115 = (var196 = var4 - 0L) == 0L ? 0 : (var196 < 0L ? -1 : 1);
        label123:
        if (var115 == 0) {
            CompletableFuture var116 = new CompletableFuture();
            var2 |= 487528763;
            var2 ^= -1759075661;

            byte[] var122;
            label126: {
                Exception var1;
                label136: {
                    try {
                        var2 &= -215267750;
                        var2 += 204981220;
                        var2 >>>= 15;
                        var2 -= 816090291;
                        var2 ^= 366802326;
                    } catch (Exception var17) {
                        var1 = var17;
                        int var39 = t;
                        int var40 = var39 ^ 594683487;
                        var127 = var17 instanceof ms;
                        int var41 = var40 - -1258185783;
                        int var42 = var41 | 2096289623;
                        var2 = var42 ^ 1572683373;
                        long var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        long var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var197;
                        int var143 = (var197 = var7 - 0L) == 0L ? 0 : (var197 < 0L ? -1 : 1);
                        if (var143 != 0) {
                            break label123;
                        }
                        break label136;
                    }

                    int var5 = var2 + 1;
                    int var117 = var2 * var5;
                    int var118 = var117 & 1;
                    if (var118 != 0) {
                        break label123;
                    }

                    try {
                        var119 = this.Sq;
                    } catch (Exception var16) {
                        var1 = var16;
                        int var49 = t;
                        int var50 = var49 ^ 594683487;
                        var127 = var16 instanceof ms;
                        int var51 = var50 - -1258185783;
                        int var52 = var51 | 2096289623;
                        var2 = var52 ^ 1572683373;
                        long var144 = var2;
                        long var174 = var144 + 1L;
                        var174 = var144 * var174;
                        long var192 = var144 + 2L;
                        var174 *= var192;
                        var144 += 3L;
                        var174 *= var144;
                        var144 = var174 & 7L;
                        long var198;
                        int var147 = (var198 = var144 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
                        if (var147 != 0) {
                            break label123;
                        }
                        break label136;
                    }
                    var2 = switch (var2) {
                        default -> var2 ^ -82513500;
                        case -629081704 -> {
                            var2 |= -123548001;
                            var2 &= 508367737;
                            var2 &= 1426203801;
                            var2 |= -2092149802;
                            yield var2 ^ 1606870600;
                        }
                        case 1500089902 -> var2 ^ 1714312168;
                    };
                    int var128 = var2 + 1;
                    int var129 = var2 * var128;
                    int var130 = var129 & 1;
                    if (var130 != 0) {
                        break label123;
                    }

                    try {
                        var120 = var119.WA(true);
                    } catch (Exception var15) {
                        var1 = var15;
                        int var58 = t;
                        int var59 = var58 ^ 594683487;
                        var127 = var15 instanceof ms;
                        int var60 = var59 - -1258185783;
                        int var61 = var60 | 2096289623;
                        var2 = var61 ^ 1572683373;
                        long var148 = var2;
                        long var178 = var148 + 1L;
                        var178 = var148 * var178;
                        long var193 = var148 + 2L;
                        var178 *= var193;
                        var148 += 3L;
                        var178 *= var148;
                        var148 = var178 & 7L;
                        long var199;
                        int var151 = (var199 = var148 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                        if (var151 != 0) {
                            break label123;
                        }
                        break label136;
                    }
                    var2 = switch (var2) {
                        case -863324777 -> {
                            var2 |= -278003280;
                            var2 -= -1845782017;
                            var2 |= 816386580;
                            yield var2 ^ 211650563;
                        }
                        case 409092650 -> var2 ^ 327407662;
                        default -> var2 ^ 2128660886;
                    };

                    try {
                        var122 = Ke.y(var120);
                    } catch (Exception var14) {
                        var1 = var14;
                        int var66 = t;
                        int var67 = var66 ^ 594683487;
                        var127 = var14 instanceof ms;
                        int var68 = var67 - -1258185783;
                        int var69 = var68 | 2096289623;
                        var2 = var69 ^ 1572683373;
                        long var152 = var2;
                        long var182 = var152 + 1L;
                        var182 = var152 * var182;
                        long var194 = var152 + 2L;
                        var182 *= var194;
                        var152 += 3L;
                        var182 *= var152;
                        var152 = var182 & 7L;
                        long var200;
                        int var155 = (var200 = var152 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                        if (var155 != 0) {
                            break label123;
                        }
                        break label136;
                    }
                    var2 = switch (var2) {
                        case -1190484394 -> var2 ^ 1582964271;
                        default -> var2 ^ -1993089206;
                        case 1902547903 -> {
                            var2 |= 777376998;
                            var2 ^= 2118985841;
                            yield var2 ^ -676170009;
                        }
                    };
                    int var131 = var2 + 1;
                    int var132 = var2 * var131;
                    int var133 = var132 & 1;
                    if (var133 != 0) {
                        break label123;
                    }

                    try {
                        
                        var2 -= 657177569;
                        var2 += -385597293;
                        var2 &= 1210241828;
                        var2 ^= -1363687762;
                        break label126;
                    } catch (Exception var13) {
                        var1 = var13;
                        int var73 = t;
                        int var74 = var73 ^ 594683487;
                        var127 = var13 instanceof ms;
                        int var75 = var74 - -1258185783;
                        int var76 = var75 | 2096289623;
                        var2 = var76 ^ 1572683373;
                        long var156 = var2;
                        long var186 = var156 + 1L;
                        var186 = var156 * var186;
                        long var195 = var156 + 2L;
                        var186 *= var195;
                        var156 += 3L;
                        var186 *= var156;
                        var156 = var186 & 7L;
                        long var201;
                        int var159 = (var201 = var156 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                        if (var159 != 0) {
                            break label123;
                        }
                    }
                }

                if (!var127) {
                    switch (var2) {
                        case 554599714:
                        default:
                            var2 ^= -184511430;
                            break;
                        case 574873874:
                            var2 >>= 18;
                            var2 &= -2048173976;
                            var2 |= -47960777;
                            var2 *= -365440401;
                            var2 ^= -1577599298;
                            break;
                        case 629771958:
                            var2 ^= 2017015781;
                    }

                    throw UncheckedExceptions.rethrow(var1);
                }

                var2 &= 1998910252;
                var2 ^= -853330906;
                var6 = var2;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                long var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var202;
                int var137 = (var202 = var6 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                if (var137 == 0) {
                    var3 = (ms)var1;
                    var2 *= 1312912205;
                    var2 *= 1843218887;
                    var2 ^= -1899767526;
                    var2 *= 562198591;
                    var2 ^= 930206918;
                    int var18 = var2 + 1;
                    int var19 = var2 * var18;
                    int var20 = var19 & 1;
                    if (var20 == 0) {
                        var2 *= 468717419;
                        var2 |= -1650878731;
                        var2 += 421253577;
                        var2 <<= 10;
                        var2 ^= -239583381;
                        var6 = var2;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var203;
                        int var110 = (var203 = var6 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                        if (var110 == 0) {
                            boolean var22 = var116.completeExceptionally((Throwable)var3);
                            return var116;
                        }
                    }
                }
                break label123;
            }

            int var23 = var2 + 1;
            var23 = var2 * var23;
            int var111 = var2 + 2;
            var23 *= var111;
            int var112 = var2 + 3;
            var23 *= var112;
            var23 &= 7;
            if (var23 == 0) {
                var2 = switch (var2) {
                    case -1500003154 -> {
                        var2 *= -302736471;
                        var2 ^= 474499675;
                        var2 ^= 1972149650;
                        var2 ^= -1820492339;
                        yield var2 ^ -1057395759;
                    }
                    default -> var2 ^ 140640480;
                    case 1856788259 -> var2 ^ 400683025;
                };
                var23 = var2 + 1;
                var23 = var2 * var23;
                var23 &= 1;
                if (var23 == 0) {
                    Executor var31 = this.ek;
                    final byte[] configBytes = var122;
                    var3 = (Runnable)() -> {
                    Executor var103x;
                    nL var93x;
                    Runnable var94x;
                        label112: {
                            int var67x;
                            label114: {
                                label119: {
                                    Exception var3x;
                                    int var6x;
                                    label109: {
                                        label108: {
                                            label107: {
                                                label116: {
                                                    try {
                                                        var67x = t;
                                                        var67x ^= 1691372491;
                                                        Object var5x = null;
                                                        var67x -= 30525481;
                                                        var67x |= -295851158;
                                                        var67x ^= 1709768770;
                                                    } catch (Exception var16x) {
                                                        var3x = var16x;
                                                        var67x = t;
                                                        var67x ^= -623555698;
                                                        var6x = (var16x instanceof ms) ? 1 : 0;
                                                        switch (var67x) {
                                                            case -1988995980:
                                                            default:
                                                                break label108;
                                                            case 972642534:
                                                                break label107;
                                                            case 1674759455:
                                                                break label116;
                                                        }
                                                    }

                                                    var6x = var67x + 1;
                                                    var6x = var67x * var6x;
                                                    var6x &= 1;
                                                    if (var6x != 0) {
                                                        break label112;
                                                    }

                                                    try {
                                                        Ni var92x = this.ft;
                                                        var67x += 607858561;
                                                        var67x -= 130539019;
                                                        var67x &= -1737840178;
                                                        var67x |= 882592497;
                                                        var67x ^= -1994869097;
                                                        var93x = var92x.vE(6, configBytes);
                                                        var67x += 934770466;
                                                        var67x ^= 1722774345;
                                                    } catch (Exception var15x) {
                                                        var3x = var15x;
                                                        var67x = t;
                                                        var67x ^= -623555698;
                                                        var6x = (var15x instanceof ms) ? 1 : 0;
                                                        switch (var67x) {
                                                            case -1988995980:
                                                            default:
                                                                break label108;
                                                            case 972642534:
                                                                break label107;
                                                            case 1674759455:
                                                                break label116;
                                                        }
                                                    }

                                                    long var7x = var67x;
                                                    long var9x = var7x + 1L;
                                                    var9x = var7x * var9x;
                                                    long var11x = var7x + 2L;
                                                    var9x *= var11x;
                                                    var7x += 3L;
                                                    var9x *= var7x;
                                                    var7x = var9x & 7L;
                                                    long var109x;
                                                    int var102x = (var109x = var7x - 0L) == 0L ? 0 : (var109x < 0L ? -1 : 1);
                                                    if (var102x != 0) {
                                                        break label112;
                                                    }

                                                    try {
                                                        var67x >>= 15;
                                                        var67x &= 250960969;
                                                        var67x ^= -863720890;
                                                        var67x *= -2010900739;
                                                        var67x ^= 1126058165;
                                                        var103x = this.rH;
                                                        var67x *= -386412207;
                                                        var67x |= -640208297;
                                                        var67x &= 1325532845;
                                                        var67x ^= -1032958864;
                                                        var94x = () -> {
                                                            int var2xx = t;
                                                            var2xx ^= 398726469;
                                                            int var3xx = System.identityHashCode(var93x);
                                                            int var4xx = var93x.nU;
                                                            Integer var5xx = var3xx;
                                                            if (var5xx == null) {
                                                                switch (var2xx) {
                                                                    case -837420279:
                                                                    default:
                                                                        var2xx ^= 2125398148;
                                                                        break;
                                                                    case -186120659:
                                                                        var2xx ^= 1430478775;
                                                                        var2xx >>= 6;
                                                                        var2xx >>>= 29;
                                                                        var2xx ^= 1708413973;
                                                                        var2xx ^= -555876896;
                                                                        break;
                                                                    case 1036812495:
                                                                        var2xx ^= -658143155;
                                                                }
                                                            } else {
                                                                label147: {
                                                                    var2xx >>= 5;
                                                                    var2xx -= 1425666194;
                                                                    var2xx ^= 1886740388;
                                                                    var2xx ^= 867523000;
                                                                    var5xx = var2xx;
                                                                    label124:
                                                                    if (var5xx != null) {
                                                                        label139: {
                                                                            if (var4xx == 0) {
                                                                                var2xx ^= -1418534265;
                                                                                var2xx ^= 401861619;
                                                                                long var93xx = var2xx;
                                                                                long var6xx = var93xx + 1L;
                                                                                var6xx = var93xx * var6xx;
                                                                                long var8xx = var93xx + 2L;
                                                                                var6xx *= var8xx;
                                                                                long var94xx = var93xx + 3L;
                                                                                var6xx *= var94xx;
                                                                                long var95xx = var6xx & 7L;
                                                                                long var142x;
                                                                                var4xx = (var142x = var95xx - 0L) == 0L ? 0 : (var142x < 0L ? -1 : 1);
                                                                                if (var4xx != 0) {
                                                                                    break label124;
                                                                                }

                                                                                String var97xx = var93x.NZ;
                                                                                long var112x = var3xx;
                                                                                long var7xx = var112x + 1L;
                                                                                var7xx = var112x * var7xx;
                                                                                long var9xx = var112x + 2L;
                                                                                var7xx *= var9xx;
                                                                                long var113x = var112x + 3L;
                                                                                var7xx *= var113x;
                                                                                long var114x = var7xx & 7L;
                                                                                long var143x;
                                                                                int var115x = (var143x = var114x - 0L) == 0L ? 0 : (var143x < 0L ? -1 : 1);
                                                                                if (var115x != 0) {
                                                                                    switch (var2xx) {
                                                                                        case 1427765975:
                                                                                        default:
                                                                                            var2xx ^= -1722115076;
                                                                                            break label147;
                                                                                        case 1441546487:
                                                                                            var2xx &= 1203040559;
                                                                                            var2xx ^= -22156843;
                                                                                            break label147;
                                                                                        case 1474453408:
                                                                                            var2xx ^= -591429717;
                                                                                            break label147;
                                                                                    }
                                                                                }

                                                                                var2xx |= 678695494;
                                                                                var2xx ^= -324313150;
                                                                                boolean var98xx = var97xx.isEmpty();
                                                                                if (!var98xx) {
                                                                                    var2xx += -790089294;
                                                                                    var2xx ^= -358538281;
                                                                                    var2xx ^= -1128554654;
                                                                                    var2xx ^= 60321585;
                                                                                    var2xx ^= 1794407295;
                                                                                    Integer var99xx = var2xx;
                                                                                    if (var99xx == null) {
                                                                                        break label124;
                                                                                    }

                                                                                    String var100xx = var93x.NZ;
                                                                                    var115x = var3xx + 1;
                                                                                    var115x = var3xx * var115x;
                                                                                    var115x &= 1;
                                                                                    if (var115x != 0) {
                                                                                        var2xx |= -198755112;
                                                                                        var2xx ^= 975535180;
                                                                                        var2xx &= -688433633;
                                                                                        var2xx &= 275346239;
                                                                                        var2xx ^= -1152783390;
                                                                                        break label147;
                                                                                    }

                                                                                    var2xx <<= 30;
                                                                                    var2xx ^= -1160207286;
                                                                                    long var119x = var2xx;
                                                                                    var7xx = var119x + 1L;
                                                                                    var7xx = var119x * var7xx;
                                                                                    long var120x = var7xx & 1L;
                                                                                    long var144x;
                                                                                    var115x = (var144x = var120x - 0L) == 0L ? 0 : (var144x < 0L ? -1 : 1);
                                                                                    if (var115x != 0) {
                                                                                        break label124;
                                                                                    }

                                                                                    var98xx = var116.complete(var100xx);
                                                                                    var2xx *= 2019956575;
                                                                                    var2xx -= -1383639316;
                                                                                    var2xx += -1235034815;
                                                                                    var2xx ^= 1869230824;
                                                                                    break label139;
                                                                                }

                                                                                var2xx *= -2139783215;
                                                                                var2xx -= 1889461462;
                                                                                var2xx *= -1354041357;
                                                                                var2xx ^= -1682662913;
                                                                            } else {
                                                                                switch (var2xx) {
                                                                                    case -2125895303:
                                                                                        var2xx ^= 900472984;
                                                                                        break;
                                                                                    case -378713725:
                                                                                        var2xx ^= -1921583202;
                                                                                        var2xx *= -9392317;
                                                                                        var2xx += -816254732;
                                                                                        var2xx <<= 4;
                                                                                        var2xx ^= 1887890706;
                                                                                        break;
                                                                                    case 699505068:
                                                                                    default:
                                                                                        var2xx ^= 1351475515;
                                                                                }
                                                                            }

                                                                            var4xx = var93x.nU;
                                                                            long var122x = var3xx;
                                                                            long var139x = var122x + 1L;
                                                                            var139x = var122x * var139x;
                                                                            long var123x = var139x & 1L;
                                                                            long var145x;
                                                                            int var124x = (var145x = var123x - 0L) == 0L ? 0 : (var145x < 0L ? -1 : 1);
                                                                            if (var124x != 0) {
                                                                                var2xx -= -1327670449;
                                                                                var2xx -= -821222739;
                                                                                var2xx ^= -541221292;
                                                                                break label147;
                                                                            }

                                                                            var2xx ^= -1204758013;
                                                                            var2xx |= 559548717;
                                                                            var2xx ^= -605789263;
                                                                            Integer var125x = var2xx;
                                                                            if (var125x == null) {
                                                                                break label124;
                                                                            }

                                                                            if (var4xx == 3) {
                                                                                var2xx >>>= 13;
                                                                                var2xx ^= -653432708;
                                                                                Integer var103xx = var2xx;
                                                                                if (var103xx == null) {
                                                                                    break label124;
                                                                                }

                                                                                ms var104xx = new ms(
                                                                                    "Masz już maksymalną liczbę udostępnionych configów.", false
                                                                                );
                                                                                var125x = var3xx;
                                                                                if (var125x == null) {
                                                                                    var2xx *= 777719081;
                                                                                    var2xx += 1242536588;
                                                                                    var2xx ^= 1560486890;
                                                                                    break label147;
                                                                                }

                                                                                var2xx += 1192004660;
                                                                                var2xx ^= -588155630;
                                                                                boolean var105xx = var116.completeExceptionally(var104xx);
                                                                                var2xx -= -279516206;
                                                                                var2xx <<= 2;
                                                                                var2xx >>>= 21;
                                                                                var2xx ^= -1810558830;
                                                                            } else {
                                                                                var2xx = switch (var2xx) {
                                                                                    case -1926620272 -> var2xx ^ -1369613199;
                                                                                    case -1508242404 -> {
                                                                                        var2xx &= 735345051;
                                                                                        var2xx |= 705139991;
                                                                                        var2xx -= -921648172;
                                                                                        yield var2xx ^ -394356660;
                                                                                    }
                                                                                    default -> var2xx ^ -2012737777;
                                                                                };
                                                                                long var106xx = var2xx;
                                                                                long var130x = var106xx + 1L;
                                                                                var130x = var106xx * var130x;
                                                                                long var141x = var106xx + 2L;
                                                                                var130x *= var141x;
                                                                                long var107xx = var106xx + 3L;
                                                                                var130x *= var107xx;
                                                                                long var108xx = var130x & 7L;
                                                                                long var146x;
                                                                                var4xx = (var146x = var108xx - 0L) == 0L ? 0 : (var146x < 0L ? -1 : 1);
                                                                                if (var4xx != 0) {
                                                                                    break label124;
                                                                                }

                                                                                ms var110xx = new ms("Serwer nie przyjął configu.", false);
                                                                                Integer var86xx = var3xx;
                                                                                if (var86xx == null) {
                                                                                    switch (var2xx) {
                                                                                        case -1988607737:
                                                                                            var2xx |= -646905454;
                                                                                            var2xx ^= 1651566693;
                                                                                            break label147;
                                                                                        case 145302227:
                                                                                            var2xx ^= -1827482430;
                                                                                            break label147;
                                                                                        case 2028454270:
                                                                                        default:
                                                                                            var2xx ^= -215013526;
                                                                                            break label147;
                                                                                    }
                                                                                }
                                                                                var2xx = switch (var2xx) {
                                                                                    case -1988607737 -> {
                                                                                        var2xx |= 1654219910;
                                                                                        var2xx += -1019022072;
                                                                                        var2xx <<= 5;
                                                                                        yield var2xx ^ -832914254;
                                                                                    }
                                                                                    case -600172463 -> var2xx ^ 968591319;
                                                                                    default -> var2xx ^ 972944905;
                                                                                };
                                                                                var86xx = var2xx;
                                                                                if (var86xx == null) {
                                                                                    break label124;
                                                                                }

                                                                                boolean var88xx = var116.completeExceptionally(var110xx);
                                                                                switch (var2xx) {
                                                                                    case 122523577:
                                                                                        var2xx ^= -231881907;
                                                                                        break;
                                                                                    case 701623634:
                                                                                        var2xx -= 1834336025;
                                                                                        var2xx *= 493854607;
                                                                                        var2xx ^= 2111777268;
                                                                                        break;
                                                                                    case 1939633952:
                                                                                    default:
                                                                                        var2xx ^= 340067507;
                                                                                }
                                                                            }
                                                                        }

                                                                        var3xx = var2xx + 1;
                                                                        var3xx = var2xx * var3xx;
                                                                        var3xx &= 1;
                                                                        if (var3xx == 0) {
                                                                            return;
                                                                        }
                                                                    }

                                                                    IllegalStateException var92xx = new IllegalStateException();
                                                                    throw var92xx;
                                                                }
                                                            }

                                                            IllegalArgumentException var85xx = new IllegalArgumentException();
                                                            throw var85xx;
                                                        };
                                                        var67x += -1193905387;
                                                        var67x -= -1095652476;
                                                        var67x ^= -2054264;
                                                    } catch (Exception var14x) {
                                                        var3x = var14x;
                                                        var67x = t;
                                                        var67x ^= -623555698;
                                                        var6x = (var14x instanceof ms) ? 1 : 0;
                                                        switch (var67x) {
                                                            case -1988995980:
                                                            default:
                                                                break label108;
                                                            case 972642534:
                                                                break label107;
                                                            case 1674759455:
                                                                break label116;
                                                        }
                                                    }

                                                    Integer var8x = var67x;
                                                    if (var8x == null) {
                                                        break label112;
                                                    }

                                                    try {
                                                        var103x.execute(var94x);
                                                        var67x += -49088184;
                                                        var67x |= 1948089789;
                                                        var67x += 1059580727;
                                                        var67x *= -340674983;
                                                        var67x ^= 713426402;
                                                        break label119;
                                                    } catch (Exception var13x) {
                                                        var3x = var13x;
                                                        var67x = t;
                                                        var67x ^= -623555698;
                                                        var6x = (var13x instanceof ms) ? 1 : 0;
                                                        switch (var67x) {
                                                            case -1988995980:
                                                            default:
                                                                break label108;
                                                            case 972642534:
                                                                break label107;
                                                            case 1674759455:
                                                        }
                                                    }
                                                }

                                                var67x ^= -814244726;
                                                break label109;
                                            }

                                            var67x |= -871602791;
                                            var67x ^= 45060724;
                                            break label109;
                                        }

                                        var67x ^= 980235699;
                                    }

                                    if (var6x == 0) {
                                        var67x += -2036997840;
                                        var67x *= -407631401;
                                        var67x -= 1513713220;
                                        var67x *= 26911955;
                                        var67x ^= 199730844;
                                        var6x = var67x + 1;
                                        var6x = var67x * var6x;
                                        int var104x = var67x + 2;
                                        var6x *= var104x;
                                        var104x = var67x + 3;
                                        var6x *= var104x;
                                        var6x &= 7;
                                        if (var6x == 0) {
                                            throw UncheckedExceptions.rethrow(var3x);
                                        }
                                        break label112;
                                    }

                                    var67x ^= -2085498377;
                                    var67x >>>= 17;
                                    var67x += 468993983;
                                    var67x *= -1012014813;
                                    var67x ^= 105482638;
                                    ms var82x = (ms)var3x;

                                    var67x = switch (var67x) {
                                        default -> var67x ^ -1739919701;
                                        case -448958824 -> var67x ^ 225566297;
                                        case -58261218 -> {
                                            var67x &= 854004635;
                                            var67x &= 791369276;
                                            var67x += 1321593288;
                                            yield var67x ^ -707761103;
                                        }
                                    } * -904301755;
                                    var67x &= 989608289;
                                    var67x ^= 2104304581;
                                    int var83x = var67x + 1;
                                    int var84x = var67x * var83x;
                                    int var85x = var84x & 1;
                                    if (var85x != 0) {
                                        break label112;
                                    }

                                    Executor var86x = this.rH;
                                    Runnable var18x = () -> {
                                        int var2xx = t;
                                        var2xx ^= -1372809597;
                                        int var3xx = System.identityHashCode(var116);
                                        int var4xx = var3xx + 1;
                                        var4xx = var3xx * var4xx;
                                        var3xx = var4xx & 1;
                                        if (var3xx == 0) {
                                            switch (var2xx) {
                                                case 217481781:
                                                default:
                                                    var2xx ^= 2032363142;
                                                    break;
                                                case 685508184:
                                                    var2xx ^= -1896133052;
                                                    break;
                                                case 1291879915:
                                                    var2xx += 1499949537;
                                                    var2xx *= -1071064631;
                                                    var2xx ^= 311754164;
                                            }

                                            boolean var20xx = var116.completeExceptionally(var82x);
                                        } else {
                                            Integer var11xx = switch (var2xx) {
                                                default -> var2xx ^ -1117696270;
                                                case 1291879915 -> {
                                                    var2xx += 866972066;
                                                    var2xx |= 2051467511;
                                                    var2xx -= -2057577661;
                                                    var2xx ^= 1942755721;
                                                    yield var2xx ^ -425980937;
                                                }
                                                case 1536673314 -> var2xx ^ 1797771479;
                                            };
                                            if (var11xx != null) {
                                                IllegalArgumentException var13xx = new IllegalArgumentException();
                                                throw var13xx;
                                            } else {
                                                IllegalArgumentException var12 = new IllegalArgumentException();
                                                throw var12;
                                            }
                                        }
                                    };
                                    var86x.execute(var18x);
                                    switch (var67x) {
                                        case -769421574:
                                        default:
                                            var67x ^= 568406371;
                                            break label114;
                                        case 1160673563:
                                            var67x ^= 1691573267;
                                            break label114;
                                        case 1431114628:
                                            var67x *= 1611850459;
                                            var67x ^= -35195282;
                                            break label114;
                                    }
                                }

                                Integer var19x = var67x;
                                if (var19x == null) {
                                    break label112;
                                }

                                var67x <<= 11;
                                var67x ^= 684022858;
                                var67x *= -1449195391;
                                var67x -= -2048505861;
                                var67x ^= 1933600461;
                            }

                            long var20x = var67x;
                            long var87x = var20x + 1L;
                            var87x = var20x * var87x;
                            var20x = var87x & 1L;
                            long var110x;
                            int var22x = (var110x = var20x - 0L) == 0L ? 0 : (var110x < 0L ? -1 : 1);
                            if (var22x == 0) {
                                return;
                            }
                        }

                        IllegalStateException var23x = new IllegalStateException();
                        throw var23x;
                    };
                    var2 ^= -2101028840;
                    var2 <<= 17;
                    var2 ^= 1383808377;
                    long var123 = var2;
                    long var160 = var123 + 1L;
                    var160 = var123 * var160;
                    long var190 = var123 + 2L;
                    var160 *= var190;
                    long var124 = var123 + 3L;
                    var160 *= var124;
                    long var125 = var160 & 7L;
                    long var204;
                    var2 = (var204 = var125 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var31.execute((Runnable)var3);
                        return var116;
                    }
                }
            }
        }

        IllegalArgumentException var32 = new IllegalArgumentException();
        throw var32;
    }

    public CompletableFuture b(String var1) {
        int var2 = t;
        var2 ^= -1360890117;
        int var3 = System.identityHashCode(this);
        Integer var15 = var3;
        if (var15 != null) {
            var2 ^= 967362074;
            var2 &= 461281875;
            var2 ^= 1568938621;
            var15 = var2;
            if (var15 == null) {
                IllegalArgumentException var19 = new IllegalArgumentException();
                throw var19;
            } else {
                CompletableFuture var17 = new CompletableFuture();
                CompletableFuture var18 = var17;
                Executor var4 = this.ek;
                Runnable var5 = () -> {
                    Ni var109;
                    nL var112;
                    Runnable var115;
                    Executor var127;
                    label120: {
                        int var96;
                        label108: {
                            Exception var3x;
                            label121: {
                                label117: {
                                    try {
                                        var96 = t;
                                        var96 ^= 228799348;
                                        Object var5x = null;
                                        var96 += -65300519;
                                        var96 += -1992837881;
                                        var96 ^= -1948746436;
                                    } catch (Exception var15x) {
                                        var3x = var15x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var6x = var15x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var6x) {
                                            break label121;
                                        }
                                        break label117;
                                    }

                                    int var103 = var96 + 1;
                                    var103 = var96 * var103;
                                    int var7x = var96 + 2;
                                    var103 *= var7x;
                                    var7x = var96 + 3;
                                    var103 *= var7x;
                                    var103 &= 7;
                                    if (var103 != 0) {
                                        break label120;
                                    }

                                    try {
                                        var109 = this.ft;
                                        var96 |= 1336181081;
                                        var96 >>= 17;
                                        var96 <<= 13;
                                        var96 ^= 825889042;
                                    } catch (Exception var14x) {
                                        var3x = var14x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var108 = var14x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var108) {
                                            break label121;
                                        }
                                        break label117;
                                    }

                                    Integer var123 = var96;
                                    if (var123 == null) {
                                        break label120;
                                    }

                                    try {
                                        nL var111 = var109.Xl(var1);
                                        var96 -= -168521097;
                                        var96 ^= -503423019;
                                        var112 = var111;
                                        var96 ^= 451348305;
                                        var96 ^= 1161183458;
                                        var96 ^= -865903766;
                                    } catch (Exception var13x) {
                                        var3x = var13x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var110 = var13x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var110) {
                                            break label121;
                                        }
                                        break label117;
                                    }

                                    int var124 = var96 + 1;
                                    var124 = var96 * var124;
                                    var124 &= 1;
                                    if (var124 != 0) {
                                        break label120;
                                    }

                                    try {
                                        var127 = this.rH;
                                    } catch (Exception var12x) {
                                        var3x = var12x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var113 = var12x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var113) {
                                            break label121;
                                        }
                                        break label117;
                                    }
                                    var96 = switch (var96) {
                                        case -1434378857 -> {
                                            var96 += -614610086;
                                            yield var96 ^ -225887749;
                                        }
                                        default -> var96 ^ 1401932029;
                                        case 1363671391 -> var96 ^ 328975972;
                                    };
                                    int var8x = var96 + 1;
                                    var8x = var96 * var8x;
                                    int var9x = var96 + 2;
                                    var8x *= var9x;
                                    var9x = var96 + 3;
                                    var8x *= var9x;
                                    var8x &= 7;
                                    if (var8x != 0) {
                                        break label120;
                                    }

                                    try {
                                        var115 = () -> {
                    com.google.gson.JsonObject var204;
                    com.google.gson.JsonObject var206;
                    List var219;
                    com.google.gson.JsonObject var238;
                    mQ var245;
                    String var256;
                    boolean var257 = false;
                    String var259;
                    String var277;
                    Zx var281;
                                            int var5xx = t;
                                            var5xx ^= -33880870;
                                            Object var6xx = null;
                                            int var7xx = var112.nU;

                                            var5xx = switch (var5xx) {
                                                case -189735853 -> var5xx ^ -1315508297;
                                                case 517412786 -> {
                                                    var5xx |= 903013155;
                                                    var5xx ^= -1627752675;
                                                    yield var5xx ^ 678123455;
                                                }
                                                default -> var5xx ^ 384806397;
                                            };
                                            if (var7xx != 0) {
                                                var5xx *= 247959449;
                                                var5xx <<= 25;
                                                var5xx ^= -1669051575;
                                                Integer var199 = var5xx;
                                                if (var199 != null) {
                                                    String var8xx = "Nie ma configu o kodzie " + var1 + ".";
                                                    ms var200 = new ms(var8xx, false);

                                                    var5xx = switch (var5xx) {
                                                        default -> var5xx ^ -1327733622;
                                                        case -830190775 -> {
                                                            var5xx *= -1283849231;
                                                            yield var5xx ^ 2036912023;
                                                        }
                                                        case -108922064 -> var5xx ^ -1219540121;
                                                    };
                                                    int var234 = var5xx + 1;
                                                    int var235 = var5xx * var234;
                                                    int var236 = var235 & 1;
                                                    if (var236 == 0) {
                                                        boolean var201 = var18.completeExceptionally(var200);
                                                        return;
                                                    }
                                                }
                                            } else {
                                                label307: {
                                                    var5xx *= -2016870737;
                                                    var5xx -= -1009971634;
                                                    var5xx ^= 1633111195;

                                                    label308: {
                                                        label299: {
                                                            Exception var4xx;
                                                            label309: {
                                                                label337: {
                                                                    try {
                                                                        var5xx |= 1231110901;
                                                                        var5xx ^= -373326007;
                                                                        byte[] var203 = var112.E;
                                                                        var5xx *= -1296355357;
                                                                        var5xx ^= 1525483541;
                                                                        var5xx <<= 18;
                                                                        var5xx ^= 728176033;
                                                                        var204 = Ke.zS(var203);
                                                                    } catch (Exception var31x) {
                                                                        var4xx = var31x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var202 = var31x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var202) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        case 1163015365 -> var5xx ^ -1643337999;
                                                                        default -> var5xx ^ -344078508;
                                                                        case 1656427937 -> {
                                                                            var5xx *= 426057327;
                                                                            var5xx ^= -902712520;
                                                                            var5xx ^= -1551510264;
                                                                            yield var5xx ^ 238451773;
                                                                        }
                                                                    };

                                                                    try {
                                                                        var206 = var204;
                                                                    } catch (Exception var30x) {
                                                                        var4xx = var30x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var205 = var30x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var205) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        case -1699863358 -> {
                                                                            var5xx >>>= 13;
                                                                            yield var5xx ^ 1121893542;
                                                                        }
                                                                        case -1018701716 -> var5xx ^ -499634059;
                                                                        default -> var5xx ^ -1462865494;
                                                                    };

                                                                    Zx var237;
                                                                    try {
                                                                        var237 = this.Sq;
                                                                        var5xx *= 80315119;
                                                                        var5xx |= 1230312136;
                                                                        var5xx |= 813833280;
                                                                        var5xx |= 520563006;
                                                                        var5xx ^= 418660501;
                                                                    } catch (Exception var29x) {
                                                                        var4xx = var29x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var207 = var29x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var207) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    Integer var9xx = var5xx;
                                                                    if (var9xx == null) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var238 = var237.WA(false);
                                                                        var5xx ^= 1391608917;
                                                                        var5xx *= 743526373;
                                                                        var5xx ^= 2057586875;
                                                                    } catch (Exception var28x) {
                                                                        var4xx = var28x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var208 = var28x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var208) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    int var248 = var5xx + 1;
                                                                    var248 = var5xx * var248;
                                                                    var248 &= 1;
                                                                    if (var248 != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        this.cP = var238;
                                                                    } catch (Exception var27x) {
                                                                        var4xx = var27x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var209 = var27x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var209) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        case -1169590048 -> {
                                                                            var5xx += -1246789901;
                                                                            var5xx &= 1729620521;
                                                                            var5xx &= -380696730;
                                                                            yield var5xx ^ 234210398;
                                                                        }
                                                                        default -> var5xx ^ -164156632;
                                                                        case -623088678 -> var5xx ^ -1117937208;
                                                                    };
                                                                    Integer var239 = var5xx;
                                                                    if (var239 == null) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        int var240 = var5xx + -760361239;
                                                                        int var241 = var240 ^ 1379826654;
                                                                        this.a(var241);
                                                                    } catch (Exception var26x) {
                                                                        var4xx = var26x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var210 = var26x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var210) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        default -> var5xx ^ 920149898;
                                                                        case 5687637 -> var5xx ^ -561064274;
                                                                        case 1828046430 -> {
                                                                            var5xx -= -605352071;
                                                                            yield var5xx ^ 1303514994;
                                                                        }
                                                                    };
                                                                    int var242 = var5xx + 1;
                                                                    int var243 = var5xx * var242;
                                                                    int var244 = var243 & 1;
                                                                    if (var244 != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var245 = null;
                                                                    } catch (Exception var25x) {
                                                                        var4xx = var25x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var211 = var25x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var211) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        case -757426277 -> var5xx ^ -377389417;
                                                                        case -591873641 -> {
                                                                            var5xx *= -566109881;
                                                                            var5xx >>= 11;
                                                                            var5xx += -827631592;
                                                                            var5xx |= -2120995251;
                                                                            yield var5xx ^ -785324029;
                                                                        }
                                                                        default -> var5xx ^ -414000636;
                                                                    };
                                                                    var248 = var5xx + 1;
                                                                    var248 = var5xx * var248;
                                                                    int var10xx = 0;
                                                                    var248 *= var10xx;
                                                                    var10xx = var5xx + 3;
                                                                    var248 *= var10xx;
                                                                    var248 &= 7;
                                                                    if (var248 != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var256 = var112.NZ;
                                                                        var5xx -= 722680997;
                                                                        var5xx -= 1096326483;
                                                                        var5xx ^= 1360360579;
                                                                    } catch (Exception var24x) {
                                                                        var4xx = var24x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var212 = var24x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var212) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    var10xx = var5xx + 1;
                                                                    var10xx = var5xx * var10xx;
                                                                    int var11xx = var5xx + 2;
                                                                    var10xx *= var11xx;
                                                                    var11xx = var5xx + 3;
                                                                    var10xx *= var11xx;
                                                                    var10xx &= 7;
                                                                    if (var10xx != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var257 = var256.isEmpty();
                                                                        var5xx ^= -2019082461;
                                                                        var5xx ^= -2108614424;
                                                                        var5xx ^= -1914130646;
                                                                        var5xx |= -529218618;
                                                                        var5xx ^= 2042110208;
                                                                    } catch (Exception var23x) {
                                                                        var4xx = var23x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var213 = var23x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var213) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    long var270 = var5xx;
                                                                    long var12xx = var270 + 1L;
                                                                    var12xx = var270 * var12xx;
                                                                    long var271 = var12xx & 1L;
                                                                    long var294;
                                                                    var10xx = (var294 = var271 - 0L) == 0L ? 0 : (var294 < 0L ? -1 : 1);
                                                                    if (var10xx != 0) {
                                                                        break label307;
                                                                    }

                                                                    label338: {
                                                                        label339: {
                                                                            try {
                                                                                if (!var257) {
                                                                                    break label339;
                                                                                }
                                                                            } catch (Exception var22x) {
                                                                                var4xx = var22x;
                                                                                var5xx = t;
                                                                                var5xx ^= 153218157;
                                                                                boolean var214 = var22x instanceof ms;
                                                                                var5xx &= -599552414;
                                                                                var5xx ^= -526434339;
                                                                                if (!var214) {
                                                                                    break label309;
                                                                                }
                                                                                break label337;
                                                                            }
                                                                            var5xx = switch (var5xx) {
                                                                                case -1832066314 -> {
                                                                                    var5xx += -1076466511;
                                                                                    var5xx |= -1451333626;
                                                                                    yield var5xx ^ 161152953;
                                                                                }
                                                                                default -> var5xx ^ 369001447;
                                                                                case 317216874 -> var5xx ^ -1773727023;
                                                                            };
                                                                            Integer var258 = var5xx;
                                                                            if (var258 == null) {
                                                                                break label307;
                                                                            }

                                                                            try {
                                                                                var5xx &= -569927041;
                                                                                var5xx >>= 17;
                                                                                var5xx &= -1818004341;
                                                                                var5xx -= -1416386892;
                                                                                var5xx ^= 392230286;
                                                                            } catch (Exception var21x) {
                                                                                var4xx = var21x;
                                                                                var5xx = t;
                                                                                var5xx ^= 153218157;
                                                                                boolean var215 = var21x instanceof ms;
                                                                                var5xx &= -599552414;
                                                                                var5xx ^= -526434339;
                                                                                if (!var215) {
                                                                                    break label309;
                                                                                }
                                                                                break label337;
                                                                            }

                                                                            var259 = var1;
                                                                            var5xx &= 1312090013;
                                                                            var5xx |= 1442044853;
                                                                            var5xx -= -416062274;
                                                                            var5xx ^= -1622828338;
                                                                            break label338;
                                                                        }
                                                                        var5xx = switch (var5xx) {
                                                                            case -1832066314 -> {
                                                                                var5xx &= 677209087;
                                                                                yield var5xx ^ 1375228381;
                                                                            }
                                                                            default -> var5xx ^ 1062873341;
                                                                            case 920565625 -> var5xx ^ -1253516100;
                                                                        };
                                                                        long var273 = var5xx;
                                                                        var12xx = var273 + 1L;
                                                                        var12xx = var273 * var12xx;
                                                                        long var14xx = var273 + 2L;
                                                                        var12xx *= var14xx;
                                                                        long var274 = var273 + 3L;
                                                                        var12xx *= var274;
                                                                        long var275 = var12xx & 7L;
                                                                        long var295;
                                                                        var10xx = (var295 = var275 - 0L) == 0L ? 0 : (var295 < 0L ? -1 : 1);
                                                                        if (var10xx != 0) {
                                                                            break label307;
                                                                        }

                                                                        try {
                                                                            var5xx *= -1072981601;
                                                                            var5xx += 1720258846;
                                                                            var5xx ^= 173687040;
                                                                            var5xx *= 1512775785;
                                                                            var5xx ^= 940015411;
                                                                            var277 = var112.NZ;
                                                                        } catch (Exception var20x) {
                                                                            var4xx = var20x;
                                                                            var5xx = t;
                                                                            var5xx ^= 153218157;
                                                                            boolean var216 = var20x instanceof ms;
                                                                            var5xx &= -599552414;
                                                                            var5xx ^= -526434339;
                                                                            if (!var216) {
                                                                                break label309;
                                                                            }
                                                                            break label337;
                                                                        }
                                                                        var5xx = switch (var5xx) {
                                                                            case -905703967 -> var5xx ^ 808981558;
                                                                            case -594415688 -> {
                                                                                var5xx |= 1011944644;
                                                                                var5xx ^= 360153419;
                                                                                var5xx <<= 29;
                                                                                var5xx += -1130634382;
                                                                                yield var5xx ^ -1033969851;
                                                                            }
                                                                            default -> var5xx ^ -1483715628;
                                                                        };
                                                                        Integer var284 = var5xx;
                                                                        if (var284 == null) {
                                                                            break label307;
                                                                        }

                                                                        var259 = var277;
                                                                        switch (var5xx) {
                                                                            case -592208150:
                                                                                var5xx ^= 447816585;
                                                                                break;
                                                                            case -83575812:
                                                                            default:
                                                                                var5xx ^= -1175999596;
                                                                                break;
                                                                            case 1589984311:
                                                                                var5xx -= 1878811719;
                                                                                var5xx += 1263753262;
                                                                                var5xx ^= -576860121;
                                                                        }
                                                                    }

                                                                    long var278 = var5xx;
                                                                    var12xx = var278 + 1L;
                                                                    var12xx = var278 * var12xx;
                                                                    long var279 = var12xx & 1L;
                                                                    long var296;
                                                                    var10xx = (var296 = var279 - 0L) == 0L ? 0 : (var296 < 0L ? -1 : 1);
                                                                    if (var10xx != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var5xx ^= -111326437;
                                                                        var5xx ^= 1924096609;
                                                                        var281 = this.Sq;
                                                                    } catch (Exception var19x) {
                                                                        var4xx = var19x;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var217 = var19x instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var217) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }
                                                                    var5xx = switch (var5xx) {
                                                                        default -> var5xx ^ -1348263459;
                                                                        case -1758192452 -> var5xx ^ -336805608;
                                                                        case 1819527491 -> {
                                                                            var5xx >>= 4;
                                                                            var5xx >>= 14;
                                                                            yield var5xx ^ -2020908497;
                                                                        }
                                                                    };

                                                                    try {
                                                                        var219 = var281.Vx(var206, true);
                                                                        var5xx -= -171050844;
                                                                        var5xx &= -1442858244;
                                                                        var5xx ^= 1873234707;
                                                                    } catch (Exception var18xx) {
                                                                        var4xx = var18xx;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var218 = var18xx instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var218) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    Integer var282 = var5xx;
                                                                    if (var282 == null) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        var245 = new mQ(var259, var219);
                                                                        var5xx ^= -399812213;
                                                                        var5xx ^= 2034560378;
                                                                        var5xx ^= 683909266;
                                                                    } catch (Exception var17xx) {
                                                                        var4xx = var17xx;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var220 = var17xx instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var220) {
                                                                            break label309;
                                                                        }
                                                                        break label337;
                                                                    }

                                                                    long var260 = var5xx;
                                                                    long var285 = var260 + 1L;
                                                                    long var286 = var260 * var285;
                                                                    long var261 = var286 & 1L;
                                                                    long var297;
                                                                    var7xx = (var297 = var261 - 0L) == 0L ? 0 : (var297 < 0L ? -1 : 1);
                                                                    if (var7xx != 0) {
                                                                        break label307;
                                                                    }

                                                                    try {
                                                                        boolean var233 = var18.complete(var245);
                                                                        var5xx ^= 553638172;
                                                                        var5xx &= 1437093870;
                                                                        var5xx += -79050979;
                                                                        var5xx -= -1822037731;
                                                                        var5xx ^= 806779518;
                                                                        break label299;
                                                                    } catch (Exception var16xx) {
                                                                        var4xx = var16xx;
                                                                        var5xx = t;
                                                                        var5xx ^= 153218157;
                                                                        boolean var222 = var16xx instanceof ms;
                                                                        var5xx &= -599552414;
                                                                        var5xx ^= -526434339;
                                                                        if (!var222) {
                                                                            break label309;
                                                                        }
                                                                    }
                                                                }

                                                                var5xx |= -1920151916;
                                                                var5xx ^= 198169761;
                                                                long var223 = var5xx;
                                                                long var262 = var223 + 1L;
                                                                var262 = var223 * var262;
                                                                long var224 = var262 & 1L;
                                                                long var298;
                                                                var7xx = (var298 = var224 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                                                                if (var7xx != 0) {
                                                                    break label307;
                                                                }

                                                                var6xx = (ms)var4xx;
                                                                var5xx -= 233649051;
                                                                var5xx ^= -463792710;
                                                                int var32x = var5xx + 1;
                                                                int var33x = var5xx * var32x;
                                                                int var34x = var33x & 1;
                                                                if (var34x != 0) {
                                                                    break label307;
                                                                }

                                                                var5xx ^= -541167539;
                                                                var5xx ^= 477563027;
                                                                int var194 = var5xx + 1;
                                                                int var195 = var5xx * var194;
                                                                var7xx = var5xx + 2;
                                                                int var196 = var195 * var7xx;
                                                                var7xx = var5xx + 3;
                                                                int var197 = var196 * var7xx;
                                                                int var198 = var197 & 7;
                                                                if (var198 != 0) {
                                                                    break label307;
                                                                }

                                                                boolean var36x = var18.completeExceptionally((Throwable)var6xx);
                                                                var5xx += 774061999;
                                                                var5xx ^= -757040797;
                                                                break label308;
                                                            }

                                                            var5xx |= 1676572233;
                                                            var5xx ^= 751856442;
                                                            var7xx = var5xx + 1;
                                                            var7xx = var5xx * var7xx;
                                                            int var246 = var5xx + 2;
                                                            var7xx *= var246;
                                                            var246 = var5xx + 3;
                                                            var7xx *= var246;
                                                            var7xx &= 7;
                                                            if (var7xx == 0) {
                                                                throw UncheckedExceptions.rethrow(var4xx);
                                                            }
                                                            break label307;
                                                        }

                                                        Integer var37x = var5xx;
                                                        if (var37x == null) {
                                                            break label307;
                                                        }

                                                        var5xx -= 1926747175;
                                                        var5xx ^= 651258144;
                                                    }

                                                    Integer var38x = var5xx;
                                                    if (var38x != null) {
                                                        return;
                                                    }
                                                }
                                            }

                                            RuntimeException var39x = new RuntimeException();
                                            throw var39x;
                                        };
                                        var96 ^= -1277211923;
                                        var96 ^= 2137925254;
                                    } catch (Exception var11x) {
                                        var3x = var11x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var114 = var11x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var114) {
                                            break label121;
                                        }
                                        break label117;
                                    }

                                    var8x = var96 + 1;
                                    var8x = var96 * var8x;
                                    var8x &= 1;
                                    if (var8x != 0) {
                                        break label120;
                                    }

                                    try {
                                        var127.execute(var115);
                                        var96 |= -1657350425;
                                        var96 |= -252771702;
                                        var96 -= -2090393649;
                                        var96 ^= -1725671919;
                                        break label108;
                                    } catch (Exception var10x) {
                                        var3x = var10x;
                                        var96 = t;
                                        var96 ^= -1563525994;
                                        boolean var116 = var10x instanceof ms;
                                        var96 |= -1292443239;
                                        var96 += -875432182;
                                        var96 &= 757707525;
                                        var96 |= -887706807;
                                        var96 ^= -587155053;
                                        if (!var116) {
                                            break label121;
                                        }
                                    }
                                }

                                var96 ^= 1281805785;
                                var96 += -761931977;
                                var96 *= 537618483;
                                var96 ^= -51000465;
                                Integer var117 = var96;
                                if (var117 == null) {
                                    break label120;
                                }

                                ms var101 = (ms)var3x;
                                var96 *= 314422471;
                                var96 |= -1466608985;
                                var96 ^= 1923597830;
                                int var16x = var96 + 1;
                                int var17x = var96 * var16x;
                                int var18x = var17x & 1;
                                if (var18x != 0) {
                                    break label120;
                                }

                                Executor var102 = this.rH;
                                Runnable var20 = () -> {
                                    int var2xx = t;
                                    var2xx ^= -1207538874;
                                    int var3xx = System.identityHashCode(var18);
                                    int var4xx = var3xx + 1;
                                    var4xx = var3xx * var4xx;
                                    int var5xx = var3xx + 2;
                                    var4xx *= var5xx;
                                    var3xx += 3;
                                    var4xx *= var3xx;
                                    var3xx = var4xx & 7;
                                    if (var3xx == 0) {
                                        var2xx &= -792515920;
                                        var2xx ^= 3004014;
                                        var2xx += -323436007;
                                        var2xx |= -1650589208;
                                        var2xx ^= -284559889;
                                        var3xx = var2xx + 1;
                                        var3xx = var2xx * var3xx;
                                        var3xx &= 1;
                                        if (var3xx != 0) {
                                            UnsupportedOperationException var22x = new UnsupportedOperationException();
                                            throw var22x;
                                        } else {
                                            boolean var21x = var18.completeExceptionally(var101);
                                        }
                                    } else {
                                        var2xx += 1979959337;
                                        var2xx ^= -2055931069;
                                        var2xx ^= -1972104491;
                                        AssertionError var10xx = new AssertionError();
                                        throw var10xx;
                                    }
                                };
                                var96 >>>= 22;
                                var96 &= -1629948016;
                                var96 ^= -1111317015;
                                var117 = var96;
                                if (var117 == null) {
                                    break label120;
                                }

                                var102.execute(var20);
                                var96 >>>= 17;
                                var96 += -2018270659;
                                var96 >>>= 19;
                                var96 ^= -1710924546;
                                return;
                            }

                            var96 |= -114453920;
                            var96 ^= -1232137333;
                            int var119 = var96 + 1;
                            var119 = var96 * var119;
                            var119 &= 1;
                            if (var119 == 0) {
                                throw UncheckedExceptions.rethrow(var3x);
                            }
                            break label120;
                        }

                        Integer var21 = var96;
                        if (var21 != null) {
                            var96 |= 2084979077;
                            var96 *= 552017997;
                            var96 |= 958079000;
                            var96 ^= -469865103;
                            return;
                        }
                    }

                    UnsupportedOperationException var22 = new UnsupportedOperationException();
                    throw var22;
                };
                var4.execute(var5);
                return var18;
            }
        } else {
            var2 &= 2040903983;
            var2 |= 112525669;
            var2 -= -1183734034;
            var2 ^= 577270808;
            IllegalStateException var11 = new IllegalStateException();
            throw var11;
        }
    }

    public List xu() {
        Path var126 = null;
        label143: {
            int var2 = t;
            var2 ^= 1153486492;
            Object var3 = null;
            JsonObject var4 = this.cP;
            var2 >>= 25;
            var2 <<= 6;
            var2 -= 45314539;
            var2 ^= 1328924209;
            var2 ^= 2073515285;
            if (var4 != null) {
                var2 = switch (var2) {
                    case -907144719 -> {
                        var2 <<= 5;
                        var2 |= -148495199;
                        var2 >>>= 16;
                        yield var2 ^ -1476125138;
                    }
                    case 797844284 -> var2 ^ 508989522;
                    default -> var2 ^ -106759006;
                };
                var4 = this.cP;
                var2 ^= 1821836268;
                var2 *= 32593239;
                var2 &= -468068542;
                var2 ^= 643295444;
                Integer var5 = var2;
                if (var5 == null) {
                    break label143;
                }

                var4 = var4;
                var2 ^= -2004434764;
                var2 *= 1124738001;
                var2 *= -1635431409;
                var2 *= 1019841917;
                var2 ^= -1534341029;
            } else {
                var2 = switch (var2) {
                    case -907144719 -> {
                        var2 += 1545182032;
                        yield var2 ^ -1620248392;
                    }
                    case 1730652507 -> var2 ^ -1030010626;
                    default -> var2 ^ 737590522;
                };
                int var106 = var2 + 1;
                var106 = var2 * var106;
                var106 &= 1;
                if (var106 != 0) {
                    break label143;
                }

                var106 = var2 ^ 1524779243;
                var106 &= -1775600793;
                var106 ^= -1006412062;
                var106 ^= 374652583;
                JsonObject var113 = this.Jt(var106);

                var2 = switch (var2) {
                    default -> var2 ^ -501948083;
                    case -1184147975 -> {
                        var2 >>>= 4;
                        var2 &= 789164460;
                        yield var2 ^ 103869837;
                    }
                    case -954003975 -> var2 ^ 2088343306;
                };
                long var6 = var2;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var147;
                int var140 = (var147 = var6 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                if (var140 != 0) {
                    break label143;
                }

                var4 = var113;
                var2 += -1635520967;
                var2 >>= 13;
                var2 ^= -1737957671;
            }

            var2 &= -1496490780;
            var2 -= -2627627;
            var2 &= -335983032;
            var2 ^= 1789833328;
            long var114 = var2;
            long var7 = var114 + 1L;
            var7 = var114 * var7;
            var114 = var7 & 1L;
            long var148;
            int var116 = (var148 = var114 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
            if (var116 == 0) {
                if (var4 == null) {
                    var2 ^= -1810725122;
                    var2 ^= 2089756383;
                    return null;
                }

                var2 >>= 28;
                var2 -= 1144918614;
                var2 ^= -300906360;
                Integer var117 = var2;
                if (var117 != null) {
                    this.cP = null;
                    var2 |= 1991109796;
                    var2 *= -1067281333;
                    var2 *= -1031289525;
                    var2 ^= -991698714;
                    Integer var118 = var2;
                    label128:
                    if (var118 != null) {
                        label162: {
                            label125: {
                                Throwable var1;
                                label148: {
                                    label163: {
                                        try {
                                            var2 &= -2144753513;
                                            var2 &= 1638461946;
                                            var2 ^= -1413223403;
                                        } catch (Throwable var12) {
                                            var1 = var12;
                                            var2 = t;
                                            var2 ^= -100845457;
                                            boolean var119 = var12 instanceof IOException;
                                            var2 += -2110546603;
                                            var2 -= -435892207;
                                            var2 ^= -735417515;
                                            if (!var119) {
                                                break label148;
                                            }
                                            break label163;
                                        }

                                        Integer var120 = var2;
                                        if (var120 == null) {
                                            break label128;
                                        }

                                        try {
                                            int var122 = var2 | -1384436607;
                                            int var123 = var122 ^ -1645465244;
                                            int var124 = var123 * 1402413621;
                                            int var125 = var124 ^ 1259544907;
                                            var126 = this.yv(var125);
                                        } catch (Throwable var11) {
                                            var1 = var11;
                                            var2 = t;
                                            var2 ^= -100845457;
                                            boolean var121 = var11 instanceof IOException;
                                            var2 += -2110546603;
                                            var2 -= -435892207;
                                            var2 ^= -735417515;
                                            if (!var121) {
                                                break label148;
                                            }
                                            break label163;
                                        }
                                        var2 = switch (var2) {
                                            case -1413264251 -> {
                                                var2 *= 211797811;
                                                yield var2 ^ -1909399696;
                                            }
                                            default -> var2 ^ -1881307962;
                                            case 580102976 -> var2 ^ -1633966620;
                                        };

                                        try {
                                            boolean var136 = Files.deleteIfExists(var126);
                                            break label125;
                                        } catch (Throwable var10) {
                                            var1 = var10;
                                            var2 = t;
                                            var2 ^= -100845457;
                                            boolean var127 = var10 instanceof IOException;
                                            var2 += -2110546603;
                                            var2 -= -435892207;
                                            var2 ^= -735417515;
                                            if (!var127) {
                                                break label148;
                                            }
                                        }
                                    }

                                    var2 &= -661260846;
                                    var2 -= 1657511645;
                                    var2 ^= 280470492;
                                    var2 |= 390346233;
                                    var2 ^= -1106004549;
                                    int var128 = var2 + 1;
                                    int var129 = var2 * var128;
                                    int var130 = var129 & 1;
                                    if (var130 != 0) {
                                        break label128;
                                    }

                                    var3 = (IOException)var1;
                                    var2 += -1906463554;
                                    var2 += -243884656;
                                    var2 ^= -251514839;
                                    var114 = var2;
                                    var7 = var114 + 1L;
                                    var7 = var114 * var7;
                                    var114 = var7 & 1L;
                                    long var149;
                                    int var13 = (var149 = var114 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                                    if (var13 != 0) {
                                        break label128;
                                    }

                                    var2 >>= 9;
                                    var2 *= 59353351;
                                    var2 ^= -70162706;
                                    break label162;
                                }

                                var2 *= 1893205811;
                                var2 &= 1345247858;
                                var2 += 1914893378;
                                var2 ^= -75388471;
                                int var133 = var2 + 1;
                                int var134 = var2 * var133;
                                int var135 = var134 & 1;
                                if (var135 == 0) {
                                    throw UncheckedExceptions.rethrow(var1);
                                }
                                break label128;
                            }
                            var2 = switch (var2) {
                                default -> var2 ^ 1841161987;
                                case 1154383375 -> {
                                    var2 &= 127220085;
                                    var2 &= 1899528937;
                                    var2 &= 489756629;
                                    var2 >>= 22;
                                    yield var2 ^ -1147103786;
                                }
                                case 1845689020 -> var2 ^ -1020106036;
                            };
                            var114 = var2;
                            var7 = var114 + 1L;
                            var7 = var114 * var7;
                            var114 = var7 & 1L;
                            long var150;
                            int var14 = (var150 = var114 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                            if (var14 != 0) {
                                break label128;
                            }

                            switch (var2) {
                                case -2002907847:
                                default:
                                    var2 ^= -308135986;
                                    break;
                                case -1147103786:
                                    var2 >>>= 30;
                                    var2 *= -981608297;
                                    var2 |= -441879024;
                                    var2 ^= -136604645;
                                    break;
                                case 1161775455:
                                    var2 ^= -590030964;
                            }
                        }

                        Integer var15 = var2;
                        if (var15 != null) {
                            Zx var16 = this.Sq;
                            var2 += -634021419;
                            var2 &= 1130091961;
                            var2 |= -1449483540;
                            var2 ^= 961908915;
                            Integer var100 = var2;
                            if (var100 != null) {
                                return var16.Vx(var4, false);
                            }
                        }
                    }
                }
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public BR Y() {
        int var1 = t;
        var1 ^= 1741067012;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var29;
        var2 = (var29 = var21 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -784576575;
            var1 *= 1040185405;
            var1 *= -1968267599;
            var1 ^= 1025073706;
            Integer var23 = var1;
            if (var23 != null) {
                return this.QJ;
            }
        } else {
            var1 = switch (var1) {
                case -2065006484 -> {
                    var1 |= -897786834;
                    var1 &= 578391692;
                    yield var1 ^ -1064419622;
                }
                default -> var1 ^ 992821783;
                case -28312258 -> var1 ^ -126513262;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var18 = new AssertionError();
                throw var18;
            }
        }

        UnsupportedOperationException var17 = new UnsupportedOperationException();
        throw var17;
    }

    public long xZ() {
        int var1 = t;
        var1 ^= -1061313460;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= 679247096;
            var1 &= -1600479779;
            var1 -= 965439556;
            var1 ^= 2000160364;
            Integer var17 = var1;
            if (var17 != null) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        } else {
            var1 |= -1216356010;
            var1 ^= 282216633;
            var1 *= 787573089;
            var1 ^= -1682104015;
            var1 ^= -639103817;
            return this.HO;
        }
    }

    public long MF() {
        int var1 = t;
        var1 ^= 251159069;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        int var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        var3 = of_2.Il;
        var1 ^= var3;
        var1 ^= 1834896129;
        if (var18 != null) {
            var1 >>>= 27;
            var1 ^= -779206130;
            var18 = var1;
            if (var18 != null) {
                return this.p;
            }
        } else {
            var1 &= 1385015855;
            var1 *= -876507561;
            var1 += -449652194;
            var1 ^= -2127915679;
            Integer var15 = var1;
            if (var15 != null) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public String Zk() {
        int var1 = t;
        var1 ^= -784768751;
        int var2 = System.identityHashCode(this);
        Integer var10 = var2;
        if (var10 == null) {
            var1 ^= -1963390446;
            var1 ^= 1870774652;
            var10 = var1;
            if (var10 != null) {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        } else {
            var1 &= -1404999591;
            var1 ^= 7375225;
            int var13 = var1 + 1;
            var13 = var1 * var13;
            var1 = var13 & 1;
            if (var1 == 0) {
                return this.s;
            }
        }

        IllegalStateException var9 = new IllegalStateException();
        throw var9;
    }

    public boolean V() {
        int var1 = t;
        var1 ^= -665186113;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 *= 1514371569;
            var1 ^= 1077135556;
            Integer var14 = var1;
            if (var14 != null) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        } else {
            var1 <<= 1;
            var1 -= 1064158911;
            var1 ^= 110827771;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.ml;
            }
        }

        UnsupportedOperationException var12 = new UnsupportedOperationException();
        throw var12;
    }

    private String mZ(int var1) {
        int var3 = System.identityHashCode(this);
        Zx var4 = this.Sq;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var3 += 3;
        var5 *= var3;
        var3 = var5 & 7;
        if (var3 == 0) {
            int var12 = var1 >> 25;
            var12 += 1263630569;
            var12 ^= 906141661;
            long var23 = var12;
            long var7 = var23 + 1L;
            var7 = var23 * var7;
            long var24 = var7 & 1L;
            long var26;
            var3 = (var26 = var24 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var3 == 0) {
                JsonObject var19 = var4.WA(false);
                return Zx.n(var19);
            } else {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        } else {
            int var2 = var1 * 522891685;
            var2 ^= -2127026386;
            var2 ^= 1806305812;
            UnsupportedOperationException var11 = new UnsupportedOperationException();
            throw var11;
        }
    }

    private void cF(int var1) {
        boolean var384 = false;
        String var403 = null;
        com.google.gson.JsonElement var406 = null;
        com.google.gson.JsonObject var409 = null;
        com.google.gson.JsonObject var412 = null;
        com.google.gson.JsonElement var439 = null;
        long var442 = 0L;
        long var443 = 0L;
        LinkOption[] var455 = null;
        com.google.gson.JsonElement var479 = null;
        long var480 = 0L;
        long var481 = 0L;
        boolean var482 = false;
        String var484 = null;
        String var485 = null;
        boolean var487 = false;
        label358: {
            int var149;
            label357: {
                label360: {
                    label355: {
                        label372: {
                            Path var379;
                            try {
                                Object var40 = null;
                                var149 = var1 + 1437458468;
                                var149 += -1412217201;
                                var149 += 439217090;
                                var149 ^= -505869534;
                                var379 = this.I;
                                var149 >>>= 14;
                                var149 ^= 1396445039;
                                var149 *= -235120585;
                                var149 |= -1743105483;
                                var149 ^= -2099993724;
                            } catch (RuntimeException var37) {
                                int var3 = t;
                                int var119 = var3 ^ 910571462;
                                Throwable var4 = k(var37);
                                Exception var2 = (Exception)var4;
                                Logger var378 = g;
                                String var38 = var2.toString();
                                var378.warn("Cloud sync state unreadable, starting fresh: {}", var38);
                                int var120 = var119 | -1610591045;
                                int var121 = var120 - 1291638017;
                                var149 = var121 ^ -665894755;
                                Integer var39 = var149;
                                if (var39 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            int var5 = var149 + 1;
                            var5 = var149 * var5;
                            int var6 = var149 + 2;
                            var5 *= var6;
                            var6 = var149 + 3;
                            var5 *= var6;
                            var5 &= 7;
                            if (var5 != 0) {
                                break label358;
                            }

                            try {
                                var455 = new LinkOption[0];
                                var149 >>= 30;
                                var149 &= -632561357;
                                var149 ^= -1437897983;
                                var149 >>= 27;
                                var149 ^= -1533261686;
                            } catch (RuntimeException var36) {
                                int var132 = t;
                                int var133 = var132 ^ 910571462;
                                Throwable var380 = k(var36);
                                Exception var41 = (Exception)var380;
                                Logger var381 = g;
                                String var42 = var41.toString();
                                var381.warn("Cloud sync state unreadable, starting fresh: {}", var42);
                                int var134 = var133 | -1610591045;
                                int var135 = var134 - 1291638017;
                                var149 = var135 ^ -665894755;
                                Integer var43 = var149;
                                if (var43 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            Integer var490 = var149;
                            if (var490 == null) {
                                break label358;
                            }

                            try {
                                var384 = Files.isRegularFile(var379, var455);
                                var149 ^= 679365720;
                                var149 &= -1319068166;
                                var149 <<= 4;
                                var149 >>= 28;
                                var149 ^= -274965429;
                            } catch (RuntimeException var35) {
                                int var141 = t;
                                int var142 = var141 ^ 910571462;
                                Throwable var382 = k(var35);
                                Exception var44 = (Exception)var382;
                                Logger var383 = g;
                                String var45 = var44.toString();
                                var383.warn("Cloud sync state unreadable, starting fresh: {}", var45);
                                int var143 = var142 | -1610591045;
                                int var144 = var143 - 1291638017;
                                var149 = var144 ^ -665894755;
                                Integer var46 = var149;
                                if (var46 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            long var456 = var149;
                            long var7 = var456 + 1L;
                            var7 = var456 * var7;
                            long var9 = var456 + 2L;
                            var7 *= var9;
                            long var457 = var456 + 3L;
                            var7 *= var457;
                            long var458 = var7 & 7L;
                            long var545;
                            var5 = (var545 = var458 - 0L) == 0L ? 0 : (var545 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label358;
                            }

                            try {
                                if (!var384) {
                                    break label357;
                                }
                            } catch (RuntimeException var34) {
                                int var150 = t;
                                int var151 = var150 ^ 910571462;
                                Throwable var385 = k(var34);
                                Exception var47 = (Exception)var385;
                                Logger var386 = g;
                                String var48 = var47.toString();
                                var386.warn("Cloud sync state unreadable, starting fresh: {}", var48);
                                int var152 = var151 | -1610591045;
                                int var153 = var152 - 1291638017;
                                var149 = var153 ^ -665894755;
                                Integer var49 = var149;
                                if (var49 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            var149 *= -14811081;
                            var149 ^= 1370533884;
                            long var387 = var149;
                            long var491 = var387 + 1L;
                            long var492 = var387 * var491;
                            long var8 = var387 + 2L;
                            long var493 = var492 * var8;
                            long var388 = var387 + 3L;
                            long var494 = var493 * var388;
                            long var389 = var494 & 7L;
                            long var546;
                            int var390 = (var546 = var389 - 0L) == 0L ? 0 : (var546 < 0L ? -1 : 1);
                            if (var390 != 0) {
                                break label358;
                            }

                            try {
                                var149 &= 505086121;
                                var149 &= -295896058;
                                var149 ^= 1713414973;
                            } catch (RuntimeException var33) {
                                int var156 = t;
                                int var157 = var156 ^ 910571462;
                                Throwable var391 = k(var33);
                                Exception var50 = (Exception)var391;
                                Logger var392 = g;
                                String var51 = var50.toString();
                                var392.warn("Cloud sync state unreadable, starting fresh: {}", var51);
                                int var158 = var157 | -1610591045;
                                int var159 = var158 - 1291638017;
                                var149 = var159 ^ -665894755;
                                Integer var52 = var149;
                                if (var52 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            int var393 = var149 + 1;
                            int var394 = var149 * var393;
                            var5 = var149 + 2;
                            int var395 = var394 * var5;
                            var5 = var149 + 3;
                            int var396 = var395 * var5;
                            int var397 = var396 & 7;
                            if (var397 != 0) {
                                break label358;
                            }

                            try {
                                var379 = this.I;
                                var149 -= 594894882;
                                var149 -= -296093096;
                                var149 ^= 159635602;
                            } catch (RuntimeException var32) {
                                int var163 = t;
                                int var164 = var163 ^ 910571462;
                                Throwable var398 = k(var32);
                                Exception var53 = (Exception)var398;
                                Logger var399 = g;
                                String var54 = var53.toString();
                                var399.warn("Cloud sync state unreadable, starting fresh: {}", var54);
                                int var165 = var164 | -1610591045;
                                int var166 = var165 - 1291638017;
                                var149 = var166 ^ -665894755;
                                Integer var55 = var149;
                                if (var55 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            var5 = var149 + 1;
                            var5 = var149 * var5;
                            int var495 = var149 + 2;
                            var5 *= var495;
                            var495 = var149 + 3;
                            var5 *= var495;
                            var5 &= 7;
                            if (var5 != 0) {
                                break label358;
                            }

                            try {
                                Charset var467 = StandardCharsets.UTF_8;
                                var149 &= -518519013;
                                var149 -= 768916304;
                                var149 ^= 25443664;
                                var403 = Files.readString(var379, var467);
                                var149 *= 301783339;
                                var149 |= 433438553;
                                var149 |= -378103281;
                                var149 ^= -1058289340;
                            } catch (RuntimeException | IOException var31) {
                                int var170 = t;
                                int var171 = var170 ^ 910571462;
                                Throwable var401 = k(var31);
                                Exception var56 = (Exception)var401;
                                Logger var402 = g;
                                String var57 = var56.toString();
                                var402.warn("Cloud sync state unreadable, starting fresh: {}", var57);
                                int var172 = var171 | -1610591045;
                                int var173 = var172 - 1291638017;
                                var149 = var173 ^ -665894755;
                                Integer var58 = var149;
                                if (var58 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            Integer var468 = var149;
                            if (var468 == null) {
                                break label358;
                            }

                            try {
                                var406 = JsonParser.parseString(var403);
                                var149 *= -1153503897;
                                var149 |= 245500351;
                                var149 >>= 7;
                                var149 &= 1344633806;
                                var149 ^= 1628485301;
                            } catch (RuntimeException var30) {
                                int var181 = t;
                                int var182 = var181 ^ 910571462;
                                Throwable var404 = k(var30);
                                Exception var59 = (Exception)var404;
                                Logger var405 = g;
                                String var60 = var59.toString();
                                var405.warn("Cloud sync state unreadable, starting fresh: {}", var60);
                                int var183 = var182 | -1610591045;
                                int var184 = var183 - 1291638017;
                                var149 = var184 ^ -665894755;
                                Integer var61 = var149;
                                if (var61 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            var468 = var149;
                            if (var468 == null) {
                                break label358;
                            }

                            try {
                                var409 = var406.getAsJsonObject();
                                var149 *= 193101183;
                                var149 ^= 494354697;
                            } catch (RuntimeException var29) {
                                int var190 = t;
                                int var191 = var190 ^ 910571462;
                                Throwable var407 = k(var29);
                                Exception var62 = (Exception)var407;
                                Logger var408 = g;
                                String var63 = var62.toString();
                                var408.warn("Cloud sync state unreadable, starting fresh: {}", var63);
                                int var192 = var191 | -1610591045;
                                int var193 = var192 - 1291638017;
                                var149 = var193 ^ -665894755;
                                Integer var64 = var149;
                                if (var64 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            long var470 = var149;
                            var7 = var470 + 1L;
                            var7 = var470 * var7;
                            long var471 = var7 & 1L;
                            long var547;
                            int var472 = (var547 = var471 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                            if (var472 != 0) {
                                break label358;
                            }

                            label362: {
                                label363: {
                                    try {
                                        var412 = var409;
                                        var149 &= -1536311162;
                                        var149 &= 1777515263;
                                        var149 ^= 923703139;
                                        boolean var473 = var409.has("revision");
                                        var149 -= -544486788;
                                        var149 ^= -1885103224;
                                        if (!var473) {
                                            break label363;
                                        }
                                    } catch (RuntimeException var28) {
                                        int var196 = t;
                                        int var197 = var196 ^ 910571462;
                                        Throwable var410 = k(var28);
                                        Exception var65 = (Exception)var410;
                                        Logger var411 = g;
                                        String var66 = var65.toString();
                                        var411.warn("Cloud sync state unreadable, starting fresh: {}", var66);
                                        int var198 = var197 | -1610591045;
                                        int var199 = var198 - 1291638017;
                                        var149 = var199 ^ -665894755;
                                        Integer var67 = var149;
                                        if (var67 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    var149 -= 1750596347;
                                    var149 ^= 1543189150;

                                    try {
                                        var149 *= 1480686911;
                                        var149 <<= 27;
                                        var149 ^= -1822366986;
                                    } catch (RuntimeException var27) {
                                        int var207 = t;
                                        int var208 = var207 ^ 910571462;
                                        Throwable var413 = k(var27);
                                        Exception var68 = (Exception)var413;
                                        Logger var414 = g;
                                        String var69 = var68.toString();
                                        var414.warn("Cloud sync state unreadable, starting fresh: {}", var69);
                                        int var209 = var208 | -1610591045;
                                        int var210 = var209 - 1291638017;
                                        var149 = var210 ^ -665894755;
                                        Integer var70 = var149;
                                        if (var70 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    var472 = var149 + 1;
                                    var472 = var149 * var472;
                                    var495 = var149 + 2;
                                    var472 *= var495;
                                    var495 = var149 + 3;
                                    var472 *= var495;
                                    var472 &= 7;
                                    if (var472 != 0) {
                                        break label358;
                                    }

                                    try {
                                        var479 = var412.get("revision");
                                        var149 |= -2029833282;
                                        var149 -= -1922699046;
                                        var149 ^= 223279065;
                                    } catch (RuntimeException var26) {
                                        int var214 = t;
                                        int var215 = var214 ^ 910571462;
                                        Throwable var415 = k(var26);
                                        Exception var71 = (Exception)var415;
                                        Logger var416 = g;
                                        String var72 = var71.toString();
                                        var416.warn("Cloud sync state unreadable, starting fresh: {}", var72);
                                        int var216 = var215 | -1610591045;
                                        int var217 = var216 - 1291638017;
                                        var149 = var217 ^ -665894755;
                                        Integer var73 = var149;
                                        if (var73 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    Integer var499 = var149;
                                    if (var499 == null) {
                                        break label358;
                                    }

                                    try {
                                        var480 = var479.getAsLong();
                                    } catch (RuntimeException var25) {
                                        int var221 = t;
                                        int var222 = var221 ^ 910571462;
                                        Throwable var417 = k(var25);
                                        Exception var74 = (Exception)var417;
                                        Logger var418 = g;
                                        String var75 = var74.toString();
                                        var418.warn("Cloud sync state unreadable, starting fresh: {}", var75);
                                        int var223 = var222 | -1610591045;
                                        int var224 = var223 - 1291638017;
                                        var149 = var224 ^ -665894755;
                                        Integer var76 = var149;
                                        if (var76 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }
                                    var149 = switch (var149) {
                                        case 884012285 -> {
                                            var149 ^= -429838213;
                                            var149 += -1117025784;
                                            var149 *= 1852881947;
                                            yield var149 ^ -1681594770;
                                        }
                                        default -> var149 ^ 1260965363;
                                        case 1896115516 -> var149 ^ -1104276081;
                                    };
                                    var481 = var480;
                                    var149 *= -2024140665;
                                    var149 ^= 1145892345;
                                    break label362;
                                }

                                var149 += 759435904;
                                var149 &= 51212401;
                                var149 |= 1087725231;
                                var149 ^= 375801560;

                                try {
                                    var149 &= 1174359516;
                                    var149 ^= 1768929184;
                                } catch (RuntimeException var24) {
                                    int var235 = t;
                                    int var236 = var235 ^ 910571462;
                                    Throwable var419 = k(var24);
                                    Exception var77 = (Exception)var419;
                                    Logger var420 = g;
                                    String var78 = var77.toString();
                                    var420.warn("Cloud sync state unreadable, starting fresh: {}", var78);
                                    int var237 = var236 | -1610591045;
                                    int var238 = var237 - 1291638017;
                                    var149 = var238 ^ -665894755;
                                    Integer var79 = var149;
                                    if (var79 == null) {
                                        break label358;
                                    }
                                    break label372;
                                }

                                Integer var526 = var149;
                                if (var526 == null) {
                                    break label358;
                                }

                                var481 = 0L;
                                switch (var149) {
                                    case -656235641:
                                    default:
                                        var149 ^= 178095267;
                                        break;
                                    case 706318770:
                                        var149 ^= -34349364;
                                        break;
                                    case 752664500:
                                        var149 += 776302491;
                                        var149 &= -302620632;
                                        var149 -= -2112849525;
                                        var149 ^= 1486455688;
                                }
                            }

                            try {
                                this.HO = var481;
                            } catch (RuntimeException var23) {
                                int var244 = t;
                                int var245 = var244 ^ 910571462;
                                Throwable var421 = k(var23);
                                Exception var80 = (Exception)var421;
                                Logger var422 = g;
                                String var81 = var80.toString();
                                var422.warn("Cloud sync state unreadable, starting fresh: {}", var81);
                                int var246 = var245 | -1610591045;
                                int var247 = var246 - 1291638017;
                                var149 = var247 ^ -665894755;
                                Integer var82 = var149;
                                if (var82 == null) {
                                    break label358;
                                }
                                break label372;
                            }
                            var149 = switch (var149) {
                                case -1618467339 -> {
                                    var149 *= 865763861;
                                    var149 <<= 17;
                                    var149 ^= -340222083;
                                    yield var149 ^ -624698659;
                                }
                                case 2030637534 -> var149 ^ 823073098;
                                default -> var149 ^ 1204999360;
                            };

                            try {
                                var482 = var412.has("synced");
                                var149 *= -216822073;
                                var149 |= -139507991;
                                var149 *= 2034954487;
                                var149 ^= 732615299;
                            } catch (RuntimeException var22) {
                                int var252 = t;
                                int var253 = var252 ^ 910571462;
                                Throwable var423 = k(var22);
                                Exception var83 = (Exception)var423;
                                Logger var424 = g;
                                String var84 = var83.toString();
                                var424.warn("Cloud sync state unreadable, starting fresh: {}", var84);
                                int var254 = var253 | -1610591045;
                                int var255 = var254 - 1291638017;
                                var149 = var255 ^ -665894755;
                                Integer var85 = var149;
                                if (var85 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            long var500 = var149;
                            var8 = var500 + 1L;
                            var8 = var500 * var8;
                            long var10 = var500 + 2L;
                            var8 *= var10;
                            long var501 = var500 + 3L;
                            var8 *= var501;
                            long var502 = var8 & 7L;
                            long var548;
                            var495 = (var548 = var502 - 0L) == 0L ? 0 : (var548 < 0L ? -1 : 1);
                            if (var495 != 0) {
                                break label358;
                            }

                            label364: {
                                label373: {
                                    try {
                                        if (!var482) {
                                            break label373;
                                        }
                                    } catch (RuntimeException var21) {
                                        int var260 = t;
                                        int var261 = var260 ^ 910571462;
                                        Throwable var425 = k(var21);
                                        Exception var86 = (Exception)var425;
                                        Logger var426 = g;
                                        String var87 = var86.toString();
                                        var426.warn("Cloud sync state unreadable, starting fresh: {}", var87);
                                        int var262 = var261 | -1610591045;
                                        int var263 = var262 - 1291638017;
                                        var149 = var263 ^ -665894755;
                                        Integer var88 = var149;
                                        if (var88 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }
                                    var149 = switch (var149) {
                                        default -> var149 ^ -1380238407;
                                        case 797944652 -> {
                                            var149 -= -1393105079;
                                            var149 += -881418087;
                                            var149 <<= 30;
                                            yield var149 ^ 234221000;
                                        }
                                        case 1248813939 -> var149 ^ 1098172855;
                                    };

                                    try {
                                        var149 ^= 1748805521;
                                        var149 -= 1665202466;
                                        var149 *= -522846989;
                                        var149 *= 767594361;
                                        var149 ^= -1545156628;
                                        JsonElement var483 = var412.get("synced");
                                        var149 |= 417993765;
                                        var149 |= 1482811774;
                                        var149 ^= 1872335410;
                                        var484 = var483.getAsString();
                                        var149 += 1018484559;
                                        var149 ^= 1107732043;
                                    } catch (RuntimeException var20) {
                                        int var268 = t;
                                        int var269 = var268 ^ 910571462;
                                        Throwable var427 = k(var20);
                                        Exception var89 = (Exception)var427;
                                        Logger var428 = g;
                                        String var90 = var89.toString();
                                        var428.warn("Cloud sync state unreadable, starting fresh: {}", var90);
                                        int var270 = var269 | -1610591045;
                                        int var271 = var270 - 1291638017;
                                        var149 = var271 ^ -665894755;
                                        Integer var91 = var149;
                                        if (var91 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    var485 = var484;
                                    var149 *= -804132211;
                                    var149 ^= -491234660;
                                    break label364;
                                }

                                var149 ^= -1655106247;
                                var149 ^= 665842074;

                                try {
                                    var149 &= 1326266108;
                                    var149 >>>= 29;
                                    var149 ^= 295106247;
                                } catch (RuntimeException var19) {
                                    int var286 = t;
                                    int var287 = var286 ^ 910571462;
                                    Throwable var429 = k(var19);
                                    Exception var92 = (Exception)var429;
                                    Logger var430 = g;
                                    String var93 = var92.toString();
                                    var430.warn("Cloud sync state unreadable, starting fresh: {}", var93);
                                    int var288 = var287 | -1610591045;
                                    int var289 = var288 - 1291638017;
                                    var149 = var289 ^ -665894755;
                                    Integer var94 = var149;
                                    if (var94 == null) {
                                        break label358;
                                    }
                                    break label372;
                                }

                                var485 = "";
                                switch (var149) {
                                    case -1081686190:
                                        var149 ^= -997321135;
                                        break;
                                    case 295106247:
                                        var149 &= -2108324764;
                                        var149 |= -79788689;
                                        var149 -= 1486282742;
                                        var149 |= 26012676;
                                        var149 ^= 287446282;
                                        break;
                                    case 602562591:
                                    default:
                                        var149 ^= -114024204;
                                }
                            }

                            var495 = var149 + 1;
                            var495 = var149 * var495;
                            int var527 = var149 + 2;
                            var495 *= var527;
                            int var528 = var149 + 3;
                            var495 *= var528;
                            var495 &= 7;
                            if (var495 != 0) {
                                break label358;
                            }

                            try {
                                this.q = var485;
                                var149 >>= 7;
                                var149 *= -2087779267;
                                var149 ^= -223888010;
                            } catch (RuntimeException var18) {
                                int var297 = t;
                                int var298 = var297 ^ 910571462;
                                Throwable var431 = k(var18);
                                Exception var95 = (Exception)var431;
                                Logger var432 = g;
                                String var96 = var95.toString();
                                var432.warn("Cloud sync state unreadable, starting fresh: {}", var96);
                                int var299 = var298 | -1610591045;
                                int var300 = var299 - 1291638017;
                                var149 = var300 ^ -665894755;
                                Integer var97 = var149;
                                if (var97 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            Integer var486 = var149;
                            if (var486 == null) {
                                break label358;
                            }

                            try {
                                var487 = var412.has("lastSyncAt");
                                var149 |= -759920350;
                                var149 -= -550749804;
                                var149 *= 428745201;
                                var149 |= 118517666;
                                var149 ^= 866289353;
                            } catch (RuntimeException var17) {
                                int var304 = t;
                                int var305 = var304 ^ 910571462;
                                Throwable var433 = k(var17);
                                Exception var98 = (Exception)var433;
                                Logger var434 = g;
                                String var99 = var98.toString();
                                var434.warn("Cloud sync state unreadable, starting fresh: {}", var99);
                                int var306 = var305 | -1610591045;
                                int var307 = var306 - 1291638017;
                                var149 = var307 ^ -665894755;
                                Integer var100 = var149;
                                if (var100 == null) {
                                    break label358;
                                }
                                break label372;
                            }

                            long var509 = var149;
                            var8 = var509 + 1L;
                            var8 = var509 * var8;
                            long var510 = var8 & 1L;
                            long var549;
                            var495 = (var549 = var510 - 0L) == 0L ? 0 : (var549 < 0L ? -1 : 1);
                            if (var495 != 0) {
                                break label358;
                            }

                            label366: {
                                label367: {
                                    try {
                                        if (!var487) {
                                            break label367;
                                        }
                                    } catch (RuntimeException var16) {
                                        int var313 = t;
                                        int var314 = var313 ^ 910571462;
                                        Throwable var435 = k(var16);
                                        Exception var101 = (Exception)var435;
                                        Logger var436 = g;
                                        String var102 = var101.toString();
                                        var436.warn("Cloud sync state unreadable, starting fresh: {}", var102);
                                        int var315 = var314 | -1610591045;
                                        int var316 = var315 - 1291638017;
                                        var149 = var316 ^ -665894755;
                                        Integer var103 = var149;
                                        if (var103 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    var149 <<= 22;
                                    var149 |= 235613673;
                                    var149 >>>= 14;
                                    var149 &= -1587868172;
                                    var149 ^= -1413782076;

                                    try {
                                        var149 *= 575924789;
                                        var149 ^= 757275476;
                                        var439 = var412.get("lastSyncAt");
                                        var149 |= -1848133193;
                                        var149 |= 545296286;
                                        var149 ^= -1973122986;
                                    } catch (RuntimeException var15) {
                                        int var322 = t;
                                        int var323 = var322 ^ 910571462;
                                        Throwable var437 = k(var15);
                                        Exception var104 = (Exception)var437;
                                        Logger var438 = g;
                                        String var105 = var104.toString();
                                        var438.warn("Cloud sync state unreadable, starting fresh: {}", var105);
                                        int var324 = var323 | -1610591045;
                                        int var325 = var324 - 1291638017;
                                        var149 = var325 ^ -665894755;
                                        Integer var106 = var149;
                                        if (var106 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    var486 = var149;
                                    if (var486 == null) {
                                        break label358;
                                    }

                                    try {
                                        var442 = var439.getAsLong();
                                        var149 ^= 1941558566;
                                        var149 += -1328303752;
                                        var149 |= 1597241917;
                                        var149 ^= -311843802;
                                    } catch (RuntimeException var14) {
                                        int var331 = t;
                                        int var332 = var331 ^ 910571462;
                                        Throwable var440 = k(var14);
                                        Exception var107 = (Exception)var440;
                                        Logger var441 = g;
                                        String var108 = var107.toString();
                                        var441.warn("Cloud sync state unreadable, starting fresh: {}", var108);
                                        int var333 = var332 | -1610591045;
                                        int var334 = var333 - 1291638017;
                                        var149 = var334 ^ -665894755;
                                        Integer var109 = var149;
                                        if (var109 == null) {
                                            break label358;
                                        }
                                        break label372;
                                    }

                                    long var512 = var149;
                                    var8 = var512 + 1L;
                                    var8 = var512 * var8;
                                    var10 = var512 + 2L;
                                    var8 *= var10;
                                    long var513 = var512 + 3L;
                                    var8 *= var513;
                                    long var514 = var8 & 7L;
                                    long var550;
                                    var495 = (var550 = var514 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                                    if (var495 != 0) {
                                        break label358;
                                    }

                                    var443 = var442;
                                    var149 *= -332678719;
                                    var149 |= 1262149653;
                                    var149 <<= 29;
                                    var149 ^= -1412461325;
                                    break label366;
                                }

                                var149 *= -1829722175;
                                var149 >>>= 29;
                                var149 += 687629075;
                                var149 -= 1106325669;
                                var149 ^= 1294854614;
                                Integer var516 = var149;
                                if (var516 == null) {
                                    break label358;
                                }

                                try {
                                    var149 -= -599197630;
                                    var149 *= -206061381;
                                    var149 ^= 1225138919;
                                } catch (RuntimeException var13) {
                                    int var348 = t;
                                    int var349 = var348 ^ 910571462;
                                    Throwable var444 = k(var13);
                                    Exception var110 = (Exception)var444;
                                    Logger var445 = g;
                                    String var111 = var110.toString();
                                    var445.warn("Cloud sync state unreadable, starting fresh: {}", var111);
                                    int var350 = var349 | -1610591045;
                                    int var351 = var350 - 1291638017;
                                    var149 = var351 ^ -665894755;
                                    Integer var112 = var149;
                                    if (var112 == null) {
                                        break label358;
                                    }
                                    break label372;
                                }

                                long var517 = var149;
                                var8 = var517 + 1L;
                                var8 = var517 * var8;
                                var10 = var517 + 2L;
                                var8 *= var10;
                                long var518 = var517 + 3L;
                                var8 *= var518;
                                long var519 = var8 & 7L;
                                long var551;
                                int var520 = (var551 = var519 - 0L) == 0L ? 0 : (var551 < 0L ? -1 : 1);
                                if (var520 != 0) {
                                    break label358;
                                }

                                var443 = 0L;
                                var149 += -1734186460;
                                var149 += 1472794667;
                                var149 ^= 362974423;
                            }

                            try {
                                this.p = var443;
                                var149 -= 651475272;
                                var149 >>>= 29;
                                var149 &= 1042195272;
                                var149 &= 1565529934;
                                var149 ^= 988156171;
                                break label355;
                            } catch (RuntimeException var12) {
                                int var357 = t;
                                int var358 = var357 ^ 910571462;
                                Throwable var446 = k(var12);
                                Exception var113 = (Exception)var446;
                                Logger var447 = g;
                                String var114 = var113.toString();
                                var447.warn("Cloud sync state unreadable, starting fresh: {}", var114);
                                int var359 = var358 | -1610591045;
                                int var360 = var359 - 1291638017;
                                var149 = var360 ^ -665894755;
                                Integer var115 = var149;
                                if (var115 == null) {
                                    break label358;
                                }
                            }
                        }

                        this.HO = 0L;
                        this.q = "";
                        switch (var149) {
                            case -299776625:
                                var149 ^= 201425856;
                                break label360;
                            case 1881333539:
                                var149 &= -628427266;
                                var149 ^= 1264520985;
                                var149 <<= 25;
                                var149 ^= -494343943;
                                break label360;
                            case 1913693266:
                            default:
                                var149 ^= -1257432180;
                                break label360;
                        }
                    }

                    Integer var116 = var149;
                    if (var116 == null) {
                        break label358;
                    }

                    var149 >>>= 16;
                    var149 ^= 211389343;
                    var149 += 1997231487;
                    var149 ^= 388886017;
                }

                Integer var117 = var149;
                if (var117 != null) {
                    return;
                }
                break label358;
            }

            var149 ^= -760203169;
            var149 ^= -519096946;
            var149 *= -1713322837;
            var149 += 1202338188;
            var149 ^= -268375075;
            int var448 = var149 + 1;
            var448 = var149 * var448;
            var448 &= 1;
            if (var448 == 0) {
                return;
            }
        }

        RuntimeException var118 = new RuntimeException();
        throw var118;
    }

    private void G(int var1) {
        boolean var167 = false;
        String var168 = null;
        Path var171 = null;
        Path var190 = null;
        java.nio.file.Path var203 = null;
        Path var207 = null;
        Path var229 = null;
        java.nio.file.Path var230 = null;
        String var231 = null;
        CopyOption[] var249 = null;
        CopyOption var270 = null;
        IOException var4 = null;
        JsonObject var5 = new JsonObject();
        JsonObject var166 = var5;
        long var6 = this.HO;
        Long var177 = var6;
        var5.addProperty("revision", var177);
        String var178 = this.q;
        var5.addProperty("synced", var178);
        long var179 = this.p;
        int var3 = var1 * 147418393;
        var3 &= -2128539054;
        var3 ^= 1218518776;
        var3 ^= 465415274;
        Integer var8 = var3;
        label228:
        if (var8 != null) {
            Long var180 = var179;
            var5.addProperty("lastSyncAt", var180);
            var3 &= 932880489;
            var3 ^= 2098463723;

            label246: {
                label247: {
                    Throwable var2;
                    label248: {
                        try {
                            var3 |= -888900970;
                            var3 &= -1512452333;
                            var3 ^= 1992154606;
                        } catch (Throwable var27) {
                            var2 = var27;
                            int var45 = t;
                            int var46 = var45 ^ 750865490;
                            var167 = var27 instanceof IOException;
                            int var47 = var46 + -1917973078;
                            var3 = var47 ^ -117367422;
                            int var181 = var3 + 1;
                            int var182 = var3 * var181;
                            int var183 = var182 & 1;
                            if (var183 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        long var184 = var3;
                        long var252 = var184 + 1L;
                        long var253 = var184 * var252;
                        var184 = var253 & 1L;
                        long var287;
                        int var186 = (var287 = var184 - 0L) == 0L ? 0 : (var287 < 0L ? -1 : 1);
                        if (var186 != 0) {
                            break label228;
                        }

                        try {
                            var190 = this.I;
                            var3 |= 1819989598;
                            var3 &= -1769052844;
                            var3 ^= 1763060524;
                        } catch (Throwable var26) {
                            var2 = var26;
                            int var52 = t;
                            int var53 = var52 ^ 750865490;
                            var167 = var26 instanceof IOException;
                            int var54 = var53 + -1917973078;
                            var3 = var54 ^ -117367422;
                            int var187 = var3 + 1;
                            int var188 = var3 * var187;
                            int var189 = var188 & 1;
                            if (var189 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        int var7 = var3 + 1;
                        var7 = var3 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label228;
                        }

                        try {
                            var229 = this.I;
                            var3 &= 1841094202;
                            var3 &= 1284345164;
                            var3 ^= -1267640124;
                        } catch (Throwable var25) {
                            var2 = var25;
                            int var58 = t;
                            int var59 = var58 ^ 750865490;
                            var167 = var25 instanceof IOException;
                            int var60 = var59 + -1917973078;
                            var3 = var60 ^ -117367422;
                            int var191 = var3 + 1;
                            int var192 = var3 * var191;
                            int var193 = var192 & 1;
                            if (var193 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        long var254 = var3;
                        long var10 = var254 + 1L;
                        var10 = var254 * var10;
                        long var12 = var254 + 2L;
                        var10 *= var12;
                        long var255 = var254 + 3L;
                        var10 *= var255;
                        long var256 = var10 & 7L;
                        long var288;
                        int var257 = (var288 = var256 - 0L) == 0L ? 0 : (var288 < 0L ? -1 : 1);
                        if (var257 != 0) {
                            break label228;
                        }

                        try {
                            var230 = var229.getFileName();
                        } catch (Throwable var24) {
                            var2 = var24;
                            int var64 = t;
                            int var65 = var64 ^ 750865490;
                            var167 = var24 instanceof IOException;
                            int var66 = var65 + -1917973078;
                            var3 = var66 ^ -117367422;
                            int var194 = var3 + 1;
                            int var195 = var3 * var194;
                            int var196 = var195 & 1;
                            if (var196 != 0) {
                                break label228;
                            }
                            break label248;
                        }
                        var3 = switch (var3) {
                            case -117877556 -> {
                                var3 += 1048994471;
                                var3 *= -1163606907;
                                var3 |= -1170827227;
                                var3 ^= -467290660;
                                yield var3 ^ 953942134;
                            }
                            case 122075273 -> var3 ^ -1990942850;
                            default -> var3 ^ -1913089256;
                        };
                        var257 = var3 + 1;
                        var257 = var3 * var257;
                        var257 &= 1;
                        if (var257 != 0) {
                            break label228;
                        }

                        try {
                            var231 = String.valueOf(var230);
                            var3 += -1296137203;
                            var3 <<= 14;
                            var3 += -84921898;
                            var3 ^= -301133213;
                        } catch (Throwable var23) {
                            var2 = var23;
                            int var72 = t;
                            int var73 = var72 ^ 750865490;
                            var167 = var23 instanceof IOException;
                            int var74 = var73 + -1917973078;
                            var3 = var74 ^ -117367422;
                            int var197 = var3 + 1;
                            int var198 = var3 * var197;
                            int var199 = var198 & 1;
                            if (var199 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        var257 = var3 + 1;
                        var257 = var3 * var257;
                        var257 &= 1;
                        if (var257 != 0) {
                            break label228;
                        }

                        try {
                            String var232 = var231 + ".tmp";
                            var3 ^= -1112564318;
                            var3 *= 243366913;
                            var3 ^= -107276912;
                            var203 = var190.resolveSibling(var232);
                            var3 <<= 23;
                            var3 &= 108499867;
                            var3 ^= -1508003732;
                        } catch (Throwable var22) {
                            var2 = var22;
                            int var79 = t;
                            int var80 = var79 ^ 750865490;
                            var167 = var22 instanceof IOException;
                            int var81 = var80 + -1917973078;
                            var3 = var81 ^ -117367422;
                            int var200 = var3 + 1;
                            int var201 = var3 * var200;
                            int var202 = var201 & 1;
                            if (var202 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        var7 = var3 + 1;
                        var7 = var3 * var7;
                        var7 &= 1;
                        if (var7 != 0) {
                            break label228;
                        }

                        try {
                            var207 = var203;
                        } catch (Throwable var21) {
                            var2 = var21;
                            int var88 = t;
                            int var89 = var88 ^ 750865490;
                            var167 = var21 instanceof IOException;
                            int var90 = var89 + -1917973078;
                            var3 = var90 ^ -117367422;
                            int var204 = var3 + 1;
                            int var205 = var3 * var204;
                            int var206 = var205 & 1;
                            if (var206 != 0) {
                                break label228;
                            }
                            break label248;
                        }
                        var3 = switch (var3) {
                            case -1541558164 -> {
                                var3 >>= 30;
                                var3 -= -1017321543;
                                yield var3 ^ 1451074688;
                            }
                            case 1386963778 -> var3 ^ -1123200942;
                            default -> var3 ^ 726738845;
                        };
                        long var236 = var3;
                        long var9 = var236 + 1L;
                        var9 = var236 * var9;
                        long var11 = var236 + 2L;
                        var9 *= var11;
                        long var237 = var236 + 3L;
                        var9 *= var237;
                        long var238 = var9 & 7L;
                        long var289;
                        var7 = (var289 = var238 - 0L) == 0L ? 0 : (var289 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label228;
                        }

                        try {
                            var168 = Zx.n(var166);
                        } catch (Throwable var20) {
                            var2 = var20;
                            int var94 = t;
                            int var95 = var94 ^ 750865490;
                            var167 = var20 instanceof IOException;
                            int var96 = var95 + -1917973078;
                            var3 = var96 ^ -117367422;
                            int var208 = var3 + 1;
                            int var209 = var3 * var208;
                            int var210 = var209 & 1;
                            if (var210 != 0) {
                                break label228;
                            }
                            break label248;
                        }
                        var3 = switch (var3) {
                            default -> var3 ^ 812882128;
                            case -933425237 -> var3 ^ 447859391;
                            case 1792982213 -> {
                                var3 *= -1302236719;
                                var3 *= 230290955;
                                yield var3 ^ -1850688504;
                            }
                        };
                        var7 = var3 + 1;
                        var7 = var3 * var7;
                        var257 = var3 + 2;
                        var7 *= var257;
                        var257 = var3 + 3;
                        var7 *= var257;
                        var7 &= 7;
                        if (var7 != 0) {
                            break label228;
                        }

                        try {
                            Charset var245 = StandardCharsets.UTF_8;
                            var3 *= -160514991;
                            var3 *= 221699057;
                            var3 ^= -1463260821;
                            OpenOption[] var266 = new OpenOption[0];
                            var3 >>= 21;
                            var3 ^= -699338676;
                            Path var169 = Files.writeString(var207, var168, var245, var266);
                            var3 ^= 1155034053;
                            var3 ^= -1357964883;
                            var3 &= -843821615;
                            var3 ^= -1436280022;
                            var3 ^= -1752709951;
                        } catch (Throwable var19) {
                            var2 = var19;
                            int var100 = t;
                            int var101 = var100 ^ 750865490;
                            var167 = var19 instanceof IOException;
                            int var102 = var101 + -1917973078;
                            var3 = var102 ^ -117367422;
                            int var211 = var3 + 1;
                            int var212 = var3 * var211;
                            int var213 = var212 & 1;
                            if (var213 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        Integer var170 = var3;
                        if (var170 == null) {
                            break label228;
                        }

                        try {
                            var171 = this.I;
                            var3 ^= -153579477;
                            var3 |= -1922331059;
                            var3 |= 1938561113;
                            var3 >>>= 15;
                            var3 ^= -371506045;
                        } catch (Throwable var18) {
                            var2 = var18;
                            int var113 = t;
                            int var114 = var113 ^ 750865490;
                            var167 = var18 instanceof IOException;
                            int var115 = var114 + -1917973078;
                            var3 = var115 ^ -117367422;
                            int var214 = var3 + 1;
                            int var215 = var3 * var214;
                            int var216 = var215 & 1;
                            if (var216 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        long var246 = var3;
                        var9 = var246 + 1L;
                        var9 = var246 * var9;
                        long var247 = var9 & 1L;
                        long var290;
                        var7 = (var290 = var247 - 0L) == 0L ? 0 : (var290 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            break label228;
                        }

                        try {
                            var249 = new CopyOption[1];
                            var3 >>= 2;
                            var3 &= -1719826670;
                            var3 += 793193111;
                            var3 ^= 1387572600;
                        } catch (Throwable var17) {
                            var2 = var17;
                            int var121 = t;
                            int var122 = var121 ^ 750865490;
                            var167 = var17 instanceof IOException;
                            int var123 = var122 + -1917973078;
                            var3 = var123 ^ -117367422;
                            int var217 = var3 + 1;
                            int var218 = var3 * var217;
                            int var219 = var218 & 1;
                            if (var219 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        var257 = var3 + 1;
                        var257 = var3 * var257;
                        var257 &= 1;
                        if (var257 != 0) {
                            break label228;
                        }

                        try {
                            var270 = StandardCopyOption.REPLACE_EXISTING;
                            var3 |= 1750764263;
                            var3 ^= -1048596742;
                            var3 ^= -148633191;
                        } catch (Throwable var16) {
                            var2 = var16;
                            int var128 = t;
                            int var129 = var128 ^ 750865490;
                            var167 = var16 instanceof IOException;
                            int var130 = var129 + -1917973078;
                            var3 = var130 ^ -117367422;
                            int var220 = var3 + 1;
                            int var221 = var3 * var220;
                            int var222 = var221 & 1;
                            if (var222 != 0) {
                                break label228;
                            }
                            break label248;
                        }

                        var9 = var3;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var291;
                        int var279 = (var291 = var9 - 0L) == 0L ? 0 : (var291 < 0L ? -1 : 1);
                        if (var279 != 0) {
                            break label228;
                        }

                        try {
                            var249[0] = var270;
                            var3 -= 1119766281;
                            var3 ^= 1477055992;
                            Path var176 = Files.move(var207, var171, var249);
                            break label247;
                        } catch (Throwable var15) {
                            var2 = var15;
                            int var134 = t;
                            int var135 = var134 ^ 750865490;
                            var167 = var15 instanceof IOException;
                            int var136 = var135 + -1917973078;
                            var3 = var136 ^ -117367422;
                            int var223 = var3 + 1;
                            int var224 = var3 * var223;
                            int var225 = var224 & 1;
                            if (var225 != 0) {
                                break label228;
                            }
                        }
                    }

                    if (!var167) {
                        var3 *= 1024198609;
                        var3 ^= -203662586;
                        var3 *= -1124392483;
                        var3 *= 783814785;
                        var3 ^= -1725012334;
                        Integer var175 = var3;
                        if (var175 != null) {
                            throw UncheckedExceptions.rethrow(var2);
                        }
                        break label228;
                    }
                    var3 = switch (var3) {
                        case -1533382298 -> {
                            var3 ^= -507049142;
                            yield var3 ^ -85406161;
                        }
                        default -> var3 ^ -1765678565;
                        case 1933135116 -> var3 ^ 1236905705;
                    };
                    long var172 = var3;
                    long var250 = var172 + 1L;
                    var250 = var172 * var250;
                    long var173 = var250 & 1L;
                    long var292;
                    int var174 = (var292 = var173 - 0L) == 0L ? 0 : (var292 < 0L ? -1 : 1);
                    if (var174 != 0) {
                        break label228;
                    }

                    var4 = (IOException)var2;

                    var3 = switch (var3) {
                        case -1078610941 -> {
                            var3 |= 1401872488;
                            var3 >>= 1;
                            yield var3 ^ 2143058745;
                        }
                        case -508805758 -> var3 ^ -52131318;
                        default -> var3 ^ 233283570;
                    };
                    Logger var159 = g;

                    var3 = switch (var3) {
                        case -2140962548 -> {
                            var3 -= -241329085;
                            yield var3 ^ -2040893277;
                        }
                        case -1933928871 -> var3 ^ 1265992299;
                        default -> var3 ^ -691382363;
                    };
                    String var29 = var4.toString();
                    var159.warn("Could not save cloud sync state: {}", var29);
                    var3 <<= 2;
                    var3 += -919868629;
                    var3 ^= 1406240592;
                    break label246;
                }
                var3 = switch (var3) {
                    default -> var3 ^ -1318309827;
                    case -1121514089 -> var3 ^ -234429955;
                    case -800070541 -> {
                        var3 ^= -1088235062;
                        var3 += -1841765971;
                        yield var3 ^ -1780664584;
                    }
                };
                int var30 = var3 + 1;
                var30 = var3 * var30;
                int var160 = var3 + 2;
                var30 *= var160;
                int var161 = var3 + 3;
                var30 *= var161;
                var30 &= 7;
                if (var30 != 0) {
                    break label228;
                }

                var3 |= -1364147063;
                var3 ^= 109073948;
            }

            long var35 = var3;
            long var162 = var35 + 1L;
            long var163 = var35 * var162;
            long var226 = var35 + 2L;
            long var164 = var163 * var226;
            var35 += 3L;
            long var165 = var164 * var35;
            var35 = var165 & 7L;
            long var293;
            int var38 = (var293 = var35 - 0L) == 0L ? 0 : (var293 < 0L ? -1 : 1);
            if (var38 == 0) {
                return;
            }
        }

        UnsupportedOperationException var39 = new UnsupportedOperationException();
        throw var39;
    }

    private void A(int var1) {
        Zx var240 = null;
        Path var241 = null;
        Zx var247 = null;
        Path var248 = null;
        LinkOption[] var258 = null;
        Zx var276 = null;
        java.nio.file.Path var278 = null;
        java.nio.file.Path var285 = null;
        Zx var300 = null;
        java.nio.file.Path var301 = null;
        java.nio.file.Path var302 = null;
        String var303 = null;
        String var304 = null;
        CopyOption[] var309 = null;
        label269: {
            int var224;
            label268: {
                label267: {
                    label289: {
                        Throwable var2;
                        int var5;
                        label290: {
                            try {
                                Object var4 = null;
                                var224 = var1 - -1648764349;
                                var224 <<= 2;
                                var224 ^= -951445795;
                                var240 = this.Sq;
                                var224 -= 931430011;
                                var224 >>>= 30;
                                var224 ^= -331330319;
                            } catch (Throwable var30) {
                                var2 = var30;
                                int var3 = t;
                                int var36 = var3 ^ -1174114885;
                                var5 = (var30 instanceof IOException) ? 1 : 0;
                                int var37 = var36 - -638652135;
                                int var38 = var37 >>> 7;
                                int var39 = var38 * 1086368507;
                                int var40 = var39 - 290472527;
                                var224 = var40 ^ -1387671779;
                                Integer var6 = var224;
                                if (var6 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            int var254 = var224 + 1;
                            var254 = var224 * var254;
                            var254 &= 1;
                            if (var254 != 0) {
                                break label269;
                            }

                            try {
                                var241 = var240.gY();
                                var224 &= -1627970602;
                                var224 &= -1709632426;
                                var224 *= -2088138575;
                                var224 ^= -1341215032;
                                var224 ^= 1745492372;
                                var258 = new LinkOption[0];
                            } catch (Throwable var29) {
                                var2 = var29;
                                int var48 = t;
                                int var49 = var48 ^ -1174114885;
                                var5 = (var29 instanceof IOException) ? 1 : 0;
                                int var50 = var49 - -638652135;
                                int var51 = var50 >>> 7;
                                int var52 = var51 * 1086368507;
                                int var53 = var52 - 290472527;
                                var224 = var53 ^ -1387671779;
                                Integer var257 = var224;
                                if (var257 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                default -> var224 ^ -1542909142;
                                case -84017140 -> {
                                    var224 |= 67301310;
                                    var224 -= -466719664;
                                    var224 += -1493802054;
                                    yield var224 ^ -1873126796;
                                }
                                case 253181596 -> var224 ^ 1813238162;
                            };
                            long var7 = var224;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var350;
                            int var290 = (var350 = var7 - 0L) == 0L ? 0 : (var350 < 0L ? -1 : 1);
                            if (var290 != 0) {
                                break label269;
                            }

                            try {
                                var5 = Files.isRegularFile(var241, var258) ? 1 : 0;
                                var224 &= -1028435039;
                                var224 *= 677161995;
                                var224 -= -879826258;
                                var224 *= -1728305819;
                                var224 ^= -2100992316;
                            } catch (Throwable var28) {
                                var2 = var28;
                                int var63 = t;
                                int var64 = var63 ^ -1174114885;
                                var5 = (var28 instanceof IOException) ? 1 : 0;
                                int var65 = var64 - -638652135;
                                int var66 = var65 >>> 7;
                                int var67 = var66 * 1086368507;
                                int var68 = var67 - 290472527;
                                var224 = var68 ^ -1387671779;
                                Integer var259 = var224;
                                if (var259 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            long var260 = var224;
                            long var8 = var260 + 1L;
                            var8 = var260 * var8;
                            long var10 = var260 + 2L;
                            var8 *= var10;
                            long var261 = var260 + 3L;
                            var8 *= var261;
                            long var262 = var8 & 7L;
                            long var351;
                            var254 = (var351 = var262 - 0L) == 0L ? 0 : (var351 < 0L ? -1 : 1);
                            if (var254 != 0) {
                                break label269;
                            }

                            try {
                                if (var5 == 0) {
                                    break label289;
                                }
                            } catch (Throwable var27) {
                                var2 = var27;
                                int var74 = t;
                                int var75 = var74 ^ -1174114885;
                                var5 = (var27 instanceof IOException) ? 1 : 0;
                                int var76 = var75 - -638652135;
                                int var77 = var76 >>> 7;
                                int var78 = var77 * 1086368507;
                                int var79 = var78 - 290472527;
                                var224 = var79 ^ -1387671779;
                                Integer var264 = var224;
                                if (var264 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            var224 >>= 19;
                            var224 ^= -1949024076;

                            var224 = switch (var224) {
                                default -> var224 ^ -348949453;
                                case -1949020924 -> {
                                    var224 |= -1810462400;
                                    var224 -= 896037092;
                                    yield var224 ^ 1957969371;
                                }
                                case -1329877170 -> var224 ^ 324571230;
                            };
                            long var243 = var224;
                            var7 = var243 + 1L;
                            var7 = var243 * var7;
                            var9 = var243 + 2L;
                            var7 *= var9;
                            long var244 = var243 + 3L;
                            var7 *= var244;
                            long var245 = var7 & 7L;
                            long var352;
                            var5 = (var352 = var245 - 0L) == 0L ? 0 : (var352 < 0L ? -1 : 1);
                            if (var5 != 0) {
                                break label269;
                            }

                            try {
                                var247 = this.Sq;
                                var224 >>>= 10;
                                var224 *= 782332425;
                                var224 ^= -950831106;
                            } catch (Throwable var26) {
                                var2 = var26;
                                int var85 = t;
                                int var86 = var85 ^ -1174114885;
                                var5 = (var26 instanceof IOException) ? 1 : 0;
                                int var87 = var86 - -638652135;
                                int var88 = var87 >>> 7;
                                int var89 = var88 * 1086368507;
                                int var90 = var89 - 290472527;
                                var224 = var90 ^ -1387671779;
                                Integer var265 = var224;
                                if (var265 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            var254 = var224 + 1;
                            var254 = var224 * var254;
                            var254 &= 1;
                            if (var254 != 0) {
                                break label269;
                            }

                            try {
                                var248 = var247.gY();
                                var224 <<= 24;
                                var224 ^= 1739177315;
                            } catch (Throwable var25) {
                                var2 = var25;
                                int var94 = t;
                                int var95 = var94 ^ -1174114885;
                                var5 = (var25 instanceof IOException) ? 1 : 0;
                                int var96 = var95 - -638652135;
                                int var97 = var96 >>> 7;
                                int var98 = var97 * 1086368507;
                                int var99 = var98 - 290472527;
                                var224 = var99 ^ -1387671779;
                                Integer var269 = var224;
                                if (var269 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            var254 = var224 + 1;
                            var254 = var224 * var254;
                            int var295 = var224 + 2;
                            var254 *= var295;
                            int var296 = var224 + 3;
                            var254 *= var296;
                            var254 &= 7;
                            if (var254 != 0) {
                                break label269;
                            }

                            try {
                                var276 = this.Sq;
                            } catch (Throwable var24) {
                                var2 = var24;
                                int var102 = t;
                                int var103 = var102 ^ -1174114885;
                                var5 = (var24 instanceof IOException) ? 1 : 0;
                                int var104 = var103 - -638652135;
                                int var105 = var104 >>> 7;
                                int var106 = var105 * 1086368507;
                                int var107 = var106 - 290472527;
                                var224 = var107 ^ -1387671779;
                                Integer var275 = var224;
                                if (var275 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                case -1045840541 -> {
                                    var224 >>>= 11;
                                    var224 ^= -1552215781;
                                    var224 &= 941052768;
                                    yield var224 ^ -1276432584;
                                }
                                case 250422293 -> var224 ^ 1131846722;
                                default -> var224 ^ -1647031790;
                            };

                            try {
                                var278 = var276.gY();
                            } catch (Throwable var23) {
                                var2 = var23;
                                int var112 = t;
                                int var113 = var112 ^ -1174114885;
                                var5 = (var23 instanceof IOException) ? 1 : 0;
                                int var114 = var113 - -638652135;
                                int var115 = var114 >>> 7;
                                int var116 = var115 * 1086368507;
                                int var117 = var116 - 290472527;
                                var224 = var117 ^ -1387671779;
                                Integer var277 = var224;
                                if (var277 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                case -1813500136 -> {
                                    var224 *= 1532257217;
                                    yield var224 ^ -1200625012;
                                }
                                case -1751859325 -> var224 ^ -145728862;
                                default -> var224 ^ -5203827;
                            };
                            int var297 = var224 + 1;
                            int var298 = var224 * var297;
                            int var299 = var298 & 1;
                            if (var299 != 0) {
                                break label269;
                            }

                            try {
                                var300 = this.Sq;
                            } catch (Throwable var22) {
                                var2 = var22;
                                int var120 = t;
                                int var121 = var120 ^ -1174114885;
                                var5 = (var22 instanceof IOException) ? 1 : 0;
                                int var122 = var121 - -638652135;
                                int var123 = var122 >>> 7;
                                int var124 = var123 * 1086368507;
                                int var125 = var124 - 290472527;
                                var224 = var125 ^ -1387671779;
                                Integer var279 = var224;
                                if (var279 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                case -574454655 -> var224 ^ -1759001639;
                                case -263314540 -> {
                                    var224 &= -1752999813;
                                    var224 += 576810866;
                                    var224 *= -1485111509;
                                    var224 += 117424354;
                                    yield var224 ^ 2008602458;
                                }
                                default -> var224 ^ 1149050095;
                            };
                            Integer var317 = var224;
                            if (var317 == null) {
                                break label269;
                            }

                            try {
                                var301 = var300.gY();
                                var224 |= -926622277;
                                var224 += -284484307;
                                var224 -= -1938525962;
                                var224 += 88561511;
                                var224 ^= -762994907;
                            } catch (Throwable var21) {
                                var2 = var21;
                                int var131 = t;
                                int var132 = var131 ^ -1174114885;
                                var5 = (var21 instanceof IOException) ? 1 : 0;
                                int var133 = var132 - -638652135;
                                int var134 = var133 >>> 7;
                                int var135 = var134 * 1086368507;
                                int var136 = var135 - 290472527;
                                var224 = var136 ^ -1387671779;
                                Integer var280 = var224;
                                if (var280 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            int var318 = var224 + 1;
                            int var319 = var224 * var318;
                            int var320 = var319 & 1;
                            if (var320 != 0) {
                                break label269;
                            }

                            try {
                                var302 = var301.getFileName();
                            } catch (Throwable var20) {
                                var2 = var20;
                                int var142 = t;
                                int var143 = var142 ^ -1174114885;
                                var5 = (var20 instanceof IOException) ? 1 : 0;
                                int var144 = var143 - -638652135;
                                int var145 = var144 >>> 7;
                                int var146 = var145 * 1086368507;
                                int var147 = var146 - 290472527;
                                var224 = var147 ^ -1387671779;
                                Integer var281 = var224;
                                if (var281 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                default -> var224 ^ 1032599399;
                                case -1436661816 -> var224 ^ -754513471;
                                case -434004804 -> {
                                    var224 ^= -2130551038;
                                    var224 -= -1098659863;
                                    var224 += -1113669128;
                                    yield var224 ^ -516734289;
                                }
                            };
                            var8 = var224;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            long var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var353;
                            int var324 = (var353 = var8 - 0L) == 0L ? 0 : (var353 < 0L ? -1 : 1);
                            if (var324 != 0) {
                                break label269;
                            }

                            try {
                                var303 = String.valueOf(var302);
                            } catch (Throwable var19) {
                                var2 = var19;
                                int var152 = t;
                                int var153 = var152 ^ -1174114885;
                                var5 = (var19 instanceof IOException) ? 1 : 0;
                                int var154 = var153 - -638652135;
                                int var155 = var154 >>> 7;
                                int var156 = var155 * 1086368507;
                                int var157 = var156 - 290472527;
                                var224 = var157 ^ -1387671779;
                                Integer var282 = var224;
                                if (var282 == null) {
                                    break label269;
                                }
                                break label290;
                            }
                            var224 = switch (var224) {
                                case -2029125790 -> {
                                    var224 &= 1361912824;
                                    var224 += 1666242002;
                                    var224 |= -1680988332;
                                    var224 |= -254312053;
                                    yield var224 ^ -733829611;
                                }
                                default -> var224 ^ 489493424;
                                case 291494997 -> var224 ^ 1190433984;
                            };

                            try {
                                var304 = var303 + ".before-cloud";
                                var224 ^= 1149128910;
                                var224 &= -1654272782;
                                var224 ^= 239057206;
                                var224 ^= 663499393;
                            } catch (Throwable var18) {
                                var2 = var18;
                                int var163 = t;
                                int var164 = var163 ^ -1174114885;
                                var5 = (var18 instanceof IOException) ? 1 : 0;
                                int var165 = var164 - -638652135;
                                int var166 = var165 >>> 7;
                                int var167 = var166 * 1086368507;
                                int var168 = var167 - 290472527;
                                var224 = var168 ^ -1387671779;
                                Integer var283 = var224;
                                if (var283 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            int var325 = var224 + 1;
                            int var326 = var224 * var325;
                            int var327 = var326 & 1;
                            if (var327 != 0) {
                                break label269;
                            }

                            try {
                                var285 = var278.resolveSibling(var304);
                                var224 >>>= 26;
                                var224 ^= 827267376;
                            } catch (Throwable var17) {
                                var2 = var17;
                                int var173 = t;
                                int var174 = var173 ^ -1174114885;
                                var5 = (var17 instanceof IOException) ? 1 : 0;
                                int var175 = var174 - -638652135;
                                int var176 = var175 >>> 7;
                                int var177 = var176 * 1086368507;
                                int var178 = var177 - 290472527;
                                var224 = var178 ^ -1387671779;
                                Integer var284 = var224;
                                if (var284 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            var7 = var224;
                            var9 = var7 + 1L;
                            var9 = var7 * var9;
                            long var11 = var7 + 2L;
                            var9 *= var11;
                            var7 += 3L;
                            var9 *= var7;
                            var7 = var9 & 7L;
                            long var354;
                            int var308 = (var354 = var7 - 0L) == 0L ? 0 : (var354 < 0L ? -1 : 1);
                            if (var308 != 0) {
                                break label269;
                            }

                            try {
                                var309 = new CopyOption[1];
                                var224 += -1846666602;
                                var224 *= -3320449;
                                var224 &= 1430664956;
                                var224 ^= 1910221670;
                            } catch (Throwable var16) {
                                var2 = var16;
                                int var181 = t;
                                int var182 = var181 ^ -1174114885;
                                var5 = (var16 instanceof IOException) ? 1 : 0;
                                int var183 = var182 - -638652135;
                                int var184 = var183 >>> 7;
                                int var185 = var184 * 1086368507;
                                int var186 = var185 - 290472527;
                                var224 = var186 ^ -1387671779;
                                Integer var286 = var224;
                                if (var286 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            var8 = var224;
                            var10 = var8 + 1L;
                            var10 = var8 * var10;
                            var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var355;
                            int var331 = (var355 = var8 - 0L) == 0L ? 0 : (var355 < 0L ? -1 : 1);
                            if (var331 != 0) {
                                break label269;
                            }

                            try {
                                StandardCopyOption var332 = StandardCopyOption.REPLACE_EXISTING;
                                var224 >>= 13;
                                var224 ^= -762643277;
                                var224 -= 1017873861;
                                var224 ^= -480722485;
                                var309[0] = var332;
                                var224 <<= 31;
                                var224 *= -497851579;
                                var224 ^= -1871143046;
                            } catch (Throwable var15) {
                                var2 = var15;
                                int var191 = t;
                                int var192 = var191 ^ -1174114885;
                                var5 = (var15 instanceof IOException) ? 1 : 0;
                                int var193 = var192 - -638652135;
                                int var194 = var193 >>> 7;
                                int var195 = var194 * 1086368507;
                                int var196 = var195 - 290472527;
                                var224 = var196 ^ -1387671779;
                                Integer var287 = var224;
                                if (var287 == null) {
                                    break label269;
                                }
                                break label290;
                            }

                            Integer var333 = var224;
                            if (var333 == null) {
                                break label269;
                            }

                            try {
                                Path var253 = Files.copy(var248, var285, var309);
                                var224 ^= 134628136;
                                var224 ^= -260711829;
                                var224 *= 378151581;
                                var224 ^= -1559715339;
                                break label267;
                            } catch (Throwable var14) {
                                var2 = var14;
                                int var204 = t;
                                int var205 = var204 ^ -1174114885;
                                var5 = (var14 instanceof IOException) ? 1 : 0;
                                int var206 = var205 - -638652135;
                                int var207 = var206 >>> 7;
                                int var208 = var207 * 1086368507;
                                int var209 = var208 - 290472527;
                                var224 = var209 ^ -1387671779;
                                Integer var288 = var224;
                                if (var288 == null) {
                                    break label269;
                                }
                            }
                        }

                        if (var5 == 0) {
                            var224 ^= -43838095;
                            var224 <<= 25;
                            var224 |= 528152624;
                            var224 ^= 1109820036;
                            var224 ^= 1278509371;
                            throw UncheckedExceptions.rethrow(var2);
                        }

                        var224 *= -1214611857;
                        var224 *= 2019606175;
                        var224 ^= -422562273;
                        var224 ^= 771847366;
                        Integer var249 = var224;
                        if (var249 == null) {
                            break label269;
                        }

                        IOException var237 = (IOException)var2;
                        var224 -= -1352756307;
                        var224 |= -1887669707;
                        var224 += 119471577;
                        var224 += 1930994922;
                        var224 ^= 1755962759;
                        long var250 = var224;
                        long var310 = var250 + 1L;
                        var310 = var250 * var310;
                        long var340 = var250 + 2L;
                        var310 *= var340;
                        long var251 = var250 + 3L;
                        var310 *= var251;
                        long var252 = var310 & 7L;
                        long var356;
                        int var31 = (var356 = var252 - 0L) == 0L ? 0 : (var356 < 0L ? -1 : 1);
                        if (var31 != 0) {
                            break label269;
                        }
                        var224 = switch (var224) {
                            case 47655342 -> var224 ^ -1903530586;
                            case 312311743 -> {
                                var224 &= 1696374818;
                                var224 += 2051406504;
                                yield var224 ^ 1928424179;
                            }
                            default -> var224 ^ -456875075;
                        };
                        Integer var238 = var224;
                        if (var238 == null) {
                            break label269;
                        }

                        Logger var239 = g;
                        String var33 = var237.toString();
                        var239.warn("Could not back up the local config before adopting the cloud one: {}", var33);
                        var224 -= -1386590421;
                        var224 += 517165156;
                        var224 ^= 579915013;
                        break label268;
                    }

                    var224 ^= 1144243471;
                    var224 ^= -1930859887;
                }

                var224 += 1920223951;
                var224 -= -1547006523;
                var224 ^= 748567677;
            }

            Integer var34 = var224;
            if (var34 != null) {
                return;
            }
        }

        AssertionError var35 = new AssertionError();
        throw var35;
    }

    private Path yv(int var1) {
        int var3 = System.identityHashCode(this);
        Zx var4 = this.Sq;
        Integer var12 = var3;
        if (var12 != null) {
            int var9 = switch (var1) {
                case -2028572450 -> {
                    int var10 = var1 + -637337217;
                    var10 += 1378802587;
                    yield var10 ^ -2070125356;
                }
                default -> var1 ^ -552764527;
                case -73334348 -> var1 ^ -193027466;
            };
            int var13 = var9 + 1;
            var13 = var9 * var13;
            int var5 = var9 + 2;
            var13 *= var5;
            var5 = var9 + 3;
            var13 *= var5;
            var13 &= 7;
            if (var13 == 0) {
                Path var19 = var4.gY();
                var4 = this.Sq;
                Path var21 = var4.gY();
                Path var22 = var21.getFileName();
                String var23 = String.valueOf(var22);
                String var24 = var23 + ".undo";
                return var19.resolveSibling(var24);
            } else {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        } else {
            int var2 = var1 ^ 1729968032;
            var2 ^= 344031271;
            var2 ^= 2028416496;
            RuntimeException var8 = new RuntimeException();
            throw var8;
        }
    }

    private void a(int var1) {
        Path var125 = null;
        JsonObject var151 = null;
        String var157 = null;
        Charset var190 = null;
        OpenOption[] var203 = null;
        label144: {
            int var102;
            label146: {
                label147: {
                    Throwable var2;
                    int var5;
                    label157: {
                        try {
                            var102 = var1;
                            Object var4 = null;
                        } catch (Throwable var19) {
                            var2 = var19;
                            int var3 = t;
                            int var27 = var3 ^ 1271134235;
                            var5 = (var19 instanceof IOException) ? 1 : 0;
                            int var28 = var27 * -401889797;
                            int var29 = var28 >>> 9;
                            int var30 = var29 | 507584416;
                            int var31 = var30 + 343381774;
                            var102 = var31 ^ -155683994;
                            int var6 = var102 + 1;
                            var6 = var102 * var6;
                            int var7 = var102 + 2;
                            var6 *= var7;
                            var7 = var102 + 3;
                            var6 *= var7;
                            var6 &= 7;
                            if (var6 != 0) {
                                break label144;
                            }
                            break label157;
                        }
                        var102 = switch (var102) {
                            case -1921992245 -> var102 ^ -505519349;
                            default -> var102 ^ 200817809;
                            case 1839066777 -> {
                                var102 |= -875589878;
                                var102 |= 1248857247;
                                var102 ^= 1727860646;
                                yield var102 ^ 1543029120;
                            }
                        };

                        try {
                            var5 = var102 + -511183822;
                            var5 &= 1325509678;
                            var5 += -2013564983;
                            var5 *= -409107735;
                            var5 ^= -19751179;
                            var125 = this.yv(var5);
                        } catch (Throwable var18) {
                            var2 = var18;
                            int var38 = t;
                            int var39 = var38 ^ 1271134235;
                            var5 = (var18 instanceof IOException) ? 1 : 0;
                            int var40 = var39 * -401889797;
                            int var41 = var40 >>> 9;
                            int var42 = var41 | 507584416;
                            int var43 = var42 + 343381774;
                            var102 = var43 ^ -155683994;
                            int var138 = var102 + 1;
                            var138 = var102 * var138;
                            int var175 = var102 + 2;
                            var138 *= var175;
                            var175 = var102 + 3;
                            var138 *= var175;
                            var138 &= 7;
                            if (var138 != 0) {
                                break label144;
                            }
                            break label157;
                        }
                        var102 = switch (var102) {
                            case -755359303 -> {
                                var102 |= -1092401321;
                                var102 *= -62498739;
                                var102 -= 639814830;
                                yield var102 ^ 844413031;
                            }
                            case -472792298 -> var102 ^ 1378090603;
                            default -> var102 ^ -10134726;
                        };
                        long var143 = var102;
                        long var8 = var143 + 1L;
                        var8 = var143 * var8;
                        var143 = var8 & 1L;
                        long var209;
                        int var145 = (var209 = var143 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                        if (var145 != 0) {
                            break label144;
                        }

                        try {
                            var151 = this.cP;
                        } catch (Throwable var17) {
                            var2 = var17;
                            int var48 = t;
                            int var49 = var48 ^ 1271134235;
                            var5 = (var17 instanceof IOException) ? 1 : 0;
                            int var50 = var49 * -401889797;
                            int var51 = var50 >>> 9;
                            int var52 = var51 | 507584416;
                            int var53 = var52 + 343381774;
                            var102 = var53 ^ -155683994;
                            int var146 = var102 + 1;
                            int var147 = var102 * var146;
                            int var177 = var102 + 2;
                            int var148 = var147 * var177;
                            var177 = var102 + 3;
                            int var149 = var148 * var177;
                            int var150 = var149 & 7;
                            if (var150 != 0) {
                                break label144;
                            }
                            break label157;
                        }
                        var102 = switch (var102) {
                            default -> var102 ^ -979866057;
                            case 829688103 -> var102 ^ -2029424924;
                            case 1486986082 -> {
                                var102 ^= 149406483;
                                yield var102 ^ 437104702;
                            }
                        };
                        int var179 = var102 + 1;
                        var179 = var102 * var179;
                        var179 &= 1;
                        if (var179 != 0) {
                            break label144;
                        }

                        try {
                            var157 = Zx.n(var151);
                        } catch (Throwable var16) {
                            var2 = var16;
                            int var56 = t;
                            int var57 = var56 ^ 1271134235;
                            var5 = (var16 instanceof IOException) ? 1 : 0;
                            int var58 = var57 * -401889797;
                            int var59 = var58 >>> 9;
                            int var60 = var59 | 507584416;
                            int var61 = var60 + 343381774;
                            var102 = var61 ^ -155683994;
                            int var152 = var102 + 1;
                            int var153 = var102 * var152;
                            var179 = var102 + 2;
                            int var154 = var153 * var179;
                            var179 = var102 + 3;
                            int var155 = var154 * var179;
                            int var156 = var155 & 7;
                            if (var156 != 0) {
                                break label144;
                            }
                            break label157;
                        }
                        var102 = switch (var102) {
                            case 1246488655 -> {
                                var102 >>>= 25;
                                var102 >>= 15;
                                yield var102 ^ -1145815436;
                            }
                            default -> var102 ^ 116454104;
                            case 1790176994 -> var102 ^ -741737384;
                        };
                        long var184 = var102;
                        long var9 = var184 + 1L;
                        var9 = var184 * var9;
                        long var11 = var184 + 2L;
                        var9 *= var11;
                        long var185 = var184 + 3L;
                        var9 *= var185;
                        long var186 = var9 & 7L;
                        long var210;
                        var179 = (var210 = var186 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                        if (var179 != 0) {
                            break label144;
                        }

                        try {
                            var190 = StandardCharsets.UTF_8;
                            var102 += 312447810;
                            var102 += -2005133833;
                            var102 ^= -285959365;
                        } catch (Throwable var15) {
                            var2 = var15;
                            int var65 = t;
                            int var66 = var65 ^ 1271134235;
                            var5 = (var15 instanceof IOException) ? 1 : 0;
                            int var67 = var66 * -401889797;
                            int var68 = var67 >>> 9;
                            int var69 = var68 | 507584416;
                            int var70 = var69 + 343381774;
                            var102 = var70 ^ -155683994;
                            int var158 = var102 + 1;
                            int var159 = var102 * var158;
                            var179 = var102 + 2;
                            int var160 = var159 * var179;
                            var179 = var102 + 3;
                            int var161 = var160 * var179;
                            int var162 = var161 & 7;
                            if (var162 != 0) {
                                break label144;
                            }
                            break label157;
                        }

                        Integer var202 = var102;
                        if (var202 == null) {
                            break label144;
                        }

                        try {
                            var203 = new OpenOption[0];
                            var102 -= -1769262235;
                            var102 *= -213354439;
                            var102 >>>= 11;
                            var102 -= -1881690596;
                            var102 ^= 1970620451;
                        } catch (Throwable var14) {
                            var2 = var14;
                            int var74 = t;
                            int var75 = var74 ^ 1271134235;
                            var5 = (var14 instanceof IOException) ? 1 : 0;
                            int var76 = var75 * -401889797;
                            int var77 = var76 >>> 9;
                            int var78 = var77 | 507584416;
                            int var79 = var78 + 343381774;
                            var102 = var79 ^ -155683994;
                            int var163 = var102 + 1;
                            int var164 = var102 * var163;
                            var179 = var102 + 2;
                            int var165 = var164 * var179;
                            var179 = var102 + 3;
                            int var166 = var165 * var179;
                            int var167 = var166 & 7;
                            if (var167 != 0) {
                                break label144;
                            }
                            break label157;
                        }

                        Integer var207 = var102;
                        if (var207 == null) {
                            break label144;
                        }

                        try {
                            Path var133 = Files.writeString(var125, var157, var190, var203);
                            break label147;
                        } catch (Throwable var13) {
                            var2 = var13;
                            int var85 = t;
                            int var86 = var85 ^ 1271134235;
                            var5 = (var13 instanceof IOException) ? 1 : 0;
                            int var87 = var86 * -401889797;
                            int var88 = var87 >>> 9;
                            int var89 = var88 | 507584416;
                            int var90 = var89 + 343381774;
                            var102 = var90 ^ -155683994;
                            int var168 = var102 + 1;
                            int var169 = var102 * var168;
                            var179 = var102 + 2;
                            int var170 = var169 * var179;
                            var179 = var102 + 3;
                            int var171 = var170 * var179;
                            int var172 = var171 & 7;
                            if (var172 != 0) {
                                break label144;
                            }
                        }
                    }

                    if (var5 == 0) {
                        switch (var102) {
                            case -1904429936:
                                var102 ^= -323861514;
                                break;
                            case -998382484:
                                var102 ^= 1373435137;
                                var102 ^= 1703044124;
                                break;
                            case 1379079700:
                            default:
                                var102 ^= 848893917;
                        }

                        throw UncheckedExceptions.rethrow(var2);
                    }

                    var102 += 1880137010;
                    var102 <<= 10;
                    var102 ^= -1721183467;
                    long var126 = var102;
                    long var195 = var126 + 1L;
                    var195 = var126 * var195;
                    long var208 = var126 + 2L;
                    var195 *= var208;
                    long var127 = var126 + 3L;
                    var195 *= var127;
                    long var128 = var195 & 7L;
                    long var211;
                    var5 = (var211 = var128 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label144;
                    }

                    IOException var114 = (IOException)var2;
                    var102 >>>= 12;
                    var102 *= 240563931;
                    var102 |= -1505458282;
                    var102 ^= -559332252;
                    Logger var115 = g;
                    String var21 = var114.toString();
                    var102 |= -174482076;
                    var102 -= -1556446856;
                    var102 ^= -1597116462;
                    long var130 = var102;
                    var195 = var130 + 1L;
                    var195 = var130 * var195;
                    long var131 = var195 & 1L;
                    long var212;
                    var5 = (var212 = var131 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label144;
                    }

                    var115.warn("Could not save the undo config: {}", var21);
                    switch (var102) {
                        case -1876418083:
                        default:
                            var102 ^= 378752733;
                            break label146;
                        case -686440874:
                            var102 ^= -1758529695;
                            break label146;
                        case -228003500:
                            var102 &= 1854567939;
                            var102 ^= 1635580200;
                            break label146;
                    }
                }
                var102 = switch (var102) {
                    case -289060162 -> var102 ^ 1345319619;
                    default -> var102 ^ 524872317;
                    case 89847023 -> {
                        var102 += 1102766144;
                        var102 >>>= 21;
                        var102 *= 1642459555;
                        var102 &= -1313749428;
                        yield var102 ^ 2001861589;
                    }
                } & -602069572;
                var102 ^= 1467386799;
                var102 ^= 268641051;
            }

            long var22 = var102;
            long var116 = var22 + 1L;
            var116 = var22 * var116;
            long var173 = var22 + 2L;
            var116 *= var173;
            var22 += 3L;
            var116 *= var22;
            var22 = var116 & 7L;
            long var213;
            int var25 = (var213 = var22 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
            if (var25 == 0) {
                return;
            }
        }

        UnsupportedOperationException var26 = new UnsupportedOperationException();
        throw var26;
    }

    private JsonObject Jt(int var1) {
        Path var102 = null;
        String var103 = null;
        com.google.gson.JsonElement var104 = null;
        LinkOption[] var113 = null;
        Path var95 = null;
        label193: {
            int var32;
            label194: {
                label195: {
                    label187: {
                        try {
                            var32 = var1;
                            Object var21 = null;
                        } catch (RuntimeException var20) {
                            var32 = t;
                            var32 ^= 1571380320;
                            Throwable var5 = k(var20);
                            Exception var2 = (Exception)var5;
                            switch (var32) {
                                case -1839573115:
                                default:
                                    break label194;
                                case -1098559736:
                                    break label195;
                                case 2002682821:
                                    break label187;
                            }
                        }
                        var32 = switch (var32) {
                            default -> var32 ^ 173388882;
                            case -66294533 -> var32 ^ -1086945283;
                            case 1348467015 -> {
                                var32 |= 78490806;
                                var32 |= 1913663593;
                                var32 += 1235675054;
                                var32 ^= 1558978529;
                                yield var32 ^ -1979839290;
                            }
                        };
                        int var4 = var32 + 1;
                        var4 = var32 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            break label193;
                        }

                        try {
                            var4 = var32 + 1631556058;
                            var4 ^= 1067325751;
                            var4 ^= 1619159982;
                            var4 ^= -1977859098;
                            var4 ^= 618842565;
                            var95 = this.yv(var4);
                        } catch (RuntimeException var19) {
                            var32 = t;
                            var32 ^= 1571380320;
                            Throwable var110 = k(var19);
                            Exception var22 = (Exception)var110;
                            switch (var32) {
                                case -1839573115:
                                default:
                                    break label194;
                                case -1098559736:
                                    break label195;
                                case 2002682821:
                                    break label187;
                            }
                        }
                        var32 = switch (var32) {
                            case -1462451409 -> var32 ^ 1510202092;
                            case 364181130 -> {
                                var32 >>= 13;
                                yield var32 ^ 1821109230;
                            }
                            default -> var32 ^ -98549325;
                        };
                        Integer var111 = var32;
                        if (var111 == null) {
                            break label193;
                        }

                        try {
                            var113 = new LinkOption[0];
                            var32 += -2015726653;
                            var32 &= -1055475086;
                            var32 ^= 603031525;
                        } catch (RuntimeException var18) {
                            var32 = t;
                            var32 ^= 1571380320;
                            Throwable var112 = k(var18);
                            Exception var23 = (Exception)var112;
                            switch (var32) {
                                case -1839573115:
                                default:
                                    break label194;
                                case -1098559736:
                                    break label195;
                                case 2002682821:
                                    break label187;
                            }
                        }

                        Integer var6 = var32;
                        if (var6 == null) {
                            break label193;
                        }

                        label188: {
                            try {
                                boolean var96 = Files.isRegularFile(var95, var113);
                                var32 |= -668849165;
                                var32 ^= -1669741887;
                                if (!var96) {
                                    break label188;
                                }
                            } catch (RuntimeException var17) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var114 = k(var17);
                                Exception var24 = (Exception)var114;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }

                            var32 -= 1585944044;
                            var32 *= -1689588413;
                            var32 *= 28634231;
                            var32 *= -1759746307;
                            var32 ^= -822782641;

                            try {
                                var32 |= -1378371533;
                                var32 &= 70663912;
                                var32 |= -1543912742;
                                var32 |= 1677052652;
                                var32 ^= 272054633;
                            } catch (RuntimeException var16) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var115 = k(var16);
                                Exception var25 = (Exception)var115;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }

                            Integer var97 = var32;
                            if (var97 == null) {
                                break label193;
                            }

                            try {
                                int var98 = var32 ^ -2029966592;
                                var98 &= 176369469;
                                var98 |= -303423482;
                                var98 ^= 1794989257;
                                var102 = this.yv(var98);
                                var32 &= -551015307;
                                var32 |= -473841493;
                                var32 >>>= 25;
                                var32 &= -363062316;
                                var32 ^= 2124183619;
                            } catch (RuntimeException var15) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var116 = k(var15);
                                Exception var26 = (Exception)var116;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }

                            long var117 = var32;
                            long var7 = var117 + 1L;
                            var7 = var117 * var7;
                            long var9 = var117 + 2L;
                            var7 *= var9;
                            long var118 = var117 + 3L;
                            var7 *= var118;
                            long var119 = var7 & 7L;
                            long var137;
                            int var120 = (var137 = var119 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                            if (var120 != 0) {
                                break label193;
                            }

                            try {
                                Charset var122 = StandardCharsets.UTF_8;
                                var32 -= 160546316;
                                var32 ^= 220641032;
                                var103 = Files.readString(var102, var122);
                            } catch (RuntimeException | IOException var14) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var121 = k(var14);
                                Exception var27 = (Exception)var121;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }
                            var32 = switch (var32) {
                                default -> var32 ^ 178887109;
                                case 1962115531 -> var32 ^ 949193719;
                                case 2016152847 -> {
                                    var32 |= 1739838536;
                                    yield var32 ^ 703241525;
                                }
                            };
                            var120 = var32 + 1;
                            var120 = var32 * var120;
                            var120 &= 1;
                            if (var120 != 0) {
                                break label193;
                            }

                            try {
                                var104 = JsonParser.parseString(var103);
                                var32 *= -1464220915;
                                var32 ^= 680810131;
                            } catch (RuntimeException var13) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var126 = k(var13);
                                Exception var28 = (Exception)var126;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }

                            Integer var127 = var32;
                            if (var127 == null) {
                                break label193;
                            }

                            try {
                                JsonObject var105 = var104.getAsJsonObject();
                                var32 ^= 55996430;
                                var32 ^= -1979643251;
                                return var105;
                            } catch (RuntimeException var12) {
                                var32 = t;
                                var32 ^= 1571380320;
                                Throwable var128 = k(var12);
                                Exception var29 = (Exception)var128;
                                switch (var32) {
                                    case -1839573115:
                                    default:
                                        break label194;
                                    case -1098559736:
                                        break label195;
                                    case 2002682821:
                                        break label187;
                                }
                            }
                        }

                        var32 ^= 1173988206;
                        var32 ^= 967657254;
                        long var106 = var32;
                        long var130 = var106 + 1L;
                        long var131 = var106 * var130;
                        long var8 = var106 + 2L;
                        long var132 = var131 * var8;
                        long var107 = var106 + 3L;
                        long var133 = var132 * var107;
                        long var108 = var133 & 7L;
                        long var138;
                        var4 = (var138 = var108 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label193;
                        }

                        try {
                            var32 -= 711804125;
                            var32 ^= -1546497397;
                            return null;
                        } catch (RuntimeException var11) {
                            var32 = t;
                            var32 ^= 1571380320;
                            Throwable var129 = k(var11);
                            Exception var30 = (Exception)var129;
                            switch (var32) {
                                case -1839573115:
                                default:
                                    break label194;
                                case -1098559736:
                                    break label195;
                                case 2002682821:
                            }
                        }
                    }

                    var32 ^= 1061193274;
                    return null;
                }

                var32 -= 975130322;
                var32 &= 317045526;
                var32 *= 1968254857;
                var32 ^= 1915279974;
                return null;
            }

            var32 ^= 731440986;
            return null;
        }

        AssertionError var31 = new AssertionError();
        throw var31;
    }

    public static List sC(List var0) {
        label74: {
            int var1 = t;
            var1 ^= 1470711590;
            int var2 = System.identityHashCode(var0);
            int var4 = var0.size();
            ArrayList var3 = new ArrayList(var4);
            var3 = var3;
            Integer var42 = var2;
            if (var42 != null) {
                var1 *= -18869161;
                var1 >>>= 10;
                var1 ^= 437809071;
                int var43 = var1 + 1;
                var43 = var1 * var43;
                int var5 = var1 + 2;
                var43 *= var5;
                var5 = var1 + 3;
                var43 *= var5;
                var43 &= 7;
                if (var43 != 0) {
                    break label74;
                }

                Iterator var48 = var0.iterator();
                Iterator var49 = var48;

                var1 = switch (var1) {
                    case 226665614 -> var1 ^ 528643708;
                    case 438527680 -> {
                        var1 *= -1151783783;
                        yield var1 ^ 1793519470;
                    }
                    default -> var1 ^ -1199662438;
                };

                while (true) {
                    long var51 = var1;
                    long var7 = var51 + 1L;
                    var7 = var51 * var7;
                    long var52 = var7 & 1L;
                    long var75;
                    var5 = (var75 = var52 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        break label74;
                    }

                    int var54 = (var49.hasNext()) ? 1 : 0;
                    Integer var6 = var2;
                    if (var6 == null) {
                        var1 &= -1051857114;
                        var1 ^= -735777228;
                        break;
                    }

                    var1 |= 606230849;
                    var1 -= -1946433082;
                    var1 -= 908309735;
                    var1 ^= 305868251;
                    long var62 = var1;
                    long var8 = var62 + 1L;
                    var8 = var62 * var8;
                    long var63 = var8 & 1L;
                    long var76;
                    int var64 = (var76 = var63 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                    if (var64 != 0) {
                        break label74;
                    }

                    if (var54 == 0) {
                        var1 ^= -847828591;
                        var1 *= -1183148609;
                        var1 &= -582048749;
                        var1 ^= -1632148891;
                        return var3;
                    }

                    var1 |= -249615514;
                    var1 ^= 2018188875;
                    var54 = var1 + 1;
                    var54 = var1 * var54;
                    var54 &= 1;
                    if (var54 != 0) {
                        break label74;
                    }

                    Object var58 = var49.next();
                    Module var59 = (Module)var58;
                    var64 = var2 + 1;
                    var64 = var2 * var64;
                    int var72 = var2 + 2;
                    var64 *= var72;
                    int var73 = var2 + 3;
                    var64 *= var73;
                    var64 &= 7;
                    if (var64 != 0) {
                        var1 += 1872065457;
                        var1 ^= -1996923870;
                        var1 ^= 1666306133;
                        break;
                    }
                    var1 = switch (var1) {
                        case -1892388428 -> {
                            var1 >>= 5;
                            yield var1 ^ -587363196;
                        }
                        case -1726425257 -> var1 ^ 720425278;
                        default -> var1 ^ -1946373454;
                    };
                    Integer var70 = var1;
                    if (var70 == null) {
                        break label74;
                    }

                    String var60 = var59.UJ();
                    boolean var61 = var3.add(var60);
                    switch (var1) {
                        case -1076568551:
                            var1 ^= -1459152182;
                            break;
                        case 545533705:
                            var1 *= -268357899;
                            var1 *= 33209023;
                            var1 += -1357504982;
                            var1 ^= -1602731037;
                            break;
                        case 1961996246:
                        default:
                            var1 ^= 1345538505;
                    }
                }
            } else {
                var1 <<= 6;
                var1 ^= 2073912689;
                var1 -= -207932670;
                var1 ^= 1917594365;
            }

            Integer var38 = var1;
            if (var38 != null) {
                IllegalStateException var40 = new IllegalStateException();
                throw var40;
            }
        }

        IllegalArgumentException var39 = new IllegalArgumentException();
        throw var39;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -2033553574;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        t = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/cloud");
        g = var5;
    }

    private static Throwable k(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
