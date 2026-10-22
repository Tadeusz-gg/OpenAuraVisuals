package dev.skidware.visuals.render.text;

public record Glyph(int codepoint, float advance, float xOffset, float yOffset, int width, int height, float u0, float v0, float u1, float v1) {
    public boolean isEmpty() {
        return this.width == 0 || this.height == 0;
    }
}
