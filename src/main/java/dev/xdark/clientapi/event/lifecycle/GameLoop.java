package dev.xdark.clientapi.event.lifecycle;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface GameLoop extends Event {

  EventBus<GameLoop> BUS = SideEffects.objectValue();
}
