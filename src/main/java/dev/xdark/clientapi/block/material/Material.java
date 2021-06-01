package dev.xdark.clientapi.block.material;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.MapColor;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Material {

  Material AIR = objectValue(),
      GRASS = objectValue(),
      GROUND = objectValue(),
      WOOD = objectValue(),
      ROCK = objectValue(),
      IRON = objectValue(),
      ANVIL = objectValue(),
      WATER = objectValue(),
      LAVA = objectValue(),
      LEAVES = objectValue(),
      PLANTS = objectValue(),
      VINE = objectValue(),
      SPONGE = objectValue(),
      CLOTH = objectValue(),
      FIRE = objectValue(),
      SAND = objectValue(),
      CIRCUITS = objectValue(),
      CARPET = objectValue(),
      GLASS = objectValue(),
      REDSTONE_LIGHT = objectValue(),
      TNT = objectValue(),
      CORAL = objectValue(),
      ICE = objectValue(),
      PACKED_ICE = objectValue(),
      SNOW = objectValue(),
      CRAFTED_SNOW = objectValue(),
      CACTUS = objectValue(),
      CLAY = objectValue(),
      GOURD = objectValue(),
      DRAGON_EGG = objectValue(),
      PORTAL = objectValue(),
      CAKE = objectValue(),
      WEB = objectValue();

  boolean isLiquid();

  boolean isSolid();

  boolean blocksLight();

  boolean blocksMovement();

  boolean canBurn();

  boolean isReplaceable();

  boolean isOpaque();

  boolean isToolRequired();

  MapColor getMapColor();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder liquid(boolean liquid);

    Builder solid(boolean solid);

    Builder blocksLight(boolean blocksLight);

    Builder blocksMovement(boolean blocksMovement);

    Builder translucent(boolean translucent);

    Builder burning(boolean burning);

    Builder requiresTool(boolean requiresTool);

    Builder replaceable(boolean replaceable);

    Builder pushReaction(PushReaction reaction);

    Builder color(MapColor color);

    Builder color(int color);

    Material build();
  }
}
