package mvggs.modules.hud;

import dev.aurap.hub.*;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.TextStyle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.registry.entry.RegistryEntry;

public final class potions extends tR_2 {
    private static final float aW = 7.0F;
    private static final float E = 19.0F;
    private static final float T = 14.0F;
    private static final float Eo = 5.0F;
    private static final float Kl = 112.0F;
    private static final float l = 9.0F;
    private static final float Ks = 10.0F;
    public static final String[] ROMAN;
    private static final TextStyle LJ;
    private static final TextStyle u;
    private static final TextStyle Q;
    private final JL Ff;
    private TextStyle G;
    private TextStyle ku;
    private TextStyle HM;
    private TextStyle jJ;
    private final List cf;
    private final Re KO;
    private boolean z;
    public final float[] uv;
    private List bb;
    public static final int YO;

    public potions() {
        super("potions_hud", "Potions", Cl_2.CENTER_LEFT, 4.0F, -24.0F, 2.0F);
        Cl_2 var1 = Cl_2.CENTER_LEFT;

        JL var2 = new JL("hide_vanilla", "Hide Vanilla Icons", true);
        xB var3 = this.vn(var2);
        JL var4 = (JL)var3;
        this.Ff = var4;
        TextStyle var5 = LJ;
        this.G = var5;
        TextStyle var6 = u;
        this.ku = var6;
        TextStyle var7 = u;
        this.HM = var7;
        TextStyle var8 = Q;
        this.jJ = var8;
        ArrayList var9 = new ArrayList();
        this.cf = var9;
        Re var10 = new Re(112.0F, 0.1F);
        this.KO = var10;
        this.z = true;
        float[] var11 = new float[4];
        this.uv = var11;
        this.dy("Your status effects with time left; open chat to move it.");
        this.fJ(true);
    }

    public boolean jC() {
        boolean var45 = false;
        label65: {
            int var1 = YO;
            var1 ^= 1606182358;
            int var2 = System.identityHashCode(this);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var69;
            int var48 = (var69 = var3 - 0L) == 0L ? 0 : (var69 < 0L ? -1 : 1);
            if (var48 != 0) {
                var1 -= -572569504;
                var1 ^= 634280189;
                var1 >>>= 15;
                var1 ^= 1868064277;
            } else {
                label67: {
                    label56: {
                        var1 &= 1819495575;
                        var1 ^= 773996447;
                        boolean var49 = this.IU();
                        if (var49) {
                            var1 *= -1094768559;
                            var1 -= 1631111216;
                            var1 += 1018013879;
                            var1 ^= -989642153;
                            var1 ^= -185689718;
                            var3 = var1;
                            var5 = var3 + 1L;
                            var5 = var3 * var5;
                            var3 = var5 & 1L;
                            long var70;
                            int var52 = (var70 = var3 - 0L) == 0L ? 0 : (var70 < 0L ? -1 : 1);
                            if (var52 != 0) {
                                break label65;
                            }

                            JL var53 = this.Ff;
                            boolean var54 = var53.vb();
                            long var4 = var2;
                            long var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var71;
                            var2 = (var71 = var4 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 |= -877107115;
                                var1 ^= -1259878867;
                                break label67;
                            }

                            var1 |= 965401074;
                            var1 += 574545275;
                            var1 >>= 13;
                            var1 ^= 1792822628;
                            var4 = var1;
                            var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var72;
                            var2 = (var72 = var4 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                break label65;
                            }

                            if (var54) {
                                var1 &= 1919738366;
                                var1 >>= 8;
                                var1 ^= -1588660670;
                                var45 = true;
                                switch (var1) {
                                    case -1590904126:
                                        var1 -= -1896872773;
                                        var1 <<= 18;
                                        var1 &= -1810702414;
                                        var1 ^= 1114552522;
                                        break label56;
                                    case -1445209709:
                                        var1 ^= -1204560488;
                                        break label56;
                                    case -535138505:
                                    default:
                                        var1 ^= -541658232;
                                        break label56;
                                }
                            }

                            var1 >>= 13;
                            var1 ^= 1910296272;
                        } else {
                            switch (var1) {
                                case -555835827:
                                default:
                                    var1 ^= 1516025834;
                                    break;
                                case 241316745:
                                    var1 += 209543156;
                                    var1 ^= 1795165001;
                                    break;
                                case 1128232272:
                                    var1 ^= 80148494;
                            }
                        }

                        var45 = false;
                        var1 &= 1266704787;
                        var1 ^= -1772632214;
                        var1 >>= 16;
                        var1 <<= 22;
                        var1 ^= 666810570;
                    }

                    int var55 = var1 + 1;
                    int var56 = var1 * var55;
                    var1 = var56 & 1;
                    if (var1 == 0) {
                        return var45;
                    }
                    break label65;
                }
            }

            AssertionError var57 = new AssertionError();
            throw var57;
        }

        IllegalArgumentException var38 = new IllegalArgumentException();
        throw var38;
    }

    @Override
    protected void r(Oo var1) {
        int var2 = YO;
        var2 ^= 712498854;
        int var3 = System.identityHashCode(this);
        TextStyle var4 = LJ;
        int var5 = var1.MD();
        var4 = var4.color(var5);
        this.G = var4;
        int var27 = var3 + 1;
        int var28 = var3 * var27;
        var5 = var3 + 2;
        int var29 = var28 * var5;
        var3 += 3;
        int var30 = var29 * var3;
        var3 = var30 & 7;
        if (var3 == 0) {
            var2 -= 428796644;
            var2 |= -1046927799;
            var2 ^= 1318914661;
            var2 &= 928999790;
            var2 ^= 1475075271;
            Integer var19 = var2;
            if (var19 != null) {
                TextStyle var20 = u;
                int var31 = var1.MD();
                TextStyle var21 = var20.color(var31);
                this.ku = var21;
                TextStyle var22 = u;
                int var32 = var1.AE();
                TextStyle var23 = var22.color(var32);
                this.HM = var23;
                TextStyle var24 = Q;
                int var33 = var1.MD();
                TextStyle var25 = var24.color(var33);
                this.jJ = var25;
                return;
            }
        } else {
            var2 >>>= 12;
            var2 ^= 2025285455;
            Integer var14 = var2;
            if (var14 != null) {
                IllegalStateException var16 = new IllegalStateException();
                throw var16;
            }
        }

        AssertionError var15 = new AssertionError();
        throw var15;
    }

    @Override
    protected void Mf() {
        int var1 = YO;
        var1 ^= -1445948079;
        int var2 = System.identityHashCode(this);
        Integer var18 = var2;
        if (var18 != null) {
            var1 ^= -1420944588;
            var1 *= 1316721775;
            var1 |= 272614824;
            var1 += 658116544;
            var1 ^= 1358619755;
            long var19 = var1;
            long var4 = var19 + 1L;
            var4 = var19 * var4;
            long var20 = var4 & 1L;
            long var27;
            int var21 = (var27 = var20 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
            if (var21 == 0) {
                this.z = true;
                return;
            }
        } else {
            var1 ^= 1587839684;
            var1 ^= 56624529;
            int var22 = var1 + 1;
            var22 = var1 * var22;
            int var3 = var1 + 2;
            var22 *= var3;
            var1 += 3;
            var22 *= var1;
            var1 = var22 & 7;
            if (var1 == 0) {
                RuntimeException var17 = new RuntimeException();
                throw var17;
            }
        }

        UnsupportedOperationException var16 = new UnsupportedOperationException();
        throw var16;
    }

    @Override
    protected boolean BM(lH_3 var1) {
        long var661 = 0L;
        float var678 = 0.0F;
        boolean var686 = false;
        label594: {
            int var230;
            int var370;
            label620: {
                var230 = YO;
                var230 ^= 1096578574;
                var370 = System.identityHashCode(this);
                Collection var4 = i_2.ID();
                int var5 = (var1.tl()) ? 1 : 0;
                int var6 = var370 + 1;
                var6 = var370 * var6;
                var6 &= 1;
                if (var6 != 0) {
                    var230 <<= 29;
                    var230 ^= -634548513;
                } else {
                    label656: {
                        var230 &= 1256935215;
                        var230 *= -23436215;
                        var230 ^= 1915352508;
                        var6 = var230 + 1;
                        var6 = var230 * var6;
                        int var7 = var230 + 2;
                        var6 *= var7;
                        var7 = var230 + 3;
                        var6 *= var7;
                        var6 &= 7;
                        if (var6 != 0) {
                            break label594;
                        }

                        label587: {
                            if (var5 != 0) {
                                var230 = switch (var230) {
                                    case 969106026 -> {
                                        var230 ^= 456667627;
                                        yield var230 ^ -330917631;
                                    }
                                    default -> var230 ^ -7667440;
                                    case 2138784419 -> var230 ^ 698462581;
                                };
                                long var400 = var230;
                                long var462 = var400 + 1L;
                                long var463 = var400 * var462;
                                long var9 = var400 + 2L;
                                long var464 = var463 * var9;
                                long var401 = var400 + 3L;
                                long var465 = var464 * var401;
                                long var402 = var465 & 7L;
                                long var751;
                                var5 = (var751 = var402 - 0L) == 0L ? 0 : (var751 < 0L ? -1 : 1);
                                if (var5 != 0) {
                                    break label594;
                                }

                                int var404 = (var4.isEmpty()) ? 1 : 0;
                                long var425 = var370;
                                long var8 = var425 + 1L;
                                var8 = var425 * var8;
                                long var10 = var425 + 2L;
                                var8 *= var10;
                                long var426 = var425 + 3L;
                                var8 *= var426;
                                long var427 = var8 & 7L;
                                long var752;
                                var6 = (var752 = var427 - 0L) == 0L ? 0 : (var752 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    var230 *= -1895664947;
                                    var230 |= -1482000160;
                                    var230 <<= 20;
                                    var230 ^= -1808953633;
                                    break label656;
                                }
                                var230 = switch (var230) {
                                    case -826422656 -> {
                                        var230 -= 760645957;
                                        var230 &= 1366893146;
                                        yield var230 ^ -1173038946;
                                    }
                                    default -> var230 ^ -269758802;
                                    case 385593643 -> var230 ^ -1310989250;
                                };
                                var6 = var230 + 1;
                                var6 = var230 * var6;
                                var7 = var230 + 2;
                                var6 *= var7;
                                var7 = var230 + 3;
                                var6 *= var7;
                                var6 &= 7;
                                if (var6 != 0) {
                                    break label594;
                                }

                                if (var404 != 0) {
                                    var230 ^= -63098848;
                                    var230 ^= 782612620;
                                    var230 ^= -2009002115;
                                    long var405 = var230;
                                    long var468 = var405 + 1L;
                                    long var469 = var405 * var468;
                                    var9 = var405 + 2L;
                                    long var470 = var469 * var9;
                                    long var406 = var405 + 3L;
                                    long var471 = var470 * var406;
                                    long var407 = var471 & 7L;
                                    long var753;
                                    var404 = (var753 = var407 - 0L) == 0L ? 0 : (var753 < 0L ? -1 : 1);
                                    if (var404 != 0) {
                                        break label594;
                                    }

                                    var5 = 1;
                                    switch (var230) {
                                        case -508797099:
                                            var230 |= -1694619644;
                                            var230 |= -1995248568;
                                            var230 ^= -1230896413;
                                            break label587;
                                        case 446507600:
                                            var230 ^= -385699113;
                                            break label587;
                                        case 1768749031:
                                        default:
                                            var230 ^= 1358630948;
                                            break label587;
                                    }
                                }

                                var230 ^= 1118313220;
                                var230 |= -1961006407;
                                var230 ^= 1254448767;
                            } else {
                                var230 *= 1706997001;
                                var230 ^= -1207446916;
                            }

                            var5 = 0;
                            var230 &= 1891984928;
                            var230 *= -1956935577;
                            var230 ^= 1651671486;
                        }

                        long var434 = var230;
                        long var530 = var434 + 1L;
                        var530 = var434 * var530;
                        long var435 = var530 & 1L;
                        long var754;
                        var6 = (var754 = var435 - 0L) == 0L ? 0 : (var754 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            break label594;
                        }

                        int var410 = var5;
                        Integer var437 = var370;
                        if (var437 == null) {
                            var230 <<= 14;
                            var230 ^= 625086175;
                        } else {
                            var230 |= -331772282;
                            var230 += 2129397177;
                            var230 -= -788117661;
                            var230 ^= -573157161;
                            var437 = var230;
                            if (var437 == null) {
                                break label594;
                            }

                            if (var5 != 0) {
                                var230 = switch (var230) {
                                    default -> var230 ^ -1195194496;
                                    case -499964216 -> var230 ^ -1895919777;
                                    case 1186328259 -> {
                                        var230 >>>= 3;
                                        var230 &= -2084316723;
                                        var230 &= -1749631282;
                                        yield var230 ^ 1606037327;
                                    }
                                };
                                int var439 = var230 + 1;
                                var439 = var230 * var439;
                                var439 &= 1;
                                if (var439 != 0) {
                                    break label594;
                                }

                                List var442 = this.bb;
                                long var472 = var370;
                                long var586 = var472 + 1L;
                                var586 = var472 * var586;
                                long var473 = var586 & 1L;
                                long var755;
                                var7 = (var755 = var473 - 0L) == 0L ? 0 : (var755 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    switch (var230) {
                                        case -113477828:
                                        default:
                                            var230 ^= -584743787;
                                            break label656;
                                        case 1208487081:
                                            var230 ^= -59365928;
                                            break label656;
                                        case 1597552519:
                                            var230 >>>= 5;
                                            var230 -= 1746232436;
                                            var230 ^= -252535741;
                                            var230 ^= 1882944468;
                                            break label656;
                                    }
                                }

                                var230 += 793549669;
                                var230 += 221107645;
                                var230 ^= 1539224856;
                                if (var442 == null) {
                                    var230 -= -1824196161;
                                    var230 >>= 2;
                                    var230 ^= -2011531047;
                                    var230 -= 2004000079;
                                    var230 ^= -75610588;
                                    List var443 = i_2.a();
                                    long var475 = var370;
                                    var586 = var475 + 1L;
                                    var586 = var475 * var586;
                                    long var476 = var586 & 1L;
                                    long var756;
                                    var7 = (var756 = var476 - 0L) == 0L ? 0 : (var756 < 0L ? -1 : 1);
                                    if (var7 != 0) {
                                        var230 += 1693782374;
                                        var230 |= -2109806513;
                                        var230 <<= 7;
                                        var230 ^= -438656673;
                                        break label656;
                                    }

                                    var230 += -34761407;
                                    var230 ^= 507291561;
                                    var7 = var230 + 1;
                                    var7 = var230 * var7;
                                    var7 &= 1;
                                    if (var7 != 0) {
                                        break label594;
                                    }

                                    this.bb = var443;
                                    var230 *= -1582577277;
                                    var230 |= 909512879;
                                    var230 ^= -951319561;
                                } else {
                                    var230 += -1462091748;
                                    var230 ^= 2063192088;
                                    var230 &= -1054025231;
                                    var230 ^= 834024905;
                                }
                            } else {
                                var230 *= -226226587;
                                var230 ^= 2061230327;
                            }

                            var437 = var230;
                            if (var437 == null) {
                                break label594;
                            }

                            Object var447;
                            if (var5 != 0) {
                                var230 &= -474837173;
                                var230 |= 1920911087;
                                var230 <<= 23;
                                var230 <<= 17;
                                var230 ^= 7583427;
                                Integer var445 = var230;
                                if (var445 == null) {
                                    break label594;
                                }

                                List var446 = this.bb;
                                var7 = var370 + 1;
                                var7 = var370 * var7;
                                var7 &= 1;
                                if (var7 != 0) {
                                    var230 |= 1837376193;
                                    var230 ^= -2105089667;
                                    var230 ^= -178464415;
                                    break label656;
                                }

                                var230 += -1351808848;
                                var230 ^= -1617680037;
                                var7 = var230 + 1;
                                var7 = var230 * var7;
                                int var532 = var230 + 2;
                                var7 *= var532;
                                int var533 = var230 + 3;
                                var7 *= var533;
                                var7 &= 7;
                                if (var7 != 0) {
                                    break label594;
                                }

                                var447 = var446;
                                var230 ^= 827910772;
                                var230 >>>= 17;
                                var230 &= 1655458162;
                                var230 ^= 1215234257;
                            } else {
                                var230 -= 746894051;
                                var230 >>>= 12;
                                var230 ^= 855795939;
                                var230 &= -827425081;
                                var230 ^= 1412961400;
                                var447 = var4;
                                var230 &= 2082406073;
                                var230 &= -1400120699;
                                var230 ^= 1281690178;
                            }

                            Integer var371 = var230;
                            if (var371 == null) {
                                break label594;
                            }

                            var447 = this.cf;
                            Iterator var449 = ((List)var447).iterator();
                            Object var489 = var370;
                            if (var489 == null) {
                                var230 += 96755053;
                                var230 >>>= 9;
                                var230 &= -322555786;
                                var230 ^= 439066361;
                            } else {
                                var230 |= 1885418002;
                                var230 &= 410128484;
                                var230 >>>= 19;
                                var230 ^= -1551007779;
                                Iterator var450 = var449;
                                var230 ^= 662029188;
                                var230 >>>= 10;
                                var230 &= -186948583;
                                var230 += -1650205355;
                                var230 ^= -1072670407;

                                label574:
                                while (true) {
                                    boolean var490 = var450.hasNext();
                                    Integer var534 = var370;
                                    if (var534 == null) {
                                        switch (var230) {
                                            case -1528832583:
                                                var230 ^= -72369561;
                                                break label574;
                                            case -870903933:
                                            default:
                                                var230 ^= -202663432;
                                                break label574;
                                            case 1572165735:
                                                var230 -= 1810558998;
                                                var230 *= 917717577;
                                                var230 -= 1093913894;
                                                var230 ^= -47817428;
                                                break label574;
                                        }
                                    }

                                    var230 &= -1451906756;
                                    var230 *= 1105080295;
                                    var230 <<= 27;
                                    var230 ^= -280360325;
                                    Integer var535 = var230;
                                    if (var535 == null) {
                                        break label594;
                                    }

                                    if (!var490) {
                                        var230 ^= -178348909;
                                        var230 -= 940826846;
                                        var230 >>= 7;
                                        var230 &= 796208958;
                                        var230 ^= 449737674;
                                        var489 = var230;
                                        if (var489 == null) {
                                            break label594;
                                        }

                                        Iterator var373 = ((List)var447).iterator();
                                        long var494 = var370;
                                        long var590 = var494 + 1L;
                                        var590 = var494 * var590;
                                        long var495 = var590 & 1L;
                                        long var757;
                                        int var496 = (var757 = var495 - 0L) == 0L ? 0 : (var757 < 0L ? -1 : 1);
                                        if (var496 != 0) {
                                            var230 >>= 8;
                                            var230 <<= 31;
                                            var230 ^= 439193311;
                                            break;
                                        }
                                        var230 = switch (var230) {
                                            case -1495304637 -> var230 ^ -1276104843;
                                            case 902460134 -> {
                                                var230 += 1356907262;
                                                var230 ^= -1175212674;
                                                var230 &= 537022915;
                                                var230 >>>= 12;
                                                yield var230 ^ 183333894;
                                            }
                                            default -> var230 ^ 1336623887;
                                        };
                                        Integer var497 = var230;
                                        if (var497 == null) {
                                            break label594;
                                        }

                                        Iterator var451 = var373;
                                        var230 |= 1002405031;
                                        var230 ^= 1323428960;
                                        var230 ^= 662640813;

                                        while (true) {
                                            int var374 = var230 + 1;
                                            int var375 = var230 * var374;
                                            int var376 = var375 & 1;
                                            if (var376 != 0) {
                                                break label594;
                                            }

                                            boolean var377 = var451.hasNext();
                                            int var498 = var370 + 1;
                                            var498 = var370 * var498;
                                            var498 &= 1;
                                            if (var498 != 0) {
                                                var230 *= 1908396133;
                                                var230 &= -287442409;
                                                var230 <<= 29;
                                                var230 ^= 1512935135;
                                                break label574;
                                            }

                                            var230 -= 961661372;
                                            var230 &= 1222493716;
                                            var230 ^= -458090212;
                                            long var501 = var230;
                                            var590 = var501 + 1L;
                                            var590 = var501 * var590;
                                            long var11 = var501 + 2L;
                                            var590 *= var11;
                                            long var502 = var501 + 3L;
                                            var590 *= var502;
                                            long var503 = var590 & 7L;
                                            long var758;
                                            var498 = (var758 = var503 - 0L) == 0L ? 0 : (var758 < 0L ? -1 : 1);
                                            if (var498 != 0) {
                                                break label594;
                                            }

                                            if (!var377) {
                                                var230 += -981349907;
                                                var230 ^= -358942766;
                                                var230 -= -87301867;
                                                var230 ^= 1961641635;
                                                Integer var380 = var230;
                                                if (var380 == null) {
                                                    break label594;
                                                }

                                                TextStyle var381 = this.G;
                                                float var382 = var1.me("Potions", var381);
                                                float var383 = var382 + 14.0F;
                                                float var384 = var383 + 14.0F;
                                                float var411 = 21.0F;
                                                boolean var452 = false;
                                                List var513 = this.cf;
                                                int var553 = var370 + 1;
                                                int var554 = var370 * var553;
                                                int var555 = var554 & 1;
                                                if (var555 != 0) {
                                                    switch (var230) {
                                                        case -1130169763:
                                                            var230 ^= -442932059;
                                                            break label574;
                                                        case 16123317:
                                                        default:
                                                            var230 ^= -754001158;
                                                            break label574;
                                                        case 719584097:
                                                            var230 += -785806003;
                                                            var230 &= 147435003;
                                                            var230 *= -131538999;
                                                            var230 &= -135306937;
                                                            var230 ^= -1171918947;
                                                            break label574;
                                                    }
                                                }

                                                var230 >>>= 7;
                                                var230 ^= -193904285;
                                                var230 ^= -2013835911;
                                                var230 >>= 13;
                                                var230 ^= 1855578131;
                                                int var556 = var230 + 1;
                                                int var557 = var230 * var556;
                                                int var611 = var230 + 2;
                                                int var558 = var557 * var611;
                                                int var612 = var230 + 3;
                                                int var559 = var558 * var612;
                                                int var560 = var559 & 7;
                                                if (var560 != 0) {
                                                    break label594;
                                                }

                                                var498 = var513.size();
                                                var498--;
                                                float var385 = var384;
                                                float var412 = var411;
                                                boolean var453 = var452;
                                                var498 = var498;
                                                var230 += -949686951;
                                                var230 |= -110317698;
                                                var230 ^= -1776378182;

                                                while (true) {
                                                    var530 = var230;
                                                    long var628 = var530 + 1L;
                                                    var628 = var530 * var628;
                                                    long var12 = var530 + 2L;
                                                    var628 *= var12;
                                                    var530 += 3L;
                                                    var628 *= var530;
                                                    var530 = var628 & 7L;
                                                    long var759;
                                                    int var564 = (var759 = var530 - 0L) == 0L ? 0 : (var759 < 0L ? -1 : 1);
                                                    if (var564 != 0) {
                                                        break label594;
                                                    }

                                                    if (var498 >= 0) {
                                                        var230 ^= -986320307;
                                                        var230 &= -298536755;
                                                        var230 += 1613462304;
                                                        var230 ^= -1668432717;
                                                        var530 = var230;
                                                        var628 = var530 + 1L;
                                                        var628 = var530 * var628;
                                                        var530 = var628 & 1L;
                                                        long var760;
                                                        int var573 = (var760 = var530 - 0L) == 0L ? 0 : (var760 < 0L ? -1 : 1);
                                                        if (var573 != 0) {
                                                            break label594;
                                                        }

                                                        List var574 = this.cf;
                                                        Object var575 = var574.get(var498);
                                                        B var576 = (B)var575;
                                                        XF var613 = var576.Bg;
                                                        int var638 = var370 + 1;
                                                        int var639 = var370 * var638;
                                                        int var666 = var370 + 2;
                                                        int var640 = var639 * var666;
                                                        int var667 = var370 + 3;
                                                        int var641 = var640 * var667;
                                                        int var642 = var641 & 7;
                                                        if (var642 == 0) {
                                                            var230 |= 1878774964;
                                                            var230 &= -250203982;
                                                            var230 *= -33440237;
                                                            var230 ^= 1391174376;
                                                            boolean var643 = var576.fK;
                                                            float var647;
                                                            if (var643) {
                                                                var230 >>= 4;
                                                                var230 ^= -699233578;
                                                                int var644 = var230 + 1;
                                                                int var645 = var230 * var644;
                                                                int var646 = var645 & 1;
                                                                if (var646 != 0) {
                                                                    break label594;
                                                                }

                                                                var647 = 1.0F;
                                                                var230 &= -1838909863;
                                                                var230 ^= 435636223;
                                                            } else {
                                                                var230 = switch (var230) {
                                                                    case -1417217058 -> {
                                                                        var230 *= -401976467;
                                                                        var230 &= -1585522120;
                                                                        var230 <<= 7;
                                                                        var230 &= 509485714;
                                                                        yield var230 ^ 1669355040;
                                                                    }
                                                                    case -556553905 -> var230 ^ 1871410660;
                                                                    default -> var230 ^ 244978334;
                                                                };
                                                                var647 = 0.0F;
                                                                var230 += 872881470;
                                                                var230 ^= -2145890072;
                                                            }

                                                            var613.H(var647);
                                                            XF var614 = var576.Bg;
                                                            float var648 = var1.l();
                                                            float var615 = var614.N(var648);
                                                            var628 = var370;
                                                            var12 = var628 + 1L;
                                                            var12 = var628 * var12;
                                                            long var14 = var628 + 2L;
                                                            var12 *= var14;
                                                            var628 += 3L;
                                                            var12 *= var628;
                                                            var628 = var12 & 7L;
                                                            long var761;
                                                            int var652 = (var761 = var628 - 0L) == 0L ? 0 : (var761 < 0L ? -1 : 1);
                                                            if (var652 != 0) {
                                                                var230 -= 731697711;
                                                                var230 ^= -136847528;
                                                                break label574;
                                                            }

                                                            label610: {
                                                                var230 &= 1525824172;
                                                                var230 ^= 2056702185;
                                                                boolean var653 = var576.fK;
                                                                if (!var653) {
                                                                    var230 |= -2057079760;
                                                                    var230 |= -2130404829;
                                                                    var230 ^= 493998816;
                                                                    Integer var654 = var230;
                                                                    if (var654 == null) {
                                                                        break label594;
                                                                    }

                                                                    float var762;
                                                                    int var655 = (var762 = var615 - 0.005F) == 0.0F ? 0 : (var762 < 0.0F ? -1 : 1);
                                                                    int var668 = var370 + 1;
                                                                    int var669 = var370 * var668;
                                                                    int var670 = var669 & 1;
                                                                    if (var670 != 0) {
                                                                        var230 -= -748122467;
                                                                        var230 += -2134004010;
                                                                        var230 ^= 828585438;
                                                                        var230 ^= -1942620199;
                                                                        break label574;
                                                                    }
                                                                    var230 = switch (var230) {
                                                                        case -99210081 -> {
                                                                            var230 -= 1881849050;
                                                                            var230 &= -1953257269;
                                                                            var230 <<= 17;
                                                                            yield var230 ^ 1494506700;
                                                                        }
                                                                        default -> var230 ^ 1742962340;
                                                                        case 1677522317 -> var230 ^ -43706401;
                                                                    };
                                                                    var11 = var230;
                                                                    long var13 = var11 + 1L;
                                                                    var13 = var11 * var13;
                                                                    var11 = var13 & 1L;
                                                                    long var763;
                                                                    int var673 = (var763 = var11 - 0L) == 0L ? 0 : (var763 < 0L ? -1 : 1);
                                                                    if (var673 != 0) {
                                                                        break label594;
                                                                    }

                                                                    if (var655 <= 0) {
                                                                        var230 += 2112119296;
                                                                        var230 *= 941952557;
                                                                        var230 ^= -1933269717;
                                                                        var230 ^= -997880960;
                                                                        var230 ^= 1110160416;
                                                                        var628 = var230;
                                                                        var12 = var628 + 1L;
                                                                        var12 = var628 * var12;
                                                                        var628 = var12 & 1L;
                                                                        long var764;
                                                                        int var658 = (var764 = var628 - 0L) == 0L ? 0 : (var764 < 0L ? -1 : 1);
                                                                        if (var658 != 0) {
                                                                            break label594;
                                                                        }

                                                                        List var659 = this.cf;
                                                                        var11 = var370;
                                                                        var13 = var11 + 1L;
                                                                        var13 = var11 * var13;
                                                                        long var15 = var11 + 2L;
                                                                        var13 *= var15;
                                                                        var11 += 3L;
                                                                        var13 *= var11;
                                                                        var11 = var13 & 7L;
                                                                        long var765;
                                                                        int var677 = (var765 = var11 - 0L) == 0L ? 0 : (var765 < 0L ? -1 : 1);
                                                                        if (var677 != 0) {
                                                                            switch (var230) {
                                                                                case -2028721321:
                                                                                    var230 *= -118311921;
                                                                                    var230 ^= 1120417990;
                                                                                    break label574;
                                                                                case 462398508:
                                                                                    var230 ^= 1127744296;
                                                                                    break label574;
                                                                                case 1715912913:
                                                                                default:
                                                                                    var230 ^= 1300553890;
                                                                                    break label574;
                                                                            }
                                                                        }

                                                                        var230 *= 37017935;
                                                                        var230 += -1545488167;
                                                                        var230 |= 291438036;
                                                                        var230 *= -756749249;
                                                                        var230 ^= 159850939;
                                                                        Object var660 = var659.remove(var498);
                                                                        var661 = (long)var385;
                                                                        var678 = var412;
                                                                        var686 = var453;
                                                                        var230 -= -932538525;
                                                                        var230 *= -285799921;
                                                                        var230 ^= 195873547;
                                                                        var230 ^= 420092376;
                                                                        break label610;
                                                                    }

                                                                    var230 &= -1638504272;
                                                                    var230 |= 1872575002;
                                                                    var230 += -1464337581;
                                                                    var230 ^= 1578068636;
                                                                } else {
                                                                    switch (var230) {
                                                                        case -1659159855:
                                                                            var230 ^= -1335715669;
                                                                            break;
                                                                        case 339753671:
                                                                        default:
                                                                            var230 ^= -2022501401;
                                                                            break;
                                                                        case 1644489293:
                                                                            var230 |= -1431353874;
                                                                            var230 |= -1520614766;
                                                                            var230 ^= -1448611698;
                                                                    }
                                                                }

                                                                long var692 = var230;
                                                                long var732 = var692 + 1L;
                                                                var732 = var692 * var732;
                                                                long var17 = var692 + 2L;
                                                                var732 *= var17;
                                                                var692 += 3L;
                                                                var732 *= var692;
                                                                var692 = var732 & 7L;
                                                                long var766;
                                                                int var695 = (var766 = var692 - 0L) == 0L ? 0 : (var766 < 0L ? -1 : 1);
                                                                if (var695 != 0) {
                                                                    break label594;
                                                                }

                                                                boolean var696 = var576.fK;
                                                                int var701 = var370 + 1;
                                                                int var702 = var370 * var701;
                                                                int var736 = var370 + 2;
                                                                int var703 = var702 * var736;
                                                                int var737 = var370 + 3;
                                                                int var704 = var703 * var737;
                                                                int var705 = var704 & 7;
                                                                if (var705 != 0) {
                                                                    var230 -= -1370396136;
                                                                    var230 |= 1206460976;
                                                                    var230 |= -2040643597;
                                                                    var230 ^= -976080604;
                                                                    break label574;
                                                                }

                                                                var230 &= -826893575;
                                                                var230 ^= 1792160479;
                                                                int var706 = var230 + 1;
                                                                int var707 = var230 * var706;
                                                                int var708 = var707 & 1;
                                                                if (var708 != 0) {
                                                                    break label594;
                                                                }

                                                                boolean var698;
                                                                if (var696) {
                                                                    var230 = switch (var230) {
                                                                        default -> var230 ^ 852957388;
                                                                        case 750921902 -> {
                                                                            var230 ^= -1635965346;
                                                                            var230 >>= 25;
                                                                            var230 -= -1276232571;
                                                                            yield var230 ^ -1891170127;
                                                                        }
                                                                        case 1679854118 -> var230 ^ -85549404;
                                                                    };
                                                                    boolean var697 = true;
                                                                    var14 = var370;
                                                                    long var16 = var14 + 1L;
                                                                    var16 = var14 * var16;
                                                                    var14 = var16 & 1L;
                                                                    long var767;
                                                                    int var711 = (var767 = var14 - 0L) == 0L ? 0 : (var767 < 0L ? -1 : 1);
                                                                    if (var711 != 0) {
                                                                        switch (var230) {
                                                                            case -1017721883:
                                                                                var230 ^= 1551673240;
                                                                                var230 &= -395941068;
                                                                                var230 ^= -625342799;
                                                                                var230 ^= 1219879002;
                                                                                break label574;
                                                                            case 794841190:
                                                                                var230 ^= -1432174221;
                                                                                break label574;
                                                                            case 1931339370:
                                                                            default:
                                                                                var230 ^= 1515802860;
                                                                                break label574;
                                                                        }
                                                                    }

                                                                    var230 >>= 21;
                                                                    var230 *= 1941813739;
                                                                    var230 ^= -2020798732;
                                                                    var230 &= -952393047;
                                                                    var230 ^= -51776527;
                                                                    int var712 = var230 + 1;
                                                                    int var713 = var230 * var712;
                                                                    int var738 = var230 + 2;
                                                                    int var714 = var713 * var738;
                                                                    int var739 = var230 + 3;
                                                                    int var715 = var714 * var739;
                                                                    int var716 = var715 & 7;
                                                                    if (var716 != 0) {
                                                                        break label594;
                                                                    }

                                                                    var698 = var697;
                                                                    var230 ^= -819262131;
                                                                    var230 *= 1348456691;
                                                                    var230 &= 2010216508;
                                                                    var230 |= -1419737419;
                                                                    var230 ^= 1984483655;
                                                                } else {
                                                                    var230 -= 1657184879;
                                                                    var230 ^= 1400347505;
                                                                    var14 = var230;
                                                                    long var747 = var14 + 1L;
                                                                    var747 = var14 * var747;
                                                                    long var18 = var14 + 2L;
                                                                    var747 *= var18;
                                                                    var14 += 3L;
                                                                    var747 *= var14;
                                                                    var14 = var747 & 7L;
                                                                    long var768;
                                                                    int var720 = (var768 = var14 - 0L) == 0L ? 0 : (var768 < 0L ? -1 : 1);
                                                                    if (var720 != 0) {
                                                                        break label594;
                                                                    }

                                                                    var698 = var453;
                                                                    var230 += 1323170619;
                                                                    var230 &= 764107409;
                                                                    var230 ^= -1690863239;
                                                                    var230 ^= 2140427778;
                                                                }

                                                                float var721 = var1.l();
                                                                var576.JS(var721);
                                                                String var722 = var576.W;
                                                                TextStyle var740 = this.ku;
                                                                float var723 = var1.me(var722, var740);
                                                                Integer var741 = var370;
                                                                if (var741 == null) {
                                                                    var230 &= -1268154093;
                                                                    var230 &= -1062504321;
                                                                    var230 -= 410078372;
                                                                    var230 ^= 2107260337;
                                                                    break label574;
                                                                }

                                                                var230 ^= -261178709;
                                                                var230 ^= 1374359047;
                                                                var230 ^= 571284260;
                                                                int var742 = var230 + 1;
                                                                int var743 = var230 * var742;
                                                                int var744 = var743 & 1;
                                                                if (var744 != 0) {
                                                                    break label594;
                                                                }

                                                                var576.Rb = var723;
                                                                StringBuilder var724 = var576.j;
                                                                TextStyle var745 = this.jJ;
                                                                float var725 = var1.me(var724, var745);
                                                                var576.A = var725;
                                                                float var726 = var576.A;
                                                                float var727 = var726 + 10.0F;
                                                                float var728 = Math.max(22.0F, var727);
                                                                var576.u = var728;
                                                                float var729 = var576.Rb;
                                                                float var730 = 21.0F + var729;
                                                                float var731 = var730 + 14.0F;
                                                                float var577 = var576.u;
                                                                float var578 = var731 + var577;
                                                                float var579 = var578 + 7.0F;
                                                                float var580 = Math.max(var385, var579);
                                                                float var616 = TP.S(var615);
                                                                float var617 = 14.0F * var616;
                                                                float var618 = var412 + var617;
                                                                var661 = (long)var580;
                                                                var678 = var618;
                                                                var686 = var698;
                                                                var230 &= 1088846711;
                                                                var230 |= 1233030422;
                                                                var230 |= -969499441;
                                                                var230 &= -1717967772;
                                                                var230 ^= 583654053;
                                                            }

                                                            var530 = var230;
                                                            long var699 = var530 + 1L;
                                                            var699 = var530 * var699;
                                                            var530 = var699 & 1L;
                                                            long var769;
                                                            int var583 = (var769 = var530 - 0L) == 0L ? 0 : (var769 < 0L ? -1 : 1);
                                                            if (var583 != 0) {
                                                                break label594;
                                                            }

                                                            int var584 = var498 + -1;
                                                            var385 = var661;
                                                            var412 = var678;
                                                            int var619 = var370 + 1;
                                                            int var620 = var370 * var619;
                                                            int var662 = var370 + 2;
                                                            int var621 = var620 * var662;
                                                            int var663 = var370 + 3;
                                                            int var622 = var621 * var663;
                                                            int var623 = var622 & 7;
                                                            if (var623 != 0) {
                                                                var230 <<= 17;
                                                                var230 &= -1683812750;
                                                                var230 += -2096816459;
                                                                var230 ^= 111841386;
                                                                break label574;
                                                            }

                                                            var230 >>>= 9;
                                                            var230 &= 320762933;
                                                            var230 <<= 25;
                                                            var230 ^= -657587111;
                                                            var453 = var686;
                                                            var498 = var584;
                                                            var230 *= 1267752357;
                                                            var230 >>>= 19;
                                                            var230 <<= 3;
                                                            var230 ^= 1809943084;
                                                            continue;
                                                        }

                                                        var230 *= 1286863695;
                                                        var230 >>>= 9;
                                                        var230 += 1385888764;
                                                        var230 ^= 1227514328;
                                                        break label574;
                                                    }

                                                    var230 ^= -667705312;
                                                    var230 <<= 11;
                                                    var230 += 1211900261;
                                                    var230 += -406993990;
                                                    var230 ^= 302031746;
                                                    Integer var517 = var230;
                                                    if (var517 == null) {
                                                        break label594;
                                                    }

                                                    float var386 = Math.max(112.0F, var385);
                                                    var517 = var370;
                                                    if (var517 == null) {
                                                        switch (var230) {
                                                            case -1618514611:
                                                                var230 ^= 382051044;
                                                                break label574;
                                                            case -729438563:
                                                                var230 *= 1240070125;
                                                                var230 += 539058534;
                                                                var230 -= -1077271651;
                                                                var230 ^= 1737848573;
                                                                break label574;
                                                            case 20413207:
                                                            default:
                                                                var230 ^= -2099453261;
                                                                break label574;
                                                        }
                                                    }
                                                    var230 = switch (var230) {
                                                        case -896579973 -> var230 ^ -207269303;
                                                        case -729438563 -> {
                                                            var230 |= -44396864;
                                                            yield var230 ^ 582440144;
                                                        }
                                                        default -> var230 ^ -1238158762;
                                                    };
                                                    boolean var519 = this.z;
                                                    if (var519) {
                                                        var230 = switch (var230) {
                                                            case -546768371 -> {
                                                                var230 <<= 19;
                                                                var230 += -1851786764;
                                                                var230 += 1844766777;
                                                                yield var230 ^ 1500323878;
                                                            }
                                                            default -> var230 ^ -977306328;
                                                            case 1240342434 -> var230 ^ 861013662;
                                                        };
                                                        var517 = var230;
                                                        if (var517 == null) {
                                                            break label594;
                                                        }

                                                        Re var521 = this.KO;
                                                        var521.v(var386);
                                                        int var522 = var370 + 1;
                                                        var522 = var370 * var522;
                                                        var522 &= 1;
                                                        if (var522 != 0) {
                                                            var230 &= -566781921;
                                                            var230 ^= 1134217646;
                                                            var230 ^= 1988006122;
                                                            var230 *= -1624646245;
                                                            var230 ^= 2067221258;
                                                            break label574;
                                                        }

                                                        var230 *= -291457107;
                                                        var230 *= 1189627179;
                                                        var230 ^= -1619564782;
                                                        Integer var525 = var230;
                                                        if (var525 == null) {
                                                            break label594;
                                                        }

                                                        this.z = false;
                                                        var230 <<= 25;
                                                        var230 ^= -327972233;
                                                    } else {
                                                        switch (var230) {
                                                            case -2047772087:
                                                            default:
                                                                var230 ^= -1853000185;
                                                                break;
                                                            case -546768371:
                                                                var230 |= -105083310;
                                                                var230 ^= 311375424;
                                                                var230 |= 679964799;
                                                                var230 >>>= 7;
                                                                var230 ^= -2086115961;
                                                                break;
                                                            case 1840043393:
                                                                var230 ^= -297689710;
                                                        }
                                                    }

                                                    Re var526 = this.KO;
                                                    var530 = var370;
                                                    var628 = var530 + 1L;
                                                    var628 = var530 * var628;
                                                    var12 = var530 + 2L;
                                                    var628 *= var12;
                                                    var530 += 3L;
                                                    var628 *= var530;
                                                    var530 = var628 & 7L;
                                                    long var770;
                                                    int var568 = (var770 = var530 - 0L) == 0L ? 0 : (var770 < 0L ? -1 : 1);
                                                    if (var568 == 0) {
                                                        var230 -= 1946988610;
                                                        var230 *= -1158760621;
                                                        var230 ^= 471768994;
                                                        float var569 = var1.l();
                                                        float var387 = var526.Gc(var386, var569);
                                                        float var413 = var412 + 5.0F;
                                                        this.dV(var387, var413);
                                                        if (!var453) {
                                                            var230 += 767450208;
                                                            var230 ^= -1321600956;
                                                            boolean var388 = var1.tl();
                                                            var410 = var370 + 1;
                                                            var410 = var370 * var410;
                                                            var370 = var410 & 1;
                                                            if (var370 != 0) {
                                                                var230 *= -942770987;
                                                                var230 += 1569226753;
                                                                var230 |= -1760593612;
                                                                var230 ^= -985468063;
                                                                break label574;
                                                            }

                                                            var230 <<= 21;
                                                            var230 ^= 2012366544;
                                                            var230 -= -806148214;
                                                            var230 ^= 1298999745;
                                                            if (!var388) {
                                                                var230 = switch (var230) {
                                                                    case -1459847491 -> var230 ^ 367184075;
                                                                    default -> var230 ^ -1876800025;
                                                                    case 1068643975 -> {
                                                                        var230 >>= 27;
                                                                        yield var230 ^ -91288755;
                                                                    }
                                                                };
                                                                long var367 = var230;
                                                                long var416 = var367 + 1L;
                                                                long var417 = var367 * var416;
                                                                long var368 = var417 & 1L;
                                                                long var771;
                                                                var370 = (var771 = var368 - 0L) == 0L ? 0 : (var771 < 0L ? -1 : 1);
                                                                if (var370 != 0) {
                                                                    break label594;
                                                                }

                                                                var370 = 0;
                                                                var230 >>>= 5;
                                                                var230 *= -1897242769;
                                                                var230 *= 514763083;
                                                                var230 -= -516763730;
                                                                var230 ^= 306134496;
                                                                break label620;
                                                            }

                                                            switch (var230) {
                                                                case -713442472:
                                                                default:
                                                                    var230 ^= -2129632364;
                                                                    break;
                                                                case 726203875:
                                                                    var230 ^= -738407593;
                                                                    break;
                                                                case 1068643975:
                                                                    var230 ^= 1669768599;
                                                                    var230 -= 192515954;
                                                                    var230 ^= -1468487674;
                                                                    var230 *= 321782755;
                                                                    var230 ^= 1332832592;
                                                            }
                                                        } else {
                                                            var230 ^= 938417569;
                                                            var230 *= -297436039;
                                                            var230 ^= -1078918572;
                                                        }

                                                        long var389 = var230;
                                                        long var454 = var389 + 1L;
                                                        long var455 = var389 * var454;
                                                        long var390 = var455 & 1L;
                                                        long var772;
                                                        int var391 = (var772 = var390 - 0L) == 0L ? 0 : (var772 < 0L ? -1 : 1);
                                                        if (var391 != 0) {
                                                            break label594;
                                                        }

                                                        var370 = 1;
                                                        var230 &= 596281111;
                                                        var230 += -476151398;
                                                        var230 ^= -400362146;
                                                        break label620;
                                                    }

                                                    switch (var230) {
                                                        case -2106357129:
                                                            var230 ^= 694837024;
                                                            var230 ^= -1321968760;
                                                            break label574;
                                                        case -150588839:
                                                            var230 ^= 1197778601;
                                                            break label574;
                                                        case 1763434032:
                                                        default:
                                                            var230 ^= 1599923274;
                                                            break label574;
                                                    }
                                                }
                                            }

                                            var230 &= -1921244474;
                                            var230 >>= 30;
                                            var230 *= 1446639535;
                                            var230 -= -1528619425;
                                            var230 ^= -1432544409;
                                            StatusEffectInstance var378 = (StatusEffectInstance)var451.next();
                                            var378 = var378;
                                            RegistryEntry var505 = var378.getEffectType();
                                            int var538 = var230 | 1987549294;
                                            int var539 = var538 ^ -1090131203;
                                            B var506 = this.Rl(var505, var539);
                                            int var540 = var370 + 1;
                                            int var541 = var370 * var540;
                                            int var542 = var541 & 1;
                                            if (var542 != 0) {
                                                var230 += -1895395706;
                                                var230 -= 1672390687;
                                                var230 ^= 899694932;
                                                break label574;
                                            }
                                            var230 = switch (var230) {
                                                default -> var230 ^ -894044984;
                                                case 70641956 -> {
                                                    var230 *= 264571925;
                                                    var230 ^= -1828637865;
                                                    var230 |= -423535022;
                                                    var230 <<= 31;
                                                    yield var230 ^ 1269768232;
                                                }
                                                case 347271590 -> var230 ^ -695646111;
                                            };
                                            var530 = var230;
                                            long var624 = var530 + 1L;
                                            var624 = var530 * var624;
                                            var530 = var624 & 1L;
                                            long var773;
                                            int var545 = (var773 = var530 - 0L) == 0L ? 0 : (var773 < 0L ? -1 : 1);
                                            if (var545 != 0) {
                                                break label594;
                                            }

                                            B var552;
                                            if (var506 == null) {
                                                var230 = switch (var230) {
                                                    case -877715416 -> {
                                                        var230 |= -1063331458;
                                                        var230 &= 1864581652;
                                                        var230 -= -1369214853;
                                                        var230 += 223611543;
                                                        yield var230 ^ -88452864;
                                                    }
                                                    default -> var230 ^ -63170757;
                                                    case 1205368423 -> var230 ^ -965545570;
                                                };
                                                int var546 = var230 + 1;
                                                int var547 = var230 * var546;
                                                int var596 = var230 + 2;
                                                int var548 = var547 * var596;
                                                int var597 = var230 + 3;
                                                int var549 = var548 * var597;
                                                int var550 = var549 & 7;
                                                if (var550 != 0) {
                                                    break label594;
                                                }

                                                RegistryEntry var598 = var378.getEffectType();
                                                B var551 = new B(this, var598);
                                                Integer var599 = var370;
                                                if (var599 == null) {
                                                    var230 |= -1620550209;
                                                    var230 ^= -976989856;
                                                    break label574;
                                                }

                                                var230 &= 2121349129;
                                                var230 ^= -2090450783;
                                                int var600 = var230 + 1;
                                                int var601 = var230 * var600;
                                                int var626 = var230 + 2;
                                                int var602 = var601 * var626;
                                                int var627 = var230 + 3;
                                                int var603 = var602 * var627;
                                                int var604 = var603 & 7;
                                                if (var604 != 0) {
                                                    break label594;
                                                }

                                                List var605 = this.cf;
                                                boolean var606 = var605.add(var551);
                                                var552 = var551;
                                                switch (var230) {
                                                    case -750303071:
                                                        var230 -= -1475859503;
                                                        var230 &= -519150916;
                                                        var230 |= 2084579396;
                                                        var230 ^= -994950865;
                                                        break;
                                                    case 115369155:
                                                        var230 ^= 873864968;
                                                        break;
                                                    case 465728615:
                                                    default:
                                                        var230 ^= 1382708745;
                                                }
                                            } else {
                                                var230 |= 398524882;
                                                var230 -= -12076131;
                                                var230 ^= 731843840;
                                                var230 |= 1858056554;
                                                var230 ^= -2015411287;
                                                var552 = var506;
                                                var230 <<= 10;
                                                var230 <<= 5;
                                                var230 += -872002218;
                                                var230 ^= -1853021011;
                                            }

                                            var552.fK = true;
                                            var590 = var370;
                                            var11 = var590 + 1L;
                                            var11 = var590 * var11;
                                            var590 = var11 & 1L;
                                            long var774;
                                            var498 = (var774 = var590 - 0L) == 0L ? 0 : (var774 < 0L ? -1 : 1);
                                            if (var498 != 0) {
                                                var230 -= -1788257247;
                                                var230 ^= 1052672773;
                                                break label574;
                                            }

                                            var230 |= 1482011737;
                                            var230 ^= -1410301900;
                                            var498 = var230 + 1;
                                            var498 = var230 * var498;
                                            int var609 = var230 + 2;
                                            var498 *= var609;
                                            int var610 = var230 + 3;
                                            var498 *= var610;
                                            var498 &= 7;
                                            if (var498 != 0) {
                                                break label594;
                                            }

                                            var552.jR = (var410 != 0);
                                            var552.zn(var378);
                                            switch (var230) {
                                                case 29811592:
                                                default:
                                                    var230 ^= -1873003188;
                                                    break;
                                                case 735017385:
                                                    var230 ^= -766141354;
                                                    break;
                                                case 1376615887:
                                                    var230 ^= -1558596537;
                                                    var230 <<= 12;
                                                    var230 ^= -1424235816;
                                                    var230 ^= -1243419982;
                                            }
                                        }
                                    }

                                    var230 -= -679038722;
                                    var230 ^= -1341860669;
                                    var489 = var450.next();
                                    B var492 = (B)var489;
                                    Integer var536 = var370;
                                    if (var536 == null) {
                                        var230 <<= 25;
                                        var230 &= 998975874;
                                        var230 |= 1117011485;
                                        var230 += 798681418;
                                        var230 ^= -1342002760;
                                        break;
                                    }

                                    var230 -= 771275877;
                                    var230 ^= 1883226017;
                                    Integer var537 = var230;
                                    if (var537 == null) {
                                        break label594;
                                    }

                                    var492.fK = false;
                                    var230 |= -1209579698;
                                    var230 ^= -447052857;
                                    var230 ^= 119059550;
                                }
                            }
                        }
                    }
                }

                long var360 = var230;
                long var396 = var360 + 1L;
                long var397 = var360 * var396;
                long var460 = var360 + 2L;
                long var398 = var397 * var460;
                long var361 = var360 + 3L;
                long var399 = var398 * var361;
                long var362 = var399 & 7L;
                long var775;
                var230 = (var775 = var362 - 0L) == 0L ? 0 : (var775 < 0L ? -1 : 1);
                if (var230 == 0) {
                    IllegalStateException var365 = new IllegalStateException();
                    throw var365;
                }
                break label594;
            }

            long var392 = var230;
            long var456 = var392 + 1L;
            var456 = var392 * var456;
            long var570 = var392 + 2L;
            var456 *= var570;
            var392 += 3L;
            var456 *= var392;
            var392 = var456 & 7L;
            long var776;
            int var395 = (var776 = var392 - 0L) == 0L ? 0 : (var776 < 0L ? -1 : 1);
            if (var395 == 0) {
                return (var370 != 0);
            }
        }

        IllegalArgumentException var364 = new IllegalArgumentException();
        throw var364;
    }

    public int W() {
        label120: {
            int var1 = YO;
            var1 ^= 2091602167;
            int var2 = System.identityHashCode(this);
            int var3 = 0;
            List var4 = this.cf;
            Iterator var88 = var4.iterator();
            int var5 = var2 + 1;
            var5 = var2 * var5;
            int var6 = var2 + 2;
            var5 *= var6;
            var6 = var2 + 3;
            var5 *= var6;
            var5 &= 7;
            if (var5 != 0) {
                var1 ^= -1677484395;
                var1 ^= 1669733910;
            } else {
                var1 -= 1334303704;
                var1 &= 1257114752;
                var1 ^= 15007960;
                long var94 = var1;
                long var7 = var94 + 1L;
                var7 = var94 * var7;
                long var95 = var7 & 1L;
                long var136;
                var5 = (var136 = var95 - 0L) == 0L ? 0 : (var136 < 0L ? -1 : 1);
                if (var5 != 0) {
                    break label120;
                }

                Iterator var89 = var88;
                var3 = var3;
                var1 *= 51656127;
                var1 >>= 21;
                var1 ^= 1071369069;

                label112:
                while (true) {
                    int var97 = (var89.hasNext()) ? 1 : 0;
                    var6 = var2 + 1;
                    var6 = var2 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        switch (var1) {
                            case -2027582417:
                            default:
                                var1 ^= 1173321891;
                                break label112;
                            case -1071368687:
                                var1 |= -320746916;
                                var1 >>= 20;
                                var1 ^= -2111744750;
                                break label112;
                            case 952008783:
                                var1 ^= 591002082;
                                break label112;
                        }
                    }

                    var1 &= 1279065859;
                    var1 &= 2037419950;
                    var1 += -1149890959;
                    var1 ^= -464745438;
                    var1 ^= 1881728152;
                    Integer var107 = var1;
                    if (var107 == null) {
                        break label120;
                    }

                    if (var97 == 0) {
                        Integer var86 = switch (var1) {
                            case -1930170638 -> var1 ^ -107476477;
                            default -> var1 ^ -638088265;
                            case 1878162635 -> {
                                var1 |= 1658109993;
                                var1 *= -1271569149;
                                var1 &= 2003306888;
                                yield var1 ^ -1843970489;
                            }
                        };
                        if (var86 != null) {
                            return var3;
                        }
                        break label120;
                    }

                    var1 -= -306155849;
                    var1 -= 2042104965;
                    var1 ^= -1123358644;
                    Object var98 = var89.next();
                    var107 = var2;
                    if (var107 == null) {
                        switch (var1) {
                            case -1250891325:
                                var1 *= -138798557;
                                var1 ^= 57807885;
                                var1 ^= -1864414397;
                                var1 ^= -1398261957;
                                break label112;
                            case -354339680:
                            default:
                                var1 ^= -1370964919;
                                break label112;
                            case 1150496815:
                                var1 ^= -1148022577;
                                break label112;
                        }
                    }

                    var1 -= -1255085280;
                    var1 -= 395746355;
                    var1 ^= -958431044;
                    long var109 = var1;
                    long var8 = var109 + 1L;
                    var8 = var109 * var8;
                    long var10 = var109 + 2L;
                    var8 *= var10;
                    long var110 = var109 + 3L;
                    var8 *= var110;
                    long var111 = var8 & 7L;
                    long var137;
                    int var112 = (var137 = var111 - 0L) == 0L ? 0 : (var137 < 0L ? -1 : 1);
                    if (var112 != 0) {
                        break label120;
                    }

                    B var99 = (B)var98;
                    int var113 = var99.fK ? 1 : 0;
                    if (var113 != 0) {
                        var1 = switch (var1) {
                            default -> var1 ^ 1888259833;
                            case -438543523 -> var1 ^ -1199647576;
                            case 779543244 -> {
                                var1 -= -1715988915;
                                yield var1 ^ -1181465514;
                            }
                        };
                        int var100 = var99.jR ? 1 : 0;
                        var113 = var2 + 1;
                        var113 = var2 * var113;
                        var113 &= 1;
                        if (var113 != 0) {
                            switch (var1) {
                                case -2118211282:
                                    var1 ^= 1446527640;
                                    break label112;
                                case -1408700033:
                                default:
                                    var1 ^= -1694708647;
                                    break label112;
                                case 757762089:
                                    var1 -= -1157164767;
                                    var1 *= 877354025;
                                    var1 |= 2123267438;
                                    var1 ^= -2112858446;
                                    break label112;
                            }
                        }

                        var1 += 176040804;
                        var1 >>= 14;
                        var1 ^= 771758420;
                        if (var100 == 0) {
                            var1 *= 435543947;
                            var1 ^= 481646657;
                            var1 &= 22839911;
                            var1 >>>= 14;
                            var1 ^= -1907457616;
                            var100 = var3 + 1;
                            long var117 = var2;
                            var8 = var117 + 1L;
                            var8 = var117 * var8;
                            long var118 = var8 & 1L;
                            long var138;
                            var113 = (var138 = var118 - 0L) == 0L ? 0 : (var138 < 0L ? -1 : 1);
                            if (var113 != 0) {
                                var1 >>>= 13;
                                var1 ^= 737896434;
                                var1 ^= 1445051994;
                                break;
                            }

                            var1 |= -1864117893;
                            var1 <<= 27;
                            var1 ^= 1913727357;
                            var97 = var100;
                            var1 ^= 475657379;
                            var1 += -583707858;
                            var1 ^= -480907791;
                            var1 ^= 1290037580;
                        } else {
                            var1 -= -1904134610;
                            var1 ^= -121781650;
                            Integer var120 = var1;
                            if (var120 == null) {
                                break label120;
                            }

                            var97 = var3;
                            var1 += 1096486894;
                            var1 ^= -1781344731;
                        }
                    } else {
                        var1 = switch (var1) {
                            default -> var1 ^ 111771405;
                            case 779543244 -> {
                                var1 *= -803050591;
                                var1 += -1255943673;
                                yield var1 ^ -1603086822;
                            }
                            case 878352635 -> var1 ^ -2105465512;
                        };
                        var97 = var3;
                        var1 ^= -1216969733;
                        var1 ^= 1442863107;
                    }

                    long var121 = var1;
                    var8 = var121 + 1L;
                    var8 = var121 * var8;
                    var10 = var121 + 2L;
                    var8 *= var10;
                    long var122 = var121 + 3L;
                    var8 *= var122;
                    long var123 = var8 & 7L;
                    long var139;
                    var113 = (var139 = var123 - 0L) == 0L ? 0 : (var139 < 0L ? -1 : 1);
                    if (var113 != 0) {
                        break label120;
                    }

                    var3 = var97;
                    var1 -= 1497271072;
                    var1 -= -1518620292;
                    var1 >>= 27;
                    var1 &= 1752538909;
                    var1 ^= -1071368684;
                }
            }

            UnsupportedOperationException var85 = new UnsupportedOperationException();
            throw var85;
        }

        IllegalStateException var82 = new IllegalStateException();
        throw var82;
    }

    private B Rl(RegistryEntry var1, int var2) {
        label96: {
            int var4 = System.identityHashCode(this);
            Integer var5 = var4;
            int var41;
            if (var5 == null) {
                var41 = var2 | -450552522;
                var41 += 269037973;
                var41 &= 1760535149;
                var41 ^= -1056986010;
            } else {
                var41 = var2 | -760899706;
                var41 -= -245890864;
                var41 >>= 6;
                var41 &= -1096940352;
                var41 ^= 791927715;
                var5 = var41;
                if (var5 == null) {
                    break label96;
                }

                List var55 = this.cf;
                Iterator var56 = var55.iterator();
                Iterator var57 = var56;
                var41 >>>= 16;
                var41 += 1733603400;
                var41 |= -1967782614;
                var41 |= 1219763747;
                var41 ^= 2016640091;

                while (true) {
                    int var6 = (var57.hasNext()) ? 1 : 0;
                    long var7 = var4;
                    long var9 = var7 + 1L;
                    var9 = var7 * var9;
                    long var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var98;
                    int var69 = (var98 = var7 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                    if (var69 != 0) {
                        var41 *= -755059023;
                        var41 += -931096318;
                        var41 ^= -1726933672;
                        break;
                    }
                    var41 = switch (var41) {
                        case -1748753552 -> {
                            var41 <<= 3;
                            yield var41 ^ -1313821328;
                        }
                        case 979745758 -> var41 ^ -122522517;
                        default -> var41 ^ -48538990;
                    };
                    int var70 = var41 + 1;
                    int var71 = var41 * var70;
                    int var72 = var71 & 1;
                    if (var72 != 0) {
                        break label96;
                    }

                    if (var6 == 0) {
                        var41 += 2113226000;
                        var41 ^= -1067924297;
                        var41 ^= 2029869664;
                        Integer var53 = var41;
                        if (var53 != null) {
                            return null;
                        }
                        break label96;
                    }
                    var41 = switch (var41) {
                        case 261207792 -> {
                            var41 += 474190065;
                            var41 *= 1671580847;
                            var41 ^= -151019611;
                            var41 ^= -12383454;
                            yield var41 ^ 869105944;
                        }
                        case 1647887627 -> var41 ^ 697535416;
                        default -> var41 ^ 1560573808;
                    };
                    long var58 = var41;
                    long var8 = var58 + 1L;
                    var8 = var58 * var8;
                    long var59 = var8 & 1L;
                    long var99;
                    var6 = (var99 = var59 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label96;
                    }

                    Object var61 = var57.next();
                    B var62 = (B)var61;
                    int var73 = var4 + 1;
                    int var74 = var4 * var73;
                    int var75 = var74 & 1;
                    if (var75 != 0) {
                        var41 &= -1881974624;
                        var41 *= -1997664831;
                        var41 ^= -197856214;
                        break;
                    }

                    var41 |= -1275089778;
                    var41 &= 1901172966;
                    var41 ^= 2141543095;
                    var7 = var41;
                    var9 = var7 + 1L;
                    var9 = var7 * var9;
                    var11 = var7 + 2L;
                    var9 *= var11;
                    var7 += 3L;
                    var9 *= var7;
                    var7 = var9 & 7L;
                    long var100;
                    int var79 = (var100 = var7 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                    if (var79 != 0) {
                        break label96;
                    }

                    RegistryEntry var80 = var62.F;
                    boolean var81 = var80.equals(var1);
                    if (var81) {
                        var41 -= -348059268;
                        var41 ^= 838540233;
                        int var82 = var41 + 1;
                        int var83 = var41 * var82;
                        int var84 = var83 & 1;
                        if (var84 == 0) {
                            return var62;
                        }
                        break label96;
                    }
                    var41 = switch (var41) {
                        default -> var41 ^ 1694874360;
                        case 250921585 -> {
                            var41 ^= -196894850;
                            var41 &= -1192022422;
                            var41 *= -1981417665;
                            yield var41 ^ 1211951178;
                        }
                        case 2033430484 -> var41 ^ 826370051;
                    };
                    long var63 = var41;
                    var8 = var63 + 1L;
                    var8 = var63 * var8;
                    long var10 = var63 + 2L;
                    var8 *= var10;
                    long var64 = var63 + 3L;
                    var8 *= var64;
                    long var65 = var8 & 7L;
                    long var101;
                    var6 = (var101 = var65 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        break label96;
                    }

                    var41 |= -902499967;
                    var41 ^= 1282660045;
                }
            }

            Integer var50 = var41;
            if (var50 != null) {
                IllegalArgumentException var52 = new IllegalArgumentException();
                throw var52;
            }
        }

        IllegalArgumentException var51 = new IllegalArgumentException();
        throw var51;
    }

    @Override
    protected void BO(hr var1, lH_3 var2) {
        int var3 = YO;
        var3 ^= 915381456;
        int var4 = System.identityHashCode(this);
        float var5 = this.tQ();
        long var6 = var4;
        long var8 = var6 + 1L;
        var8 = var6 * var8;
        long var10 = var6 + 2L;
        var8 *= var10;
        var6 += 3L;
        var8 *= var6;
        var6 = var8 & 7L;
        long var29;
        var4 = (var29 = var6 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
        if (var4 == 0) {
            var3 -= 2090253788;
            var3 ^= -1813252236;
            float var23 = this.Yo();
            var1.Ky(0.0F, 0.0F, var5, var23, 9.0F);
        } else {
            var3 *= 798891289;
            var3 |= 2124452197;
            var3 *= 1736647437;
            var3 ^= -504356249;
            Integer var17 = var3;
            if (var17 != null) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        }
    }

    @Override
    protected void G(Canvas var1, lH_3 var2) {
        label86: {
            int var3 = YO;
            var3 ^= 219089569;
            int var4 = System.identityHashCode(this);
            float var5 = this.tQ();
            float var73 = var5;
            Oo var6 = var2.x();
            int var7 = var6.E();
            int var8 = var6.E();
            var8 = DP.Y(var8, 0.55F);
            kN.MY(var1, 11.0F, 9.5F, 9.0F, var7, var8);
            TextStyle var88 = this.G;
            kN.O(var1, var6, "Potions", var5, 7.0F, 19.0F, var88);
            int var74 = var4 + 1;
            int var75 = var4 * var74;
            var7 = var4 + 2;
            int var76 = var75 * var7;
            var7 = var4 + 3;
            int var77 = var76 * var7;
            int var78 = var77 & 7;
            if (var78 != 0) {
                var3 *= -335465393;
                var3 -= -2037285340;
                var3 |= -595625522;
                var3 ^= -1921480213;
            } else {
                var3 >>= 23;
                var3 ^= -257199391;
                var3 -= 205468755;
                var3 ^= -1726028268;
                int var79 = var3 + 1;
                int var80 = var3 * var79;
                var7 = var3 + 2;
                int var81 = var80 * var7;
                var7 = var3 + 3;
                int var82 = var81 * var7;
                int var83 = var82 & 7;
                if (var83 != 0) {
                    break label86;
                }

                var1.save();
                float var84 = this.Yo();
                float var85 = var84 - 19.0F;
                var1.clip(0.0F, 19.0F, var5, var85, 0.0F);
                float var86 = 21.0F;
                List var93 = this.cf;
                Iterator var94 = var93.iterator();
                Iterator var95 = var94;
                float var87 = var86;
                var3 |= -1675497881;
                var3 ^= 1650754035;

                label83:
                while (true) {
                    var8 = var3 + 1;
                    var8 = var3 * var8;
                    int var9 = var3 + 2;
                    var8 *= var9;
                    var9 = var3 + 3;
                    var8 *= var9;
                    var8 &= 7;
                    if (var8 != 0) {
                        break label86;
                    }

                    int var102 = (var95.hasNext()) ? 1 : 0;
                    Integer var115 = var4;
                    if (var115 == null) {
                        switch (var3) {
                            case -61898988:
                                var3 -= 1169818032;
                                var3 &= -1096042104;
                                var3 ^= -28192306;
                                var3 += -895709953;
                                var3 ^= 1667924937;
                                break label83;
                            case 2054922239:
                            default:
                                var3 ^= 71792783;
                                break label83;
                            case 2069870806:
                                var3 ^= -978898438;
                                break label83;
                        }
                    }

                    var3 &= -1667921327;
                    var3 &= -1063929043;
                    var3 ^= -1859352925;
                    int var116 = var3 + 1;
                    var116 = var3 * var116;
                    var116 &= 1;
                    if (var116 != 0) {
                        break label86;
                    }

                    if (var102 == 0) {
                        var3 &= 1517877902;
                        var3 ^= 519208555;
                        var1.restore();
                        return;
                    }

                    var3 &= -2040783974;
                    var3 += -1319610369;
                    var3 &= -1404104700;
                    var3 += 1574911067;
                    var3 ^= 257310312;
                    var102 = var3 + 1;
                    var102 = var3 * var102;
                    var102 &= 1;
                    if (var102 != 0) {
                        break label86;
                    }

                    Object var106 = var95.next();
                    var116 = var4 + 1;
                    var116 = var4 * var116;
                    int var10 = var4 + 2;
                    var116 *= var10;
                    var10 = var4 + 3;
                    var116 *= var10;
                    var116 &= 7;
                    if (var116 != 0) {
                        var3 *= -186746009;
                        var3 &= -135215690;
                        var3 ^= -727206016;
                        break;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ 1271138099;
                        case -246873549 -> {
                            var3 -= 1542755409;
                            var3 ^= -1539386301;
                            var3 >>= 24;
                            yield var3 ^ 280356161;
                        }
                        case 1317763393 -> var3 ^ -1922380897;
                    };
                    B var107 = (B)var106;
                    XF var124 = var107.Bg;
                    float var125 = var124.bs();
                    float var126 = TP.S(var125);
                    float var143;
                    var10 = (var143 = var126 - 0.005F) == 0.0F ? 0 : (var143 < 0.0F ? -1 : 1);
                    if (var10 <= 0) {
                        var3 |= -1118058066;
                        var3 ^= 607345918;
                        var87 = var87;
                        var3 += -1064840479;
                        var3 <<= 12;
                        var3 ^= -1267634412;
                    } else {
                        var3 = switch (var3) {
                            default -> var3 ^ -1105794714;
                            case 280356208 -> {
                                var3 ^= -20206363;
                                var3 &= 1779664811;
                                var3 += 997199441;
                                var3 += -1195179133;
                                yield var3 ^ 1142939809;
                            }
                            case 465981703 -> var3 ^ -637948810;
                        };
                        long var129 = var3;
                        long var12 = var129 + 1L;
                        var12 = var129 * var12;
                        long var14 = var129 + 2L;
                        var12 *= var14;
                        long var130 = var129 + 3L;
                        var12 *= var130;
                        long var131 = var12 & 7L;
                        long var144;
                        var10 = (var144 = var131 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            break label86;
                        }

                        var10 = var3 * -340740215;
                        var10 >>= 24;
                        var10 ^= -2018056179;
                        this.N(var1, var107, var73, var87, var126, var2, var10);
                        var102 = var4 + 1;
                        var102 = var4 * var102;
                        var102 &= 1;
                        if (var102 != 0) {
                            var3 ^= 549075374;
                            var3 ^= 1347116039;
                            var3 ^= 447504473;
                            break;
                        }

                        var3 <<= 28;
                        var3 += 1323293202;
                        var3 += 834943303;
                        var3 -= -11345815;
                        var3 ^= -210900597;
                        long var136 = var3;
                        var12 = var136 + 1L;
                        var12 = var136 * var12;
                        long var137 = var12 & 1L;
                        long var145;
                        var102 = (var145 = var137 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                        if (var102 != 0) {
                            break label86;
                        }

                        float var112 = 14.0F * var126;
                        float var113 = var87 + var112;
                        var87 = var113;
                        var3 |= 295589128;
                        var3 <<= 6;
                        var3 += -333475224;
                        var3 ^= 664276540;
                    }
                }
            }

            AssertionError var72 = new AssertionError();
            throw var72;
        }

        IllegalArgumentException var71 = new IllegalArgumentException();
        throw var71;
    }

    private void N(Canvas var1, B var2, float var3, float var4, float var5, lH_3 var6, int var7) {
        label277: {
            int var9 = System.identityHashCode(this);
            var1.save();
            long var10 = var9;
            long var12 = var10 + 1L;
            var12 = var10 * var12;
            long var14 = var10 + 2L;
            var12 *= var14;
            var10 += 3L;
            var12 *= var10;
            var10 = var12 & 7L;
            long var435;
            int var200 = (var435 = var10 - 0L) == 0L ? 0 : (var435 < 0L ? -1 : 1);
            int var25;
            if (var200 != 0) {
                var25 = var7 << 29;
                var25 -= -445274455;
                var25 *= -1884378999;
                var25 *= -581779799;
                var25 ^= 1042329638;
            } else {
                label279: {
                    var25 = var7 & 56640159;
                    var25 |= -1271582004;
                    var25 ^= 1518022021;
                    var25 &= 333355859;
                    var25 ^= -993782390;
                    var1.alpha(var5);
                    float var201 = 1.0F - var5;
                    float var202 = var201 * -8.0F;
                    var1.translate(var202, 0.0F);
                    float var203 = var4 + 7.0F;
                    int var11 = var2.zK;
                    if (var11 > 0) {
                        var25 += 774527506;
                        var25 >>>= 16;
                        var25 ^= -615608266;
                        var11 = var2.zK;
                        float var238 = var203 - 4.5F;
                        float var13 = var2.G;
                        float var263 = var2.R;
                        float var15 = var2.h;
                        int var16 = var9 + 1;
                        var16 = var9 * var16;
                        int var17 = var9 + 2;
                        var16 *= var17;
                        var17 = var9 + 3;
                        var16 *= var17;
                        var16 &= 7;
                        if (var16 != 0) {
                            var25 ^= -1466174295;
                            var25 ^= -1541677270;
                            break label279;
                        }

                        var25 >>= 6;
                        var25 += -1948159653;
                        var25 ^= -2067969969;
                        Integer var359 = var25;
                        if (var359 == null) {
                            break label277;
                        }

                        float var360 = var2.IJ;
                        var1.image(var11, 7.0F, var238, 9.0F, 9.0F, var13, var263, var15, var360, -1, 0.0F, false);
                        var25 >>= 20;
                        var25 &= 485471676;
                        var25 |= 1382036491;
                        var25 >>= 7;
                        var25 ^= -580112201;
                    } else {
                        var25 *= 789317237;
                        var25 ^= 756623462;
                    }

                    long var205 = var25;
                    long var248 = var205 + 1L;
                    var248 = var205 * var248;
                    long var317 = var205 + 2L;
                    var248 *= var317;
                    long var206 = var205 + 3L;
                    var248 *= var206;
                    long var207 = var248 & 7L;
                    long var436;
                    var11 = (var436 = var207 - 0L) == 0L ? 0 : (var436 < 0L ? -1 : 1);
                    if (var11 != 0) {
                        break label277;
                    }

                    float var209 = 21.0F;
                    Oo var239 = var6.x();
                    Integer var252 = var9;
                    label269:
                    if (var252 != null) {
                        var25 ^= 602289732;
                        var25 += 2118503103;
                        var25 ^= 708401662;
                        int var253 = var25 + 1;
                        int var254 = var25 * var253;
                        int var264 = var25 + 2;
                        int var255 = var254 * var264;
                        int var265 = var25 + 3;
                        int var256 = var255 * var265;
                        int var257 = var256 & 7;
                        if (var257 != 0) {
                            break label277;
                        }

                        String var258 = var2.W;
                        TextStyle var266 = u;
                        float var267 = var266.size();
                        float var268 = var267 * 0.5F;
                        float var269 = var203 - var268;
                        boolean var318 = var2.Rt;
                        TextStyle var323;
                        if (var318) {
                            var25 ^= 1020338436;
                            var25 += -2090766831;
                            var25 ^= -688242933;
                            var317 = var25;
                            long var409 = var317 + 1L;
                            var409 = var317 * var409;
                            var317 = var409 & 1L;
                            long var437;
                            int var321 = (var437 = var317 - 0L) == 0L ? 0 : (var437 < 0L ? -1 : 1);
                            if (var321 != 0) {
                                break label277;
                            }

                            TextStyle var322 = this.ku;
                            long var361 = var9;
                            long var18 = var361 + 1L;
                            var18 = var361 * var18;
                            var361 = var18 & 1L;
                            long var438;
                            int var363 = (var438 = var361 - 0L) == 0L ? 0 : (var438 < 0L ? -1 : 1);
                            if (var363 != 0) {
                                switch (var25) {
                                    case 990144703:
                                        var25 >>>= 22;
                                        var25 ^= -2059404462;
                                        var25 |= -946175265;
                                        var25 ^= 275887294;
                                        break label269;
                                    case 1077385279:
                                    default:
                                        var25 ^= -974984223;
                                        break label269;
                                    case 1192688978:
                                        var25 ^= -825296650;
                                        break label269;
                                }
                            }
                            var25 = switch (var25) {
                                case -1797153107 -> var25 ^ -1440165248;
                                default -> var25 ^ 620383413;
                                case 990144703 -> {
                                    var25 ^= 374127614;
                                    var25 &= 1429992377;
                                    var25 += -1552408865;
                                    var25 &= 125323438;
                                    yield var25 ^ 1449117680;
                                }
                            };
                            var361 = var25;
                            var18 = var361 + 1L;
                            var18 = var361 * var18;
                            var361 = var18 & 1L;
                            long var439;
                            int var366 = (var439 = var361 - 0L) == 0L ? 0 : (var439 < 0L ? -1 : 1);
                            if (var366 != 0) {
                                break label277;
                            }

                            var323 = var322;
                            var25 *= 1464290613;
                            var25 &= -473681872;
                            var25 &= -515163323;
                            var25 ^= 391622762;
                        } else {
                            var25 += -827819233;
                            var25 >>>= 1;
                            var25 ^= 2036683323;
                            int var367 = var25 + 1;
                            var367 = var25 * var367;
                            int var411 = var25 + 2;
                            var367 *= var411;
                            var411 = var25 + 3;
                            var367 *= var411;
                            var367 &= 7;
                            if (var367 != 0) {
                                break label277;
                            }

                            TextStyle var372 = this.HM;
                            Integer var413 = var9;
                            if (var413 == null) {
                                var25 &= -71031847;
                                var25 -= 1258476332;
                                var25 *= -1289466477;
                                var25 -= -1254953922;
                                var25 ^= 2060217799;
                                break label269;
                            }

                            var25 ^= -573005742;
                            var25 &= -41495217;
                            var25 *= -150292157;
                            var25 ^= 1030397421;
                            var413 = var25;
                            if (var413 == null) {
                                break label277;
                            }

                            var323 = var372;
                            var25 |= 482421346;
                            var25 ^= 176216601;
                        }

                        int var373 = var25 + 1;
                        var373 = var25 * var373;
                        int var415 = var25 + 2;
                        var373 *= var415;
                        var415 = var25 + 3;
                        var373 *= var415;
                        var373 &= 7;
                        if (var373 != 0) {
                            break label277;
                        }

                        float var259 = var1.text(var258, var209, var269, var323);
                        float var260 = var3 - 7.0F;
                        float var270 = var2.u;
                        float var261 = var260 - var270;
                        int var271 = var9 + 1;
                        int var272 = var9 * var271;
                        int var324 = var9 + 2;
                        int var273 = var272 * var324;
                        int var325 = var9 + 3;
                        int var274 = var273 * var325;
                        int var275 = var274 & 7;
                        label257:
                        if (var275 == 0) {
                            var25 *= -1411199257;
                            var25 |= -456019867;
                            var25 &= -283426598;
                            var25 ^= -545805914;
                            float var276 = var2.Rb;
                            float var210 = var209 + var276;
                            float var211 = var210 + 6.0F;
                            float var277 = var261 - 6.0F;
                            float var440;
                            int var326 = (var440 = var277 - var211) == 0.0F ? 0 : (var440 < 0.0F ? -1 : 1);
                            if (var326 > 0) {
                                var25 ^= -173604471;
                                var25 &= 753330419;
                                var25 -= 510297771;
                                var25 *= -1937350281;
                                var25 ^= -353656554;
                                float var327 = var203 - 0.25F;
                                float var278 = var277 - var211;
                                var373 = var239.s();
                                Integer var417 = var9;
                                if (var417 == null) {
                                    var25 += 552220146;
                                    var25 -= 689370810;
                                    var25 ^= 761492485;
                                    break label257;
                                }

                                var25 ^= -207036197;
                                var25 ^= 69141666;
                                int var418 = var25 + 1;
                                var418 = var25 * var418;
                                var418 &= 1;
                                if (var418 != 0) {
                                    break label277;
                                }

                                var1.rect(var211, var327, var278, 0.5F, var373);
                                switch (var25) {
                                    case -1072176099:
                                        var25 ^= -938315190;
                                        break;
                                    case -177334155:
                                        var25 >>>= 8;
                                        var25 &= -1483043944;
                                        var25 *= -1065765973;
                                        var25 ^= 644789353;
                                        break;
                                    case 413246453:
                                    default:
                                        var25 ^= 604708938;
                                }
                            } else {
                                switch (var25) {
                                    case -1480755919:
                                        var25 ^= 1028745855;
                                        break;
                                    case 829204836:
                                        var25 -= 1090096485;
                                        var25 ^= 176171422;
                                        break;
                                    case 1369401900:
                                    default:
                                        var25 ^= 1142135693;
                                }
                            }

                            var11 = var25 + 1;
                            var11 = var25 * var11;
                            int var279 = var25 + 2;
                            var11 *= var279;
                            int var280 = var25 + 3;
                            var11 *= var280;
                            var11 &= 7;
                            if (var11 != 0) {
                                break label277;
                            }

                            int var217 = var2.eO ? 1 : 0;
                            var14 = var9;
                            long var379 = var14 + 1L;
                            long var380 = var14 * var379;
                            var14 = var380 & 1L;
                            long var441;
                            int var283 = (var441 = var14 - 0L) == 0L ? 0 : (var441 < 0L ? -1 : 1);
                            if (var283 != 0) {
                                var25 ^= 615222912;
                                var25 |= 1090429160;
                                var25 ^= 154203048;
                            } else {
                                label286: {
                                    var25 ^= -1213099078;
                                    var25 >>>= 21;
                                    var25 ^= -1449921058;
                                    float var231;
                                    if (var217 != 0) {
                                        var25 -= -1692222971;
                                        var25 >>= 8;
                                        var25 ^= -1357218672;
                                        var217 = var25 + 1;
                                        var217 = var25 * var217;
                                        int var284 = var25 + 2;
                                        var217 *= var284;
                                        int var285 = var25 + 3;
                                        var217 *= var285;
                                        var217 &= 7;
                                        if (var217 != 0) {
                                            break label277;
                                        }

                                        double var286 = var6.M();
                                        double var287 = var286 * 7.0;
                                        double var288 = Math.cos(var287);
                                        var217 = var9 + 1;
                                        var217 = var9 * var217;
                                        var373 = var9 + 2;
                                        var217 *= var373;
                                        var373 = var9 + 3;
                                        var217 *= var373;
                                        var217 &= 7;
                                        if (var217 != 0) {
                                            var25 *= 1185517077;
                                            var25 |= -1098380236;
                                            var25 ^= 674648692;
                                            break label286;
                                        }

                                        var25 ^= 646785549;
                                        var25 &= -448368988;
                                        var25 ^= -80734447;
                                        float var228 = (float)var288;
                                        float var229 = 0.5F * var228;
                                        float var230 = 0.5F + var229;
                                        var231 = var230;
                                        switch (var25) {
                                            case 1871800630:
                                            default:
                                                var25 ^= 2089841934;
                                                break;
                                            case 2049978801:
                                                var25 <<= 1;
                                                var25 &= -491404109;
                                                var25 &= -245276841;
                                                var25 &= 1625429889;
                                                var25 ^= 2092570671;
                                                break;
                                            case 2127893426:
                                                var25 ^= -1752917039;
                                        }
                                    } else {
                                        var25 *= -266434795;
                                        var25 *= 509185415;
                                        var25 |= -188805460;
                                        var25 -= -607643973;
                                        var25 ^= 1630115933;
                                        Integer var289 = var25;
                                        if (var289 == null) {
                                            break label277;
                                        }

                                        var231 = 0.0F;
                                        var25 -= -972105093;
                                        var25 ^= -1810431983;
                                        var25 *= 494369265;
                                        var25 *= -1394359217;
                                        var25 ^= 1016566911;
                                    }

                                    var14 = var25;
                                    long var383 = var14 + 1L;
                                    long var384 = var14 * var383;
                                    long var428 = var14 + 2L;
                                    long var385 = var384 * var428;
                                    var14 += 3L;
                                    long var386 = var385 * var14;
                                    var14 = var386 & 7L;
                                    long var442;
                                    int var293 = (var442 = var14 - 0L) == 0L ? 0 : (var442 < 0L ? -1 : 1);
                                    if (var293 != 0) {
                                        break label277;
                                    }

                                    float var294 = var203 - 5.0F;
                                    Integer var328 = var9;
                                    if (var328 == null) {
                                        var25 ^= 961516481;
                                        var25 ^= 234556502;
                                        var25 &= 723649457;
                                        var25 >>= 4;
                                        var25 ^= -716411014;
                                    } else {
                                        label302: {
                                            var25 = switch (var25) {
                                                case -762713096 -> var25 ^ -1805331519;
                                                case 479860783 -> {
                                                    var25 &= 444283148;
                                                    var25 &= 1077415309;
                                                    var25 *= 1441502809;
                                                    var25 |= -859402069;
                                                    yield var25 ^ -1750137938;
                                                }
                                                default -> var25 ^ -2136871250;
                                            };
                                            int var329 = var25 + 1;
                                            int var330 = var25 * var329;
                                            var373 = var25 + 2;
                                            int var331 = var330 * var373;
                                            var373 = var25 + 3;
                                            int var332 = var331 * var373;
                                            int var333 = var332 & 7;
                                            if (var333 != 0) {
                                                break label277;
                                            }

                                            float var334 = var2.u;
                                            kN.MB(var1, var239, var261, var294, var334, 10.0F);
                                            float var443;
                                            int var335 = (var443 = var231 - 0.0F) == 0.0F ? 0 : (var443 < 0.0F ? -1 : 1);
                                            if (var335 > 0) {
                                                var25 = switch (var25) {
                                                    case 107003340 -> var25 ^ 1091983659;
                                                    default -> var25 ^ 169742582;
                                                    case 1803081473 -> {
                                                        var25 += 1495456338;
                                                        var25 -= 1346382734;
                                                        var25 ^= 590637010;
                                                        yield var25 ^ -269656942;
                                                    }
                                                };
                                                int var336 = var25 + 1;
                                                int var337 = var25 * var336;
                                                int var338 = var337 & 1;
                                                if (var338 != 0) {
                                                    break label277;
                                                }

                                                float var339 = var2.u;
                                                var373 = var9 + 1;
                                                var373 = var9 * var373;
                                                var373 &= 1;
                                                if (var373 != 0) {
                                                    var25 &= 443241306;
                                                    var25 *= -245523183;
                                                    var25 ^= -1327268543;
                                                    break label302;
                                                }

                                                var25 >>= 6;
                                                var25 -= -1845744361;
                                                var25 ^= 833790644;
                                                long var392 = var25;
                                                var428 = var392 + 1L;
                                                var428 = var392 * var428;
                                                long var20 = var392 + 2L;
                                                var428 *= var20;
                                                long var393 = var392 + 3L;
                                                var428 *= var393;
                                                long var394 = var428 & 7L;
                                                long var444;
                                                var373 = (var444 = var394 - 0L) == 0L ? 0 : (var444 < 0L ? -1 : 1);
                                                if (var373 != 0) {
                                                    break label277;
                                                }

                                                float var396 = 0.22F * var231;
                                                var373 = DP.Y(-50354, var396);
                                                var1.roundRect(var261, var294, var339, 10.0F, 5.0F, var373);
                                                var25 *= 1384182251;
                                                var25 -= -1903335031;
                                                var25 -= 1240396455;
                                                var25 -= -509444139;
                                                var25 ^= 205090621;
                                            } else {
                                                var25 >>>= 21;
                                                var25 -= -1824916770;
                                                var25 &= -976157516;
                                                var25 *= -985721271;
                                                var25 ^= -96860623;
                                            }

                                            int var295 = var25 + 1;
                                            int var296 = var25 * var295;
                                            int var340 = var25 + 2;
                                            int var297 = var296 * var340;
                                            int var341 = var25 + 3;
                                            int var298 = var297 * var341;
                                            int var299 = var298 & 7;
                                            if (var299 != 0) {
                                                break label277;
                                            }

                                            boolean var300 = var2.eO;
                                            var317 = var9;
                                            long var421 = var317 + 1L;
                                            long var422 = var317 * var421;
                                            var317 = var422 & 1L;
                                            long var445;
                                            int var344 = (var445 = var317 - 0L) == 0L ? 0 : (var445 < 0L ? -1 : 1);
                                            if (var344 != 0) {
                                                var25 ^= -810749267;
                                                var25 -= 1896693788;
                                                var25 >>>= 10;
                                                var25 ^= -672829171;
                                            } else {
                                                label290: {
                                                    var25 |= -278412900;
                                                    var25 >>>= 22;
                                                    var25 &= 352793602;
                                                    var25 ^= -40211932;
                                                    TextStyle var234;
                                                    if (var300) {
                                                        var25 *= 586747129;
                                                        var25 += 899558701;
                                                        var25 ^= -593261554;
                                                        var14 = var25;
                                                        long var398 = var14 + 1L;
                                                        long var399 = var14 * var398;
                                                        var428 = var14 + 2L;
                                                        long var400 = var399 * var428;
                                                        var14 += 3L;
                                                        long var401 = var400 * var14;
                                                        var14 = var401 & 7L;
                                                        long var446;
                                                        int var304 = (var446 = var14 - 0L) == 0L ? 0 : (var446 < 0L ? -1 : 1);
                                                        if (var304 != 0) {
                                                            break label277;
                                                        }

                                                        TextStyle var305 = Q;
                                                        Integer var345 = var9;
                                                        if (var345 == null) {
                                                            var25 |= -1460041535;
                                                            var25 |= 2061158410;
                                                            var25 ^= 691124142;
                                                            break label290;
                                                        }

                                                        var25 += 70110188;
                                                        var25 *= 1110032079;
                                                        var25 -= 1189957766;
                                                        var25 *= -2021695595;
                                                        var25 ^= 24559816;
                                                        int var346 = var25 + 1;
                                                        int var347 = var25 * var346;
                                                        var373 = var25 + 2;
                                                        int var348 = var347 * var373;
                                                        var373 = var25 + 3;
                                                        int var349 = var348 * var373;
                                                        int var350 = var349 & 7;
                                                        if (var350 != 0) {
                                                            break label277;
                                                        }

                                                        int var351 = var239.MD();
                                                        int var240 = var239.AE();
                                                        var217 = DP.Z(var351, var240, var231);
                                                        TextStyle var233 = var305.color(var217);
                                                        var234 = var233;
                                                        var25 <<= 28;
                                                        var25 -= -989959868;
                                                        var25 ^= 1600378602;
                                                    } else {
                                                        var25 -= 268744135;
                                                        var25 ^= -1890556298;
                                                        TextStyle var241 = this.jJ;
                                                        Integer var306 = var9;
                                                        if (var306 == null) {
                                                            var25 |= 829700010;
                                                            var25 ^= -1539589910;
                                                            break label290;
                                                        }
                                                        var25 = switch (var25) {
                                                            default -> var25 ^ -10536418;
                                                            case 1657131561 -> {
                                                                var25 += -270152059;
                                                                var25 >>= 20;
                                                                var25 -= -1500451460;
                                                                var25 <<= 3;
                                                                yield var25 ^ -1420011031;
                                                            }
                                                            case 2049206111 -> var25 ^ 970887125;
                                                        };
                                                        var14 = var25;
                                                        long var404 = var14 + 1L;
                                                        long var405 = var14 * var404;
                                                        var428 = var14 + 2L;
                                                        long var406 = var405 * var428;
                                                        var14 += 3L;
                                                        long var407 = var406 * var14;
                                                        var14 = var407 & 7L;
                                                        long var447;
                                                        int var310 = (var447 = var14 - 0L) == 0L ? 0 : (var447 < 0L ? -1 : 1);
                                                        if (var310 != 0) {
                                                            break label277;
                                                        }

                                                        var234 = var241;
                                                        switch (var25) {
                                                            case -409568967:
                                                            default:
                                                                var25 ^= 165418314;
                                                                break;
                                                            case 1402665209:
                                                                var25 ^= 1133947233;
                                                                break;
                                                            case 1613030553:
                                                                var25 ^= 1982991621;
                                                                var25 |= -1899281892;
                                                                var25 *= -1444760841;
                                                                var25 ^= -1544254510;
                                                        }
                                                    }

                                                    int var242 = var25 + 1;
                                                    int var243 = var25 * var242;
                                                    int var311 = var25 + 2;
                                                    int var244 = var243 * var311;
                                                    int var312 = var25 + 3;
                                                    int var245 = var244 * var312;
                                                    int var246 = var245 & 7;
                                                    if (var246 != 0) {
                                                        break label277;
                                                    }

                                                    StringBuilder var247 = var2.j;
                                                    float var313 = var2.u;
                                                    float var352 = var2.A;
                                                    float var314 = var313 - var352;
                                                    float var315 = var314 * 0.5F;
                                                    float var262 = var261 + var315;
                                                    TextStyle var316 = Q;
                                                    var317 = var9;
                                                    long var423 = var317 + 1L;
                                                    long var424 = var317 * var423;
                                                    var317 = var424 & 1L;
                                                    long var448;
                                                    var9 = (var448 = var317 - 0L) == 0L ? 0 : (var448 < 0L ? -1 : 1);
                                                    if (var9 == 0) {
                                                        var25 *= -970135917;
                                                        var25 &= 423668499;
                                                        var25 ^= 1237691614;
                                                        var25 *= -1631806341;
                                                        var25 ^= 1419518382;
                                                        float var194 = var316.size();
                                                        float var195 = var194 * 0.5F;
                                                        float var196 = var203 - var195;
                                                        float var197 = var1.text(var247, var262, var196, var234);
                                                        var1.restore();
                                                        return;
                                                    }

                                                    var25 ^= -94133711;
                                                    var25 += -1057449533;
                                                    var25 ^= -1187761301;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            switch (var25) {
                                case -1753818744:
                                    var25 ^= 912291324;
                                    break;
                                case 1181531605:
                                default:
                                    var25 ^= 2040242817;
                                    break;
                                case 1465360490:
                                    var25 <<= 14;
                                    var25 *= 1619737735;
                                    var25 ^= 180669380;
                                    var25 &= -1259680592;
                                    var25 ^= -941226047;
                            }
                        }
                    } else {
                        var25 += 181657576;
                        var25 += 546615082;
                        var25 ^= -553701199;
                    }
                }
            }

            Integer var190 = var25;
            if (var190 != null) {
                AssertionError var191 = new AssertionError();
                throw var191;
            }
        }

        IllegalArgumentException var192 = new IllegalArgumentException();
        throw var192;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -93472538;
        int var2 = tR_2.qG;
        int var4 = of_2.kj(var3, var1, var2);
        YO = var4;
        String[] var5 = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        ROMAN = var5;
        TextStyle var6 = TextStyle.of(8.2F, -1);
        TextStyle var7 = var6.semibold();
        LJ = var7;
        TextStyle var8 = TextStyle.of(7.0F, -1);
        TextStyle var9 = var8.medium();
        u = var9;
        TextStyle var10 = TextStyle.of(6.4F, -1);
        TextStyle var11 = var10.medium();
        TextStyle var12 = var11.tabular();
        Q = var12;
    }
}
