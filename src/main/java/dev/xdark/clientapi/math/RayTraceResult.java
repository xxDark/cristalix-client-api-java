package dev.xdark.clientapi.math;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface RayTraceResult {

  BlockPos getPos();

  Entity getEntity();

  Type getType();

  EnumFacing getHitSide();

  @SidedApi(Side.SERVER)
  interface Type {

    Type MISS = objectValue(),
        BLOCK = objectValue(),
        ENTITY = objectValue();
  }
}
