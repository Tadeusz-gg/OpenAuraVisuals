package dev.skidware.visuals.render.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@FunctionalInterface
public interface ResourceSource {
    byte[] read(String var1);

    default String readText(String path) {
        return new String(this.read(path), StandardCharsets.UTF_8);
    }

    static ResourceSource classpath() {
        ClassLoader loader = ResourceSource.class.getClassLoader();
        return path -> {
            try {
                byte[] var3;
                try (InputStream in = loader.getResourceAsStream(path)) {
                    if (in == null) {
                        throw new UncheckedIOException(new IOException("Missing resource " + path));
                    }

                    var3 = in.readAllBytes();
                }

                return var3;
            } catch (IOException var7) {
                throw new UncheckedIOException(var7);
            }
        };
    }

    static ResourceSource overlay(Path directory, ResourceSource fallback) {
        return path -> {
            Path file = directory.resolve(path);
            if (Files.isRegularFile(file)) {
                try {
                    return Files.readAllBytes(file);
                } catch (IOException var5) {
                    throw new UncheckedIOException(var5);
                }
            } else {
                return fallback.read(path);
            }
        };
    }
}
