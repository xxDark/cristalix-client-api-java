package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.EnumHand;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface BlockActivationHandler {

  boolean onBlockActivated(
      World world,
      int x,
      int y,
      int z,
      BlockState state,
      EntityPlayer player,
      EnumHand hand,
      EnumFacing side,
      float hitX,
      float hitY,
      float hitZ);
}
