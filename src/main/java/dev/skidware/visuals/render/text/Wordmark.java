package dev.skidware.visuals.render.text;

import dev.skidware.visuals.render.canvas.TextureRef;
import dev.skidware.visuals.render.gl.GlTexture;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.stb.STBImage;

public final class Wordmark implements TextureRef, AutoCloseable {
    public static final int BAKE_SIZE = 256;
    public static final int SPREAD = 32;
    private final int width;
    private final int height;
    private final ByteBuffer pixels;
    private GlTexture texture;

    public Wordmark(int width, int height, ByteBuffer pixels) {
        if (width > 64 && height > 64) {
            if (pixels.remaining() < width * height) {
                throw new IllegalArgumentException("wordmark pixels");
            } else {
                this.width = width;
                this.height = height;
                this.pixels = pixels;
            }
        } else {
            throw new IllegalArgumentException("wordmark " + width + "x" + height);
        }
    }

    public static Wordmark decode(byte[] png) {
        ByteBuffer in = ByteBuffer.allocateDirect(png.length).put(png).flip();
        IntBuffer w = ints();
        IntBuffer h = ints();
        IntBuffer channels = ints();
        ByteBuffer decoded = STBImage.stbi_load_from_memory(in, w, h, channels, 1);
        if (decoded == null) {
            throw new IllegalArgumentException("Not a wordmark image: " + STBImage.stbi_failure_reason());
        } else {
            Wordmark var7;
            try {
                byte[] field = new byte[w.get(0) * h.get(0)];
                decoded.get(0, field);
                var7 = new Wordmark(w.get(0), h.get(0), ByteBuffer.allocateDirect(field.length).put(field).flip());
            } finally {
                STBImage.stbi_image_free(decoded);
            }

            return var7;
        }
    }

    private static IntBuffer ints() {
        return ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public int inkWidth() {
        return this.width - 64;
    }

    public int inkHeight() {
        return this.height - 64;
    }

    public float widthFor(float inkHeight) {
        return inkHeight * this.inkWidth() / this.inkHeight();
    }

    public ByteBuffer pixels() {
        return this.pixels.duplicate();
    }

    @Override
    public int glId() {
        if (this.texture == null) {
            this.texture = GlTexture.r8(this.width, this.height);
            this.texture.upload(0, 0, this.width, this.height, this.pixels, this.width);
        }

        return this.texture.id();
    }

    @Override
    public void close() {
        if (this.texture != null) {
            this.texture.close();
        }

        this.texture = null;
    }
}
