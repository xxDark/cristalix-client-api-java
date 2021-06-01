package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.world.World;

@SidedApi(Side.SERVER)
public interface Chunk {

  int getX();

  int getZ();

  long getKey();

  int getTopFilledSegment();

  ExtendedBlockStorage[] getBlockStorageArray();

  BlockState getBlockState(int x, int y, int z);

  BlockState setBlockState(BlockPos pos, BlockState state);

  boolean isEmpty();

  World getWorld();
}
