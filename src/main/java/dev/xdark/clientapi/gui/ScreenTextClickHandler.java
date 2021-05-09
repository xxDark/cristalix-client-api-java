package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ScreenTextClickHandler extends UIHandler {
  boolean textClicked(Screen screen, Text text);
}
