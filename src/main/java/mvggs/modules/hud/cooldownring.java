package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.client.render.FrameContext;
import dev.skidware.visuals.client.render.RenderPhase;
import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class cooldownring extends Yn {
    private final Uq M;
    private final Uq Uw;
    private final Fk l;
    private final Fk yL;
    private final XF HW;
    public static final int b;

    public cooldownring() {
        super("cooldown_ring", "Cooldown Ring", AJ.HUD);
        AJ var1 = AJ.HUD;

        Uq var3 = new Uq("radius", "Radius", 8.0F, 5.0F, 20.0F);
        Uq var4 = var3.W(0.5F);
        xB var5 = this.vn(var4);
        Uq var6 = (Uq)var5;
        this.M = var6;
        Uq var7 = new Uq("thickness", "Thickness", 0.8F, 0.5F, 4.0F);
        Uq var8 = var7.W(0.1F);
        xB var9 = this.vn(var8);
        Uq var10 = (Uq)var9;
        this.Uw = var10;
        Fk var11 = new Fk("from", "Start Color", -7687452);
        xB var12 = this.vn(var11);
        Fk var13 = (Fk)var12;
        this.l = var13;
        Fk var14 = new Fk("to", "End Color", -4859649);
        xB var15 = this.vn(var14);
        Fk var16 = (Fk)var15;
        this.yL = var16;
        kE_2 var2 = kE_2.SMOOTH;
        XF var17 = new XF(0.0F, var2);
        this.HW = var17;
        this.dy("Attack cooldown ring around the crosshair.");
        wD<T> var18 = this::tn;
        this.iI(T.class, var18);
    }

    private void tn(T var1) {
        int var2 = b;
        var2 ^= -899155721;
        int var3 = System.identityHashCode(this);
        RenderPhase var4 = var1.phase();
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var6 = var3 + 3;
        var5 *= var6;
        var5 &= 7;
        if (var5 != 0) {
            var2 &= -984125940;
            var2 ^= 461737712;
        } else {
            label140: {
                var2 >>= 14;
                var2 += 2013143184;
                var2 ^= -1089363961;
                RenderPhase var109 = RenderPhase.UNDERLAY;
                if (var4 != var109) {
                    Integer var99 = switch (var2) {
                        default -> var2 ^ -712208313;
                        case -1297139610 -> var2 ^ 1268452310;
                        case -924022501 -> {
                            var2 <<= 17;
                            var2 &= 333773636;
                            var2 ^= 2098968797;
                            yield var2 ^ -1744344141;
                        }
                    };
                    if (var99 != null) {
                        return;
                    }
                } else {
                    var2 += 1048932106;
                    var2 |= 1683198752;
                    var2 += -2116647987;
                    var2 ^= 1920996954;
                    FrameContext var100 = var1.frame();
                    long var110 = var3;
                    long var7 = var110 + 1L;
                    var7 = var110 * var7;
                    long var9 = var110 + 2L;
                    var7 *= var9;
                    long var111 = var110 + 3L;
                    var7 *= var111;
                    long var112 = var7 & 7L;
                    long var201;
                    var5 = (var201 = var112 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                    if (var5 != 0) {
                        var2 &= -230978888;
                        var2 |= -624803592;
                        var2 *= -1474770711;
                        var2 ^= 433622348;
                        break label140;
                    }
                    var2 = switch (var2) {
                        case -1681233752 -> {
                            var2 += -1949878986;
                            yield var2 ^ -1192032278;
                        }
                        case -1077796945 -> var2 ^ 1669356408;
                        default -> var2 ^ 1606031603;
                    };
                    long var114 = var2;
                    var7 = var114 + 1L;
                    var7 = var114 * var7;
                    long var115 = var7 & 1L;
                    long var202;
                    var5 = (var202 = var115 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                    label127:
                    if (var5 == 0) {
                        float var101 = var100.partialTick();
                        float var102 = i_2.bl(var101);
                        XF var117 = this.HW;
                        float var203;
                        var6 = (var203 = var102 - 0.999F) == 0.0F ? 0 : (var203 < 0.0F ? -1 : 1);
                        float var133;
                        if (var6 < 0) {
                            var2 >>= 23;
                            var2 += 1869936638;
                            var2 *= 1776176015;
                            var2 ^= -1959968655;
                            var6 = var2 + 1;
                            var6 = var2 * var6;
                            int var158 = var2 + 2;
                            var6 *= var158;
                            int var159 = var2 + 3;
                            var6 *= var159;
                            var6 &= 7;
                            if (var6 != 0) {
                                break label127;
                            }

                            var133 = 1.0F;
                            switch (var2) {
                                case -995965939:
                                    var2 ^= 660018024;
                                    break;
                                case -127780944:
                                default:
                                    var2 ^= 1534974858;
                                    break;
                                case 65138421:
                                    var2 += 1239338978;
                                    var2 ^= 1698198197;
                                    var2 -= 1758967973;
                                    var2 ^= 1999443520;
                            }
                        } else {
                            var2 |= 1573985057;
                            var2 += -45735803;
                            var2 >>= 9;
                            var2 -= 1854779272;
                            var2 ^= 120333620;
                            var133 = 0.0F;
                            var2 &= 1891517789;
                            var2 ^= -1493154372;
                        }

                        Integer var160 = var2;
                        if (var160 != null) {
                            var117.H(var133);
                            XF var118 = this.HW;
                            FrameContext var134 = var1.frame();
                            float var135 = var134.dt();
                            float var119 = var118.N(var135);
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            var6 &= 1;
                            if (var6 != 0) {
                                var2 += 1740320984;
                                var2 ^= -985558495;
                                break label140;
                            }
                            var2 = switch (var2) {
                                case -1337476272 -> var2 ^ 158893962;
                                case -1223948803 -> {
                                    var2 *= -1812116025;
                                    var2 ^= 1402687786;
                                    yield var2 ^ 904010750;
                                }
                                default -> var2 ^ -425244851;
                            };
                            long var139 = var2;
                            long var8 = var139 + 1L;
                            var8 = var139 * var8;
                            long var10 = var139 + 2L;
                            var8 *= var10;
                            long var140 = var139 + 3L;
                            var8 *= var140;
                            long var141 = var8 & 7L;
                            long var204;
                            var6 = (var204 = var141 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                            label117:
                            if (var6 == 0) {
                                float var205;
                                var6 = (var205 = var119 - 0.01F) == 0.0F ? 0 : (var205 < 0.0F ? -1 : 1);
                                if (var6 >= 0) {
                                    var2 += -2139217188;
                                    var2 ^= -1131314715;
                                    var2 >>>= 6;
                                    var2 *= -1372738655;
                                    var2 ^= -1098540305;
                                    FrameContext var144 = var1.frame();
                                    int var145 = var144.hideGui() ? 1 : 0;
                                    int var161 = var3 + 1;
                                    int var162 = var3 * var161;
                                    int var163 = var162 & 1;
                                    if (var163 != 0) {
                                        var2 >>= 27;
                                        var2 ^= 611932939;
                                        break label140;
                                    }

                                    var2 >>>= 28;
                                    var2 ^= -1614387414;
                                    var2 ^= -1557961302;
                                    Integer var164 = var2;
                                    if (var164 == null) {
                                        break label117;
                                    }

                                    if (var145 == 0) {
                                        var2 >>>= 25;
                                        var2 |= 979932458;
                                        var2 ^= -997583781;
                                        FrameContext var146 = var1.frame();
                                        var145 = var146.screenOpen() ? 1 : 0;
                                        var7 = var3;
                                        var9 = var7 + 1L;
                                        var9 = var7 * var9;
                                        long var11 = var7 + 2L;
                                        var9 *= var11;
                                        var7 += 3L;
                                        var9 *= var7;
                                        var7 = var9 & 7L;
                                        long var206;
                                        int var168 = (var206 = var7 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                                        if (var168 != 0) {
                                            var2 -= -106365825;
                                            var2 &= 509508764;
                                            var2 ^= -543252368;
                                            break label140;
                                        }

                                        var2 *= 1378894701;
                                        var2 ^= -1842051557;
                                        Integer var169 = var2;
                                        if (var169 == null) {
                                            break label117;
                                        }

                                        if (var145 == 0) {
                                            var2 += 1789366266;
                                            var2 ^= 665044238;
                                            long var148 = var2;
                                            var8 = var148 + 1L;
                                            var8 = var148 * var8;
                                            var10 = var148 + 2L;
                                            var8 *= var10;
                                            long var149 = var148 + 3L;
                                            var8 *= var149;
                                            long var150 = var8 & 7L;
                                            long var207;
                                            var145 = (var207 = var150 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                                            if (var145 == 0) {
                                                Canvas var152 = var1.canvas();
                                                float var170 = var152.width();
                                                float var171 = var170 * 0.5F;
                                                float var180 = var152.height();
                                                float var181 = var180 * 0.5F;
                                                Uq var186 = this.M;
                                                var10 = var3;
                                                long var12 = var10 + 1L;
                                                var12 = var10 * var12;
                                                var10 = var12 & 1L;
                                                long var208;
                                                var3 = (var208 = var10 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                                                if (var3 == 0) {
                                                    var2 <<= 5;
                                                    var2 ^= 1530291965;
                                                    float var93 = var186.WM();
                                                    Uq var187 = this.Uw;
                                                    float var188 = var187.WM();
                                                    float var192 = (float) (-Math.PI / 2);
                                                    int var193 = DP.nq(1073741824, var119);
                                                    Paint var194 = Paint.solid(var193);
                                                    var152.arc(var171, var181, var93, var188, 0.0F, (float) (Math.PI * 2), var194);
                                                    float var103 = TP.S(var102);
                                                    float var104 = (float) (Math.PI * 2) * var103;
                                                    Fk var195 = this.l;
                                                    int var196 = var195.zz();
                                                    int var197 = DP.nq(var196, var119);
                                                    Fk var199 = this.yL;
                                                    int var200 = var199.zz();
                                                    var5 = DP.nq(var200, var119);
                                                    Paint var121 = Paint.conic(var197, var5, 0.0F);
                                                    var152.arc(var171, var181, var93, var188, var192, var104, var121);
                                                    return;
                                                }

                                                var2 &= -2081321804;
                                                var2 -= 638087629;
                                                var2 ^= 25245367;
                                                break label140;
                                            }
                                            break label117;
                                        }

                                        switch (var2) {
                                            case -2098373287:
                                            default:
                                                var2 ^= 874082454;
                                                break;
                                            case -965585256:
                                                var2 ^= -1848071119;
                                                break;
                                            case -116784870:
                                                var2 ^= 164510772;
                                                var2 -= 831952570;
                                                var2 *= 1197493483;
                                                var2 *= 1385742427;
                                                var2 ^= 413248589;
                                        }
                                    } else {
                                        var2 -= 253567819;
                                        var2 >>>= 20;
                                        var2 ^= -1715943839;
                                        var2 += -558611931;
                                        var2 ^= -361485637;
                                    }
                                } else {
                                    var2 += 1015034958;
                                    var2 ^= 1644117434;
                                    var2 <<= 15;
                                    var2 |= -167703674;
                                    var2 ^= 1705158623;
                                }

                                long var94 = var2;
                                long var122 = var94 + 1L;
                                long var123 = var94 * var122;
                                var7 = var94 + 2L;
                                long var124 = var123 * var7;
                                long var95 = var94 + 3L;
                                long var125 = var124 * var95;
                                long var96 = var125 & 7L;
                                long var209;
                                var3 = (var209 = var96 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                                if (var3 == 0) {
                                    return;
                                }
                            }
                        }
                    }
                }

                IllegalArgumentException var98 = new IllegalArgumentException();
                throw var98;
            }
        }

        AssertionError var91 = new AssertionError();
        throw var91;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1947698709;
        int var2 = Yn.C;
        int var4 = of_2.ro(var3, var1, var2);
        b = var4;
    }
}
