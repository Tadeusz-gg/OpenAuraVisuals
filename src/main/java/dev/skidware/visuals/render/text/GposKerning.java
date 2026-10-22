package dev.skidware.visuals.render.text;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

final class GposKerning {
    private static final int TAG_GPOS = 1196445523;
    private static final int TAG_KERN = 1801810542;
    private static final int PAIR_POS = 2;
    private static final int EXTENSION = 9;
    private final ByteBuffer data;
    private final int[] subtables;
    private final int[] lookupStart;

    private GposKerning(ByteBuffer data, int[] subtables, int[] lookupStart) {
        this.data = data;
        this.subtables = subtables;
        this.lookupStart = lookupStart;
    }

    static GposKerning parse(ByteBuffer font) {
        ByteBuffer d = font.duplicate().order(ByteOrder.BIG_ENDIAN);
        d.position(0);

        try {
            int gpos = findTable(d, 1196445523);
            if (gpos < 0) {
                return null;
            } else {
                int featureList = gpos + u16(d, gpos + 6);
                int lookupList = gpos + u16(d, gpos + 8);
                int[] lookups = new int[0];
                int featureCount = u16(d, featureList);

                for (int i = 0; i < featureCount; i++) {
                    int record = featureList + 2 + i * 6;
                    if (d.getInt(record) == 1801810542) {
                        int feature = featureList + u16(d, record + 4);
                        int count = u16(d, feature + 2);

                        for (int j = 0; j < count; j++) {
                            lookups = addSorted(lookups, u16(d, feature + 4 + j * 2));
                        }
                    }
                }

                if (lookups.length == 0) {
                    return null;
                } else {
                    int lookupCount = u16(d, lookupList);
                    int[] subtables = new int[16];
                    int[] starts = new int[lookups.length + 1];
                    int n = 0;

                    for (int li = 0; li < lookups.length; li++) {
                        starts[li] = n;
                        int index = lookups[li];
                        if (index < lookupCount) {
                            int lookup = lookupList + u16(d, lookupList + 2 + index * 2);
                            int type = u16(d, lookup);
                            int count = u16(d, lookup + 4);

                            for (int s = 0; s < count; s++) {
                                int sub = lookup + u16(d, lookup + 6 + s * 2);
                                int pairPos = -1;
                                if (type == 2) {
                                    pairPos = sub;
                                } else if (type == 9 && u16(d, sub) == 1 && u16(d, sub + 2) == 2) {
                                    pairPos = sub + d.getInt(sub + 4);
                                }

                                if (pairPos >= 0) {
                                    int format = u16(d, pairPos);
                                    if (format == 1 || format == 2) {
                                        if (n == subtables.length) {
                                            subtables = Arrays.copyOf(subtables, n * 2);
                                        }

                                        subtables[n++] = pairPos;
                                    }
                                }
                            }
                        }
                    }

                    starts[lookups.length] = n;
                    return n == 0 ? null : new GposKerning(d, Arrays.copyOf(subtables, n), starts);
                }
            }
        } catch (IndexOutOfBoundsException var20) {
            return null;
        }
    }

    int kerning(int left, int right) {
        int total = 0;

        try {
            for (int l = 0; l + 1 < this.lookupStart.length; l++) {
                for (int s = this.lookupStart[l]; s < this.lookupStart[l + 1]; s++) {
                    int value = this.pairValue(this.subtables[s], left, right);
                    if (value != Integer.MIN_VALUE) {
                        total += value;
                        break;
                    }
                }
            }

            return total;
        } catch (IndexOutOfBoundsException var7) {
            return 0;
        }
    }

    private int pairValue(int sub, int left, int right) {
        int coverage = this.coverageIndex(sub + u16(this.data, sub + 2), left);
        if (coverage < 0) {
            return Integer.MIN_VALUE;
        } else {
            int format1 = u16(this.data, sub + 4);
            int format2 = u16(this.data, sub + 6);
            int size1 = valueSize(format1);
            int size2 = valueSize(format2);
            if (u16(this.data, sub) == 1) {
                if (coverage >= u16(this.data, sub + 8)) {
                    return Integer.MIN_VALUE;
                } else {
                    int set = sub + u16(this.data, sub + 10 + coverage * 2);
                    int stride = 2 + size1 + size2;
                    int lo = 0;
                    int hi = u16(this.data, set) - 1;

                    while (lo <= hi) {
                        int mid = lo + hi >>> 1;
                        int record = set + 2 + mid * stride;
                        int glyph = u16(this.data, record);
                        if (glyph < right) {
                            lo = mid + 1;
                        } else {
                            if (glyph <= right) {
                                return this.xAdvance(record + 2, format1);
                            }

                            hi = mid - 1;
                        }
                    }

                    return Integer.MIN_VALUE;
                }
            } else {
                int class1 = this.classOf(sub + u16(this.data, sub + 8), left);
                int class2 = this.classOf(sub + u16(this.data, sub + 10), right);
                int class1Count = u16(this.data, sub + 12);
                int class2Count = u16(this.data, sub + 14);
                if (class1 < class1Count && class2 < class2Count) {
                    int record = sub + 16 + (class1 * class2Count + class2) * (size1 + size2);
                    return this.xAdvance(record, format1);
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
    }

    private int xAdvance(int record, int format) {
        return (format & 4) == 0 ? 0 : (short)u16(this.data, record + 2 * Integer.bitCount(format & 3));
    }

    private static int valueSize(int format) {
        return 2 * Integer.bitCount(format & 0xFF);
    }

    private int coverageIndex(int table, int glyph) {
        int format = u16(this.data, table);
        int count = u16(this.data, table + 2);
        int lo = 0;
        int hi = count - 1;
        if (format == 1) {
            while (lo <= hi) {
                int mid = lo + hi >>> 1;
                int g = u16(this.data, table + 4 + mid * 2);
                if (g < glyph) {
                    lo = mid + 1;
                } else {
                    if (g <= glyph) {
                        return mid;
                    }

                    hi = mid - 1;
                }
            }

            return -1;
        } else {
            if (format == 2) {
                while (lo <= hi) {
                    int mid = lo + hi >>> 1;
                    int range = table + 4 + mid * 6;
                    if (glyph < u16(this.data, range)) {
                        hi = mid - 1;
                    } else {
                        if (glyph <= u16(this.data, range + 2)) {
                            return u16(this.data, range + 4) + glyph - u16(this.data, range);
                        }

                        lo = mid + 1;
                    }
                }
            }

            return -1;
        }
    }

    private int classOf(int table, int glyph) {
        int format = u16(this.data, table);
        if (format == 1) {
            int start = u16(this.data, table + 2);
            int count = u16(this.data, table + 4);
            return glyph >= start && glyph < start + count ? u16(this.data, table + 6 + (glyph - start) * 2) : 0;
        } else {
            if (format == 2) {
                int lo = 0;
                int hi = u16(this.data, table + 2) - 1;

                while (lo <= hi) {
                    int mid = lo + hi >>> 1;
                    int range = table + 4 + mid * 6;
                    if (glyph < u16(this.data, range)) {
                        hi = mid - 1;
                    } else {
                        if (glyph <= u16(this.data, range + 2)) {
                            return u16(this.data, range + 4);
                        }

                        lo = mid + 1;
                    }
                }
            }

            return 0;
        }
    }

    private static int findTable(ByteBuffer d, int tag) {
        int count = u16(d, 4);

        for (int i = 0; i < count; i++) {
            int record = 12 + i * 16;
            if (d.getInt(record) == tag) {
                return d.getInt(record + 8);
            }
        }

        return -1;
    }

    private static int[] addSorted(int[] values, int v) {
        int at = Arrays.binarySearch(values, v);
        if (at >= 0) {
            return values;
        } else {
            int insert = -at - 1;
            int[] out = new int[values.length + 1];
            System.arraycopy(values, 0, out, 0, insert);
            out[insert] = v;
            System.arraycopy(values, insert, out, insert + 1, values.length - insert);
            return out;
        }
    }

    private static int u16(ByteBuffer d, int offset) {
        return d.getShort(offset) & 65535;
    }
}
