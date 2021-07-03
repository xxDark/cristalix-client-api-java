package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.MapColor;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.BlockAccess;

@SidedApi(Side.SERVER)
public interface MapColorHandler {

  MapColor getMapColor(BlockState state, BlockAccess blockAccess, BlockPos pos);
}
