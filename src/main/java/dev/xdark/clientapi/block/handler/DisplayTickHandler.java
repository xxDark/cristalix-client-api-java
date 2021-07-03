package dev.xdark.clientapi.block.handler;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.world.World;

import java.util.Random;

@SidedApi(Side.SERVER)
public interface DisplayTickHandler {

  void randomDisplayTick(BlockState blockState, World world, int x, int y, int z, Random random);
}
