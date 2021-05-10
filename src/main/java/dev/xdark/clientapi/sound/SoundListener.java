package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface SoundListener {

  void soundPlay(ResourceLocation sound);

  void soundStop(ResourceLocation sound);
}
