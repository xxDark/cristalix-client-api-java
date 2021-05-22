package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface BlockPartFace {

  EnumFacing getCullFace();

  int getTintIndex();

  String getTexture();

  BlockFaceUV getFaceUV();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder cullFace(EnumFacing cullFace);

    Builder tintIndex(int tintIndex);

    Builder texture(String texture);

    Builder blockFaceUV(BlockFaceUV blockFaceUV);

    BlockPartFace build();
  }
}
