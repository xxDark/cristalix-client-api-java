package dev.xdark.clientapi.block;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface Material {

  Material AIR = objectValue();
  Material GRASS = objectValue();
  Material GROUND = objectValue();
  Material WOOD = objectValue();
  Material ROCK = objectValue();
  Material IRON = objectValue();
  Material ANVIL = objectValue();
  Material WATER = objectValue();
  Material LAVA = objectValue();
  Material LEAVES = objectValue();
  Material PLANTS = objectValue();
  Material VINE = objectValue();
  Material SPONGE = objectValue();
  Material CLOTH = objectValue();
  Material FIRE = objectValue();
  Material SAND = objectValue();
  Material CIRCUITS = objectValue();
  Material CARPET = objectValue();
  Material GLASS = objectValue();
  Material REDSTONE_LIGHT = objectValue();
  Material TNT = objectValue();
  Material CORAL = objectValue();
  Material ICE = objectValue();
  Material PACKED_ICE = objectValue();
  Material SNOW = objectValue();
  Material CRAFTED_SNOW = objectValue();
  Material CACTUS = objectValue();
  Material CLAY = objectValue();
  Material GOURD = objectValue();
  Material DRAGON_EGG = objectValue();
  Material PORTAL = objectValue();
  Material CAKE = objectValue();
  Material WEB = objectValue();

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
