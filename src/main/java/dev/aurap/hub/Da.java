package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public enum Da {
    KARAMBIT(0.045F, 0.48F, new float[]{0.06F, 0.14F, 0.0F, 15.0F, -40.0F, 52.0F, 180.0F, 0.0F}),
    BAYONET(0.031F, 0.5F, new float[]{0.06F, 0.2F, 0.0F, 5.0F, -17.0F, 50.0F, 180.0F, 0.0F});

    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int YAW = 3;
    public static final int PITCH = 4;
    public static final int ROLL = 5;
    public static final int SPIN = 6;
    public static final int TWIRL = 7;
    public static final int CHANNELS = 8;
    private final float D;
    private final float yP;
    private final float[] k;
    private final float[] A;
    private final float[] z;
    private volatile KK q;
    public static final int Hg;

    private Da(float var3, float var4, float[] var5) {
        float[] var6 = new float[3];
        this.A = var6;
        var6 = new float[3];
        this.z = var6;
        this.D = var3;
        this.yP = var4;
        this.k = var5;
    }

    public float scale() {
        int var1 = Hg;
        var1 ^= 148143666;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var6 = var18 + 2L;
        var4 *= var6;
        long var19 = var18 + 3L;
        var4 *= var19;
        long var20 = var4 & 7L;
        long var36;
        var2 = (var36 = var20 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 >>>= 1;
            var1 >>>= 2;
            var1 |= -1141254427;
            var1 ^= 615781287;
            var1 ^= 728353083;
            long var22 = var1;
            var4 = var22 + 1L;
            var4 = var22 * var4;
            var6 = var22 + 2L;
            var4 *= var6;
            long var23 = var22 + 3L;
            var4 *= var23;
            long var24 = var4 & 7L;
            long var37;
            var2 = (var37 = var24 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            } else {
                RuntimeException var26 = new RuntimeException();
                throw var26;
            }
        } else {
            switch (var1) {
                case -2131360473:
                    var1 >>>= 16;
                    var1 ^= -784964735;
                    break;
                case -123414777:
                    var1 ^= -1953813521;
                    break;
                case 1873382113:
                default:
                    var1 ^= -840664565;
            }

            return this.D;
        }
    }

    public float idle(int var1) {
        int var2 = Hg;
        var2 ^= 47215552;
        int var4 = System.identityHashCode(this);
        float[] var5 = this.k;
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var41;
        var4 = (var41 = var6 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
        if (var4 == 0) {
            var2 >>= 16;
            var2 ^= -1655345332;
            var2 += 1574544249;
            var2 &= -2019229647;
            var2 ^= 1408372730;
            var4 = var1 + 1;
            var4 = var1 * var4;
            int var36 = var1 + 2;
            var4 *= var36;
            int var37 = var1 + 3;
            var4 *= var37;
            var4 &= 7;
            if (var4 == 0) {
                return var5[var1];
            }
        } else {
            var2 *= -423171557;
            var2 &= -538235815;
            var2 &= 151224533;
            var2 &= 999414369;
            var2 ^= 823466681;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            }
        }

        IllegalStateException var26 = new IllegalStateException();
        throw var26;
    }

    public float[] tip() {
        int var1 = Hg;
        var1 ^= -48098786;
        int var2 = System.identityHashCode(this);
        KK var3 = this.mesh();
        float[] var26 = this.A;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 != 0) {
            switch (var1) {
                case -1627446358:
                default:
                    var1 ^= -1221077296;
                    break;
                case -987483730:
                    var1 ^= 1680458132;
                    break;
                case 1962961163:
                    var1 *= -372740931;
                    var1 &= -1144716951;
                    var1 <<= 2;
                    var1 ^= 646948477;
            }

            IllegalStateException var25 = new IllegalStateException();
            throw var25;
        } else {
            var1 &= -153297490;
            var1 &= -1131650042;
            var1 ^= -1079752955;
            long var12 = var1;
            long var28 = var12 + 1L;
            long var29 = var12 * var28;
            long var6 = var12 + 2L;
            long var30 = var29 * var6;
            long var13 = var12 + 3L;
            long var31 = var30 * var13;
            long var14 = var31 & 7L;
            long var32;
            var1 = (var32 = var14 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var1 == 0) {
                Object var17 = var26.clone();
                return (float[])var17;
            } else {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }
    }

    public float[] trailBase() {
        int var1 = Hg;
        var1 ^= 1016977045;
        int var2 = System.identityHashCode(this);
        KK var3 = this.mesh();
        float[] var22 = this.z;
        float[] var22c = var22.clone();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var26;
        var2 = (var26 = var4 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= -1588748160;
            var1 |= 681916431;
            var1 &= -872419400;
            var1 >>>= 22;
            var1 ^= 1910973072;
            Integer var19 = var1;
            if (var19 != null) {
                IllegalStateException var21 = new IllegalStateException();
                throw var21;
            } else {
                IllegalStateException var20 = new IllegalStateException();
                throw var20;
            }
        } else {
            var1 *= -1604902451;
            var1 <<= 22;
            var1 += 204014439;
            var1 ^= -235533495;
            return var22c;
        }
    }

    public float grind() {
        int var1 = Hg;
        var1 ^= 2116031753;
        int var2 = System.identityHashCode(this);
        Integer var16 = var2;
        if (var16 == null) {
            var1 &= 1219840814;
            var1 &= 1012730870;
            var1 <<= 14;
            var1 <<= 3;
            var1 ^= -1934095615;
            long var17 = var1;
            long var4 = var17 + 1L;
            var4 = var17 * var4;
            long var18 = var4 & 1L;
            long var22;
            int var19 = (var22 = var18 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var19 == 0) {
                IllegalArgumentException var20 = new IllegalArgumentException();
                throw var20;
            }
        } else {
            var1 ^= -793146221;
            var1 ^= -127895112;
            Integer var14 = var1;
            if (var14 != null) {
                return this.yP;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public KK mesh() {
        Object var204 = null;
        Object var210 = null;
        KK var219 = null;
        KK var220 = null;
        KK var226 = null;
        KK var242 = null;
        int var1 = Hg;
        var1 ^= -430716721;
        KK var2 = null;
        KK var3 = this.q;
        int var4 = of_2.sZ;
        var1 ^= var4;
        var1 ^= 1468362197;
        of_2.sZ = 1468362197;
        var4 = of_2.Pj;
        var1 ^= var4;
        var1 ^= 1355301754;
        of_2.Pj = 1355301754;

        var1 = switch (var1) {
            default -> var1 ^ 1895134157;
            case -370511902 -> var1 ^ 1943104406;
            case 1852945370 -> {
                var1 &= -224461983;
                yield var1 ^ 476609607;
            }
        };
        var4 = var1 + 1;
        var4 = var1 * var4;
        var4 &= 1;
        label239:
        if (var4 == 0) {
            if (var3 == null) {
                var1 += 398126390;
                var1 ^= 229565221;
                var4 = var1 + 1;
                var4 = var1 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label239;
                }

                Da var197 = this;
                var1 <<= 6;
                var1 |= -1048254017;
                var1 ^= 719524508;
                var1 *= -623678871;
                var1 ^= 1735301686;
                int var5 = var1 + 1;
                var5 = var1 * var5;
                var5 &= 1;
                if (var5 != 0) {
                    break label239;
                }

                synchronized (this){}

                var1 = switch (var1) {
                    case -669819626 -> var1 ^ 707185483;
                    case -368325779 -> {
                        var1 -= -366625316;
                        var1 *= 384435259;
                        yield var1 ^ -958856940;
                    }
                    default -> var1 ^ -737467964;
                };
                Integer var200 = var1;
                if (var200 == null) {
                    break label239;
                }

                label233: {
                    Throwable var228;
                    label263: {
                        try {
                            var1 &= -1225047934;
                            var1 *= 801758075;
                            var1 *= 700304395;
                            var1 *= 1279793579;
                            var1 ^= -89777175;
                        } catch (Throwable var25) {
                            int var50 = Hg;
                            int var51 = var50 ^ -1720368863;
                            var228 = var25;
                            int var52 = var51 ^ -895621215;
                            int var53 = var52 - -1637199294;
                            var1 = var53 ^ -1630098222;
                            Integer var7 = var1;
                            if (var7 == null) {
                                break label239;
                            }
                            break label263;
                        }

                        int var201 = var1 + 1;
                        var201 = var1 * var201;
                        var201 &= 1;
                        if (var201 != 0) {
                            break label239;
                        }

                        try {
                            var204 = this.q;
                        } catch (Throwable var24) {
                            int var60 = Hg;
                            int var61 = var60 ^ -1720368863;
                            var228 = var24;
                            int var62 = var61 ^ -895621215;
                            int var63 = var62 - -1637199294;
                            var1 = var63 ^ -1630098222;
                            Integer var247 = var1;
                            if (var247 == null) {
                                break label239;
                            }
                            break label263;
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -1058876602;
                            case -706335308 -> var1 ^ 1518017051;
                            case 728740975 -> {
                                var1 >>>= 16;
                                var1 >>= 5;
                                var1 += 510326493;
                                var1 ^= -749334456;
                                yield var1 ^ -263318963;
                            }
                        };
                        Integer var229 = var1;
                        if (var229 == null) {
                            break label239;
                        }

                        label223: {
                            label264: {
                                try {
                                    if (var204 != null) {
                                        break label264;
                                    }
                                } catch (Throwable var23) {
                                    int var69 = Hg;
                                    int var70 = var69 ^ -1720368863;
                                    var228 = var23;
                                    int var71 = var70 ^ -895621215;
                                    int var72 = var71 - -1637199294;
                                    var1 = var72 ^ -1630098222;
                                    Integer var248 = var1;
                                    if (var248 == null) {
                                        break label239;
                                    }
                                    break label263;
                                }
                                var1 = switch (var1) {
                                    case -1770679561 -> var1 ^ 1628472990;
                                    default -> var1 ^ 654827481;
                                    case 1030945341 -> {
                                        var1 += -79607927;
                                        yield var1 ^ 273969387;
                                    }
                                };
                                var201 = var1 + 1;
                                var201 = var1 * var201;
                                int var230 = var1 + 2;
                                var201 *= var230;
                                int var231 = var1 + 3;
                                var201 *= var231;
                                var201 &= 7;
                                if (var201 != 0) {
                                    break label239;
                                }

                                try {
                                    var1 |= 698600492;
                                    var1 &= 1315941358;
                                    var1 -= 2028344709;
                                    var1 ^= 1734924610;
                                    var210 = KARAMBIT;
                                    var1 |= 1543584027;
                                    var1 &= -345176673;
                                    var1 -= -565246595;
                                    var1 ^= -2063640251;
                                } catch (Throwable var21) {
                                    int var75 = Hg;
                                    int var76 = var75 ^ -1720368863;
                                    var228 = var21;
                                    int var77 = var76 ^ -895621215;
                                    int var78 = var77 - -1637199294;
                                    var1 = var78 ^ -1630098222;
                                    Integer var249 = var1;
                                    if (var249 == null) {
                                        break label239;
                                    }
                                    break label263;
                                }

                                long var232 = var1;
                                long var8 = var232 + 1L;
                                var8 = var232 * var8;
                                long var233 = var8 & 1L;
                                long var276;
                                int var234 = (var276 = var233 - 0L) == 0L ? 0 : (var276 < 0L ? -1 : 1);
                                if (var234 != 0) {
                                    break label239;
                                }

                                label247: {
                                    label248: {
                                        try {
                                            if (this != var210) {
                                                break label248;
                                            }
                                        } catch (Throwable var22) {
                                            int var87 = Hg;
                                            int var88 = var87 ^ -1720368863;
                                            var228 = var22;
                                            int var89 = var88 ^ -895621215;
                                            int var90 = var89 - -1637199294;
                                            var1 = var90 ^ -1630098222;
                                            Integer var250 = var1;
                                            if (var250 == null) {
                                                break label239;
                                            }
                                            break label263;
                                        }

                                        var1 *= 266210429;
                                        var1 ^= -701092244;
                                        var1 ^= 520503190;

                                        try {
                                            var1 ^= -1897506793;
                                            var1 |= 382736081;
                                            var1 &= -815409532;
                                            var1 ^= 748515823;
                                        } catch (Throwable var20) {
                                            int var94 = Hg;
                                            int var95 = var94 ^ -1720368863;
                                            var228 = var20;
                                            int var96 = var95 ^ -895621215;
                                            int var97 = var96 - -1637199294;
                                            var1 = var97 ^ -1630098222;
                                            Integer var251 = var1;
                                            if (var251 == null) {
                                                break label239;
                                            }
                                            break label263;
                                        }

                                        long var211 = var1;
                                        long var252 = var211 + 1L;
                                        var252 = var211 * var252;
                                        long var9 = var211 + 2L;
                                        var252 *= var9;
                                        long var212 = var211 + 3L;
                                        var252 *= var212;
                                        long var213 = var252 & 7L;
                                        long var277;
                                        var201 = (var277 = var213 - 0L) == 0L ? 0 : (var277 < 0L ? -1 : 1);
                                        if (var201 != 0) {
                                            break label239;
                                        }

                                        try {
                                            var201 = var1 & -943420840;
                                            var201 <<= 1;
                                            var201 |= -670367975;
                                            var201 ^= 742514129;
                                            var219 = this.V(var201);
                                            var1 |= 774882924;
                                            var1 &= 523166890;
                                            var1 |= 1569051325;
                                            var1 ^= -463544859;
                                        } catch (Throwable var19) {
                                            int var102 = Hg;
                                            int var103 = var102 ^ -1720368863;
                                            var228 = var19;
                                            int var104 = var103 ^ -895621215;
                                            int var105 = var104 - -1637199294;
                                            var1 = var105 ^ -1630098222;
                                            Integer var256 = var1;
                                            if (var256 == null) {
                                                break label239;
                                            }
                                            break label263;
                                        }

                                        var220 = var219;
                                        var1 ^= -1983716743;
                                        var1 ^= 2059016478;
                                        var1 ^= 961958147;
                                        break label247;
                                    }

                                    var1 ^= 1042636735;
                                    var1 ^= 1125431211;
                                    var1 *= 382819331;
                                    var1 &= -565158165;
                                    var1 ^= 1682321580;
                                    Integer var235 = var1;
                                    if (var235 == null) {
                                        break label239;
                                    }

                                    try {
                                        var1 &= -79533309;
                                        var1 ^= 267087174;
                                    } catch (Throwable var18) {
                                        int var118 = Hg;
                                        int var119 = var118 ^ -1720368863;
                                        var228 = var18;
                                        int var120 = var119 ^ -895621215;
                                        int var121 = var120 - -1637199294;
                                        var1 = var121 ^ -1630098222;
                                        Integer var257 = var1;
                                        if (var257 == null) {
                                            break label239;
                                        }
                                        break label263;
                                    }

                                    long var236 = var1;
                                    var8 = var236 + 1L;
                                    var8 = var236 * var8;
                                    long var237 = var8 & 1L;
                                    long var278;
                                    int var238 = (var278 = var237 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
                                    if (var238 != 0) {
                                        break label239;
                                    }

                                    try {
                                        int var239 = var1 ^ 252030241;
                                        int var240 = var239 >>> 30;
                                        int var241 = var240 ^ -923990294;
                                        var242 = this.Wj(var241);
                                        var1 |= 1257673602;
                                        var1 |= 1958462370;
                                        var1 *= 68406903;
                                        var1 ^= -1974641639;
                                    } catch (Throwable var17) {
                                        int var124 = Hg;
                                        int var125 = var124 ^ -1720368863;
                                        var228 = var17;
                                        int var126 = var125 ^ -895621215;
                                        int var127 = var126 - -1637199294;
                                        var1 = var127 ^ -1630098222;
                                        Integer var258 = var1;
                                        if (var258 == null) {
                                            break label239;
                                        }
                                        break label263;
                                    }

                                    long var259 = var1;
                                    long var274 = var259 + 1L;
                                    var274 = var259 * var274;
                                    var259 = var274 & 1L;
                                    long var279;
                                    int var261 = (var279 = var259 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                                    if (var261 != 0) {
                                        break label239;
                                    }

                                    var220 = var242;
                                    var1 -= -1880519509;
                                    var1 += -410388117;
                                    var1 >>>= 12;
                                    var1 *= 1027812425;
                                    var1 ^= -1749212638;
                                }

                                try {
                                    this.q = var220;
                                    var1 -= 903201675;
                                    var1 ^= 802122915;
                                    break label223;
                                } catch (Throwable var16) {
                                    int var136 = Hg;
                                    int var137 = var136 ^ -1720368863;
                                    var228 = var16;
                                    int var138 = var137 ^ -895621215;
                                    int var139 = var138 - -1637199294;
                                    var1 = var139 ^ -1630098222;
                                    Integer var262 = var1;
                                    if (var262 == null) {
                                        break label239;
                                    }
                                    break label263;
                                }
                            }

                            var1 &= -1560298248;
                            var1 >>>= 13;
                            var1 &= -1763094740;
                            var1 ^= 331862548;
                        }

                        Integer var221 = var1;
                        if (var221 == null) {
                            break label239;
                        }

                        try {
                            var1 <<= 31;
                            var1 ^= -601386856;
                        } catch (Throwable var15) {
                            int var145 = Hg;
                            int var146 = var145 ^ -1720368863;
                            var228 = var15;
                            int var147 = var146 ^ -895621215;
                            int var148 = var147 - -1637199294;
                            var1 = var148 ^ -1630098222;
                            Integer var263 = var1;
                            if (var263 == null) {
                                break label239;
                            }
                            break label263;
                        }

                        int var222 = var1 + 1;
                        var222 = var1 * var222;
                        var222 &= 1;
                        if (var222 != 0) {
                            break label239;
                        }

                        try {
                            KK var225 = this.q;
                            var1 += -365131336;
                            var1 *= 2095384951;
                            var1 >>>= 14;
                            var1 |= -1594724844;
                            var1 ^= -1005068153;
                            var226 = var225;
                            var1 >>= 19;
                            var1 >>>= 23;
                            var1 *= 1371131161;
                            var1 ^= -2124683315;
                        } catch (Throwable var14) {
                            int var151 = Hg;
                            int var152 = var151 ^ -1720368863;
                            var228 = var14;
                            int var153 = var152 ^ -895621215;
                            int var154 = var153 - -1637199294;
                            var1 = var154 ^ -1630098222;
                            Integer var264 = var1;
                            if (var264 == null) {
                                break label239;
                            }
                            break label263;
                        }

                        long var243 = var1;
                        long var270 = var243 + 1L;
                        var270 = var243 * var270;
                        long var10 = var243 + 2L;
                        var270 *= var10;
                        long var244 = var243 + 3L;
                        var270 *= var244;
                        long var245 = var270 & 7L;
                        long var280;
                        int var246 = (var280 = var245 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                        if (var246 != 0) {
                            break label239;
                        }

                        try {
                            break label233;
                        } catch (Throwable var13) {
                            int var164 = Hg;
                            int var165 = var164 ^ -1720368863;
                            var228 = var13;
                            int var166 = var165 ^ -895621215;
                            int var167 = var166 - -1637199294;
                            var1 = var167 ^ -1630098222;
                            Integer var265 = var1;
                            if (var265 == null) {
                                break label239;
                            }
                        }
                    }

                    while (true) {
                        try {
                            var1 += 687830262;
                            var1 >>>= 13;
                            var1 &= -116882447;
                            var1 ^= 767246991;
                        } catch (Throwable var12) {
                            int var168 = Hg;
                            int var169 = var168 ^ -1720368863;
                            var228 = var12;
                            int var170 = var169 ^ -895621215;
                            int var171 = var170 - -1637199294;
                            var1 = var171 ^ -1630098222;
                            Integer var266 = var1;
                            if (var266 != null) {
                                continue;
                            }
                            break label239;
                        }

                        Integer var185 = var1;
                        if (var185 != null) {
                            throw UncheckedExceptions.rethrow(var228);
                        }
                        break label239;
                    }
                }
                var1 = switch (var1) {
                    case -2124683315 -> {
                        var1 ^= 230784502;
                        var1 &= 166730449;
                        var1 >>>= 3;
                        var1 -= 393606720;
                        yield var1 ^ -1562113180;
                    }
                    default -> var1 ^ -1579614420;
                    case 465321015 -> var1 ^ -1651786216;
                };
                Integer var186 = var1;
                if (var186 == null) {
                    break label239;
                }

                var2 = var226;
                var1 += -872831255;
                var1 ^= 960030074;
            } else {
                var1 <<= 2;
                var1 ^= 826339954;
                var1 ^= -889022380;
                long var191 = var1;
                long var6 = var191 + 1L;
                var6 = var191 * var6;
                long var192 = var6 & 1L;
                long var281;
                var4 = (var281 = var192 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label239;
                }

                var2 = var3;
                var1 *= 1617240593;
                var1 |= -1462682237;
                var1 |= 2093322055;
                var1 ^= -762005526;
            }

            Integer var182 = var1;
            if (var182 != null) {
                return var2;
            }
        }

        IllegalArgumentException var183 = new IllegalArgumentException();
        throw var183;
    }

    public float bladeShade(float var1, float var2) {
        int var3 = Hg;
        var3 ^= 766602931;
        int var4 = System.identityHashCode(this);
        float var5 = this.yP;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        int var7 = var4 + 2;
        var6 *= var7;
        var7 = var4 + 3;
        var6 *= var7;
        var6 &= 7;
        if (var6 != 0) {
            var3 -= -59347018;
            var3 ^= 1962057349;
        } else {
            label155: {
                var3 |= -1368027551;
                var3 ^= 940549220;
                var3 *= -1359864457;
                var3 ^= -2008388411;
                long var106 = var3;
                long var8 = var106 + 1L;
                var8 = var106 * var8;
                long var107 = var8 & 1L;
                long var199;
                var6 = (var199 = var107 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                label141:
                if (var6 == 0) {
                    float var200;
                    int var94 = (var200 = var2 - var5) == 0.0F ? 0 : (var200 < 0.0F ? -1 : 1);
                    if (var94 > 0) {
                        var3 &= 1518409972;
                        var3 |= -1146122663;
                        var3 += 2118044278;
                        var3 *= -896338971;
                        var3 ^= -1654530095;
                        long var95 = var3;
                        long var128 = var95 + 1L;
                        long var129 = var95 * var128;
                        long var9 = var95 + 2L;
                        long var130 = var129 * var9;
                        long var96 = var95 + 3L;
                        long var131 = var130 * var96;
                        long var97 = var131 & 7L;
                        long var201;
                        int var98 = (var201 = var97 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                        if (var98 != 0) {
                            break label141;
                        }

                        var5 = 1.07F;
                        switch (var3) {
                            case -1182806451:
                                var3 ^= -2011520860;
                                break;
                            case -1013992166:
                                var3 -= 115560864;
                                var3 ^= 771125964;
                                break;
                            case 130493828:
                            default:
                                var3 ^= 1049264609;
                        }
                    } else {
                        var3 |= -1330973151;
                        var3 *= 1976878227;
                        var3 += 1106344926;
                        var3 ^= 1809191157;
                        var5 = 1.0F;
                        var3 -= 1272181731;
                        var3 |= -1487044340;
                        var3 += 1218681448;
                        var3 ^= 1643737603;
                    }

                    Integer var109 = var3;
                    if (var109 != null) {
                        Da var110 = BAYONET;
                        long var132 = var4;
                        long var174 = var132 + 1L;
                        var174 = var132 * var174;
                        long var11 = var132 + 2L;
                        var174 *= var11;
                        long var133 = var132 + 3L;
                        var174 *= var133;
                        long var134 = var174 & 7L;
                        long var202;
                        var7 = (var202 = var134 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var3 &= 1777890059;
                            var3 |= 91022494;
                            var3 &= 450825781;
                            var3 ^= -575520927;
                            break label155;
                        }

                        var3 += -132927876;
                        var3 >>>= 25;
                        var3 *= -185278403;
                        var3 ^= -688346755;
                        long var136 = var3;
                        var174 = var136 + 1L;
                        var174 = var136 * var174;
                        long var137 = var174 & 1L;
                        long var203;
                        var7 = (var203 = var137 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                        label132:
                        if (var7 == 0) {
                            float var93;
                            if (this == var110) {
                                var3 -= -89746535;
                                var3 &= -713628689;
                                var3 ^= 1339707399;
                                long var111 = var3;
                                var8 = var111 + 1L;
                                var8 = var111 * var8;
                                long var112 = var8 & 1L;
                                long var204;
                                int var113 = (var204 = var112 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                                if (var113 != 0) {
                                    break label132;
                                }

                                float var114 = var1 - 0.05F;
                                float var115 = var114 / 0.02F;
                                float var116 = TP.S(var115);
                                float var139 = 0.6F - var1;
                                float var140 = var139 / 0.05F;
                                int var155 = var4 + 1;
                                int var156 = var4 * var155;
                                int var157 = var156 & 1;
                                if (var157 != 0) {
                                    switch (var3) {
                                        case -1969294937:
                                            var3 += -575854870;
                                            var3 >>= 24;
                                            var3 ^= -554329814;
                                            var3 ^= 52142647;
                                            break label155;
                                        case -925656657:
                                        default:
                                            var3 ^= 1542591418;
                                            break label155;
                                        case 1069857815:
                                            var3 ^= -1136686074;
                                            break label155;
                                    }
                                }

                                var3 ^= -141402425;
                                var3 ^= 2058523527;
                                int var158 = var3 + 1;
                                int var159 = var3 * var158;
                                int var180 = var3 + 2;
                                int var160 = var159 * var180;
                                int var181 = var3 + 3;
                                int var161 = var160 * var181;
                                int var162 = var161 & 7;
                                if (var162 != 0) {
                                    break label132;
                                }

                                float var141 = TP.S(var140);
                                float var117 = var116 * var141;
                                float var142 = var2 - 0.24F;
                                float var143 = var142 / 0.055F;
                                float var163 = Math.abs(var143);
                                float var205;
                                int var164 = (var205 = var163 - 1.6F) == 0.0F ? 0 : (var205 < 0.0F ? -1 : 1);
                                float var149;
                                if (var164 < 0) {
                                    var3 |= -557116702;
                                    var3 <<= 17;
                                    var3 |= -650840611;
                                    var3 ^= -1257429847;
                                    Integer var165 = var3;
                                    if (var165 == null) {
                                        break label132;
                                    }

                                    float var166 = var117 * 0.42F;
                                    int var182 = var4 + 1;
                                    int var183 = var4 * var182;
                                    int var10 = var4 + 2;
                                    int var184 = var183 * var10;
                                    var10 = var4 + 3;
                                    int var185 = var184 * var10;
                                    int var186 = var185 & 7;
                                    if (var186 != 0) {
                                        var3 |= 2007563432;
                                        var3 &= -2141467293;
                                        var3 *= 545657829;
                                        var3 ^= 2138238357;
                                        break label155;
                                    }

                                    var3 >>= 27;
                                    var3 -= -1115599303;
                                    var3 >>= 24;
                                    var3 -= -325373739;
                                    var3 ^= 110099748;
                                    int var187 = var3 + 1;
                                    int var188 = var3 * var187;
                                    var10 = var3 + 2;
                                    int var189 = var188 * var10;
                                    var10 = var3 + 3;
                                    int var190 = var189 * var10;
                                    int var191 = var190 & 7;
                                    if (var191 != 0) {
                                        break label132;
                                    }

                                    float var192 = -var143;
                                    float var144 = var192 * var143;
                                    double var193 = var144;
                                    double var194 = Math.exp(var193);
                                    float var145 = (float)var194;
                                    float var146 = var166 * var145;
                                    float var147 = 1.0F - var146;
                                    float var148 = var5 * var147;
                                    var149 = var148;
                                    var3 *= 1865392919;
                                    var3 ^= 1045115402;
                                } else {
                                    var3 &= -1847978470;
                                    var3 ^= -300601872;
                                    var3 *= -1920605793;
                                    var3 ^= -1195119336;
                                    Integer var167 = var3;
                                    if (var167 == null) {
                                        break label132;
                                    }

                                    var149 = var5;
                                    switch (var3) {
                                        case -1470152106:
                                            var3 += 877107109;
                                            var3 >>>= 20;
                                            var3 ^= -1513635761;
                                            break;
                                        case -62498278:
                                        default:
                                            var3 ^= 2104587953;
                                            break;
                                        case 1359262165:
                                            var3 ^= 827716323;
                                    }
                                }

                                float var168 = var2 - 0.315F;
                                float var169 = var168 / 0.02F;
                                float var118 = var117 * 0.25F;
                                float var195 = -var169;
                                float var170 = var195 * var169;
                                double var171 = var170;
                                double var172 = Math.exp(var171);
                                float var173 = (float)var172;
                                float var119 = var118 * var173;
                                float var121 = var149 * ++var119;
                                Integer var91 = var4;
                                if (var91 == null) {
                                    switch (var3) {
                                        case -1513632379:
                                            var3 <<= 14;
                                            var3 &= -50135849;
                                            var3 += 1982744106;
                                            var3 |= -1065350232;
                                            var3 ^= 977319135;
                                            break label155;
                                        case -303719768:
                                        default:
                                            var3 ^= -47571564;
                                            break label155;
                                        case -221683070:
                                            var3 ^= 241933901;
                                            break label155;
                                    }
                                }
                                var3 = switch (var3) {
                                    case -1513632379 -> {
                                        var3 ^= 1652329891;
                                        var3 >>= 2;
                                        yield var3 ^ -1826128972;
                                    }
                                    default -> var3 ^ 1004767450;
                                    case 498485278 -> var3 ^ 1338411071;
                                };
                                var91 = var3;
                                if (var91 == null) {
                                    break label132;
                                }

                                var93 = var121;
                                switch (var3) {
                                    case 215250091:
                                    default:
                                        var3 ^= 1092385226;
                                        break;
                                    case 1538300827:
                                        var3 ^= -1542840355;
                                        break;
                                    case 1657383869:
                                        var3 <<= 10;
                                        var3 ^= 1013642050;
                                }
                            } else {
                                var3 += -217977495;
                                var3 ^= -846829275;
                                int var122 = var3 + 1;
                                var122 = var3 * var122;
                                var7 = var3 + 2;
                                var122 *= var7;
                                var7 = var3 + 3;
                                var122 *= var7;
                                var122 &= 7;
                                if (var122 != 0) {
                                    break label132;
                                }

                                var93 = var5;
                                switch (var3) {
                                    case -271921340:
                                    default:
                                        var3 ^= -570676598;
                                        break;
                                    case 555159375:
                                        var3 ^= -427363178;
                                        break;
                                    case 2004045719:
                                        var3 += 1643303626;
                                        var3 |= 337008947;
                                        var3 ^= -944604111;
                                }
                            }

                            Integer var100 = var3;
                            if (var100 != null) {
                                return var93;
                            }
                        }
                    }
                }

                AssertionError var101 = new AssertionError();
                throw var101;
            }
        }

        IllegalArgumentException var90 = new IllegalArgumentException();
        throw var90;
    }

    private KK V(int var1) {
        label349: {
            int var3 = System.identityHashCode(this);
            dx_2 var4 = new dx_2();
            long var5 = var3;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            var5 = var7 & 1L;
            long var529;
            int var212 = (var529 = var5 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
            int var2;
            if (var212 != 0) {
                switch (var1) {
                    case -238411192:
                        var2 = var1 * -1691548997;
                        var2 ^= 1025693412;
                        break;
                    case -90349634:
                        var2 = var1 ^ -951590167;
                        break;
                    case 1633280287:
                    default:
                        var2 = var1 ^ 661610753;
                }
            } else {
                var2 = var1 | -831016150;
                var2 += -1442975809;
                var2 &= 1014611949;
                var2 += -987573009;
                var2 ^= 1546221068;
                int var213 = var2 + 1;
                int var214 = var2 * var213;
                int var215 = var214 & 1;
                if (var215 != 0) {
                    break label349;
                }

                int var216 = var2 ^ 2007273767;
                int var217 = var216 ^ -482482539;
                op(var4, 0.0F, 0.0F, 1.3F, 0.32F, 0.44F, 44, 14, var217);
                byte var218 = 26;
                float[][] var6 = new float[var218][];
                var6 = var6;
                float[][] var244 = new float[var218][];
                float[][] var245 = var244;
                int var8 = 0;
                var8 = var8;
                var2 += 54635345;
                var2 += 1222574204;
                var2 >>>= 4;
                var2 -= 1133853278;
                var2 ^= 973942705;

                label346:
                while (true) {
                    long var9 = var2;
                    long var11 = var9 + 1L;
                    var11 = var9 * var11;
                    long var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var530;
                    int var265 = (var530 = var9 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                    if (var265 != 0) {
                        break label349;
                    }

                    if (var8 >= var218) {
                        var2 -= 1790692935;
                        var2 |= 1898177562;
                        var2 += 416637080;
                        var2 -= 1048990179;
                        var2 ^= -992783532;
                        Integer var255 = var2;
                        if (var255 == null) {
                            break label349;
                        }

                        float[] var256 = new float[var218];
                        float[] var257 = var256;
                        float[] var274 = new float[var218];
                        float[] var275 = var274;
                        int var302 = 0;
                        var11 = var3;
                        var13 = var11 + 1L;
                        var13 = var11 * var13;
                        long var15 = var11 + 2L;
                        var13 *= var15;
                        var11 += 3L;
                        var13 *= var11;
                        var11 = var13 & 7L;
                        long var531;
                        int var335 = (var531 = var11 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                        if (var335 != 0) {
                            switch (var2) {
                                case -668286710:
                                default:
                                    var2 ^= 2066015732;
                                    break label346;
                                case 287940667:
                                    var2 |= -1300889523;
                                    var2 ^= 1607396355;
                                    break label346;
                                case 1521741713:
                                    var2 ^= 1284208834;
                                    break label346;
                            }
                        } else {
                            var2 -= 1925272277;
                            var2 ^= -63543100;
                            var2 ^= 564925267;
                            Integer var336 = var2;
                            if (var336 == null) {
                                break label349;
                            }

                            var302 = var302;
                            var2 ^= 1877824936;
                            var2 *= -1508519413;
                            var2 >>>= 8;
                            var2 &= 786415987;
                            var2 ^= -847618862;

                            while (true) {
                                Integer var337 = var2;
                                if (var337 == null) {
                                    break label349;
                                }

                                if (var302 >= var218) {
                                    var2 ^= -125454857;
                                    var2 += -572403960;
                                    var2 += 108755085;
                                    var2 &= 1328912169;
                                    var2 ^= 1541791744;
                                    long var304 = var2;
                                    long var373 = var304 + 1L;
                                    var373 = var304 * var373;
                                    long var406 = var304 + 2L;
                                    var373 *= var406;
                                    long var305 = var304 + 3L;
                                    var373 *= var305;
                                    long var306 = var373 & 7L;
                                    long var532;
                                    int var219 = (var532 = var306 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                    if (var219 != 0) {
                                        break label349;
                                    }

                                    e_2 var220 = e_2.GRIP;
                                    var302 = var2 & 6290974;
                                    var302 *= 1561720223;
                                    var302 ^= 1816157429;
                                    HY(var4, var6, var245, var257, var275, 3.4F, 16, var220, true, true, var302);
                                    float[][] var221 = new float[5][];
                                    float[][] var222 = var221;
                                    var6 = new float[5][];
                                    var6 = var6;
                                    float[] var246 = new float[5];
                                    var255 = var3;
                                    if (var255 == null) {
                                        var2 *= -931974925;
                                        var2 *= -193258279;
                                        var2 ^= -717881276;
                                        break label346;
                                    } else {
                                        var2 = switch (var2) {
                                            case -710950045 -> var2 ^ 178792598;
                                            default -> var2 ^ 1684517305;
                                            case 1391585064 -> {
                                                var2 *= 1990686163;
                                                var2 &= 1238945757;
                                                var2 += -2035929788;
                                                yield var2 ^ -1050323450;
                                            }
                                        };
                                        float[] var247 = var246;
                                        float[] var259 = new float[5];
                                        float[] var260 = var259;
                                        byte var276 = 0;
                                        int var277 = var276;
                                        var2 *= -1220578795;
                                        var2 ^= 19029189;

                                        while (true) {
                                            var302 = var2 + 1;
                                            var302 = var2 * var302;
                                            var302 &= 1;
                                            if (var302 != 0) {
                                                break label349;
                                            }

                                            if (var277 >= 5) {
                                                var2 -= -1926735073;
                                                var2 -= 942179074;
                                                var2 |= -1285689344;
                                                var2 ^= 676652605;
                                                var2 ^= 946167412;
                                                Integer var278 = var2;
                                                if (var278 == null) {
                                                    break label349;
                                                }

                                                e_2 var279 = e_2.METAL;
                                                var302 = var2 ^ -1812712633;
                                                var302 ^= 175353029;
                                                HY(var4, var222, var6, var247, var260, 5.0F, 12, var279, true, false, var302);
                                                byte var223 = 30;
                                                var6 = new float[var223][];
                                                var6 = var6;
                                                float[][] var248 = new float[var223][];
                                                float[][] var249 = var248;
                                                float[] var261 = new float[var223];
                                                float[] var262 = var261;
                                                var9 = var3;
                                                var11 = var9 + 1L;
                                                var11 = var9 * var11;
                                                var13 = var9 + 2L;
                                                var11 *= var13;
                                                var9 += 3L;
                                                var11 *= var9;
                                                var9 = var11 & 7L;
                                                long var533;
                                                int var283 = (var533 = var9 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
                                                if (var283 == 0) {
                                                    var2 *= -1086424419;
                                                    var2 ^= 330078237;
                                                    var2 ^= -1027425115;
                                                    float var284 = 0.36F;
                                                    float var323 = 9.1F;
                                                    float var354 = 1.43117F;
                                                    float var381 = 8.8F;
                                                    byte var403 = 0;
                                                    float var285 = var284;
                                                    float var324 = var323;
                                                    float var355 = var354;
                                                    int var404 = var403;
                                                    var2 |= 1984901537;
                                                    var2 |= -138578227;
                                                    var2 ^= 2029071279;
                                                    var2 ^= -933040847;

                                                    while (var404 < var223) {
                                                        var2 = switch (var2) {
                                                            case -1621290852 -> var2 ^ 1022101507;
                                                            default -> var2 ^ 155447194;
                                                            case 1332492657 -> {
                                                                var2 &= 977021328;
                                                                var2 <<= 20;
                                                                var2 &= 998888895;
                                                                var2 >>>= 18;
                                                                yield var2 ^ 1374141436;
                                                            }
                                                        };
                                                        float var409 = var404;
                                                        int var429 = var3 + 1;
                                                        int var430 = var3 * var429;
                                                        int var16 = var3 + 2;
                                                        int var431 = var430 * var16;
                                                        var16 = var3 + 3;
                                                        int var432 = var431 * var16;
                                                        int var433 = var432 & 7;
                                                        if (var433 != 0) {
                                                            switch (var2) {
                                                                case -1313748382:
                                                                default:
                                                                    var2 ^= -344024926;
                                                                    break label346;
                                                                case 23525382:
                                                                    var2 ^= -255147916;
                                                                    break label346;
                                                                case 1374142396:
                                                                    var2 += -254398605;
                                                                    var2 |= -679699603;
                                                                    var2 ^= 994882323;
                                                                    break label346;
                                                            }
                                                        }

                                                        var2 += 504091523;
                                                        var2 |= -1726455149;
                                                        var2 ^= -1093723024;
                                                        Integer var434 = var2;
                                                        if (var434 == null) {
                                                            break label349;
                                                        }

                                                        float var435 = var223;
                                                        var435--;
                                                        float var410 = var409 / var435;
                                                        float var19;
                                                        float var480;
                                                        float var487;
                                                        if (var404 > 0) {
                                                            var2 &= 1030666588;
                                                            var2 -= 567581669;
                                                            var2 &= 1935261081;
                                                            var2 <<= 23;
                                                            var2 ^= -95576853;
                                                            int var437 = var223 - 1;
                                                            float var438 = var437;
                                                            float var439 = var381 / var438;
                                                            double var462 = var410;
                                                            double var463 = Math.pow(var462, 1.35F);
                                                            float var464 = (float)var463;
                                                            float var465 = 112.0F * var464;
                                                            float var466 = 82.0F - var465;
                                                            float var467 = var466 * (float) (Math.PI / 180.0);
                                                            var480 = var355 + var467;
                                                            var480 /= 2.0F;
                                                            double var475 = var480;
                                                            double var476 = Math.cos(var475);
                                                            var480 = (float)var476;
                                                            var480 = var439 * var480;
                                                            var480 = var285 + var480;
                                                            var487 = var355 + var467;
                                                            var487 /= 2.0F;
                                                            double var482 = var487;
                                                            long var20 = var3;
                                                            long var22 = var20 + 1L;
                                                            var22 = var20 * var22;
                                                            var20 = var22 & 1L;
                                                            long var534;
                                                            int var489 = (var534 = var20 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                                                            if (var489 != 0) {
                                                                var2 ^= -243945627;
                                                                var2 >>>= 29;
                                                                var2 ^= -1962711641;
                                                                var2 += -1515789932;
                                                                var2 ^= -602207413;
                                                                break label346;
                                                            }
                                                            var2 = switch (var2) {
                                                                case -1952945996 -> var2 ^ -530626832;
                                                                default -> var2 ^ -1453340057;
                                                                case 2060295403 -> {
                                                                    var2 >>= 23;
                                                                    var2 |= -1593416403;
                                                                    var2 &= 172426820;
                                                                    var2 += -921679070;
                                                                    yield var2 ^ -891157729;
                                                                }
                                                            };
                                                            double var483 = Math.sin(var482);
                                                            var487 = (float)var483;
                                                            var487 = var439 * var487;
                                                            var487 = var324 + var487;
                                                            var480 = var480;
                                                            var487 = var487;
                                                            var19 = var467;
                                                            switch (var2) {
                                                                case -111172551:
                                                                default:
                                                                    var2 ^= -500262885;
                                                                    break;
                                                                case 66342009:
                                                                    var2 ^= 1960738291;
                                                                    var2 ^= -850456473;
                                                                    break;
                                                                case 1768611574:
                                                                    var2 ^= -407312282;
                                                            }
                                                        } else {
                                                            var2 &= 223277090;
                                                            var2 ^= 1547542006;
                                                            long var490 = var2;
                                                            long var520 = var490 + 1L;
                                                            var520 = var490 * var520;
                                                            var490 = var520 & 1L;
                                                            long var535;
                                                            int var492 = (var535 = var490 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                                                            if (var492 != 0) {
                                                                break label349;
                                                            }

                                                            var480 = var285;
                                                            Integer var493 = var3;
                                                            if (var493 == null) {
                                                                switch (var2) {
                                                                    case -661712586:
                                                                    default:
                                                                        var2 ^= 2136440514;
                                                                        break label346;
                                                                    case -82939876:
                                                                        var2 ^= -522105619;
                                                                        break label346;
                                                                    case 1564048884:
                                                                        var2 *= 1413845881;
                                                                        var2 <<= 5;
                                                                        var2 ^= 616941308;
                                                                        break label346;
                                                                }
                                                            }

                                                            var2 ^= -49921553;
                                                            var2 *= -1684518563;
                                                            var2 ^= 1340114648;
                                                            var487 = var324;
                                                            var19 = var355;
                                                            var2 ^= 1308025677;
                                                            var2 &= -738472816;
                                                            var2 >>= 23;
                                                            var2 ^= -1167777431;
                                                        }

                                                        Integer var494 = var2;
                                                        if (var494 == null) {
                                                            break label349;
                                                        }

                                                        float var495 = 1.0F - var410;
                                                        double var496 = var495;
                                                        double var497 = Math.pow(var496, 0.72F);
                                                        float var498 = (float)var497;
                                                        float var499 = 2.3F * var498;
                                                        float var21 = (float) Math.PI * var410;
                                                        double var512 = var21;
                                                        double var513 = Math.sin(var512);
                                                        var21 = (float)var513;
                                                        var21 = 0.1F * var21;
                                                        float var500 = var499 * ++var21;
                                                        double var501 = var19;
                                                        double var502 = Math.sin(var501);
                                                        float var503 = (float)var502;
                                                        float var504 = -var503;
                                                        double var505 = var19;
                                                        double var506 = Math.cos(var505);
                                                        float var507 = (float)var506;
                                                        float[] var517 = new float[2];
                                                        float var522 = var504 * var500;
                                                        var522 *= 0.4F;
                                                        var522 = var480 + var522;
                                                        var517[0] = var522;
                                                        var522 = var507 * var500;
                                                        var522 *= 0.4F;
                                                        var522 = var487 + var522;
                                                        var517[1] = var522;
                                                        var6[var404] = var517;
                                                        float[] var518 = new float[2];
                                                        float var469 = var504 * var500;
                                                        float var470 = var469 * 0.6F;
                                                        float var471 = var480 - var470;
                                                        var518[0] = var471;
                                                        Integer var472 = var3;
                                                        if (var472 == null) {
                                                            var2 |= 1294171459;
                                                            var2 ^= 332804499;
                                                            break label346;
                                                        }

                                                        var2 &= -1196369259;
                                                        var2 &= 1927340322;
                                                        var2 &= -899054320;
                                                        var2 *= 1458031031;
                                                        var2 ^= 1771401297;
                                                        var472 = var2;
                                                        if (var472 == null) {
                                                            break label349;
                                                        }

                                                        float var441 = var507 * var500;
                                                        float var442 = var441 * 0.6F;
                                                        float var443 = var487 - var442;
                                                        var518[1] = var443;
                                                        var249[var404] = var518;
                                                        float var444 = 0.5F * var410;
                                                        float var445 = 1.0F - var444;
                                                        float var446 = 0.21F * var445;
                                                        float var411 = 1.0F - var410;
                                                        float var412 = var411 * 7.0F;
                                                        float var413 = Math.min(1.0F, var412);
                                                        float var414 = var446 * var413;
                                                        var262[var404] = var414;
                                                        int var415 = var223 - 1;
                                                        if (var404 == var415) {
                                                            var2 *= 1269169399;
                                                            var2 += -756174356;
                                                            var2 &= 1174221055;
                                                            var2 ^= -329207030;
                                                            Integer var416 = var2;
                                                            if (var416 == null) {
                                                                break label349;
                                                            }

                                                            float[] var417 = this.A;
                                                            int var447 = var3 + 1;
                                                            int var448 = var3 * var447;
                                                            int var449 = var448 & 1;
                                                            if (var449 != 0) {
                                                                switch (var2) {
                                                                    case -1086504808:
                                                                        var2 ^= -1534885858;
                                                                        break label346;
                                                                    case -779923430:
                                                                    default:
                                                                        var2 ^= 553562131;
                                                                        break label346;
                                                                    case -379473127:
                                                                        var2 += 1060722659;
                                                                        var2 ^= -1003862400;
                                                                        break label346;
                                                                }
                                                            }
                                                            var2 = switch (var2) {
                                                                case -1658507245 -> var2 ^ 1636519827;
                                                                case -379473127 -> {
                                                                    var2 *= 1683352717;
                                                                    var2 += 854247165;
                                                                    var2 += 1789063855;
                                                                    yield var2 ^ -1885755042;
                                                                }
                                                                default -> var2 ^ -1521834472;
                                                            };
                                                            Integer var450 = var2;
                                                            if (var450 == null) {
                                                                break label349;
                                                            }

                                                            var417[0] = var480;
                                                            float[] var418 = this.A;
                                                            var418[1] = var487;
                                                            var2 += 1376776067;
                                                            var2 ^= -1948797389;
                                                        } else {
                                                            var2 *= -607767623;
                                                            var2 |= -1226418029;
                                                            var2 |= -851263988;
                                                            var2 &= -580946744;
                                                            var2 ^= 469594121;
                                                        }

                                                        int var419 = var223 * 3;
                                                        Integer var451 = var3;
                                                        if (var451 == null) {
                                                            var2 ^= -802516116;
                                                            var2 += -1541767192;
                                                            var2 |= -239436844;
                                                            var2 ^= 386872233;
                                                            break label346;
                                                        }
                                                        var2 = switch (var2) {
                                                            default -> var2 ^ -84539214;
                                                            case -960822143 -> {
                                                                var2 -= -1549104163;
                                                                yield var2 ^ 183856539;
                                                            }
                                                            case 1703574503 -> var2 ^ -64719182;
                                                        };
                                                        Integer var452 = var2;
                                                        if (var452 == null) {
                                                            break label349;
                                                        }

                                                        int var420 = var419 / 4;
                                                        if (var404 == var420) {
                                                            var2 |= -61187221;
                                                            var2 ^= 272942968;
                                                            float[] var421 = this.z;
                                                            var421[0] = var480;
                                                            float[] var422 = this.z;
                                                            int var453 = var3 + 1;
                                                            int var454 = var3 * var453;
                                                            int var455 = var454 & 1;
                                                            if (var455 != 0) {
                                                                var2 >>= 27;
                                                                var2 |= -455959612;
                                                                var2 ^= 323924865;
                                                                break label346;
                                                            }

                                                            var2 += -1223582973;
                                                            var2 &= -595430415;
                                                            var2 ^= 29493837;
                                                            var15 = var2;
                                                            long var508 = var15 + 1L;
                                                            long var509 = var15 * var508;
                                                            long var528 = var15 + 2L;
                                                            long var510 = var509 * var528;
                                                            var15 += 3L;
                                                            long var511 = var510 * var15;
                                                            var15 = var511 & 7L;
                                                            long var536;
                                                            int var459 = (var536 = var15 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                                                            if (var459 != 0) {
                                                                break label349;
                                                            }

                                                            var422[1] = var487;
                                                            switch (var2) {
                                                                case -2059257523:
                                                                    var2 -= 1771756934;
                                                                    var2 -= 244852792;
                                                                    var2 ^= -1257204136;
                                                                    break;
                                                                case -628801704:
                                                                default:
                                                                    var2 ^= 615186740;
                                                                    break;
                                                                case 1436354363:
                                                                    var2 ^= -2100646725;
                                                            }
                                                        } else {
                                                            switch (var2) {
                                                                case 467525604:
                                                                default:
                                                                    var2 ^= -349743194;
                                                                    break;
                                                                case 702879039:
                                                                    var2 *= 138308683;
                                                                    var2 ^= -1337300830;
                                                                    break;
                                                                case 882781862:
                                                                    var2 ^= 714457665;
                                                            }
                                                        }

                                                        int var423 = var2 + 1;
                                                        int var424 = var2 * var423;
                                                        int var425 = var424 & 1;
                                                        if (var425 != 0) {
                                                            break label349;
                                                        }

                                                        int var426 = var404 + 1;
                                                        Integer var460 = var3;
                                                        if (var460 == null) {
                                                            switch (var2) {
                                                                case -1205885481:
                                                                    var2 |= 37038178;
                                                                    var2 |= -1264492914;
                                                                    var2 ^= -1990245382;
                                                                    var2 ^= -615387015;
                                                                    break label346;
                                                                case 324804532:
                                                                    var2 ^= 840646795;
                                                                    break label346;
                                                                case 2118483959:
                                                                default:
                                                                    var2 ^= 1205262164;
                                                                    break label346;
                                                            }
                                                        }
                                                        var2 = switch (var2) {
                                                            case -2115322749 -> var2 ^ 362696020;
                                                            case -1205885481 -> {
                                                                var2 &= -1762230901;
                                                                var2 -= -1823974749;
                                                                var2 |= 1633430852;
                                                                var2 &= 1593570470;
                                                                yield var2 ^ 1699833414;
                                                            }
                                                            default -> var2 ^ -2021864520;
                                                        };
                                                        var285 = var480;
                                                        var324 = var487;
                                                        var355 = var19;
                                                        var404 = var426;
                                                        var2 *= 1214787813;
                                                        var2 <<= 30;
                                                        var2 ^= -814990991;
                                                    }

                                                    var2 *= -1557605755;
                                                    var2 ^= 1370252664;
                                                    var9 = var2;
                                                    var11 = var9 + 1L;
                                                    var11 = var9 * var11;
                                                    var13 = var9 + 2L;
                                                    var11 *= var13;
                                                    var9 += 3L;
                                                    var11 *= var9;
                                                    var9 = var11 & 7L;
                                                    long var537;
                                                    int var224 = (var537 = var9 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                                                    if (var224 != 0) {
                                                        break label349;
                                                    }

                                                    int var225 = var2 - -1798484154;
                                                    int var226 = var225 - 2046619936;
                                                    int var227 = var226 + -1845570159;
                                                    int var228 = var227 ^ 1332218988;
                                                    int var229 = var228 ^ -1601787175;
                                                    this.DZ(var4, var6, var249, var262, var229);
                                                    int var230 = var3 + 1;
                                                    int var231 = var3 * var230;
                                                    int var242 = var3 + 2;
                                                    int var232 = var231 * var242;
                                                    var3 += 3;
                                                    int var233 = var232 * var3;
                                                    var3 = var233 & 7;
                                                    if (var3 == 0) {
                                                        var2 ^= 1616401196;
                                                        var2 ^= -88924160;
                                                        var5 = var2;
                                                        var7 = var5 + 1L;
                                                        var7 = var5 * var7;
                                                        var9 = var5 + 2L;
                                                        var7 *= var9;
                                                        var5 += 3L;
                                                        var7 *= var5;
                                                        var5 = var7 & 7L;
                                                        long var538;
                                                        var3 = (var538 = var5 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                                                        if (var3 == 0) {
                                                            return var4.F();
                                                        }
                                                        break label349;
                                                    }

                                                    var2 &= 2003871200;
                                                    var2 ^= -896407364;
                                                } else {
                                                    var2 += 2117239515;
                                                    var2 *= 58796409;
                                                    var2 ^= -717293466;
                                                }
                                                break label346;
                                            }
                                            var2 = switch (var2) {
                                                case -1226764197 -> var2 ^ 1669063485;
                                                case -744317977 -> {
                                                    var2 &= -1101245133;
                                                    yield var2 ^ -1190792895;
                                                }
                                                default -> var2 ^ 302465784;
                                            };
                                            var302 = var2 + 1;
                                            var302 = var2 * var302;
                                            var302 &= 1;
                                            if (var302 != 0) {
                                                break label349;
                                            }

                                            float var316 = var277;
                                            float var317 = var316 / 4.0F;
                                            float[] var346 = new float[2];
                                            float var377 = 0.06F * var317;
                                            float var378 = 0.3F + var377;
                                            var346[0] = var378;
                                            float var379 = 0.95F * var317;
                                            int var397 = var3 + 1;
                                            int var398 = var3 * var397;
                                            int var407 = var3 + 2;
                                            int var399 = var398 * var407;
                                            int var408 = var3 + 3;
                                            int var400 = var399 * var408;
                                            int var401 = var400 & 7;
                                            if (var401 != 0) {
                                                var2 |= 1010838437;
                                                var2 ^= -738941029;
                                                break label346;
                                            }

                                            var2 ^= -2141663419;
                                            var2 |= 407604767;
                                            var2 |= 1749828780;
                                            var2 |= 38703427;
                                            var2 ^= 1210820692;
                                            float var380 = 8.25F + var379;
                                            var346[1] = var380;
                                            var222[var277] = var346;
                                            float[] var347 = new float[]{0.06F, 0.95F};
                                            var6[var277] = var347;
                                            float var348 = 0.1F * var317;
                                            float var349 = 1.24F - var348;
                                            var247[var277] = var349;
                                            float var318 = 0.1F * var317;
                                            float var319 = 0.5F - var318;
                                            var260[var277] = var319;
                                            var302 = var277 + 1;
                                            var277 = var302;
                                            switch (var2) {
                                                case -2141624523:
                                                default:
                                                    var2 ^= -490394260;
                                                    break;
                                                case -1284221013:
                                                    var2 &= 1133759297;
                                                    var2 -= 1107629672;
                                                    var2 >>= 25;
                                                    var2 ^= 744317959;
                                                    break;
                                                case -821444833:
                                                    var2 ^= -1288591350;
                                            }
                                        }
                                    }
                                }
                                var2 = switch (var2) {
                                    case -839164528 -> {
                                        var2 ^= -880954300;
                                        var2 &= 246861759;
                                        yield var2 ^ 415544970;
                                    }
                                    case -289152901 -> var2 ^ -605431461;
                                    default -> var2 ^ 55165828;
                                };
                                Integer var338 = var2;
                                if (var338 == null) {
                                    break label349;
                                }

                                float var339 = var302;
                                float var363 = var218;
                                var363--;
                                float var340 = var339 / var363;
                                var363 = var340 - 0.12F;
                                var363 = (float) (Math.PI * 6) * var363;
                                var13 = var3;
                                var15 = var13 + 1L;
                                var15 = var13 * var15;
                                var13 = var15 & 1L;
                                long var539;
                                int var389 = (var539 = var13 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
                                if (var389 != 0) {
                                    var2 *= -1252419691;
                                    var2 += -1406713968;
                                    var2 ^= 99787386;
                                    break label346;
                                }

                                var2 &= 936721458;
                                var2 |= -127419153;
                                var2 ^= -1618050870;
                                var2 ^= -1873042962;
                                Integer var390 = var2;
                                if (var390 == null) {
                                    break label349;
                                }

                                double var367 = var363;
                                double var368 = Math.cos(var367);
                                var363 = (float)var368;
                                var363 = 0.5F * var363;
                                var363 = 0.5F + var363;
                                float var391 = (float) Math.PI * var340;
                                double var392 = var391;
                                double var393 = Math.sin(var392);
                                float var394 = (float)var393;
                                float var395 = 0.12F * var394;
                                var395++;
                                var363 = 0.07F * var363;
                                float var341 = var340 * 4.0F;
                                float var342 = TP.S(var341);
                                float var343 = var363 * var342;
                                float var344 = var395 - var343;
                                var257[var302] = var344;
                                var275[var302] = 0.64F;
                                int var345 = var302 + 1;
                                var302 = var345;
                                var2 ^= -1303316525;
                                var2 &= -1561724527;
                                var2 *= 243891907;
                                var2 ^= -2115738224;
                            }
                        }
                    }

                    var2 |= -1537306066;
                    var2 >>>= 21;
                    var2 ^= -1560535824;
                    var2 *= 1193387135;
                    var2 ^= 142060510;
                    var9 = var2;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var13 = var9 + 2L;
                    var11 *= var13;
                    var9 += 3L;
                    var11 *= var9;
                    var9 = var11 & 7L;
                    long var540;
                    int var269 = (var540 = var9 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                    if (var269 != 0) {
                        break label349;
                    }

                    float var270 = var8;
                    float var10 = var218;
                    var10--;
                    float var271 = var270 / var10;
                    Integer var291 = var3;
                    if (var291 == null) {
                        var2 += -1150582000;
                        var2 ^= 586344126;
                        var2 ^= 799687602;
                        break;
                    }

                    var2 >>>= 8;
                    var2 |= 911692192;
                    var2 &= -147674942;
                    var2 &= -1406090732;
                    var2 ^= -2001741768;
                    long var292 = var2;
                    long var12 = var292 + 1L;
                    var12 = var292 * var12;
                    long var14 = var292 + 2L;
                    var12 *= var14;
                    long var293 = var292 + 3L;
                    var12 *= var293;
                    long var294 = var12 & 7L;
                    long var541;
                    int var295 = (var541 = var294 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                    if (var295 != 0) {
                        break label349;
                    }

                    int var296 = var2 * -234856435;
                    int var297 = var296 * -12018697;
                    int var298 = var297 ^ -900151691;
                    float[] var299 = i(var271, 0.0F, 1.15F, -0.2F, 4.9F, 0.32F, 8.45F, var298);
                    var6[var8] = var299;
                    int var300 = var2 | 1371729926;
                    int var301 = var300 ^ 571103778;
                    float[] var272 = cs(var271, 0.0F, 1.15F, -0.2F, 4.9F, 0.32F, 8.45F, var301);
                    var245[var8] = var272;
                    int var273 = var8 + 1;
                    var8 = var273;
                    var2 *= -930370489;
                    var2 -= -1584244633;
                    var2 ^= 1010119120;
                }
            }

            long var201 = var2;
            long var209 = var201 + 1L;
            long var210 = var201 * var209;
            long var202 = var210 & 1L;
            long var542;
            var2 = (var542 = var202 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var204 = new IllegalArgumentException();
                throw var204;
            }
        }

        AssertionError var205 = new AssertionError();
        throw var205;
    }

    private KK Wj(int var1) {
        label263: {
            int var3 = System.identityHashCode(this);
            dx_2 var4 = new dx_2();
            int var5 = 7;
            float[][] var6 = new float[var5][];
            var6 = var6;
            float[][] var7 = new float[var5][];
            var7 = var7;
            float[] var8 = new float[var5];
            var8 = var8;
            Integer var9 = var3;
            int var2;
            if (var9 == null) {
                switch (var1) {
                    case -2119307799:
                        var2 = var1 ^ -2000633384;
                        break;
                    case -923990293:
                        var2 = var1 | -966260593;
                        var2 ^= -671970887;
                        break;
                    case 768272716:
                    default:
                        var2 = var1 ^ 1321215713;
                }
            } else {
                var2 = var1 ^ -1498339432;
                var2 -= -748368792;
                var2 ^= -937283667;
                long var181 = var2;
                long var11 = var181 + 1L;
                var11 = var181 * var11;
                long var13 = var181 + 2L;
                var11 *= var13;
                long var182 = var181 + 3L;
                var11 *= var182;
                long var183 = var11 & 7L;
                long var415;
                int var184 = (var415 = var183 - 0L) == 0L ? 0 : (var415 < 0L ? -1 : 1);
                if (var184 != 0) {
                    break label263;
                }

                float[] var185 = new float[var5];
                float[] var186 = var185;
                int var10 = 0;
                var10 = var10;

                var2 = switch (var2) {
                    default -> var2 ^ 1502505104;
                    case 701379324 -> var2 ^ -834173991;
                    case 1389722278 -> {
                        var2 |= -282955338;
                        var2 >>>= 21;
                        var2 <<= 20;
                        yield var2 ^ -1690087179;
                    }
                };

                label260:
                while (true) {
                    if (var10 >= var5) {
                        var2 -= -1110386910;
                        var2 ^= 1431938341;
                        Integer var149 = var2;
                        if (var149 == null) {
                            break label263;
                        }

                        e_2 var150 = e_2.METAL;
                        long var192 = var3;
                        long var276 = var192 + 1L;
                        var276 = var192 * var276;
                        long var193 = var276 & 1L;
                        long var416;
                        var10 = (var416 = var193 - 0L) == 0L ? 0 : (var416 < 0L ? -1 : 1);
                        if (var10 == 0) {
                            var2 = switch (var2) {
                                default -> var2 ^ 585414949;
                                case 124670422 -> var2 ^ 619861016;
                                case 1941691638 -> {
                                    var2 >>= 3;
                                    var2 ^= -278671594;
                                    yield var2 ^ 1881987231;
                                }
                            };
                            long var195 = var2;
                            var276 = var195 + 1L;
                            var276 = var195 * var276;
                            long var14 = var195 + 2L;
                            var276 *= var14;
                            long var196 = var195 + 3L;
                            var276 *= var196;
                            long var197 = var276 & 7L;
                            long var417;
                            var10 = (var417 = var197 - 0L) == 0L ? 0 : (var417 < 0L ? -1 : 1);
                            if (var10 != 0) {
                                break label263;
                            }

                            var10 = var2 - 2060924250;
                            var10 -= 1526740875;
                            var10 ^= -1822630577;
                            var10 -= -1673294983;
                            var10 ^= -1122808567;
                            HY(var4, var6, var7, var8, var186, 3.0F, 16, var150, true, true, var10);
                            var5 = (byte)40;
                            var6 = new float[var5][];
                            var6 = var6;
                            var7 = new float[var5][];
                            var7 = var7;
                            var8 = new float[var5];
                            var8 = var8;
                            float[] var187 = new float[var5];
                            float[] var188 = var187;
                            int var204 = 0;
                            var204 = var204;

                            var2 = switch (var2) {
                                case -1858573289 -> {
                                    var2 ^= 1339247551;
                                    var2 += 1638409277;
                                    yield var2 ^ 1972658301;
                                }
                                case -1219991853 -> var2 ^ -456340641;
                                default -> var2 ^ -71517964;
                            };

                            while (true) {
                                int var239 = var2 + 1;
                                int var240 = var2 * var239;
                                int var282 = var2 + 2;
                                int var241 = var240 * var282;
                                int var283 = var2 + 3;
                                int var242 = var241 * var283;
                                int var243 = var242 & 7;
                                if (var243 != 0) {
                                    break label263;
                                }

                                if (var204 >= var5) {
                                    var2 -= 671467366;
                                    var2 &= 224538821;
                                    var2 -= -173932708;
                                    var2 &= 1924314511;
                                    var2 ^= 120489756;
                                    e_2 var152 = e_2.GRIP;
                                    var204 = var2 & -1448589569;
                                    var204 *= -709164677;
                                    var204 ^= -912123643;
                                    HY(var4, var6, var7, var8, var188, 3.2F, 16, var152, true, true, var204);
                                    var5 = var2 - 1739724513;
                                    int var154 = var5 & -1660397281;
                                    var154 ^= -1217776958;
                                    mS(var4, -1.85F, 3.0F, 1.95F, 3.78F, 0.42F, var154);
                                    var154 = var2 & 647763586;
                                    var154 -= 1617498401;
                                    var154 >>>= 16;
                                    var154 &= -256479883;
                                    var154 ^= 505213352;
                                    tv(var4, -2.62F, 3.39F, 0.8F, 0.24F, 30, 10, var154);
                                    byte var161 = 34;
                                    var6 = new float[var161][];
                                    var6 = var6;
                                    var7 = new float[var161][];
                                    var7 = var7;
                                    var8 = new float[var161];
                                    var8 = var8;
                                    int var189 = 0;
                                    long var209 = var3;
                                    var276 = var209 + 1L;
                                    var276 = var209 * var276;
                                    var14 = var209 + 2L;
                                    var276 *= var14;
                                    long var210 = var209 + 3L;
                                    var276 *= var210;
                                    long var211 = var276 & 7L;
                                    long var418;
                                    var204 = (var418 = var211 - 0L) == 0L ? 0 : (var418 < 0L ? -1 : 1);
                                    if (var204 != 0) {
                                        var2 *= -1928493427;
                                        var2 -= 617071292;
                                        var2 -= 138804954;
                                        var2 -= 1854119667;
                                        var2 ^= 139983225;
                                    } else {
                                        var2 *= -984474091;
                                        var2 ^= -941133666;
                                        Integer var213 = var2;
                                        if (var213 == null) {
                                            break label263;
                                        }

                                        var189 = var189;
                                        var2 *= -2135777821;
                                        var2 -= -2058089111;
                                        var2 *= -155277403;
                                        var2 ^= 712848381;

                                        while (var189 < var161) {
                                            var2 *= 793327823;
                                            var2 ^= -370001615;
                                            var2 >>>= 21;
                                            var2 ^= 134951413;
                                            long var214 = var2;
                                            var276 = var214 + 1L;
                                            var276 = var214 * var276;
                                            long var215 = var276 & 1L;
                                            long var419;
                                            int var216 = (var419 = var215 - 0L) == 0L ? 0 : (var419 < 0L ? -1 : 1);
                                            if (var216 != 0) {
                                                break label263;
                                            }

                                            float var217 = var189;
                                            float var260 = var161;
                                            var260--;
                                            float var218 = var217 / var260;
                                            float var262 = 17.1F * var218;
                                            float var263 = 3.7F + var262;
                                            var276 = var3;
                                            var14 = var276 + 1L;
                                            var14 = var276 * var14;
                                            var276 = var14 & 1L;
                                            long var420;
                                            int var303 = (var420 = var276 - 0L) == 0L ? 0 : (var420 < 0L ? -1 : 1);
                                            if (var303 != 0) {
                                                var2 += 1265069120;
                                                var2 *= 151854989;
                                                var2 |= 943074533;
                                                var2 ^= -404129613;
                                                break label260;
                                            }

                                            var2 |= -1176062906;
                                            var2 -= 898714303;
                                            var2 ^= -788331586;
                                            int var304 = var2 + 1;
                                            int var305 = var2 * var304;
                                            int var346 = var2 + 2;
                                            int var306 = var305 * var346;
                                            int var347 = var2 + 3;
                                            int var307 = var306 * var347;
                                            int var308 = var307 & 7;
                                            if (var308 != 0) {
                                                break label263;
                                            }

                                            float var421;
                                            int var309 = (var421 = var218 - 0.8F) == 0.0F ? 0 : (var421 < 0.0F ? -1 : 1);
                                            float var321;
                                            if (var309 > 0) {
                                                var2 = switch (var2) {
                                                    case -1692541694 -> var2 ^ 858825267;
                                                    default -> var2 ^ -250463764;
                                                    case 1432184985 -> {
                                                        var2 ^= -2119909127;
                                                        yield var2 ^ 215346547;
                                                    }
                                                };
                                                int var310 = var2 + 1;
                                                int var311 = var2 * var310;
                                                int var348 = var2 + 2;
                                                int var312 = var311 * var348;
                                                int var349 = var2 + 3;
                                                int var313 = var312 * var349;
                                                int var314 = var313 & 7;
                                                if (var314 != 0) {
                                                    break label263;
                                                }

                                                float var315 = var218 - 0.8F;
                                                float var316 = var315 / 0.2F;
                                                double var317 = var316;
                                                double var318 = Math.pow(var317, 1.4F);
                                                float var319 = (float)var318;
                                                Integer var350 = var3;
                                                if (var350 == null) {
                                                    var2 *= -1273700261;
                                                    var2 ^= 1133286481;
                                                    var2 ^= 255475398;
                                                    break label260;
                                                }
                                                var2 = switch (var2) {
                                                    case -724878502 -> var2 ^ 1435774388;
                                                    case -668187373 -> {
                                                        var2 >>>= 20;
                                                        yield var2 ^ -215640108;
                                                    }
                                                    default -> var2 ^ 497047229;
                                                };
                                                var13 = var2;
                                                long var398 = var13 + 1L;
                                                var398 = var13 * var398;
                                                long var411 = var13 + 2L;
                                                var398 *= var411;
                                                var13 += 3L;
                                                var398 *= var13;
                                                var13 = var398 & 7L;
                                                long var422;
                                                int var354 = (var422 = var13 - 0L) == 0L ? 0 : (var422 < 0L ? -1 : 1);
                                                if (var354 != 0) {
                                                    break label263;
                                                }

                                                float var320 = 0.81F * var319;
                                                var321 = var320;
                                                var2 >>>= 11;
                                                var2 *= -675467861;
                                                var2 >>>= 2;
                                                var2 >>>= 10;
                                                var2 ^= -1822759854;
                                            } else {
                                                var2 |= 1190066851;
                                                var2 >>= 3;
                                                var2 &= -27878260;
                                                var2 ^= 1399963065;
                                                int var355 = var2 + 1;
                                                int var356 = var2 * var355;
                                                int var379 = var2 + 2;
                                                int var357 = var356 * var379;
                                                int var380 = var2 + 3;
                                                int var358 = var357 * var380;
                                                int var359 = var358 & 7;
                                                if (var359 != 0) {
                                                    break label263;
                                                }

                                                var321 = 0.0F;
                                                var2 *= 1575951299;
                                                var2 *= -222826499;
                                                var2 -= 219500702;
                                                var2 ^= -1447415980;
                                            }

                                            float var322 = -1.36F + var321;
                                            var13 = var3;
                                            long var402 = var13 + 1L;
                                            var402 = var13 * var402;
                                            long var412 = var13 + 2L;
                                            var402 *= var412;
                                            var13 += 3L;
                                            var402 *= var13;
                                            var13 = var402 & 7L;
                                            long var423;
                                            int var363 = (var423 = var13 - 0L) == 0L ? 0 : (var423 < 0L ? -1 : 1);
                                            if (var363 != 0) {
                                                switch (var2) {
                                                    case -1822722519:
                                                        var2 += -1902288276;
                                                        var2 *= 50159473;
                                                        var2 += -299002735;
                                                        var2 ^= 1246892548;
                                                        var2 ^= 703130628;
                                                        break label260;
                                                    case -1269804260:
                                                    default:
                                                        var2 ^= 1952280604;
                                                        break label260;
                                                    case 1876120449:
                                                        var2 ^= 1745977961;
                                                        break label260;
                                                }
                                            }

                                            var2 ^= -898247660;
                                            var2 ^= -1290354612;
                                            float var424;
                                            int var364 = (var424 = var218 - 0.68F) == 0.0F ? 0 : (var424 < 0.0F ? -1 : 1);
                                            float var372;
                                            if (var364 > 0) {
                                                var2 = switch (var2) {
                                                    case -365403535 -> {
                                                        var2 |= 208089209;
                                                        var2 ^= 695203208;
                                                        var2 *= 1675152539;
                                                        yield var2 ^ -1423933040;
                                                    }
                                                    case 393377233 -> var2 ^ 300938676;
                                                    default -> var2 ^ 1474327541;
                                                };
                                                Integer var365 = var2;
                                                if (var365 == null) {
                                                    break label263;
                                                }

                                                float var366 = var218 - 0.68F;
                                                float var367 = var366 / 0.32F;
                                                double var368 = var367;
                                                double var369 = Math.pow(var368, 1.8F);
                                                float var370 = (float)var369;
                                                float var371 = 2.05F * var370;
                                                int var381 = var3 + 1;
                                                int var382 = var3 * var381;
                                                int var383 = var382 & 1;
                                                if (var383 != 0) {
                                                    var2 &= 1134619155;
                                                    var2 ^= 463424837;
                                                    break label260;
                                                }

                                                var2 ^= 345271556;
                                                var2 -= -1026250929;
                                                var2 += -120428370;
                                                var2 ^= -1744564241;
                                                int var384 = var2 + 1;
                                                int var385 = var2 * var384;
                                                int var386 = var385 & 1;
                                                if (var386 != 0) {
                                                    break label263;
                                                }

                                                var372 = var371;
                                                var2 <<= 18;
                                                var2 ^= -1661301897;
                                            } else {
                                                var2 += -298225732;
                                                var2 ^= -2023396150;
                                                var2 ^= -321653845;
                                                var14 = var2;
                                                long var16 = var14 + 1L;
                                                var16 = var14 * var16;
                                                var14 = var16 & 1L;
                                                long var425;
                                                int var389 = (var425 = var14 - 0L) == 0L ? 0 : (var425 < 0L ? -1 : 1);
                                                if (var389 != 0) {
                                                    break label263;
                                                }

                                                var372 = 0.0F;
                                                switch (var2) {
                                                    case -1278784180:
                                                        var2 &= -394002297;
                                                        var2 >>>= 1;
                                                        var2 ^= 746359669;
                                                        break;
                                                    case 945484443:
                                                    default:
                                                        var2 ^= -2044552509;
                                                        break;
                                                    case 1761461369:
                                                        var2 ^= -605576190;
                                                }
                                            }

                                            var14 = var2;
                                            long var409 = var14 + 1L;
                                            var409 = var14 * var409;
                                            var14 = var409 & 1L;
                                            long var426;
                                            int var392 = (var426 = var14 - 0L) == 0L ? 0 : (var426 < 0L ? -1 : 1);
                                            if (var392 != 0) {
                                                break label263;
                                            }

                                            float var373 = 1.5F - var372;
                                            float[] var393 = new float[]{var322, var263};
                                            int var323 = var3 + 1;
                                            int var324 = var3 * var323;
                                            int var325 = var324 & 1;
                                            if (var325 != 0) {
                                                switch (var2) {
                                                    case 35189381:
                                                        var2 ^= 209064231;
                                                        break label260;
                                                    case 336588212:
                                                    default:
                                                        var2 ^= 1494870607;
                                                        break label260;
                                                    case 2084473719:
                                                        var2 |= 804697929;
                                                        var2 *= 1347198881;
                                                        var2 >>= 2;
                                                        var2 *= -822576413;
                                                        var2 ^= 770665811;
                                                        break label260;
                                                }
                                            }

                                            var2 ^= 813904931;
                                            var2 ^= -383545730;
                                            var402 = var2;
                                            var412 = var402 + 1L;
                                            var412 = var402 * var412;
                                            var402 = var412 & 1L;
                                            long var427;
                                            int var326 = (var427 = var402 - 0L) == 0L ? 0 : (var427 < 0L ? -1 : 1);
                                            if (var326 != 0) {
                                                break label263;
                                            }

                                            var6[var189] = var393;
                                            float[] var327 = new float[]{var373, var263};
                                            var7[var189] = var327;
                                            float var264 = 0.35F * var218;
                                            float var265 = 1.0F - var264;
                                            float var266 = 0.29F * var265;
                                            float var219 = 1.0F - var218;
                                            float var220 = var219 * 6.0F;
                                            float var221 = Math.min(1.0F, var220);
                                            float var222 = var266 * var221;
                                            var8[var189] = var222;
                                            var216 = var189 + 1;
                                            var189 = var216;
                                            switch (var2) {
                                                case -1516359382:
                                                    var2 &= 2128754753;
                                                    var2 ^= 1721493424;
                                                    break;
                                                case -725206465:
                                                    var2 ^= 1799412062;
                                                    break;
                                                case 603622647:
                                                default:
                                                    var2 ^= -469603429;
                                            }
                                        }

                                        var2 &= 963907760;
                                        var2 ^= -305345545;
                                        var2 *= -1098967961;
                                        var2 *= 438049109;
                                        var2 ^= 1913353027;
                                        Integer var162 = var2;
                                        if (var162 == null) {
                                            break label263;
                                        }

                                        float[] var163 = this.A;
                                        var163[0] = -0.55F;
                                        float[] var164 = this.A;
                                        var164[1] = 20.8F;
                                        float[] var165 = this.z;
                                        Integer var145 = var3;
                                        if (var145 != null) {
                                            var2 |= -782478437;
                                            var2 |= 12090533;
                                            var2 *= -717434405;
                                            var2 ^= -774860080;
                                            var165[0] = -0.1F;
                                            float[] var146 = this.z;
                                            var146[1] = 16.5F;
                                            int var147 = var2 & -791716246;
                                            var147 ^= -1765655763;
                                            this.DZ(var4, var6, var7, var8, var147);
                                            return var4.F();
                                        }

                                        var2 |= 1033948182;
                                        var2 ^= -421365216;
                                    }
                                    break label260;
                                }
                                var2 = switch (var2) {
                                    default -> var2 ^ -735189757;
                                    case -1057402536 -> var2 ^ -810384856;
                                    case 889662360 -> {
                                        var2 &= 1867949072;
                                        yield var2 ^ 1420888740;
                                    }
                                };
                                Integer var244 = var2;
                                if (var244 == null) {
                                    break label263;
                                }

                                float var245 = var204;
                                float var284 = var5;
                                var284--;
                                float var246 = var245 / var284;
                                float var286 = (float) (Math.PI * 18) * var246;
                                double var287 = var286;
                                double var288 = Math.cos(var287);
                                float var289 = (float)var288;
                                float var290 = 0.5F * var289;
                                float var291 = 0.5F + var290;
                                float var292 = 0.075F * var291;
                                float var333 = var246 * 12.0F;
                                float var334 = TP.S(var333);
                                float var293 = var292 * var334;
                                float var335 = 1.0F - var246;
                                float var336 = var335 * 12.0F;
                                float var337 = TP.S(var336);
                                float var294 = var293 * var337;
                                float[] var338 = new float[]{0.0F, 0.0F};
                                float var374 = 8.95F * var246;
                                float var375 = -5.85F + var374;
                                var338[1] = var375;
                                var6[var204] = var338;
                                float[] var339 = new float[]{0.0F, 1.0F};
                                var7[var204] = var339;
                                float var247 = (float) Math.PI * var246;
                                double var340 = var247;
                                double var341 = Math.sin(var340);
                                float var248 = (float)var341;
                                float var249 = 0.06F * var248;
                                var249++;
                                float var251 = var249 - var294;
                                var8[var204] = var251;
                                float var252 = var294 * 0.8F;
                                float var253 = 1.0F - var252;
                                var188[var204] = var253;
                                var11 = var3;
                                var13 = var11 + 1L;
                                var13 = var11 * var13;
                                long var397 = var11 + 2L;
                                var13 *= var397;
                                var11 += 3L;
                                var13 *= var11;
                                var11 = var13 & 7L;
                                long var428;
                                int var257 = (var428 = var11 - 0L) == 0L ? 0 : (var428 < 0L ? -1 : 1);
                                if (var257 != 0) {
                                    switch (var2) {
                                        case 146347733:
                                            var2 ^= -2095847995;
                                            break label260;
                                        case 852038019:
                                        default:
                                            var2 ^= 667956585;
                                            break label260;
                                        case 1907829428:
                                            var2 -= 148202962;
                                            var2 ^= 1912488884;
                                            break label260;
                                    }
                                }

                                var2 *= -1661570835;
                                var2 &= 321044340;
                                var2 += -986035061;
                                var2 ^= -825045289;
                                Integer var258 = var2;
                                if (var258 == null) {
                                    break label263;
                                }

                                int var259 = var204 + 1;
                                var204 = var259;
                                switch (var2) {
                                    case -2001653732:
                                        var2 ^= 1443222817;
                                        break;
                                    case -1946593673:
                                    default:
                                        var2 ^= -940486635;
                                        break;
                                    case 159947384:
                                        var2 &= 1152942494;
                                        var2 >>>= 7;
                                        var2 |= 46403270;
                                        var2 ^= 935474270;
                                }
                            }
                        } else {
                            var2 |= -1593596486;
                            var2 &= -1171952688;
                            var2 += 771168025;
                            var2 *= 2097019527;
                            var2 ^= 1141572489;
                            break;
                        }
                    }

                    var2 &= -188150149;
                    var2 &= -874375313;
                    var2 <<= 24;
                    var2 ^= -1171576196;
                    float var227 = var10;
                    float var12 = var5;
                    var12--;
                    float var228 = var227 / var12;
                    var12 = var228 * 2.2F;
                    var12 = Math.min(1.0F, var12);
                    var12 = 1.0F - var12;
                    double var271 = var12;
                    double var272 = Math.pow(var271, 2.0);
                    double var273 = 1.0 - var272;
                    double var274 = Math.sqrt(var273);
                    var12 = (float)var274;
                    float[] var328 = new float[]{0.0F, 0.0F};
                    float var229 = 1.25F * var228;
                    float var230 = -7.0F + var229;
                    var328[1] = var230;
                    var6[var10] = var328;
                    float[] var231 = new float[]{0.0F, 0.0F};
                    var13 = var3;
                    long var15 = var13 + 1L;
                    var15 = var13 * var15;
                    long var17 = var13 + 2L;
                    var15 *= var17;
                    var13 += 3L;
                    var15 *= var13;
                    var13 = var15 & 7L;
                    long var429;
                    int var332 = (var429 = var13 - 0L) == 0L ? 0 : (var429 < 0L ? -1 : 1);
                    if (var332 != 0) {
                        var2 &= 639539478;
                        var2 ^= 501744362;
                        var2 <<= 26;
                        var2 ^= -518027434;
                        break;
                    }

                    var2 |= -1462943170;
                    var2 *= -908975427;
                    var2 ^= 359931186;
                    var231[1] = 1.0F;
                    var7[var10] = var231;
                    float var232 = 0.28F * var12;
                    float var233 = 0.72F + var232;
                    float var234 = 1.42F * var233;
                    var8[var10] = var234;
                    float var235 = 0.28F * var12;
                    float var236 = 0.72F + var235;
                    float var237 = 1.12F * var236;
                    var186[var10] = var237;
                    int var238 = var10 + 1;
                    var10 = var238;
                    var2 &= 1800017840;
                    var2 ^= -458139963;
                }
            }

            Integer var142 = var2;
            if (var142 != null) {
                IllegalStateException var143 = new IllegalStateException();
                throw var143;
            }
        }

        IllegalArgumentException var144 = new IllegalArgumentException();
        throw var144;
    }

    private void DZ(dx_2 var1, float[][] var2, float[][] var3, float[] var4, int var5) {
        label159: {
            int var7 = System.identityHashCode(this);
            int var8 = var2.length;
            int var116 = var8;
            float[][][] var9 = new float[var8][6][];
            var9 = var9;
            float[][][] var10 = new float[var8][7][];
            int var11 = var7 + 1;
            var11 = var7 * var11;
            var11 &= 1;
            int var49;
            if (var11 == 0) {
                var49 = var5 ^ 151246098;
                var49 ^= 948224896;
                var10 = var10;
                int var130 = 0;
                var130 = var130;

                var49 = switch (var49) {
                    case -1811558825 -> var49 ^ 1365492735;
                    case -142069281 -> {
                        var49 &= -279017847;
                        var49 *= -1744899847;
                        var49 >>>= 15;
                        yield var49 ^ -307891742;
                    }
                    default -> var49 ^ -1001642064;
                };

                label156:
                while (true) {
                    if (var130 >= var116) {
                        var49 <<= 9;
                        var49 |= -958204034;
                        var49 &= 258905862;
                        var49 ^= 442030513;
                        Integer var117 = var49;
                        if (var117 == null) {
                            break label159;
                        }

                        e_2 var118 = e_2.BLADE;
                        var1.tD(var9, var10, true, false, var118);
                        float[][] var119 = var9[0];
                        float[][] var132 = new float[6][];
                        float[][] var133 = var132;
                        long var137 = var7;
                        long var181 = var137 + 1L;
                        var181 = var137 * var181;
                        long var223 = var137 + 2L;
                        var181 *= var223;
                        var137 += 3L;
                        var181 *= var137;
                        var137 = var181 & 7L;
                        long var257;
                        int var140 = (var257 = var137 - 0L) == 0L ? 0 : (var257 < 0L ? -1 : 1);
                        if (var140 != 0) {
                            var49 += 337074984;
                            var49 |= 20510680;
                            var49 >>= 1;
                            var49 += -1863202385;
                            var49 ^= -1861412134;
                            break;
                        } else {
                            var49 ^= 50593458;
                            var49 <<= 24;
                            var49 ^= -1636859722;
                            byte var141 = 0;
                            int var142 = var141;

                            var49 = switch (var49) {
                                case -1687191370 -> {
                                    var49 >>>= 4;
                                    var49 &= 1375238454;
                                    var49 >>= 14;
                                    yield var49 ^ -1955249865;
                                }
                                default -> var49 ^ -873063467;
                                case 1404046428 -> var49 ^ 985879423;
                            };

                            while (true) {
                                Integer var163 = var49;
                                if (var163 == null) {
                                    break label159;
                                }

                                if (var142 >= 6) {
                                    var49 ^= 300528025;
                                    var49 >>>= 25;
                                    var49 |= -895668587;
                                    var49 ^= 859641645;
                                    var137 = var49;
                                    var181 = var137 + 1L;
                                    var181 = var137 * var181;
                                    var223 = var137 + 2L;
                                    var181 *= var223;
                                    var137 += 3L;
                                    var181 *= var137;
                                    var137 = var181 & 7L;
                                    long var258;
                                    int var126 = (var258 = var137 - 0L) == 0L ? 0 : (var258 < 0L ? -1 : 1);
                                    if (var126 != 0) {
                                        break label159;
                                    }

                                    float[] var127 = jM.V(0.0F, 0.5F);
                                    float[][] var123 = var9[1];
                                    float[] var124 = KK.ev(var123);
                                    e_2 var146 = e_2.BLADE;
                                    long var167 = var7;
                                    long var207 = var167 + 1L;
                                    var207 = var167 * var207;
                                    long var236 = var167 + 2L;
                                    var207 *= var236;
                                    long var168 = var167 + 3L;
                                    var207 *= var168;
                                    long var169 = var207 & 7L;
                                    long var259;
                                    var7 = (var259 = var169 - 0L) == 0L ? 0 : (var259 < 0L ? -1 : 1);
                                    if (var7 == 0) {
                                        var49 -= -2036497379;
                                        var49 >>= 18;
                                        var49 -= -446088105;
                                        var49 |= -936234375;
                                        var49 ^= -84283921;
                                        var7 = var49 + 1;
                                        var7 = var49 * var7;
                                        var7 &= 1;
                                        if (var7 == 0) {
                                            var1.M(var119, var133, var127, var124, var146);
                                            return;
                                        }
                                        break label159;
                                    }

                                    var49 ^= -347415900;
                                    var49 ^= 642330640;
                                    break label156;
                                }
                                var49 = switch (var49) {
                                    case -1955248138 -> {
                                        var49 += -1709354668;
                                        var49 >>>= 9;
                                        var49 |= 278036581;
                                        yield var49 ^ 38289327;
                                    }
                                    case -369014646 -> var49 ^ 945015888;
                                    default -> var49 ^ 574436458;
                                };
                                float[][] var164 = var10[0];
                                float[] var165 = var164[var142];
                                int var185 = var7 + 1;
                                int var186 = var7 * var185;
                                int var205 = var7 + 2;
                                int var187 = var186 * var205;
                                var205 = var7 + 3;
                                int var188 = var187 * var205;
                                int var189 = var188 & 7;
                                if (var189 != 0) {
                                    var49 ^= -222999316;
                                    var49 ^= -724801174;
                                    break label156;
                                }
                                var49 = switch (var49) {
                                    default -> var49 ^ -2684323;
                                    case -799828543 -> var49 ^ 126762972;
                                    case 316339906 -> {
                                        var49 |= -7914378;
                                        var49 |= -2034125033;
                                        yield var49 ^ -1936710154;
                                    }
                                };
                                int var190 = var49 + 1;
                                int var191 = var49 * var190;
                                int var192 = var191 & 1;
                                if (var192 != 0) {
                                    break label159;
                                }

                                var133[var142] = var165;
                                int var166 = var142 + 1;
                                var142 = var166;
                                switch (var49) {
                                    case 388622508:
                                        var49 ^= 206615579;
                                        break;
                                    case 1733372323:
                                    default:
                                        var49 ^= -984837673;
                                        break;
                                    case 1934612993:
                                        var49 -= 1711315519;
                                        var49 &= -339866029;
                                        var49 ^= -2105849420;
                                }
                            }
                        }
                    }
                    var49 = switch (var49) {
                        default -> var49 ^ -1515606830;
                        case -307958385 -> {
                            var49 ^= 1079818105;
                            var49 &= 1615113200;
                            var49 *= -2086592295;
                            var49 += -298231315;
                            yield var49 ^ -1677902903;
                        }
                        case -22804351 -> var49 ^ 268758462;
                    };
                    float var12 = var130;
                    float var13 = var116;
                    var13--;
                    var12 /= var13;
                    var12 = var12;
                    float[] var148 = var2[var130];
                    var13 = var148[0];
                    float[] var14 = var3[var130];
                    float var170 = var14[0];
                    float var15 = this.yP;
                    var13 = TP.GO(var13, var170, var15);
                    var14 = var2[var130];
                    float var172 = var14[1];
                    float[] var197 = var3[var130];
                    var15 = var197[1];
                    float var16 = this.yP;
                    float var173 = TP.GO(var172, var15, var16);
                    var15 = var4[var130];
                    var16 = Math.min(var15, 0.022F);
                    long var17 = var7;
                    long var19 = var17 + 1L;
                    var19 = var17 * var19;
                    long var21 = var17 + 2L;
                    var19 *= var21;
                    var17 += 3L;
                    var19 *= var17;
                    var17 = var19 & 7L;
                    long var260;
                    int var227 = (var260 = var17 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                    if (var227 != 0) {
                        switch (var49) {
                            case -1925991073:
                                var49 ^= 994927831;
                                break label156;
                            case 1327361147:
                            default:
                                var49 ^= -552738159;
                                break label156;
                            case 1831707796:
                                var49 &= -2112911861;
                                var49 <<= 19;
                                var49 ^= -1901637473;
                                var49 ^= -1710980133;
                                break label156;
                        }
                    }

                    var49 += 628681862;
                    var49 -= 1841127716;
                    var49 &= -1679410509;
                    var49 ^= 2137241010;
                    var49 ^= 1918261579;
                    int var228 = var49 + 1;
                    int var229 = var49 * var228;
                    int var230 = var229 & 1;
                    if (var230 != 0) {
                        break label159;
                    }

                    float[][] var231 = var9[var130];
                    float[] var18 = new float[3];
                    float[] var245 = var2[var130];
                    float var246 = var245[0];
                    var18[0] = var246;
                    float[] var247 = var2[var130];
                    float var248 = var247[1];
                    var18[1] = var248;
                    var18[2] = var15;
                    var231[0] = var18;
                    float[][] var232 = var9[var130];
                    var18 = new float[]{var13, var173, var15};
                    var232[1] = var18;
                    float[][] var233 = var9[var130];
                    var18 = new float[3];
                    float[] var249 = var3[var130];
                    float var250 = var249[0];
                    var18[0] = var250;
                    float[] var251 = var3[var130];
                    float var252 = var251[1];
                    var18[1] = var252;
                    var18[2] = var16;
                    var233[2] = var18;
                    float[][] var234 = var9[var130];
                    var18 = new float[3];
                    float[] var253 = var3[var130];
                    float var254 = var253[0];
                    var18[0] = var254;
                    float[] var255 = var3[var130];
                    float var256 = var255[1];
                    var18[1] = var256;
                    var16 = -var16;
                    var18[2] = var16;
                    var234[3] = var18;
                    float[][] var213 = var9[var130];
                    float[] var235 = new float[]{var13, var173, 0.0F};
                    var13 = -var15;
                    var235[2] = var13;
                    var213[4] = var235;
                    float[][] var152 = var9[var130];
                    var14 = new float[3];
                    float[] var214 = var2[var130];
                    var16 = var214[0];
                    var14[0] = var16;
                    float[] var216 = var2[var130];
                    var16 = var216[1];
                    var14[1] = var16;
                    var15 = -var15;
                    var14[2] = var15;
                    var152[5] = var14;
                    float[] var153 = new float[7];
                    var153[0] = 0.0F;
                    float var175 = this.yP;
                    var153[1] = var175;
                    var153[2] = 1.0F;
                    var153[3] = 1.0F;
                    float var176 = this.yP;
                    var153[4] = var176;
                    var153[5] = 0.0F;
                    var153[6] = 0.0F;
                    float[] var154 = var153;
                    byte var177 = 0;
                    int var178 = var177;
                    var49 += -1919495367;
                    var49 >>= 10;
                    var49 ^= 1150796712;

                    while (var178 < 7) {
                        var49 += -990133925;
                        var49 ^= 395288273;
                        float[][] var201 = var10[var130];
                        var16 = var154[var178];
                        float[] var219 = jM.V(var12, var16);
                        var201[var178] = var219;
                        int var202 = var178 + 1;
                        long var220 = var7;
                        long var240 = var220 + 1L;
                        long var241 = var220 * var240;
                        long var221 = var241 & 1L;
                        long var261;
                        int var222 = (var261 = var221 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                        if (var222 != 0) {
                            switch (var49) {
                                case -1746712776:
                                    var49 >>= 28;
                                    var49 *= 2021798741;
                                    var49 += -1024771946;
                                    var49 |= -806744790;
                                    var49 ^= -883421649;
                                    break label156;
                                case -358211798:
                                    var49 ^= -1366859653;
                                    break label156;
                                case 919184931:
                                default:
                                    var49 ^= 2105240986;
                                    break label156;
                            }
                        }

                        var49 ^= 1713682607;
                        var49 |= -1804402860;
                        var49 ^= 1783382894;
                        var178 = var202;
                        var49 |= -1536033071;
                        var49 |= -273974532;
                        var49 += -237155649;
                        var49 ^= 1252544818;
                    }

                    var49 ^= 1707713804;
                    var49 ^= -1744951058;
                    int var136 = var130 + 1;
                    int var155 = var7 + 1;
                    int var156 = var7 * var155;
                    int var179 = var7 + 2;
                    int var157 = var156 * var179;
                    int var180 = var7 + 3;
                    int var158 = var157 * var180;
                    int var159 = var158 & 7;
                    if (var159 != 0) {
                        switch (var49) {
                            case 210982961:
                                var49 ^= 522899052;
                                break label156;
                            case 1229362540:
                                var49 ^= -74575595;
                                var49 -= -1611404055;
                                var49 ^= 645350612;
                                break label156;
                            case 1486003894:
                            default:
                                var49 ^= 120284855;
                                break label156;
                        }
                    }
                    var49 = switch (var49) {
                        default -> var49 ^ 65302286;
                        case -228070676 -> var49 ^ 89021103;
                        case 1229362540 -> {
                            var49 += -662100933;
                            var49 ^= 295429935;
                            var49 *= -1802584143;
                            var49 *= -1930530065;
                            yield var49 ^ -1239615398;
                        }
                    };
                    long var160 = var49;
                    long var203 = var160 + 1L;
                    long var204 = var160 * var203;
                    long var161 = var204 & 1L;
                    long var262;
                    int var162 = (var262 = var161 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                    if (var162 != 0) {
                        break label159;
                    }

                    var130 = var136;
                    var49 ^= -460337742;
                    var49 *= -724840391;
                    var49 &= 2699915;
                    var49 ^= -307900529;
                }
            } else {
                var49 = var5 ^ -1328100360;
                var49 &= 1455944723;
                var49 -= 1017131314;
                var49 ^= 780296603;
            }

            long var107 = var49;
            long var120 = var107 + 1L;
            long var121 = var107 * var120;
            long var108 = var121 & 1L;
            long var263;
            var49 = (var263 = var108 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
            if (var49 == 0) {
                RuntimeException var111 = new RuntimeException();
                throw var111;
            }
        }

        RuntimeException var110 = new RuntimeException();
        throw var110;
    }

    private static void HY(
        dx_2 var0, float[][] var1, float[][] var2, float[] var3, float[] var4, float var5, int var6, e_2 var7, boolean var8, boolean var9, int var10
    ) {
        label329: {
            int var12 = var6;
            int var13 = System.identityHashCode(var0);
            int var14 = var1.length;
            int var237 = var14;
            float[][][] var15 = new float[var14][var6][];
            var15 = var15;
            long var16 = var13;
            long var18 = var16 + 1L;
            var18 = var16 * var18;
            var16 = var18 & 1L;
            long var508;
            int var244 = (var508 = var16 - 0L) == 0L ? 0 : (var508 < 0L ? -1 : 1);
            if (var244 == 0) {
                int var11 = var10 + -1924238391;
                var11 ^= 313411743;
                var16 = var6;
                var18 = var16 + 1L;
                var18 = var16 * var18;
                var16 = var18 & 1L;
                long var509;
                int var247 = (var509 = var16 - 0L) == 0L ? 0 : (var509 < 0L ? -1 : 1);
                if (var247 != 0) {
                    break label329;
                }

                int var248 = var6 + 1;
                float[][][] var249 = new float[var14][var248][];
                float[][][] var250 = var249;
                int var17 = 0;
                var17 = var17;
                var11 += -1274148859;
                var11 ^= -1899298997;

                label326:
                while (true) {
                    if (var17 >= var237) {
                        var11 = switch (var11) {
                            case -801403250 -> var11 ^ 2078647975;
                            case 73986565 -> {
                                var11 &= -1732397974;
                                var11 &= 1003989189;
                                yield var11 ^ 118299437;
                            }
                            default -> var11 ^ 1552225356;
                        };
                        var0.tD(var15, var250, true, true, var7);
                        e_2 var254 = e_2.GRIP;
                        Integer var271 = var13;
                        if (var271 != null) {
                            var11 += 183645305;
                            var11 -= 743608722;
                            var11 *= -203849143;
                            var11 ^= -276369799;
                            Integer var272 = var12;
                            if (var272 == null) {
                                break label329;
                            }

                            float[] var261;
                            if (var7 == var254) {
                                var11 &= 1150957159;
                                var11 ^= -1914615354;
                                var11 ^= 186965903;
                                var11 ^= -1352338999;
                                var17 = var12 + 1;
                                var17 = var12 * var17;
                                int var273 = var12 + 2;
                                var17 *= var273;
                                int var274 = var12 + 3;
                                var17 *= var274;
                                var17 &= 7;
                                if (var17 != 0) {
                                    break label329;
                                }

                                float[] var260 = jM.qk(0.0F, 0.5F);
                                int var275 = var13 + 1;
                                int var276 = var13 * var275;
                                int var323 = var13 + 2;
                                int var277 = var276 * var323;
                                var323 = var13 + 3;
                                int var278 = var277 * var323;
                                int var279 = var278 & 7;
                                if (var279 != 0) {
                                    var11 ^= -1051521340;
                                    var11 &= 662962864;
                                    var11 &= -1603950113;
                                    var11 += 493585212;
                                    var11 ^= 1333300298;
                                    break;
                                }

                                var11 |= -1585411822;
                                var11 &= 1871305869;
                                var11 *= -1924120353;
                                var11 ^= 1872334153;
                                var11 ^= 1172157314;
                                int var280 = var12 + 1;
                                int var281 = var12 * var280;
                                var323 = var12 + 2;
                                int var282 = var281 * var323;
                                var323 = var12 + 3;
                                int var283 = var282 * var323;
                                int var284 = var283 & 7;
                                if (var284 != 0) {
                                    break label329;
                                }

                                var261 = var260;
                                switch (var11) {
                                    case -139342167:
                                    default:
                                        var11 ^= -1399471516;
                                        break;
                                    case 212388941:
                                        var11 ^= -951835009;
                                        break;
                                    case 562095376:
                                        var11 ^= -763836375;
                                        var11 ^= -1324992322;
                                }
                            } else {
                                var11 -= -1043101894;
                                var11 *= -2145145437;
                                var11 *= 533943371;
                                var11 ^= -1691805553;
                                int var285 = var12 + 1;
                                int var286 = var12 * var285;
                                int var327 = var12 + 2;
                                int var287 = var286 * var327;
                                var327 = var12 + 3;
                                int var288 = var287 * var327;
                                int var289 = var288 & 7;
                                if (var289 != 0) {
                                    break label329;
                                }

                                float[] var290 = jM.Qm(0.0F, 0.5F);
                                long var329 = var13;
                                long var399 = var329 + 1L;
                                var399 = var329 * var399;
                                long var330 = var399 & 1L;
                                long var510;
                                var327 = (var510 = var330 - 0L) == 0L ? 0 : (var510 < 0L ? -1 : 1);
                                if (var327 != 0) {
                                    var11 *= -860061989;
                                    var11 |= 692691118;
                                    var11 ^= -813894712;
                                    break;
                                }

                                var11 ^= -901348252;
                                var11 ^= -1737210572;
                                long var332 = var12;
                                var399 = var332 + 1L;
                                var399 = var332 * var399;
                                long var454 = var332 + 2L;
                                var399 *= var454;
                                long var333 = var332 + 3L;
                                var399 *= var333;
                                long var334 = var399 & 7L;
                                long var511;
                                var327 = (var511 = var334 - 0L) == 0L ? 0 : (var511 < 0L ? -1 : 1);
                                if (var327 != 0) {
                                    break label329;
                                }

                                var261 = var290;
                                var11 &= 1692049781;
                                var11 ^= 1656534147;
                            }

                            var18 = var12;
                            long var348 = var18 + 1L;
                            var348 = var18 * var348;
                            var18 = var348 & 1L;
                            long var512;
                            int var293 = (var512 = var18 - 0L) == 0L ? 0 : (var512 < 0L ? -1 : 1);
                            if (var293 != 0) {
                                break label329;
                            }

                            int var294 = var13 + 1;
                            int var295 = var13 * var294;
                            int var296 = var295 & 1;
                            if (var296 != 0) {
                                var11 -= -666790820;
                                var11 ^= 414158429;
                            } else {
                                var11 = switch (var11) {
                                    case 1123947911 -> {
                                        var11 |= 1083796010;
                                        var11 |= 758421128;
                                        var11 *= -416274615;
                                        var11 -= 1412594738;
                                        yield var11 ^ -738482254;
                                    }
                                    default -> var11 ^ 12325183;
                                    case 1867985245 -> var11 ^ 1727459742;
                                };
                                if (var8) {
                                    var11 += -1335517410;
                                    var11 ^= 121166926;
                                    var11 ^= -1006651952;
                                    Integer var297 = var12;
                                    if (var297 == null) {
                                        break label329;
                                    }

                                    float[][] var298 = var15[0];
                                    float[][] var336 = var250[0];
                                    int var350 = var11 << 9;
                                    int var351 = var350 & -929563764;
                                    int var352 = var351 ^ -2029623124;
                                    var336 = ax(var336, var6, var352);
                                    float[][] var353 = var15[1];
                                    float[] var354 = KK.ev(var353);
                                    Integer var405 = var13;
                                    if (var405 == null) {
                                        switch (var11) {
                                            case -1880476461:
                                            default:
                                                var11 ^= 1492430315;
                                                break label326;
                                            case -1843971909:
                                                var11 ^= -591665330;
                                                var11 &= 231691407;
                                                var11 *= 1323965747;
                                                var11 ^= 1594550281;
                                                break label326;
                                            case 1587551105:
                                                var11 ^= -262966099;
                                                break label326;
                                        }
                                    }

                                    var11 >>>= 10;
                                    var11 |= -929061389;
                                    var11 += 1216041212;
                                    var11 ^= 654276042;
                                    long var406 = var12;
                                    long var455 = var406 + 1L;
                                    var455 = var406 * var455;
                                    long var407 = var455 & 1L;
                                    long var513;
                                    int var408 = (var513 = var407 - 0L) == 0L ? 0 : (var513 < 0L ? -1 : 1);
                                    if (var408 != 0) {
                                        break label329;
                                    }

                                    var0.M(var298, var336, var261, var354, var7);
                                    var11 &= 279663247;
                                    var11 >>= 20;
                                    var11 |= -1441328103;
                                    var11 &= -1332423984;
                                    var11 ^= -945399824;
                                } else {
                                    var11 |= 508483421;
                                    var11 &= -1312838148;
                                    var11 += 1543300541;
                                    var11 -= 400869698;
                                    var11 ^= -1812691401;
                                }

                                var18 = var12;
                                var348 = var18 + 1L;
                                var348 = var18 * var348;
                                var18 = var348 & 1L;
                                long var514;
                                int var301 = (var514 = var18 - 0L) == 0L ? 0 : (var514 < 0L ? -1 : 1);
                                if (var301 != 0) {
                                    break label329;
                                }

                                if (!var9) {
                                    var11 *= -250470029;
                                    var11 ^= -855428643;
                                    return;
                                }

                                var11 -= 398613490;
                                var11 ^= 1285842588;
                                var18 = var12;
                                var348 = var18 + 1L;
                                var348 = var18 * var348;
                                long var433 = var18 + 2L;
                                var348 *= var433;
                                var18 += 3L;
                                var348 *= var18;
                                var18 = var348 & 7L;
                                long var515;
                                int var305 = (var515 = var18 - 0L) == 0L ? 0 : (var515 < 0L ? -1 : 1);
                                if (var305 != 0) {
                                    break label329;
                                }

                                int var306 = var237 - 1;
                                Integer var230 = var13;
                                if (var230 != null) {
                                    var11 -= -712591679;
                                    var11 &= 1433257713;
                                    var11 ^= 183446878;
                                    var11 -= -1499568343;
                                    var11 ^= 1016857003;
                                    long var338 = var12;
                                    long var409 = var338 + 1L;
                                    var409 = var338 * var409;
                                    var338 = var409 & 1L;
                                    long var516;
                                    int var231 = (var516 = var338 - 0L) == 0L ? 0 : (var516 < 0L ? -1 : 1);
                                    if (var231 != 0) {
                                        break label329;
                                    }

                                    float[][] var232 = var15[var306];
                                    int var307 = var237 - 1;
                                    float[][] var251 = var250[var307];
                                    int var308 = var11 - 302154269;
                                    int var309 = var308 ^ -862447108;
                                    float[][] var252 = ax(var251, var6, var309);
                                    var14 = var237 - 2;
                                    float[][] var239 = var15[var14];
                                    float[] var240 = KK.ev(var239);
                                    var0.M(var232, var252, var261, var240, var7);
                                    switch (var11) {
                                        case -1751597716:
                                        default:
                                            var11 ^= 1955890707;
                                            return;
                                        case 1066713151:
                                            var11 ^= -2000596976;
                                            return;
                                        case 1435600237:
                                            var11 += 1169813805;
                                            var11 -= -895977020;
                                            var11 -= 1931670659;
                                            var11 >>>= 8;
                                            var11 ^= -1287354251;
                                            return;
                                    }
                                }

                                switch (var11) {
                                    case -46089465:
                                        var11 ^= -770899010;
                                        break label326;
                                    case 55283058:
                                        var11 -= 967114169;
                                        var11 ^= -1145732913;
                                        break label326;
                                    case 1217686032:
                                    default:
                                        var11 ^= 554901455;
                                }
                            }
                        } else {
                            var11 *= -359648173;
                            var11 -= 432475160;
                            var11 ^= 387106825;
                        }
                        break;
                    }

                    var11 -= -821629553;
                    var11 ^= 675243101;
                    float[] var265 = var2[var17];
                    float var266 = var265[0];
                    float[] var19 = var2[var17];
                    float var310 = var19[1];
                    float var20 = var266 * var266;
                    float var21 = var310 * var310;
                    var20 += var21;
                    double var341 = var20;
                    double var342 = Math.sqrt(var341);
                    var20 = (float)var342;
                    float var311 = -var310;
                    Integer var361 = var13;
                    if (var361 == null) {
                        var11 &= 1405131405;
                        var11 -= 1957574996;
                        var11 ^= -293418557;
                        break;
                    }

                    var11 &= -1411720075;
                    var11 -= -356803194;
                    var11 ^= -1962164977;
                    Integer var362 = var12;
                    if (var362 == null) {
                        break label329;
                    }

                    float var312 = var311 / var20;
                    float var313 = var312;
                    float var267 = var266 / var20;
                    float var268 = var267;
                    byte var344 = 0;
                    int var345 = var344;

                    var11 = switch (var11) {
                        case -1785258092 -> {
                            var11 ^= 127809037;
                            var11 |= 313377311;
                            var11 -= 761273583;
                            var11 *= -1680520337;
                            yield var11 ^ 1511894396;
                        }
                        case -43524054 -> var11 ^ -146667174;
                        default -> var11 ^ 604819580;
                    };

                    while (true) {
                        int var363 = var12 + 1;
                        int var364 = var12 * var363;
                        int var365 = var364 & 1;
                        if (var365 != 0) {
                            break label329;
                        }

                        if (var345 > var6) {
                            var11 &= 917177921;
                            var11 >>>= 5;
                            var11 ^= -1283025048;
                            Integer var269 = var12;
                            if (var269 == null) {
                                break label329;
                            }

                            int var270 = var17 + 1;
                            long var314 = var13;
                            long var395 = var314 + 1L;
                            long var396 = var314 * var395;
                            long var453 = var314 + 2L;
                            long var397 = var396 * var453;
                            long var315 = var314 + 3L;
                            long var398 = var397 * var315;
                            long var316 = var398 & 7L;
                            long var525;
                            int var317 = (var525 = var316 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                            if (var317 != 0) {
                                switch (var11) {
                                    case -1290563720:
                                        var11 &= 706174001;
                                        var11 += 1618429000;
                                        var11 |= -37759407;
                                        var11 ^= -1918052081;
                                        break label326;
                                    case -776383562:
                                        var11 ^= 1111969254;
                                        break label326;
                                    case 1834020997:
                                    default:
                                        var11 ^= -1326421592;
                                        break label326;
                                }
                            }
                            var11 = switch (var11) {
                                case -1290563720 -> {
                                    var11 *= 1758433261;
                                    var11 -= -2131797223;
                                    yield var11 ^ 85762259;
                                }
                                default -> var11 ^ -1880809714;
                                case 800133251 -> var11 ^ 1385851249;
                            };
                            int var318 = var12 + 1;
                            int var319 = var12 * var318;
                            int var346 = var12 + 2;
                            int var320 = var319 * var346;
                            int var347 = var12 + 3;
                            int var321 = var320 * var347;
                            int var322 = var321 & 7;
                            if (var322 != 0) {
                                break label329;
                            }

                            var17 = var270;
                            var11 >>= 15;
                            var11 ^= 1487190665;
                            var11 <<= 19;
                            var11 &= 2083023658;
                            var11 ^= 1953034757;
                            break;
                        }

                        var11 -= 480781818;
                        var11 >>>= 21;
                        var11 *= -1002652473;
                        var11 ^= -1967248691;
                        int var366 = var12 + 1;
                        int var367 = var12 * var366;
                        int var368 = var367 & 1;
                        if (var368 != 0) {
                            break label329;
                        }

                        var21 = var345;
                        var21 = (float) (Math.PI * 2) * var21;
                        float var22 = var6;
                        var21 /= var22;
                        double var411 = var21;
                        double var412 = Math.cos(var411);
                        var22 = (float)var412;
                        double var23 = var21;
                        var23 = Math.sin(var23);
                        int var372 = var13 + 1;
                        int var373 = var13 * var372;
                        int var374 = var373 & 1;
                        if (var374 != 0) {
                            var11 |= -1698497093;
                            var11 >>= 18;
                            var11 *= -914444869;
                            var11 |= 787266566;
                            var11 ^= -856706728;
                            break label326;
                        }

                        var11 ^= -1747804646;
                        var11 <<= 16;
                        var11 += 1638038660;
                        var11 -= -1655932554;
                        var11 ^= 1088244349;
                        int var375 = var12 + 1;
                        int var376 = var12 * var375;
                        int var377 = var376 & 1;
                        if (var377 != 0) {
                            break label329;
                        }

                        var21 = (float)var23;
                        float var435 = Math.signum(var22);
                        var22 = Math.abs(var22);
                        double var24 = var22;
                        var22 = 2.0F / var5;
                        double var26 = var22;
                        var24 = Math.pow(var24, var26);
                        var22 = (float)var24;
                        var22 = var435 * var22;
                        float var436 = Math.signum(var21);
                        var21 = Math.abs(var21);
                        var24 = var21;
                        var21 = 2.0F / var5;
                        var26 = var21;
                        var24 = Math.pow(var24, var26);
                        var21 = (float)var24;
                        var21 = var436 * var21;
                        if (var345 < var6) {
                            var11 &= 304418626;
                            var11 ^= -125856282;
                            var11 ^= 1423749615;
                            int var437 = var12 + 1;
                            int var438 = var12 * var437;
                            int var460 = var12 + 2;
                            int var439 = var438 * var460;
                            int var461 = var12 + 3;
                            int var440 = var439 * var461;
                            int var441 = var440 & 7;
                            if (var441 != 0) {
                                break label329;
                            }

                            float[][] var442 = var15[var17];
                            float[] var462 = new float[3];
                            float[] var25 = var1[var17];
                            float var468 = var25[0];
                            float var490 = var3[var17];
                            float var491 = var313 * var490;
                            float var492 = var491 * var22;
                            float var469 = var468 + var492;
                            var462[0] = var469;
                            var25 = var1[var17];
                            float var471 = var25[1];
                            float var493 = var3[var17];
                            float var494 = var268 * var493;
                            var22 = var494 * var22;
                            int var495 = var13 + 1;
                            int var496 = var13 * var495;
                            int var497 = var496 & 1;
                            if (var497 != 0) {
                                var11 -= -2139089758;
                                var11 ^= 452444680;
                                var11 *= 1805253005;
                                var11 ^= 5901531;
                                break label326;
                            }

                            var11 <<= 8;
                            var11 ^= -1417899740;
                            long var498 = var12;
                            long var28 = var498 + 1L;
                            var28 = var498 * var28;
                            long var499 = var28 & 1L;
                            long var517;
                            int var500 = (var517 = var499 - 0L) == 0L ? 0 : (var517 < 0L ? -1 : 1);
                            if (var500 != 0) {
                                break label329;
                            }

                            var22 = var471 + var22;
                            var462[1] = var22;
                            var22 = var4[var17];
                            var21 = var22 * var21;
                            var462[2] = var21;
                            var442[var345] = var462;
                            var11 *= -1804382549;
                            var11 ^= -1201090587;
                            var11 += 1881068725;
                            var11 ^= -1030662758;
                        } else {
                            var11 *= 700624837;
                            var11 -= 1832210784;
                            var11 -= -1823921977;
                            var11 |= -1244999835;
                            var11 ^= 1732086905;
                        }

                        long var384 = var12;
                        long var443 = var384 + 1L;
                        long var444 = var384 * var443;
                        long var385 = var444 & 1L;
                        long var518;
                        int var386 = (var518 = var385 - 0L) == 0L ? 0 : (var518 < 0L ? -1 : 1);
                        if (var386 != 0) {
                            break label329;
                        }

                        var21 = var17;
                        var22 = var237;
                        int var445 = var13 + 1;
                        int var446 = var13 * var445;
                        int var447 = var446 & 1;
                        if (var447 != 0) {
                            var11 ^= -1008958064;
                            var11 ^= 1107425624;
                            var11 ^= 1629032634;
                            break label326;
                        }

                        var11 >>>= 24;
                        var11 ^= -1979365888;
                        long var448 = var12;
                        long var472 = var448 + 1L;
                        var472 = var448 * var472;
                        long var449 = var472 & 1L;
                        long var519;
                        int var450 = (var519 = var449 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                        if (var450 != 0) {
                            break label329;
                        }

                        var22--;
                        var21 /= var22;
                        var22 = var345;
                        float var451 = var6;
                        var22 /= var451;
                        float[][] var452 = var250[var17];
                        e_2 var463 = e_2.GRIP;
                        float[] var465;
                        if (var7 == var463) {
                            var11 += -1257500752;
                            var11 |= 2039936298;
                            var11 += 1790550048;
                            var11 -= -1296514860;
                            var11 ^= -1911897973;
                            float[] var464 = jM.qk(var21, var22);
                            var472 = var13;
                            long var27 = var472 + 1L;
                            var27 = var472 * var27;
                            var472 = var27 & 1L;
                            long var520;
                            int var476 = (var520 = var472 - 0L) == 0L ? 0 : (var520 < 0L ? -1 : 1);
                            if (var476 != 0) {
                                switch (var11) {
                                    case -1181608387:
                                        var11 |= 622261566;
                                        var11 ^= -247842070;
                                        var11 &= 1371062086;
                                        var11 |= -1681431367;
                                        var11 ^= -1443044725;
                                        break label326;
                                    case 23338819:
                                        var11 ^= 2088066214;
                                        break label326;
                                    case 1103208687:
                                    default:
                                        var11 ^= -544784171;
                                        break label326;
                                }
                            }

                            var11 *= 673896371;
                            var11 ^= -632647647;
                            var11 ^= -959041623;
                            int var477 = var12 + 1;
                            int var478 = var12 * var477;
                            int var479 = var478 & 1;
                            if (var479 != 0) {
                                break label329;
                            }

                            var465 = var464;
                            var11 += 2082326653;
                            var11 ^= -170625662;
                        } else {
                            var11 |= 322442962;
                            var11 |= -225574578;
                            var11 ^= 605682443;
                            var472 = var12;
                            long var502 = var472 + 1L;
                            var502 = var472 * var502;
                            var472 = var502 & 1L;
                            long var521;
                            int var482 = (var521 = var472 - 0L) == 0L ? 0 : (var521 < 0L ? -1 : 1);
                            if (var482 != 0) {
                                break label329;
                            }

                            float[] var389 = jM.Qm(var21, var22);
                            int var425 = var13 + 1;
                            int var426 = var13 * var425;
                            int var427 = var426 & 1;
                            if (var427 != 0) {
                                var11 -= -105413354;
                                var11 *= -460777267;
                                var11 -= -26700355;
                                var11 ^= -1659360960;
                                break label326;
                            }

                            var11 |= -463022320;
                            var11 ^= -807143751;
                            var472 = var12;
                            var502 = var472 + 1L;
                            var502 = var472 * var502;
                            var472 = var502 & 1L;
                            long var522;
                            int var428 = (var522 = var472 - 0L) == 0L ? 0 : (var522 < 0L ? -1 : 1);
                            if (var428 != 0) {
                                break label329;
                            }

                            var465 = var389;
                            switch (var11) {
                                case -682194177:
                                    var11 ^= -1484661240;
                                    break;
                                case 9703718:
                                default:
                                    var11 ^= 393656151;
                                    break;
                                case 805636460:
                                    var11 &= -1455664667;
                                    var11 |= 184869119;
                                    var11 &= -1458123900;
                                    var11 ^= 599192746;
                            }
                        }

                        long var390 = var12;
                        var472 = var390 + 1L;
                        var472 = var390 * var472;
                        long var506 = var390 + 2L;
                        var472 *= var506;
                        long var391 = var390 + 3L;
                        var472 *= var391;
                        long var392 = var472 & 7L;
                        long var523;
                        int var393 = (var523 = var392 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                        if (var393 != 0) {
                            break label329;
                        }

                        var452[var345] = var465;
                        int var394 = var345 + 1;
                        Integer var429 = var13;
                        if (var429 == null) {
                            var11 >>>= 29;
                            var11 -= 83048041;
                            var11 ^= -1994406175;
                            break label326;
                        }
                        var11 = switch (var11) {
                            case -679600051 -> var11 ^ -1870359089;
                            case 179451182 -> {
                                var11 *= 727521917;
                                yield var11 ^ 91815377;
                            }
                            default -> var11 ^ -402173960;
                        };
                        long var430 = var12;
                        long var466 = var430 + 1L;
                        long var467 = var430 * var466;
                        long var431 = var467 & 1L;
                        long var524;
                        int var432 = (var524 = var431 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                        if (var432 != 0) {
                            break label329;
                        }

                        var345 = var394;
                        var11 ^= 33939070;
                        var11 ^= 1140458485;
                    }
                }
            } else {
                switch (var10) {
                    case 106683794:
                        int var223 = var10 ^ 2122333617;
                        break;
                    case 438173658:
                    default:
                        int var222 = var10 ^ 755058443;
                        break;
                    case 921426445:
                        int var218 = var10 & 1756423212;
                        var218 |= -111213154;
                        var218 *= 1218539309;
                        var218 ^= -485477968;
                }
            }

            long var224 = var12;
            long var233 = var224 + 1L;
            long var234 = var224 * var233;
            long var242 = var224 + 2L;
            long var235 = var234 * var242;
            var224 += 3L;
            long var236 = var235 * var224;
            var224 = var236 & 7L;
            long var526;
            int var227 = (var526 = var224 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
            if (var227 == 0) {
                RuntimeException var229 = new RuntimeException();
                throw var229;
            }
        }

        AssertionError var228 = new AssertionError();
        throw var228;
    }

    private static float[][] ax(float[][] var0, int var1, int var2) {
        int var4 = System.identityHashCode(var0);
        float[][] var5 = new float[var1][];
        Integer var17 = var4;
        if (var17 == null) {
            int var12 = var2 >>> 24;
            var12 += -1661059374;
            var12 &= 258026767;
            var12 ^= 408652713;
            var12 ^= 1024391765;
            IllegalArgumentException var18 = new IllegalArgumentException();
            throw var18;
        } else {
            switch (var2) {
                case -1894311252:
                    int var7 = var2 - 1771006725;
                    var7 *= -621106285;
                    var7 &= -495994102;
                    var7 |= -1976124733;
                    var7 ^= 213431902;
                    break;
                case 473551124:
                    int var6 = var2 ^ -2078191267;
                    break;
                case 1752097250:
                default:
                    int var3 = var2 ^ -1298318210;
            }

            System.arraycopy(var0, 0, var5, 0, var1);
            return var5;
        }
    }

    private static void op(dx_2 var0, float var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8) {
        label140: {
            int var10 = var6;
            int var11 = System.identityHashCode(var0);
            int var12 = var6 + 1;
            float[][][] var113 = new float[var12][var7][];
            float[][][] var114 = var113;
            int var13 = var6 + 1;
            int var14 = var7 + 1;
            float[][][] var115 = new float[var13][var14][];
            float[][][] var116 = var115;
            long var117 = var11;
            long var16 = var117 + 1L;
            var16 = var117 * var16;
            long var118 = var16 & 1L;
            long var224;
            var14 = (var224 = var118 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
            if (var14 == 0) {
                int var9 = var8 & 748994636;
                var9 -= -1603750325;
                var9 ^= -1010077445;
                var14 = var6 + 1;
                var14 = var6 * var14;
                int var15 = var6 + 2;
                var14 *= var15;
                var15 = var6 + 3;
                var14 *= var15;
                var14 &= 7;
                if (var14 != 0) {
                    break label140;
                }

                int var125 = 0;
                var125 = var125;
                var9 += 1642397647;
                var9 ^= -1666286057;

                label137:
                while (true) {
                    if (var125 > var6) {
                        var9 &= 1830822545;
                        var9 ^= 1723142606;
                        var125 = var10 + 1;
                        var125 = var10 * var125;
                        var15 = var10 + 2;
                        var125 *= var15;
                        var15 = var10 + 3;
                        var125 *= var15;
                        var125 &= 7;
                        if (var125 != 0) {
                            break label140;
                        }

                        e_2 var132 = e_2.METAL;
                        var15 = var11 + 1;
                        var15 = var11 * var15;
                        int var156 = var11 + 2;
                        var15 *= var156;
                        var11 += 3;
                        var15 *= var11;
                        var11 = var15 & 7;
                        if (var11 == 0) {
                            var9 -= 374549220;
                            var9 <<= 18;
                            var9 ^= -2090011395;
                            var11 = var10 + 1;
                            var11 = var10 * var11;
                            var15 = var10 + 2;
                            var11 *= var15;
                            var15 = var10 + 3;
                            var11 *= var15;
                            var11 &= 7;
                            if (var11 == 0) {
                                var0.tD(var114, var116, true, true, var132);
                                return;
                            }
                            break label140;
                        }

                        var9 |= 1004953761;
                        var9 ^= -1271832975;
                        var9 *= -1569968469;
                        var9 -= -435091237;
                        var9 ^= -1165133622;
                        break;
                    }

                    var9 <<= 9;
                    var9 ^= 1891408032;
                    Integer var134 = var10;
                    if (var134 == null) {
                        break label140;
                    }

                    float var135 = var125;
                    float var136 = (float) (Math.PI * 2) * var135;
                    float var150 = var6;
                    float var137 = var136 / var150;
                    double var151 = var137;
                    double var152 = Math.cos(var151);
                    float var153 = (float)var152;
                    float var154 = var153;
                    double var17 = var137;
                    var17 = Math.sin(var17);
                    float var138 = (float)var17;
                    float var139 = var138;
                    byte var158 = 0;
                    long var18 = var11;
                    long var20 = var18 + 1L;
                    var20 = var18 * var20;
                    var18 = var20 & 1L;
                    long var225;
                    int var161 = (var225 = var18 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                    if (var161 != 0) {
                        var9 <<= 18;
                        var9 *= 156417793;
                        var9 ^= -769348763;
                        break;
                    }

                    var9 &= -2037298065;
                    var9 ^= -1183024720;
                    int var159 = var158;
                    var9 ^= -444498079;
                    var9 *= 1577045143;
                    var9 ^= 546737846;

                    while (true) {
                        int var162 = var10 + 1;
                        int var163 = var10 * var162;
                        int var164 = var163 & 1;
                        if (var164 != 0) {
                            break label140;
                        }

                        if (var159 > var7) {
                            var9 &= -755829891;
                            var9 |= -652582535;
                            var9 ^= -75936304;
                            int var140 = var125 + 1;
                            Integer var155 = var11;
                            if (var155 == null) {
                                var9 &= -684710115;
                                var9 |= -1050873430;
                                var9 -= 693809253;
                                var9 |= -1843300617;
                                var9 ^= -1702372206;
                                break label137;
                            }

                            var9 |= -642317054;
                            var9 ^= 152520951;
                            var125 = var140;
                            var9 *= -1781651559;
                            var9 |= 601633088;
                            var9 ^= -1131952044;
                            var9 ^= 2105587374;
                            break;
                        }
                        var9 = switch (var9) {
                            default -> var9 ^ 722812788;
                            case -353978057 -> var9 ^ -549492478;
                            case 254101137 -> {
                                var9 &= 762472528;
                                var9 &= 419085797;
                                var9 -= 595813048;
                                yield var9 ^ 1991705737;
                            }
                        };
                        int var165 = var10 + 1;
                        int var166 = var10 * var165;
                        int var167 = var166 & 1;
                        if (var167 != 0) {
                            break label140;
                        }

                        float var168 = var159;
                        float var169 = (float) (Math.PI * 2) * var168;
                        float var19 = var7;
                        float var170 = var169 / var19;
                        double var181 = var170;
                        double var182 = Math.cos(var181);
                        Integer var21 = var11;
                        if (var21 == null) {
                            var9 -= 1653573565;
                            var9 |= -1562721807;
                            var9 -= 323513685;
                            var9 ^= -1674392123;
                            break label137;
                        }

                        var9 <<= 8;
                        var9 *= 2060529405;
                        var9 -= 831071093;
                        var9 ^= -881473200;
                        var19 = (float)var182;
                        var19 = var4 * var19;
                        var19 = var3 + var19;
                        if (var159 < var7) {
                            var9 &= -236573404;
                            var9 ^= 1383348635;
                            var9 ^= 49625392;
                            var20 = var10;
                            long var22 = var20 + 1L;
                            var22 = var20 * var22;
                            var20 = var22 & 1L;
                            long var226;
                            int var194 = (var226 = var20 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label140;
                            }

                            float[][] var195 = var114[var125];
                            float[] var208 = new float[3];
                            Integer var211 = var11;
                            if (var211 == null) {
                                var9 *= 75307155;
                                var9 &= 1560722769;
                                var9 |= -447945855;
                                var9 >>= 8;
                                var9 ^= -10885746;
                                break label137;
                            }
                            var9 = switch (var9) {
                                case -2132475733 -> {
                                    var9 += 766600895;
                                    var9 &= -409796111;
                                    yield var9 ^ 1049773215;
                                }
                                default -> var9 ^ -889077183;
                                case 1874181259 -> var9 ^ 1406968051;
                            };
                            var22 = var10;
                            long var24 = var22 + 1L;
                            var24 = var22 * var24;
                            var22 = var24 & 1L;
                            long var227;
                            int var214 = (var227 = var22 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                            if (var214 != 0) {
                                break label140;
                            }

                            float var215 = var154 * var19;
                            float var216 = var1 + var215;
                            var208[0] = var216;
                            var19 = var139 * var19;
                            var19 = var2 + var19;
                            var208[1] = var19;
                            double var171 = var170;
                            double var172 = Math.sin(var171);
                            float var173 = (float)var172;
                            float var174 = var5 * var173;
                            var208[2] = var174;
                            var195[var159] = var208;
                            var9 -= 1990336605;
                            var9 |= 1080336087;
                            var9 ^= 1700690858;
                        } else {
                            switch (var9) {
                                case -2094684324:
                                default:
                                    var9 ^= 44684881;
                                    break;
                                case -1368694143:
                                    var9 ^= -527257447;
                                    break;
                                case -596815653:
                                    var9 &= 1322521303;
                                    var9 ^= 1214567566;
                            }
                        }

                        var18 = var10;
                        var20 = var18 + 1L;
                        var20 = var18 * var20;
                        long var217 = var18 + 2L;
                        var20 *= var217;
                        var18 += 3L;
                        var20 *= var18;
                        var18 = var20 & 7L;
                        long var228;
                        int var178 = (var228 = var18 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                        if (var178 != 0) {
                            break label140;
                        }

                        float[][] var179 = var116[var125];
                        var19 = var125;
                        float var200 = var6;
                        var19 /= var200;
                        float var201 = var159;
                        float var209 = var7;
                        float var202 = var201 / var209;
                        float[] var190 = jM.Qm(var19, var202);
                        var20 = var11;
                        var217 = var20 + 1L;
                        var217 = var20 * var217;
                        long var223 = var20 + 2L;
                        var217 *= var223;
                        var20 += 3L;
                        var217 *= var20;
                        var20 = var217 & 7L;
                        long var229;
                        int var206 = (var229 = var20 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                        if (var206 != 0) {
                            var9 <<= 4;
                            var9 ^= 1118367413;
                            break label137;
                        }
                        var9 = switch (var9) {
                            default -> var9 ^ 1428024682;
                            case -153610159 -> var9 ^ 593275565;
                            case 69256285 -> {
                                var9 ^= -874130239;
                                var9 ^= 765147773;
                                var9 &= 1351027919;
                                yield var9 ^ -1644331826;
                            }
                        };
                        Integer var207 = var10;
                        if (var207 == null) {
                            break label140;
                        }

                        var179[var159] = var190;
                        int var180 = var159 + 1;
                        var159 = var180;
                        var9 &= 2051945302;
                        var9 += 1509848183;
                        var9 &= 1985421618;
                        var9 ^= 1854097460;
                        var9 ^= 1407594133;
                    }
                }
            } else {
                int var100 = var8 >> 1;
                var100 += 2055778509;
                var100 ^= -1917172027;
            }

            Integer var103 = var10;
            if (var103 != null) {
                AssertionError var105 = new AssertionError();
                throw var105;
            }
        }

        IllegalArgumentException var104 = new IllegalArgumentException();
        throw var104;
    }

    private static void tv(dx_2 var0, float var1, float var2, float var3, float var4, int var5, int var6, int var7) {
        label129: {
            int var9 = var5;
            int var10 = System.identityHashCode(var0);
            int var11 = var5 + 1;
            float[][][] var113 = new float[var11][var6][];
            float[][][] var114 = var113;
            int var12 = var5 + 1;
            Integer var13 = var10;
            if (var13 == null) {
                int var8 = var7 & -1395681255;
                var8 += 877538638;
                var8 |= -1364333481;
                var8 ^= 364269573;
            } else {
                int var26 = var7 + -1455480947;
                var26 ^= 1125276798;
                long var117 = var5;
                long var15 = var117 + 1L;
                var15 = var117 * var15;
                long var17 = var117 + 2L;
                var15 *= var17;
                long var118 = var117 + 3L;
                var15 *= var118;
                long var119 = var15 & 7L;
                long var212;
                int var120 = (var212 = var119 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                if (var120 != 0) {
                    break label129;
                }

                var120 = var6 + 1;
                float[][][] var115 = new float[var12][var120][];
                float[][][] var116 = var115;
                int var122 = 0;
                var122 = var122;
                var26 -= -1963489266;
                var26 >>= 24;
                var26 ^= -277063285;

                label126:
                while (true) {
                    if (var122 > var5) {
                        var26 &= 1077763413;
                        var26 *= 2082189779;
                        var26 ^= -1785542872;
                        e_2 var124 = e_2.METAL;
                        Integer var112 = var10;
                        if (var112 != null) {
                            var26 >>>= 31;
                            var26 ^= 1182221503;
                            var26 ^= -1898075641;
                            var0.tD(var114, var116, true, true, var124);
                            return;
                        }

                        var26 &= 2090141522;
                        var26 += -732239264;
                        var26 >>= 11;
                        var26 ^= -79450097;
                        break;
                    }
                    var26 = switch (var26) {
                        case 277063282 -> {
                            var26 &= 894797652;
                            var26 &= 1406326605;
                            var26 &= 1599218633;
                            var26 >>= 10;
                            yield var26 ^ 991906230;
                        }
                        case 1976032155 -> var26 ^ -240135135;
                        default -> var26 ^ -662356878;
                    };
                    float var14 = var122;
                    var14 = (float) (Math.PI * 2) * var14;
                    float var135 = var5;
                    var14 /= var135;
                    double var136 = var14;
                    double var137 = Math.cos(var136);
                    float var138 = (float)var137;
                    long var16 = var10;
                    long var18 = var16 + 1L;
                    var18 = var16 * var18;
                    long var20 = var16 + 2L;
                    var18 *= var20;
                    var16 += 3L;
                    var18 *= var16;
                    var16 = var18 & 7L;
                    long var213;
                    int var148 = (var213 = var16 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                    if (var148 != 0) {
                        switch (var26) {
                            case -1753491569:
                            default:
                                var26 ^= 529249501;
                                break label126;
                            case 991644086:
                                var26 |= 1636012662;
                                var26 >>= 5;
                                var26 ^= -124423251;
                                break label126;
                            case 1847362103:
                                var26 ^= 2099635784;
                                break label126;
                        }
                    }

                    var26 += 465698296;
                    var26 ^= 1645372650;
                    var16 = var9;
                    var18 = var16 + 1L;
                    var18 = var16 * var18;
                    var16 = var18 & 1L;
                    long var214;
                    int var151 = (var214 = var16 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                    if (var151 != 0) {
                        break label129;
                    }

                    float var139 = var138;
                    double var152 = var14;
                    double var153 = Math.sin(var152);
                    var14 = (float)var153;
                    var14 = var14;
                    byte var154 = 0;
                    int var155 = var154;
                    var26 *= 942585843;
                    var26 *= 1095179429;
                    var26 += 759768855;
                    var26 |= 780392679;
                    var26 ^= -1889707400;

                    while (true) {
                        int var158 = var9 + 1;
                        int var159 = var9 * var158;
                        int var160 = var159 & 1;
                        if (var160 != 0) {
                            break label129;
                        }

                        if (var155 > var6) {
                            var26 *= 1535216007;
                            var26 *= -705348559;
                            var26 >>>= 18;
                            var26 ^= -210909237;
                            int var129 = var122 + 1;
                            Integer var140 = var10;
                            if (var140 == null) {
                                var26 += 1609992505;
                                var26 += -986096150;
                                var26 ^= -472640251;
                                break label126;
                            }

                            var26 |= -1446741732;
                            var26 ^= 1012986031;
                            int var141 = var9 + 1;
                            int var142 = var9 * var141;
                            int var156 = var9 + 2;
                            int var143 = var142 * var156;
                            int var157 = var9 + 3;
                            int var144 = var143 * var157;
                            int var145 = var144 & 7;
                            if (var145 != 0) {
                                break label129;
                            }

                            var122 = var129;
                            var26 &= 1803197969;
                            var26 ^= 1401663075;
                            break;
                        }

                        var26 &= -796050389;
                        var26 ^= -1651691525;
                        var26 += -826857651;
                        var26 ^= 905962291;
                        int var161 = var9 + 1;
                        int var162 = var9 * var161;
                        int var163 = var162 & 1;
                        if (var163 != 0) {
                            break label129;
                        }

                        float var164 = var155;
                        Integer var181 = var10;
                        if (var181 == null) {
                            var26 *= -1140992625;
                            var26 += 2082241634;
                            var26 &= 995612551;
                            var26 ^= -787596426;
                            break label126;
                        }
                        var26 = switch (var26) {
                            default -> var26 ^ 1862224227;
                            case -1416787034 -> var26 ^ 2100284198;
                            case 1850192910 -> {
                                var26 ^= -1511848081;
                                var26 |= 611878576;
                                var26 -= -1228450039;
                                yield var26 ^ -634631305;
                            }
                        };
                        Integer var182 = var9;
                        if (var182 == null) {
                            break label129;
                        }

                        float var165 = (float) (Math.PI * 2) * var164;
                        float var183 = var6;
                        float var166 = var165 / var183;
                        double var184 = var166;
                        double var185 = Math.cos(var184);
                        float var186 = (float)var185;
                        float var187 = var4 * var186;
                        float var188 = var3 + var187;
                        if (var155 < var6) {
                            var26 >>>= 5;
                            var26 &= 804665122;
                            var26 |= -797073980;
                            var26 ^= -1306611010;
                            var26 ^= -1845878855;
                            float[][] var19 = var114[var122];
                            int var200 = var10 + 1;
                            int var201 = var10 * var200;
                            int var21 = var10 + 2;
                            int var202 = var201 * var21;
                            var21 = var10 + 3;
                            int var203 = var202 * var21;
                            int var204 = var203 & 7;
                            if (var204 != 0) {
                                var26 ^= 1841162184;
                                var26 ^= 1651341945;
                                break label126;
                            }
                            var26 = switch (var26) {
                                default -> var26 ^ -650124297;
                                case -191287101 -> {
                                    var26 += 1678772900;
                                    var26 ^= -1062932028;
                                    var26 <<= 18;
                                    yield var26 ^ 32400190;
                                }
                                case 438294253 -> var26 ^ -1223178092;
                            };
                            float[] var205 = new float[3];
                            float var208 = var139 * var188;
                            float var209 = var1 + var208;
                            var205[0] = var209;
                            double var210 = var166;
                            double var211 = Math.sin(var210);
                            float var167 = (float)var211;
                            float var168 = var4 * var167;
                            float var169 = var2 + var168;
                            var205[1] = var169;
                            float var170 = var14 * var188;
                            var205[2] = var170;
                            var19[var155] = var205;
                            var26 >>>= 8;
                            var26 ^= -1140870905;
                        } else {
                            var26 ^= -2040409409;
                            var26 <<= 2;
                            var26 -= -564401799;
                            var26 ^= 206776419;
                        }

                        var17 = var9;
                        long var192 = var17 + 1L;
                        var192 = var17 * var192;
                        var17 = var192 & 1L;
                        long var215;
                        int var173 = (var215 = var17 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                        if (var173 != 0) {
                            break label129;
                        }

                        float[][] var174 = var116[var122];
                        float var189 = var122;
                        float var194 = var5;
                        float var190 = var189 / var194;
                        int var195 = var10 + 1;
                        int var196 = var10 * var195;
                        int var197 = var196 & 1;
                        if (var197 != 0) {
                            var26 >>>= 29;
                            var26 ^= -79057545;
                            break label126;
                        }

                        var26 <<= 17;
                        var26 += 1535786877;
                        var26 <<= 11;
                        var26 |= -962712284;
                        var26 ^= 1083430372;
                        float var198 = var155;
                        float var206 = var6;
                        float var199 = var198 / var206;
                        float[] var191 = jM.Qm(var190, var199);
                        var174[var155] = var191;
                        int var175 = var155 + 1;
                        var155 = var175;
                        var26 &= -249147646;
                        var26 ^= 634924377;
                        var26 ^= -1894203731;
                        var26 += 83731015;
                        var26 ^= 1904000692;
                    }
                }
            }

            long var107 = var9;
            long var130 = var107 + 1L;
            var130 = var107 * var130;
            long var108 = var130 & 1L;
            long var216;
            var9 = (var216 = var108 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
            if (var9 == 0) {
                IllegalStateException var110 = new IllegalStateException();
                throw var110;
            }
        }

        RuntimeException var111 = new RuntimeException();
        throw var111;
    }

    private static void mS(dx_2 var0, float var1, float var2, float var3, float var4, float var5, int var6) {
        label79: {
            int var40;
            int var8 = System.identityHashCode(var0);
            float var9 = var1 + var3;
            var9 /= 2.0F;
            var9 = var9;
            float var10 = var3 - var1;
            var10 /= 2.0F;
            var10 = var10;
            byte var11 = 4;
            float[][] var12 = new float[var11][];
            var12 = var12;
            float[][] var13 = new float[var11][];
            var13 = var13;
            float[] var14 = new float[var11];
            var14 = var14;
            int var15 = var8 + 1;
            var15 = var8 * var15;
            var15 &= 1;
            label78:
            if (var15 == 0) {
                var40 = switch (var6) {
                    case -964780334 -> var6 ^ 1546743714;
                    case 979509973 -> {
                        var40 = var6 >>> 5;
                        var40 <<= 26;
                        var40 &= 1273177005;
                        var40 >>>= 29;
                        yield var40 ^ -1020292865;
                    }
                    default -> var6 ^ 691067155;
                };
                Integer var80 = var40;
                if (var80 == null) {
                    break label79;
                }

                float[] var81 = new float[var11];
                float[] var82 = var81;
                int var16 = 0;
                var16 = var16;

                var40 = switch (var40) {
                    case -1020292867 -> {
                        var40 ^= -1274966129;
                        yield var40 ^ -1781292107;
                    }
                    default -> var40 ^ -1337851130;
                    case 1005214329 -> var40 ^ -409291824;
                };

                while (var16 < var11) {
                    var40 = switch (var40) {
                        case -486687545 -> {
                            var40 |= 932019864;
                            yield var40 ^ 1823083146;
                        }
                        default -> var40 ^ -92408577;
                        case 11180111 -> var40 ^ -200360013;
                    };
                    float var17 = var16;
                    float var18 = var11;
                    var18--;
                    var17 /= var18;
                    var18 = var17 * 2.0F;
                    var18 = Math.abs(--var18);
                    double var97 = var18;
                    double var98 = Math.pow(var97, 4.0);
                    var18 = (float)var98;
                    var18 = 0.12F * var18;
                    int var19 = var8 + 1;
                    var19 = var8 * var19;
                    int var20 = var8 + 2;
                    var19 *= var20;
                    var20 = var8 + 3;
                    var19 *= var20;
                    var19 &= 7;
                    if (var19 != 0) {
                        var40 <<= 15;
                        var40 |= -1184494630;
                        var40 ^= -1358823822;
                        break label78;
                    }

                    var40 -= 452286279;
                    var40 *= 559134749;
                    var40 -= -1299543055;
                    var40 ^= 509533699;
                    long var106 = var40;
                    long var21 = var106 + 1L;
                    var21 = var106 * var21;
                    long var107 = var21 & 1L;
                    long var113;
                    var19 = (var113 = var107 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
                    if (var19 != 0) {
                        break label79;
                    }

                    var18 = 1.0F - var18;
                    float[] var109 = new float[]{var9, 0.0F};
                    float var111 = var4 - var2;
                    var17 = var111 * var17;
                    var17 = var2 + var17;
                    var109[1] = var17;
                    var12[var16] = var109;
                    float[] var89 = new float[]{0.0F, 1.0F};
                    var13[var16] = var89;
                    var17 = var10 * var18;
                    var14[var16] = var17;
                    var17 = var5 * var18;
                    var82[var16] = var17;
                    int var92 = var16 + 1;
                    var16 = var92;
                    var40 -= -694134505;
                    var40 ^= 816902027;
                    var40 |= 770513002;
                    var40 ^= 1293051049;
                }

                var40 += 362373426;
                var40 &= -160622537;
                var40 -= -1520691493;
                var40 ^= 981525420;
                Integer var67 = var40;
                if (var67 == null) {
                    break label79;
                }

                e_2 var68 = e_2.METAL;
                int var71 = var8 + 1;
                int var72 = var8 * var71;
                var8 = var72 & 1;
                if (var8 == 0) {
                    var40 -= 1844749401;
                    var40 |= -297711409;
                    var40 <<= 9;
                    var40 -= -886010717;
                    var40 ^= -1328774669;
                    long var73 = var40;
                    long var84 = var73 + 1L;
                    long var85 = var73 * var84;
                    long var74 = var85 & 1L;
                    long var114;
                    var8 = (var114 = var74 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                    if (var8 == 0) {
                        var8 = var40 - -1175618009;
                        var8 &= -1668900760;
                        var8 *= 1184805669;
                        var8 -= 1990358791;
                        var8 ^= -1815608588;
                        HY(var0, var12, var13, var14, var82, 8.0F, 16, var68, true, true, var8);
                        return;
                    }
                    break label79;
                }

                switch (var40) {
                    case -345242661:
                        var40 ^= -107958586;
                        break;
                    case 1613749801:
                    default:
                        var40 ^= 153035563;
                        break;
                    case 1881793274:
                        var40 += 844499455;
                        var40 ^= -1159608237;
                        var40 *= 382795747;
                        var40 ^= -1800360682;
                }
            } else {
                switch (var6) {
                    case -752722608:
                    default:
                        var40 = var6 ^ -1106115322;
                        break;
                    case 979509973:
                        var40 = var6 >> 21;
                        var40 &= -1627763431;
                        var40 ^= 1416590521;
                        break;
                    case 1200851787:
                        var40 = var6 ^ 780908421;
                }
            }

            Integer var55 = var40;
            if (var55 != null) {
                RuntimeException var57 = new RuntimeException();
                throw var57;
            }
        }

        AssertionError var56 = new AssertionError();
        throw var56;
    }

    private static float[] i(float var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        int var9 = (int)var0;
        float var10 = 1.0F - var0;
        float var11 = 1.0F - var0;
        var10 *= var11;
        var11 = 2.0F * var0;
        float var12 = 1.0F - var0;
        var11 *= var12;
        var12 = var0 * var0;
        float[] var13 = new float[2];
        float var14 = var10 * var1;
        float var15 = var11 * var3;
        var14 += var15;
        var15 = var12 * var5;
        var14 += var15;
        var13[0] = var14;
        var10 *= var2;
        var11 *= var4;
        long var42 = var9;
        long var16 = var42 + 1L;
        var16 = var42 * var16;
        long var43 = var16 & 1L;
        long var46;
        var9 = (var46 = var43 - 0L) == 0L ? 0 : (var46 < 0L ? -1 : 1);
        if (var9 != 0) {
            Integer var29 = switch (var7) {
                case 527477745 -> var7 ^ -862892724;
                case 1015547933 -> {
                    int var18 = var7 - -1756185270;
                    var18 <<= 2;
                    var18 -= 1578814220;
                    yield var18 ^ 822691477;
                }
                default -> var7 ^ -2120227594;
            };
            if (var29 != null) {
                AssertionError var30 = new AssertionError();
                throw var30;
            }
        } else {
            int var21 = var7 >> 15;
            var21 += -1244051770;
            var21 ^= 1723571687;
            var9 = var21 + 1;
            var9 = var21 * var9;
            var21 = var9 & 1;
            if (var21 == 0) {
                float var26 = var10 + var11;
                float var33 = var12 * var6;
                float var27 = var26 + var33;
                var13[1] = var27;
                return var13;
            }
        }

        IllegalStateException var25 = new IllegalStateException();
        throw var25;
    }

    private static float[] cs(float var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
        int var9 = (int)var0;
        float[] var10 = new float[2];
        float var11 = 1.0F - var0;
        var11 = 2.0F * var11;
        float var12 = var3 - var1;
        var11 *= var12;
        var12 = 2.0F * var0;
        float var13 = var5 - var3;
        int var14 = var9 + 1;
        var14 = var9 * var14;
        int var15 = var9 + 2;
        var14 *= var15;
        var9 += 3;
        var14 *= var9;
        var9 = var14 & 7;
        if (var9 == 0) {
            Integer var24 = switch (var7) {
                case -1995069732 -> var7 ^ -239626318;
                default -> var7 ^ -1550059218;
                case -539647460 -> {
                    int var18 = var7 | -1131264098;
                    var18 |= 653162583;
                    var18 >>= 18;
                    yield var18 ^ 1126675066;
                }
            };
            if (var24 == null) {
                RuntimeException var31 = new RuntimeException();
                throw var31;
            } else {
                float var25 = var12 * var13;
                float var26 = var11 + var25;
                var10[0] = var26;
                float var27 = 1.0F - var0;
                float var28 = 2.0F * var27;
                var11 = var4 - var2;
                float var29 = var28 * var11;
                var11 = 2.0F * var0;
                var12 = var6 - var4;
                var11 *= var12;
                float var30 = var29 + var11;
                var10[1] = var30;
                return var10;
            }
        } else {
            int var8 = var7 * 1251958407;
            var8 ^= 365442676;
            RuntimeException var17 = new RuntimeException();
            throw var17;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -59965815;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        Hg = var4;
        float[] var8 = new float[]{0.06F, 0.14F, 0.0F, 15.0F, -40.0F, 52.0F, 180.0F, 0.0F};
        float[] var9 = new float[]{0.06F, 0.2F, 0.0F, 5.0F, -17.0F, 50.0F, 180.0F, 0.0F};
    }
}
