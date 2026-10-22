package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class rH {
    private final int BH;
    public static final int t;

    public rH(int var1) {
        int var2 = var1 * -1640531535;
        this.BH = var2;
    }

    private float oD(int var1, int var2, int var3) {
        int var6 = System.identityHashCode(this);
        Integer var18 = var6;
        if (var18 != null) {
            int var16 = var3 & -1459248489;
            var16 ^= -535246740;
            int var19 = var1 * 668265261;
            int var7 = var2 * 374761393;
            var19 ^= var7;
            var7 = this.BH;
            var19 ^= var7;
            var7 = var19 >>> 15;
            var7 = var19 ^ var7;
            var7 *= 739982445;
            int var30 = var7 >>> 12;
            var7 ^= var30;
            var7 *= 695872825;
            int var33 = var7 >>> 15;
            var7 ^= var33;
            var19 = var7 & 16777215;
            float var25 = var19;
            return var25 / 1.6777216E7F;
        } else {
            int var4 = var3 & -1252196060;
            var4 &= -28670597;
            var4 ^= -594445971;
            var4 ^= -56669795;
            var4 = var1 + 1;
            var4 = var1 * var4;
            var4 &= 1;
            if (var4 != 0) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            } else {
                IllegalArgumentException var14 = new IllegalArgumentException();
                throw var14;
            }
        }
    }

    public float g(float var1, float var2) {
        int var3 = t;
        var3 ^= -394359343;
        int var4 = System.identityHashCode(this);
        double var5 = var1;
        var5 = Math.floor(var5);
        int var38 = (int)var5;
        double var6 = var2;
        var6 = Math.floor(var6);
        int var42 = (int)var6;
        float var7 = var38;
        var7 = var1 - var7;
        float var8 = var42;
        var8 = var2 - var8;
        float var9 = var7 * var7;
        var9 *= var7;
        float var10 = var7 * 6.0F;
        var10 -= 15.0F;
        var10 = var7 * var10;
        var10 += 10.0F;
        var9 *= var10;
        var9 = var8 * var8;
        var9 *= var8;
        var10 = var8 * 6.0F;
        var10 -= 15.0F;
        var10 = var8 * var10;
        var10 += 10.0F;
        int var11 = var4 + 1;
        var11 = var4 * var11;
        var4 = var11 & 1;
        if (var4 == 0) {
            var3 *= 1121183977;
            var3 *= 1920310387;
            var3 |= 782630355;
            var3 *= 247964311;
            var3 ^= -1874663113;
            float var26 = var9 * var10;
            var4 = var3 ^ 58509757;
            var4 >>>= 21;
            var4 += 1679457197;
            var4 ^= 60141960;
            float var31 = this.oD(var38, var42, var4);
            int var56 = var38 + 1;
            int var65 = var3 - 515549046;
            int var66 = var65 + 1192837692;
            int var67 = var66 ^ 1577390865;
            int var68 = var67 * -1846073769;
            int var69 = var68 ^ 1335986015;
            float var57 = this.oD(var56, var42, var69);
            int var70 = var42 + 1;
            var11 = var3 + 1237499376;
            var11 ^= -37716302;
            var10 = this.oD(var38, var70, var11);
            var38++;
            var42++;
            var11 = var3 >>> 4;
            var11 += 1352424856;
            var11 >>= 19;
            var11 >>= 27;
            var11 ^= 1737478084;
            float var40 = this.oD(var38, var42, var11);
            float var44 = var57 - var31;
            float var45 = var44 * var9;
            float var46 = var31 + var45;
            float var80 = var10 - var31;
            float var81 = var80 * var26;
            float var47 = var46 + var81;
            float var32 = var31 - var57;
            float var33 = var32 - var10;
            float var34 = var33 + var40;
            float var35 = var34 * var9;
            float var36 = var35 * var26;
            return var47 + var36;
        } else {
            var3 |= 1651262548;
            var3 ^= 1872343031;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var3 = var4 & 1;
            if (var3 != 0) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            } else {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }
    }

    public float dA(float var1, float var2, int var3) {
        label47: {
            int var4 = t;
            int var5 = var3;
            var4 ^= -576367982;
            int var6 = System.identityHashCode(this);
            float var7 = 0.0F;
            float var8 = 0.5F;
            float var9 = 0.0F;
            int var10 = 0;
            int var11 = var6 + 1;
            var11 = var6 * var11;
            var11 &= 1;
            int var12 = of_2.EM;
            var4 ^= var12;
            var4 ^= -1767770242;
            of_2.EM = -1767770242;
            var12 = of_2.Hi;
            var4 ^= var12;
            var4 ^= 1545382391;
            of_2.Hi = 1545382391;
            if (var11 != 0) {
                var4 ^= 2017604690;
                var4 ^= 1562065734;
            } else {
                var4 >>= 27;
                var4 &= -1046741584;
                var4 &= -796426368;
                var4 ^= -1798549435;
                var7 = var7;
                var8 = var8;
                var9 = var9;
                var10 = var10;
                float var65 = var1;
                float var67 = var2;

                var4 = switch (var4) {
                    case -1798549435 -> {
                        var4 ^= -1688699274;
                        var4 >>= 19;
                        var4 -= -1782097225;
                        var4 |= 548970968;
                        yield var4 ^ -725436705;
                    }
                    case 903053428 -> var4 ^ -337943811;
                    default -> var4 ^ 2131880609;
                };

                while (true) {
                    if (var10 >= var3) {
                        var4 ^= 746791989;
                        var4 ^= -1626221677;
                        return var7 / var9;
                    }

                    var4 += 1565329393;
                    var4 *= -1331146625;
                    var4 *= -1972353575;
                    var4 |= 1333376585;
                    var4 ^= -682206036;
                    Integer var13 = var5;
                    if (var13 == null) {
                        break label47;
                    }

                    float var68 = this.g(var65, var67);
                    float var69 = var8 * var68;
                    float var70 = var7 + var69;
                    float var14 = var9 + var8;
                    float var15 = 1.6F * var65;
                    float var16 = 1.2F * var67;
                    var15 += var16;
                    var16 = -1.2F * var65;
                    Integer var17 = var6;
                    if (var17 == null) {
                        var4 &= -392483871;
                        var4 >>= 16;
                        var4 ^= 1631848241;
                        break;
                    }

                    var4 &= 2131281535;
                    var4 &= 215696482;
                    var4 >>= 6;
                    var4 ^= -16668110;
                    var4 ^= -852323978;
                    int var76 = var5 + 1;
                    var76 = var5 * var76;
                    var76 &= 1;
                    if (var76 != 0) {
                        break label47;
                    }

                    float var79 = 1.6F * var67;
                    var16 += var79;
                    var15 += 17.3F;
                    var16 += 5.1F;
                    float var80 = var8 * 0.5F;
                    int var18 = var10 + 1;
                    var7 = var70;
                    var8 = var80;
                    var9 = var14;
                    var10 = var18;
                    var65 = var15;
                    var67 = var16;
                    var4 >>>= 2;
                    var4 |= 416191554;
                    var4 ^= -1565210633;
                }
            }

            long var52 = var5;
            long var61 = var52 + 1L;
            long var62 = var52 * var61;
            long var53 = var62 & 1L;
            long var81;
            var5 = (var81 = var53 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
            if (var5 == 0) {
                RuntimeException var55 = new RuntimeException();
                throw var55;
            }
        }

        RuntimeException var56 = new RuntimeException();
        throw var56;
    }

    public float R(float var1, float var2, int var3) {
        int var4 = t;
        var4 ^= -1961208182;
        int var6 = System.identityHashCode(this);
        float var7 = this.dA(var1, var2, var3);
        var7 *= 2.0F;
        long var8 = var6;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        long var12 = var8 + 2L;
        var10 *= var12;
        var8 += 3L;
        var10 *= var8;
        var8 = var10 & 7L;
        long var41;
        var6 = (var41 = var8 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var6 != 0) {
            var4 ^= 1221396154;
            var4 -= 496032841;
            var4 -= 746386835;
            var4 ^= -1405208836;
            RuntimeException var32 = new RuntimeException();
            throw var32;
        } else {
            switch (var4) {
                case -679689313:
                    var4 ^= -1610067045;
                    break;
                case 312616116:
                    var4 -= -2079346849;
                    var4 |= -2055964881;
                    var4 <<= 27;
                    var4 ^= -2137553615;
                    break;
                case 748477793:
                default:
                    var4 ^= -1454174679;
            }

            long var21 = var3;
            var8 = var21 + 1L;
            var8 = var21 * var8;
            long var22 = var8 & 1L;
            long var42;
            var4 = (var42 = var22 - 0L) == 0L ? 0 : (var42 < 0L ? -1 : 1);
            if (var4 != 0) {
                AssertionError var26 = new AssertionError();
                throw var26;
            } else {
                float var24 = var7 - 1.0F;
                float var25 = Math.abs(var24);
                return 1.0F - var25;
            }
        }
    }

    public float ti(int var1, int var2) {
        int var3 = t;
        var3 ^= 1024824293;
        int var5 = System.identityHashCode(this);
        int var6 = var1 * 7919;
        int var7 = var5 + 1;
        var7 = var5 * var7;
        int var8 = var5 + 2;
        var7 *= var8;
        var5 += 3;
        var7 *= var5;
        var5 = var7 & 7;
        if (var5 == 0) {
            var3 ^= 445414105;
            var3 -= 704586178;
            var3 ^= -631744575;
            long var28 = var1;
            long var9 = var28 + 1L;
            var9 = var28 * var9;
            long var29 = var9 & 1L;
            long var34;
            var5 = (var34 = var29 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var5 == 0) {
                var5 = var2 * 104729;
                var7 = var3 & 328832931;
                var7 += -1329604480;
                var7 ^= -715648827;
                return this.oD(var6, var5, var7);
            }
        } else {
            var3 ^= 490024101;
            var3 -= 1131078100;
            var3 ^= 145253960;
            Integer var18 = var1;
            if (var18 != null) {
                RuntimeException var20 = new RuntimeException();
                throw var20;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1289193879;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        t = var4;
    }
}
