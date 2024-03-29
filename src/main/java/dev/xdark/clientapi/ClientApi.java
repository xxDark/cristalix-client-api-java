package dev.xdark.clientapi;

import dev.xdark.clientapi.biome.BiomeRegistry;
import dev.xdark.clientapi.block.BlockRegistry;
import dev.xdark.clientapi.chat.Chat;
import dev.xdark.clientapi.discord.DiscordRPC;
import dev.xdark.clientapi.entity.DataSerializers;
import dev.xdark.clientapi.entity.EntityProvider;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.input.MouseHelper;
import dev.xdark.clientapi.item.ItemRegistry;
import dev.xdark.clientapi.jvm.ClassDefiner;
import dev.xdark.clientapi.jvm.Natives;
import dev.xdark.clientapi.language.LanguageManager;
import dev.xdark.clientapi.logging.LoggingManagement;
import dev.xdark.clientapi.math.MathProvider;
import dev.xdark.clientapi.nbt.NBTProvider;
import dev.xdark.clientapi.network.ClientConnection;
import dev.xdark.clientapi.p13n.P13nProvider;
import dev.xdark.clientapi.potion.PotionRegistry;
import dev.xdark.clientapi.render.*;
import dev.xdark.clientapi.renderer.block.model.ModelManager;
import dev.xdark.clientapi.renderer.texture.TextureMap;
import dev.xdark.clientapi.resource.ReloadableResourceManager;
import dev.xdark.clientapi.runtime.Platform;
import dev.xdark.clientapi.settings.SettingsManager;
import dev.xdark.clientapi.skin.SkinManager;
import dev.xdark.clientapi.sound.SoundHandler;
import dev.xdark.clientapi.system.Clipboard;
import dev.xdark.clientapi.text.TextProvider;
import dev.xdark.clientapi.texture.RenderEngine;
import dev.xdark.clientapi.thread.ThreadManagement;

import java.util.concurrent.ScheduledExecutorService;

@SidedApi(Side.BOTH)
public interface ClientApi {

  NBTProvider nbtProvider();

  ScaledResolution resolution();

  FontRenderer fontRenderer();

  FontRenderer galacticFontRenderer();

  OverlayRenderer overlayRenderer();

  ReloadableResourceManager resourceManager();

  Tessellator tessellator();

  @SidedApi(Side.SERVER)
  Framebuffer framebuffer();

  @Deprecated
  EventBus eventBus();

  @Deprecated
  EventBus messageBus();

  Platform platform();

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

  @SidedApi(Side.SERVER)
  MouseHelper mouseHelper();

  Minecraft minecraft();

  Clipboard clipboard();

  @SidedApi(Side.SERVER)
  DataSerializers dataSerializers();

  ClientConnection clientConnection();

  ScheduledExecutorService syncExecutorService();

  @SidedApi(Side.SERVER)
  LoggingManagement loggingManagement();

  Natives natives();

  @SidedApi(Side.SERVER)
  SoundHandler soundHandler();

  @SidedApi(Side.SERVER)
  TextureMap textureMap();

  @SidedApi(Side.SERVER)
  ModelManager modelManager();

  SettingsManager settingsManager();

  @SidedApi(Side.SERVER)
  BiomeRegistry biomeRegistry();

  @SidedApi(Side.SERVER)
  LanguageManager languageManager();

  @SidedApi(Side.SERVER)
  ClassDefiner classDefiner();

  @SidedApi(Side.SERVER)
  P13nProvider p13nProvider();
}
