package dev.xdark.clientapi.entity;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.inventory.ContainerLocalMenu;

@SidedApi(Side.BOTH)
public interface EntityPlayerSP extends AbstractClientPlayer {

  @SidedApi(Side.SERVER)
  String getServerBrand();

  @SidedApi(Side.SERVER)
  int getPermissionLevel();

  @SidedApi(Side.SERVER)
  void setXPStats(float currentXP, int maxXP, int level);

  boolean isRidingHorse();

  boolean isCurrentViewEntity();

  boolean isRowingBoat();

  boolean isAutoJumpEnabled();

  @SidedApi(Side.SERVER)
  int displayContainerMenu(ContainerLocalMenu menu);

  @SidedApi(Side.SERVER)
  void closeScreen();

  @Override
  float getHealth();

  @Override
  float getMaxHealth();
}
