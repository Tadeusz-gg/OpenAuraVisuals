package dev.skidware.visuals.client.render;

import dev.aurap.hub.Da;
import dev.aurap.hub.KH;
import dev.aurap.hub.KK;
import dev.aurap.hub.TP;
import dev.aurap.hub.e_2;
import dev.aurap.hub.fT;
import dev.aurap.hub.gz_2;
import dev.aurap.hub.x_2;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class KnifeRenderer {
    private static final int TRAIL = 32;
    private static final float TRAIL_LIFE = 0.14F;
    private static final float LIFT = 0.2F;
    private final fT transform = new fT();
    private final float[] rigid16 = new float[16];
    private final Matrix4f rigid = new Matrix4f();
    private final Vector3f p = new Vector3f();
    private final Vector3f n = new Vector3f();
    private final MatrixStack viewPose = new MatrixStack();
    private final gz_2 solid = this::emitSolid;
    private final gz_2 shine = this::emitShine;
    private final gz_2 ribbon = this::emitTrail;
    private KK mesh;
    private int light;
    private boolean mirror;
    private float shineGain;
    private final float[] trail = new float[224];
    private int trailHead;
    private int trailCount;
    private int trailColor;
    private float[] tipModel;
    private float[] baseModel;
    private Da trailModel;
    private float trailNow;
    private final float[] glint = new float[4];

    public KnifeRenderer() {
    }

    public void render(
        MatrixStack pose, Object target, int light, Da model, float[] offsets, float size, boolean mirror, boolean shineOn, int trailColor, float now
    ) {
        this.mesh = model.mesh();
        this.light = light;
        this.mirror = mirror;
        int block = (light & 65535) >> 4;
        int sky = light >> 20 & 15;
        this.shineGain = shineOn ? 0.25F + 0.75F * (float)Math.pow(Math.max(block, sky) / 15.0F, 1.5) : 0.0F;
        pose.push();
        if (mirror) {
            pose.scale(-1.0F, 1.0F, 1.0F);
        }

        this.transform.we(model, offsets, this.rigid16);
        pose.multiplyPositionMatrix(this.rigid.set(this.rigid16));
        float s = model.scale() * size;
        pose.scale(s, s, s);
        KH.IR(pose, target, x_2.SOLID, this.solid);
        if (this.shineGain > 0.0F) {
            KH.IR(pose, target, x_2.GLOW, this.shine);
        }

        this.sampleTrail(pose.peek().getPositionMatrix(), model, now);
        pose.pop();
        this.trailColor = trailColor;
        if (trailColor != 0 && this.trailCount > 1) {
            KH.IR(this.viewPose, target, x_2.GLOW, this.ribbon);
        }
    }

    public void resetTrail() {
        this.trailCount = 0;
    }

    private void emitSolid(Entry pose, VertexConsumer out) {
        float[] d = this.mesh.j();
        int q = 0;

        for (int quads = this.mesh.bX(); q < quads; q++) {
            int base = q * 32;

            for (int k = 0; k < 4; k++) {
                int o = base + (this.mirror ? 3 - k : k) * 8;
                pose.getNormalMatrix().transform(d[o + 3], d[o + 4], d[o + 5], this.n).normalize();
                int g = Math.round(fT.ef(this.n.x, this.n.y, this.n.z) * 255.0F);
                out.vertex(pose, d[o], d[o + 1], d[o + 2])
                    .color(0xFF000000 | g << 16 | g << 8 | g)
                    .texture(d[o + 6], d[o + 7])
                    .overlay(OverlayTexture.DEFAULT_UV)
                    .light(this.light)
                    .normal(pose, d[o + 3], d[o + 4], d[o + 5]);
            }
        }
    }

    private void emitShine(Entry pose, VertexConsumer out) {
        float[] d = this.mesh.j();
        Matrix4f m = pose.getPositionMatrix();
        float lift = 0.2F * this.shineGain;
        int q = 0;

        for (int quads = this.mesh.bX(); q < quads; q++) {
            if (this.mesh.J(q) != e_2.GRIP) {
                int base = q * 32;

                for (int k = 0; k < 4; k++) {
                    int o = base + k * 8;
                    m.transformPosition(d[o], d[o + 1], d[o + 2], this.p);
                    pose.getNormalMatrix().transform(d[o + 3], d[o + 4], d[o + 5], this.n).normalize();
                    this.glint[k] = lift + fT.uK(this.p.x, this.p.y, this.p.z, this.n.x, this.n.y, this.n.z) * this.shineGain * 1.8F;
                }

                for (int k = 0; k < 4; k++) {
                    int kk = this.mirror ? 3 - k : k;
                    int o = base + kk * 8;
                    int g = Math.round(TP.S(this.glint[kk]) * 255.0F);
                    out.vertex(pose, d[o], d[o + 1], d[o + 2])
                        .color(0xFF000000 | g << 16 | g << 8 | g)
                        .texture(d[o + 6], d[o + 7])
                        .overlay(OverlayTexture.DEFAULT_UV)
                        .light(15728880)
                        .normal(pose, d[o + 3], d[o + 4], d[o + 5]);
                }
            }
        }
    }

    private void sampleTrail(Matrix4f view, Da model, float now) {
        if (model != this.trailModel) {
            this.trailModel = model;
            this.tipModel = model.tip();
            this.baseModel = model.trailBase();
            this.trailCount = 0;
        }

        this.trailNow = now;
        int o = this.trailHead * 7;
        view.transformPosition(this.tipModel[0], this.tipModel[1], this.tipModel[2], this.p);
        this.trail[o] = this.p.x;
        this.trail[o + 1] = this.p.y;
        this.trail[o + 2] = this.p.z;
        view.transformPosition(this.baseModel[0], this.baseModel[1], this.baseModel[2], this.p);
        this.trail[o + 3] = this.p.x;
        this.trail[o + 4] = this.p.y;
        this.trail[o + 5] = this.p.z;
        this.trail[o + 6] = now;
        this.trailHead = (this.trailHead + 1) % 32;
        this.trailCount = Math.min(32, this.trailCount + 1);
    }

    private void emitTrail(Entry pose, VertexConsumer out) {
        float r = (this.trailColor >> 16 & 0xFF) / 255.0F;
        float g = (this.trailColor >> 8 & 0xFF) / 255.0F;
        float b = (this.trailColor & 0xFF) / 255.0F;

        for (int i = 0; i < this.trailCount - 1; i++) {
            int newer = Math.floorMod(this.trailHead - 1 - i, 32) * 7;
            int older = Math.floorMod(this.trailHead - 2 - i, 32) * 7;
            float ageNew = this.trailNow - this.trail[newer + 6];
            float ageOld = this.trailNow - this.trail[older + 6];
            if (ageOld > 0.14F) {
                break;
            }

            float dt = Math.max(0.001F, this.trail[newer + 6] - this.trail[older + 6]);
            float dx = this.trail[newer] - this.trail[older];
            float dy = this.trail[newer + 1] - this.trail[older + 1];
            float dz = this.trail[newer + 2] - this.trail[older + 2];
            float speed = (float)Math.sqrt(dx * dx + dy * dy + dz * dz) / dt;
            float gain = TP.S((speed - 1.5F) / 3.0F) * 0.5F;
            if (!(gain <= 0.0F)) {
                float aNew = gain * fade(ageNew);
                float aOld = gain * fade(ageOld);
                int cNew = rgb(r, g, b, aNew);
                int cOld = rgb(r, g, b, aOld);
                ribbonQuad(pose, out, this.trail, newer, older, cNew, cOld, false);
                ribbonQuad(pose, out, this.trail, newer, older, cNew, cOld, true);
            }
        }
    }

    private static float fade(float age) {
        float f = TP.S(1.0F - age / 0.14F);
        return f * f;
    }

    private static int rgb(float r, float g, float b, float a) {
        return 0xFF000000 | Math.round(r * a * 255.0F) << 16 | Math.round(g * a * 255.0F) << 8 | Math.round(b * a * 255.0F);
    }

    private static void ribbonQuad(Entry pose, VertexConsumer out, float[] t, int newer, int older, int cNew, int cOld, boolean back) {
        if (!back) {
            vertex(pose, out, t, newer, cNew);
            vertex(pose, out, t, older, cOld);
            vertex(pose, out, t, older + 3, -16777216);
            vertex(pose, out, t, newer + 3, -16777216);
        } else {
            vertex(pose, out, t, newer + 3, -16777216);
            vertex(pose, out, t, older + 3, -16777216);
            vertex(pose, out, t, older, cOld);
            vertex(pose, out, t, newer, cNew);
        }
    }

    private static void vertex(Entry pose, VertexConsumer out, float[] t, int o, int color) {
        out.vertex(pose, t[o], t[o + 1], t[o + 2])
            .color(color)
            .texture(0.5F, 0.9375F)
            .overlay(OverlayTexture.DEFAULT_UV)
            .light(15728880)
            .normal(pose, 0.0F, 0.0F, 1.0F);
    }
}
