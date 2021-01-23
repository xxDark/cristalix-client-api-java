package dev.xdark.clientapi.world;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

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

  long getTotalWorldTime();

  long getWorldTime();

  boolean isThundering();

  boolean isRaining();

  boolean isRainingAt(int x, int y, int z);

  double getHorizon();

  int getDimension();
}
