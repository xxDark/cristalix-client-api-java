package dev.xdark.clientapi.event.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.inventory.ClickType;

@SidedApi(Side.SERVER)
public interface WindowClick extends Cancellable {

  int getWindowId();

  int getSlot();

  int getMouseButton();

  ClickType getClickType();
}
