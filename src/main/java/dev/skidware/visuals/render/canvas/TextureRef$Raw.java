package dev.skidware.visuals.render.canvas;

public record TextureRef$Raw(int id) implements TextureRef {
    @Override
    public int glId() {
        return this.id;
    }
}
