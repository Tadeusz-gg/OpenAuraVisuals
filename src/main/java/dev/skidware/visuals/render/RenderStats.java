package dev.skidware.visuals.render;

import java.util.Locale;

public final class RenderStats {
    int instances;
    int drawCalls;
    int backdropCaptures;
    int passes;
    double cpuMs;
    double gpuMs;
    long frames;
    private int lastInstances;
    private int lastDrawCalls;
    private int lastBackdrops;
    private int lastPasses;
    private double lastCpuMs;

    public RenderStats() {
    }

    void reset() {
        this.lastInstances = this.instances;
        this.lastDrawCalls = this.drawCalls;
        this.lastBackdrops = this.backdropCaptures;
        this.lastPasses = this.passes;
        this.lastCpuMs = this.cpuMs;
        this.instances = this.drawCalls = this.backdropCaptures = this.passes = 0;
        this.cpuMs = 0.0;
    }

    public int instances() {
        return this.lastInstances;
    }

    public int drawCalls() {
        return this.lastDrawCalls;
    }

    public int backdropCaptures() {
        return this.lastBackdrops;
    }

    public int passes() {
        return this.lastPasses;
    }

    public double cpuMs() {
        return this.lastCpuMs;
    }

    public double gpuMs() {
        return this.gpuMs;
    }

    public long frames() {
        return this.frames;
    }

    @Override
    public String toString() {
        return String.format(
            Locale.ROOT,
            "aura: %d shapes, %d draws, %d blur, cpu %.2fms, gpu %.2fms",
            this.lastInstances,
            this.lastDrawCalls,
            this.lastBackdrops,
            this.lastCpuMs,
            this.gpuMs
        );
    }
}
