package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface BlockPos {

  int getX();

  int getY();

  int getZ();

  BlockPos add(int x, int y, int z);

  BlockPos up(int count);

  BlockPos down(int i);

  BlockPos north(int i);

  BlockPos south(int i);

  BlockPos west(int i);

  BlockPos east(int i);
}
