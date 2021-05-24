package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface BlockDestroyHandler {

  boolean onBlockDestroyed(
      ItemStack stack, World world, BlockState state, BlockPos pos, EntityLivingBase entity);
}
