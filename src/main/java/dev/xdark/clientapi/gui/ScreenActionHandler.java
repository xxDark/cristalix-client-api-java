package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.UIHandler;

import java.io.IOException;

@SidedApi(Side.SERVER)
public interface ScreenActionHandler extends UIHandler {
  void actionPerformed(Screen screen, Button button) throws IOException;
}
