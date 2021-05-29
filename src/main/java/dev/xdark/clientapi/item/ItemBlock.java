package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface ItemBlock extends Item {

  Block getBlock();

  boolean canPlaceOnSide(
      World world, BlockPos pos, EnumFacing facing, EntityPlayer player, ItemStack stack);
}
