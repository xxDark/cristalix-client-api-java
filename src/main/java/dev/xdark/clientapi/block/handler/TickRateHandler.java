package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface TickRateHandler {

  int tickRate(Block block, World world);
}
