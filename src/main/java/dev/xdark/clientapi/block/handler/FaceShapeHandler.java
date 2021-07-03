package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockFaceShape;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.world.BlockAccess;

@SidedApi(Side.SERVER)
public interface FaceShapeHandler {

  BlockFaceShape getBlockFaceShape(
      BlockAccess blockAccess, BlockState state, int x, int y, int z, EnumFacing facing);
}
