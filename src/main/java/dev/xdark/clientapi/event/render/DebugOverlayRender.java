package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

import java.util.List;

@SidedApi(Side.SERVER)
public interface DebugOverlayRender extends Event {

  EventBus<DebugOverlayRender> BUS = SideEffects.objectValue();

  List<String> getLeft();

  List<String> getRight();
}
