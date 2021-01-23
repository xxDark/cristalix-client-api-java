package dev.xdark.clientapi.block;

import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface BlockProperties {

  boolean isFullBlock();

  int getLightOpacity();

  int getLightValue();

  boolean isTranslucent();

  boolean useNeighborBrightness();

  boolean isFullCube();

  float getAmbientOcclusionLightValue();

  boolean isBlockNormalCube();

  boolean isNormalCube();

  boolean isTopSolid();
}
