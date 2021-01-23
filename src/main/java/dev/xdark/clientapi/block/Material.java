package dev.xdark.clientapi.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Material {

  boolean isLiquid();

  boolean isSolid();

  boolean blocksLight();

  boolean blocksMovement();

  boolean canBurn();

  boolean isReplaceable();

  boolean isOpaque();

  boolean isToolRequired();

  MapColor getMapColor();
}
