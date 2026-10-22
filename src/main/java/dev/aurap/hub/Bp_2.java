package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;

public record Bp_2(String h, String b, String qa, String Hh, String j, String O, String J, String Zv, String M, String Y, String ik, String R, String fa) {
    private static final Bp_2 l;
    private static final Bp_2 TT;
    public static final int a;

    public static Bp_2 jb(String var0) {
        label79: {
            int var32;
            var32 = a;
            var32 ^= -1983157176;
            int var2 = System.identityHashCode(var0);
            Integer var3 = var2;
            label78:
            if (var3 != null) {
                var32 *= -2130179407;
                var32 &= 88066624;
                var32 ^= 209220435;
                var32 |= 1965812228;
                var32 ^= -1895109016;
                long var70 = var32;
                long var5 = var70 + 1L;
                var5 = var70 * var5;
                long var71 = var5 & 1L;
                long var100;
                int var72 = (var100 = var71 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                if (var72 != 0) {
                    break label79;
                }

                if (var0 != null) {
                    var32 -= 1926149804;
                    var32 |= 961635631;
                    var32 >>= 14;
                    var32 ^= 65783369;
                    Locale var73 = Locale.ROOT;
                    String var74 = var0.toLowerCase(var73);
                    boolean var75 = var74.startsWith("pl");
                    long var4 = var2;
                    long var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var101;
                    int var80 = (var101 = var4 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                    if (var80 != 0) {
                        var32 *= 126718497;
                        var32 ^= -988994770;
                        break label78;
                    }

                    var32 <<= 31;
                    var32 ^= -413134434;
                    if (var75) {
                        var32 ^= -1639799894;
                        var32 ^= 67816106;
                        Integer var76 = var32;
                        if (var76 == null) {
                            break label79;
                        }

                        Bp_2 var77 = TT;
                        int var81 = var2 + 1;
                        int var82 = var2 * var81;
                        int var83 = var82 & 1;
                        if (var83 == 0) {
                            var32 *= -1671814413;
                            var32 *= -556856005;
                            var32 -= 1051700665;
                            var32 ^= -496770917;
                            var32 ^= 568503483;
                            var4 = var32;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            long var8 = var4 + 2L;
                            var6 *= var8;
                            var4 += 3L;
                            var6 *= var4;
                            var4 = var6 & 7L;
                            long var102;
                            int var87 = (var102 = var4 - 0L) == 0L ? 0 : (var102 < 0L ? -1 : 1);
                            if (var87 != 0) {
                                break label79;
                            }

                            var32 |= -1237464768;
                            var32 >>>= 4;
                            var32 &= -1593743811;
                            var32 ^= -2100855167;
                            return var77;
                        }

                        var32 >>= 20;
                        var32 &= 1531949182;
                        var32 &= 1892090911;
                        var32 ^= 495384360;
                        break label78;
                    }

                    switch (var32) {
                        case -1959492547:
                        default:
                            var32 ^= 1595593379;
                            break;
                        case -413134434:
                            var32 &= 704840380;
                            var32 -= -1535944756;
                            var32 ^= 810229872;
                            var32 ^= -360377999;
                            var32 ^= 2138393361;
                            break;
                        case 484077115:
                            var32 ^= -1393996523;
                    }
                } else {
                    var32 |= -349940146;
                    var32 -= -522782685;
                    var32 |= 1934672936;
                    var32 += 1034677729;
                    var32 ^= 1639784349;
                }

                Integer var88 = var32;
                if (var88 == null) {
                    break label79;
                }

                Bp_2 var89 = l;
                int var91 = var2 + 1;
                int var92 = var2 * var91;
                var2 = var92 & 1;
                if (var2 == 0) {
                    var32 = switch (var32) {
                        case -667430208 -> {
                            var32 <<= 25;
                            var32 *= -735924237;
                            var32 |= 931651099;
                            var32 |= -951219903;
                            yield var32 ^ -5409432;
                        }
                        case 393425675 -> var32 ^ -2114198496;
                        default -> var32 ^ 592541995;
                    };
                    var2 = var32 + 1;
                    var2 = var32 * var2;
                    int var93 = var32 + 2;
                    var2 *= var93;
                    int var94 = var32 + 3;
                    var2 *= var94;
                    var2 &= 7;
                    if (var2 != 0) {
                        break label79;
                    }

                    var32 += 1593473015;
                    var32 -= -129131716;
                    var32 += 1792760451;
                    var32 ^= 1512888812;
                    return var89;
                }

                var32 &= -1510944514;
                var32 -= 849327532;
                var32 ^= 1343745070;
            } else {
                var32 *= -1919053345;
                var32 &= -1990159295;
                var32 *= 2077670723;
                var32 ^= 852895738;
            }

            Integer var61 = var32;
            if (var61 != null) {
                IllegalStateException var63 = new IllegalStateException();
                throw var63;
            }
        }

        UnsupportedOperationException var62 = new UnsupportedOperationException();
        throw var62;
    }




    public String notPlaying() {
        int var1 = a;
        var1 ^= -1372131903;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.IX;
        var1 ^= var3;
        var1 ^= -922803453;
        of_2.IX = -922803453;
        var3 = of_2.lU;
        var1 ^= var3;
        var1 ^= -1480094462;
        of_2.lU = -1480094462;
        if (var2 != 0) {
            var1 *= 851842295;
            var1 *= 1040064163;
            var1 >>= 21;
            var1 &= 1443455180;
            var1 ^= 1433230116;
            IllegalArgumentException var22 = new IllegalArgumentException();
            throw var22;
        } else {
            var1 = switch (var1) {
                case -811326575 -> {
                    var1 -= -2108107155;
                    var1 *= -267711275;
                    yield var1 ^ 569692808;
                }
                default -> var1 ^ -1413004233;
                case 316673998 -> var1 ^ -516672244;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            } else {
                return this.h;
            }
        }
    }

    public String idleHint() {
        int var1 = a;
        var1 ^= -1367191579;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        int var3 = of_2.IX;
        var1 ^= var3;
        var1 ^= -922803453;
        var3 = of_2.lU;
        var1 ^= var3;
        var1 ^= -1480094462;
        if (var18 == null) {
            var1 -= 1040456471;
            var1 ^= -1696448698;
            var1 -= 490524107;
            var1 -= 2141375576;
            var1 ^= 678850095;
            int var19 = var1 + 1;
            var19 = var1 * var19;
            var19 &= 1;
            if (var19 != 0) {
                IllegalStateException var23 = new IllegalStateException();
                throw var23;
            } else {
                IllegalStateException var22 = new IllegalStateException();
                throw var22;
            }
        } else {
            switch (var1) {
                case -2014329307:
                    var1 ^= -1487802528;
                    break;
                case -821001803:
                    var1 ^= 225827368;
                    var1 ^= 804247694;
                    break;
                case 322302606:
                default:
                    var1 ^= 1091596188;
            }

            return this.b;
        }
    }

    public String loading() {
        int var1 = a;
        var1 ^= -1865564090;
        int var2 = System.identityHashCode(this);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var29;
        var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var2 != 0) {
            switch (var1) {
                case -830131628:
                default:
                    var1 ^= 1947739338;
                    break;
                case -245428714:
                    var1 <<= 1;
                    var1 ^= -1231728917;
                    var1 >>>= 10;
                    var1 ^= -1655007832;
                    break;
                case 155069663:
                    var1 ^= 2139402360;
            }

            IllegalStateException var24 = new IllegalStateException();
            throw var24;
        } else {
            var1 *= -36238241;
            var1 ^= 2058369028;
            long var10 = var1;
            long var3 = var10 + 1L;
            var3 = var10 * var3;
            long var5 = var10 + 2L;
            var3 *= var5;
            long var11 = var10 + 3L;
            var3 *= var11;
            long var12 = var3 & 7L;
            long var30;
            var1 = (var30 = var12 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.qa;
            } else {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            }
        }
    }

    public String missing() {
        int var1 = a;
        var1 ^= -195775632;
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
        if (var2 != 0) {
            var1 -= -1971486828;
            var1 |= 1219404960;
            var1 &= 178516290;
            var1 ^= -1706493995;
            Integer var23 = var1;
            if (var23 == null) {
                RuntimeException var25 = new RuntimeException();
                throw var25;
            } else {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1782153952:
                    var1 ^= 1149095822;
                    var1 >>= 10;
                    var1 >>= 23;
                    var1 ^= -1079982437;
                    break;
                case -665289380:
                    var1 ^= -1861754613;
                    break;
                case 2122195676:
                default:
                    var1 ^= -2045264119;
            }

            return this.Hh;
        }
    }

    public String offline() {
        int var1 = a;
        var1 ^= -371021539;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 != null) {
            var1 += 2123128925;
            var1 -= -1395501104;
            var1 ^= 654053413;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            int var3 = var1 + 2;
            var17 *= var3;
            var3 = var1 + 3;
            var17 *= var3;
            var17 &= 7;
            if (var17 == 0) {
                return this.j;
            }
        } else {
            Integer var13 = switch (var1) {
                case -2005899443 -> {
                    var1 -= 125048494;
                    var1 += -1838679541;
                    var1 -= -1107091977;
                    var1 |= 1443739473;
                    yield var1 ^ 1632885043;
                }
                case -2005433544 -> var1 ^ -908794936;
                default -> var1 ^ 316792906;
            };
            if (var13 != null) {
                RuntimeException var15 = new RuntimeException();
                throw var15;
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    public String instrumental() {
        int var1 = a;
        var1 ^= -1901441312;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            long var26 = switch (var1) {
                case -1048621320 -> var1 ^ -91250646;
                case -281509712 -> {
                    var1 *= -366929673;
                    var1 += -120967975;
                    var1 ^= 1880926916;
                    var1 += -1169888855;
                    yield var1 ^ -678685623;
                }
                default -> var1 ^ 1614362816;
            };
            long var35 = var26 + 1L;
            long var36 = var26 * var35;
            long var6 = var26 + 2L;
            long var37 = var36 * var6;
            long var27 = var26 + 3L;
            long var38 = var37 * var27;
            long var28 = var38 & 7L;
            long var39;
            var2 = (var39 = var28 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.O;
            }
        } else {
            var1 *= 423815103;
            var1 -= -16689035;
            var1 -= -929268808;
            var1 &= 987382344;
            var1 ^= 719975979;
            long var19 = var1;
            long var33 = var19 + 1L;
            long var34 = var19 * var33;
            long var20 = var34 & 1L;
            long var40;
            var1 = (var40 = var20 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var1 == 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        }

        UnsupportedOperationException var22 = new UnsupportedOperationException();
        throw var22;
    }

    public String noLyrics() {
        int var1 = a;
        var1 ^= 935116082;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 != null) {
            switch (var1) {
                case -2032068202:
                    var1 ^= -203277418;
                    break;
                case 315970126:
                default:
                    var1 ^= 324352864;
                    break;
                case 1445884770:
                    var1 -= 1439473513;
                    var1 &= 209496259;
                    var1 ^= 1665583781;
            }

            return this.J;
        } else {
            var1 -= -1202055963;
            var1 ^= 839232744;
            Integer var6 = var1;
            if (var6 != null) {
                IllegalArgumentException var8 = new IllegalArgumentException();
                throw var8;
            } else {
                IllegalStateException var7 = new IllegalStateException();
                throw var7;
            }
        }
    }

    public String lyricsOff() {
        int var1 = a;
        var1 ^= -856316600;
        int var2 = System.identityHashCode(this);
        Integer var19 = var2;
        if (var19 != null) {
            var1 -= 612658079;
            var1 &= -928395136;
            var1 ^= -1042992980;
            var1 ^= 252303194;
            var1 ^= -1844607971;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            var20 &= 1;
            if (var20 == 0) {
                return this.Zv;
            }
        } else {
            var1 = switch (var1) {
                case -2034596872 -> var1 ^ -109886200;
                case -1385731304 -> {
                    var1 -= 1233222753;
                    var1 ^= -304577588;
                    var1 ^= 2064686962;
                    var1 ^= -478963662;
                    yield var1 ^ -392446254;
                }
                default -> var1 ^ 1924210745;
            };
            int var23 = var1 + 1;
            var23 = var1 * var23;
            int var3 = var1 + 2;
            var23 *= var3;
            var1 += 3;
            var23 *= var1;
            var1 = var23 & 7;
            if (var1 == 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            }
        }

        AssertionError var17 = new AssertionError();
        throw var17;
    }

    public String denied() {
        int var1 = a;
        var1 ^= 635383192;
        int var2 = System.identityHashCode(this);
        Integer var20 = var2;
        if (var20 != null) {
            switch (var1) {
                case -1369644975:
                    var1 ^= 344764069;
                    break;
                case 801265016:
                default:
                    var1 ^= -901329014;
                    break;
                case 1145955272:
                    var1 |= 997185096;
                    var1 ^= -58010772;
            }

            return this.M;
        } else {
            var1 ^= -1448426876;
            var1 ^= -1635698768;
            var1 |= -1650872338;
            var1 &= -240175772;
            var1 ^= -890316581;
            long var11 = var1;
            long var3 = var11 + 1L;
            var3 = var11 * var3;
            long var12 = var3 & 1L;
            long var22;
            var1 = (var22 = var12 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }
    }

    public String deniedHint() {
        int var1 = a;
        var1 ^= 1734902294;
        int var2 = System.identityHashCode(this);
        Integer var14 = var2;
        if (var14 == null) {
            var1 ^= 14484706;
            var1 ^= 1248114024;
            var1 ^= -1799737672;
            RuntimeException var15 = new RuntimeException();
            throw var15;
        } else {
            var1 += 270965207;
            var1 |= -250014102;
            var1 >>>= 18;
            var1 >>>= 15;
            var1 ^= -1135384836;
            Integer var9 = var1;
            if (var9 != null) {
                return this.Y;
            } else {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            }
        }
    }

    public String missingTool() {
        int var1 = a;
        var1 ^= 477040299;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var6 = var16 + 2L;
        var4 *= var6;
        long var17 = var16 + 3L;
        var4 *= var17;
        long var18 = var4 & 7L;
        long var26;
        var2 = (var26 = var18 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= 1717020273;
            var1 &= 2128478496;
            var1 ^= -1803573044;
            Integer var20 = var1;
            if (var20 != null) {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            } else {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            switch (var1) {
                case 282138505:
                default:
                    var1 ^= 1493946092;
                    break;
                case 450948863:
                    var1 ^= -1897552033;
                    break;
                case 2113782011:
                    var1 ^= 2026784028;
                    var1 ^= 943336589;
            }

            return this.ik;
        }
    }

    public String unsupported() {
        int var1 = a;
        var1 ^= -867384657;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 |= -65507249;
            var1 <<= 25;
            var1 &= 1561625661;
            var1 ^= 1282542186;
            long var18 = var1;
            long var27 = var18 + 1L;
            long var28 = var18 * var27;
            long var6 = var18 + 2L;
            long var29 = var28 * var6;
            long var19 = var18 + 3L;
            long var30 = var29 * var19;
            long var20 = var30 & 7L;
            long var31;
            var2 = (var31 = var20 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var2 != 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            } else {
                IllegalArgumentException var22 = new IllegalArgumentException();
                throw var22;
            }
        } else {
            var1 ^= 1330118879;
            var1 ^= 1764513072;
            var1 ^= 2033502892;
            return this.R;
        }
    }

    public String notResponding() {
        int var1 = a;
        var1 ^= 392217151;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            switch (var1) {
                case -1756948317:
                    var1 ^= -657722350;
                    break;
                case -312272009:
                default:
                    var1 ^= -995018817;
                    break;
                case 1995574383:
                    var1 *= 1637920827;
                    var1 *= -391774299;
                    var1 &= -1890823622;
                    var1 ^= 722123109;
            }

            return this.fa;
        } else {
            Integer var10 = switch (var1) {
                default -> var1 ^ -1870526417;
                case 174663912 -> var1 ^ -733648227;
                case 1995574383 -> {
                    var1 ^= 629966760;
                    var1 &= 991613386;
                    var1 ^= 2076342186;
                    var1 += -1291461238;
                    yield var1 ^ -2015589041;
                }
            };
            if (var10 == null) {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            } else {
                AssertionError var11 = new AssertionError();
                throw var11;
            }
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1459584996;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        a = var4;
        Bp_2 var5 = new Bp_2(
            "Not playing",
            "Play something on Spotify",
            "Looking for lyrics…",
            "No lyrics for this song",
            "Lyrics are unavailable right now",
            "Instrumental",
            "No lyrics",
            "Lyrics are off",
            "Allow Minecraft to control Spotify",
            "System Settings → Privacy & Security → Automation",
            "Install playerctl to show what plays",
            "Not supported on this system",
            "Spotify is not responding"
        );
        l = var5;
        Bp_2 var6 = new Bp_2(
            "Nic nie gra",
            "Puść coś na Spotify",
            "Szukam tekstu…",
            "Brak tekstu tej piosenki",
            "Tekst jest chwilowo niedostępny",
            "Utwór instrumentalny",
            "Brak tekstu",
            "Teksty są wyłączone",
            "Pozwól Minecraftowi sterować Spotify",
            "Ustawienia systemowe → Prywatność i ochrona → Automatyzacja",
            "Zainstaluj playerctl, żeby widzieć, co gra",
            "Ten system nie jest obsługiwany",
            "Spotify nie odpowiada"
        );
        TT = var6;
    }
}
