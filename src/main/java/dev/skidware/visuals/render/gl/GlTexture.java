package dev.skidware.visuals.render.gl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.system.MemoryUtil;

public final class GlTexture implements AutoCloseable {
    private final int id = GL33C.glGenTextures();
    private final int internalFormat;
    private final int format;
    private int width;
    private int height;

    public GlTexture(int internalFormat, int format, int width, int height, boolean linear) {
        this.internalFormat = internalFormat;
        this.format = format;
        GL33C.glBindTexture(3553, this.id);
        int filter = linear ? 9729 : 9728;
        GL33C.glTexParameteri(3553, 10241, filter);
        GL33C.glTexParameteri(3553, 10240, filter);
        GL33C.glTexParameteri(3553, 10242, 33071);
        GL33C.glTexParameteri(3553, 10243, 33071);
        this.resize(width, height);
    }

    public static GlTexture rgba8(int width, int height) {
        return new GlTexture(32856, 6408, width, height, true);
    }

    public static GlTexture r8(int width, int height) {
        return new GlTexture(33321, 6403, width, height, true);
    }

    public static GlTexture lookupTable(int width, int height, float[] values, boolean repeatX) {
        if (values.length != width * height) {
            throw new IllegalArgumentException("table size " + values.length);
        } else {
            GlTexture texture = new GlTexture(33325, 6403, width, height, true);
            if (repeatX) {
                GL33C.glTexParameteri(3553, 10242, 10497);
            }

            FloatBuffer data = MemoryUtil.memAllocFloat(values.length);

            try {
                data.put(values).flip();
                GL33C.glPixelStorei(3317, 4);
                GL33C.glPixelStorei(3314, 0);
                GL33C.glPixelStorei(3316, 0);
                GL33C.glPixelStorei(3315, 0);
                GL33C.glTexSubImage2D(3553, 0, 0, 0, width, height, 6403, 5126, data);
            } finally {
                MemoryUtil.memFree(data);
            }

            return texture;
        }
    }

    public static int createRgba(int w, int h, ByteBuffer pixels) {
        int previous = GL33C.glGetInteger(32873);
        int unpackBuffer = GL33C.glGetInteger(35055);
        int alignment = GL33C.glGetInteger(3317);
        int rowLength = GL33C.glGetInteger(3314);
        int skipPixels = GL33C.glGetInteger(3316);
        int skipRows = GL33C.glGetInteger(3315);

        int var10;
        try {
            GL33C.glBindBuffer(35052, 0);
            int id = GL33C.glGenTextures();
            GL33C.glBindTexture(3553, id);
            GL33C.glTexParameteri(3553, 10241, 9729);
            GL33C.glTexParameteri(3553, 10240, 9729);
            GL33C.glTexParameteri(3553, 10242, 33071);
            GL33C.glTexParameteri(3553, 10243, 33071);
            GL33C.glTexParameteri(3553, 33085, 0);
            GL33C.glPixelStorei(3317, 4);
            GL33C.glPixelStorei(3314, 0);
            GL33C.glPixelStorei(3316, 0);
            GL33C.glPixelStorei(3315, 0);
            GL33C.glTexImage2D(3553, 0, 32856, w, h, 0, 6408, 5121, pixels);
            var10 = id;
        } finally {
            GL33C.glBindTexture(3553, previous);
            GL33C.glBindBuffer(35052, unpackBuffer);
            GL33C.glPixelStorei(3317, alignment);
            GL33C.glPixelStorei(3314, rowLength);
            GL33C.glPixelStorei(3316, skipPixels);
            GL33C.glPixelStorei(3315, skipRows);
        }

        return var10;
    }

    public static void delete(int id) {
        if (id > 0) {
            GL33C.glDeleteTextures(id);
        }
    }

    public void resize(int w, int h) {
        this.width = Math.max(1, w);
        this.height = Math.max(1, h);
        GL33C.glBindTexture(3553, this.id);
        GL33C.glTexImage2D(3553, 0, this.internalFormat, this.width, this.height, 0, this.format, 5121, (ByteBuffer)null);
    }

    public void upload(int x, int y, int w, int h, ByteBuffer pixels, int rowLength) {
        GL33C.glBindTexture(3553, this.id);
        GL33C.glPixelStorei(3317, 1);
        GL33C.glPixelStorei(3314, rowLength);
        GL33C.glPixelStorei(3316, x);
        GL33C.glPixelStorei(3315, y);
        GL33C.glTexSubImage2D(3553, 0, x, y, w, h, this.format, 5121, pixels);
        GL33C.glPixelStorei(3314, 0);
        GL33C.glPixelStorei(3316, 0);
        GL33C.glPixelStorei(3315, 0);
    }

    public static void querySize(int textureId, int[] out) {
        int previous = GL33C.glGetInteger(32873);
        GL33C.glBindTexture(3553, textureId);
        out[0] = GL33C.glGetTexLevelParameteri(3553, 0, 4096);
        out[1] = GL33C.glGetTexLevelParameteri(3553, 0, 4097);
        GL33C.glBindTexture(3553, previous);
    }

    public int id() {
        return this.id;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    @Override
    public void close() {
        GL33C.glDeleteTextures(this.id);
    }
}
