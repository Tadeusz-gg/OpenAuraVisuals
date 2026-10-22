package dev.skidware.visuals.render.canvas;

@FunctionalInterface
public interface TextureRef {
    int glId();

    static TextureRef of(int glId) {
        return new TextureRef$Raw(glId);
    }
}
