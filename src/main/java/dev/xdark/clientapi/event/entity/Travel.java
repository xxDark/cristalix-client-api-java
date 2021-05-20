package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface Travel extends Event, Cancellable {

  EventBus<Travel> BUS = SideEffects.objectValue();

  Entity getEntity();

  float getX();

  float getY();

  float getZ();

  void setX(float x);

  void setY(float y);

  void setZ(float z);
}
