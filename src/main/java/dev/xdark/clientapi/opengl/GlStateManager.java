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
    throw CompileStub.INSTANCE;
  }

  public static void popAttrib() {
    throw CompileStub.INSTANCE;
  }

  public static void disableAlpha() {
    throw CompileStub.INSTANCE;
  }

  public static void enableAlpha() {
    throw CompileStub.INSTANCE;
  }

  public static void alphaFunc(int func, float ref) {
    throw CompileStub.INSTANCE;
  }

  public static void enableLighting() {
    throw CompileStub.INSTANCE;
  }

  public static void disableLighting() {
    throw CompileStub.INSTANCE;
  }

  public static void enableLight(int idx) {
    throw CompileStub.INSTANCE;
  }

  public static void disableLight(int idx) {
    throw CompileStub.INSTANCE;
  }

  public static void enableColorMaterial() {
    throw CompileStub.INSTANCE;
  }

  public static void disableColorMaterial() {
    throw CompileStub.INSTANCE;
  }

  public static void colorMaterial(int face, int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void glLight(int light, int pname, FloatBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void glLightModel(int pname, FloatBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void glNormal3f(float nx, float ny, float nz) {
    throw CompileStub.INSTANCE;
  }

  public static void disableDepth() {
    throw CompileStub.INSTANCE;
  }

  public static void enableDepth() {
    throw CompileStub.INSTANCE;
  }

  public static void depthFunc(int func) {
    throw CompileStub.INSTANCE;
  }

  public static void depthMask(boolean mask) {
    throw CompileStub.INSTANCE;
  }

  public static void disableBlend() {
    throw CompileStub.INSTANCE;
  }

  public static void enableBlend() {
    throw CompileStub.INSTANCE;
  }

  public static void blendFunc(int srcFactor, int destFactor) {
    throw CompileStub.INSTANCE;
  }

  public static void tryBlendFuncSeparate(int srcFactor,
      int dstFactor, int srcFactorAlpha, int dstFactorAlpha) {
    throw CompileStub.INSTANCE;
  }

  public static void glBlendEquation(int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void enableOutlineMode(int color) {
    throw CompileStub.INSTANCE;
  }

  public static void disableOutlineMode() {
    throw CompileStub.INSTANCE;
  }

  public static void enableFog() {
    throw CompileStub.INSTANCE;
  }

  public static void disableFog() {
    throw CompileStub.INSTANCE;
  }

  private static void setFog(int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void setFogDensity(float density) {
    throw CompileStub.INSTANCE;
  }

  public static void setFogStart(float start) {
    throw CompileStub.INSTANCE;
  }

  public static void setFogEnd(float end) {
    throw CompileStub.INSTANCE;
  }

  public static void glFog(int pname, FloatBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void glFogi(int pname, int param) {
    throw CompileStub.INSTANCE;
  }

  public static void enableCull() {
    throw CompileStub.INSTANCE;
  }

  public static void disableCull() {
    throw CompileStub.INSTANCE;
  }

  private static void cullFace(int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void glPolygonMode(int face, int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void enablePolygonOffset() {
    throw CompileStub.INSTANCE;
  }

  public static void disablePolygonOffset() {
    throw CompileStub.INSTANCE;
  }

  public static void doPolygonOffset(float factor, float units) {
    throw CompileStub.INSTANCE;
  }

  public static void enableColorLogic() {
    throw CompileStub.INSTANCE;
  }

  public static void disableColorLogic() {
    throw CompileStub.INSTANCE;
  }

  public static void colorLogicOp(int opcode) {
    throw CompileStub.INSTANCE;
  }

  public static void setActiveTexture(int texture) {
    throw CompileStub.INSTANCE;
  }

  public static void enableTexture2D() {
    throw CompileStub.INSTANCE;
  }

  public static void disableTexture2D() {
    throw CompileStub.INSTANCE;
  }

  public static void glTexEnv(int target, int pname, FloatBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexEnvi(int target, int pname, int param) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexEnvf(int target, int pname, float param) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexParameterf(int target, int pname, float param) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexParameteri(int target, int pname, int param) {
    throw CompileStub.INSTANCE;
  }


  public static int glGetTexLevelParameteri(int target, int level, int pname) {
    throw CompileStub.INSTANCE;
  }

  public static int generateTexture() {
    throw CompileStub.INSTANCE;
  }

  public static void deleteTexture(int id) {
    throw CompileStub.INSTANCE;
  }

  public static void bindTexture(int texture) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexImage2D(int target, int level, int internalformat, int width, int height,
      int border, int format, int type, IntBuffer pixels) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width,
      int height, int format, int type, IntBuffer pixels) {
    throw CompileStub.INSTANCE;
  }

  public static void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x,
      int y, int width, int height) {
    throw CompileStub.INSTANCE;
  }

  public static void glGetTexImage(int target, int level, int format, int type, IntBuffer pixels) {
    throw CompileStub.INSTANCE;
  }

  public static void enableNormalize() {
    throw CompileStub.INSTANCE;
  }

  public static void disableNormalize() {
    throw CompileStub.INSTANCE;
  }

  public static void shadeModel(int shadeModel) {
    throw CompileStub.INSTANCE;
  }

  public static void enableRescaleNormal() {
    throw CompileStub.INSTANCE;
  }

  public static void disableRescaleNormal() {
    throw CompileStub.INSTANCE;
  }

  public static void viewport(int x, int y, int width, int height) {
    throw CompileStub.INSTANCE;
  }

  public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
    throw CompileStub.INSTANCE;
  }

  public static void clearDepth(double depth) {
    throw CompileStub.INSTANCE;
  }

  public static void clearColor(float red, float green, float blue, float alpha) {
    throw CompileStub.INSTANCE;
  }

  public static void clear(int mask) {
    throw CompileStub.INSTANCE;
  }

  public static void matrixMode(int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void loadIdentity() {
    throw CompileStub.INSTANCE;
  }

  public static void pushMatrix() {
    throw CompileStub.INSTANCE;
  }

  public static void popMatrix() {
    throw CompileStub.INSTANCE;
  }

  public static void glGetFloat(int pname, FloatBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void ortho(double left, double right, double bottom, double top, double zNear,
      double zFar) {
    throw CompileStub.INSTANCE;
  }

  public static void rotate(float angle, float x, float y, float z) {
    throw CompileStub.INSTANCE;
  }

  public static void scale(float x, float y, float z) {
    throw CompileStub.INSTANCE;
  }

  public static void scale(double x, double y, double z) {
    throw CompileStub.INSTANCE;
  }

  public static void translate(float x, float y, float z) {
    throw CompileStub.INSTANCE;
  }

  public static void translate(double x, double y, double z) {
    throw CompileStub.INSTANCE;
  }

  public static void multMatrix(FloatBuffer m) {
    throw CompileStub.INSTANCE;
  }

  public static void rotate(Quaternion quaternion) {
    throw CompileStub.INSTANCE;
  }

  public static void color(float r, float g, float b, float a) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexCoord2f(float s, float t) {
    throw CompileStub.INSTANCE;
  }

  public static void glVertex3f(float x, float y, float z) {
    throw CompileStub.INSTANCE;
  }

  public static void resetColor() {
    throw CompileStub.INSTANCE;
  }

  public static void glNormalPointer(int type, int stride, ByteBuffer pointer) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexCoordPointer(int size, int type, int stride, long pointer_buffer_offset) {
    throw CompileStub.INSTANCE;
  }

  public static void glTexCoordPointer(int size, int type, int stride, ByteBuffer pointer) {
    throw CompileStub.INSTANCE;
  }

  public static void glVertexPointer(int size, int type, int stride, int ptr) {
    throw CompileStub.INSTANCE;
  }

  public static void glVertexPointer(int size, int type, int stride, ByteBuffer buffer) {
    throw CompileStub.INSTANCE;
  }

  public static void glColorPointer(int size, int type, int stride, long pointer_buffer_offset) {
    throw CompileStub.INSTANCE;
  }

  public static void glColorPointer(int size, int type, int stride, ByteBuffer pointer) {
    throw CompileStub.INSTANCE;
  }

  public static void glDisableClientState(int cap) {
    throw CompileStub.INSTANCE;
  }

  public static void glEnableClientState(int cap) {
    throw CompileStub.INSTANCE;
  }

  public static void glBegin(int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void glEnd() {
    throw CompileStub.INSTANCE;
  }

  public static void glDrawArrays(int mode, int first, int count) {
    throw CompileStub.INSTANCE;
  }

  public static void glLineWidth(float width) {
    throw CompileStub.INSTANCE;
  }

  public static void callList(int list) {
    throw CompileStub.INSTANCE;
  }

  public static void callLists(IntBuffer lists) {
    throw CompileStub.INSTANCE;
  }

  public static void glDeleteLists(int list, int range) {
    throw CompileStub.INSTANCE;
  }

  public static void glNewList(int list, int mode) {
    throw CompileStub.INSTANCE;
  }

  public static void glEndList() {
    throw CompileStub.INSTANCE;
  }

  public static int glGenLists(int range) {
    throw CompileStub.INSTANCE;
  }

  public static void glPixelStorei(int pname, int param) {
    throw CompileStub.INSTANCE;
  }

  public static void glReadPixels(int x, int y, int width, int height, int format, int type,
      IntBuffer pixels) {
    throw CompileStub.INSTANCE;
  }

  public static int glGetError() {
    throw CompileStub.INSTANCE;
  }

  public static void glGetInteger(int pname, IntBuffer params) {
    throw CompileStub.INSTANCE;
  }

  public static void enableBlendProfile(Profile profile) {
    throw CompileStub.INSTANCE;
  }

  public static void disableBlendProfile(Profile profile) {
    throw CompileStub.INSTANCE;
  }

  public static int getActiveTextureUnit() {
    throw CompileStub.INSTANCE;
  }

  public static void bindCurrentTexture() {
    throw CompileStub.INSTANCE;
  }

  public static int getBoundTexture() {
    throw CompileStub.INSTANCE;
  }

  public static void deleteTextures(IntBuffer textures) {
    throw CompileStub.INSTANCE;
  }

  public static boolean isFogEnabled() {
    throw CompileStub.INSTANCE;
  }

  public static void setFogEnabled(boolean enabled) {
    throw CompileStub.INSTANCE;
  }

  public static void glMultiDrawArrays(int mode, IntBuffer piFirst, IntBuffer piCount) {
    throw CompileStub.INSTANCE;
  }

  @SidedApi(Side.SERVER)
  public interface Profile {

    Profile DEFAULT = objectValue(),
        PLAYER_SKIN = objectValue(),
        TRANSPARENT_MODEL = objectValue();
  }
}
