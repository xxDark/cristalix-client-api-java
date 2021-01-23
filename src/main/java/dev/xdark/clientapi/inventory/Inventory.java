package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.world.WorldNameable;

@SidedApi(Side.SERVER)
public interface Inventory extends WorldNameable {

  int getSizeInventory();

  boolean isEmpty();

  ItemStack getStackInSlot(int slot);

  ItemStack decrStackSize(int slot, int count);

  ItemStack removeStackFromSlot(int slot);

  void setInventorySlotContents(int slot, ItemStack item);

  int getInventoryStackLimit();

  boolean isItemValidForSlot(int slot, ItemStack item);

  int getField(int field);

  void setField(int field, int value);

  int getFieldCount();

  void clear();
}
