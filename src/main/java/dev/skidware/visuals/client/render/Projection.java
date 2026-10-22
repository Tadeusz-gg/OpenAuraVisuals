package dev.skidware.visuals.client.render;

public final class Projection {
    private final float[] view = new float[16];
    private final float[] proj = new float[16];
    private final float[] viewProj = new float[16];
    private final float[] scratch = new float[4];
    private double camX;
    private double camY;
    private double camZ;
    private float focalY = 1.0F;
    private boolean valid;
    private boolean reversedDepth;

    public Projection() {
    }

    public void update(float[] view, float[] proj, double cameraX, double cameraY, double cameraZ) {
        System.arraycopy(view, 0, this.view, 0, 16);
        System.arraycopy(proj, 0, this.proj, 0, 16);
        multiply(proj, view, this.viewProj);
        this.focalY = proj[5];
        this.reversedDepth = eyeDepth(proj, 1.0F) > eyeDepth(proj, 64.0F);
        this.camX = cameraX;
        this.camY = cameraY;
        this.camZ = cameraZ;
        this.valid = true;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }

    public boolean reversedDepth() {
        return this.reversedDepth;
    }

    public void viewMatrix(float[] out) {
        System.arraycopy(this.view, 0, out, 0, 16);
    }

    public void projectionMatrix(float[] out) {
        System.arraycopy(this.proj, 0, out, 0, 16);
    }

    public double cameraX() {
        return this.camX;
    }

    public double cameraY() {
        return this.camY;
    }

    public double cameraZ() {
        return this.camZ;
    }

    public boolean toScreen(double x, double y, double z, float width, float height, float[] out) {
        if (!this.project(x, y, z, width, height, this.scratch)) {
            return false;
        } else {
            out[0] = this.scratch[0];
            out[1] = this.scratch[1];
            return out[0] > -width * 0.25F && out[0] < width * 1.25F && out[1] > -height * 0.25F && out[1] < height * 1.25F;
        }
    }

    public boolean project(double x, double y, double z, float width, float height, float[] out) {
        if (!this.valid) {
            return false;
        } else {
            float rx = (float)(x - this.camX);
            float ry = (float)(y - this.camY);
            float rz = (float)(z - this.camZ);
            float[] m = this.viewProj;
            float cw = m[3] * rx + m[7] * ry + m[11] * rz + m[15];
            if (cw <= 0.05F) {
                return false;
            } else {
                float cx = m[0] * rx + m[4] * ry + m[8] * rz + m[12];
                float cy = m[1] * rx + m[5] * ry + m[9] * rz + m[13];
                float cz = m[2] * rx + m[6] * ry + m[10] * rz + m[14];
                out[0] = (cx / cw * 0.5F + 0.5F) * width;
                out[1] = (0.5F - cy / cw * 0.5F) * height;
                out[2] = cz / cw;
                out[3] = this.focalY / cw * height * 0.5F;
                return true;
            }
        }
    }

    public boolean planeBasis(double cx, double cy, double cz, float ux, float uy, float uz, float vx, float vy, float vz, float[] out) {
        if (!this.valid) {
            return false;
        } else {
            this.toClip(ux, uy, uz, 0.0F, out, 0);
            this.toClip(vx, vy, vz, 0.0F, out, 4);
            this.toClip((float)(cx - this.camX), (float)(cy - this.camY), (float)(cz - this.camZ), 1.0F, out, 8);
            return true;
        }
    }

    private void toClip(float x, float y, float z, float w, float[] out, int o) {
        float[] m = this.viewProj;
        out[o] = m[0] * x + m[4] * y + m[8] * z + m[12] * w;
        out[o + 1] = m[1] * x + m[5] * y + m[9] * z + m[13] * w;
        out[o + 2] = m[2] * x + m[6] * y + m[10] * z + m[14] * w;
        out[o + 3] = m[3] * x + m[7] * y + m[11] * z + m[15] * w;
    }

    private static float eyeDepth(float[] p, float distance) {
        float z = -p[10] * distance + p[14];
        float w = -p[11] * distance + p[15];
        return z / w;
    }

    private static void multiply(float[] a, float[] b, float[] out) {
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                float s = 0.0F;

                for (int k = 0; k < 4; k++) {
                    s += a[k * 4 + row] * b[col * 4 + k];
                }

                out[col * 4 + row] = s;
            }
        }
    }
}
