package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.world.BlockAccess;

@SidedApi(Side.SERVER)
public interface BoundingBoxHandler {

  AxisAlignedBB getBoundingBox(BlockState state, BlockAccess blockAccess, int x, int y, int z);
}
