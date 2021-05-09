package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ScreenMouseClickMoveHandler extends UIHandler {
  void mouseClickMove(Screen screen, int x, int y, int button, long diff);
}
