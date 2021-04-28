package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.world.WorldNameable;

@SidedApi(Side.BOTH)
public interface Inventory extends WorldNameable {

  int getSizeInventory();

  boolean isEmpty();

  ItemStack getStackInSlot(int slot);

  @SidedApi(Side.SERVER)
  ItemStack decrStackSize(int slot, int count);

  @SidedApi(Side.SERVER)
  ItemStack removeStackFromSlot(int slot);

  @SidedApi(Side.SERVER)
  void setInventorySlotContents(int slot, ItemStack item);

  int getInventoryStackLimit();

  boolean isItemValidForSlot(int slot, ItemStack item);

  int getField(int field);

  @SidedApi(Side.SERVER)
  void setField(int field, int value);

  int getFieldCount();

  @SidedApi(Side.SERVER)
  void clear();
}
