package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;

@SidedApi(Side.SERVER)
public interface ButtonAdapter {
  int getHoverState(boolean state);

  void drawButton(Minecraft mc, int x, int y, float tickLength);

  void mouseDragged(Minecraft mc, int x, int y);

  void mouseReleased(int x, int y);

  boolean mousePressed(Minecraft mc, int x, int y);

  void drawButtonForegroundLayer(int mouseX, int mouseY);
}