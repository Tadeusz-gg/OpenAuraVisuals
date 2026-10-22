package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Glass;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class zG {
    public Glass glass;
    public int ink;
    public int shadow = 1426063360;
    public int sheen;
    public int rimTop = 352321535;
    public int rimBottom = 352321535;
    public float rimWidth = 0.5F;
    public int inset;
    public int insetRim;
    public int line;
    public int track;
    public int trackLine;
    public int text;
    public int value;
    public int text2;
    public int text3;
    public int accent;
    public int accent2;
    public int effect;
    public int harmful;
    public static final int v;

    public zG() {
    }

    public zG v(int var1) {
        int var2 = v;
        var2 ^= -1595712914;
        int var4 = System.identityHashCode(this);
        long var20 = var4;
        long var6 = var20 + 1L;
        var6 = var20 * var6;
        long var21 = var6 & 1L;
        long var25;
        var4 = (var25 = var21 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
        if (var4 == 0) {
            var2 += 562816968;
            var2 ^= 595314037;
            Integer var23 = var1;
            if (var23 != null) {
                this.shadow = var1;
                return this;
            }
        } else {
            switch (var2) {
                case -1274004552:
                    var2 &= 1771306883;
                    var2 <<= 14;
                    var2 <<= 2;
                    var2 ^= 2066845469;
                    break;
                case 1510613047:
                    var2 ^= -1738966432;
                    break;
                case 1613468162:
                default:
                    var2 ^= 244887885;
            }

            Integer var17 = var1;
            if (var17 != null) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public zG h(int var1) {
        int var2 = v;
        var2 ^= -325801993;
        int var4 = System.identityHashCode(this);
        long var19 = var4;
        long var6 = var19 + 1L;
        var6 = var19 * var6;
        long var8 = var19 + 2L;
        var6 *= var8;
        long var20 = var19 + 3L;
        var6 *= var20;
        long var21 = var6 & 7L;
        long var26;
        var4 = (var26 = var21 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var4 == 0) {
            var2 ^= 650730087;
            var2 ^= -2000321010;
            this.sheen = var1;
            return this;
        } else {
            var2 *= 10875827;
            var2 *= 2003451313;
            var2 ^= 398338404;
            Integer var14 = var1;
            if (var14 == null) {
                AssertionError var16 = new AssertionError();
                throw var16;
            } else {
                AssertionError var15 = new AssertionError();
                throw var15;
            }
        }
    }

    public zG wr(int var1, int var2, float var3) {
        int var4 = v;
        var4 ^= 523516557;
        int var5 = System.identityHashCode(this);
        this.rimTop = var1;
        this.rimBottom = var2;
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var5 = var6 & 1;
        if (var5 != 0) {
            var4 += 949928687;
            var4 ^= -1761862194;
            AssertionError var15 = new AssertionError();
            throw var15;
        } else {
            var4 += -1740983312;
            var4 &= 1328555400;
            var4 &= 948537220;
            var4 ^= 1266528611;
            this.rimWidth = var3;
            return this;
        }
    }

    public zG DP(int var1, int var2) {
        int var3 = v;
        var3 ^= -1765104682;
        int var5 = System.identityHashCode(this);
        this.inset = var1;
        Integer var16 = var5;
        if (var16 == null) {
            var3 &= 123196555;
            var3 &= -143294282;
            var3 ^= 68881168;
            Integer var4 = var1;
            if (var4 != null) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        } else {
            var3 &= 1963162622;
            var3 &= -60453977;
            var3 |= -2055135138;
            var3 ^= 428373576;
            this.insetRim = var2;
            return this;
        }
    }

    public zG zX(int var1) {
        int var2 = v;
        var2 ^= -1488612510;
        int var4 = System.identityHashCode(this);
        Integer var15 = var4;
        if (var15 == null) {
            var2 += 426872670;
            var2 ^= 283222909;
            Integer var3 = var1;
            if (var3 != null) {
                IllegalStateException var14 = new IllegalStateException();
                throw var14;
            } else {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            }
        } else {
            var2 -= 2028957367;
            var2 += -122120801;
            var2 *= 942540153;
            var2 ^= 2124812495;
            var2 ^= 1192481165;
            this.line = var1;
            return this;
        }
    }

    public zG P(int var1, int var2) {
        int var3 = v;
        var3 ^= -1940376474;
        int var5 = System.identityHashCode(this);
        long var26 = var5;
        long var7 = var26 + 1L;
        var7 = var26 * var7;
        long var27 = var7 & 1L;
        long var31;
        var5 = (var31 = var27 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var5 == 0) {
            var3 &= 1447074200;
            var3 |= -991171801;
            var3 <<= 24;
            var3 ^= 938185754;
            this.track = var1;
            this.trackLine = var2;
            return this;
        } else {
            var3 |= -1061770738;
            var3 ^= 69301158;
            var3 *= -250832241;
            var3 += -2104262389;
            var3 ^= -1505921821;
            var3 = var1 + 1;
            var3 = var1 * var3;
            var5 = var1 + 2;
            var3 *= var5;
            int var4 = var1 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            } else {
                UnsupportedOperationException var20 = new UnsupportedOperationException();
                throw var20;
            }
        }
    }

    public zG E(int var1, int var2, int var3, int var4) {
        int var5 = v;
        var5 ^= -1746009446;
        int var7 = System.identityHashCode(this);
        this.text = var1;
        int var8 = var7 + 1;
        var8 = var7 * var8;
        var7 = var8 & 1;
        if (var7 != 0) {
            switch (var5) {
                case -2095226036:
                    var5 &= 1481036793;
                    var5 -= -906065541;
                    var5 ^= 1409375886;
                    break;
                case 621495330:
                    var5 ^= 411659566;
                    break;
                case 1144315024:
                default:
                    var5 ^= 819719778;
            }

            Integer var23 = var1;
            if (var23 != null) {
                IllegalStateException var24 = new IllegalStateException();
                throw var24;
            }
        } else {
            var5 -= 1902297978;
            var5 &= -520732786;
            var5 ^= 649613007;
            var5 = var1 + 1;
            var5 = var1 * var5;
            var5 &= 1;
            if (var5 == 0) {
                this.value = var2;
                this.text2 = var3;
                this.text3 = var4;
                return this;
            }
        }

        UnsupportedOperationException var21 = new UnsupportedOperationException();
        throw var21;
    }

    public zG Ke(int var1, int var2) {
        int var3 = v;
        var3 ^= 1179916112;
        int var5 = System.identityHashCode(this);
        this.accent = var1;
        int var6 = var5 + 1;
        var6 = var5 * var6;
        var5 = var6 & 1;
        if (var5 != 0) {
            var3 ^= 1378047512;
            var3 ^= 1735143401;
            AssertionError var20 = new AssertionError();
            throw var20;
        } else {
            switch (var3) {
                case 489957201:
                default:
                    var3 ^= 2048101627;
                    break;
                case 1151692976:
                    var3 ^= 69649432;
                    break;
                case 1386706566:
                    var3 *= 1250236133;
                    var3 ^= 492648743;
                    var3 *= -485564621;
                    var3 &= -1172657633;
                    var3 ^= -173561927;
            }

            Integer var15 = var1;
            if (var15 != null) {
                this.accent2 = var2;
                return this;
            } else {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            }
        }
    }

    public zG ng(int var1) {
        int var2 = v;
        var2 ^= 1804341115;
        int var4 = System.identityHashCode(this);
        Integer var21 = var4;
        if (var21 != null) {
            var2 *= 620279709;
            var2 >>= 15;
            var2 ^= 321941251;
            var2 &= 1751837257;
            var2 ^= 216495545;
            long var22 = var1;
            long var6 = var22 + 1L;
            var6 = var22 * var6;
            long var8 = var22 + 2L;
            var6 *= var8;
            long var23 = var22 + 3L;
            var6 *= var23;
            long var24 = var6 & 7L;
            long var29;
            int var25 = (var29 = var24 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var25 == 0) {
                this.effect = var1;
                return this;
            }
        } else {
            var2 ^= 2140021768;
            var2 ^= 1444356872;
            Integer var18 = var1;
            if (var18 != null) {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        }

        AssertionError var19 = new AssertionError();
        throw var19;
    }

    public zG e(int var1) {
        int var2 = v;
        var2 ^= -83474317;
        int var3 = System.identityHashCode(this);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            var2 -= 1156831178;
            var2 -= 683787954;
            var2 >>>= 21;
            var2 ^= 273207376;
            var2 ^= -1946287369;
            UnsupportedOperationException var21 = new UnsupportedOperationException();
            throw var21;
        } else {
            switch (var2) {
                case -1875624387:
                default:
                    var2 ^= 1435212114;
                    break;
                case -269145691:
                    var2 -= 850253034;
                    var2 *= 1570259141;
                    var2 |= -2000354816;
                    var2 &= 231080955;
                    var2 ^= -1394359667;
                    break;
                case 260235856:
                    var2 ^= -2056556994;
            }

            this.harmful = var1;
            return this;
        }
    }

    public Oo tB() {
        int var1 = v;
        var1 ^= 248309432;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 += -1167089085;
            var1 -= 1360863106;
            var1 ^= -410051622;
            long var19 = var1;
            long var4 = var19 + 1L;
            var4 = var19 * var4;
            long var20 = var4 & 1L;
            long var27;
            int var21 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var21 == 0) {
                return new Oo(this);
            }
        } else {
            var1 |= 2001825629;
            var1 >>= 19;
            var1 += -427122077;
            var1 ^= 185586475;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            int var3 = var1 + 2;
            var22 *= var3;
            var1 += 3;
            var22 *= var1;
            var1 = var22 & 7;
            if (var1 == 0) {
                AssertionError var17 = new AssertionError();
                throw var17;
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    public zG copy(int var1) {
        int var3 = System.identityHashCode(this);
        zG var4 = new zG();
        Glass var5 = this.glass;
        var4.glass = var5;
        int var28 = this.ink;
        var4.ink = var28;
        int var29 = this.shadow;
        var4.shadow = var29;
        int var30 = this.sheen;
        var4.sheen = var30;
        int var31 = this.rimTop;
        var4.rimTop = var31;
        int var32 = this.rimBottom;
        var4.rimBottom = var32;
        float var33 = this.rimWidth;
        var4.rimWidth = var33;
        int var34 = this.inset;
        var4.inset = var34;
        int var35 = this.insetRim;
        var4.insetRim = var35;
        int var36 = var3 + 1;
        int var37 = var3 * var36;
        var3 = var37 & 1;
        if (var3 != 0) {
            int var2 = var1 | 677498963;
            var2 *= 1984131267;
            var2 ^= -1353907044;
            Integer var24 = var2;
            if (var24 != null) {
                AssertionError var25 = new AssertionError();
                throw var25;
            }
        } else {
            int var8 = var1 * 1750943923;
            var8 ^= -870528925;
            var3 = var8 + 1;
            var3 = var8 * var3;
            var8 = var3 & 1;
            if (var8 == 0) {
                var8 = this.line;
                var4.line = var8;
                var8 = this.track;
                var4.track = var8;
                var8 = this.trackLine;
                var4.trackLine = var8;
                var8 = this.text;
                var4.text = var8;
                var8 = this.value;
                var4.value = var8;
                var8 = this.text2;
                var4.text2 = var8;
                var8 = this.text3;
                var4.text3 = var8;
                var8 = this.accent;
                var4.accent = var8;
                var8 = this.accent2;
                var4.accent2 = var8;
                var8 = this.effect;
                var4.effect = var8;
                var8 = this.harmful;
                var4.harmful = var8;
                return var4;
            }
        }

        IllegalStateException var11 = new IllegalStateException();
        throw var11;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1963627257;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        v = var4;
    }
}
