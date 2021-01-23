package dev.xdark.clientapi.block;

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
