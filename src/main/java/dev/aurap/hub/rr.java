package dev.aurap.hub;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public final class rr {
    public static final int c = 1;
    public static final String p = "auravisuals";
    public static final String YD = "auravisuals-client";
    public static final String NF = "application/vnd.auravisuals.v1";
    public static final int QB = 16;
    public static final int W = 32;
    public static final int j = 32;
    public static final int Lp = 32;
    public static final int lM = 64;
    public static final int BG = 8;
    public static final int E = 32;
    public static final int v = 4096;
    public static final int GQ = 7680;
    public static final int BD = 7168;
    public static final int b = 65536;
    public static final String g = "AURA-";
    public static final int Sx = 6;
    public static final String iD = "23456789ABCDEFGHJKMNPQRSTUVWXYZ";
    public static final int XJ = 16;
    public static final int wX = 16384;
    public static final int uM = 64;
    public static final int B = 128;
    public static final int Ln = 32;
    public static final int V = 32;
    public static final int Sa = 16;
    public static final int O = 4;
    public static final int i = 200;
    public static final int d = 128;
    public static final int h = 256;
    public static final long Ab = 8388608L;
    public static final int H = 12;
    public static final int y = 16;
    public static final long zQ = 8454144L;
    public static final long XB = 9437184L;
    public static final long Ag = 21600000L;
    public static final long Nk = 52428800L;
    public static final long e = 52494336L;
    public static final int l;
    public static final int jg;
    public static final int I;
    public static final int wd;
    public static final int jX;
    public static final int T;
    public static final int A;
    public static final int EA;
    public static final int AH;
    public static final int K;
    public static final int JX;
    public static final int ze;
    public static final int bv;
    public static final String qK = "auravisuals/request/v1";
    public static final String RH = "auravisuals/session-envelope/v1";
    public static final String pv = "auravisuals/license-envelope/v1";
    public static final String C = "auravisuals/content-manifest/v1";
    public static final String at = "auravisuals/content-package/v1";
    public static final String L = "auravisuals/device-key/v1";
    public static final String Qn = "auravisuals/kid/v1";
    public static final String rs = "auravisuals/hwid/v1";
    public static final String X = "auravisuals/bootstrap/v1";
    public static final String Ex = "auravisuals/download-token/v1";
    public static final String Z = "auravisuals/loader-seal/v1";
    public static final int N;

    private rr() {
    }

    private static int F(char var0, char var1, char var2, char var3, int var4) {
        int var7 = var0 << 24;
        long var8 = var0;
        long var10 = var8 + 1L;
        var10 = var8 * var10;
        long var12 = var8 + 2L;
        var10 *= var12;
        var8 += 3L;
        var10 *= var8;
        var8 = var10 & 7L;
        long var40;
        int var6 = (var40 = var8 - 0L) == 0L ? 0 : (var40 < 0L ? -1 : 1);
        if (var6 != 0) {
            int var5 = var4 | -1361749378;
            var5 &= -1068170420;
            var5 |= -595793837;
            var5 ^= 1629425673;
            var6 = var5 + 1;
            var6 = var5 * var6;
            var6 &= 1;
            if (var6 == 0) {
                RuntimeException var31 = new RuntimeException();
                throw var31;
            }
        } else {
            int var17 = var4 - -425391360;
            var17 *= 965425355;
            var17 ^= 1531240360;
            var17 ^= 1143310657;
            long var21 = var17;
            var8 = var21 + 1L;
            var8 = var21 * var8;
            long var22 = var8 & 1L;
            long var41;
            var17 = (var41 = var22 - 0L) == 0L ? 0 : (var41 < 0L ? -1 : 1);
            if (var17 == 0) {
                var17 = var1 << 16;
                var17 = var7 | var17;
                var6 = var2 << '\b';
                var17 |= var6;
                return var17 | var3;
            }
        }

        UnsupportedOperationException var24 = new UnsupportedOperationException();
        throw var24;
    }

    static {
        Lookup var0 = MethodHandles.lookup();
        Class var3 = var0.lookupClass();
        int var1 = 1718760446;
        byte var2 = 0;
        int var4 = of_2.xF(var3, var1, var2);
        N = var4;
        int var5 = F('A', 'V', 'C', 'Q', -1084495451);
        l = var5;
        int var6 = F('A', 'V', 'C', 'S', -1084495451);
        jg = var6;
        int var7 = F('A', 'V', 'R', 'Q', -1084495451);
        I = var7;
        int var8 = F('A', 'V', 'S', 'E', -1084495451);
        wd = var8;
        int var9 = F('A', 'V', 'L', 'C', -1084495451);
        jX = var9;
        int var10 = F('A', 'V', 'M', 'F', -1084495451);
        T = var10;
        int var11 = F('A', 'V', 'P', 'K', -1084495451);
        A = var11;
        int var12 = F('A', 'V', 'A', 'R', -1084495451);
        EA = var12;
        int var13 = F('A', 'V', 'C', 'B', -1084495451);
        AH = var13;
        int var14 = F('A', 'V', 'E', 'R', -1084495451);
        K = var14;
        int var15 = F('A', 'V', 'O', 'K', -1084495451);
        JX = var15;
        int var16 = F('A', 'V', 'L', 'P', -1084495451);
        ze = var16;
        int var17 = F('A', 'V', 'C', 'R', -1084495451);
        bv = var17;
    }
}
