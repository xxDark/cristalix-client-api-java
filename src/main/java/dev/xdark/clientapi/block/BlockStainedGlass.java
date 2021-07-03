package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface BlockStainedGlass extends Block {

  @SidedApi(Side.SERVER)
  interface Builder extends Block.Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    @Override
    BlockStainedGlass build();
  }
}
