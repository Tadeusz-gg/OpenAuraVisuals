package dev.aurap.hub;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.util.concurrent.CompletionException;
import javax.sound.sampled.AudioFormat;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import dev.skidware.visuals.mixin.CooldownInstanceAccessor;
import dev.skidware.visuals.mixin.ItemCooldownsAccessor;
import dev.skidware.visuals.mixin.OverlayTextureAccessor;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.AuraRenderer$State;
import dev.skidware.visuals.render.RenderTarget;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Function;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.registry.RegistryWrapper;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.block.BlockState;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.DebugHud;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Overlay;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.entity.EntityRenderManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.resource.language.LanguageManager;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundManager;
import net.minecraft.client.sound.StaticSound;
import net.minecraft.client.sound.WeightedSoundSet;
import net.minecraft.client.sound.SoundSystem.PlayResult;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.InputUtil.Key;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity.RemovalReason;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerSkinType;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticlesMode;
import net.minecraft.registry.DefaultedRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.Impl;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntry.Reference;
import net.minecraft.resource.DataConfiguration;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.CommandOutput;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.server.integrated.IntegratedServerLoader;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Atlases;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.AssetInfo.TextureAsset;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameMode;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import net.minecraft.world.gen.GeneratorOptions;
import net.minecraft.world.gen.WorldPreset;
import net.minecraft.world.gen.WorldPresets;
import net.minecraft.world.level.LevelInfo;
import net.minecraft.world.rule.GameRules;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Quaternionf;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class i_2 {
    public static final int XZ = 256;
    public static final int CP = 259;
    public static final int Y = 261;
    public static final int hV = 344;
    public static final int hq = 71;
    public static final Logger LOG;
    private static final Map Jq;
    private static final Map mh;
    private static final EquipmentSlot[] F;
    private static int y = -1000000;
    private static final Mutable W;
    public static final int TK = -1291911168;
    private static final CommandOutput CO;
    public static final int h;

    private i_2() {
    }

    private static MinecraftClient zp() {
        return MinecraftClient.getInstance();
    }

    public static double qJ() {
        int var0 = h;
        var0 ^= -615152464;
        MinecraftClient var1 = zp();
        Window var14 = var1.getWindow();
        var0 *= 1905427291;
        var0 ^= 2114632422;
        var0 ^= -1340291440;
        var0 ^= 530551437;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        var2 = var4 & 1L;
        long var17;
        var0 = (var17 = var2 - 0L) == 0L ? 0 : (var17 < 0L ? -1 : 1);
        if (var0 == 0) {
            var0 = var14.getScaleFactor();
            return var0;
        } else {
            IllegalStateException var12 = new IllegalStateException();
            throw var12;
        }
    }

    public static int qy() {
        int var0 = h;
        var0 ^= -1288916778;
        MinecraftClient var1 = zp();
        var0 -= 340599316;
        var0 += 196473226;
        var0 >>= 9;
        var0 <<= 11;
        var0 ^= -72609151;
        Window var8 = var1.getWindow();
        return var8.getFramebufferWidth();
    }

    public static int CS() {
        int var0 = h;
        var0 ^= 1540118561;
        MinecraftClient var1 = zp();
        Window var7 = var1.getWindow();
        var0 ^= 474353324;
        var0 *= 406487707;
        var0 *= -464232741;
        var0 ^= 1290476563;
        return var7.getFramebufferHeight();
    }

    public static float u() {
        int var0 = h;
        var0 ^= 43879032;
        MinecraftClient var1 = zp();
        RenderTickCounter var7 = var1.getRenderTickCounter();
        var0 >>= 14;
        var0 ^= -1846051625;
        Integer var5 = var0;
        if (var5 != null) {
            return var7.getTickProgress(true);
        } else {
            UnsupportedOperationException var6 = new UnsupportedOperationException();
            throw var6;
        }
    }

    public static int r() {
        int var0 = h;
        var0 ^= 1941049384;
        MinecraftClient var1 = zp();
        var0 ^= -2019966136;
        var0 ^= -339613233;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        var2 = var4 & 1L;
        long var13;
        var0 = (var13 = var2 - 0L) == 0L ? 0 : (var13 < 0L ? -1 : 1);
        if (var0 == 0) {
            return var1.getCurrentFps();
        } else {
            IllegalStateException var10 = new IllegalStateException();
            throw var10;
        }
    }

    public static String s() {
        int var0 = h;
        var0 ^= -919761532;
        FabricLoader var1 = FabricLoader.getInstance();
        Optional var8 = var1.getModContainer("minecraft");
        Function<ModContainer, String> var2 = (ModContainer var0x) -> {
            int var1x = h;
            var1x ^= -1787684100;
            int var2x = System.identityHashCode(var0x);
            int var3x = var2x + 1;
            var3x = var2x * var3x;
            var2x = var3x & 1;
            if (var2x != 0) {
                var1x -= -1288469049;
                var1x &= 232642467;
                var1x ^= 822155221;
                Integer var13 = var1x;
                if (var13 != null) {
                    RuntimeException var15 = new RuntimeException();
                    throw var15;
                } else {
                    IllegalArgumentException var14 = new IllegalArgumentException();
                    throw var14;
                }
            } else {
                var1x |= 660467706;
                var1x ^= -1814980388;
                ModMetadata var7x = var0x.getMetadata();
                Version var8x = var7x.getVersion();
                return var8x.getFriendlyString();
            }
        };
        Optional var9 = var8.map(var2);
        var0 -= 1710778255;
        var0 &= 611543888;
        var0 ^= 92112741;
        Object var7 = var9.orElse("?");
        return (String)var7;
    }

    public static boolean BD() {
        int var0 = h;
        var0 ^= -409710134;
        MinecraftClient var1 = zp();
        ClientWorld var43 = var1.world;

        var0 = switch (var0) {
            case -964599100 -> {
                var0 |= 1213573852;
                var0 -= 2141138197;
                yield var0 ^ -1065038944;
            }
            case -62302917 -> var0 ^ 1432374469;
            default -> var0 ^ -609876087;
        };
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label52:
        if (var2 == 0) {
            if (var43 != null) {
                var0 *= 80109055;
                var0 ^= 1626283893;
                Integer var44 = var0;
                if (var44 == null) {
                    break label52;
                }

                var1 = zp();
                ClientPlayerEntity var46 = var1.player;
                var0 *= 1575673403;
                var0 &= -1786217153;
                var0 ^= -85010467;
                var0 >>= 5;
                var0 ^= -1068175751;
                Integer var55 = var0;
                if (var55 == null) {
                    break label52;
                }

                if (var46 != null) {
                    var0 |= -1337308799;
                    var0 ^= -1559326306;
                    var0 ^= -1236281072;
                    long var47 = var0;
                    long var62 = var47 + 1L;
                    long var63 = var47 * var62;
                    long var48 = var63 & 1L;
                    long var66;
                    int var49 = (var66 = var48 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                    if (var49 != 0) {
                        break label52;
                    }

                    boolean var50 = true;
                    switch (var0) {
                        case -1439788791:
                            var0 -= 1592229522;
                            var0 ^= 100648379;
                            var0 >>= 1;
                            var0 -= -1066043743;
                            var0 ^= -773672267;
                            return var50;
                        case -1330420336:
                        default:
                            var0 ^= 1266435753;
                            return var50;
                        case 462619477:
                            var0 ^= 2037092830;
                            return var50;
                    }
                }

                var0 += -494508937;
                var0 |= 1127180398;
                var0 *= -1001201277;
                var0 &= 822129853;
                var0 ^= -2004200830;
            } else {
                var0 &= 616708846;
                var0 >>>= 21;
                var0 += 1171618156;
                var0 -= -963018089;
                var0 ^= -944689082;
            }

            var2 = var0 + 1;
            var2 = var0 * var2;
            var3 = var0 + 2;
            var2 *= var3;
            var3 = var0 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                boolean var67 = false;
                switch (var0) {
                    case -1198864705:
                        var0 |= -1023559198;
                        var0 ^= -393898762;
                        var0 &= 1743340941;
                        var0 &= 877861768;
                        var0 ^= -1220262152;
                        break;
                    case -327674342:
                    default:
                        var0 ^= 694091023;
                        break;
                    case 320235585:
                        var0 ^= 1478757504;
                }

                return var67;
            }
        }

        IllegalArgumentException var42 = new IllegalArgumentException();
        throw var42;
    }

    public static boolean b() {
        int var0 = h;
        var0 ^= 1276361250;
        MinecraftClient var1 = zp();
        GameOptions var10 = var1.options;
        switch (var0) {
            case -2061750081:
                var0 ^= -880638089;
                break;
            case 1287660661:
            default:
                var0 ^= 379955383;
                break;
            case 1829144876:
                var0 |= -1695563488;
                var0 *= -1453105555;
                var0 *= -490186815;
                var0 |= -1892215100;
                var0 ^= 2011504896;
        }

        return var10.hudHidden;
    }

    public static Screen vB() {
        int var0 = h;
        var0 ^= -18863017;
        MinecraftClient var1 = zp();
        var0 &= 500779890;
        var0 += 448990115;
        var0 -= 1156742826;
        var0 ^= 582234513;
        return var1.currentScreen;
    }

    public static boolean Wt() {
        int var0 = h;
        var0 ^= -720908981;
        Screen var1 = vB();
        var0 >>>= 21;
        var0 &= -54966539;
        var0 ^= 1625004341;
        Integer var2 = var0;
        if (var2 != null) {
            if (var1 != null) {
                var0 -= 242584649;
                var0 ^= 1459910486;
                boolean var24 = true;
                var0 &= -125580106;
                var0 *= 2147265951;
                var0 ^= 2096496324;
                var0 ^= -300735085;
                var0 ^= 1848646617;
                return var24;
            }

            var0 -= -952582735;
            var0 ^= -471036429;
            var2 = var0;
            if (var2 != null) {
                boolean var21 = false;
                var0 |= -1827222539;
                var0 |= -2932242;
                var0 |= -914146353;
                var0 += -1672502149;
                var0 ^= 433657306;
                return var21;
            }
        }

        AssertionError var23 = new AssertionError();
        throw var23;
    }

    public static void m(Screen var0) {
        int var1 = h;
        var1 ^= 1740697435;
        int var2 = System.identityHashCode(var0);
        Integer var12 = var2;
        if (var12 == null) {
            var1 &= 1680734591;
            var1 -= 1132589286;
            var1 ^= -103020477;
            var12 = var1;
            if (var12 == null) {
                IllegalStateException var15 = new IllegalStateException();
                throw var15;
            } else {
                RuntimeException var14 = new RuntimeException();
                throw var14;
            }
        } else {
            var1 &= -1470298861;
            var1 *= -55657123;
            var1 &= -357012545;
            var1 ^= -1601705702;
            MinecraftClient var8 = zp();
            var8.setScreen(var0);
        }
    }

    public static boolean YE() {
        int var0 = h;
        var0 ^= 1386136932;
        MinecraftClient var1 = zp();
        Overlay var55 = var1.getOverlay();
        var0 *= 2003679141;
        var0 <<= 3;
        var0 ^= -1951058958;
        var0 ^= 106672235;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        long var6 = var2 + 2L;
        var4 *= var6;
        var2 += 3L;
        var4 *= var2;
        var2 = var4 & 7L;
        long var77;
        int var63 = (var77 = var2 - 0L) == 0L ? 0 : (var77 < 0L ? -1 : 1);
        label74:
        if (var63 == 0) {
            boolean var57;
            if (var55 != null) {
                var0 = switch (var0) {
                    case -1823253788 -> var0 ^ -1947032613;
                    case 906117385 -> {
                        var0 |= 1750432960;
                        var0 &= 708566958;
                        var0 &= 268832753;
                        var0 &= -1776187575;
                        yield var0 ^ 823448637;
                    }
                    default -> var0 ^ 670445522;
                };
                Integer var56 = var0;
                if (var56 == null) {
                    break label74;
                }

                var57 = true;
                switch (var0) {
                    case -900308134:
                    default:
                        var0 ^= -2095270668;
                        break;
                    case -320959062:
                        var0 ^= 550539730;
                        break;
                    case 823447869:
                        var0 &= -1897682468;
                        var0 &= -1956150497;
                        var0 ^= -672789940;
                        var0 ^= -2133723298;
                }
            } else {
                var0 = switch (var0) {
                    default -> var0 ^ 2021317492;
                    case -1100229638 -> var0 ^ 138570871;
                    case 906117385 -> {
                        var0 -= -1490934826;
                        var0 |= 673896897;
                        var0 |= 367374306;
                        var0 += 1808804148;
                        yield var0 ^ -1958425306;
                    }
                };
                Integer var64 = var0;
                if (var64 == null) {
                    break label74;
                }

                var57 = false;
                switch (var0) {
                    case -1601903615:
                        var0 ^= 768873679;
                        var0 <<= 28;
                        var0 *= -604273983;
                        var0 ^= -1221100530;
                        break;
                    case -1210306657:
                    default:
                        var0 ^= -1336448096;
                        break;
                    case 850640582:
                        var0 ^= -856776118;
                }
            }
            var0 = switch (var0) {
                default -> var0 ^ -481299510;
                case -806319901 -> var0 ^ 1866871446;
                case 1463254030 -> {
                    var0 |= 43051709;
                    yield var0 ^ -887264249;
                }
            };
            var2 = var0;
            var4 = var2 + 1L;
            var4 = var2 * var4;
            var2 = var4 & 1L;
            long var78;
            int var67 = (var78 = var2 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
            label64:
            if (var67 == 0) {
                if (!var57) {
                    var0 *= 158770443;
                    var0 ^= 1016250729;
                    Screen var58 = vB();
                    boolean var59 = var58 instanceof TitleScreen;
                    var0 -= 67154457;
                    var0 *= -36275257;
                    var0 -= -733014046;
                    var0 ^= 1951132101;
                    Integer var68 = var0;
                    if (var68 == null) {
                        break label64;
                    }

                    if (var59) {
                        var0 |= 377331786;
                        var0 ^= -207485761;
                        boolean var60 = true;
                        var0 *= 1570506837;
                        var0 &= -2079436873;
                        var0 ^= -1465437568;
                        return var60;
                    }

                    var0 &= -1061008819;
                    var0 ^= -136251633;
                } else {
                    var0 &= 1335451931;
                    var0 ^= 178164172;
                    var0 >>>= 15;
                    var0 |= 67869645;
                    var0 ^= -215389469;
                }

                int var69 = var0 + 1;
                int var70 = var0 * var69;
                int var71 = var70 & 1;
                if (var71 == 0) {
                    boolean var79 = false;
                    var0 ^= 1581529751;
                    var0 ^= -1106788904;
                    var0 += 933136429;
                    var0 >>= 9;
                    var0 ^= 746868073;
                    return var79;
                }
            }
        }

        AssertionError var54 = new AssertionError();
        throw var54;
    }

    public static bS js() {
        int var0 = h;
        var0 ^= -765126457;
        ClientRuntime var1 = ClientRuntime.Z();
        var0 >>>= 25;
        var0 &= -909908913;
        var0 -= 2116412404;
        var0 ^= 1471561473;
        Integer var7 = var0;
        if (var7 == null) {
            UnsupportedOperationException var8 = new UnsupportedOperationException();
            throw var8;
        } else {
            return var1.Mv();
        }
    }

    public static void W() {
        int var0 = h;
        var0 ^= -1425083103;
        Screen var1 = vB();
        boolean var35 = var1 instanceof mD;
        var0 |= -1228830988;
        var0 >>>= 5;
        var0 ^= -1661731247;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        long var6 = var2 + 2L;
        var4 *= var6;
        var2 += 3L;
        var4 *= var2;
        var2 = var4 & 7L;
        long var72;
        int var47 = (var72 = var2 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
        if (var47 == 0) {
            if (var35) {
                switch (var0) {
                    case -1727717274:
                        var0 += 1298999677;
                        var0 >>>= 4;
                        var0 ^= 871554368;
                        break;
                    case 903792132:
                    default:
                        var0 ^= -1077413089;
                        break;
                    case 970679703:
                        var0 ^= -1164076132;
                }

                return;
            }
            var0 = switch (var0) {
                case -1727717274 -> {
                    var0 &= 1857001918;
                    yield var0 ^ -1566506998;
                }
                case -652760770 -> var0 ^ -1891009530;
                default -> var0 ^ -2141316534;
            };
            long var36 = var0;
            long var3 = var36 + 1L;
            var3 = var36 * var3;
            long var37 = var3 & 1L;
            long var73;
            int var38 = (var73 = var37 - 0L) == 0L ? 0 : (var73 < 0L ? -1 : 1);
            if (var38 == 0) {
                ClientRuntime var39 = ClientRuntime.Z();
                var0 ^= -1869975405;
                var0 ^= 308169773;
                var2 = var0;
                var4 = var2 + 1L;
                var4 = var2 * var4;
                var2 = var4 & 1L;
                long var74;
                int var50 = (var74 = var2 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                if (var50 == 0) {
                    AuraRenderer var40 = var39.ZP();
                    AuraRenderer$State var51 = var40.state();
                    AuraRenderer$State var62 = AuraRenderer$State.DISABLED;
                    if (var51 == var62) {
                        var0 ^= -2021467854;
                        var0 -= 1020941115;
                        var0 &= -2085679776;
                        var0 ^= -1871868905;
                        int var52 = var0 + 1;
                        int var53 = var0 * var52;
                        int var63 = var0 + 2;
                        int var54 = var53 * var63;
                        int var64 = var0 + 3;
                        int var55 = var54 * var64;
                        int var56 = var55 & 7;
                        if (var56 == 0) {
                            String var41 = var40.status();
                            var0 ^= 540840931;
                            var0 ^= 814532098;
                            var2 = var0;
                            var4 = var2 + 1L;
                            var4 = var2 * var4;
                            var2 = var4 & 1L;
                            long var75;
                            int var59 = (var75 = var2 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                            if (var59 == 0) {
                                String var42 = "§cAura Visuals: menu unavailable - " + var41;
                                Je(var42);
                                return;
                            }
                        }
                    } else {
                        var0 = switch (var0) {
                            case -1930671344 -> var0 ^ 15922885;
                            default -> var0 ^ 847888046;
                            case 678444178 -> {
                                var0 += -1326510446;
                                var0 += -2105827631;
                                var0 += 238957691;
                                var0 *= -8970003;
                                yield var0 ^ -718355597;
                            }
                        };
                        Integer var43 = var0;
                        if (var43 != null) {
                            bS var60 = js();
                            mD var44 = new mD(var60);
                            var0 += -1906752714;
                            var0 ^= 969070710;
                            m(var44);
                            return;
                        }
                    }
                }
            }
        }

        IllegalArgumentException var27 = new IllegalArgumentException();
        throw var27;
    }

    public static void y(String var0) {
        int var1 = h;
        var1 ^= -1366086701;
        int var2 = System.identityHashCode(var0);
        Integer var17 = var2;
        if (var17 != null) {
            var1 &= -90831868;
            var1 &= 1897618128;
            var1 *= 1804703431;
            var1 ^= -449633472;
            long var18 = var1;
            long var4 = var18 + 1L;
            var4 = var18 * var4;
            long var19 = var4 & 1L;
            long var25;
            int var20 = (var25 = var19 - 0L) == 0L ? 0 : (var25 < 0L ? -1 : 1);
            if (var20 != 0) {
                AssertionError var23 = new AssertionError();
                throw var23;
            } else {
                MinecraftClient var21 = zp();
                Keyboard var22 = var21.keyboard;
                var22.setClipboard(var0);
            }
        } else {
            var1 &= 1572723665;
            var1 ^= 1765717375;
            var1 &= -2053622660;
            var1 += 1807279735;
            var1 ^= -75504739;
            UnsupportedOperationException var12 = new UnsupportedOperationException();
            throw var12;
        }
    }

    public static void Je(String var0) {
        label57: {
            int var1 = h;
            var1 ^= -1645548939;
            int var2 = System.identityHashCode(var0);
            MinecraftClient var3 = zp();
            ClientPlayerEntity var43 = var3.player;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var65;
            int var52 = (var65 = var4 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
            if (var52 != 0) {
                var1 &= 1819251891;
                var1 >>= 29;
                var1 *= -937750341;
                var1 >>= 8;
                var1 ^= 1679729640;
            } else {
                var1 |= 1944254230;
                var1 *= 113304519;
                var1 += 1571083022;
                var1 ^= 692732132;
                Integer var53 = var1;
                if (var53 == null) {
                    break label57;
                }

                if (var43 == null) {
                    Integer var50 = switch (var1) {
                        case -549958877 -> {
                            var1 &= -1906851329;
                            var1 -= 9080450;
                            var1 *= -1443361777;
                            var1 >>>= 20;
                            yield var1 ^ -134071246;
                        }
                        case -52974032 -> var1 ^ 274297832;
                        default -> var1 ^ 884120921;
                    };
                    if (var50 != null) {
                        return;
                    }
                    break label57;
                }
                var1 = switch (var1) {
                    case -549958877 -> {
                        var1 >>= 21;
                        var1 |= 2096593555;
                        yield var1 ^ -1892376924;
                    }
                    default -> var1 ^ -1196168904;
                    case 1281428620 -> var1 ^ -120223214;
                };
                long var44 = var1;
                long var5 = var44 + 1L;
                var5 = var44 * var5;
                long var7 = var44 + 2L;
                var5 *= var7;
                long var45 = var44 + 3L;
                var5 *= var45;
                long var46 = var5 & 7L;
                long var66;
                int var47 = (var66 = var46 - 0L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
                if (var47 != 0) {
                    break label57;
                }

                var3 = zp();
                ClientPlayerEntity var49 = var3.player;
                MutableText var54 = Text.literal(var0);
                int var58 = var2 + 1;
                int var59 = var2 * var58;
                int var64 = var2 + 2;
                int var60 = var59 * var64;
                var2 += 3;
                int var61 = var60 * var2;
                var2 = var61 & 7;
                if (var2 == 0) {
                    var1 *= -1714207587;
                    var1 ^= -1314502584;
                    var2 = var1 + 1;
                    var2 = var1 * var2;
                    int var62 = var1 + 2;
                    var2 *= var62;
                    var1 += 3;
                    var2 *= var1;
                    var1 = var2 & 7;
                    if (var1 == 0) {
                        var49.sendMessage(var54, false);
                        return;
                    }
                    break label57;
                }

                switch (var1) {
                    case -634067122:
                    default:
                        var1 ^= 1268093152;
                        break;
                    case 1833621353:
                        var1 ^= -1276192222;
                        break;
                    case 1892376671:
                        var1 -= 1381679784;
                        var1 |= -1362543012;
                        var1 >>>= 23;
                        var1 ^= -1680426619;
                }
            }

            Integer var37 = var1;
            if (var37 != null) {
                AssertionError var38 = new AssertionError();
                throw var38;
            }
        }

        RuntimeException var34 = new RuntimeException();
        throw var34;
    }

    public static void jL() {
        int var0 = h;
        var0 ^= 50958893;
        Screen var1 = vB();

        var0 = switch (var0) {
            case 572301603 -> {
                var0 >>= 20;
                var0 >>= 18;
                var0 |= 927664309;
                var0 >>>= 26;
                yield var0 ^ 871448757;
            }
            case 1606511767 -> var0 ^ -511925415;
            default -> var0 ^ -1876933083;
        };
        Integer var2 = var0;
        label32:
        if (var2 != null) {
            if (var1 != null) {
                var0 = switch (var0) {
                    default -> var0 ^ -89072110;
                    case 817289578 -> var0 ^ -1529064583;
                    case 871448760 -> {
                        var0 += -1368899979;
                        var0 += 396258754;
                        var0 -= 192910356;
                        var0 -= 1328396652;
                        yield var0 ^ -705542906;
                    }
                };
                var2 = var0;
                if (var2 == null) {
                    break label32;
                }

                var1.close();
                var0 *= -1373063403;
                var0 ^= -1708751901;
            } else {
                var0 |= 1711530164;
                var0 &= -1514262693;
                var0 += 1019344203;
                var0 ^= 1004564253;
            }

            return;
        }

        IllegalStateException var16 = new IllegalStateException();
        throw var16;
    }

    public static String Fc() {
        int var0 = h;
        var0 ^= 1016518825;
        GpuDevice var1 = RenderSystem.tryGetDevice();
        var0 *= -1264499731;
        var0 >>= 2;
        var0 ^= -156988011;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label27:
        if (var2 == 0) {
            String var37;
            if (var1 == null) {
                var0 -= 1432899706;
                var0 >>>= 15;
                var0 ^= -700991329;
                long var34 = var0;
                long var4 = var34 + 1L;
                var4 = var34 * var4;
                long var35 = var4 & 1L;
                long var41;
                var2 = (var41 = var35 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
                if (var2 != 0) {
                    break label27;
                }

                var37 = "unknown";
                var0 *= -580174129;
                var0 &= -765097394;
                var0 ^= 13989246;
            } else {
                var0 -= -366145925;
                var0 &= 463886595;
                var0 *= 26669699;
                var0 ^= 974768905;
                String var29 = var1.getBackendName();
                var0 -= 618597876;
                var0 >>= 10;
                var0 ^= -1261400916;
                Integer var39 = var0;
                if (var39 == null) {
                    break label27;
                }

                var37 = var29;
                var0 >>= 24;
                var0 *= -846163753;
                var0 -= -887035252;
                var0 &= -1009094772;
                var0 ^= 1357443900;
            }

            return var37;
        }

        UnsupportedOperationException var28 = new UnsupportedOperationException();
        throw var28;
    }

    public static boolean zG() {
        boolean var36 = false;
        int var0 = h;
        var0 ^= -1459288607;
        String var1 = Fc();
        int var2 = (var1.equals("OpenGL")) ? 1 : 0;

        var0 = switch (var0) {
            case -2012203281 -> {
                var0 >>>= 20;
                var0 ^= -1760406773;
                var0 <<= 4;
                var0 <<= 15;
                yield var0 ^ 375958607;
            }
            default -> var0 ^ -1130267872;
            case 1288618781 -> var0 ^ 1200128319;
        };
        Integer var3 = var0;
        label63:
        if (var3 != null) {
            label67: {
                if (var2 == 0) {
                    var0 ^= 631389484;
                    var0 |= -1874555886;
                    var0 *= 812545681;
                    var0 ^= -2126847063;
                    boolean var34 = var1.equals("unknown");

                    var0 = switch (var0) {
                        case -1899333910 -> var0 ^ 1715552047;
                        default -> var0 ^ 1679822311;
                        case 1076810634 -> {
                            var0 -= -1662211293;
                            var0 ^= -177376580;
                            yield var0 ^ -1030615634;
                        }
                    };
                    if (!var34) {
                        var0 = switch (var0) {
                            case -1799530635 -> {
                                var0 |= -630616143;
                                var0 &= -294797021;
                                yield var0 ^ 1439638012;
                            }
                            case -1270351732 -> var0 ^ -1766660517;
                            default -> var0 ^ 599631527;
                        };
                        Integer var35 = var0;
                        if (var35 == null) {
                            break label63;
                        }

                        var36 = false;
                        switch (var0) {
                            case -1683824419:
                                var0 += -1991361624;
                                var0 ^= -1075661956;
                                break label67;
                            case -1114592056:
                                var0 ^= -2073955705;
                                break label67;
                            case 1017580030:
                            default:
                                var0 ^= -21585661;
                                break label67;
                        }
                    }

                    var0 ^= -2135628317;
                    var0 |= -754803544;
                    var0 += 1171247508;
                    var0 ^= 1619822211;
                } else {
                    switch (var0) {
                        case -1564903262:
                            var0 ^= 1363063083;
                            break;
                        case -902255537:
                            var0 &= 1765643914;
                            var0 >>= 29;
                            var0 *= 816917905;
                            var0 <<= 30;
                            var0 ^= -61401391;
                            break;
                        case -475907823:
                        default:
                            var0 ^= 172785343;
                    }
                }

                var2 = var0 + 1;
                var2 = var0 * var2;
                var2 &= 1;
                if (var2 != 0) {
                    break label63;
                }

                var36 = true;
                var0 |= -931819951;
                var0 += -1136695079;
                var0 ^= 597993555;
            }

            Integer var32 = var0;
            if (var32 != null) {
                return var36;
            }
        }

        IllegalArgumentException var33 = new IllegalArgumentException();
        throw var33;
    }

    public static RenderTarget vD() {
        int var0 = h;
        var0 ^= 680093648;
        int var1 = var0 - -1216231533;
        var1 *= 1677634601;
        var1 &= 1648491888;
        var1 &= 776231082;
        var1 ^= -541599206;
        Framebuffer var46 = J(var1);
        var0 &= 952339430;
        var0 <<= 27;
        var0 ^= 1794626093;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        if (var2 == 0) {
            if (var46 == null) {
                var0 &= 1148279808;
                var0 -= 1382830443;
                var0 >>= 11;
                var0 ^= -1147340218;
                Integer var51 = var0;
                if (var51 != null) {
                    return null;
                }
            } else {
                var0 = switch (var0) {
                    case 128712678 -> var0 ^ 1623030987;
                    default -> var0 ^ 1469501846;
                    case 1526190637 -> {
                        var0 += -533824849;
                        var0 *= 919863515;
                        var0 ^= -709175566;
                        var0 += 1469532449;
                        yield var0 ^ 297992304;
                    }
                };
                Integer var52 = var0;
                if (var52 != null) {
                    int var53 = var0 ^ 1741809859;
                    var53 ^= -2085674756;
                    var53 &= -659565848;
                    var53 ^= 2083282700;
                    var53 = Jb(var46, var53);

                    var0 = switch (var0) {
                        default -> var0 ^ -1833248425;
                        case -668770409 -> {
                            var0 >>= 20;
                            var0 |= 1549145848;
                            yield var0 ^ 985915463;
                        }
                        case 422113503 -> var0 ^ 1370001199;
                    };
                    long var3 = var0;
                    long var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var74;
                    int var63 = (var74 = var3 - 0L) == 0L ? 0 : (var74 < 0L ? -1 : 1);
                    label53:
                    if (var63 == 0) {
                        RenderTarget var48;
                        if (var53 > 0) {
                            var0 &= 1532709107;
                            var0 -= 1799870970;
                            var0 -= -1098359321;
                            var0 >>>= 4;
                            var0 ^= -1722149323;
                            int var64 = var0 + 1;
                            int var65 = var0 * var64;
                            int var4 = var0 + 2;
                            int var66 = var65 * var4;
                            var4 = var0 + 3;
                            int var67 = var66 * var4;
                            int var68 = var67 & 7;
                            if (var68 != 0) {
                                break label53;
                            }

                            var4 = var46.textureWidth;
                            var1 = var46.textureHeight;
                            RenderTarget var69 = new RenderTarget(var53, 0, var4, var1);
                            var0 *= -95714193;
                            var0 |= -1808590836;
                            var0 ^= 968642085;
                            var48 = var69;
                            switch (var0) {
                                case -2111879063:
                                default:
                                    var0 ^= -1984935426;
                                    break;
                                case -1415182064:
                                    var0 ^= -21674250;
                                    break;
                                case -1387326615:
                                    var0 *= 992923859;
                                    var0 += -1313065860;
                                    var0 += -1597442879;
                                    var0 ^= 210003384;
                            }
                        } else {
                            var0 |= -2096622131;
                            var0 ^= -317755018;
                            var48 = null;
                            var0 &= -663015390;
                            var0 += 2123739925;
                            var0 ^= -1877356953;
                        }

                        var53 = var0 + 1;
                        var53 = var0 * var53;
                        int var70 = var0 + 2;
                        var53 *= var70;
                        var0 += 3;
                        var53 *= var0;
                        var0 = var53 & 7;
                        if (var0 == 0) {
                            return var48;
                        }
                    }
                }
            }
        }

        RuntimeException var41 = new RuntimeException();
        throw var41;
    }

    public static RenderTarget kH() {
        int var0 = h;
        var0 ^= 1853221174;
        int var1 = var0 >> 25;
        var1 *= -1605112935;
        var1 |= -1890317234;
        var1 ^= 309016149;
        Framebuffer var38 = J(var1);
        var0 &= 1531317550;
        var0 ^= 748591643;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        if (var2 == 0) {
            if (var38 == null) {
                switch (var0) {
                    case -1312324313:
                        var0 ^= -918245308;
                        break;
                    case -736377216:
                    default:
                        var0 ^= -539148329;
                        break;
                    case 1742639667:
                        var0 &= 1730798839;
                        var0 *= 931814693;
                        var0 -= -624279412;
                        var0 ^= -1104408023;
                }

                return null;
            }

            var0 ^= 217554714;
            var0 *= -1286248565;
            var0 |= 1223121121;
            var0 *= -1010938055;
            var0 ^= -543548523;
            Integer var42 = var0;
            if (var42 != null) {
                int var43 = var0 + 60306884;
                var43 ^= 311998534;
                var43 = Jb(var38, var43);

                var0 = switch (var0) {
                    default -> var0 ^ 602368566;
                    case 1238333733 -> var0 ^ -963334337;
                    case 1931558942 -> {
                        var0 ^= -310493258;
                        var0 >>>= 14;
                        var0 &= -353964122;
                        yield var0 ^ 1287164511;
                    }
                };
                int var3 = var0 + 1;
                var3 = var0 * var3;
                var3 &= 1;
                if (var3 == 0) {
                    if (var43 <= 0) {
                        var0 -= -708668107;
                        var0 ^= -527403328;
                        return null;
                    }

                    var0 *= -1853507885;
                    var0 ^= 804583391;
                    long var48 = var0;
                    long var5 = var48 + 1L;
                    var5 = var48 * var5;
                    long var49 = var5 & 1L;
                    long var52;
                    var3 = (var52 = var49 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var0 |= -1638776765;
                        var0 -= 1801575265;
                        var0 ^= 1136229546;
                        var0 = T(var38, var0);
                        var0 = Math.max(0, var0);
                        int var4 = var38.textureWidth;
                        var1 = var38.textureHeight;
                        return new RenderTarget(var43, var0, var4, var1);
                    }
                }
            }
        }

        RuntimeException var21 = new RuntimeException();
        throw var21;
    }

    private static Framebuffer J(int var0) {
        MinecraftClient var2 = zp();
        int var1 = var0 + -1325874335;
        var1 >>= 4;
        var1 -= 1840195529;
        var1 ^= -1587740746;
        Integer var6 = var1;
        if (var6 != null) {
            return var2.getFramebuffer();
        } else {
            IllegalArgumentException var7 = new IllegalArgumentException();
            throw var7;
        }
    }

    private static int Jb(Framebuffer var0, int var1) {
        label50: {
            int var3 = System.identityHashCode(var0);
            GpuTexture var4 = var0.getColorAttachment();
            Integer var5 = var3;
            if (var5 == null) {
                int var2 = var1 & 315628605;
                var2 |= 788475901;
                var2 *= -1664820813;
                var2 ^= 1543396578;
                var2 ^= 1691974757;
            } else {
                label58: {
                    int var15 = switch (var1) {
                        default -> var1 ^ 801242407;
                        case -1732601798 -> var1 ^ 862737501;
                        case 1679936932 -> {
                            int var11 = var1 * 416152435;
                            var11 &= 279652752;
                            var11 -= -1581209873;
                            var11 += -787429366;
                            yield var11 ^ -1986812134;
                        }
                    };
                    var5 = var15;
                    if (var5 == null) {
                        break label50;
                    }

                    boolean var43 = var4 instanceof GlTexture;
                    if (var43) {
                        var15 >>= 31;
                        var15 -= -1240678414;
                        var15 -= 515066418;
                        var15 ^= -1371073638;
                        int var44 = var15 + 1;
                        var44 = var15 * var44;
                        int var6 = var15 + 2;
                        var44 *= var6;
                        var6 = var15 + 3;
                        var44 *= var6;
                        var44 &= 7;
                        if (var44 != 0) {
                            break label50;
                        }

                        GlTexture var38 = (GlTexture)var4;
                        int var39 = var38.getGlId();
                        Integer var35 = var3;
                        if (var35 == null) {
                            var15 += 1314675454;
                            var15 ^= -115186849;
                            break label58;
                        }

                        var15 *= 1534650031;
                        var15 *= 2136161641;
                        var15 ^= -1822585109;
                        var3 = var39;
                        var15 ^= -1792569546;
                        var15 ^= -274591460;
                    } else {
                        var15 &= -2076466275;
                        var15 &= -716511689;
                        var15 += -1075309354;
                        var15 -= -849797944;
                        var15 ^= -1011142832;
                        var3 = 0;
                        switch (var15) {
                            case -1649842625:
                                var15 ^= -376245234;
                                break;
                            case -1254836897:
                                var15 |= -361770127;
                                var15 ^= -1168266439;
                                break;
                            case -72488014:
                            default:
                                var15 ^= 892963578;
                        }
                    }

                    int var40 = var15 + 1;
                    int var41 = var15 * var40;
                    var15 = var41 & 1;
                    if (var15 == 0) {
                        return var3;
                    }
                    break label50;
                }
            }

            UnsupportedOperationException var37 = new UnsupportedOperationException();
            throw var37;
        }

        UnsupportedOperationException var34 = new UnsupportedOperationException();
        throw var34;
    }

    private static int T(Framebuffer var0, int var1) {
        label58: {
            int var3 = System.identityHashCode(var0);
            GpuTexture var4 = var0.getDepthAttachment();
            int var5 = (var4 instanceof GlTexture) ? 1 : 0;
            long var6 = var3;
            long var8 = var6 + 1L;
            var8 = var6 * var8;
            long var10 = var6 + 2L;
            var8 *= var10;
            var6 += 3L;
            var8 *= var6;
            var6 = var8 & 7L;
            long var75;
            int var59 = (var75 = var6 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
            if (var59 != 0) {
                switch (var1) {
                    case 181239722:
                    default:
                        int var17 = var1 ^ -1683262717;
                        break;
                    case 933234740:
                        int var12 = var1 - -159566259;
                        var12 |= -50939984;
                        var12 &= -671149902;
                        var12 += -1694509254;
                        var12 ^= -1033608292;
                        break;
                    case 1621181240:
                        int var2 = var1 ^ -652861698;
                }
            } else {
                int var21 = switch (var1) {
                    case -157824676 -> var1 ^ 648678407;
                    default -> var1 ^ -1584608982;
                    case 933234740 -> {
                        int var18 = var1 + -1105255105;
                        var18 |= -18889877;
                        var18 += 1862719329;
                        yield var18 ^ -361972369;
                    }
                };
                var6 = var21;
                var8 = var6 + 1L;
                var8 = var6 * var8;
                var10 = var6 + 2L;
                var8 *= var10;
                var6 += 3L;
                var8 *= var6;
                var6 = var8 & 7L;
                long var76;
                int var63 = (var76 = var6 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                if (var63 != 0) {
                    break label58;
                }

                if (var5 == 0) {
                    var21 *= -507442989;
                    var21 ^= 371545794;
                    byte var45 = 0;
                    var21 ^= 1908131946;
                    var21 ^= -327906669;
                    return var45;
                }
                var21 = switch (var21) {
                    case -2056619085 -> {
                        var21 |= 1308882011;
                        yield var21 ^ 1596444669;
                    }
                    case -1574684151 -> var21 ^ 379155510;
                    default -> var21 ^ 439595546;
                };
                var5 = var21 + 1;
                var5 = var21 * var5;
                int var64 = var21 + 2;
                var5 *= var64;
                int var65 = var21 + 3;
                var5 *= var65;
                var5 &= 7;
                if (var5 != 0) {
                    break label58;
                }

                GlTexture var46 = (GlTexture)var4;
                var5 = var3 + 1;
                var5 = var3 * var5;
                int var66 = var3 + 2;
                var5 *= var66;
                var3 += 3;
                var5 *= var3;
                var3 = var5 & 7;
                if (var3 == 0) {
                    var21 >>= 2;
                    var21 ^= 367008686;
                    var3 = var21 + 1;
                    var3 = var21 * var3;
                    var3 &= 1;
                    if (var3 != 0) {
                        break label58;
                    }

                    var3 = var46.getGlId();
                    var21 &= 1962448847;
                    var21 &= -82203733;
                    var21 ^= -1538285188;
                    var21 ^= -2145306043;
                    return var3;
                }

                switch (var21) {
                    case -1874055162:
                        var21 += -632964954;
                        var21 ^= -671060772;
                        break;
                    case -540672712:
                        var21 ^= -2014120572;
                        break;
                    case 1797221146:
                    default:
                        var21 ^= 481320102;
                }
            }

            UnsupportedOperationException var47 = new UnsupportedOperationException();
            throw var47;
        }

        UnsupportedOperationException var38 = new UnsupportedOperationException();
        throw var38;
    }

    public static boolean c() {
        boolean var49 = false;
        int var0 = h;
        var0 ^= 2067971201;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var43 = var1.player;
        var0 += 2139868325;
        var0 |= 1911253609;
        var0 -= -1803950675;
        var0 ^= 1089425007;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label64:
        if (var2 == 0) {
            label66: {
                label67: {
                    MinecraftClient var54 = zp();
                    GameOptions var55 = var54.options;
                    Perspective var56 = var55.getPerspective();
                    int var57 = (var56.isFirstPerson()) ? 1 : 0;
                    if (var57 != 0) {
                        var0 += -2142114425;
                        var0 ^= 887830451;
                        Integer var58 = var0;
                        if (var58 == null) {
                            break label64;
                        }

                        if (var43 == null) {
                            var0 -= -1813678072;
                            var0 ^= 276333988;
                            var0 |= 969230698;
                            var0 |= 967668499;
                            var0 ^= 1871366764;
                            break label67;
                        }

                        var0 >>= 19;
                        var0 *= 1604799641;
                        var0 -= 166852290;
                        var0 ^= -109607081;
                        long var59 = var0;
                        long var4 = var59 + 1L;
                        var4 = var59 * var4;
                        long var6 = var59 + 2L;
                        var4 *= var6;
                        long var60 = var59 + 3L;
                        var4 *= var60;
                        long var61 = var4 & 7L;
                        long var89;
                        var57 = (var89 = var61 - 0L) == 0L ? 0 : (var89 < 0L ? -1 : 1);
                        if (var57 != 0) {
                            break label64;
                        }

                        boolean var44 = var43.hasVehicle();

                        var0 = switch (var0) {
                            default -> var0 ^ -309419835;
                            case 449487742 -> {
                                var0 *= 1556169745;
                                var0 &= 670212803;
                                var0 ^= -2087256287;
                                yield var0 ^ 1839845573;
                            }
                            case 461498652 -> var0 ^ 865804092;
                        };
                        long var63 = var0;
                        var4 = var63 + 1L;
                        var4 = var63 * var4;
                        long var64 = var4 & 1L;
                        long var90;
                        int var65 = (var90 = var64 - 0L) == 0L ? 0 : (var90 < 0L ? -1 : 1);
                        if (var65 != 0) {
                            break label64;
                        }

                        if (!var44) {
                            var0 *= 202778525;
                            var0 ^= -1921876519;
                            break label67;
                        }

                        var0 += 1150616832;
                        var0 *= 574501863;
                        var0 |= 1250806090;
                        var0 ^= 1049113333;
                    } else {
                        var0 *= 637490357;
                        var0 *= 987997559;
                        var0 ^= -1302729694;
                    }

                    long var66 = var0;
                    long var82 = var66 + 1L;
                    var82 = var66 * var82;
                    long var88 = var66 + 2L;
                    var82 *= var88;
                    long var67 = var66 + 3L;
                    var82 *= var67;
                    long var68 = var82 & 7L;
                    long var91;
                    var57 = (var91 = var68 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                    if (var57 != 0) {
                        break label64;
                    }

                    var49 = true;
                    var0 |= -694783602;
                    var0 *= 1871777063;
                    var0 -= 1070245193;
                    var0 ^= 130239515;
                    break label66;
                }

                long var45 = var0;
                long var73 = var45 + 1L;
                long var74 = var45 * var73;
                long var5 = var45 + 2L;
                long var75 = var74 * var5;
                long var46 = var45 + 3L;
                long var76 = var75 * var46;
                long var47 = var76 & 7L;
                long var92;
                int var48 = (var92 = var47 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                if (var48 != 0) {
                    break label64;
                }

                var49 = false;
                var0 <<= 11;
                var0 += 444077650;
                var0 ^= 965378457;
            }

            long var70 = var0;
            long var86 = var70 + 1L;
            var86 = var70 * var86;
            long var71 = var86 & 1L;
            long var93;
            var0 = (var93 = var71 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
            if (var0 == 0) {
                return var49;
            }
        }

        IllegalStateException var42 = new IllegalStateException();
        throw var42;
    }

    public static Object U() {
        int var0 = h;
        var0 ^= -18584432;
        MinecraftClient var1 = zp();
        var0 -= 540638664;
        var0 += 135320315;
        var0 ^= 1738406787;
        var0 |= 1289763535;
        var0 ^= -1951238835;
        return var1.world;
    }

    public static LivingEntity Y() {
        int var0 = h;
        var0 ^= -1021210635;
        int var1 = BD() ? 1 : 0;

        var0 = switch (var0) {
            case -653104522 -> var0 ^ -799482585;
            case -499860229 -> {
                var0 >>= 12;
                var0 += 386056637;
                yield var0 ^ 1999676695;
            }
            default -> var0 ^ 584869700;
        };
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        var2 = var4 & 1L;
        long var172;
        int var104 = (var172 = var2 - 0L) == 0L ? 0 : (var172 < 0L ? -1 : 1);
        if (var104 == 0) {
            if (var1 == 0) {
                switch (var0) {
                    case -407837979:
                    default:
                        var0 ^= -1071854192;
                        break;
                    case 1485940796:
                        var0 ^= -88432621;
                        break;
                    case 1613774879:
                        var0 |= -12158123;
                        var0 |= 1315292361;
                        var0 -= -1672339498;
                        var0 <<= 13;
                        var0 ^= -1232486126;
                }

                return null;
            }

            var0 ^= 354691221;
            var0 ^= -967640491;
            var0 ^= 954102100;
            var1 = var0 + 1;
            var1 = var0 * var1;
            int var105 = var0 + 2;
            var1 *= var105;
            int var106 = var0 + 3;
            var1 *= var106;
            var1 &= 7;
            if (var1 == 0) {
                MinecraftClient var83 = zp();
                ClientPlayerEntity var84 = var83.player;
                MinecraftClient var3 = zp();
                ClientWorld var108 = var3.world;
                Sw var107 = new Sw(var108);
                float var109 = var84.getYaw();
                double var110 = var109;
                double var111 = Math.toRadians(var110);
                double var5 = var84.getX();
                double var7 = Math.sin(var111);
                var0 >>= 28;
                var0 *= -663536923;
                var0 ^= 46114816;
                var7 *= 2.6;
                var5 -= var7;
                var7 = var84.getZ();
                double var112 = Math.cos(var111);
                double var113 = var112 * 2.6;
                double var114 = var7 + var113;
                MinecraftClient var144 = zp();
                ClientWorld var145 = var144.world;
                Vec3d var9 = var84.getEyePos();
                double var11 = var84.getEyeY();
                Vec3d var10 = new Vec3d(var5, var11, var114);
                ShapeType var170 = ShapeType.COLLIDER;
                FluidHandling var12 = FluidHandling.NONE;
                RaycastContext var8 = new RaycastContext(var9, var10, var170, var12, var84);
                BlockHitResult var146 = var145.raycast(var8);
                Type var147 = var146.getType();
                Type var158 = Type.MISS;
                if (var147 != var158) {
                    var0 += -1247549045;
                    var0 >>>= 25;
                    var0 >>>= 9;
                    var0 += -1507414076;
                    var0 ^= -1695854634;
                    long var148 = var0;
                    long var164 = var148 + 1L;
                    long var165 = var148 * var164;
                    long var149 = var165 & 1L;
                    long var173;
                    int var150 = (var173 = var149 - 0L) == 0L ? 0 : (var173 < 0L ? -1 : 1);
                    if (var150 == 0) {
                        return null;
                    }
                } else {
                    var0 <<= 31;
                    var0 *= -281235713;
                    var0 *= 529775693;
                    var0 |= 1011687722;
                    var0 ^= 13350644;
                    int var151 = var0 + 1;
                    int var152 = var0 * var151;
                    int var153 = var152 & 1;
                    if (var153 == 0) {
                        float var154 = var84.getYaw();
                        float var155 = var154 + 180.0F;
                        var0 &= -590015461;
                        var0 += -432342856;
                        var0 ^= -980812947;
                        var0 += -659939787;
                        var0 ^= -1075428921;
                        long var159 = var0;
                        long var166 = var159 + 1L;
                        long var167 = var159 * var166;
                        long var171 = var159 + 2L;
                        long var168 = var167 * var171;
                        long var160 = var159 + 3L;
                        long var169 = var168 * var160;
                        long var161 = var169 & 7L;
                        long var174;
                        int var162 = (var174 = var161 - 0L) == 0L ? 0 : (var174 < 0L ? -1 : 1);
                        if (var162 == 0) {
                            double var163 = var84.getY();
                            var107.setPosition(var5, var163, var114);
                            var107.setYaw(var155);
                            var107.setPitch(0.0F);
                            var107.lastHeadYaw = var155;
                            var107.headYaw = var155;
                            var107.lastBodyYaw = var155;
                            var107.bodyYaw = var155;
                            var107.resetPosition();
                            MinecraftClient var85 = zp();
                            ClientWorld var86 = var85.world;
                            Box var115 = var107.getBoundingBox();
                            int var87 = var86.isSpaceEmpty(var107, var115) ? 1 : 0;
                            if (var87 == 0) {
                                var0 -= -927822684;
                                var0 ^= -685001805;
                                var87 = var0 + 1;
                                var87 = var0 * var87;
                                int var116 = var0 + 2;
                                var87 *= var116;
                                int var117 = var0 + 3;
                                var87 *= var117;
                                var87 &= 7;
                                if (var87 == 0) {
                                    return null;
                                }
                            } else {
                                var0 |= 1884867003;
                                var0 &= 1485780140;
                                var0 *= 2090036077;
                                var0 -= 142657471;
                                var0 ^= -1517857222;

                                while (true) {
                                    long var118 = var0;
                                    long var134 = var118 + 1L;
                                    long var135 = var118 * var134;
                                    long var156 = var118 + 2L;
                                    long var136 = var135 * var156;
                                    long var119 = var118 + 3L;
                                    long var137 = var136 * var119;
                                    long var120 = var137 & 7L;
                                    long var175;
                                    var87 = (var175 = var120 - 0L) == 0L ? 0 : (var175 < 0L ? -1 : 1);
                                    if (var87 != 0) {
                                        break;
                                    }

                                    MinecraftClient var94 = zp();
                                    ClientWorld var95 = var94.world;
                                    int var121 = y;
                                    Entity var96 = var95.getEntityById(var121);
                                    var0 += -1175422731;
                                    var0 <<= 1;
                                    var0 ^= 53418003;
                                    int var122 = var0 + 1;
                                    int var123 = var0 * var122;
                                    int var124 = var123 & 1;
                                    if (var124 != 0) {
                                        break;
                                    }

                                    if (var96 == null) {
                                        var0 += 2066314418;
                                        var0 -= -332828396;
                                        var0 ^= -1854535291;
                                        long var128 = var0;
                                        long var138 = var128 + 1L;
                                        long var139 = var128 * var138;
                                        long var157 = var128 + 2L;
                                        long var140 = var139 * var157;
                                        long var129 = var128 + 3L;
                                        long var141 = var140 * var129;
                                        long var130 = var141 & 7L;
                                        long var176;
                                        var87 = (var176 = var130 - 0L) == 0L ? 0 : (var176 < 0L ? -1 : 1);
                                        if (var87 == 0) {
                                            var87 = y;
                                            int var131 = var87 - 1;
                                            y = var131;
                                            var107.setId(var87);
                                            var107.setNoGravity(true);
                                            var107.setOnGround(true);
                                            var107.setHealth(20.0F);
                                            MinecraftClient var102 = zp();
                                            switch (var0) {
                                                case -306392860:
                                                    var0 <<= 22;
                                                    var0 &= -988557325;
                                                    var0 <<= 3;
                                                    var0 -= 261968351;
                                                    var0 ^= 1210219788;
                                                    break;
                                                case -31744016:
                                                default:
                                                    var0 ^= -367290740;
                                                    break;
                                                case 265434339:
                                                    var0 ^= 1343440685;
                                            }

                                            ClientWorld var69 = var102.world;
                                            var69.addEntity(var107);
                                            return var107;
                                        }
                                        break;
                                    }

                                    var0 &= 178701290;
                                    var0 <<= 17;
                                    var0 &= 1326555402;
                                    var0 += 869408360;
                                    var0 ^= 1412032603;
                                    Integer var97 = var0;
                                    if (var97 == null) {
                                        break;
                                    }

                                    int var98 = y;
                                    var0 += 1591635647;
                                    var0 += 1535901082;
                                    var0 ^= 2058997513;
                                    int var125 = var0 + 1;
                                    int var126 = var0 * var125;
                                    int var127 = var126 & 1;
                                    if (var127 != 0) {
                                        break;
                                    }

                                    y = --var98;
                                    var0 &= -873945905;
                                    var0 &= 1469289618;
                                    var0 ^= 2114120051;
                                }
                            }
                        }
                    }
                }
            }
        }

        IllegalStateException var70 = new IllegalStateException();
        throw var70;
    }

    public static void CM(LivingEntity var0) {
        label81: {
            int var1 = h;
            var1 ^= 890563914;
            int var2 = System.identityHashCode(var0);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var97;
            int var57 = (var97 = var3 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
            if (var57 != 0) {
                var1 += 2124361135;
                var1 ^= -1057934429;
            } else {
                label86: {
                    var1 = switch (var1) {
                        default -> var1 ^ 402101372;
                        case 335666756 -> {
                            var1 &= 522654722;
                            yield var1 ^ 350394557;
                        }
                        case 861607886 -> var1 ^ 670035108;
                    };
                    World var58 = var0.getEntityWorld();
                    int var4 = (var58 instanceof ClientWorld) ? 1 : 0;
                    if (var4 != 0) {
                        var1 += -26670367;
                        var1 += -513950929;
                        var1 ^= 1064747716;
                        var1 ^= -1309567862;
                        long var64 = var1;
                        long var6 = var64 + 1L;
                        var6 = var64 * var6;
                        long var8 = var64 + 2L;
                        var6 *= var8;
                        long var65 = var64 + 3L;
                        var6 *= var65;
                        long var66 = var6 & 7L;
                        long var98;
                        var4 = (var98 = var66 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            break label81;
                        }

                        ClientWorld var59 = (ClientWorld)var58;
                        var4 = var2 + 1;
                        var4 = var2 * var4;
                        var4 &= 1;
                        if (var4 != 0) {
                            var1 *= 1405622471;
                            var1 <<= 21;
                            var1 += 554220191;
                            var1 ^= 167281359;
                            break label86;
                        }

                        var1 |= 744457559;
                        var1 <<= 17;
                        var1 ^= -1019597503;
                        var1 |= 899744005;
                        var1 ^= -1250230970;
                        var4 = var1 + 1;
                        var4 = var1 * var4;
                        int var85 = var1 + 2;
                        var4 *= var85;
                        int var86 = var1 + 3;
                        var4 *= var86;
                        var4 &= 7;
                        if (var4 != 0) {
                            break label81;
                        }

                        var4 = var0.getId();
                        Entity var77 = var59.getEntityById(var4);
                        if (var77 == var0) {
                            var1 ^= -221460681;
                            var1 ^= -1906917169;
                            Integer var78 = var1;
                            if (var78 == null) {
                                break label81;
                            }

                            int var79 = var0.getId();
                            RemovalReason var87 = RemovalReason.DISCARDED;
                            int var92 = var2 + 1;
                            int var93 = var2 * var92;
                            int var96 = var2 + 2;
                            int var94 = var93 * var96;
                            var2 += 3;
                            int var95 = var94 * var2;
                            var2 = var95 & 7;
                            if (var2 != 0) {
                                var1 >>= 2;
                                var1 ^= 1598377390;
                                break label86;
                            }
                            var1 = switch (var1) {
                                case -804955290 -> var1 ^ 412196494;
                                case 878041083 -> {
                                    var1 |= -2140756913;
                                    yield var1 ^ 1189359756;
                                }
                                default -> var1 ^ 1515542984;
                            };
                            Integer var50 = var1;
                            if (var50 == null) {
                                break label81;
                            }

                            var59.removeEntity(var79, var87);
                            var1 |= -124692401;
                            var1 |= -1351089210;
                            var1 -= -930560736;
                            var1 ^= 1795719543;
                        } else {
                            var1 ^= -1832186825;
                            var1 |= -1852995364;
                            var1 += 1568590235;
                            var1 ^= 1702313279;
                        }
                    } else {
                        switch (var1) {
                            case -422238094:
                            default:
                                var1 ^= -90905328;
                                break;
                            case 14912701:
                                var1 >>>= 3;
                                var1 *= 904227211;
                                var1 += -542056812;
                                var1 += -1047258401;
                                var1 ^= 1713049304;
                                break;
                            case 1215033857:
                                var1 ^= -398335153;
                        }
                    }

                    long var42 = var1;
                    var3 = var42 + 1L;
                    var3 = var42 * var3;
                    var5 = var42 + 2L;
                    var3 *= var5;
                    long var43 = var42 + 3L;
                    var3 *= var43;
                    long var44 = var3 & 7L;
                    long var99;
                    var1 = (var99 = var44 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return;
                    }
                    break label81;
                }
            }

            long var51 = var1;
            long var80 = var51 + 1L;
            var80 = var51 * var80;
            long var52 = var80 & 1L;
            long var100;
            var2 = (var100 = var52 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
            if (var2 == 0) {
                IllegalStateException var54 = new IllegalStateException();
                throw var54;
            }
        }

        AssertionError var47 = new AssertionError();
        throw var47;
    }

    public static boolean C(LivingEntity var0) {
        boolean var47 = false;
        int var1 = h;
        var1 ^= 2096334784;
        int var2 = System.identityHashCode(var0);
        Integer var3 = var2;
        if (var3 == null) {
            switch (var1) {
                case -1212384577:
                    var1 ^= -672908689;
                    break;
                case 843142955:
                default:
                    var1 ^= -1451759021;
                    break;
                case 1575400654:
                    var1 |= 1619041967;
                    var1 += 1717085796;
                    var1 *= -1998669103;
                    var1 ^= 25612963;
            }
        } else {
            label89: {
                label72: {
                    label78: {
                        var1 &= 1614009584;
                        var1 ^= 706803117;
                        var1 ^= -31991914;
                        var1 ^= 1838287071;
                        boolean var49 = var0 instanceof Sw;
                        if (var49) {
                            var1 ^= 2043286662;
                            var1 ^= 1843537773;
                            var3 = var1;
                            if (var3 == null) {
                                break label72;
                            }

                            Sw var51 = (Sw)var0;
                            boolean var52 = var51.skinLoaded();
                            long var4 = var2;
                            long var6 = var4 + 1L;
                            var6 = var4 * var6;
                            var4 = var6 & 1L;
                            long var65;
                            var2 = (var65 = var4 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
                            if (var2 != 0) {
                                var1 |= -372104765;
                                var1 -= 160820014;
                                var1 ^= -1196091711;
                                break label89;
                            }
                            var1 = switch (var1) {
                                case -1319811387 -> var1 ^ 1229690601;
                                default -> var1 ^ 2090851804;
                                case -307262001 -> {
                                    var1 -= 1983769489;
                                    var1 &= -1039411084;
                                    var1 >>>= 19;
                                    var1 &= 1746045644;
                                    yield var1 ^ -221388770;
                                }
                            };
                            if (var52) {
                                var1 = switch (var1) {
                                    case -1441835698 -> var1 ^ -886598859;
                                    case -221386658 -> {
                                        var1 |= 1547521825;
                                        yield var1 ^ 1258284214;
                                    }
                                    default -> var1 ^ 2082690465;
                                };
                                var47 = true;
                                switch (var1) {
                                    case -1274934327:
                                        var1 -= -1744238435;
                                        var1 ^= -279382888;
                                        var1 += -1383076755;
                                        var1 >>= 20;
                                        var1 ^= -1174809492;
                                        break label78;
                                    case 1299116441:
                                    default:
                                        var1 ^= -1218373923;
                                        break label78;
                                    case 1999688958:
                                        var1 ^= 213128822;
                                        break label78;
                                }
                            }

                            var1 >>= 29;
                            var1 &= -174543445;
                            var1 += -185996995;
                            var1 ^= 708862868;
                        } else {
                            var1 &= 1946470446;
                            var1 -= -857740293;
                            var1 -= -105890000;
                            var1 ^= -624601134;
                            var1 ^= -1284243881;
                        }

                        int var53 = var1 + 1;
                        var53 = var1 * var53;
                        var53 &= 1;
                        if (var53 != 0) {
                            break label72;
                        }

                        var47 = false;
                        switch (var1) {
                            case -1060964996:
                                var1 |= 431405678;
                                var1 ^= -1611607759;
                                break;
                            case -186653943:
                                var1 ^= -1556244843;
                                break;
                            case 1754579499:
                            default:
                                var1 ^= 2128245611;
                        }
                    }

                    int var56 = var1 + 1;
                    var56 = var1 * var56;
                    int var62 = var1 + 2;
                    var56 *= var62;
                    var62 = var1 + 3;
                    var56 *= var62;
                    var56 &= 7;
                    if (var56 == 0) {
                        return var47;
                    }
                }

                AssertionError var48 = new AssertionError();
                throw var48;
            }
        }

        RuntimeException var45 = new RuntimeException();
        throw var45;
    }

    public static boolean z(PlayerEntity var0) {
        label170: {
            int var70;
            int var112;
            label179: {
                var70 = h;
                var70 ^= -1729076649;
                var112 = System.identityHashCode(var0);
                long var3 = var112;
                long var5 = var3 + 1L;
                var5 = var3 * var5;
                long var7 = var3 + 2L;
                var5 *= var7;
                var3 += 3L;
                var5 *= var3;
                var3 = var5 & 7L;
                long var168;
                int var115 = (var168 = var3 - 0L) == 0L ? 0 : (var168 < 0L ? -1 : 1);
                label167:
                if (var115 == 0) {
                    var70 = switch (var70) {
                        default -> var70 ^ -75206079;
                        case -1722389001 -> var70 ^ -852086160;
                        case -1176153767 -> {
                            var70 >>>= 16;
                            var70 &= -1687218503;
                            var70 >>= 5;
                            var70 *= 571867945;
                            yield var70 ^ -1094801629;
                        }
                    };
                    int var116 = var70 + 1;
                    int var117 = var70 * var116;
                    int var4 = var70 + 2;
                    int var118 = var117 * var4;
                    var4 = var70 + 3;
                    int var119 = var118 * var4;
                    int var120 = var119 & 7;
                    if (var120 != 0) {
                        break label170;
                    }

                    double var121 = var0.fallDistance;
                    double var169;
                    int var122 = (var169 = var121 - 0.0) == 0.0 ? 0 : (var169 < 0.0 ? -1 : 1);
                    if (var122 > 0) {
                        var70 ^= -1367976064;
                        var70 |= 694280338;
                        var70 ^= -1695567327;
                        var3 = var70;
                        var5 = var3 + 1L;
                        var5 = var3 * var5;
                        var7 = var3 + 2L;
                        var5 *= var7;
                        var3 += 3L;
                        var5 *= var3;
                        var3 = var5 & 7L;
                        long var170;
                        int var126 = (var170 = var3 - 0L) == 0L ? 0 : (var170 < 0L ? -1 : 1);
                        if (var126 != 0) {
                            break label170;
                        }

                        boolean var127 = var0.isOnGround();
                        long var143 = var112;
                        long var6 = var143 + 1L;
                        var6 = var143 * var6;
                        long var144 = var6 & 1L;
                        long var171;
                        var4 = (var171 = var144 - 0L) == 0L ? 0 : (var171 < 0L ? -1 : 1);
                        if (var4 != 0) {
                            var70 &= 626410987;
                            var70 |= -2032898077;
                            var70 -= -1755423194;
                            var70 -= -594332961;
                            var70 ^= 635339611;
                            break label167;
                        }

                        var70 -= -1057737282;
                        var70 -= 1536862314;
                        var70 >>>= 2;
                        var70 ^= -514818977;
                        if (!var127) {
                            var70 -= 849075053;
                            var70 ^= -1226386422;
                            var70 ^= -1337645002;
                            boolean var128 = var0.isClimbing();
                            Integer var146 = var112;
                            if (var146 == null) {
                                var70 += -55344714;
                                var70 ^= -720408078;
                                var70 *= -312541649;
                                var70 |= 1408805285;
                                var70 ^= -373234102;
                                break label167;
                            }

                            var70 -= -1961083726;
                            var70 ^= -1712486670;
                            var146 = var70;
                            if (var146 == null) {
                                break label170;
                            }

                            if (!var128) {
                                var70 = switch (var70) {
                                    case -1315373963 -> {
                                        var70 &= 1587519983;
                                        var70 |= -1938773329;
                                        var70 += 1738547561;
                                        var70 += -799208412;
                                        yield var70 ^ -1863222930;
                                    }
                                    default -> var70 ^ -495713498;
                                    case 1795336710 -> var70 ^ 1928192109;
                                };
                                boolean var129 = var0.isTouchingWater();
                                var146 = var112;
                                if (var146 == null) {
                                    switch (var70) {
                                        case -1669011044:
                                            var70 ^= -1552000872;
                                            break label167;
                                        case 1141154066:
                                            var70 += 404542264;
                                            var70 += -31416839;
                                            var70 -= -259470994;
                                            var70 ^= 2139428200;
                                            break label167;
                                        case 2062570390:
                                        default:
                                            var70 ^= -1896850285;
                                            break label167;
                                    }
                                }

                                var70 >>>= 27;
                                var70 ^= -1340320582;
                                int var149 = var70 + 1;
                                var149 = var70 * var149;
                                var149 &= 1;
                                if (var149 != 0) {
                                    break label170;
                                }

                                if (!var129) {
                                    var70 &= -1767586037;
                                    var70 -= 1406657467;
                                    var70 ^= -39528641;
                                    RegistryEntry var130 = StatusEffects.BLINDNESS;
                                    boolean var131 = var0.hasStatusEffect(var130);
                                    Integer var152 = var112;
                                    if (var152 == null) {
                                        var70 ^= 878058826;
                                        var70 ^= -471664753;
                                        break label167;
                                    }

                                    var70 ^= -1494546160;
                                    var70 -= -1063286032;
                                    var70 ^= -965689634;
                                    var152 = var70;
                                    if (var152 == null) {
                                        break label170;
                                    }

                                    if (!var131) {
                                        var70 = switch (var70) {
                                            default -> var70 ^ 919642334;
                                            case -760030895 -> var70 ^ 94620997;
                                            case 1622445478 -> {
                                                var70 >>= 4;
                                                var70 |= -112817843;
                                                var70 >>>= 1;
                                                var70 >>= 3;
                                                yield var70 ^ 1888244378;
                                            }
                                        };
                                        Integer var132 = var70;
                                        if (var132 == null) {
                                            break label170;
                                        }

                                        boolean var133 = var0.hasVehicle();
                                        int var154 = var112 + 1;
                                        var154 = var112 * var154;
                                        var154 &= 1;
                                        if (var154 != 0) {
                                            var70 -= 954998369;
                                            var70 >>= 27;
                                            var70 ^= 373054901;
                                            break label167;
                                        }

                                        var70 &= -1176754987;
                                        var70 *= -1699266933;
                                        var70 ^= 1558396658;
                                        if (!var133) {
                                            var70 = switch (var70) {
                                                default -> var70 ^ 1075526408;
                                                case -1452747443 -> var70 ^ 1963602620;
                                                case 1640299077 -> {
                                                    var70 |= 71309668;
                                                    var70 -= 1609182628;
                                                    yield var70 ^ 1808266632;
                                                }
                                            };
                                            int var134 = var70 + 1;
                                            int var135 = var70 * var134;
                                            var154 = var70 + 2;
                                            int var136 = var135 * var154;
                                            var154 = var70 + 3;
                                            int var137 = var136 * var154;
                                            int var138 = var137 & 7;
                                            if (var138 != 0) {
                                                break label170;
                                            }

                                            boolean var139 = var0.isSprinting();
                                            Integer var111 = var112;
                                            if (var111 == null) {
                                                switch (var70) {
                                                    case -1591235605:
                                                        var70 ^= -935153043;
                                                        break label167;
                                                    case 1847408713:
                                                        var70 ^= -298834346;
                                                        var70 -= 914338494;
                                                        var70 &= 1223982100;
                                                        var70 ^= -354310575;
                                                        var70 ^= -1267100692;
                                                        break label167;
                                                    case 2022071731:
                                                    default:
                                                        var70 ^= 1391763545;
                                                        break label167;
                                                }
                                            }

                                            var70 &= -412069894;
                                            var70 -= -1830456585;
                                            var70 |= 1563859329;
                                            var70 -= 1683002189;
                                            var70 ^= -488567072;
                                            if (!var139) {
                                                var70 += -560570186;
                                                var70 ^= -1842483303;
                                                var70 &= 959860890;
                                                var70 *= -1248916721;
                                                var70 ^= -1565966852;
                                                var112 = 1;
                                                var70 |= -861581515;
                                                var70 ^= -1042439637;
                                                break label179;
                                            }

                                            switch (var70) {
                                                case -1743846300:
                                                    var70 += 724815708;
                                                    var70 -= -584552886;
                                                    var70 &= -2105095338;
                                                    var70 ^= -949445287;
                                                    var70 ^= -839924467;
                                                    break;
                                                case -716902006:
                                                    var70 ^= 1998835462;
                                                    break;
                                                case -632728155:
                                                default:
                                                    var70 ^= 1874404256;
                                            }
                                        } else {
                                            switch (var70) {
                                                case 299795478:
                                                    var70 ^= 1927358999;
                                                    break;
                                                case 1535355294:
                                                default:
                                                    var70 ^= 494200745;
                                                    break;
                                                case 1640299077:
                                                    var70 *= 1352993913;
                                                    var70 ^= 301542729;
                                                    var70 >>= 7;
                                                    var70 ^= -2012842411;
                                            }
                                        }
                                    } else {
                                        switch (var70) {
                                            case 702284958:
                                            default:
                                                var70 ^= -921854647;
                                                break;
                                            case 861461792:
                                                var70 ^= -1863899048;
                                                break;
                                            case 1622445478:
                                                var70 &= 261850097;
                                                var70 <<= 1;
                                                var70 <<= 14;
                                                var70 += 1399518857;
                                                var70 ^= 482340747;
                                        }
                                    }
                                } else {
                                    var70 &= 1726385538;
                                    var70 &= 1401935937;
                                    var70 -= -636779307;
                                    var70 *= 2028015261;
                                    var70 ^= -1066403235;
                                }
                            } else {
                                var70 >>>= 9;
                                var70 -= -906197338;
                                var70 >>= 22;
                                var70 ^= -2004543013;
                            }
                        } else {
                            var70 &= -2103006562;
                            var70 |= -985726796;
                            var70 -= -1638505599;
                            var70 ^= -1578260937;
                        }
                    } else {
                        var70 |= -1971468912;
                        var70 ^= 58253052;
                    }

                    Integer var140 = var70;
                    if (var140 == null) {
                        break label170;
                    }

                    var112 = 0;
                    var70 >>= 15;
                    var70 ^= -1030923178;
                    break label179;
                } else {
                    var70 += 59930521;
                    var70 |= 1047194692;
                    var70 ^= -1455181493;
                }

                Integer var106 = var70;
                if (var106 != null) {
                    AssertionError var107 = new AssertionError();
                    throw var107;
                }
                break label170;
            }

            Integer var141 = var70;
            if (var141 != null) {
                return (var112 != 0);
            }
        }

        IllegalStateException var110 = new IllegalStateException();
        throw var110;
    }

    public static int H() {
        int var40 = 0;
        label49: {
            Throwable var3;
            label54: {
                int var19;
                try {
                    var19 = h;
                    var19 ^= -1808873641;
                    Object var0 = null;
                    var19 *= 882108079;
                    var19 *= 968647161;
                    var19 ^= 1230005522;
                } catch (LinkageError | RuntimeException var8) {
                    var19 = h;
                    var19 ^= 181840993;
                    var3 = N(var8);
                    var19 |= -210829900;
                    var19 ^= -1204736162;
                    Integer var4 = var19;
                    if (var4 == null) {
                        break label49;
                    }
                    break label54;
                }

                long var2 = var19;
                long var41 = var2 + 1L;
                var41 = var2 * var41;
                var2 = var41 & 1L;
                long var50;
                int var33 = (var50 = var2 - 0L) == 0L ? 0 : (var50 < 0L ? -1 : 1);
                if (var33 != 0) {
                    break label49;
                }

                try {
                    int var34 = var19 ^ -1643771507;
                    int var35 = var34 & 183137816;
                    int var36 = var35 & 1311586420;
                    int var37 = var36 - -85978086;
                    int var38 = var37 ^ 1070183605;
                    var2 = X(var38);
                } catch (LinkageError | RuntimeException var7) {
                    var19 = h;
                    var19 ^= 181840993;
                    var3 = N(var7);
                    var19 |= -210829900;
                    var19 ^= -1204736162;
                    Integer var43 = var19;
                    if (var43 == null) {
                        break label49;
                    }
                    break label54;
                }
                var19 = switch (var19) {
                    case -1567975431 -> var19 ^ -1610917494;
                    case -1421266163 -> {
                        var19 ^= -288778223;
                        yield var19 ^ 1829502926;
                    }
                    default -> var19 ^ 2065074899;
                };
                int var44 = var19 + 1;
                int var45 = var19 * var44;
                int var46 = var45 & 1;
                if (var46 != 0) {
                    break label49;
                }

                try {
                    int var48 = var19 & -1071734994;
                    int var49 = var48 ^ -1556976862;
                    var40 = Sy(var2, var49);
                    var19 <<= 23;
                    var19 ^= -219509674;
                } catch (LinkageError | RuntimeException var6) {
                    var19 = h;
                    var19 ^= 181840993;
                    var3 = N(var6);
                    var19 |= -210829900;
                    var19 ^= -1204736162;
                    Integer var47 = var19;
                    if (var47 == null) {
                        break label49;
                    }
                    break label54;
                }

                Integer var10 = var19;
                if (var10 != null) {
                    return var40;
                }
                break label49;
            }

            Throwable var9 = var3;
            return 60;
        }

        UnsupportedOperationException var11 = new UnsupportedOperationException();
        throw var11;
    }

    private static long X(int var0) {
        MinecraftClient var2 = zp();

        Integer var5 = switch (var0) {
            default -> var0 ^ 1193809874;
            case 745470834 -> var0 ^ 770512377;
            case 987869011 -> {
                int var1 = var0 & -1274550024;
                var1 |= -1918498753;
                yield var1 ^ 1751453360;
            }
        };
        if (var5 == null) {
            IllegalStateException var7 = new IllegalStateException();
            throw var7;
        } else {
            Window var6 = var2.getWindow();
            return var6.getHandle();
        }
    }

    private static int Sy(long var0, int var2) {
        int var4 = (int)var0;
        long var5 = GLFW.glfwGetWindowMonitor(var0);
        long var220;
        int var7 = (var220 = var5 - 0L) == 0L ? 0 : (var220 < 0L ? -1 : 1);
        int var8 = var4 + 1;
        var8 = var4 * var8;
        int var9 = var4 + 2;
        var8 *= var9;
        var9 = var4 + 3;
        var8 *= var9;
        var8 &= 7;
        if (var8 != 0) {
            int var113 = var2 >>> 7;
            var113 += 167320334;
            var113 >>>= 1;
            var113 |= -793339288;
            var113 ^= 1264002378;
        } else {
            label183: {
                label175: {
                    int var3 = var2 | -2114640093;
                    var3 -= -1242614610;
                    var3 |= 1560573567;
                    var3 ^= -1844818063;
                    long var164;
                    if (var7 == 0) {
                        var3 += 1938092517;
                        var3 *= 1064188531;
                        var3 ^= 681940409;
                        Integer var157 = var3;
                        if (var157 == null) {
                            break label175;
                        }

                        int var158 = var3 * 52827093;
                        var158 *= 2055606477;
                        var158 *= -1570036505;
                        var158 ^= 1154079541;
                        var158 ^= 698236725;
                        long var163 = t(var0, var158);
                        long var191 = var4;
                        long var11 = var191 + 1L;
                        var11 = var191 * var11;
                        long var192 = var11 & 1L;
                        long var221;
                        var9 = (var221 = var192 - 0L) == 0L ? 0 : (var221 < 0L ? -1 : 1);
                        if (var9 != 0) {
                            switch (var3) {
                                case -1984545461:
                                default:
                                    var3 ^= 1906142242;
                                    break label183;
                                case -397781872:
                                    var3 += 819991443;
                                    var3 ^= -2017291513;
                                    break label183;
                                case 1231167111:
                                    var3 ^= 1698277996;
                                    break label183;
                            }
                        }

                        var3 &= -671008808;
                        var3 += 1121071928;
                        var3 += 884998500;
                        var3 ^= -1262316849;
                        var9 = var3 + 1;
                        var9 = var3 * var9;
                        var9 &= 1;
                        if (var9 != 0) {
                            break label175;
                        }

                        var164 = var163;
                        var3 -= 595406090;
                        var3 *= -67172473;
                        var3 -= -908082247;
                        var3 ^= 254078509;
                        var3 ^= 327926899;
                    } else {
                        var3 >>>= 19;
                        var3 -= 412321988;
                        var3 ^= -1162154945;
                        Integer var197 = var3;
                        if (var197 == null) {
                            break label175;
                        }

                        var164 = var5;
                        var3 |= -714397659;
                        var3 *= -857755637;
                        var3 ^= 642655237;
                    }

                    long var222;
                    int var128 = (var222 = var164 - 0L) == 0L ? 0 : (var222 < 0L ? -1 : 1);
                    long var198 = var4;
                    long var215 = var198 + 1L;
                    var215 = var198 * var215;
                    long var13 = var198 + 2L;
                    var215 *= var13;
                    long var199 = var198 + 3L;
                    var215 *= var199;
                    long var200 = var215 & 7L;
                    long var223;
                    int var6 = (var223 = var200 - 0L) == 0L ? 0 : (var223 < 0L ? -1 : 1);
                    if (var6 != 0) {
                        var3 >>>= 25;
                        var3 ^= -1628898436;
                        break label183;
                    }

                    var3 <<= 21;
                    var3 ^= 2045644039;
                    var6 = var3 + 1;
                    var6 = var3 * var6;
                    var9 = var3 + 2;
                    var6 *= var9;
                    var9 = var3 + 3;
                    var6 *= var9;
                    var6 &= 7;
                    label159:
                    if (var6 == 0) {
                        GLFWVidMode var132;
                        if (var128 == 0) {
                            var3 = switch (var3) {
                                case -991032057 -> {
                                    var3 ^= -877450780;
                                    var3 ^= -1436078560;
                                    var3 += 1882645327;
                                    yield var3 ^ 67143243;
                                }
                                case 364072791 -> var3 ^ 1401126600;
                                default -> var3 ^ -1125693875;
                            };
                            var5 = var3;
                            long var203 = var5 + 1L;
                            long var204 = var5 * var203;
                            var5 = var204 & 1L;
                            long var224;
                            int var131 = (var224 = var5 - 0L) == 0L ? 0 : (var224 < 0L ? -1 : 1);
                            if (var131 != 0) {
                                break label159;
                            }

                            var132 = null;
                            var3 |= -322529155;
                            var3 += -145738219;
                            var3 |= 1208212838;
                            var3 ^= 2001715933;
                        } else {
                            var3 = switch (var3) {
                                default -> var3 ^ -380191486;
                                case -991032057 -> {
                                    var3 <<= 7;
                                    yield var3 ^ -1833144771;
                                }
                                case -227546977 -> var3 ^ 181184573;
                            };
                            GLFWVidMode var142 = GLFW.glfwGetVideoMode(var164);
                            long var165 = var4;
                            long var205 = var165 + 1L;
                            long var206 = var165 * var205;
                            long var166 = var206 & 1L;
                            long var225;
                            var7 = (var225 = var166 - 0L) == 0L ? 0 : (var225 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                var3 -= 1890161639;
                                var3 ^= -1230100968;
                                var3 -= -536048751;
                                var3 ^= 2103054105;
                                break label183;
                            }

                            var3 += -954303602;
                            var3 ^= 829432305;
                            var3 ^= -1698120118;
                            Integer var168 = var3;
                            if (var168 == null) {
                                break label159;
                            }

                            var132 = var142;
                            var3 >>>= 13;
                            var3 -= -1525181871;
                            var3 >>>= 16;
                            var3 ^= -1979160637;
                        }

                        long var143 = var4;
                        long var180 = var143 + 1L;
                        long var181 = var143 * var180;
                        long var10 = var143 + 2L;
                        long var182 = var181 * var10;
                        long var144 = var143 + 3L;
                        long var183 = var182 * var144;
                        long var145 = var183 & 7L;
                        long var226;
                        var6 = (var226 = var145 - 0L) == 0L ? 0 : (var226 < 0L ? -1 : 1);
                        if (var6 != 0) {
                            switch (var3) {
                                case -1979171541:
                                    var3 -= 454265778;
                                    var3 ^= -266581411;
                                    break label183;
                                case 1126483143:
                                    var3 ^= 1899867778;
                                    break label183;
                                case 1265149532:
                                default:
                                    var3 ^= 830882010;
                                    break label183;
                            }
                        }
                        var3 = switch (var3) {
                            case -1979171541 -> {
                                var3 += -1995501126;
                                var3 += -1480791924;
                                var3 &= -2039315618;
                                yield var3 ^ -60024536;
                            }
                            default -> var3 ^ 1235206007;
                            case 878093231 -> var3 ^ -1576894982;
                        };
                        long var147 = var3;
                        long var184 = var147 + 1L;
                        long var185 = var147 * var184;
                        var10 = var147 + 2L;
                        long var186 = var185 * var10;
                        long var148 = var147 + 3L;
                        long var187 = var186 * var148;
                        long var149 = var187 & 7L;
                        long var227;
                        var6 = (var227 = var149 - 0L) == 0L ? 0 : (var227 < 0L ? -1 : 1);
                        label146:
                        if (var6 == 0) {
                            if (var132 == null) {
                                var3 = switch (var3) {
                                    case -140351544 -> var3 ^ 98824981;
                                    case 2117868152 -> {
                                        var3 |= -1843917688;
                                        var3 += -1040333804;
                                        var3 -= 1082590091;
                                        yield var3 ^ 1941310400;
                                    }
                                    default -> var3 ^ 116219074;
                                };
                                Integer var151 = var3;
                                if (var151 == null) {
                                    break label146;
                                }

                                var6 = 0;
                                var3 >>= 9;
                                var3 -= 885292352;
                                var3 |= 515515297;
                                var3 ^= 1138997739;
                            } else {
                                var3 <<= 25;
                                var3 *= -1657771407;
                                var3 ^= -433874104;
                                var3 ^= -1790176623;
                                var3 ^= -215709458;
                                long var169 = var3;
                                long var207 = var169 + 1L;
                                long var208 = var169 * var207;
                                var215 = var169 + 2L;
                                long var209 = var208 * var215;
                                long var170 = var169 + 3L;
                                long var210 = var209 * var170;
                                long var171 = var210 & 7L;
                                long var228;
                                var7 = (var228 = var171 - 0L) == 0L ? 0 : (var228 < 0L ? -1 : 1);
                                if (var7 != 0) {
                                    break label146;
                                }

                                int var133 = var132.refreshRate();
                                Integer var173 = var4;
                                if (var173 == null) {
                                    var3 ^= -1233245740;
                                    var3 ^= 1490932679;
                                    break label183;
                                }

                                var3 *= -271873437;
                                var3 >>= 24;
                                var3 <<= 29;
                                var3 ^= -147063775;
                                var6 = var133;
                                switch (var3) {
                                    case -2027456312:
                                        var3 ^= 444460648;
                                        break;
                                    case -1757676511:
                                        var3 -= -780630886;
                                        var3 |= 2040956835;
                                        var3 += 1597050157;
                                        var3 -= 638216067;
                                        var3 ^= -1424588015;
                                        break;
                                    case 1835700480:
                                    default:
                                        var3 ^= 1046599965;
                                }
                            }

                            long var174 = var3;
                            long var211 = var174 + 1L;
                            long var212 = var174 * var211;
                            long var175 = var212 & 1L;
                            long var229;
                            int var134 = (var229 = var175 - 0L) == 0L ? 0 : (var229 < 0L ? -1 : 1);
                            if (var134 == 0) {
                                long var153 = var4;
                                long var188 = var153 + 1L;
                                long var189 = var153 * var188;
                                long var154 = var189 & 1L;
                                long var230;
                                var4 = (var230 = var154 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                                if (var4 != 0) {
                                    var3 |= 1488815510;
                                    var3 ^= 1112892658;
                                    break label183;
                                }
                                var3 = switch (var3) {
                                    case -1676140992 -> {
                                        var3 += -295134300;
                                        var3 |= 1212931964;
                                        var3 += -425183918;
                                        var3 |= -1943431751;
                                        yield var3 ^ -674870669;
                                    }
                                    case -118096850 -> var3 ^ -465640117;
                                    default -> var3 ^ -698430804;
                                };
                                Integer var120 = var3;
                                label124:
                                if (var120 != null) {
                                    int var126;
                                    if (var6 > 0) {
                                        var3 ^= 733562475;
                                        var3 ^= -1560961999;
                                        var3 ^= 1721636537;
                                        var126 = var3 + 1;
                                        var126 = var3 * var126;
                                        var6 = var3 + 2;
                                        var126 *= var6;
                                        var6 = var3 + 3;
                                        var126 *= var6;
                                        var126 &= 7;
                                        if (var126 != 0) {
                                            break label124;
                                        }

                                        var126 = var6;
                                        var3 |= -2121939181;
                                        var3 &= 1020855963;
                                        var3 >>= 30;
                                        var3 ^= 1313007638;
                                    } else {
                                        var3 <<= 20;
                                        var3 &= 467332367;
                                        var3 *= -1076225453;
                                        var3 ^= -1666469868;
                                        var126 = 60;
                                        var3 >>>= 2;
                                        var3 ^= 1224213523;
                                    }

                                    Integer var136 = var3;
                                    if (var136 != null) {
                                        return var126;
                                    }
                                }
                            }
                        }
                    }
                }

                IllegalStateException var127 = new IllegalStateException();
                throw var127;
            }
        }

        AssertionError var118 = new AssertionError();
        throw var118;
    }

    private static long t(long var0, int var2) {
        label191: {
            int var4 = (int)var0;
            int[] var5 = new int[1];
            int[] var6 = new int[1];
            GLFW.glfwGetWindowPos(var0, var5, var6);
            int var134 = var5[0];
            MinecraftClient var7 = zp();
            Window var140 = var7.getWindow();
            int var141 = var140.getWidth();
            int var142 = var141 / 2;
            int var135 = var134 + var142;
            int var136 = var135;
            int var137 = var6[0];
            var7 = zp();
            Window var144 = var7.getWindow();
            int var145 = var144.getHeight();
            int var146 = var145 / 2;
            int var138 = var137 + var146;
            Integer var147 = var4;
            if (var147 == null) {
                int var131 = var2 * -1542525167;
                var131 ^= 321939257;
            } else {
                label213: {
                    int var3 = var2 - -462553124;
                    var3 ^= 1647843903;
                    int var139 = var138;
                    PointerBuffer var148 = GLFW.glfwGetMonitors();
                    PointerBuffer var149 = var148;
                    if (var148 != null) {
                        var3 ^= 1994122748;
                        var3 *= 364482417;
                        var3 |= -594316727;
                        var3 ^= -184995271;
                        int[] var8 = new int[1];
                        var8 = var8;
                        long var9 = var4;
                        long var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var213;
                        int var153 = (var213 = var9 - 0L) == 0L ? 0 : (var213 < 0L ? -1 : 1);
                        if (var153 != 0) {
                            var3 |= 1655593606;
                            var3 ^= -1734388279;
                            var3 ^= -2086657322;
                            break label213;
                        }
                        var3 = switch (var3) {
                            case 156157398 -> {
                                var3 >>>= 23;
                                var3 -= -1626096550;
                                yield var3 ^ 1936479134;
                            }
                            case 758154529 -> var3 ^ 84415230;
                            default -> var3 ^ 1085320386;
                        };
                        int var154 = var3 + 1;
                        int var155 = var3 * var154;
                        int var10 = var3 + 2;
                        int var156 = var155 * var10;
                        var10 = var3 + 3;
                        int var157 = var156 * var10;
                        int var158 = var157 & 7;
                        if (var158 != 0) {
                            break label191;
                        }

                        int[] var159 = new int[1];
                        int[] var160 = var159;
                        int var162 = 0;
                        var162 = var162;

                        var3 = switch (var3) {
                            case 327159846 -> {
                                var3 -= -1402773046;
                                yield var3 ^ 933467033;
                            }
                            case 399473128 -> var3 ^ -1198754238;
                            default -> var3 ^ -1854050413;
                        };

                        label175:
                        while (true) {
                            int var167 = var149.limit();
                            int var12 = var4 + 1;
                            var12 = var4 * var12;
                            var12 &= 1;
                            if (var12 != 0) {
                                var3 >>>= 16;
                                var3 >>= 27;
                                var3 >>>= 26;
                                var3 <<= 31;
                                var3 ^= 1892788425;
                                break label213;
                            }

                            var3 &= 179908521;
                            var3 |= 1156730045;
                            var3 |= 1278175195;
                            var3 |= 1113158807;
                            var3 ^= 730250335;
                            Integer var172 = var3;
                            if (var172 == null) {
                                break label191;
                            }

                            if (var162 >= var167) {
                                switch (var3) {
                                    case 115470069:
                                    default:
                                        var3 ^= -408944620;
                                        break label175;
                                    case 797464307:
                                        var3 ^= 77317093;
                                        break label175;
                                    case 1702478752:
                                        var3 &= -1585136181;
                                        var3 *= 349168765;
                                        var3 ^= -1134906554;
                                        break label175;
                                }
                            }

                            var3 |= 923819268;
                            var3 |= 1039864612;
                            var3 &= -1026675404;
                            var3 *= 173457415;
                            var3 ^= 1968916369;
                            var11 = var149.get(var162);
                            Integer var179 = var4;
                            if (var179 == null) {
                                var3 *= -266182049;
                                var3 &= -1141419907;
                                var3 ^= 1221978296;
                                break label213;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ -560678851;
                                case 1353925108 -> var3 ^ -2138963906;
                                case 1512184941 -> {
                                    var3 *= 824355751;
                                    yield var3 ^ 179936390;
                                }
                            };
                            var13 = var3;
                            long var15 = var13 + 1L;
                            var15 = var13 * var15;
                            var13 = var15 & 1L;
                            long var214;
                            int var182 = (var214 = var13 - 0L) == 0L ? 0 : (var214 < 0L ? -1 : 1);
                            if (var182 != 0) {
                                break label191;
                            }

                            GLFWVidMode var183 = GLFW.glfwGetVideoMode(var11);
                            if (var183 == null) {
                                var3 &= -798118987;
                                var3 += -846374285;
                                var3 >>>= 13;
                                var3 >>>= 7;
                                var3 ^= 680996985;
                                int var14 = var3 + 1;
                                var14 = var3 * var14;
                                var14 &= 1;
                                if (var14 != 0) {
                                    break label191;
                                }

                                var3 &= 1228977834;
                                var3 &= -1696605141;
                                var3 ^= -1029986119;
                            } else {
                                var3 = switch (var3) {
                                    default -> var3 ^ -2121621908;
                                    case 233099468 -> var3 ^ 2123456635;
                                    case 839829149 -> {
                                        var3 >>= 16;
                                        var3 += 2819819;
                                        var3 *= 1002285591;
                                        yield var3 ^ -276065026;
                                    }
                                };
                                GLFW.glfwGetMonitorPos(var11, var8, var160);
                                int var193 = var4 + 1;
                                var193 = var4 * var193;
                                var193 &= 1;
                                if (var193 != 0) {
                                    var3 *= 215675005;
                                    var3 &= -906563468;
                                    var3 &= 1320801643;
                                    var3 ^= 2018638025;
                                    break label213;
                                }
                                var3 = switch (var3) {
                                    case -989336415 -> {
                                        var3 &= 3620344;
                                        var3 ^= -1006225269;
                                        yield var3 ^ 461846455;
                                    }
                                    case -539339935 -> var3 ^ 1930770729;
                                    default -> var3 ^ -814997945;
                                };
                                var193 = var8[0];
                                if (var136 >= var193) {
                                    var3 ^= -1972729492;
                                    var3 ^= 256895168;
                                    var193 = var8[0];
                                    int var204 = var4 + 1;
                                    int var205 = var4 * var204;
                                    int var206 = var205 & 1;
                                    if (var206 != 0) {
                                        var3 |= 2040300898;
                                        var3 >>>= 16;
                                        var3 |= -1639635479;
                                        var3 ^= -292235466;
                                        break label213;
                                    }

                                    var3 ^= 456015137;
                                    var3 += 1202102169;
                                    var3 |= -1449548818;
                                    var3 ^= -186952949;
                                    int var207 = var183.width();
                                    var193 += var207;
                                    if (var136 < var193) {
                                        var3 ^= 866644777;
                                        var3 ^= 1241456470;
                                        var193 = var160[0];
                                        Integer var208 = var4;
                                        if (var208 == null) {
                                            var3 ^= 579636225;
                                            var3 ^= 1969431634;
                                            break label213;
                                        }
                                        var3 = switch (var3) {
                                            default -> var3 ^ 920864688;
                                            case 658374810 -> {
                                                var3 *= 1325428359;
                                                yield var3 ^ -1354635727;
                                            }
                                            case 1803827293 -> var3 ^ -1979408895;
                                        };
                                        if (var139 >= var193) {
                                            var3 >>= 18;
                                            var3 |= -1526447916;
                                            var3 <<= 7;
                                            var3 &= 596130640;
                                            var3 ^= 1593217903;
                                            var193 = var160[0];
                                            int var184 = var183.height();
                                            var15 = var4;
                                            long var17 = var15 + 1L;
                                            var17 = var15 * var17;
                                            var15 = var17 & 1L;
                                            long var215;
                                            int var211 = (var215 = var15 - 0L) == 0L ? 0 : (var215 < 0L ? -1 : 1);
                                            if (var211 != 0) {
                                                var3 += -1023857421;
                                                var3 += 1265806441;
                                                var3 ^= 465250818;
                                                break label213;
                                            }
                                            var3 = switch (var3) {
                                                default -> var3 ^ -1341948239;
                                                case 568070211 -> var3 ^ 1514773509;
                                                case 1560193391 -> {
                                                    var3 += 1068586912;
                                                    var3 |= -1059840494;
                                                    yield var3 ^ 846644377;
                                                }
                                            };
                                            int var185 = var193 + var184;
                                            if (var139 < var185) {
                                                var3 ^= -21123435;
                                                var3 -= 1559227977;
                                                var3 ^= -1458002345;
                                                int var186 = var3 + 1;
                                                int var187 = var3 * var186;
                                                var193 = var3 + 2;
                                                int var188 = var187 * var193;
                                                var193 = var3 + 3;
                                                int var189 = var188 * var193;
                                                int var190 = var189 & 7;
                                                if (var190 == 0) {
                                                    return var11;
                                                }
                                                break label191;
                                            }

                                            var3 += -251366566;
                                            var3 -= -865395876;
                                            var3 ^= -645427427;
                                        } else {
                                            var3 *= -1982722711;
                                            var3 -= 818051148;
                                            var3 <<= 8;
                                            var3 -= 12465293;
                                            var3 ^= -1675500822;
                                        }
                                    } else {
                                        var3 *= 249405491;
                                        var3 |= -778166170;
                                        var3 ^= 1027919206;
                                    }
                                } else {
                                    var3 >>>= 25;
                                    var3 &= 632041660;
                                    var3 += 995388719;
                                    var3 ^= -238038590;
                                }
                            }

                            int var169 = var162 + 1;
                            int var173 = var4 + 1;
                            var173 = var4 * var173;
                            var173 &= 1;
                            if (var173 != 0) {
                                var3 -= 1780970377;
                                var3 >>>= 11;
                                var3 &= 153055951;
                                var3 ^= 1893575232;
                                break label213;
                            }

                            var3 += -1283087203;
                            var3 |= 274700727;
                            var3 ^= -180965445;
                            var3 ^= -1932568781;
                            var173 = var3 + 1;
                            var173 = var3 * var173;
                            var173 &= 1;
                            if (var173 != 0) {
                                break label191;
                            }

                            var162 = var169;
                            var3 *= -2061407569;
                            var3 &= 1577531733;
                            var3 &= -360384552;
                            var3 ^= 1354436053;
                        }
                    } else {
                        switch (var3) {
                            case -1031754965:
                                var3 *= -121345213;
                                var3 <<= 24;
                                var3 -= 353247514;
                                var3 ^= -792832480;
                                break;
                            case -877644034:
                            default:
                                var3 ^= 490675399;
                                break;
                            case 1478916661:
                                var3 ^= 1044118982;
                        }
                    }

                    Integer var121 = var3;
                    if (var121 != null) {
                        return GLFW.glfwGetPrimaryMonitor();
                    }
                    break label191;
                }
            }

            AssertionError var133 = new AssertionError();
            throw var133;
        }

        UnsupportedOperationException var127 = new UnsupportedOperationException();
        throw var127;
    }

    public static boolean rZ(int var0, int var1, int var2) {
        label99: {
            int var70;
            label105: {
                int var3 = h;
                var3 ^= -1902960318;
                long var6 = var0;
                long var8 = var6 + 1L;
                var8 = var6 * var8;
                var6 = var8 & 1L;
                long var115;
                int var72 = (var115 = var6 - 0L) == 0L ? 0 : (var115 < 0L ? -1 : 1);
                if (var72 == 0) {
                    var3 ^= -2013621990;
                    var3 ^= -53893673;
                    var3 += -319569446;
                    var3 *= 758167611;
                    var3 ^= 2118771173;
                    var6 = var0;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var116;
                    int var76 = (var116 = var6 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
                    if (var76 != 0) {
                        break label99;
                    }

                    MinecraftClient var77 = zp();
                    ClientWorld var78 = var77.world;
                    if (var78 == null) {
                        var3 &= 48462408;
                        var3 <<= 23;
                        var3 ^= 1832319606;
                        var3 >>= 28;
                        var3 ^= 1023195816;
                        return false;
                    }
                    var3 = switch (var3) {
                        default -> var3 ^ -793333787;
                        case -424209124 -> {
                            var3 -= -1699293236;
                            yield var3 ^ -1901619191;
                        }
                        case 2100007537 -> var3 ^ -444984095;
                    };
                    Integer var7 = var0;
                    if (var7 == null) {
                        break label99;
                    }

                    Mutable var88 = W;
                    var8 = var0;
                    var10 = var8 + 1L;
                    var10 = var8 * var10;
                    var8 = var10 & 1L;
                    long var117;
                    int var103 = (var117 = var8 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                    label93:
                    if (var103 == 0) {
                        var3 = switch (var3) {
                            default -> var3 ^ -754434217;
                            case -1029200551 -> {
                                var3 |= 897355219;
                                var3 |= 141945467;
                                yield var3 ^ 444625280;
                            }
                            case 272888297 -> var3 ^ 255070535;
                        };
                        var8 = var0;
                        var10 = var8 + 1L;
                        var10 = var8 * var10;
                        var8 = var10 & 1L;
                        long var118;
                        int var106 = (var118 = var8 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                        if (var106 != 0) {
                            break label99;
                        }

                        Mutable var89 = var88.set(var0, var1, var2);
                        Mutable var90 = W;
                        BlockState var91 = var78.getBlockState(var90);
                        boolean var107 = var91.isAir();
                        if (!var107) {
                            var3 >>= 12;
                            var3 &= -594884412;
                            var3 ^= -1577443724;
                            Integer var108 = var0;
                            if (var108 == null) {
                                break label99;
                            }

                            Mutable var109 = W;
                            VoxelShape var79 = var91.getCollisionShape(var78, var109);
                            long var92 = var0;
                            long var9 = var92 + 1L;
                            var9 = var92 * var9;
                            long var93 = var9 & 1L;
                            long var119;
                            var70 = (var119 = var93 - 0L) == 0L ? 0 : (var119 < 0L ? -1 : 1);
                            if (var70 != 0) {
                                var3 &= -1306333047;
                                var3 ^= 223337654;
                                var3 &= 1214605819;
                                var3 ^= 773831154;
                                break label93;
                            }
                            var3 = switch (var3) {
                                default -> var3 ^ -1571245137;
                                case 1408513017 -> var3 ^ -34597838;
                                case 2104516276 -> {
                                    var3 >>= 16;
                                    yield var3 ^ 2062453068;
                                }
                            };
                            boolean var68 = var79.isEmpty();
                            if (!var68) {
                                var3 *= -1227297059;
                                var3 ^= -494554795;
                                Integer var69 = var0;
                                if (var69 == null) {
                                    break label99;
                                }

                                var70 = 1;
                                var3 -= -1911627275;
                                var3 &= 306527816;
                                var3 += -1867490174;
                                var3 |= -1530387290;
                                var3 ^= -1983281644;
                                break label105;
                            }

                            var3 &= 904502372;
                            var3 -= 91334827;
                            var3 |= 558426393;
                            var3 ^= -124150188;
                        } else {
                            var3 >>= 13;
                            var3 -= 2081021458;
                            var3 -= -1218853240;
                            var3 ^= 528282191;
                        }

                        int var80 = var0 + 1;
                        int var81 = var0 * var80;
                        int var94 = var0 + 2;
                        int var82 = var81 * var94;
                        var94 = var0 + 3;
                        int var83 = var82 * var94;
                        int var84 = var83 & 7;
                        if (var84 != 0) {
                            break label99;
                        }

                        var70 = 0;
                        var3 &= -308459353;
                        var3 |= -1764924217;
                        var3 ^= -84373931;
                        break label105;
                    } else {
                        var3 -= -617075433;
                        var3 <<= 10;
                        var3 += 558521124;
                        var3 ^= -112078108;
                    }
                } else {
                    switch (var3) {
                        case -1350167988:
                            var3 &= -1868446257;
                            var3 *= 662235795;
                            var3 >>= 6;
                            var3 |= 1537755602;
                            var3 ^= -640192994;
                            break;
                        case 580995864:
                            var3 ^= 1981410559;
                            break;
                        case 1597187562:
                        default:
                            var3 ^= -1202104444;
                    }
                }

                Integer var54 = var0;
                if (var54 != null) {
                    AssertionError var55 = new AssertionError();
                    throw var55;
                }
                break label99;
            }

            int var85 = var0 + 1;
            var85 = var0 * var85;
            var85 &= 1;
            if (var85 == 0) {
                return (var70 != 0);
            }
        }

        IllegalStateException var67 = new IllegalStateException();
        throw var67;
    }

    public static Entity QI() {
        int var0 = h;
        var0 ^= 783176145;
        MinecraftClient var1 = zp();
        var0 *= -951150319;
        var0 -= -1774568182;
        var0 -= 267649891;
        var0 ^= -738917874;
        int var2 = of_2.qA;
        var0 ^= var2;
        var0 ^= -477106862;
        of_2.qA = -477106862;
        var2 = of_2.oz;
        var0 ^= var2;
        var0 ^= -1633129641;
        of_2.oz = -1633129641;
        var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var0 += 3;
        var2 *= var0;
        var0 = var2 & 7;
        if (var0 == 0) {
            return var1.player;
        } else {
            UnsupportedOperationException var15 = new UnsupportedOperationException();
            throw var15;
        }
    }

    public static boolean ax() {
        int var0 = h;
        var0 ^= 1388540325;
        MinecraftClient var1 = zp();
        GameOptions var10 = var1.options;
        Perspective var11 = var10.getPerspective();

        var0 = switch (var0) {
            default -> var0 ^ 1085803324;
            case 1460663164 -> var0 ^ 239231245;
            case 1943421611 -> {
                var0 <<= 8;
                yield var0 ^ 2103049439;
            }
        };
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var0 += 3;
        var2 *= var0;
        var0 = var2 & 7;
        if (var0 != 0) {
            RuntimeException var9 = new RuntimeException();
            throw var9;
        } else {
            return var11.isFirstPerson();
        }
    }

    public static boolean x(Entity var0) {
        label72: {
            int var1 = h;
            var1 ^= 520837696;
            int var2 = System.identityHashCode(var0);
            int var3 = (var0 instanceof LivingEntity) ? 1 : 0;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 != 0) {
                switch (var1) {
                    case -1913336346:
                    default:
                        var1 ^= -1084822922;
                        break;
                    case -664992279:
                        var1 ^= -301011282;
                        break;
                    case 1042180430:
                        var1 += 490605361;
                        var1 += -3373608;
                        var1 -= 1532276289;
                        var1 ^= 465570795;
                }
            } else {
                label71: {
                    var1 ^= 1182483770;
                    var1 *= 750679051;
                    var1 ^= -778015879;
                    long var72 = var1;
                    long var6 = var72 + 1L;
                    var6 = var72 * var6;
                    long var8 = var72 + 2L;
                    var6 *= var8;
                    long var73 = var72 + 3L;
                    var6 *= var73;
                    long var74 = var6 & 7L;
                    long var80;
                    var4 = (var80 = var74 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label72;
                    }

                    if (var3 != 0) {
                        var1 &= -1789327545;
                        var1 ^= 2042176777;
                        var1 += 180332520;
                        var1 ^= 647826094;
                        LivingEntity var63 = (LivingEntity)var0;
                        var3 = var63.isGliding() ? 1 : 0;
                        Integer var55 = var2;
                        if (var55 == null) {
                            var1 += -2071644016;
                            var1 ^= -1833601677;
                            var1 += 1291089737;
                            var1 += 462480769;
                            var1 ^= -983850850;
                            break label71;
                        }

                        var1 &= 993563532;
                        var1 |= 1731687269;
                        var1 *= 29524265;
                        var1 ^= -1765243109;
                        if (var3 != 0) {
                            var1 -= -626813297;
                            var1 -= 184281667;
                            var1 += 613856977;
                            var1 ^= -1136954258;
                            int var56 = var1 + 1;
                            var56 = var1 * var56;
                            var3 = var1 + 2;
                            var56 *= var3;
                            var3 = var1 + 3;
                            var56 *= var3;
                            var56 &= 7;
                            if (var56 != 0) {
                                break label72;
                            }

                            boolean var61 = true;
                            switch (var1) {
                                case -2041245059:
                                default:
                                    var1 ^= 1011117165;
                                    return var61;
                                case -1048850429:
                                    var1 <<= 16;
                                    var1 -= -465674533;
                                    var1 *= -2028075451;
                                    var1 ^= -665236838;
                                    var1 ^= -777941259;
                                    return var61;
                                case -334471312:
                                    var1 ^= -807651534;
                                    return var61;
                            }
                        }

                        switch (var1) {
                            case -1970221126:
                                var1 ^= -612838107;
                                break;
                            case -1626656336:
                            default:
                                var1 ^= 757229633;
                                break;
                            case 1044999790:
                                var1 ^= -667947197;
                                var1 &= 584787776;
                                var1 ^= 1582178569;
                        }
                    } else {
                        var1 ^= 1449817691;
                        var1 += 377154788;
                        var1 ^= -136940853;
                    }

                    long var67 = var1;
                    long var5 = var67 + 1L;
                    var5 = var67 * var5;
                    long var68 = var5 & 1L;
                    long var81;
                    var3 = (var81 = var68 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                    if (var3 != 0) {
                        break label72;
                    }

                    boolean var82 = false;
                    switch (var1) {
                        case -2117122554:
                            var1 ^= -1448006467;
                            return var82;
                        case -432822859:
                        default:
                            var1 ^= 573027085;
                            return var82;
                        case 2081169417:
                            var1 += 95846132;
                            var1 += 1503756180;
                            var1 ^= 1602262535;
                            return var82;
                    }
                }
            }

            UnsupportedOperationException var62 = new UnsupportedOperationException();
            throw var62;
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    public static float Aw(Entity var0, float var1) {
        label58: {
            int var2 = h;
            var2 ^= 1829767384;
            int var3 = System.identityHashCode(var0);
            int var4 = (var0 instanceof LivingEntity) ? 1 : 0;
            Integer var5 = var3;
            if (var5 == null) {
                switch (var2) {
                    case -1558249202:
                    default:
                        var2 ^= 792058464;
                        break;
                    case 547614244:
                        var2 ^= 2005377806;
                        break;
                    case 1275411414:
                        var2 -= -2113735091;
                        var2 -= 397753059;
                        var2 <<= 5;
                        var2 ^= 995332936;
                }
            } else {
                var2 |= -1685504176;
                var2 += 749905331;
                var2 |= 1674022942;
                var2 &= 2133955085;
                var2 ^= 911750989;
                var5 = var2;
                if (var5 == null) {
                    break label58;
                }

                if (var4 == 0) {
                    var2 -= -49959185;
                    var2 ^= 2057197378;
                    Integer var43 = var2;
                    if (var43 != null) {
                        return var0.getYaw(var1);
                    }
                    break label58;
                }

                var2 -= -180324138;
                var2 ^= -2015389381;
                var2 |= 1829731812;
                var2 >>>= 8;
                var2 ^= 1614473683;
                var4 = var2 + 1;
                var4 = var2 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label58;
                }

                LivingEntity var57 = (LivingEntity)var0;
                long var63 = var3;
                long var7 = var63 + 1L;
                var7 = var63 * var7;
                long var9 = var63 + 2L;
                var7 *= var9;
                long var64 = var63 + 3L;
                var7 *= var64;
                long var65 = var7 & 7L;
                long var80;
                int var66 = (var80 = var65 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                if (var66 != 0) {
                    var2 *= -2146236007;
                    var2 ^= 1888947140;
                } else {
                    var2 >>>= 22;
                    var2 >>= 17;
                    var2 >>>= 30;
                    var2 ^= 1606830606;
                    var2 ^= 2056317157;
                    var2 ^= -772649944;
                    var66 = var2 + 1;
                    var66 = var2 * var66;
                    int var6 = var2 + 2;
                    var66 *= var6;
                    var6 = var2 + 3;
                    var66 *= var6;
                    var66 &= 7;
                    if (var66 != 0) {
                        break label58;
                    }

                    float var72 = var57.lastHeadYaw;
                    float var58 = var57.headYaw;
                    float var59 = var58 - var72;
                    long var74 = var3;
                    long var8 = var74 + 1L;
                    var8 = var74 * var8;
                    long var75 = var8 & 1L;
                    long var81;
                    var3 = (var81 = var75 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var2 &= -474091297;
                        var2 >>>= 23;
                        var2 -= -1313093901;
                        var2 ^= -1895886573;
                        float var52 = TP.jA(var59);
                        float var53 = var52 * var1;
                        return var72 + var53;
                    }

                    switch (var2) {
                        case -399219122:
                        default:
                            var2 ^= 1446963731;
                            break;
                        case -190517565:
                            var2 ^= 1540686328;
                            var2 *= 962504159;
                            var2 += 1496101262;
                            var2 *= -1025590275;
                            var2 ^= -959063377;
                            break;
                        case 1947468993:
                            var2 ^= 560065377;
                    }
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 == 0) {
                AssertionError var51 = new AssertionError();
                throw var51;
            }
        }

        IllegalArgumentException var44 = new IllegalArgumentException();
        throw var44;
    }

    public static float E(Entity var0, float var1) {
        int var2 = h;
        var2 ^= 1045949070;
        int var3 = System.identityHashCode(var0);
        int var4 = var3 + 1;
        var4 = var3 * var4;
        int var5 = var3 + 2;
        var4 *= var5;
        var3 += 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 == 0) {
            var2 |= 502141178;
            var2 &= 2012760208;
            var2 ^= -1989555438;
            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 != 0) {
                IllegalArgumentException var21 = new IllegalArgumentException();
                throw var21;
            } else {
                return var0.getPitch(var1);
            }
        } else {
            var2 &= 1017387360;
            var2 >>>= 13;
            var2 <<= 9;
            var2 >>>= 26;
            var2 ^= -1252005789;
            AssertionError var12 = new AssertionError();
            throw var12;
        }
    }

    public static Entity aM() {
        int var0 = h;
        var0 ^= 1031007525;
        MinecraftClient var1 = zp();

        Integer var6 = switch (var0) {
            case -85085029 -> var0 ^ 675393740;
            case 476503595 -> {
                var0 >>>= 4;
                var0 *= -1139006873;
                yield var0 ^ -1853588155;
            }
            default -> var0 ^ 1214428248;
        };
        if (var6 != null) {
            return var1.targetedEntity;
        } else {
            IllegalStateException var7 = new IllegalStateException();
            throw var7;
        }
    }

    public static Iterable S() {
        int var0 = h;
        var0 ^= 1237523678;
        MinecraftClient var1 = zp();
        var0 += -607001392;
        var0 ^= 2031917988;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label37:
        if (var2 == 0) {
            ClientWorld var33 = var1.world;
            Object var35;
            if (var33 == null) {
                var0 = switch (var0) {
                    default -> var0 ^ -1280513117;
                    case 1035243268 -> {
                        var0 ^= 1310008502;
                        var0 += 2110579167;
                        var0 |= -75659787;
                        var0 ^= 50181381;
                        yield var0 ^ 1347637736;
                    }
                    case 1391248682 -> var0 ^ 669173449;
                };
                var35 = Collections.emptyList();
                var0 ^= 1117009034;
                var0 += -45767285;
                var0 -= 1791529780;
                var0 ^= 120386615;
                var35 = var35;
                var0 |= 1901107060;
                var0 += -1350235897;
                var0 &= 2127085972;
                var0 ^= -2001255237;
            } else {
                var0 = switch (var0) {
                    case -331166603 -> var0 ^ -1524447552;
                    case 1035243268 -> {
                        var0 |= 479228552;
                        var0 -= 1576923966;
                        var0 <<= 7;
                        var0 &= -604309259;
                        yield var0 ^ -2071917836;
                    }
                    default -> var0 ^ 1601646101;
                };
                MinecraftClient var40 = zp();
                ClientWorld var41 = var40.world;
                var0 >>>= 5;
                var0 *= 812628243;
                var0 ^= 853459881;
                var3 = var0 + 1;
                var3 = var0 * var3;
                int var4 = var0 + 2;
                var3 *= var4;
                var4 = var0 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 != 0) {
                    break label37;
                }

                Iterable var42 = var41.getEntities();
                var35 = var42;
                var0 &= 1692870985;
                var0 += 513617936;
                var0 ^= 561444071;
            }

            var2 = var0 + 1;
            var2 = var0 * var2;
            var0 = var2 & 1;
            if (var0 == 0) {
                return (Iterable)var35;
            }
        }

        AssertionError var32 = new AssertionError();
        throw var32;
    }

    public static LivingEntity n(double var0) {
        label228: {
            int var2 = h;
            var2 ^= -488919238;
            int var3 = (int)var0;
            MinecraftClient var4 = zp();
            ClientPlayerEntity var168 = var4.player;
            ClientPlayerEntity var169 = var168;
            int var5 = var3 + 1;
            var5 = var3 * var5;
            var5 &= 1;
            if (var5 != 0) {
                var2 &= 1951991971;
                var2 ^= 675852796;
                var2 ^= -261178783;
            } else {
                var2 *= -945980017;
                var2 -= -1405563737;
                var2 ^= 1415228682;
                Integer var172 = var2;
                if (var172 == null) {
                    break label228;
                }

                if (var168 == null) {
                    var2 += -1639476560;
                    var2 <<= 14;
                    var2 &= -60592871;
                    var2 ^= -2100376607;
                    var172 = var2;
                    if (var172 != null) {
                        return null;
                    }
                    break label228;
                }

                var2 += -1684275412;
                var2 &= -1594900949;
                var2 ^= 1981902902;
                var172 = var2;
                if (var172 == null) {
                    break label228;
                }

                var172 = null;
                double var6 = var0 * var0;
                Iterable var8 = S();
                Iterator var178 = var8.iterator();
                Iterator var179 = var178;
                LivingEntity var175 = null;
                long var9 = var3;
                long var11 = var9 + 1L;
                var11 = var9 * var11;
                var9 = var11 & 1L;
                long var307;
                int var181 = (var307 = var9 - 0L) == 0L ? 0 : (var307 < 0L ? -1 : 1);
                if (var181 != 0) {
                    var2 ^= 817935209;
                    var2 >>= 18;
                    var2 ^= -1186302557;
                    var2 ^= -809088922;
                    var2 ^= -287168541;
                } else {
                    var2 -= 1998258866;
                    var2 |= 357306394;
                    var2 &= -433491692;
                    var2 *= 108465649;
                    var2 ^= 590282016;
                    var9 = var2;
                    var11 = var9 + 1L;
                    var11 = var9 * var11;
                    var9 = var11 & 1L;
                    long var308;
                    int var184 = (var308 = var9 - 0L) == 0L ? 0 : (var308 < 0L ? -1 : 1);
                    if (var184 != 0) {
                        break label228;
                    }

                    var6 = var6;

                    var2 = switch (var2) {
                        case -2109678790 -> var2 ^ -623499658;
                        default -> var2 ^ 177292941;
                        case -713171664 -> {
                            var2 >>= 30;
                            var2 >>>= 16;
                            var2 |= 1120779111;
                            var2 ^= 1024314239;
                            yield var2 ^ 590632518;
                        }
                    };

                    label220:
                    while (true) {
                        var9 = var2;
                        var11 = var9 + 1L;
                        var11 = var9 * var11;
                        long var13 = var9 + 2L;
                        var11 *= var13;
                        var9 += 3L;
                        var11 *= var9;
                        var9 = var11 & 7L;
                        long var309;
                        int var188 = (var309 = var9 - 0L) == 0L ? 0 : (var309 < 0L ? -1 : 1);
                        if (var188 != 0) {
                            break label228;
                        }

                        boolean var189 = var179.hasNext();
                        Integer var10 = var3;
                        if (var10 == null) {
                            var2 ^= 2138507417;
                            var2 &= 1018315314;
                            var2 -= 509626909;
                            var2 ^= -1706036152;
                            break;
                        }

                        var2 -= -1643999499;
                        var2 -= 2001774462;
                        var2 -= -1010854257;
                        var2 ^= 1719904515;
                        long var223 = var2;
                        long var12 = var223 + 1L;
                        var12 = var223 * var12;
                        long var14 = var223 + 2L;
                        var12 *= var14;
                        long var224 = var223 + 3L;
                        var12 *= var224;
                        long var225 = var12 & 7L;
                        long var310;
                        int var226 = (var310 = var225 - 0L) == 0L ? 0 : (var310 < 0L ? -1 : 1);
                        if (var226 != 0) {
                            break label228;
                        }

                        if (!var189) {
                            var2 |= 1577360389;
                            var2 ^= 324785371;
                            var2 *= 1865693061;
                            var2 ^= 194255481;
                            return var175;
                        }
                        var2 = switch (var2) {
                            case -712578381 -> var2 ^ 782982883;
                            case -446546745 -> {
                                var2 <<= 8;
                                var2 ^= 401334048;
                                var2 &= -1615452721;
                                var2 += -1416503809;
                                yield var2 ^ 1352732717;
                            }
                            default -> var2 ^ -691711719;
                        };
                        int var190 = var2 + 1;
                        int var191 = var2 * var190;
                        var226 = var2 + 2;
                        int var192 = var191 * var226;
                        var226 = var2 + 3;
                        int var193 = var192 * var226;
                        int var194 = var193 & 7;
                        if (var194 != 0) {
                            break label228;
                        }

                        Object var195 = var179.next();
                        Integer var229 = var3;
                        if (var229 == null) {
                            var2 >>>= 27;
                            var2 *= -1602822089;
                            var2 &= 781227161;
                            var2 ^= -1870757083;
                            break;
                        }

                        var2 *= -222508927;
                        var2 ^= -1524987970;
                        long var230 = var2;
                        var12 = var230 + 1L;
                        var12 = var230 * var12;
                        var14 = var230 + 2L;
                        var12 *= var14;
                        long var231 = var230 + 3L;
                        var12 *= var231;
                        long var232 = var12 & 7L;
                        long var311;
                        int var233 = (var311 = var232 - 0L) == 0L ? 0 : (var311 < 0L ? -1 : 1);
                        if (var233 != 0) {
                            break label228;
                        }

                        Entity var196 = (Entity)var195;
                        if (var196 != var169) {
                            var2 |= -2089727115;
                            var2 += 1376299987;
                            var2 <<= 4;
                            var2 ^= 1211319412;
                            int var234 = (var196 instanceof LivingEntity) ? 1 : 0;
                            int var252 = var3 + 1;
                            int var253 = var3 * var252;
                            int var254 = var253 & 1;
                            if (var254 != 0) {
                                switch (var2) {
                                    case -1515360381:
                                    default:
                                        var2 ^= 997652637;
                                        break label220;
                                    case -1475595916:
                                        var2 -= 1988468778;
                                        var2 += 580030953;
                                        var2 += -1371866133;
                                        var2 |= -365293937;
                                        var2 ^= 1913658402;
                                        break label220;
                                    case 650700813:
                                        var2 ^= 979320754;
                                        break label220;
                                }
                            }

                            var2 &= -542724804;
                            var2 |= 1328725117;
                            var2 <<= 3;
                            var2 ^= 2056816169;
                            Integer var255 = var2;
                            if (var255 == null) {
                                break label228;
                            }

                            if (var234 != 0) {
                                var2 = switch (var2) {
                                    default -> var2 ^ 929109766;
                                    case 53308865 -> {
                                        var2 ^= 1138779291;
                                        var2 &= -905698272;
                                        yield var2 ^ 239474061;
                                    }
                                    case 1489475412 -> var2 ^ -140404234;
                                };
                                LivingEntity var235 = (LivingEntity)var196;
                                int var256 = var3 + 1;
                                int var257 = var3 * var256;
                                int var279 = var3 + 2;
                                int var258 = var257 * var279;
                                int var280 = var3 + 3;
                                int var259 = var258 * var280;
                                int var260 = var259 & 7;
                                if (var260 != 0) {
                                    var2 |= 1072230324;
                                    var2 ^= -410715136;
                                    break;
                                }

                                var2 <<= 28;
                                var2 ^= -1380115648;
                                Integer var261 = var2;
                                if (var261 == null) {
                                    break label228;
                                }

                                boolean var262 = var196.isAlive();
                                if (!var262) {
                                    var2 >>>= 4;
                                    var2 ^= 268242911;
                                    var175 = var175;
                                    var11 = var3;
                                    var13 = var11 + 1L;
                                    var13 = var11 * var13;
                                    long var15 = var11 + 2L;
                                    var13 *= var15;
                                    var11 += 3L;
                                    var13 *= var11;
                                    var11 = var13 & 7L;
                                    long var312;
                                    int var266 = (var312 = var11 - 0L) == 0L ? 0 : (var312 < 0L ? -1 : 1);
                                    if (var266 != 0) {
                                        var2 >>>= 8;
                                        var2 += -1025882227;
                                        var2 ^= 1519152598;
                                        break;
                                    }

                                    var2 |= -486823592;
                                    var2 *= -824442467;
                                    var2 ^= -237615089;
                                    var6 = var6;
                                    var2 += 2056735817;
                                    var2 -= 2063501255;
                                    var2 += 1391994033;
                                    var2 ^= -184407979;
                                } else {
                                    var2 &= 1503443340;
                                    var2 -= -769563958;
                                    var2 ^= -1811134932;
                                    double var267 = var196.squaredDistanceTo(var169);
                                    Integer var197 = var3;
                                    if (var197 == null) {
                                        var2 <<= 16;
                                        var2 ^= 1752433597;
                                        break;
                                    }

                                    var2 ^= -936885439;
                                    var2 -= 1569732408;
                                    var2 ^= -210844568;
                                    var2 ^= -636443345;
                                    var13 = var2;
                                    long var303 = var13 + 1L;
                                    var303 = var13 * var303;
                                    long var17 = var13 + 2L;
                                    var303 *= var17;
                                    var13 += 3L;
                                    var303 *= var13;
                                    var13 = var303 & 7L;
                                    long var313;
                                    int var198 = (var313 = var13 - 0L) == 0L ? 0 : (var313 < 0L ? -1 : 1);
                                    if (var198 != 0) {
                                        break label228;
                                    }

                                    double var314;
                                    int var199 = (var314 = var267 - var6) == 0.0 ? 0 : (var314 < 0.0 ? -1 : 1);
                                    LivingEntity var203;
                                    double var240;
                                    if (var199 < 0) {
                                        var2 += -1085892156;
                                        var2 &= 520983008;
                                        var2 ^= -1341999995;
                                        var2 ^= 283545411;
                                        var2 ^= 288562914;
                                        int var200 = var2 + 1;
                                        int var201 = var2 * var200;
                                        int var202 = var201 & 1;
                                        if (var202 != 0) {
                                            break label228;
                                        }

                                        var203 = var235;
                                        Integer var236 = var3;
                                        if (var236 == null) {
                                            var2 += -51759358;
                                            var2 ^= -812384058;
                                            var2 >>= 9;
                                            var2 ^= -1740236984;
                                            break;
                                        }

                                        var2 *= 1224440465;
                                        var2 ^= -22624180;
                                        var2 &= -1186726986;
                                        var2 ^= 116654655;
                                        var234 = var2 + 1;
                                        int var238 = var2 * var234;
                                        var238 &= 1;
                                        if (var238 != 0) {
                                            break label228;
                                        }

                                        var240 = var267;
                                        var2 += 235556572;
                                        var2 ^= -1080430636;
                                        var2 += 1342497937;
                                        var2 += -1364351483;
                                        var2 ^= 1777936955;
                                    } else {
                                        var2 &= 757322396;
                                        var2 |= -1212309420;
                                        var2 |= -979084087;
                                        var2 *= 100449001;
                                        var2 ^= -1894008606;
                                        var12 = var2;
                                        var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        long var16 = var12 + 2L;
                                        var14 *= var16;
                                        var12 += 3L;
                                        var14 *= var12;
                                        var12 = var14 & 7L;
                                        long var315;
                                        int var284 = (var315 = var12 - 0L) == 0L ? 0 : (var315 < 0L ? -1 : 1);
                                        if (var284 != 0) {
                                            break label228;
                                        }

                                        var203 = var175;
                                        var12 = var3;
                                        var14 = var12 + 1L;
                                        var14 = var12 * var14;
                                        var12 = var14 & 1L;
                                        long var316;
                                        int var287 = (var316 = var12 - 0L) == 0L ? 0 : (var316 < 0L ? -1 : 1);
                                        if (var287 != 0) {
                                            var2 |= -1711966638;
                                            var2 ^= 1201372266;
                                            break;
                                        }
                                        var2 = switch (var2) {
                                            default -> var2 ^ 2064311305;
                                            case -1590400520 -> var2 ^ 919639474;
                                            case 1328811975 -> {
                                                var2 += -268496917;
                                                var2 -= -580314399;
                                                var2 -= -791692686;
                                                yield var2 ^ -631191290;
                                            }
                                        };
                                        var240 = var6;
                                        var2 -= -1863103491;
                                        var2 ^= 2034509314;
                                    }

                                    var175 = var203;
                                    Integer var204 = var3;
                                    if (var204 == null) {
                                        var2 <<= 26;
                                        var2 ^= -1656315101;
                                        var2 ^= -526296647;
                                        var2 &= -1890523804;
                                        var2 ^= -1657871427;
                                        break;
                                    }

                                    var2 -= 1557039040;
                                    var2 ^= 676871563;
                                    var6 = var240;
                                    var2 += -1115873012;
                                    var2 ^= 1430108135;
                                }
                            } else {
                                var2 = switch (var2) {
                                    case -1945615152 -> var2 ^ 804567486;
                                    case 53308865 -> {
                                        var2 >>>= 8;
                                        var2 -= -918309558;
                                        var2 -= 1748465087;
                                        var2 >>= 23;
                                        yield var2 ^ -1957589792;
                                    }
                                    default -> var2 ^ 1537192091;
                                };
                                Integer var205 = var2;
                                if (var205 == null) {
                                    break label228;
                                }

                                var175 = var175;
                                var9 = var3;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var13 = var9 + 2L;
                                var11 *= var13;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var317;
                                int var209 = (var317 = var9 - 0L) == 0L ? 0 : (var317 < 0L ? -1 : 1);
                                if (var209 != 0) {
                                    var2 |= -1805328469;
                                    var2 ^= 1820392514;
                                    break;
                                }

                                var2 ^= 625989547;
                                var2 |= 1311190868;
                                var2 *= -1952027421;
                                var2 ^= 809586209;
                                int var210 = var2 + 1;
                                int var211 = var2 * var210;
                                var234 = var2 + 2;
                                int var212 = var211 * var234;
                                var234 = var2 + 3;
                                int var213 = var212 * var234;
                                int var214 = var213 & 7;
                                if (var214 != 0) {
                                    break label228;
                                }

                                var6 = var6;
                                var2 ^= 1661721441;
                                var2 ^= -253901500;
                            }
                        } else {
                            var2 >>>= 18;
                            var2 ^= -1300101344;
                            int var215 = var2 + 1;
                            int var216 = var2 * var215;
                            int var217 = var216 & 1;
                            if (var217 != 0) {
                                break label228;
                            }

                            var175 = var175;
                            int var218 = var3 + 1;
                            int var219 = var3 * var218;
                            var233 = var3 + 2;
                            int var220 = var219 * var233;
                            var233 = var3 + 3;
                            int var221 = var220 * var233;
                            int var222 = var221 & 7;
                            if (var222 != 0) {
                                var2 |= 1808753040;
                                var2 &= 2076361292;
                                var2 ^= -475249739;
                                break;
                            }

                            var2 |= -1583330389;
                            var2 |= -984755462;
                            var2 += 1488453914;
                            var2 >>= 22;
                            var2 ^= 1554523967;
                            var6 = var6;
                            var2 >>= 26;
                            var2 &= 1797894738;
                            var2 |= 1418404677;
                            var2 ^= 862176742;
                            var2 ^= 991724663;
                        }
                    }
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            var3 &= 1;
            if (var3 == 0) {
                AssertionError var167 = new AssertionError();
                throw var167;
            }
        }

        IllegalArgumentException var163 = new IllegalArgumentException();
        throw var163;
    }

    public static float bl(float var0) {
        label67: {
            int var1 = h;
            var1 ^= 2077662120;
            int var2 = (int)var0;
            MinecraftClient var3 = zp();
            ClientPlayerEntity var52 = var3.player;
            int var4 = var2 + 1;
            var4 = var2 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var1 = switch (var1) {
                    case -1019354926 -> var1 ^ 1850495017;
                    default -> var1 ^ 1776134281;
                    case 1522772134 -> {
                        var1 <<= 23;
                        var1 >>= 5;
                        var1 *= -1563592947;
                        var1 >>= 14;
                        yield var1 ^ -207033629;
                    }
                };
                long var60 = var1;
                long var6 = var60 + 1L;
                var6 = var60 * var6;
                long var8 = var60 + 2L;
                var6 *= var8;
                long var61 = var60 + 3L;
                var6 *= var61;
                long var62 = var6 & 7L;
                long var81;
                var4 = (var81 = var62 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label67;
                }

                if (var52 == null) {
                    var1 *= 1954322105;
                    var1 ^= 132092955;
                    var1 ^= -1292809158;
                    long var65 = var1;
                    var6 = var65 + 1L;
                    var6 = var65 * var6;
                    var8 = var65 + 2L;
                    var6 *= var8;
                    long var66 = var65 + 3L;
                    var6 *= var66;
                    long var67 = var6 & 7L;
                    long var82;
                    var4 = (var82 = var67 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label67;
                    }

                    float var64 = 1.0F;
                    switch (var1) {
                        case 988731885:
                        default:
                            var1 ^= 1117078820;
                            return var64;
                        case 1063184394:
                            var1 |= -952004442;
                            var1 >>= 30;
                            var1 += -1544935950;
                            var1 ^= -2036969040;
                            return var64;
                        case 1211849190:
                            var1 ^= 416863454;
                            return var64;
                    }
                }

                var1 -= 1011701875;
                var1 |= 1659674088;
                var1 |= 1487541761;
                var1 >>= 16;
                var1 ^= -1694290572;
                Integer var5 = var1;
                if (var5 == null) {
                    break label67;
                }

                float var53 = var52.getAttackCooldownProgress(var0);
                long var69 = var2;
                long var7 = var69 + 1L;
                var7 = var69 * var7;
                long var70 = var7 & 1L;
                long var83;
                var2 = (var83 = var70 - 0L) == 0L ? 0 : (var83 < 0L ? -1 : 1);
                if (var2 == 0) {
                    var1 = switch (var1) {
                        case 758113391 -> var1 ^ 783063613;
                        default -> var1 ^ 1510658661;
                        case 1694291866 -> {
                            var1 >>= 22;
                            var1 >>= 8;
                            var1 |= 844639509;
                            yield var1 ^ -76270377;
                        }
                    };
                    switch (var1) {
                        case -919856702:
                            var1 -= -942765763;
                            var1 ^= -369494513;
                            var1 ^= -841477429;
                            return var53;
                        case 754730311:
                        default:
                            var1 ^= 298662456;
                            return var53;
                        case 1974424083:
                            var1 ^= 1708815896;
                            return var53;
                    }
                }

                switch (var1) {
                    case -1945617109:
                    default:
                        var1 ^= -1828277164;
                        break;
                    case 1171533130:
                        var1 ^= -1877690357;
                        break;
                    case 1694291866:
                        var1 |= -2125853769;
                        var1 >>>= 24;
                        var1 |= 310675233;
                        var1 ^= 1265355019;
                }
            } else {
                var1 |= 955454565;
                var1 += -323886816;
                var1 ^= 1045090537;
            }

            long var45 = var1;
            long var54 = var45 + 1L;
            long var55 = var45 * var54;
            long var71 = var45 + 2L;
            long var56 = var55 * var71;
            long var46 = var45 + 3L;
            long var57 = var56 * var46;
            long var47 = var57 & 7L;
            long var84;
            var1 = (var84 = var47 - 0L) == 0L ? 0 : (var84 < 0L ? -1 : 1);
            if (var1 == 0) {
                IllegalArgumentException var50 = new IllegalArgumentException();
                throw var50;
            }
        }

        IllegalStateException var49 = new IllegalStateException();
        throw var49;
    }

    public static boolean q() {
        boolean var79 = false;
        int var0 = h;
        var0 ^= 1775482665;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var70 = var1.player;

        label110: {
            var0 = switch (var0) {
                default -> var0 ^ 1744787464;
                case -1044189821 -> var0 ^ -1497262328;
                case 1220969511 -> {
                    var0 *= -513759655;
                    var0 >>>= 7;
                    var0 &= 1390484448;
                    yield var0 ^ 150971540;
                }
            };
            if (var70 != null) {
                var0 ^= -683563543;
                var0 += 1720388845;
                var0 ^= 1476066725;
                MinecraftClient var2 = zp();
                GameOptions var80 = var2.options;

                var0 = switch (var0) {
                    default -> var0 ^ -443123778;
                    case 307488175 -> {
                        var0 -= 369482590;
                        var0 |= 1245327079;
                        var0 >>= 14;
                        var0 += 268401474;
                        yield var0 ^ -1911646423;
                    }
                    case 859152571 -> var0 ^ 451451154;
                };
                int var3 = var0 + 1;
                var3 = var0 * var3;
                int var4 = var0 + 2;
                var3 *= var4;
                var4 = var0 + 3;
                var3 *= var4;
                var3 &= 7;
                if (var3 != 0) {
                    break label110;
                }

                Perspective var81 = var80.getPerspective();
                boolean var82 = var81.isFirstPerson();
                if (var82) {
                    var0 ^= 1401756149;
                    var0 -= 229969171;
                    var0 ^= 608569334;
                    var2 = zp();
                    DebugHud var84 = var2.getDebugHud();
                    boolean var85 = var84.shouldShowDebugHud();

                    var0 = switch (var0) {
                        case -938672590 -> var0 ^ 1179532079;
                        default -> var0 ^ 682099976;
                        case -528357083 -> {
                            var0 >>>= 20;
                            var0 &= 1351778353;
                            yield var0 ^ 149214348;
                        }
                    };
                    Integer var110 = var0;
                    if (var110 != null) {
                        if (var85) {
                            var0 ^= 383265004;
                            var0 += 791121368;
                            var0 |= 457667271;
                            var0 |= -1591613090;
                            var0 ^= -269780364;
                            int var86 = var0 + 1;
                            int var87 = var0 * var86;
                            int var111 = var0 + 2;
                            int var88 = var87 * var111;
                            var111 = var0 + 3;
                            int var89 = var88 * var111;
                            int var90 = var89 & 7;
                            if (var90 == 0) {
                                return false;
                            }
                        } else {
                            var0 |= 1945212934;
                            var0 += -795005362;
                            var0 >>= 10;
                            var0 |= -1908392238;
                            var0 ^= 275282657;
                            boolean var71 = var70.isSpectator();

                            var0 = switch (var0) {
                                case -1640283085 -> {
                                    var0 |= 915720635;
                                    yield var0 ^ -1038899610;
                                }
                                default -> var0 ^ 133594401;
                                case 786724845 -> var0 ^ -295451050;
                            };
                            long var91 = var0;
                            long var116 = var91 + 1L;
                            long var117 = var91 * var116;
                            long var6 = var91 + 2L;
                            long var118 = var117 * var6;
                            long var92 = var91 + 3L;
                            long var119 = var118 * var92;
                            long var93 = var119 & 7L;
                            long var122;
                            int var94 = (var122 = var93 - 0L) == 0L ? 0 : (var122 < 0L ? -1 : 1);
                            if (var94 == 0) {
                                label115: {
                                    if (var71) {
                                        var0 += -1774343822;
                                        var0 <<= 1;
                                        var0 |= 1460949655;
                                        var0 ^= 1574033215;
                                        int var72 = var0 + 1;
                                        int var73 = var0 * var72;
                                        int var95 = var0 + 2;
                                        int var74 = var73 * var95;
                                        int var96 = var0 + 3;
                                        int var75 = var74 * var96;
                                        int var76 = var75 & 7;
                                        if (var76 != 0) {
                                            break label110;
                                        }

                                        var1 = zp();
                                        Entity var78 = var1.targetedEntity;
                                        var0 *= -79929099;
                                        var0 ^= -88895479;
                                        var0 ^= 1312095125;
                                        Integer var97 = var0;
                                        if (var97 == null) {
                                            break label110;
                                        }

                                        if (var78 == null) {
                                            var0 >>>= 1;
                                            var0 -= -1849050366;
                                            var0 >>= 11;
                                            var0 &= 600163212;
                                            var0 ^= 1290856003;
                                            var79 = false;
                                            var0 -= -1407696112;
                                            var0 ^= 678875533;
                                            break label115;
                                        }

                                        switch (var0) {
                                            case -1146779452:
                                                var0 ^= -967695246;
                                                break;
                                            case 218688111:
                                            default:
                                                var0 ^= -917135296;
                                                break;
                                            case 1586250172:
                                                var0 += -86354481;
                                                var0 &= -1096251260;
                                                var0 -= -316117014;
                                                var0 ^= -2035172286;
                                        }
                                    } else {
                                        var0 += 1528609856;
                                        var0 ^= 2072020169;
                                    }

                                    int var98 = var0 + 1;
                                    int var99 = var0 * var98;
                                    int var113 = var0 + 2;
                                    int var100 = var99 * var113;
                                    var113 = var0 + 3;
                                    int var101 = var100 * var113;
                                    int var102 = var101 & 7;
                                    if (var102 != 0) {
                                        break label110;
                                    }

                                    var79 = true;
                                    switch (var0) {
                                        case -1404457772:
                                            var0 *= 1869304833;
                                            var0 -= -1598272176;
                                            var0 ^= -1951327050;
                                            break;
                                        case 760912110:
                                        default:
                                            var0 ^= -1618542474;
                                            break;
                                        case 1428518653:
                                            var0 ^= -962765574;
                                    }
                                }

                                long var103 = var0;
                                long var120 = var103 + 1L;
                                long var121 = var103 * var120;
                                long var104 = var121 & 1L;
                                long var123;
                                int var105 = (var123 = var104 - 0L) == 0L ? 0 : (var123 < 0L ? -1 : 1);
                                if (var105 == 0) {
                                    return var79;
                                }
                            }
                        }
                    }
                    break label110;
                }

                var0 -= 116937825;
                var0 &= 858965508;
                var0 -= -1849615504;
                var0 ^= 84084605;
            } else {
                var0 ^= -1271075930;
                var0 |= -316702160;
                var0 *= -1110569225;
                var0 |= -51579014;
                var0 ^= 1535217683;
            }

            Integer var68 = var0;
            if (var68 != null) {
                return false;
            }
        }

        UnsupportedOperationException var69 = new UnsupportedOperationException();
        throw var69;
    }

    public static float az() {
        int var0 = h;
        var0 ^= 355681511;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var25 = var1.player;
        var0 |= -1801662590;
        var0 &= -1076223058;
        var0 ^= 286186233;
        long var2 = var0;
        long var4 = var2 + 1L;
        var4 = var2 * var4;
        var2 = var4 & 1L;
        long var34;
        int var29 = (var34 = var2 - 0L) == 0L ? 0 : (var34 < 0L ? -1 : 1);
        label35:
        if (var29 == 0) {
            float var31;
            if (var25 == null) {
                var0 *= -1159264933;
                var0 >>= 4;
                var0 ^= -307719609;
                Integer var30 = var0;
                if (var30 == null) {
                    break label35;
                }

                var31 = 0.0F;
                switch (var0) {
                    case -312274497:
                        var0 &= -354455733;
                        var0 ^= -751497606;
                        var0 ^= 2066976082;
                        var0 ^= -1063052914;
                        break;
                    case 144083389:
                        var0 ^= -1518677501;
                        break;
                    case 1687179301:
                    default:
                        var0 ^= -140992738;
                }
            } else {
                var0 <<= 31;
                var0 ^= 257291905;
                Vec3d var26 = var25.getVelocity();
                var0 ^= -1610439456;
                var0 ^= 801592606;
                Integer var3 = var0;
                if (var3 == null) {
                    break label35;
                }

                double var32 = var26.horizontalLength();
                float var27 = (float)var32;
                var31 = var27;
                var0 >>>= 6;
                var0 += -1450573003;
                var0 ^= 694868223;
            }

            Integer var23 = var0;
            if (var23 != null) {
                return var31;
            }
        }

        AssertionError var24 = new AssertionError();
        throw var24;
    }

    public static boolean L() {
        int var0 = h;
        var0 ^= 496056409;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var35 = var1.player;

        label52: {
            var0 = switch (var0) {
                default -> var0 ^ 656904752;
                case -1762297064 -> var0 ^ 1007613247;
                case 1015286615 -> {
                    var0 &= -2011586963;
                    var0 >>>= 23;
                    var0 += 433881380;
                    yield var0 ^ 151684413;
                }
            };
            if (var35 != null) {
                var0 = switch (var0) {
                    case -1314672778 -> var0 ^ -1467525806;
                    case 282461193 -> {
                        var0 >>= 19;
                        var0 &= 657873792;
                        yield var0 ^ -587597204;
                    }
                    default -> var0 ^ -1463020588;
                };
                long var2 = var0;
                long var4 = var2 + 1L;
                var4 = var2 * var4;
                long var6 = var2 + 2L;
                var4 *= var6;
                var2 += 3L;
                var4 *= var2;
                var2 = var4 & 7L;
                long var58;
                int var43 = (var58 = var2 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                if (var43 != 0) {
                    break label52;
                }

                boolean var36 = var35.isOnGround();
                var0 &= 173722201;
                var0 &= 1607691613;
                var0 >>= 31;
                var0 ^= -2092250449;
                var2 = var0;
                var4 = var2 + 1L;
                var4 = var2 * var4;
                var6 = var2 + 2L;
                var4 *= var6;
                var2 += 3L;
                var4 *= var2;
                var2 = var4 & 7L;
                long var59;
                int var47 = (var59 = var2 - 0L) == 0L ? 0 : (var59 < 0L ? -1 : 1);
                if (var47 != 0) {
                    break label52;
                }

                if (!var36) {
                    var0 *= 1270942859;
                    var0 ^= -1079733459;
                    int var37 = var0 + 1;
                    int var38 = var0 * var37;
                    int var39 = var38 & 1;
                    if (var39 == 0) {
                        boolean var40 = true;
                        var0 += 6098181;
                        var0 >>>= 27;
                        var0 >>= 17;
                        var0 &= 504370881;
                        var0 ^= 1342218598;
                        return var40;
                    }
                    break label52;
                }

                switch (var0) {
                    case -2092250449:
                        var0 |= -1739080558;
                        var0 |= 469278658;
                        var0 += -1656185350;
                        var0 ^= -1859202304;
                        var0 ^= -863238302;
                        break;
                    case 114231524:
                    default:
                        var0 ^= 943302530;
                        break;
                    case 163276229:
                        var0 ^= -993441394;
                }
            } else {
                var0 &= 1410763855;
                var0 ^= 1962691986;
            }

            Integer var48 = var0;
            if (var48 != null) {
                boolean var60 = false;
                var0 ^= -857927134;
                var0 ^= -130549025;
                return var60;
            }
        }

        UnsupportedOperationException var49 = new UnsupportedOperationException();
        throw var49;
    }

    public static boolean dw() {
        boolean var51 = false;
        int var0 = h;
        var0 ^= 1628824435;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var48 = var1.player;
        var0 *= -2108042715;
        var0 ^= 1968881335;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label73:
        if (var2 == 0) {
            label75: {
                label76: {
                    if (var48 != null) {
                        var0 = switch (var0) {
                            case -1782377818 -> {
                                var0 *= 1241186245;
                                yield var0 ^ 1976448022;
                            }
                            default -> var0 ^ -1684480961;
                            case 1506219028 -> var0 ^ -1764150284;
                        };
                        long var56 = var0;
                        long var4 = var56 + 1L;
                        var4 = var56 * var4;
                        long var57 = var4 & 1L;
                        long var71;
                        var2 = (var71 = var57 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                        if (var2 != 0) {
                            break label73;
                        }

                        int var59 = (var48.isCreative()) ? 1 : 0;
                        var0 ^= 286978423;
                        var0 *= 17114233;
                        var0 &= 2072398117;
                        var0 ^= 690774961;
                        if (var59 != 0) {
                            var0 <<= 3;
                            var0 |= 742963767;
                            var0 += 205569211;
                            var0 -= -458005526;
                            var0 ^= 454139835;
                            break label76;
                        }
                        var0 = switch (var0) {
                            case -1287392486 -> var0 ^ 1028832843;
                            default -> var0 ^ -1215457081;
                            case 313420436 -> {
                                var0 &= -847898086;
                                var0 |= 2097529243;
                                var0 >>= 2;
                                yield var0 ^ -1146429736;
                            }
                        };
                        long var60 = var0;
                        var4 = var60 + 1L;
                        var4 = var60 * var4;
                        long var6 = var60 + 2L;
                        var4 *= var6;
                        long var61 = var60 + 3L;
                        var4 *= var61;
                        long var62 = var4 & 7L;
                        long var72;
                        var59 = (var72 = var62 - 0L) == 0L ? 0 : (var72 < 0L ? -1 : 1);
                        if (var59 != 0) {
                            break label73;
                        }

                        boolean var49 = var48.isSpectator();
                        var0 &= 1431705066;
                        var0 ^= 1660183671;
                        var0 ^= 812232657;
                        if (var49) {
                            switch (var0) {
                                case -266090356:
                                default:
                                    var0 ^= 1166982814;
                                    break label76;
                                case 721239322:
                                    var0 ^= -91418137;
                                    break label76;
                                case 1457508236:
                                    var0 *= -1635489857;
                                    var0 &= 1689485059;
                                    var0 |= -668177462;
                                    var0 ^= 649439225;
                                    break label76;
                            }
                        }

                        var0 |= -1859883855;
                        var0 |= -1928875725;
                        var0 ^= -1182455942;
                    } else {
                        switch (var0) {
                            case -1808347253:
                                var0 ^= 2086904603;
                                break;
                            case -1782377818:
                                var0 *= 1673484479;
                                var0 &= 2104819444;
                                var0 += -1258949161;
                                var0 ^= -2119514951;
                                var0 ^= -18156837;
                                break;
                            case 1165530437:
                            default:
                                var0 ^= -165713087;
                        }
                    }

                    Integer var64 = var0;
                    if (var64 == null) {
                        break label73;
                    }

                    var51 = false;
                    var0 <<= 30;
                    var0 &= -916899142;
                    var0 ^= 1911161992;
                    break label75;
                }

                Integer var50 = var0;
                if (var50 == null) {
                    break label73;
                }

                var51 = true;
                var0 *= 495127835;
                var0 -= -1480108092;
                var0 ^= 1810908145;
                var0 ^= 1568245226;
                var0 ^= -1485136370;
            }

            Integer var46 = var0;
            if (var46 != null) {
                return var51;
            }
        }

        IllegalStateException var47 = new IllegalStateException();
        throw var47;
    }

    public static int jA(Entity var0) {
        label69: {
            int var1 = h;
            var1 ^= 1731696566;
            int var2 = System.identityHashCode(var0);
            int var3 = (var0 instanceof AbstractClientPlayerEntity) ? 1 : 0;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            var4 = var6 & 1L;
            long var79;
            int var63 = (var79 = var4 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
            if (var63 != 0) {
                var1 &= 206613466;
                var1 >>>= 14;
                var1 ^= 24113688;
                var1 *= -2059635739;
                var1 ^= 433692702;
            } else {
                var1 = switch (var1) {
                    default -> var1 ^ -393340758;
                    case 94696225 -> var1 ^ 296362957;
                    case 1176675512 -> {
                        var1 *= -1920579803;
                        yield var1 ^ -1850884096;
                    }
                };
                Integer var64 = var1;
                if (var64 == null) {
                    break label69;
                }

                if (var3 == 0) {
                    var1 ^= 11795978;
                    var1 *= -1370349769;
                    var1 &= -1583903507;
                    var1 ^= -281175261;
                    long var39 = var1;
                    long var60 = var39 + 1L;
                    long var61 = var39 * var60;
                    long var40 = var61 & 1L;
                    long var80;
                    var1 = (var80 = var40 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return 0;
                    }
                    break label69;
                }

                var1 <<= 8;
                var1 -= -1265715992;
                var1 ^= -1053904324;
                var3 = var1 + 1;
                var3 = var1 * var3;
                var3 &= 1;
                if (var3 != 0) {
                    break label69;
                }

                AbstractClientPlayerEntity var51 = (AbstractClientPlayerEntity)var0;
                var4 = var2;
                var6 = var4 + 1L;
                var6 = var4 * var6;
                var4 = var6 & 1L;
                long var81;
                int var67 = (var81 = var4 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                if (var67 == 0) {
                    var1 += -2005549089;
                    var1 ^= 1349703215;
                    Integer var68 = var1;
                    if (var68 == null) {
                        break label69;
                    }
                    var1 = switch (var1) {
                        case -1838299348 -> {
                            var1 &= -1465089742;
                            yield var1 ^ 903908769;
                        }
                        default -> var1 ^ -996859076;
                        case -232592887 -> var1 ^ 549092723;
                    };
                    int var69 = var1 + 1;
                    int var70 = var1 * var69;
                    int var5 = var1 + 2;
                    int var71 = var70 * var5;
                    var5 = var1 + 3;
                    int var72 = var71 * var5;
                    int var73 = var72 & 7;
                    if (var73 != 0) {
                        break label69;
                    }

                    SkinTextures var52 = var51.getSkin();
                    TextureAsset var53 = var52.body();
                    Identifier var54 = var53.texturePath();
                    MinecraftClient var74 = zp();
                    Integer var43 = var2;
                    if (var43 != null) {
                        var1 <<= 13;
                        var1 ^= -298344906;
                        var43 = var1;
                        if (var43 != null) {
                            TextureManager var45 = var74.getTextureManager();
                            AbstractTexture var46 = var45.getTexture(var54);
                            var3 = var1 ^ -1070932849;
                            var3 &= 1496396558;
                            var3 >>= 17;
                            var3 ^= -871528427;
                            var3 ^= -330157439;
                            return CD(var46, var3);
                        }
                        break label69;
                    }

                    switch (var1) {
                        case -1841804940:
                            var1 ^= 914724307;
                            break;
                        case -1244918655:
                            var1 -= -1014891147;
                            var1 ^= -1976682788;
                            var1 -= 304504466;
                            var1 ^= 1952093282;
                            break;
                        case -324293661:
                        default:
                            var1 ^= 1057572145;
                    }
                } else {
                    var1 += 439836791;
                    var1 -= -557194911;
                    var1 &= -362535908;
                    var1 ^= 1919110980;
                }
            }

            UnsupportedOperationException var47 = new UnsupportedOperationException();
            throw var47;
        }

        RuntimeException var42 = new RuntimeException();
        throw var42;
    }

    public static int P() {
        int var0 = h;
        var0 ^= -720976012;
        MinecraftClient var1 = zp();
        TextureManager var10 = var1.getTextureManager();
        var0 += 630129618;
        var0 *= 1922862809;
        var0 ^= -887502126;
        Integer var2 = var0;
        if (var2 == null) {
            UnsupportedOperationException var13 = new UnsupportedOperationException();
            throw var13;
        } else {
            Identifier var12 = Identifier.of("auravisuals:textures/effect/sahur.png");
            AbstractTexture var11 = var10.getTexture(var12);
            var0 ^= 1715203391;
            var0 &= -1340384883;
            var0 ^= -2141732971;
            return CD(var11, var0);
        }
    }

    public static boolean Jv(Entity var0) {
        boolean var50 = false;
        label57: {
            int var1 = h;
            var1 ^= -651591402;
            int var2 = System.identityHashCode(var0);
            long var3 = var2;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var85;
            int var55 = (var85 = var3 - 0L) == 0L ? 0 : (var85 < 0L ? -1 : 1);
            if (var55 != 0) {
                var1 <<= 28;
                var1 += 325895048;
                var1 ^= -520858628;
            } else {
                label56: {
                    var1 <<= 16;
                    var1 *= -882683133;
                    var1 ^= -885716870;
                    int var56 = var1 + 1;
                    int var57 = var1 * var56;
                    int var58 = var57 & 1;
                    if (var58 != 0) {
                        break label57;
                    }

                    label54: {
                        boolean var59 = var0 instanceof AbstractClientPlayerEntity;
                        if (var59) {
                            var1 += 989758615;
                            var1 |= 1428724618;
                            var1 ^= 1291950771;
                            var1 -= -1890641980;
                            var1 ^= 609313442;
                            AbstractClientPlayerEntity var60 = (AbstractClientPlayerEntity)var0;
                            SkinTextures var61 = var60.getSkin();
                            PlayerSkinType var62 = var61.model();
                            String var63 = var62.name();
                            Integer var48 = var2;
                            if (var48 == null) {
                                var1 ^= -163958977;
                                var1 >>>= 23;
                                var1 -= -14665736;
                                var1 ^= 1934055626;
                                break label56;
                            }

                            var1 *= 26566007;
                            var1 *= -618176229;
                            var1 >>>= 8;
                            var1 *= 200830903;
                            var1 ^= 788988739;
                            boolean var49 = var63.equals("SLIM");
                            if (var49) {
                                var1 ^= 1428866902;
                                var1 ^= 1618468594;
                                var50 = true;
                                var1 *= -1328684115;
                                var1 ^= 247498129;
                                break label54;
                            }

                            var1 += -1574413810;
                            var1 >>>= 11;
                            var1 += -1283367372;
                            var1 ^= -1785433058;
                        } else {
                            var1 *= 1010931519;
                            var1 <<= 2;
                            var1 -= -1516438637;
                            var1 &= -1289760326;
                            var1 ^= 386180474;
                        }

                        var3 = var1;
                        var5 = var3 + 1L;
                        var5 = var3 * var5;
                        var7 = var3 + 2L;
                        var5 *= var7;
                        var3 += 3L;
                        var5 *= var3;
                        var3 = var5 & 7L;
                        long var86;
                        int var67 = (var86 = var3 - 0L) == 0L ? 0 : (var86 < 0L ? -1 : 1);
                        if (var67 != 0) {
                            break label57;
                        }

                        var50 = false;
                        var1 -= -1746546650;
                        var1 += -991872027;
                        var1 ^= -401028753;
                        var1 *= -1434765733;
                        var1 ^= -377197788;
                    }

                    var3 = var1;
                    var5 = var3 + 1L;
                    var5 = var3 * var5;
                    var3 = var5 & 1L;
                    long var87;
                    var1 = (var87 = var3 - 0L) == 0L ? 0 : (var87 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return var50;
                    }
                    break label57;
                }
            }

            long var4 = var1;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var88;
            var2 = (var88 = var4 - 0L) == 0L ? 0 : (var88 < 0L ? -1 : 1);
            if (var2 == 0) {
                AssertionError var52 = new AssertionError();
                throw var52;
            }
        }

        IllegalArgumentException var47 = new IllegalArgumentException();
        throw var47;
    }

    public static int bW(Entity var0) {
        net.minecraft.util.Identifier var175 = null;
        net.minecraft.util.Identifier var176 = null;
        net.minecraft.client.texture.AbstractTexture var177 = null;
        net.minecraft.client.MinecraftClient var210 = null;
        net.minecraft.client.texture.TextureManager var211 = null;
        label189: {
            int var2 = h;
            var2 ^= 2122869798;
            Object var3 = null;
            int var4 = jA(var0);
            var2 *= 295657649;
            var2 |= 1331820172;
            var2 -= 1563432123;
            var2 ^= 1370346379;
            if (var4 <= 0) {
                var2 = switch (var2) {
                    default -> var2 ^ -1435820165;
                    case -1008190854 -> {
                        var2 -= -825171894;
                        var2 &= -1815336875;
                        var2 &= -67597615;
                        var2 -= -572865790;
                        yield var2 ^ -900402461;
                    }
                    case 365760444 -> var2 ^ -841854899;
                };
                int var5 = var2 + 1;
                var5 = var2 * var5;
                int var6 = var2 + 2;
                var5 *= var6;
                var6 = var2 + 3;
                var5 *= var6;
                var5 &= 7;
                if (var5 != 0) {
                    break label189;
                }

                int var172 = (var0 instanceof LivingEntity) ? 1 : 0;
                var2 ^= 174497732;
                var2 += -10028891;
                var2 |= 1009864513;
                var2 ^= 1727740313;
                var2 ^= -519492440;
                long var180 = var2;
                long var8 = var180 + 1L;
                var8 = var180 * var8;
                long var181 = var8 & 1L;
                long var230;
                var6 = (var230 = var181 - 0L) == 0L ? 0 : (var230 < 0L ? -1 : 1);
                if (var6 != 0) {
                    break label189;
                }

                if (var172 != 0) {
                    var2 = switch (var2) {
                        case -1180468650 -> var2 ^ 1640844834;
                        default -> var2 ^ 619952830;
                        case -108168450 -> {
                            var2 |= 930780876;
                            var2 |= -1338245665;
                            var2 &= -1680958189;
                            var2 ^= 208136175;
                            yield var2 ^ 777405029;
                        }
                    };
                    LivingEntity var173 = (LivingEntity)var0;
                    var2 |= -871253753;
                    var2 <<= 18;
                    var2 |= -516064556;
                    var2 -= -1018485086;
                    var2 ^= 664354207;
                    Integer var183 = var2;
                    if (var183 == null) {
                        break label189;
                    }

                    LivingEntity var174 = var173;

                    var2 = switch (var2) {
                        case -1975605554 -> var2 ^ 321282750;
                        case 61565357 -> {
                            var2 *= -1436596187;
                            var2 *= 2045962283;
                            var2 *= 1164267911;
                            var2 &= 1547257918;
                            yield var2 ^ 1651572136;
                        }
                        default -> var2 ^ 1726145165;
                    };
                    int var184 = var2 + 1;
                    var184 = var2 * var184;
                    var184 &= 1;
                    if (var184 != 0) {
                        break label189;
                    }

                    Throwable var1;
                    int var7;
                    label210: {
                        try {
                            var2 *= 1218268283;
                            var2 ^= 2043759437;
                            var184 = var2 + -995885751;
                            var184 >>= 10;
                            var184 -= 104289077;
                            var184 ^= 2126930910;
                            var175 = VJ(var174, var184);
                            var2 |= 1859230461;
                            var2 -= -97601544;
                            var2 >>= 27;
                            var2 ^= 182723368;
                            var2 ^= 94493771;
                        } catch (Throwable var15) {
                            var1 = var15;
                            int var64 = h;
                            int var65 = var64 ^ -428101820;
                            var7 = (var15 instanceof RuntimeException) ? 1 : 0;
                            int var66 = var65 >> 19;
                            int var67 = var66 & -975720005;
                            int var68 = var67 >>> 2;
                            int var69 = var68 * -1582086229;
                            var2 = var69 ^ -953233055;
                            Integer var219 = var2;
                            if (var219 == null) {
                                break label189;
                            }
                            break label210;
                        }

                        var184 = var2 + 1;
                        var184 = var2 * var184;
                        var7 = var2 + 2;
                        var184 *= var7;
                        var7 = var2 + 3;
                        var184 *= var7;
                        var184 &= 7;
                        if (var184 != 0) {
                            break label189;
                        }

                        label211: {
                            try {
                                var176 = var175;
                                if (var175 == null) {
                                    break label211;
                                }
                            } catch (Throwable var16) {
                                var1 = var16;
                                int var78 = h;
                                int var79 = var78 ^ -428101820;
                                var7 = (var16 instanceof RuntimeException) ? 1 : 0;
                                int var80 = var79 >> 19;
                                int var81 = var80 & -975720005;
                                int var82 = var81 >>> 2;
                                int var83 = var82 * -1582086229;
                                var2 = var83 ^ -953233055;
                                Integer var220 = var2;
                                if (var220 == null) {
                                    break label189;
                                }
                                break label210;
                            }

                            var2 *= 866121155;
                            var2 ^= -1482697743;
                            var2 *= -930619345;
                            var2 *= -1413093641;
                            var2 ^= -1838654192;
                            long var207 = var2;
                            long var9 = var207 + 1L;
                            var9 = var207 * var9;
                            long var208 = var9 & 1L;
                            long var231;
                            var7 = (var231 = var208 - 0L) == 0L ? 0 : (var231 < 0L ? -1 : 1);
                            if (var7 != 0) {
                                break label189;
                            }

                            try {
                                var210 = zp();
                                var2 *= 1776357033;
                                var2 *= 122302517;
                                var2 += -580258597;
                                var2 ^= 9591455;
                            } catch (Throwable var14) {
                                var1 = var14;
                                int var89 = h;
                                int var90 = var89 ^ -428101820;
                                var7 = (var14 instanceof RuntimeException) ? 1 : 0;
                                int var91 = var90 >> 19;
                                int var92 = var91 & -975720005;
                                int var93 = var92 >>> 2;
                                int var94 = var93 * -1582086229;
                                var2 = var94 ^ -953233055;
                                Integer var221 = var2;
                                if (var221 == null) {
                                    break label189;
                                }
                                break label210;
                            }

                            Integer var222 = var2;
                            if (var222 == null) {
                                break label189;
                            }

                            try {
                                var211 = var210.getTextureManager();
                            } catch (Throwable var13) {
                                var1 = var13;
                                int var99 = h;
                                int var100 = var99 ^ -428101820;
                                var7 = (var13 instanceof RuntimeException) ? 1 : 0;
                                int var101 = var100 >> 19;
                                int var102 = var101 & -975720005;
                                int var103 = var102 >>> 2;
                                int var104 = var103 * -1582086229;
                                var2 = var104 ^ -953233055;
                                Integer var223 = var2;
                                if (var223 == null) {
                                    break label189;
                                }
                                break label210;
                            }
                            var2 = switch (var2) {
                                case -1703544369 -> var2 ^ 1803190975;
                                case -517275956 -> {
                                    var2 -= -1424149227;
                                    var2 ^= 1522493373;
                                    var2 &= 1107103402;
                                    var2 >>>= 23;
                                    yield var2 ^ 760232480;
                                }
                                default -> var2 ^ -2052703213;
                            };
                            Integer var224 = var2;
                            if (var224 == null) {
                                break label189;
                            }

                            try {
                                var177 = var211.getTexture(var176);
                            } catch (Throwable var12) {
                                var1 = var12;
                                int var110 = h;
                                int var111 = var110 ^ -428101820;
                                var7 = (var12 instanceof RuntimeException) ? 1 : 0;
                                int var112 = var111 >> 19;
                                int var113 = var112 & -975720005;
                                int var114 = var113 >>> 2;
                                int var115 = var114 * -1582086229;
                                var2 = var115 ^ -953233055;
                                Integer var225 = var2;
                                if (var225 == null) {
                                    break label189;
                                }
                                break label210;
                            }
                            var2 = switch (var2) {
                                case -598163103 -> var2 ^ -399588419;
                                case 760232609 -> {
                                    var2 ^= 112060302;
                                    yield var2 ^ -488117710;
                                }
                                default -> var2 ^ -621759186;
                            };

                            try {
                                var7 = var2 + -108876273;
                                var7 += 662009452;
                                var7 += -864355096;
                                var7 ^= -1764563308;
                                var172 = CD(var177, var7);
                                var2 += 1279977531;
                                var2 -= 899529907;
                                var2 -= 1051368890;
                                var2 ^= -197138679;
                            } catch (Throwable var11) {
                                var1 = var11;
                                int var118 = h;
                                int var119 = var118 ^ -428101820;
                                var7 = (var11 instanceof RuntimeException) ? 1 : 0;
                                int var120 = var119 >> 19;
                                int var121 = var120 & -975720005;
                                int var122 = var121 >>> 2;
                                int var123 = var122 * -1582086229;
                                var2 = var123 ^ -953233055;
                                Integer var226 = var2;
                                if (var226 == null) {
                                    break label189;
                                }
                                break label210;
                            }

                            int var20 = var2 + 1;
                            int var21 = var2 * var20;
                            int var166 = var2 + 2;
                            int var22 = var21 * var166;
                            int var167 = var2 + 3;
                            int var23 = var22 * var167;
                            int var24 = var23 & 7;
                            if (var24 != 0) {
                                break label189;
                            }

                            switch (var2) {
                                case -1726159930:
                                default:
                                    var2 ^= -1201765915;
                                    return var172;
                                case -1313540781:
                                    var2 ^= -775557840;
                                    return var172;
                                case 1428366306:
                                    var2 *= 1055249541;
                                    var2 -= 1805837883;
                                    var2 -= 578127830;
                                    var2 |= 1975062969;
                                    var2 ^= -789951819;
                                    return var172;
                            }
                        }

                        var2 -= -124050457;
                        var2 += -1826849721;
                        var2 -= -706673858;
                        var2 ^= -1722011062;
                        var2 ^= 1050988805;
                        long var197 = var2;
                        var8 = var197 + 1L;
                        var8 = var197 * var8;
                        long var198 = var8 & 1L;
                        long var232;
                        var184 = (var232 = var198 - 0L) == 0L ? 0 : (var232 < 0L ? -1 : 1);
                        if (var184 != 0) {
                            break label189;
                        }
                        var2 = switch (var2) {
                            default -> var2 ^ 1757448442;
                            case 312653562 -> {
                                var2 ^= 699236164;
                                var2 &= 1666259026;
                                var2 ^= 1741153396;
                                var2 -= 1657110689;
                                yield var2 ^ -1562922917;
                            }
                            case 1121916208 -> var2 ^ 394278724;
                        };
                        var184 = var2 + 1;
                        var184 = var2 * var184;
                        var7 = var2 + 2;
                        var184 *= var7;
                        var7 = var2 + 3;
                        var184 *= var7;
                        var184 &= 7;
                        if (var184 != 0) {
                            break label189;
                        }

                        byte var196 = 0;
                        switch (var2) {
                            case 644823908:
                                var2 ^= -141203285;
                                return var196;
                            case 1087822750:
                                var2 *= -2034611619;
                                var2 &= -1042461508;
                                var2 += -1744638815;
                                var2 ^= 1963533705;
                                return var196;
                            case 1827257521:
                            default:
                                var2 ^= -703811187;
                                return var196;
                        }
                    }

                    if (var7 == 0) {
                        switch (var2) {
                            case -1903380625:
                                var2 |= -1222955028;
                                var2 ^= -268218399;
                                break;
                            case 65704967:
                            default:
                                var2 ^= -63688123;
                                break;
                            case 1738654706:
                                var2 ^= -772782419;
                        }

                        throw UncheckedExceptions.rethrow(var1);
                    }

                    var2 *= 1699386915;
                    var2 >>= 18;
                    var2 ^= -931423160;
                    var3 = (RuntimeException)var1;
                    var2 -= 1253290065;
                    var2 += -368493807;
                    var2 ^= -4667535;
                    var2 ^= -281851610;
                    var2 ^= -648877993;
                    int var17 = var2 + 1;
                    int var18 = var2 * var17;
                    int var19 = var18 & 1;
                    if (var19 == 0) {
                        return 0;
                    }
                    break label189;
                }

                var2 <<= 13;
                var2 |= 687034882;
                var2 &= 1590117483;
                var2 *= 1185690019;
                var2 ^= -796647381;
            } else {
                var2 -= 996588834;
                var2 += -801713697;
                var2 ^= -1857401766;
            }

            int var25 = var2 + 1;
            var25 = var2 * var25;
            var25 &= 1;
            if (var25 == 0) {
                return var4;
            }
        }

        UnsupportedOperationException var28 = new UnsupportedOperationException();
        throw var28;
    }

    private static Identifier VJ(LivingEntity var0, int var1) {
        label59: {
            int var3 = System.identityHashCode(var0);
            MinecraftClient var4 = zp();
            EntityRenderManager var51 = var4.getEntityRenderDispatcher();
            EntityRenderer var52 = var51.getRenderer(var0);
            int var5 = (var52 instanceof LivingEntityRenderer) ? 1 : 0;
            Integer var6 = var3;
            int var19;
            if (var6 != null) {
                var19 = var1 - 1153765146;
                var19 ^= 772054008;
                var19 ^= 110547043;
                if (var5 == 0) {
                    switch (var19) {
                        case -1565366365:
                            var19 ^= -1223687074;
                            break;
                        case -384425545:
                        default:
                            var19 ^= -1041749030;
                            break;
                        case 1780904106:
                            var19 <<= 29;
                            var19 *= -829968525;
                            var19 <<= 6;
                            var19 += 293140986;
                            var19 ^= 1158725841;
                    }

                    return null;
                }

                var19 ^= -849856641;
                var19 <<= 16;
                var19 &= 361578602;
                var19 |= -1637599656;
                var19 ^= 1978175651;
                Integer var54 = var19;
                if (var54 == null) {
                    break label59;
                }

                LivingEntityRenderer var53 = (LivingEntityRenderer)var52;
                var54 = var3;
                if (var54 == null) {
                    switch (var19) {
                        case -806808485:
                            var19 ^= -569139678;
                            break;
                        case -368204037:
                            var19 &= 1055161536;
                            var19 *= 462617347;
                            var19 += 1375252924;
                            var19 |= -1911124712;
                            var19 ^= -1601049183;
                            break;
                        case 1584611929:
                        default:
                            var19 ^= 487152648;
                    }
                } else {
                    var19 -= 756624663;
                    var19 &= -861510065;
                    var19 ^= -1424128600;
                    var5 = var19 + 1;
                    int var57 = var19 * var5;
                    var57 &= 1;
                    if (var57 != 0) {
                        break label59;
                    }

                    var19 &= 293898390;
                    var19 ^= 1719740201;
                    var57 = var19 + 1;
                    var57 = var19 * var57;
                    var57 &= 1;
                    if (var57 != 0) {
                        break label59;
                    }

                    float var62 = u();
                    EntityRenderState var63 = var53.getAndUpdateRenderState(var0, var62);
                    LivingEntityRenderState var64 = (LivingEntityRenderState)var63;
                    long var65 = var3;
                    long var8 = var65 + 1L;
                    var8 = var65 * var8;
                    long var10 = var65 + 2L;
                    var8 *= var10;
                    long var66 = var65 + 3L;
                    var8 *= var66;
                    long var67 = var8 & 7L;
                    long var75;
                    var3 = (var75 = var67 - 0L) == 0L ? 0 : (var75 < 0L ? -1 : 1);
                    if (var3 == 0) {
                        var19 >>= 5;
                        var19 -= -1474670854;
                        var19 -= -2032438840;
                        var19 -= 613600194;
                        var19 ^= -1952792383;
                        long var68 = var19;
                        var8 = var68 + 1L;
                        var8 = var68 * var8;
                        long var69 = var8 & 1L;
                        long var76;
                        var3 = (var76 = var69 - 0L) == 0L ? 0 : (var76 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return var53.getTexture(var64);
                        }
                        break label59;
                    }

                    var19 -= 1361709899;
                    var19 &= -1846695588;
                    var19 *= -784658919;
                    var19 |= 253737982;
                    var19 ^= 7458211;
                }
            } else {
                var19 = var1 & 1632413359;
                var19 ^= 1044787286;
            }

            Integer var46 = var19;
            if (var46 != null) {
                RuntimeException var48 = new RuntimeException();
                throw var48;
            }
        }

        IllegalStateException var47 = new IllegalStateException();
        throw var47;
    }

    private static int CD(AbstractTexture var0, int var1) {
        label77: {
            int var33;
            int var55;
            label76: {
                var55 = System.identityHashCode(var0);
                int var4 = var55 + 1;
                var4 = var55 * var4;
                var4 &= 1;
                if (var4 == 0) {
                    var33 = var1 & -1590920475;
                    var33 >>= 9;
                    var33 ^= -186209631;
                    long var58 = var33;
                    long var6 = var58 + 1L;
                    var6 = var58 * var6;
                    long var59 = var6 & 1L;
                    long var91;
                    var4 = (var91 = var59 - 0L) == 0L ? 0 : (var91 < 0L ? -1 : 1);
                    if (var4 != 0) {
                        break label77;
                    }

                    if (var0 == null) {
                        switch (var33) {
                            case -185160516:
                                var33 ^= -1827660521;
                                var33 ^= -1660302483;
                                break;
                            case 740497599:
                            default:
                                var33 ^= -1030088070;
                                break;
                            case 1957440817:
                                var33 ^= 1967919388;
                        }

                        return 0;
                    }

                    var33 *= 1239782297;
                    var33 ^= -1796135116;
                    GpuTexture var61 = var0.getGlTexture();
                    long var5 = var55;
                    long var7 = var5 + 1L;
                    var7 = var5 * var7;
                    var5 = var7 & 1L;
                    long var92;
                    int var72 = (var92 = var5 - 0L) == 0L ? 0 : (var92 < 0L ? -1 : 1);
                    if (var72 != 0) {
                        var33 |= -1460086015;
                        var33 |= 990781301;
                        var33 >>= 19;
                        var33 ^= 890237143;
                    } else {
                        var33 -= -542567115;
                        var33 += -392281288;
                        var33 ^= -241718106;
                        int var73 = var33 + 1;
                        int var74 = var33 * var73;
                        int var75 = var74 & 1;
                        if (var75 != 0) {
                            break label77;
                        }

                        boolean var76 = var61 instanceof GlTexture;
                        if (!var76) {
                            var33 = switch (var33) {
                                default -> var33 ^ -1131760341;
                                case -1066187584 -> var33 ^ -750587922;
                                case 817555917 -> {
                                    var33 >>= 2;
                                    var33 *= 1085930925;
                                    var33 -= -1859221231;
                                    yield var33 ^ 1066966583;
                                }
                            };
                            Integer var64 = var33;
                            if (var64 == null) {
                                break label77;
                            }

                            var55 = 0;
                            var33 &= -962915913;
                            var33 &= 385094609;
                            var33 ^= 902913837;
                            break label76;
                        }

                        var33 >>= 3;
                        var33 ^= -1357992899;
                        var33 *= -918108951;
                        var33 ^= 1711922187;
                        var33 ^= 122670417;
                        int var77 = var33 + 1;
                        int var78 = var33 * var77;
                        int var79 = var78 & 1;
                        if (var79 != 0) {
                            break label77;
                        }

                        GlTexture var62 = (GlTexture)var61;
                        var4 = var62.getGlId();
                        int var80 = var55 + 1;
                        int var81 = var55 * var80;
                        int var85 = var55 + 2;
                        int var82 = var81 * var85;
                        var55 += 3;
                        int var83 = var82 * var55;
                        var55 = var83 & 7;
                        if (var55 == 0) {
                            var33 ^= 721567386;
                            var33 >>= 6;
                            var33 ^= 1913453487;
                            var55 = var33 + 1;
                            var55 = var33 * var55;
                            var55 &= 1;
                            if (var55 != 0) {
                                break label77;
                            }

                            var55 = var4;
                            var33 <<= 24;
                            var33 ^= 1689691160;
                            var33 -= -535402173;
                            var33 ^= -782146455;
                            break label76;
                        }

                        var33 |= 1708635268;
                        var33 ^= 1058011734;
                    }
                } else {
                    var33 = var1 | 420523322;
                    var33 ^= -206587754;
                }

                long var45 = var33;
                long var69 = var45 + 1L;
                long var70 = var45 * var69;
                long var46 = var70 & 1L;
                long var93;
                var33 = (var93 = var46 - 0L) == 0L ? 0 : (var93 < 0L ? -1 : 1);
                if (var33 == 0) {
                    RuntimeException var49 = new RuntimeException();
                    throw var49;
                }
                break label77;
            }

            long var65 = var33;
            long var86 = var65 + 1L;
            var86 = var65 * var86;
            long var8 = var65 + 2L;
            var86 *= var8;
            var65 += 3L;
            var86 *= var65;
            var65 = var86 & 7L;
            long var94;
            int var68 = (var94 = var65 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
            if (var68 == 0) {
                return var55;
            }
        }

        IllegalArgumentException var48 = new IllegalArgumentException();
        throw var48;
    }

    public static boolean TH() {
        int var0 = h;
        var0 ^= 586244408;
        Screen var1 = vB();
        var0 &= -804784718;
        var0 ^= -1077648674;
        Integer var5 = var0;
        if (var5 != null) {
            return var1 instanceof ChatScreen;
        } else {
            RuntimeException var6 = new RuntimeException();
            throw var6;
        }
    }

    public static void XT() {
        f("");
    }

    public static void f(String var0) {
        int var1 = h;
        var1 ^= 1269394744;
        int var2 = System.identityHashCode(var0);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var37;
        var2 = (var37 = var21 - 0L) == 0L ? 0 : (var37 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 -= -615252222;
            var1 ^= 798787553;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                UnsupportedOperationException var28 = new UnsupportedOperationException();
                throw var28;
            }
        } else {
            var1 |= 1171298131;
            var1 ^= 1781829040;
            long var13 = var1;
            long var30 = var13 + 1L;
            var30 = var13 * var30;
            long var5 = var13 + 2L;
            var30 *= var5;
            long var14 = var13 + 3L;
            var30 *= var14;
            long var15 = var30 & 7L;
            long var38;
            var1 = (var38 = var15 - 0L) == 0L ? 0 : (var38 < 0L ? -1 : 1);
            if (var1 == 0) {
                ChatScreen var18 = new ChatScreen(var0, false);
                m(var18);
                return;
            }
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    public static float bY() {
        int var0 = h;
        var0 ^= 1295856123;
        MinecraftClient var1 = zp();
        Window var14 = var1.getWindow();
        MinecraftClient var2 = zp();
        Mouse var17 = var2.mouse;
        double var18 = var17.getX();
        int var4 = var14.getFramebufferWidth();
        double var21 = var4;
        double var19 = var18 * var21;
        int var15 = var14.getWidth();
        int var16 = Math.max(1, var15);
        var0 <<= 18;
        var0 >>>= 14;
        var0 ^= -1180018822;
        var0 ^= -1253703424;
        double var11 = var16;
        double var12 = var19 / var11;
        double var20 = qJ();
        double var13 = var12 / var20;
        return (float)var13;
    }

    public static float i() {
        int var0 = h;
        var0 ^= -254921235;
        MinecraftClient var1 = zp();
        var0 >>= 29;
        var0 ^= -1425651814;
        Window var8 = var1.getWindow();
        var1 = zp();
        Mouse var14 = var1.mouse;
        double var15 = var14.getY();
        int var3 = var8.getFramebufferHeight();
        double var17 = var3;
        double var16 = var15 * var17;
        var0 = var8.getHeight();
        var0 = Math.max(1, var0);
        double var18 = var0;
        double var11 = var16 / var18;
        double var2 = qJ();
        double var12 = var11 / var2;
        return (float)var12;
    }

    public static boolean sW() {
        int var77 = 0;
        label88: {
            label99: {
                int var29;
                long var76;
                try {
                    var29 = h;
                    var29 ^= -401484370;
                    Object var11 = null;
                    var29 &= -941262089;
                    var29 |= 1337697128;
                    var29 ^= 1868339380;
                    int var2 = var29 | -495487604;
                    int var75 = var2 ^ -669593457;
                    var76 = X(var75);
                    var29 *= -511574035;
                    var29 -= -1601094019;
                    var29 ^= 849360858;
                } catch (LinkageError | RuntimeException var9) {
                    var29 = h;
                    var29 ^= 720827165;
                    Throwable var3 = N(var9);
                    Throwable var0 = var3;
                    var29 <<= 10;
                    var29 &= -1833243848;
                    var29 ^= -1388201848;
                    int var79 = var29 + 1;
                    int var80 = var29 * var79;
                    int var81 = var80 & 1;
                    if (var81 != 0) {
                        break label88;
                    }
                    break label99;
                }

                int var4 = var29 + 1;
                var4 = var29 * var4;
                var4 &= 1;
                if (var4 != 0) {
                    break label88;
                }

                try {
                    var77 = GLFW.glfwGetMouseButton(var76, 0);
                } catch (LinkageError | RuntimeException var8) {
                    var29 = h;
                    var29 ^= 720827165;
                    Throwable var82 = N(var8);
                    Throwable var12 = var82;
                    var29 <<= 10;
                    var29 &= -1833243848;
                    var29 ^= -1388201848;
                    int var83 = var29 + 1;
                    int var84 = var29 * var83;
                    int var85 = var84 & 1;
                    if (var85 != 0) {
                        break label88;
                    }
                    break label99;
                }
                var29 = switch (var29) {
                    default -> var29 ^ 1589315085;
                    case -572215691 -> {
                        var29 |= -1550829630;
                        var29 -= -1975680764;
                        var29 -= -644273761;
                        yield var29 ^ 778216852;
                    }
                    case 2044256572 -> var29 ^ 180019127;
                };
                long var86 = var29;
                long var5 = var86 + 1L;
                var5 = var86 * var5;
                var86 = var5 & 1L;
                long var103;
                int var88 = (var103 = var86 - 0L) == 0L ? 0 : (var103 < 0L ? -1 : 1);
                if (var88 != 0) {
                    break label88;
                }

                label100: {
                    try {
                        if (var77 != 1) {
                            break label100;
                        }
                    } catch (LinkageError | RuntimeException var10) {
                        var29 = h;
                        var29 ^= 720827165;
                        Throwable var89 = N(var10);
                        Throwable var13 = var89;
                        var29 <<= 10;
                        var29 &= -1833243848;
                        var29 ^= -1388201848;
                        int var90 = var29 + 1;
                        int var91 = var29 * var90;
                        int var92 = var91 & 1;
                        if (var92 != 0) {
                            break label88;
                        }
                        break label99;
                    }
                    var29 = switch (var29) {
                        case -1340179620 -> var29 ^ 115074371;
                        case -1300451136 -> {
                            var29 += 341076829;
                            var29 |= 969318920;
                            var29 += -2013223781;
                            var29 += -1613595292;
                            yield var29 ^ 1636776533;
                        }
                        default -> var29 ^ -874093903;
                    };

                    try {
                        var29 ^= -2050105017;
                        var29 ^= 1557575063;
                    } catch (LinkageError | RuntimeException var7) {
                        var29 = h;
                        var29 ^= 720827165;
                        Throwable var93 = N(var7);
                        Throwable var14 = var93;
                        var29 <<= 10;
                        var29 &= -1833243848;
                        var29 ^= -1388201848;
                        int var94 = var29 + 1;
                        int var95 = var29 * var94;
                        int var96 = var95 & 1;
                        if (var96 != 0) {
                            break label88;
                        }
                        break label99;
                    }

                    boolean var78 = true;
                    switch (var29) {
                        case -1623290215:
                            var29 -= -1934447575;
                            var29 ^= 835334966;
                            var29 <<= 11;
                            var29 |= 435194544;
                            var29 ^= -1508851957;
                            return var78;
                        case 1015525185:
                        default:
                            var29 ^= 1858398570;
                            return var78;
                        case 1513004687:
                            var29 ^= 697199282;
                            return var78;
                    }
                }

                var29 -= 1443711257;
                var29 ^= -68668588;
                int var97 = var29 + 1;
                int var98 = var29 * var97;
                int var99 = var98 & 1;
                if (var99 != 0) {
                    break label88;
                }
                var29 = switch (var29) {
                    case -1990818643 -> var29 ^ 868040374;
                    case -1484303117 -> {
                        var29 += 1656035774;
                        var29 -= 1383716234;
                        yield var29 ^ -1622912452;
                    }
                    default -> var29 ^ 1918115566;
                };
                boolean var104 = false;
                switch (var29) {
                    case -1981580529:
                    default:
                        var29 ^= -1312303844;
                        return var104;
                    case 679922459:
                        var29 += 1895358685;
                        var29 += 1142151744;
                        var29 >>>= 17;
                        var29 |= 2115323664;
                        var29 ^= -939562398;
                        return var104;
                    case 1455061507:
                        var29 ^= -1263073018;
                        return var104;
                }
            }

            MinecraftClient var15 = zp();
            Mouse var16 = var15.mouse;
            return var16.wasLeftButtonClicked();
        }

        RuntimeException var17 = new RuntimeException();
        throw var17;
    }

    public static int Tr(int var0) {
        int var1 = h;
        var1 ^= 534222931;
        long var3 = var0;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        var3 = var5 & 1L;
        long var45;
        int var36 = (var45 = var3 - 0L) == 0L ? 0 : (var45 < 0L ? -1 : 1);
        if (var36 == 0) {
            var1 &= 369152778;
            var1 *= 727376799;
            var1 |= -876353550;
            var1 ^= 855302774;
            Integer var37 = var0;
            if (var37 != null) {
                if (var0 == 0) {
                    switch (var1) {
                        case -420017036:
                        default:
                            var1 ^= -1031925255;
                            break;
                        case -47637108:
                            var1 >>= 26;
                            var1 ^= 1581884680;
                            var1 |= 1828854267;
                            var1 ^= -234791579;
                            break;
                        case 1267235324:
                            var1 ^= -1699072338;
                    }

                    int var38 = var0 + 1;
                    int var39 = var0 * var38;
                    int var4 = var0 + 2;
                    int var40 = var39 * var4;
                    var4 = var0 + 3;
                    int var41 = var40 * var4;
                    int var42 = var41 & 7;
                    if (var42 == 0) {
                        return 0;
                    }
                } else {
                    var1 += 559438075;
                    var1 &= 684882674;
                    var1 ^= 1630888825;
                    Integer var2 = var0;
                    if (var2 != null) {
                        if (var0 == 1) {
                            var1 ^= 1607566401;
                            var1 ^= 1147338282;
                            return 1;
                        }

                        switch (var1) {
                            case -1990246967:
                            default:
                                var1 ^= -1230298761;
                                break;
                            case 1498379743:
                                var1 ^= 1790211994;
                                break;
                            case 1773474299:
                                var1 >>= 30;
                                var1 ^= -1796703164;
                                var1 += -1458074905;
                                var1 ^= 602958890;
                                var1 ^= 834341525;
                        }

                        return 2;
                    }
                }
            }

            AssertionError var34 = new AssertionError();
            throw var34;
        } else {
            var1 >>= 27;
            var1 *= 649255383;
            var1 ^= 1148889271;
            AssertionError var11 = new AssertionError();
            throw var11;
        }
    }

    public static int g() {
        int var0 = h;
        var0 ^= -76901250;
        MinecraftClient var1 = zp();
        ClientPlayNetworkHandler var54 = var1.getNetworkHandler();
        var0 |= 110039209;
        var0 ^= -170341997;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        label83:
        if (var2 == 0) {
            MinecraftClient var61 = zp();
            ClientPlayerEntity var62 = var61.player;
            if (var54 != null) {
                var0 *= 2134104869;
                var0 |= 1231840436;
                var0 ^= -1271980423;
                var0 |= 2049814192;
                var0 ^= -1929835294;
                Integer var3 = var0;
                if (var3 == null) {
                    break label83;
                }

                if (var62 != null) {
                    var0 &= -968938314;
                    var0 += -1484272536;
                    var0 ^= -1227040633;
                    int var73 = var0 + 1;
                    var73 = var0 * var73;
                    int var4 = var0 + 2;
                    var73 *= var4;
                    var4 = var0 + 3;
                    var73 *= var4;
                    var73 &= 7;
                    if (var73 == 0) {
                        UUID var63 = var62.getUuid();

                        var0 = switch (var0) {
                            case -547932933 -> {
                                var0 *= 2087961553;
                                yield var0 ^ -330120936;
                            }
                            default -> var0 ^ -1951941428;
                            case 1664706755 -> var0 ^ 590247779;
                        };
                        var73 = var0 + 1;
                        var73 = var0 * var73;
                        var4 = var0 + 2;
                        var73 *= var4;
                        var4 = var0 + 3;
                        var73 *= var4;
                        var73 &= 7;
                        if (var73 == 0) {
                            PlayerListEntry var55 = var54.getPlayerListEntry(var63);
                            if (var55 == null) {
                                var0 >>= 29;
                                var0 &= -1730637137;
                                var0 *= 2134243683;
                                var0 += -722427893;
                                var0 ^= -2131151290;
                                long var64 = var0;
                                long var91 = var64 + 1L;
                                long var92 = var64 * var91;
                                long var6 = var64 + 2L;
                                long var93 = var92 * var6;
                                long var65 = var64 + 3L;
                                long var94 = var93 * var65;
                                long var66 = var94 & 7L;
                                long var98;
                                var2 = (var98 = var66 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                                if (var2 != 0) {
                                    break label83;
                                }

                                var2 = 0;
                                switch (var0) {
                                    case -946101997:
                                        var0 *= 1390211161;
                                        var0 &= -544406885;
                                        var0 ^= 513944873;
                                        break;
                                    case 421779512:
                                    default:
                                        var0 ^= 825808685;
                                        break;
                                    case 535834369:
                                        var0 ^= 189126331;
                                }
                            } else {
                                var0 = switch (var0) {
                                    case -2003383628 -> var0 ^ 828934286;
                                    case -937643789 -> {
                                        var0 |= -661480333;
                                        var0 <<= 17;
                                        var0 += -1387153677;
                                        var0 *= -1234350273;
                                        yield var0 ^ 817863752;
                                    }
                                    default -> var0 ^ 1610001256;
                                };
                                var73 = var0 + 1;
                                var73 = var0 * var73;
                                var4 = var0 + 2;
                                var73 *= var4;
                                var4 = var0 + 3;
                                var73 *= var4;
                                var73 &= 7;
                                if (var73 != 0) {
                                    break label83;
                                }

                                int var56 = var55.getLatency();
                                var0 -= -644421325;
                                var0 -= 1744923534;
                                var0 ^= 1846636046;
                                int var57 = Math.max(0, var56);
                                var2 = var57;
                                switch (var0) {
                                    case -1264759653:
                                        var0 ^= 1762382184;
                                        break;
                                    case -860716110:
                                    default:
                                        var0 ^= 803410261;
                                        break;
                                    case 1670653898:
                                        var0 += 905942360;
                                        var0 |= 366553872;
                                        var0 <<= 24;
                                        var0 ^= -492687438;
                                }
                            }

                            Integer var58 = var0;
                            if (var58 != null) {
                                return var2;
                            }
                        }
                    }
                    break label83;
                }

                var0 += -497984760;
                var0 ^= 1275557485;
                var0 += -629680710;
                var0 &= 717137171;
                var0 ^= 1880154748;
            } else {
                switch (var0) {
                    case 84458649:
                    default:
                        var0 ^= -1566619335;
                        break;
                    case 724008554:
                        var0 *= 1000767827;
                        var0 &= -213759581;
                        var0 ^= 280018517;
                        var0 >>>= 21;
                        var0 ^= 1385752035;
                        break;
                    case 1588026600:
                        var0 ^= -1575997435;
                }
            }

            long var49 = var0;
            long var69 = var49 + 1L;
            long var70 = var49 * var69;
            long var97 = var49 + 2L;
            long var71 = var70 * var97;
            long var50 = var49 + 3L;
            long var72 = var71 * var50;
            long var51 = var72 & 7L;
            long var99;
            var0 = (var99 = var51 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
            if (var0 == 0) {
                return 0;
            }
        }

        IllegalStateException var53 = new IllegalStateException();
        throw var53;
    }

    public static KI mu() {
        int var0 = h;
        var0 ^= 1208620252;
        MinecraftClient var1 = zp();
        ClientWorld var2 = var1.world;

        var0 = switch (var0) {
            default -> var0 ^ 666760989;
            case -140839239 -> var0 ^ 543336544;
            case 1763649490 -> {
                var0 *= -857617917;
                var0 &= -1012574551;
                yield var0 ^ 428530154;
            }
        };
        int var3 = var0 + 1;
        var3 = var0 * var3;
        int var4 = var0 + 2;
        var3 *= var4;
        var4 = var0 + 3;
        var3 *= var4;
        var3 &= 7;
        if (var3 == 0) {
            if (var2 == null) {
                var0 ^= -1730172284;
                var0 *= 5960771;
                var0 ^= 1933117549;
                return KI.MENU;
            }
            var0 = switch (var0) {
                default -> var0 ^ -1195407453;
                case -687015545 -> var0 ^ -1512359815;
                case 428596170 -> {
                    var0 += -2097141379;
                    var0 ^= -972106346;
                    var0 += 339207933;
                    var0 += 448056355;
                    yield var0 ^ -1948133057;
                }
            };
            long var75 = var0;
            long var103 = var75 + 1L;
            long var104 = var75 * var103;
            long var76 = var104 & 1L;
            long var116;
            int var77 = (var116 = var76 - 0L) == 0L ? 0 : (var116 < 0L ? -1 : 1);
            if (var77 == 0) {
                boolean var78 = var1.isIntegratedServerRunning();

                var0 = switch (var0) {
                    case -527338475 -> var0 ^ -725588889;
                    case 42883790 -> {
                        var0 <<= 20;
                        var0 |= -1604604850;
                        var0 -= -440345329;
                        yield var0 ^ -1365367607;
                    }
                    default -> var0 ^ 1225828496;
                };
                Integer var96 = var0;
                if (var96 != null) {
                    if (var78) {
                        Integer var79 = switch (var0) {
                            case -229568408 -> var0 ^ -2080452110;
                            default -> var0 ^ 542519789;
                            case 1772415990 -> {
                                var0 &= -1250834518;
                                yield var0 ^ 1209258886;
                            }
                        };
                        if (var79 != null) {
                            return KI.SINGLEPLAYER;
                        }
                    } else {
                        var0 *= -1399211001;
                        var0 ^= -74399081;
                        ServerInfo var68 = var1.getCurrentServerEntry();
                        var0 &= 1225026218;
                        var0 ^= 314750651;
                        Integer var80 = var0;
                        label103:
                        if (var80 != null) {
                            if (var68 != null) {
                                var0 <<= 3;
                                var0 ^= 1462507321;
                                boolean var81 = var68.isRealm();
                                var0 >>= 15;
                                var0 ^= -1097524266;
                                int var97 = var0 + 1;
                                var97 = var0 * var97;
                                var4 = var0 + 2;
                                var97 *= var4;
                                var4 = var0 + 3;
                                var97 *= var4;
                                var97 &= 7;
                                if (var97 != 0) {
                                    break label103;
                                }

                                if (var81) {
                                    var0 &= -1932951025;
                                    var0 &= -1857756808;
                                    var0 *= 1838566593;
                                    var0 ^= -431434325;
                                    Integer var82 = var0;
                                    if (var82 != null) {
                                        return KI.REALMS;
                                    }
                                    break label103;
                                }

                                var0 &= -1291102166;
                                var0 &= 1827763913;
                                var0 += -551772001;
                                var0 ^= -1406029627;
                            } else {
                                var0 <<= 23;
                                var0 |= -604891675;
                                var0 *= 1224056659;
                                var0 |= 535815961;
                                var0 ^= 1825761125;
                            }

                            long var83 = var0;
                            long var107 = var83 + 1L;
                            long var108 = var83 * var107;
                            long var6 = var83 + 2L;
                            long var109 = var108 * var6;
                            long var84 = var83 + 3L;
                            long var110 = var109 * var84;
                            long var85 = var110 & 7L;
                            long var117;
                            int var86 = (var117 = var85 - 0L) == 0L ? 0 : (var117 < 0L ? -1 : 1);
                            label95:
                            if (var86 == 0) {
                                if (var68 != null) {
                                    var0 ^= -85900984;
                                    var0 ^= -1254549538;
                                    var0 ^= 1743533301;
                                    long var87 = var0;
                                    long var111 = var87 + 1L;
                                    long var112 = var87 * var111;
                                    var6 = var87 + 2L;
                                    long var113 = var112 * var6;
                                    long var88 = var87 + 3L;
                                    long var114 = var113 * var88;
                                    long var89 = var114 & 7L;
                                    long var118;
                                    int var90 = (var118 = var89 - 0L) == 0L ? 0 : (var118 < 0L ? -1 : 1);
                                    if (var90 != 0) {
                                        break label95;
                                    }

                                    boolean var69 = var68.isLocal();
                                    var0 >>= 23;
                                    var0 &= 1777783977;
                                    var0 *= 1417894189;
                                    var0 ^= -238049574;
                                    if (var69) {
                                        var0 <<= 6;
                                        var0 *= 621258033;
                                        var0 &= -68747738;
                                        var0 ^= 1029367468;
                                        Integer var70 = var0;
                                        if (var70 != null) {
                                            return KI.LAN;
                                        }
                                        break label95;
                                    }

                                    var0 &= -1406465145;
                                    var0 &= 924179359;
                                    var0 += 790078149;
                                    var0 &= 2129772190;
                                    var0 ^= -1529156536;
                                } else {
                                    switch (var0) {
                                        case 217210842:
                                        default:
                                            var0 ^= 959656811;
                                            break;
                                        case 1291619593:
                                            var0 ^= -1825218387;
                                            break;
                                        case 1932333146:
                                            var0 *= -1305057829;
                                            var0 &= -1274833999;
                                            var0 &= 1171480594;
                                            var0 ^= -288669602;
                                    }
                                }

                                int var71 = var0 + 1;
                                int var72 = var0 * var71;
                                int var91 = var0 + 2;
                                int var73 = var72 * var91;
                                var0 += 3;
                                int var74 = var73 * var0;
                                var0 = var74 & 7;
                                if (var0 == 0) {
                                    return KI.MULTIPLAYER;
                                }
                            }
                        }
                    }
                }
            }
        }

        IllegalStateException var64 = new IllegalStateException();
        throw var64;
    }

    public static String mk() {
        int var0 = h;
        var0 ^= 1917919210;
        MinecraftClient var1 = zp();
        var0 -= -1643789687;
        var0 >>>= 28;
        var0 |= 1371399497;
        var0 *= -1695545199;
        var0 ^= -62822253;
        Integer var2 = var0;
        label45:
        if (var2 != null) {
            ServerInfo var35 = var1.getCurrentServerEntry();
            String var45;
            if (var35 == null) {
                var0 &= 1747378713;
                var0 -= -525440415;
                var0 ^= 797258193;
                long var41 = var0;
                long var4 = var41 + 1L;
                var4 = var41 * var4;
                long var6 = var41 + 2L;
                var4 *= var6;
                long var42 = var41 + 3L;
                var4 *= var42;
                long var43 = var4 & 7L;
                long var63;
                int var44 = (var63 = var43 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
                if (var44 != 0) {
                    break label45;
                }

                var45 = null;
                var0 *= -1934868199;
                var0 |= -988678088;
                var0 ^= 509747608;
            } else {
                var0 = switch (var0) {
                    case -1404543000 -> {
                        var0 -= -487609595;
                        var0 -= 166549834;
                        yield var0 ^ -439798436;
                    }
                    case -1113525372 -> var0 ^ -1484470868;
                    default -> var0 ^ 8472319;
                };
                int var3 = var0 + 1;
                var3 = var0 * var3;
                int var59 = var0 + 2;
                var3 *= var59;
                var59 = var0 + 3;
                var3 *= var59;
                var3 &= 7;
                if (var3 != 0) {
                    break label45;
                }

                String var36 = var35.address;

                var0 = switch (var0) {
                    default -> var0 ^ 1358232557;
                    case -54272270 -> var0 ^ -1861055434;
                    case 1520594629 -> {
                        var0 |= -473038326;
                        var0 += -588334930;
                        var0 >>>= 26;
                        var0 >>>= 24;
                        yield var0 ^ 1805892240;
                    }
                };
                var3 = var0 + 1;
                var3 = var0 * var3;
                var59 = var0 + 2;
                var3 *= var59;
                var59 = var0 + 3;
                var3 *= var59;
                var3 &= 7;
                if (var3 != 0) {
                    break label45;
                }

                var45 = var36;
                var0 |= -371807841;
                var0 ^= 693755351;
                var0 |= 793677207;
                var0 *= 1503200989;
                var0 ^= 1876857765;
            }

            int var37 = var0 + 1;
            int var38 = var0 * var37;
            int var55 = var0 + 2;
            int var39 = var38 * var55;
            var0 += 3;
            int var40 = var39 * var0;
            var0 = var40 & 7;
            if (var0 == 0) {
                return var45;
            }
        }

        AssertionError var34 = new AssertionError();
        throw var34;
    }

    public static String V() {
        int var0 = h;
        var0 ^= 1499318640;
        MinecraftClient var1 = zp();
        LanguageManager var10 = var1.getLanguageManager();
        var0 <<= 6;
        var0 ^= 465901787;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var0 += 3;
        var2 *= var0;
        var0 = var2 & 7;
        if (var0 == 0) {
            return var10.getLanguage();
        } else {
            RuntimeException var9 = new RuntimeException();
            throw var9;
        }
    }

    public static Collection ID() {
        int var0 = h;
        var0 ^= 1480891847;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var34 = var1.player;

        var0 = switch (var0) {
            case -148555360 -> var0 ^ -1862630730;
            default -> var0 ^ 1240700532;
            case 2035396297 -> {
                var0 &= 1974321608;
                var0 ^= -732302838;
                var0 |= 1896396776;
                yield var0 ^ 1433903462;
            }
        };
        Object var36;
        if (var34 == null) {
            var0 = switch (var0) {
                case -1607510388 -> {
                    var0 -= -817589039;
                    var0 >>= 31;
                    yield var0 ^ 1432222490;
                }
                default -> var0 ^ 2081153192;
                case 1989701693 -> var0 ^ -1156006317;
            };
            var36 = List.of();
            var0 *= 1311207763;
            var0 *= 1546156175;
            var0 -= 1279348608;
            var0 ^= 1573425760;
            var36 = var36;
            var0 >>= 13;
            var0 += 1316433877;
            var0 ^= -753722112;
            var0 <<= 13;
            var0 ^= -2090823979;
        } else {
            var0 -= 738872258;
            var0 ^= 1274096247;
            Collection var35 = var34.getStatusEffects();
            var0 *= 1568704303;
            var0 ^= -239071193;
            long var3 = var0;
            long var5 = var3 + 1L;
            var5 = var3 * var5;
            long var7 = var3 + 2L;
            var5 *= var7;
            var3 += 3L;
            var5 *= var3;
            var3 = var5 & 7L;
            long var44;
            int var39 = (var44 = var3 - 0L) == 0L ? 0 : (var44 < 0L ? -1 : 1);
            if (var39 != 0) {
                RuntimeException var40 = new RuntimeException();
                throw var40;
            }

            var36 = var35;
            var0 >>= 22;
            var0 -= -566101645;
            var0 ^= 622837575;
            var0 ^= -286639664;
        }

        return (Collection)var36;
    }

    public static void j(boolean var0) {
        int var0i = var0 ? 1 : 0;
        label62: {
            SimpleOption var51;
            ParticlesMode var57;
            label61: {
                int var1 = h;
                var1 ^= 197448132;
                MinecraftClient var3 = zp();
                GameOptions var50 = var3.options;
                Integer var4 = Integer.valueOf(var0i);
                if (var4 == null) {
                    var1 >>= 28;
                    var1 >>>= 16;
                    var1 ^= 825905361;
                } else {
                    var1 *= -715305307;
                    var1 ^= 1308402452;
                    int var52 = var1 + 1;
                    int var53 = var1 * var52;
                    int var54 = var53 & 1;
                    if (var54 != 0) {
                        break label62;
                    }

                    var51 = var50.getParticles();
                    if (var0i != 0) {
                        var1 ^= -1976197805;
                        var1 ^= 694031926;
                        Integer var55 = var1;
                        if (var55 == null) {
                            break label62;
                        }

                        var57 = ParticlesMode.MINIMAL;
                        int var5 = var0i + 1;
                        var5 = var0i * var5;
                        int var6 = var0i + 2;
                        var5 *= var6;
                        var6 = var0i + 3;
                        var5 *= var6;
                        var5 &= 7;
                        if (var5 == 0) {
                            var1 += 1586945381;
                            var1 &= -2145706073;
                            var1 ^= 2011616663;
                            var57 = var57;
                            var1 += 843359476;
                            var1 ^= -213965051;
                            break label61;
                        }

                        switch (var1) {
                            case -1860130375:
                            default:
                                var1 ^= -860369339;
                                break;
                            case -279605181:
                                var1 -= 1365172386;
                                var1 += -376312824;
                                var1 <<= 15;
                                var1 ^= 2096025809;
                                break;
                            case 1834802475:
                                var1 ^= 1797739185;
                        }
                    } else {
                        var1 -= 2141318819;
                        var1 ^= -2090846213;
                        var1 &= -137222210;
                        var1 ^= -646428385;
                        Integer var62 = var1;
                        if (var62 == null) {
                            break label62;
                        }

                        ParticlesMode var63 = ParticlesMode.ALL;
                        Integer var2 = Integer.valueOf(var0i);
                        if (var2 != null) {
                            var1 = switch (var1) {
                                default -> var1 ^ 1115240458;
                                case -1633138137 -> {
                                    var1 += 1981353030;
                                    var1 |= 1220345372;
                                    var1 -= 271906294;
                                    var1 <<= 5;
                                    yield var1 ^ -40004791;
                                }
                                case -693209344 -> var1 ^ -868539744;
                            };
                            long var65 = var1;
                            long var8 = var65 + 1L;
                            var8 = var65 * var8;
                            long var10 = var65 + 2L;
                            var8 *= var10;
                            var65 += 3L;
                            var8 *= var65;
                            var65 = var8 & 7L;
                            long var71;
                            int var49 = (var71 = var65 - 0L) == 0L ? 0 : (var71 < 0L ? -1 : 1);
                            if (var49 != 0) {
                                break label62;
                            }

                            var57 = var63;
                            var1 *= -903505577;
                            var1 += 1091876986;
                            var1 ^= -901643772;
                            var1 &= -1632989741;
                            var1 ^= 1527537647;
                            break label61;
                        }

                        var1 *= 2002827329;
                        var1 ^= -1744041840;
                        var1 ^= -2070903898;
                    }
                }

                int var45 = var1 + 1;
                var45 = var1 * var45;
                var45 &= 1;
                if (var45 == 0) {
                    RuntimeException var48 = new RuntimeException();
                    throw var48;
                }
                break label62;
            }

            var51.setValue(var57);
            return;
        }

        UnsupportedOperationException var44 = new UnsupportedOperationException();
        throw var44;
    }

    public static List a() {
        int var0 = h;
        var0 ^= -490532614;
        RegistryEntry var1 = StatusEffects.SPEED;
        RegistryEntry var2 = StatusEffects.STRENGTH;
        StatusEffectInstance var3 = new StatusEffectInstance(var2, -1, 1);
        var0 &= 1888900031;
        var0 ^= -687099651;
        var0 -= -219494769;
        var0 ^= -324562420;
        Integer var9 = var0;
        if (var9 != null) {
            var2 = StatusEffects.FIRE_RESISTANCE;
            StatusEffectInstance var11 = new StatusEffectInstance(var2, 1320, 0);
            StatusEffectInstance var13 = new StatusEffectInstance(var1, 3840, 1);
            return List.of(var3, var11, var13);
        } else {
            AssertionError var10 = new AssertionError();
            throw var10;
        }
    }

    public static int ow(RegistryEntry var0, float[] var1) {
        MinecraftClient var221 = null;
        net.minecraft.client.texture.AtlasManager var222 = null;
        net.minecraft.client.texture.SpriteAtlasTexture var223 = null;
        net.minecraft.client.texture.Sprite var224 = null;
        net.minecraft.client.texture.Sprite var225 = null;
        Identifier var226 = null;
        net.minecraft.client.texture.AbstractTexture var227 = null;
        Identifier var234 = null;
        float var251 = 0.0f;
        float var255 = 0.0f;
        MinecraftClient var258 = null;
        net.minecraft.client.texture.TextureManager var259 = null;
        label230: {
            Throwable var5;
            label242: {
                int var41;
                try {
                    var41 = h;
                    var41 ^= -55898541;
                    Object var2 = null;
                    var41 -= 924681175;
                    var41 >>= 23;
                    var41 &= -1663604634;
                    var41 ^= 1244804383;
                } catch (RuntimeException var27) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var27);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var35 = var41;
                    if (var35 == null) {
                        break label230;
                    }
                    break label242;
                }

                Integer var4 = var41;
                if (var4 == null) {
                    break label230;
                }

                try {
                    var221 = zp();
                    var41 *= -100541453;
                    var41 ^= -1170044461;
                } catch (RuntimeException var26) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var26);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var47 = var41;
                    if (var47 == null) {
                        break label230;
                    }
                    break label242;
                }

                int var229 = var41 + 1;
                int var230 = var41 * var229;
                int var6 = var41 + 2;
                int var231 = var230 * var6;
                var6 = var41 + 3;
                int var232 = var231 * var6;
                int var233 = var232 & 7;
                if (var233 != 0) {
                    break label230;
                }

                try {
                    var222 = var221.getAtlasManager();
                } catch (RuntimeException var25) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var25);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var55 = var41;
                    if (var55 == null) {
                        break label230;
                    }
                    break label242;
                }
                var41 = switch (var41) {
                    case -1007616253 -> var41 ^ -1174934646;
                    case -676462670 -> {
                        var41 |= 1392957998;
                        var41 *= 2109548953;
                        yield var41 ^ -2096343816;
                    }
                    default -> var41 ^ -1808522995;
                };

                try {
                    var234 = Atlases.GUI;
                    var41 ^= -1468045949;
                    var41 >>= 12;
                    var41 ^= 1944244349;
                } catch (RuntimeException var24) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var24);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var64 = var41;
                    if (var64 == null) {
                        break label230;
                    }
                    break label242;
                }

                Integer var269 = var41;
                if (var269 == null) {
                    break label230;
                }

                try {
                    var223 = var222.getAtlasTexture(var234);
                    var41 ^= 603856816;
                    var41 |= 333855616;
                    var41 ^= 1673991941;
                } catch (RuntimeException var23) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var23);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var73 = var41;
                    if (var73 == null) {
                        break label230;
                    }
                    break label242;
                }

                int var235 = var41 + 1;
                int var236 = var41 * var235;
                int var270 = var41 + 2;
                int var237 = var236 * var270;
                var270 = var41 + 3;
                int var238 = var237 * var270;
                int var239 = var238 & 7;
                if (var239 != 0) {
                    break label230;
                }

                try {
                    Identifier var240 = InGameHud.getEffectTexture(var0);
                    var41 -= -1930756102;
                    var41 ^= 267228277;
                    var224 = var223.getSprite(var240);
                    var41 |= 1237199635;
                    var41 += 391945295;
                    var41 *= 1313073037;
                    var41 *= -1407589911;
                    var41 ^= -100220065;
                } catch (RuntimeException var22) {
                    var41 = h;
                    var41 ^= -45363199;
                    var5 = N(var22);
                    var41 *= 1967603309;
                    var41 &= -91911183;
                    var41 ^= 1783715929;
                    Integer var82 = var41;
                    if (var82 == null) {
                        break label230;
                    }
                    break label242;
                }

                Integer var241 = var41;
                if (var241 == null) {
                    break label230;
                }

                label243: {
                    try {
                        var225 = var224;
                        if (var224 == null) {
                            break label243;
                        }
                    } catch (RuntimeException var28) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var28);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var95 = var41;
                        if (var95 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    var41 &= 529655968;
                    var41 ^= 1226772430;
                    int var242 = var41 + 1;
                    int var243 = var41 * var242;
                    int var244 = var243 & 1;
                    if (var244 != 0) {
                        break label230;
                    }

                    try {
                        var41 >>>= 14;
                        var41 >>= 14;
                        var41 ^= 77837895;
                        float var245 = var225.getMinU();
                        var41 -= -1249852049;
                        var41 <<= 22;
                        var41 &= -670365702;
                        var41 ^= -1638504361;
                        var41 ^= 428086205;
                        var1[0] = var245;
                        var41 ^= -1265729875;
                        var41 ^= 420102662;
                    } catch (RuntimeException var21) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var21);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var103 = var41;
                        if (var103 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    int var246 = var41 + 1;
                    int var247 = var41 * var246;
                    var270 = var41 + 2;
                    int var248 = var247 * var270;
                    var270 = var41 + 3;
                    int var249 = var248 * var270;
                    int var250 = var249 & 7;
                    if (var250 != 0) {
                        break label230;
                    }

                    try {
                        var251 = var225.getMinV();
                    } catch (RuntimeException var20) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var20);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var119 = var41;
                        if (var119 == null) {
                            break label230;
                        }
                        break label242;
                    }
                    var41 = switch (var41) {
                        case 978732865 -> {
                            var41 >>>= 14;
                            var41 ^= -1910212355;
                            var41 ^= -2121017012;
                            var41 += -1377455734;
                            yield var41 ^ 1686259957;
                        }
                        case 1243634934 -> var41 ^ 2112830353;
                        default -> var41 ^ -659864921;
                    };
                    Integer var274 = var41;
                    if (var274 == null) {
                        break label230;
                    }

                    try {
                        var1[1] = var251;
                    } catch (RuntimeException var19) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var19);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var130 = var41;
                        if (var130 == null) {
                            break label230;
                        }
                        break label242;
                    }
                    var41 = switch (var41) {
                        case -1708631070 -> var41 ^ 1264651317;
                        case -652299641 -> {
                            var41 -= 952703889;
                            var41 *= -1771303171;
                            var41 &= 768824248;
                            var41 >>= 20;
                            yield var41 ^ -1568968351;
                        }
                        default -> var41 ^ -138039847;
                    };
                    long var252 = var41;
                    long var7 = var252 + 1L;
                    var7 = var252 * var7;
                    long var253 = var7 & 1L;
                    long var298;
                    int var254 = (var298 = var253 - 0L) == 0L ? 0 : (var298 < 0L ? -1 : 1);
                    if (var254 != 0) {
                        break label230;
                    }

                    try {
                        var255 = var225.getMaxU();
                        var41 += 1879917404;
                        var41 ^= -1917116879;
                    } catch (RuntimeException var18) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var18);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var141 = var41;
                        if (var141 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    long var275 = var41;
                    long var8 = var275 + 1L;
                    var8 = var275 * var8;
                    long var276 = var8 & 1L;
                    long var299;
                    int var277 = (var299 = var276 - 0L) == 0L ? 0 : (var299 < 0L ? -1 : 1);
                    if (var277 != 0) {
                        break label230;
                    }

                    try {
                        var1[2] = var255;
                        var41 -= -2139049645;
                        var41 |= -1066944325;
                        var41 ^= -637721736;
                        var41 -= -83211329;
                        var41 ^= -1056683837;
                        float var256 = var225.getMaxV();
                        var41 ^= 1525204933;
                        var41 ^= 735762802;
                        var41 ^= 737823510;
                        var41 += 81262961;
                        var41 ^= -1295435481;
                        var1[3] = var256;
                        var41 <<= 9;
                        var41 ^= 2125110406;
                    } catch (RuntimeException var17) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var17);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var149 = var41;
                        if (var149 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    Integer var257 = var41;
                    if (var257 == null) {
                        break label230;
                    }

                    try {
                        var258 = zp();
                    } catch (RuntimeException var16) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var16);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var167 = var41;
                        if (var167 == null) {
                            break label230;
                        }
                        break label242;
                    }
                    var41 = switch (var41) {
                        case -1512637306 -> {
                            var41 >>= 12;
                            var41 |= 703267426;
                            var41 ^= -1819176099;
                            var41 >>= 31;
                            yield var41 ^ 1964152422;
                        }
                        case 905403669 -> var41 ^ 257524805;
                        default -> var41 ^ -1706701164;
                    };
                    long var278 = var41;
                    var8 = var278 + 1L;
                    var8 = var278 * var8;
                    long var10 = var278 + 2L;
                    var8 *= var10;
                    long var279 = var278 + 3L;
                    var8 *= var279;
                    long var280 = var8 & 7L;
                    long var300;
                    var277 = (var300 = var280 - 0L) == 0L ? 0 : (var300 < 0L ? -1 : 1);
                    if (var277 != 0) {
                        break label230;
                    }

                    try {
                        var259 = var258.getTextureManager();
                        var41 |= 1650421290;
                        var41 -= -899770012;
                        var41 |= 1179009793;
                        var41 ^= -1279388937;
                    } catch (RuntimeException var15) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var15);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var178 = var41;
                        if (var178 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    var277 = var41 + 1;
                    var277 = var41 * var277;
                    var277 &= 1;
                    if (var277 != 0) {
                        break label230;
                    }

                    try {
                        var226 = var225.getAtlasId();
                        var41 *= -1422505751;
                        var41 ^= 68128529;
                    } catch (RuntimeException var14) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var14);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var188 = var41;
                        if (var188 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    var277 = var41 + 1;
                    var277 = var41 * var277;
                    var277 &= 1;
                    if (var277 != 0) {
                        break label230;
                    }

                    try {
                        var227 = var259.getTexture(var226);
                        var41 -= 1056729504;
                        var41 <<= 18;
                        var41 ^= -1454300047;
                        var41 &= 442144635;
                        var41 ^= 1775514068;
                    } catch (RuntimeException var13) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var13);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var196 = var41;
                        if (var196 == null) {
                            break label230;
                        }
                        break label242;
                    }

                    long var260 = var41;
                    var7 = var260 + 1L;
                    var7 = var260 * var7;
                    long var9 = var260 + 2L;
                    var7 *= var9;
                    long var261 = var260 + 3L;
                    var7 *= var261;
                    long var262 = var7 & 7L;
                    long var301;
                    int var263 = (var301 = var262 - 0L) == 0L ? 0 : (var301 < 0L ? -1 : 1);
                    if (var263 != 0) {
                        break label230;
                    }

                    try {
                        int var264 = var41 - 1518698086;
                        int var265 = var264 + 1975980060;
                        int var266 = var265 ^ -1500874417;
                        int var228 = CD(var227, var266);
                        var41 *= 1530006965;
                        var41 -= -1295625116;
                        var41 ^= -1892791877;
                        return var228;
                    } catch (RuntimeException var12) {
                        var41 = h;
                        var41 ^= -45363199;
                        var5 = N(var12);
                        var41 *= 1967603309;
                        var41 &= -91911183;
                        var41 ^= 1783715929;
                        Integer var207 = var41;
                        if (var207 == null) {
                            break label230;
                        }
                        break label242;
                    }
                }

                var41 &= -1776143825;
                var41 &= 364072844;
                var41 <<= 1;
                var41 ^= 1442794550;
                Integer var267 = var41;
                if (var267 != null) {
                    switch (var41) {
                        case -971392774:
                        default:
                            var41 ^= 1175476527;
                            break;
                        case 1572816958:
                            var41 *= 652412983;
                            var41 += 1534447049;
                            var41 &= 489950346;
                            var41 ^= -1915715367;
                            break;
                        case 1742043381:
                            var41 ^= -1152494960;
                    }

                    return 0;
                }
                break label230;
            }

            RuntimeException var29 = (RuntimeException)var5;
            return 0;
        }

        IllegalArgumentException var30 = new IllegalArgumentException();
        throw var30;
    }

    public static String kp(RegistryEntry var0) {
        int var1 = h;
        var1 ^= 796253950;
        int var2 = System.identityHashCode(var0);
        Integer var16 = var2;
        if (var16 == null) {
            var1 += 1923236247;
            var1 *= 2040358181;
            var1 ^= 671241213;
            IllegalStateException var19 = new IllegalStateException();
            throw var19;
        } else {
            var1 &= 170385026;
            var1 *= 413025065;
            var1 &= 546972619;
            var1 ^= -429550498;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            var1 = var17 & 1;
            if (var1 == 0) {
                Object var10 = var0.value();
                StatusEffect var11 = (StatusEffect)var10;
                Text var12 = var11.getName();
                return var12.getString();
            } else {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            }
        }
    }

    public static boolean JB(RegistryEntry var0) {
        int var1 = h;
        var1 ^= -50897148;
        int var2 = System.identityHashCode(var0);
        StatusEffect var3 = (StatusEffect)var0.value();
        var3 = (StatusEffect)var3;
        Integer var16 = var2;
        if (var16 != null) {
            var1 += 1363159919;
            var1 |= 642438854;
            var1 &= -721604834;
            var1 -= 169747605;
            var1 ^= 1495809529;
            int var17 = var1 + 1;
            var17 = var1 * var17;
            var17 &= 1;
            if (var17 == 0) {
                return var3.isBeneficial();
            }
        } else {
            var1 |= 1590130890;
            var1 += -997804539;
            var1 ^= 667671465;
            int var20 = var1 + 1;
            var20 = var1 * var20;
            var1 = var20 & 1;
            if (var1 == 0) {
                IllegalArgumentException var15 = new IllegalArgumentException();
                throw var15;
            }
        }

        IllegalStateException var14 = new IllegalStateException();
        throw var14;
    }

    public static void Z(float var0, Jn var1) {
        int var2 = h;
        var2 ^= -504435179;
        int var3 = (int)var0;
        MinecraftClient var4 = zp();
        ClientPlayerEntity var82 = var4.player;
        Integer var5 = var3;
        if (var5 == null) {
            var2 &= -415561967;
            var2 ^= -520277586;
        } else {
            label105: {
                var2 >>= 20;
                var2 |= -1747895358;
                var2 *= 554164281;
                var2 ^= -1939175135;
                if (var82 == null) {
                    var2 &= 927753894;
                    var2 ^= 2007690470;
                    long var89 = var2;
                    long var7 = var89 + 1L;
                    var7 = var89 * var7;
                    long var9 = var89 + 2L;
                    var7 *= var9;
                    long var90 = var89 + 3L;
                    var7 *= var90;
                    long var91 = var7 & 7L;
                    long var149;
                    int var92 = (var149 = var91 - 0L) == 0L ? 0 : (var149 < 0L ? -1 : 1);
                    if (var92 == 0) {
                        return;
                    }
                } else {
                    var2 = switch (var2) {
                        case 91665110 -> var2 ^ -2120195966;
                        case 554998838 -> {
                            var2 += -323274053;
                            var2 -= 202027099;
                            var2 &= -1671006888;
                            var2 &= -1065545534;
                            yield var2 ^ -663063600;
                        }
                        default -> var2 ^ 29461727;
                    };
                    ItemCooldownManager var83 = var82.getItemCooldownManager();
                    ItemCooldownsAccessor var84 = (ItemCooldownsAccessor)var83;
                    int var93 = var84.aura$tickCount();
                    float var94 = var93;
                    float var95 = var94 + var0;
                    float var96 = var95;
                    Map var85 = var84.aura$cooldowns();
                    long var6 = var3;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var150;
                    int var99 = (var150 = var6 - 0L) == 0L ? 0 : (var150 < 0L ? -1 : 1);
                    if (var99 != 0) {
                        switch (var2) {
                            case -1723616196:
                                var2 ^= 33009333;
                                break label105;
                            case -756279134:
                            default:
                                var2 ^= -1175979292;
                                break label105;
                            case -666995760:
                                var2 <<= 28;
                                var2 ^= 549860543;
                                break label105;
                        }
                    }

                    var2 &= 956054639;
                    var2 >>>= 9;
                    var2 ^= -901478757;
                    int var100 = var2 + 1;
                    int var101 = var2 * var100;
                    int var102 = var101 & 1;
                    if (var102 == 0) {
                        Set var86 = var85.entrySet();
                        Iterator var87 = var86.iterator();
                        Iterator var88 = var87;
                        var2 ^= -697304113;
                        var2 <<= 19;
                        var2 ^= -1248348559;
                        var2 ^= -165251850;

                        while (true) {
                            var6 = var2;
                            var8 = var6 + 1L;
                            var8 = var6 * var8;
                            var6 = var8 & 1L;
                            long var151;
                            int var105 = (var151 = var6 - 0L) == 0L ? 0 : (var151 < 0L ? -1 : 1);
                            if (var105 != 0) {
                                break;
                            }

                            boolean var106 = var88.hasNext();
                            int var114 = var3 + 1;
                            var114 = var3 * var114;
                            var114 &= 1;
                            if (var114 != 0) {
                                var2 += 898824599;
                                var2 &= -721386287;
                                var2 |= 597992030;
                                var2 ^= -2023583007;
                                break label105;
                            }

                            var2 <<= 21;
                            var2 &= 264709686;
                            var2 ^= 1805115741;
                            var2 -= 1549555713;
                            var2 ^= -2067466407;
                            Object var117 = var2;
                            if (var117 == null) {
                                break;
                            }

                            if (!var106) {
                                var2 |= 1483464765;
                                var2 &= 195260749;
                                var2 ^= -976352715;
                                return;
                            }

                            var2 &= 1769206612;
                            var2 *= -350987549;
                            var2 &= 975228493;
                            var2 |= -1206993155;
                            var2 ^= -1541069176;
                            Object var107 = var88.next();
                            Entry var108 = (Entry)var107;
                            var117 = var108.getValue();
                            CooldownInstanceAccessor var119 = (CooldownInstanceAccessor)var117;
                            int var129 = var119.aura$endTime();
                            float var130 = var129;
                            float var131 = var130 - var96;
                            long var132 = var3;
                            long var11 = var132 + 1L;
                            var11 = var132 * var11;
                            var132 = var11 & 1L;
                            long var152;
                            int var134 = (var152 = var132 - 0L) == 0L ? 0 : (var152 < 0L ? -1 : 1);
                            if (var134 != 0) {
                                var2 -= 672966560;
                                var2 *= 1241204875;
                                var2 &= 92836331;
                                var2 ^= 625915164;
                                break label105;
                            }

                            var2 += -157655059;
                            var2 <<= 11;
                            var2 |= 1663174988;
                            var2 ^= 1715478063;
                            float var153;
                            int var135 = (var153 = var131 - 0.0F) == 0.0F ? 0 : (var153 < 0.0F ? -1 : 1);
                            if (var135 > 0) {
                                var2 = switch (var2) {
                                    default -> var2 ^ -1206714994;
                                    case 161679203 -> {
                                        var2 *= 691405225;
                                        var2 &= -310630948;
                                        yield var2 ^ -901034314;
                                    }
                                    case 1509011325 -> var2 ^ -348622221;
                                };
                                var132 = var2;
                                var11 = var132 + 1L;
                                var11 = var132 * var11;
                                var132 = var11 & 1L;
                                long var154;
                                int var138 = (var154 = var132 - 0L) == 0L ? 0 : (var154 < 0L ? -1 : 1);
                                if (var138 != 0) {
                                    break;
                                }

                                Object var139 = var108.getKey();
                                Object var109 = var108.getKey();
                                int var140 = var2 >> 10;
                                int var141 = var140 ^ -874043841;
                                ItemStack var110 = Mu(var109, var141);
                                int var142 = var119.aura$endTime();
                                int var120 = var119.aura$startTime();
                                var120 = var142 - var120;
                                var120 = Math.max(1, var120);
                                int var143 = var3 + 1;
                                int var144 = var3 * var143;
                                int var145 = var144 & 1;
                                if (var145 != 0) {
                                    switch (var2) {
                                        case -1555869714:
                                            var2 *= 271253285;
                                            var2 ^= -2103268391;
                                            break label105;
                                        case -632102771:
                                        default:
                                            var2 ^= -965201855;
                                            break label105;
                                        case 1268268647:
                                            var2 ^= 747334492;
                                            break label105;
                                    }
                                }

                                var2 -= -85874161;
                                var2 ^= 551468850;
                                float var123 = var120;
                                var1.lq(var139, var110, var131, var123);
                                var2 -= -632531700;
                                var2 |= 746152130;
                                var2 += -1160000293;
                                var2 += -184880820;
                                var2 ^= -1126005255;
                            } else {
                                var2 *= -2050497633;
                                var2 >>>= 4;
                                var2 ^= -381938684;
                            }

                            var2 *= -1239243983;
                            var2 ^= -1806960124;
                        }
                    }
                }

                AssertionError var81 = new AssertionError();
                throw var81;
            }
        }

        IllegalStateException var80 = new IllegalStateException();
        throw var80;
    }

    public static void F(ItemStack var0, int var1) {
        int var2 = h;
        var2 ^= 1861428561;
        int var4 = System.identityHashCode(var0);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        var5 &= 1;
        label42:
        if (var5 == 0) {
            var2 += -1399030429;
            var2 ^= 814781130;
            var2 &= -2044129871;
            var2 ^= -2018047281;
            var5 = var1 + 1;
            var5 = var1 * var5;
            var5 &= 1;
            if (var5 == 0) {
                MinecraftClient var41 = zp();
                ClientPlayerEntity var42 = var41.player;
                if (var42 == null) {
                    var2 |= -1734907755;
                    var2 *= -460555303;
                    var2 |= 10801859;
                    var2 ^= 295984912;
                    int var6 = var1 + 1;
                    var6 = var1 * var6;
                    int var7 = var1 + 2;
                    var6 *= var7;
                    var7 = var1 + 3;
                    var6 *= var7;
                    var6 &= 7;
                    if (var6 == 0) {
                        return;
                    }
                } else {
                    var2 &= -16916499;
                    var2 ^= 230298977;
                    var2 ^= -589666895;
                    var2 ^= -1739386268;
                    int var48 = var1 + 1;
                    var48 = var1 * var48;
                    int var56 = var1 + 2;
                    var48 *= var56;
                    var56 = var1 + 3;
                    var48 *= var56;
                    var48 &= 7;
                    if (var48 == 0) {
                        ItemCooldownManager var43 = var42.getItemCooldownManager();
                        var48 = var4 + 1;
                        var48 = var4 * var48;
                        var4 = var48 & 1;
                        if (var4 != 0) {
                            var2 |= 607719077;
                            var2 += 1600231640;
                            var2 ^= -1033585373;
                            var2 ^= 1162431555;
                            break label42;
                        }

                        switch (var2) {
                            case -739355182:
                            default:
                                var2 ^= -748642245;
                                break;
                            case -70073882:
                                var2 ^= 257885658;
                                break;
                            case 1267100025:
                                var2 >>= 11;
                                var2 >>>= 16;
                                var2 ^= 764725043;
                        }

                        Integer var3 = var1;
                        if (var3 != null) {
                            var43.set(var0, var1);
                            return;
                        }
                    }
                }
            }

            RuntimeException var34 = new RuntimeException();
            throw var34;
        } else {
            var2 &= -668283728;
            var2 -= -1019618097;
            var2 ^= -857415948;
        }

        IllegalStateException var33 = new IllegalStateException();
        throw var33;
    }

    private static ItemStack Mu(Object var0, int var1) {
        int var3 = System.identityHashCode(var0);
        Map var4 = mh;
        Integer var20 = var3;
        if (var20 == null) {
            int var15 = var1 - -785065365;
            var15 >>>= 4;
            var15 += -473652952;
            var15 *= 1460105081;
            var15 ^= 699863554;
            AssertionError var21 = new AssertionError();
            throw var21;
        } else {
            int var2 = var1 << 26;
            var2 += 176000765;
            var2 ^= 623104497;
            long var9 = var2;
            long var5 = var9 + 1L;
            var5 = var9 * var5;
            long var10 = var5 & 1L;
            long var23;
            var2 = (var23 = var10 - 0L) == 0L ? 0 : (var23 < 0L ? -1 : 1);
            if (var2 == 0) {
                Function var13 = var0x -> {
                    label113: {
                        int var1x = h;
                        var1x ^= 1828383735;
                        int var2x = System.identityHashCode(var0x);
                        int var3x = (var0x instanceof Identifier) ? 1 : 0;
                        int var4x = var2x + 1;
                        var4x = var2x * var4x;
                        int var5x = var2x + 2;
                        var4x *= var5x;
                        var5x = var2x + 3;
                        var4x *= var5x;
                        var4x &= 7;
                        if (var4x != 0) {
                            var1x *= -248979623;
                            var1x &= 843379865;
                            var1x ^= -1003821331;
                        } else {
                            label128: {
                                var1x = switch (var1x) {
                                    case -2113335312 -> var1x ^ 1629905363;
                                    default -> var1x ^ 975403387;
                                    case 1307564281 -> {
                                        var1x += -1677297354;
                                        yield var1x ^ -767239121;
                                    }
                                };
                                Item var89;
                                if (var3x != 0) {
                                    var1x >>= 29;
                                    var1x ^= 1561513662;
                                    long var83 = var1x;
                                    long var118 = var83 + 1L;
                                    long var119 = var83 * var118;
                                    long var84 = var119 & 1L;
                                    long var143;
                                    var3x = (var143 = var84 - 0L) == 0L ? 0 : (var143 < 0L ? -1 : 1);
                                    if (var3x != 0) {
                                        break label113;
                                    }

                                    Identifier var86 = (Identifier)var0x;
                                    var4x = var2x + 1;
                                    var4x = var2x * var4x;
                                    var4x &= 1;
                                    if (var4x != 0) {
                                        var1x *= -1047068315;
                                        var1x += -344552201;
                                        var1x &= -1892793756;
                                        var1x ^= 1583542844;
                                        break label128;
                                    }

                                    var1x += 519947295;
                                    var1x *= -955443625;
                                    var1x ^= 780437055;
                                    Integer var97 = var1x;
                                    if (var97 == null) {
                                        break label113;
                                    }

                                    DefaultedRegistry var98 = Registries.ITEM;
                                    Object var87 = var98.get(var86);
                                    Item var88 = (Item)var87;
                                    var89 = var88;
                                    var1x |= 1048085607;
                                    var1x += 173457925;
                                    var1x += 1690978056;
                                    var1x ^= 1041187789;
                                } else {
                                    var1x -= 485383317;
                                    var1x <<= 27;
                                    var1x ^= 1516972600;
                                    var1x ^= -1065044701;
                                    var4x = var1x + 1;
                                    var4x = var1x * var4x;
                                    var4x &= 1;
                                    if (var4x != 0) {
                                        break label113;
                                    }

                                    var89 = null;
                                    var1x &= -1232395838;
                                    var1x |= 299182407;
                                    var1x ^= -2092145930;
                                }

                                var4x = var1x + 1;
                                var4x = var1x * var4x;
                                var5x = var1x + 2;
                                var4x *= var5x;
                                var5x = var1x + 3;
                                var4x *= var5x;
                                var4x &= 7;
                                if (var4x != 0) {
                                    break label113;
                                }

                                long var107 = var2x;
                                long var6 = var107 + 1L;
                                var6 = var107 * var6;
                                long var108 = var6 & 1L;
                                long var144;
                                var4x = (var144 = var108 - 0L) == 0L ? 0 : (var144 < 0L ? -1 : 1);
                                if (var4x != 0) {
                                    var1x &= -1111893741;
                                    var1x >>>= 14;
                                    var1x &= 1318217139;
                                    var1x += 2010808096;
                                    var1x ^= -1582297763;
                                } else {
                                    label117: {
                                        var1x |= 1962285347;
                                        var1x += -727611367;
                                        var1x &= 1322878438;
                                        var1x *= 68020389;
                                        var1x ^= -1346516246;
                                        long var110 = var1x;
                                        var6 = var110 + 1L;
                                        var6 = var110 * var6;
                                        long var8x = var110 + 2L;
                                        var6 *= var8x;
                                        long var111 = var110 + 3L;
                                        var6 *= var111;
                                        long var112 = var6 & 7L;
                                        long var145;
                                        var4x = (var145 = var112 - 0L) == 0L ? 0 : (var145 < 0L ? -1 : 1);
                                        if (var4x != 0) {
                                            break label113;
                                        }

                                        ItemStack var116;
                                        if (var89 == null) {
                                            var1x = switch (var1x) {
                                                case 157583806 -> {
                                                    var1x *= 1608349639;
                                                    var1x += 1955292636;
                                                    var1x ^= -1903345073;
                                                    var1x >>>= 27;
                                                    yield var1x ^ 1573788981;
                                                }
                                                case 1214018452 -> var1x ^ -735493819;
                                                default -> var1x ^ -1107085302;
                                            };
                                            Integer var114 = var1x;
                                            if (var114 == null) {
                                                break label113;
                                            }

                                            ItemStack var115 = ItemStack.EMPTY;
                                            Integer var122 = var2x;
                                            if (var122 == null) {
                                                switch (var1x) {
                                                    case 484752988:
                                                    default:
                                                        var1x ^= -572365604;
                                                        break label117;
                                                    case 1272891299:
                                                        var1x ^= 1650083645;
                                                        break label117;
                                                    case 1573788985:
                                                        var1x |= -981492851;
                                                        var1x += 337514284;
                                                        var1x ^= 611785877;
                                                        break label117;
                                                }
                                            }
                                            var1x = switch (var1x) {
                                                case -33192812 -> var1x ^ -1785528938;
                                                default -> var1x ^ -1896247117;
                                                case 1573788985 -> {
                                                    var1x |= -1574382787;
                                                    yield var1x ^ 1203724958;
                                                }
                                            };
                                            var122 = var1x;
                                            if (var122 == null) {
                                                break label113;
                                            }

                                            var116 = var115;
                                            var1x |= 701842916;
                                            var1x |= -1202105920;
                                            var1x ^= 1171151740;
                                        } else {
                                            var1x = switch (var1x) {
                                                default -> var1x ^ 1322270315;
                                                case 157583806 -> {
                                                    var1x ^= 1577237741;
                                                    var1x *= -275226307;
                                                    var1x -= -667001229;
                                                    var1x &= 1436358083;
                                                    yield var1x ^ -1517171401;
                                                }
                                                case 659581000 -> var1x ^ 998321748;
                                            };
                                            var5x = var1x + 1;
                                            var5x = var1x * var5x;
                                            int var139 = var1x + 2;
                                            var5x *= var139;
                                            int var140 = var1x + 3;
                                            var5x *= var140;
                                            var5x &= 7;
                                            if (var5x != 0) {
                                                break label113;
                                            }

                                            ItemStack var129 = new ItemStack(var89);
                                            long var76 = var2x;
                                            var6 = var76 + 1L;
                                            var6 = var76 * var6;
                                            long var77 = var6 & 1L;
                                            long var146;
                                            var2x = (var146 = var77 - 0L) == 0L ? 0 : (var146 < 0L ? -1 : 1);
                                            if (var2x != 0) {
                                                var1x *= 1904341877;
                                                var1x ^= -1293101793;
                                                break label117;
                                            }

                                            var1x += 1578923174;
                                            var1x ^= -1677249367;
                                            var1x >>>= 25;
                                            var1x ^= -907875533;
                                            var116 = var129;
                                            var1x ^= -1933630817;
                                            var1x += -608414429;
                                            var1x *= 1276890547;
                                            var1x ^= 120688881;
                                        }

                                        long var79 = var1x;
                                        long var130 = var79 + 1L;
                                        long var131 = var79 * var130;
                                        long var7x = var79 + 2L;
                                        long var132 = var131 * var7x;
                                        long var80 = var79 + 3L;
                                        long var133 = var132 * var80;
                                        long var81 = var133 & 7L;
                                        long var147;
                                        var2x = (var147 = var81 - 0L) == 0L ? 0 : (var147 < 0L ? -1 : 1);
                                        if (var2x == 0) {
                                            return var116;
                                        }
                                        break label113;
                                    }
                                }
                            }
                        }

                        RuntimeException var74 = new RuntimeException();
                        throw var74;
                    }

                    IllegalArgumentException var75 = new IllegalArgumentException();
                    throw var75;
                };
                Object var14 = var4.computeIfAbsent(var0, var13);
                return (ItemStack)var14;
            } else {
                RuntimeException var12 = new RuntimeException();
                throw var12;
            }
        }
    }

    public static ItemStack[] vM() {
        int var0 = h;
        var0 ^= 1649322476;
        ItemStack[] var1 = new ItemStack[2];
        Item var3 = Items.ENDER_PEARL;
        ItemStack var2 = new ItemStack(var3);
        var0 ^= -1882563557;
        var0 <<= 23;
        var0 |= 897879175;
        var0 &= 481147689;
        var0 ^= 1811618876;
        var1[0] = var2;
        Item var11 = Items.WIND_CHARGE;
        ItemStack var10 = new ItemStack(var11);
        var1[1] = var10;
        return var1;
    }

    public static void wB(LivingEntity var0, ItemStack[] var1) {
        label63: {
            int var2 = h;
            var2 ^= -1492775400;
            int var3 = System.identityHashCode(var0);
            ItemStack var4 = var0.getMainHandStack();
            var1[0] = var4;
            long var54 = var3;
            long var6 = var54 + 1L;
            var6 = var54 * var6;
            long var8 = var54 + 2L;
            var6 *= var8;
            long var55 = var54 + 3L;
            var6 *= var55;
            long var56 = var6 & 7L;
            long var94;
            int var57 = (var94 = var56 - 0L) == 0L ? 0 : (var94 < 0L ? -1 : 1);
            if (var57 != 0) {
                switch (var2) {
                    case -2045559530:
                        var2 += 2121002564;
                        var2 ^= -1519885337;
                        break;
                    case -1828705443:
                    default:
                        var2 ^= -515273643;
                        break;
                    case -661406805:
                        var2 ^= -1838282018;
                }
            } else {
                var2 |= 99650485;
                var2 ^= 809749802;
                byte var58 = 0;
                int var59 = var58;
                var2 *= -656756531;
                var2 >>= 8;
                var2 *= -556841789;
                var2 ^= -1573953219;

                while (true) {
                    EquipmentSlot[] var5 = F;
                    var6 = var3;
                    var8 = var6 + 1L;
                    var8 = var6 * var8;
                    long var10 = var6 + 2L;
                    var8 *= var10;
                    var6 += 3L;
                    var8 *= var6;
                    var6 = var8 & 7L;
                    long var95;
                    int var74 = (var95 = var6 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
                    if (var74 != 0) {
                        var2 *= -1883728097;
                        var2 ^= -1049033020;
                        var2 &= -1668567205;
                        var2 ^= -1189649931;
                        break;
                    }

                    var2 -= -910124729;
                    var2 ^= 620784717;
                    Integer var75 = var2;
                    if (var75 == null) {
                        break label63;
                    }

                    int var63 = var5.length;
                    if (var59 >= var63) {
                        var2 |= -517732536;
                        var2 ^= 1945655817;
                        Integer var60 = var2;
                        if (var60 == null) {
                            break label63;
                        }

                        var4 = var0.getOffHandStack();
                        long var66 = var3;
                        long var88 = var66 + 1L;
                        var88 = var66 * var88;
                        long var67 = var88 & 1L;
                        long var96;
                        var3 = (var96 = var67 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            var2 += -1928608555;
                            var2 ^= -672007799;
                            var1[5] = var4;
                            return;
                        }

                        var2 ^= -934004360;
                        var2 *= 902145331;
                        var2 ^= -1318970038;
                        break;
                    }

                    var2 -= 853679758;
                    var2 <<= 27;
                    var2 += 1310997324;
                    var2 -= -1545005720;
                    var2 ^= 307674862;
                    int var64 = 1 + var59;
                    EquipmentSlot[] var76 = F;
                    EquipmentSlot var77 = var76[var59];
                    ItemStack var78 = var0.getEquippedStack(var77);
                    var1[var64] = var78;
                    int var65 = var59 + 1;
                    int var79 = var3 + 1;
                    int var80 = var3 * var79;
                    int var7 = var3 + 2;
                    int var81 = var80 * var7;
                    var7 = var3 + 3;
                    int var82 = var81 * var7;
                    int var83 = var82 & 7;
                    if (var83 != 0) {
                        var2 &= 1641398778;
                        var2 ^= -1588409929;
                        break;
                    }

                    var2 ^= -782569699;
                    var2 += 1166374768;
                    var2 -= -690144953;
                    var2 ^= 48212208;
                    int var84 = var2 + 1;
                    int var85 = var2 * var84;
                    int var86 = var85 & 1;
                    if (var86 != 0) {
                        break label63;
                    }

                    var59 = var65;
                    var2 &= 1399807515;
                    var2 -= 395158290;
                    var2 &= -1701206423;
                    var2 ^= -1800403664;
                }
            }

            var3 = var2 + 1;
            var3 = var2 * var3;
            int var62 = var2 + 2;
            var3 *= var62;
            var2 += 3;
            var3 *= var2;
            var2 = var3 & 7;
            if (var2 == 0) {
                RuntimeException var48 = new RuntimeException();
                throw var48;
            }
        }

        AssertionError var47 = new AssertionError();
        throw var47;
    }

    public static boolean lJ(Entity var0) {
        int var1 = h;
        var1 ^= 1167970287;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 == 0) {
            var1 = switch (var1) {
                default -> var1 ^ 690797304;
                case 1686699233 -> {
                    var1 &= 129959812;
                    var1 += -1551847996;
                    var1 += 1146227503;
                    var1 |= -889866217;
                    yield var1 ^ -1244911559;
                }
                case 1883585081 -> var1 ^ 967007871;
            };
            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                return var0 instanceof Monster;
            }
        } else {
            var1 -= -1753287840;
            var1 ^= 811184132;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var1 = var2 & 1;
            if (var1 == 0) {
                AssertionError var14 = new AssertionError();
                throw var14;
            }
        }

        UnsupportedOperationException var13 = new UnsupportedOperationException();
        throw var13;
    }

    public static boolean Jr(Entity var0) {
        int var1 = h;
        var1 ^= -1789704366;
        int var2 = System.identityHashCode(var0);
        long var19 = var2;
        long var4 = var19 + 1L;
        var4 = var19 * var4;
        long var6 = var19 + 2L;
        var4 *= var6;
        long var20 = var19 + 3L;
        var4 *= var20;
        long var21 = var4 & 7L;
        long var26;
        var2 = (var26 = var21 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
        if (var2 == 0) {
            var1 *= -1076842581;
            var1 |= -1446334408;
            var1 ^= -1608158270;
            var1 &= 875367475;
            var1 ^= -752677527;
            return var0 instanceof PlayerEntity;
        } else {
            var1 &= -1379570113;
            var1 ^= -108238547;
            Integer var11 = var1;
            if (var11 == null) {
                RuntimeException var13 = new RuntimeException();
                throw var13;
            } else {
                UnsupportedOperationException var12 = new UnsupportedOperationException();
                throw var12;
            }
        }
    }

    public static String Wb(ItemStack var0) {
        int var1 = h;
        var1 ^= 1372666007;
        int var2 = System.identityHashCode(var0);
        Integer var14 = var2;
        if (var14 != null) {
            var1 -= -793383018;
            var1 ^= 265970419;
            Text var15 = var0.getName();
            return var15.getString();
        } else {
            switch (var1) {
                case -391082154:
                    var1 ^= 269915208;
                    break;
                case 25658256:
                default:
                    var1 ^= -2028441423;
                    break;
                case 1891896217:
                    var1 *= -1687044849;
                    var1 >>>= 10;
                    var1 |= 1922555261;
                    var1 &= 674749224;
                    var1 ^= 526418963;
            }

            UnsupportedOperationException var11 = new UnsupportedOperationException();
            throw var11;
        }
    }

    public static void cX(Object var0, ItemStack var1, float var2, float var3, float var4) {
        int var5 = h;
        var5 ^= -1530213076;
        int var6 = System.identityHashCode(var0);
        long var7 = var6;
        long var9 = var7 + 1L;
        var9 = var7 * var9;
        long var11 = var7 + 2L;
        var9 *= var11;
        var7 += 3L;
        var9 *= var7;
        var7 = var9 & 7L;
        long var97;
        int var60 = (var97 = var7 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
        if (var60 != 0) {
            var5 += -566000156;
            var5 ^= 1556735054;
        } else {
            label69: {
                var5 *= 1299845055;
                var5 |= 1821571587;
                var5 *= 2116683221;
                var5 ^= 60053462;
                Integer var61 = var5;
                label58:
                if (var61 != null) {
                    if (var1 != null) {
                        var5 >>= 29;
                        var5 &= -705979639;
                        var5 ^= 742687341;
                        var5 >>>= 15;
                        var5 ^= 1628729726;
                        var7 = var5;
                        var9 = var7 + 1L;
                        var9 = var7 * var9;
                        var11 = var7 + 2L;
                        var9 *= var11;
                        var7 += 3L;
                        var9 *= var7;
                        var7 = var9 & 7L;
                        long var98;
                        int var65 = (var98 = var7 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                        if (var65 != 0) {
                            break label58;
                        }

                        boolean var66 = var1.isEmpty();
                        int var8 = var6 + 1;
                        var8 = var6 * var8;
                        var8 &= 1;
                        if (var8 != 0) {
                            var5 += -718699719;
                            var5 |= -1786068702;
                            var5 *= -2113486539;
                            var5 += -239460855;
                            var5 ^= -1717662933;
                            break label69;
                        }

                        var5 -= -325944178;
                        var5 -= -142319523;
                        var5 ^= 967349442;
                        if (!var66) {
                            var5 += 157427111;
                            var5 ^= 801996692;
                            Integer var67 = var5;
                            if (var67 != null) {
                                DrawContext var68 = (DrawContext)var0;
                                Matrix3x2fStack var71 = var68.getMatrices();
                                Matrix3x2fStack var72 = var71.pushMatrix();
                                Matrix3x2fStack var73 = var68.getMatrices();
                                Matrix3x2f var74 = var73.translate(var2, var3);
                                Matrix3x2fStack var75 = var68.getMatrices();
                                var9 = var6;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                var9 = var11 & 1L;
                                long var99;
                                var6 = (var99 = var9 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                                if (var6 != 0) {
                                    var5 -= 543863232;
                                    var5 <<= 15;
                                    var5 ^= -545595320;
                                    break label69;
                                }

                                var5 ^= 391036496;
                                var5 ^= -1484422552;
                                var5 |= -1277944642;
                                var5 |= -1985255778;
                                var5 ^= 252456217;
                                var9 = var5;
                                var11 = var9 + 1L;
                                var11 = var9 * var11;
                                long var13 = var9 + 2L;
                                var11 *= var13;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var100;
                                var6 = (var100 = var9 - 0L) == 0L ? 0 : (var100 < 0L ? -1 : 1);
                                if (var6 == 0) {
                                    Matrix3x2f var51 = var75.scale(var4, var4);
                                    var68.drawItem(var1, 0, 0);
                                    Matrix3x2fStack var52 = var68.getMatrices();
                                    Matrix3x2fStack var53 = var52.popMatrix();
                                    return;
                                }
                            }
                            break label58;
                        }

                        var5 *= 357815101;
                        var5 ^= 1194367662;
                    } else {
                        switch (var5) {
                            case -1238416109:
                                var5 ^= 981953655;
                                break;
                            case 1428838109:
                                var5 += 2103635086;
                                var5 ^= 1585342931;
                                break;
                            case 1874276653:
                            default:
                                var5 ^= -1637695648;
                        }
                    }

                    long var54 = var5;
                    long var76 = var54 + 1L;
                    var76 = var54 * var76;
                    long var55 = var76 & 1L;
                    long var101;
                    var6 = (var101 = var55 - 0L) == 0L ? 0 : (var101 < 0L ? -1 : 1);
                    if (var6 == 0) {
                        return;
                    }
                }

                IllegalStateException var57 = new IllegalStateException();
                throw var57;
            }
        }

        UnsupportedOperationException var48 = new UnsupportedOperationException();
        throw var48;
    }

    public static void Sf(Object var0, float var1, float var2) {
        int var3 = h;
        var3 ^= -1404128492;
        int var4 = System.identityHashCode(var0);
        DrawContext var5 = (DrawContext)var0;
        Matrix3x2fStack var6 = var5.getMatrices();
        var6 = var6.pushMatrix();
        Matrix3x2fStack var20 = var5.getMatrices();
        int var22 = var4 + 1;
        int var23 = var4 * var22;
        int var7 = var4 + 2;
        int var24 = var23 * var7;
        var4 += 3;
        int var25 = var24 * var4;
        var4 = var25 & 7;
        if (var4 != 0) {
            var3 <<= 12;
            var3 += 850129930;
            var3 ^= -1770266074;
            IllegalArgumentException var19 = new IllegalArgumentException();
            throw var19;
        } else {
            var3 -= -1256383875;
            var3 >>>= 24;
            var3 *= 27416181;
            var3 ^= -1852530709;
            Matrix3x2f var13 = var20.translate(var1, var2);
        }
    }

    public static void mB(Object var0) {
        int var1 = h;
        var1 ^= 1001555794;
        int var2 = System.identityHashCode(var0);
        Integer var17 = var2;
        if (var17 == null) {
            switch (var1) {
                case -226851821:
                    var1 ^= 277416359;
                    break;
                case 447198300:
                    var1 <<= 30;
                    var1 *= 1554742367;
                    var1 &= -1035019718;
                    var1 ^= 1454069968;
                    break;
                case 815663897:
                default:
                    var1 ^= -287422801;
            }

            IllegalStateException var18 = new IllegalStateException();
            throw var18;
        } else {
            var1 *= -1392975121;
            var1 ^= -103184352;
            var1 += 1350389019;
            var1 ^= -1717542665;
            DrawContext var8 = (DrawContext)var0;
            Matrix3x2fStack var9 = var8.getMatrices();
            Matrix3x2fStack var10 = var9.popMatrix();
        }
    }

    public static boolean NE() {
        int var0 = h;
        var0 ^= 525079227;
        MinecraftClient var1 = zp();
        GameOptions var8 = var1.options;
        KeyBinding var9 = var8.playerListKey;
        switch (var0) {
            case -818903312:
            default:
                var0 ^= -569650438;
                break;
            case 301600076:
                var0 ^= -492614339;
                break;
            case 1046028725:
                var0 ^= 1698338620;
                var0 ^= -375691105;
                var0 ^= 291223856;
        }

        return var9.isPressed();
    }

    public static void zf(String var0, float var1, float var2, HP var3) {
        label70: {
            int var4 = h;
            var4 ^= 1640084610;
            int var5 = System.identityHashCode(var0);
            Map var6 = Jq;
            Function var7 = var0x -> {
                int var1x = h;
                var1x ^= 381643124;
                int var2x = System.identityHashCode(var0x);
                Integer var14x = var2x;
                if (var14x == null) {
                    var1x *= -2093512485;
                    var1x |= -730182805;
                    var1x |= -1775984563;
                    var1x ^= 832930461;
                    IllegalArgumentException var15 = new IllegalArgumentException();
                    throw var15;
                } else {
                    var1x ^= -1325986638;
                    var1x |= 524923399;
                    var1x ^= -1993352997;
                    Integer var7x = var1x;
                    if (var7x != null) {
                        Identifier var9x = Identifier.of((String)var0x);
                        return SoundEvent.of(var9x);
                    } else {
                        IllegalArgumentException var8x = new IllegalArgumentException();
                        throw var8x;
                    }
                }
            };
            Object var57 = var6.computeIfAbsent(var0, var7);
            var57 = (SoundEvent)var57;
            Integer var62 = var5;
            if (var62 == null) {
                var4 |= -736959558;
                var4 ^= 1132039234;
                var4 ^= -317617047;
            } else {
                label72: {
                    var4 &= 926916184;
                    var4 >>= 28;
                    var4 &= -1051682123;
                    var4 ^= -463798296;
                    int var63 = var4 + 1;
                    int var64 = var4 * var63;
                    int var65 = var64 & 1;
                    if (var65 != 0) {
                        break label70;
                    }

                    boolean var66 = var3.positional();
                    PositionedSoundInstance var72;
                    if (var66) {
                        var4 &= 1938838447;
                        var4 ^= 1784452499;
                        long var67 = var4;
                        long var9 = var67 + 1L;
                        var9 = var67 * var9;
                        long var11 = var67 + 2L;
                        var9 *= var11;
                        long var68 = var67 + 3L;
                        var9 *= var68;
                        long var69 = var9 & 7L;
                        long var97;
                        int var70 = (var97 = var69 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                        if (var70 != 0) {
                            break label70;
                        }

                        SoundCategory var8 = SoundCategory.PLAYERS;
                        Random var89 = Random.create();
                        double var10 = var3.x();
                        double var12 = var3.y();
                        double var14 = var3.z();
                        PositionedSoundInstance var71 = new PositionedSoundInstance((SoundEvent)var57, var8, var1, var2, var89, var10, var12, var14);
                        int var74 = var5 + 1;
                        int var75 = var5 * var74;
                        int var76 = var75 & 1;
                        if (var76 != 0) {
                            var4 >>>= 8;
                            var4 ^= -1049886055;
                            var4 ^= -1143428662;
                            break label72;
                        }

                        var4 ^= 109041632;
                        var4 ^= -1497979920;
                        var72 = var71;
                        var4 -= 586942630;
                        var4 ^= -1285667805;
                        var4 ^= 1996995609;
                    } else {
                        var4 >>>= 18;
                        var4 *= 281842551;
                        var4 &= -1802984625;
                        var4 ^= 733225708;
                        var4 ^= 722481376;
                        long var77 = var4;
                        long var90 = var77 + 1L;
                        var90 = var77 * var90;
                        long var96 = var77 + 2L;
                        var90 *= var96;
                        var77 += 3L;
                        var90 *= var77;
                        var77 = var90 & 7L;
                        long var98;
                        int var80 = (var98 = var77 - 0L) == 0L ? 0 : (var98 < 0L ? -1 : 1);
                        if (var80 != 0) {
                            break label70;
                        }

                        var57 = PositionedSoundInstance.ui((SoundEvent)var57, var2, var1);
                        Integer var81 = var5;
                        if (var81 == null) {
                            switch (var4) {
                                case -1825584506:
                                default:
                                    var4 ^= 1175423927;
                                    break label72;
                                case -1800654586:
                                    var4 -= 1367375111;
                                    var4 |= 109969574;
                                    var4 ^= 1024545898;
                                    break label72;
                                case 978361844:
                                    var4 ^= -1923238860;
                                    break label72;
                            }
                        }

                        var4 |= -186678252;
                        var4 ^= 1523975361;
                        var72 = (PositionedSoundInstance)var57;
                        var4 ^= 145272819;
                        var4 ^= -447656037;
                    }

                    var57 = var4;
                    if (var57 == null) {
                        break label70;
                    }

                    MinecraftClient var73 = zp();
                    int var82 = var5 + 1;
                    var82 = var5 * var82;
                    var5 = var82 & 1;
                    if (var5 == 0) {
                        var4 -= 123021025;
                        var4 -= 1945569620;
                        var4 ^= -1989852301;
                        long var84 = var4;
                        long var94 = var84 + 1L;
                        var94 = var84 * var94;
                        long var85 = var94 & 1L;
                        long var99;
                        var5 = (var99 = var85 - 0L) == 0L ? 0 : (var99 < 0L ? -1 : 1);
                        if (var5 == 0) {
                            SoundManager var55 = var73.getSoundManager();
                            PlayResult var56 = var55.play(var72);
                            return;
                        }
                        break label70;
                    }

                    switch (var4) {
                        case 99741907:
                            var4 ^= 1711650420;
                            break;
                        case 1137725887:
                            var4 >>= 4;
                            var4 += 42318987;
                            var4 += -1991466630;
                            var4 &= 515998189;
                            var4 ^= 1790961333;
                            break;
                        case 1782078003:
                        default:
                            var4 ^= 175480912;
                    }
                }
            }

            Integer var50 = var4;
            if (var50 != null) {
                AssertionError var51 = new AssertionError();
                throw var51;
            }
        }

        AssertionError var52 = new AssertionError();
        throw var52;
    }

    public static String tS(SoundInstance var0) {
        int var1 = h;
        var1 ^= -1980902003;
        int var2 = System.identityHashCode(var0);
        long var21 = var2;
        long var4 = var21 + 1L;
        var4 = var21 * var4;
        long var22 = var4 & 1L;
        long var30;
        var2 = (var30 = var22 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var2 == 0) {
            switch (var1) {
                case -1460083069:
                    var1 <<= 29;
                    var1 -= 1447581657;
                    var1 ^= 1297187944;
                    break;
                case -1416578242:
                default:
                    var1 ^= 330733497;
                    break;
                case 364498892:
                    var1 ^= 1083085936;
            }

            Object var28 = mq(var0);
            return var28.toString();
        } else {
            var1 += 1171087461;
            var1 += -969758752;
            var1 |= 821793820;
            var1 -= 564190229;
            var1 ^= 1321602532;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var3 = var1 + 2;
            var2 *= var3;
            var1 += 3;
            var2 *= var1;
            var1 = var2 & 7;
            if (var1 != 0) {
                AssertionError var15 = new AssertionError();
                throw var15;
            } else {
                UnsupportedOperationException var14 = new UnsupportedOperationException();
                throw var14;
            }
        }
    }

    public static Object mq(SoundInstance var0) {
        int var1 = h;
        var1 ^= -9695994;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        int var4 = var2 + 2;
        var3 *= var4;
        var2 += 3;
        var3 *= var2;
        var2 = var3 & 7;
        if (var2 == 0) {
            var1 -= 1409911452;
            var1 ^= -1709235071;
            var2 = var1 + 1;
            var2 = var1 * var2;
            var2 &= 1;
            if (var2 == 0) {
                return var0.getId();
            } else {
                RuntimeException var18 = new RuntimeException();
                throw var18;
            }
        } else {
            var1 ^= -1518346518;
            var1 += 1555985519;
            var1 ^= 246014954;
            var1 ^= 1791557764;
            IllegalArgumentException var10 = new IllegalArgumentException();
            throw var10;
        }
    }

    public static boolean v(String var0) {
        int var1 = h;
        var1 ^= 1647846854;
        int var2 = System.identityHashCode(var0);
        MinecraftClient var3 = zp();
        SoundManager var40 = var3.getSoundManager();
        long var4 = var2;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        var4 = var6 & 1L;
        long var52;
        var2 = (var52 = var4 - 0L) == 0L ? 0 : (var52 < 0L ? -1 : 1);
        if (var2 != 0) {
            var1 &= 192794114;
            var1 ^= -1616644571;
            var1 &= -1622624225;
            var1 ^= 767486234;
            var2 = var1 + 1;
            var2 = var1 * var2;
            int var46 = var1 + 2;
            var2 *= var46;
            int var47 = var1 + 3;
            var2 *= var47;
            var2 &= 7;
            if (var2 == 0) {
                IllegalStateException var35 = new IllegalStateException();
                throw var35;
            }
        } else {
            label49: {
                var1 = switch (var1) {
                    case 82998338 -> var1 ^ 1185165403;
                    default -> var1 ^ -1046140852;
                    case 1127028424 -> {
                        var1 -= -1915926704;
                        var1 -= -1961735607;
                        var1 += -987318914;
                        yield var1 ^ 785845479;
                    }
                };
                Identifier var36 = Identifier.of(var0);
                WeightedSoundSet var37 = var40.get(var36);
                boolean var39;
                if (var37 != null) {
                    var1 <<= 20;
                    var1 -= -1665784583;
                    var1 ^= -1613838865;
                    Integer var38 = var1;
                    if (var38 == null) {
                        break label49;
                    }

                    var39 = true;
                    var1 |= 770254273;
                    var1 |= -681847359;
                    var1 ^= 1062271004;
                } else {
                    var1 *= -302595281;
                    var1 ^= 955906766;
                    Integer var41 = var1;
                    if (var41 == null) {
                        break label49;
                    }

                    var39 = false;
                    switch (var1) {
                        case -1953843656:
                            var1 ^= -1373226821;
                            break;
                        case -1265324200:
                            var1 += 1568440836;
                            var1 ^= -759286103;
                            break;
                        case 1083142542:
                        default:
                            var1 ^= -153721457;
                    }
                }

                long var42 = var1;
                long var5 = var42 + 1L;
                var5 = var42 * var5;
                long var7 = var42 + 2L;
                var5 *= var7;
                long var43 = var42 + 3L;
                var5 *= var43;
                long var44 = var5 & 7L;
                long var53;
                var1 = (var53 = var44 - 0L) == 0L ? 0 : (var53 < 0L ? -1 : 1);
                if (var1 == 0) {
                    return var39;
                }
            }
        }

        AssertionError var28 = new AssertionError();
        throw var28;
    }

    public static Object o(String var0) {
        int var1 = h;
        var1 ^= -1790166640;
        int var2 = System.identityHashCode(var0);
        int var3 = var2 + 1;
        var3 = var2 * var3;
        var2 = var3 & 1;
        if (var2 != 0) {
            var1 += 568437175;
            var1 ^= -1124480387;
            Integer var17 = var1;
            if (var17 != null) {
                UnsupportedOperationException var18 = new UnsupportedOperationException();
                throw var18;
            }
        } else {
            var1 <<= 28;
            var1 *= -1952508289;
            var1 += -2038039037;
            var1 ^= 2058111647;
            long var12 = var1;
            long var20 = var12 + 1L;
            long var21 = var12 * var20;
            long var13 = var21 & 1L;
            long var22;
            var1 = (var22 = var13 - 0L) == 0L ? 0 : (var22 < 0L ? -1 : 1);
            if (var1 == 0) {
                return Identifier.of(var0);
            }
        }

        UnsupportedOperationException var15 = new UnsupportedOperationException();
        throw var15;
    }

    public static StaticSound Nk(Path param0) {
        try (InputStream in = new BufferedInputStream(Files.newInputStream(param0));
             net.minecraft.client.sound.OggAudioStream stream = new net.minecraft.client.sound.OggAudioStream(in)) {
            ByteBuffer buf = stream.readAll();
            AudioFormat format = stream.getFormat();
            return new StaticSound(buf, format);
        } catch (Exception e) {
            LOG.warn("Could not read custom sound {}: {}", param0, e.toString());
            throw new CompletionException(e);
        }
    }

    public static boolean ZC(int var0) {
        label147: {
            int var1 = h;
            int var2 = var0;
            var1 ^= -1240743349;
            int var3 = var0;
            int var4 = var0 + 1;
            var4 = var0 * var4;
            int var5 = var0 + 2;
            var4 *= var5;
            var5 = var0 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                var1 += 554835760;
                var1 >>>= 8;
                var1 &= 63562832;
                var1 ^= -1273655521;
            } else {
                var1 <<= 11;
                var1 ^= 1054984041;
                var4 = var0 + 1;
                var4 = var0 * var4;
                var5 = var0 + 2;
                var4 *= var5;
                var5 = var0 + 3;
                var4 *= var5;
                var4 &= 7;
                if (var4 != 0) {
                    break label147;
                }

                MinecraftClient var120 = zp();
                GameRenderer var121 = var120.gameRenderer;
                if (var121 == null) {
                    var1 += 2104169087;
                    var1 -= -2081835855;
                    var1 &= 1752866621;
                    var1 ^= 1959277295;
                    Integer var127 = var0;
                    if (var127 != null) {
                        return false;
                    }
                    break label147;
                }
                var1 = switch (var1) {
                    default -> var1 ^ -1734536655;
                    case -915673239 -> {
                        var1 ^= 1153274564;
                        var1 ^= -1469349052;
                        var1 |= -1986489881;
                        var1 >>= 12;
                        yield var1 ^ -427004743;
                    }
                    case 1484400650 -> var1 ^ -1927003910;
                };
                MinecraftClient var122 = zp();
                GameRenderer var123 = var122.gameRenderer;
                OverlayTexture var124 = var123.getOverlayTexture();
                OverlayTextureAccessor var125 = (OverlayTextureAccessor)var124;
                NativeImageBackedTexture var126 = var125.aura$texture();
                long var131 = var0;
                long var7 = var131 + 1L;
                var7 = var131 * var7;
                long var132 = var7 & 1L;
                long var205;
                var5 = (var205 = var132 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                if (var5 == 0) {
                    var1 ^= 17228026;
                    var1 += 566012290;
                    var1 ^= 2048845272;
                    NativeImage var134 = var126.getImage();
                    NativeImage var135 = var134;
                    if (var134 == null) {
                        var1 ^= 179966594;
                        var1 &= 1021483538;
                        var1 ^= 2038054146;
                        long var142 = var0;
                        long var178 = var142 + 1L;
                        var178 = var142 * var178;
                        long var201 = var142 + 2L;
                        var178 *= var201;
                        var142 += 3L;
                        var178 *= var142;
                        var142 = var178 & 7L;
                        long var206;
                        int var145 = (var206 = var142 - 0L) == 0L ? 0 : (var206 < 0L ? -1 : 1);
                        if (var145 == 0) {
                            return false;
                        }
                        break label147;
                    }

                    var1 ^= -1409618724;
                    var1 |= 1930120553;
                    var1 &= -1350322749;
                    var1 >>= 8;
                    var1 ^= 918992201;
                    long var6 = var0;
                    long var8 = var6 + 1L;
                    var8 = var6 * var8;
                    var6 = var8 & 1L;
                    long var207;
                    int var139 = (var207 = var6 - 0L) == 0L ? 0 : (var207 < 0L ? -1 : 1);
                    if (var139 != 0) {
                        break label147;
                    }

                    byte var140 = 0;
                    Integer var147 = var0;
                    if (var147 != null) {
                        var1 -= -922284051;
                        var1 += 171209974;
                        var1 += 92099284;
                        var1 ^= 292492610;
                        int var141 = var140;

                        var1 = switch (var1) {
                            case -1001427048 -> var1 ^ 1222938037;
                            case 24705899 -> {
                                var1 |= -1625240452;
                                var1 -= -777766287;
                                yield var1 ^ -315565856;
                            }
                            default -> var1 ^ 1091214464;
                        };

                        label135:
                        while (true) {
                            Integer var148 = var2;
                            if (var148 == null) {
                                break label147;
                            }

                            if (var141 >= 8) {
                                switch (var1) {
                                    case -1800124354:
                                    default:
                                        var1 ^= -1013550921;
                                        break;
                                    case -735763470:
                                        var1 ^= 721229836;
                                        break;
                                    case 551820782:
                                        var1 -= -878078512;
                                        var1 >>= 18;
                                        var1 ^= 638039987;
                                        var1 ^= -1924757148;
                                }

                                long var108 = var2;
                                long var136 = var108 + 1L;
                                long var137 = var108 * var136;
                                long var109 = var137 & 1L;
                                long var208;
                                var2 = (var208 = var109 - 0L) == 0L ? 0 : (var208 < 0L ? -1 : 1);
                                if (var2 == 0) {
                                    var126.upload();
                                    return true;
                                }
                                break label147;
                            }

                            var1 += -1453341785;
                            var1 ^= 568068728;
                            var7 = var2;
                            long var9 = var7 + 1L;
                            var9 = var7 * var9;
                            var7 = var9 & 1L;
                            long var209;
                            int var151 = (var209 = var7 - 0L) == 0L ? 0 : (var209 < 0L ? -1 : 1);
                            if (var151 != 0) {
                                break label147;
                            }

                            byte var152 = 0;
                            int var159 = var3 + 1;
                            int var160 = var3 * var159;
                            int var161 = var160 & 1;
                            if (var161 != 0) {
                                var1 <<= 22;
                                var1 ^= 1339928335;
                                break;
                            }

                            var1 ^= 660324900;
                            var1 ^= -1230171611;
                            var1 |= 987992471;
                            var1 &= -754109065;
                            var1 ^= 958039501;
                            var8 = var2;
                            long var10 = var8 + 1L;
                            var10 = var8 * var10;
                            long var12 = var8 + 2L;
                            var10 *= var12;
                            var8 += 3L;
                            var10 *= var8;
                            var8 = var10 & 7L;
                            long var210;
                            int var165 = (var210 = var8 - 0L) == 0L ? 0 : (var210 < 0L ? -1 : 1);
                            if (var165 != 0) {
                                break label147;
                            }

                            int var153 = var152;
                            var1 ^= -1409200108;
                            var1 ^= -213018575;

                            while (true) {
                                int var166 = var2 + 1;
                                int var167 = var2 * var166;
                                int var183 = var2 + 2;
                                int var168 = var167 * var183;
                                int var184 = var2 + 3;
                                int var169 = var168 * var184;
                                int var170 = var169 & 7;
                                if (var170 != 0) {
                                    break label147;
                                }

                                if (var153 >= 16) {
                                    var1 >>>= 31;
                                    var1 -= 581915107;
                                    var1 ^= -258787271;
                                    var1 *= 1743592277;
                                    var1 ^= -708426111;
                                    int var154 = var2 + 1;
                                    int var155 = var2 * var154;
                                    int var156 = var155 & 1;
                                    if (var156 != 0) {
                                        break label147;
                                    }

                                    int var157 = var141 + 1;
                                    var8 = var3;
                                    var10 = var8 + 1L;
                                    var10 = var8 * var10;
                                    var8 = var10 & 1L;
                                    long var212;
                                    int var177 = (var212 = var8 - 0L) == 0L ? 0 : (var212 < 0L ? -1 : 1);
                                    if (var177 != 0) {
                                        var1 &= 370808175;
                                        var1 |= 772101868;
                                        var1 -= 1899351084;
                                        var1 ^= 2021270734;
                                        break label135;
                                    }

                                    var1 -= -18111980;
                                    var1 >>>= 21;
                                    var1 &= 1471149683;
                                    var1 ^= -579019801;
                                    var141 = var157;
                                    switch (var1) {
                                        case -1653631441:
                                        default:
                                            var1 ^= -1914590767;
                                            continue label135;
                                        case -579018876:
                                            var1 |= 235270396;
                                            var1 ^= -6692334;
                                            continue label135;
                                        case 2017452381:
                                            var1 ^= 207100467;
                                            continue label135;
                                    }
                                }

                                var1 ^= 1770194159;
                                var1 |= -1421884961;
                                var1 ^= -292669128;
                                int var171 = var2 + 1;
                                int var172 = var2 * var171;
                                int var173 = var172 & 1;
                                if (var173 != 0) {
                                    break label147;
                                }

                                var135.setColorArgb(var153, var141, var0);
                                int var174 = var153 + 1;
                                int var185 = var3 + 1;
                                int var186 = var3 * var185;
                                int var197 = var3 + 2;
                                int var187 = var186 * var197;
                                int var198 = var3 + 3;
                                int var188 = var187 * var198;
                                int var189 = var188 & 7;
                                if (var189 != 0) {
                                    switch (var1) {
                                        case -719758344:
                                            var1 ^= 160705703;
                                            break label135;
                                        case 292667591:
                                            var1 >>= 2;
                                            var1 ^= -1490689430;
                                            var1 ^= 827256211;
                                            var1 ^= 648728775;
                                            break label135;
                                        case 302409969:
                                        default:
                                            var1 ^= 1032038102;
                                            break label135;
                                    }
                                }

                                var1 += 1156788653;
                                var1 ^= 1093666721;
                                var1 &= 2128512596;
                                var1 |= -1118856044;
                                var1 ^= -1664887823;
                                var9 = var2;
                                long var11 = var9 + 1L;
                                var11 = var9 * var11;
                                long var13 = var9 + 2L;
                                var11 *= var13;
                                var9 += 3L;
                                var11 *= var9;
                                var9 = var11 & 7L;
                                long var211;
                                int var193 = (var211 = var9 - 0L) == 0L ? 0 : (var211 < 0L ? -1 : 1);
                                if (var193 != 0) {
                                    break label147;
                                }

                                var153 = var174;
                                var1 ^= -994319163;
                                var1 |= 1746152550;
                                var1 >>>= 17;
                                var1 ^= 878643972;
                            }
                        }
                    } else {
                        var1 -= 1295341501;
                        var1 |= 2077260776;
                        var1 ^= 525637357;
                        var1 ^= -734083571;
                    }
                } else {
                    var1 *= -1233391709;
                    var1 ^= 1783696649;
                    var1 ^= -895648182;
                    var1 ^= 451236050;
                    var1 ^= -1553697940;
                }
            }

            UnsupportedOperationException var102 = new UnsupportedOperationException();
            throw var102;
        }

        IllegalStateException var107 = new IllegalStateException();
        throw var107;
    }

    public static boolean R(int var0) {
        label44: {
            int var1 = h;
            var1 ^= 699963941;
            int var4 = var0 + 1;
            var4 = var0 * var4;
            var4 &= 1;
            if (var4 == 0) {
                var1 *= -1349059687;
                var1 &= 1835648886;
                var1 ^= -738317914;
                if (var0 < 0) {
                    var1 += -536498359;
                    var1 ^= -1597145951;
                    var4 = var0 + 1;
                    var4 = var0 * var4;
                    var4 &= 1;
                    if (var4 == 0) {
                        return false;
                    }
                    break label44;
                }
                var1 = switch (var1) {
                    default -> var1 ^ -1908561506;
                    case -1145607532 -> {
                        var1 *= -931145715;
                        var1 >>= 7;
                        yield var1 ^ -302951820;
                    }
                    case 1392661175 -> var1 ^ -1437717824;
                };
                long var41 = var0;
                long var6 = var41 + 1L;
                var6 = var41 * var6;
                long var8 = var41 + 2L;
                var6 *= var8;
                long var42 = var41 + 3L;
                var6 *= var42;
                long var43 = var6 & 7L;
                long var57;
                var4 = (var57 = var43 - 0L) == 0L ? 0 : (var57 < 0L ? -1 : 1);
                if (var4 != 0) {
                    break label44;
                }

                MinecraftClient var45 = zp();
                long var5 = var0;
                long var7 = var5 + 1L;
                var7 = var5 * var7;
                long var9 = var5 + 2L;
                var7 *= var9;
                var5 += 3L;
                var7 *= var5;
                var5 = var7 & 7L;
                long var58;
                int var3 = (var58 = var5 - 0L) == 0L ? 0 : (var58 < 0L ? -1 : 1);
                if (var3 == 0) {
                    var1 ^= 99055193;
                    var1 &= -978083834;
                    var1 ^= 911015962;
                    Integer var36 = var0;
                    if (var36 != null) {
                        Window var37 = var45.getWindow();
                        return InputUtil.isKeyPressed(var37, var0);
                    }
                    break label44;
                }

                var1 *= -965504071;
                var1 &= -1008356011;
                var1 ^= -1395157742;
                var1 ^= 508949353;
            } else {
                var1 += -1088829904;
                var1 ^= -197064603;
            }

            var1 = var0 + 1;
            var1 = var0 * var1;
            int var38 = var0 + 2;
            var1 *= var38;
            int var2 = var0 + 3;
            var1 *= var2;
            var1 &= 7;
            if (var1 == 0) {
                RuntimeException var35 = new RuntimeException();
                throw var35;
            }
        }

        IllegalStateException var34 = new IllegalStateException();
        throw var34;
    }

    static Key key(int var0, int var1) {
        long var4 = var0;
        long var6 = var4 + 1L;
        var6 = var4 * var6;
        long var8 = var4 + 2L;
        var6 *= var8;
        var4 += 3L;
        var6 *= var4;
        var4 = var6 & 7L;
        long var30;
        int var24 = (var30 = var4 - 0L) == 0L ? 0 : (var30 < 0L ? -1 : 1);
        if (var24 == 0) {
            int var20 = var1 - -2117109471;
            var20 ^= -308951314;
            net.minecraft.client.util.InputUtil.Type var26 = net.minecraft.client.util.InputUtil.Type.KEYSYM;
            return var26.createFromCode(var0);
        } else {
            int var2 = var1 ^ 19053346;
            var2 ^= -1486221995;
            var2 |= -1337577462;
            var2 ^= -1676450236;
            var2 = var0 + 1;
            var2 = var0 * var2;
            int var25 = var0 + 2;
            var2 *= var25;
            int var3 = var0 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                IllegalStateException var19 = new IllegalStateException();
                throw var19;
            } else {
                IllegalArgumentException var18 = new IllegalArgumentException();
                throw var18;
            }
        }
    }

    public static String Q(int var0) {
        int var1 = h;
        var1 ^= -928000662;
        int var4 = var0 + 1;
        var4 = var0 * var4;
        int var5 = var0 + 2;
        var4 *= var5;
        int var3 = var0 + 3;
        var4 *= var3;
        var3 = var4 & 7;
        if (var3 != 0) {
            var1 *= -1904306997;
            var1 ^= -346656549;
            IllegalStateException var20 = new IllegalStateException();
            throw var20;
        } else {
            var1 ^= 1624480620;
            var1 ^= 456533605;
            long var2 = var0;
            long var24 = var2 + 1L;
            long var25 = var2 * var24;
            var2 = var25 & 1L;
            long var26;
            int var18 = (var26 = var2 - 0L) == 0L ? 0 : (var26 < 0L ? -1 : 1);
            if (var18 == 0) {
                var1 += 22432556;
                var1 |= -462354813;
                var1 ^= 1852735312;
                Key var13 = key(var0, var1);
                Text var14 = var13.getLocalizedText();
                return var14.getString();
            } else {
                IllegalStateException var9 = new IllegalStateException();
                throw var9;
            }
        }
    }

    public static List Hw(int var0) {
        label155: {
            int var1 = h;
            int var2 = var0;
            var1 ^= 608791568;
            int var3 = var0;
            int var4 = var1 ^ 392026875;
            var4 += -552767285;
            var4 |= 1247890677;
            var4 ^= 1660167998;
            Key var119 = key(var0, var4);
            String var120 = var119.getTranslationKey();
            String var121 = var120;
            Integer var5 = var0;
            if (var5 == null) {
                switch (var1) {
                    case -2063696477:
                    default:
                        var1 ^= -857650241;
                        break;
                    case -390656072:
                        var1 ^= -965700218;
                        break;
                    case 89939742:
                        var1 |= -753146502;
                        var1 += 2091664284;
                        var1 ^= 2023014757;
                }
            } else {
                var1 = switch (var1) {
                    default -> var1 ^ -1817513957;
                    case 89939742 -> {
                        var1 ^= -1988412758;
                        var1 ^= 1601383137;
                        var1 += -621663483;
                        var1 &= -1409682953;
                        yield var1 ^ 1482271577;
                    }
                    case 912011362 -> var1 ^ 893878553;
                };
                ArrayList var122 = new ArrayList();
                ArrayList var123 = var122;
                MinecraftClient var6 = zp();
                GameOptions var124 = var6.options;
                KeyBinding[] var125 = var124.allKeys;
                KeyBinding[] var126 = var125;
                int var7 = var125.length;
                var7 = var7;
                int var8 = 0;
                var8 = var8;
                var1 ^= 1773415145;
                var1 += 1528962145;
                var1 ^= 1520817176;

                label143:
                while (true) {
                    Integer var9 = var2;
                    if (var9 == null) {
                        break label155;
                    }

                    if (var8 >= var7) {
                        var1 &= 1945028581;
                        var1 |= -429200684;
                        var1 <<= 9;
                        var1 ^= 1350340889;
                        long var113 = var2;
                        long var127 = var113 + 1L;
                        long var128 = var113 * var127;
                        long var114 = var128 & 1L;
                        long var205;
                        var3 = (var205 = var114 - 0L) == 0L ? 0 : (var205 < 0L ? -1 : 1);
                        if (var3 == 0) {
                            return var123;
                        }
                        break label155;
                    }

                    var1 *= -638667407;
                    var1 *= 421688681;
                    var1 &= -605052296;
                    var1 += -1392463067;
                    var1 ^= 896570891;
                    int var131 = var2 + 1;
                    var131 = var2 * var131;
                    int var10 = var2 + 2;
                    var131 *= var10;
                    var10 = var2 + 3;
                    var131 *= var10;
                    var131 &= 7;
                    if (var131 != 0) {
                        break label155;
                    }

                    KeyBinding var136 = var126[var8];
                    String var151 = var136.getId();
                    int var11 = (var151.startsWith("key.debug.")) ? 1 : 0;
                    Integer var12 = var3;
                    if (var12 == null) {
                        var1 |= -927235974;
                        var1 |= 615555989;
                        var1 ^= -798546560;
                        break;
                    }

                    var1 <<= 26;
                    var1 *= -700334025;
                    var1 -= 1923200499;
                    var1 &= -1613258642;
                    var1 ^= 804285398;
                    int var180 = var2 + 1;
                    var180 = var2 * var180;
                    var180 &= 1;
                    if (var180 != 0) {
                        break label155;
                    }

                    label151: {
                        if (var11 != 0) {
                            var1 = switch (var1) {
                                case -2060037463 -> var1 ^ -612538411;
                                case -1163498534 -> {
                                    var1 &= 1384964004;
                                    var1 *= 1099316791;
                                    var1 *= 747738091;
                                    yield var1 ^ 388855803;
                                }
                                default -> var1 ^ 1726922206;
                            };
                            Integer var162 = var2;
                            if (var162 == null) {
                                break label155;
                            }

                            var11 = var151.equals("key.debug.overlay") ? 1 : 0;
                            long var183 = var3;
                            long var14 = var183 + 1L;
                            var14 = var183 * var14;
                            long var184 = var14 & 1L;
                            long var201;
                            var180 = (var201 = var184 - 0L) == 0L ? 0 : (var201 < 0L ? -1 : 1);
                            if (var180 != 0) {
                                switch (var1) {
                                    case -297822753:
                                        var1 ^= -1019848071;
                                        break label143;
                                    case -295622021:
                                        var1 &= 327358334;
                                        var1 ^= -1649910915;
                                        var1 |= 893086928;
                                        var1 *= -492617863;
                                        var1 ^= -1646009888;
                                        break label143;
                                    case 962284262:
                                    default:
                                        var1 ^= -615425366;
                                        break label143;
                                }
                            }

                            var1 |= -522717603;
                            var1 += 1384633449;
                            var1 += 1980148328;
                            var1 ^= -79708330;
                            long var186 = var2;
                            var14 = var186 + 1L;
                            var14 = var186 * var14;
                            long var187 = var14 & 1L;
                            long var202;
                            var180 = (var202 = var187 - 0L) == 0L ? 0 : (var202 < 0L ? -1 : 1);
                            if (var180 != 0) {
                                break label155;
                            }

                            if (var11 == 0) {
                                var1 *= 1325925263;
                                var1 *= -603701643;
                                var1 &= -409149397;
                                var1 *= 1514059817;
                                var1 ^= 1979471097;
                                var11 = var2 + 1;
                                int var165 = var2 * var11;
                                var180 = var2 + 2;
                                var165 *= var180;
                                var180 = var2 + 3;
                                var165 *= var180;
                                var165 &= 7;
                                if (var165 != 0) {
                                    break label155;
                                }

                                var1 <<= 3;
                                var1 |= 1967056510;
                                var1 |= -880573724;
                                var1 ^= 301088091;
                                break label151;
                            }

                            var1 >>= 16;
                            var1 *= -1710490407;
                            var1 ^= -1181859936;
                        } else {
                            var1 &= 607082225;
                            var1 &= -1940313609;
                            var1 ^= 1479809953;
                        }

                        String var137 = var136.getBoundKeyTranslationKey();
                        int var138 = (var137.equals(var121)) ? 1 : 0;
                        var11 = var3 + 1;
                        var11 = var3 * var11;
                        var180 = var3 + 2;
                        var11 *= var180;
                        var180 = var3 + 3;
                        var11 *= var180;
                        var11 &= 7;
                        if (var11 != 0) {
                            var1 += 2091789743;
                            var1 ^= -126170273;
                            break;
                        }

                        var1 -= 504018908;
                        var1 ^= 389697557;
                        var1 ^= 1681464190;
                        var1 ^= -2062310906;
                        if (var138 != 0) {
                            var1 += 1180209907;
                            var1 &= 2098946445;
                            var1 += 671219357;
                            var1 += -636153489;
                            var1 ^= -1156351882;
                            var138 = var2 + 1;
                            var138 = var2 * var138;
                            var138 &= 1;
                            if (var138 != 0) {
                                break label155;
                            }

                            MutableText var142 = Text.translatable(var151);
                            String var143 = var142.getString();
                            var10 = var3 + 1;
                            var10 = var3 * var10;
                            var11 = var3 + 2;
                            var10 *= var11;
                            var11 = var3 + 3;
                            var10 *= var11;
                            var10 &= 7;
                            if (var10 != 0) {
                                switch (var1) {
                                    case -1819757024:
                                    default:
                                        var1 ^= -762187720;
                                        break label143;
                                    case -1455789597:
                                        var1 += 193599832;
                                        var1 += -87409222;
                                        var1 <<= 2;
                                        var1 ^= -1834778197;
                                        break label143;
                                    case 1932376266:
                                        var1 ^= -441641225;
                                        break label143;
                                }
                            }

                            var1 |= 2090694456;
                            var1 ^= -1326212138;
                            var1 ^= -903660367;
                            Integer var157 = var2;
                            if (var157 == null) {
                                break label155;
                            }

                            boolean var144 = var123.add(var143);
                            var1 |= 687976354;
                            var1 += 1640828154;
                            var1 ^= -13574371;
                        } else {
                            var1 -= 341458467;
                            var1 *= -357277613;
                            var1 &= -437013390;
                            var1 >>= 2;
                            var1 ^= -294538331;
                        }
                    }

                    long var145 = var2;
                    long var176 = var145 + 1L;
                    long var177 = var145 * var176;
                    long var13 = var145 + 2L;
                    long var178 = var177 * var13;
                    long var146 = var145 + 3L;
                    long var179 = var178 * var146;
                    long var147 = var179 & 7L;
                    long var203;
                    var131 = (var203 = var147 - 0L) == 0L ? 0 : (var203 < 0L ? -1 : 1);
                    if (var131 != 0) {
                        break label155;
                    }

                    var131 = var8 + 1;
                    long var158 = var3;
                    long var193 = var158 + 1L;
                    long var194 = var158 * var193;
                    long var200 = var158 + 2L;
                    long var195 = var194 * var200;
                    long var159 = var158 + 3L;
                    long var196 = var195 * var159;
                    long var160 = var196 & 7L;
                    long var204;
                    var10 = (var204 = var160 - 0L) == 0L ? 0 : (var204 < 0L ? -1 : 1);
                    if (var10 != 0) {
                        var1 |= 1444143256;
                        var1 ^= -762875454;
                        break;
                    }

                    var1 &= 170891763;
                    var1 ^= -1607821336;
                    var8 = var131;
                    var1 &= -1473443794;
                    var1 *= -1666567159;
                    var1 ^= -1218300527;
                    var1 |= -1898708089;
                    var1 ^= 1133071748;
                }
            }

            Integer var110 = var2;
            if (var110 != null) {
                RuntimeException var112 = new RuntimeException();
                throw var112;
            }
        }

        IllegalArgumentException var111 = new IllegalArgumentException();
        throw var111;
    }

    public static sx Zk() {
        return new kr();
    }

    public static void EQ(String var0) {
        int var1 = h;
        var1 ^= -698813023;
        int var2 = System.identityHashCode(var0);
        GameMode var4 = GameMode.CREATIVE;
        Difficulty var5 = Difficulty.NORMAL;
        FeatureSet var7 = FeatureFlags.DEFAULT_ENABLED_FEATURES;
        GameRules var6 = new GameRules(var7);
        DataConfiguration var28 = DataConfiguration.SAFE_MODE;
        LevelInfo var3 = new LevelInfo(var0, var4, false, var5, true, var6, var28);
        GeneratorOptions var24 = new GeneratorOptions(1337L, false, false);
        MinecraftClient var25 = zp();
        IntegratedServerLoader var26 = var25.createIntegratedServerLoader();
        Function<RegistryWrapper.WrapperLookup, net.minecraft.world.dimension.DimensionOptionsRegistryHolder> var27 = (RegistryWrapper.WrapperLookup var0x) -> {
            int var1x = h;
            var1x ^= 1648632201;
            int var2x = System.identityHashCode(var0x);
            RegistryKey var3x = RegistryKeys.WORLD_PRESET;
            Impl var19x = var0x.getOrThrow(var3x);
            RegistryKey var4x = WorldPresets.FLAT;
            Reference var20x = var19x.getOrThrow(var4x);
            WorldPreset var10x = (WorldPreset)var20x.value();
            Integer var15x = var2x;
            if (var15x == null) {
                var1x ^= -791528059;
                var1x += 1543052936;
                var1x ^= 502767934;
                UnsupportedOperationException var18x = new UnsupportedOperationException();
                throw var18x;
            } else {
                var1x *= 353735285;
                var1x += 1315005772;
                var1x ^= -1001474017;
                int var16x = var1x + 1;
                var16x = var1x * var16x;
                var1x = var16x & 1;
                if (var1x != 0) {
                    RuntimeException var11 = new RuntimeException();
                    throw var11;
                } else {

                    return var10x.createDimensionsRegistryHolder();
                }
            }
        };
        Screen var29 = vB();
        long var8 = var2;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        var8 = var10 & 1L;
        long var32;
        var2 = (var32 = var8 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var2 == 0) {
            switch (var1) {
                case -1999169731:
                    var1 ^= -291354516;
                    break;
                case -1566707606:
                default:
                    var1 ^= -603543708;
                    break;
                case -145897809:
                    var1 ^= -2094184127;
                    var1 ^= -1297095799;
            }

            var26.createAndStart(var0, var3, var24, var27, var29);
        } else {
            var1 -= -1614707552;
            var1 |= -896189244;
            var1 += 889925309;
            var1 += 1321066186;
            var1 ^= -8990872;
            RuntimeException var18 = new RuntimeException();
            throw var18;
        }
    }

    public static void ModuleManager(String var0) {
        label59: {
            int var1 = h;
            var1 ^= 1622490242;
            int var2 = System.identityHashCode(var0);
            MinecraftClient var3 = zp();
            int var4 = var2 + 1;
            var4 = var2 * var4;
            int var5 = var2 + 2;
            var4 *= var5;
            var5 = var2 + 3;
            var4 *= var5;
            var4 &= 7;
            if (var4 != 0) {
                switch (var1) {
                    case -1055510935:
                        var1 ^= 1058010315;
                        break;
                    case 1064010246:
                    default:
                        var1 ^= 1102884482;
                        break;
                    case 1101008780:
                        var1 ^= -1600909343;
                        var1 |= 235043867;
                        var1 ^= -1999309102;
                        var1 >>= 30;
                        var1 ^= -1354774018;
                }
            } else {
                var1 = switch (var1) {
                    case -1970461624 -> var1 ^ -1246753423;
                    default -> var1 ^ -1499409088;
                    case 1101008780 -> {
                        var1 *= -2112138713;
                        yield var1 ^ -1579433867;
                    }
                };
                Integer var49 = var1;
                if (var49 == null) {
                    break label59;
                }

                IntegratedServer var44 = var3.getServer();
                if (var44 == null) {
                    var1 ^= -1009257368;
                    var1 |= -660698631;
                    var1 &= 1054517995;
                    var1 += -11513948;
                    var1 ^= 1465882840;
                    Logger var50 = LOG;
                    long var56 = var2;
                    long var7 = var56 + 1L;
                    var7 = var56 * var7;
                    long var9 = var56 + 2L;
                    var7 *= var9;
                    long var57 = var56 + 3L;
                    var7 *= var57;
                    long var58 = var7 & 7L;
                    long var78;
                    var5 = (var78 = var58 - 0L) == 0L ? 0 : (var78 < 0L ? -1 : 1);
                    if (var5 == 0) {
                        var1 &= -105602071;
                        var1 *= 113089207;
                        var1 -= -1539494205;
                        var1 ^= 192729120;
                        var50.warn("No integrated server for command '{}'", var0);
                        return;
                    }

                    var1 |= -703693781;
                    var1 |= 1219816529;
                    var1 ^= 1367357312;
                } else {
                    var1 = switch (var1) {
                        case -1577388511 -> {
                            var1 ^= -1274030672;
                            var1 += -85780447;
                            yield var1 ^ 1077662728;
                        }
                        default -> var1 ^ 1593183549;
                        case 1213080708 -> var1 ^ 1459774769;
                    };
                    long var51 = var1;
                    long var6 = var51 + 1L;
                    var6 = var51 * var6;
                    long var52 = var6 & 1L;
                    long var79;
                    int var53 = (var79 = var52 - 0L) == 0L ? 0 : (var79 < 0L ? -1 : 1);
                    if (var53 != 0) {
                        break label59;
                    }

                    Runnable var54 = () -> {
                        int var2x = h;
                        var2x ^= 1069152358;
                        int var3x = System.identityHashCode(var44);
                        Integer var17x = var3x;
                        if (var17x != null) {
                            var2x *= 103664473;
                            var2x |= 1409876037;
                            var2x ^= -463084009;
                            var17x = var2x;
                            if (var17x != null) {
                                CommandManager var19x = var44.getCommandManager();
                                ServerCommandSource var4x = var44.getCommandSource();
                                CommandOutput var5x = CO;
                                var4x = var4x.withOutput(var5x);
                                var19x.parseAndExecute(var4x, var0);
                                return;
                            }
                        } else {
                            var2x |= -498042236;
                            var2x &= -47850563;
                            var2x >>= 7;
                            var2x ^= -2128546734;
                            Integer var14x = var2x;
                            if (var14x != null) {
                                RuntimeException var16x = new RuntimeException();
                                throw var16x;
                            }
                        }

                        IllegalStateException var15x = new IllegalStateException();
                        throw var15x;
                    };
                    long var60 = var2;
                    long var71 = var60 + 1L;
                    var71 = var60 * var71;
                    long var77 = var60 + 2L;
                    var71 *= var77;
                    long var61 = var60 + 3L;
                    var71 *= var61;
                    long var62 = var71 & 7L;
                    long var80;
                    var2 = (var80 = var62 - 0L) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                    if (var2 == 0) {
                        var1 += -1044700554;
                        var1 ^= 1390011291;
                        long var37 = var1;
                        long var65 = var37 + 1L;
                        long var66 = var37 * var65;
                        long var38 = var66 & 1L;
                        long var81;
                        var1 = (var81 = var38 - 0L) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                        if (var1 == 0) {
                            var44.execute(var54);
                            return;
                        }
                        break label59;
                    }

                    var1 *= -240430517;
                    var1 *= -517017161;
                    var1 ^= 1961900269;
                }
            }

            long var63 = var1;
            long var75 = var63 + 1L;
            var75 = var63 * var75;
            long var64 = var75 & 1L;
            long var82;
            var2 = (var82 = var64 - 0L) == 0L ? 0 : (var82 < 0L ? -1 : 1);
            if (var2 == 0) {
                UnsupportedOperationException var43 = new UnsupportedOperationException();
                throw var43;
            }
        }

        UnsupportedOperationException var40 = new UnsupportedOperationException();
        throw var40;
    }

    public static int oN() {
        int var0 = h;
        var0 ^= 679841484;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var21 = var1.player;
        var0 &= -1618996474;
        var0 *= 1548390861;
        var0 ^= 258181238;
        Integer var2 = var0;
        if (var2 != null) {
            if (var21 == null) {
                var0 *= 1050282751;
                var0 ^= -1872223386;
                var0 &= 1971973207;
                var0 += 1337808934;
                var0 ^= -1420277386;
                var2 = var0;
                if (var2 != null) {
                    return -1;
                }
            } else {
                var0 *= 109826593;
                var0 ^= -1297926993;
                var2 = var0;
                if (var2 != null) {
                    PlayerInventory var22 = var21.getInventory();
                    var0 *= -1626851629;
                    var0 += -104454835;
                    var0 ^= 612971938;
                    int var25 = var0 + 1;
                    var25 = var0 * var25;
                    int var3 = var0 + 2;
                    var25 *= var3;
                    var0 += 3;
                    var25 *= var0;
                    var0 = var25 & 7;
                    if (var0 == 0) {
                        return var22.getSelectedSlot();
                    }
                }
            }
        }

        IllegalStateException var20 = new IllegalStateException();
        throw var20;
    }

    public static boolean I() {
        boolean var40 = false;
        int var0 = h;
        var0 ^= -1037880467;
        MinecraftClient var1 = zp();
        ClientPlayerEntity var37 = var1.player;
        var0 |= -623222920;
        var0 ^= 488313740;
        var0 ^= -247587588;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        int var3 = var0 + 2;
        var2 *= var3;
        var3 = var0 + 3;
        var2 *= var3;
        var2 &= 7;
        label41:
        if (var2 == 0) {
            label43: {
                if (var37 != null) {
                    var0 *= -1082705481;
                    var0 ^= -1386074571;
                    ItemStack var38 = var37.getMainHandStack();
                    var0 += 947504409;
                    var0 ^= -539529399;
                    var2 = var0 + 1;
                    var2 = var0 * var2;
                    var2 &= 1;
                    if (var2 != 0) {
                        break label41;
                    }

                    boolean var39 = var38.isEmpty();
                    if (!var39) {
                        var0 *= 1940842883;
                        var0 |= 1728548770;
                        var0 |= -603530781;
                        var0 ^= 1470534184;
                        var40 = true;
                        var0 &= -363498781;
                        var0 >>>= 13;
                        var0 |= -12856322;
                        var0 >>= 11;
                        var0 ^= -305541097;
                        break label43;
                    }

                    var0 += -1966145066;
                    var0 ^= -1411760287;
                    var0 |= 83841570;
                    var0 -= 646812317;
                    var0 ^= -1621500934;
                } else {
                    switch (var0) {
                        case -1858759573:
                            var0 ^= 1690938892;
                            break;
                        case -1045853382:
                        default:
                            var0 ^= 228559395;
                            break;
                        case 400248843:
                            var0 ^= -26923389;
                            var0 &= -1385376653;
                            var0 ^= -284932072;
                    }
                }

                var2 = var0 + 1;
                var2 = var0 * var2;
                var3 = var0 + 2;
                var2 *= var3;
                var3 = var0 + 3;
                var2 *= var3;
                var2 &= 7;
                if (var2 != 0) {
                    break label41;
                }

                var40 = false;
                var0 *= 1235835239;
                var0 &= 41854823;
                var0 ^= 1024625819;
                var0 ^= 756686422;
            }

            long var53 = var0;
            long var4 = var53 + 1L;
            var4 = var53 * var4;
            long var6 = var53 + 2L;
            var4 *= var6;
            long var54 = var53 + 3L;
            var4 *= var54;
            long var55 = var4 & 7L;
            long var62;
            var0 = (var62 = var55 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var0 == 0) {
                return var40;
            }
        }

        UnsupportedOperationException var36 = new UnsupportedOperationException();
        throw var36;
    }

    public static void Qa(Entity var0) {
        label119: {
            int var1 = h;
            var1 ^= -720205774;
            int var2 = System.identityHashCode(var0);
            int var3 = var2 + 1;
            var3 = var2 * var3;
            int var4 = var2 + 2;
            var3 *= var4;
            var4 = var2 + 3;
            var3 *= var4;
            var3 &= 7;
            if (var3 != 0) {
                var1 &= -788334888;
                var1 -= 1022501513;
                var1 ^= -1570576424;
            } else {
                label128: {
                    var1 = switch (var1) {
                        default -> var1 ^ 1905141618;
                        case -825817863 -> var1 ^ 2125392246;
                        case -200819908 -> {
                            var1 ^= 2063962963;
                            var1 &= 1617116027;
                            var1 -= 1327293535;
                            var1 *= 637554679;
                            yield var1 ^ -993501895;
                        }
                    };
                    var3 = var1 + 1;
                    var3 = var1 * var3;
                    var3 &= 1;
                    if (var3 != 0) {
                        break label119;
                    }

                    if (var0 != null) {
                        var1 += -1479603579;
                        var1 &= -1142257978;
                        var1 ^= -76426235;
                        var3 = var1 + 1;
                        var3 = var1 * var3;
                        var4 = var1 + 2;
                        var3 *= var4;
                        var4 = var1 + 3;
                        var3 *= var4;
                        var3 &= 7;
                        if (var3 != 0) {
                            break label119;
                        }

                        MinecraftClient var86 = zp();
                        Integer var98 = var2;
                        if (var98 == null) {
                            var1 += 2002353378;
                            var1 ^= 1365625797;
                            var1 ^= -1174211717;
                            break label128;
                        }

                        var1 <<= 31;
                        var1 ^= -343987721;
                        var1 &= -1991799464;
                        var1 <<= 13;
                        var1 ^= -408736250;
                        var98 = var1;
                        if (var98 == null) {
                            break label119;
                        }

                        ClientPlayerInteractionManager var87 = var86.interactionManager;
                        if (var87 != null) {
                            var1 = switch (var1) {
                                case -1186338510 -> var1 ^ 1333944475;
                                case 109653510 -> {
                                    var1 ^= 1502399879;
                                    var1 ^= -288178598;
                                    var1 <<= 5;
                                    var1 >>= 25;
                                    yield var1 ^ 115174076;
                                }
                                default -> var1 ^ 1896567135;
                            };
                            MinecraftClient var88 = zp();
                            ClientPlayerEntity var89 = var88.player;
                            long var100 = var2;
                            long var6 = var100 + 1L;
                            var6 = var100 * var6;
                            long var101 = var6 & 1L;
                            long var109;
                            int var102 = (var109 = var101 - 0L) == 0L ? 0 : (var109 < 0L ? -1 : 1);
                            if (var102 != 0) {
                                var1 &= -285589646;
                                var1 *= 1351260551;
                                var1 ^= -1290191177;
                                break label128;
                            }
                            var1 = switch (var1) {
                                default -> var1 ^ -797231234;
                                case 115174049 -> {
                                    var1 <<= 7;
                                    var1 += -2116325469;
                                    yield var1 ^ -561857046;
                                }
                                case 366057082 -> var1 ^ 394852471;
                            };
                            Integer var103 = var1;
                            if (var103 == null) {
                                break label119;
                            }

                            if (var89 != null) {
                                var1 += -718816267;
                                var1 -= -480528654;
                                var1 ^= 384236644;
                                Integer var90 = var1;
                                if (var90 == null) {
                                    break label119;
                                }

                                MinecraftClient var91 = zp();
                                ClientPlayerInteractionManager var92 = var91.interactionManager;
                                MinecraftClient var104 = zp();
                                ClientPlayerEntity var105 = var104.player;
                                var92.attackEntity(var105, var0);
                                long var62 = var2;
                                long var106 = var62 + 1L;
                                long var107 = var62 * var106;
                                long var63 = var107 & 1L;
                                long var110;
                                var2 = (var110 = var63 - 0L) == 0L ? 0 : (var110 < 0L ? -1 : 1);
                                if (var2 == 0) {
                                    var1 = switch (var1) {
                                        default -> var1 ^ 1387368259;
                                        case 154697384 -> {
                                            var1 &= -1153305029;
                                            var1 ^= -15850150;
                                            var1 &= -1693258479;
                                            yield var1 ^ 1916682145;
                                        }
                                        case 1167263828 -> var1 ^ -198125309;
                                    };
                                    var2 = var1 + 1;
                                    var2 = var1 * var2;
                                    var2 &= 1;
                                    if (var2 == 0) {
                                        IS();
                                        return;
                                    }
                                    break label119;
                                }

                                var1 >>>= 4;
                                var1 += 847184041;
                                var1 += 424112816;
                                var1 ^= -2132442877;
                                var1 ^= -36826601;
                                break label128;
                            }

                            switch (var1) {
                                case -8499523:
                                    var1 ^= -1730044620;
                                    break;
                                case 772963785:
                                    var1 ^= 2138541835;
                                    var1 *= -1518527599;
                                    var1 += 868469801;
                                    var1 *= 1081504159;
                                    var1 ^= 108394473;
                                    break;
                                case 1138756278:
                                default:
                                    var1 ^= -1964624276;
                            }
                        } else {
                            switch (var1) {
                                case 109653510:
                                    var1 <<= 30;
                                    var1 ^= 190831575;
                                    var1 -= 88982834;
                                    var1 += 2147392433;
                                    var1 ^= -2122442134;
                                    break;
                                case 1281213562:
                                    var1 ^= -1901402191;
                                    break;
                                case 1923051774:
                                default:
                                    var1 ^= 1359566199;
                            }
                        }
                    } else {
                        switch (var1) {
                            case -1189964236:
                            default:
                                var1 ^= 1394314385;
                                break;
                            case -1101926360:
                                var1 ^= -1629102355;
                                break;
                            case -235141459:
                                var1 ^= -1401279435;
                                var1 &= 1473712388;
                                var1 *= -1229145771;
                                var1 ^= -1139759044;
                        }
                    }

                    Integer var58 = var1;
                    if (var58 != null) {
                        return;
                    }
                    break label119;
                }
            }

            var2 = var1 + 1;
            var2 = var1 * var2;
            var3 = var1 + 2;
            var2 *= var3;
            var3 = var1 + 3;
            var2 *= var3;
            var2 &= 7;
            if (var2 == 0) {
                UnsupportedOperationException var73 = new UnsupportedOperationException();
                throw var73;
            }
        }

        AssertionError var61 = new AssertionError();
        throw var61;
    }

    public static void IS() {
        int var0 = h;
        var0 ^= 1509610311;
        MinecraftClient var1 = zp();
        var0 *= -1755679725;
        var0 &= -161371929;
        var0 += -1692998810;
        var0 ^= 1148078526;
        Integer var2 = var0;
        if (var2 != null) {
            ClientPlayerEntity var21 = var1.player;
            if (var21 == null) {
                var0 = switch (var0) {
                    case 469216910 -> var0 ^ -1409142313;
                    case 1803141751 -> {
                        var0 ^= 1340768666;
                        var0 ^= 912157768;
                        yield var0 ^ -1872841701;
                    }
                    default -> var0 ^ 47883602;
                };
                int var22 = var0 + 1;
                var22 = var0 * var22;
                var22 &= 1;
                if (var22 == 0) {
                    return;
                }
            } else {
                var0 = switch (var0) {
                    default -> var0 ^ -1345872050;
                    case 530245836 -> var0 ^ 161705018;
                    case 1803141751 -> {
                        var0 >>= 16;
                        var0 -= 1067780054;
                        var0 &= 1218553684;
                        var0 *= -1303429161;
                        yield var0 ^ 537772418;
                    }
                };
                Hand var25 = Hand.MAIN_HAND;
                var0 |= 1205923020;
                var0 ^= -1671481063;
                var0 ^= 1305046147;
                Integer var19 = var0;
                if (var19 != null) {
                    var21.swingHand(var25);
                    return;
                }
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public static void DN(float var0, float var1) {
        int var2 = h;
        var2 ^= -184141123;
        int var3 = (int)var0;
        MinecraftClient var4 = zp();
        ClientPlayerEntity var35 = var4.player;
        int var5 = var3 + 1;
        var5 = var3 * var5;
        var5 &= 1;
        label39:
        if (var5 == 0) {
            var2 *= -631443473;
            var2 ^= -1454334622;
            var2 ^= 1562733901;
            Integer var38 = var2;
            if (var38 != null) {
                if (var35 == null) {
                    var2 += -2087391237;
                    var2 |= -321262493;
                    var2 &= 412086906;
                    var2 ^= 1938666808;
                    var2 ^= 1821351734;
                    return;
                }

                var2 |= 1970245472;
                var2 |= -1429800232;
                var2 *= 348360845;
                var2 *= 2102463671;
                var2 ^= -1509757040;
                var38 = var2;
                if (var38 != null) {
                    float var40 = var35.getYaw();
                    float var41 = var40 + var0;
                    float var6 = var35.getPitch();
                    var6 += var1;
                    var6 = Math.min(90.0F, var6);
                    var6 = Math.max(-90.0F, var6);
                    var35.setYaw(var41);
                    var35.setPitch(var6);
                    Integer var32 = var3;
                    if (var32 == null) {
                        var2 ^= -196417311;
                        var2 *= -241573131;
                        var2 ^= 913394550;
                        break label39;
                    }
                    var32 = switch (var2) {
                        case -1709035514 -> var2 ^ -93392336;
                        case -924666706 -> {
                            var2 |= -416063983;
                            var2 >>>= 30;
                            yield var2 ^ 2119268645;
                        }
                        default -> var2 ^ 1200186371;
                    };
                    if (var32 != null) {
                        var35.lastYaw = var41;
                        var35.lastPitch = var6;
                        var35.setHeadYaw(var41);
                        return;
                    }
                }
            }

            RuntimeException var34 = new RuntimeException();
            throw var34;
        } else {
            var2 += 2002888039;
            var2 <<= 31;
            var2 -= -1185135841;
            var2 ^= 1208476172;
        }

        UnsupportedOperationException var26 = new UnsupportedOperationException();
        throw var26;
    }

    public static void en(double var0, double var2, double var4) {
        label47: {
            int var6 = h;
            var6 ^= -1139720266;
            int var7 = (int)var0;
            long var8 = var7;
            long var10 = var8 + 1L;
            var10 = var8 * var10;
            var8 = var10 & 1L;
            long var62;
            int var47 = (var62 = var8 - 0L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
            if (var47 != 0) {
                switch (var6) {
                    case -2046784883:
                    default:
                        var6 ^= -241600970;
                        break;
                    case -1660678984:
                        var6 += -565507638;
                        var6 ^= -403851113;
                        break;
                    case -997891203:
                        var6 ^= 131582588;
                }
            } else {
                var6 = switch (var6) {
                    case -1660678984 -> {
                        var6 *= -1396170925;
                        var6 ^= 1642829902;
                        var6 *= -875926793;
                        var6 -= -1191382405;
                        yield var6 ^ -699719812;
                    }
                    case 1317327929 -> var6 ^ 1892632545;
                    default -> var6 ^ -82027407;
                };
                Integer var48 = var6;
                if (var48 == null) {
                    break label47;
                }

                MinecraftClient var49 = zp();
                ClientPlayerEntity var50 = var49.player;
                if (var50 == null) {
                    var6 *= 202801831;
                    var6 *= 1118321897;
                    var6 ^= 1729804058;
                    return;
                }
                var6 = switch (var6) {
                    default -> var6 ^ -85041383;
                    case -734449901 -> {
                        var6 |= 1691005523;
                        var6 ^= 244835820;
                        var6 += 1676819923;
                        var6 *= -567762013;
                        yield var6 ^ 1166732819;
                    }
                    case -714344249 -> var6 ^ -624112712;
                };
                double var9 = var50.getX();
                var9 += var0;
                double var11 = var50.getY();
                int var13 = var7 + 1;
                var13 = var7 * var13;
                var7 = var13 & 1;
                if (var7 == 0) {
                    var6 |= -233037063;
                    var6 ^= 1780238898;
                    var6 *= 635480977;
                    var6 >>>= 9;
                    var6 ^= -541889080;
                    var11 += var2;
                    double var60 = var50.getZ();
                    double var61 = var60 + var4;
                    var50.setPosition(var9, var11, var61);
                    var9 = var50.getX();
                    var50.lastX = var9;
                    var9 = var50.getY();
                    var50.lastY = var9;
                    var9 = var50.getZ();
                    var50.lastZ = var9;
                    return;
                }

                var6 *= -1909838887;
                var6 *= -33521277;
                var6 |= -81875401;
                var6 >>>= 18;
                var6 ^= -1667067686;
            }

            long var32 = var6;
            var8 = var32 + 1L;
            var8 = var32 * var8;
            long var33 = var8 & 1L;
            long var63;
            var6 = (var63 = var33 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
            if (var6 == 0) {
                IllegalArgumentException var35 = new IllegalArgumentException();
                throw var35;
            }
        }

        IllegalArgumentException var44 = new IllegalArgumentException();
        throw var44;
    }

    public static void RQ(int var0) {
        int var1 = h;
        var1 ^= 1515054307;
        long var3 = var0;
        long var5 = var3 + 1L;
        var5 = var3 * var5;
        long var7 = var3 + 2L;
        var5 *= var7;
        var3 += 3L;
        var5 *= var3;
        var3 = var5 & 7L;
        long var32;
        int var26 = (var32 = var3 - 0L) == 0L ? 0 : (var32 < 0L ? -1 : 1);
        if (var26 != 0) {
            var1 >>>= 27;
            var1 ^= -726805366;
            var1 &= 791802468;
            var1 ^= -1559653497;
            var1 ^= 1042547775;
            Integer var27 = var0;
            if (var27 != null) {
                IllegalArgumentException var28 = new IllegalArgumentException();
                throw var28;
            }
        } else {
            var1 *= 1200199111;
            var1 *= -189332379;
            var1 -= -609176819;
            var1 ^= -1024054558;
            Integer var19 = var0;
            if (var19 != null) {
                MinecraftClient var21 = zp();
                GameOptions var22 = var21.options;
                SimpleOption var23 = var22.getMaxFps();
                Integer var2 = var0;
                var23.setValue(var2);
                return;
            }
        }

        IllegalArgumentException var20 = new IllegalArgumentException();
        throw var20;
    }

    public static void SF(boolean var0) {
        int var0i = var0 ? 1 : 0;
        label62: {
            GameOptions var48;
            Perspective var58;
            label61: {
                int var1 = h;
                var1 ^= -742613909;
                MinecraftClient var3 = zp();
                Integer var4 = Integer.valueOf(var0i);
                if (var4 != null) {
                    var1 -= -200510509;
                    var1 |= 2145195811;
                    var1 ^= 1075490217;
                    long var49 = var1;
                    long var6 = var49 + 1L;
                    var6 = var49 * var6;
                    long var50 = var6 & 1L;
                    long var67;
                    int var51 = (var67 = var50 - 0L) == 0L ? 0 : (var67 < 0L ? -1 : 1);
                    if (var51 != 0) {
                        break label62;
                    }

                    var48 = var3.options;
                    if (var0i != 0) {
                        var1 |= 911089273;
                        var1 *= 39951057;
                        var1 ^= -5356179;
                        int var52 = var1 + 1;
                        int var53 = var1 * var52;
                        int var5 = var1 + 2;
                        int var54 = var53 * var5;
                        var5 = var1 + 3;
                        int var55 = var54 * var5;
                        int var56 = var55 & 7;
                        if (var56 != 0) {
                            break label62;
                        }

                        var58 = Perspective.THIRD_PERSON_BACK;
                        Integer var60 = Integer.valueOf(var0i);
                        if (var60 != null) {
                            var1 *= 1643982639;
                            var1 ^= -1590275556;
                            var1 += 770483731;
                            var1 += -2064437708;
                            var1 ^= -1476592329;
                            var58 = var58;
                            var1 += -1027594132;
                            var1 *= 1910799567;
                            var1 ^= 405911517;
                            break label61;
                        }

                        switch (var1) {
                            case -1412372654:
                            default:
                                var1 ^= 15116301;
                                break;
                            case -647726910:
                                var1 ^= -610679111;
                                break;
                            case 2145330438:
                                var1 ^= 53672704;
                                var1 ^= -388084221;
                                var1 |= 874868666;
                                var1 += 1329176409;
                                var1 ^= 1799381146;
                        }
                    } else {
                        var1 = switch (var1) {
                            case -1812098256 -> var1 ^ 2103182958;
                            case -1077439974 -> {
                                var1 += 284691227;
                                yield var1 ^ -396994562;
                            }
                            default -> var1 ^ 1933173517;
                        };
                        Integer var61 = var1;
                        if (var61 == null) {
                            break label62;
                        }

                        Perspective var62 = Perspective.FIRST_PERSON;
                        var6 = var0i;
                        long var8 = var6 + 1L;
                        var8 = var6 * var8;
                        var6 = var8 & 1L;
                        long var68;
                        int var2 = (var68 = var6 - 0L) == 0L ? 0 : (var68 < 0L ? -1 : 1);
                        if (var2 == 0) {
                            var1 = switch (var1) {
                                case -81737927 -> var1 ^ 745868202;
                                default -> var1 ^ 348724958;
                                case 954845899 -> {
                                    var1 |= 564985679;
                                    var1 ^= -243739302;
                                    var1 += -112941997;
                                    var1 <<= 23;
                                    yield var1 ^ -900573224;
                                }
                            };
                            var58 = var62;
                            var1 >>= 14;
                            var1 -= -166803642;
                            var1 &= 604183890;
                            var1 ^= -1856392411;
                            break label61;
                        }

                        var1 &= -1913696380;
                        var1 ^= 1624814850;
                    }
                } else {
                    var1 *= -1668097445;
                    var1 ^= 1031185765;
                }

                int var46 = var1 + 1;
                var46 = var1 * var46;
                var1 = var46 & 1;
                if (var1 == 0) {
                    RuntimeException var45 = new RuntimeException();
                    throw var45;
                }
                break label62;
            }

            var48.setPerspective(var58);
            return;
        }

        IllegalStateException var44 = new IllegalStateException();
        throw var44;
    }

    public static void Pc(Entity var0) {
        label60: {
            int var1 = h;
            var1 ^= 968304264;
            int var2 = System.identityHashCode(var0);
            MinecraftClient var3 = zp();
            ClientPlayerEntity var46 = var3.player;
            long var4 = var2;
            long var6 = var4 + 1L;
            var6 = var4 * var6;
            long var8 = var4 + 2L;
            var6 *= var8;
            var4 += 3L;
            var6 *= var4;
            var4 = var6 & 7L;
            long var95;
            int var51 = (var95 = var4 - 0L) == 0L ? 0 : (var95 < 0L ? -1 : 1);
            if (var51 != 0) {
                switch (var1) {
                    case -718642285:
                        var1 ^= -858988963;
                        break;
                    case 413275526:
                        var1 -= 472460704;
                        var1 ^= 960188999;
                        break;
                    case 589760074:
                    default:
                        var1 ^= 2049949952;
                }
            } else {
                label59: {
                    var1 |= -869625252;
                    var1 ^= -2095305059;
                    var1 ^= -83177298;
                    var4 = var1;
                    var6 = var4 + 1L;
                    var6 = var4 * var6;
                    var4 = var6 & 1L;
                    long var96;
                    int var54 = (var96 = var4 - 0L) == 0L ? 0 : (var96 < 0L ? -1 : 1);
                    if (var54 != 0) {
                        break label60;
                    }

                    if (var46 != null) {
                        var1 ^= -2022977511;
                        var1 |= -1574255233;
                        var1 ^= 1630488468;
                        if (var0 != null) {
                            var1 |= -1512257108;
                            var1 -= 1182856563;
                            var1 *= 850299309;
                            var1 ^= -1218063760;
                            int var55 = var1 + 1;
                            int var56 = var1 * var55;
                            int var5 = var1 + 2;
                            int var57 = var56 * var5;
                            var5 = var1 + 3;
                            int var58 = var57 * var5;
                            int var59 = var58 & 7;
                            if (var59 != 0) {
                                break label60;
                            }

                            double var60 = var0.getX();
                            double var80 = var46.getX();
                            double var61 = var60 - var80;
                            double var81 = var0.getZ();
                            double var84 = var46.getZ();
                            double var82 = var81 - var84;
                            double var85 = var0.getY();
                            float var10 = var0.getHeight();
                            double var88 = var10;
                            double var89 = var88 * 0.7;
                            double var86 = var85 + var89;
                            double var90 = var46.getEyeY();
                            double var87 = var86 - var90;
                            double var91 = -var61;
                            double var92 = Math.atan2(var91, var82);
                            double var93 = Math.toDegrees(var92);
                            var10 = (float)var93;
                            double var62 = var61 * var61;
                            double var83 = var82 * var82;
                            double var63 = var62 + var83;
                            double var64 = Math.sqrt(var63);
                            double var65 = Math.atan2(var87, var64);
                            double var66 = Math.toDegrees(var65);
                            double var67 = -var66;
                            float var68 = (float)var67;
                            var46.setYaw(var10);
                            var46.setPitch(var68);
                            var46.lastYaw = var10;
                            var46.lastPitch = var68;
                            int var69 = var2 + 1;
                            int var70 = var2 * var69;
                            var5 = var2 + 2;
                            int var71 = var70 * var5;
                            var2 += 3;
                            int var72 = var71 * var2;
                            var2 = var72 & 7;
                            if (var2 == 0) {
                                var1 &= 1458704758;
                                var1 ^= 1256752436;
                                Integer var43 = var1;
                                if (var43 != null) {
                                    var46.setHeadYaw(var10);
                                    return;
                                }
                                break label60;
                            }

                            var1 ^= 588352696;
                            var1 ^= 1712167421;
                            var1 >>= 11;
                            var1 ^= -985619314;
                            break label59;
                        }

                        var1 |= -376003639;
                        var1 &= 1640434950;
                        var1 ^= 62027348;
                        var1 |= -1302973946;
                        var1 ^= -1887261765;
                    } else {
                        var1 |= -507898902;
                        var1 += -520050023;
                        var1 ^= -1152650651;
                    }

                    long var36 = var1;
                    long var47 = var36 + 1L;
                    long var48 = var36 * var47;
                    long var37 = var48 & 1L;
                    long var97;
                    var1 = (var97 = var37 - 0L) == 0L ? 0 : (var97 < 0L ? -1 : 1);
                    if (var1 == 0) {
                        return;
                    }
                    break label60;
                }
            }

            Integer var44 = var1;
            if (var44 != null) {
                AssertionError var45 = new AssertionError();
                throw var45;
            }
        }

        IllegalArgumentException var40 = new IllegalArgumentException();
        throw var40;
    }

    public static void xo(MatrixStack var0, RotationAxis var1, float var2) {
        int var3 = h;
        var3 ^= 890412868;
        int var4 = System.identityHashCode(var0);
        int var5 = var4 + 1;
        var5 = var4 * var5;
        int var6 = var4 + 2;
        var5 *= var6;
        var4 += 3;
        var5 *= var4;
        var4 = var5 & 7;
        var5 = of_2.qA;
        var3 ^= var5;
        var3 ^= -477106862;
        var5 = of_2.oz;
        var3 ^= var5;
        var3 ^= -1633129641;
        if (var4 != 0) {
            var3 -= 1908115772;
            var3 += 1810986702;
            var3 |= 1735308017;
            var3 ^= -1486948579;
            var4 = var3 + 1;
            var4 = var3 * var4;
            var4 &= 1;
            if (var4 == 0) {
                AssertionError var27 = new AssertionError();
                throw var27;
            }
        } else {
            var3 = switch (var3) {
                default -> var3 ^ -528460553;
                case 9287454 -> var3 ^ -286163094;
                case 336047178 -> {
                    var3 ^= -1852660071;
                    yield var3 ^ 1958289689;
                }
            };
            var4 = var3 + 1;
            var4 = var3 * var4;
            var5 = var3 + 2;
            var4 *= var5;
            var3 += 3;
            var4 *= var3;
            var3 = var4 & 7;
            if (var3 == 0) {
                Quaternionf var21 = var1.rotationDegrees(var2);
                var0.multiply(var21);
                return;
            }
        }

        UnsupportedOperationException var20 = new UnsupportedOperationException();
        throw var20;
    }

    public static void tv() {
        int var0 = h;
        var0 ^= -693450977;
        MinecraftClient var1 = zp();
        var0 += -1279093079;
        var0 += 1491904881;
        var0 -= -1524157185;
        var0 >>>= 29;
        var0 ^= -1852697790;
        int var2 = var0 + 1;
        var2 = var0 * var2;
        var2 &= 1;
        label34:
        if (var2 == 0) {
            Mouse var26 = var1.mouse;
            boolean var27 = var26.isCursorLocked();
            if (var27) {
                var0 = switch (var0) {
                    case -1852697792 -> {
                        var0 -= 57299905;
                        var0 &= -2008071780;
                        yield var0 ^ -1071926927;
                    }
                    default -> var0 ^ -991014941;
                    case 955080555 -> var0 ^ -1731737855;
                };
                var1 = zp();
                var0 -= 1824273892;
                var0 <<= 5;
                var0 |= 1161959430;
                var0 ^= -1211988772;
                Integer var34 = var0;
                if (var34 == null) {
                    break label34;
                }

                Mouse var29 = var1.mouse;
                var29.unlockCursor();
                var0 |= 1512015381;
                var0 |= 562196804;
                var0 &= 44622308;
                var0 |= 1683670232;
                var0 ^= -1183775910;
            } else {
                switch (var0) {
                    case -1852697792:
                        var0 ^= -909322298;
                        var0 += -1035003066;
                        var0 &= 1558104942;
                        var0 ^= -953733654;
                        break;
                    case -1404256885:
                        var0 ^= -298436254;
                        break;
                    case 370717523:
                    default:
                        var0 ^= 737649839;
                }
            }

            int var30 = var0 + 1;
            int var31 = var0 * var30;
            var0 = var31 & 1;
            if (var0 == 0) {
                return;
            }
        }

        AssertionError var25 = new AssertionError();
        throw var25;
    }

    public static void aS() {
        int var0 = h;
        var0 ^= 1389611582;
        MinecraftClient var1 = zp();
        var0 -= -818180018;
        var0 -= -1471330436;
        var0 ^= -664411894;
        Integer var6 = var0;
        if (var6 != null) {
            var1.scheduleStop();
        } else {
            UnsupportedOperationException var7 = new UnsupportedOperationException();
            throw var7;
        }
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = -1196801964;
        byte var2 = 0;
        int var4 = of_2.kj(var3, var1, var2);
        h = var4;
        Logger var5 = LoggerFactory.getLogger("auravisuals/compat");
        LOG = var5;
        HashMap var6 = new HashMap();
        Jq = var6;
        HashMap var7 = new HashMap();
        mh = var7;
        EquipmentSlot[] var8 = new EquipmentSlot[4];
        EquipmentSlot var11 = EquipmentSlot.HEAD;
        var8[0] = var11;
        EquipmentSlot var12 = EquipmentSlot.CHEST;
        var8[1] = var12;
        EquipmentSlot var13 = EquipmentSlot.LEGS;
        var8[2] = var13;
        EquipmentSlot var14 = EquipmentSlot.FEET;
        var8[3] = var14;
        F = var8;
        Mutable var9 = new Mutable();
        W = var9;
        w_2 var10 = new w_2();
        CO = var10;
    }

    private static Throwable N(Throwable var0) {
        int var1 = System.identityHashCode(var0);
        return var0;
    }
}
