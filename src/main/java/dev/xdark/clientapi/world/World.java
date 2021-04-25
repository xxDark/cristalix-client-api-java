package dev.xdark.clientapi.world;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityWeatherEffect;
import dev.xdark.clientapi.sound.SoundCategory;
import dev.xdark.clientapi.sound.SoundEvent;
import dev.xdark.clientapi.tile.TileEntity;
import dev.xdark.clientapi.util.ParticleType;
import dev.xdark.clientapi.world.chunk.ChunkProvider;

import java.util.UUID;

@SidedApi(Side.BOTH)
public interface World {

  boolean canSeeSky(int x, int y, int z);

  int getLight(int x, int y, int z);

  int getLight(int x, int y, int z, boolean checkNeighbours);

  int getHeight(int x, int z);

  int getChunksLowestHorizon(int x, int z);

  int getCombinedLight(int x, int y, int z, int value);

  float getLightBrightness(int x, int y, int z);

  float getStarBrightness(float partialTicks);

  long getTotalTime();

  long getTime();

  boolean isThundering();

  boolean isRaining();

  boolean isRainingAt(int x, int y, int z);

  double getHorizon();

  int getDimension();

  @SidedApi(Side.SERVER)
  boolean spawnEntity(Entity entity);

  @SidedApi(Side.SERVER)
  void removeEntity(Entity entity);

  @SidedApi(Side.SERVER)
  TileEntity getTileEntity(int x, int y, int z);

  @SidedApi(Side.SERVER)
  ChunkProvider getChunkProvider();

  @SidedApi(Side.SERVER)
  void spawnParticle(
      ParticleType type,
      boolean isLongDistance,
      double x,
      double y,
      double z,
      double motionX,
      double motionY,
      double motionZ,
      int... data);

  @SidedApi(Side.SERVER)
  void setTime(long time);

  @SidedApi(Side.SERVER)
  void playSound(
      double x,
      double y,
      double z,
      SoundEvent event,
      SoundCategory category,
      float volume,
      float pitch,
      boolean checkDistance);

  @SidedApi(Side.SERVER)
  boolean addWeatherEffect(EntityWeatherEffect weatherEffect);

  @SidedApi(Side.SERVER)
  void removeWeatherEffect(EntityWeatherEffect weatherEffect);

  @SidedApi(Side.SERVER)
  float getThunderStrength(float delta);

  @SidedApi(Side.SERVER)
  void setThunderStrength(float thunderingStrength);

  @SidedApi(Side.SERVER)
  float getRainStrength(float delta);

  @SidedApi(Side.SERVER)
  void setRainStrength(float rainingStrength);

  @SidedApi(Side.SERVER)
  Entity getEntity(int id);

  @SidedApi(Side.SERVER)
  Entity getEntity(UUID id);
}
