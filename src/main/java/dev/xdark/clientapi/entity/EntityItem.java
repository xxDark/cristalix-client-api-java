package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface EntityItem extends Entity {

  DataParameter<ItemStack> ITEM = SideEffects.objectValue();

  ItemStack getStack();

  void setStack(ItemStack stack);

  int getAge();

  void setDefaultPickupDelay();

  void setNoPickupDelay();

  void setInfinitePickupDelay();

  void setPickupDelay(int pickupDelay);

  boolean cannotPickup();

  void setNoDespawn();

  void markAsFake();
}
