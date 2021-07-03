package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface EntityLandHandler {

  void onLanded(Block block, World world, Entity entity);
}
