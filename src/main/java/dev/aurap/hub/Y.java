package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;

public final class Y implements AutoCloseable {
    public static final long LIFETIME_MS = 150000L;
    private final ClientRuntime h;
    private final LongSupplier g;
    private final EventSubscription X;
    private LivingEntity Z;
    private Object C;
    private long k;
    public static final int p;

    public Y(ClientRuntime var1) {
        this(var1, System::currentTimeMillis);
    }

    public Y(ClientRuntime var1, LongSupplier var2) {
        this.h = var1;
        this.g = var2;
        EventBus var3 = var1.ZM();
        EventListener<TickEvent> var4 = (TickEvent var1x) -> {
            int var2x = p;
            var2x ^= -2076029141;
            int var3x = System.identityHashCode(this);
            Integer var14 = var3x;
            if (var14 != null) {
                var2x |= 619286849;
                var2x ^= -210940112;
                int var17 = var2x & -545055722;
                var17 >>= 14;
                var17 *= 1439855199;
                var17 &= 1932668273;
                var17 ^= 1475750490;
                this.NY(var17);
            } else {
                var2x += -1136973451;
                var2x <<= 22;
                var2x ^= 1359448484;
                var2x ^= -1973298821;
                int var15 = var2x + 1;
                var15 = var2x * var15;
                var2x = var15 & 1;
                if (var2x == 0) {
                    UnsupportedOperationException var11 = new UnsupportedOperationException();
                    throw var11;
                } else {
                    AssertionError var10 = new AssertionError();
                    throw var10;
                }
            }
        };
        EventSubscription var5 = var3.DP(TickEvent.class, 100, var4);
        this.X = var5;
    }

    public LivingEntity entity() {
        int var1 = p;
        var1 ^= 1455429526;
        int var2 = System.identityHashCode(this);
        Integer var22 = var2;
        if (var22 != null) {
            long var23 = switch (var1) {
                default -> var1 ^ 569016686;
                case 397389530 -> var1 ^ 1679349488;
                case 890677152 -> {
                    var1 |= -1425385212;
                    var1 ^= 62584135;
                    var1 ^= -1578214499;
                    yield var1 ^ 799851356;
                }
            };
            long var4 = var23 + 1L;
            var4 = var23 * var4;
            long var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var33;
            int var26 = (var33 = var25 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var26 == 0) {
                return this.Z;
            }
        } else {
            var1 &= -82369598;
            var1 -= -933334575;
            var1 ^= 1414765335;
            long var16 = var1;
            long var3 = var16 + 1L;
            var3 = var16 * var3;
            long var5 = var16 + 2L;
            var3 *= var5;
            long var17 = var16 + 3L;
            var3 *= var17;
            long var18 = var3 & 7L;
            long var34;
            var1 = (var34 = var18 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        }

        AssertionError var20 = new AssertionError();
        throw var20;
    }

    public boolean owns(Entity var1) {
        boolean var49 = false;
        label77: {
            int var2 = p;
            var2 ^= 1123042685;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 != 0) {
                var2 -= -932580758;
                var2 |= -1570373743;
                var2 *= -1291510725;
                var2 &= -1727496108;
                var2 ^= 2014419626;
            } else {
                label82: {
                    var2 *= -1630376355;
                    var2 <<= 6;
                    var2 ^= 130692770;
                    Integer var58 = var2;
                    if (var58 == null) {
                        break label77;
                    }

                    label74: {
                        if (var1 != null) {
                            var2 = switch (var2) {
                                case -2095072926 -> {
                                    var2 ^= -1519308624;
                                    yield var2 ^ -3425875;
                                }
                                default -> var2 ^ 1644570930;
                                case -120021298 -> var2 ^ -1995822555;
                            };
                            var58 = var2;
                            if (var58 == null) {
                                break label77;
                            }

                            LivingEntity var60 = this.Z;
                            Integer var46 = var3;
                            if (var46 == null) {
                                var2 += -570118274;
                                var2 ^= -827308713;
                                break label82;
                            }

                            var2 -= -128014473;
                            var2 ^= -862947347;
                            var2 *= -1205234451;
                            var2 -= -742382645;
                            var2 ^= 1221943351;
                            long var5 = var2;
                            long var7 = var5 + 1L;
                            var7 = var5 * var7;
                            long var9 = var5 + 2L;
                            var7 *= var9;
                            var5 += 3L;
                            var7 *= var5;
                            var5 = var7 & 7L;
                            long var77;
                            int var47 = (var77 = var5 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
                            if (var47 != 0) {
                                break label77;
                            }

                            if (var1 == var60) {
                                var2 -= 902507493;
                                var2 &= -1731995784;
                                var2 <<= 4;
                                var2 ^= 449345260;
                                Integer var48 = var2;
                                if (var48 == null) {
                                    break label77;
                                }

                                var49 = true;
                                var2 &= -1826813263;
                                var2 ^= 919875189;
                                break label74;
                            }

                            var2 ^= -1425728815;
                            var2 |= -1827263621;
                            var2 += -2070893931;
                            var2 -= -4780469;
                            var2 ^= 834324070;
                        } else {
                            var2 -= -1991590111;
                            var2 <<= 16;
                            var2 += 1950234139;
                            var2 |= 1419702561;
                            var2 ^= 1999911192;
                        }

                        int var61 = var2 + 1;
                        var61 = var2 * var61;
                        var61 &= 1;
                        if (var61 != 0) {
                            break label77;
                        }

                        var49 = false;
                        var2 += -754677613;
                        var2 ^= -132351261;
                    }

                    long var64 = var2;
                    long var6 = var64 + 1L;
                    var6 = var64 * var6;
                    long var8 = var64 + 2L;
                    var6 *= var8;
                    long var65 = var64 + 3L;
                    var6 *= var65;
                    long var66 = var6 & 7L;
                    long var78;
                    var2 = (var78 = var66 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        return var49;
                    }
                    break label77;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var69 = var2 + 2;
            var3 *= var69;
            var69 = var2 + 3;
            var3 *= var69;
            var3 &= 7;
            if (var3 == 0) {
                AssertionError var55 = new AssertionError();
                throw var55;
            }
        }

        RuntimeException var45 = new RuntimeException();
        throw var45;
    }

    public boolean spawn() {
        int var1 = p;
        var1 ^= -2146660388;
        int var2 = System.identityHashCode(this);
        int var3 = (i_2.BD()) ? 1 : 0;
        int var4 = var2 + 1;
        var4 = var2 * var4;
        int var5 = var2 + 2;
        var4 *= var5;
        var5 = var2 + 3;
        var4 *= var5;
        var4 &= 7;
        label57:
        if (var4 == 0) {
            var1 += -366393885;
            var1 ^= 846231373;
            if (var3 == 0) {
                var1 *= -180933155;
                var1 >>= 14;
                var1 -= -1044051135;
                var1 &= 1465007008;
                var1 ^= -1011685789;
                var3 = var1 + 1;
                var3 = var1 * var3;
                var4 = var1 + 2;
                var3 *= var4;
                var4 = var1 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 == 0) {
                    return false;
                }
            } else {
                var1 = switch (var1) {
                    case -1823065390 -> var1 ^ -952088924;
                    default -> var1 ^ 1750876868;
                    case -59510144 -> {
                        var1 |= -1969151592;
                        var1 *= 1475683719;
                        var1 |= -2056374424;
                        var1 &= -1964204472;
                        yield var1 ^ -575919920;
                    }
                };
                var3 = var1 + 1;
                var3 = var1 * var3;
                var3 &= 1;
                if (var3 == 0) {
                    this.remove();
                    LivingEntity var66 = i_2.Y();
                    this.Z = var66;
                    LivingEntity var67 = this.Z;
                    var4 = var2 + 1;
                    var4 = var2 * var4;
                    var5 = var2 + 2;
                    var4 *= var5;
                    var5 = var2 + 3;
                    var4 *= var5;
                    var4 &= 7;
                    if (var4 != 0) {
                        var1 >>= 10;
                        var1 |= -1878219193;
                        var1 |= -1292400899;
                        var1 += 946973978;
                        var1 ^= 1318857118;
                        break label57;
                    }

                    var1 ^= -365375377;
                    var1 -= 1025986904;
                    var1 ^= -1240052766;
                    if (var67 == null) {
                        var1 &= -1459770882;
                        var1 -= -1171249213;
                        var1 ^= 1421410155;
                        var1 += -1380404752;
                        var1 ^= -1927411310;
                        long var68 = var1;
                        long var91 = var68 + 1L;
                        long var92 = var68 * var91;
                        long var69 = var92 & 1L;
                        long var107;
                        var3 = (var107 = var69 - 0L) == 0L ? 0 : (var107 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return false;
                        }
                    } else {
                        var1 &= -175410075;
                        var1 *= -1969466365;
                        var1 ^= 993345309;
                        var1 ^= 161497898;
                        var3 = var1 + 1;
                        var3 = var1 * var3;
                        var3 &= 1;
                        if (var3 == 0) {
                            Object var74 = i_2.U();
                            this.C = var74;
                            LongSupplier var75 = this.g;
                            long var76 = var75.getAsLong();
                            long var93 = var2;
                            long var7 = var93 + 1L;
                            var7 = var93 * var7;
                            long var9 = var93 + 2L;
                            var7 *= var9;
                            long var94 = var93 + 3L;
                            var7 *= var94;
                            long var95 = var7 & 7L;
                            long var108;
                            var2 = (var108 = var95 - 0L) == 0L ? 0 : (var108 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 |= 625347250;
                                var1 &= -1468003223;
                                var1 -= -1349501366;
                                var1 ^= 1434599513;
                                break label57;
                            }

                            var1 *= 1126855979;
                            var1 &= 338697873;
                            var1 >>= 26;
                            var1 &= -1703860998;
                            var1 ^= -1942548686;
                            long var96 = var1;
                            var7 = var96 + 1L;
                            var7 = var96 * var7;
                            var9 = var96 + 2L;
                            var7 *= var9;
                            long var97 = var96 + 3L;
                            var7 *= var97;
                            long var98 = var7 & 7L;
                            long var109;
                            var2 = (var109 = var98 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                            if (var2 == 0) {
                                long var57 = var76 + 150000L;
                                this.k = var57;
                                return true;
                            }
                        }
                    }
                }
            }

            IllegalStateException var56 = new IllegalStateException();
            throw var56;
        } else {
            var1 ^= 1690097389;
            var1 -= 1452315957;
            var1 ^= -1791238571;
        }

        UnsupportedOperationException var53 = new UnsupportedOperationException();
        throw var53;
    }

    public void remove() {
        int var1 = p;
        var1 ^= 292321074;
        int var2 = System.identityHashCode(this);
        Integer var3 = var2;
        int var4 = of_2.i;
        var1 ^= var4;
        var1 ^= 563708667;
        of_2.i = 563708667;
        var4 = of_2.Q;
        var1 ^= var4;
        var1 ^= 1235507530;
        of_2.Q = 1235507530;
        if (var3 == null) {
            switch (var1) {
                case -1994812561:
                default:
                    var1 ^= -2116914099;
                    break;
                case 232194823:
                    var1 ^= 1950258795;
                    break;
                case 1924843268:
                    var1 &= -684601800;
                    var1 += -616994122;
                    var1 ^= -1744102970;
            }
        } else {
            label78: {
                var1 |= -897441536;
                var1 &= 605127141;
                var1 ^= -190998271;
                int var56 = var1 + 1;
                var56 = var1 * var56;
                var4 = var1 + 2;
                var56 *= var4;
                var4 = var1 + 3;
                var56 *= var4;
                var56 &= 7;
                label67:
                if (var56 == 0) {
                    LivingEntity var61 = this.Z;
                    if (var61 != null) {
                        var1 >>>= 26;
                        var1 ^= 511784306;
                        Integer var62 = var1;
                        if (var62 == null) {
                            break label67;
                        }

                        LivingEntity var63 = this.Z;
                        Integer var70 = var2;
                        if (var70 == null) {
                            switch (var1) {
                                case -1166110951:
                                    var1 ^= 262741048;
                                    break label78;
                                case 511784263:
                                    var1 -= -581451097;
                                    var1 ^= -1175301497;
                                    var1 ^= -893992171;
                                    var1 -= 1275424301;
                                    var1 ^= 1393122421;
                                    break label78;
                                case 1898834159:
                                default:
                                    var1 ^= -1237858947;
                                    break label78;
                            }
                        }
                        var1 = switch (var1) {
                            case -530235127 -> var1 ^ 1132211640;
                            case 511784263 -> {
                                var1 |= -1184694365;
                                var1 *= -666739459;
                                yield var1 ^ -1866712058;
                            }
                            default -> var1 ^ -1470664631;
                        };
                        int var71 = var1 + 1;
                        var71 = var1 * var71;
                        int var5 = var1 + 2;
                        var71 *= var5;
                        var5 = var1 + 3;
                        var71 *= var5;
                        var71 &= 7;
                        if (var71 != 0) {
                            break label67;
                        }

                        i_2.CM(var63);
                        var1 >>= 28;
                        var1 >>= 16;
                        var1 ^= 1147123080;
                        var1 ^= -440643252;
                    } else {
                        switch (var1) {
                            case -728950779:
                                var1 &= 1388338958;
                                var1 |= -230958206;
                                var1 |= 752913545;
                                var1 |= -842289836;
                                var1 ^= -1578638108;
                                break;
                            case -706372478:
                                var1 ^= -866273581;
                                break;
                            case -106340658:
                            default:
                                var1 ^= -1084958796;
                        }
                    }

                    var56 = var1 + 1;
                    var56 = var1 * var56;
                    var56 &= 1;
                    if (var56 == 0) {
                        this.Z = null;
                        Integer var50 = var2;
                        if (var50 == null) {
                            var1 |= -645056069;
                            var1 |= 1320183587;
                            var1 |= 732584263;
                            var1 ^= 1256085135;
                            break label78;
                        }

                        var1 -= 99642737;
                        var1 &= -1604500248;
                        var1 *= -1009186905;
                        var1 ^= 955011261;
                        long var51 = var1;
                        long var76 = var51 + 1L;
                        long var77 = var51 * var76;
                        long var6 = var51 + 2L;
                        long var78 = var77 * var6;
                        long var52 = var51 + 3L;
                        long var79 = var78 * var52;
                        long var53 = var79 & 7L;
                        long var81;
                        int var54 = (var81 = var53 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                        if (var54 == 0) {
                            this.C = null;
                            return;
                        }
                    }
                }

                AssertionError var55 = new AssertionError();
                throw var55;
            }
        }

        RuntimeException var49 = new RuntimeException();
        throw var49;
    }

    @Override
    public void close() {
        int var1 = p;
        var1 ^= 1441689544;
        int var2 = System.identityHashCode(this);
        this.remove();
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 ^= 1983221094;
            var1 |= -456754490;
            var1 ^= 1611764864;
            long var23 = var1;
            long var36 = var23 + 1L;
            long var37 = var23 * var36;
            long var6 = var23 + 2L;
            long var38 = var37 * var6;
            long var24 = var23 + 3L;
            long var39 = var38 * var24;
            long var25 = var39 & 7L;
            long var40;
            var2 = (var40 = var25 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                EventSubscription var27 = this.X;
                var27.unsubscribe();
                return;
            }
        } else {
            var1 = switch (var1) {
                case 715793812 -> var1 ^ 1974631728;
                case 909697022 -> {
                    var1 *= 777852145;
                    var1 &= 125630251;
                    var1 += -1201498068;
                    var1 <<= 5;
                    yield var1 ^ -1012160313;
                }
                default -> var1 ^ -601505128;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                AssertionError var20 = new AssertionError();
                throw var20;
            }
        }

        IllegalStateException var19 = new IllegalStateException();
        throw var19;
    }

    public void attack(PlayerEntity var1, float var2) {
        boolean var174 = false;
        int var3 = p;
        var3 ^= -1431996741;
        int var4 = System.identityHashCode(this);
        Integer var5 = var4;
        if (var5 == null) {
            var3 >>>= 8;
            var3 ^= -1179853259;
            var3 -= 556860237;
            var3 |= -1046561302;
            var3 ^= 2005492389;
        } else {
            label221: {
                var3 -= 1979172308;
                var3 >>= 9;
                var3 -= -484148723;
                var3 ^= 1663630764;
                long var149 = var3;
                long var7 = var149 + 1L;
                var7 = var149 * var7;
                long var9 = var149 + 2L;
                var7 *= var9;
                long var150 = var149 + 3L;
                var7 *= var150;
                long var151 = var7 & 7L;
                long var263;
                int var152 = (var263 = var151 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                label202:
                if (var152 == 0) {
                    LivingEntity var153 = this.Z;
                    if (var153 != null) {
                        var3 = switch (var3) {
                            default -> var3 ^ 1676936198;
                            case 302484749 -> var3 ^ 862801483;
                            case 2116927071 -> {
                                var3 -= -1086432933;
                                yield var3 ^ 864302008;
                            }
                        };
                        LivingEntity var154 = this.Z;
                        long var6 = var4;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var264;
                        int var177 = (var264 = var6 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                        if (var177 != 0) {
                            var3 += -1862346491;
                            var3 ^= -1336020342;
                            break label221;
                        }
                        var3 = switch (var3) {
                            case -1922345284 -> {
                                var3 &= 710861765;
                                var3 |= 18956857;
                                var3 >>= 29;
                                yield var3 ^ -2065075274;
                            }
                            default -> var3 ^ -702322000;
                            case 835795331 -> var3 ^ 784236719;
                        };
                        int var178 = var3 + 1;
                        int var179 = var3 * var178;
                        int var180 = var179 & 1;
                        if (var180 != 0) {
                            break label202;
                        }

                        int var155 = (var154.isAlive()) ? 1 : 0;
                        if (var155 != 0) {
                            var3 *= -1623634383;
                            var3 ^= -1923619270;
                            LivingEntity var156 = this.Z;
                            int var181 = var4 + 1;
                            int var182 = var4 * var181;
                            int var230 = var4 + 2;
                            int var183 = var182 * var230;
                            int var231 = var4 + 3;
                            int var184 = var183 * var231;
                            int var185 = var184 & 7;
                            if (var185 != 0) {
                                var3 *= 1786585837;
                                var3 ^= -1933536749;
                                var3 *= 1904897147;
                                var3 |= -1245457622;
                                var3 ^= 1539312180;
                                break label221;
                            }

                            var3 ^= -973583944;
                            var3 *= -1587112409;
                            var3 -= 1844783411;
                            var3 |= 494280285;
                            var3 ^= -216227523;
                            int var186 = var3 + 1;
                            int var187 = var3 * var186;
                            int var232 = var3 + 2;
                            int var188 = var187 * var232;
                            int var233 = var3 + 3;
                            int var189 = var188 * var233;
                            int var190 = var189 & 7;
                            if (var190 != 0) {
                                break label202;
                            }

                            var155 = var156.hurtTime;
                            if (var155 <= 2) {
                                var3 <<= 6;
                                var3 ^= -120030924;
                                var3 |= 1642792682;
                                var3 ^= -789145037;
                                Integer var158 = var3;
                                if (var158 == null) {
                                    break label202;
                                }

                                boolean var159 = var1.isSpectator();
                                int var191 = var4 + 1;
                                int var192 = var4 * var191;
                                int var234 = var4 + 2;
                                int var193 = var192 * var234;
                                int var235 = var4 + 3;
                                int var194 = var193 * var235;
                                int var195 = var194 & 7;
                                if (var195 != 0) {
                                    var3 |= 985675979;
                                    var3 |= -1181772234;
                                    var3 *= -1104473811;
                                    var3 |= 464831742;
                                    var3 ^= -1786563660;
                                    break label221;
                                }

                                var3 &= -1678460938;
                                var3 *= -1765148311;
                                var3 |= -2133320125;
                                var3 ^= -668351845;
                                if (!var159) {
                                    var3 -= -1702976307;
                                    var3 ^= -1910606556;
                                    long var160 = var3;
                                    var7 = var160 + 1L;
                                    var7 = var160 * var7;
                                    long var161 = var7 & 1L;
                                    long var265;
                                    int var162 = (var265 = var161 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                                    if (var162 != 0) {
                                        break label202;
                                    }

                                    LivingEntity var163 = this.Z;
                                    double var164 = var1.squaredDistanceTo(var163);
                                    double var266;
                                    var162 = (var266 = var164 - 36.0) == 0.0 ? 0 : (var266 < 0.0 ? -1 : 1);
                                    var6 = var4;
                                    var8 = var6 + 1L;
                                    var8 = var6 * var8;
                                    var10 = var6 + 2L;
                                    var8 *= var10;
                                    var6 += 3L;
                                    var8 *= var6;
                                    var6 = var8 & 7L;
                                    long var267;
                                    int var199 = (var267 = var6 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                                    if (var199 != 0) {
                                        var3 -= -77723466;
                                        var3 >>= 3;
                                        var3 ^= -1505098463;
                                        break label221;
                                    }
                                    var3 = switch (var3) {
                                        default -> var3 ^ -570173382;
                                        case -1473828268 -> var3 ^ 1081084336;
                                        case 1061997579 -> {
                                            var3 |= -497050872;
                                            var3 >>>= 4;
                                            yield var3 ^ 1712091310;
                                        }
                                    };
                                    if (var162 <= 0) {
                                        var3 &= 1279526644;
                                        var3 *= -2050703865;
                                        var3 ^= 1614629145;
                                        float var268;
                                        var162 = (var268 = var2 - 0.9F) == 0.0F ? 0 : (var268 < 0.0F ? -1 : 1);
                                        int var200 = var4 + 1;
                                        int var201 = var4 * var200;
                                        int var238 = var4 + 2;
                                        int var202 = var201 * var238;
                                        int var239 = var4 + 3;
                                        int var203 = var202 * var239;
                                        int var204 = var203 & 7;
                                        if (var204 != 0) {
                                            var3 += -1290366151;
                                            var3 += -961840931;
                                            var3 -= -279597698;
                                            var3 ^= 902840486;
                                            break label221;
                                        }

                                        var3 |= -952102356;
                                        var3 ^= 562524143;
                                        Integer var205 = var3;
                                        if (var205 != null) {
                                            label214: {
                                                if (var162 > 0) {
                                                    var3 += 316784015;
                                                    var3 ^= 1753410230;
                                                    var3 ^= 1830705201;
                                                    Integer var167 = var3;
                                                    if (var167 == null) {
                                                        break label202;
                                                    }

                                                    boolean var168 = i_2.z(var1);
                                                    Integer var206 = var4;
                                                    if (var206 == null) {
                                                        var3 *= -1818056419;
                                                        var3 |= -1259975835;
                                                        var3 &= -1465766973;
                                                        var3 ^= 244709000;
                                                        break label221;
                                                    }

                                                    var3 += -825748204;
                                                    var3 &= 2039696957;
                                                    var3 |= -791183088;
                                                    var3 ^= 1735873742;
                                                    var3 ^= 905110292;
                                                    int var207 = var3 + 1;
                                                    int var208 = var3 * var207;
                                                    int var209 = var208 & 1;
                                                    if (var209 != 0) {
                                                        break label202;
                                                    }

                                                    if (var168) {
                                                        var3 -= 1702697835;
                                                        var3 >>>= 1;
                                                        var3 -= -408117999;
                                                        var3 ^= -588096443;
                                                        int var169 = var3 + 1;
                                                        var169 = var3 * var169;
                                                        int var210 = var3 + 2;
                                                        var169 *= var210;
                                                        int var211 = var3 + 3;
                                                        var169 *= var211;
                                                        var169 &= 7;
                                                        if (var169 != 0) {
                                                            break label202;
                                                        }

                                                        var174 = true;
                                                        var3 -= 1419397578;
                                                        var3 ^= -445354521;
                                                        break label214;
                                                    }

                                                    var3 ^= 1503997672;
                                                    var3 ^= 1319980315;
                                                } else {
                                                    switch (var3) {
                                                        case -2078649449:
                                                        default:
                                                            var3 ^= -1992917660;
                                                            break;
                                                        case -151236462:
                                                            var3 ^= -415164263;
                                                            var3 ^= -1914217190;
                                                            break;
                                                        case 1622032125:
                                                            var3 ^= 512920388;
                                                    }
                                                }

                                                var6 = var3;
                                                var8 = var6 + 1L;
                                                var8 = var6 * var8;
                                                var10 = var6 + 2L;
                                                var8 *= var10;
                                                var6 += 3L;
                                                var8 *= var6;
                                                var6 = var8 & 7L;
                                                long var269;
                                                int var215 = (var269 = var6 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                                                if (var215 != 0) {
                                                    break label202;
                                                }

                                                var174 = false;
                                                switch (var3) {
                                                    case -1671817967:
                                                        var3 <<= 11;
                                                        var3 *= -440618871;
                                                        var3 -= 1111677248;
                                                        var3 *= 1373137575;
                                                        var3 ^= 1741967746;
                                                        break;
                                                    case -1251514169:
                                                        var3 ^= 210698975;
                                                        break;
                                                    case -1173377641:
                                                    default:
                                                        var3 ^= -1541499841;
                                                }
                                            }

                                            Integer var216 = var3;
                                            if (var216 != null) {
                                                int var217 = var3 | 803298743;
                                                int var218 = var217 | -1146149575;
                                                int var219 = var218 ^ 1853201788;
                                                float var220 = qW(var1, var219);
                                                float var240 = var2 * var2;
                                                int var257 = var4 + 1;
                                                int var258 = var4 * var257;
                                                int var259 = var258 & 1;
                                                if (var259 != 0) {
                                                    switch (var3) {
                                                        case -1511763957:
                                                        default:
                                                            var3 ^= -2075874732;
                                                            break label221;
                                                        case 1179020994:
                                                            var3 -= -1718378911;
                                                            var3 ^= 42274090;
                                                            break label221;
                                                        case 1840345412:
                                                            var3 ^= 705802374;
                                                            break label221;
                                                    }
                                                }

                                                var3 <<= 26;
                                                var3 ^= 1625330600;
                                                float var241 = var240 * 0.8F;
                                                float var242 = 0.2F + var241;
                                                float var221 = var220 * var242;
                                                float var243;
                                                if (var174) {
                                                    var3 = switch (var3) {
                                                        case -1414934208 -> var3 ^ 197964524;
                                                        default -> var3 ^ 813459318;
                                                        case 1759548328 -> {
                                                            var3 |= 1999344380;
                                                            var3 *= 1535549137;
                                                            yield var3 ^ -1287416197;
                                                        }
                                                    };
                                                    var243 = 1.5F;
                                                    var3 += 1530651978;
                                                    var3 *= -326115279;
                                                    var3 ^= 1082590905;
                                                } else {
                                                    var3 >>= 24;
                                                    var3 *= 1468658207;
                                                    var3 |= 1036009643;
                                                    var3 &= 2020853662;
                                                    var3 ^= -649540158;
                                                    var243 = 1.0F;
                                                    switch (var3) {
                                                        case -1418979453:
                                                        default:
                                                            var3 ^= 643997699;
                                                            break;
                                                        case -519403176:
                                                            var3 *= 1040614121;
                                                            var3 &= -464561978;
                                                            var3 <<= 31;
                                                            var3 ^= -631680520;
                                                            break;
                                                        case -505639747:
                                                            var3 ^= -1433143382;
                                                    }
                                                }

                                                float var222 = var221 * var243;
                                                LivingEntity var244 = this.Z;
                                                float var245 = var244.getHealth();
                                                LivingEntity var260 = this.Z;
                                                float var223 = Math.max(0.0F, var222);
                                                float var224 = var245 - var223;
                                                Integer var142 = var4;
                                                if (var142 == null) {
                                                    var3 >>= 19;
                                                    var3 += -190608314;
                                                    var3 ^= 1519672026;
                                                    break label221;
                                                }

                                                var3 += -2024140743;
                                                var3 *= 142150445;
                                                var3 &= -116264325;
                                                var3 >>= 31;
                                                var3 ^= 991741438;
                                                var142 = var3;
                                                if (var142 != null) {
                                                    float var144 = Math.max(0.0F, var224);
                                                    var260.setHealth(var144);
                                                    LivingEntity var145 = this.Z;
                                                    LivingEntity var225 = this.Z;
                                                    var225.hurtTime = 10;
                                                    var145.maxHurtTime = 10;
                                                    ClientRuntime var146 = this.h;
                                                    V var147 = var146.bA();
                                                    LivingEntity var226 = this.Z;
                                                    var147.WS(var226, var1, var245, var174);
                                                    return;
                                                }
                                            }
                                        }
                                        break label202;
                                    }

                                    var3 |= -1884948386;
                                    var3 |= -2093386803;
                                    var3 += 1500378709;
                                    var3 ^= -987073849;
                                } else {
                                    var3 &= -273601762;
                                    var3 &= -402209967;
                                    var3 ^= -1002338845;
                                }
                            } else {
                                var3 -= -519582606;
                                var3 ^= -1491224931;
                            }
                        } else {
                            switch (var3) {
                                case -2065075274:
                                    var3 ^= 358842592;
                                    var3 *= -1219397823;
                                    var3 ^= -1881455067;
                                    break;
                                case -1119953770:
                                    var3 ^= -575079927;
                                    break;
                                case 1559350605:
                                default:
                                    var3 ^= -1727595941;
                            }
                        }
                    } else {
                        var3 <<= 6;
                        var3 ^= 120460083;
                    }

                    return;
                }

                AssertionError var148 = new AssertionError();
                throw var148;
            }
        }

        IllegalStateException var141 = new IllegalStateException();
        throw var141;
    }

    private static float qW(PlayerEntity var0, int var1) {
        label57: {
            int var3 = System.identityHashCode(var0);
            RegistryEntry var5 = EntityAttributes.ATTACK_DAMAGE;
            Consumer var6 = var0x -> {
                int var1x = System.identityHashCode(var0x);
            };
            EntityAttributeInstance var4 = new EntityAttributeInstance(var5, var6);
            int var43 = var3 + 1;
            int var44 = var3 * var43;
            int var45 = var44 & 1;
            if (var45 != 0) {
                int var2 = var1 & -1274784811;
                var2 ^= 1671281460;
            } else {
                int var15 = var1 << 21;
                var15 -= 585698001;
                var15 ^= -1500485811;
                var5 = EntityAttributes.ATTACK_DAMAGE;
                EntityAttributeInstance var47 = var0.getAttributeInstance(var5);
                if (var47 != null) {
                    var15 = switch (var15) {
                        case -1947823518 -> {
                            var15 ^= -498733108;
                            var15 ^= -2003736679;
                            yield var15 ^ -1978561581;
                        }
                        case -301487418 -> var15 ^ -703768047;
                        default -> var15 ^ -1727097877;
                    };
                    Integer var59 = var15;
                    if (var59 == null) {
                        break label57;
                    }

                    var4.setFrom(var47);
                    switch (var15) {
                        case 1010050496:
                        default:
                            var15 ^= 2123147094;
                            break;
                        case 1048126854:
                            var15 ^= -597746985;
                            break;
                        case 1797493220:
                            var15 |= 729889517;
                            var15 += 347194118;
                            var15 ^= -1368037750;
                    }
                } else {
                    var15 >>= 23;
                    var15 ^= -860761436;
                    var15 *= -1518577205;
                    var15 ^= -111486317;
                    int var48 = var15 + 1;
                    int var49 = var15 * var48;
                    int var60 = var15 + 2;
                    int var50 = var49 * var60;
                    int var61 = var15 + 3;
                    int var51 = var50 * var61;
                    int var52 = var51 & 7;
                    if (var52 != 0) {
                        break label57;
                    }

                    var4.setBaseValue(1.0);
                    switch (var15) {
                        case -1596950872:
                        default:
                            var15 ^= -618469977;
                            break;
                        case -1479561886:
                            var15 |= 1037159473;
                            var15 *= 1775111851;
                            var15 ^= -1992688216;
                            break;
                        case -217832894:
                            var15 ^= -1902070721;
                    }
                }

                int var53 = var15 + 1;
                int var54 = var15 * var53;
                int var62 = var15 + 2;
                int var55 = var54 * var62;
                int var63 = var15 + 3;
                int var56 = var55 * var63;
                int var57 = var56 & 7;
                if (var57 != 0) {
                    break label57;
                }

                ItemStack var58 = var0.getMainHandStack();
                EquipmentSlot var64 = EquipmentSlot.MAINHAND;
                BiConsumer var7 = (var1x, var2x) -> {
                    int var3x = p;
                    var3x ^= -213943773;
                    int var4x = System.identityHashCode(var4);
                    RegistryEntry var5x = EntityAttributes.ATTACK_DAMAGE;
                    boolean var35x = var1x.equals(var5x);
                    int var6x = var4x + 1;
                    var6x = var4x * var6x;
                    var4x = var6x & 1;
                    if (var4x != 0) {
                        var3x = switch (var3x) {
                            case -1863726571 -> {
                                var3x -= -849469610;
                                yield var3x ^ -1423640994;
                            }
                            case -1168489550 -> var3x ^ 1928194907;
                            default -> var3x ^ 1278691265;
                        };
                        var4x = var3x + 1;
                        var4x = var3x * var4x;
                        var6x = var3x + 2;
                        var4x *= var6x;
                        var6x = var3x + 3;
                        var4x *= var6x;
                        var4x &= 7;
                        if (var4x == 0) {
                            RuntimeException var33x = new RuntimeException();
                            throw var33x;
                        }
                    } else {
                        var3x *= 599806113;
                        var3x ^= -407491362;
                        Integer var34x = var3x;
                        if (var34x != null) {
                            if (var35x) {
                                var3x >>>= 12;
                                var3x ^= 582453648;
                                var4.updateModifier((EntityAttributeModifier)var2x);
                                var3x *= 2095506853;
                                var3x -= 227424333;
                                var3x ^= 601643640;
                            } else {
                                var3x >>>= 29;
                                var3x ^= -349418328;
                                var3x ^= -1384728254;
                                var3x ^= 184685755;
                            }

                            long var22x = var3x;
                            long var36x = var22x + 1L;
                            long var37x = var22x * var36x;
                            long var7x = var22x + 2L;
                            long var38x = var37x * var7x;
                            long var23x = var22x + 3L;
                            long var39x = var38x * var23x;
                            long var24x = var39x & 7L;
                            long var43x;
                            var3x = (var43x = var24x - 0L) == 0L ? 0 : (var43x < 0L ? -1 : 1);
                            if (var3x == 0) {
                                return;
                            }
                        }
                    }

                    IllegalStateException var26x = new IllegalStateException();
                    throw var26x;
                };
                long var8 = var3;
                long var10 = var8 + 1L;
                var10 = var8 * var10;
                long var12 = var8 + 2L;
                var10 *= var12;
                var8 += 3L;
                var10 *= var8;
                var8 = var10 & 7L;
                long var70;
                var3 = (var70 = var8 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var15 ^= -627402847;
                    var15 ^= -498716138;
                    var3 = var15 + 1;
                    var3 = var15 * var3;
                    var15 = var3 & 1;
                    if (var15 == 0) {
                        var58.applyAttributeModifiers(var64, var7);
                        double var37 = var4.getValue();
                        return (float)var37;
                    }
                    break label57;
                }

                var15 -= 1213694288;
                var15 *= -1109001499;
                var15 ^= 522046296;
                var15 ^= 3830592;
            }

            IllegalStateException var40 = new IllegalStateException();
            throw var40;
        }

        IllegalStateException var38 = new IllegalStateException();
        throw var38;
    }

    private void NY(int var1) {
        label206: {
            int var72;
            label216: {
                int var3 = System.identityHashCode(this);
                int var4 = var3 + 1;
                var4 = var3 * var4;
                int var5 = var3 + 2;
                var4 *= var5;
                var5 = var3 + 3;
                var4 *= var5;
                var4 &= 7;
                if (var4 != 0) {
                    switch (var1) {
                        case 936642138:
                            var72 = var1 << 8;
                            var72 -= 817414207;
                            var72 ^= 35717839;
                            break;
                        case 1350909552:
                        default:
                            var72 = var1 ^ 846938670;
                            break;
                        case 2039000045:
                            var72 = var1 ^ -2081092090;
                    }
                } else {
                    var72 = switch (var1) {
                        default -> var1 ^ 1521671123;
                        case -772332405 -> var1 ^ -772873508;
                        case 936642138 -> {
                            var72 = var1 - -270660379;
                            var72 ^= -51905801;
                            var72 *= -440969841;
                            yield var72 ^ 549710924;
                        }
                    };
                    long var115 = var72;
                    long var6 = var115 + 1L;
                    var6 = var115 * var6;
                    long var8 = var115 + 2L;
                    var6 *= var8;
                    long var116 = var115 + 3L;
                    var6 *= var116;
                    long var117 = var6 & 7L;
                    long var210;
                    var4 = (var210 = var117 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label206;
                    }

                    LivingEntity var119 = this.Z;
                    if (var119 == null) {
                        var72 -= -419707288;
                        var72 ^= -377209848;
                        return;
                    }
                    var72 = switch (var72) {
                        case -2021992390 -> var72 ^ 1944346690;
                        default -> var72 ^ 2066548980;
                        case 1726739410 -> {
                            var72 *= 259972959;
                            var72 <<= 31;
                            var72 *= -954773659;
                            var72 *= 55292127;
                            yield var72 ^ 1777775807;
                        }
                    };
                    long var120 = var72;
                    var6 = var120 + 1L;
                    var6 = var120 * var6;
                    var8 = var120 + 2L;
                    var6 *= var8;
                    long var121 = var120 + 3L;
                    var6 *= var121;
                    long var122 = var6 & 7L;
                    long var211;
                    var4 = (var211 = var122 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label206;
                    }

                    int var124 = (i_2.BD()) ? 1 : 0;
                    long var149 = var3;
                    long var7 = var149 + 1L;
                    var7 = var149 * var7;
                    long var9 = var149 + 2L;
                    var7 *= var9;
                    long var150 = var149 + 3L;
                    var7 *= var150;
                    long var151 = var7 & 7L;
                    long var212;
                    var5 = (var212 = var151 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                    label200:
                    if (var5 == 0) {
                        var72 ^= -783607547;
                        var72 += -1818107541;
                        var72 &= 433321711;
                        var72 ^= 1006585369;
                        Integer var153 = var72;
                        if (var153 == null) {
                            break label206;
                        }

                        if (var124 != 0) {
                            var72 = switch (var72) {
                                default -> var72 ^ 939626214;
                                case 866959420 -> {
                                    var72 -= -1975841580;
                                    var72 -= 7297357;
                                    var72 += -2044554659;
                                    yield var72 ^ -475570604;
                                }
                                case 1890982464 -> var72 ^ -1311027601;
                            };
                            var124 = var72 + 1;
                            var124 = var72 * var124;
                            int var154 = var72 + 2;
                            var124 *= var154;
                            var154 = var72 + 3;
                            var124 *= var154;
                            var124 &= 7;
                            if (var124 != 0) {
                                break label206;
                            }

                            Object var130 = this.C;
                            Object var156 = i_2.U();
                            Integer var181 = var3;
                            if (var181 == null) {
                                var72 *= 1869411399;
                                var72 += -665632140;
                                var72 ^= -195623002;
                                break label200;
                            }
                            var72 = switch (var72) {
                                case -1789470150 -> var72 ^ -319457824;
                                case -863784404 -> {
                                    var72 += 1963982084;
                                    var72 &= -656124402;
                                    yield var72 ^ -1995240721;
                                }
                                default -> var72 ^ -509704537;
                            };
                            int var182 = var72 + 1;
                            int var183 = var72 * var182;
                            int var197 = var72 + 2;
                            int var184 = var183 * var197;
                            int var198 = var72 + 3;
                            int var185 = var184 * var198;
                            int var186 = var185 & 7;
                            if (var186 != 0) {
                                break label206;
                            }

                            if (var130 == var156) {
                                var72 = switch (var72) {
                                    case -913109777 -> {
                                        var72 ^= 1007790200;
                                        var72 += 1140050124;
                                        var72 *= 883209229;
                                        var72 ^= 1397849675;
                                        yield var72 ^ -2000200675;
                                    }
                                    default -> var72 ^ -50515666;
                                    case 1848767384 -> var72 ^ 1233627284;
                                };
                                LivingEntity var131 = this.Z;
                                int var132 = (var131.isRemoved()) ? 1 : 0;
                                long var157 = var3;
                                var7 = var157 + 1L;
                                var7 = var157 * var7;
                                var9 = var157 + 2L;
                                var7 *= var9;
                                long var158 = var157 + 3L;
                                var7 *= var158;
                                long var159 = var7 & 7L;
                                long var213;
                                var154 = (var213 = var159 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                                if (var154 != 0) {
                                    var72 &= 1859490837;
                                    var72 *= -1473513875;
                                    var72 += 1107372956;
                                    var72 |= 2016338464;
                                    var72 ^= 1535341047;
                                    break label200;
                                }

                                var72 += 1275516404;
                                var72 *= -194974339;
                                var72 *= -33480567;
                                var72 ^= 1888453126;
                                var72 ^= 2090052964;
                                if (var132 == 0) {
                                    var72 = switch (var72) {
                                        case -1221195301 -> {
                                            var72 |= 1623666360;
                                            var72 -= -1497282796;
                                            var72 ^= 2125430114;
                                            var72 += 1571005275;
                                            yield var72 ^ -1170609839;
                                        }
                                        case -610988673 -> var72 ^ 414240681;
                                        default -> var72 ^ -1339835649;
                                    };
                                    long var133 = var72;
                                    var6 = var133 + 1L;
                                    var6 = var133 * var6;
                                    var8 = var133 + 2L;
                                    var6 *= var8;
                                    long var134 = var133 + 3L;
                                    var6 *= var134;
                                    long var135 = var6 & 7L;
                                    long var214;
                                    var132 = (var214 = var135 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                                    if (var132 != 0) {
                                        break label206;
                                    }

                                    LongSupplier var137 = this.g;
                                    var154 = var3 + 1;
                                    var154 = var3 * var154;
                                    int var191 = var3 + 2;
                                    var154 *= var191;
                                    int var192 = var3 + 3;
                                    var154 *= var192;
                                    var154 &= 7;
                                    if (var154 != 0) {
                                        var72 |= -376896008;
                                        var72 += 1252374945;
                                        var72 ^= -346483564;
                                        break label200;
                                    }

                                    var72 &= -1342464960;
                                    var72 ^= -1249777574;
                                    long var166 = var72;
                                    var7 = var166 + 1L;
                                    var7 = var166 * var7;
                                    long var167 = var7 & 1L;
                                    long var215;
                                    var154 = (var215 = var167 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                                    if (var154 != 0) {
                                        break label206;
                                    }

                                    long var138 = var137.getAsLong();
                                    var6 = this.k;
                                    long var216;
                                    var132 = (var216 = var138 - var6) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                                    if (var132 < 0) {
                                        var72 = switch (var72) {
                                            case -1836943270 -> {
                                                var72 += -60834820;
                                                var72 >>>= 2;
                                                var72 += 526694557;
                                                yield var72 ^ 85079023;
                                            }
                                            default -> var72 ^ 227077465;
                                            case 1287841892 -> var72 ^ 1619695570;
                                        };
                                        Integer var140 = var72;
                                        if (var140 == null) {
                                            break label206;
                                        }

                                        LivingEntity var141 = this.Z;
                                        var154 = var3 + 1;
                                        var154 = var3 * var154;
                                        var154 &= 1;
                                        if (var154 != 0) {
                                            var72 >>>= 17;
                                            var72 &= -1536026960;
                                            var72 ^= -1586718450;
                                            break label200;
                                        }

                                        var72 *= 2015635025;
                                        var72 >>= 16;
                                        var72 ^= 1806751768;
                                        boolean var142 = var141.isAlive();
                                        if (var142) {
                                            var72 &= -1101761638;
                                            var72 *= 1665072729;
                                            var72 ^= -2147469400;
                                            break label216;
                                        }
                                        var72 = switch (var72) {
                                            case -1806734446 -> {
                                                var72 |= 2056729721;
                                                var72 ^= 1487234414;
                                                var72 *= -538932783;
                                                var72 >>>= 3;
                                                yield var72 ^ 766612953;
                                            }
                                            default -> var72 ^ -1190759960;
                                            case 569131816 -> var72 ^ 1074440264;
                                        };
                                        var140 = var72;
                                        if (var140 == null) {
                                            break label206;
                                        }

                                        LivingEntity var144 = this.Z;
                                        int var145 = var144.deathTime;
                                        Integer var107 = var3;
                                        if (var107 == null) {
                                            var72 += 1894507497;
                                            var72 *= 1036082681;
                                            var72 >>>= 26;
                                            var72 ^= -1586717898;
                                            break label200;
                                        }
                                        var72 = switch (var72) {
                                            case -1706275443 -> var72 ^ -998064932;
                                            default -> var72 ^ -1026050329;
                                            case 609795021 -> {
                                                var72 *= -1042496083;
                                                yield var72 ^ -1847107424;
                                            }
                                        };
                                        long var172 = var72;
                                        var7 = var172 + 1L;
                                        var7 = var172 * var7;
                                        long var173 = var7 & 1L;
                                        long var217;
                                        int var108 = (var217 = var173 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                                        if (var108 != 0) {
                                            break label206;
                                        }

                                        if (var145 < 19) {
                                            var72 *= 1051057517;
                                            var72 ^= 1574667910;
                                            var72 ^= -1732333415;
                                            break label216;
                                        }

                                        switch (var72) {
                                            case 590876991:
                                            default:
                                                var72 ^= -871013841;
                                                break;
                                            case 1480641065:
                                                var72 |= -1175475225;
                                                var72 <<= 13;
                                                var72 += -1341429640;
                                                var72 ^= 1276939668;
                                                break;
                                            case 1893443935:
                                                var72 ^= -763387265;
                                        }
                                    } else {
                                        var72 ^= -583838560;
                                        var72 &= -1937974250;
                                        var72 &= -847202155;
                                        var72 ^= -308949508;
                                    }
                                } else {
                                    switch (var72) {
                                        case -1221195301:
                                            var72 ^= 1811097852;
                                            var72 ^= -1565446722;
                                            var72 ^= -1612592779;
                                            break;
                                        case -712822322:
                                            var72 ^= -1179581434;
                                            break;
                                        case 578192552:
                                        default:
                                            var72 ^= 365073016;
                                    }
                                }
                            } else {
                                var72 ^= 1448092405;
                                var72 -= -34266872;
                                var72 ^= 1079757054;
                            }
                        } else {
                            switch (var72) {
                                case -1002786327:
                                    var72 ^= -1586347069;
                                    break;
                                case 299022604:
                                default:
                                    var72 ^= 1055348091;
                                    break;
                                case 866959420:
                                    var72 ^= 193092913;
                                    var72 ^= -642033439;
                            }
                        }

                        Integer var109 = var72;
                        if (var109 == null) {
                            break label206;
                        }

                        this.remove();
                        var72 |= 1593321392;
                        var72 >>>= 5;
                        var72 ^= 2115150165;
                        break label216;
                    } else {
                        var72 ^= -1769208368;
                        var72 >>>= 17;
                        var72 &= 9601546;
                        var72 ^= 1919531422;
                        var72 ^= -754638696;
                    }
                }

                long var102 = var72;
                long var146 = var102 + 1L;
                long var147 = var102 * var146;
                long var103 = var147 & 1L;
                long var218;
                var72 = (var218 = var103 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                if (var72 == 0) {
                    IllegalStateException var106 = new IllegalStateException();
                    throw var106;
                }
                break label206;
            }

            Integer var110 = var72;
            if (var110 != null) {
                return;
            }
        }

        IllegalStateException var105 = new IllegalStateException();
        throw var105;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -336099329;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        p = var4;
    }
}
