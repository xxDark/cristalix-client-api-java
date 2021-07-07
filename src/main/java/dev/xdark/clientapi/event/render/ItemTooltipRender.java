package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface ItemTooltipRender extends TooltipRender {

  EventBus<ItemTooltipRender> BUS = SideEffects.objectValue();

  ItemStack getStack();
}
