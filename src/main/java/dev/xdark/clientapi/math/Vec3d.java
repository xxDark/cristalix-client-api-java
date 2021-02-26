package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface Vec3d {

  static Vec3d of(double x, double y, double z) {
    throw CompileStub.create();
  }

  double getX();

  double getY();

  double getZ();

  Vec3d subtractReverse(double x, double y, double z);

  Vec3d normalize();

  double dotProduct(double x, double y, double z);

  Vec3d crossProduct(double x, double y, double z);

  Vec3d subtract(double x, double y, double z);

  Vec3d add(double x, double y, double z);

  double distanceTo(double x, double y, double z);

  double squareDistanceTo(double x, double y, double z);

  Vec3d scale(double value);

  double length();

  double lengthSquared();

  Vec3d getIntermediateWithXValue(Vec3d vec, double x);

  Vec3d getIntermediateWithYValue(Vec3d vec, double y);

  Vec3d getIntermediateWithZValue(Vec3d vec, double z);

  Vec3d rotateYaw(float yaw);

  Vec3d rotatePitch(float pitch);

  Vec3d set(double x, double y, double z);

  Vec3d set(Vec3d o);
}
