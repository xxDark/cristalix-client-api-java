package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface PlayerDestroyHandler {

  void onPlayerDestroy(World world, BlockPos pos, BlockState state);
}
