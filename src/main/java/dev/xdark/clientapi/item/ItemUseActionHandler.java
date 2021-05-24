package dev.xdark.clientapi.item;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface ItemUseActionHandler {

    UseAction getUseAction(ItemStack stack);

    int getMaxUseDuration(ItemStack stack);
}
