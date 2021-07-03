package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.world.World;

public interface EntityFallenHandler {

  void onFallenUpon(
      Block block, World world, int x, int y, int z, Entity entity, float fallDistance);
}
