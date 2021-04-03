package dev.xdark.clientapi.network;

import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.text.Text;

import java.util.concurrent.CompletableFuture;

@SidedApi(Side.BOTH)
public interface NetworkPlayerInfo {

  GameProfile getGameProfile();

  int getResponseTime();

  boolean hasLocationSkin();

  String getSkinType();

  ResourceLocation getLocationSkin();

  ResourceLocation getLocationCape();

  ResourceLocation getLocationElytra();

  Text getDisplayName();

  @SidedApi(Side.SERVER)
  void setResponseTime(int responseTime);

  @SidedApi(Side.SERVER)
  void setDisplayName(Text displayName);

  @SidedApi(Side.SERVER)
  int getLastHealth();

  @SidedApi(Side.SERVER)
  void setLastHealth(int lastHealth);

  @SidedApi(Side.SERVER)
  int getDisplayHealth();

  @SidedApi(Side.SERVER)
  void setDisplayHealth(int displayHealth);

  @SidedApi(Side.SERVER)
  long getLastHealthTime();

  @SidedApi(Side.SERVER)
  void setLastHealthTime(long lastHealthTime);

  @SidedApi(Side.SERVER)
  long getHealthBlinkTime();

  @SidedApi(Side.SERVER)
  void setHealthBlinkTime(long healthBlinkTime);

  @SidedApi(Side.SERVER)
  long getRenderVisibilityId();

  @SidedApi(Side.SERVER)
  void setRenderVisibilityId(long renderVisibilityId);

  @SidedApi(Side.SERVER)
  void setSkinType(String skinType);

  @SidedApi(Side.SERVER)
  CompletableFuture<Void> loadTextures();

  @SidedApi(Side.SERVER)
  void reloadTextures();
}
