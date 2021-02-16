package dev.xdark.clientapi.opengl;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.vector.Quaternion;

@SidedApi(Side.SERVER)
public final class GlStateManager {

  private GlStateManager() {
  }

  public static void pushAttrib() {
    throw CompileStub.create();
  }

  public static void popAttrib() {
    throw CompileStub.create();
  }

  public static void disableAlpha() {
    throw CompileStub.create();
  }

  public static void enableAlpha() {
    throw CompileStub.create();
  }

  public static void alphaFunc(int func, float ref) {
    throw CompileStub.create();
  }

  public static void enableLighting() {
    throw CompileStub.create();
  }

  public static void disableLighting() {
    throw CompileStub.create();
  }

  public static void enableLight(int idx) {
    throw CompileStub.create();
  }

  public static void disableLight(int idx) {
    throw CompileStub.create();
  }

  public static void enableColorMaterial() {
    throw CompileStub.create();
  }

  public static void disableColorMaterial() {
    throw CompileStub.create();
  }

  public static void colorMaterial(int face, int mode) {
    throw CompileStub.create();
  }

  public static void glLight(int light, int pname, FloatBuffer params) {
    throw CompileStub.create();
  }

  public static void glLightModel(int pname, FloatBuffer params) {
    throw CompileStub.create();
  }

  public static void glNormal3f(float nx, float ny, float nz) {
    throw CompileStub.create();
  }

  public static void disableDepth() {
    throw CompileStub.create();
  }

  public static void enableDepth() {
    throw CompileStub.create();
  }

  public static void depthFunc(int func) {
    throw CompileStub.create();
  }

  public static void depthMask(boolean mask) {
    throw CompileStub.create();
  }

  public static void disableBlend() {
    throw CompileStub.create();
  }

  public static void enableBlend() {
    throw CompileStub.create();
  }

  public static void blendFunc(int srcFactor, int destFactor) {
    throw CompileStub.create();
  }

  public static void tryBlendFuncSeparate(int srcFactor,
      int dstFactor, int srcFactorAlpha, int dstFactorAlpha) {
    throw CompileStub.create();
  }

  public static void glBlendEquation(int mode) {
    throw CompileStub.create();
  }

  public static void enableOutlineMode(int color) {
    throw CompileStub.create();
  }

  public static void disableOutlineMode() {
    throw CompileStub.create();
  }

  public static void enableFog() {
    throw CompileStub.create();
  }

  public static void disableFog() {
    throw CompileStub.create();
  }

  private static void setFog(int mode) {
    throw CompileStub.create();
  }

  public static void setFogDensity(float density) {
    throw CompileStub.create();
  }

  public static void setFogStart(float start) {
    throw CompileStub.create();
  }

  public static void setFogEnd(float end) {
    throw CompileStub.create();
  }

  public static void glFog(int pname, FloatBuffer params) {
    throw CompileStub.create();
  }

  public static void glFogi(int pname, int param) {
    throw CompileStub.create();
  }

  public static void enableCull() {
    throw CompileStub.create();
  }

  public static void disableCull() {
    throw CompileStub.create();
  }

  private static void cullFace(int mode) {
    throw CompileStub.create();
  }

  public static void glPolygonMode(int face, int mode) {
    throw CompileStub.create();
  }

  public static void enablePolygonOffset() {
    throw CompileStub.create();
  }

  public static void disablePolygonOffset() {
    throw CompileStub.create();
  }

  public static void doPolygonOffset(float factor, float units) {
    throw CompileStub.create();
  }

  public static void enableColorLogic() {
    throw CompileStub.create();
  }

  public static void disableColorLogic() {
    throw CompileStub.create();
  }

  public static void colorLogicOp(int opcode) {
    throw CompileStub.create();
  }

  public static void setActiveTexture(int texture) {
    throw CompileStub.create();
  }

  public static void enableTexture2D() {
    throw CompileStub.create();
  }

  public static void disableTexture2D() {
    throw CompileStub.create();
  }

  public static void glTexEnv(int target, int pname, FloatBuffer params) {
    throw CompileStub.create();
  }

  public static void glTexEnvi(int target, int pname, int param) {
    throw CompileStub.create();
  }

  public static void glTexEnvf(int target, int pname, float param) {
    throw CompileStub.create();
  }

  public static void glTexParameterf(int target, int pname, float param) {
    throw CompileStub.create();
  }

  public static void glTexParameteri(int target, int pname, int param) {
    throw CompileStub.create();
  }


  public static int glGetTexLevelParameteri(int target, int level, int pname) {
    throw CompileStub.create();
  }

  public static int generateTexture() {
    throw CompileStub.create();
  }

  public static void deleteTexture(int id) {
    throw CompileStub.create();
  }

  public static void bindTexture(int texture) {
    throw CompileStub.create();
  }

  public static void glTexImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, IntBuffer pixels) {
    throw CompileStub.create();
  }

  public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, IntBuffer pixels) {
    throw CompileStub.create();
  }

  public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x,
      int y, int width, int height) {
    throw CompileStub.create();
  }

  public static void glGetTexImage(int target, int level, int format, int type, IntBuffer pixels) {
    throw CompileStub.create();
  }

  public static void enableNormalize() {
    throw CompileStub.create();
  }

  public static void disableNormalize() {
    throw CompileStub.create();
  }

  public static void shadeModel(int shadeModel) {
    throw CompileStub.create();
  }

  public static void enableRescaleNormal() {
    throw CompileStub.create();
  }

  public static void disableRescaleNormal() {
    throw CompileStub.create();
  }

  public static void viewport(int x, int y, int width, int height) {
    throw CompileStub.create();
  }

  public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
    throw CompileStub.create();
  }

  public static void clearDepth(double depth) {
    throw CompileStub.create();
  }

  public static void clearColor(float red, float green, float blue, float alpha) {
    throw CompileStub.create();
  }

  public static void clear(int mask) {
    throw CompileStub.create();
  }

  public static void matrixMode(int mode) {
    throw CompileStub.create();
  }

  public static void loadIdentity() {
    throw CompileStub.create();
  }

  public static void pushMatrix() {
    throw CompileStub.create();
  }

  public static void popMatrix() {
    throw CompileStub.create();
  }

  public static void glGetFloat(int pname, FloatBuffer params) {
    throw CompileStub.create();
  }

  public static void ortho(double left, double right, double bottom, double top, double zNear,
      double zFar) {
    throw CompileStub.create();
  }

  public static void rotate(float angle, float x, float y, float z) {
    throw CompileStub.create();
  }

  public static void scale(float x, float y, float z) {
    throw CompileStub.create();
  }

  public static void scale(double x, double y, double z) {
    throw CompileStub.create();
  }

  public static void translate(float x, float y, float z) {
    throw CompileStub.create();
  }

  public static void translate(double x, double y, double z) {
    throw CompileStub.create();
  }

  public static void multMatrix(FloatBuffer m) {
    throw CompileStub.create();
  }

  public static void rotate(Quaternion quaternion) {
    throw CompileStub.create();
  }

  public static void color(float r, float g, float b, float a) {
    throw CompileStub.create();
  }

  public static void glTexCoord2f(float s, float t) {
    throw CompileStub.create();
  }

  public static void glVertex3f(float x, float y, float z) {
    throw CompileStub.create();
  }

  public static void resetColor() {
    throw CompileStub.create();
  }

  public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
    throw CompileStub.create();
  }

  public static void glTexCoordPointer(int size, int type, int stride, long pointer_buffer_offset) {
    throw CompileStub.create();
  }

  public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
    throw CompileStub.create();
  }

  public static void glVertexPointer(int size, int type, int stride, int ptr) {
    throw CompileStub.create();
  }

  public static void glVertexPointer(int size, int type, int stride, ByteBuffer buffer) {
    throw CompileStub.create();
  }

  public static void glColorPointer(int size, int type, int stride, long pointer_buffer_offset) {
    throw CompileStub.create();
  }

  public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
    throw CompileStub.create();
  }

  public static void glDisableClientState(int cap) {
    throw CompileStub.create();
  }

  public static void glEnableClientState(int cap) {
    throw CompileStub.create();
  }

  public static void glBegin(int mode) {
    throw CompileStub.create();
  }

  public static void glEnd() {
    throw CompileStub.create();
  }

  public static void glDrawArrays(int mode, int first, int count) {
    throw CompileStub.create();
  }

  public static void glLineWidth(float width) {
    throw CompileStub.create();
  }

  public static void callList(int list) {
    throw CompileStub.create();
  }

  public static void callLists(IntBuffer lists) {
    throw CompileStub.create();
  }

  public static void glDeleteLists(int list, int range) {
    throw CompileStub.create();
  }

  public static void glNewList(int list, int mode) {
    throw CompileStub.create();
  }

  public static void glEndList() {
    throw CompileStub.create();
  }

  public static int glGenLists(int range) {
    throw CompileStub.create();
  }

  public static void glPixelStorei(int pname, int param) {
    throw CompileStub.create();
  }

  public static void glReadPixels(int x, int y, int width, int height, int format, int type,
      IntBuffer pixels) {
    throw CompileStub.create();
  }

  public static int glGetError() {
    throw CompileStub.create();
  }

  public static void glGetInteger(int pname, IntBuffer params) {
    throw CompileStub.create();
  }

  public static void enableBlendProfile(Profile profile) {
    throw CompileStub.create();
  }

  public static void disableBlendProfile(Profile profile) {
    throw CompileStub.create();
  }

  public static int getActiveTextureUnit() {
    throw CompileStub.create();
  }

  public static void bindCurrentTexture() {
    throw CompileStub.create();
  }

  public static int getBoundTexture() {
    throw CompileStub.create();
  }

  public static void deleteTextures(IntBuffer textures) {
    throw CompileStub.create();
  }

  public static boolean isFogEnabled() {
    throw CompileStub.create();
  }

  public static void setFogEnabled(boolean enabled) {
    throw CompileStub.create();
  }

  public static void glMultiDrawArrays(int mode, IntBuffer piFirst, IntBuffer piCount) {
    throw CompileStub.create();
  }

  public static void stencilFunc(int func, int ref, int mask) {
    throw CompileStub.create();
  }

  public static void stencilMask(int mask) {
    throw CompileStub.create();
  }

  public static void stencilOp(int fail, int zfail, int zpass) {
    throw CompileStub.create();
  }

  public static void clearStencil(int s) {
    throw CompileStub.create();
  }

  @SidedApi(Side.SERVER)
  public interface Profile {

    Profile DEFAULT = objectValue(),
        PLAYER_SKIN = objectValue(),
        TRANSPARENT_MODEL = objectValue();
  }
}
