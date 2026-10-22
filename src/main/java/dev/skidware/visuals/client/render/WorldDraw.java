package dev.skidware.visuals.client.render;

import dev.skidware.visuals.render.canvas.Canvas;
import dev.skidware.visuals.render.canvas.Paint;

public final class WorldDraw {
    private final Projection projection;
    private final float[] p = new float[4];
    private final float[] a = new float[4];
    private final float[] b = new float[4];
    private final float[] s = new float[4];
    private final float[] t = new float[4];
    private final float[] basis = new float[12];
    private float x;
    private float y;
    private float depth;
    private float unitsPerBlock;

    public WorldDraw(Projection projection) {
        this.projection = projection;
    }

    public Projection projection() {
        return this.projection;
    }

    public boolean at(Canvas c, double wx, double wy, double wz) {
        if (!this.projection.project(wx, wy, wz, c.width(), c.height(), this.p)) {
            return false;
        } else {
            this.x = this.p[0];
            this.y = this.p[1];
            this.depth = this.p[2];
            this.unitsPerBlock = this.p[3];
            return true;
        }
    }

    public float x() {
        return this.x;
    }

    public float y() {
        return this.y;
    }

    public float depth() {
        return this.depth;
    }

    public float unitsPerBlock() {
        return this.unitsPerBlock;
    }

    public boolean plane(Canvas c, double cx, double cy, double cz, double ux, double uy, double uz, double vx, double vy, double vz) {
        if (!this.projection.planeBasis(cx, cy, cz, (float)ux, (float)uy, (float)uz, (float)vx, (float)vy, (float)vz, this.basis)) {
            return false;
        } else {
            c.perspective(this.basis);
            return true;
        }
    }

    public boolean line(Canvas c, double x1, double y1, double z1, double x2, double y2, double z2, float thickness, Paint paint) {
        float w = c.width();
        float h = c.height();
        if (this.projection.project(x1, y1, z1, w, h, this.a) && this.projection.project(x2, y2, z2, w, h, this.b)) {
            float dx = this.b[0] - this.a[0];
            float dy = this.b[1] - this.a[1];
            float len2 = dx * dx + dy * dy;
            float k = len2 > 1.0E-6F ? (this.b[2] - this.a[2]) / len2 : 0.0F;
            c.save();
            c.depthPlane(this.a[0], this.a[1], this.a[2], dx * k, dy * k);
            c.line(this.a[0], this.a[1], this.b[0], this.b[1], thickness, paint);
            c.restore();
            return true;
        } else {
            return false;
        }
    }

    public boolean band(
        Canvas c,
        double ax,
        double ay,
        double az,
        double bx,
        double by,
        double bz,
        double cx,
        double cy,
        double cz,
        double dx,
        double dy,
        double dz,
        int top,
        int bottom,
        boolean ribbon
    ) {
        float w = c.width();
        float h = c.height();
        if (this.projection.project(ax, ay, az, w, h, this.a)
            && this.projection.project(bx, by, bz, w, h, this.b)
            && this.projection.project(cx, cy, cz, w, h, this.s)
            && this.projection.project(dx, dy, dz, w, h, this.t)) {
            c.quad(
                this.a[0],
                this.a[1],
                this.a[2],
                this.b[0],
                this.b[1],
                this.b[2],
                this.s[0],
                this.s[1],
                this.s[2],
                this.t[0],
                this.t[1],
                this.t[2],
                top,
                bottom,
                ribbon
            );
            return true;
        } else {
            return false;
        }
    }

    public boolean band(
        Canvas c,
        double ax,
        double ay,
        double az,
        double bx,
        double by,
        double bz,
        double cx,
        double cy,
        double cz,
        double dx,
        double dy,
        double dz,
        int from,
        int to,
        float edgeA,
        float middle,
        float edgeB
    ) {
        float w = c.width();
        float h = c.height();
        if (this.projection.project(ax, ay, az, w, h, this.a)
            && this.projection.project(bx, by, bz, w, h, this.b)
            && this.projection.project(cx, cy, cz, w, h, this.s)
            && this.projection.project(dx, dy, dz, w, h, this.t)) {
            c.quad(
                this.a[0],
                this.a[1],
                this.a[2],
                this.b[0],
                this.b[1],
                this.b[2],
                this.s[0],
                this.s[1],
                this.s[2],
                this.t[0],
                this.t[1],
                this.t[2],
                from,
                to,
                edgeA,
                middle,
                edgeB
            );
            return true;
        } else {
            return false;
        }
    }
}
