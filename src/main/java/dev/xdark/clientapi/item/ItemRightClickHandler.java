package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.util.EnumHand;
import dev.xdark.clientapi.util.ProceedActionResult;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface ItemRightClickHandler {

    ProceedActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand);
}
