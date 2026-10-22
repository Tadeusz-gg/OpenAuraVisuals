package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BooleanSupplier;

public abstract class tR_2 extends Yn {
    private static final kE_2 s;
    private static final kE_2 A;
    private final r_2 m;
    private final Uq Tk;
    private final Uq d;
    protected final Uq cm;
    private float vu = 1.0F;
    private float i = 1.0F;
    public float PC;
    public float G;
    public float Q = 1.0F;
    public float I;
    public float zF;
    public float o = 1.0F;
    public float J;
    public float O;
    public boolean JK;
    public float Au;
    public float eU;
    public float gd;
    public float CW;
    public final XF v;
    public final XF PN;
    public boolean W;
    public final Re Y;
    public final Re wb;
    public boolean HQ;
    public static final int qG;

    protected tR_2(String var1, String var2, Cl_2 var3, float var4, float var5, float var6) {
        this(var1, var2, AJ.HUD, var3, var4, var5, var6);
    }

    protected tR_2(String var1, String var2, AJ var3, Cl_2 var4, float var5, float var6, float var7) {
        super(var1, var2, var3);
        kE_2 var9 = s;
        XF var8 = new XF(0.0F, var9);
        this.v = var8;
        var9 = kE_2.SNAPPY;
        var8 = new XF(0.0F, var9);
        this.PN = var8;
        Re var11 = new Re(0.0F, 0.07F);
        this.Y = var11;
        Re var12 = new Re(0.0F, 0.07F);
        this.wb = var12;
        this.HQ = true;
        r_2 var13 = new r_2("anchor", "Anchor", var4);
        BooleanSupplier var36 = () -> false;
        xB var14 = var13.Pt(var36);
        r_2 var15 = (r_2)var14;
        xB var16 = this.vn(var15);
        r_2 var17 = (r_2)var16;
        this.m = var17;
        Uq var18 = new Uq("offset_x", "Offset X", var5, -4000.0F, 4000.0F);
        Uq var19 = var18.W(0.5F);
        BooleanSupplier var37 = () -> false;
        xB var20 = var19.Pt(var37);
        Uq var21 = (Uq)var20;
        xB var22 = this.vn(var21);
        Uq var23 = (Uq)var22;
        this.Tk = var23;
        Uq var24 = new Uq("offset_y", "Offset Y", var6, -4000.0F, 4000.0F);
        Uq var25 = var24.W(0.5F);
        BooleanSupplier var38 = () -> false;
        xB var26 = var25.Pt(var38);
        Uq var27 = (Uq)var26;
        xB var28 = this.vn(var27);
        Uq var29 = (Uq)var28;
        this.d = var29;
        Uq var30 = new Uq("scale", "Scale", 1.0F, 0.5F, var7);
        Uq var31 = var30.W(0.05F);
        Uq var32 = var31.L("x");
        xB var33 = this.vn(var32);
        Uq var34 = (Uq)var33;
        this.cm = var34;
    }

    protected abstract boolean BM(lH_3 var1);

    protected abstract void BO(hr var1, lH_3 var2);

    protected abstract void G(Canvas var1, lH_3 var2);

    protected void IA(Sn var1, lH_3 var2) {
        int var3 = System.identityHashCode(this);
    }

    protected boolean cd(lH_3 var1, float var2, float var3, float[] var4) {
        int var5 = System.identityHashCode(this);
        return false;
    }

    protected float K(lH_3 var1) {
        int var2 = System.identityHashCode(this);
        return 1.0F;
    }

    protected boolean sg(lH_3 var1) {
        int var2 = System.identityHashCode(this);
        return true;
    }

    protected void r(Oo var1) {
        int var2 = System.identityHashCode(this);
    }

    protected boolean vo(float var1, float var2, int var3, lH_3 var4) {
        int var5 = System.identityHashCode(this);
        return false;
    }

    protected boolean cu(float var1, float var2, double var3, lH_3 var5) {
        int var6 = System.identityHashCode(this);
        return false;
    }

    protected boolean jV() {
        int var1 = System.identityHashCode(this);
        return true;
    }

    protected boolean nX() {
        int var1 = System.identityHashCode(this);
        return false;
    }

    protected boolean HI(lH_3 var1) {
        int var2 = System.identityHashCode(this);
        return false;
    }

    protected float dj() {
        int var1 = System.identityHashCode(this);
        return 3.0F;
    }

    protected float e(lH_3 var1) {
        int var2 = System.identityHashCode(this);
        return 0.0F;
    }

    protected void Mf() {
        int var1 = System.identityHashCode(this);
    }

    protected void fS() {
        int var1 = System.identityHashCode(this);
    }

    protected final void dV(float var1, float var2) {
        int var3 = qG;
        var3 ^= 1505006837;
        int var4 = System.identityHashCode(this);
        float var5 = Math.max(1.0F, var1);
        this.vu = var5;
        Integer var20 = var4;
        if (var20 == null) {
            var3 &= 290806540;
            var3 *= -1074899347;
            var3 <<= 15;
            var3 ^= 1923734532;
            long var21 = var3;
            long var6 = var21 + 1L;
            var6 = var21 * var6;
            long var8 = var21 + 2L;
            var6 *= var8;
            long var22 = var21 + 3L;
            var6 *= var22;
            long var23 = var6 & 7L;
            long var29;
            int var24 = (var29 = var23 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var24 == 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            }
        } else {
            var3 += 270710177;
            var3 ^= 1345291386;
            Integer var17 = var3;
            if (var17 != null) {
                float var19 = Math.max(1.0F, var2);
                this.i = var19;
                return;
            }
        }

        RuntimeException var18 = new RuntimeException();
        throw var18;
    }

    public final float tQ() {
        int var1 = qG;
        var1 ^= 1137369710;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 &= -816406839;
            var1 ^= -91841752;
            var1 ^= -1658976264;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            var1 ^= -1870609296;
            var1 ^= -1172681468;
            long var13 = var1;
            long var28 = var13 + 1L;
            long var29 = var13 * var28;
            long var5 = var13 + 2L;
            long var30 = var29 * var5;
            long var14 = var13 + 3L;
            long var31 = var30 * var14;
            long var15 = var31 & 7L;
            long var32;
            var1 = (var32 = var15 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.vu;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public final float Yo() {
        int var1 = qG;
        var1 ^= 886352186;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 != null) {
            var1 |= 401110122;
            var1 -= 148621813;
            var1 &= -1052469503;
            var1 ^= 1104492403;
            long var17 = var1;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var21;
            int var19 = (var21 = var18 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var19 == 0) {
                return this.i;
            }
        } else {
            var1 &= -198684081;
            var1 ^= -29737461;
            Integer var13 = var1;
            if (var13 != null) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    public final float aM() {
        int var1 = qG;
        var1 ^= -1281181272;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var25;
        var2 = (var25 = var18 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 = switch (var1) {
                case -1673102557 -> {
                    var1 |= -640555481;
                    var1 &= -368013153;
                    var1 *= 819234157;
                    var1 *= 1911797863;
                    yield var1 ^ 300297973;
                }
                default -> var1 ^ -291508808;
                case 2090100808 -> var1 ^ 1620648151;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var1 &= -1693759891;
            var1 += -1490827909;
            var1 ^= 786478057;
            Integer var15 = var1;
            if (var15 != null) {
                return this.PC;
            }
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }

    public final float eJ() {
        int var1 = qG;
        var1 ^= -777865400;
        int var2 = System.identityHashCode(this);
        Integer var13 = var2;
        if (var13 != null) {
            var1 -= -822488417;
            var1 *= -576278479;
            var1 += 1567172861;
            var1 ^= -1202324982;
            int var14 = var1 + 1;
            var14 = var1 * var14;
            int var3 = var1 + 2;
            var14 *= var3;
            var3 = var1 + 3;
            var14 *= var3;
            var14 &= 7;
            if (var14 != 0) {
                UnsupportedOperationException var19 = new UnsupportedOperationException();
                throw var19;
            } else {
                return this.G;
            }
        } else {
            var1 -= 338674437;
            var1 <<= 14;
            var1 ^= -1951294466;
            AssertionError var8 = new AssertionError();
            throw var8;
        }
    }

    public final float YU() {
        int var1 = qG;
        var1 ^= 2030367429;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            switch (var1) {
                case -934657836:
                default:
                    var1 ^= -311714202;
                    break;
                case -118216433:
                    var1 ^= -1536767082;
                    break;
                case 1457533006:
                    var1 ^= 951577724;
                    var1 ^= -1613458899;
            }

            float var18 = this.vu;
            float var22 = this.Q;
            return var18 * var22;
        } else {
            Integer var9 = switch (var1) {
                case -544624803 -> var1 ^ -387645621;
                default -> var1 ^ 1451337618;
                case 1457533006 -> {
                    var1 >>= 4;
                    var1 ^= 2102540767;
                    yield var1 ^ -165358199;
                }
            };
            if (var9 == null) {
                IllegalStateException var11 = new IllegalStateException();
                throw var11;
            } else {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            }
        }
    }

    public final float Bm() {
        int var1 = qG;
        var1 ^= 1336264136;
        int var2 = System.identityHashCode(this);
        float var3 = this.i;
        float var4 = this.Q;
        Integer var17 = var2;
        if (var17 != null) {
            var1 -= 933098286;
            var1 ^= 964448797;
            var1 -= 769398167;
            var1 ^= 483913874;
            return var3 * var4;
        } else {
            var1 >>= 13;
            var1 += 1491895064;
            var1 &= 2040610445;
            var1 ^= -654213402;
            int var18 = var1 + 1;
            var18 = var1 * var18;
            var1 = var18 & 1;
            if (var1 != 0) {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            } else {
                AssertionError var11 = new AssertionError();
                throw var11;
            }
        }
    }

    protected final boolean mF() {
        int var1 = qG;
        var1 ^= 342457133;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 == null) {
            var1 += 808595678;
            var1 -= 294204299;
            var1 *= 312882775;
            var1 -= -1785542890;
            var1 ^= 1907044348;
            RuntimeException var19 = new RuntimeException();
            throw var19;
        } else {
            var1 += -183625023;
            var1 *= 615385971;
            var1 ^= 245047737;
            long var9 = var1;
            long var3 = var9 + 1L;
            var3 = var9 * var3;
            long var10 = var3 & 1L;
            long var21;
            var1 = (var21 = var10 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
            if (var1 == 0) {
                return this.W;
            } else {
                UnsupportedOperationException var12 = new UnsupportedOperationException();
                throw var12;
            }
        }
    }

    protected final float Hu() {
        int var1 = qG;
        var1 ^= 1052790057;
        int var2 = System.identityHashCode(this);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var32;
        var2 = (var32 = var21 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 <<= 29;
            var1 ^= 1879432426;
            var1 <<= 9;
            var1 *= 2112761189;
            var1 ^= 16120170;
            long var23 = var1;
            var4 = var23 + 1L;
            var4 = var23 * var4;
            long var24 = var4 & 1L;
            long var33;
            var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var26 = new IllegalStateException();
                throw var26;
            }
        } else {
            var1 ^= -652402852;
            var1 ^= 434025407;
            Integer var16 = var1;
            if (var16 != null) {
                XF var18 = this.v;
                return var18.bs();
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    protected final float M(float var1) {
        int var2 = qG;
        var2 ^= -1528313892;
        int var3 = System.identityHashCode(this);
        float var4 = this.I;
        var4 = var1 - var4;
        float var5 = this.o;
        int var6 = var3 + 1;
        var6 = var3 * var6;
        int var7 = var3 + 2;
        var6 *= var7;
        var3 += 3;
        var6 *= var3;
        var3 = var6 & 7;
        if (var3 == 0) {
            var2 *= -735251045;
            var2 += 1832815707;
            var2 *= -334783061;
            var2 ^= 801793699;
            return var4 / var5;
        } else {
            long var12 = switch (var2) {
                case -1962736297 -> {
                    var2 <<= 27;
                    var2 *= 1004671001;
                    yield var2 ^ -1882417755;
                }
                default -> var2 ^ -230614072;
                case -1818248152 -> var2 ^ -319914880;
            };
            long var24 = var12 + 1L;
            long var25 = var12 * var24;
            long var13 = var25 & 1L;
            long var29;
            var2 = (var29 = var13 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    protected final float D(float var1) {
        int var2 = qG;
        var2 ^= -1142048976;
        int var3 = System.identityHashCode(this);
        float var4 = this.zF;
        Integer var18 = var3;
        if (var18 != null) {
            var18 = switch (var2) {
                case -1811319365 -> {
                    var2 ^= -1785899245;
                    yield var2 ^ -1668134946;
                }
                case -1320927106 -> var2 ^ 2110132292;
                default -> var2 ^ -1646270869;
            };
            if (var18 != null) {
                float var20 = var1 - var4;
                var4 = this.o;
                return var20 / var4;
            }
        } else {
            var2 <<= 23;
            var2 >>>= 9;
            var2 &= 167527468;
            var2 ^= 1298619846;
            long var13 = var2;
            long var22 = var13 + 1L;
            long var23 = var13 * var22;
            long var14 = var23 & 1L;
            long var24;
            var2 = (var24 = var14 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    protected final float Gx(float var1) {
        int var2 = qG;
        var2 ^= 2094112134;
        int var3 = System.identityHashCode(this);
        Integer var17 = var3;
        if (var17 == null) {
            var2 >>>= 8;
            var2 -= 1871173723;
            var2 ^= -1199834201;
            long var20 = var2;
            long var5 = var20 + 1L;
            var5 = var20 * var5;
            long var7 = var20 + 2L;
            var5 *= var7;
            long var21 = var20 + 3L;
            var5 *= var21;
            long var22 = var5 & 7L;
            long var29;
            int var23 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var23 == 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            } else {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            }
        } else {
            var2 >>>= 6;
            var2 -= 515008027;
            var2 ^= -1624892466;
            float var13 = this.zF;
            float var18 = this.o;
            float var19 = var18 * var1;
            return var13 + var19;
        }
    }

    public final float ur() {
        int var1 = qG;
        var1 ^= -339399911;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 *= 1182451673;
            var1 &= 1543219901;
            var1 -= 1217511966;
            var1 ^= 1859002583;
            var1 ^= -1439466139;
            Uq var20 = this.cm;
            return var20.WM();
        } else {
            switch (var1) {
                case -1004410478:
                    var1 *= -394835891;
                    var1 -= -905979426;
                    var1 |= 2025126721;
                    var1 ^= -858628937;
                    break;
                case -775006110:
                    var1 ^= 1991103275;
                    break;
                case 936725531:
                default:
                    var1 ^= -1307831668;
            }

            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public float uW(float var1, float var2) {
        int var3 = qG;
        var3 ^= 1303374365;
        int var4 = System.identityHashCode(this);
        Integer var19 = var4;
        if (var19 != null) {
            long var20 = switch (var3) {
                case -1847490728 -> var3 ^ 2088771492;
                case 1649092758 -> {
                    var3 += 548138995;
                    yield var3 ^ 1313271638;
                }
                default -> var3 ^ 1442296638;
            };
            long var6 = var20 + 1L;
            var6 = var20 * var6;
            long var8 = var20 + 2L;
            var6 *= var8;
            long var21 = var20 + 3L;
            var6 *= var21;
            long var22 = var6 & 7L;
            long var35;
            int var23 = (var35 = var22 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var23 == 0) {
                r_2 var25 = this.m;
                Enum var26 = var25.A();
                Cl_2 var27 = (Cl_2)var26;
                float var28 = var27.fx();
                float var5 = var1 - var2;
                float var29 = var28 * var5;
                Uq var30 = this.Tk;
                var5 = var30.WM();
                return var29 + var5;
            } else {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            switch (var3) {
                case -1555191437:
                    var3 ^= -479717518;
                    break;
                case 218594370:
                default:
                    var3 ^= 1353366139;
                    break;
                case 1649092758:
                    var3 *= -1476232837;
                    var3 &= -1413934848;
                    var3 ^= 1581644418;
            }

            IllegalArgumentException var16 = new IllegalArgumentException();
            throw var16;
        }
    }

    public float BG(float var1, float var2) {
        int var3 = qG;
        var3 ^= -984756232;
        int var4 = System.identityHashCode(this);
        r_2 var5 = this.m;
        Enum var18 = var5.A();
        Cl_2 var19 = (Cl_2)var18;
        float var20 = var19.fy();
        float var6 = var1 - var2;
        float var21 = var20 * var6;
        Uq var22 = this.d;
        int var7 = var4 + 1;
        var7 = var4 * var7;
        var4 = var7 & 1;
        if (var4 != 0) {
            var3 <<= 9;
            var3 -= 307142125;
            var3 += -1586879204;
            var3 ^= 364084392;
            RuntimeException var17 = new RuntimeException();
            throw var17;
        } else {
            var3 -= 771793446;
            var3 ^= 1458113350;
            float var11 = var22.WM();
            return var21 + var11;
        }
    }

    public void BH(float var1, float var2, float var3, float var4, float var5, float var6) {
        int var7 = qG;
        var7 ^= -1051618788;
        int var8 = System.identityHashCode(this);
        float var9 = var3 * 0.5F;
        var9 = var1 + var9;
        float var10 = Math.max(1.0F, var5);
        var9 /= var10;
        var10 = var4 * 0.5F;
        var10 = var2 + var10;
        float var11 = Math.max(1.0F, var6);
        var10 /= var11;
        Cl_2 var27 = Cl_2.gJ(var9, var10);
        r_2 var34 = this.m;
        var34.UY(var27);
        Integer var20 = var8;
        if (var20 != null) {
            var20 = switch (var7) {
                case -1455670674 -> var7 ^ -1725554183;
                case -290107241 -> {
                    var7 -= -831846935;
                    var7 &= 451091700;
                    yield var7 ^ -1610282718;
                }
                default -> var7 ^ -460790816;
            };
            if (var20 != null) {
                Uq var23 = this.Tk;
                var10 = var27.fx();
                var11 = var5 - var3;
                var10 *= var11;
                var10 = var1 - var10;
                var23.Bi(var10);
                Uq var24 = this.d;
                var9 = var27.fy();
                var10 = var6 - var4;
                var9 *= var10;
                var9 = var2 - var9;
                var24.Bi(var9);
                this.fS();
            } else {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        } else {
            var7 *= 993145307;
            var7 += -1720725953;
            var7 ^= 282378489;
            UnsupportedOperationException var16 = new UnsupportedOperationException();
            throw var16;
        }
    }

    public void qI() {
        int var1 = qG;
        var1 ^= -1925150117;
        int var2 = System.identityHashCode(this);
        r_2 var3 = this.m;
        var3.s();
        int var26 = var2 + 1;
        int var27 = var2 * var26;
        var2 = var27 & 1;
        if (var2 != 0) {
            var1 >>= 28;
            var1 -= 437078024;
            var1 ^= -1197168934;
            var1 |= -2056547217;
            var1 ^= 434397672;
            long var21 = var1;
            long var4 = var21 + 1L;
            var4 = var21 * var4;
            long var22 = var4 & 1L;
            long var29;
            var2 = (var29 = var22 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 != 0) {
                UnsupportedOperationException var25 = new UnsupportedOperationException();
                throw var25;
            } else {
                AssertionError var24 = new AssertionError();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1566291760:
                    var1 |= 1452636106;
                    var1 *= -115257785;
                    var1 ^= -1256034534;
                    break;
                case -1550175067:
                default:
                    var1 ^= -1592327433;
                    break;
                case -68031474:
                    var1 ^= -25777216;
            }

            Uq var12 = this.Tk;
            var12.s();
            Uq var13 = this.d;
            var13.s();
            Uq var14 = this.cm;
            var14.s();
        }
    }

    public void YR(float var1) {
        int var2 = qG;
        var2 ^= -1480930450;
        int var3 = System.identityHashCode(this);
        Uq var4 = this.cm;
        Integer var18 = var3;
        if (var18 == null) {
            var2 -= 1535615393;
            var2 -= 1957833471;
            var2 &= 909086136;
            var2 ^= 1599131649;
            var18 = var2;
            if (var18 != null) {
                AssertionError var21 = new AssertionError();
                throw var21;
            } else {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var2 *= 1451538053;
            var2 *= -1502264231;
            var2 &= 241407808;
            var2 |= -1462517697;
            var2 ^= 1170855327;
            Uq var11 = this.cm;
            float var12 = var11.WM();
            float var13 = var12 + var1;
            var4.Bi(var13);
        }
    }

    public void jA(boolean var1) {
        label92: {
            int var2 = qG;
            var2 ^= 5627942;
            int var3 = System.identityHashCode(this);
            XF var4 = this.v;
            Integer var5 = var3;
            if (var5 == null) {
                switch (var2) {
                    case -1836207008:
                        var2 ^= -1172816800;
                        break;
                    case 800137901:
                        var2 >>>= 20;
                        var2 *= -1505302715;
                        var2 &= 1940667262;
                        var2 ^= -984698921;
                        break;
                    case 1822584868:
                    default:
                        var2 ^= -1154247523;
                }
            } else {
                label99: {
                    var2 = switch (var2) {
                        default -> var2 ^ 96609421;
                        case 800137901 -> {
                            var2 |= -1641204732;
                            var2 *= 618458161;
                            var2 *= 1234118935;
                            var2 *= 478187631;
                            yield var2 ^ -1837040896;
                        }
                        case 812306852 -> var2 ^ -1764970265;
                    };
                    kE_2 var90;
                    if (var1) {
                        var2 ^= 1544521195;
                        var2 -= 1951160928;
                        var2 ^= 1895758395;
                        kE_2 var89 = s;
                        Integer var6 = var3;
                        if (var6 == null) {
                            var2 |= -821882511;
                            var2 ^= 998355076;
                            break label99;
                        }

                        var2 >>= 4;
                        var2 ^= -522887912;
                        var2 >>>= 20;
                        var2 ^= -1026521482;
                        var2 ^= -2143374523;
                        var6 = var2;
                        if (var6 == null) {
                            break label92;
                        }

                        var90 = var89;
                        var2 >>= 4;
                        var2 |= -1349978773;
                        var2 &= -1118792535;
                        var2 ^= -2116024193;
                    } else {
                        var2 += 439017419;
                        var2 -= 774686338;
                        var2 |= -1801334299;
                        var2 -= -508140865;
                        var2 ^= 136695413;
                        Integer var99 = var2;
                        if (var99 == null) {
                            break label92;
                        }

                        kE_2 var100 = A;
                        Integer var7 = var3;
                        if (var7 == null) {
                            var2 >>>= 23;
                            var2 ^= -733043238;
                            break label99;
                        }

                        var2 *= -278895893;
                        var2 ^= 1664667132;
                        var2 ^= 1487652493;
                        var7 = var2;
                        if (var7 == null) {
                            break label92;
                        }

                        var90 = var100;
                        var2 += -546954115;
                        var2 |= -574302693;
                        var2 ^= -788239603;
                    }

                    var4 = var4.x(var90);
                    long var68 = var3;
                    long var91 = var68 + 1L;
                    long var92 = var68 * var91;
                    long var69 = var92 & 1L;
                    long var106;
                    var3 = (var106 = var69 - 0L) == 0L ? 0 : (var106 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var2 += 609668093;
                        var2 ^= -591577042;
                        var2 |= -508214752;
                        var2 ^= -1180550556;
                        var3 = var2 + 1;
                        var3 = var2 * var3;
                        int var82 = var2 + 2;
                        var3 *= var82;
                        int var83 = var2 + 3;
                        var3 *= var83;
                        var3 &= 7;
                        if (var3 == 0) {
                            XF var76 = this.v;
                            float var87;
                            if (var1) {
                                var2 >>>= 7;
                                var2 >>>= 14;
                                var2 ^= -562620750;
                                long var84 = var2;
                                long var101 = var84 + 1L;
                                var101 = var84 * var101;
                                long var85 = var101 & 1L;
                                long var107;
                                int var86 = (var107 = var85 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                                if (var86 != 0) {
                                    break label92;
                                }

                                var87 = 1.0F;
                                var2 *= 1125264187;
                                var2 &= -624671432;
                                var2 ^= 1432676689;
                                var2 ^= 8900992;
                            } else {
                                var2 += 610084176;
                                var2 ^= -1370359245;
                                var2 >>>= 28;
                                var2 *= -1004289447;
                                var2 ^= 1331032818;
                                var87 = 0.0F;
                                switch (var2) {
                                    case -1165677449:
                                        var2 -= -768850203;
                                        var2 <<= 28;
                                        var2 >>= 13;
                                        var2 <<= 15;
                                        var2 ^= -1780007695;
                                        break;
                                    case -810032964:
                                        var2 ^= -610922534;
                                        break;
                                    case 1056664757:
                                    default:
                                        var2 ^= 714000316;
                                }
                            }

                            int var93 = var2 + 1;
                            var93 = var2 * var93;
                            int var103 = var2 + 2;
                            var93 *= var103;
                            var103 = var2 + 3;
                            var93 *= var103;
                            var93 &= 7;
                            if (var93 == 0) {
                                var76.H(var87);
                                return;
                            }
                        }
                        break label92;
                    }

                    switch (var2) {
                        case -56661748:
                        default:
                            var2 ^= 1082953959;
                            break;
                        case 752917590:
                            var2 -= 1025414726;
                            var2 += -318078592;
                            var2 ^= 142746209;
                            break;
                        case 1116264654:
                            var2 ^= -283460077;
                    }
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var88 = var2 + 2;
            var3 *= var88;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                AssertionError var66 = new AssertionError();
                throw var66;
            }
        }

        UnsupportedOperationException var67 = new UnsupportedOperationException();
        throw var67;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -848905807;
        int var2 = Yn.C;
        int var4 = of_2.kj(var3, var1, var2);
        qG = var4;
        kE_2 var5 = kE_2.uY(0.46F, 0.74F);
        s = var5;
        kE_2 var6 = kE_2.uY(0.3F, 1.0F);
        A = var6;
    }
}
