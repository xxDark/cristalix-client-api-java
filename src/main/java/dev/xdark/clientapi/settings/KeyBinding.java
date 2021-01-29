package dev.xdark.clientapi.settings;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface KeyBinding extends Comparable<KeyBinding> {

  boolean isKeyDown();

  String getCategory();

  boolean isPressed();

  String getDescription();

  int getKeyCodeDefault();

  int getKeyCode();
}
