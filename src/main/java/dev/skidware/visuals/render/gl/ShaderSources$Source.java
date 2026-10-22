package dev.skidware.visuals.render.gl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record ShaderSources$Source(String name, String text, List<String> origins) {
    public String annotate(String log) {
        StringBuilder sb = new StringBuilder();

        for (String line : log.split("\n")) {
            Matcher m = Pattern.compile("(?:\\d+[:(])(\\d+)").matcher(line);
            if (m.find()) {
                int ln = Integer.parseInt(m.group(1)) - 1;
                if (ln >= 0 && ln < this.origins.size()) {
                    sb.append('[').append((String)this.origins.get(ln)).append("] ");
                }
            }

            sb.append(line).append('\n');
        }

        return sb.toString();
    }
}
