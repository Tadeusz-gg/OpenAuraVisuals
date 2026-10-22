package dev.skidware.visuals.render.gl;

import dev.skidware.visuals.render.resource.ResourceSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class ShaderSources {
    public static final String ROOT = "assets/auravisuals/aura/shaders/";
    private final ResourceSource resources;

    public ShaderSources(ResourceSource resources) {
        this.resources = resources;
    }

    public ShaderSources$Source load(String name, Map<String, String> defines) {
        List<String> lines = new ArrayList<>();
        List<String> origins = new ArrayList<>();
        this.expand(name, lines, origins, new HashSet(), 0);
        int versionAt = -1;

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).trim().startsWith("#version")) {
                versionAt = i;
                break;
            }
        }

        if (versionAt < 0) {
            throw new IllegalStateException(name + " has no #version directive");
        } else {
            int insert = versionAt + 1;

            for (Entry<String, String> d : defines.entrySet()) {
                lines.add(insert, "#define " + d.getKey() + " " + d.getValue());
                origins.add(insert, "<define>");
                insert++;
            }

            return new ShaderSources$Source(name, String.join("\n", lines) + "\n", List.copyOf(origins));
        }
    }

    private void expand(String name, List out, List origins, Set seen, int depth) {
        if (depth > 16) {
            throw new IllegalStateException("Include depth exceeded at " + name);
        } else if (seen.add(name)) {
            String[] src = this.resources.readText("assets/auravisuals/aura/shaders/" + name).split("\r?\n", -1);

            for (int i = 0; i < src.length; i++) {
                String line = src[i];
                String trimmed = line.trim();
                if (trimmed.startsWith("#include")) {
                    int a = trimmed.indexOf(34);
                    int b = trimmed.lastIndexOf(34);
                    if (a < 0 || b <= a) {
                        throw new IllegalStateException("Malformed include in " + name + ":" + (i + 1));
                    }

                    this.expand(trimmed.substring(a + 1, b), out, origins, seen, depth + 1);
                } else {
                    out.add(line);
                    origins.add(name + ":" + (i + 1));
                }
            }
        }
    }
}
