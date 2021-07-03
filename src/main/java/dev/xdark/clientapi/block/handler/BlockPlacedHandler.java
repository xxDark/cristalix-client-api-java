package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface BlockPlacedHandler {

  void onBlockPlacedBy(
      World world,
      BlockPos pos,
      BlockState state,
      EntityLivingBase entity,
      ItemStack stack);
}
