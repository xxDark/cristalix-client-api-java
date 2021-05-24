package dev.xdark.clientapi.game;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.inventory.ClickType;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.world.GameMode;

@SidedApi(Side.BOTH)
public interface PlayerController {

  @SidedApi(Side.SERVER)
  void resetBlockRemoving();

  GameMode getGameMode();

  boolean extendedReach();

  boolean shouldDrawHUD();

  float getBlockReachDistance();

  ItemStack windowClick(int windowId, int slotId, int mouseButton, ClickType type);
}
