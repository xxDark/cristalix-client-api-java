package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface Vec3i extends Comparable<Vec3i> {

  static Vec3i of(int x, int y, int z) {
    throw CompileStub.create();
  }

  int getX();

  int getY();

  int getZ();

  Vec3i crossProduct(Vec3i other);

  double getDistance(int x, int y, int z);

  double distanceSq(double x, double y, double z);

  double distanceSqToCenter(double x, double y, double z);
}
