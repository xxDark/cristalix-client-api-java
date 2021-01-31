package dev.xdark.clientapi.opengl;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

@SidedApi(Side.SERVER)
public final class GLAllocation {

  public static final ByteOrder ORDER = ByteOrder.nativeOrder();

  private GLAllocation() { }

  public static int generateDisplayLists(int range) {
    throw CompileStub.INSTANCE;
  }

  public static void deleteDisplayLists(int list, int range) {
    throw CompileStub.INSTANCE;
  }

  public static void deleteDisplayLists(int list) {
    throw CompileStub.INSTANCE;
  }

  public static ByteBuffer createDirectByteBuffer(int cap) {
    throw CompileStub.INSTANCE;
  }

  public static IntBuffer createDirectIntBuffer(int cap) {
    throw CompileStub.INSTANCE;
  }

  public static FloatBuffer createDirectFloatBuffer(int cap) {
    throw CompileStub.INSTANCE;
  }

  public static void freeBuffer(Buffer buffer) {
    throw CompileStub.INSTANCE;
  }
}
