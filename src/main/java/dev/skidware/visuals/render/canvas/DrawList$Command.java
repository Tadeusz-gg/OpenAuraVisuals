package dev.skidware.visuals.render.canvas;

public final class DrawList$Command {
    public static final int DRAW = 0;
    public static final int BACKDROP = 1;
    public final int kind;
    public final int first;
    int count;
    TextureRef texture;
    boolean linear;
    public final int blurLevel;

    DrawList$Command(int kind, int first, int count, TextureRef texture, boolean linear, int blurLevel) {
        this.kind = kind;
        this.first = first;
        this.count = count;
        this.texture = texture;
        this.linear = linear;
        this.blurLevel = blurLevel;
    }

    public int count() {
        return this.count;
    }

    public TextureRef texture() {
        return this.texture;
    }

    public boolean linear() {
        return this.linear;
    }
}
