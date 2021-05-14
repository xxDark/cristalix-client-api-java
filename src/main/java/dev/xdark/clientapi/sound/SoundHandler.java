package dev.xdark.clientapi.sound;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;

@SidedApi(Side.SERVER)
public interface SoundHandler {

  String playSound(SoundRequest request);

  void playDelayedSound(SoundRequest request, int delay);

  void pauseSounds();

  void stopSounds();

  void resumeSounds();

  void setSoundLevel(SoundCategory category, float volume);

  void stopSound(String source);

  boolean isSoundPlaying(String source);

  void stop(ResourceLocation location, SoundCategory category);

  void addListener(SoundListener listener);

  void removeListener(SoundListener listener);

  void setVolume(String source, float volume);

  void setPitch(String source, float pitch);

  void setPosition(String source, float x, float y, float z);

  void setAttenuation(String source, SoundRequest.AttenuationType type);

  void setDistOrRoll(String source, float distOrRoll);

  void pause(String source);

  void play(String source);

  boolean playing(String source);
}
