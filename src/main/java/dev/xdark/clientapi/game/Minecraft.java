package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityPlayerSP;
import dev.xdark.clientapi.particle.ParticleManager;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.BOTH)
public interface Minecraft {

  @SidedApi(Side.SERVER)
  Timer getTimer();

  @SidedApi(Side.SERVER)
  EntityPlayerSP getPlayer();

  @SidedApi(Side.BOTH)
  World getWorld();

  @SidedApi(Side.SERVER)
  void setIngameFocus();

  @SidedApi(Side.SERVER)
  void setIngameNotInFocus();

  @SidedApi(Side.SERVER)
  void toggleFullscreen();

  boolean isFullScreen();

  boolean isGamePaused();

  @SidedApi(Side.SERVER)
  Entity getRenderViewEntity();

  Session getSession();

  @SidedApi(Side.SERVER)
  PlayerController getPlayerController();

  @SidedApi(Side.SERVER)
  ParticleManager particleManager();
}
