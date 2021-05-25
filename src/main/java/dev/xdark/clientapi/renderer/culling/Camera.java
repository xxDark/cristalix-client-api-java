package dev.xdark.clientapi.renderer.culling;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.math.AxisAlignedBB;

@SidedApi(Side.SERVER)
public interface Camera {

  boolean isBoundingBoxInFrustum(AxisAlignedBB aabb);

  void setPosition(double x, double y, double z);
}
