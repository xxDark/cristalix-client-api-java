package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface ItemPickaxe extends ItemTool {

  @SidedApi(Side.SERVER)
  interface Builder extends ItemTool.Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    @Override
    ItemPickaxe build();
  }
}
