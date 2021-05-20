package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface GuiOverlayRender extends Event {

  EventBus<GuiOverlayRender> BUS = SideEffects.objectValue();

  float getPartialTicks();

  ScaledResolution getResolution();
}
