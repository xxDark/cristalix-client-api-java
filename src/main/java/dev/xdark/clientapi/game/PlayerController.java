package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.world.GameMode;

@SidedApi(Side.SERVER)
public interface PlayerController {

  void resetBlockRemoving();

  GameMode getGameMode();

  boolean extendedReach();
}
