package dev.xdark.clientapi.input;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface Mouse {

  boolean isButtonDown(int button);

  String getButtonName(int button);

  int getButtonIndex(String buttonName);

  int getEventButton();

  boolean getEventButtonState();

  int getEventDX();

  int getEventDY();

  int getEventX();

  int getEventY();

  int getEventDWheel();

  int getX();

  int getY();

  int getDX();

  int getDY();

  int getDWheel();

  int getButtonCount();

  boolean hasWheel();
}
