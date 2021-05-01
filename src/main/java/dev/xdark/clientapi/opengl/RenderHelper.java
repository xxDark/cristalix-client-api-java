package dev.xdark.clientapi.opengl;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.nio.FloatBuffer;

@SidedApi(Side.BOTH)
public final class RenderHelper {

  private RenderHelper() {}

  public static void disableStandardItemLighting() {
    throw CompileStub.create();
  }

  public static void enableStandardItemLighting() {
    throw CompileStub.create();
  }

  public static FloatBuffer setColorBuffer(float r, float g, float b, float a) {
    throw CompileStub.create();
  }

  public static void enableGUIStandardItemLighting() {
    throw CompileStub.create();
  }
}
