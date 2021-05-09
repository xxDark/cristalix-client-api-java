package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

import java.io.IOException;

@SidedApi(Side.SERVER)
public interface ScreenKeyTypedHandler extends UIHandler {
  void keyTyped(Screen screen, char c, int code) throws IOException;
}
