package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;

@SidedApi(Side.SERVER)
public interface EntityHitHandler {

  boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker);
}
