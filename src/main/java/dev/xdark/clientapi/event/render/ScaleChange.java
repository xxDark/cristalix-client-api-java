package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface ScaleChange {

  EventBus<ScaleChange> BUS = SideEffects.objectValue();

  int getOld();

  int getNew();
}
