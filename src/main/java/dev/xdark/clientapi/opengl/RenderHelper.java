package dev.xdark.clientapi.opengl;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.nio.FloatBuffer;

@SidedApi(Side.SERVER)
public final class RenderHelper {

  private RenderHelper() {
  }

  public static void disableStandardItemLighting() {
    throw CompileStub.INSTANCE;
  }

  public static void enableStandardItemLighting() {
    throw CompileStub.INSTANCE;
  }

  public static FloatBuffer setColorBuffer(float r, float g, float b, float a) {
    throw CompileStub.INSTANCE;
  }

  public static void enableGUIStandardItemLighting() {
    throw CompileStub.INSTANCE;
  }
}
