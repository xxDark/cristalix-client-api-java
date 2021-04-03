package dev.xdark.clientapi.sound;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface SoundCategory {

  SoundCategory MASTER = objectValue(),
      MUSIC = objectValue(),
      RECORDS = objectValue(),
      WEATHER = objectValue(),
      BLOCKS = objectValue(),
      HOSTIL = objectValue(),
      NEUTRAL = objectValue(),
      PLAYERS = objectValue(),
      AMBIENT = objectValue(),
      VOICE = objectValue();

  String getName();
}
