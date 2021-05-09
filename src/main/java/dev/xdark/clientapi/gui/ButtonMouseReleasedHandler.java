package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.game.Minecraft;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ButtonMouseReleasedHandler extends UIHandler {
  void mouseReleased(Button button, int x, int y);
}
