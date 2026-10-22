package dev.skidware.visuals.render.gl;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL33C;

public final class GlProgram implements AutoCloseable {
    private final String name;
    private final int id;
    private final Map<String, Integer> uniforms = new HashMap<>();

    private GlProgram(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static GlProgram link(String name, ShaderSources$Source vertex, ShaderSources$Source fragment, String... attributes) {
        int vs = compile(35633, vertex);

        int fs;
        try {
            fs = compile(35632, fragment);
        } catch (GlProgram$ShaderException var8) {
            GL33C.glDeleteShader(vs);
            throw var8;
        }

        int program = GL33C.glCreateProgram();
        GL33C.glAttachShader(program, vs);
        GL33C.glAttachShader(program, fs);

        for (int i = 0; i < attributes.length; i++) {
            GL33C.glBindAttribLocation(program, i, attributes[i]);
        }

        GL33C.glBindFragDataLocation(program, 0, "o_color");
        GL33C.glLinkProgram(program);
        GL33C.glDetachShader(program, vs);
        GL33C.glDetachShader(program, fs);
        GL33C.glDeleteShader(vs);
        GL33C.glDeleteShader(fs);
        if (GL33C.glGetProgrami(program, 35714) == 0) {
            String log = GL33C.glGetProgramInfoLog(program);
            GL33C.glDeleteProgram(program);
            throw new GlProgram$ShaderException("Link failed for " + name + ":\n" + log);
        } else {
            return new GlProgram(name, program);
        }
    }

    private static int compile(int type, ShaderSources$Source source) {
        int shader = GL33C.glCreateShader(type);
        GL33C.glShaderSource(shader, source.text());
        GL33C.glCompileShader(shader);
        if (GL33C.glGetShaderi(shader, 35713) == 0) {
            String log = GL33C.glGetShaderInfoLog(shader);
            GL33C.glDeleteShader(shader);
            throw new GlProgram$ShaderException("Compile failed for " + source.name() + ":\n" + source.annotate(log));
        } else {
            return shader;
        }
    }

    public String name() {
        return this.name;
    }

    public int id() {
        return this.id;
    }

    public void use() {
        GL33C.glUseProgram(this.id);
    }

    public int uniform(String uniform) {
        return this.uniforms.computeIfAbsent(uniform, u -> GL33C.glGetUniformLocation(this.id, u));
    }

    public void set1i(String uniform, int v) {
        GL33C.glUniform1i(this.uniform(uniform), v);
    }

    public void set1f(String uniform, float v) {
        GL33C.glUniform1f(this.uniform(uniform), v);
    }

    public void set2f(String uniform, float x, float y) {
        GL33C.glUniform2f(this.uniform(uniform), x, y);
    }

    public void set3f(String uniform, float x, float y, float z) {
        GL33C.glUniform3f(this.uniform(uniform), x, y, z);
    }

    public void set4f(String uniform, float x, float y, float z, float w) {
        GL33C.glUniform4f(this.uniform(uniform), x, y, z, w);
    }

    public void setMatrix4(String uniform, float[] columnMajor) {
        GL33C.glUniformMatrix4fv(this.uniform(uniform), false, columnMajor);
    }

    public void set1fv(String uniform, float[] values) {
        GL33C.glUniform1fv(this.uniform(uniform), values);
    }

    @Override
    public void close() {
        GL33C.glDeleteProgram(this.id);
    }
}
