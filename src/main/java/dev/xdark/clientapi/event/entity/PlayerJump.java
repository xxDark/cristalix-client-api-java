package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayerSP;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface PlayerJump extends Cancellable {

  EventBus<PlayerJump> BUS = SideEffects.objectValue();

  @SidedApi(Side.SERVER)
  EntityPlayerSP getPlayer();
}
