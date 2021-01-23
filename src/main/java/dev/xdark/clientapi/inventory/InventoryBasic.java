package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.item.ItemStack;

public interface InventoryBasic extends Inventory {

  ItemStack addItem(ItemStack stack);

  void setCustomName(String name);
}
