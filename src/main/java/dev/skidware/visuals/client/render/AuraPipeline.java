package dev.skidware.visuals.client.render;

import dev.aurap.hub.EventBus;
import dev.aurap.hub.RenderEvent;
import dev.aurap.hub.ClientRuntime;
import dev.aurap.hub.i_2;
import dev.aurap.hub.pT;
import dev.aurap.hub.p_2;
import dev.skidware.visuals.render.AuraRenderer;
import dev.skidware.visuals.render.RenderTarget;
import dev.skidware.visuals.render.canvas.Canvas;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.joml.Matrix4fc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AuraPipeline {
    private static final Logger LOG = LoggerFactory.getLogger("auravisuals/pipeline");
    private final ClientRuntime aura;
    private final FrameContext frame = new FrameContext();
    private final Projection projection = new Projection();
    private final WorldDraw world = new WorldDraw(this.projection);
    private final float[] levelProjection = new float[16];
    private boolean hasLevelProjection;
    private final List frameEndHooks = new ArrayList();
    private boolean underlayDone;
    private boolean terrainDone;
    private boolean warnedBackend;

    public AuraPipeline(ClientRuntime aura) {
        this.aura = aura;
    }

    public FrameContext frame() {
        return this.frame;
    }

    public Projection projection() {
        return this.projection;
    }

    public WorldDraw world() {
        return this.world;
    }

    public void onNextFrameEnd(Consumer hook) {
        this.frameEndHooks.add(hook);
    }

    public void frameStart() {
        this.aura.S().gB(System.nanoTime());
        this.frame.dt = this.aura.S().A();
        this.frame.time = this.aura.S().pl();
        this.frame.frame = this.aura.S().P();
        this.frame.partialTick = i_2.u();
        this.frame.guiScale = (float)i_2.qJ();
        this.frame.framebufferWidth = i_2.qy();
        this.frame.framebufferHeight = i_2.CS();
        this.frame.guiWidth = this.frame.framebufferWidth / this.frame.guiScale;
        this.frame.guiHeight = this.frame.framebufferHeight / this.frame.guiScale;
        this.frame.inWorld = i_2.BD();
        this.frame.hideGui = i_2.b();
        this.frame.screenOpen = i_2.Wt();
        this.underlayDone = false;
        this.terrainDone = false;
        this.hasLevelProjection = false;
        this.projection.invalidate();
        this.aura.gE().a();
        this.aura.ZP().beginFrame();
        if (!i_2.zG() && !this.warnedBackend) {
            this.warnedBackend = true;
            this.aura
                .ZP()
                .disable("Minecraft is using the " + i_2.Fc() + " backend; Aura Render currently draws through OpenGL. Select OpenGL in Video Settings.");
        }

        this.aura.ZM().A(new p_2(this.frame));
    }

    public void levelProjection(Matrix4fc matrix) {
        matrix.get(this.levelProjection);
        this.hasLevelProjection = true;
    }

    public void worldRendered(float[] view, float[] proj, double camX, double camY, double camZ) {
        this.projection.update(view, this.hasLevelProjection ? this.levelProjection : proj, camX, camY, camZ);
        if (this.stageWanted()) {
            this.stage(SceneStage.LEVEL_START, null);
        }
    }

    public void terrainRendered() {
        if (!this.terrainDone && this.stageWanted()) {
            this.terrainDone = true;
            RenderTarget target = i_2.kH();
            if (target != null) {
                this.stage(SceneStage.TERRAIN, target.withReversedDepth(this.projection.reversedDepth()));
            }
        }
    }

    public void levelRendered() {
        if (this.frame.inWorld && this.projection.isValid()) {
            RenderTarget target = i_2.kH();
            if (target != null) {
                RenderTarget level = target.withReversedDepth(this.projection.reversedDepth());
                this.pass(RenderPhase.WORLD, level, this.frame.guiScale);
                if (this.stageWanted()) {
                    this.stage(SceneStage.LEVEL, level);
                }
            }
        }
    }

    public void sceneRendered() {
        if (this.stageWanted()) {
            RenderTarget target = i_2.vD();
            if (target != null) {
                this.stage(SceneStage.SCENE, target);
            }
        }
    }

    private boolean stageWanted() {
        return this.frame.inWorld && this.projection.isValid() && this.aura.ZM().l(pT.class);
    }

    private void stage(SceneStage stage, RenderTarget target) {
        this.aura.ZM().A(new pT(stage, target, this.frame));
    }

    public void beforeGui() {
        if (!this.underlayDone && this.frame.inWorld) {
            this.underlayDone = true;
            RenderTarget target = i_2.vD();
            if (target != null) {
                this.aura.ZP().applyScreenEffects(target);
                this.pass(RenderPhase.UNDERLAY, target, this.frame.guiScale);
            }
        }
    }

    public void afterGui() {
        RenderTarget target = i_2.vD();
        if (target == null) {
            this.aura.Kx().O();
        } else {
            if (!this.underlayDone && this.frame.inWorld) {
                this.beforeGui();
            }

            this.pass(RenderPhase.OVERLAY, target, this.frame.guiScale);
            this.pass(RenderPhase.SCREEN, target, this.aura.KeybindSetting(this.frame));
            this.aura.Kx().O();
            if (!this.frameEndHooks.isEmpty()) {
                List<Consumer<RenderTarget>> hooks = new ArrayList<>(this.frameEndHooks);
                this.frameEndHooks.clear();

                for (Consumer<RenderTarget> h : hooks) {
                    try {
                        h.accept(target);
                    } catch (Throwable var6) {
                        LOG.error("Frame-end hook failed", var6);
                    }
                }
            }
        }
    }

    private void pass(RenderPhase phase, RenderTarget target, float scale) {
        AuraRenderer renderer = this.aura.ZP();
        EventBus events = this.aura.ZM();
        if (events.l(RenderEvent.class)) {
            Canvas canvas = renderer.begin(target, scale);
            if (canvas != null) {
                try {
                    events.A(new RenderEvent(phase, canvas, this.frame));
                } finally {
                    renderer.end();
                }
            }
        }
    }
}
