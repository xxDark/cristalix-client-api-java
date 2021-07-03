package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface StatePlacementHandler {

  BlockState getStateForPlacement(
      Block block,
      World world,
      int x,
      int y,
      int z,
      EnumFacing facing,
      float hitX,
      float hitY,
      float hitZ,
      int meta,
      EntityLivingBase placer);
}
