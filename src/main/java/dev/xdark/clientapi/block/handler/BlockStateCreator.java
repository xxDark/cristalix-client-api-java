package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.block.state.BlockStateContainer;

@SidedApi(Side.SERVER)
public interface BlockStateCreator {

  BlockStateContainer createBlockState(Block block);
}
