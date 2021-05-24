package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface EntityStoppedUsingHandler {

  void stoppedUsing(ItemStack stack, World world, EntityLivingBase entity, int timeLeft);
}
