package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface CreativeTab {

  CreativeTab BUILDING_BLOCKS = objectValue(),
      DECORATIONS = objectValue(),
      REDSTONE = objectValue(),
      TRANSPORTATION = objectValue(),
      MISC = objectValue(),
      SEARCH = objectValue(),
      FOOD = objectValue(),
      TOOLS = objectValue(),
      COMBAT = objectValue(),
      BREWING = objectValue();

  int getIndex();

  String getLabel();

  String getTranslationKey();

  ItemStack getIcon();

  String getBackgroundImageName();

  boolean drawInForegroundOfTab();

  boolean hasScrollbar();

  int getColumn();

  boolean isOnTopRow();

  boolean isAlignedRight();
}
