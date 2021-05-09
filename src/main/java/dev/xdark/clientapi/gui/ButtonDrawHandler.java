package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ButtonDrawHandler extends UIHandler {
  void draw(Button button, Minecraft mc, int x, int y, float tickLength);
}
