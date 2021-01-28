package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayerSP;
import dev.xdark.clientapi.event.Cancellable;

@SidedApi(Side.BOTH)
public interface PlayerJump extends Cancellable {

  String KEY = "player_jump";

  @SidedApi(Side.SERVER)
  EntityPlayerSP getPlayer();
}
