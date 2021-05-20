package dev.xdark.clientapi.event.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface MousePress extends Event, Cancellable {

  EventBus<MousePress> BUS = SideEffects.objectValue();

  int getButton();
}
