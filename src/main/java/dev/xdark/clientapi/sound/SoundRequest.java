package dev.xdark.clientapi.sound;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface SoundRequest {

  ResourceLocation getSoundLocation();

  SoundCategory getCategory();

  boolean canRepeat();

  int getRepeatDelay();

  float getVolume();

  float getPitch();

  float getPosX();

  float getPosY();

  float getPosZ();

  AttenuationType getAttenuationType();

  boolean isStreaming();

  @SidedApi(Side.SERVER)
  interface AttenuationType {
    AttenuationType NONE = objectValue(), LINEAR = objectValue();
  }

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder location(ResourceLocation location);

    Builder category(SoundCategory category);

    Builder repeating(boolean repeating);

    Builder repeatDelay(int repeatDelay);

    Builder volume(float volume);

    Builder pitch(float pitch);

    Builder posX(float posX);

    Builder posY(float posY);

    Builder posZ(float posZ);

    Builder attenuationType(AttenuationType type);

    Builder streaming(boolean streaming);

    SoundRequest build();
  }
}
