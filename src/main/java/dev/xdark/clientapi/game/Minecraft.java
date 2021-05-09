package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityPlayerSP;
import dev.xdark.clientapi.gui.Screen;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.particle.ParticleManager;
import dev.xdark.clientapi.render.EntityRenderer;
import dev.xdark.clientapi.render.RenderGlobal;
import dev.xdark.clientapi.render.RenderManager;
import dev.xdark.clientapi.sound.SoundHandler;
import dev.xdark.clientapi.util.ThreadListener;
import dev.xdark.clientapi.world.World;

import java.util.concurrent.Executor;

@SidedApi(Side.BOTH)
public interface Minecraft extends Executor, ThreadListener {

  @SidedApi(Side.SERVER)
  Timer getTimer();

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

  @Deprecated
  boolean isGamePaused();

  @SidedApi(Side.SERVER)
  Entity getRenderViewEntity();

  Session getSession();

  @SidedApi(Side.SERVER)
  PlayerController getPlayerController();

  @SidedApi(Side.SERVER)
  ParticleManager getParticleManager();

  @SidedApi(Side.SERVER)
  RenderGlobal getRenderGlobal();

  @SidedApi(Side.SERVER)
  RenderManager getRenderManager();

  ScreenshotHelper getScreenshotHelper();

  int getDisplayWidth();

  int getDisplayHeight();

  @SidedApi(Side.SERVER)
  EntityRenderer getEntityRenderer();

  @SidedApi(Side.SERVER)
  RayTraceResult getMouseOver();

  boolean inGameHasFocus();

  @SidedApi(Side.SERVER)
  SoundHandler getSoundHandler();

  @SidedApi(Side.SERVER)
  Screen currentScreen();

  @SidedApi(Side.SERVER)
  void displayScreen(Screen screen);
}
