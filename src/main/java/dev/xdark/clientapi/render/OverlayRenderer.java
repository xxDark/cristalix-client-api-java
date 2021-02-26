package dev.xdark.clientapi.render;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.item.ItemStack;

@SidedApi(Side.BOTH)
public interface OverlayRenderer {

  void drawHorizontalLine(int startX, int endX, int y, int color);

  void drawVerticalLine(int x, int startY, int endY, int color);

  void drawRect(int left, int top, int right, int bottom, int color);

  void drawTexturedModalRect(int x, int y, int textureX, int textureY, int width, int height);

  void drawTexturedModalRect(float xCoord, float yCoord, int minU, int minV, int maxU, int maxV);

  void drawModalRectWithCustomSizedTexture(int x, int y, float u, float v, int width, int height,
      float textureWidth, float textureHeight);

  void drawScaledCustomSizeModalRect(int x, int y, float u, float v, int uWidth, int vHeight,
      int width, int height, float tileWidth, float tileHeight);

  void displayItemActivation(ItemStack stack);
}
