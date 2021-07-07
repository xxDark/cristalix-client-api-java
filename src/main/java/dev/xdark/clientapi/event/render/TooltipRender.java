package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

import java.util.List;

@SidedApi(Side.SERVER)
public interface TooltipRender extends Event, Cancellable {

  EventBus<TooltipRender> BUS = SideEffects.objectValue();

  List<String> getContent();

  int getX();

  int getY();

  void setX(int x);

  void setY(int y);

  void setPos(int x, int y);
}
