package dev.skidware.visuals.render.image;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.stb.STBImage;

public final class RgbaImage {
    public static final int MAX_EDGE = 4096;
    private final int width;
    private final int height;
    private final byte[] pixels;

    public RgbaImage(int width, int height, byte[] pixels) {
        if (width > 0 && height > 0 && pixels.length == width * height * 4) {
            this.width = width;
            this.height = height;
            this.pixels = pixels;
        } else {
            throw new IllegalArgumentException("bad image " + width + "x" + height + " / " + pixels.length);
        }
    }

    public static RgbaImage decode(byte[] encoded) throws IOException {
        if (encoded != null && encoded.length != 0) {
            ByteBuffer in = ByteBuffer.allocateDirect(encoded.length).put(encoded).flip();
            IntBuffer w = ints();
            IntBuffer h = ints();
            IntBuffer comp = ints();
            if (!STBImage.stbi_info_from_memory(in, w, h, comp)) {
                throw new IOException("unsupported image: " + STBImage.stbi_failure_reason());
            } else if (w.get(0) <= 4096 && h.get(0) <= 4096) {
                ByteBuffer decoded = STBImage.stbi_load_from_memory(in, w, h, comp, 4);
                if (decoded == null) {
                    throw new IOException("image decode failed: " + STBImage.stbi_failure_reason());
                } else {
                    RgbaImage var7;
                    try {
                        byte[] px = new byte[w.get(0) * h.get(0) * 4];
                        decoded.get(0, px);
                        var7 = new RgbaImage(w.get(0), h.get(0), px);
                    } finally {
                        STBImage.stbi_image_free(decoded);
                    }

                    return var7;
                }
            } else {
                throw new IOException("image too large");
            }
        } else {
            throw new IOException("empty image");
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

    public byte[] pixels() {
        return this.pixels;
    }

    public RgbaImage cropSquare() {
        if (this.width == this.height) {
            return this;
        } else {
            int edge = Math.min(this.width, this.height);
            int x0 = (this.width - edge) / 2;
            int y0 = (this.height - edge) / 2;
            byte[] out = new byte[edge * edge * 4];

            for (int y = 0; y < edge; y++) {
                System.arraycopy(this.pixels, ((y0 + y) * this.width + x0) * 4, out, y * edge * 4, edge * 4);
            }

            return new RgbaImage(edge, edge, out);
        }
    }

    public RgbaImage resize(int w, int h) {
        if (w == this.width && h == this.height) {
            return this;
        } else {
            float[] acc = new float[4];
            byte[] out = new byte[w * h * 4];
            float sx = (float)this.width / w;
            float sy = (float)this.height / h;

            for (int oy = 0; oy < h; oy++) {
                float y0 = oy * sy;
                float y1 = y0 + sy;

                for (int ox = 0; ox < w; ox++) {
                    float x0 = ox * sx;
                    float x1 = x0 + sx;
                    acc[0] = acc[1] = acc[2] = acc[3] = 0.0F;
                    float total = 0.0F;

                    for (int iy = (int)y0; iy < Math.min(this.height, (int)Math.ceil(y1)); iy++) {
                        float wy = Math.min(y1, (float)(iy + 1)) - Math.max(y0, (float)iy);

                        for (int ix = (int)x0; ix < Math.min(this.width, (int)Math.ceil(x1)); ix++) {
                            float wx = Math.min(x1, (float)(ix + 1)) - Math.max(x0, (float)ix);
                            float k = wx * wy;
                            int i = (iy * this.width + ix) * 4;
                            float a = (this.pixels[i + 3] & 255) / 255.0F;
                            acc[0] += (this.pixels[i] & 255) * a * k;
                            acc[1] += (this.pixels[i + 1] & 255) * a * k;
                            acc[2] += (this.pixels[i + 2] & 255) * a * k;
                            acc[3] += a * k;
                            total += k;
                        }
                    }

                    int o = (oy * w + ox) * 4;
                    float alpha = total > 0.0F ? acc[3] / total : 0.0F;
                    float inv = acc[3] > 1.0E-6F ? 1.0F / acc[3] : 0.0F;
                    out[o] = (byte)Math.round(Math.min(255.0F, acc[0] * inv));
                    out[o + 1] = (byte)Math.round(Math.min(255.0F, acc[1] * inv));
                    out[o + 2] = (byte)Math.round(Math.min(255.0F, acc[2] * inv));
                    out[o + 3] = (byte)Math.round(Math.min(255.0F, alpha * 255.0F));
                }
            }

            return new RgbaImage(w, h, out);
        }
    }

    public RgbaImage[] squareMips(int largest, int smallest) {
        RgbaImage square = this.cropSquare();
        int top = largest;

        while (top > smallest && top > square.width) {
            top >>= 1;
        }

        int count = 0;

        for (int s = top; s >= smallest; s >>= 1) {
            count++;
        }

        RgbaImage[] mips = new RgbaImage[Math.max(1, count)];
        mips[0] = square.resize(top, top);

        for (int i = 1; i < mips.length; i++) {
            mips[i] = mips[i - 1].resize(mips[i - 1].width / 2, mips[i - 1].height / 2);
        }

        return mips;
    }

    public int[] argb() {
        int[] out = new int[this.width * this.height];
        int i = 0;

        for (int p = 0; i < out.length; p += 4) {
            out[i] = (this.pixels[p + 3] & 255) << 24 | (this.pixels[p] & 255) << 16 | (this.pixels[p + 1] & 255) << 8 | this.pixels[p + 2] & 255;
            i++;
        }

        return out;
    }
}
