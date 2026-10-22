package dev.skidware.visuals.render.canvas;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class DrawList {
    public static final int STRIDE = 184;
    private ByteBuffer data = ByteBuffer.allocateDirect(188416).order(ByteOrder.nativeOrder());
    private int count;
    private final List<DrawList$Command> commands = new ArrayList<>();
    private DrawList$Command open;

    public DrawList() {
    }

    public void reset() {
        this.data.clear();
        this.count = 0;
        this.commands.clear();
        this.open = null;
    }

    public int instanceCount() {
        return this.count;
    }

    public List<DrawList$Command> commands() {
        return this.commands;
    }

    public ByteBuffer data() {
        ByteBuffer view = this.data.duplicate().order(ByteOrder.nativeOrder());
        view.position(0).limit(this.count * 184);
        return view;
    }

    public void backdropBarrier(int blurLevel) {
        this.open = null;
        this.commands.add(new DrawList$Command(1, this.count, 0, null, false, blurLevel));
    }

    void beginInstance(TextureRef texture, boolean linear) {
        if (this.open != null && (texture == null || this.open.texture == null || Objects.equals(this.open.texture, texture) && this.open.linear == linear)) {
            if (texture != null && this.open.texture == null) {
                this.open.texture = texture;
                this.open.linear = linear;
            }
        } else {
            this.open = new DrawList$Command(0, this.count, 0, texture, linear, 0);
            this.commands.add(this.open);
        }

        this.open.count++;
        this.ensureCapacity();
    }

    private void ensureCapacity() {
        int needed = (this.count + 1) * 184;
        if (needed > this.data.capacity()) {
            ByteBuffer bigger = ByteBuffer.allocateDirect(Math.max(needed, this.data.capacity() * 2)).order(ByteOrder.nativeOrder());
            this.data.flip();
            bigger.put(this.data);
            this.data = bigger;
        }
    }

    void put(
        float cx,
        float cy,
        float hw,
        float hh,
        float r0,
        float r1,
        float r2,
        float r3,
        float m00,
        float m01,
        float m10,
        float m11,
        float tx,
        float ty,
        int type,
        float clipRadius,
        int color0,
        int color1,
        float p0,
        float p1,
        float p2,
        float p3,
        float u0,
        float v0,
        float u1,
        float v1,
        float clipX0,
        float clipY0,
        float clipX1,
        float clipY1,
        float depth,
        float depthDx,
        float depthDy,
        float additive,
        float[] plane
    ) {
        ByteBuffer b = this.data;
        b.putFloat(cx).putFloat(cy).putFloat(hw).putFloat(hh);
        b.putFloat(r0).putFloat(r1).putFloat(r2).putFloat(r3);
        b.putFloat(m00).putFloat(m01).putFloat(m10).putFloat(m11);
        b.putFloat(tx).putFloat(ty).putFloat(type).putFloat(clipRadius);
        putColor(b, color0);
        putColor(b, color1);
        b.putFloat(p0).putFloat(p1).putFloat(p2).putFloat(p3);
        b.putFloat(u0).putFloat(v0).putFloat(u1).putFloat(v1);
        b.putFloat(clipX0).putFloat(clipY0).putFloat(clipX1).putFloat(clipY1);
        b.putFloat(depth).putFloat(depthDx).putFloat(depthDy).putFloat(additive);

        for (int i = 0; i < 12; i++) {
            b.putFloat(plane == null ? 0.0F : plane[i]);
        }

        this.count++;
    }

    private static void putColor(ByteBuffer b, int argb) {
        b.put((byte)(argb >> 16)).put((byte)(argb >> 8)).put((byte)argb).put((byte)(argb >>> 24));
    }
}
