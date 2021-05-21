package dev.xdark.clientapi.event.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.gui.Screen;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface ScreenDisplay extends Event, Cancellable {

  EventBus<ScreenDisplay> BUS = SideEffects.objectValue();

  Screen getScreen();

  void setScreen(Screen screen);
}
