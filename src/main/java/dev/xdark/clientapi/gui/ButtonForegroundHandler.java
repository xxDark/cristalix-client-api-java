package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ButtonForegroundHandler extends UIHandler {
  void drawButtonForegroundLayer(Button button, int mouseX, int mouseY);
}
