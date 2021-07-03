package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface PlayerRelativeHardnessHandler {

  float getPlayerRelativeBlockHardness(
      BlockState state, EntityPlayer player, World world, int x, int y, int z);
}
