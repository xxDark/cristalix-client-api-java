package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.render.Framebuffer;
import dev.xdark.clientapi.render.OverlayRenderer;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.clientapi.render.Tessellator;
import dev.xdark.clientapi.resource.ResourceManager;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.BOTH)
public interface GameInstance {

  @SidedApi(Side.BOTH)
  ScaledResolution getResolution();

  @SidedApi(Side.BOTH)
  FontRenderer getFontRenderer();

  @SidedApi(Side.BOTH)
  FontRenderer getGalacticFontRenderer();

  @SidedApi(Side.BOTH)
  OverlayRenderer getOverlayRenderer();

  @SidedApi(Side.BOTH)
  ResourceManager getResourceManager();

  @SidedApi(Side.SERVER)
  Tessellator getTessellator();

  @SidedApi(Side.SERVER)
  Framebuffer getFramebuffer();

  @SidedApi(Side.SERVER)
  Timer getTimer();

  @SidedApi(Side.BOTH)
  World getWorld();
}
