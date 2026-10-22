package dev.skidware.visuals.render.gl;

import org.lwjgl.opengl.GL33C;

final class BlurChain implements AutoCloseable {
    private static final int MAX_LEVELS = 6;
    private static final float[] OFFSETS = new float[]{0.0F, 1.25F, 1.5F, 2.0F, 2.75F, 3.0F, 3.5F};
    private static final int[] ITERATIONS = new int[]{0, 1, 2, 3, 3, 4, 5};
    private final GlFramebuffer[] levels = new GlFramebuffer[6];
    private int baseWidth = -1;
    private int baseHeight = -1;

    BlurChain() {
    }

    int capture(GlFramebuffer source, int blurLevel, GlProgram down, GlProgram up, int emptyVao) {
        int level = Math.max(1, Math.min(6, blurLevel));
        this.ensureSize(Math.max(1, source.width() / 2), Math.max(1, source.height() / 2));
        GL33C.glBindFramebuffer(36008, source.id());
        GL33C.glBindFramebuffer(36009, this.levels[0].id());
        GL33C.glBlitFramebuffer(0, 0, source.width(), source.height(), 0, 0, this.levels[0].width(), this.levels[0].height(), 16384, 9729);
        int iterations = Math.min(ITERATIONS[level], this.deepestUsable());
        float offset = OFFSETS[level];
        GL33C.glDisable(3042);
        GL33C.glBindVertexArray(emptyVao);
        GL33C.glActiveTexture(33984);
        down.use();
        down.set1i("u_source", 0);
        down.set1f("u_offset", offset);

        for (int i = 1; i <= iterations; i++) {
            this.pass(down, this.levels[i - 1], this.levels[i]);
        }

        up.use();
        up.set1i("u_source", 0);
        up.set1f("u_offset", offset);

        for (int i = iterations - 1; i >= 0; i--) {
            this.pass(up, this.levels[i + 1], this.levels[i]);
        }

        GL33C.glEnable(3042);
        return this.levels[0].colorTexture();
    }

    private void pass(GlProgram program, GlFramebuffer from, GlFramebuffer to) {
        to.bind();
        GL33C.glBindTexture(3553, from.colorTexture());
        program.set2f("u_halfPixel", 0.5F / from.width(), 0.5F / from.height());
        GL33C.glDrawArrays(4, 0, 3);
    }

    private int deepestUsable() {
        int n = 0;
        int i = 1;

        while (i < 6 && this.levels[i].width() >= 8 && this.levels[i].height() >= 8) {
            n = i++;
        }

        return n;
    }

    private void ensureSize(int w, int h) {
        if (w != this.baseWidth || h != this.baseHeight) {
            this.baseWidth = w;
            this.baseHeight = h;

            for (int i = 0; i < 6; i++) {
                int lw = Math.max(1, w >> i);
                int lh = Math.max(1, h >> i);
                if (this.levels[i] == null) {
                    this.levels[i] = GlFramebuffer.owned(lw, lh);
                } else {
                    this.levels[i].resize(lw, lh);
                }
            }
        }
    }

    @Override
    public void close() {
        for (GlFramebuffer fb : this.levels) {
            if (fb != null) {
                fb.close();
            }
        }
    }
}
