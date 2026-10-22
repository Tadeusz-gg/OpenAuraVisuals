package dev.aurap.hub;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.texture.PlayerSkinProvider;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.player.SkinTextures;

public final class Sw extends OtherClientPlayerEntity {
    public static final String NAME = "Top1_Grzybalson";
    private static final UUID Ir;
    private SkinTextures oz;
    public static final int Ys;

    static {
        Ys = of_2.xF(MethodHandles.lookup().lookupClass(), 1987247038, 0);
        Ir = UUID.fromString("ff5cf084-915e-42a3-b11c-a68c12f59c1b");
    }

    public Sw(ClientWorld var1) {
        super(var1, V(556057074));
        GameProfile var2 = V(556057074);

        UUID var5 = UUID.randomUUID();
        this.setUuid(var5);
        DataTracker var6 = this.getDataTracker();
        TrackedData var3 = PLAYER_MODE_CUSTOMIZATION_ID;
        Byte var4 = (byte)127;
        var6.set(var3, var4);
        UUID var7 = Ir;
        SkinTextures var8 = DefaultSkinHelper.getSkinTextures(var7);
        this.oz = var8;
        MinecraftClient var9 = MinecraftClient.getInstance();
        PlayerSkinProvider var10 = var9.getSkinProvider();
        GameProfile var13 = this.getGameProfile();
        CompletableFuture var11 = var10.fetchSkinTextures(var13);
        Consumer<java.util.Optional<SkinTextures>> var14 = var1x -> {
            int var2x = Ys;
            var2x ^= -687327402;
            int var3x = System.identityHashCode(this);
            MinecraftClient var4x = MinecraftClient.getInstance();
            Runnable var5x = () -> {
                int var2xx = Ys;
                var2xx ^= 311546377;
                int var3xx = System.identityHashCode(this);
                int var4xx = var3xx + 1;
                var4xx = var3xx * var4xx;
                var3xx = var4xx & 1;
                if (var3xx == 0) {
                    var2xx >>>= 8;
                    var2xx ^= 491366301;
                    var2xx *= -366683023;
                    var2xx ^= 74738001;
                    var2xx ^= -1997537220;
                    Consumer<SkinTextures> var18x = var1xxx -> {
                        int var2xxx = Ys;
                        var2xxx ^= 1372640884;
                        int var3xxx = System.identityHashCode(this);
                        Integer var19x = var3xxx;
                        if (var19x == null) {
                            var2xxx |= -1059089302;
                            var2xxx &= 2010638093;
                            var2xxx ^= -298293243;
                            long var20 = var2xxx;
                            long var5xxx = var20 + 1L;
                            var5xxx = var20 * var5xxx;
                            long var21 = var5xxx & 1L;
                            long var29;
                            int var22 = (var29 = var21 - 0L) == 0L ? 0 : (var29 < 0L ? -1 : 1);
                            if (var22 == 0) {
                                IllegalArgumentException var23 = new IllegalArgumentException();
                                throw var23;
                            }
                        } else {
                            var2xxx = switch (var2xxx) {
                                case -1536942622 -> {
                                    var2xxx >>>= 3;
                                    var2xxx += 804093407;
                                    var2xxx &= 2072708680;
                                    var2xxx -= -32625019;
                                    yield var2xxx ^ 1245726465;
                                }
                                case -1457831175 -> var2xxx ^ 364921712;
                                default -> var2xxx ^ -1574780543;
                            };
                            int var24 = var2xxx + 1;
                            var24 = var2xxx * var24;
                            int var4xxx = var2xxx + 2;
                            var24 *= var4xxx;
                            var2xxx += 3;
                            var24 *= var2xxx;
                            var2xxx = var24 & 7;
                            if (var2xxx == 0) {
                                this.oz = var1xxx;
                                return;
                            }
                        }

                        AssertionError var18xx = new AssertionError();
                        throw var18xx;
                    };
                    var1x.ifPresent(var18x);
                } else {
                    switch (var2xx) {
                        case -1471779922:
                        default:
                            var2xx ^= 1201259312;
                            break;
                        case -416999009:
                            var2xx |= -895816923;
                            var2xx &= -1571511429;
                            var2xx ^= -863512875;
                            break;
                        case 160815671:
                            var2xx ^= 1968444075;
                    }

                    AssertionError var11xx = new AssertionError();
                    throw var11xx;
                }
            };
            Integer var18 = var3x;
            if (var18 != null) {
                switch (var2x) {
                    case -315538256:
                    default:
                        var2x ^= 1434092618;
                        break;
                    case -104819522:
                        var2x ^= -508873521;
                        break;
                    case 582810816:
                        var2x += -1577785134;
                        var2x &= -1678398145;
                        var2x ^= 1399397214;
                }

                var4x.execute(var5x);
            } else {
                var2x += 1540443378;
                var2x ^= 546813996;
                var2x ^= -763586641;
                Integer var10x = var2x;
                if (var10x == null) {
                    RuntimeException var12x = new RuntimeException();
                    throw var12x;
                } else {
                    RuntimeException var11x = new RuntimeException();
                    throw var11x;
                }
            }
        };
        CompletableFuture var12 = var11.thenAccept(var14);
    }

    public SkinTextures getSkin() {
        int var1 = Ys;
        var1 ^= -753935062;
        int var2 = System.identityHashCode(this);
        long var22 = var2;
        long var4 = var22 + 1L;
        var4 = var22 * var4;
        long var6 = var22 + 2L;
        var4 *= var6;
        long var23 = var22 + 3L;
        var4 *= var23;
        long var24 = var4 & 7L;
        long var33;
        var2 = (var33 = var24 - 0L) == 0L ? 0 : (var33 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 &= -532379080;
            var1 <<= 22;
            var1 *= 367412281;
            var1 ^= 193062823;
            Integer var26 = var1;
            if (var26 != null) {
                return this.oz;
            }
        } else {
            var1 *= -839831893;
            var1 |= -951546156;
            var1 ^= -1255167915;
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
                UnsupportedOperationException var21 = new UnsupportedOperationException();
                throw var21;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public boolean skinLoaded() {
        int var1 = Ys;
        var1 ^= -461967995;
        int var2 = System.identityHashCode(this);
        SkinTextures var3 = this.oz;
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var58;
        var2 = (var58 = var4 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
        if (var2 != 0) {
            var4 = switch (var1) {
                default -> var1 ^ -1611647583;
                case 297936403 -> {
                    var1 += 1528274478;
                    var1 >>= 23;
                    var1 >>>= 13;
                    yield var1 ^ 60194625;
                }
                case 1239282849 -> var1 ^ 1158145845;
            };
            var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var59;
            var2 = (var59 = var4 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var33 = new AssertionError();
                throw var33;
            }
        } else {
            var1 = switch (var1) {
                default -> var1 ^ -980463706;
                case 297936403 -> {
                    var1 >>>= 27;
                    var1 -= 958061864;
                    yield var1 ^ -373331757;
                }
                case 1247374630 -> var1 ^ -1690056643;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            label50:
            if (var2 == 0) {
                UUID var37 = Ir;
                SkinTextures var38 = DefaultSkinHelper.getSkinTextures(var37);
                boolean var39 = var3.equals(var38);
                if (!var39) {
                    var1 &= 1210555960;
                    var1 -= -732771045;
                    var1 *= 1955495379;
                    var1 ^= -308105284;
                    Integer var40 = var1;
                    if (var40 == null) {
                        break label50;
                    }

                    var39 = true;
                    switch (var1) {
                        case -1618344534:
                        default:
                            var1 ^= 742036351;
                            break;
                        case -1274650645:
                            var1 += -1054399482;
                            var1 -= -348103995;
                            var1 ^= -959924140;
                            break;
                        case 232863012:
                            var1 ^= 811970401;
                    }
                } else {
                    var1 <<= 17;
                    var1 *= -1038502239;
                    var1 ^= -1833428330;
                    Integer var42 = var1;
                    if (var42 == null) {
                        break label50;
                    }

                    var39 = false;
                    var1 -= 741458344;
                    var1 ^= 43895190;
                }

                long var43 = var1;
                long var5 = var43 + 1L;
                var5 = var43 * var5;
                long var7 = var43 + 2L;
                var5 *= var7;
                long var44 = var43 + 3L;
                var5 *= var44;
                long var45 = var5 & 7L;
                long var60;
                var1 = (var60 = var45 - 0L) == 0L ? 0 : (var60 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return var39;
                }
            }
        }

        IllegalArgumentException var30 = new IllegalArgumentException();
        throw var30;
    }

    private static GameProfile V(int param0) {
        try (java.io.InputStream in = Sw.class.getResourceAsStream("/assets/auravisuals/ghost/top1_grzybalson.json")) {
            com.google.gson.JsonObject root = com.google.gson.JsonParser.parseReader(
                    new java.io.InputStreamReader(java.util.Objects.requireNonNull(in), java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject();
            com.google.gson.JsonArray props = root.getAsJsonArray("properties");
            com.google.common.collect.Multimap<String, com.mojang.authlib.properties.Property> mmap = com.google.common.collect.ArrayListMultimap.create();
            com.mojang.authlib.properties.PropertyMap propertyMap = new com.mojang.authlib.properties.PropertyMap(mmap);
            if (props != null) {
                for (com.google.gson.JsonElement elem : props) {
                    com.google.gson.JsonObject prop = elem.getAsJsonObject();
                    String name = prop.get("name").getAsString();
                    String value = prop.get("value").getAsString();
                    String signature = prop.has("signature") ? prop.get("signature").getAsString() : null;
                    propertyMap.put(name, new com.mojang.authlib.properties.Property(name, value, signature));
                }
            }
            return new GameProfile(Sw.Ir, NAME, propertyMap);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot read ghost skin profile", e);
        }
    }

    private static Throwable ZE(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
