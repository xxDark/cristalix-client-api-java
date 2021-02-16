package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface AxisAlignedBB {

  static AxisAlignedBB of(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
    throw CompileStub.create();
  }

  double getMinX();

  double getMinY();

  double getMinZ();

  double getMaxX();

  double getMaxY();

  double getMaxZ();

  AxisAlignedBB contract(double x, double y, double z);

  AxisAlignedBB expand(double x, double y, double z);

  AxisAlignedBB grow(double x, double y, double z);

  AxisAlignedBB intersect(AxisAlignedBB o);

  AxisAlignedBB union(AxisAlignedBB o);

  AxisAlignedBB offset(double x, double y, double z);

  double calculateXOffset(AxisAlignedBB o, double offset);

  double calculateYOffset(AxisAlignedBB o, double offset);

  double calculateZOffset(AxisAlignedBB o, double offset);

  boolean intersects(AxisAlignedBB o);

  boolean intersects(double x1, double y1, double z1, double x2, double y2, double z2);

  boolean contains(double x, double y, double z);

  double getAverageEdgeLength();

  AxisAlignedBB shrink(double value);

  boolean hasNaN();

  AxisAlignedBB copy();
}
