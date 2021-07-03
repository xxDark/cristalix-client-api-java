package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.math.Vec3d;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface CollisionRayTraceHandler {

  RayTraceResult collisionRayTrace(
      BlockState blockState, World world, int x, int y, int z, Vec3d start, Vec3d end);
}
