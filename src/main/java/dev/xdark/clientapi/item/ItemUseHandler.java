package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.ActionResult;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.EnumHand;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface ItemUseHandler {

  ActionResult onItemUse(
      EntityPlayer player,
      World world,
      BlockPos pos,
      EnumHand hand,
      EnumFacing facing,
      float hitX,
      float hitY,
      float hitZ);
}
