package dev.xdark.clientapi.gui;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.sound.SoundHandler;
import dev.xdark.clientapi.util.UIHandler;

@SidedApi(Side.SERVER)
public interface ButtonSoundPressHandler extends UIHandler {
  void playPressSound(Button button, SoundHandler soundHandler);
}
