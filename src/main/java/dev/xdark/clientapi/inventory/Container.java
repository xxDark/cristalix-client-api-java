package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.item.ItemStack;

import java.util.List;

@SidedApi(Side.SERVER)
public interface Container {

  List<Slot> getSlots();

  Slot getSlot(int slot);

  List<ItemStack> getInventory();

  boolean canMergeSlot(ItemStack stack, Slot slot);

  void putStackInSlot(int slot, ItemStack stack);

  void setAll(List<ItemStack> list);

  int getWindowId();

  ItemStack transferStackInSlot(EntityPlayer player, int index);

  ItemStack slotClick(int id, int dragType, ClickType clickType, EntityPlayer player);

  void updateProgressBar(int id, int data);

  boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection);

  void resetDrag();

  boolean canDragIntoSlot(Slot slot);
}
