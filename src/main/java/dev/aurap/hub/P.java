package dev.aurap.hub;

import mvggs.modules.hud.crosshair;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public final class P {
    public final crosshair W;
    public final JL NR;
    public final r_2 jN;
    public final cS Oq;
    public final Fk Aj;
    public final int Sc;
    public static final int O;

    public P(crosshair var1, String var2, String var3, int var4, kP_2 var5, int var6, du var7) {
        this.W = var1;
        this.Sc = var4;
        String var9 = var2 + "_on";
        String var10 = "On " + var3;
        JL var8 = new JL(var9, var10, true);
        xB var11 = var1.vn(var8);
        var8 = (JL)var11;
        this.NR = var8;
        var9 = var2 + "_style";
        var10 = var3 + " Crosshair";
        r_2 var13 = new r_2(var9, var10, var5);
        xB var14 = var1.vn(var13);
        r_2 var15 = (r_2)var14;
        this.jN = var15;
        var9 = var2 + "_drawing";
        var10 = var3 + " Drawing";
        cS var16 = new cS(var9, var10, var7);
        xB var17 = var1.vn(var16);
        cS var18 = (cS)var17;
        this.Oq = var18;
        var9 = var2 + "_color";
        var10 = var3 + " Color";
        Fk var19 = new Fk(var9, var10, var6);
        xB var20 = var1.vn(var19);
        Fk var21 = (Fk)var20;
        this.Aj = var21;
        r_2 var22 = this.jN;
        JL var36 = this.NR;
        Objects.requireNonNull(var36);
        BooleanSupplier var37 = var36::vb;
        xB var23 = var22.Pt(var37);
        cS var24 = this.Oq;
        BooleanSupplier var38 = () -> {
            label67: {
                int var27x;
                label55: {
                    var27x = O;
                    var27x ^= 229714707;
                    int var2x = System.identityHashCode(this);
                    JL var3x = this.NR;
                    boolean var55 = var3x.vb();
                    long var4x = var2x;
                    long var6x = var4x + 1L;
                    var6x = var4x * var6x;
                    long var8x = var4x + 2L;
                    var6x *= var8x;
                    var4x += 3L;
                    var6x *= var4x;
                    var4x = var6x & 7L;
                    long var70;
                    int var61 = (var70 = var4x - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                    if (var61 == 0) {
                        var27x ^= 1900596460;
                        var27x -= -729233517;
                        var27x ^= -1456997637;
                        int var62 = var27x + 1;
                        int var63 = var27x * var62;
                        int var64 = var63 & 1;
                        if (var64 != 0) {
                            break label67;
                        }

                        if (!var55) {
                            var27x |= 779013498;
                            var27x ^= 1758764257;
                            var27x *= 1816969529;
                            var27x >>= 17;
                            var27x ^= 1082498289;
                            break label55;
                        }

                        var27x <<= 25;
                        var27x >>= 8;
                        var27x ^= 305369397;
                        boolean var56 = this.d();
                        Integer var49x = var2x;
                        if (var49x != null) {
                            var27x += 1451926470;
                            var27x ^= 1152914283;
                            var49x = var27x;
                            if (var49x == null) {
                                break label67;
                            }

                            if (var56) {
                                var27x = switch (var27x) {
                                    case -1920561750 -> var27x ^ 2064596519;
                                    case 14821264 -> {
                                        var27x *= -1880893163;
                                        yield var27x ^ -991478625;
                                    }
                                    default -> var27x ^ 1730703718;
                                };
                                long var51x = var27x;
                                var4x = var51x + 1L;
                                var4x = var51x * var4x;
                                long var52 = var4x & 1L;
                                long var71;
                                int var53 = (var71 = var52 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                                if (var53 != 0) {
                                    break label67;
                                }

                                boolean var54 = true;
                                var27x ^= 616500659;
                                var27x -= -1131387763;
                                var27x -= -1197244394;
                                var27x ^= 1367552047;
                                return var54;
                            }

                            var27x |= 1476666547;
                            var27x |= -193294777;
                            var27x |= 1292932655;
                            var27x ^= -1115996950;
                            break label55;
                        }

                        var27x &= 1270343855;
                        var27x -= 1977135382;
                        var27x *= -1356847159;
                        var27x *= 468871381;
                        var27x ^= 2102889347;
                    } else {
                        var27x *= 474864493;
                        var27x ^= 545294708;
                    }

                    long var44x = var27x;
                    long var57 = var44x + 1L;
                    long var58 = var44x * var57;
                    long var45x = var58 & 1L;
                    long var72;
                    var27x = (var72 = var45x - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                    if (var27x == 0) {
                        IllegalStateException var48x = new IllegalStateException();
                        throw var48x;
                    }
                    break label67;
                }

                boolean var73 = false;
                var27x += -1123734081;
                var27x *= 1770190213;
                var27x += 2127390535;
                var27x >>= 12;
                var27x ^= -1693286252;
                return var73;
            }

            AssertionError var47x = new AssertionError();
            throw var47x;
        };
        xB var25 = var24.Pt(var38);
        xB var26 = var25.q("Left click paints, right click erases.");
        Fk var27 = this.Aj;
        JL var39 = this.NR;
        Objects.requireNonNull(var39);
        BooleanSupplier var40 = var39::vb;
        xB var28 = var27.Pt(var40);
        cS var29 = this.Oq;
        Consumer var41 = var1x -> {
            int var2x = O;
            var2x ^= 779615949;
            int var3x = System.identityHashCode(this);
            crosshair var4x = this.W;
            crosshair var5x = this.W;
            Uq var21x = var5x.pixel;
            int var6x = var3x + 1;
            var6x = var3x * var6x;
            var3x = var6x & 1;
            if (var3x == 0) {
                var2x -= -808078010;
                var2x += 1718037213;
                var2x >>>= 24;
                var2x ^= -1345566599;
                Integer var18x = var2x;
                if (var18x != null) {
                    float var20x = var21x.WM();
                    int var22x = var2x * -2137607393;
                    int var23x = var22x ^ -1762443515;
                    var4x.stampNext((du)var1x, var20x, var23x);
                } else {
                    RuntimeException var19x = new RuntimeException();
                    throw var19x;
                }
            } else {
                var2x <<= 7;
                var2x |= 218329424;
                var2x ^= 1748658486;
                var2x ^= -426252670;
                IllegalArgumentException var12x = new IllegalArgumentException();
                throw var12x;
            }
        };
        cS var30 = var29.tZ(var41);
        Fk var42 = this.Aj;
        Objects.requireNonNull(var42);
        IntSupplier var43 = var42::zz;
        IntSupplier var51 = this::B;
        cS var31 = var30.Z(var43, var51);
        r_2 var32 = this.jN;
        nv var44 = (var1x, var2x, var3x, var4x, var5x, var6x, var7x) -> {
            int var8x = O;
            var8x ^= -15188157;
            int var9x = System.identityHashCode(this);
            crosshair var10x = this.W;
            kP_2 var11x = (kP_2)var2x;
            cS var12x = this.Oq;
            du var37x = var12x.lP();
            Fk var13x = this.Aj;
            int var38x = var13x.zz();
            long var14x = var9x;
            long var16x = var14x + 1L;
            var16x = var14x * var16x;
            long var18x = var14x + 2L;
            var16x *= var18x;
            var14x += 3L;
            var16x *= var14x;
            var14x = var16x & 7L;
            long var44x;
            var9x = (var44x = var14x - 0L) == 0L ? 0 : (var44x < 0L ? -1 : 1);
            if (var9x != 0) {
                switch (var8x) {
                    case -2069891051:
                        var8x ^= 1036093433;
                        break;
                    case -370117945:
                    default:
                        var8x ^= -1382907282;
                        break;
                    case -211298012:
                        var8x += -741242155;
                        var8x |= -233642584;
                        var8x ^= -226147595;
                }

                RuntimeException var36x = new RuntimeException();
                throw var36x;
            } else {
                var8x -= -948014446;
                var8x |= -1979518554;
                var8x ^= 1774304288;
                var9x = this.B();
                var8x <<= 7;
                var8x *= -1581474935;
                var8x &= 1445936746;
                var8x -= -961134306;
                var8x ^= -856705777;
                var10x.preview(var1x, var11x, var37x, var38x, var9x, var3x, var4x, var5x, var6x, var7x, var8x);
            }
        };
        UN.tN(var32, var44);
    }

    public int B() {
        int var1 = O;
        var1 ^= -1627619595;
        int var2 = System.identityHashCode(this);
        Fk var3 = this.Aj;
        int var24 = var3.zz();
        Integer var19 = var2;
        int var4 = of_2.Ik;
        var1 ^= var4;
        var1 ^= -924068123;
        var4 = of_2.J;
        var1 ^= var4;
        var1 ^= 1827304606;
        if (var19 == null) {
            var1 *= -1757055179;
            var1 ^= -1825170749;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            var20 &= 1;
            if (var20 == 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var1 |= -1336732902;
            var1 -= -403149135;
            var1 &= -978459284;
            var1 |= 513006456;
            var1 ^= 128358258;
            Integer var17 = var1;
            if (var17 != null) {
                return DP.Z(var24, -1, 0.55F);
            }
        }

        IllegalArgumentException var18 = new IllegalArgumentException();
        throw var18;
    }

    public boolean d() {
        int var1 = O;
        var1 ^= -935508541;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.Ik;
        var1 ^= var3;
        var1 ^= -924068123;
        of_2.Ik = -924068123;
        var3 = of_2.J;
        var1 ^= var3;
        var1 ^= 1827304606;
        of_2.J = 1827304606;
        if (var2 == 0) {
            var1 <<= 8;
            var1 *= -451655829;
            var1 ^= 2092863236;
            var1 += -310544673;
            var1 ^= -493917051;
            r_2 var23 = this.jN;
            kP_2 var29 = kP_2.DRAWN;
            return var23.TJ(var29);
        } else {
            var1 *= -118344621;
            var1 -= 1809887939;
            var1 *= 158685017;
            var1 *= -2072612597;
            var1 ^= 117242728;
            UnsupportedOperationException var15 = new UnsupportedOperationException();
            throw var15;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -449874052;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        O = var4;
    }
}
