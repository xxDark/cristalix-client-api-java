package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ScreenDrawHandler extends UIHandler {
  void drawScreen(Screen screen, int mouseX, int mouseY, float tickLength);
}
