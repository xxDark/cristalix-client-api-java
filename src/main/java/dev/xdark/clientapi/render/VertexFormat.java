package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface VertexFormat {

  @SidedApi(Side.SERVER)
  void clear();

  boolean hasNormal();

  int getNormalOffset();

  boolean hasColor();

  int getColorOffset();

  boolean hasUvOffset(int id);

  int getUvOffsetById(int id);

  int getIntegerSize();

  int getSize();

  int getOffset(int index);
}
