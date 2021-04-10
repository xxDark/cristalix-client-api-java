package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface BlockPartFace {

  static BlockPartFace of(EnumFacing cullFace, int tintIndex, String texture, BlockFaceUV faceUV) {
    throw CompileStub.create();
  }

  EnumFacing getCullFace();

  int getTintIndex();

  String getTexture();

  BlockFaceUV getFaceUV();
}
