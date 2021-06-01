package dev.xdark.clientapi.world.chunk;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.state.BlockState;

@SidedApi(Side.SERVER)
public interface ExtendedBlockStorage {

  BlockState get(int x, int y, int z);

  void set(int x, int y, int z, BlockState state);

  boolean isEmpty();

  int getYLocation();

  void setSkyLight(int x, int y, int z, int value);

  int getSkyLight(int x, int y, int z);

  void setBlockLight(int x, int y, int z, int value);

  int getBlockLight(int x, int y, int z);

  int getBlockRefCount();
}
