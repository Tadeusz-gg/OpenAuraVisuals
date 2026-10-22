package dev.skidware.visuals.render;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.SdfCanvas;
import dev.skidware.visuals.render.content.ContentWatermark;
import dev.skidware.visuals.render.fx.ScreenEffects;
import dev.skidware.visuals.render.fx.VelocityBlur;
import dev.skidware.visuals.render.gl.GlBackend;
import dev.skidware.visuals.render.gl.GlCaps;
import dev.skidware.visuals.render.gl.GlTexture;
import dev.skidware.visuals.render.gl.ShaderSources;
import dev.skidware.visuals.render.image.RgbaImage;
import dev.skidware.visuals.render.resource.ResourceSource;
import dev.skidware.visuals.render.text.Font;
import dev.skidware.visuals.render.text.FontFamily;
import dev.skidware.visuals.render.text.FontWeight;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AuraRenderer implements AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger("auravisuals/render");
    private final ResourceSource resources;
    private final RenderStats stats = new RenderStats();
    private final ScreenEffects screenEffects = new ScreenEffects();
    private GlBackend backend;
    private FontFamily fonts;
    private SdfCanvas canvas;
    private RenderTarget target;
    private boolean recording;
    private AuraRenderer$State state = AuraRenderer$State.UNINITIALIZED;
    private String status = "not initialized";
    private String motionFailure;
    private boolean timing;
    private boolean locked;
    private String lockReason = "";
    private volatile Map content;
    private volatile byte[] contentCopyId;
    private volatile boolean contentReady;
    private volatile boolean contentRecompile;
    private boolean glReady;

    public AuraRenderer(ResourceSource resources) {
        this.resources = resources;
    }

    public FontFamily fonts() {
        if (this.fonts == null) {
            this.fonts = FontFamily.load(
                "inter-display", w -> this.resources.read("assets/auravisuals/aura/fonts/inter-display-" + w.name().toLowerCase(Locale.ROOT) + ".ttf")
            );
        }

        return this.fonts;
    }

    public Font font() {
        return this.fonts().face(FontWeight.REGULAR);
    }

    public AuraRenderer$State state() {
        return this.state;
    }

    public String status() {
        return this.status;
    }

    public RenderStats stats() {
        return this.stats;
    }

    public ScreenEffects screenEffects() {
        return this.screenEffects;
    }

    public void setTiming(boolean timing) {
        this.timing = timing;
    }

    public void setLocked(boolean locked, String reason) {
        this.locked = locked;
        this.lockReason = reason == null ? "" : reason;
    }

    public boolean locked() {
        return this.locked;
    }

    public String lockReason() {
        return this.lockReason;
    }

    public void publishContent(Map shaders, byte[] copyId) {
        if (shaders != null && !shaders.isEmpty()) {
            this.content = Map.copyOf(shaders);
            this.contentCopyId = copyId == null ? null : (byte[])copyId.clone();
            if (this.state == AuraRenderer$State.READY) {
                this.contentRecompile = true;
            }

            this.contentReady = true;
        } else {
            this.revokeContent();
        }
    }

    public void revokeContent() {
        this.content = null;
        this.contentCopyId = null;
        this.contentReady = false;
    }

    public boolean contentReady() {
        return this.contentReady;
    }

    private ResourceSource shaderResources() {
        Map<String, byte[]> map = this.content;
        return map == null ? this.resources : path -> {
            byte[] bytes = map.get(path);
            return bytes != null ? bytes : this.resources.read(path);
        };
    }

    private Map watermarkDefines() {
        byte[] id = this.contentCopyId;
        return id != null ? ContentWatermark.defines(id) : ContentWatermark.zero();
    }

    public void disable(String reason) {
        if (this.state != AuraRenderer$State.DISABLED) {
            this.state = AuraRenderer$State.DISABLED;
            this.status = reason;
            LOG.warn("Aura Render disabled: {}", reason);
        }
    }

    private boolean ensureGl() {
        if (this.state == AuraRenderer$State.DISABLED) {
            return false;
        } else if (this.glReady) {
            return true;
        } else if (Boolean.getBoolean("auravisuals.render.disable")) {
            this.disable("disabled by -Dauravisuals.render.disable");
            return false;
        } else {
            try {
                GlCaps caps = GlCaps.detect();
                String unsupported = caps.unsupportedReason();
                if (unsupported != null) {
                    this.disable(unsupported);
                    return false;
                } else {
                    this.canvas = new SdfCanvas(this.fonts());
                    this.backend = new GlBackend(caps);
                    this.backend.initGl();
                    this.glReady = true;
                    this.status = "gl ready (" + caps.describe() + "), waiting for the shader package";
                    return true;
                }
            } catch (Throwable var3) {
                this.disable("initialization failed: " + var3.getMessage());
                LOG.error("Aura Render initialization failed", var3);
                return false;
            }
        }
    }

    private boolean ensureReady() {
        if (!this.ensureGl()) {
            return false;
        } else if (!this.contentReady) {
            this.status = this.locked ? "locked: " + this.lockReason : "locked: waiting for the shader package";
            return false;
        } else if (this.state == AuraRenderer$State.READY) {
            if (this.contentRecompile) {
                this.contentRecompile = false;

                try {
                    this.backend.setWatermark(this.watermarkDefines());
                    this.backend.compileAll(new ShaderSources(this.shaderResources()));
                    this.motionFailure = null;
                } catch (Throwable var2) {
                    this.disable("content recompile failed: " + var2);
                    return false;
                }
            }

            return true;
        } else {
            try {
                this.backend.setWatermark(this.watermarkDefines());
                this.backend.compileAll(new ShaderSources(this.shaderResources()));
                if (this.backend.motionBlurError() != null) {
                    LOG.error("Motion blur shaders failed to compile; motion blur is unavailable:\n{}", this.backend.motionBlurError());
                }

                this.state = AuraRenderer$State.READY;
                this.status = "ready";
                LOG.info("Aura Render initialized");
                return true;
            } catch (Throwable var3) {
                this.disable("shader package compile failed: " + var3.getMessage());
                LOG.error("Aura Render shader compile failed", var3);
                return false;
            }
        }
    }

    public void beginFrame() {
        this.stats.reset();
        this.stats.frames++;
        this.screenEffects.reset();
    }

    public Canvas begin(RenderTarget target, float logicalScale) {
        if (this.recording) {
            throw new IllegalStateException("begin() called twice without end()");
        } else if (target.isValid() && this.ensureReady()) {
            this.target = target;
            this.canvas.begin(target.width() / logicalScale, target.height() / logicalScale, logicalScale);
            this.recording = true;
            return this.canvas;
        } else {
            return null;
        }
    }

    public void end() {
        if (this.recording) {
            this.recording = false;
            long t0 = System.nanoTime();

            try {
                this.canvas.checkBalanced();
            } catch (IllegalStateException var5) {
                LOG.error("Unbalanced canvas state in a render pass", var5);
            }

            try {
                this.backend.execute(this.canvas.drawList(), this.target, this.timing);
                this.stats.instances = this.stats.instances + this.canvas.drawList().instanceCount();
                this.stats.drawCalls = this.stats.drawCalls + this.backend.lastDrawCalls;
                this.stats.backdropCaptures = this.stats.backdropCaptures + this.backend.lastBackdrops;
                this.stats.passes++;
            } catch (Throwable var4) {
                this.disable("GPU submission failed: " + var4);
                LOG.error("Aura Render pass failed", var4);
            }

            this.stats.cpuMs = this.stats.cpuMs + (System.nanoTime() - t0) / 1000000.0;
            this.stats.gpuMs = this.backend == null ? 0.0 : this.backend.gpuMs();
        }
    }

    public void applyScreenEffects(RenderTarget target) {
        if (this.screenEffects.isActive() && this.ensureReady()) {
            try {
                this.backend.applyScreenEffects(this.screenEffects, target);
            } catch (Throwable var3) {
                this.disable("screen effects failed: " + var3);
                LOG.error("Screen effects failed", var3);
            }
        }
    }

    public boolean motionBlurAvailable() {
        return this.ensureReady() && this.backend.motionBlurError() == null && this.motionFailure == null;
    }

    public String motionBlurStatus() {
        if (!this.ensureReady()) {
            return this.status;
        } else {
            return this.backend.motionBlurError() != null ? "shaders rejected: " + this.backend.motionBlurError() : this.motionFailure;
        }
    }

    public void velocityBlur(RenderTarget target, VelocityBlur blur) {
        if (this.motionBlurAvailable()) {
            try {
                this.backend.applyVelocityBlur(blur, target);
            } catch (Throwable var4) {
                this.motionFailed(var4);
            }
        }
    }

    public boolean ensureFrameHistory(int width, int height, int layers) {
        if (!this.motionBlurAvailable()) {
            return false;
        } else {
            try {
                return this.backend.ensureFrameHistory(width, height, layers);
            } catch (Throwable var5) {
                this.motionFailed(var5);
                return false;
            }
        }
    }

    public void storeFrame(RenderTarget target, int layer) {
        if (this.motionBlurAvailable()) {
            try {
                this.backend.storeFrame(target, layer);
            } catch (Throwable var4) {
                this.motionFailed(var4);
            }
        }
    }

    public void blendFrames(RenderTarget target, float[] layers, float[] weights, int count, float inverseTotalWeight) {
        if (this.motionBlurAvailable()) {
            try {
                this.backend.blendFrames(target, layers, weights, count, inverseTotalWeight);
            } catch (Throwable var7) {
                this.motionFailed(var7);
            }
        }
    }

    public void accumulate(RenderTarget target, float factor, boolean max) {
        if (this.motionBlurAvailable()) {
            try {
                this.backend.accumulate(target, factor, max);
            } catch (Throwable var5) {
                this.motionFailed(var5);
            }
        }
    }

    public void restartAccumulation() {
        if (this.backend != null) {
            this.backend.restartAccumulation();
        }
    }

    public void releaseMotionBuffers(boolean history, boolean accumulation) {
        if (this.state == AuraRenderer$State.READY) {
            try {
                this.backend.releaseMotionBuffers(history, accumulation);
            } catch (Throwable var4) {
                this.motionFailed(var4);
            }
        }
    }

    private void motionFailed(Throwable t) {
        this.motionFailure = "pass failed: " + t;
        LOG.error("Motion blur pass failed; motion blur is off until /aura reload", t);
    }

    public String reloadShaders() {
        if (!this.ensureReady()) {
            return this.status;
        } else {
            try {
                this.backend.setWatermark(this.watermarkDefines());
                this.backend.compileAll(new ShaderSources(this.shaderResources()));
                this.motionFailure = null;
                return null;
            } catch (Throwable var2) {
                LOG.error("Shader reload failed", var2);
                return var2.getMessage();
            }
        }
    }

    public void textureSize(int textureId, int[] out) {
        out[0] = out[1] = 0;
        if (textureId > 0 && this.ensureGl()) {
            GlTexture.querySize(textureId, out);
        }
    }

    public int createImage(RgbaImage image) {
        if (!this.ensureGl()) {
            return 0;
        } else {
            ByteBuffer pixels = MemoryUtil.memAlloc(image.pixels().length);

            int var3;
            try {
                pixels.put(image.pixels()).flip();
                var3 = GlTexture.createRgba(image.width(), image.height(), pixels);
            } finally {
                MemoryUtil.memFree(pixels);
            }

            return var3;
        }
    }

    public void deleteImage(int textureId) {
        if (textureId > 0 && this.glReady && this.state != AuraRenderer$State.DISABLED) {
            GlTexture.delete(textureId);
        }
    }

    public ByteBuffer readPixels(RenderTarget target) {
        return !this.ensureGl() ? null : this.backend.readPixels(target);
    }

    @Override
    public void close() {
        if (this.backend != null) {
            this.backend.close();
        }

        if (this.fonts != null) {
            this.fonts.close();
        }
    }
}
