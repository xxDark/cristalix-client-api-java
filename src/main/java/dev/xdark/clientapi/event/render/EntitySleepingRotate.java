package dev.xdark.clientapi.event.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface EntitySleepingRotate extends Event, Cancellable {

  EventBus<EntitySleepingRotate> BUS = SideEffects.objectValue();

  EntityLivingBase getEntity();

  float getAgeInTicks();

  float getRotationYaw();

  float getPartialTicks();
}
