package dev.xdark.clientapi.network;

import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.text.Text;

@SidedApi(Side.SERVER)
public interface NetworkPlayerInfo {

  GameProfile getGameProfile();

  int getResponseTime();

  boolean hasLocationSkin();

  String getSkinType();

  ResourceLocation getLocationSkin();

  ResourceLocation getLocationCape();

  ResourceLocation getLocationElytra();

  Text getDisplayName();

  void setResponseTime(int responseTime);

  void setDisplayName(Text displayName);

  int getLastHealth();

  void setLastHealth(int lastHealth);

  int getDisplayHealth();

  void setDisplayHealth(int displayHealth);

  long getLastHealthTime();

  void setLastHealthTime(long lastHealthTime);

  long getHealthBlinkTime();

  void setHealthBlinkTime(long healthBlinkTime);

  long getRenderVisibilityId();

  void setRenderVisibilityId(long renderVisibilityId);

  void setSkinType(String skinType);

  void reloadTextures();
}
