package dev.skidware.visuals.render.gl;

import org.lwjgl.opengl.GL33C;

public final class GpuTimer implements AutoCloseable {
    private static final int RING = 4;
    private final int[] queries = new int[4];
    private final boolean[] pending = new boolean[4];
    private int index;
    private boolean active;
    private double lastMs;
    private double smoothedMs;

    public GpuTimer() {
        GL33C.glGenQueries(this.queries);
    }

    public void begin() {
        if (!this.active) {
            if (GL33C.glGetQueryi(35007, 34917) == 0) {
                int slot = this.index;
                if (this.pending[slot]) {
                    if (GL33C.glGetQueryObjecti(this.queries[slot], 34919) == 0) {
                        return;
                    }

                    long ns = GL33C.glGetQueryObjecti64(this.queries[slot], 34918);
                    this.lastMs = ns / 1000000.0;
                    this.smoothedMs = this.smoothedMs == 0.0 ? this.lastMs : this.smoothedMs * 0.9 + this.lastMs * 0.1;
                    this.pending[slot] = false;
                }

                GL33C.glBeginQuery(35007, this.queries[slot]);
                this.active = true;
            }
        }
    }

    public void end() {
        if (this.active) {
            GL33C.glEndQuery(35007);
            this.pending[this.index] = true;
            this.index = (this.index + 1) % 4;
            this.active = false;
        }
    }

    public double lastMs() {
        return this.lastMs;
    }

    public double smoothedMs() {
        return this.smoothedMs;
    }

    @Override
    public void close() {
        GL33C.glDeleteQueries(this.queries);
    }
}
