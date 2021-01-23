package dev.xdark.clientapi;

import dev.xdark.clientapi.block.BlockRegistry;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.game.GameInstance;
import dev.xdark.clientapi.item.ItemRegistry;
import dev.xdark.clientapi.js.Compiler;
import dev.xdark.clientapi.nbt.NBTProvider;
import dev.xdark.clientapi.potion.PotionRegistry;
import dev.xdark.clientapi.runtime.System;
import dev.xdark.clientapi.texture.RenderEngine;

@SidedApi(Side.BOTH)
public interface ClientApi {

  NBTProvider nbtProvider();

  @SidedApi(Side.SERVER)
  Compiler jsCompiler();

  GameInstance game();

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
}
