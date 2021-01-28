package dev.xdark.clientapi;

import dev.xdark.clientapi.block.BlockRegistry;
import dev.xdark.clientapi.chat.Chat;
import dev.xdark.clientapi.discord.DiscordRPC;
import dev.xdark.clientapi.entity.EntityProvider;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.game.Timer;
import dev.xdark.clientapi.input.Keyboard;
import dev.xdark.clientapi.input.Mouse;
import dev.xdark.clientapi.input.MouseHelper;
import dev.xdark.clientapi.item.ItemRegistry;
import dev.xdark.clientapi.js.Compiler;
import dev.xdark.clientapi.math.MathProvider;
import dev.xdark.clientapi.nbt.NBTProvider;
import dev.xdark.clientapi.potion.PotionRegistry;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.render.Framebuffer;
import dev.xdark.clientapi.render.OverlayRenderer;
import dev.xdark.clientapi.render.RenderItem;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.clientapi.render.Tessellator;
import dev.xdark.clientapi.resource.ResourceManager;
import dev.xdark.clientapi.runtime.System;
import dev.xdark.clientapi.skin.SkinManager;
import dev.xdark.clientapi.text.TextProvider;
import dev.xdark.clientapi.texture.RenderEngine;
import dev.xdark.clientapi.thread.ThreadManagement;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.BOTH)
public interface ClientApi {

  NBTProvider nbtProvider();

  @SidedApi(Side.SERVER)
  Compiler jsCompiler();

  ScaledResolution resolution();

  FontRenderer fontRenderer();

  FontRenderer galacticFontRenderer();

  OverlayRenderer overlayRenderer();

  ResourceManager resourceManager();

  @SidedApi(Side.SERVER)
  Tessellator tessellator();

  @SidedApi(Side.SERVER)
  Framebuffer framebuffer();

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

  DiscordRPC discordRpc();

  @SidedApi(Side.SERVER)
  EntityProvider entityProvider();

  ThreadManagement threadManagement();

  MathProvider mathProvider();

  RenderItem renderItem();

  Chat chat();

  TextProvider textProvider();

  Keyboard keyboard();

  Mouse mouse();

  @SidedApi(Side.SERVER)
  MouseHelper mouseHelper();

  Minecraft minecraft();
}
