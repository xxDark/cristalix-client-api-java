package dev.xdark.clientapi.event.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.EntityPlayerSP;

@SidedApi(Side.BOTH)
public interface PlayerSprint {

  @SidedApi(Side.SERVER)
  EntityPlayerSP getPlayer();

  boolean isSprinting();

  @SidedApi(Side.SERVER)
  void setSprinting(boolean sprinting);
}
