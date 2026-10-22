package dev.aurap.hub;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class OfflineProfile {
    public static final String HWID = "Mevinggs";
    public static final String NICK = "Mevinggs";
    public static final String VALID_UNTIL = "2067-10-21";
    public static final long EXPIRES_AT = LocalDate.of(2031, 10, 22).atStartOfDay(ZoneId.of("Europe/Warsaw")).toInstant().toEpochMilli();
    public static final Set<String> CAPABILITIES = Set.of("aura.full");

    private OfflineProfile() {
    }

    public static boolean validAt(long j0) {
        return j0 < EXPIRES_AT;
    }

    public static boolean valid() {
        return validAt(System.currentTimeMillis());
    }

    public static byte[] identity() {
        try {
            return MessageDigest.getInstance("SHA-256").digest("Mevinggs".getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException var1) {
            throw new AssertionError(var1);
        }
    }

    public static Map<String, byte[]> content() {
        LinkedHashMap v0 = new LinkedHashMap();

        try (InputStream v1 = OfflineProfile.class.getResourceAsStream("/META-INF/aura-offline/content.list")) {
            if (v1 == null) {
                throw new FileNotFoundException("missing resoures ? chyba?");
            }

            for (String v5 : new String(v1.readAllBytes(), StandardCharsets.UTF_8).split("\\R")) {
                if (!v5.isBlank()) {
                    try (InputStream v6 = OfflineProfile.class.getResourceAsStream("/" + v5)) {
                        if (v6 == null) {
                            throw new FileNotFoundException(v5);
                        }

                        v0.put(v5, v6.readAllBytes());
                    }
                }
            }
        } catch (IOException var14) {
            throw new UncheckedIOException("Rozjebane", var14);
        }

        return Collections.unmodifiableMap(v0);
    }

    public static byte[] remoteImage(String v0) {
        throw UncheckedExceptions.rethrow(new IOException("Niedozwolony kodeks 1 karny"));
    }
}
