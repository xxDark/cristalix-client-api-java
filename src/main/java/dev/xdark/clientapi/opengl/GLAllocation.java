package dev.xdark.clientapi.opengl;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import sun.nio.ch.DirectBuffer;

@SidedApi(Side.SERVER)
public interface GLAllocation {

  ByteOrder ORDER = ByteOrder.nativeOrder();

  int generateDisplayLists(int range);

  void deleteDisplayLists(int list, int range);

  void deleteDisplayLists(int list);

  static ByteBuffer createDirectByteBuffer(int cap) {
    return ByteBuffer.allocateDirect(cap).order(ORDER);
  }

  static IntBuffer createDirectIntBuffer(int cap) {
    return createDirectByteBuffer(cap << 2).asIntBuffer();
  }

  static FloatBuffer createDirectFloatBuffer(int cap) {
    return createDirectByteBuffer(cap << 2).asFloatBuffer();
  }

  static void freeBuffer(Buffer buffer) {
    if (buffer instanceof DirectBuffer) {
      ((DirectBuffer) buffer).cleaner().clean();
    }
  }
}
