package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class KP {
    private final Uo f;
    private final boolean y;
    private final Set D;
    private final String UI;
    private final String r;
    private final boolean v;
    public static final int O;

    public KP(Uo var1, boolean var2, Set var3, String var4, String var5, boolean var6) {
        this.f = var1;
        this.y = var2;
        LinkedHashSet var7 = new LinkedHashSet(var3);
        Set var8 = Collections.unmodifiableSet(var7);
        this.D = var8;
        this.UI = var4;
        this.r = var5;
        this.v = var6;
    }

    public static KP oJ() {
        Uo var1 = Uo.CONNECTING;
        Set var2 = Set.of();
        return new KP(var1, false, var2, "Łączenie z serwerem licencji…", "-", false);
    }

    public static KP BG(Uo var0, String var1, boolean var2) {
        int var3 = O;
        var3 ^= -2113211787;
        int var4 = System.identityHashCode(var0);
        Integer var22 = var4;
        int var5 = of_2.GI;
        var3 ^= var5;
        var3 ^= 970741366;
        of_2.GI = 970741366;
        var5 = of_2.qV;
        var3 ^= var5;
        var3 ^= 1770680153;
        of_2.qV = 1770680153;
        if (var22 != null) {
            var3 |= 350284630;
            var3 -= -1771133035;
            var3 &= -464525872;
            var3 ^= -865604913;
            Set var26 = Set.of();
            return new KP(var0, false, var26, var1, "-", var2);
        } else {
            var3 ^= -1977561934;
            var3 *= -1296563767;
            var3 |= -1019232140;
            var3 ^= -630667324;
            int var23 = var3 + 1;
            var23 = var3 * var23;
            var3 = var23 & 1;
            if (var3 != 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            } else {
                IllegalArgumentException var16 = new IllegalArgumentException();
                throw var16;
            }
        }
    }

    public Uo b() {
        int var1 = O;
        var1 ^= -722948069;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        int var3 = of_2.GI;
        var1 ^= var3;
        var1 ^= 970741366;
        var3 = of_2.qV;
        var1 ^= var3;
        var1 ^= 1770680153;
        if (var17 == null) {
            var1 ^= -1818699965;
            var1 += -2029616275;
            var1 ^= -869469484;
            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        } else {
            var1 |= 142755837;
            var1 ^= -243439902;
            var1 ^= -2080317635;
            Integer var12 = var1;
            if (var12 == null) {
                UnsupportedOperationException var13 = new UnsupportedOperationException();
                throw var13;
            } else {
                return this.f;
            }
        }
    }

    public boolean T() {
        int var1 = O;
        var1 ^= 31904456;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 = switch (var1) {
                case -1474087259 -> var1 ^ -384923142;
                case 1249970173 -> {
                    var1 |= 151346227;
                    var1 += -1815523939;
                    yield var1 ^ -633433596;
                }
                default -> var1 ^ -579719739;
            };
            int var14 = var1 + 1;
            var14 = var1 * var14;
            var14 &= 1;
            if (var14 == 0) {
                return this.y;
            }
        } else {
            var1 += 548847860;
            var1 ^= 917756800;
            var1 ^= 834902665;
            Integer var10 = var1;
            if (var10 != null) {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }

        IllegalStateException var11 = new IllegalStateException();
        throw var11;
    }

    public Set d() {
        int var1 = O;
        var1 ^= -557058484;
        int var2 = System.identityHashCode(this);
        long var16 = var2;
        long var4 = var16 + 1L;
        var4 = var16 * var4;
        long var17 = var4 & 1L;
        long var21;
        var2 = (var21 = var17 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 1108858570;
            var1 *= -1277025861;
            var1 *= -674302685;
            var1 ^= -732854326;
            UnsupportedOperationException var19 = new UnsupportedOperationException();
            throw var19;
        } else {
            var1 -= -1702315007;
            var1 -= 2036205764;
            var1 ^= -1471733705;
            Integer var10 = var1;
            if (var10 != null) {
                return this.D;
            } else {
                IllegalArgumentException var11 = new IllegalArgumentException();
                throw var11;
            }
        }
    }

    public String K() {
        int var1 = O;
        var1 ^= 739520328;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var22;
        var2 = (var22 = var19 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 -= -1044419442;
            var1 |= -1407153901;
            var1 *= -1105850013;
            var1 >>= 30;
            var1 ^= -1155227314;
            return this.UI;
        } else {
            Integer var10 = switch (var1) {
                default -> var1 ^ -2061506114;
                case -826609971 -> var1 ^ -535417263;
                case 1735654013 -> {
                    var1 += 839805398;
                    var1 *= -1948331627;
                    yield var1 ^ 947440470;
                }
            };
            if (var10 == null) {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            } else {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            }
        }
    }

    public String kx() {
        int var1 = O;
        var1 ^= -1863222417;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += 64156566;
            var1 |= 340601214;
            var1 |= -137958297;
            var1 ^= -344466940;
            Integer var18 = var1;
            if (var18 != null) {
                return this.r;
            }
        } else {
            var1 >>>= 16;
            var1 *= 851556583;
            var1 |= 1837146761;
            var1 &= -2064943015;
            var1 ^= -458777791;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public boolean Nt() {
        int var1 = O;
        var1 ^= -111775485;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var27;
        var2 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= 1959410205;
            var1 &= -2294260;
            var1 *= -879577589;
            var1 ^= 147799604;
            Integer var22 = var1;
            if (var22 != null) {
                return this.v;
            } else {
                IllegalArgumentException var23 = new IllegalArgumentException();
                throw var23;
            }
        } else {
            var1 >>= 16;
            var1 |= 1531573623;
            var1 ^= -1179475948;
            var1 ^= -1189699616;
            UnsupportedOperationException var13 = new UnsupportedOperationException();
            throw var13;
        }
    }

    public boolean oG() {
        int var1 = O;
        var1 ^= -569688891;
        int var2 = System.identityHashCode(this);
        Integer var28 = var2;
        if (var28 == null) {
            var1 -= 1317435688;
            var1 <<= 20;
            var1 ^= -958975226;
            AssertionError var34 = new AssertionError();
            throw var34;
        } else {
            var1 <<= 19;
            var1 += -855712527;
            var1 ^= -1230049051;
            long var29 = var1;
            long var4 = var29 + 1L;
            var4 = var29 * var4;
            long var30 = var4 & 1L;
            long var41;
            int var31 = (var41 = var30 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            label34:
            if (var31 == 0) {
                boolean var32 = this.y;
                if (!var32) {
                    var1 -= 505033134;
                    var1 &= -13582717;
                    var1 &= -436540099;
                    var1 ^= -1738348516;
                    var32 = true;
                    var1 &= 1596284169;
                    var1 -= -1981482194;
                    var1 ^= -174079538;
                } else {
                    var1 &= 2139271448;
                    var1 ^= -986118403;
                    var1 += 449102553;
                    var1 ^= 1972945869;
                    long var3 = var1;
                    long var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var42;
                    int var36 = (var42 = var3 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
                    if (var36 != 0) {
                        break label34;
                    }

                    var32 = false;
                    switch (var1) {
                        case -1125580987:
                            var1 ^= 829669049;
                            break;
                        case 1928393737:
                        default:
                            var1 ^= -340535836;
                            break;
                        case 2145724939:
                            var1 *= 663188083;
                            var1 ^= 1056132581;
                    }
                }

                int var37 = var1 + 1;
                var37 = var1 * var37;
                var1 = var37 & 1;
                if (var1 == 0) {
                    return var32;
                }
            }

            AssertionError var24 = new AssertionError();
            throw var24;
        }
    }

    @Override
    public String toString() {
        label56: {
            int var1 = O;
            var1 ^= 1983708455;
            int var2 = System.identityHashCode(this);
            Uo var3 = this.f;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var1 = switch (var1) {
                    case 741120731 -> var1 ^ 1759866267;
                    case 1029384210 -> {
                        var1 += 736521225;
                        var1 += -446557159;
                        yield var1 ^ 987582385;
                    }
                    default -> var1 ^ 1062940302;
                };
                long var52 = var1;
                long var6 = var52 + 1L;
                var6 = var52 * var6;
                long var53 = var6 & 1L;
                long var62;
                var4 = (var62 = var53 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label56;
                }

                String var49 = String.valueOf(var3);
                boolean var55 = this.y;
                String var56;
                if (var55) {
                    var1 &= -1799513272;
                    var1 ^= -1968137387;
                    var56 = " (aura.full)";
                    var1 &= -1737739662;
                    var1 *= -1060428613;
                    var1 *= 1062344357;
                    var1 >>= 14;
                    var1 ^= 83384501;
                } else {
                    var1 = switch (var1) {
                        case 239369845 -> var1 ^ -1269418473;
                        default -> var1 ^ -302409230;
                        case 1954473861 -> {
                            var1 ^= 2078473107;
                            var1 -= 1091877923;
                            var1 &= -1244098605;
                            yield var1 ^ -1987817017;
                        }
                    };
                    Integer var5 = var1;
                    if (var5 == null) {
                        break label56;
                    }

                    var56 = " (locked)";
                    var1 &= -1826837472;
                    var1 &= 1983591300;
                    var1 *= 58872323;
                    var1 |= -1214104893;
                    var1 ^= -1285904727;
                }

                String var57 = this.UI;
                var6 = var2;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var63;
                var2 = (var63 = var6 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                if (var2 == 0) {
                    Integer var46 = switch (var1) {
                        case -448924379 -> var1 ^ -272579352;
                        case 83401834 -> {
                            var1 -= -1659720540;
                            var1 += 1144809013;
                            var1 |= -2076510187;
                            var1 >>>= 16;
                            yield var1 ^ 1188818669;
                        }
                        default -> var1 ^ 1635628188;
                    };
                    if (var46 != null) {
                        return var49 + var56 + " - " + var57;
                    }
                    break label56;
                }

                var1 -= -1104611326;
                var1 -= -1435865535;
                var1 += 1430286256;
                var1 ^= 1352612478;
            } else {
                var1 *= 1842156365;
                var1 -= -2076958386;
                var1 &= 1035356517;
                var1 -= -1460235035;
                var1 ^= 715207862;
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                RuntimeException var44 = new RuntimeException();
                throw var44;
            }
        }

        RuntimeException var43 = new RuntimeException();
        throw var43;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1354032247;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        O = var4;
    }
}
