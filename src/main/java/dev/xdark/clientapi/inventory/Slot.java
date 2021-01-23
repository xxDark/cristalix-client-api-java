package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

@SidedApi(Side.SERVER)
public interface Slot {

  int getSlotNumber();

  ItemStack getStack();

  boolean getHasStack();

  void putStack(ItemStack stack);

  int getSlotStackLimit();

  int getItemStackLimit(ItemStack stack);

  String getSlotTexture();

  ItemStack decrStackSize(int count);

  boolean isEnabled();
}
