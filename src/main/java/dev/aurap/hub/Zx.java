package dev.aurap.hub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Zx {
    public static final int Mk = 6;
    public static final long A = 750L;
    private static final Logger w;
    private static final Gson Ov;
    private static final Gson f;
    private final Path QC;
    private final NW h;
    private volatile boolean dt;
    private volatile long wI;
    private boolean Tb;
    public static final int qs;

    public Zx(Path var1, NW var2) {
        this.QC = var1;
        this.h = var2;
        Runnable var3 = this::s;
        var2.P(var3);
    }

    public Path gY() {
        int var1 = qs;
        var1 ^= -976932252;
        int var2 = System.identityHashCode(this);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        var3 = of_2.y;
        var1 ^= var3;
        var1 ^= -864320044;
        of_2.y = -864320044;
        var3 = of_2.io;
        var1 ^= var3;
        var1 ^= -1225393570;
        of_2.io = -1225393570;
        if (var2 != 0) {
            var1 >>= 16;
            var1 ^= -1921102244;
            long var20 = var1;
            long var31 = var20 + 1L;
            long var32 = var20 * var31;
            long var21 = var32 & 1L;
            long var33;
            var2 = (var33 = var21 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
            if (var2 == 0) {
                RuntimeException var23 = new RuntimeException();
                throw var23;
            }
        } else {
            var1 |= 1200545531;
            var1 >>>= 17;
            var1 ^= -1360900280;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return this.QC;
            }
        }

        IllegalArgumentException var17 = new IllegalArgumentException();
        throw var17;
    }

    public void s() {
        int var1 = qs;
        var1 ^= -1897947253;
        int var2 = System.identityHashCode(this);
        int var3 = (this.Tb ? 1 : 0);
        Integer var4 = var2;
        if (var4 == null) {
            var1 *= 2043518011;
            var1 -= -1880654478;
            var1 += 852592656;
            var1 ^= -549347352;
        } else {
            label78: {
                var1 &= -302148965;
                var1 ^= 235849821;
                var4 = var1;
                if (var4 != null) {
                    if (var3 != 0) {
                        var1 >>>= 12;
                        var1 ^= -65179643;
                        long var60 = var1;
                        long var78 = var60 + 1L;
                        var78 = var60 * var78;
                        long var61 = var78 & 1L;
                        long var92;
                        var3 = (var92 = var61 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return;
                        }
                    } else {
                        var1 ^= 575282518;
                        var1 *= -2040609697;
                        var1 ^= -2088565635;
                        var1 ^= 293213975;
                        long var53 = var1;
                        long var5 = var53 + 1L;
                        var5 = var53 * var5;
                        long var7 = var53 + 2L;
                        var5 *= var7;
                        long var54 = var53 + 3L;
                        var5 *= var54;
                        long var55 = var5 & 7L;
                        long var93;
                        var3 = (var93 = var55 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            boolean var57 = this.dt;
                            long var64 = var2;
                            long var6 = var64 + 1L;
                            var6 = var64 * var6;
                            long var8 = var64 + 2L;
                            var6 *= var8;
                            long var65 = var64 + 3L;
                            var6 *= var65;
                            long var66 = var6 & 7L;
                            long var94;
                            int var67 = (var94 = var66 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
                            if (var67 != 0) {
                                var1 ^= -2114075811;
                                var1 ^= 441052268;
                                break label78;
                            }

                            var1 += 189436950;
                            var1 |= 403814113;
                            var1 |= -1707973599;
                            var1 |= -453246367;
                            var1 ^= 1498432720;
                            long var68 = var1;
                            var6 = var68 + 1L;
                            var6 = var68 * var6;
                            var8 = var68 + 2L;
                            var6 *= var8;
                            long var69 = var68 + 3L;
                            var6 *= var69;
                            long var70 = var6 & 7L;
                            long var95;
                            var67 = (var95 = var70 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                            label57:
                            if (var67 == 0) {
                                if (!var57) {
                                    var1 &= 1156141770;
                                    var1 |= -1991207775;
                                    var1 ^= 1920160927;
                                    Integer var58 = var1;
                                    if (var58 == null) {
                                        break label57;
                                    }

                                    long var59 = System.currentTimeMillis();
                                    var5 = var2;
                                    var7 = var5 + 1L;
                                    var7 = var5 * var7;
                                    long var9 = var5 + 2L;
                                    var7 *= var9;
                                    var5 += 3L;
                                    var7 *= var5;
                                    var5 = var7 & 7L;
                                    long var96;
                                    var2 = (var96 = var5 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                                    if (var2 != 0) {
                                        var1 |= 1267429808;
                                        var1 -= -1568437715;
                                        var1 |= 1704774619;
                                        var1 *= -829859955;
                                        var1 ^= -1510335545;
                                        break label78;
                                    }

                                    var1 -= -713663691;
                                    var1 -= -647687875;
                                    var1 &= -1405299777;
                                    var1 ^= -1800061712;
                                    this.wI = var59;
                                    var1 ^= 1895628682;
                                    var1 |= 1307620355;
                                    var1 ^= -2001593646;
                                } else {
                                    switch (var1) {
                                        case -1481655765:
                                            var1 *= 1137107387;
                                            var1 &= 1439042660;
                                            var1 *= 860384909;
                                            var1 ^= 749498569;
                                            break;
                                        case -511830732:
                                            var1 ^= -632170157;
                                            break;
                                        case 1910809840:
                                        default:
                                            var1 ^= 995353131;
                                    }
                                }

                                Integer var51 = var1;
                                if (var51 != null) {
                                    this.dt = true;
                                    return;
                                }
                            }
                        }
                    }
                }

                IllegalArgumentException var52 = new IllegalArgumentException();
                throw var52;
            }
        }

        IllegalArgumentException var49 = new IllegalArgumentException();
        throw var49;
    }

    public void M(long var1) {
        label55: {
            int var35;
            label54: {
                var35 = qs;
                var35 ^= 1577211787;
                int var4 = System.identityHashCode(this);
                int var5 = var4 + 1;
                var5 = var4 * var5;
                var5 &= 1;
                if (var5 == 0) {
                    var35 &= 460304058;
                    var35 ^= -1203311347;
                    var35 ^= 98075660;
                    var5 = var35 + 1;
                    var5 = var35 * var5;
                    int var6 = var35 + 2;
                    var5 *= var6;
                    var6 = var35 + 3;
                    var5 *= var6;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label55;
                    }

                    int var70 = this.dt ? 1 : 0;
                    if (var70 == 0) {
                        var35 &= 1683998012;
                        var35 >>= 21;
                        var35 ^= -614170101;
                        var35 ^= -1338864136;
                        var35 ^= 1010753266;
                        break label54;
                    }

                    var35 |= 396889657;
                    var35 += -884107497;
                    var35 ^= 976796582;
                    Integer var71 = var35;
                    if (var71 == null) {
                        break label55;
                    }

                    long var72 = this.wI;
                    long var73 = var1 - var72;
                    long var85;
                    var70 = (var85 = var73 - 750L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
                    long var77 = var4;
                    long var8 = var77 + 1L;
                    var8 = var77 * var8;
                    long var10 = var77 + 2L;
                    var8 *= var10;
                    long var78 = var77 + 3L;
                    var8 *= var78;
                    long var79 = var8 & 7L;
                    long var86;
                    var4 = (var86 = var79 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                    if (var4 == 0) {
                        var35 ^= -1595738031;
                        var35 |= -1282673046;
                        var35 ^= -1740697360;
                        if (var70 >= 0) {
                            var35 ^= -1312989811;
                            var35 <<= 25;
                            var35 &= -1865242407;
                            var35 >>>= 25;
                            var35 ^= 1010953381;
                            var4 = var35 + 1;
                            var4 = var35 * var4;
                            var4 &= 1;
                            if (var4 != 0) {
                                break label55;
                            }

                            this.Ll();
                            var35 *= 122389173;
                            var35 &= -1026771983;
                            var35 += -541887932;
                            var35 ^= -1305242037;
                            var35 ^= 2061812367;
                        } else {
                            var35 -= 1346482581;
                            var35 <<= 26;
                            var35 &= -1049203756;
                            var35 |= -281693268;
                            var35 ^= -1201839219;
                        }
                        break label54;
                    }

                    var35 ^= 1812858903;
                    var35 |= 2063738247;
                    var35 += -467367635;
                    var35 ^= -622092288;
                } else {
                    switch (var35) {
                        case 328212904:
                        default:
                            var35 ^= -191762561;
                            break;
                        case 1665084730:
                            var35 ^= 766783594;
                            var35 -= 26615110;
                            var35 &= -1743025;
                            var35 ^= -105590035;
                            var35 ^= -1930654221;
                            break;
                        case 1779726157:
                            var35 ^= -1993155831;
                    }
                }

                var4 = var35 + 1;
                var4 = var35 * var4;
                var5 = var35 + 2;
                var4 *= var5;
                var35 += 3;
                var4 *= var35;
                var35 = var4 & 7;
                if (var35 == 0) {
                    RuntimeException var51 = new RuntimeException();
                    throw var51;
                }
                break label55;
            }

            long var56 = var35;
            long var80 = var56 + 1L;
            var80 = var56 * var80;
            var56 = var80 & 1L;
            long var87;
            int var58 = (var87 = var56 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
            if (var58 == 0) {
                return;
            }
        }

        UnsupportedOperationException var50 = new UnsupportedOperationException();
        throw var50;
    }

    public synchronized void q() {
    this.dt = false;
    try {
        com.google.gson.JsonObject json = this.WA(true);
        String str = n(json);
        if (this.QC.getParent() != null) {
            Files.createDirectories(this.QC.getParent());
        }
        Path temp = this.QC.resolveSibling(this.QC.getFileName() + ".tmp");
        Files.writeString(temp, str);
        Files.move(temp, this.QC, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    } catch (Exception e) {
        this.G(e, 0);
    }
}


    private void ki(JsonObject var1, int var2) {
        boolean var173 = false;
        Object var175 = null;
        Object var176 = null;
        Object var5 = null;
        int var4 = var2 * 872993525;
        var4 >>= 30;
        var4 *= -651731369;
        var4 ^= -1905071217;
        int var6 = var4 + 1;
        var6 = var4 * var6;
        int var7 = var4 + 2;
        var6 *= var7;
        var7 = var4 + 3;
        var6 *= var7;
        var6 &= 7;
        label151:
        if (var6 == 0) {
            int var141 = var1.has("modules") ? 1 : 0;
            JsonObject var147;
            if (var141 != 0) {
                var4 &= 1473998676;
                var4 -= 1971992579;
                var4 ^= 2104991785;
                long var142 = var4;
                long var8 = var142 + 1L;
                var8 = var142 * var8;
                long var10 = var142 + 2L;
                var8 *= var10;
                long var143 = var142 + 3L;
                var8 *= var143;
                long var144 = var8 & 7L;
                long var236;
                var141 = (var236 = var144 - 0L) == 0L ? 0 : (var236 < 0L ? -1 : 1);
                if (var141 != 0) {
                    break label151;
                }

                JsonObject var146 = var1.getAsJsonObject("modules");

                var4 = switch (var4) {
                    default -> var4 ^ 804164006;
                    case -1343281080 -> var4 ^ 1777208115;
                    case -1286647688 -> {
                        var4 *= -1385005093;
                        yield var4 ^ -1705033014;
                    }
                };
                var7 = var4 + 1;
                var7 = var4 * var7;
                var7 &= 1;
                if (var7 != 0) {
                    break label151;
                }

                var147 = var146;
                var4 ^= -81775472;
                var4 -= -2073347747;
                var4 += -1116941494;
                var4 += 1892209965;
                var4 ^= -1103548811;
            } else {
                var4 = switch (var4) {
                    default -> var4 ^ -1199920273;
                    case -1010587427 -> {
                        var4 ^= 1791636042;
                        var4 &= 2022748635;
                        yield var4 ^ -371604547;
                    }
                    case 2073431067 -> var4 ^ -466270344;
                };
                Integer var153 = var4;
                if (var153 == null) {
                    break label151;
                }

                JsonObject var154 = new JsonObject();
                var4 |= 524359093;
                var4 ^= -408725345;
                var4 |= 688987972;
                var4 |= 1441936869;
                var4 ^= -302705637;
                int var162 = var4 + 1;
                var162 = var4 * var162;
                var162 &= 1;
                if (var162 != 0) {
                    break label151;
                }

                var147 = var154;
                var4 *= 1908854257;
                var4 ^= -785881497;
            }

            JsonObject var148 = var147;
            NW var155 = this.h;
            List var156 = var155.dG();
            Iterator var157 = var156.iterator();
            var4 += -1166232215;
            var4 ^= 1422622563;
            Iterator var158 = var157;
            var4 |= 946772281;
            var4 ^= 1071590521;

            while (true) {
                boolean var165 = var158.hasNext();
                var4 ^= -970480165;
                var4 |= 1455959791;
                var4 >>= 5;
                var4 &= -1532167186;
                var4 ^= 1128216637;
                if (!var165) {
                    var4 &= 1846600234;
                    var4 ^= -216448377;
                    return;
                }

                var4 &= 2038383689;
                var4 |= 1865244344;
                var4 ^= -1100764340;
                Object var166 = var158.next();
                Yn var167 = (Yn)var166;
                var4 |= 1806676076;
                var4 >>>= 25;
                var4 |= 189713571;
                var4 *= 1715671631;
                var4 ^= 1087937585;
                Integer var9 = var4;
                if (var9 == null) {
                    break;
                }

                Yn var168 = var167;
                var4 &= -1548045509;
                var4 &= 1370112633;
                var4 &= 837064625;
                var4 ^= 1870832276;
                var9 = var4;
                if (var9 == null) {
                    break;
                }

                label170: {
                    label158: {
                        Throwable var3;
                        label171: {
                            try {
                                var4 >>= 30;
                                var4 += -265131720;
                                var4 += -1298419155;
                                var4 >>= 4;
                                var4 ^= -1601150360;
                            } catch (Throwable var19) {
                                var3 = var19;
                                int var64 = qs;
                                int var65 = var64 ^ -938879653;
                                var173 = var19 instanceof RuntimeException;
                                int var66 = var65 >> 10;
                                int var67 = var66 * -39473563;
                                int var68 = var67 ^ -732638630;
                                int var69 = var68 | -1758476476;
                                var4 = var69 ^ -1624392625;
                                long var181 = var4;
                                long var12 = var181 + 1L;
                                var12 = var181 * var12;
                                long var14 = var181 + 2L;
                                var12 *= var14;
                                var181 += 3L;
                                var12 *= var181;
                                var181 = var12 & 7L;
                                long var237;
                                int var184 = (var237 = var181 - 0L) == 0L ? 0 : (var237 < 0L ? -1 : 1);
                                if (var184 != 0) {
                                    break;
                                }
                                break label171;
                            }

                            var9 = var4;
                            if (var9 == null) {
                                break;
                            }

                            try {
                                var175 = var168.F();
                                var4 <<= 1;
                                var4 |= 568399842;
                                var4 >>= 16;
                                var4 += -652915057;
                                var4 ^= -763145238;
                            } catch (Throwable var18) {
                                var3 = var18;
                                int var76 = qs;
                                int var77 = var76 ^ -938879653;
                                var173 = var18 instanceof RuntimeException;
                                int var78 = var77 >> 10;
                                int var79 = var78 * -39473563;
                                int var80 = var79 ^ -732638630;
                                int var81 = var80 | -1758476476;
                                var4 = var81 ^ -1624392625;
                                long var185 = var4;
                                long var215 = var185 + 1L;
                                var215 = var185 * var215;
                                long var232 = var185 + 2L;
                                var215 *= var232;
                                var185 += 3L;
                                var215 *= var185;
                                var185 = var215 & 7L;
                                long var238;
                                int var188 = (var238 = var185 - 0L) == 0L ? 0 : (var238 < 0L ? -1 : 1);
                                if (var188 != 0) {
                                    break;
                                }
                                break label171;
                            }

                            long var189 = var4;
                            long var219 = var189 + 1L;
                            var219 = var189 * var219;
                            long var233 = var189 + 2L;
                            var219 *= var233;
                            var189 += 3L;
                            var219 *= var189;
                            var189 = var219 & 7L;
                            long var239;
                            int var192 = (var239 = var189 - 0L) == 0L ? 0 : (var239 < 0L ? -1 : 1);
                            if (var192 != 0) {
                                break;
                            }

                            try {
                                var176 = var148.get((String)var175);
                            } catch (Throwable var17) {
                                var3 = var17;
                                int var87 = qs;
                                int var88 = var87 ^ -938879653;
                                var173 = var17 instanceof RuntimeException;
                                int var89 = var88 >> 10;
                                int var90 = var89 * -39473563;
                                int var91 = var90 ^ -732638630;
                                int var92 = var91 | -1758476476;
                                var4 = var92 ^ -1624392625;
                                var189 = var4;
                                var219 = var189 + 1L;
                                var219 = var189 * var219;
                                var233 = var189 + 2L;
                                var219 *= var233;
                                var189 += 3L;
                                var219 *= var189;
                                var189 = var219 & 7L;
                                long var240;
                                int var196 = (var240 = var189 - 0L) == 0L ? 0 : (var240 < 0L ? -1 : 1);
                                if (var196 != 0) {
                                    break;
                                }
                                break label171;
                            }
                            var4 = switch (var4) {
                                default -> var4 ^ 445937400;
                                case 194402146 -> {
                                    var4 += -1272247098;
                                    var4 ^= 1396565513;
                                    yield var4 ^ 1958145803;
                                }
                                case 959388395 -> var4 ^ -30618216;
                            };
                            Integer var197 = var4;
                            if (var197 == null) {
                                break;
                            }

                            try {
                                int var203 = var4 | -1390082242;
                                int var204 = var203 >> 3;
                                int var205 = var204 + 161423262;
                                int var206 = var205 + 1156883904;
                                int var207 = var206 ^ 235941494;
                                Yl(var168, (JsonElement)var176, var207);
                                break label158;
                            } catch (Throwable var16) {
                                var3 = var16;
                                int var96 = qs;
                                int var97 = var96 ^ -938879653;
                                var173 = var16 instanceof RuntimeException;
                                int var98 = var97 >> 10;
                                int var99 = var98 * -39473563;
                                int var100 = var99 ^ -732638630;
                                int var101 = var100 | -1758476476;
                                var4 = var101 ^ -1624392625;
                                var189 = var4;
                                var219 = var189 + 1L;
                                var219 = var189 * var219;
                                var233 = var189 + 2L;
                                var219 *= var233;
                                var189 += 3L;
                                var219 *= var189;
                                var189 = var219 & 7L;
                                long var241;
                                int var201 = (var241 = var189 - 0L) == 0L ? 0 : (var241 < 0L ? -1 : 1);
                                if (var201 != 0) {
                                    break;
                                }
                            }
                        }

                        if (!var173) {
                            var4 -= 441644160;
                            var4 ^= 1804238061;
                            int var178 = var4 + 1;
                            var178 = var4 * var178;
                            var178 &= 1;
                            if (var178 == 0) {
                                throw UncheckedExceptions.rethrow(var3);
                            }
                            break;
                        }

                        var4 -= -1875170382;
                        var4 *= -268595149;
                        var4 <<= 6;
                        var4 >>= 13;
                        var4 ^= 1822024085;
                        var5 = (RuntimeException)var3;
                        var4 >>>= 31;
                        var4 &= 247860559;
                        var4 -= -59978129;
                        var4 ^= -1939296223;
                        Logger var177 = w;
                        String var202 = var167.F();
                        var177.error("Config entry for module {} is invalid, using defaults", var202, var5);
                        var4 += 841373732;
                        var4 ^= 1021765829;
                        int var133 = var4 ^ -1579755955;
                        int var134 = var133 ^ 299547501;
                        C(var167, var134);
                        var4 <<= 17;
                        var4 >>>= 3;
                        var4 ^= 1173783167;
                        var4 &= 418119918;
                        var4 ^= -1412840395;
                        break label170;
                    }
                    var4 = switch (var4) {
                        case -1739952854 -> {
                            var4 += 375715988;
                            var4 <<= 26;
                            var4 *= -285851969;
                            yield var4 ^ 683081550;
                        }
                        default -> var4 ^ -1042649433;
                        case 481465832 -> var4 ^ 443257643;
                    };
                    long var169 = var4;
                    long var208 = var169 + 1L;
                    var208 = var169 * var208;
                    long var231 = var169 + 2L;
                    var208 *= var231;
                    long var170 = var169 + 3L;
                    var208 *= var170;
                    long var171 = var208 & 7L;
                    long var242;
                    int var135 = (var242 = var171 - 0L) == 0L ? 0 : (var242 < 0L ? -1 : 1);
                    if (var135 != 0) {
                        break;
                    }

                    var4 &= 1746420423;
                    var4 ^= -853378109;
                    var4 ^= 638172805;
                    var4 >>>= 7;
                    var4 ^= -1560300715;
                }

                var5 = var4;
                if (var5 == null) {
                    break;
                }

                var4 &= 394403467;
                var4 &= -455693236;
                var4 ^= -944720440;
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    private static void Yl(Yn var0, JsonElement var1, int var2) {
        int var4 = System.identityHashCode(var0);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var4 += 3;
        var5 *= var4;
        var4 = var5 & 7;
        if (var4 == 0) {
            int var15 = switch (var2) {
                case -1269081321 -> var2 ^ -758016742;
                default -> var2 ^ 1582158984;
                case 1213308211 -> {
                    int var14 = var2 & -1683157130;
                    yield var14 ^ 921181349;
                }
            };
            long var18 = var15;
            long var30 = var18 + 1L;
            long var31 = var18 * var30;
            long var8 = var18 + 2L;
            long var32 = var31 * var8;
            long var19 = var18 + 3L;
            long var33 = var32 * var19;
            long var20 = var33 & 7L;
            long var34;
            var4 = (var34 = var20 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
            if (var4 == 0) {
                var4 = var15 - 1093556833;
                var4 &= 944041125;
                var4 += 841329015;
                var4 ^= -905093502;
                sc(var0, var1, false, var4);
            } else {
                RuntimeException var22 = new RuntimeException();
                throw var22;
            }
        } else {
            int var3 = var2 & -1915398166;
            var3 *= 659466797;
            var3 |= 1806820643;
            var3 ^= 302899452;
            RuntimeException var13 = new RuntimeException();
            throw var13;
        }
    }

    private static void sc(Yn var0, JsonElement var1, boolean var2, int var3) {
        JsonObject var256 = null;
        JsonObject var258 = null;
        boolean var283 = false;
        label454: {
            int var5 = System.identityHashCode(var0);
            int var6 = var5 + 1;
            var6 = var5 * var6;
            var6 &= 1;
            int var20;
            if (var6 != 0) {
                var20 = var3 & 1256480525;
                var20 ^= -959024222;
                var20 *= 1506868271;
                var20 >>>= 23;
                var20 ^= -823440231;
            } else {
                label456: {
                    var20 = var3 | -1702354142;
                    var20 ^= 1985340487;
                    Integer var253 = var20;
                    if (var253 == null) {
                        break label454;
                    }

                    label457: {
                        if (var1 != null) {
                            var20 &= -653644170;
                            var20 += 1726428157;
                            var20 ^= -1248014792;
                            boolean var254 = var1.isJsonObject();
                            int var7 = var5 + 1;
                            var7 = var5 * var7;
                            int var8 = var5 + 2;
                            var7 *= var8;
                            var8 = var5 + 3;
                            var7 *= var8;
                            var7 &= 7;
                            if (var7 != 0) {
                                var20 |= 157698770;
                                var20 <<= 20;
                                var20 ^= -849231525;
                                var20 ^= -1151341647;
                                var20 ^= 1432708715;
                                break label456;
                            }

                            var20 &= 1015943898;
                            var20 <<= 5;
                            var20 -= -886224908;
                            var20 ^= -252124904;
                            if (var254) {
                                var20 ^= 1429103879;
                                var20 += 944055410;
                                var20 ^= 423260459;
                                JsonObject var255 = var1.getAsJsonObject();
                                Integer var268 = var5;
                                if (var268 == null) {
                                    var20 &= 678042010;
                                    var20 ^= -1864819404;
                                    var20 ^= 1582975295;
                                    break label456;
                                }

                                var20 *= -391645489;
                                var20 >>>= 31;
                                var20 ^= -1328685974;
                                int var269 = var20 + 1;
                                var269 = var20 * var269;
                                var8 = var20 + 2;
                                var269 *= var8;
                                var8 = var20 + 3;
                                var269 *= var8;
                                var269 &= 7;
                                if (var269 != 0) {
                                    break label454;
                                }

                                var256 = var255;
                                var20 >>>= 15;
                                var20 |= 476890653;
                                var20 *= 1854278713;
                                var20 ^= -301822478;
                                var20 ^= 1738881086;
                                break label457;
                            }

                            var20 += 1429106817;
                            var20 *= 1159113853;
                            var20 >>>= 6;
                            var20 *= -1331869273;
                            var20 ^= -1623114795;
                        } else {
                            switch (var20) {
                                case -1591786574:
                                    var20 ^= 1803492658;
                                    break;
                                case -855713924:
                                    var20 -= 247273613;
                                    var20 ^= -306569313;
                                    break;
                                case 1123297497:
                                default:
                                    var20 ^= 1170729819;
                            }
                        }

                        Integer var274 = var20;
                        if (var274 == null) {
                            break label454;
                        }

                        JsonObject var275 = new JsonObject();
                        long var317 = var5;
                        long var10 = var317 + 1L;
                        var10 = var317 * var10;
                        var317 = var10 & 1L;
                        long var517;
                        int var319 = (var517 = var317 - 0L) == 0L ? 0 : (var517 < 0L ? -1 : 1);
                        if (var319 != 0) {
                            var20 >>>= 4;
                            var20 >>= 2;
                            var20 ^= -811294204;
                            break label456;
                        }

                        var20 -= 899311604;
                        var20 ^= 1461227092;
                        Integer var320 = var20;
                        if (var320 == null) {
                            break label454;
                        }

                        var256 = var275;
                        var20 |= 1078062573;
                        var20 |= -765439512;
                        var20 ^= 34231871;
                        var20 ^= 1515854457;
                    }

                    int var276 = var20 + 1;
                    var276 = var20 * var276;
                    int var321 = var20 + 2;
                    var276 *= var321;
                    var321 = var20 + 3;
                    var276 *= var321;
                    var276 &= 7;
                    if (var276 != 0) {
                        break label454;
                    }

                    JsonElement var281 = var256.get("enabled");
                    long var323 = var5;
                    long var433 = var323 + 1L;
                    var433 = var323 * var433;
                    long var12 = var323 + 2L;
                    var433 *= var12;
                    long var324 = var323 + 3L;
                    var433 *= var324;
                    long var325 = var433 & 7L;
                    long var518;
                    var321 = (var518 = var325 - 0L) == 0L ? 0 : (var518 < 0L ? -1 : 1);
                    if (var321 != 0) {
                        var20 += -387050831;
                        var20 &= 1340873756;
                        var20 ^= -2098247523;
                    } else {
                        label509: {
                            var20 *= 1905913569;
                            var20 += -613034123;
                            var20 *= 1467607615;
                            var20 ^= 391555964;
                            var20 ^= 1541202326;
                            Integer var327 = var20;
                            if (var327 == null) {
                                break label454;
                            }

                            label461: {
                                if (var281 != null) {
                                    var20 |= 2041712938;
                                    var20 ^= -1108779263;
                                    int var328 = var20 + 1;
                                    var328 = var20 * var328;
                                    int var9 = var20 + 2;
                                    var328 *= var9;
                                    var9 = var20 + 3;
                                    var328 *= var9;
                                    var328 &= 7;
                                    if (var328 != 0) {
                                        break label454;
                                    }

                                    int var333 = (var281.isJsonPrimitive()) ? 1 : 0;
                                    long var371 = var5;
                                    long var11 = var371 + 1L;
                                    var11 = var371 * var11;
                                    long var372 = var11 & 1L;
                                    long var519;
                                    var9 = (var519 = var372 - 0L) == 0L ? 0 : (var519 < 0L ? -1 : 1);
                                    if (var9 != 0) {
                                        var20 *= 898370619;
                                        var20 ^= 237080529;
                                        var20 ^= 85506786;
                                        var20 ^= -2098056485;
                                        break label509;
                                    }
                                    var20 = switch (var20) {
                                        case 228485584 -> var20 ^ -436557668;
                                        default -> var20 ^ 845514174;
                                        case 1075470507 -> {
                                            var20 += 1002645137;
                                            var20 &= -919732968;
                                            yield var20 ^ 131363534;
                                        }
                                    };
                                    if (var333 != 0) {
                                        var20 >>>= 14;
                                        var20 |= 379720892;
                                        var20 >>>= 3;
                                        var20 &= 1145375491;
                                        var20 ^= 936141020;
                                        JsonPrimitive var334 = var281.getAsJsonPrimitive();
                                        var333 = var334.isBoolean() ? 1 : 0;
                                        long var374 = var5;
                                        var11 = var374 + 1L;
                                        var11 = var374 * var11;
                                        long var375 = var11 & 1L;
                                        long var520;
                                        var9 = (var520 = var375 - 0L) == 0L ? 0 : (var520 < 0L ? -1 : 1);
                                        if (var9 != 0) {
                                            var20 &= -900423899;
                                            var20 *= -1422670115;
                                            var20 ^= -1480895099;
                                            var20 &= 348771421;
                                            var20 ^= -836548395;
                                            break label509;
                                        }

                                        var20 -= 1824483911;
                                        var20 ^= 762095553;
                                        var9 = var20 + 1;
                                        var9 = var20 * var9;
                                        int var437 = var20 + 2;
                                        var9 *= var437;
                                        int var438 = var20 + 3;
                                        var9 *= var438;
                                        var9 &= 7;
                                        if (var9 != 0) {
                                            break label454;
                                        }

                                        if (var333 != 0) {
                                            var20 >>>= 20;
                                            var20 *= 1452669471;
                                            var20 -= 199611026;
                                            var20 <<= 3;
                                            var20 ^= 631581590;
                                            var333 = var20 + 1;
                                            var333 = var20 * var333;
                                            var333 &= 1;
                                            if (var333 != 0) {
                                                break label454;
                                            }

                                            boolean var282 = var281.getAsBoolean();
                                            Integer var339 = var5;
                                            if (var339 == null) {
                                                var20 |= -1326394860;
                                                var20 >>= 24;
                                                var20 ^= -1860507399;
                                                var20 ^= -1609671801;
                                                break label509;
                                            }

                                            var20 *= 913770351;
                                            var20 -= 107123709;
                                            var20 ^= 288216815;
                                            var20 ^= -619682457;
                                            int var340 = var20 + 1;
                                            var340 = var20 * var340;
                                            var9 = var20 + 2;
                                            var340 *= var9;
                                            var9 = var20 + 3;
                                            var340 *= var9;
                                            var340 &= 7;
                                            if (var340 != 0) {
                                                break label454;
                                            }

                                            var283 = var282;
                                            var20 |= -596307542;
                                            var20 *= 1253046933;
                                            var20 |= -1611488701;
                                            var20 |= 606348406;
                                            var20 ^= 354310183;
                                            break label461;
                                        }

                                        var20 |= -25147933;
                                        var20 += 106835494;
                                        var20 ^= -713576823;
                                    } else {
                                        var20 <<= 16;
                                        var20 |= -636021274;
                                        var20 ^= 748827982;
                                    }
                                } else {
                                    switch (var20) {
                                        case -1111277654:
                                            var20 &= -1091358398;
                                            var20 -= 788179562;
                                            var20 ^= 1589487152;
                                            break;
                                        case -526225910:
                                        default:
                                            var20 ^= -62007968;
                                            break;
                                        case -385920563:
                                            var20 ^= -792794472;
                                    }
                                }

                                boolean var345 = var0.Bv();
                                Integer var384 = var5;
                                if (var384 == null) {
                                    var20 |= -214173144;
                                    var20 += -2031801945;
                                    var20 >>= 30;
                                    var20 *= 1753122709;
                                    var20 ^= -1500132588;
                                    break label509;
                                }

                                var20 += -380570710;
                                var20 |= 1625290051;
                                var20 *= 933010513;
                                var20 ^= 104018243;
                                int var385 = var20 + 1;
                                var385 = var20 * var385;
                                var385 &= 1;
                                if (var385 != 0) {
                                    break label454;
                                }

                                var283 = var345;
                                var20 &= -409372660;
                                var20 -= -1017970447;
                                var20 -= 1456031353;
                                var20 ^= 228202190;
                            }

                            var0.xt(var283);
                            long var284 = var5;
                            long var388 = var284 + 1L;
                            var388 = var284 * var388;
                            long var285 = var388 & 1L;
                            long var521;
                            var276 = (var521 = var285 - 0L) == 0L ? 0 : (var521 < 0L ? -1 : 1);
                            label410:
                            if (var276 == 0) {
                                var20 = switch (var20) {
                                    case -1428050344 -> {
                                        var20 ^= 1339192332;
                                        yield var20 ^ 924772042;
                                    }
                                    case 799438907 -> var20 ^ -1614308952;
                                    default -> var20 ^ 1550775262;
                                };
                                var276 = var20 + 1;
                                var276 = var20 * var276;
                                int var346 = var20 + 2;
                                var276 *= var346;
                                var346 = var20 + 3;
                                var276 *= var346;
                                var276 &= 7;
                                if (var276 != 0) {
                                    break label454;
                                }

                                label467: {
                                    int var292 = var256.has("settings") ? 1 : 0;
                                    if (var292 != 0) {
                                        var20 = switch (var20) {
                                            default -> var20 ^ 1609003499;
                                            case -768787298 -> {
                                                var20 *= -653034767;
                                                yield var20 ^ 558104107;
                                            }
                                            case -649382427 -> var20 ^ 1199065971;
                                        };
                                        Integer var293 = var20;
                                        if (var293 == null) {
                                            break label454;
                                        }

                                        JsonElement var294 = var256.get("settings");
                                        var346 = var5 + 1;
                                        var346 = var5 * var346;
                                        var346 &= 1;
                                        if (var346 != 0) {
                                            var20 >>= 7;
                                            var20 ^= 823897540;
                                            break label410;
                                        }

                                        var20 |= 506734251;
                                        var20 ^= -957559120;
                                        Integer var351 = var20;
                                        if (var351 == null) {
                                            break label454;
                                        }

                                        var292 = var294.isJsonObject() ? 1 : 0;
                                        if (var292 != 0) {
                                            var20 *= -490491435;
                                            var20 |= -460470422;
                                            var20 *= -421564599;
                                            var20 ^= 476676624;
                                            long var296 = var20;
                                            var388 = var296 + 1L;
                                            var388 = var296 * var388;
                                            long var297 = var388 & 1L;
                                            long var522;
                                            var292 = (var522 = var297 - 0L) == 0L ? 0 : (var522 < 0L ? -1 : 1);
                                            if (var292 != 0) {
                                                break label454;
                                            }

                                            JsonObject var257 = var256.getAsJsonObject("settings");
                                            long var299 = var5;
                                            var388 = var299 + 1L;
                                            var388 = var299 * var388;
                                            long var300 = var388 & 1L;
                                            long var523;
                                            int var301 = (var523 = var300 - 0L) == 0L ? 0 : (var523 < 0L ? -1 : 1);
                                            if (var301 != 0) {
                                                var20 &= 679301996;
                                                var20 ^= -788231052;
                                                var20 ^= -1580625268;
                                                var20 &= 857750438;
                                                var20 ^= -20228319;
                                                break label410;
                                            }
                                            var20 = switch (var20) {
                                                case -1905826557 -> {
                                                    var20 &= -556383284;
                                                    var20 ^= 199154444;
                                                    var20 &= -202557245;
                                                    var20 *= -548344389;
                                                    yield var20 ^ 643141859;
                                                }
                                                default -> var20 ^ 2011385873;
                                                case 1469288935 -> var20 ^ -2084756415;
                                            };
                                            long var302 = var20;
                                            var388 = var302 + 1L;
                                            var388 = var302 * var388;
                                            long var487 = var302 + 2L;
                                            var388 *= var487;
                                            long var303 = var302 + 3L;
                                            var388 *= var303;
                                            long var304 = var388 & 7L;
                                            long var524;
                                            var301 = (var524 = var304 - 0L) == 0L ? 0 : (var524 < 0L ? -1 : 1);
                                            if (var301 != 0) {
                                                break label454;
                                            }

                                            var258 = var257;
                                            switch (var20) {
                                                case -877962316:
                                                    var20 ^= 352067309;
                                                    break label467;
                                                case 989075683:
                                                    var20 *= -906444953;
                                                    var20 ^= 1244452157;
                                                    break label467;
                                                case 1632025476:
                                                default:
                                                    var20 ^= 946367063;
                                                    break label467;
                                            }
                                        }

                                        var20 ^= -192759001;
                                        var20 *= -1291264267;
                                        var20 ^= 627705222;
                                    } else {
                                        switch (var20) {
                                            case -768787298:
                                                var20 >>>= 5;
                                                var20 ^= 166963498;
                                                break;
                                            case 820566556:
                                            default:
                                                var20 ^= 1807464089;
                                                break;
                                            case 1566271115:
                                                var20 ^= 561540327;
                                        }
                                    }

                                    long var306 = var20;
                                    var388 = var306 + 1L;
                                    var388 = var306 * var388;
                                    long var307 = var388 & 1L;
                                    long var525;
                                    var292 = (var525 = var307 - 0L) == 0L ? 0 : (var525 < 0L ? -1 : 1);
                                    if (var292 != 0) {
                                        break label454;
                                    }

                                    JsonObject var309 = new JsonObject();
                                    long var352 = var5;
                                    var433 = var352 + 1L;
                                    var433 = var352 * var433;
                                    long var353 = var433 & 1L;
                                    long var526;
                                    var346 = (var526 = var353 - 0L) == 0L ? 0 : (var526 < 0L ? -1 : 1);
                                    if (var346 != 0) {
                                        var20 -= -720074839;
                                        var20 &= 283189797;
                                        var20 ^= -559190876;
                                        break label410;
                                    }

                                    var20 <<= 10;
                                    var20 ^= 443309278;
                                    var346 = var20 + 1;
                                    var346 = var20 * var346;
                                    int var400 = var20 + 2;
                                    var346 *= var400;
                                    int var401 = var20 + 3;
                                    var346 *= var401;
                                    var346 &= 7;
                                    if (var346 != 0) {
                                        break label454;
                                    }

                                    var258 = var309;
                                    var20 ^= 1031002052;
                                    var20 += -795764208;
                                    var20 += 891103461;
                                    var20 &= -1136148483;
                                    var20 ^= -675249307;
                                }

                                Integer var310 = var20;
                                if (var310 == null) {
                                    break label454;
                                }

                                JsonObject var259 = var258;
                                List var311 = var0.GS();
                                Iterator var312 = var311.iterator();
                                Integer var360 = var5;
                                if (var360 != null) {
                                    var20 = switch (var20) {
                                        case 410844297 -> var20 ^ -1728576369;
                                        default -> var20 ^ 1528550784;
                                        case 1736684904 -> {
                                            var20 += 275616896;
                                            var20 -= -1005441034;
                                            yield var20 ^ 1837704505;
                                        }
                                    };
                                    long var361 = var20;
                                    var433 = var361 + 1L;
                                    var433 = var361 * var433;
                                    long var362 = var433 & 1L;
                                    long var527;
                                    int var363 = (var527 = var362 - 0L) == 0L ? 0 : (var527 < 0L ? -1 : 1);
                                    if (var363 != 0) {
                                        break label454;
                                    }

                                    Iterator var313 = var312;
                                    var20 += 718021838;
                                    var20 <<= 2;
                                    var20 *= -164754387;
                                    var20 ^= -253372235;

                                    while (true) {
                                        Object var364 = var20;
                                        if (var364 == null) {
                                            break label454;
                                        }

                                        boolean var365 = var313.hasNext();
                                        var388 = var5;
                                        long var488 = var388 + 1L;
                                        var488 = var388 * var488;
                                        long var13 = var388 + 2L;
                                        var488 *= var13;
                                        var388 += 3L;
                                        var488 *= var388;
                                        var388 = var488 & 7L;
                                        long var528;
                                        int var405 = (var528 = var388 - 0L) == 0L ? 0 : (var528 < 0L ? -1 : 1);
                                        if (var405 != 0) {
                                            var20 *= -1052564903;
                                            var20 ^= -1531535112;
                                            break;
                                        }

                                        var20 -= 169445876;
                                        var20 -= 467025009;
                                        var20 <<= 2;
                                        var20 -= 1108252855;
                                        var20 ^= -1397515418;
                                        int var406 = var20 + 1;
                                        int var407 = var20 * var406;
                                        int var443 = var20 + 2;
                                        int var408 = var407 * var443;
                                        int var444 = var20 + 3;
                                        int var409 = var408 * var444;
                                        int var410 = var409 & 7;
                                        if (var410 != 0) {
                                            break label454;
                                        }

                                        if (!var365) {
                                            var20 += -439306309;
                                            var20 ^= -437323026;
                                            Integer var250 = var20;
                                            if (var250 != null) {
                                                return;
                                            }
                                            break label454;
                                        }

                                        var20 -= 164185803;
                                        var20 -= -1801070999;
                                        var20 += -1148922248;
                                        var20 ^= 745418160;
                                        var364 = var313.next();
                                        xB var367 = (xB)var364;
                                        int var411 = var5 + 1;
                                        int var412 = var5 * var411;
                                        int var445 = var5 + 2;
                                        int var413 = var412 * var445;
                                        int var446 = var5 + 3;
                                        int var414 = var413 * var446;
                                        int var415 = var414 & 7;
                                        if (var415 != 0) {
                                            var20 -= 1350571360;
                                            var20 |= 1327557462;
                                            var20 += -1796829247;
                                            var20 >>>= 11;
                                            var20 ^= -823403088;
                                            break;
                                        }

                                        var20 *= -789771279;
                                        var20 ^= 331139295;
                                        if (var2) {
                                            var20 = switch (var20) {
                                                case -682543479 -> var20 ^ -2130153629;
                                                default -> var20 ^ 697936823;
                                                case 1532948796 -> {
                                                    var20 ^= 696232841;
                                                    var20 += 435565396;
                                                    yield var20 ^ 787157765;
                                                }
                                            };
                                            int var416 = var20 + 1;
                                            int var417 = var20 * var416;
                                            int var418 = var417 & 1;
                                            if (var418 != 0) {
                                                break label454;
                                            }

                                            boolean var419 = var367.ji();
                                            int var447 = var5 + 1;
                                            int var448 = var5 * var447;
                                            int var492 = var5 + 2;
                                            int var449 = var448 * var492;
                                            int var493 = var5 + 3;
                                            int var450 = var449 * var493;
                                            int var451 = var450 & 7;
                                            if (var451 != 0) {
                                                var20 >>>= 19;
                                                var20 *= 2095434791;
                                                var20 += 303870401;
                                                var20 ^= -1849832261;
                                                break;
                                            }

                                            var20 |= 1553600222;
                                            var20 *= -278048059;
                                            var20 *= -2051804759;
                                            var20 ^= 1257952199;
                                            var433 = var20;
                                            var12 = var433 + 1L;
                                            var12 = var433 * var12;
                                            var433 = var12 & 1L;
                                            long var529;
                                            int var454 = (var529 = var433 - 0L) == 0L ? 0 : (var529 < 0L ? -1 : 1);
                                            if (var454 != 0) {
                                                break label454;
                                            }

                                            if (!var419) {
                                                var20 ^= -1636733430;
                                                var20 -= 309731165;
                                                var20 *= -2116714447;
                                                var20 -= 857964919;
                                                var20 ^= 606848090;
                                                Integer var420 = var20;
                                                if (var420 == null) {
                                                    break label454;
                                                }

                                                var20 |= 131573545;
                                                var20 &= 947743158;
                                                var20 -= -5061640;
                                                var20 &= -1950371040;
                                                var20 ^= -466209279;
                                                continue;
                                            }

                                            var20 -= -919031365;
                                            var20 |= -1701463064;
                                            var20 &= 273852391;
                                            var20 ^= 231936080;
                                            var20 ^= 934827856;
                                        } else {
                                            var20 -= -760863719;
                                            var20 &= -1511591911;
                                            var20 -= 2003988015;
                                            var20 ^= 592949556;
                                        }

                                        int var421 = var20 + 1;
                                        int var422 = var20 * var421;
                                        int var455 = var20 + 2;
                                        int var423 = var422 * var455;
                                        int var456 = var20 + 3;
                                        int var424 = var423 * var456;
                                        int var425 = var424 & 7;
                                        if (var425 != 0) {
                                            break label454;
                                        }

                                        String var426 = var367.oQ();
                                        JsonElement var427 = var259.get(var426);
                                        int var457 = var5 + 1;
                                        int var458 = var5 * var457;
                                        int var494 = var5 + 2;
                                        int var459 = var458 * var494;
                                        int var495 = var5 + 3;
                                        int var460 = var459 * var495;
                                        int var461 = var460 & 7;
                                        if (var461 != 0) {
                                            var20 *= 2090187153;
                                            var20 ^= -1098394425;
                                            break;
                                        }
                                        var20 = switch (var20) {
                                            default -> var20 ^ 403836085;
                                            case -1495165365 -> var20 ^ -1290896154;
                                            case 712630502 -> {
                                                var20 ^= -1356119671;
                                                yield var20 ^ 1623673162;
                                            }
                                        };
                                        Integer var462 = var20;
                                        if (var462 == null) {
                                            break label454;
                                        }

                                        label474: {
                                            if (var427 != null) {
                                                var20 += -465631537;
                                                var20 ^= 660451444;
                                                int var463 = var20 + 1;
                                                int var464 = var20 * var463;
                                                int var496 = var20 + 2;
                                                int var465 = var464 * var496;
                                                int var497 = var20 + 3;
                                                int var466 = var465 * var497;
                                                int var467 = var466 & 7;
                                                if (var467 != 0) {
                                                    break label454;
                                                }

                                                boolean var468 = var427.isJsonPrimitive();
                                                int var498 = var5 + 1;
                                                int var499 = var5 * var498;
                                                int var500 = var499 & 1;
                                                if (var500 != 0) {
                                                    var20 *= -1809919347;
                                                    var20 &= 1571847905;
                                                    var20 ^= -892649471;
                                                    break;
                                                }
                                                var20 = switch (var20) {
                                                    case -2118327636 -> var20 ^ 1386458050;
                                                    case -292987264 -> {
                                                        var20 |= 633801000;
                                                        var20 ^= 498397672;
                                                        yield var20 ^ -209705278;
                                                    }
                                                    default -> var20 ^ -901659209;
                                                };
                                                var488 = var20;
                                                var13 = var488 + 1L;
                                                var13 = var488 * var13;
                                                long var15 = var488 + 2L;
                                                var13 *= var15;
                                                var488 += 3L;
                                                var13 *= var488;
                                                var488 = var13 & 7L;
                                                long var530;
                                                int var504 = (var530 = var488 - 0L) == 0L ? 0 : (var530 < 0L ? -1 : 1);
                                                if (var504 != 0) {
                                                    break label454;
                                                }

                                                if (var468) {
                                                    var20 -= 1932386375;
                                                    var20 -= 1666187378;
                                                    var20 ^= -1576710321;
                                                    int var469 = var20 + 1;
                                                    int var470 = var20 * var469;
                                                    int var505 = var20 + 2;
                                                    int var471 = var470 * var505;
                                                    int var506 = var20 + 3;
                                                    int var472 = var471 * var506;
                                                    int var473 = var472 & 7;
                                                    if (var473 != 0) {
                                                        break label454;
                                                    }

                                                    JsonPrimitive var428 = var427.getAsJsonPrimitive();
                                                    var433 = var5;
                                                    var12 = var433 + 1L;
                                                    var12 = var433 * var12;
                                                    var433 = var12 & 1L;
                                                    long var531;
                                                    int var476 = (var531 = var433 - 0L) == 0L ? 0 : (var531 < 0L ? -1 : 1);
                                                    if (var476 != 0) {
                                                        var20 ^= 1757268272;
                                                        var20 ^= 791571767;
                                                        break;
                                                    }
                                                    var20 = switch (var20) {
                                                        case -1988564858 -> {
                                                            var20 += 464649699;
                                                            var20 ^= 766601610;
                                                            yield var20 ^ -803010074;
                                                        }
                                                        default -> var20 ^ -1857047800;
                                                        case 806223231 -> var20 ^ 627476579;
                                                    };
                                                    var433 = var20;
                                                    var12 = var433 + 1L;
                                                    var12 = var433 * var12;
                                                    var433 = var12 & 1L;
                                                    long var532;
                                                    int var479 = (var532 = var433 - 0L) == 0L ? 0 : (var532 < 0L ? -1 : 1);
                                                    if (var479 != 0) {
                                                        break label454;
                                                    }

                                                    int var480 = var20 ^ -1428255020;
                                                    int var481 = var480 & -489893088;
                                                    int var482 = var481 * -1574497249;
                                                    int var483 = var482 ^ 1857936173;
                                                    Object var429 = U(var428, var483);
                                                    boolean var430 = var367.YT(var429);
                                                    if (var430) {
                                                        var20 -= -271703060;
                                                        var20 *= -907032891;
                                                        var20 -= -2114294631;
                                                        var20 += -2014355543;
                                                        var20 ^= 1810181956;
                                                        break label474;
                                                    }

                                                    var20 *= -305681693;
                                                    var20 += 1369419207;
                                                    var20 <<= 26;
                                                    var20 ^= 76069795;
                                                } else {
                                                    switch (var20) {
                                                        case -1095747965:
                                                        default:
                                                            var20 ^= 606126953;
                                                            break;
                                                        case 33261698:
                                                            var20 -= 2069802978;
                                                            var20 &= 355466178;
                                                            var20 ^= -459983056;
                                                            var20 ^= 1007768595;
                                                            break;
                                                        case 1428883989:
                                                            var20 ^= 228373600;
                                                    }
                                                }
                                            } else {
                                                var20 &= -1704083550;
                                                var20 *= -1410969543;
                                                var20 ^= 1845810307;
                                            }

                                            Integer var431 = var20;
                                            if (var431 == null) {
                                                break label454;
                                            }

                                            var367.s();
                                            switch (var20) {
                                                case -595018845:
                                                    var20 >>>= 7;
                                                    var20 ^= 718600318;
                                                    break;
                                                case 634873355:
                                                    var20 ^= 1153545883;
                                                    break;
                                                case 1741103377:
                                                default:
                                                    var20 ^= 55056460;
                                            }
                                        }

                                        var364 = var20;
                                        if (var364 == null) {
                                            break label454;
                                        }

                                        switch (var20) {
                                            case -995355101:
                                                var20 ^= -1196284364;
                                                break;
                                            case 728623369:
                                                var20 |= -498139839;
                                                var20 ^= 133917288;
                                                break;
                                            case 1114934580:
                                            default:
                                                var20 ^= -1278634622;
                                        }
                                    }
                                } else {
                                    switch (var20) {
                                        case -521030129:
                                        default:
                                            var20 ^= 570799074;
                                            break;
                                        case 1530351311:
                                            var20 ^= -1246526358;
                                            break;
                                        case 1736684904:
                                            var20 &= 867881002;
                                            var20 ^= -311829335;
                                    }
                                }
                            } else {
                                var20 >>>= 18;
                                var20 &= -241025896;
                                var20 &= 1549978078;
                                var20 ^= -823442407;
                            }
                        }
                    }
                }
            }

            long var244 = var20;
            long var260 = var244 + 1L;
            long var261 = var244 * var260;
            long var369 = var244 + 2L;
            long var262 = var261 * var369;
            long var245 = var244 + 3L;
            long var263 = var262 * var245;
            long var246 = var263 & 7L;
            long var533;
            var20 = (var533 = var246 - 0L) == 0L ? 0 : (var533 < 0L ? -1 : 1);
            if (var20 == 0) {
                IllegalStateException var248 = new IllegalStateException();
                throw var248;
            }
        }

        RuntimeException var249 = new RuntimeException();
        throw var249;
    }

    public JsonObject WA(boolean var1) {
        label341: {
            int var2 = qs;
            var2 ^= 398752939;
            int var3 = System.identityHashCode(this);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            int var5 = of_2.y;
            var2 ^= var5;
            var2 ^= -864320044;
            var5 = of_2.io;
            var2 ^= var5;
            var2 ^= -1225393570;
            if (var4 == 0) {
                var2 >>= 15;
                var2 *= -258944679;
                var2 += 1485885026;
                var2 ^= -551130773;
                long var212 = var2;
                long var6 = var212 + 1L;
                var6 = var212 * var6;
                long var8 = var212 + 2L;
                var6 *= var8;
                long var213 = var212 + 3L;
                var6 *= var213;
                long var214 = var6 & 7L;
                long var378;
                var4 = (var378 = var214 - 0L) == 0L ? 0 : (var378 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label341;
                }

                JsonObject var216 = new JsonObject();
                JsonObject var217 = var216;
                NW var219 = this.h;
                List var220 = var219.dG();
                Iterator var221 = var220.iterator();
                Iterator var222 = var221;
                var2 |= -1923742102;
                var2 ^= 921771318;

                label338:
                while (true) {
                    boolean var230 = var222.hasNext();
                    Integer var7 = var3;
                    if (var7 == null) {
                        var2 ^= 977217826;
                        var2 ^= -1169270323;
                        break;
                    }

                    var2 += 866879544;
                    var2 <<= 11;
                    var2 ^= 1221862793;
                    if (!var230) {
                        var2 = switch (var2) {
                            case -2060145271 -> {
                                var2 ^= -1010600656;
                                var2 ^= -418500291;
                                var2 -= -1036031123;
                                var2 -= -1866964952;
                                yield var2 ^ -1303234453;
                            }
                            default -> var2 ^ 1354941441;
                            case -644130665 -> var2 ^ -847193970;
                        };
                        var5 = var2 + 1;
                        var5 = var2 * var5;
                        var5 &= 1;
                        if (var5 != 0) {
                            break label341;
                        }

                        JsonObject var226 = new JsonObject();
                        Integer var207 = var3;
                        if (var207 != null) {
                            var2 |= -52577378;
                            var2 |= -393530354;
                            var2 ^= -1536436807;
                            var2 ^= 1698377712;
                            var6 = var2;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var379;
                            int var208 = (var379 = var6 - 0L) == 0L ? 0 : (var379 < 0L ? -1 : 1);
                            if (var208 == 0) {
                                Integer var209 = 6;
                                var226.addProperty("schema", var209);
                                var226.add("modules", var217);
                                return var226;
                            }
                            break label341;
                        }

                        var2 ^= -704194771;
                        var2 ^= 269070751;
                        break;
                    }

                    var2 += 1155862151;
                    var2 &= -1548610677;
                    var2 ^= 1832743834;
                    Integer var231 = var2;
                    if (var231 == null) {
                        break label341;
                    }

                    Object var232 = var222.next();
                    int var237 = var3 + 1;
                    var237 = var3 * var237;
                    var237 &= 1;
                    if (var237 != 0) {
                        var2 |= -676996370;
                        var2 *= 1737749773;
                        var2 *= 540477469;
                        var2 >>= 13;
                        var2 ^= 995955208;
                        break;
                    }

                    var2 ^= 2082816520;
                    var2 *= -1737910021;
                    var2 >>= 16;
                    var2 += 1952235919;
                    var2 ^= 1287839827;
                    long var240 = var2;
                    long var9 = var240 + 1L;
                    var9 = var240 * var9;
                    long var241 = var9 & 1L;
                    long var380;
                    var237 = (var380 = var241 - 0L) == 0L ? 0 : (var380 < 0L ? -1 : 1);
                    if (var237 != 0) {
                        break label341;
                    }

                    Yn var233 = (Yn)var232;
                    if (var1) {
                        var2 >>>= 29;
                        var2 *= 1201599717;
                        var2 &= -1310337589;
                        var2 ^= -747815301;
                        var237 = var2 + 1;
                        var237 = var2 * var237;
                        int var261 = var2 + 2;
                        var237 *= var261;
                        int var262 = var2 + 3;
                        var237 *= var262;
                        var237 &= 7;
                        if (var237 != 0) {
                            break label341;
                        }

                        boolean var248 = var233.nS();
                        int var263 = var3 + 1;
                        int var264 = var3 * var263;
                        int var282 = var3 + 2;
                        int var265 = var264 * var282;
                        int var283 = var3 + 3;
                        int var266 = var265 * var283;
                        int var267 = var266 & 7;
                        if (var267 != 0) {
                            switch (var2) {
                                case -2015140000:
                                    var2 ^= -97365614;
                                    break label338;
                                case -756421958:
                                    var2 &= 1192749492;
                                    var2 ^= 2036247430;
                                    break label338;
                                case 1764948792:
                                default:
                                    var2 ^= -1692472506;
                                    break label338;
                            }
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1328508921;
                            case -756421958 -> {
                                var2 ^= -1234794020;
                                var2 ^= -1506291285;
                                yield var2 ^ -1771510645;
                            }
                            case 2031750155 -> var2 ^ -348982437;
                        };
                        if (!var248) {
                            var2 = switch (var2) {
                                default -> var2 ^ -291064382;
                                case 518052040 -> var2 ^ -1635790506;
                                case 1422939718 -> {
                                    var2 *= -1888666291;
                                    var2 += -1160665257;
                                    var2 -= 1301308930;
                                    yield var2 ^ -927074742;
                                }
                            } ^ 1433946106;
                            var2 &= 2088311334;
                            var2 += -766978075;
                            var2 ^= -43591106;
                            continue;
                        }

                        var2 += 1567979472;
                        var2 -= 249072073;
                        var2 += -1864649343;
                        var2 *= -1896642081;
                        var2 ^= -100639610;
                    } else {
                        var2 >>>= 30;
                        var2 |= -1640542813;
                        var2 ^= -1610757801;
                    }

                    long var249 = var2;
                    var9 = var249 + 1L;
                    var9 = var249 * var9;
                    long var250 = var9 & 1L;
                    long var381;
                    var237 = (var381 = var250 - 0L) == 0L ? 0 : (var381 < 0L ? -1 : 1);
                    if (var237 != 0) {
                        break label341;
                    }

                    JsonObject var252 = new JsonObject();
                    JsonObject var253 = var252;
                    List var268 = var233.GS();
                    Integer var286 = var3;
                    if (var286 == null) {
                        var2 ^= -266305221;
                        var2 ^= 272063185;
                        var2 *= 2075851025;
                        var2 ^= -329499192;
                        break;
                    }

                    var2 >>>= 16;
                    var2 ^= -1419293295;
                    Iterator var269 = var268.iterator();
                    Iterator var270 = var269;
                    var2 -= -318138143;
                    var2 ^= 1775844940;
                    var2 ^= -677414225;

                    while (true) {
                        var9 = var2;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        var9 = var11 & 1L;
                        long var382;
                        int var289 = (var382 = var9 - 0L) == 0L ? 0 : (var382 < 0L ? -1 : 1);
                        if (var289 != 0) {
                            break label341;
                        }

                        boolean var290 = var270.hasNext();
                        int var10 = var3 + 1;
                        var10 = var3 * var10;
                        int var338 = var3 + 2;
                        var10 *= var338;
                        int var339 = var3 + 3;
                        var10 *= var339;
                        var10 &= 7;
                        if (var10 != 0) {
                            var2 &= 456913595;
                            var2 -= -1593215620;
                            var2 += -294001532;
                            var2 ^= 1993548439;
                            break label338;
                        }

                        var2 += -1363226150;
                        var2 >>>= 16;
                        var2 ^= 2040173852;
                        Integer var317 = var2;
                        if (var317 == null) {
                            break label341;
                        }

                        if (!var290) {
                            var2 |= 1141872806;
                            var2 <<= 2;
                            var2 ^= 55450874;
                            Integer var271 = var2;
                            if (var271 == null) {
                                break label341;
                            }

                            int var272 = var253.size();
                            Integer var298 = var3;
                            if (var298 != null) {
                                var2 ^= -383304187;
                                var2 <<= 24;
                                var2 *= -1272771893;
                                var2 ^= 841644766;
                                var2 ^= 47215428;
                                var9 = var2;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                long var376 = var9 + 2L;
                                var11 *= var376;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var383;
                                int var302 = (var383 = var9 - 0L) == 0L ? 0 : (var383 < 0L ? -1 : 1);
                                if (var302 != 0) {
                                    break label341;
                                }

                                if (var272 == 0) {
                                    var2 |= -875405360;
                                    var2 &= -810408281;
                                    var2 &= 1727351915;
                                    var2 *= 65858541;
                                    var2 ^= 861399944;
                                    boolean var273 = var233.B();
                                    boolean var303 = var233.Bv();
                                    int var329 = var3 + 1;
                                    var329 = var3 * var329;
                                    int var362 = var3 + 2;
                                    var329 *= var362;
                                    int var363 = var3 + 3;
                                    var329 *= var363;
                                    var329 &= 7;
                                    if (var329 != 0) {
                                        switch (var2) {
                                            case -1892786094:
                                                var2 &= 374354967;
                                                var2 ^= 1029661476;
                                                break label338;
                                            case -558986521:
                                                var2 ^= -2110729450;
                                                break label338;
                                            case 1273843134:
                                            default:
                                                var2 ^= -238861710;
                                                break label338;
                                        }
                                    }

                                    var2 |= -837649526;
                                    var2 <<= 1;
                                    var2 ^= -2143887062;
                                    var329 = var2 + 1;
                                    var329 = var2 * var329;
                                    var329 &= 1;
                                    if (var329 != 0) {
                                        break label341;
                                    }

                                    if (var273 == var303) {
                                        var2 = switch (var2) {
                                            case 87508425 -> var2 ^ 1355125947;
                                            default -> var2 ^ -1100404108;
                                            case 508171934 -> {
                                                var2 |= -259956282;
                                                yield var2 ^ 1069154832;
                                            }
                                        };
                                        Integer var274 = var2;
                                        if (var274 == null) {
                                            break label341;
                                        }

                                        var2 -= 1325469035;
                                        var2 *= -203925551;
                                        var2 ^= 687463971;
                                        var2 ^= 1041313833;
                                        break;
                                    }

                                    var2 &= -970538036;
                                    var2 += -1947407375;
                                    var2 += 471658535;
                                    var2 ^= 668050067;
                                } else {
                                    var2 ^= 735698685;
                                    var2 <<= 15;
                                    var2 += -1020290426;
                                    var2 ^= 658073265;
                                }

                                int var275 = var2 + 1;
                                int var276 = var2 * var275;
                                int var277 = var276 & 1;
                                if (var277 != 0) {
                                    break label341;
                                }

                                JsonObject var278 = new JsonObject();
                                boolean var304 = var233.B();
                                Boolean var305 = var304;
                                var278.addProperty("enabled", var305);
                                int var306 = var3 + 1;
                                int var307 = var3 * var306;
                                int var308 = var307 & 1;
                                if (var308 != 0) {
                                    var2 &= -1731249273;
                                    var2 *= -478244577;
                                    var2 >>>= 14;
                                    var2 &= 1339782201;
                                    var2 ^= 995902238;
                                    break label338;
                                }

                                var2 -= 1681365642;
                                var2 += 367087594;
                                var2 += 1645683217;
                                var2 &= -1367851338;
                                var2 ^= -799151326;
                                int var309 = var253.size();
                                if (var309 > 0) {
                                    var2 &= 1597956583;
                                    var2 |= 1360257806;
                                    var2 ^= -1379843181;
                                    int var310 = var2 + 1;
                                    int var311 = var2 * var310;
                                    int var312 = var311 & 1;
                                    if (var312 != 0) {
                                        break label341;
                                    }

                                    var278.add("settings", var253);
                                    switch (var2) {
                                        case -1736356774:
                                        default:
                                            var2 ^= 2119643089;
                                            break;
                                        case -666405459:
                                            var2 ^= 1077345203;
                                            break;
                                        case -254369763:
                                            var2 -= 2111797014;
                                            var2 &= 885402823;
                                            var2 *= 1680568079;
                                            var2 ^= -61193710;
                                    }
                                } else {
                                    var2 &= 997579816;
                                    var2 <<= 23;
                                    var2 ^= -1065475205;
                                }

                                var237 = var2 + 1;
                                var237 = var2 * var237;
                                var237 &= 1;
                                if (var237 != 0) {
                                    break label341;
                                }

                                String var234 = var233.F();
                                var237 = var3 + 1;
                                var237 = var3 * var237;
                                var237 &= 1;
                                if (var237 != 0) {
                                    var2 &= 1977254171;
                                    var2 -= -1464630679;
                                    var2 ^= -1392951932;
                                    break label338;
                                }
                                var2 = switch (var2) {
                                    case -1673181451 -> var2 ^ -390946099;
                                    case -1065475205 -> {
                                        var2 += -1039128203;
                                        var2 >>>= 7;
                                        var2 *= -676987327;
                                        yield var2 ^ -756111239;
                                    }
                                    default -> var2 ^ 1226113488;
                                };
                                Integer var260 = var2;
                                if (var260 == null) {
                                    break label341;
                                }

                                var217.add(var234, var278);
                                switch (var2) {
                                    case -1868056416:
                                        var2 *= 909373657;
                                        var2 |= 1198203568;
                                        var2 *= 1950191131;
                                        var2 ^= 221520969;
                                        continue label338;
                                    case -818249640:
                                        var2 ^= -1344467840;
                                        continue label338;
                                    case -75720361:
                                    default:
                                        var2 ^= -1955853632;
                                        continue label338;
                                }
                            }

                            var2 += -1322080855;
                            var2 ^= -1656956355;
                            break label338;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ -280843561;
                            case 1941147420 -> var2 ^ 717031242;
                            case 2040150982 -> {
                                var2 -= -1374849147;
                                var2 ^= 880344414;
                                yield var2 ^ 1698499176;
                            }
                        };
                        int var291 = var2 + 1;
                        int var292 = var2 * var291;
                        int var293 = var292 & 1;
                        if (var293 != 0) {
                            break label341;
                        }

                        Object var294 = var270.next();
                        int var318 = var3 + 1;
                        var318 = var3 * var318;
                        var318 &= 1;
                        if (var318 != 0) {
                            switch (var2) {
                                case -1809702425:
                                default:
                                    var2 ^= 529138147;
                                    break label338;
                                case -1698090121:
                                    var2 |= -1670949368;
                                    var2 ^= -1515178935;
                                    break label338;
                                case 165876714:
                                    var2 ^= -1254798820;
                                    break label338;
                            }
                        }

                        var2 >>>= 8;
                        var2 += 737961056;
                        var2 &= 1974944415;
                        var2 |= 99666324;
                        var2 ^= -669487563;
                        xB var295 = (xB)var294;
                        if (var1) {
                            var2 = switch (var2) {
                                case -34625630 -> {
                                    var2 |= -575139112;
                                    var2 += -2021717056;
                                    var2 -= 1917897477;
                                    var2 |= 1253750594;
                                    yield var2 ^ 391426989;
                                }
                                case 264788222 -> var2 ^ -1083112126;
                                default -> var2 ^ 144395544;
                            };
                            boolean var321 = var295.ji();
                            var11 = var3;
                            long var13 = var11 + 1L;
                            var13 = var11 * var13;
                            var11 = var13 & 1L;
                            long var384;
                            int var342 = (var384 = var11 - 0L) == 0L ? 0 : (var384 < 0L ? -1 : 1);
                            if (var342 != 0) {
                                switch (var2) {
                                    case -359338487:
                                        var2 ^= 1580467157;
                                        break label338;
                                    case 1290488922:
                                        var2 |= -458126389;
                                        var2 &= -367465283;
                                        var2 |= 1908549051;
                                        var2 |= -730073469;
                                        var2 ^= -962282355;
                                        break label338;
                                    case 2112684983:
                                    default:
                                        var2 ^= -1625246669;
                                        break label338;
                                }
                            }
                            var2 = switch (var2) {
                                case 627343004 -> var2 ^ 375078368;
                                case 1290488922 -> {
                                    var2 -= -412192346;
                                    var2 += 371619148;
                                    yield var2 ^ -836255447;
                                }
                                default -> var2 ^ 1655247909;
                            };
                            Integer var343 = var2;
                            if (var343 == null) {
                                break label341;
                            }

                            if (!var321) {
                                var2 |= 431413926;
                                var2 >>>= 13;
                                var2 += -1131189822;
                                var2 ^= -1132289823;
                                continue;
                            }

                            var2 ^= -2136445281;
                            var2 += -214798701;
                            var2 *= 1335668857;
                            var2 ^= 741254174;
                        } else {
                            var2 &= 1010289422;
                            var2 ^= 2086696861;
                        }

                        long var322 = var2;
                        long var12 = var322 + 1L;
                        var12 = var322 * var12;
                        long var323 = var12 & 1L;
                        long var385;
                        var318 = (var385 = var323 - 0L) == 0L ? 0 : (var385 < 0L ? -1 : 1);
                        if (var318 != 0) {
                            break label341;
                        }

                        boolean var325 = var295.Mm();
                        var11 = var3;
                        long var366 = var11 + 1L;
                        var366 = var11 * var366;
                        long var15 = var11 + 2L;
                        var366 *= var15;
                        var11 += 3L;
                        var366 *= var11;
                        var11 = var366 & 7L;
                        long var386;
                        int var347 = (var386 = var11 - 0L) == 0L ? 0 : (var386 < 0L ? -1 : 1);
                        if (var347 != 0) {
                            var2 |= -151649433;
                            var2 ^= -844581687;
                            break label338;
                        }

                        var2 &= 1665825614;
                        var2 &= 212184938;
                        var2 *= 1380592921;
                        var2 ^= -218347961;
                        var11 = var2;
                        var366 = var11 + 1L;
                        var366 = var11 * var366;
                        var11 = var366 & 1L;
                        long var387;
                        int var350 = (var387 = var11 - 0L) == 0L ? 0 : (var387 < 0L ? -1 : 1);
                        if (var350 != 0) {
                            break label341;
                        }

                        if (var325) {
                            var2 *= 1144953163;
                            var2 *= 1364312593;
                            var2 *= -1240828087;
                            var2 ^= 1264234561;
                            Integer var326 = var2;
                            if (var326 == null) {
                                break label341;
                            }

                            switch (var2) {
                                case -1696080954:
                                    var2 -= 149640815;
                                    var2 <<= 12;
                                    var2 += 481963103;
                                    var2 &= -726925054;
                                    var2 ^= -1005062245;
                                    break;
                                case 1272963727:
                                    var2 ^= -788220384;
                                    break;
                                case 1381762856:
                                default:
                                    var2 ^= -1283335809;
                            }
                        } else {
                            var2 = switch (var2) {
                                case -1904958275 -> {
                                    var2 += 783350497;
                                    var2 -= 538876709;
                                    yield var2 ^ 1771569094;
                                }
                                case -849131487 -> var2 ^ 1412350763;
                                default -> var2 ^ -1350640061;
                            };
                            Integer var327 = var2;
                            if (var327 == null) {
                                break label341;
                            }

                            String var328 = var295.oQ();
                            Object var296 = var295.yW();
                            int var351 = var2 | -1013331002;
                            int var352 = var351 & 1082856118;
                            int var353 = var352 ^ -1089846532;
                            JsonElement var297 = x(var296, var353);
                            var11 = var3;
                            var366 = var11 + 1L;
                            var366 = var11 * var366;
                            var15 = var11 + 2L;
                            var366 *= var15;
                            var11 += 3L;
                            var366 *= var11;
                            var11 = var366 & 7L;
                            long var388;
                            int var357 = (var388 = var11 - 0L) == 0L ? 0 : (var388 < 0L ? -1 : 1);
                            if (var357 != 0) {
                                var2 ^= -2000314606;
                                var2 ^= 1191847835;
                                break label338;
                            }

                            var2 |= 1373709110;
                            var2 |= -253292011;
                            var2 ^= -989086628;
                            var2 ^= -217507730;
                            var2 ^= -1663603478;
                            var253.add(var328, var297);
                            var2 |= -1275162155;
                            var2 ^= -155019044;
                            var2 ^= 153607346;
                        }
                    }
                }
            } else {
                var2 ^= -361693166;
                var2 &= -265570572;
                var2 >>>= 6;
                var2 ^= 945775406;
            }

            Integer var204 = var2;
            if (var204 != null) {
                IllegalArgumentException var206 = new IllegalArgumentException();
                throw var206;
            }
        }

        UnsupportedOperationException var205 = new UnsupportedOperationException();
        throw var205;
    }

    public synchronized List Vx(com.google.gson.JsonObject json, boolean apply) {
    com.google.gson.JsonObject copy = json.deepCopy();
    FS.Dk(copy);
    Un_2.O(copy);
    dt_2.p(copy);
    List list = new java.util.ArrayList();
    for (var entry : copy.entrySet()) {
        String name = entry.getKey();
        com.google.gson.JsonElement elem = entry.getValue();
        Yn module = (Yn)this.h.p(name).orElse(null);
        if (module != null) {
            try {
                Yl(module, elem, 0);
                list.add(name);
            } catch (Exception e) {
                this.G(e, 0);
            }
        }
    }
    return list;
}


    public static String n(JsonObject var0) {
        int var1 = qs;
        var1 ^= -567559845;
        int var2 = System.identityHashCode(var0);
        Gson var3 = f;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var26;
        var2 = (var26 = var4 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 += 882587743;
            var1 *= -1908651245;
            var1 -= -1495462333;
            var1 ^= -1244092335;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            }
        } else {
            var1 |= -759757280;
            var1 ^= 1347263252;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                return var3.toJson(var0);
            }
        }

        AssertionError var16 = new AssertionError();
        throw var16;
    }

    private static String w(Yn var0, int var1) {
        label112: {
            int var3 = System.identityHashCode(var0);
            int var4 = var3 + 1;
            var4 = var3 * var4;
            int var5 = var3 + 2;
            var4 *= var5;
            var5 = var3 + 3;
            var4 *= var5;
            var4 &= 7;
            int var17;
            if (var4 == 0) {
                var17 = var1 | -308119224;
                var17 |= 1908476371;
                var17 |= 181140026;
                var17 ^= 482135318;
                Integer var75 = var17;
                if (var75 == null) {
                    break label112;
                }

                StringBuilder var76;
                boolean var83 = var0.B();
                String var87;
                if (var83) {
                    var17 -= -1498711941;
                    var17 &= -1764370138;
                    var17 <<= 13;
                    var17 ^= 1120605051;
                    long var84 = var17;
                    long var7 = var84 + 1L;
                    var7 = var84 * var7;
                    long var85 = var7 & 1L;
                    long var148;
                    int var83_op = (var148 = var85 - 0L) == 0L ? 0 : (var148 < 0L ? -1 : 1);
                    if (var83_op != 0) {
                        break label112;
                    }

                    var87 = "+";
                    var17 -= -1477536873;
                    var17 |= 334821495;
                    var17 += -278095813;
                    var17 >>= 25;
                    var17 ^= -1975180525;
                } else {
                    var17 *= 606421569;
                    var17 ^= 829338861;
                    var87 = "-";
                    var17 *= 178002439;
                    var17 ^= 524605802;
                }

                long var6 = var17;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var149;
                int var101 = (var149 = var6 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                if (var101 != 0) {
                    break label112;
                }

                var76 = new StringBuilder(var87);
                StringBuilder var77 = var76;
                int var83_op2 = var3 + 1;
                var83_op2 = var3 * var83_op2;
                var83_op2 &= 1;
                if (var83_op2 == 0) {
                    var17 = switch (var17) {
                        case -1975180490 -> {
                            var17 >>>= 27;
                            var17 ^= -271177411;
                            yield var17 ^ 1150879828;
                        }
                        case 921736188 -> var17 ^ 1900700249;
                        default -> var17 ^ 5748533;
                    };
                    long var91 = var17;
                    long var116 = var91 + 1L;
                    var116 = var91 * var116;
                    long var9 = var91 + 2L;
                    var116 *= var9;
                    long var92 = var91 + 3L;
                    var116 *= var92;
                    long var93 = var116 & 7L;
                    long var150;
                    int var83_op3 = (var150 = var93 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                    if (var83_op3 != 0) {
                        break label112;
                    }

                    List var95 = var0.GS();
                    Iterator var96 = var95.iterator();
                    Iterator var97 = var96;
                    var17 += -1835674533;
                    var17 ^= 1722455751;
                    var17 ^= -1591933224;
                    var17 ^= 1739822649;

                    while (true) {
                        int var102 = var17 + 1;
                        int var103 = var17 * var102;
                        int var120 = var17 + 2;
                        int var104 = var103 * var120;
                        int var121 = var17 + 3;
                        int var105 = var104 * var121;
                        int var106 = var105 & 7;
                        if (var106 != 0) {
                            break label112;
                        }

                        boolean var107 = var97.hasNext();
                        int var122 = var3 + 1;
                        int var123 = var3 * var122;
                        int var124 = var123 & 1;
                        if (var124 != 0) {
                            var17 += 910801426;
                            var17 *= -1001024661;
                            var17 ^= -1627145149;
                            break;
                        }
                        var17 = switch (var17) {
                            case -1646201867 -> {
                                var17 -= -231613902;
                                yield var17 ^ -1848308600;
                            }
                            default -> var17 ^ 428510896;
                            case 1508845680 -> var17 ^ 417888744;
                        };
                        int var125 = var17 + 1;
                        int var126 = var17 * var125;
                        int var134 = var17 + 2;
                        int var127 = var126 * var134;
                        int var135 = var17 + 3;
                        int var128 = var127 * var135;
                        int var129 = var128 & 7;
                        if (var129 != 0) {
                            break label112;
                        }

                        if (!var107) {
                            var17 = switch (var17) {
                                default -> var17 ^ -1886882580;
                                case -585992551 -> var17 ^ -1308671019;
                                case 981079371 -> {
                                    var17 *= 374552737;
                                    yield var17 ^ 1561944363;
                                }
                            };
                            var3 = var17 + 1;
                            var3 = var17 * var3;
                            int var83Factor = var17 + 2;
                            var3 *= var83Factor;
                            var83Factor = var17 + 3;
                            var3 *= var83Factor;
                            var3 &= 7;
                            if (var3 == 0) {
                                return var77.toString();
                            }
                            break label112;
                        }

                        var17 ^= 853615450;
                        var17 ^= 490745768;
                        Integer var108 = var17;
                        if (var108 == null) {
                            break label112;
                        }

                        Object var109 = var97.next();
                        xB var110 = (xB)var109;
                        String var130 = var110.oQ();
                        var8 = var3;
                        long var10 = var8 + 1L;
                        var10 = var8 * var10;
                        long var12 = var8 + 2L;
                        var10 *= var12;
                        var8 += 3L;
                        var10 *= var8;
                        var8 = var10 & 7L;
                        long var151;
                        int var139 = (var151 = var8 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                        if (var139 != 0) {
                            var17 |= 1643083914;
                            var17 &= 886755902;
                            var17 &= 192905294;
                            var17 -= 1138014734;
                            var17 ^= 2006005842;
                            break;
                        }

                        var17 -= -1665663365;
                        var17 -= 951829506;
                        var17 |= -1510058238;
                        var17 ^= -1498675931;
                        var8 = var17;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var152;
                        int var142 = (var152 = var8 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                        if (var142 != 0) {
                            break label112;
                        }

                        StringBuilder var131 = var77.append(var130);
                        StringBuilder var132 = var131.append('=');
                        Object var111 = var110.yW();
                        StringBuilder var112 = var132.append(var111);
                        StringBuilder var113 = var112.append(';');
                        var17 |= 717067612;
                        var17 ^= -165731158;
                    }
                } else {
                    var17 |= -830853393;
                    var17 &= -249746568;
                    var17 ^= 185161430;
                }
            } else {
                var17 = var1 ^ -765091424;
                var17 >>>= 20;
                var17 |= 1432585515;
                var17 -= -1509327655;
                var17 ^= 1682863992;
            }

            long var60 = var17;
            long var78 = var60 + 1L;
            long var79 = var60 * var78;
            long var114 = var60 + 2L;
            long var80 = var79 * var114;
            long var61 = var60 + 3L;
            long var81 = var80 * var61;
            long var62 = var81 & 7L;
            long var153;
            var17 = (var153 = var62 - 0L) == 0L ? 0 : (var153 < 0L ? -1 : 1);
            if (var17 == 0) {
                IllegalStateException var64 = new IllegalStateException();
                throw var64;
            }
        }

        RuntimeException var65 = new RuntimeException();
        throw var65;
    }

    public synchronized void Ll() {
    if (!Files.exists(this.QC)) {
        this.q();
        return;
    }
    try {
        String str = Files.readString(this.QC);
        com.google.gson.JsonObject json = com.google.gson.JsonParser.parseString(str).getAsJsonObject();
        this.Vx(json, true);
    } catch (Exception e) {
        this.G(e, 0);
    }
}


    private void G(Exception var1, int var2) {
        boolean var144 = false;
        CopyOption[] var201 = null;
        Object var231 = null;
        Logger var5 = null;
        Path var6 = this.QC;
        Path var7 = this.QC;
        var7 = var7.getFileName();
        String var164 = String.valueOf(var7);
        long var8 = System.currentTimeMillis();
        String var165 = var164 + ".broken-" + var8;
        var6 = var6.resolveSibling(var165);
        Path var143 = var6;
        int var4 = var2 | -902691670;
        var4 ^= 216069356;
        var4 *= -321659605;
        var4 ^= 864676791;
        Logger var166 = w;
        Object[] var197 = new Object[3];
        Path var9 = this.QC;
        var197[0] = var9;
        var197[1] = var6;
        var197[2] = var1;
        var166.error("Config {} is unreadable, moving it to {} and using defaults", var197);
        var4 <<= 13;
        var4 -= 868536338;
        var4 ^= 370358424;
        var4 ^= -1172366819;

        label149: {
            label153: {
                label154: {
                    Throwable var3;
                    label161: {
                        try {
                            var4 += 860895146;
                            var4 ^= 1294698171;
                        } catch (Throwable var21) {
                            var3 = var21;
                            int var43 = qs;
                            int var44 = var43 ^ -1009695045;
                            var144 = var21 instanceof IOException;
                            int var45 = var44 | 466798939;
                            var4 = var45 ^ -487406961;
                            long var167 = var4;
                            long var208 = var167 + 1L;
                            long var209 = var167 * var208;
                            long var11 = var167 + 2L;
                            long var210 = var209 * var11;
                            long var168 = var167 + 3L;
                            long var211 = var210 * var168;
                            long var169 = var211 & 7L;
                            long var260;
                            int var170 = (var260 = var169 - 0L) == 0L ? 0 : (var260 < 0L ? -1 : 1);
                            if (var170 != 0) {
                                break label149;
                            }
                            break label161;
                        }

                        long var171 = var4;
                        long var212 = var171 + 1L;
                        long var213 = var171 * var212;
                        long var172 = var213 & 1L;
                        long var261;
                        int var173 = (var261 = var172 - 0L) == 0L ? 0 : (var261 < 0L ? -1 : 1);
                        if (var173 != 0) {
                            break label149;
                        }

                        try {
                            var7 = this.QC;
                            var4 -= 635889611;
                            var4 ^= -2095204880;
                        } catch (Throwable var20) {
                            var3 = var20;
                            int var49 = qs;
                            int var50 = var49 ^ -1009695045;
                            var144 = var20 instanceof IOException;
                            int var51 = var50 | 466798939;
                            var4 = var51 ^ -487406961;
                            long var174 = var4;
                            long var214 = var174 + 1L;
                            long var215 = var174 * var214;
                            long var252 = var174 + 2L;
                            long var216 = var215 * var252;
                            long var175 = var174 + 3L;
                            long var217 = var216 * var175;
                            long var176 = var217 & 7L;
                            long var262;
                            int var177 = (var262 = var176 - 0L) == 0L ? 0 : (var262 < 0L ? -1 : 1);
                            if (var177 != 0) {
                                break label149;
                            }
                            break label161;
                        }

                        int var198 = var4 + 1;
                        int var199 = var4 * var198;
                        int var200 = var199 & 1;
                        if (var200 != 0) {
                            break label149;
                        }

                        try {
                            var201 = new CopyOption[1];
                            var4 >>= 10;
                            var4 ^= -2044432878;
                            var4 ^= 1336188045;
                            var4 *= -359675273;
                            var4 ^= -486698462;
                        } catch (Throwable var19) {
                            var3 = var19;
                            int var54 = qs;
                            int var55 = var54 ^ -1009695045;
                            var144 = var19 instanceof IOException;
                            int var56 = var55 | 466798939;
                            var4 = var56 ^ -487406961;
                            long var179 = var4;
                            long var218 = var179 + 1L;
                            long var219 = var179 * var218;
                            long var253 = var179 + 2L;
                            long var220 = var219 * var253;
                            long var180 = var179 + 3L;
                            long var221 = var220 * var180;
                            long var181 = var221 & 7L;
                            long var263;
                            int var182 = (var263 = var181 - 0L) == 0L ? 0 : (var263 < 0L ? -1 : 1);
                            if (var182 != 0) {
                                break label149;
                            }
                            break label161;
                        }

                        int var222 = var4 + 1;
                        int var223 = var4 * var222;
                        int var10 = var4 + 2;
                        int var224 = var223 * var10;
                        var10 = var4 + 3;
                        int var225 = var224 * var10;
                        int var226 = var225 & 7;
                        if (var226 != 0) {
                            break label149;
                        }

                        try {
                            var231 = StandardCopyOption.REPLACE_EXISTING;
                        } catch (Throwable var18) {
                            var3 = var18;
                            int var62 = qs;
                            int var63 = var62 ^ -1009695045;
                            var144 = var18 instanceof IOException;
                            int var64 = var63 | 466798939;
                            var4 = var64 ^ -487406961;
                            long var183 = var4;
                            long var227 = var183 + 1L;
                            long var228 = var183 * var227;
                            long var254 = var183 + 2L;
                            long var229 = var228 * var254;
                            long var184 = var183 + 3L;
                            long var230 = var229 * var184;
                            long var185 = var230 & 7L;
                            long var264;
                            int var186 = (var264 = var185 - 0L) == 0L ? 0 : (var264 < 0L ? -1 : 1);
                            if (var186 != 0) {
                                break label149;
                            }
                            break label161;
                        }
                        var4 = switch (var4) {
                            case -1804838692 -> var4 ^ -369203923;
                            default -> var4 ^ -88393783;
                            case 1452466990 -> {
                                var4 += 516252273;
                                var4 *= -1228738029;
                                yield var4 ^ -813805512;
                            }
                        };
                        long var246 = var4;
                        long var12 = var246 + 1L;
                        var12 = var246 * var12;
                        long var14 = var246 + 2L;
                        var12 *= var14;
                        long var247 = var246 + 3L;
                        var12 *= var247;
                        long var248 = var12 & 7L;
                        long var265;
                        var10 = (var265 = var248 - 0L) == 0L ? 0 : (var265 < 0L ? -1 : 1);
                        if (var10 != 0) {
                            break label149;
                        }

                        try {
                            var201[0] = (java.nio.file.CopyOption)var231;
                            var4 -= 148928531;
                            var4 -= 1235409322;
                            var4 ^= 930382727;
                        } catch (Throwable var17) {
                            var3 = var17;
                            int var68 = qs;
                            int var69 = var68 ^ -1009695045;
                            var144 = var17 instanceof IOException;
                            int var70 = var69 | 466798939;
                            var4 = var70 ^ -487406961;
                            long var187 = var4;
                            long var232 = var187 + 1L;
                            long var233 = var187 * var232;
                            long var255 = var187 + 2L;
                            long var234 = var233 * var255;
                            long var188 = var187 + 3L;
                            long var235 = var234 * var188;
                            long var189 = var235 & 7L;
                            long var266;
                            int var190 = (var266 = var189 - 0L) == 0L ? 0 : (var266 < 0L ? -1 : 1);
                            if (var190 != 0) {
                                break label149;
                            }
                            break label161;
                        }

                        int var236 = var4 + 1;
                        int var237 = var4 * var236;
                        var10 = var4 + 2;
                        int var238 = var237 * var10;
                        var10 = var4 + 3;
                        int var239 = var238 * var10;
                        int var240 = var239 & 7;
                        if (var240 != 0) {
                            break label149;
                        }

                        try {
                            var6 = Files.move(var7, var143, var201);
                            var4 &= -592193150;
                            var4 -= 642679320;
                            var4 |= 1283521478;
                            var4 &= -1848033624;
                            var4 ^= -41735106;
                            break label154;
                        } catch (Throwable var16) {
                            var3 = var16;
                            int var74 = qs;
                            int var75 = var74 ^ -1009695045;
                            var144 = var16 instanceof IOException;
                            int var76 = var75 | 466798939;
                            var4 = var76 ^ -487406961;
                            long var191 = var4;
                            long var241 = var191 + 1L;
                            long var242 = var191 * var241;
                            long var256 = var191 + 2L;
                            long var243 = var242 * var256;
                            long var192 = var191 + 3L;
                            long var244 = var243 * var192;
                            long var193 = var244 & 7L;
                            long var267;
                            int var194 = (var267 = var193 - 0L) == 0L ? 0 : (var267 < 0L ? -1 : 1);
                            if (var194 != 0) {
                                break label149;
                            }
                        }
                    }

                    if (!var144) {
                        var4 *= 241459565;
                        var4 ^= -484569837;
                        var4 <<= 26;
                        var4 ^= -2143498929;
                        int var153 = var4 + 1;
                        int var154 = var4 * var153;
                        int var195 = var4 + 2;
                        int var155 = var154 * var195;
                        int var196 = var4 + 3;
                        int var156 = var155 * var196;
                        int var157 = var156 & 7;
                        if (var157 == 0) {
                            throw UncheckedExceptions.rethrow(var3);
                        }
                        break label149;
                    }

                    var4 <<= 25;
                    var4 <<= 28;
                    var4 += 255678322;
                    var4 &= -1134905289;
                    var4 ^= 43609172;
                    long var145 = var4;
                    var8 = var145 + 1L;
                    var8 = var145 * var8;
                    long var146 = var8 & 1L;
                    long var268;
                    int var147 = (var268 = var146 - 0L) == 0L ? 0 : (var268 < 0L ? -1 : 1);
                    if (var147 != 0) {
                        break label149;
                    }

                    IOException var5Exception = (IOException)var3;
                    var4 &= 511621563;
                    var4 &= 1812983877;
                    var4 ^= -881580349;
                    var4 ^= -23944638;
                    var4 ^= -1350023198;
                    long var148 = var4;
                    var8 = var148 + 1L;
                    var8 = var148 * var8;
                    long var149 = var8 & 1L;
                    long var269;
                    int var22 = (var269 = var149 - 0L) == 0L ? 0 : (var269 < 0L ? -1 : 1);
                    if (var22 != 0) {
                        break label149;
                    }

                    var5 = w;
                    var4 *= 905617893;
                    var4 ^= 2138920044;
                    var4 &= -1685559484;
                    var4 *= 425098819;
                    var4 ^= 358709487;
                    long var150 = var4;
                    var8 = var150 + 1L;
                    var8 = var150 * var8;
                    long var151 = var8 & 1L;
                    long var270;
                    int var152 = (var270 = var151 - 0L) == 0L ? 0 : (var270 < 0L ? -1 : 1);
                    if (var152 != 0) {
                        break label149;
                    }

                    var5.error("Could not move broken config aside", var5Exception);
                    var4 &= 949597938;
                    var4 *= 1283095;
                    var4 |= -101629132;
                    var4 ^= 428772693;
                    var4 ^= 597144683;
                    break label153;
                }

                int var24 = var4 + 1;
                var24 = var4 * var24;
                var24 &= 1;
                if (var24 != 0) {
                    break label149;
                }

                var4 &= 1296404355;
                var4 &= 507594963;
                var4 += -2067667673;
                var4 ^= 1457665961;
            }

            int var27 = var4 + 1;
            var27 = var4 * var27;
            var27 &= 1;
            if (var27 == 0) {
                NW var30 = this.h;
                List var31 = var30.dG();
                var4 *= -872024203;
                var4 &= -298389040;
                var4 ^= 284756261;
                Integer var137 = var4;
                if (var137 != null) {
                    Iterator var32 = var31.iterator();
                    Iterator var33 = var32;

                    var4 = switch (var4) {
                        case -2135168260 -> var4 ^ 470209336;
                        default -> var4 ^ -582630141;
                        case 1592654117 -> {
                            var4 *= -1720304521;
                            var4 |= 1929270481;
                            var4 |= -1244759399;
                            yield var4 ^ -151415713;
                        }
                    };

                    while (true) {
                        Integer var138 = var4;
                        if (var138 == null) {
                            break;
                        }

                        boolean var139 = var33.hasNext();
                        var4 *= 1219355397;
                        var4 ^= -453755276;
                        Integer var159 = var4;
                        if (var159 == null) {
                            break;
                        }

                        if (!var139) {
                            var4 |= -298502045;
                            var4 += -156625504;
                            var4 *= -723792335;
                            var4 -= 2013859177;
                            var4 ^= -225041684;
                            Integer var34 = var4;
                            if (var34 != null) {
                                return;
                            }
                            break;
                        }

                        var4 -= -1496608002;
                        var4 &= 1031720046;
                        var4 += -1195239810;
                        var4 -= -474468501;
                        var4 ^= 37264860;
                        var5 = (Logger)var33.next();
                        var4 -= 1334792149;
                        var4 -= 392678262;
                        var4 += -2081452709;
                        var4 ^= 187081396;
                        Yn var141 = (Yn)var5;
                        int var160 = var4 | -648176422;
                        int var161 = var160 * -703055963;
                        int var162 = var161 ^ -353312919;
                        C(var141, var162);
                        var4 >>= 13;
                        var4 &= 818052826;
                        var4 &= 653780340;
                        var4 ^= 151431860;
                    }
                }
            }
        }

        IllegalStateException var35 = new IllegalStateException();
        throw var35;
    }

    private static void C(Yn var0, int var1) {
        List var136 = null;
        Iterator var138 = null;
        Object var168 = null;
        xB var172 = null;
        xB var176 = null;
        label167: {
            int var72;
            label185: {
                Throwable var2;
                int var5;
                label186: {
                    try {
                        Object var4 = null;
                        var72 = var1 ^ -1000935712;
                        var72 -= 842234689;
                        var72 -= -946873788;
                        var72 ^= -2089839242;
                        var72 ^= 1444681838;
                        var5 = var0.Bv() ? 1 : 0;
                        var72 += -1312602580;
                        var72 ^= 832806206;
                        var0.xt(var5 != 0);
                        var72 -= 1779365761;
                        var72 += -1747912613;
                        var72 -= 106459806;
                        var72 ^= -1707338694;
                    } catch (Throwable var21) {
                        var2 = var21;
                        int var3 = qs;
                        int var30 = var3 ^ 547835033;
                        var5 = (var21 instanceof RuntimeException) ? 1 : 0;
                        int var31 = var30 >>> 25;
                        var72 = var31 ^ 663996335;
                        long var6 = var72;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var212;
                        int var143 = (var212 = var6 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                        if (var143 != 0) {
                            break label167;
                        }
                        break label186;
                    }

                    var5 = var72 + 1;
                    var5 = var72 * var5;
                    int var144 = var72 + 2;
                    var5 *= var144;
                    var144 = var72 + 3;
                    var5 *= var144;
                    var5 &= 7;
                    if (var5 != 0) {
                        break label167;
                    }

                    try {
                        var136 = var0.GS();
                    } catch (Throwable var20) {
                        var2 = var20;
                        int var44 = qs;
                        int var45 = var44 ^ 547835033;
                        var5 = (var20 instanceof RuntimeException) ? 1 : 0;
                        int var46 = var45 >>> 25;
                        var72 = var46 ^ 663996335;
                        long var146 = var72;
                        long var191 = var146 + 1L;
                        var191 = var146 * var191;
                        long var147 = var191 & 1L;
                        long var213;
                        var144 = (var213 = var147 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var144 != 0) {
                            break label167;
                        }
                        break label186;
                    }
                    var72 = switch (var72) {
                        case 1414416909 -> var72 ^ 1351463126;
                        default -> var72 ^ 405081580;
                        case 1946422721 -> {
                            var72 ^= -1083637430;
                            var72 |= -793397439;
                            var72 *= -701033237;
                            yield var72 ^ 1570316856;
                        }
                    };
                    Integer var149 = var72;
                    if (var149 == null) {
                        break label167;
                    }

                    try {
                        Iterator var137 = var136.iterator();
                        var72 += -1571763714;
                        var72 <<= 24;
                        var72 ^= 249923410;
                        var138 = var137;
                        var72 += 1560040275;
                        var72 &= -635750823;
                        var72 *= 996621735;
                        var72 >>>= 11;
                        var72 ^= 953357681;
                    } catch (Throwable var19) {
                        var2 = var19;
                        int var51 = qs;
                        int var52 = var51 ^ 547835033;
                        var5 = (var19 instanceof RuntimeException) ? 1 : 0;
                        int var53 = var52 >>> 25;
                        var72 = var53 ^ 663996335;
                        long var150 = var72;
                        long var193 = var150 + 1L;
                        var193 = var150 * var193;
                        long var151 = var193 & 1L;
                        long var214;
                        int var152 = (var214 = var151 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                        if (var152 != 0) {
                            break label167;
                        }
                        break label186;
                    }

                    while (true) {
                        var72 = switch (var72) {
                            case -2006287760 -> var72 ^ -43152300;
                            default -> var72 ^ -306748434;
                            case 952842510 -> {
                                var72 >>= 20;
                                var72 -= -1157564744;
                                var72 &= 1866136585;
                                var72 &= -1346163841;
                                yield var72 ^ -660752172;
                            }
                        };
                        var149 = var72;
                        if (var149 == null) {
                            break label167;
                        }

                        try {
                            boolean var157 = var138.hasNext();
                            var72 <<= 10;
                            var72 |= 1816107056;
                            var72 ^= 1368765043;
                            if (!var157) {
                                break label185;
                            }
                        } catch (Throwable var18) {
                            var2 = var18;
                            int var67 = qs;
                            int var68 = var67 ^ 547835033;
                            var5 = (var18 instanceof RuntimeException) ? 1 : 0;
                            int var69 = var68 >>> 25;
                            var72 = var69 ^ 663996335;
                            long var154 = var72;
                            long var195 = var154 + 1L;
                            var195 = var154 * var195;
                            long var155 = var195 & 1L;
                            long var215;
                            int var156 = (var215 = var155 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                            if (var156 != 0) {
                                break label167;
                            }
                            break;
                        }

                        var72 <<= 8;
                        var72 ^= 1115915784;
                        var149 = var72;
                        if (var149 == null) {
                            break label167;
                        }

                        try {
                            var72 -= 558766583;
                            var72 ^= 341634151;
                            var72 ^= 1360439873;
                        } catch (Throwable var17) {
                            var2 = var17;
                            int var75 = qs;
                            int var76 = var75 ^ 547835033;
                            var5 = (var17 instanceof RuntimeException) ? 1 : 0;
                            int var77 = var76 >>> 25;
                            var72 = var77 ^ 663996335;
                            long var159 = var72;
                            long var197 = var159 + 1L;
                            var197 = var159 * var197;
                            long var160 = var197 & 1L;
                            long var216;
                            int var161 = (var216 = var160 - 0L) == 0L ? 0 : (var216 < 0L ? -1 : 1);
                            if (var161 != 0) {
                                break label167;
                            }
                            break;
                        }

                        int var162 = var72 + 1;
                        var162 = var72 * var162;
                        var162 &= 1;
                        if (var162 != 0) {
                            break label167;
                        }

                        try {
                            var168 = var138.next();
                            var72 *= 458448091;
                            var72 |= -874579955;
                            var72 |= 1751212568;
                            var72 *= -425645441;
                            var72 ^= 1599345770;
                        } catch (Throwable var16) {
                            var2 = var16;
                            int var81 = qs;
                            int var82 = var81 ^ 547835033;
                            var5 = (var16 instanceof RuntimeException) ? 1 : 0;
                            int var83 = var82 >>> 25;
                            var72 = var83 ^ 663996335;
                            long var165 = var72;
                            long var199 = var165 + 1L;
                            var199 = var165 * var199;
                            long var166 = var199 & 1L;
                            long var217;
                            var162 = (var217 = var166 - 0L) == 0L ? 0 : (var217 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                break label167;
                            }
                            break;
                        }

                        Integer var7 = var72;
                        if (var7 == null) {
                            break label167;
                        }

                        try {
                            var172 = (xB)var168;
                        } catch (Throwable var15) {
                            var2 = var15;
                            int var89 = qs;
                            int var90 = var89 ^ 547835033;
                            var5 = (var15 instanceof RuntimeException) ? 1 : 0;
                            int var91 = var90 >>> 25;
                            var72 = var91 ^ 663996335;
                            long var169 = var72;
                            long var201 = var169 + 1L;
                            var201 = var169 * var201;
                            long var170 = var201 & 1L;
                            long var218;
                            var162 = (var218 = var170 - 0L) == 0L ? 0 : (var218 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                break label167;
                            }
                            break;
                        }
                        var72 = switch (var72) {
                            case 35045897 -> {
                                var72 += 169770535;
                                yield var72 ^ 1900990535;
                            }
                            default -> var72 ^ 1867294930;
                            case 1657319119 -> var72 ^ 772645145;
                        };
                        long var183 = var72;
                        long var9 = var183 + 1L;
                        var9 = var183 * var9;
                        long var11 = var183 + 2L;
                        var9 *= var11;
                        long var184 = var183 + 3L;
                        var9 *= var184;
                        long var185 = var9 & 7L;
                        long var219;
                        int var186 = (var219 = var185 - 0L) == 0L ? 0 : (var219 < 0L ? -1 : 1);
                        if (var186 != 0) {
                            break label167;
                        }

                        try {
                            var176 = var172;
                        } catch (Throwable var14) {
                            var2 = var14;
                            int var94 = qs;
                            int var95 = var94 ^ 547835033;
                            var5 = (var14 instanceof RuntimeException) ? 1 : 0;
                            int var96 = var95 >>> 25;
                            var72 = var96 ^ 663996335;
                            long var173 = var72;
                            long var203 = var173 + 1L;
                            var203 = var173 * var203;
                            long var174 = var203 & 1L;
                            long var220;
                            var162 = (var220 = var174 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                break label167;
                            }
                            break;
                        }
                        var72 = switch (var72) {
                            case 95403338 -> var72 ^ 1235947511;
                            default -> var72 ^ 820841115;
                            case 2105249911 -> {
                                var72 >>= 3;
                                var72 *= 2138991245;
                                var72 -= -873046344;
                                yield var72 ^ 660572081;
                            }
                        };
                        Integer var187 = var72;
                        if (var187 == null) {
                            break label167;
                        }

                        try {
                            var176.s();
                            var72 += 270369580;
                            var72 ^= -25229963;
                        } catch (Throwable var13) {
                            var2 = var13;
                            int var101 = qs;
                            int var102 = var101 ^ 547835033;
                            var5 = (var13 instanceof RuntimeException) ? 1 : 0;
                            int var103 = var102 >>> 25;
                            var72 = var103 ^ 663996335;
                            long var177 = var72;
                            long var205 = var177 + 1L;
                            var205 = var177 * var205;
                            long var178 = var205 & 1L;
                            long var221;
                            var162 = (var221 = var178 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                            if (var162 != 0) {
                                break label167;
                            }
                            break;
                        }
                    }
                }

                if (var5 == 0) {
                    var72 >>>= 10;
                    var72 ^= -94309476;
                    throw UncheckedExceptions.rethrow(var2);
                }
                var72 = switch (var72) {
                    default -> var72 ^ 1964665582;
                    case 663996321 -> {
                        var72 |= 1919173377;
                        var72 &= 1070219867;
                        var72 &= 919290659;
                        yield var72 ^ -2839303;
                    }
                    case 1512918589 -> var72 ^ -675281901;
                };
                RuntimeException var126 = (RuntimeException)var2;
                var72 += -1529754999;
                var72 ^= -573395656;
                long var139 = var72;
                long var188 = var139 + 1L;
                var188 = var139 * var188;
                long var140 = var188 & 1L;
                long var222;
                int var22 = (var222 = var140 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                if (var22 == 0) {
                    Logger var127 = w;
                    String var141 = var0.F();

                    var72 = switch (var72) {
                        case -1338370887 -> {
                            var72 <<= 28;
                            yield var72 ^ -1311981674;
                        }
                        case -264422630 -> var72 ^ -712417760;
                        default -> var72 ^ 333119625;
                    };
                    long var180 = var72;
                    long var207 = var180 + 1L;
                    var207 = var180 * var207;
                    var180 = var207 & 1L;
                    long var223;
                    int var182 = (var223 = var180 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                    if (var182 == 0) {
                        var127.error("Could not reset module {}", var141, var126);
                        var72 -= -1516973410;
                        var72 &= 139275189;
                        var72 <<= 5;
                        var72 ^= -1782112646;
                        return;
                    }
                }
                break label167;
            }

            var72 *= -1218689249;
            var72 >>= 28;
            var72 ^= -1268071495;
            var72 ^= 885448624;
            int var24 = var72 + 1;
            var24 = var72 * var24;
            int var128 = var72 + 2;
            var24 *= var128;
            var128 = var72 + 3;
            var24 *= var128;
            var24 &= 7;
            if (var24 == 0) {
                var72 -= -1137383437;
                var72 |= -757116011;
                var72 ^= 1134395367;
                return;
            }
        }

        RuntimeException var29 = new RuntimeException();
        throw var29;
    }

    private static Object U(JsonPrimitive var0, int var1) {
        int var3 = System.identityHashCode(var0);
        int var4 = ((var0.isBoolean())) ? 1 : 0;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        int var6 = var3 + 2;
        var5 *= var6;
        var6 = var3 + 3;
        var5 *= var6;
        var5 &= 7;
        label64:
        if (var5 == 0) {
            int var14 = var1 * 2015182103;
            var14 *= -2032403145;
            var14 -= 1258937016;
            var14 -= -345382595;
            var14 ^= -1825311461;
            long var84 = var14;
            long var7 = var84 + 1L;
            var7 = var84 * var7;
            long var9 = var84 + 2L;
            var7 *= var9;
            long var85 = var84 + 3L;
            var7 *= var85;
            long var86 = var7 & 7L;
            long var113;
            var5 = (var113 = var86 - 0L) == 0L ? 0 : (var113 < 0L ? -1 : 1);
            if (var5 == 0) {
                if (var4 != 0) {
                    var14 &= 1132781357;
                    var14 &= 305144622;
                    var14 += -802392786;
                    var14 *= 507757505;
                    var14 ^= -461050935;
                    var4 = var0.getAsBoolean() ? 1 : 0;
                    long var92 = var3;
                    var7 = var92 + 1L;
                    var7 = var92 * var7;
                    var9 = var92 + 2L;
                    var7 *= var9;
                    long var93 = var92 + 3L;
                    var7 *= var93;
                    long var94 = var7 & 7L;
                    long var114;
                    var5 = (var114 = var94 - 0L) == 0L ? 0 : (var114 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var14 ^= -164056447;
                        var14 += 447177895;
                        var14 |= -1865178484;
                        var14 |= -1233083907;
                        var14 ^= -932345401;
                        return var4;
                    }

                    switch (var14) {
                        case -1462269215:
                        default:
                            var14 ^= 272214109;
                            break label64;
                        case -917196793:
                            var14 &= 1101051432;
                            var14 += 1913948481;
                            var14 ^= -702392928;
                            break label64;
                        case 47014950:
                            var14 ^= 433102797;
                            break label64;
                    }
                }

                var14 |= 623712949;
                var14 &= -476418724;
                var14 += 1566276709;
                var14 |= 2012562155;
                var14 ^= 1734638538;
                Integer var73 = var14;
                if (var73 != null) {
                    var4 = var0.isNumber() ? 1 : 0;
                    Integer var88 = var3;
                    if (var88 == null) {
                        var14 &= 999112525;
                        var14 += -1034467466;
                        var14 >>= 16;
                        var14 -= -477806001;
                        var14 ^= 2035151976;
                        break label64;
                    }

                    var14 <<= 12;
                    var14 *= 942435045;
                    var14 &= -986709735;
                    var14 >>>= 23;
                    var14 ^= 929435144;
                    long var89 = var14;
                    var7 = var89 + 1L;
                    var7 = var89 * var7;
                    long var90 = var7 & 1L;
                    long var115;
                    int var91 = (var115 = var90 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                    if (var91 == 0) {
                        if (var4 == 0) {
                            var14 += -1228195871;
                            var14 -= 1987222722;
                            var14 ^= 452758010;
                            var14 *= 2023194191;
                            var14 ^= -1917481711;
                            return var0.getAsString();
                        }

                        var14 ^= -1026072746;
                        var14 ^= -1998865553;
                        long var75 = var14;
                        long var97 = var75 + 1L;
                        long var98 = var75 * var97;
                        long var76 = var98 & 1L;
                        long var116;
                        var4 = (var116 = var76 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                        if (var4 == 0) {
                            double var78 = var0.getAsDouble();
                            var6 = var3 + 1;
                            var6 = var3 * var6;
                            var3 = var6 & 1;
                            if (var3 != 0) {
                                var14 -= -90134973;
                                var14 *= 49787431;
                                var14 &= 67521248;
                                var14 -= 1540121828;
                                var14 ^= -1056927971;
                                break label64;
                            }

                            var14 += -1213523605;
                            var14 ^= 1607548772;
                            var14 >>= 8;
                            var14 ^= 342006537;
                            var3 = var14 + 1;
                            var3 = var14 * var3;
                            var6 = var14 + 2;
                            var3 *= var6;
                            var6 = var14 + 3;
                            var3 *= var6;
                            var3 &= 7;
                            if (var3 == 0) {
                                return var78;
                            }
                        }
                    }
                }
            }

            IllegalArgumentException var72 = new IllegalArgumentException();
            throw var72;
        } else {
            int var2 = var1 & -1363299169;
            var2 -= 1853680203;
            var2 ^= -25600830;
            var2 ^= -2125818399;
        }

        IllegalArgumentException var60 = new IllegalArgumentException();
        throw var60;
    }

    private static JsonElement x(Object var0, int var1) {
        label96: {
            int var32;
            JsonPrimitive var83;
            label95: {
                int var3 = System.identityHashCode(var0);
                Object var4 = Objects.requireNonNull(var0);
                byte var5 = 0;
                int var6 = var3 + 1;
                var6 = var3 * var6;
                int var7 = var3 + 2;
                var6 *= var7;
                var7 = var3 + 3;
                var6 *= var7;
                var6 &= 7;
                if (var6 != 0) {
                    var32 = var1 << 11;
                    var32 -= -1880042706;
                    var32 >>= 17;
                    var32 ^= -594361806;
                } else {
                    var32 = switch (var1) {
                        case -2136911208 -> var1 ^ 734369412;
                        case -8171446 -> {
                            var32 = var1 - 1785348997;
                            var32 += -1481336079;
                            var32 |= -1958427959;
                            yield var32 ^ -526791598;
                        }
                        default -> var1 ^ -400705453;
                    };
                    Integer var88 = var32;
                    if (var88 == null) {
                        break label96;
                    }

                    int var81 = ((var0 instanceof Boolean) ? 0 : (var0 instanceof Number) ? 1 : (var0 instanceof String) ? 2 : -1);
                    switch (var81) {
                        case 0:
                            var32 *= 976658425;
                            var32 += 344617421;
                            var32 -= -219283629;
                            var32 |= 686414309;
                            var32 ^= 1323669067;
                            long var102 = var32;
                            long var8 = var102 + 1L;
                            var8 = var102 * var8;
                            long var10 = var102 + 2L;
                            var8 *= var10;
                            long var103 = var102 + 3L;
                            var8 *= var103;
                            long var104 = var8 & 7L;
                            long var115;
                            int var105 = (var115 = var104 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                            if (var105 != 0) {
                                break label96;
                            }

                            var4 = (Boolean)var0;
                            Integer var62 = var3;
                            if (var62 != null) {
                                var32 += 1248801264;
                                var32 -= 2122219801;
                                var32 -= -1140266178;
                                var32 |= -648185188;
                                var32 ^= 1684646657;
                                int var69 = var32 + 1;
                                var69 = var32 * var69;
                                var105 = var32 + 2;
                                var69 *= var105;
                                var105 = var32 + 3;
                                var69 *= var105;
                                var69 &= 7;
                                if (var69 != 0) {
                                    break label96;
                                }

                                JsonPrimitive var74 = new JsonPrimitive((Boolean)var4);
                                var83 = var74;
                                var32 <<= 3;
                                var32 ^= 161554064;
                                break label95;
                            }

                            var32 |= -1431607232;
                            var32 &= 768916689;
                            var32 ^= 267987882;
                            break;
                        case 1:
                            var32 |= -1433282222;
                            var32 ^= 1726439867;
                            var88 = var32;
                            if (var88 == null) {
                                break label96;
                            }

                            Number var99 = (Number)var0;
                            JsonPrimitive var111 = new JsonPrimitive(var99);
                            var88 = var3;
                            if (var88 != null) {
                                var32 = switch (var32) {
                                    case -1724736956 -> {
                                        var32 &= -770118551;
                                        var32 ^= -260336584;
                                        var32 ^= -1904704606;
                                        yield var32 ^ 1876979536;
                                    }
                                    default -> var32 ^ -1126673358;
                                    case 1419432390 -> var32 ^ 79297700;
                                };
                                var88 = var32;
                                if (var88 == null) {
                                    break label96;
                                }

                                var83 = var111;
                                var32 &= 1051179299;
                                var32 ^= -1062991758;
                                break label95;
                            }

                            var32 <<= 18;
                            var32 += 980315030;
                            var32 |= 1936471806;
                            var32 |= 370433062;
                            var32 ^= -736921468;
                            break;
                        case 2:
                            var32 *= -2134353109;
                            var32 ^= 767812470;
                            String var82 = (String)var0;
                            int var89 = var3 + 1;
                            var89 = var3 * var89;
                            var89 &= 1;
                            if (var89 == 0) {
                                var32 *= -784926021;
                                var32 ^= -546144164;
                                var89 = var32 + 1;
                                var89 = var32 * var89;
                                var7 = var32 + 2;
                                var89 *= var7;
                                var7 = var32 + 3;
                                var89 *= var7;
                                var89 &= 7;
                                if (var89 != 0) {
                                    break label96;
                                }

                                JsonPrimitive var97 = new JsonPrimitive(var82);
                                var83 = var97;
                                switch (var32) {
                                    case 6592753:
                                        var32 ^= 1947711932;
                                        break label95;
                                    case 532333306:
                                    default:
                                        var32 ^= 640997903;
                                        break label95;
                                    case 578253887:
                                        var32 ^= 2075153905;
                                        var32 *= 927081981;
                                        var32 |= -1617661142;
                                        var32 ^= 1071171534;
                                        break label95;
                                }
                            }

                            var32 += 1093242920;
                            var32 ^= -1034501669;
                            break;
                        default:
                            var32 = switch (var32) {
                                case -1726303246 -> var32 ^ 656059915;
                                case 1599351725 -> {
                                    var32 += 1865203307;
                                    var32 -= -1076379110;
                                    yield var32 ^ 72920414;
                                }
                                default -> var32 ^ 899450867;
                            };
                            var3 = var32 + 1;
                            var3 = var32 * var3;
                            var32 = var3 & 1;
                            if (var32 == 0) {
                                String var60 = String.valueOf(var0);
                                String var61 = "Unsupported setting encoding: " + var60;
                                IllegalStateException var23 = new IllegalStateException(var61);
                                throw var23;
                            }
                            break label96;
                    }
                }

                var3 = var32 + 1;
                var3 = var32 * var3;
                int var79 = var32 + 2;
                var3 *= var79;
                int var80 = var32 + 3;
                var3 *= var80;
                var3 &= 7;
                if (var3 == 0) {
                    RuntimeException var68 = new RuntimeException();
                    throw var68;
                }
                break label96;
            }

            int var75 = var32 + 1;
            var75 = var32 * var75;
            var75 &= 1;
            if (var75 == 0) {
                return var83;
            }
        }

        IllegalArgumentException var57 = new IllegalArgumentException();
        throw var57;
    }

    public String z() {
        label129: {
            int var1 = qs;
            var1 ^= -1611655777;
            int var2 = System.identityHashCode(this);
            StringBuilder var3 = new StringBuilder();
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var171;
            int var91 = (var171 = var4 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
            if (var91 != 0) {
                var1 ^= -1908813901;
                var1 ^= -766474270;
            } else {
                var1 *= 2113922239;
                var1 &= 1258204903;
                var1 ^= 1345764625;
                var3 = var3;
                NW var92 = this.h;
                List var93 = var92.dG();
                Iterator var94 = var93.iterator();
                Iterator var95 = var94;
                var1 ^= -946278517;
                var1 ^= 1519650291;

                label120:
                while (true) {
                    boolean var5 = var95.hasNext();
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var172;
                    int var108 = (var172 = var6 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
                    if (var108 != 0) {
                        switch (var1) {
                            case -1848321867:
                            default:
                                var1 ^= 1194708108;
                                break label120;
                            case -819528405:
                                var1 -= 924805734;
                                var1 ^= -1899152828;
                                var1 ^= -1638412286;
                                var1 ^= 1983471612;
                                break label120;
                            case 1584664000:
                                var1 ^= 774753421;
                                break label120;
                        }
                    }

                    var1 &= -1948808892;
                    var1 >>= 7;
                    var1 *= -1214209911;
                    var1 ^= -1837471914;
                    Integer var109 = var1;
                    if (var109 == null) {
                        break label129;
                    }

                    if (!var5) {
                        var1 -= 2135823520;
                        var1 -= -1077495234;
                        var1 ^= 1132747812;
                        Integer var82 = var1;
                        if (var82 != null) {
                            return var3.toString();
                        }
                        break label129;
                    }

                    var1 -= -243944597;
                    var1 ^= 725068886;
                    Integer var96 = var1;
                    if (var96 == null) {
                        break label129;
                    }

                    Object var97 = var95.next();
                    Yn var98 = (Yn)var97;
                    String var110 = var98.F();
                    StringBuilder var111 = var3.append(var110);
                    int var7 = (var98.B()) ? 1 : 0;
                    int var143 = var2 + 1;
                    int var144 = var2 * var143;
                    int var9 = var2 + 2;
                    int var145 = var144 * var9;
                    var9 = var2 + 3;
                    int var146 = var145 * var9;
                    int var147 = var146 & 7;
                    if (var147 != 0) {
                        var1 += -1804315080;
                        var1 ^= 1791706728;
                        break;
                    }

                    var1 += -9804024;
                    var1 += -1009953263;
                    var1 ^= -1634588124;
                    String var131;
                    if (var7 != 0) {
                        var1 <<= 10;
                        var1 ^= -656885734;
                        var131 = "+";
                        var1 -= 1557806708;
                        var1 += -168909308;
                        var1 ^= -738601204;
                    } else {
                        var1 ^= 591044359;
                        var1 >>>= 14;
                        var1 ^= -124873854;
                        Integer var148 = var1;
                        if (var148 == null) {
                            break label129;
                        }

                        var131 = "-";
                        var1 -= -818392422;
                        var1 ^= -419873583;
                        var1 *= 1012108547;
                        var1 ^= 1358821926;
                    }

                    var8 = var1;
                    long var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var173;
                    int var151 = (var173 = var8 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                    if (var151 != 0) {
                        break label129;
                    }

                    StringBuilder var112 = var111.append(var131);
                    List var99 = var98.GS();
                    var6 = var2;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var174;
                    int var116 = (var174 = var6 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                    if (var116 != 0) {
                        var1 &= -255814956;
                        var1 *= -1615777417;
                        var1 ^= -1101769181;
                        break;
                    }

                    var1 |= -1189307483;
                    var1 &= 1232879402;
                    var1 |= -1867678697;
                    var1 -= -1611981224;
                    var1 ^= 2051504122;
                    int var117 = var1 + 1;
                    int var118 = var1 * var117;
                    var7 = var1 + 2;
                    int var119 = var118 * var7;
                    var7 = var1 + 3;
                    int var120 = var119 * var7;
                    int var121 = var120 & 7;
                    if (var121 != 0) {
                        break label129;
                    }

                    Iterator var100 = var99.iterator();
                    Iterator var101 = var100;
                    var1 &= 569391197;
                    var1 ^= 1172777903;
                    var1 *= -1776385631;
                    var1 ^= -1005232248;

                    while (true) {
                        var6 = var1;
                        var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var10 = var6 + 2L;
                        var8 *= var10;
                        var6 += 3L;
                        var8 *= var6;
                        var6 = var8 & 7L;
                        long var175;
                        int var125 = (var175 = var6 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                        if (var125 != 0) {
                            break label129;
                        }

                        boolean var126 = var101.hasNext();
                        long var134 = var2;
                        long var166 = var134 + 1L;
                        long var167 = var134 * var166;
                        long var135 = var167 & 1L;
                        long var176;
                        var7 = (var176 = var135 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                        if (var7 != 0) {
                            var1 >>>= 1;
                            var1 ^= -13492402;
                            break label120;
                        }

                        var1 -= 2056351723;
                        var1 -= 844094484;
                        var1 ^= 885703153;
                        Integer var137 = var1;
                        if (var137 == null) {
                            break label129;
                        }

                        if (!var126) {
                            var1 *= 1627047003;
                            var1 ^= -913624945;
                            StringBuilder var102 = var3.append('\n');
                            var1 ^= 1623623332;
                            var1 ^= 250554854;
                            break;
                        }
                        var1 = switch (var1) {
                            default -> var1 ^ -317705571;
                            case 1652680082 -> {
                                var1 >>= 19;
                                var1 |= -1117618141;
                                yield var1 ^ -510490551;
                            }
                            case 1703946796 -> var1 ^ -1509599454;
                        };
                        Object var127 = var101.next();
                        xB var128 = (xB)var127;
                        StringBuilder var138 = var3.append(' ');
                        String var160 = var128.oQ();
                        StringBuilder var139 = var138.append(var160);
                        StringBuilder var140 = var139.append('=');
                        Integer var161 = var2;
                        if (var161 == null) {
                            var1 >>= 14;
                            var1 &= -843637322;
                            var1 -= 1426559774;
                            var1 |= -87471081;
                            var1 ^= 73226504;
                            break label120;
                        }

                        var1 -= 735025395;
                        var1 *= 1181459331;
                        var1 *= -300727081;
                        var1 ^= 1973582722;
                        int var162 = var1 + 1;
                        int var163 = var1 * var162;
                        int var164 = var163 & 1;
                        if (var164 != 0) {
                            break label129;
                        }

                        Object var129 = var128.yW();
                        StringBuilder var130 = var140.append(var129);
                        var1 *= 199983697;
                        var1 ^= -1050159122;
                        var1 ^= 1664079037;
                    }
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            int var88 = var1 + 2;
            var2 *= var88;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 == 0) {
                AssertionError var81 = new AssertionError();
                throw var81;
            }
        }

        RuntimeException var80 = new RuntimeException();
        throw var80;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -751632651;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        qs = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/config");
        w = var5;
        GsonBuilder var6 = new GsonBuilder();
        GsonBuilder var7 = var6.setPrettyPrinting();
        GsonBuilder var8 = var7.disableHtmlEscaping();
        Gson var9 = var8.create();
        Ov = var9;
        GsonBuilder var10 = new GsonBuilder();
        GsonBuilder var11 = var10.disableHtmlEscaping();
        Gson var12 = var11.create();
        f = var12;
    }

    private static Throwable su(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
