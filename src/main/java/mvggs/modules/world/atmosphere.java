package mvggs.modules.world;

import dev.aurap.hub.*;
import dev.aurap.hub.Module;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.fx.ScreenEffects;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public final class atmosphere extends Module {
    private final BooleanSetting fA;
    private final NumberSetting Ov;
    private final ColorSetting y;
    private final BooleanSetting M;
    private final NumberSetting pm;
    private final BooleanSetting T;
    private final XF t;
    private float LV;
    public static final int Ki;

    public atmosphere() {
        super("atmosphere", "Atmosphere", ModuleCategory.WORLD);
        ModuleCategory var1 = ModuleCategory.WORLD;

        BooleanSetting var3 = new BooleanSetting("low_health", "Low Health Vignette", true);
        Setting var4 = this.addSetting(var3);
        BooleanSetting var5 = (BooleanSetting)var4;
        this.fA = var5;
        NumberSetting var6 = new NumberSetting("threshold", "Threshold", 0.4F, 0.1F, 0.8F);
        NumberSetting var7 = var6.W(0.05F);
        Setting var8 = this.addSetting(var7);
        NumberSetting var9 = (NumberSetting)var8;
        this.Ov = var9;
        ColorSetting var10 = new ColorSetting("vignette_color", "Vignette Color", -7729381, false);
        Setting var11 = this.addSetting(var10);
        ColorSetting var12 = (ColorSetting)var11;
        this.y = var12;
        BooleanSetting var13 = new BooleanSetting("hurt_aberration", "Hurt Aberration", false);
        Setting var14 = this.addSetting(var13);
        BooleanSetting var15 = (BooleanSetting)var14;
        this.M = var15;
        NumberSetting var16 = new NumberSetting("aberration", "Aberration", 2.0F, 1.0F, 20.0F);
        NumberSetting var17 = var16.W(0.5F);
        NumberSetting var18 = var17.L("px");
        Setting var19 = this.addSetting(var18);
        NumberSetting var20 = (NumberSetting)var19;
        this.pm = var20;
        BooleanSetting var21 = new BooleanSetting("desaturate", "Desaturate", false);
        Setting var22 = this.addSetting(var21);
        BooleanSetting var23 = (BooleanSetting)var22;
        this.T = var23;
        kE_2 var2 = kE_2.uY(0.5F, 1.0F);
        XF var24 = new XF(0.0F, var2);
        this.t = var24;
        this.dy("Low-health vignette, hurt aberration and desaturation.");
        this.fJ(true);
        EventListener<GN> var25 = (GN var1x) -> {
            int var2x = Ki;
            var2x ^= -1349289164;
            int var3x = System.identityHashCode(this);
            long var21x = var3x;
            long var5x = var21x + 1L;
            var5x = var21x * var5x;
            long var7x = var21x + 2L;
            var5x *= var7x;
            long var22x = var21x + 3L;
            var5x *= var22x;
            long var23x = var5x & 7L;
            long var32;
            var3x = (var32 = var23x - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
            if (var3x != 0) {
                var2x += -1295159123;
                var2x |= 21847993;
                var2x ^= 709940800;
                Integer var25x = var2x;
                if (var25x != null) {
                    UnsupportedOperationException var26x = new UnsupportedOperationException();
                    throw var26x;
                }
            } else {
                var2x &= -480742543;
                var2x -= 1750020886;
                var2x ^= -1785525573;
                Integer var27x = var2x;
                if (var27x != null) {
                    Entity var28 = var1x.entity();
                    var2x &= -646283294;
                    var2x <<= 24;
                    var2x &= 896572301;
                    var2x ^= 1515071868;
                    this.qX(var28, var2x);
                    return;
                }
            }

            IllegalArgumentException var16x = new IllegalArgumentException();
            throw var16x;
        };
        this.onEvent(GN.class, var25);
        EventListener<PC> var26 = (PC var1x) -> {
            int var2x = Ki;
            var2x ^= -1239977177;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            int var5x = var3x + 2;
            var4x *= var5x;
            var3x += 3;
            var4x *= var3x;
            var3x = var4x & 7;
            if (var3x != 0) {
                switch (var2x) {
                    case -1682489532:
                        var2x ^= 2144421218;
                        break;
                    case 505738754:
                    default:
                        var2x ^= -92610054;
                        break;
                    case 545374720:
                        var2x -= -547942203;
                        var2x &= 1428143025;
                        var2x ^= 1171973689;
                        var2x <<= 31;
                        var2x ^= -2087565860;
                }

                RuntimeException var28 = new RuntimeException();
                throw var28;
            } else {
                var2x -= -1600604323;
                var2x >>= 27;
                var2x &= 1913540879;
                var2x ^= 583350494;
                Integer var25x = var2x;
                if (var25x == null) {
                    IllegalArgumentException var27x = new IllegalArgumentException();
                    throw var27x;
                } else {
                    Entity var26x = var1x.victim();
                    var2x &= 1965495563;
                    var2x *= 767818915;
                    var2x -= -1147785970;
                    var2x |= -520487322;
                    var2x ^= -1145973109;
                    this.qX(var26x, var2x);
                }
            }
        };
        this.onEvent(PC.class, var26);
        EventListener<p_2> var27 = (p_2 var1x) -> {
            int var2x = Ki;
            var2x ^= 510179138;
            int var3x = System.identityHashCode(this);
            int var4x = var3x + 1;
            var4x = var3x * var4x;
            var3x = var4x & 1;
            if (var3x != 0) {
                switch (var2x) {
                    case -1996618139:
                        var2x ^= 1951015117;
                        var2x -= -401342535;
                        var2x <<= 24;
                        var2x ^= -1907247058;
                        break;
                    case -1370147766:
                        var2x ^= -1213932619;
                        break;
                    case 772336007:
                    default:
                        var2x ^= 1224442228;
                }

                IllegalStateException var28 = new IllegalStateException();
                throw var28;
            } else {
                var2x >>>= 23;
                var2x ^= 962477007;
                var3x = var2x + 1;
                var3x = var2x * var3x;
                var4x = var2x + 2;
                var3x *= var4x;
                var4x = var2x + 3;
                var3x *= var4x;
                var3x &= 7;
                if (var3x != 0) {
                    IllegalArgumentException var27x = new IllegalArgumentException();
                    throw var27x;
                } else {
                    FrameContext var25x = var1x.frame();
                    float var26x = var25x.dt();
                    var2x ^= -1766874196;
                    var2x -= 1636981392;
                    var2x |= -2007763906;
                    var2x += 721149631;
                    var2x ^= -467865610;
                    this.x(var26x, var2x);
                }
            }
        };
        this.onEvent(p_2.class, var27);
    }

    private void qX(Entity var1, int var2) {
        label71: {
            int var4 = System.identityHashCode(this);
            BooleanSetting var5 = this.M;
            long var6 = var4;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            var6 = var8 & 1L;
            long var87;
            int var72 = (var87 = var6 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
            int var38;
            if (var72 != 0) {
                switch (var2) {
                    case -1554701072:
                        var38 = var2 ^ 1836884747;
                        break;
                    case 796550668:
                    default:
                        var38 = var2 ^ -1095741382;
                        break;
                    case 1515071868:
                        var38 = var2 ^ 547720770;
                        var38 >>= 31;
                        var38 &= -330565561;
                        var38 *= 1107293031;
                        var38 ^= -805757300;
                }
            } else {
                label70: {
                    var38 = var2 + -1237431323;
                    var38 -= 1735817340;
                    var38 &= 643972221;
                    var38 ^= 625626228;
                    Integer var73 = var38;
                    if (var73 == null) {
                        break label71;
                    }

                    boolean var65 = var5.vb();
                    if (var65) {
                        var38 -= -8655929;
                        var38 += 576153548;
                        var38 ^= 1301570809;
                        var38 ^= 1378274610;
                        Integer var66 = var38;
                        if (var66 == null) {
                            break label71;
                        }

                        Entity var67 = i_2.QI();
                        var6 = var4;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        long var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var88;
                        int var77 = (var88 = var6 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                        if (var77 != 0) {
                            var38 -= -979467095;
                            var38 >>= 17;
                            var38 >>>= 28;
                            var38 += -1848151198;
                            var38 ^= 1580101102;
                            break label70;
                        }

                        var38 >>>= 6;
                        var38 += 232066630;
                        var38 ^= -100459933;
                        var38 &= 426308793;
                        var38 ^= -212504263;
                        if (var1 == var67) {
                            var38 <<= 13;
                            var38 ^= 1948168377;
                            var38 >>= 31;
                            var38 ^= -1912787057;
                            XF var68 = this.t;
                            var68.j(1.0F);
                            XF var69 = this.t;
                            int var78 = var4 + 1;
                            int var79 = var4 * var78;
                            int var7 = var4 + 2;
                            int var80 = var79 * var7;
                            var4 += 3;
                            int var81 = var80 * var4;
                            var4 = var81 & 7;
                            if (var4 != 0) {
                                switch (var38) {
                                    case -765424884:
                                        var38 ^= -1401348386;
                                        break label70;
                                    case 1180703684:
                                    default:
                                        var38 ^= -1353976748;
                                        break label70;
                                    case 1912787056:
                                        var38 |= 1310159457;
                                        var38 *= -1727484927;
                                        var38 -= -1627655394;
                                        var38 ^= -578882081;
                                        break label70;
                                }
                            }

                            var38 += 552842158;
                            var38 <<= 10;
                            var38 ^= -2098754566;
                            var38 += 476257708;
                            var38 ^= -1035704668;
                            var69.H(0.0F);
                            switch (var38) {
                                case -1222674686:
                                    var38 |= -1892607228;
                                    var38 ^= -1705680198;
                                    break;
                                case 656856722:
                                    var38 ^= 436173098;
                                    break;
                                case 1607355744:
                                default:
                                    var38 ^= -1157262609;
                            }
                        } else {
                            var38 >>= 3;
                            var38 ^= -654000740;
                        }
                    } else {
                        var38 -= -1701815315;
                        var38 >>= 24;
                        var38 |= 340618463;
                        var38 &= 1677766588;
                        var38 ^= 560607488;
                    }

                    var4 = var38 + 1;
                    var4 = var38 * var4;
                    int var70 = var38 + 2;
                    var4 *= var70;
                    var38 += 3;
                    var4 *= var38;
                    var38 = var4 & 7;
                    if (var38 == 0) {
                        return;
                    }
                    break label71;
                }
            }

            var4 = var38 + 1;
            var4 = var38 * var4;
            var4 &= 1;
            if (var4 == 0) {
                UnsupportedOperationException var64 = new UnsupportedOperationException();
                throw var64;
            }
        }

        RuntimeException var54 = new RuntimeException();
        throw var54;
    }

    private void x(float var1, int var2) {
        int var4 = System.identityHashCode(this);
        ClientRuntime var5 = ClientRuntime.Z();
        AuraRenderer var140 = var5.ZP();
        ScreenEffects var141 = var140.screenEffects();
        XF var6 = this.t;
        float var142 = var6.N(var1);
        float var277;
        int var7 = (var277 = var142 - 0.01F) == 0.0F ? 0 : (var277 < 0.0F ? -1 : 1);
        int var8 = var4 + 1;
        var8 = var4 * var8;
        int var9 = var4 + 2;
        var8 *= var9;
        var9 = var4 + 3;
        var8 *= var9;
        var8 &= 7;
        label195:
        if (var8 == 0) {
            int var23 = switch (var2) {
                case -1762476389 -> var2 ^ -1157358530;
                default -> var2 ^ -2078749056;
                case 491205195 -> {
                    int var19 = var2 << 11;
                    var19 += -1098848812;
                    var19 -= 1232021893;
                    var19 |= -1263434838;
                    yield var19 ^ -1765456388;
                }
            };
            long var200 = var23;
            long var10 = var200 + 1L;
            var10 = var200 * var10;
            long var201 = var10 & 1L;
            long var278;
            var8 = (var278 = var201 - 0L) == 0L ? 0 : (var278 < 0L ? -1 : 1);
            label192:
            if (var8 == 0) {
                if (var7 > 0) {
                    var23 &= -381695053;
                    var23 -= 1086216857;
                    var23 ^= -1470648834;
                    Integer var154 = var23;
                    if (var154 == null) {
                        break label192;
                    }

                    NumberSetting var155 = this.pm;
                    Integer var203 = var4;
                    if (var203 == null) {
                        var23 |= -1753946397;
                        var23 += 777595416;
                        var23 += -992036182;
                        var23 -= 684090294;
                        var23 ^= 1764361919;
                        break label195;
                    }

                    var23 >>>= 25;
                    var23 *= -1370394329;
                    var23 ^= 193727835;
                    int var204 = var23 + 1;
                    var204 = var23 * var204;
                    var9 = var23 + 2;
                    var204 *= var9;
                    var9 = var23 + 3;
                    var204 *= var9;
                    var204 &= 7;
                    if (var204 != 0) {
                        break label192;
                    }

                    float var156 = var155.WM();
                    float var143 = var156 * var142;
                    var141.aberration(var143);
                    var23 -= 1195252421;
                    var23 -= 1546635286;
                    var23 *= 850990643;
                    var23 ^= 1253854912;
                } else {
                    var23 += -1343255662;
                    var23 &= -1579472532;
                    var23 *= -955164729;
                    var23 >>= 5;
                    var23 ^= -483393206;
                }

                Entity var144 = i_2.QI();
                long var157 = var4;
                long var240 = var157 + 1L;
                long var241 = var157 * var240;
                long var158 = var241 & 1L;
                long var279;
                var7 = (var279 = var158 - 0L) == 0L ? 0 : (var279 < 0L ? -1 : 1);
                if (var7 != 0) {
                    var23 &= 44458514;
                    var23 &= -106850573;
                    var23 -= 855226785;
                    var23 ^= 958353641;
                    var23 ^= 886337994;
                    break label195;
                }

                var23 |= -1731005394;
                var23 -= 557539824;
                var23 ^= -1979039718;
                long var160 = var23;
                long var242 = var160 + 1L;
                long var243 = var160 * var242;
                long var11 = var160 + 2L;
                long var244 = var243 * var11;
                long var161 = var160 + 3L;
                long var245 = var244 * var161;
                long var162 = var245 & 7L;
                long var280;
                var7 = (var280 = var162 - 0L) == 0L ? 0 : (var280 < 0L ? -1 : 1);
                label182:
                if (var7 == 0) {
                    int var164 = (var144 instanceof LivingEntity) ? 1 : 0;
                    if (var164 != 0) {
                        var23 = switch (var23) {
                            default -> var23 ^ -262845111;
                            case 622986345 -> var23 ^ -1478192279;
                            case 1352521237 -> {
                                var23 |= 1265353257;
                                var23 += 1676893192;
                                var23 <<= 4;
                                var23 |= 380705047;
                                yield var23 ^ -1578425989;
                            }
                        };
                        Integer var165 = var23;
                        if (var165 == null) {
                            break label182;
                        }

                        LivingEntity var145 = (LivingEntity)var144;
                        var164 = i_2.dw() ? 1 : 0;
                        var8 = var4 + 1;
                        var8 = var4 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            var23 *= 1309135825;
                            var23 ^= 311831200;
                            break label195;
                        }

                        var23 *= -1080715597;
                        var23 ^= 1016111526;
                        Integer var212 = var23;
                        if (var212 == null) {
                            break label182;
                        }

                        if (var164 == 0) {
                            var23 &= 1521736139;
                            var23 ^= -367821637;
                            var23 |= 386930526;
                            var23 ^= 1731509656;
                            long var167 = var23;
                            long var246 = var167 + 1L;
                            long var247 = var167 * var246;
                            long var168 = var247 & 1L;
                            long var281;
                            var164 = (var281 = var168 - 0L) == 0L ? 0 : (var281 < 0L ? -1 : 1);
                            if (var164 == 0) {
                                float var170 = var145.getHealth();
                                int var213 = var4 + 1;
                                var213 = var4 * var213;
                                var213 &= 1;
                                if (var213 != 0) {
                                    var23 &= 132138081;
                                    var23 ^= -1060280019;
                                    break label195;
                                }

                                var23 &= 1029215731;
                                var23 |= -2042252707;
                                var23 ^= 2002321162;
                                var213 = var23 + 1;
                                var213 = var23 * var213;
                                var9 = var23 + 2;
                                var213 *= var9;
                                var9 = var23 + 3;
                                var213 *= var9;
                                var213 &= 7;
                                if (var213 == 0) {
                                    float var146 = var145.getMaxHealth();
                                    float var147 = Math.max(1.0F, var146);
                                    float var148 = var170 / var147;
                                    float var149 = TP.S(var148);
                                    NumberSetting var171 = this.Ov;
                                    float var172 = var171.WM();
                                    float var150 = var149 / var172;
                                    float var151 = 1.0F - var150;
                                    float var152 = TP.S(var151);
                                    float var282;
                                    int var173 = (var282 = var152 - 0.0F) == 0.0F ? 0 : (var282 < 0.0F ? -1 : 1);
                                    if (var173 <= 0) {
                                        var23 >>>= 5;
                                        var23 ^= 1881261178;
                                        var23 ^= 1210199504;
                                        Integer var174 = var23;
                                        if (var174 != null) {
                                            return;
                                        }
                                    } else {
                                        var23 >>= 1;
                                        var23 ^= 530227053;
                                        float var175 = this.LV;
                                        float var221 = TP.GO(70.0F, 140.0F, var152);
                                        float var222 = var1 * var221;
                                        float var223 = var222 / 60.0F;
                                        float var176 = var175 + var223;
                                        this.LV = var176;
                                        float var177 = this.LV;
                                        float var178 = var177 * (float) (Math.PI * 2);
                                        double var179 = var178;
                                        Integer var250 = var4;
                                        if (var250 == null) {
                                            switch (var23) {
                                                case -1693259001:
                                                    var23 ^= -966485581;
                                                    break label195;
                                                case -1284658026:
                                                default:
                                                    var23 ^= -1125087085;
                                                    break label195;
                                                case -283887145:
                                                    var23 <<= 8;
                                                    var23 ^= -722158004;
                                                    break label195;
                                            }
                                        }

                                        var23 *= -1817095879;
                                        var23 ^= 89120576;
                                        int var251 = var23 + 1;
                                        var251 = var23 * var251;
                                        int var266 = var23 + 2;
                                        var251 *= var266;
                                        int var267 = var23 + 3;
                                        var251 *= var267;
                                        var251 &= 7;
                                        if (var251 == 0) {
                                            double var180 = Math.sin(var179);
                                            double var181 = Math.max(0.0, var180);
                                            double var182 = Math.pow(var181, 8.0);
                                            float var183 = (float)var182;
                                            BooleanSetting var224 = this.fA;
                                            int var225 = (var224.vb()) ? 1 : 0;
                                            if (var225 != 0) {
                                                var23 ^= -412379885;
                                                var23 *= -557385747;
                                                var23 += -372168564;
                                                var23 <<= 9;
                                                var23 ^= 1740114623;
                                                Integer var226 = var23;
                                                if (var226 == null) {
                                                    break label182;
                                                }

                                                float var227 = 0.3F * var152;
                                                float var228 = 0.08F + var227;
                                                float var184 = 0.06F * var183;
                                                float var185 = var184 * var152;
                                                long var256 = var4;
                                                var11 = var256 + 1L;
                                                var11 = var256 * var11;
                                                long var13 = var256 + 2L;
                                                var11 *= var13;
                                                long var257 = var256 + 3L;
                                                var11 *= var257;
                                                long var258 = var11 & 7L;
                                                long var283;
                                                var251 = (var283 = var258 - 0L) == 0L ? 0 : (var283 < 0L ? -1 : 1);
                                                if (var251 != 0) {
                                                    var23 &= -1069852468;
                                                    var23 <<= 8;
                                                    var23 &= 1111195574;
                                                    var23 ^= -1026202292;
                                                    break label195;
                                                }

                                                var23 <<= 10;
                                                var23 ^= 822486316;
                                                long var260 = var23;
                                                var11 = var260 + 1L;
                                                var11 = var260 * var11;
                                                var13 = var260 + 2L;
                                                var11 *= var13;
                                                long var261 = var260 + 3L;
                                                var11 *= var261;
                                                long var262 = var11 & 7L;
                                                long var284;
                                                var251 = (var284 = var262 - 0L) == 0L ? 0 : (var284 < 0L ? -1 : 1);
                                                if (var251 != 0) {
                                                    break label182;
                                                }

                                                float var186 = var228 + var185;
                                                ColorSetting var229 = this.y;
                                                var225 = var229.zz();
                                                float var264 = TP.GO(0.8F, 0.65F, var152);
                                                var141.vignette(var186, var225, var264, 1.1F);
                                                var23 >>>= 8;
                                                var23 &= 1061566003;
                                                var23 ^= -700477281;
                                                var23 &= 62994072;
                                                var23 ^= 918703799;
                                            } else {
                                                var23 ^= 311814719;
                                                var23 ^= 925739167;
                                            }

                                            BooleanSetting var187 = this.T;
                                            int var188 = (var187.vb()) ? 1 : 0;
                                            var225 = var4 + 1;
                                            var225 = var4 * var225;
                                            var225 &= 1;
                                            if (var225 != 0) {
                                                var23 *= -1847353499;
                                                var23 &= 1982591010;
                                                var23 >>>= 18;
                                                var23 ^= -1060277178;
                                                break label195;
                                            }

                                            var23 >>= 30;
                                            var23 >>= 10;
                                            var23 *= -724774699;
                                            var23 ^= 780290284;
                                            Integer var234 = var23;
                                            if (var234 != null) {
                                                if (var188 != 0) {
                                                    var23 ^= 1792592700;
                                                    var23 >>= 13;
                                                    var23 ^= 1520387683;
                                                    var188 = var23 + 1;
                                                    var188 = var23 * var188;
                                                    int var235 = var23 + 2;
                                                    var188 *= var235;
                                                    var235 = var23 + 3;
                                                    var188 *= var235;
                                                    var188 &= 7;
                                                    if (var188 != 0) {
                                                        break label182;
                                                    }

                                                    float var153 = 0.25F * var152;
                                                    Integer var130 = var4;
                                                    if (var130 == null) {
                                                        switch (var23) {
                                                            case 1045862698:
                                                                var23 ^= -324453800;
                                                                break label195;
                                                            case 1520264375:
                                                                var23 |= 904802595;
                                                                var23 ^= -1087234821;
                                                                break label195;
                                                            case 1798282457:
                                                            default:
                                                                var23 ^= 1032184337;
                                                                break label195;
                                                        }
                                                    }

                                                    var23 -= -1747583927;
                                                    var23 &= 1341582891;
                                                    var23 += 2096052176;
                                                    var23 |= -965043580;
                                                    var23 ^= 803261848;
                                                    int var131 = var23 + 1;
                                                    var131 = var23 * var131;
                                                    var188 = var23 + 2;
                                                    var131 *= var188;
                                                    var188 = var23 + 3;
                                                    var131 *= var188;
                                                    var131 &= 7;
                                                    if (var131 != 0) {
                                                        break label182;
                                                    }

                                                    float var136 = 1.0F - var153;
                                                    var141.saturation(var136);
                                                    var23 *= -624338497;
                                                    var23 += 339368183;
                                                    var23 ^= 813267508;
                                                } else {
                                                    switch (var23) {
                                                        case -1394727929:
                                                        default:
                                                            var23 ^= -1273973008;
                                                            break;
                                                        case -1121475654:
                                                            var23 ^= -851157132;
                                                            break;
                                                        case 780290284:
                                                            var23 -= 808839017;
                                                            var23 *= -1254786853;
                                                            var23 >>= 11;
                                                            var23 ^= -47696289;
                                                    }
                                                }

                                                Integer var137 = var23;
                                                if (var137 != null) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break label182;
                        }

                        switch (var23) {
                            case -316023966:
                                var23 &= 1652565730;
                                var23 ^= 1966305218;
                                break;
                            case -175767701:
                            default:
                                var23 ^= 967041588;
                                break;
                            case 771237428:
                                var23 ^= -2041013776;
                        }
                    } else {
                        switch (var23) {
                            case -1641064435:
                            default:
                                var23 ^= 598682130;
                                break;
                            case 1352521237:
                                var23 ^= -412700247;
                                var23 |= 1712260159;
                                var23 &= 1781741407;
                                var23 &= 44129335;
                                var23 ^= 387082679;
                                break;
                            case 2132601156:
                                var23 ^= 1890150680;
                        }
                    }

                    Integer var138 = var23;
                    if (var138 != null) {
                        return;
                    }
                }
            }

            RuntimeException var139 = new RuntimeException();
            throw var139;
        } else {
            int var3 = var2 | -298307702;
            var3 *= -1880299061;
            var3 ^= -1581444084;
            var3 ^= -1092081486;
            var3 ^= 1082330379;
        }

        RuntimeException var129 = new RuntimeException();
        throw var129;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1729985698;
        int var2 = Module.C;
        int var4 = of_2.kj(var3, var1, var2);
        Ki = var4;
    }
}
