package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.ObjectMethods;
import net.minecraft.entity.Entity;

public record Hm(Entity A, boolean kA, int h, float g) {
    public static final int o;

    public Hm(Entity var1, boolean var2, int var3) {
        this(var1, var2, var3, 1.0F);
    }

    public boolean sweep() {
        boolean var62 = false;
        label74: {
            int var1 = o;
            var1 ^= -689439972;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            var3 = var5 & 1L;
            long var96;
            int var64 = (var96 = var3 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
            if (var64 != 0) {
                switch (var1) {
                    case -1389903670:
                        var1 ^= -396900926;
                        break;
                    case -579086129:
                    default:
                        var1 ^= -1329952160;
                        break;
                    case 1803192571:
                        var1 <<= 20;
                        var1 <<= 12;
                        var1 |= 1808406401;
                        var1 >>>= 13;
                        var1 ^= -1588448620;
                }
            } else {
                label73: {
                    label70: {
                        var1 |= 1545658546;
                        var1 <<= 15;
                        var1 ^= -888965482;
                        var1 -= 1047877944;
                        var1 ^= -192232274;
                        boolean var65 = this.kA;
                        if (!var65) {
                            var1 *= 914162775;
                            var1 &= 607842309;
                            var1 ^= -195195532;
                            var1 += 61140990;
                            var1 ^= -1550196864;
                            var3 = var1;
                            var5 = var3 + 1L;
                            var5 = var3 * var5;
                            long var7 = var3 + 2L;
                            var5 *= var7;
                            var3 += 3L;
                            var5 *= var3;
                            var3 = var5 & 7L;
                            long var97;
                            int var69 = (var97 = var3 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                            if (var69 != 0) {
                                break label74;
                            }

                            float var70 = this.g;
                            float var98;
                            int var71 = (var98 = var70 - 0.9F) == 0.0F ? 0 : (var98 < 0.0F ? -1 : 1);
                            long var4 = var2;
                            long var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var99;
                            var2 = (var99 = var4 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 >>>= 3;
                                var1 |= -491401694;
                                var1 &= 1161383005;
                                var1 -= -1595285184;
                                var1 ^= 1041631192;
                                break label73;
                            }

                            var1 += 911535950;
                            var1 >>= 9;
                            var1 *= -507313807;
                            var1 ^= 1209428912;
                            if (var71 <= 0) {
                                var1 = switch (var1) {
                                    case -1609854058 -> var1 ^ -185314477;
                                    default -> var1 ^ -1380013694;
                                    case 1721519553 -> {
                                        var1 &= -1678123402;
                                        yield var1 ^ 1148261624;
                                    }
                                };
                                var2 = var1 + 1;
                                var2 = var1 * var2;
                                int var72 = var1 + 2;
                                var2 *= var72;
                                int var73 = var1 + 3;
                                var2 *= var73;
                                var2 &= 7;
                                if (var2 != 0) {
                                    break label74;
                                }

                                var62 = true;
                                switch (var1) {
                                    case 694008470:
                                        var1 ^= 1861233766;
                                        break label70;
                                    case 1189697720:
                                        var1 *= -1290831397;
                                        var1 ^= -204421236;
                                        break label70;
                                    case 1275837780:
                                    default:
                                        var1 ^= -1018528738;
                                        break label70;
                                }
                            }

                            var1 *= -1233597717;
                            var1 >>>= 18;
                            var1 &= 1643828612;
                            var1 -= -1936679893;
                            var1 ^= 1209760194;
                        } else {
                            var1 -= 639630208;
                            var1 *= 1042347735;
                            var1 += -2084284464;
                            var1 &= 1418017581;
                            var1 ^= 737419191;
                        }

                        var3 = var1;
                        var5 = var3 + 1L;
                        var5 = var3 * var5;
                        long var95 = var3 + 2L;
                        var5 *= var95;
                        var3 += 3L;
                        var5 *= var3;
                        var3 = var5 & 7L;
                        long var100;
                        int var77 = (var100 = var3 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                        if (var77 != 0) {
                            break label74;
                        }

                        var62 = false;
                        var1 -= -175595165;
                        var1 *= -326727829;
                        var1 += 1655526288;
                        var1 -= -1190343071;
                        var1 ^= 1119384847;
                    }

                    int var78 = var1 + 1;
                    int var79 = var1 * var78;
                    int var84 = var1 + 2;
                    int var80 = var79 * var84;
                    var1 += 3;
                    int var81 = var80 * var1;
                    var1 = var81 & 7;
                    if (var1 == 0) {
                        return var62;
                    }
                    break label74;
                }
            }

            RuntimeException var82 = new RuntimeException();
            throw var82;
        }

        IllegalStateException var48 = new IllegalStateException();
        throw var48;
    }




    public Entity target() {
        int var1 = o;
        var1 ^= -598752104;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var35;
        var2 = (var35 = var21 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 <<= 25;
            var1 ^= 1966628779;
            long var23 = var1;
            var4 = var23 + 1L;
            var4 = var23 * var4;
            long var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var36;
            var2 = (var36 = var25 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.A;
            }
        } else {
            long var14 = switch (var1) {
                default -> var1 ^ 1688771545;
                case 1641199487 -> {
                    var1 += -1869675836;
                    var1 *= -1090395573;
                    yield var1 ^ -1677265731;
                }
                case 1939943042 -> var1 ^ -1628862074;
            };
            long var3 = var14 + 1L;
            var3 = var14 * var3;
            long var5 = var14 + 2L;
            var3 *= var5;
            long var15 = var14 + 3L;
            var3 *= var15;
            long var16 = var3 & 7L;
            long var37;
            var1 = (var37 = var16 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
            if (var1 == 0) {
                AssertionError var19 = new AssertionError();
                throw var19;
            }
        }

        IllegalStateException var18 = new IllegalStateException();
        throw var18;
    }

    public boolean crit() {
        int var1 = o;
        var1 ^= -1158760383;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        var3 = of_2.c;
        var1 ^= var3;
        var1 ^= 1699975548;
        of_2.c = 1699975548;
        var3 = of_2.Po;
        var1 ^= var3;
        var1 ^= 153549896;
        of_2.Po = 153549896;
        if (var2 == 0) {
            var1 -= 821227210;
            var1 ^= 1578429255;
            var1 |= -354930044;
            var1 *= -825575917;
            var1 ^= -1859214370;
            return this.kA;
        } else {
            var1 |= -486817146;
            var1 ^= 271460016;
            Integer var11 = var1;
            if (var11 != null) {
                IllegalArgumentException var13 = new IllegalArgumentException();
                throw var13;
            } else {
                AssertionError var12 = new AssertionError();
                throw var12;
            }
        }
    }

    public int combo() {
        int var1 = o;
        var1 ^= -729545381;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var6 = var17 + 2L;
        var4 *= var6;
        long var18 = var17 + 3L;
        var4 *= var18;
        long var19 = var4 & 7L;
        long var35;
        var2 = (var35 = var19 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 += -1475238744;
            var1 += -451442767;
            var1 ^= 498056744;
            long var21 = var1;
            var4 = var21 + 1L;
            var4 = var21 * var4;
            var6 = var21 + 2L;
            var4 *= var6;
            long var22 = var21 + 3L;
            var4 *= var22;
            long var23 = var4 & 7L;
            long var36;
            var2 = (var36 = var23 - 0L) == 0L ? 0 : (var36 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.h;
            }
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 907053243;
                case 775760181 -> var1 ^ 794545840;
                case 1763276476 -> {
                    var1 ^= -1607754940;
                    yield var1 ^ -50597880;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var16 = new AssertionError();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public float attackStrength() {
        int var1 = o;
        var1 ^= 1538215240;
        int var2 = System.identityHashCode(this);
        Integer var17 = var2;
        if (var17 != null) {
            var1 &= -1896963101;
            var1 ^= -830287377;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var22;
            int var20 = (var22 = var19 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var20 == 0) {
                return this.g;
            }
        } else {
            var1 *= -136245279;
            var1 |= 1844333078;
            var1 -= -1512370707;
            var1 += -836093394;
            var1 ^= -1205044463;
            Integer var14 = var1;
            if (var14 != null) {
                UnsupportedOperationException var16 = new UnsupportedOperationException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -487774225;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        o = var4;
    }
}
