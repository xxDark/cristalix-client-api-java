package dev.xdark.clientapi.opengl;

import static dev.xdark.clientapi.util.SideEffects.*;
import static dev.xdark.clientapi.util.SideEffects.booleanValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

@SidedApi(Side.SERVER)
public final class OpenGlHelper {

  public static final boolean nvidia = booleanValue();
  public static final boolean ati = booleanValue();
  public static final int GL_FRAMEBUFFER = intValue();
  public static final int GL_RENDERBUFFER = intValue();
  public static final int GL_COLOR_ATTACHMENT0 = intValue();
  public static final int GL_DEPTH_ATTACHMENT = intValue();
  public static final int GL_FRAMEBUFFER_COMPLETE = intValue();
  public static final int GL_FB_INCOMPLETE_ATTACHMENT = intValue();
  public static final int GL_FB_INCOMPLETE_MISS_ATTACH = intValue();
  public static final int GL_FB_INCOMPLETE_DRAW_BUFFER = intValue();
  public static final int GL_FB_INCOMPLETE_READ_BUFFER = intValue();
  public static final boolean framebufferSupported = booleanValue();
  public static final int GL_LINK_STATUS = intValue();
  public static final int GL_COMPILE_STATUS = intValue();
  public static final int GL_VERTEX_SHADER = intValue();
  public static final int GL_FRAGMENT_SHADER = intValue();
  public static final int defaultTexUnit = intValue();
  public static final int lightmapTexUnit = intValue();
  public static final int GL_TEXTURE2 = intValue();
  public static final int GL_COMBINE = intValue();
  public static final int GL_INTERPOLATE = intValue();
  public static final int GL_PRIMARY_COLOR = intValue();
  public static final int GL_CONSTANT = intValue();
  public static final int GL_PREVIOUS = intValue();
  public static final int GL_COMBINE_RGB = intValue();
  public static final int GL_SOURCE0_RGB = intValue();
  public static final int GL_SOURCE1_RGB = intValue();
  public static final int GL_SOURCE2_RGB = intValue();
  public static final int GL_OPERAND0_RGB = intValue();
  public static final int GL_OPERAND1_RGB = intValue();
  public static final int GL_OPERAND2_RGB = intValue();
  public static final int GL_COMBINE_ALPHA = intValue();
  public static final int GL_SOURCE0_ALPHA = intValue();
  public static final int GL_SOURCE1_ALPHA = intValue();
  public static final int GL_SOURCE2_ALPHA = intValue();
  public static final int GL_OPERAND0_ALPHA = intValue();
  public static final int GL_OPERAND1_ALPHA = intValue();
  public static final int GL_OPERAND2_ALPHA = intValue();
  public static final boolean extBlendFuncSeparate = booleanValue();
  public static final boolean openGL21 = booleanValue();
  public static final boolean shadersSupported = booleanValue();
  public static final boolean vboSupported = booleanValue();
  public static final boolean vboSupportedAti = booleanValue();
  public static final int GL_ARRAY_BUFFER = intValue();
  public static final int GL_STATIC_DRAW = intValue();
  public static final boolean openGL31 = booleanValue();
  public static final boolean vboRegions = booleanValue();
  public static final int GL_COPY_READ_BUFFER = intValue();
  public static final int GL_COPY_WRITE_BUFFER = intValue();
  public static final int GL_QUADS = 7;
  public static final int GL_TRIANGLES = 4;

  private OpenGlHelper() {
  }

  public static int glGetProgrami(int program, int pname) {
    throw CompileStub.create();
  }

  public static void glAttachShader(int program, int shader) {
    throw CompileStub.create();
  }

  public static void glDeleteShader(int shader) {
    throw CompileStub.create();
  }

  public static int glCreateShader(int type) {
    throw CompileStub.create();
  }

  public static void glCompileShader(int shader) {
    throw CompileStub.create();
  }

  public static int glGetShaderi(int shader, int pname) {
    throw CompileStub.create();
  }

  public static void glUseProgram(int program) {
    throw CompileStub.create();
  }

  public static int glCreateProgram() {
    throw CompileStub.create();
  }

  public static void glDeleteProgram(int program) {
    throw CompileStub.create();
  }

  public static void glLinkProgram(int program) {
    throw CompileStub.create();
  }

  public static void glUniform1(int location, IntBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform1i(int location, int v0) {
    throw CompileStub.create();
  }

  public static void glUniform1(int location, FloatBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform2(int location, IntBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform2(int location, FloatBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform3(int location, IntBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform3(int location, FloatBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform4(int location, IntBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniform4(int location, FloatBuffer values) {
    throw CompileStub.create();
  }

  public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer matrices) {
    throw CompileStub.create();
  }

  public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer matrices) {
    throw CompileStub.create();
  }

  public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer matrices) {
    throw CompileStub.create();
  }

  public static int glGenBuffers() {
    throw CompileStub.create();
  }

  public static void glBindBuffer(int target, int buffer) {
    throw CompileStub.create();
  }

  public static void glBufferData(int target, ByteBuffer data, int usage) {
    throw CompileStub.create();
  }

  public static void glDeleteBuffers(int buffer) {
    throw CompileStub.create();
  }

  public static boolean useVbo() {
    throw CompileStub.create();
  }

  public static void glBindFramebuffer(int target, int framebuffer) {
    throw CompileStub.create();
  }

  public static void glBindRenderbuffer(int target, int renderbuffer) {
    throw CompileStub.create();
  }

  public static void glDeleteRenderbuffers(int renderbuffer) {
    throw CompileStub.create();
  }

  public static void glDeleteFramebuffers(int framebuffer) {
    throw CompileStub.create();
  }

  public static int glGenFramebuffers() {
    throw CompileStub.create();
  }

  public static int glGenRenderbuffers() {
    throw CompileStub.create();
  }

  public static void glRenderbufferStorage(int target, int internalformat, int width, int height) {
    throw CompileStub.create();
  }

  public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget,
      int renderbuffer) {
    throw CompileStub.create();
  }

  public static int glCheckFramebufferStatus(int target) {
    throw CompileStub.create();
  }

  public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture,
      int level) {
    throw CompileStub.create();
  }

  public static void glActiveTexture(int texture) {
    throw CompileStub.create();
  }

  public static void glClientActiveTexture(int texture) {
    throw CompileStub.create();
  }

  public static void setLightmapTextureCoords(int target, float s, float t) {
    throw CompileStub.create();
  }

  public static void glBlendFunc(int sfactorRGB, int dfactorRGB, int sfactorAlpha,
      int dfactorAlpha) {
    throw CompileStub.create();
  }

  public static boolean isFramebufferEnabled() {
    throw CompileStub.create();
  }

  public static void glBufferData(int target, long data_size, int usage) {
    throw CompileStub.create();
  }

  public static void glBufferSubData(int target, long offset, ByteBuffer data) {
    throw CompileStub.create();
  }

  public static void glCopyBufferSubData(int readtarget, int writetarget, long readoffset,
      long writeoffset, long size) {
    throw CompileStub.create();
  }

  public static String getCpu() {
    throw CompileStub.create();
  }

  @SidedApi(Side.SERVER)
  public interface FboMode {

    FboMode BASE = objectValue(),
        ARB = objectValue(),
        EXT = objectValue();
  }
}
