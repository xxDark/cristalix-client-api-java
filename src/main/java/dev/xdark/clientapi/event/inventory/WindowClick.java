package dev.xdark.clientapi.event.inventory;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.inventory.ClickType;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface WindowClick extends Cancellable {

  EventBus<WindowClick> BUS = SideEffects.objectValue();

  int getWindowId();

  int getSlot();

  int getMouseButton();

  ClickType getClickType();
}
