package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface EventReceiveHandler {

  boolean eventReceived(BlockState state, World world, int x, int y, int z, int id, int param);
}
