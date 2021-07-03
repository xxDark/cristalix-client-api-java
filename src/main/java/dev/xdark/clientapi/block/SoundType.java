package dev.xdark.clientapi.block;

import static dev.xdark.clientapi.util.SideEffects.objectValue;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.sound.SoundEvent;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface SoundType {
  SoundType WOOD = objectValue(),
      GROUND = objectValue(),
      PLANT = objectValue(),
      STONE = objectValue(),
      METAL = objectValue(),
      GLASS = objectValue(),
      CLOTH = objectValue(),
      SAND = objectValue(),
      SNOW = objectValue(),
      LADDER = objectValue(),
      ANVIL = objectValue(),
      SLIME = objectValue();

  float getVolume();

  float getPitch();

  SoundEvent getBreakSound();

  SoundEvent getStepSound();

  SoundEvent getPlaceSound();

  SoundEvent getHitSound();

  SoundEvent getFallSound();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder volume(float volume);

    Builder pitch(float pitch);

    Builder breakSound(SoundEvent event);

    Builder stepSound(SoundEvent event);

    Builder placeSound(SoundEvent event);

    Builder hitSound(SoundEvent event);

    Builder fallSound(SoundEvent event);

    SoundType build();
  }
}
