package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface PotionsRender extends Event, Cancellable {

  EventBus<PotionsRender> BUS = SideEffects.objectValue();
}
