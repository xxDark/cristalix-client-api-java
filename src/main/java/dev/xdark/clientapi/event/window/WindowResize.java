package dev.xdark.clientapi.event.window;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface WindowResize extends Event {

  EventBus<WindowResize> BUS = SideEffects.objectValue();

  ScaledResolution getResolution();
}
