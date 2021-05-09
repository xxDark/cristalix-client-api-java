package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ScreenMouseReleasedHandler extends UIHandler {
  void mouseReleased(Screen screen, int x, int y, int button);
}
