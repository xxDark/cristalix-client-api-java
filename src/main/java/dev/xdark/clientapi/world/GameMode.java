package dev.xdark.clientapi.world;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface GameMode {

  GameMode SURVIVAL = objectValue(),
      CREATIVE = objectValue(),
      ADVENTURE = objectValue(),
      SPECTATOR = objectValue();

  int getId();

  String getName();

  boolean hasLimitedInteractions();
}
