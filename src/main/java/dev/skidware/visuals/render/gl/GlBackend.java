package dev.skidware.visuals.render.gl;

import dev.aurap.hub.Pm;
import dev.aurap.hub.dS;
import dev.aurap.hub.zT;
import dev.skidware.visuals.render.RenderTarget;
import dev.skidware.visuals.render.canvas.DrawList;
import dev.skidware.visuals.render.canvas.DrawList$Command;
import dev.skidware.visuals.render.canvas.SpriteShape;
import dev.skidware.visuals.render.canvas.TextureRef;
import dev.skidware.visuals.render.fx.ScreenEffects;
import dev.skidware.visuals.render.fx.VelocityBlur;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL33C;

public final class GlBackend implements AutoCloseable {
    private final GlCaps caps;
    private final GlState saved;
    private final GlFramebuffer colorTarget = GlFramebuffer.proxy();
    private final GlFramebuffer depthTarget = GlFramebuffer.proxy();
    private final BlurChain blur = new BlurChain();
    private final MotionBuffers motion = new MotionBuffers();
    private GlFramebuffer scratch;
    private GlProgram shape;
    private GlProgram kawaseDown;
    private GlProgram kawaseUp;
    private GlProgram screenFx;
    private GlProgram motionVelocity;
    private GlProgram motionFrames;
    private GlProgram motionAccum;
    private String motionError;
    private final Map watermark = new LinkedHashMap();
    private int shapeVao;
    private int emptyVao;
    private int instanceVbo;
    private int vboCapacity;
    private int samplerLinear;
    private int samplerNearest;
    private int backdropTexture;
    private GlTexture gamutTable;
    private GpuTimer timer;
    public int lastDrawCalls;
    public int lastBackdrops;

    public GlBackend(GlCaps caps) {
        this.caps = caps;
        this.saved = new GlState(caps.samplers());
    }

    public void setWatermark(Map defines) {
        this.watermark.clear();
        if (defines != null) {
            this.watermark.putAll(defines);
        }
    }

    public void init(ShaderSources sources) {
        this.initGl();
        this.compileAll(sources);
    }

    public void initGl() {
        this.shapeVao = GL33C.glGenVertexArrays();
        this.emptyVao = GL33C.glGenVertexArrays();
        this.instanceVbo = GL33C.glGenBuffers();
        if (this.caps.samplers()) {
            this.samplerLinear = sampler(9729);
            this.samplerNearest = sampler(9728);
        }

        if (this.caps.timerQuery()) {
            this.timer = new GpuTimer();
        }

        int prevVao = GL33C.glGetInteger(34229);
        int prevVbo = GL33C.glGetInteger(34964);
        GL33C.glBindVertexArray(this.shapeVao);
        GL33C.glBindBuffer(34962, this.instanceVbo);

        for (int loc = 0; loc <= 12; loc++) {
            GL33C.glEnableVertexAttribArray(loc);
            this.caps.vertexAttribDivisor(loc, 1);
        }

        pointAttributes(0);
        GL33C.glBindVertexArray(prevVao);
        GL33C.glBindBuffer(34962, prevVbo);
    }

    public void compileAll(ShaderSources sources) {
        Map<String, String> defines = new LinkedHashMap<>();
        defines.put("TYPE_RRECT", Integer.toString(0));
        defines.put("TYPE_SHADOW", Integer.toString(1));
        defines.put("TYPE_ARC", Integer.toString(2));
        defines.put("TYPE_SEGMENT", Integer.toString(3));
        defines.put("TYPE_GLYPH", Integer.toString(4));
        defines.put("TYPE_IMAGE", Integer.toString(5));
        defines.put("TYPE_BACKDROP", Integer.toString(6));
        defines.put("TYPE_GLASS", Integer.toString(7));
        defines.put("TYPE_SPRITE", Integer.toString(8));
        defines.put("TYPE_QUAD", Integer.toString(9));

        for (SpriteShape shape : SpriteShape.values()) {
            defines.put("SPRITE_" + shape.name(), Integer.toString(shape.ordinal()));
        }

        for (int i = 0; i < 4; i++) {
            defines.putIfAbsent("AURA_WM" + i, "0.0");
        }

        defines.putAll(this.watermark);
        boolean initial = this.shape == null;
        List<GlProgram> core = new ArrayList<>(4);
        List<GlProgram> motionPrograms = new ArrayList<>(3);
        String motionFailure = null;

        ShaderSources$Source fullscreen;
        try {
            fullscreen = sources.load("fullscreen.vsh", Map.of());
            core.add(
                GlProgram.link(
                    "shape",
                    sources.load("shape.vsh", defines),
                    sources.load("shape.fsh", defines),
                    "a_rect",
                    "a_radii",
                    "a_xform",
                    "a_trans",
                    "a_color0",
                    "a_color1",
                    "a_paint",
                    "a_uv",
                    "a_clip",
                    "a_ext",
                    "a_plane0",
                    "a_plane1",
                    "a_plane2"
                )
            );
            core.add(GlProgram.link("kawase_down", fullscreen, sources.load("kawase_down.fsh", Map.of())));
            core.add(GlProgram.link("kawase_up", fullscreen, sources.load("kawase_up.fsh", Map.of())));
            core.add(GlProgram.link("screen_fx", fullscreen, sources.load("screen_fx.fsh", Map.of())));
        } catch (RuntimeException var13) {
            for (GlProgram p : core) {
                p.close();
            }

            throw var13;
        }

        try {
            motionPrograms.add(GlProgram.link("motion_velocity", fullscreen, sources.load("motion_velocity.fsh", Map.of())));
            motionPrograms.add(GlProgram.link("motion_frames", fullscreen, sources.load("motion_frames.fsh", Map.of())));
            motionPrograms.add(GlProgram.link("motion_accum", fullscreen, sources.load("motion_accum.fsh", Map.of())));
        } catch (RuntimeException var14) {
            for (GlProgram p : motionPrograms) {
                p.close();
            }

            motionPrograms.clear();
            if (!initial) {
                for (GlProgram p : core) {
                    p.close();
                }

                throw var14;
            }

            motionFailure = var14.getMessage();
        }

        List<GlProgram> retired = new ArrayList<>(7);
        if (!initial) {
            retired.add(this.shape);
            retired.add(this.kawaseDown);
            retired.add(this.kawaseUp);
            retired.add(this.screenFx);
        }

        if (!motionPrograms.isEmpty() && this.motionVelocity != null) {
            retired.add(this.motionVelocity);
            retired.add(this.motionFrames);
            retired.add(this.motionAccum);
        }

        int current = GL33C.glGetInteger(35725);
        boolean ours = false;

        for (GlProgram p : retired) {
            ours |= current == p.id();
            p.close();
        }

        if (ours) {
            GL33C.glUseProgram(0);
        }

        this.shape = core.get(0);
        this.kawaseDown = core.get(1);
        this.kawaseUp = core.get(2);
        this.screenFx = core.get(3);
        if (!motionPrograms.isEmpty()) {
            this.motionVelocity = motionPrograms.get(0);
            this.motionFrames = motionPrograms.get(1);
            this.motionAccum = motionPrograms.get(2);
            this.motionError = null;
        } else if (initial) {
            this.motionError = motionFailure;
        }
    }

    public String motionBlurError() {
        return this.motionError;
    }

    private static int sampler(int filter) {
        int s = GL33C.glGenSamplers();
        GL33C.glSamplerParameteri(s, 10241, filter);
        GL33C.glSamplerParameteri(s, 10240, filter);
        GL33C.glSamplerParameteri(s, 10242, 33071);
        GL33C.glSamplerParameteri(s, 10243, 33071);
        return s;
    }

    private static void pointAttributes(int firstInstance) {
        long base = firstInstance * 184L;
        int s = 184;
        GL33C.glVertexAttribPointer(0, 4, 5126, false, s, base);
        GL33C.glVertexAttribPointer(1, 4, 5126, false, s, base + 16L);
        GL33C.glVertexAttribPointer(2, 4, 5126, false, s, base + 32L);
        GL33C.glVertexAttribPointer(3, 4, 5126, false, s, base + 48L);
        GL33C.glVertexAttribPointer(4, 4, 5121, true, s, base + 64L);
        GL33C.glVertexAttribPointer(5, 4, 5121, true, s, base + 68L);
        GL33C.glVertexAttribPointer(6, 4, 5126, false, s, base + 72L);
        GL33C.glVertexAttribPointer(7, 4, 5126, false, s, base + 88L);
        GL33C.glVertexAttribPointer(8, 4, 5126, false, s, base + 104L);
        GL33C.glVertexAttribPointer(9, 4, 5126, false, s, base + 120L);
        GL33C.glVertexAttribPointer(10, 4, 5126, false, s, base + 136L);
        GL33C.glVertexAttribPointer(11, 4, 5126, false, s, base + 152L);
        GL33C.glVertexAttribPointer(12, 4, 5126, false, s, base + 168L);
    }

    public void execute(DrawList list, RenderTarget rt, boolean timed) {
        this.lastDrawCalls = 0;
        this.lastBackdrops = 0;
        if (list.instanceCount() != 0 && rt.isValid()) {
            this.saved.capture();

            try {
                if (timed && this.timer != null) {
                    this.timer.begin();
                }

                this.saved.applyOverlayDefaults();
                boolean depth = rt.depthTexture() > 0;
                GlFramebuffer target = depth ? this.depthTarget : this.colorTarget;
                target.attach(rt.colorTexture(), rt.depthTexture(), rt.width(), rt.height());
                if (depth) {
                    GL33C.glEnable(2929);
                    GL33C.glDepthFunc(rt.reversedDepth() ? 518 : 515);
                    GL33C.glDepthMask(false);
                }

                this.upload(list.data());
                GL33C.glBindVertexArray(this.shapeVao);
                GL33C.glBindBuffer(34962, this.instanceVbo);

                for (DrawList$Command cmd : list.commands()) {
                    if (cmd.kind == 1) {
                        GL33C.glActiveTexture(33984);
                        this.bindSampler(0, this.samplerLinear);
                        this.backdropTexture = this.blur.capture(target, cmd.blurLevel, this.kawaseDown, this.kawaseUp, this.emptyVao);
                        this.lastBackdrops++;
                    } else if (cmd.count() != 0) {
                        target.bind();
                        GL33C.glBindVertexArray(this.shapeVao);
                        this.shape.use();
                        this.shape.set2f("u_viewport", rt.width(), rt.height());
                        this.shape.set1i("u_texture", 0);
                        this.shape.set1i("u_backdrop", 1);
                        TextureRef tex = cmd.texture();
                        GL33C.glActiveTexture(33984);
                        GL33C.glBindTexture(3553, tex != null ? tex.glId() : 0);
                        this.bindSampler(0, cmd.linear() ? this.samplerLinear : this.samplerNearest);
                        GL33C.glActiveTexture(33985);
                        GL33C.glBindTexture(3553, this.backdropTexture);
                        this.bindSampler(1, this.samplerLinear);
                        GL33C.glActiveTexture(33984);
                        pointAttributes(cmd.first);
                        GL33C.glDrawArraysInstanced(5, 0, 4, cmd.count());
                        this.lastDrawCalls++;
                    }
                }
            } finally {
                if (timed && this.timer != null) {
                    this.timer.end();
                }

                this.saved.restore();
            }
        }
    }

    private void bindSampler(int unit, int sampler) {
        if (this.caps.samplers()) {
            GL33C.glBindSampler(unit, sampler);
        }
    }

    private void upload(ByteBuffer data) {
        int size = data.remaining();
        GL33C.glBindBuffer(34962, this.instanceVbo);
        if (size > this.vboCapacity) {
            this.vboCapacity = Math.max(size, this.vboCapacity * 2);
            GL33C.glBufferData(34962, this.vboCapacity, 35040);
        } else {
            GL33C.glBufferData(34962, this.vboCapacity, 35040);
        }

        GL33C.glBufferSubData(34962, 0L, data);
    }

    public void applyScreenEffects(ScreenEffects fx, RenderTarget rt) {
        if (fx.isActive() && rt.isValid()) {
            this.saved.capture();

            try {
                this.saved.applyOverlayDefaults();
                this.colorTarget.attach(rt.colorTexture(), 0, rt.width(), rt.height());
                GlFramebuffer scene = this.scratch(rt.width(), rt.height());
                copy(this.colorTarget, scene, rt.width(), rt.height());
                this.colorTarget.bind();
                GL33C.glDisable(3042);
                GL33C.glBindVertexArray(this.emptyVao);
                this.screenFx.use();
                Pm display = fx.displayGrade();
                this.screenFx.set1i("u_displayGrade", display.LR() ? 0 : 1);
                this.screenFx.set3f("u_displayControls", display.U(), display.w(), display.I());
                zT grade = fx.colorGrade();
                boolean grading = !grade.OP();
                this.screenFx.set1i("u_grade", grading ? 1 : 0);
                if (grading) {
                    this.screenFx.set4f("u_gradeTone", grade.j(), grade.qA(), 0.5646216F, 4.0F);
                    this.screenFx.set3f("u_gradeColor", grade.V(), grade.O(), 0.9F);
                    this.screenFx.set1i("u_gamut", 1);
                    GL33C.glActiveTexture(33985);
                    GL33C.glBindTexture(3553, this.gamutTable().id());
                    this.bindSampler(1, 0);
                }

                GL33C.glActiveTexture(33984);
                GL33C.glBindTexture(3553, scene.colorTexture());
                this.bindSampler(0, this.samplerLinear);
                this.screenFx.set1i("u_scene", 0);
                this.screenFx.set2f("u_resolution", rt.width(), rt.height());
                this.screenFx.set4f("u_vignette", fx.vignetteR(), fx.vignetteG(), fx.vignetteB(), fx.vignette());
                this.screenFx.set2f("u_vignetteShape", fx.vignetteInner(), fx.vignetteOuter());
                this.screenFx.set1f("u_aberration", fx.aberration());
                this.screenFx.set1f("u_saturation", fx.saturation());
                int fc = fx.flashColor();
                this.screenFx.set4f("u_flash", (fc >> 16 & 0xFF) / 255.0F, (fc >> 8 & 0xFF) / 255.0F, (fc & 0xFF) / 255.0F, fx.flash());
                GL33C.glDrawArrays(4, 0, 3);
            } finally {
                this.saved.restore();
            }
        }
    }

    private GlTexture gamutTable() {
        if (this.gamutTable == null) {
            this.gamutTable = GlTexture.lookupTable(256, 128, dS.Tw(), true);
        }

        return this.gamutTable;
    }

    public void applyVelocityBlur(VelocityBlur blur, RenderTarget rt) {
        if (this.motionVelocity != null && rt.isValid() && rt.depthTexture() > 0) {
            this.saved.capture();

            try {
                this.saved.applyOverlayDefaults();
                GL33C.glDisable(3042);
                int w = rt.width();
                int h = rt.height();
                this.colorTarget.attach(rt.colorTexture(), 0, w, h);
                GlFramebuffer scene = this.scratch(w, h);
                copy(this.colorTarget, scene, w, h);
                this.colorTarget.bind();
                GL33C.glBindVertexArray(this.emptyVao);
                GlProgram p = this.motionVelocity;
                p.use();
                p.set1i("u_scene", 0);
                p.set1i("u_depth", 1);
                p.setMatrix4("u_reproject", blur.reprojection());
                p.set2f("u_resolution", w, h);
                p.set1f("u_strength", blur.strength());
                p.set1i("u_samples", blur.samples());
                p.set1i("u_weighted", blur.weighted() ? 1 : 0);
                p.set1i("u_mode", blur.mode().ordinal());
                p.set1i("u_reversed", rt.reversedDepth() ? 1 : 0);
                p.set1i("u_zeroToOne", this.depthZeroToOne() ? 1 : 0);
                GL33C.glActiveTexture(33984);
                GL33C.glBindTexture(3553, scene.colorTexture());
                this.bindSampler(0, this.samplerNearest);
                GL33C.glActiveTexture(33985);
                GL33C.glBindTexture(3553, rt.depthTexture());
                this.bindSampler(1, this.samplerNearest);
                GL33C.glActiveTexture(33984);
                GL33C.glDrawArrays(4, 0, 3);
            } finally {
                this.saved.restore();
            }
        }
    }

    private boolean depthZeroToOne() {
        return this.caps.clipControl() && GL33C.glGetInteger(37725) == 37727;
    }

    public boolean ensureFrameHistory(int w, int h, int layers) {
        if (this.motionFrames == null) {
            return false;
        } else {
            this.saved.capture();

            boolean var4;
            try {
                var4 = this.motion.ensureHistory(w, h, layers);
            } finally {
                this.saved.restore();
            }

            return var4;
        }
    }

    public void storeFrame(RenderTarget rt, int layer) {
        if (this.motion.historyTexture() != 0 && rt.isValid()) {
            this.saved.capture();

            try {
                this.colorTarget.attach(rt.colorTexture(), 0, rt.width(), rt.height());
                this.motion.storeFrame(this.colorTarget.id(), layer, rt.width(), rt.height());
            } finally {
                this.saved.restore();
            }
        }
    }

    public void blendFrames(RenderTarget rt, float[] layers, float[] weights, int count, float inverseTotalWeight) {
        if (this.motionFrames != null && this.motion.historyTexture() != 0 && rt.isValid() && count > 1) {
            this.saved.capture();

            try {
                this.saved.applyOverlayDefaults();
                GL33C.glDisable(3042);
                this.colorTarget.attach(rt.colorTexture(), 0, rt.width(), rt.height());
                this.colorTarget.bind();
                GL33C.glBindVertexArray(this.emptyVao);
                GlProgram p = this.motionFrames;
                p.use();
                p.set1i("u_history", 0);
                p.set1fv("u_layers", layers);
                p.set1fv("u_weights", weights);
                p.set1i("u_count", count);
                p.set1f("u_invTotal", inverseTotalWeight);
                GL33C.glActiveTexture(33984);
                GL33C.glBindTexture(35866, this.motion.historyTexture());
                this.bindSampler(0, this.samplerNearest);
                GL33C.glDrawArrays(4, 0, 3);
            } finally {
                this.saved.restore();
            }
        }
    }

    public void accumulate(RenderTarget rt, float factor, boolean max) {
        if (this.motionAccum != null && rt.isValid()) {
            this.saved.capture();

            try {
                this.saved.applyOverlayDefaults();
                GL33C.glDisable(3042);
                int w = rt.width();
                int h = rt.height();
                this.colorTarget.attach(rt.colorTexture(), 0, w, h);
                if (this.motion.ensureAccumulation(w, h)) {
                    GlFramebuffer out = this.motion.accumWrite();
                    out.bind();
                    GL33C.glBindVertexArray(this.emptyVao);
                    GlProgram p = this.motionAccum;
                    p.use();
                    p.set1i("u_current", 0);
                    p.set1i("u_previous", 1);
                    p.set1f("u_factor", factor);
                    p.set1i("u_max", max ? 1 : 0);
                    GL33C.glActiveTexture(33984);
                    GL33C.glBindTexture(3553, rt.colorTexture());
                    this.bindSampler(0, this.samplerNearest);
                    GL33C.glActiveTexture(33985);
                    GL33C.glBindTexture(3553, this.motion.accumRead().colorTexture());
                    this.bindSampler(1, this.samplerNearest);
                    GL33C.glActiveTexture(33984);
                    GL33C.glDrawArrays(4, 0, 3);
                    copy(out, this.colorTarget, w, h);
                    this.motion.swapAccumulation();
                    return;
                }

                copy(this.colorTarget, this.motion.accumRead(), w, h);
                this.motion.primeAccumulation();
            } finally {
                this.saved.restore();
            }
        }
    }

    public void restartAccumulation() {
        this.motion.restartAccumulation();
    }

    public void releaseMotionBuffers(boolean history, boolean accumulation) {
        this.saved.capture();

        try {
            if (history) {
                this.motion.releaseHistory();
            }

            if (accumulation) {
                this.motion.releaseAccumulation();
            }
        } finally {
            this.saved.restore();
        }
    }

    private GlFramebuffer scratch(int w, int h) {
        if (this.scratch == null) {
            this.scratch = GlFramebuffer.owned(w, h);
        } else {
            this.scratch.resize(w, h);
        }

        return this.scratch;
    }

    private static void copy(GlFramebuffer from, GlFramebuffer to, int w, int h) {
        GL33C.glBindFramebuffer(36008, from.id());
        GL33C.glBindFramebuffer(36009, to.id());
        GL33C.glBlitFramebuffer(0, 0, w, h, 0, 0, w, h, 16384, 9728);
    }

    public ByteBuffer readPixels(RenderTarget rt) {
        ByteBuffer out = ByteBuffer.allocateDirect(rt.width() * rt.height() * 4);
        this.saved.capture();

        try {
            this.colorTarget.attach(rt.colorTexture(), 0, rt.width(), rt.height());
            GL33C.glBindFramebuffer(36008, this.colorTarget.id());
            GL33C.glBindBuffer(35051, 0);
            GL33C.glPixelStorei(3333, 1);
            GL33C.glReadPixels(0, 0, rt.width(), rt.height(), 6408, 5121, out);
        } finally {
            this.saved.restore();
        }

        int row = rt.width() * 4;
        byte[] a = new byte[row];
        byte[] b = new byte[row];

        for (int y = 0; y < rt.height() / 2; y++) {
            int top = y * row;
            int bottom = (rt.height() - 1 - y) * row;
            out.get(top, a);
            out.get(bottom, b);
            out.put(top, b);
            out.put(bottom, a);
        }

        return out;
    }

    public double gpuMs() {
        return this.timer == null ? 0.0 : this.timer.smoothedMs();
    }

    @Override
    public void close() {
        if (this.shape != null) {
            this.shape.close();
            this.kawaseDown.close();
            this.kawaseUp.close();
            this.screenFx.close();
        }

        if (this.motionVelocity != null) {
            this.motionVelocity.close();
            this.motionFrames.close();
            this.motionAccum.close();
        }

        this.motion.close();
        if (this.gamutTable != null) {
            this.gamutTable.close();
        }

        this.colorTarget.close();
        this.depthTarget.close();
        this.blur.close();
        if (this.scratch != null) {
            this.scratch.close();
        }

        if (this.timer != null) {
            this.timer.close();
        }

        GL33C.glDeleteVertexArrays(this.shapeVao);
        GL33C.glDeleteVertexArrays(this.emptyVao);
        GL33C.glDeleteBuffers(this.instanceVbo);
        if (this.caps.samplers()) {
            GL33C.glDeleteSamplers(this.samplerLinear);
            GL33C.glDeleteSamplers(this.samplerNearest);
        }
    }
}
