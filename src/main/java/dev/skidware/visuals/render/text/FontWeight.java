package dev.skidware.visuals.render.text;

public enum FontWeight {
    REGULAR(400),
    MEDIUM(500),
    SEMIBOLD(600),
    BOLD(700);

    private final int css;

    private FontWeight(int css) {
        this.css = css;
    }

    public int css() {
        return this.css;
    }
}
