package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ItemRepairHandler {

  boolean isRepairableWith(ItemStack toRepair, ItemStack stack);
}
