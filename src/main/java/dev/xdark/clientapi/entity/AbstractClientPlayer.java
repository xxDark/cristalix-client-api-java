package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.network.NetworkPlayerInfo;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.BOTH)
public interface AbstractClientPlayer extends EntityPlayer {

  boolean hasPlayerInfo();

  NetworkPlayerInfo getPlayerInfo();

  @SidedApi(Side.SERVER)
  void setPlayerInfo(NetworkPlayerInfo playerInfo);

  boolean hasSkin();

  ResourceLocation getLocationSkin();

  ResourceLocation getLocationCape();

  ResourceLocation getLocationElytra();

  String getSkinType();

  @SidedApi(Side.SERVER)
  float getFovModifier();

  boolean hasElytraCape();
}
