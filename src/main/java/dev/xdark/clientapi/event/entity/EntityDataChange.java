package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.DataParameter;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface EntityDataChange extends Event {

  EventBus<EntityDataChange> BUS = SideEffects.objectValue();

  Entity getEntity();

  DataParameter<?> getParameter();
}
