package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.util.EnumHand;

@SidedApi(Side.SERVER)
public interface EntityInteractHandler {

  boolean interactWidthEntity(
      ItemStack stack, EntityPlayer player, EntityLivingBase entity, EnumHand hand);
}
