package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface BlockFaceUV {

  static BlockFaceUV of(float[] uvs, int rotation) {
    throw CompileStub.create();
  }

  float getVertexU(int u);

  float getVertexV(int v);

  int getVertexRotatedRev(int i);

  void setUvs(float[] uvs);
}
