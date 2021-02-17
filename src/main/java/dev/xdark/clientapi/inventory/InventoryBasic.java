package dev.xdark.clientapi.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

@SidedApi(Side.SERVER)
public interface InventoryBasic extends Inventory {

  ItemStack addItem(ItemStack stack);

  void setCustomName(String name);
}
