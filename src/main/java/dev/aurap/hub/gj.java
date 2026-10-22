package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.PriorityQueue;
import java.util.function.LongSupplier;

public final class gj {
    private final LongSupplier UW;
    private final PriorityQueue n;
    private long BU;
    public static final int R;

    public gj(LongSupplier var1) {
        PriorityQueue var2 = new PriorityQueue();
        this.n = var2;
        this.UW = var1;
    }

    public void Zl(long var1, Runnable var3) {
        int var4 = R;
        var4 ^= -120761093;
        int var5 = System.identityHashCode(this);
        PriorityQueue var6 = this.n;
        int var7 = var5 + 1;
        var7 = var5 * var7;
        int var8 = var5 + 2;
        var7 *= var8;
        var5 += 3;
        var7 *= var5;
        var5 = var7 & 7;
        var7 = of_2.I;
        var4 ^= var7;
        var4 ^= 1186804733;
        of_2.I = 1186804733;
        var7 = of_2.oE;
        var4 ^= var7;
        var4 ^= -512798731;
        of_2.oE = -512798731;
        if (var5 != 0) {
            var4 -= -345564782;
            var4 ^= 1140089062;
            var4 ^= 1194757027;
            var4 <<= 11;
            var4 ^= -1510122799;
            Integer var37 = var4;
            if (var37 != null) {
                UnsupportedOperationException var38 = new UnsupportedOperationException();
                throw var38;
            }
        } else {
            var4 *= -2053188793;
            var4 -= 1688698309;
            var4 *= 582285015;
            var4 |= -1292529560;
            var4 ^= -594711392;
            long var28 = var4;
            long var45 = var28 + 1L;
            long var46 = var28 * var45;
            long var9 = var28 + 2L;
            long var47 = var46 * var9;
            long var29 = var28 + 3L;
            long var48 = var47 * var29;
            long var30 = var48 & 7L;
            long var53;
            var4 = (var53 = var30 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
            if (var4 == 0) {
                LongSupplier var39 = this.UW;
                long var49 = var39.getAsLong();
                var9 = Math.max(0L, var1);
                long var50 = var49 + var9;
                var9 = this.BU;
                long var11 = var9 + 1L;
                this.BU = var11;
                AA var33 = new AA(var50, var9, var3);
                boolean var34 = var6.add(var33);
                return;
            }
        }

        IllegalArgumentException var32 = new IllegalArgumentException();
        throw var32;
    }

    public int a() {
        label96: {
            int var44;
            int var73;
            label101: {
                var44 = R;
                var44 ^= -1628103363;
                int var2 = System.identityHashCode(this);
                LongSupplier var3 = this.UW;
                long var4 = var2;
                long var6 = var4 + 1L;
                var6 = var4 * var6;
                long var8 = var4 + 2L;
                var6 *= var8;
                var4 += 3L;
                var6 *= var4;
                var4 = var6 & 7L;
                long var131;
                int var72 = (var131 = var4 - 0L) == 0L ? 0 : (var131 < 0L ? -1 : 1);
                if (var72 != 0) {
                    var44 &= -933445057;
                    var44 >>= 2;
                    var44 += 2132088834;
                    var44 >>= 15;
                    var44 ^= -486878459;
                } else {
                    var44 = switch (var44) {
                        case -914346303 -> {
                            var44 |= 1889792162;
                            var44 &= 1864996133;
                            yield var44 ^ 720457483;
                        }
                        case -286700415 -> var44 ^ 1069425859;
                        default -> var44 ^ -974190977;
                    };
                    long var64 = var3.getAsLong();
                    long var65 = var64;
                    byte var5 = 0;
                    var73 = var5;
                    var44 += 685759700;
                    var44 |= 1225637776;
                    var44 ^= 1415496275;

                    label93:
                    while (true) {
                        PriorityQueue var78 = this.n;
                        long var7 = var2;
                        long var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var132;
                        int var102 = (var132 = var7 - 0L) == 0L ? 0 : (var132 < 0L ? -1 : 1);
                        if (var102 != 0) {
                            switch (var44) {
                                case 212004103:
                                    var44 ^= 1179971898;
                                    break label93;
                                case 758574669:
                                default:
                                    var44 ^= -892960894;
                                    break label93;
                                case 971210157:
                                    var44 ^= 1716278829;
                                    var44 |= -526646003;
                                    var44 >>>= 5;
                                    var44 ^= -452474797;
                                    break label93;
                            }
                        }

                        var44 -= 1096191530;
                        var44 *= 2076222337;
                        var44 |= -1999877428;
                        var44 ^= -2039810250;
                        int var103 = var44 + 1;
                        int var104 = var44 * var103;
                        int var105 = var104 & 1;
                        if (var105 != 0) {
                            break label96;
                        }

                        boolean var79 = var78.isEmpty();
                        if (var79) {
                            var44 *= 2088858637;
                            var44 ^= -1790988029;
                            break label101;
                        }
                        var44 = switch (var44) {
                            case 145206777 -> {
                                var44 |= 1027871789;
                                var44 >>= 1;
                                var44 -= 969180186;
                                var44 += -991849831;
                                yield var44 ^ 1164212055;
                            }
                            case 236552994 -> var44 ^ 136572127;
                            default -> var44 ^ -1748742673;
                        };
                        var6 = var44;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var133;
                        int var83 = (var133 = var6 - 0L) == 0L ? 0 : (var133 < 0L ? -1 : 1);
                        if (var83 != 0) {
                            break label96;
                        }

                        PriorityQueue var84 = this.n;
                        Object var85 = var84.peek();
                        AA var86 = (AA)var85;
                        var6 = var86.dueAt();
                        int var118 = var2 + 1;
                        int var119 = var2 * var118;
                        int var120 = var119 & 1;
                        if (var120 != 0) {
                            var44 += -1729193663;
                            var44 &= -1015064415;
                            var44 ^= 1654202638;
                            break;
                        }

                        var44 >>>= 22;
                        var44 ^= -835130873;
                        int var121 = var44 + 1;
                        int var122 = var44 * var121;
                        int var127 = var44 + 2;
                        int var123 = var122 * var127;
                        int var128 = var44 + 3;
                        int var124 = var123 * var128;
                        int var125 = var124 & 7;
                        if (var125 != 0) {
                            break label96;
                        }

                        long var134;
                        int var88 = (var134 = var6 - var65) == 0L ? 0 : (var134 < 0L ? -1 : 1);
                        if (var88 > 0) {
                            var44 += 900962493;
                            var44 -= -1772801991;
                            var44 += 481548087;
                            var44 >>= 29;
                            var44 ^= -619583654;
                            break label101;
                        }

                        var44 |= 2115890866;
                        var44 ^= -1060242095;
                        int var89 = var44 + 1;
                        int var90 = var44 * var89;
                        int var106 = var44 + 2;
                        int var91 = var90 * var106;
                        int var107 = var44 + 3;
                        int var92 = var91 * var107;
                        int var93 = var92 & 7;
                        if (var93 != 0) {
                            break label96;
                        }

                        PriorityQueue var94 = this.n;
                        Object var95 = var94.poll();
                        AA var96 = (AA)var95;
                        Runnable var97 = var96.task();
                        int var108 = var2 + 1;
                        int var109 = var2 * var108;
                        int var110 = var109 & 1;
                        if (var110 != 0) {
                            switch (var44) {
                                case -1840594401:
                                default:
                                    var44 ^= -1545755143;
                                    break label93;
                                case -1298768185:
                                    var44 ^= -1197133112;
                                    break label93;
                                case 1055920875:
                                    var44 *= -914068041;
                                    var44 ^= -225142942;
                                    var44 ^= 1773744816;
                                    break label93;
                            }
                        }

                        var44 += -50114195;
                        var44 &= -1932800115;
                        var44 |= -338857158;
                        var44 ^= 1335051864;
                        var7 = var44;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var7 = var9 & 1L;
                        long var135;
                        int var113 = (var135 = var7 - 0L) == 0L ? 0 : (var135 < 0L ? -1 : 1);
                        if (var113 != 0) {
                            break label96;
                        }

                        var97.run();
                        int var98 = var73 + 1;
                        var73 = var98;
                        var44 -= -1846000204;
                        var44 ^= 729847299;
                    }
                }

                long var55 = var44;
                long var66 = var55 + 1L;
                long var67 = var55 * var66;
                long var74 = var55 + 2L;
                long var68 = var67 * var74;
                long var56 = var55 + 3L;
                long var69 = var68 * var56;
                long var57 = var69 & 7L;
                long var136;
                var44 = (var136 = var57 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                if (var44 == 0) {
                    RuntimeException var60 = new RuntimeException();
                    throw var60;
                }
                break label96;
            }

            long var61 = var44;
            long var99 = var61 + 1L;
            var99 = var61 * var99;
            var61 = var99 & 1L;
            long var137;
            int var63 = (var137 = var61 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
            if (var63 == 0) {
                return var73;
            }
        }

        RuntimeException var59 = new RuntimeException();
        throw var59;
    }

    public int o() {
        int var1 = R;
        var1 ^= 743427831;
        int var2 = System.identityHashCode(this);
        PriorityQueue var3 = this.n;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        var2 = var4 & 1;
        if (var2 != 0) {
            var1 |= 1677171430;
            var1 -= -1892215835;
            var1 ^= -42434774;
            Integer var16 = var1;
            if (var16 != null) {
                IllegalArgumentException var17 = new IllegalArgumentException();
                throw var17;
            }
        } else {
            var1 = switch (var1) {
                default -> var1 ^ -978650162;
                case 1960830424 -> var1 ^ -1030302161;
                case 2067463435 -> {
                    var1 <<= 17;
                    var1 -= -544739786;
                    var1 &= -1685247816;
                    yield var1 ^ 7844707;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return var3.size();
            }
        }

        RuntimeException var14 = new RuntimeException();
        throw var14;
    }

    public void W() {
        int var1 = R;
        var1 ^= 879492357;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 += -1923233353;
            var1 ^= -1646159175;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 != 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            } else {
                PriorityQueue var18 = this.n;
                var18.clear();
            }
        } else {
            var1 |= -1217304415;
            var1 ^= -1451131589;
            var1 *= 205995211;
            var1 ^= 961271347;
            IllegalStateException var9 = new IllegalStateException();
            throw var9;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 356754038;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        R = var4;
    }
}
