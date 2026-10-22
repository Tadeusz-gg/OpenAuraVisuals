package dev.aurap.hub;

import com.google.gson.JsonObject;
import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;

public final class Ke {
    public static final int E = 7168;
    public static final int U = 65536;
    public static final int zi;

    private Ke() {
    }

    public static byte[] y(JsonObject var0) throws ms {
        int var172 = 0;
        java.io.ByteArrayOutputStream var173 = null;
        byte[] var175 = null;
        ByteArrayOutputStream var190 = null;
        byte[] var191 = null;
        byte[] var192 = null;
        ms var199 = null;
        boolean var204 = false;
        int var1 = zi;
        var1 ^= -1445104600;
        Throwable var2 = null;
        String var3 = Zx.n(var0);
        Charset var4 = StandardCharsets.UTF_8;
        byte[] var168 = var3.getBytes(var4);
        byte[] var169 = var168;
        int var176 = var168.length;
        int var5 = of_2.y;
        var1 ^= var5;
        var1 ^= -864320044;
        of_2.y = -864320044;
        var5 = of_2.Il;
        var1 ^= var5;
        var1 ^= 1834896129;
        of_2.Il = 1834896129;

        var1 = switch (var1) {
            case 867099226 -> var1 ^ 1853670305;
            default -> var1 ^ 1092129808;
            case 2004720631 -> {
                var1 -= -889298287;
                var1 |= 1889498589;
                var1 *= 300907983;
                yield var1 ^ -1592169292;
            }
        };
        if (var176 > 65536) {
            var1 -= -1269392119;
            var1 *= 2092429013;
            var1 *= 1168394631;
            var1 -= -717154197;
            var1 ^= -1311869561;
            Integer var180 = var1;
            if (var180 != null) {
                ms var181 = new ms("Config jest za duży do wysłania.", false);
                throw var181;
            }
        } else {
            var1 &= -1153083678;
            var1 += 2054141650;
            var1 -= 9844450;
            var1 >>= 13;
            var1 ^= -414056171;
            Integer var177 = var1;
            if (var177 != null) {
                Deflater var178 = new Deflater(9);
                var1 += -1958146672;
                var1 ^= 855224346;
                Integer var183 = var1;
                label192:
                if (var183 != null) {
                    Deflater var179 = var178;
                    var1 |= -449750514;
                    var1 |= -1169663015;
                    var1 ^= 102339832;
                    var1 ^= 2131239428;
                    var1 ^= 1365493949;

                    label353: {
                        label352: {
                            label351: {
                                label350: {
                                    label384: {
                                        try {
                                            var1 <<= 29;
                                            var1 ^= -898326002;
                                        } catch (Throwable var31) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var31;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        var183 = var1;
                                        if (var183 == null) {
                                            break label192;
                                        }

                                        try {
                                            var179.setInput(var169);
                                        } catch (Throwable var30) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var30;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }
                                        var1 = switch (var1) {
                                            default -> var1 ^ -1217642175;
                                            case -1481722027 -> var1 ^ 1393379311;
                                            case 175415822 -> {
                                                var1 *= -1311829169;
                                                yield var1 ^ -314330699;
                                            }
                                        };
                                        long var185 = var1;
                                        long var7 = var185 + 1L;
                                        var7 = var185 * var7;
                                        long var9 = var185 + 2L;
                                        var7 *= var9;
                                        long var186 = var185 + 3L;
                                        var7 *= var186;
                                        long var187 = var7 & 7L;
                                        long var248;
                                        int var188 = (var248 = var187 - 0L) == 0L ? 0 : (var248 < 0L ? -1 : 1);
                                        if (var188 != 0) {
                                            break label192;
                                        }

                                        try {
                                            var179.finish();
                                            var1 |= 32250974;
                                            var1 *= 1214635143;
                                            var1 *= -1132116359;
                                            var1 ^= 812331788;
                                        } catch (Throwable var29) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var29;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        Integer var189 = var1;
                                        if (var189 == null) {
                                            break label192;
                                        }

                                        try {
                                            var190 = null;
                                        } catch (Throwable var28) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var28;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }
                                        var1 = switch (var1) {
                                            case -1940566211 -> {
                                                var1 *= 1590480781;
                                                var1 -= -1425574870;
                                                var1 -= -253837764;
                                                yield var1 ^ -1714309020;
                                            }
                                            case 638604832 -> var1 ^ 607030268;
                                            default -> var1 ^ 1822504290;
                                        };
                                        Integer var6 = var1;
                                        if (var6 == null) {
                                            break label192;
                                        }

                                        try {
                                            int var170 = var169.length;
                                            var1 += -1360625900;
                                            var1 ^= 1314279829;
                                            int var171 = var170 / 3;
                                            var1 -= 1780774724;
                                            var1 ^= 1017116722;
                                            var172 = var171 + 64;
                                            var1 *= -1712530909;
                                            var1 ^= -854940282;
                                            var1 += 947761167;
                                            var1 ^= 552229485;
                                        } catch (Throwable var27) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var27;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        var6 = var1;
                                        if (var6 == null) {
                                            break label192;
                                        }

                                        try {
                                            var190 = new ByteArrayOutputStream(var172);
                                        } catch (Throwable var26) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var26;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }
                                        var1 = switch (var1) {
                                            default -> var1 ^ -683360923;
                                            case 1248431109 -> var1 ^ 170456968;
                                            case 1681392448 -> {
                                                var1 *= -1684615681;
                                                yield var1 ^ 23093508;
                                            }
                                        };

                                        try {
                                            var173 = var190;
                                            var1 *= -264796701;
                                            var1 -= 906371765;
                                            var1 ^= -1097800940;
                                            var191 = new byte[2048];
                                        } catch (Throwable var25) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var25;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }
                                        var1 = switch (var1) {
                                            case -1867931596 -> var1 ^ 600005120;
                                            case -1224280829 -> {
                                                var1 ^= 2039888718;
                                                var1 ^= 579205553;
                                                var1 *= 1230216913;
                                                var1 += 96838905;
                                                yield var1 ^ -964686636;
                                            }
                                            default -> var1 ^ 1038857240;
                                        };

                                        try {
                                            var192 = var191;
                                            var1 += -1066116852;
                                            var1 ^= 589392335;
                                        } catch (Throwable var23) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var23;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        while (true) {
                                            try {
                                                var1 += -376675063;
                                                var1 ^= 477720095;
                                                var1 ^= 510945866;
                                                var204 = var179.finished();
                                                var1 -= 1564086531;
                                                var1 >>= 8;
                                                var1 &= -789424260;
                                                var1 ^= -1403241633;
                                            } catch (Throwable var19) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var19;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }

                                            int var226 = var1 + 1;
                                            int var227 = var1 * var226;
                                            int var228 = var227 & 1;
                                            if (var228 != 0) {
                                                break label192;
                                            }

                                            try {
                                                if (var204) {
                                                    break;
                                                }
                                            } catch (Throwable var24) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var24;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }

                                            var1 |= 1384119897;
                                            var1 ^= -298622690;
                                            int var205 = var1 + 1;
                                            var205 = var1 * var205;
                                            var205 &= 1;
                                            if (var205 != 0) {
                                                break label192;
                                            }

                                            try {
                                                var1 <<= 31;
                                                var1 ^= 1466639623;
                                            } catch (Throwable var22) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var22;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }

                                            long var208 = var1;
                                            long var8 = var208 + 1L;
                                            var8 = var208 * var8;
                                            long var10 = var208 + 2L;
                                            var8 *= var10;
                                            long var209 = var208 + 3L;
                                            var8 *= var209;
                                            long var210 = var8 & 7L;
                                            long var249;
                                            var205 = (var249 = var210 - 0L) == 0L ? 0 : (var249 < 0L ? -1 : 1);
                                            if (var205 != 0) {
                                                break label192;
                                            }

                                            try {
                                                var205 = var179.deflate(var192);
                                                var1 <<= 11;
                                                var1 += 1443193298;
                                                var1 ^= -232685740;
                                            } catch (Throwable var21) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var21;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }

                                            var7 = var1;
                                            var9 = var7 + 1L;
                                            var9 = var7 * var9;
                                            long var11 = var7 + 2L;
                                            var9 *= var11;
                                            var7 += 3L;
                                            var9 *= var7;
                                            var7 = var9 & 7L;
                                            long var250;
                                            int var232 = (var250 = var7 - 0L) == 0L ? 0 : (var250 < 0L ? -1 : 1);
                                            if (var232 != 0) {
                                                break label192;
                                            }

                                            try {
                                                var173.write(var192, 0, var205);
                                                var1 -= -853521368;
                                                var1 <<= 3;
                                                var1 ^= -2062811822;
                                            } catch (Throwable var20) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var20;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }
                                        }
                                        var1 = switch (var1) {
                                            default -> var1 ^ -1279440025;
                                            case -158437261 -> var1 ^ -753133708;
                                            case 2094804771 -> {
                                                var1 *= -477144461;
                                                yield var1 ^ 186771952;
                                            }
                                        };
                                        long var193 = var1;
                                        var7 = var193 + 1L;
                                        var7 = var193 * var7;
                                        long var194 = var7 & 1L;
                                        long var251;
                                        int var195 = (var251 = var194 - 0L) == 0L ? 0 : (var251 < 0L ? -1 : 1);
                                        if (var195 != 0) {
                                            break label192;
                                        }

                                        try {
                                            var1 |= 1691378116;
                                            var1 -= 280175331;
                                            var1 ^= 433599105;
                                            var195 = var173.size();
                                            var1 |= 2097700808;
                                            var1 ^= 1526943223;
                                        } catch (Throwable var18) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var18;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        int var213 = var1 + 1;
                                        var213 = var1 * var213;
                                        int var235 = var1 + 2;
                                        var213 *= var235;
                                        int var236 = var1 + 3;
                                        var213 *= var236;
                                        var213 &= 7;
                                        if (var213 != 0) {
                                            break label192;
                                        }

                                        label385: {
                                            try {
                                                if (var195 > 7168) {
                                                    break label385;
                                                }
                                            } catch (Throwable var17) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var17;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }

                                            var1 |= 760695215;
                                            var1 |= -1976857070;
                                            var1 ^= 1496438361;
                                            Integer var197 = var1;
                                            if (var197 == null) {
                                                break label192;
                                            }
                                            var1 = switch (var1) {
                                                case -457836085 -> var1 ^ 795834256;
                                                case -154261018 -> {
                                                    var1 >>>= 18;
                                                    var1 -= -1702240047;
                                                    yield var1 ^ 160526472;
                                                }
                                                default -> var1 ^ 1998877389;
                                            };

                                            try {
                                                byte[] var174 = var173.toByteArray();
                                                var1 |= -161378220;
                                                var1 -= 1794555898;
                                                var1 *= -1304083739;
                                                var1 *= 360201201;
                                                var1 ^= 1784914270;
                                                var175 = var174;
                                                break label353;
                                            } catch (Throwable var16) {
                                                var1 = zi;
                                                var1 ^= -1403634861;
                                                var2 = var16;
                                                switch (var1) {
                                                    case -919517468:
                                                        break label384;
                                                    case -533511820:
                                                    default:
                                                        break label351;
                                                    case 1928778892:
                                                        break label350;
                                                }
                                            }
                                        }

                                        var1 |= 1425850625;
                                        var1 ^= -385146565;
                                        var1 ^= -1537520491;
                                        Integer var198 = var1;
                                        if (var198 == null) {
                                            break label192;
                                        }

                                        try {
                                            var199 = null;
                                            var1 -= 1720269830;
                                            var1 &= -1751389536;
                                            var1 ^= 1254263086;
                                        } catch (Throwable var15) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var15;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        var213 = var1 + 1;
                                        var213 = var1 * var213;
                                        int var237 = var1 + 2;
                                        var213 *= var237;
                                        int var238 = var1 + 3;
                                        var213 *= var238;
                                        var213 &= 7;
                                        if (var213 != 0) {
                                            break label192;
                                        }

                                        try {
                                            var199 = new ms("Config jest za duży do wysłania.", false);
                                        } catch (Throwable var14) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var14;
                                            switch (var1) {
                                                case -919517468:
                                                    break label384;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }

                                        switch (var1) {
                                            case -878306669:
                                            default:
                                                var1 ^= -277177371;
                                                break;
                                            case 819947617:
                                                var1 ^= -2122344162;
                                                break;
                                            case 1505946510:
                                                var1 -= 2002354699;
                                                var1 &= -2129742059;
                                                var1 ^= -984171036;
                                        }

                                        try {
                                            throw var199;
                                        } catch (Throwable var13) {
                                            var1 = zi;
                                            var1 ^= -1403634861;
                                            var2 = var13;
                                            switch (var1) {
                                                case -919517468:
                                                    break;
                                                case -533511820:
                                                default:
                                                    break label351;
                                                case 1928778892:
                                                    break label350;
                                            }
                                        }
                                    }

                                    var1 ^= 792870775;
                                    break label352;
                                }

                                var1 &= 1744045365;
                                var1 ^= -1457075141;
                                var1 ^= -1172146801;
                                var1 ^= -427803343;
                                break label352;
                            }

                            var1 ^= 867070519;
                        }

                        long var200 = var1;
                        long var239 = var200 + 1L;
                        var239 = var200 * var239;
                        long var201 = var239 & 1L;
                        long var252;
                        int var202 = (var252 = var201 - 0L) == 0L ? 0 : (var252 < 0L ? -1 : 1);
                        if (var202 == 0) {
                            var179.end();
                            throw UncheckedExceptions.rethrow(var2);
                        }
                        break label192;
                    }

                    switch (var1) {
                        case -787799312:
                            var1 ^= 665263758;
                            break;
                        case -652322422:
                            var1 -= 1873436590;
                            var1 <<= 1;
                            var1 -= -1129529819;
                            var1 >>= 1;
                            var1 ^= 1511718237;
                            break;
                        case 1840969422:
                        default:
                            var1 ^= 1979400322;
                    }

                    var179.end();
                    return var175;
                }
            }
        }

        RuntimeException var166 = new RuntimeException();
        throw var166;
    }

    public static com.google.gson.JsonObject zS(byte[] param0) throws ms {
    java.util.zip.Inflater inflater = new java.util.zip.Inflater();
    try {
        inflater.setInput(param0);
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        while (!inflater.finished()) {
            int count = inflater.inflate(buf);
            if (count == 0) {
                if (inflater.needsInput() || inflater.needsDictionary()) {
                    break;
                }
            }
            baos.write(buf, 0, count);
        }
        String json = baos.toString(java.nio.charset.StandardCharsets.UTF_8);
        return com.google.gson.JsonParser.parseString(json).getAsJsonObject();
    } catch (Exception e) {
        throw new ms("Serwer zwrócił uszkodzony config.", false);
    } finally {
        inflater.end();
    }
}


    private static ms gU() {
        return new ms("Serwer zwrócił uszkodzony config.", false);
    }

    private static Throwable td(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1685771572;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        zi = var4;
    }
}
