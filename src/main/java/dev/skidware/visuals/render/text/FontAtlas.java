package dev.skidware.visuals.render.text;

import dev.skidware.visuals.render.canvas.TextureRef;
import dev.skidware.visuals.render.gl.GlTexture;
import java.nio.ByteBuffer;

public final class FontAtlas implements TextureRef, AutoCloseable {
    private static final int GAP = 1;
    private final int width;
    private final int height;
    private final ByteBuffer pixels;
    private int shelfX = 1;
    private int shelfY = 1;
    private int shelfHeight;
    private int dirtyX0 = Integer.MAX_VALUE;
    private int dirtyY0 = Integer.MAX_VALUE;
    private int dirtyX1;
    private int dirtyY1;
    private int generation;
    private GlTexture texture;

    public FontAtlas(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = ByteBuffer.allocateDirect(width * height);
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public int generation() {
        return this.generation;
    }

    void reset() {
        this.generation++;

        for (int i = 0; i < this.pixels.capacity(); i++) {
            this.pixels.put(i, (byte)0);
        }

        this.shelfX = 1;
        this.shelfY = 1;
        this.shelfHeight = 0;
        this.dirtyX0 = 0;
        this.dirtyY0 = 0;
        this.dirtyX1 = this.width;
        this.dirtyY1 = this.height;
    }

    int[] allocate(int w, int h) {
        if (w + 2 > this.width) {
            return null;
        } else {
            if (this.shelfX + w + 1 > this.width) {
                this.shelfY = this.shelfY + this.shelfHeight + 1;
                this.shelfX = 1;
                this.shelfHeight = 0;
            }

            if (this.shelfY + h + 1 > this.height) {
                return null;
            } else {
                int[] at = new int[]{this.shelfX, this.shelfY};
                this.shelfX += w + 1;
                this.shelfHeight = Math.max(this.shelfHeight, h);
                return at;
            }
        }
    }

    void blit(int x, int y, int w, int h, ByteBuffer src) {
        for (int row = 0; row < h; row++) {
            int dst = (y + row) * this.width + x;

            for (int col = 0; col < w; col++) {
                this.pixels.put(dst + col, src.get(row * w + col));
            }
        }

        this.dirtyX0 = Math.min(this.dirtyX0, x);
        this.dirtyY0 = Math.min(this.dirtyY0, y);
        this.dirtyX1 = Math.max(this.dirtyX1, x + w);
        this.dirtyY1 = Math.max(this.dirtyY1, y + h);
    }

    @Override
    public int glId() {
        if (this.texture == null) {
            this.texture = GlTexture.r8(this.width, this.height);
            this.dirtyX0 = 0;
            this.dirtyY0 = 0;
            this.dirtyX1 = this.width;
            this.dirtyY1 = this.height;
        }

        if (this.dirtyX1 > this.dirtyX0 && this.dirtyY1 > this.dirtyY0) {
            this.texture.upload(this.dirtyX0, this.dirtyY0, this.dirtyX1 - this.dirtyX0, this.dirtyY1 - this.dirtyY0, this.pixels, this.width);
            this.dirtyX0 = this.dirtyY0 = Integer.MAX_VALUE;
            this.dirtyX1 = this.dirtyY1 = 0;
        }

        return this.texture.id();
    }

    public ByteBuffer pixels() {
        return this.pixels.duplicate();
    }

    @Override
    public void close() {
        if (this.texture != null) {
            this.texture.close();
        }

        this.texture = null;
    }
}
