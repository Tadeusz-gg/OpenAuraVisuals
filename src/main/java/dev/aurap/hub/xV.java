package dev.aurap.hub;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Glass;
import dev.skidware.visuals.render.canvas.Paint;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class xV {
    public static final float l = 148.0F;
    public static final float a = 32.0F;
    private static final float F = 0.0F;
    private static final float i = 5.0F;
    private static final float qr = 3.0F;
    private final ModuleCategory q;
    private final List z;
    private final List Mm;
    private final XF SW;
    private final XF c;
    private float mQ;
    private float m;
    private float tl;
    private float ZO;
    public static final int TA;

    public xV(ModuleCategory var1, List var2) {
        ArrayList var3 = new ArrayList();
        this.z = var3;
        var3 = new ArrayList();
        this.Mm = var3;
        Object var4 = kE_2.uY(0.4F, 0.9F);
        XF var8 = new XF(Float.NaN, (kE_2)var4);
        this.SW = var8;
        var4 = kE_2.uY(0.25F, 1.0F);
        XF var9 = new XF(0.0F, (kE_2)var4);
        this.c = var9;
        this.q = var1;
        Iterator var10 = var2.iterator();
        Iterator var11 = var10;

        while (true) {
            boolean var13 = var11.hasNext();
            if (!var13) {
                return;
            }

            var4 = var11.next();
            Module var15 = (Module)var4;
            boolean var5 = var15.y();
            if (!var5) {
                List var17 = this.z;
                pk var6 = new pk(var15);
                boolean var16 = var17.add(var6);
            }
        }
    }

    public ModuleCategory Uj() {
        int var1 = TA;
        var1 ^= 343141990;
        int var2 = System.identityHashCode(this);
        long var13 = var2;
        long var4 = var13 + 1L;
        var4 = var13 * var4;
        long var14 = var4 & 1L;
        long var24;
        var2 = (var24 = var14 - 0L) == 0L ? 0 : (var24 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -2038851873;
            var1 &= 996576041;
            var1 ^= 1772251090;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return this.q;
            } else {
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        } else {
            var1 -= 410752704;
            var1 ^= 165033269;
            IllegalArgumentException var9 = new IllegalArgumentException();
            throw var9;
        }
    }

    public List F() {
        int var1 = TA;
        var1 ^= -1276336963;
        int var2 = System.identityHashCode(this);
        Integer var12 = var2;
        if (var12 == null) {
            var1 -= 1725570392;
            var1 -= -1516697432;
            var1 += -1746242021;
            var1 ^= -1945915247;
            var12 = var1;
            if (var12 != null) {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        } else {
            var1 >>>= 11;
            var1 ^= -662593843;
            Integer var10 = var1;
            if (var10 != null) {
                return this.z;
            }
        }

        IllegalArgumentException var11 = new IllegalArgumentException();
        throw var11;
    }

    public boolean Lz(String var1) {
        label149: {
            int var2 = TA;
            var2 ^= -985354113;
            int var3 = System.identityHashCode(this);
            List var4 = this.Mm;
            var4.clear();
            Locale var121 = Locale.ROOT;
            String var122 = var1.toLowerCase(var121);
            String var123 = var122.trim();
            String var124 = var123;
            List var5 = this.z;
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var209;
            int var140 = (var209 = var6 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
            if (var140 != 0) {
                var2 |= -1373517254;
                var2 ^= -207271495;
                var2 += 419919489;
                var2 ^= 1717540175;
            } else {
                var2 |= 284754727;
                var2 |= -1846714835;
                var2 ^= -1983980623;
                int var141 = var2 + 1;
                int var142 = var2 * var141;
                int var143 = var142 & 1;
                if (var143 != 0) {
                    break label149;
                }

                Iterator var131 = var5.iterator();
                Iterator var132 = var131;

                var2 = switch (var2) {
                    default -> var2 ^ 104894323;
                    case 507577550 -> {
                        var2 -= -1696347108;
                        var2 <<= 31;
                        var2 *= -1610722929;
                        var2 >>= 27;
                        yield var2 ^ -1188251973;
                    }
                    case 1627511979 -> var2 ^ -357332999;
                };

                label146:
                while (true) {
                    int var144 = var2 + 1;
                    int var145 = var2 * var144;
                    int var7 = var2 + 2;
                    int var146 = var145 * var7;
                    var7 = var2 + 3;
                    int var147 = var146 * var7;
                    int var148 = var147 & 7;
                    if (var148 != 0) {
                        break label149;
                    }

                    boolean var149 = var132.hasNext();
                    Integer var159 = var3;
                    if (var159 == null) {
                        var2 <<= 7;
                        var2 >>= 7;
                        var2 += -888819769;
                        var2 |= 1806584843;
                        var2 ^= -117967229;
                        break;
                    }

                    var2 >>>= 14;
                    var2 >>= 11;
                    var2 -= 479315440;
                    var2 ^= -331912508;
                    var159 = var2;
                    if (var159 == null) {
                        break label149;
                    }

                    if (!var149) {
                        var2 ^= -1802307797;
                        var2 ^= -661013250;
                        var2 <<= 16;
                        var2 ^= 1070547492;
                        var2 ^= -155374929;
                        var4 = this.Mm;
                        long var133 = var3;
                        long var177 = var133 + 1L;
                        long var178 = var133 * var177;
                        long var204 = var133 + 2L;
                        long var179 = var178 * var204;
                        long var134 = var133 + 3L;
                        long var180 = var179 * var134;
                        long var135 = var180 & 7L;
                        long var210;
                        var3 = (var210 = var135 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var2 += 1890738764;
                            var2 -= -1903367521;
                            var2 ^= 399727222;
                            var2 ^= 1355604318;
                            var3 = var2 + 1;
                            var3 = var2 * var3;
                            int var136 = var2 + 2;
                            var3 *= var136;
                            int var137 = var2 + 3;
                            var3 *= var137;
                            var3 &= 7;
                            if (var3 != 0) {
                                break label149;
                            }

                            boolean var119 = var4.isEmpty();
                            if (!var119) {
                                var2 *= 1131943573;
                                var2 &= 417593191;
                                var2 += -1564936431;
                                var2 ^= -1721844054;
                                var119 = true;
                                switch (var2) {
                                    case 826980035:
                                        var2 ^= -648448633;
                                        break;
                                    case 832797482:
                                    default:
                                        var2 ^= -1244177982;
                                        break;
                                    case 979560955:
                                        var2 <<= 28;
                                        var2 &= 1282725029;
                                        var2 >>>= 16;
                                        var2 ^= 14113797;
                                }
                            } else {
                                var2 *= 1369250189;
                                var2 ^= 1871744720;
                                var2 |= 1212995077;
                                var2 ^= -133403123;
                                Integer var126 = var2;
                                if (var126 == null) {
                                    break label149;
                                }

                                var119 = false;
                                var2 <<= 18;
                                var2 >>= 17;
                                var2 ^= 14122517;
                            }

                            return var119;
                        }

                        var2 -= 769141141;
                        var2 &= 291124051;
                        var2 >>= 8;
                        var2 *= 1921942815;
                        var2 ^= 1987819014;
                        break;
                    }

                    var2 -= 1508556194;
                    var2 &= -577735568;
                    var2 ^= -403188059;
                    Integer var150 = var2;
                    if (var150 == null) {
                        break label149;
                    }

                    Object var151 = var132.next();
                    pk var152 = (pk)var151;
                    long var161 = var3;
                    long var9 = var161 + 1L;
                    var9 = var161 * var9;
                    long var11 = var161 + 2L;
                    var9 *= var11;
                    long var162 = var161 + 3L;
                    var9 *= var162;
                    long var163 = var9 & 7L;
                    long var211;
                    int var164 = (var211 = var163 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                    if (var164 != 0) {
                        switch (var2) {
                            case -1442937711:
                            default:
                                var2 ^= 257091097;
                                break label146;
                            case 1928840869:
                                var2 *= -228601637;
                                var2 *= 1342744947;
                                var2 ^= 196724109;
                                break label146;
                            case 1983626211:
                                var2 ^= 1500644298;
                                break label146;
                        }
                    }

                    label164: {
                        var2 *= -1130828151;
                        var2 |= -598733426;
                        var2 ^= 372380322;
                        int var165 = (var124.isEmpty()) ? 1 : 0;
                        if (var165 == 0) {
                            var2 |= 1758481263;
                            var2 &= 1026624178;
                            var2 *= -1961111339;
                            var2 *= 1027714261;
                            var2 ^= -26806952;
                            var165 = var2 + 1;
                            var165 = var2 * var165;
                            var165 &= 1;
                            if (var165 != 0) {
                                break label149;
                            }

                            Module var169 = var152.JQ();
                            String var170 = var169.UJ();
                            Locale var184 = Locale.ROOT;
                            var9 = var3;
                            var11 = var9 + 1L;
                            var11 = var9 * var11;
                            long var13 = var9 + 2L;
                            var11 *= var13;
                            var9 += 3L;
                            var11 *= var9;
                            var9 = var11 & 7L;
                            long var212;
                            int var199 = (var212 = var9 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                            if (var199 != 0) {
                                var2 *= -981967763;
                                var2 <<= 8;
                                var2 ^= -609428599;
                                var2 -= 1551969659;
                                var2 ^= 128857094;
                                break;
                            }

                            var2 -= -98974373;
                            var2 ^= -1452452016;
                            String var171 = var170.toLowerCase(var184);
                            boolean var172 = var171.contains(var124);
                            if (!var172) {
                                var2 -= 1300690259;
                                var2 -= -1222170857;
                                var2 ^= 1339508820;
                                break label164;
                            }

                            var2 *= -2038003477;
                            var2 *= 1122019033;
                            var2 ^= -1362121664;
                            var2 ^= -1403852808;
                        } else {
                            var2 >>= 16;
                            var2 *= -1934327437;
                            var2 |= -1317956248;
                            var2 ^= 1203724788;
                            var2 ^= -802307411;
                        }

                        long var173 = var2;
                        var9 = var173 + 1L;
                        var9 = var173 * var9;
                        long var174 = var9 & 1L;
                        long var213;
                        var165 = (var213 = var174 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var165 != 0) {
                            break label149;
                        }

                        List var176 = this.Mm;
                        int var185 = var3 + 1;
                        int var186 = var3 * var185;
                        int var187 = var186 & 1;
                        if (var187 != 0) {
                            switch (var2) {
                                case -1867546186:
                                default:
                                    var2 ^= -788730130;
                                    break label146;
                                case 139526684:
                                    var2 ^= -1766978191;
                                    break label146;
                                case 711409205:
                                    var2 &= -1044723364;
                                    var2 ^= 325816348;
                                    break label146;
                            }
                        }
                        var2 = switch (var2) {
                            case -1897274603 -> var2 ^ -1442968766;
                            default -> var2 ^ 1116658483;
                            case 711409205 -> {
                                var2 ^= 1802811083;
                                yield var2 ^ 808341493;
                            }
                        };
                        int var188 = var2 + 1;
                        int var189 = var2 * var188;
                        int var202 = var2 + 2;
                        int var190 = var189 * var202;
                        int var203 = var2 + 3;
                        int var191 = var190 * var203;
                        int var192 = var191 & 7;
                        if (var192 != 0) {
                            break label149;
                        }

                        boolean var153 = var176.add(var152);
                        switch (var2) {
                            case -1367876437:
                                var2 ^= 1486575084;
                                break;
                            case 124787960:
                            default:
                                var2 ^= -69419948;
                                break;
                            case 1899874059:
                                var2 -= 2063201340;
                                var2 >>>= 8;
                                var2 *= 1771888919;
                                var2 *= -345392493;
                                var2 ^= -760840197;
                        }
                    }

                    int var154 = var2 + 1;
                    int var155 = var2 * var154;
                    int var156 = var155 & 1;
                    if (var156 != 0) {
                        break label149;
                    }

                    var2 -= -330215949;
                    var2 += 1445751059;
                    var2 >>>= 9;
                    var2 <<= 12;
                    var2 ^= -30763333;
                }
            }

            long var107 = var2;
            long var127 = var107 + 1L;
            long var128 = var107 * var127;
            var6 = var107 + 2L;
            long var129 = var128 * var6;
            long var108 = var107 + 3L;
            long var130 = var129 * var108;
            long var109 = var130 & 7L;
            long var214;
            var2 = (var214 = var109 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var111 = new RuntimeException();
                throw var111;
            }
        }

        RuntimeException var112 = new RuntimeException();
        throw var112;
    }

    public void W(float var1, float var2, float var3, float var4) {
        label145: {
            int var5 = TA;
            var5 ^= -1740880929;
            int var6 = System.identityHashCode(this);
            XF var7 = this.SW;
            long var8 = var6;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            long var12 = var8 + 2L;
            var10 *= var12;
            var8 += 3L;
            var10 *= var8;
            var8 = var10 & 7L;
            long var198;
            int var136 = (var198 = var8 - 0L) == 0L ? 0 : (var198 < 0L ? -1 : 1);
            if (var136 != 0) {
                var5 ^= -2087554070;
                var5 ^= 566930295;
            } else {
                label147: {
                    var5 *= 1195198889;
                    var5 &= -1419001267;
                    var5 ^= -1189026928;
                    int var137 = var5 + 1;
                    int var138 = var5 * var137;
                    int var139 = var138 & 1;
                    if (var139 != 0) {
                        break label145;
                    }

                    float var112 = var7.bs();
                    boolean var113 = Float.isNaN(var112);
                    if (var113) {
                        var5 = switch (var5) {
                            case -2115256532 -> var5 ^ 168001953;
                            case -1186733091 -> {
                                var5 += -598289767;
                                var5 |= 2006654135;
                                var5 += 252497553;
                                var5 <<= 19;
                                yield var5 ^ -2071196044;
                            }
                            default -> var5 ^ 1121018067;
                        };
                        int var114 = var5 + 1;
                        int var115 = var5 * var114;
                        int var116 = var115 & 1;
                        if (var116 != 0) {
                            break label145;
                        }

                        var7 = this.SW;
                        int var140 = var6 + 1;
                        int var141 = var6 * var140;
                        int var9 = var6 + 2;
                        int var142 = var141 * var9;
                        var9 = var6 + 3;
                        int var143 = var142 * var9;
                        int var144 = var143 & 7;
                        if (var144 != 0) {
                            var5 += -1574469177;
                            var5 ^= 1400115639;
                            var5 ^= 556545478;
                            break label147;
                        }

                        var5 &= -16495250;
                        var5 |= -1171972884;
                        var5 ^= -1725602377;
                        var5 ^= 1572360058;
                        Integer var145 = var5;
                        if (var145 == null) {
                            break label145;
                        }

                        var7.j(var1);
                        var5 |= -850323408;
                        var5 *= -1676718807;
                        var5 ^= -1355214843;
                    } else {
                        switch (var5) {
                            case -1186733091:
                                var5 ^= 398866545;
                                var5 ^= 1992456560;
                                break;
                            case 619484908:
                                var5 ^= 1469382491;
                                break;
                            case 1956709907:
                            default:
                                var5 ^= -132283620;
                        }
                    }

                    long var118 = var5;
                    long var170 = var118 + 1L;
                    var170 = var118 * var170;
                    long var11 = var118 + 2L;
                    var170 *= var11;
                    long var119 = var118 + 3L;
                    var170 *= var119;
                    long var120 = var170 & 7L;
                    long var199;
                    int var121 = (var199 = var120 - 0L) == 0L ? 0 : (var199 < 0L ? -1 : 1);
                    if (var121 != 0) {
                        break label145;
                    }

                    var7 = this.SW;
                    var7.H(var1);
                    var7 = this.SW;
                    float var124 = var7.N(var4);
                    this.m = var2;
                    this.ZO = 10.0F;
                    Integer var125 = var6;
                    if (var125 != null) {
                        var5 *= -1100676887;
                        var5 &= 1262890035;
                        var5 += 319922032;
                        var5 -= -741513734;
                        var5 ^= -631684092;
                        List var126 = this.Mm;
                        Iterator var127 = var126.iterator();
                        Iterator var128 = var127;
                        var5 <<= 16;
                        var5 &= -1437051031;
                        var5 ^= 65354274;
                        var5 -= 1976433943;
                        var5 ^= -1662065873;

                        label132:
                        while (true) {
                            boolean var146 = var128.hasNext();
                            Integer var174 = var6;
                            if (var174 == null) {
                                switch (var5) {
                                    case -1983635187:
                                        var5 ^= -1789373251;
                                        break label132;
                                    case 526769976:
                                    default:
                                        var5 ^= -1492740340;
                                        break label132;
                                    case 855236132:
                                        var5 += 657591106;
                                        var5 ^= -1568645844;
                                        break label132;
                                }
                            }

                            var5 |= -911869367;
                            var5 ^= -1214790483;
                            var5 >>= 14;
                            var5 ^= 1615463019;
                            var5 ^= 1680370309;
                            int var175 = var5 + 1;
                            int var176 = var5 * var175;
                            int var189 = var5 + 2;
                            int var177 = var176 * var189;
                            int var190 = var5 + 3;
                            int var178 = var177 * var190;
                            int var179 = var178 & 7;
                            if (var179 != 0) {
                                break label145;
                            }

                            if (!var146) {
                                var5 += -839233896;
                                var5 *= -1285820001;
                                var5 *= 40274767;
                                var5 &= 920087071;
                                var5 ^= -71476314;
                                float var129 = this.ZO;
                                int var157 = var6 + 1;
                                int var158 = var6 * var157;
                                int var159 = var158 & 1;
                                if (var159 != 0) {
                                    var5 |= -1212450880;
                                    var5 -= -879441273;
                                    var5 &= 1093001100;
                                    var5 ^= -124831414;
                                } else {
                                    var5 &= 660388932;
                                    var5 ^= 1418788622;
                                    var5 ^= 1546993265;
                                    var5 ^= 80764949;
                                    var8 = var5;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var200;
                                    int var162 = (var200 = var8 - 0L) == 0L ? 0 : (var200 < 0L ? -1 : 1);
                                    if (var162 != 0) {
                                        break label145;
                                    }

                                    List var163 = this.Mm;
                                    boolean var164 = var163.isEmpty();
                                    float var168;
                                    if (var164) {
                                        var5 >>= 2;
                                        var5 >>>= 28;
                                        var5 &= -371819451;
                                        var5 ^= -1973057738;
                                        int var165 = var5 + 1;
                                        int var166 = var5 * var165;
                                        int var167 = var166 & 1;
                                        if (var167 != 0) {
                                            break label145;
                                        }

                                        var168 = 0.0F;
                                        var5 &= -1300057832;
                                        var5 &= -2044970487;
                                        var5 += 167657752;
                                        var5 += 646267472;
                                        var5 ^= 867631093;
                                    } else {
                                        var5 = switch (var5) {
                                            default -> var5 ^ 34791403;
                                            case 254644586 -> {
                                                var5 *= 584415289;
                                                var5 |= -399704698;
                                                var5 |= 345982669;
                                                yield var5 ^ -924247599;
                                            }
                                            case 570528098 -> var5 ^ -1428386805;
                                        };
                                        var168 = 3.0F;
                                        var5 <<= 23;
                                        var5 ^= -2043315043;
                                    }

                                    var170 = var5;
                                    var11 = var170 + 1L;
                                    var11 = var170 * var11;
                                    var170 = var11 & 1L;
                                    long var201;
                                    int var185 = (var201 = var170 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                                    if (var185 != 0) {
                                        break label145;
                                    }

                                    float var130 = var129 - var168;
                                    Integer var101 = var6;
                                    if (var101 != null) {
                                        var101 = switch (var5) {
                                            case -2127201123 -> {
                                                var5 *= -146340909;
                                                yield var5 ^ 318155686;
                                            }
                                            default -> var5 ^ -1748226778;
                                            case 1686160845 -> var5 ^ 1782896032;
                                        };
                                        if (var101 != null) {
                                            this.ZO = var130;
                                            float var103 = this.ZO;
                                            float var104 = Math.min(var103, var3);
                                            this.tl = var104;
                                            float var105 = this.ZO;
                                            float var131 = this.tl;
                                            float var106 = var105 - var131;
                                            float var107 = Math.max(0.0F, var106);
                                            float var132 = this.mQ;
                                            float var108 = TP.t(var132, 0.0F, var107);
                                            this.mQ = var108;
                                            XF var109 = this.c;
                                            float var133 = this.mQ;
                                            var109.H(var133);
                                            XF var110 = this.c;
                                            float var111 = var110.N(var4);
                                            return;
                                        }
                                        break label145;
                                    }

                                    var5 &= 1713000140;
                                    var5 += -432335274;
                                    var5 *= 2102338681;
                                    var5 ^= -1444138856;
                                }
                                break;
                            }

                            var5 &= -2018266478;
                            var5 -= 1051739251;
                            var5 &= 2111266430;
                            var5 ^= -2080446367;
                            int var147 = var5 + 1;
                            int var148 = var5 * var147;
                            int var180 = var5 + 2;
                            int var149 = var148 * var180;
                            int var181 = var5 + 3;
                            int var150 = var149 * var181;
                            int var151 = var150 & 7;
                            if (var151 != 0) {
                                break label145;
                            }

                            Object var152 = var128.next();
                            pk var153 = (pk)var152;
                            float var182 = this.ZO;
                            float var154 = var153.V();
                            int var191 = var6 + 1;
                            int var192 = var6 * var191;
                            int var193 = var192 & 1;
                            if (var193 != 0) {
                                var5 ^= -372673701;
                                var5 ^= 1789169075;
                                var5 *= -1849129045;
                                var5 += -1357705929;
                                var5 ^= 131381294;
                                break;
                            }

                            var5 |= 1711418161;
                            var5 -= -1325868998;
                            var5 >>>= 2;
                            var5 ^= -126140706;
                            float var155 = var154 + 3.0F;
                            float var156 = var182 + var155;
                            this.ZO = var156;
                            var5 >>= 18;
                            var5 *= -300979385;
                            var5 ^= -920663289;
                        }
                    } else {
                        switch (var5) {
                            case -2132905568:
                                var5 ^= -878878487;
                                break;
                            case -666393892:
                                var5 -= -450624991;
                                var5 -= 67676772;
                                var5 ^= 397492765;
                                break;
                            case 1334261801:
                            default:
                                var5 ^= -610786568;
                        }
                    }
                }
            }

            Integer var98 = var5;
            if (var98 != null) {
                UnsupportedOperationException var99 = new UnsupportedOperationException();
                throw var99;
            }
        }

        IllegalStateException var100 = new IllegalStateException();
        throw var100;
    }

    public void c(jX var1, float var2) {
        label61: {
            int var3 = TA;
            var3 ^= -2060441588;
            int var4 = System.identityHashCode(this);
            List var5 = this.Mm;
            Integer var6 = var4;
            if (var6 == null) {
                var3 >>= 9;
                var3 |= 350489563;
                var3 >>= 4;
                var3 ^= -2128616119;
            } else {
                var3 = switch (var3) {
                    case 1207895812 -> {
                        var3 *= 354439073;
                        var3 *= 1197350271;
                        var3 ^= 796808137;
                        var3 *= -1555178305;
                        yield var3 ^ 420346305;
                    }
                    case 1328985839 -> var3 ^ 1886813121;
                    default -> var3 ^ -1518469583;
                };
                int var61 = var3 + 1;
                var61 = var3 * var61;
                var61 &= 1;
                if (var61 != 0) {
                    break label61;
                }

                Iterator var55 = var5.iterator();
                Iterator var56 = var55;
                var3 += 123320904;
                var3 += -1362386587;
                var3 ^= 1425897941;
                var3 -= 25997400;
                var3 ^= -811247895;

                while (true) {
                    boolean var64 = var56.hasNext();
                    long var7 = var4;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var90;
                    int var70 = (var90 = var7 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                    if (var70 != 0) {
                        var3 ^= -781979784;
                        var3 ^= 2099687279;
                        break;
                    }

                    var3 ^= -1754267255;
                    var3 *= -328943057;
                    var3 *= -1996844039;
                    var3 ^= 592261686;
                    var7 = var3;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var91;
                    int var74 = (var91 = var7 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        break label61;
                    }

                    if (!var64) {
                        var3 ^= -1055858422;
                        var3 += 31565866;
                        var3 ^= 612600588;
                        long var47 = var3;
                        long var57 = var47 + 1L;
                        long var58 = var47 * var57;
                        var7 = var47 + 2L;
                        long var59 = var58 * var7;
                        long var48 = var47 + 3L;
                        long var60 = var59 * var48;
                        long var49 = var60 & 7L;
                        long var92;
                        var3 = (var92 = var49 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                        break label61;
                    }

                    var3 += 201129793;
                    var3 -= -1800649020;
                    var3 += -188882482;
                    var3 ^= 1520446360;
                    Integer var65 = var3;
                    if (var65 == null) {
                        break label61;
                    }

                    Object var66 = var56.next();
                    pk var67 = (pk)var66;
                    int var75 = var4 + 1;
                    int var76 = var4 * var75;
                    int var8 = var4 + 2;
                    int var77 = var76 * var8;
                    var8 = var4 + 3;
                    int var78 = var77 * var8;
                    int var79 = var78 & 7;
                    if (var79 != 0) {
                        var3 += 107128820;
                        var3 -= -295053720;
                        var3 ^= 1207705500;
                        var3 ^= -1127615427;
                        var3 ^= -1382665350;
                        break;
                    }

                    var3 ^= -99962377;
                    var3 >>= 21;
                    var3 ^= -833854872;
                    var67.X(var1, var2);
                    var3 |= 324652014;
                    var3 ^= -213307060;
                }
            }

            Integer var53 = var3;
            if (var53 != null) {
                RuntimeException var54 = new RuntimeException();
                throw var54;
            }
        }

        RuntimeException var52 = new RuntimeException();
        throw var52;
    }

    private float yX(int var1) {
        int var3 = System.identityHashCode(this);
        long var17 = var3;
        long var5 = var17 + 1L;
        var5 = var17 * var5;
        long var7 = var17 + 2L;
        var5 *= var7;
        long var18 = var17 + 3L;
        var5 *= var18;
        long var19 = var5 & 7L;
        long var33;
        var3 = (var33 = var19 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var3 == 0) {
            int var14 = var1 & 1279207539;
            var14 &= -521205362;
            var14 ^= -826500402;
            var3 = var14 + 1;
            var3 = var14 * var3;
            int var4 = var14 + 2;
            var3 *= var4;
            var4 = var14 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 != 0) {
                UnsupportedOperationException var28 = new UnsupportedOperationException();
                throw var28;
            } else {
                float var26 = this.m;
                float var27 = var26 + 32.0F;
                return var27 + 0.0F;
            }
        } else {
            int var2 = var1 + 1810263740;
            var2 &= -141509660;
            var2 >>= 23;
            var2 &= 2090825319;
            var2 ^= 158315964;
            AssertionError var13 = new AssertionError();
            throw var13;
        }
    }

    public void G(Canvas var1, float var2) {
        int var3 = TA;
        var3 ^= -1873526000;
        int var4 = System.identityHashCode(this);
        XF var5 = this.SW;
        float var26 = var5.bs();
        int var6 = var4 + 1;
        var6 = var4 * var6;
        var4 = var6 & 1;
        if (var4 == 0) {
            var3 -= 1525858799;
            var3 *= -1456680829;
            var3 -= 11861646;
            var3 ^= -1696180714;
            long var28 = var3;
            long var8 = var28 + 1L;
            var8 = var28 * var8;
            long var10 = var28 + 2L;
            var8 *= var10;
            long var29 = var28 + 3L;
            var8 *= var29;
            long var30 = var8 & 7L;
            long var35;
            var4 = (var35 = var30 - 0L) == 0L ? 0 : (var35 < 0L ? -1 : 1);
            if (var4 != 0) {
                IllegalStateException var25 = new IllegalStateException();
                throw var25;
            } else {
                var1.save();
                var1.alpha(var2);
                float var23 = this.m;
                float var24 = var23 + 4.0F;
                float var31 = this.x();
                var1.shadow(var26, var24, 148.0F, var31, 12.0F, 12.0F, 1074205478);
                var1.restore();
            }
        } else {
            var3 |= -826117864;
            var3 *= 1564332495;
            var3 ^= 931642407;
            RuntimeException var16 = new RuntimeException();
            throw var16;
        }
    }

    public void gB(Canvas var1, float var2, boolean var3) {
        label68: {
            label67: {
                int var4 = TA;
                var4 ^= 247368;
                int var5 = System.identityHashCode(this);
                XF var6 = this.SW;
                float var56 = var6.bs();
                var1.save();
                var1.alpha(var2);
                int var7 = var5 + 1;
                var7 = var5 * var7;
                int var8 = var5 + 2;
                var7 *= var8;
                var8 = var5 + 3;
                var7 *= var8;
                var7 &= 7;
                if (var7 == 0) {
                    var4 -= -1410050421;
                    var4 ^= 2106711285;
                    Integer var62 = var4;
                    if (var62 == null) {
                        break label68;
                    }

                    if (var3) {
                        var4 = switch (var4) {
                            case -1820315544 -> var4 ^ -282925936;
                            default -> var4 ^ 22826619;
                            case 1799966272 -> {
                                var4 *= -1900096071;
                                var4 |= -832312209;
                                var4 |= 1597803728;
                                yield var4 ^ -1766101810;
                            }
                        };
                        long var63 = var4;
                        long var9 = var63 + 1L;
                        var9 = var63 * var9;
                        long var11 = var63 + 2L;
                        var9 *= var11;
                        long var64 = var63 + 3L;
                        var9 *= var64;
                        long var65 = var9 & 7L;
                        long var81;
                        int var66 = (var81 = var65 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                        if (var66 != 0) {
                            break label68;
                        }

                        float var67 = this.m;
                        float var70 = this.x();
                        Integer var75 = var5;
                        if (var75 != null) {
                            var4 = switch (var4) {
                                default -> var4 ^ -479337083;
                                case 1229226033 -> {
                                    var4 += -748364944;
                                    var4 *= 60736175;
                                    yield var4 ^ -998684137;
                                }
                                case 2128128345 -> var4 ^ 2053641639;
                            };
                            Glass var76 = j_2.J;
                            var1.glass(var56, var67, 148.0F, var70, 12.0F, var76);
                            var4 |= 814822687;
                            var4 *= 1438339985;
                            var4 ^= -982165078;
                            break label67;
                        }

                        var4 += -215719235;
                        var4 *= -2145158421;
                        var4 ^= -1682518074;
                    } else {
                        var4 += 958342927;
                        var4 ^= 1777502025;
                        float var68 = this.m;
                        float var71 = this.x();
                        long var77 = var5;
                        long var79 = var77 + 1L;
                        var79 = var77 * var79;
                        var77 = var79 & 1L;
                        long var82;
                        var5 = (var82 = var77 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            var4 |= -1767779987;
                            var4 += 1751396805;
                            var4 ^= 1538621138;
                            var5 = var4 + 1;
                            var5 = var4 * var5;
                            var5 &= 1;
                            if (var5 != 0) {
                                break label68;
                            }

                            var1.roundRect(var56, var68, 148.0F, var71, 12.0F, -300668864);
                            switch (var4) {
                                case -661048329:
                                    var4 ^= -573582468;
                                    break label67;
                                case 328555494:
                                    var4 >>>= 27;
                                    var4 += -703702477;
                                    var4 ^= -949187056;
                                    break label67;
                                case 1040041716:
                                default:
                                    var4 ^= 778473589;
                                    break label67;
                            }
                        }

                        var4 -= -346164477;
                        var4 += -1740660871;
                        var4 += -917133949;
                        var4 ^= -1202695813;
                        var4 ^= 381903160;
                    }
                } else {
                    switch (var4) {
                        case -1887229846:
                        default:
                            var4 ^= -1382741211;
                            break;
                        case -1026758336:
                            var4 *= -131685919;
                            var4 ^= 1493906172;
                            break;
                        case 1182794592:
                            var4 ^= -524982627;
                    }
                }

                var5 = var4 + 1;
                var5 = var4 * var5;
                int var57 = var4 + 2;
                var5 *= var57;
                var4 += 3;
                var5 *= var4;
                var4 = var5 & 7;
                if (var4 == 0) {
                    RuntimeException var47 = new RuntimeException();
                    throw var47;
                }
                break label68;
            }

            var1.restore();
            return;
        }

        RuntimeException var46 = new RuntimeException();
        throw var46;
    }

    public void gI(Canvas var1, jX var2, float var3) {
        label174: {
            int var97;
            label182: {
                var97 = TA;
                var97 ^= 1437387731;
                int var5 = System.identityHashCode(this);
                XF var6 = this.SW;
                float var130 = var6.bs();
                float var131 = var130;
                float var7 = var130 + 0.5F;
                float var8 = this.m;
                var8 += 0.5F;
                float var9 = this.x();
                var9--;
                int var10 = DP.nq(902948351, var3);
                int var11 = DP.nq(550626815, var3);
                Paint var230 = Paint.vertical(var10, var11);
                Paint var231 = var230.stroke(0.6F);
                var1.roundRect(var7, var8, 147.0F, var9, 11.5F, var231);
                var7 = var130 + 13.0F;
                int var169 = var97 | 1678181159;
                int var170 = var169 | -1230058297;
                int var171 = var170 ^ 1686380366;
                var8 = this.yX(var171);
                var9 = var130 + 148.0F;
                var9 -= 13.0F;
                var10 = var97 | 1393873616;
                var10 &= -1969193714;
                var10 += 179271257;
                var10 ^= 530848466;
                float var236 = this.yX(var10);
                var11 = DP.nq(382854655, var3);
                var1.line(var7, var8, var9, var236, 0.5F, var11);
                int var137 = DP.nq(-854017, var3);
                TextStyle var138 = TextStyle.of(9.5F, var137);
                TextStyle var139 = var138.semibold();
                ModuleCategory var173 = this.q;
                var9 = var130 + 17.0F;
                float var237 = this.m;
                float var238 = var237 + 16.0F;
                var11 = DP.nq(-7684353, var3);
                Hc.WQ(var1, var173, var9, var238, var11);
                ModuleCategory var174 = this.q;
                String var175 = var174.displayName();
                var9 = var130 + 29.0F;
                float var239 = this.m;
                float var240 = var239 + 16.0F;
                float var241 = var240 - 5.6F;
                var7 = var1.text(var175, var9, var241, var139);
                List var141 = this.Mm;
                int var142 = var141.size();
                String var143 = Integer.toString(var142);
                var8 = var130 + 148.0F;
                var8 -= 13.0F;
                var9 = this.m;
                var9 += 12.0F;
                float var242 = var3 * 0.65F;
                var10 = DP.nq(-4075035, var242);
                TextStyle var244 = TextStyle.of(7.0F, var10);
                var7 = var1.textRight(var143, var8, var9, var244);
                var1.save();
                var7 = var130 + 1.0F;
                int var178 = var97 - 1600611904;
                int var179 = var178 ^ -1533571542;
                var8 = this.yX(var179);
                var8++;
                var9 = this.tl;
                var9 -= 2.0F;
                var9 = Math.max(0.0F, var9);
                var1.clip(var7, var8, 146.0F, var9, 10.0F);
                int var146 = var97 - 761577390;
                int var147 = var146 * 427777247;
                int var148 = var147 ^ 1335590530;
                var7 = this.yX(var148);
                var7 += 5.0F;
                XF var182 = this.c;
                var8 = var182.bs();
                var7 -= var8;
                List var184 = this.Mm;
                Iterator var185 = var184.iterator();
                long var209 = var5;
                long var261 = var209 + 1L;
                long var262 = var209 * var261;
                long var210 = var262 & 1L;
                long var329;
                int var211 = (var329 = var210 - 0L) == 0L ? 0 : (var329 < 0L ? -1 : 1);
                if (var211 != 0) {
                    var97 >>>= 31;
                    var97 &= -1628367975;
                    var97 |= 1732921881;
                    var97 += -1967400877;
                    var97 ^= -82944262;
                } else {
                    var97 = switch (var97) {
                        case -1755061029 -> {
                            var97 -= 2046423846;
                            yield var97 ^ -1655522682;
                        }
                        default -> var97 ^ -1149000455;
                        case 1857655214 -> var97 ^ 1957383904;
                    };
                    Integer var212 = var97;
                    if (var212 == null) {
                        break label174;
                    }

                    Iterator var186 = var185;
                    var7 = var7;
                    var97 &= -1570304679;
                    var97 ^= 374732585;
                    var97 <<= 23;
                    var97 *= 269439501;
                    var97 ^= 755576939;

                    label171:
                    while (true) {
                        boolean var213 = var186.hasNext();
                        var10 = var5 + 1;
                        var10 = var5 * var10;
                        var10 &= 1;
                        if (var10 != 0) {
                            var97 <<= 8;
                            var97 |= 1763803228;
                            var97 ^= 1614387146;
                            break;
                        }
                        var97 = switch (var97) {
                            case -1382711683 -> var97 ^ -868488178;
                            default -> var97 ^ -619878411;
                            case 1091121259 -> {
                                var97 &= 1050402835;
                                var97 -= 1705876026;
                                yield var97 ^ -286571741;
                            }
                        };
                        var10 = var97 + 1;
                        var10 = var97 * var10;
                        var11 = var97 + 2;
                        var10 *= var11;
                        var11 = var97 + 3;
                        var10 *= var11;
                        var10 &= 7;
                        if (var10 != 0) {
                            break label174;
                        }

                        if (!var213) {
                            var97 += 1133012174;
                            var97 -= -325848377;
                            var97 -= 135752408;
                            var97 ^= 1948714719;
                            Integer var153 = var97;
                            if (var153 == null) {
                                break label174;
                            }

                            var1.restore();
                            var7 = this.ZO;
                            var8 = this.tl;
                            long var285 = var5;
                            long var316 = var285 + 1L;
                            var316 = var285 * var316;
                            long var327 = var285 + 2L;
                            var316 *= var327;
                            long var286 = var285 + 3L;
                            var316 *= var286;
                            long var287 = var316 & 7L;
                            long var330;
                            int var224 = (var330 = var287 - 0L) == 0L ? 0 : (var330 < 0L ? -1 : 1);
                            if (var224 == 0) {
                                var97 |= 594281040;
                                var97 ^= -1152264917;
                                float var331;
                                int var155 = (var331 = var7 - ++var8) == 0.0F ? 0 : (var331 < 0.0F ? -1 : 1);
                                if (var155 <= 0) {
                                    switch (var97) {
                                        case -828085424:
                                            var97 ^= 2090972485;
                                            break label182;
                                        case 213852157:
                                            var97 >>= 21;
                                            var97 ^= -1798031888;
                                            break label182;
                                        case 1124262403:
                                        default:
                                            var97 ^= -2122120362;
                                            break label182;
                                    }
                                }

                                var97 >>= 8;
                                var97 += -1845802265;
                                var97 &= 1060619963;
                                var97 ^= 1858824635;
                                int var156 = var97 + 1;
                                int var157 = var97 * var156;
                                int var189 = var97 + 2;
                                int var158 = var157 * var189;
                                int var190 = var97 + 3;
                                int var159 = var158 * var190;
                                int var160 = var159 & 7;
                                if (var160 != 0) {
                                    break label174;
                                }

                                var7 = this.tl;
                                var8 = this.ZO;
                                var7 /= var8;
                                var8 = this.tl;
                                var7 = var8 * var7;
                                var7 -= 8.0F;
                                var7 = Math.max(6.0F, var7);
                                var8 = this.ZO;
                                var9 = this.tl;
                                var11 = var5 + 1;
                                var11 = var5 * var11;
                                int var312 = var5 + 2;
                                var11 *= var312;
                                var5 += 3;
                                var11 *= var5;
                                var5 = var11 & 7;
                                if (var5 == 0) {
                                    var97 &= -509168467;
                                    var97 ^= -1933050988;
                                    var5 = var97 + 1;
                                    var5 = var97 * var5;
                                    var11 = var97 + 2;
                                    var5 *= var11;
                                    var11 = var97 + 3;
                                    var5 *= var11;
                                    var5 &= 7;
                                    if (var5 != 0) {
                                        break label174;
                                    }

                                    float var119 = var8 - var9;
                                    var5 = var97 * -2026011495;
                                    var5 &= 1676590896;
                                    var5 *= -84560117;
                                    var5 ^= 1548102561;
                                    float var124 = this.yX(var5);
                                    float var125 = var124 + 4.0F;
                                    var8 = this.tl;
                                    var8 -= 8.0F;
                                    var8 -= var7;
                                    XF var226 = this.c;
                                    var9 = var226.bs();
                                    var9 /= var119;
                                    var9 = TP.S(var9);
                                    var8 *= var9;
                                    float var126 = var125 + var8;
                                    float var132 = var131 + 148.0F;
                                    float var133 = var132 - 3.5F;
                                    int var198 = DP.nq(1090519039, var3);
                                    var1.roundRect(var133, var126, 2.0F, var7, 1.0F, var198);
                                    var97 *= -1180319017;
                                    var97 *= -937604953;
                                    var97 ^= -1711390232;
                                    break label182;
                                }

                                var97 ^= -2077810291;
                                var97 <<= 9;
                                var97 ^= -778300266;
                            } else {
                                var97 += 2136559883;
                                var97 <<= 8;
                                var97 ^= 219262358;
                            }
                            break;
                        }

                        var97 -= -43789026;
                        var97 ^= -824407250;
                        var97 ^= 1143129902;
                        long var214 = var97;
                        long var265 = var214 + 1L;
                        long var266 = var214 * var265;
                        long var215 = var266 & 1L;
                        long var332;
                        int var216 = (var332 = var215 - 0L) == 0L ? 0 : (var332 < 0L ? -1 : 1);
                        if (var216 != 0) {
                            break label174;
                        }

                        Object var217 = var186.next();
                        pk var218 = (pk)var217;
                        long var253 = var5;
                        long var12 = var253 + 1L;
                        var12 = var253 * var12;
                        long var254 = var12 & 1L;
                        long var333;
                        var10 = (var333 = var254 - 0L) == 0L ? 0 : (var333 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            var97 |= 571524174;
                            var97 ^= 854277721;
                            var97 ^= -1001275647;
                            break;
                        }

                        var97 &= 1175894973;
                        var97 ^= 797341520;
                        Integer var256 = var97;
                        if (var256 == null) {
                            break label174;
                        }

                        float var257 = var218.V();
                        float var267 = var7 + var257;
                        int var295 = var97 ^ -471967402;
                        int var296 = var295 - -841169447;
                        int var297 = var296 ^ 688267520;
                        float var298 = this.yX(var297);
                        float var299 = var298 - 4.0F;
                        float var334;
                        var11 = (var334 = var267 - var299) == 0.0F ? 0 : (var334 < 0.0F ? -1 : 1);
                        if (var11 > 0) {
                            var97 >>>= 25;
                            var97 -= 641153445;
                            var97 &= 1957105326;
                            var97 ^= 1813658344;
                            var11 = var97 + 1;
                            var11 = var97 * var11;
                            int var300 = var97 + 2;
                            var11 *= var300;
                            int var301 = var97 + 3;
                            var11 *= var301;
                            var11 &= 7;
                            if (var11 != 0) {
                                break label174;
                            }

                            var11 = var97 >>> 30;
                            var11 ^= -1821642575;
                            float var276 = this.yX(var11);
                            float var302 = this.tl;
                            float var277 = var276 + var302;
                            float var278 = var277 + 4.0F;
                            float var335;
                            var11 = (var335 = var7 - var278) == 0.0F ? 0 : (var335 < 0.0F ? -1 : 1);
                            var12 = var5;
                            long var14 = var12 + 1L;
                            var14 = var12 * var14;
                            long var16 = var12 + 2L;
                            var14 *= var16;
                            var12 += 3L;
                            var14 *= var12;
                            var12 = var14 & 7L;
                            long var336;
                            int var306 = (var336 = var12 - 0L) == 0L ? 0 : (var336 < 0L ? -1 : 1);
                            if (var306 != 0) {
                                switch (var97) {
                                    case -683065495:
                                    default:
                                        var97 ^= 244987973;
                                        break label171;
                                    case 206099326:
                                        var97 ^= -1552864441;
                                        break label171;
                                    case 1016740968:
                                        var97 -= 1275142121;
                                        var97 += 535884656;
                                        var97 ^= 427979641;
                                        break label171;
                                }
                            }
                            var97 = switch (var97) {
                                default -> var97 ^ -1161672256;
                                case 662708056 -> var97 ^ 1137074490;
                                case 1016740968 -> {
                                    var97 ^= -253849248;
                                    var97 -= 530803149;
                                    var97 &= 1578594460;
                                    yield var97 ^ -1720437103;
                                }
                            };
                            if (var11 < 0) {
                                var97 <<= 25;
                                var97 *= 925400697;
                                var97 ^= -1639674433;
                                var97 ^= 17662513;
                                var97 ^= 870636820;
                                float var280 = var131 + 5.0F;
                                Integer var307 = var5;
                                if (var307 == null) {
                                    switch (var97) {
                                        case -235796887:
                                            var97 ^= 1491909870;
                                            break label171;
                                        case 561052906:
                                        default:
                                            var97 ^= -394012892;
                                            break label171;
                                        case 783143578:
                                            var97 &= 2091634558;
                                            var97 -= -424668619;
                                            var97 *= 429151323;
                                            var97 ^= -741026063;
                                            break label171;
                                    }
                                }

                                var97 -= -709233862;
                                var97 |= 1851067585;
                                var97 |= -1246724099;
                                var97 ^= -268826282;
                                var12 = var97;
                                var14 = var12 + 1L;
                                var14 = var12 * var14;
                                var16 = var12 + 2L;
                                var14 *= var16;
                                var12 += 3L;
                                var14 *= var12;
                                var12 = var14 & 7L;
                                long var337;
                                int var311 = (var337 = var12 - 0L) == 0L ? 0 : (var337 < 0L ? -1 : 1);
                                if (var311 != 0) {
                                    break label174;
                                }

                                var218.mo(var1, var2, var280, var7, 138.0F, var3);
                                var97 *= -968078729;
                                var97 *= -592231853;
                                var97 |= -869298022;
                                var97 ^= 2114967596;
                            } else {
                                switch (var97) {
                                    case -1787464055:
                                        var97 += -150808380;
                                        var97 += 1326307968;
                                        var97 -= -1515317798;
                                        var97 |= -656271934;
                                        var97 ^= 1560942656;
                                        break;
                                    case -1678055383:
                                    default:
                                        var97 ^= 2032548507;
                                        break;
                                    case 1205253273:
                                        var97 ^= -2000911598;
                                }
                            }
                        } else {
                            switch (var97) {
                                case -1223120025:
                                    var97 ^= -1175192487;
                                    break;
                                case -859531474:
                                default:
                                    var97 ^= -2062196099;
                                    break;
                                case 1804914396:
                                    var97 <<= 14;
                                    var97 += -352260845;
                                    var97 *= 1534910059;
                                    var97 >>>= 19;
                                    var97 ^= -1594879450;
                            }
                        }

                        int var219 = var97 + 1;
                        int var220 = var97 * var219;
                        int var221 = var220 & 1;
                        if (var221 != 0) {
                            break label174;
                        }

                        var9 = var257 + 3.0F;
                        var9 = var7 + var9;
                        long var281 = var5;
                        long var13 = var281 + 1L;
                        var13 = var281 * var13;
                        long var15 = var281 + 2L;
                        var13 *= var15;
                        long var282 = var281 + 3L;
                        var13 *= var282;
                        long var283 = var13 & 7L;
                        long var338;
                        var11 = (var338 = var283 - 0L) == 0L ? 0 : (var338 < 0L ? -1 : 1);
                        if (var11 != 0) {
                            var97 &= 1178629745;
                            var97 -= 1766512547;
                            var97 |= 145749423;
                            var97 -= -940716843;
                            var97 ^= -568701364;
                            break;
                        }
                        var97 = switch (var97) {
                            case -1594880077 -> {
                                var97 <<= 22;
                                yield var97 ^ -1801673475;
                            }
                            case -1430823167 -> var97 ^ -1952546893;
                            default -> var97 ^ 94768486;
                        };
                        var7 = var9;
                        var97 += 1158594091;
                        var97 &= 138953628;
                        var97 >>>= 1;
                        var97 -= -12714139;
                        var97 ^= 1173295732;
                    }
                }

                long var107 = var97;
                long var134 = var107 + 1L;
                long var135 = var107 * var134;
                long var108 = var135 & 1L;
                long var339;
                var97 = (var339 = var108 - 0L) == 0L ? 0 : (var339 < 0L ? -1 : 1);
                if (var97 == 0) {
                    IllegalArgumentException var111 = new IllegalArgumentException();
                    throw var111;
                }
                break label174;
            }

            long var127 = var97;
            long var166 = var127 + 1L;
            var166 = var127 * var166;
            var127 = var166 & 1L;
            long var340;
            int var129 = (var340 = var127 - 0L) == 0L ? 0 : (var340 < 0L ? -1 : 1);
            if (var129 == 0) {
                return;
            }
        }

        UnsupportedOperationException var110 = new UnsupportedOperationException();
        throw var110;
    }

    public boolean g(float var1, float var2) {
        boolean var72 = false;
        label117: {
            int var3 = TA;
            var3 ^= 1634681147;
            int var4 = System.identityHashCode(this);
            XF var5 = this.SW;
            float var73 = var5.bs();
            float var137;
            int var6 = (var137 = var1 - var73) == 0.0F ? 0 : (var137 < 0.0F ? -1 : 1);
            int var7 = var4 + 1;
            var7 = var4 * var7;
            int var8 = var4 + 2;
            var7 *= var8;
            var8 = var4 + 3;
            var7 *= var8;
            var7 &= 7;
            if (var7 != 0) {
                var3 &= -1345353455;
                var3 ^= 1406841924;
            } else {
                label123: {
                    label112: {
                        var3 >>= 4;
                        var3 ^= -1556003987;
                        if (var6 >= 0) {
                            var3 = switch (var3) {
                                default -> var3 ^ -1972707653;
                                case 949781148 -> var3 ^ 747080728;
                                case 1501250958 -> {
                                    var3 |= -590793543;
                                    var3 &= -1309231464;
                                    var3 >>>= 5;
                                    yield var3 ^ 2087034057;
                                }
                            };
                            Integer var100 = var3;
                            if (var100 == null) {
                                break label117;
                            }

                            float var74 = var73 + 148.0F;
                            float var138;
                            int var75 = (var138 = var1 - var74) == 0.0F ? 0 : (var138 < 0.0F ? -1 : 1);
                            var100 = var4;
                            if (var100 == null) {
                                var3 |= 1252316910;
                                var3 *= 1143946751;
                                var3 >>>= 19;
                                var3 ^= -262495408;
                                break label123;
                            }

                            var3 -= -439660257;
                            var3 &= -860304839;
                            var3 ^= 1612967479;
                            if (var75 < 0) {
                                var3 &= 729939892;
                                var3 ^= 1056819861;
                                int var76 = var3 + 1;
                                int var77 = var3 * var76;
                                int var102 = var3 + 2;
                                int var78 = var77 * var102;
                                var102 = var3 + 3;
                                int var79 = var78 * var102;
                                int var80 = var79 & 7;
                                if (var80 != 0) {
                                    break label117;
                                }

                                float var81 = this.m;
                                Integer var104 = var4;
                                if (var104 == null) {
                                    var3 *= 485126919;
                                    var3 ^= -1658501682;
                                    var3 ^= -1394543876;
                                    break label123;
                                }

                                var3 >>>= 10;
                                var3 -= -533013478;
                                var3 -= -115807199;
                                var3 >>= 4;
                                var3 ^= -326883960;
                                long var105 = var3;
                                long var129 = var105 + 1L;
                                long var130 = var105 * var129;
                                long var106 = var130 & 1L;
                                long var139;
                                int var107 = (var139 = var106 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                                if (var107 != 0) {
                                    break label117;
                                }

                                float var140;
                                int var82 = (var140 = var2 - var81) == 0.0F ? 0 : (var140 < 0.0F ? -1 : 1);
                                if (var82 >= 0) {
                                    var3 |= -1383220656;
                                    var3 -= 1520951572;
                                    var3 *= 45961731;
                                    var3 ^= 97570502;
                                    var3 ^= -426542856;
                                    long var83 = var3;
                                    long var116 = var83 + 1L;
                                    long var117 = var83 * var116;
                                    long var9 = var83 + 2L;
                                    long var118 = var117 * var9;
                                    long var84 = var83 + 3L;
                                    long var119 = var118 * var84;
                                    long var85 = var119 & 7L;
                                    long var141;
                                    int var86 = (var141 = var85 - 0L) == 0L ? 0 : (var141 < 0L ? -1 : 1);
                                    if (var86 != 0) {
                                        break label117;
                                    }

                                    int var87 = var3 >>> 17;
                                    int var88 = var87 * 609656299;
                                    int var89 = var88 ^ -1144857394;
                                    float var90 = this.yX(var89);
                                    float var108 = this.tl;
                                    float var91 = var90 + var108;
                                    long var109 = var4;
                                    long var131 = var109 + 1L;
                                    long var132 = var109 * var131;
                                    long var10 = var109 + 2L;
                                    long var133 = var132 * var10;
                                    long var110 = var109 + 3L;
                                    long var134 = var133 * var110;
                                    long var111 = var134 & 7L;
                                    long var142;
                                    var4 = (var142 = var111 - 0L) == 0L ? 0 : (var142 < 0L ? -1 : 1);
                                    if (var4 != 0) {
                                        switch (var3) {
                                            case -2055539305:
                                                var3 <<= 6;
                                                var3 ^= -1329953972;
                                                var3 ^= 509434585;
                                                break label123;
                                            case -1055813871:
                                            default:
                                                var3 ^= -1654816916;
                                                break label123;
                                            case 2123387119:
                                                var3 ^= 799816609;
                                                break label123;
                                        }
                                    }

                                    var3 *= -170380843;
                                    var3 += -265299559;
                                    var3 ^= 1056557316;
                                    var4 = var3 + 1;
                                    var4 = var3 * var4;
                                    var4 &= 1;
                                    if (var4 != 0) {
                                        break label117;
                                    }

                                    float var143;
                                    var4 = (var143 = var2 - var91) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
                                    if (var4 < 0) {
                                        var3 = switch (var3) {
                                            default -> var3 ^ 223261842;
                                            case -639247134 -> var3 ^ 917961519;
                                            case 2081545784 -> {
                                                var3 *= 1095003781;
                                                var3 &= 1013256376;
                                                yield var3 ^ 693039227;
                                            }
                                        };
                                        var72 = true;
                                        var3 *= -1116637957;
                                        var3 >>>= 19;
                                        var3 ^= -149100612;
                                        break label112;
                                    }

                                    var3 *= 930325557;
                                    var3 -= -844269475;
                                    var3 ^= -2059993861;
                                } else {
                                    var3 *= 1724531489;
                                    var3 ^= 261978375;
                                }
                            } else {
                                var3 >>= 22;
                                var3 ^= 1430284864;
                            }
                        } else {
                            switch (var3) {
                                case -538102153:
                                default:
                                    var3 ^= 945844062;
                                    break;
                                case 723797455:
                                    var3 ^= -1427870892;
                                    break;
                                case 1501250958:
                                    var3 &= 226350428;
                                    var3 ^= -1547251508;
                            }
                        }

                        long var92 = var3;
                        long var120 = var92 + 1L;
                        long var121 = var92 * var120;
                        long var135 = var92 + 2L;
                        long var122 = var121 * var135;
                        long var93 = var92 + 3L;
                        long var123 = var122 * var93;
                        long var94 = var123 & 7L;
                        long var144;
                        int var95 = (var144 = var94 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                        if (var95 != 0) {
                            break label117;
                        }

                        var72 = false;
                        var3 *= 792361363;
                        var3 -= 650070778;
                        var3 ^= 1469548949;
                    }

                    long var96 = var3;
                    long var124 = var96 + 1L;
                    long var125 = var96 * var124;
                    long var136 = var96 + 2L;
                    long var126 = var125 * var136;
                    long var97 = var96 + 3L;
                    long var127 = var126 * var97;
                    long var98 = var127 & 7L;
                    long var145;
                    var3 = (var145 = var98 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return var72;
                    }
                    break label117;
                }
            }

            UnsupportedOperationException var99 = new UnsupportedOperationException();
            throw var99;
        }

        RuntimeException var64 = new RuntimeException();
        throw var64;
    }

    public pk Tm(float var1, float var2) {
        label161: {
            int var3 = TA;
            var3 ^= -473009584;
            int var4 = System.identityHashCode(this);
            long var5 = var4;
            long var7 = var5 + 1L;
            var7 = var5 * var7;
            long var9 = var5 + 2L;
            var7 *= var9;
            var5 += 3L;
            var7 *= var5;
            var5 = var7 & 7L;
            long var231;
            int var130 = (var231 = var5 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
            if (var130 != 0) {
                var3 ^= -545058874;
                var3 += 102754930;
                var3 += 1904206504;
                var3 *= 684392823;
                var3 ^= -1460556700;
            } else {
                label168: {
                    var3 = switch (var3) {
                        default -> var3 ^ 976909703;
                        case 323462161 -> var3 ^ -234146322;
                        case 553737560 -> {
                            var3 -= -101027996;
                            var3 -= 452779093;
                            yield var3 ^ -1296025592;
                        }
                    };
                    boolean var131 = this.g(var1, var2);
                    if (var131) {
                        var3 -= -1403564655;
                        var3 ^= -107477407;
                        var3 += 1531684670;
                        var3 *= 702413567;
                        var3 ^= -1689782826;
                        int var132 = var3 | -1932031094;
                        int var133 = var132 * 1484014277;
                        int var134 = var133 - -1653558257;
                        int var135 = var134 ^ 1728750642;
                        int var136 = var135 ^ 1758997119;
                        float var137 = this.yX(var136);
                        float var232;
                        int var138 = (var232 = var2 - var137) == 0.0F ? 0 : (var232 < 0.0F ? -1 : 1);
                        Integer var6 = var4;
                        if (var6 == null) {
                            switch (var3) {
                                case -1179510767:
                                    var3 ^= 1050784069;
                                    break label168;
                                case -1080940721:
                                default:
                                    var3 ^= -1311131651;
                                    break label168;
                                case 420524173:
                                    var3 *= -1162133523;
                                    var3 &= -1500513522;
                                    var3 <<= 4;
                                    var3 ^= 1380436588;
                                    break label168;
                            }
                        }

                        var3 &= -656308203;
                        var3 -= -1674227727;
                        var3 &= 852185621;
                        var3 *= 1270703891;
                        var3 ^= 676169443;
                        var6 = var3;
                        if (var6 == null) {
                            break label161;
                        }

                        if (var138 >= 0) {
                            var3 = switch (var3) {
                                case 453229471 -> {
                                    var3 *= -857614861;
                                    yield var3 ^ -431701421;
                                }
                                case 483409709 -> var3 ^ 239635316;
                                default -> var3 ^ -1104735701;
                            };
                            int var139 = var3 >>> 21;
                            int var140 = var139 ^ -1821641392;
                            float var141 = this.yX(var140);
                            float var142 = var141 + 5.0F;
                            XF var150 = this.c;
                            float var151 = var150.bs();
                            float var143 = var142 - var151;
                            var6 = var4;
                            if (var6 == null) {
                                switch (var3) {
                                    case -1138646850:
                                        var3 <<= 5;
                                        var3 &= -301054332;
                                        var3 ^= -569254804;
                                        break label168;
                                    case -459975121:
                                        var3 ^= 1811810092;
                                        break label168;
                                    case 2112963005:
                                    default:
                                        var3 ^= 2084008865;
                                        break label168;
                                }
                            } else {
                                var3 = switch (var3) {
                                    case -1170546637 -> var3 ^ -1074627862;
                                    case -1138646850 -> {
                                        var3 += 973123363;
                                        var3 ^= 1702560601;
                                        var3 &= -491655544;
                                        yield var3 ^ -364083274;
                                    }
                                    default -> var3 ^ 1241590149;
                                };
                                var6 = var3;
                                if (var6 == null) {
                                    break label161;
                                }

                                List var154 = this.Mm;
                                Iterator var155 = var154.iterator();
                                Iterator var156 = var155;
                                float var144 = var143;
                                var3 ^= 2091405461;
                                var3 -= 1315726031;
                                var3 |= -888312932;
                                var3 ^= -746358481;

                                while (true) {
                                    boolean var164 = var156.hasNext();
                                    int var8 = var4 + 1;
                                    var8 = var4 * var8;
                                    int var196 = var4 + 2;
                                    var8 *= var196;
                                    int var197 = var4 + 3;
                                    var8 *= var197;
                                    var8 &= 7;
                                    if (var8 != 0) {
                                        var3 >>= 15;
                                        var3 ^= 1511383792;
                                        break label168;
                                    }

                                    var3 &= -854496947;
                                    var3 ^= 1203903205;
                                    if (!var164) {
                                        var3 -= -317475784;
                                        var3 *= 871898599;
                                        var3 ^= 1771478718;
                                        long var123 = var3;
                                        long var157 = var123 + 1L;
                                        long var158 = var123 * var157;
                                        long var195 = var123 + 2L;
                                        long var159 = var158 * var195;
                                        long var124 = var123 + 3L;
                                        long var160 = var159 * var124;
                                        long var125 = var160 & 7L;
                                        long var233;
                                        var4 = (var233 = var125 - 0L) == 0L ? 0 : (var233 < 0L ? -1 : 1);
                                        if (var4 == 0) {
                                            return null;
                                        }
                                        break label161;
                                    }

                                    var3 ^= 936785016;
                                    var3 ^= 675892577;
                                    var3 ^= -1376579180;
                                    var3 += 559346334;
                                    var3 ^= 1537494012;
                                    Integer var165 = var3;
                                    if (var165 == null) {
                                        break label161;
                                    }

                                    Object var166 = var156.next();
                                    var8 = var4 + 1;
                                    var8 = var4 * var8;
                                    int var198 = var4 + 2;
                                    var8 *= var198;
                                    int var199 = var4 + 3;
                                    var8 *= var199;
                                    var8 &= 7;
                                    if (var8 != 0) {
                                        switch (var3) {
                                            case -356033233:
                                                var3 ^= -950773064;
                                                break label168;
                                            case 824569631:
                                            default:
                                                var3 ^= -2062546927;
                                                break label168;
                                            case 1084305211:
                                                var3 &= -56841289;
                                                var3 <<= 7;
                                                var3 &= -1032424906;
                                                var3 ^= 436325100;
                                                break label168;
                                        }
                                    }

                                    var3 ^= 336286784;
                                    var3 &= 1910173993;
                                    var3 &= 1960389341;
                                    var3 *= -1233784091;
                                    var3 ^= -1432207129;
                                    var8 = var3 + 1;
                                    var8 = var3 * var8;
                                    int var200 = var3 + 2;
                                    var8 *= var200;
                                    int var201 = var3 + 3;
                                    var8 *= var201;
                                    var8 &= 7;
                                    if (var8 != 0) {
                                        break label161;
                                    }

                                    pk var167 = (pk)var166;
                                    float var185 = var167.V();
                                    float var234;
                                    int var202 = (var234 = var2 - var144) == 0.0F ? 0 : (var234 < 0.0F ? -1 : 1);
                                    if (var202 >= 0) {
                                        var3 |= 1959130313;
                                        var3 += -1133981016;
                                        var3 &= 413011965;
                                        var3 *= 1553231441;
                                        var3 ^= 1241514801;
                                        int var203 = var3 + 1;
                                        int var204 = var3 * var203;
                                        int var10 = var3 + 2;
                                        int var205 = var204 * var10;
                                        var10 = var3 + 3;
                                        int var206 = var205 * var10;
                                        int var207 = var206 & 7;
                                        if (var207 != 0) {
                                            break label161;
                                        }

                                        float var208 = var144 + var185;
                                        float var235;
                                        int var209 = (var235 = var2 - var208) == 0.0F ? 0 : (var235 < 0.0F ? -1 : 1);
                                        var10 = var4 + 1;
                                        var10 = var4 * var10;
                                        int var11 = var4 + 2;
                                        var10 *= var11;
                                        var11 = var4 + 3;
                                        var10 *= var11;
                                        var10 &= 7;
                                        if (var10 != 0) {
                                            var3 |= -1393692012;
                                            var3 &= -682366476;
                                            var3 ^= -1891224776;
                                            break label168;
                                        }

                                        var3 *= 52246489;
                                        var3 <<= 8;
                                        var3 -= 1897870814;
                                        var3 -= 466455514;
                                        var3 ^= -415040018;
                                        if (var209 < 0) {
                                            var3 |= 2115779881;
                                            var3 &= 1861141685;
                                            var3 ^= 818933624;
                                            var9 = var3;
                                            long var227 = var9 + 1L;
                                            long var228 = var9 * var227;
                                            long var13 = var9 + 2L;
                                            long var229 = var228 * var13;
                                            var9 += 3L;
                                            long var230 = var229 * var9;
                                            var9 = var230 & 7L;
                                            long var236;
                                            int var213 = (var236 = var9 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                                            if (var213 == 0) {
                                                return var167;
                                            }
                                            break label161;
                                        }

                                        var3 *= 535893177;
                                        var3 *= 1962465455;
                                        var3 |= 1071816572;
                                        var3 |= -628722841;
                                        var3 ^= -187928414;
                                    } else {
                                        switch (var3) {
                                            case -35318337:
                                            default:
                                                var3 ^= -1912300244;
                                                break;
                                            case -9752184:
                                                var3 ^= -1849249393;
                                                break;
                                            case 1753770730:
                                                var3 -= -163277278;
                                                var3 ^= 2036947733;
                                        }
                                    }

                                    float var168 = var185 + 3.0F;
                                    long var186 = var4;
                                    long var222 = var186 + 1L;
                                    var222 = var186 * var222;
                                    long var12 = var186 + 2L;
                                    var222 *= var12;
                                    long var187 = var186 + 3L;
                                    var222 *= var187;
                                    long var188 = var222 & 7L;
                                    long var237;
                                    var8 = (var237 = var188 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                                    if (var8 != 0) {
                                        var3 >>= 29;
                                        var3 ^= -1616485840;
                                        var3 -= 1561995380;
                                        var3 |= -1503570693;
                                        var3 ^= -1124554989;
                                        break label168;
                                    }

                                    var3 += 1609507307;
                                    var3 <<= 12;
                                    var3 ^= 617959232;
                                    var8 = var3 + 1;
                                    var8 = var3 * var8;
                                    int var214 = var3 + 2;
                                    var8 *= var214;
                                    int var215 = var3 + 3;
                                    var8 *= var215;
                                    var8 &= 7;
                                    if (var8 != 0) {
                                        break label161;
                                    }

                                    float var169 = var144 + var168;
                                    var144 = var169;
                                    var3 &= -584180502;
                                    var3 &= -1214570120;
                                    var3 >>>= 5;
                                    var3 += 1542981176;
                                    var3 ^= 2091795657;
                                }
                            }
                        }

                        var3 -= 647448370;
                        var3 += -967012506;
                        var3 *= 1295963961;
                        var3 ^= -377772566;
                    } else {
                        var3 *= -1486780483;
                        var3 *= 1275820485;
                        var3 ^= -620346954;
                    }

                    long var113 = var3;
                    var5 = var113 + 1L;
                    var5 = var113 * var5;
                    var7 = var113 + 2L;
                    var5 *= var7;
                    long var114 = var113 + 3L;
                    var5 *= var114;
                    long var115 = var5 & 7L;
                    long var238;
                    var3 = (var238 = var115 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        return null;
                    }
                    break label161;
                }
            }

            AssertionError var127 = new AssertionError();
            throw var127;
        }

        AssertionError var117 = new AssertionError();
        throw var117;
    }

    public void TL(float var1) {
        int var2 = TA;
        var2 ^= 2010015561;
        int var3 = System.identityHashCode(this);
        float var4 = this.mQ;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var3 = var5 & 1;
        if (var3 == 0) {
            var2 += 1539361633;
            var2 ^= 109101124;
            float var19 = var4 + var1;
            this.mQ = var19;
        } else {
            var2 += -1805012691;
            var2 += -431048229;
            var2 |= -58686339;
            var2 ^= 2073421496;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var2 = var3 & 1;
            if (var2 != 0) {
                IllegalStateException var13 = new IllegalStateException();
                throw var13;
            } else {
                IllegalArgumentException var12 = new IllegalArgumentException();
                throw var12;
            }
        }
    }

    public float x() {
        int var1 = TA;
        var1 ^= -1192576409;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 += 83235662;
            var1 ^= -1072182900;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                float var20 = this.tl;
                return 32.0F + var20;
            }
        } else {
            var1 &= -2146033150;
            var1 -= 1791525580;
            var1 *= -1772520873;
            var1 ^= 1286168049;
            Integer var12 = var1;
            if (var12 != null) {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }

        AssertionError var13 = new AssertionError();
        throw var13;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 920152137;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        TA = var4;
    }
}
