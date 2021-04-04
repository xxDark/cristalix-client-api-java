package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface Tessellator {

  void draw();

  BufferBuilder getBufferBuilder();
}
