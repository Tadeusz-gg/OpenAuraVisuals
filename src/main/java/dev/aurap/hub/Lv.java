package dev.aurap.hub;

@FunctionalInterface
public interface Lv {
    float l(float var1);

    default Lv d() {
        int var1 = 768207783;
        int var2 = System.identityHashCode(this);
        long var14 = var2;
        long var4 = var14 + 1L;
        var4 = var14 * var4;
        long var15 = var4 & 1L;
        long var21;
        var2 = (var21 = var15 - 0L) == 0L ? 0 : (var21 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= -1693911735;
            var1 |= -763561460;
            var1 ^= -1866676077;
            IllegalStateException var19 = new IllegalStateException();
            throw var19;
        } else {
            var1 |= -72835680;
            var1 <<= 23;
            var1 ^= -613800449;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 != 0) {
                UnsupportedOperationException var10 = new UnsupportedOperationException();
                throw var10;
            } else {
                return var1x -> {
                    int var2x = 192836801;
                    int var3 = System.identityHashCode(this);
                    long var19x = var3;
                    long var5 = var19x + 1L;
                    var5 = var19x * var5;
                    long var20x = var5 & 1L;
                    long var34;
                    var3 = (var34 = var20x - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        var2x ^= 1286278454;
                        var2x ^= -797554229;
                        long var22 = var2x;
                        var5 = var22 + 1L;
                        var5 = var22 * var5;
                        long var7x = var22 + 2L;
                        var5 *= var7x;
                        long var23 = var22 + 3L;
                        var5 *= var23;
                        long var24 = var5 & 7L;
                        long var35;
                        var3 = (var35 = var24 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            IllegalArgumentException var26 = new IllegalArgumentException();
                            throw var26;
                        }
                    } else {
                        var2x >>>= 25;
                        var2x &= 2111791398;
                        var2x += 1946215201;
                        var2x ^= 542356825;
                        var3 = var2x + 1;
                        var3 = var2x * var3;
                        var2x = var3 & 1;
                        if (var2x == 0) {
                            float var17x = 1.0F - var1x;
                            float var18x = this.l(var17x);
                            return 1.0F - var18x;
                        }
                    }

                    RuntimeException var16x = new RuntimeException();
                    throw var16x;
                };
            }
        }
    }

    default Lv I() {
        int var1 = -1076619551;
        int var2 = System.identityHashCode(this);
        long var15 = var2;
        long var4 = var15 + 1L;
        var4 = var15 * var4;
        long var6 = var15 + 2L;
        var4 *= var6;
        long var16 = var15 + 3L;
        var4 *= var16;
        long var17 = var4 & 7L;
        long var28;
        var2 = (var28 = var17 - 0L) == 0L ? 0 : (var28 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 ^= -1668181045;
            var1 += 642360533;
            var1 ^= -1314196907;
            long var19 = var1;
            var4 = var19 + 1L;
            var4 = var19 * var4;
            long var20 = var4 & 1L;
            long var29;
            var2 = (var29 = var20 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
            if (var2 != 0) {
                AssertionError var22 = new AssertionError();
                throw var22;
            } else {
                return var1x -> {
                    label67: {
                        int var2x = 305359659;
                        int var3 = System.identityHashCode(this);
                        Integer var4x = var3;
                        if (var4x == null) {
                            var2x >>>= 14;
                            var2x &= 87800730;
                            var2x &= 2082305601;
                            var2x ^= 10161020;
                        } else {
                            label66: {
                                var2x |= 1268677549;
                                var2x ^= -1963954347;
                                float var77;
                                int var53 = (var77 = var1x - 0.5F) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
                                float var60;
                                if (var53 < 0) {
                                    var2x *= 1478436033;
                                    var2x ^= -1732268065;
                                    long var54 = var2x;
                                    long var6x = var54 + 1L;
                                    var6x = var54 * var6x;
                                    long var55 = var6x & 1L;
                                    long var78;
                                    var53 = (var78 = var55 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                                    if (var53 != 0) {
                                        break label67;
                                    }

                                    float var57 = var1x * 2.0F;
                                    Integer var5 = var3;
                                    if (var5 == null) {
                                        switch (var2x) {
                                            case -43493467:
                                                var2x &= 90344848;
                                                var2x += -1769249056;
                                                var2x &= -1339143485;
                                                var2x ^= -1867431108;
                                                break label66;
                                            case 1321041147:
                                            default:
                                                var2x ^= 1956433362;
                                                break label66;
                                            case 1575868716:
                                                var2x ^= -2006367073;
                                                break label66;
                                        }
                                    }

                                    var2x += -1724259842;
                                    var2x *= -731211413;
                                    var2x ^= -1795514911;
                                    long var61 = var2x;
                                    long var7 = var61 + 1L;
                                    var7 = var61 * var7;
                                    long var9x = var61 + 2L;
                                    var7 *= var9x;
                                    long var62 = var61 + 3L;
                                    var7 *= var62;
                                    long var63 = var7 & 7L;
                                    long var79;
                                    int var64 = (var79 = var63 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                                    if (var64 != 0) {
                                        break label67;
                                    }

                                    float var58 = this.l(var57);
                                    float var59 = var58 * 0.5F;
                                    var60 = var59;
                                    var2x -= -1539658453;
                                    var2x ^= -1965717032;
                                } else {
                                    var2x += -1247691938;
                                    var2x ^= -2109889264;
                                    var2x ^= -1184378773;
                                    Integer var65 = var2x;
                                    if (var65 == null) {
                                        break label67;
                                    }

                                    float var66 = 1.0F - var1x;
                                    float var67 = var66 * 2.0F;
                                    float var68 = this.l(var67);
                                    Integer var41 = var3;
                                    if (var41 == null) {
                                        var2x ^= 1686429211;
                                        var2x -= -859173726;
                                        var2x |= 1769732124;
                                        var2x ^= 1843721698;
                                        break label66;
                                    }

                                    var2x += 304859499;
                                    var2x ^= -1929431207;
                                    int var42 = var2x + 1;
                                    var42 = var2x * var42;
                                    var42 &= 1;
                                    if (var42 != 0) {
                                        break label67;
                                    }

                                    float var45 = var68 * 0.5F;
                                    float var46 = 1.0F - var45;
                                    var60 = var46;
                                    var2x -= 500231796;
                                    var2x -= -1973716158;
                                    var2x *= 390492957;
                                    var2x ^= -145687056;
                                }

                                var3 = var2x + 1;
                                var3 = var2x * var3;
                                int var69 = var2x + 2;
                                var3 *= var69;
                                var2x += 3;
                                var3 *= var2x;
                                var2x = var3 & 7;
                                if (var2x == 0) {
                                    return var60;
                                }
                                break label67;
                            }
                        }

                        long var71 = var2x;
                        long var8x = var71 + 1L;
                        var8x = var71 * var8x;
                        var71 = var8x & 1L;
                        long var80;
                        var3 = (var80 = var71 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            UnsupportedOperationException var52 = new UnsupportedOperationException();
                            throw var52;
                        }
                    }

                    UnsupportedOperationException var40 = new UnsupportedOperationException();
                    throw var40;
                };
            }
        } else {
            var1 |= -1971845269;
            var1 <<= 14;
            var1 ^= 1932186832;
            RuntimeException var11 = new RuntimeException();
            throw var11;
        }
    }
}
