package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;

@SidedApi(Side.SERVER)
public interface BlockHarvestHandler {

  boolean canHarvestBlock(Item item, BlockState state);
}
