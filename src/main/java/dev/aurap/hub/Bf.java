package dev.aurap.hub;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import org.joml.Matrix4f;

public final class Bf {
    private final J[] ly;
    private final Matrix4f g;
    public static final int p;

    public Bf() {
        this.g = new Matrix4f();
        try (java.io.InputStreamReader reader = new java.io.InputStreamReader(
                java.util.Objects.requireNonNull(Bf.class.getResourceAsStream("/assets/auravisuals/models/sahur.json")),
                java.nio.charset.StandardCharsets.UTF_8)) {
            com.google.gson.JsonObject root = com.google.gson.JsonParser.parseReader(reader).getAsJsonObject();
            com.google.gson.JsonArray parts = root.getAsJsonArray("parts");
            com.google.gson.JsonObject bones = root.getAsJsonObject("bones");
            this.ly = new J[parts.size()];
            for (int i = 0; i < parts.size(); i++) {
                com.google.gson.JsonObject part = parts.get(i).getAsJsonObject();
                String boneName = part.get("bone").getAsString();
                float[] uv = Bf.uX(part.getAsJsonArray("uv"), 868255128);
                float[] from = Bf.uX(part.getAsJsonArray("from"), 868255128);
                float[] to = Bf.uX(part.getAsJsonArray("to"), 868255128);
                float[] boneOrigin = Bf.uX(bones.getAsJsonArray(boneName), 868255128);
                float[][] uvs = new float[][]{uv, uv, uv, uv, uv, uv};
                this.ly[i] = new J(boneName, from, to, boneOrigin, uvs);
            }
        } catch (Exception e) {
            throw new IllegalStateException("Cannot load Sahur model", e);
        }
    }

    public void GN(GM var1, Matrix4f var2, int var3, float var4, float var5, float var6) {
        int var299 = 0;
        label423: {
            int var7 = p;
            int var8 = var3;
            var7 ^= 1175616088;
            int var9 = System.identityHashCode(this);
            J[] var10 = this.ly;
            int var11 = var9 + 1;
            var11 = var9 * var11;
            var11 &= 1;
            if (var11 != 0) {
                var7 -= 1285484579;
                var7 >>>= 4;
                var7 ^= 1905538365;
                var7 ^= -69658473;
            } else {
                var7 ^= -706137258;
                var7 ^= -1053512472;
                J[] var268 = var10;
                var11 = var10.length;
                var11 = var11;
                int var12 = 0;
                var12 = var12;

                var7 = switch (var7) {
                    case -2131358360 -> {
                        var7 <<= 16;
                        var7 <<= 22;
                        var7 ^= 2000605117;
                        yield var7 ^ -1933672800;
                    }
                    default -> var7 ^ 995195462;
                    case 219875400 -> var7 ^ 1398623801;
                };

                label400:
                while (true) {
                    long var13 = var8;
                    long var15 = var13 + 1L;
                    var15 = var13 * var15;
                    var13 = var15 & 1L;
                    long var534;
                    int var275 = (var534 = var13 - 0L) == 0L ? 0 : (var534 < 0L ? -1 : 1);
                    if (var275 != 0) {
                        break label423;
                    }

                    if (var12 >= var11) {
                        var7 ^= -853827190;
                        var7 ^= 1737044080;
                        long var257 = var8;
                        long var265 = var257 + 1L;
                        long var266 = var257 * var265;
                        long var258 = var266 & 1L;
                        long var535;
                        var7 = (var535 = var258 - 0L) == 0L ? 0 : (var535 < 0L ? -1 : 1);
                        if (var7 == 0) {
                            return;
                        }
                        break label423;
                    }
                    var7 = switch (var7) {
                        case -2119243260 -> var7 ^ -1488323108;
                        default -> var7 ^ -199603780;
                        case -75452131 -> {
                            var7 >>= 20;
                            yield var7 ^ -165803400;
                        }
                    };
                    var13 = var8;
                    var15 = var13 + 1L;
                    var15 = var13 * var15;
                    long var17 = var13 + 2L;
                    var15 *= var17;
                    var13 += 3L;
                    var15 *= var13;
                    var13 = var15 & 7L;
                    long var536;
                    int var279 = (var536 = var13 - 0L) == 0L ? 0 : (var536 < 0L ? -1 : 1);
                    if (var279 != 0) {
                        break label423;
                    }

                    J var280 = var268[var12];
                    Integer var14 = var9;
                    if (var14 == null) {
                        switch (var7) {
                            case 165803456:
                                var7 *= 484137043;
                                var7 -= -678682887;
                                var7 ^= -901420602;
                                break label400;
                            case 880476731:
                            default:
                                var7 ^= 771213424;
                                break label400;
                            case 1827145394:
                                var7 ^= 1405406494;
                                break label400;
                        }
                    }

                    var7 -= 1985060716;
                    var7 &= -951062990;
                    var7 ^= 765203196;
                    var7 -= -2135395963;
                    var7 ^= -1335882449;
                    int var283 = var8 + 1;
                    var283 = var8 * var283;
                    int var320 = var8 + 2;
                    var283 *= var320;
                    int var321 = var8 + 3;
                    var283 *= var321;
                    var283 &= 7;
                    if (var283 != 0) {
                        break label423;
                    }

                    int var346;
                    String var288 = var280.bone();
                    byte var322 = -1;
                    var346 = var288.hashCode();
                    label391:
                    switch (var346) {
                        case -1568801351:
                            var7 &= -1531731250;
                            var7 -= 31773161;
                            var7 |= 1219236629;
                            var7 >>= 14;
                            var7 ^= -1869459697;
                            int var290 = (var288.equals("right_arm")) ? 1 : 0;
                            Integer var404 = var9;
                            if (var404 == null) {
                                var7 *= 584533517;
                                var7 -= 2084222926;
                                var7 *= 1065663809;
                                var7 &= -762209417;
                                var7 ^= 1546974871;
                                break label400;
                            }
                            var7 = switch (var7) {
                                default -> var7 ^ -1197120539;
                                case 349278368 -> var7 ^ 1313922853;
                                case 1869440500 -> {
                                    var7 *= 1201363277;
                                    yield var7 ^ 263848738;
                                }
                            };
                            if (var290 != 0) {
                                var7 >>= 20;
                                var7 >>>= 11;
                                var7 ^= 308471163;
                                Integer var291 = var8;
                                if (var291 == null) {
                                    break label423;
                                }

                                var290 = (byte)0;
                                Integer var405 = var9;
                                if (var405 == null) {
                                    var7 *= -1328370819;
                                    var7 ^= -1776158219;
                                    break label400;
                                }

                                var7 >>= 23;
                                var7 |= -1718991889;
                                var7 -= 491448999;
                                var7 |= -1920075425;
                                var7 ^= -562329800;
                                int var406 = var8 + 1;
                                int var407 = var8 * var406;
                                int var457 = var8 + 2;
                                int var408 = var407 * var457;
                                var457 = var8 + 3;
                                int var409 = var408 * var457;
                                int var410 = var409 & 7;
                                if (var410 != 0) {
                                    break label423;
                                }

                                var346 = var290;
                                var7 -= -1453579541;
                                var7 *= -1921545949;
                                var7 |= -1636991407;
                                var7 *= 816773115;
                                var7 ^= -665225384;
                            } else {
                                var7 <<= 27;
                                var7 ^= 594333811;
                                var290 = var8 + 1;
                                var290 = var8 * var290;
                                int var411 = var8 + 2;
                                var290 *= var411;
                                int var412 = var8 + 3;
                                var290 *= var412;
                                var290 &= 7;
                                if (var290 != 0) {
                                    break label423;
                                }

                                var346 = var322;
                                var7 &= -1780913387;
                                var7 -= 494599268;
                                var7 &= -1311753674;
                                var7 ^= 364641526;
                                var7 ^= -2069376579;
                            }
                            break;
                        case -1568791189:
                            var7 |= 1525680696;
                            var7 ^= 1713186492;
                            var7 ^= -1549836758;
                            var7 ^= -1734204103;
                            int var394 = var8 + 1;
                            int var395 = var8 * var394;
                            int var443 = var8 + 2;
                            int var396 = var395 * var443;
                            var443 = var8 + 3;
                            int var397 = var396 * var443;
                            int var398 = var397 & 7;
                            if (var398 != 0) {
                                break label423;
                            }

                            boolean var399 = var288.equals("right_leg");
                            Integer var445 = var9;
                            if (var445 == null) {
                                var7 &= -1369021551;
                                var7 <<= 31;
                                var7 <<= 22;
                                var7 += -1345522818;
                                var7 ^= 569971967;
                                break label400;
                            }
                            var7 = switch (var7) {
                                case -2100055081 -> {
                                    var7 -= -1618731712;
                                    var7 >>>= 23;
                                    var7 -= 1360335421;
                                    yield var7 ^ -96628831;
                                }
                                default -> var7 ^ 1921639849;
                                case 1334693567 -> var7 ^ 1613280254;
                            };
                            int var446 = var8 + 1;
                            var446 = var8 * var446;
                            var446 &= 1;
                            if (var446 != 0) {
                                break label423;
                            }

                            if (var399) {
                                var7 ^= 1903635431;
                                var7 += 1419555533;
                                var7 *= 1873849479;
                                var7 ^= -1786235817;
                                byte var400 = 2;
                                var446 = var9 + 1;
                                var446 = var9 * var446;
                                var446 &= 1;
                                if (var446 != 0) {
                                    var7 >>= 26;
                                    var7 <<= 26;
                                    var7 ^= 976611201;
                                    break label400;
                                }
                                var7 = switch (var7) {
                                    case -1242357741 -> {
                                        var7 |= -2099955628;
                                        var7 ^= 1654894054;
                                        var7 -= 733935182;
                                        var7 *= -555961383;
                                        yield var7 ^ 117492780;
                                    }
                                    default -> var7 ^ 1340351464;
                                    case 2139354502 -> var7 ^ 334549522;
                                };
                                var446 = var8 + 1;
                                var446 = var8 * var446;
                                int var507 = var8 + 2;
                                var446 *= var507;
                                var507 = var8 + 3;
                                var446 *= var507;
                                var446 &= 7;
                                if (var446 != 0) {
                                    break label423;
                                }

                                var346 = var400;
                                var7 += 2145779782;
                                var7 += -59176012;
                                var7 |= 1683463746;
                                var7 -= 1040833002;
                                var7 ^= -1742091594;
                            } else {
                                var7 |= 2028950143;
                                var7 ^= 546283773;
                                var7 ^= 153383882;
                                var17 = var8;
                                long var509 = var17 + 1L;
                                var509 = var17 * var509;
                                var17 = var509 & 1L;
                                long var543;
                                int var403 = (var543 = var17 - 0L) == 0L ? 0 : (var543 < 0L ? -1 : 1);
                                if (var403 != 0) {
                                    break label423;
                                }

                                var346 = var322;
                                switch (var7) {
                                    case -1145379598:
                                    default:
                                        var7 ^= 547475060;
                                        break label391;
                                    case 117954251:
                                        var7 ^= 1545585883;
                                        break label391;
                                    case 1431609672:
                                        var7 &= 269233058;
                                        var7 ^= 819465839;
                                }
                            }
                            break;
                        case 1718742564:
                            var7 -= 89872344;
                            var7 -= -1594267034;
                            var7 ^= 607648217;
                            var7 ^= 662683463;
                            var17 = var8;
                            long var497 = var17 + 1L;
                            var497 = var17 * var497;
                            long var532 = var17 + 2L;
                            var497 *= var532;
                            var17 += 3L;
                            var497 *= var17;
                            var17 = var497 & 7L;
                            long var540;
                            int var385 = (var540 = var17 - 0L) == 0L ? 0 : (var540 < 0L ? -1 : 1);
                            if (var385 != 0) {
                                break label423;
                            }

                            boolean var386 = var288.equals("left_arm");
                            Integer var436 = var9;
                            if (var436 == null) {
                                var7 += -382283544;
                                var7 ^= 1403772157;
                                break label400;
                            }
                            var7 = switch (var7) {
                                case -194549100 -> {
                                    var7 += -16721430;
                                    yield var7 ^ 1882760203;
                                }
                                case -99008725 -> var7 ^ -264222030;
                                default -> var7 ^ 746005739;
                            };
                            if (var386) {
                                var7 = switch (var7) {
                                    case -2091851659 -> {
                                        var7 ^= -2073094678;
                                        var7 -= 1772089666;
                                        var7 |= 519448424;
                                        yield var7 ^ 276236940;
                                    }
                                    case -1641565256 -> var7 ^ 701102899;
                                    default -> var7 ^ 200599742;
                                };
                                var17 = var8;
                                var497 = var17 + 1L;
                                var497 = var17 * var497;
                                var17 = var497 & 1L;
                                long var541;
                                int var389 = (var541 = var17 - 0L) == 0L ? 0 : (var541 < 0L ? -1 : 1);
                                if (var389 != 0) {
                                    break label423;
                                }

                                byte var390 = 1;
                                var436 = var9;
                                if (var436 == null) {
                                    var7 += -871794430;
                                    var7 ^= -708886158;
                                    break label400;
                                }
                                var7 = switch (var7) {
                                    case -1887359503 -> {
                                        var7 -= 158527551;
                                        yield var7 ^ -349464919;
                                    }
                                    default -> var7 ^ 684445613;
                                    case 1724382951 -> var7 ^ -1279561686;
                                };
                                int var438 = var8 + 1;
                                var438 = var8 * var438;
                                int var503 = var8 + 2;
                                var438 *= var503;
                                int var504 = var8 + 3;
                                var438 *= var504;
                                var438 &= 7;
                                if (var438 != 0) {
                                    break label423;
                                }

                                var346 = var390;
                                var7 ^= 1240025137;
                                var7 ^= 68209733;
                            } else {
                                var7 >>>= 9;
                                var7 &= -1648713222;
                                var7 += -1987906432;
                                var7 |= -2062255043;
                                var7 ^= -2006949321;
                                var17 = var8;
                                var497 = var17 + 1L;
                                var497 = var17 * var497;
                                var17 = var497 & 1L;
                                long var542;
                                int var393 = (var542 = var17 - 0L) == 0L ? 0 : (var542 < 0L ? -1 : 1);
                                if (var393 != 0) {
                                    break label423;
                                }

                                var346 = var322;
                                switch (var7) {
                                    case -1677122334:
                                    default:
                                        var7 ^= -212790241;
                                        break label391;
                                    case -728820288:
                                        var7 ^= 1408318717;
                                        break label391;
                                    case 100114122:
                                        var7 += -2054248363;
                                        var7 &= 730169140;
                                        var7 += -1504061810;
                                        var7 ^= -1781291712;
                                        var7 ^= 80844685;
                                }
                            }
                            break;
                        case 1718752726:
                            var7 = switch (var7) {
                                case -1652298168 -> {
                                    var7 |= -168039275;
                                    var7 -= -145619840;
                                    var7 *= 453361145;
                                    var7 += -1119348234;
                                    yield var7 ^ 2080620172;
                                }
                                default -> var7 ^ -581642639;
                                case 1929155258 -> var7 ^ -1429221099;
                            };
                            Integer var347 = var8;
                            if (var347 == null) {
                                break label423;
                            }

                            boolean var348 = var288.equals("left_leg");
                            int var367 = var9 + 1;
                            int var368 = var9 * var367;
                            int var18 = var9 + 2;
                            int var369 = var368 * var18;
                            var18 = var9 + 3;
                            int var370 = var369 * var18;
                            int var371 = var370 & 7;
                            if (var371 != 0) {
                                var7 >>>= 23;
                                var7 ^= 2169830;
                                var7 -= -1561003909;
                                var7 |= -1754311628;
                                var7 ^= 1364889916;
                                break label400;
                            }

                            var7 -= -1009700439;
                            var7 &= -817625405;
                            var7 ^= -1641192267;
                            if (var348) {
                                var7 >>= 13;
                                var7 *= 16536911;
                                var7 -= 726719502;
                                var7 ^= -1429852774;
                                var7 ^= 1094873069;
                                var347 = var8;
                                if (var347 == null) {
                                    break label423;
                                }

                                byte var350 = 3;
                                int var372 = var9 + 1;
                                int var373 = var9 * var372;
                                int var374 = var373 & 1;
                                if (var374 != 0) {
                                    var7 &= 1237723675;
                                    var7 *= -1321794141;
                                    var7 &= 239253509;
                                    var7 ^= -2106196095;
                                    break label400;
                                }

                                var7 *= -1030062059;
                                var7 &= 266665266;
                                var7 ^= -1539819971;
                                var17 = var8;
                                long var491 = var17 + 1L;
                                var491 = var17 * var491;
                                long var531 = var17 + 2L;
                                var491 *= var531;
                                var17 += 3L;
                                var491 *= var17;
                                var17 = var491 & 7L;
                                long var538;
                                int var378 = (var538 = var17 - 0L) == 0L ? 0 : (var538 < 0L ? -1 : 1);
                                if (var378 != 0) {
                                    break label423;
                                }

                                var346 = var350;
                                var7 &= 1962716235;
                                var7 *= -79731743;
                                var7 &= -2071173869;
                                var7 ^= -1529335954;
                            } else {
                                var7 = switch (var7) {
                                    case 321479863 -> {
                                        var7 -= 748459951;
                                        yield var7 ^ -544229918;
                                    }
                                    case 999664773 -> var7 ^ 789852261;
                                    default -> var7 ^ -1681514922;
                                };
                                var17 = var8;
                                long var495 = var17 + 1L;
                                var495 = var17 * var495;
                                var17 = var495 & 1L;
                                long var539;
                                int var381 = (var539 = var17 - 0L) == 0L ? 0 : (var539 < 0L ? -1 : 1);
                                if (var381 != 0) {
                                    break label423;
                                }

                                var346 = var322;
                                switch (var7) {
                                    case -799948443:
                                    default:
                                        var7 ^= 1476916245;
                                        break label391;
                                    case -731688516:
                                        var7 ^= 2096007273;
                                        break label391;
                                    case 956528874:
                                        var7 *= 289280811;
                                        var7 *= -2121266399;
                                        var7 ^= 1924296655;
                                        var7 *= -755231887;
                                        var7 ^= -1461024418;
                                }
                            }
                            break;
                        default:
                            var7 = switch (var7) {
                                default -> var7 ^ 760091029;
                                case -1652298168 -> {
                                    var7 &= -1006722724;
                                    var7 |= -1852827366;
                                    yield var7 ^ 1600476409;
                                }
                                case -1322904152 -> var7 ^ -1974344790;
                            };
                            var17 = var8;
                            long var19 = var17 + 1L;
                            var19 = var17 * var19;
                            long var21 = var17 + 2L;
                            var19 *= var21;
                            var17 += 3L;
                            var19 *= var17;
                            var17 = var19 & 7L;
                            long var537;
                            var283 = (var537 = var17 - 0L) == 0L ? 0 : (var537 < 0L ? -1 : 1);
                            if (var283 != 0) {
                                break label423;
                            }

                            var346 = var322;
                            var7 &= -591200253;
                            var7 ^= -333500564;
                    }

                    Integer var298 = var8;
                    if (var298 == null) {
                        break label423;
                    }

                    label359:
                    switch (var346) {
                        case 0:
                            var7 >>>= 25;
                            var7 ^= 640640795;
                            int var336 = var8 + 1;
                            int var337 = var8 * var336;
                            int var338 = var337 & 1;
                            if (var338 != 0) {
                                break label423;
                            }

                            var299 = (int)var4;
                            var7 ^= 1213245955;
                            var7 ^= 195915083;
                            var7 ^= -32537931;
                            break;
                        case 1:
                            var7 *= -243629849;
                            var7 <<= 13;
                            var7 *= 844544633;
                            var7 ^= -1098246136;
                            var15 = var8;
                            var17 = var15 + 1L;
                            var17 = var15 * var17;
                            long var512 = var15 + 2L;
                            var17 *= var512;
                            var15 += 3L;
                            var17 *= var15;
                            var15 = var17 & 7L;
                            long var544;
                            int var333 = (var544 = var15 - 0L) == 0L ? 0 : (var544 < 0L ? -1 : 1);
                            if (var333 != 0) {
                                break label423;
                            }

                            float var334 = -var5;
                            float var335 = var334 * 0.45F;
                            var346 = var9 + 1;
                            var346 = var9 * var346;
                            int var421 = var9 + 2;
                            var346 *= var421;
                            int var422 = var9 + 3;
                            var346 *= var422;
                            var346 &= 7;
                            if (var346 != 0) {
                                var7 ^= 1873822139;
                                var7 >>>= 14;
                                var7 *= -1434529419;
                                var7 ^= 1528492;
                                break label400;
                            }

                            var7 -= 665608421;
                            var7 += 1994187718;
                            var7 ^= 1016061754;
                            var7 ^= -924771990;
                            long var356 = var8;
                            long var459 = var356 + 1L;
                            var459 = var356 * var459;
                            long var20 = var356 + 2L;
                            var459 *= var20;
                            long var357 = var356 + 3L;
                            var459 *= var357;
                            long var358 = var459 & 7L;
                            long var545;
                            var346 = (var545 = var358 - 0L) == 0L ? 0 : (var545 < 0L ? -1 : 1);
                            if (var346 != 0) {
                                break label423;
                            }

                            var299 = (int)var335;
                            var7 *= -1908393327;
                            var7 &= -1499385829;
                            var7 |= 705927301;
                            var7 += 235039659;
                            var7 ^= -1486149938;
                            break;
                        case 2:
                            var7 = switch (var7) {
                                default -> var7 ^ -1460546684;
                                case -1552941258 -> var7 ^ 516665200;
                                case 551300975 -> {
                                    var7 &= -1337576764;
                                    var7 *= -433865043;
                                    var7 ^= 695864858;
                                    yield var7 ^ -1455089826;
                                }
                            };
                            Integer var329 = var8;
                            if (var329 == null) {
                                break label423;
                            }

                            var299 = (int)var5;
                            switch (var7) {
                                case -1883663510:
                                    var7 ^= -958032126;
                                    break label359;
                                case -1493530960:
                                    var7 += -791717490;
                                    var7 *= 64727089;
                                    var7 ^= -1153738737;
                                    var7 -= 1953651826;
                                    var7 ^= 1134970281;
                                    break label359;
                                case 726634059:
                                default:
                                    var7 ^= -667882096;
                                    break label359;
                            }
                        case 3:
                            var7 *= 288314841;
                            var7 |= 448894363;
                            var7 &= -1763385133;
                            var7 ^= -1918810483;
                            float var300 = -var5;
                            Integer var324 = var9;
                            if (var324 == null) {
                                var7 >>>= 21;
                                var7 ^= -1741609336;
                                var7 &= -1309962234;
                                var7 *= -444544437;
                                var7 ^= -2137427177;
                                break label400;
                            }

                            var7 >>= 14;
                            var7 ^= 1146517316;
                            var15 = var8;
                            var17 = var15 + 1L;
                            var17 = var15 * var17;
                            long var511 = var15 + 2L;
                            var17 *= var511;
                            var15 += 3L;
                            var17 *= var15;
                            var15 = var17 & 7L;
                            long var546;
                            int var328 = (var546 = var15 - 0L) == 0L ? 0 : (var546 < 0L ? -1 : 1);
                            if (var328 != 0) {
                                break label423;
                            }

                            var299 = (int)var300;
                            switch (var7) {
                                case -1146615085:
                                    var7 |= 1195375034;
                                    var7 ^= -248461829;
                                    var7 ^= -1789780746;
                                    break label359;
                                case -996457775:
                                    var7 ^= 29438046;
                                    break label359;
                                case -720200467:
                                default:
                                    var7 ^= 1719682913;
                                    break label359;
                            }
                        default:
                            var7 += -617687203;
                            var7 ^= -1385830871;
                            Integer var323 = var8;
                            if (var323 == null) {
                                break label423;
                            }

                            var299 = 0;
                            var7 -= 972105667;
                            var7 ^= -1935631404;
                    }

                    int var339 = var8 + 1;
                    int var340 = var8 * var339;
                    var346 = var8 + 2;
                    int var341 = var340 * var346;
                    var346 = var8 + 3;
                    int var342 = var341 * var346;
                    int var343 = var342 & 7;
                    if (var343 != 0) {
                        break label423;
                    }

                    float[] var344 = var280.from();
                    float[] var362 = var280.to();
                    int var423 = var9 + 1;
                    int var424 = var9 * var423;
                    int var463 = var9 + 2;
                    int var425 = var424 * var463;
                    var463 = var9 + 3;
                    int var426 = var425 * var463;
                    int var427 = var426 & 7;
                    if (var427 != 0) {
                        switch (var7) {
                            case -1680006410:
                                var7 |= 1937135893;
                                var7 ^= 1976212598;
                                break label400;
                            case -726051018:
                                var7 ^= -898875088;
                                break label400;
                            case -250560148:
                            default:
                                var7 ^= 1210799366;
                                break label400;
                        }
                    }

                    var7 += 362290769;
                    var7 &= -1532116528;
                    var7 += -759139814;
                    var7 ^= -1863094846;
                    var17 = var8;
                    long var513 = var17 + 1L;
                    var513 = var17 * var513;
                    var17 = var513 & 1L;
                    long var547;
                    int var430 = (var547 = var17 - 0L) == 0L ? 0 : (var547 < 0L ? -1 : 1);
                    if (var430 != 0) {
                        break label423;
                    }

                    float[] var431 = var280.origin();
                    Matrix4f var465 = this.g;
                    Matrix4f var466 = var465.set(var2);
                    float var515 = var431[0];
                    float var521 = var431[1];
                    float var533 = var431[2];
                    Matrix4f var467 = var466.translate(var515, var521, var533);
                    Matrix4f var301 = var467.rotateX(var299);
                    String var302 = var280.bone();
                    boolean var303 = var302.equals("body");
                    if (var303) {
                        var7 = switch (var7) {
                            default -> var7 ^ 519665081;
                            case -1261775479 -> var7 ^ 1588582475;
                            case -501817704 -> {
                                var7 *= -688956705;
                                var7 -= 1955369396;
                                var7 += -1778916695;
                                var7 <<= 12;
                                yield var7 ^ -690902532;
                            }
                        };
                        int var304 = var8 + 1;
                        var304 = var8 * var304;
                        var463 = var8 + 2;
                        var304 *= var463;
                        var463 = var8 + 3;
                        var304 *= var463;
                        var304 &= 7;
                        if (var304 != 0) {
                            break label423;
                        }

                        Matrix4f var309 = this.g;
                        long var470 = var9;
                        long var522 = var470 + 1L;
                        long var523 = var470 * var522;
                        long var471 = var523 & 1L;
                        long var548;
                        var463 = (var548 = var471 - 0L) == 0L ? 0 : (var548 < 0L ? -1 : 1);
                        if (var463 != 0) {
                            var7 *= -860300889;
                            var7 += -1755601622;
                            var7 ^= -518507761;
                            break;
                        }
                        var7 = switch (var7) {
                            case -1364096586 -> var7 ^ -1673009831;
                            default -> var7 ^ -626499688;
                            case -593200644 -> {
                                var7 &= -619281694;
                                var7 -= -1704336773;
                                var7 += 898316164;
                                var7 ^= 988134245;
                                yield var7 ^ -2061807892;
                            }
                        };
                        long var473 = var8;
                        long var524 = var473 + 1L;
                        long var525 = var473 * var524;
                        long var474 = var525 & 1L;
                        long var549;
                        var463 = (var549 = var474 - 0L) == 0L ? 0 : (var549 < 0L ? -1 : 1);
                        if (var463 != 0) {
                            break label423;
                        }

                        Matrix4f var310 = var309.rotateY(0.6F);
                        var7 *= 984549535;
                        var7 *= 997397465;
                        var7 ^= -95106319;
                    } else {
                        switch (var7) {
                            case -501817704:
                                var7 += -753311743;
                                var7 ^= -1200248045;
                                var7 ^= 89298395;
                                break;
                            case 1021136281:
                                var7 ^= 1417549539;
                                break;
                            case 1962284870:
                            default:
                                var7 ^= -1967694722;
                        }
                    }

                    long var476 = var8;
                    long var526 = var476 + 1L;
                    long var527 = var476 * var526;
                    long var22 = var476 + 2L;
                    long var528 = var527 * var22;
                    long var477 = var476 + 3L;
                    long var529 = var528 * var477;
                    long var478 = var529 & 7L;
                    long var550;
                    int var311 = (var550 = var478 - 0L) == 0L ? 0 : (var550 < 0L ? -1 : 1);
                    if (var311 != 0) {
                        break label423;
                    }

                    Matrix4f var312 = this.g;
                    float var479 = var431[0];
                    float var480 = -var479;
                    float var516 = var431[1];
                    float var517 = -var516;
                    float var432 = var431[2];
                    float var433 = -var432;
                    Matrix4f var313 = var312.translate(var480, var517, var433);
                    Matrix4f var314 = this.g;
                    float var434 = var344[0];
                    Integer var481 = var9;
                    if (var481 == null) {
                        var7 <<= 21;
                        var7 >>>= 1;
                        var7 *= 1872407991;
                        var7 += 555816826;
                        var7 ^= 27586811;
                        break;
                    }

                    var7 ^= 2030838229;
                    var7 ^= 1052917678;
                    var7 -= -1316218524;
                    var7 ^= -640518565;
                    int var482 = var8 + 1;
                    var482 = var8 * var482;
                    int var518 = var8 + 2;
                    var482 *= var518;
                    int var519 = var8 + 3;
                    var482 *= var519;
                    var482 &= 7;
                    if (var482 != 0) {
                        break label423;
                    }

                    float var487 = var344[1];
                    float var345 = var344[2];
                    float var520 = var362[0];
                    var521 = var362[1];
                    float var363 = var362[2];
                    float[][] var281 = var280.uv();
                    var1.uT(var314, var434, var487, var345, var520, var521, var363, var3, var281, 128.0F, 32.0F, var6);
                    int var282 = var12 + 1;
                    var12 = var282;
                    var7 ^= 1005731756;
                    var7 -= -1645929927;
                    var7 ^= 621315045;
                }
            }

            RuntimeException var267 = new RuntimeException();
            throw var267;
        }

        RuntimeException var260 = new RuntimeException();
        throw var260;
    }

    private static float[] uX(JsonArray var0, int var1) {
        label80: {
            int var3 = System.identityHashCode(var0);
            int var4 = var0.size();
            float[] var49 = new float[var4];
            int var5 = var3 + 1;
            var5 = var3 * var5;
            int var6 = var3 + 2;
            var5 *= var6;
            var6 = var3 + 3;
            var5 *= var6;
            var5 &= 7;
            int var35;
            if (var5 != 0) {
                var35 = var1 << 21;
                var35 >>= 14;
                var35 ^= 1957829528;
            } else {
                var35 = var1 >> 30;
                var35 |= 1043958226;
                var35 ^= -474652044;
                Integer var55 = var35;
                if (var55 == null) {
                    break label80;
                }

                float[] var50 = var49;
                byte var56 = 0;
                int var57 = var56;
                var35 ^= 368847175;
                var35 *= 1411129301;
                var35 ^= 2068249944;

                while (true) {
                    var6 = var35 + 1;
                    var6 = var35 * var6;
                    int var7 = var35 + 2;
                    var6 *= var7;
                    var7 = var35 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 != 0) {
                        break label80;
                    }

                    var6 = var50.length;
                    long var72 = var3;
                    long var9 = var72 + 1L;
                    var9 = var72 * var9;
                    long var73 = var9 & 1L;
                    long var88;
                    var7 = (var88 = var73 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
                    if (var7 != 0) {
                        var35 += -2076106537;
                        var35 *= -47157435;
                        var35 &= 1524129952;
                        var35 ^= -502676289;
                        var35 ^= 1004352295;
                        break;
                    }

                    var35 *= 178843435;
                    var35 += -942559492;
                    var35 |= 1176811418;
                    var35 ^= -1511327000;
                    Integer var75 = var35;
                    if (var75 == null) {
                        break label80;
                    }

                    if (var57 >= var6) {
                        var35 += -154511476;
                        var35 |= -461513562;
                        var35 ^= -1639622314;
                        Integer var48 = var35;
                        if (var48 != null) {
                            return var50;
                        }
                        break label80;
                    }
                    var35 = switch (var35) {
                        case -1034597069 -> {
                            var35 &= 1282352797;
                            var35 >>>= 9;
                            var35 |= 323832338;
                            var35 |= 2072783016;
                            yield var35 ^ -1491699384;
                        }
                        case 136446277 -> var35 ^ 1052560967;
                        default -> var35 ^ -1713739861;
                    };
                    var6 = var35 + 1;
                    var6 = var35 * var6;
                    var6 &= 1;
                    if (var6 != 0) {
                        break label80;
                    }

                    JsonElement var68 = var0.get(var57);
                    float var69 = var68.getAsFloat();
                    var50[var57] = var69;
                    var6 = var57 + 1;
                    long var76 = var3;
                    var9 = var76 + 1L;
                    var9 = var76 * var9;
                    long var11 = var76 + 2L;
                    var9 *= var11;
                    long var77 = var76 + 3L;
                    var9 *= var77;
                    long var78 = var9 & 7L;
                    long var89;
                    int var79 = (var89 = var78 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                    if (var79 != 0) {
                        var35 &= 303005281;
                        var35 |= 974379461;
                        var35 *= -835622245;
                        var35 |= 632892193;
                        var35 ^= -1091360705;
                        break;
                    }

                    var35 >>= 20;
                    var35 ^= 1199306416;
                    var79 = var35 + 1;
                    var79 = var35 * var79;
                    var79 &= 1;
                    if (var79 != 0) {
                        break label80;
                    }

                    var57 = var6;
                    switch (var35) {
                        case -1992797681:
                        default:
                            var35 ^= 540488600;
                            break;
                        case -1199305857:
                            var35 += -1849774879;
                            var35 |= 653226759;
                            var35 ^= -2018614774;
                            break;
                        case 1519165135:
                            var35 ^= -2039103436;
                    }
                }
            }

            Integer var45 = var35;
            if (var45 != null) {
                IllegalStateException var47 = new IllegalStateException();
                throw var47;
            }
        }

        IllegalArgumentException var46 = new IllegalArgumentException();
        throw var46;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 844475135;
        byte var2 = 0;
        int var4 = of_2.ro(var3, var1, var2);
        p = var4;
    }
}
