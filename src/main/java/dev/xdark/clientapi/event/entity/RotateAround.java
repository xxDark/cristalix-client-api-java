package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface RotateAround extends Event, Cancellable {

  EventBus<RotateAround> BUS = SideEffects.objectValue();

  Entity getEntity();

  float getOldYaw();

  float getOldPitch();

  float getNewYaw();

  float getNewPitch();

  void setNewYaw(float yaw);

  void setNewPitch(float pitch);
}
