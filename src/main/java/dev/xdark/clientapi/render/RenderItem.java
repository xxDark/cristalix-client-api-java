package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

@SidedApi(Side.BOTH)
public interface RenderItem {

  void renderItemIntoGUI(ItemStack stack, int x, int y);

  void renderItemAndEffectIntoGUI(ItemStack stack, int xPosition, int yPosition);

  void renderItemOverlayIntoGUI(FontRenderer fr, ItemStack stack, int xPosition, int yPosition,
      String text);
}
