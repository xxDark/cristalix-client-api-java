package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

@SidedApi(Side.BOTH)
public interface InventoryPlayer extends Inventory {

  ItemStack getCurrentItem();

  int getFirstEmptyStack();

  int getSlotFor(ItemStack stack);

  int findSlotMatchingUnusedItem(ItemStack stack);

  int getBestHotbarSlot();

  ItemStack armorItemInSlot(int slot);

  int getTimesChanged();

  ItemStack getItemStack();

  int getActiveSlot();
}
