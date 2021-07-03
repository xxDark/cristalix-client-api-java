package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.world.World;

import java.util.List;

@SidedApi(Side.SERVER)
public interface CollisionBoxListHandler {

  void addCollisionBoxToList(
      BlockState state,
      World world,
      int x,
      int y,
      int z,
      AxisAlignedBB entityBox,
      List<AxisAlignedBB> collidingBoxes,
      Entity entity,
      boolean isActualState);
}
