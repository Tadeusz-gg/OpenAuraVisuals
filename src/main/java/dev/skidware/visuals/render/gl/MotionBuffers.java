package dev.skidware.visuals.render.gl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33C;

final class MotionBuffers implements AutoCloseable {
    private int history;
    private int historyWidth;
    private int historyHeight;
    private int historyLayers;
    private GlFramebuffer accumRead;
    private GlFramebuffer accumWrite;
    private boolean primed;

    MotionBuffers() {
    }

    boolean ensureHistory(int w, int h, int layers) {
        if (this.history != 0 && this.historyWidth == w && this.historyHeight == h && this.historyLayers == layers) {
            return false;
        } else {
            if (this.history == 0) {
                this.history = GL33C.glGenTextures();
            }

            GL33C.glActiveTexture(33984);
            GL33C.glBindTexture(35866, this.history);
            GL33C.glTexParameteri(35866, 10241, 9728);
            GL33C.glTexParameteri(35866, 10240, 9728);
            GL33C.glTexParameteri(35866, 10242, 33071);
            GL33C.glTexParameteri(35866, 10243, 33071);
            GL33C.glTexParameteri(35866, 33085, 0);
            GL33C.glTexImage3D(35866, 0, 32856, w, h, layers, 0, 6408, 5121, (ByteBuffer)null);
            this.historyWidth = w;
            this.historyHeight = h;
            this.historyLayers = layers;
            return true;
        }
    }

    void storeFrame(int readFramebuffer, int layer, int w, int h) {
        if (this.history != 0 && layer >= 0 && layer < this.historyLayers) {
            GL33C.glBindFramebuffer(36008, readFramebuffer);
            GL33C.glActiveTexture(33984);
            GL33C.glBindTexture(35866, this.history);
            GL33C.glCopyTexSubImage3D(35866, 0, 0, 0, layer, 0, 0, Math.min(w, this.historyWidth), Math.min(h, this.historyHeight));
        }
    }

    int historyTexture() {
        return this.history;
    }

    boolean ensureAccumulation(int w, int h) {
        if (this.accumRead == null) {
            this.accumRead = GlFramebuffer.owned(w, h);
            this.accumWrite = GlFramebuffer.owned(w, h);
            this.primed = false;
        } else if (this.accumRead.width() != w || this.accumRead.height() != h) {
            this.accumRead.resize(w, h);
            this.accumWrite.resize(w, h);
            this.primed = false;
        }

        return this.primed;
    }

    void primeAccumulation() {
        this.primed = true;
    }

    GlFramebuffer accumRead() {
        return this.accumRead;
    }

    GlFramebuffer accumWrite() {
        return this.accumWrite;
    }

    void swapAccumulation() {
        GlFramebuffer t = this.accumRead;
        this.accumRead = this.accumWrite;
        this.accumWrite = t;
    }

    void restartAccumulation() {
        this.primed = false;
    }

    void releaseHistory() {
        if (this.history != 0) {
            GL33C.glDeleteTextures(this.history);
        }

        this.history = 0;
        this.historyWidth = this.historyHeight = this.historyLayers = 0;
    }

    void releaseAccumulation() {
        if (this.accumRead != null) {
            this.accumRead.close();
            this.accumWrite.close();
        }

        this.accumRead = this.accumWrite = null;
        this.primed = false;
    }

    @Override
    public void close() {
        this.releaseHistory();
        this.releaseAccumulation();
    }
}
