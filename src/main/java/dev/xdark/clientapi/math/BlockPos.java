package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.Rotation;

@SidedApi(Side.BOTH)
public interface BlockPos extends Vec3i {

  static BlockPos of(int x, int y, int z) {
    throw CompileStub.create();
  }

  BlockPos add(int x, int y, int z);

  BlockPos up(int count);

  BlockPos down(int count);

  BlockPos north(int count);

  BlockPos south(int count);

  BlockPos west(int count);

  BlockPos east(int count);

  BlockPos rotate(Rotation rotation);
}
