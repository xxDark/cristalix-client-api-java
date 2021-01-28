package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface MathProvider {

  AxisAlignedBB newAABB(double minX, double minY, double minZ, double maxX, double maxY,
      double maxZ);

  BlockPos newBlockPos(int x, int y, int z);

  BlockPos newBlockPos(double x, double y, double z);

  Vec3i newVec3i(int x, int y, int z);

  Vec3d newVec3d(double x, double y, double z);
}
