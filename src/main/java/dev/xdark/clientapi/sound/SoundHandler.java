package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface SoundHandler {

  void playSound(SoundRequest request);

  void playDelayedSound(SoundRequest request, int delay);

  void pauseSounds();

  void stopSounds();

  void resumeSounds();

  void setSoundLevel(SoundCategory category, float volume);

  void stopSound(SoundRequest request);

  void isSoundPlaying(SoundRequest request);

  void stop(ResourceLocation location, SoundCategory category);

  void addListener(SoundListener listener);

  void removeListener(SoundListener listener);
}
