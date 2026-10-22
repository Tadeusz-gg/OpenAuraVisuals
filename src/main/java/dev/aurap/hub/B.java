package dev.aurap.hub;

import mvggs.modules.hud.potions;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;

public final class B {
    public final potions yD;
    public final RegistryEntry F;
    public final XF Bg;
    public final StringBuilder j;
    public String W;
    public boolean fK;
    public boolean jR;
    public boolean Rt;
    public boolean eO;
    public int GM;
    public int kg;
    public int zK;
    public float G;
    public float R;
    public float h;
    public float IJ;
    public float Xe;
    public float Rb;
    public float A;
    public float u;
    private boolean Ab;
    private int Y;
    public static final int DQ;

    public B(potions var1, RegistryEntry var2) {
        this.yD = var1;
        kE_2 var4 = kE_2.uY(0.42F, 0.82F);
        XF var3 = new XF(0.0F, var4);
        this.Bg = var3;
        StringBuilder var5 = new StringBuilder(10);
        this.j = var5;
        this.W = "";
        this.GM = -1;
        this.kg = Integer.MIN_VALUE;
        this.Xe = 99.0F;
        this.F = var2;
        boolean var6 = i_2.JB(var2);
        this.Rt = var6;
    }

    public void zn(StatusEffectInstance var1) {
        label120: {
            int var40;
            var40 = DQ;
            var40 ^= 821428172;
            int var3 = System.identityHashCode(this);
            int var4 = var1.getAmplifier();
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            label119:
            if (var5 == 0) {
                var40 |= -1785390318;
                var40 <<= 19;
                var40 >>>= 19;
                var40 |= 1562247699;
                var40 ^= -824819276;
                long var108 = var40;
                long var7 = var108 + 1L;
                var7 = var108 * var7;
                long var9 = var108 + 2L;
                var7 *= var9;
                long var109 = var108 + 3L;
                var7 *= var109;
                long var110 = var7 & 7L;
                long var189;
                var5 = (var189 = var110 - 0L) == 0L ? 0 : (var189 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label120;
                }

                var5 = this.GM;
                if (var4 != var5) {
                    var40 &= 1983418487;
                    var40 ^= 1959735869;
                    long var91 = var40;
                    long var128 = var91 + 1L;
                    long var129 = var91 * var128;
                    long var8 = var91 + 2L;
                    long var130 = var129 * var8;
                    long var92 = var91 + 3L;
                    long var131 = var130 * var92;
                    long var93 = var131 & 7L;
                    long var190;
                    var4 = (var190 = var93 - 0L) == 0L ? 0 : (var190 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label120;
                    }

                    var4 = var1.getAmplifier();
                    this.GM = var4;
                    RegistryEntry var96 = this.F;
                    String var97 = i_2.kp(var96);
                    var5 = this.GM;
                    String[] var132 = potions.ROMAN;
                    var6 = var132.length;
                    int var150 = var3 + 1;
                    int var151 = var3 * var150;
                    int var152 = var151 & 1;
                    if (var152 != 0) {
                        var40 >>= 25;
                        var40 -= 841972257;
                        var40 -= -1205016578;
                        var40 <<= 30;
                        var40 ^= 1094732079;
                        break label119;
                    }

                    var40 |= -1850327865;
                    var40 += 383650671;
                    var40 &= -1469109095;
                    var40 &= -811569112;
                    var40 ^= -54293782;
                    var7 = var40;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var191;
                    int var156 = (var191 = var7 - 0L) == 0L ? 0 : (var191 < 0L ? -1 : 1);
                    if (var156 != 0) {
                        break label120;
                    }

                    String var117;
                    if (var5 < var6) {
                        var40 -= -389932046;
                        var40 += -1891200070;
                        var40 ^= -26520773;
                        Integer var114 = var40;
                        if (var114 == null) {
                            break label120;
                        }

                        String[] var115 = potions.ROMAN;
                        var6 = this.GM;
                        int var157 = var3 + 1;
                        int var158 = var3 * var157;
                        int var159 = var158 & 1;
                        if (var159 != 0) {
                            var40 += -997255239;
                            var40 ^= 1760698469;
                            break label119;
                        }

                        var40 |= 837364179;
                        var40 -= -925950514;
                        var40 += 1905560885;
                        var40 -= 1217159898;
                        var40 ^= -1138498869;
                        int var160 = var40 + 1;
                        int var161 = var40 * var160;
                        int var175 = var40 + 2;
                        int var162 = var161 * var175;
                        int var176 = var40 + 3;
                        int var163 = var162 * var176;
                        int var164 = var163 & 7;
                        if (var164 != 0) {
                            break label120;
                        }

                        var6 = Math.max(0, var6);
                        String var116 = var115[var6];
                        var117 = var116;
                        var40 ^= 1255777880;
                        var40 += -830985759;
                        var40 >>>= 31;
                        var40 |= 1145973610;
                        var40 ^= -576125549;
                    } else {
                        var40 ^= -756955339;
                        var40 |= 1622452401;
                        var40 ^= 1239528882;
                        Integer var136 = var40;
                        if (var136 == null) {
                            break label120;
                        }

                        int var137 = this.GM;
                        var7 = var3;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var192;
                        int var168 = (var192 = var7 - 0L) == 0L ? 0 : (var192 < 0L ? -1 : 1);
                        if (var168 != 0) {
                            var40 <<= 19;
                            var40 ^= -2090317521;
                            break label119;
                        }
                        var40 = switch (var40) {
                            default -> var40 ^ -1809381084;
                            case -1416856851 -> var40 ^ 377000261;
                            case 794253381 -> {
                                var40 -= 1218015297;
                                var40 |= -156709038;
                                yield var40 ^ 1557144719;
                            }
                        };
                        int var169 = var40 + 1;
                        int var170 = var40 * var169;
                        int var177 = var40 + 2;
                        int var171 = var170 * var177;
                        int var178 = var40 + 3;
                        int var172 = var171 * var178;
                        int var173 = var172 & 7;
                        if (var173 != 0) {
                            break label120;
                        }

                        String var139 = Integer.toString(++var137);
                        var117 = var139;
                        switch (var40) {
                            case -1435644967:
                                var40 *= 502755755;
                                var40 *= 1004110651;
                                var40 += 1217500626;
                                var40 ^= -1069432277;
                                break;
                            case -395204162:
                                var40 ^= -1827841910;
                                break;
                            case 2114049525:
                            default:
                                var40 ^= -999994018;
                        }
                    }

                    Integer var140 = var40;
                    if (var140 == null) {
                        break label120;
                    }

                    String var98 = var97 + " " + var117;
                    var5 = var3 + 1;
                    var5 = var3 * var5;
                    int var141 = var3 + 2;
                    var5 *= var141;
                    var141 = var3 + 3;
                    var5 *= var141;
                    var5 &= 7;
                    if (var5 != 0) {
                        var40 += -1908120971;
                        var40 ^= 1768675394;
                        break label119;
                    }
                    var40 = switch (var40) {
                        case -1712902408 -> {
                            var40 *= -466551759;
                            var40 *= -1488486083;
                            var40 -= -507826926;
                            yield var40 ^ -582492493;
                        }
                        case -478602696 -> var40 ^ 686853952;
                        default -> var40 ^ -2013917922;
                    };
                    this.W = var98;
                    var40 += 1695399402;
                    var40 += 2049701574;
                    var40 -= -1525402336;
                    var40 *= 1049819359;
                    var40 ^= 143626804;
                } else {
                    switch (var40) {
                        case -1815586297:
                            var40 += -724578602;
                            var40 ^= 1567779095;
                            var40 += -548464561;
                            var40 ^= 1315839670;
                            break;
                        case 769594163:
                            var40 ^= 18256960;
                            break;
                        case 2017670529:
                        default:
                            var40 ^= 346238585;
                    }
                }

                long var99 = var40;
                long var143 = var99 + 1L;
                long var144 = var99 * var143;
                long var179 = var99 + 2L;
                long var145 = var144 * var179;
                long var100 = var99 + 3L;
                long var146 = var145 * var100;
                long var101 = var146 & 7L;
                long var193;
                var4 = (var193 = var101 - 0L) == 0L ? 0 : (var193 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label120;
                }

                boolean var103 = var1.isInfinite();
                this.Ab = var103;
                Integer var83 = var3;
                if (var83 != null) {
                    var40 ^= 460841466;
                    var40 *= 1964584933;
                    var40 -= -816231248;
                    var40 ^= 1622908755;
                    long var84 = var40;
                    long var123 = var84 + 1L;
                    long var124 = var84 * var123;
                    var7 = var84 + 2L;
                    long var125 = var124 * var7;
                    long var85 = var84 + 3L;
                    long var126 = var125 * var85;
                    long var86 = var126 & 7L;
                    long var194;
                    int var87 = (var194 = var86 - 0L) == 0L ? 0 : (var194 < 0L ? -1 : 1);
                    if (var87 == 0) {
                        var87 = var1.getDuration();
                        this.Y = var87;
                        return;
                    }
                    break label120;
                }

                var40 ^= -1167734687;
                var40 &= 1536940786;
                var40 -= 389383516;
                var40 += 1004525751;
                var40 ^= 620533042;
            } else {
                var40 |= 2075902505;
                var40 ^= 884086012;
                var40 |= -1991759508;
                var40 |= -712094695;
                var40 ^= -1634748846;
            }

            var3 = var40 + 1;
            var3 = var40 * var3;
            var40 = var3 & 1;
            if (var40 == 0) {
                RuntimeException var82 = new RuntimeException();
                throw var82;
            }
        }

        IllegalStateException var81 = new IllegalStateException();
        throw var81;
    }

    public void JS(float var1) {
        boolean var244 = false;
        label318: {
            int var29;
            var29 = DQ;
            var29 ^= -1150119950;
            int var3 = System.identityHashCode(this);
            float var4 = this.Xe;
            Integer var5 = var3;
            label317:
            if (var5 != null) {
                var29 += 1823789606;
                var29 ^= 622782115;
                int var219 = var29 + 1;
                var219 = var29 * var219;
                int var6 = var29 + 2;
                var219 *= var6;
                var6 = var29 + 3;
                var219 *= var6;
                var219 &= 7;
                if (var219 != 0) {
                    break label318;
                }

                var4 += var1;
                this.Xe = var4;
                float var368;
                int var194 = (var368 = var4 - 2.0F) == 0.0F ? 0 : (var368 < 0.0F ? -1 : 1);
                if (var194 > 0) {
                    var29 += 1130347649;
                    var29 &= 479683646;
                    var29 <<= 17;
                    var29 ^= 1121845092;
                    int var195 = var29 + 1;
                    int var196 = var29 * var195;
                    var219 = var29 + 2;
                    int var197 = var196 * var219;
                    var219 = var29 + 3;
                    int var198 = var197 * var219;
                    int var199 = var198 & 7;
                    if (var199 != 0) {
                        break label318;
                    }

                    this.Xe = 0.0F;
                    Integer var200 = var3;
                    if (var200 == null) {
                        var29 *= -336543333;
                        var29 -= 1512900232;
                        var29 ^= 1296135490;
                        break label317;
                    }

                    var29 &= -798892790;
                    var29 |= 1323674951;
                    var29 *= -1505442139;
                    var29 &= 346208448;
                    var29 ^= 1785457753;
                    RegistryEntry var201 = this.F;
                    potions var226 = this.yD;
                    float[] var227 = var226.uv;
                    int var202 = i_2.ow(var201, var227);
                    this.zK = var202;
                    potions var203 = this.yD;
                    float[] var204 = var203.uv;
                    var4 = var204[0];
                    this.G = var4;
                    potions var206 = this.yD;
                    float[] var207 = var206.uv;
                    var4 = var207[1];
                    this.R = var4;
                    potions var209 = this.yD;
                    float[] var210 = var209.uv;
                    var4 = var210[2];
                    this.h = var4;
                    potions var212 = this.yD;
                    float[] var213 = var212.uv;
                    var4 = var213[3];
                    this.IJ = var4;
                    var29 ^= -896964550;
                    var29 ^= -109550226;
                } else {
                    var29 *= 761320335;
                    var29 <<= 20;
                    var29 ^= -1783969331;
                }

                Integer var215 = var29;
                if (var215 == null) {
                    break label318;
                }

                boolean var216 = this.Ab;
                long var228 = var3;
                long var7 = var228 + 1L;
                var7 = var228 * var7;
                long var9 = var228 + 2L;
                var7 *= var9;
                long var229 = var228 + 3L;
                var7 *= var229;
                long var230 = var7 & 7L;
                long var369;
                var219 = (var369 = var230 - 0L) == 0L ? 0 : (var369 < 0L ? -1 : 1);
                label308:
                if (var219 == 0) {
                    var29 -= -1781376274;
                    var29 -= 2140074117;
                    var29 ^= 552203216;
                    int var217;
                    if (var216) {
                        var29 >>= 24;
                        var29 &= -1038820358;
                        var29 -= 1411937836;
                        var29 |= 437802941;
                        var29 ^= -1034424222;
                        var217 = -1;
                        var29 <<= 19;
                        var29 -= 1569979396;
                        var29 |= 1441618727;
                        var29 |= 1300777962;
                        var29 ^= 1973267801;
                    } else {
                        var29 &= 93947412;
                        var29 ^= 1497777016;
                        var29 *= 1031327385;
                        var29 ^= -163899030;
                        long var232 = var29;
                        var7 = var232 + 1L;
                        var7 = var232 * var7;
                        long var233 = var7 & 1L;
                        long var370;
                        var219 = (var370 = var233 - 0L) == 0L ? 0 : (var370 < 0L ? -1 : 1);
                        if (var219 != 0) {
                            break label318;
                        }

                        var219 = this.Y;
                        var219 += 19;
                        var219 /= 20;
                        long var274 = var3;
                        long var8 = var274 + 1L;
                        var8 = var274 * var8;
                        long var275 = var8 & 1L;
                        long var371;
                        var6 = (var371 = var275 - 0L) == 0L ? 0 : (var371 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            var29 &= -2127894274;
                            var29 ^= 1551319700;
                            break label308;
                        }

                        var29 -= 2140260108;
                        var29 |= -522765803;
                        var29 &= -290683971;
                        var29 &= 149002739;
                        var29 ^= 316000558;
                        var6 = var29 + 1;
                        var6 = var29 * var6;
                        int var321 = var29 + 2;
                        var6 *= var321;
                        int var322 = var29 + 3;
                        var6 *= var322;
                        var6 &= 7;
                        if (var6 != 0) {
                            break label318;
                        }

                        var217 = var219;
                        switch (var29) {
                            case -901467240:
                                var29 ^= 1782185037;
                                break;
                            case 441829823:
                                var29 ^= -1694410753;
                                var29 -= 519223362;
                                var29 >>>= 19;
                                var29 ^= 140573418;
                                break;
                            case 631237857:
                            default:
                                var29 ^= 2091477365;
                        }
                    }

                    Integer var238 = var29;
                    if (var238 == null) {
                        break label318;
                    }

                    boolean var239 = this.Ab;
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    var6 &= 1;
                    label300:
                    if (var6 == 0) {
                        var29 *= 181274119;
                        var29 ^= -1781328674;
                        var29 &= -485057465;
                        var29 += 1173748341;
                        var29 ^= 1671099498;
                        long var285 = var29;
                        long var349 = var285 + 1L;
                        var349 = var285 * var349;
                        long var10 = var285 + 2L;
                        var349 *= var10;
                        long var286 = var285 + 3L;
                        var349 *= var286;
                        long var287 = var349 & 7L;
                        long var372;
                        var6 = (var372 = var287 - 0L) == 0L ? 0 : (var372 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label318;
                        }

                        label296: {
                            if (!var239) {
                                var29 *= -1446268655;
                                var29 |= -1177027472;
                                var29 >>= 27;
                                var29 ^= -878346963;
                                long var240 = var29;
                                var7 = var240 + 1L;
                                var7 = var240 * var7;
                                long var241 = var7 & 1L;
                                long var373;
                                int var242 = (var373 = var241 - 0L) == 0L ? 0 : (var373 < 0L ? -1 : 1);
                                if (var242 != 0) {
                                    break label318;
                                }

                                boolean var243 = this.jR;
                                var6 = var3 + 1;
                                var6 = var3 * var6;
                                int var325 = var3 + 2;
                                var6 *= var325;
                                int var326 = var3 + 3;
                                var6 *= var326;
                                var6 &= 7;
                                if (var6 != 0) {
                                    switch (var29) {
                                        case -628915456:
                                            var29 ^= -997430989;
                                            break label300;
                                        case -393450688:
                                        default:
                                            var29 ^= 27030746;
                                            break label300;
                                        case 878346962:
                                            var29 >>>= 20;
                                            var29 -= -939692849;
                                            var29 ^= -464184272;
                                            break label300;
                                    }
                                }

                                var29 <<= 25;
                                var29 |= 1083527614;
                                var29 += 360531547;
                                var29 += -660307387;
                                var29 ^= 625940763;
                                Integer var294 = var29;
                                if (var294 == null) {
                                    break label318;
                                }

                                if (!var243) {
                                    var29 |= -1501521733;
                                    var29 &= -1750544534;
                                    var29 ^= 262683087;
                                    if (var217 <= 10) {
                                        var29 = switch (var29) {
                                            case -1744784731 -> {
                                                var29 += 590012644;
                                                var29 >>= 27;
                                                yield var29 ^ 478421175;
                                            }
                                            case -553790668 -> var29 ^ 603009128;
                                            default -> var29 ^ -105307841;
                                        };
                                        var244 = true;
                                        switch (var29) {
                                            case -1906386565:
                                            default:
                                                var29 ^= -372176596;
                                                break label296;
                                            case -478421184:
                                                var29 *= 886009115;
                                                var29 ^= 1936688684;
                                                break label296;
                                            case 403047781:
                                                var29 ^= 782353807;
                                                break label296;
                                        }
                                    }

                                    var29 <<= 24;
                                    var29 += -310445607;
                                    var29 |= 1236149595;
                                    var29 ^= -1772919998;
                                } else {
                                    switch (var29) {
                                        case -477602515:
                                            var29 ^= -1367259011;
                                            break;
                                        case -134741179:
                                            var29 += -1002922497;
                                            var29 >>>= 2;
                                            var29 <<= 27;
                                            var29 ^= -978477415;
                                            break;
                                        case 642026993:
                                        default:
                                            var29 ^= 634425496;
                                    }
                                }
                            } else {
                                var29 >>= 16;
                                var29 += -1799616009;
                                var29 |= 1681424800;
                                var29 |= -1433479745;
                                var29 ^= -1290581210;
                            }

                            var244 = false;
                            var29 -= 1947146384;
                            var29 += 2147000867;
                            var29 += 1123731617;
                            var29 ^= -1356808927;
                        }

                        long var295 = var29;
                        var349 = var295 + 1L;
                        var349 = var295 * var349;
                        long var296 = var349 & 1L;
                        long var374;
                        var6 = (var374 = var296 - 0L) == 0L ? 0 : (var374 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label318;
                        }

                        this.eO = var244;
                        long var245 = var3;
                        var7 = var245 + 1L;
                        var7 = var245 * var7;
                        var9 = var245 + 2L;
                        var7 *= var9;
                        long var246 = var245 + 3L;
                        var7 *= var246;
                        long var247 = var7 & 7L;
                        long var375;
                        int var248 = (var375 = var247 - 0L) == 0L ? 0 : (var375 < 0L ? -1 : 1);
                        if (var248 != 0) {
                            var29 <<= 7;
                            var29 ^= 82934854;
                        } else {
                            var29 <<= 16;
                            var29 ^= 2142526847;
                            Integer var249 = var29;
                            if (var249 == null) {
                                break label318;
                            }

                            int var250 = this.kg;
                            if (var217 == var250) {
                                var29 <<= 20;
                                var29 *= 1503762523;
                                var29 += -1216203162;
                                var29 ^= 1995418188;
                                return;
                            }
                            var29 = switch (var29) {
                                case 65155943 -> var29 ^ -1469276998;
                                default -> var29 ^ -270351344;
                                case 844651903 -> {
                                    var29 <<= 26;
                                    var29 *= 955367243;
                                    var29 |= 1749191402;
                                    yield var29 ^ 72572036;
                                }
                            };
                            this.kg = var217;
                            StringBuilder var251 = this.j;
                            long var298 = var3;
                            var349 = var298 + 1L;
                            var349 = var298 * var349;
                            long var299 = var349 & 1L;
                            long var376;
                            var6 = (var376 = var299 - 0L) == 0L ? 0 : (var376 < 0L ? -1 : 1);
                            if (var6 != 0) {
                                var29 *= -1893280505;
                                var29 ^= 739171196;
                                var29 *= 1481466817;
                                var29 ^= 2125093560;
                            } else {
                                var29 += -271623567;
                                var29 <<= 20;
                                var29 ^= 1133658470;
                                Integer var301 = var29;
                                if (var301 == null) {
                                    break label318;
                                }

                                var251.setLength(0);
                                int var252 = (this.Ab ? 1 : 0);
                                if (var252 != 0) {
                                    var29 -= 263124265;
                                    var29 ^= -2001117348;
                                    StringBuilder var253 = this.j;
                                    var301 = var3;
                                    if (var301 != null) {
                                        switch (var29) {
                                            case -1240853663:
                                                var29 ^= -755067606;
                                                var29 ^= -1910260194;
                                                break;
                                            case 440280046:
                                            default:
                                                var29 ^= 1217726334;
                                                break;
                                            case 536618915:
                                                var29 ^= 1043383016;
                                        }

                                        StringBuilder var254 = var253.append('∞');
                                        return;
                                    }

                                    var29 -= 513993051;
                                    var29 &= 163907797;
                                    var29 &= -218349885;
                                    var29 ^= -602701242;
                                } else {
                                    var29 |= -1091707766;
                                    var29 ^= 1844196471;
                                    var29 -= 1342238475;
                                    var29 ^= -1273446161;
                                    var252 = var29 + 1;
                                    var252 = var29 * var252;
                                    int var303 = var29 + 2;
                                    var252 *= var303;
                                    var303 = var29 + 3;
                                    var252 *= var303;
                                    var252 &= 7;
                                    if (var252 != 0) {
                                        break label318;
                                    }

                                    var252 = var217 / 3600;
                                    var303 = var217 / 60;
                                    Integer var331 = var3;
                                    if (var331 == null) {
                                        switch (var29) {
                                            case -1538925233:
                                            default:
                                                var29 ^= -1333101758;
                                                break;
                                            case -149276063:
                                                var29 *= 1499008003;
                                                var29 += -1778678182;
                                                var29 |= 1560031908;
                                                var29 ^= -2070760073;
                                                var29 ^= -1506095924;
                                                break;
                                            case 786500214:
                                                var29 ^= 992595179;
                                        }
                                    } else {
                                        label329: {
                                            var29 |= -847347855;
                                            var29 += -1710164799;
                                            var29 ^= 1414378963;
                                            Integer var332 = var29;
                                            if (var332 == null) {
                                                break label318;
                                            }

                                            var303 %= 60;
                                            int var218 = var217 % 60;
                                            if (var252 > 0) {
                                                var29 += 348124708;
                                                var29 += 1751811393;
                                                var29 ^= 987856675;
                                                Integer var333 = var29;
                                                if (var333 == null) {
                                                    break label318;
                                                }

                                                StringBuilder var334 = this.j;
                                                StringBuilder var261 = var334.append(var252);
                                                StringBuilder var262 = var261.append(':');
                                                int var335 = var3 + 1;
                                                int var336 = var3 * var335;
                                                int var337 = var336 & 1;
                                                if (var337 != 0) {
                                                    var29 <<= 28;
                                                    var29 += -608064575;
                                                    var29 += -1335262409;
                                                    var29 ^= 8168638;
                                                    break label329;
                                                }
                                                var29 = switch (var29) {
                                                    default -> var29 ^ 50962403;
                                                    case 814801051 -> var29 ^ 31972967;
                                                    case 1879851621 -> {
                                                        var29 >>>= 12;
                                                        var29 *= 357231897;
                                                        yield var29 ^ -1206684498;
                                                    }
                                                };
                                                Integer var338 = var29;
                                                if (var338 == null) {
                                                    break label318;
                                                }

                                                String var343;
                                                if (var303 < 10) {
                                                    var29 = switch (var29) {
                                                        default -> var29 ^ -720418707;
                                                        case 1011831231 -> var29 ^ 484867438;
                                                        case 1897919370 -> {
                                                            var29 -= -1465818779;
                                                            var29 |= 645621430;
                                                            var29 *= 1831478465;
                                                            yield var29 ^ 1377867462;
                                                        }
                                                    };
                                                    var7 = var29;
                                                    var9 = var7 + 1L;
                                                    var9 = var7 * var9;
                                                    long var11 = var7 + 2L;
                                                    var9 *= var11;
                                                    var7 += 3L;
                                                    var9 *= var7;
                                                    var7 = var9 & 7L;
                                                    long var377;
                                                    int var342 = (var377 = var7 - 0L) == 0L ? 0 : (var377 < 0L ? -1 : 1);
                                                    if (var342 != 0) {
                                                        break label318;
                                                    }

                                                    var343 = "0";
                                                    var29 *= 1379678739;
                                                    var29 ^= -156022962;
                                                } else {
                                                    var29 |= 1145510282;
                                                    var29 >>= 31;
                                                    var29 &= -1951807450;
                                                    var29 &= 854803962;
                                                    var29 ^= 1812013687;
                                                    Integer var357 = var29;
                                                    if (var357 == null) {
                                                        break label318;
                                                    }

                                                    var343 = "";
                                                    var29 <<= 17;
                                                    var29 &= 786177258;
                                                    var29 ^= -426560531;
                                                }

                                                StringBuilder var263 = var262.append(var343);
                                                var29 <<= 11;
                                                var29 |= 1624828265;
                                                var29 *= 1286260483;
                                                var29 ^= 1220405609;
                                            } else {
                                                var29 |= 644288223;
                                                var29 ^= 1706120870;
                                                var29 ^= -450811125;
                                            }

                                            var252 = var29 + 1;
                                            var252 = var29 * var252;
                                            int var344 = var29 + 2;
                                            var252 *= var344;
                                            int var345 = var29 + 3;
                                            var252 *= var345;
                                            var252 &= 7;
                                            if (var252 != 0) {
                                                break label318;
                                            }

                                            StringBuilder var269 = this.j;
                                            StringBuilder var270 = var269.append(var303);
                                            Integer var307 = var3;
                                            if (var307 == null) {
                                                var29 |= -413596901;
                                                var29 += 1999524187;
                                                var29 >>>= 26;
                                                var29 -= 917886158;
                                                var29 ^= 354263309;
                                            } else {
                                                var29 &= 7580521;
                                                var29 ^= 1106159906;
                                                int var308 = var29 + 1;
                                                var308 = var29 * var308;
                                                var308 &= 1;
                                                if (var308 != 0) {
                                                    break label318;
                                                }

                                                StringBuilder var271 = var270.append(':');
                                                String var315;
                                                if (var218 < 10) {
                                                    var29 >>>= 25;
                                                    var29 <<= 9;
                                                    var29 ^= 1532464861;
                                                    long var311 = var29;
                                                    var349 = var311 + 1L;
                                                    var349 = var311 * var349;
                                                    var10 = var311 + 2L;
                                                    var349 *= var10;
                                                    long var312 = var311 + 3L;
                                                    var349 *= var312;
                                                    long var313 = var349 & 7L;
                                                    long var378;
                                                    var308 = (var378 = var313 - 0L) == 0L ? 0 : (var378 < 0L ? -1 : 1);
                                                    if (var308 != 0) {
                                                        break label318;
                                                    }

                                                    var315 = "0";
                                                    switch (var29) {
                                                        case -106796267:
                                                        default:
                                                            var29 ^= 1362769958;
                                                            break;
                                                        case 729012223:
                                                            var29 ^= 394144789;
                                                            break;
                                                        case 1532481245:
                                                            var29 *= -1714094447;
                                                            var29 ^= 2066016353;
                                                    }
                                                } else {
                                                    var29 = switch (var29) {
                                                        default -> var29 ^ 2067959691;
                                                        case 1100811106 -> {
                                                            var29 *= 550432717;
                                                            yield var29 ^ -1104392580;
                                                        }
                                                        case 1379033920 -> var29 ^ 946431651;
                                                    };
                                                    Integer var346 = var29;
                                                    if (var346 == null) {
                                                        break label318;
                                                    }

                                                    var315 = "";
                                                    switch (var29) {
                                                        case -1888020646:
                                                            var29 ^= 506312921;
                                                            break;
                                                        case 789763334:
                                                            var29 += 19496589;
                                                            var29 <<= 17;
                                                            var29 <<= 26;
                                                            var29 ^= 1155242316;
                                                            break;
                                                        case 1754266476:
                                                        default:
                                                            var29 ^= 1768177532;
                                                    }
                                                }

                                                Integer var347 = var29;
                                                if (var347 == null) {
                                                    break label318;
                                                }

                                                StringBuilder var272 = var271.append(var315);
                                                Integer var191 = var3;
                                                if (var191 != null) {
                                                    var29 |= 158594331;
                                                    var29 += 1620041352;
                                                    var29 ^= -2141502654;
                                                    StringBuilder var192 = var272.append(var218);
                                                    return;
                                                }

                                                switch (var29) {
                                                    case 370391338:
                                                        var29 ^= -167250260;
                                                        break;
                                                    case 1123417951:
                                                    default:
                                                        var29 ^= -477579267;
                                                        break;
                                                    case 1155242316:
                                                        var29 += -760979357;
                                                        var29 ^= 888576703;
                                                        var29 &= -1437624390;
                                                        var29 ^= 1431392011;
                                                        var29 ^= -1425029539;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var29 ^= 1112165731;
                        var29 &= 1439296988;
                        var29 ^= -1671486590;
                    }
                } else {
                    var29 *= -542504677;
                    var29 ^= -1489307687;
                }
            } else {
                var29 <<= 8;
                var29 ^= -257616826;
            }

            Integer var188 = var29;
            if (var188 != null) {
                IllegalArgumentException var190 = new IllegalArgumentException();
                throw var190;
            }
        }

        UnsupportedOperationException var189 = new UnsupportedOperationException();
        throw var189;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -555953894;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        DQ = var4;
    }
}
