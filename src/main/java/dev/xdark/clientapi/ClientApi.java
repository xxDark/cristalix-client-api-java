package dev.xdark.clientapi;

import dev.xdark.clientapi.block.BlockRegistry;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.game.Timer;
import dev.xdark.clientapi.item.ItemRegistry;
import dev.xdark.clientapi.js.Compiler;
import dev.xdark.clientapi.nbt.NBTProvider;
import dev.xdark.clientapi.potion.PotionRegistry;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.render.Framebuffer;
import dev.xdark.clientapi.render.OverlayRenderer;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.clientapi.render.Tessellator;
import dev.xdark.clientapi.resource.ResourceManager;
import dev.xdark.clientapi.runtime.System;
import dev.xdark.clientapi.skin.SkinManager;
import dev.xdark.clientapi.texture.RenderEngine;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.BOTH)
public interface ClientApi {

  NBTProvider nbtProvider();

  @SidedApi(Side.SERVER)
  Compiler jsCompiler();

  ScaledResolution getResolution();

  FontRenderer getFontRenderer();

  FontRenderer getGalacticFontRenderer();

  OverlayRenderer getOverlayRenderer();

  ResourceManager getResourceManager();

  @SidedApi(Side.SERVER)
  Tessellator getTessellator();

  @SidedApi(Side.SERVER)
  Framebuffer getFramebuffer();

  @SidedApi(Side.SERVER)
  Timer getTimer();

  World getWorld();

  EventBus eventBus();

  EventBus messageBus();

  System system();

  @SidedApi(Side.SERVER)
  PotionRegistry potionRegistry();

  @SidedApi(Side.SERVER)
  ItemRegistry itemRegistry();

  @SidedApi(Side.SERVER)
  BlockRegistry blockRegistry();

  @SidedApi(Side.SERVER)
  RenderEngine renderEngine();

  @SidedApi(Side.SERVER)
  SkinManager skinManager();
}
