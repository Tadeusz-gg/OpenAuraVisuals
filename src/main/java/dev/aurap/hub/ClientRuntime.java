package dev.aurap.hub;

import mvggs.modules.client.clickgui;

import dev.skidware.visuals.client.render.AuraPipeline;
import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.resource.ResourceSource;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.function.LongSupplier;
import java.util.random.RandomGenerator;

public final class ClientRuntime {
    public static final String Zu = "auravisuals";
    private static ClientRuntime FX;
    private final EventBus aY;
    private final ModuleManager o;
    private final cp k;
    private final gj Ev;
    private final Fp C;
    private final AuraRenderer ek;
    private final AuraPipeline t;
    private final V Kg;
    private final Y yO;
    private final Zx hU;
    private final bS Iz;
    private final BP p;
    private final xy P;
    private final C PA;
    public static final int X;

    private ClientRuntime(Path var1) {
        EventBus var2 = new EventBus();
        this.aY = var2;
        EventBus var3 = this.aY;
        ModuleManager var7 = new ModuleManager(var3);
        this.o = var7;
        cp var8 = new cp();
        this.k = var8;
        LongSupplier var23 = System::currentTimeMillis;
        gj var9 = new gj(var23);
        this.Ev = var9;
        FX = this;
        sx var10 = i_2.Zk();
        KeybindSetting.c(var10);
        LY var24 = new LY();
        gj var4 = this.Ev;
        RandomGenerator var5 = RandomGenerator.getDefault();
        LongSupplier var6 = System::currentTimeMillis;
        Fp var11 = new Fp(var24, var4, var5, var6);
        this.C = var11;
        Fp var12 = this.C;
        Az.AL(var12);
        ResourceSource var25 = ResourceSource.classpath();
        AuraRenderer var13 = new AuraRenderer(var25);
        this.ek = var13;
        AuraPipeline var14 = new AuraPipeline(this);
        this.t = var14;
        var3 = this.aY;
        V var15 = new V(var3);
        this.Kg = var15;
        Y var16 = new Y(this);
        this.yO = var16;
        ModuleRegistry.registerModules(this);
        Path var27 = var1.resolve("auravisuals.json");
        ModuleManager var28 = this.o;
        Zx var17 = new Zx(var27, var28);
        this.hU = var17;
        Zx var18 = this.hU;
        var18.q();
        bS var19 = new bS(this);
        this.Iz = var19;
        BP var20 = new BP(this);
        this.p = var20;
        xy var21 = new xy(this);
        this.P = var21;
        C var22 = new C(this, var1);
        this.PA = var22;
    }

    public static ClientRuntime kz(Path var0) {
        int var1 = X;
        var1 ^= -307297183;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 ^= -242347046;
            var1 |= -106976046;
            var1 += -1216336829;
            var1 |= -591874495;
            var1 ^= -1229976775;
            IllegalArgumentException var30 = new IllegalArgumentException();
            throw var30;
        } else {
            var1 -= -1847509975;
            var1 |= 583470459;
            var1 |= -1567650143;
            var1 -= 786822435;
            var1 ^= -360944475;
            ClientRuntime var28 = FX;
            if (var28 != null) {
                switch (var1) {
                    case -1719245187:
                        var1 >>= 19;
                        var1 *= 1033917915;
                        var1 *= 1361218539;
                        var1 ^= 1515519418;
                        break;
                    case -946896907:
                        var1 ^= 492700960;
                        break;
                    case -409908775:
                    default:
                        var1 ^= -1974665044;
                }

                IllegalStateException var29 = new IllegalStateException("Aura already bootstrapped");
                throw var29;
            } else {
                var1 ^= -293560059;
                var1 -= 1250510536;
                var1 ^= 1241264912;
                var1 ^= -1751826528;
                return new ClientRuntime(var0);
            }
        }
    }

    public static ClientRuntime Z() {
        return FX;
    }

    public static boolean y() {
        int var0 = X;
        var0 ^= -153743287;
        ClientRuntime var1 = FX;
        var0 >>>= 8;
        var0 *= -1250387535;
        var0 ^= 561723551;
        Integer var2 = var0;
        if (var2 != null) {
            boolean var21;
            if (var1 != null) {
                var0 = switch (var0) {
                    case 1423128383 -> var0 ^ -987435122;
                    case 1704971894 -> {
                        var0 &= 866240017;
                        var0 >>>= 17;
                        var0 *= -1171297669;
                        var0 >>>= 20;
                        yield var0 ^ 468697497;
                    }
                    default -> var0 ^ -1983394891;
                };
                var21 = true;
                switch (var0) {
                    case 218019228:
                    default:
                        var0 ^= 1577189476;
                        break;
                    case 468699194:
                        var0 |= -127806038;
                        var0 *= 2063514437;
                        var0 ^= -328147875;
                        break;
                    case 1254825202:
                        var0 ^= -1098792452;
                }
            } else {
                var0 *= -1049790729;
                var0 ^= 1378442415;
                var21 = false;
                var0 |= -1247666283;
                var0 -= 1897512975;
                var0 ^= -1413258599;
            }

            Integer var19 = var0;
            if (var19 != null) {
                return var21;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public EventBus ZM() {
        int var1 = X;
        var1 ^= -1307128008;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 <<= 10;
            var1 ^= 932626596;
            return this.aY;
        } else {
            var1 -= -1959636167;
            var1 >>= 11;
            var1 ^= -364794598;
            Integer var9 = var1;
            if (var9 != null) {
                AssertionError var11 = new AssertionError();
                throw var11;
            } else {
                IllegalArgumentException var10 = new IllegalArgumentException();
                throw var10;
            }
        }
    }

    public ModuleManager sP() {
        int var1 = X;
        var1 ^= 364644245;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var21 = var4 & 1L;
        long var27;
        var2 = (var27 = var21 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
        int var3 = of_2.iP;
        var1 ^= var3;
        var1 ^= 380143496;
        of_2.iP = 380143496;
        var3 = of_2.Ym;
        var1 ^= var3;
        var1 ^= -837018505;
        of_2.Ym = -837018505;
        if (var2 == 0) {
            var1 &= 1278926134;
            var1 += -427589659;
            var1 ^= -1833679595;
            Integer var23 = var1;
            if (var23 != null) {
                return this.o;
            } else {
                UnsupportedOperationException var24 = new UnsupportedOperationException();
                throw var24;
            }
        } else {
            var1 += 1326851398;
            var1 |= -377218958;
            var1 ^= -2120649132;
            var1 *= -2097270177;
            var1 ^= 1464418226;
            RuntimeException var16 = new RuntimeException();
            throw var16;
        }
    }

    public cp S() {
        int var1 = X;
        var1 ^= -482172097;
        int var2 = System.identityHashCode(this);
        Integer var15 = var2;
        if (var15 != null) {
            var1 *= 1131120783;
            var1 *= -2091070459;
            var1 ^= -1342569605;
            return this.k;
        } else {
            var1 <<= 21;
            var1 ^= -1237785761;
            var1 -= -1449594253;
            var1 -= -1196097532;
            var1 ^= -1908232675;
            int var16 = var1 + 1;
            var16 = var1 * var16;
            var1 = var16 & 1;
            if (var1 != 0) {
                RuntimeException var11 = new RuntimeException();
                throw var11;
            } else {
                IllegalStateException var10 = new IllegalStateException();
                throw var10;
            }
        }
    }

    public gj gE() {
        int var1 = X;
        var1 ^= -1923754484;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ 1740919127;
                case -289619722 -> var1 ^ 1562812523;
                case -196771889 -> {
                    var1 >>= 2;
                    var1 ^= -843738812;
                    var1 <<= 20;
                    var1 ^= 2009968817;
                    yield var1 ^ -50062968;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return this.Ev;
            }
        } else {
            var1 = switch (var1) {
                case -196771889 -> {
                    var1 *= 701091185;
                    yield var1 ^ -1550359499;
                }
                case 804548188 -> var1 ^ -1513080942;
                default -> var1 ^ 480936586;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            }
        }

        UnsupportedOperationException var14 = new UnsupportedOperationException();
        throw var14;
    }

    public Fp J() {
        int var1 = X;
        var1 ^= 992186422;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            long var19 = switch (var1) {
                default -> var1 ^ -629883596;
                case 771589227 -> var1 ^ -68971879;
                case 1110653429 -> {
                    var1 -= 1279992968;
                    var1 ^= 1254981023;
                    var1 += -1148970781;
                    var1 += 280605237;
                    yield var1 ^ -1442949491;
                }
            };
            long var4 = var19 + 1L;
            var4 = var19 * var4;
            long var20 = var4 & 1L;
            long var23;
            int var21 = (var23 = var20 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var21 == 0) {
                return this.C;
            }
        } else {
            Integer var15 = switch (var1) {
                default -> var1 ^ 952085395;
                case 1110653429 -> {
                    var1 &= -1617945573;
                    var1 += 1539464457;
                    yield var1 ^ -1282206934;
                }
                case 1388774054 -> var1 ^ 829664574;
            };
            if (var15 != null) {
                UnsupportedOperationException var17 = new UnsupportedOperationException();
                throw var17;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    public AuraRenderer ZP() {
        int var1 = X;
        var1 ^= 1806917227;
        int var2 = System.identityHashCode(this);
        long var20 = var2;
        long var4 = var20 + 1L;
        var4 = var20 * var4;
        long var6 = var20 + 2L;
        var4 *= var6;
        long var21 = var20 + 3L;
        var4 *= var21;
        long var22 = var4 & 7L;
        long var39;
        var2 = (var39 = var22 - 0L) == 0L ? 0 : (var39 < 0L ? -1 : 1);
        int var3 = of_2.iP;
        var1 ^= var3;
        var1 ^= 380143496;
        var3 = of_2.Ym;
        var1 ^= var3;
        var1 ^= -837018505;
        if (var2 != 0) {
            var1 |= -1113325200;
            var1 ^= 2001244543;
            long var24 = var1;
            var4 = var24 + 1L;
            var4 = var24 * var4;
            long var25 = var4 & 1L;
            long var40;
            var2 = (var40 = var25 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalArgumentException var27 = new IllegalArgumentException();
                throw var27;
            }
        } else {
            var1 = switch (var1) {
                default -> var1 ^ 938821231;
                case 110280025 -> var1 ^ -1024766021;
                case 312735656 -> {
                    var1 ^= -574344402;
                    yield var1 ^ -397762177;
                }
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                return this.ek;
            }
        }

        UnsupportedOperationException var19 = new UnsupportedOperationException();
        throw var19;
    }

    public AuraPipeline Ul() {
        int var1 = X;
        var1 ^= 1391313980;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            var1 -= -519982322;
            var1 ^= -1352322711;
            UnsupportedOperationException var15 = new UnsupportedOperationException();
            throw var15;
        } else {
            var1 *= -775008189;
            var1 *= 416197537;
            var1 *= -152572983;
            var1 &= -1943793309;
            var1 ^= 767262616;
            return this.t;
        }
    }

    public V bA() {
        int var1 = X;
        var1 ^= 694347787;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 != 0) {
            switch (var1) {
                case -884881760:
                default:
                    var1 ^= 995230237;
                    break;
                case 1349665224:
                    var1 *= -516601677;
                    var1 ^= 923817996;
                    break;
                case 1971730086:
                    var1 ^= 2052864226;
            }

            UnsupportedOperationException var21 = new UnsupportedOperationException();
            throw var21;
        } else {
            var1 *= 1204255243;
            var1 ^= -1250776145;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                RuntimeException var10 = new RuntimeException();
                throw var10;
            } else {
                return this.Kg;
            }
        }
    }

    public Y M() {
        int var1 = X;
        var1 ^= -827844111;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 &= -74229928;
            var1 += 1689749377;
            var1 *= -1768087723;
            var1 += -282891488;
            var1 ^= -78690794;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 != 0) {
                IllegalStateException var18 = new IllegalStateException();
                throw var18;
            } else {
                return this.yO;
            }
        } else {
            var1 ^= -1399980481;
            var1 -= 1216958490;
            var1 ^= 866885940;
            UnsupportedOperationException var8 = new UnsupportedOperationException();
            throw var8;
        }
    }

    public Zx YT() {
        int var1 = X;
        var1 ^= 146344759;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var26;
        var2 = (var26 = var18 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            Integer var20 = switch (var1) {
                case -1781022833 -> var1 ^ -775347398;
                default -> var1 ^ -2142627786;
                case 1906942708 -> {
                    var1 += 865119854;
                    var1 += 2000260984;
                    yield var1 ^ -407551917;
                }
            };
            if (var20 != null) {
                return this.hU;
            }
        } else {
            var1 *= -2076225549;
            var1 >>= 23;
            var1 ^= 604284082;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                RuntimeException var16 = new RuntimeException();
                throw var16;
            }
        }

        IllegalStateException var15 = new IllegalStateException();
        throw var15;
    }

    public bS Mv() {
        int var1 = X;
        var1 ^= 1317083617;
        int var2 = System.identityHashCode(this);
        long var24 = var2;
        long var4 = var24 + 1L;
        var4 = var24 * var4;
        long var6 = var24 + 2L;
        var4 *= var6;
        long var25 = var24 + 3L;
        var4 *= var25;
        long var26 = var4 & 7L;
        long var34;
        var2 = (var34 = var26 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= -566053551;
            var1 += -1945616006;
            var1 &= 2007457500;
            var1 &= 873920020;
            var1 ^= -1430201454;
            return this.Iz;
        } else {
            long var13 = switch (var1) {
                default -> var1 ^ -1316118540;
                case -137066425 -> var1 ^ -1636032609;
                case 932294690 -> {
                    var1 *= 65254887;
                    var1 ^= -1460348256;
                    var1 -= -708743225;
                    yield var1 ^ -804625958;
                }
            };
            long var3 = var13 + 1L;
            var3 = var13 * var3;
            long var5 = var13 + 2L;
            var3 *= var5;
            long var14 = var13 + 3L;
            var3 *= var14;
            long var15 = var3 & 7L;
            long var35;
            var1 = (var35 = var15 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var1 != 0) {
                AssertionError var18 = new AssertionError();
                throw var18;
            } else {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }
    }

    public BP Kx() {
        int var1 = X;
        var1 ^= -494159399;
        int var2 = System.identityHashCode(this);
        long var17 = var2;
        long var4 = var17 + 1L;
        var4 = var17 * var4;
        long var18 = var4 & 1L;
        long var31;
        var2 = (var31 = var18 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
        if (var2 != 0) {
            long var20 = switch (var1) {
                case -1684336614 -> {
                    var1 &= -2142878398;
                    var1 ^= 787634152;
                    yield var1 ^ 1625425201;
                }
                default -> var1 ^ -1112564952;
                case 1629600010 -> var1 ^ -2019954955;
            };
            var4 = var20 + 1L;
            var4 = var20 * var4;
            long var6 = var20 + 2L;
            var4 *= var6;
            long var21 = var20 + 3L;
            var4 *= var21;
            long var22 = var4 & 7L;
            long var32;
            var2 = (var32 = var22 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var25 = new AssertionError();
                throw var25;
            } else {
                IllegalArgumentException var24 = new IllegalArgumentException();
                throw var24;
            }
        } else {
            switch (var1) {
                case -1684336614:
                    var1 |= 751167996;
                    var1 -= -1767789110;
                    var1 ^= 927117604;
                    break;
                case -1386880598:
                default:
                    var1 ^= 898576923;
                    break;
                case 781545409:
                    var1 ^= -20078587;
            }

            return this.p;
        }
    }

    public C VP() {
        int var1 = X;
        var1 ^= -1061751955;
        int var2 = System.identityHashCode(this);
        long var18 = var2;
        long var4 = var18 + 1L;
        var4 = var18 * var4;
        long var19 = var4 & 1L;
        long var22;
        var2 = (var22 = var19 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -427407900;
            var1 -= 579209044;
            var1 ^= 1552147088;
            return this.PA;
        } else {
            switch (var1) {
                case -1180280146:
                    var1 &= -559214481;
                    var1 += -1384720858;
                    var1 ^= -656691637;
                    var1 += 937414266;
                    var1 ^= -1972285869;
                    break;
                case -950026986:
                default:
                    var1 ^= 906027281;
                    break;
                case 1191672041:
                    var1 ^= -890377197;
            }

            AssertionError var14 = new AssertionError();
            throw var14;
        }
    }

    public xy nT() {
        int var1 = X;
        var1 ^= 483359648;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 >>= 10;
            var1 <<= 1;
            var1 &= -2079537098;
            var1 &= 1855242992;
            var1 ^= 612402716;
            long var23 = var1;
            long var4 = var23 + 1L;
            var4 = var23 * var4;
            long var6 = var23 + 2L;
            var4 *= var6;
            long var24 = var23 + 3L;
            var4 *= var24;
            long var25 = var4 & 7L;
            long var31;
            var2 = (var31 = var25 - 0L) == 0L ? 0 : (var31 < 0L ? -1 : 1);
            if (var2 == 0) {
                return this.P;
            }
        } else {
            var1 -= 1469325903;
            var1 ^= -2137082623;
            var1 += -38780457;
            var1 -= 1149128109;
            var1 ^= 1854416099;
            Integer var19 = var1;
            if (var19 != null) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    public float KeybindSetting(FrameContext var1) {
        int var2 = X;
        var2 ^= -1792115877;
        int var3 = System.identityHashCode(this);
        long var19 = var3;
        long var5 = var19 + 1L;
        var5 = var19 * var5;
        long var20 = var5 & 1L;
        long var33;
        var3 = (var33 = var20 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var3 != 0) {
            var2 |= 1907747738;
            var2 ^= -1497996688;
            long var22 = var2;
            var5 = var22 + 1L;
            var5 = var22 * var5;
            long var7 = var22 + 2L;
            var5 *= var7;
            long var23 = var22 + 3L;
            var5 *= var23;
            long var24 = var5 & 7L;
            long var34;
            var3 = (var34 = var24 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var3 == 0) {
                IllegalStateException var27 = new IllegalStateException();
                throw var27;
            } else {
                IllegalArgumentException var26 = new IllegalArgumentException();
                throw var26;
            }
        } else {
            var2 >>>= 24;
            var2 &= 1606657546;
            var2 |= -2137158060;
            var2 ^= -194033017;
            ModuleManager var14 = this.o;
            Module var15 = var14.tG(clickgui.class);
            clickgui var16 = (clickgui)var15;
            return var16.t(var1);
        }
    }

    public void P(String var1) {
        label150: {
            int var2 = X;
            var2 ^= 715270896;
            int var3 = System.identityHashCode(this);
            ModuleManager var4 = this.o;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 == 0) {
                var2 -= 458880074;
                var2 &= -81714049;
                var2 <<= 27;
                var2 += -1014793113;
                var2 ^= 301781161;
                long var125 = var2;
                long var7 = var125 + 1L;
                var7 = var125 * var7;
                long var9 = var125 + 2L;
                var7 *= var9;
                long var126 = var125 + 3L;
                var7 *= var126;
                long var127 = var7 & 7L;
                long var178;
                var5 = (var178 = var127 - 0L) == 0L ? 0 : (var178 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label150;
                }

                Module var109 = var4.tG(clickgui.class);
                clickgui var110 = (clickgui)var109;
                int var129 = var110.cP() ? 1 : 0;
                if (var129 == 0) {
                    long var156 = switch (var2) {
                        default -> var2 ^ -723116020;
                        case 444574926 -> {
                            var2 += 1624101829;
                            var2 += 1881867772;
                            yield var2 ^ -300646234;
                        }
                        case 1090488058 -> var2 ^ -1155210949;
                    };
                    var7 = var156 + 1L;
                    var7 = var156 * var7;
                    long var157 = var7 & 1L;
                    long var179;
                    var129 = (var179 = var157 - 0L) == 0L ? 0 : (var179 < 0L ? -1 : 1);
                    if (var129 == 0) {
                        return;
                    }
                    break label150;
                }

                var2 &= 1225741379;
                var2 += -861884503;
                var2 *= -505722103;
                var2 |= -1432114633;
                var2 ^= 1083229665;
                boolean var111 = var110.v();
                Integer var130 = var3;
                label147:
                if (var130 != null) {
                    var2 -= -855515867;
                    var2 += 1403830916;
                    var2 >>>= 19;
                    var2 >>= 28;
                    var2 ^= -1307975685;
                    int var131 = var2 + 1;
                    var131 = var2 * var131;
                    var6 = var2 + 2;
                    var131 *= var6;
                    var6 = var2 + 3;
                    var131 *= var6;
                    var131 &= 7;
                    if (var131 != 0) {
                        break label150;
                    }

                    String var116;
                    if (var111) {
                        var2 = switch (var2) {
                            case -1811970865 -> var2 ^ -1810803678;
                            case -1307975685 -> {
                                var2 += 1932506770;
                                var2 += 1445088553;
                                var2 <<= 21;
                                yield var2 ^ 1827580971;
                            }
                            default -> var2 ^ 1800281621;
                        };
                        Integer var112 = var2;
                        if (var112 == null) {
                            break label150;
                        }

                        boolean var113 = var1.equals("ui_toggle_on");
                        Integer var136 = var3;
                        if (var136 == null) {
                            var2 &= -1361052439;
                            var2 |= -452601142;
                            var2 <<= 10;
                            var2 ^= 1394267187;
                            break label147;
                        }

                        var2 ^= 755810419;
                        var2 -= 289732474;
                        var2 += -963936020;
                        var2 -= 184079727;
                        var2 ^= -466526234;
                        var136 = var2;
                        if (var136 == null) {
                            break label150;
                        }

                        if (var113) {
                            var2 = switch (var2) {
                                default -> var2 ^ 1422444441;
                                case 88178621 -> {
                                    var2 |= -1639312937;
                                    var2 *= -1666612389;
                                    yield var2 ^ 1465404250;
                                }
                                case 260013706 -> var2 ^ -1757184162;
                            };
                            Integer var114 = var2;
                            if (var114 == null) {
                                break label150;
                            }

                            String var115 = "ui_chime_on";
                            int var138 = var3 + 1;
                            var138 = var3 * var138;
                            var6 = var3 + 2;
                            var138 *= var6;
                            var6 = var3 + 3;
                            var138 *= var6;
                            var138 &= 7;
                            if (var138 != 0) {
                                var2 -= -911886717;
                                var2 |= -1849958464;
                                var2 -= 1454997574;
                                var2 ^= 262612869;
                                break label147;
                            }

                            var2 >>>= 22;
                            var2 >>>= 12;
                            var2 ^= 1005807166;
                            long var143 = var2;
                            var7 = var143 + 1L;
                            var7 = var143 * var7;
                            long var144 = var7 & 1L;
                            long var180;
                            var138 = (var180 = var144 - 0L) == 0L ? 0 : (var180 < 0L ? -1 : 1);
                            if (var138 != 0) {
                                break label150;
                            }

                            var116 = var115;
                            var2 >>= 20;
                            var2 -= 1492137272;
                            var2 |= -1576763943;
                            var2 ^= 2096137713;
                        } else {
                            var2 -= 1831142714;
                            var2 -= -921501677;
                            var2 &= -1577721052;
                            var2 ^= 1448342832;
                            var136 = var2;
                            if (var136 == null) {
                                break label150;
                            }

                            boolean var147 = var1.equals("ui_toggle_off");
                            Integer var164 = var3;
                            if (var164 == null) {
                                var2 |= -1343502611;
                                var2 &= 486271910;
                                var2 ^= 1880800151;
                                break label147;
                            }

                            var2 |= 1040234695;
                            var2 -= -2069174165;
                            var2 &= 704973809;
                            var2 += -1550235943;
                            var2 ^= -1998950752;
                            long var165 = var2;
                            long var8 = var165 + 1L;
                            var8 = var165 * var8;
                            long var166 = var8 & 1L;
                            long var181;
                            int var167 = (var181 = var166 - 0L) == 0L ? 0 : (var181 < 0L ? -1 : 1);
                            if (var167 != 0) {
                                break label150;
                            }

                            if (var147) {
                                var2 = switch (var2) {
                                    case 945450863 -> var2 ^ 100384711;
                                    default -> var2 ^ 1262558857;
                                    case 1162093721 -> {
                                        var2 -= -2221529;
                                        var2 ^= -397140806;
                                        var2 ^= -1582885970;
                                        var2 += 319068862;
                                        yield var2 ^ -915286650;
                                    }
                                };
                                String var148 = "ui_chime_off";
                                Integer var168 = var3;
                                if (var168 == null) {
                                    var2 <<= 28;
                                    var2 ^= 1289844787;
                                    break label147;
                                }
                                var2 = switch (var2) {
                                    case -689408606 -> {
                                        var2 ^= -561607632;
                                        var2 *= -1370691653;
                                        var2 |= 975800275;
                                        var2 += 649146045;
                                        yield var2 ^ -473888714;
                                    }
                                    case -396929543 -> var2 ^ -1687269343;
                                    default -> var2 ^ -619241819;
                                };
                                var116 = var148;
                                var2 <<= 23;
                                var2 ^= -1694533074;
                            } else {
                                var2 *= 265097277;
                                var2 *= -1697467875;
                                var2 &= -517231532;
                                var2 ^= 1968934155;
                                var116 = var1;
                                var2 ^= 1700796644;
                                var2 += 1269125255;
                                var2 += -1237416692;
                                var2 >>>= 24;
                                var2 ^= -604013921;
                            }
                        }
                    } else {
                        var2 <<= 15;
                        var2 ^= -223558643;
                        var131 = var2 + 1;
                        var131 = var2 * var131;
                        var131 &= 1;
                        if (var131 != 0) {
                            break label150;
                        }

                        var116 = var1;
                        var2 ^= 1230525343;
                        var2 ^= -1879675460;
                    }

                    var131 = var2 + 1;
                    var131 = var2 * var131;
                    var131 &= 1;
                    if (var131 != 0) {
                        break label150;
                    }

                    Fp var155 = this.C;
                    Integer var103 = var3;
                    if (var103 != null) {
                        var2 |= 1758670755;
                        var2 -= -1719012968;
                        var2 ^= 484461073;
                        int var104 = var2 + 1;
                        var104 = var2 * var104;
                        var104 &= 1;
                        if (var104 == 0) {
                            HP var107 = HP.Aa();
                            boolean var108 = var155.t(var116, var107);
                            return;
                        }
                        break label150;
                    }

                    var2 ^= -550298144;
                    var2 -= 1792718453;
                    var2 ^= -183449238;
                } else {
                    var2 *= 1126001621;
                    var2 ^= -484749827;
                }
            } else {
                var2 -= -1776341016;
                var2 ^= -781046920;
            }

            long var97 = var2;
            long var117 = var97 + 1L;
            long var118 = var97 * var117;
            long var169 = var97 + 2L;
            long var119 = var118 * var169;
            long var98 = var97 + 3L;
            long var120 = var119 * var98;
            long var99 = var120 & 7L;
            long var182;
            var2 = (var182 = var99 - 0L) == 0L ? 0 : (var182 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var102 = new AssertionError();
                throw var102;
            }
        }

        IllegalStateException var101 = new IllegalStateException();
        throw var101;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1095781175;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        X = var4;
    }
}
