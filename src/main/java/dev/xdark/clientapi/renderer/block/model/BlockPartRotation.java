package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

@SidedApi(Side.SERVER)
public interface BlockPartRotation {

  static BlockPartRotation of(
      Vector3f original, EnumFacing.Axis axis, float angle, boolean rescale) {
    throw CompileStub.create();
  }

  Vector3f getOrigin();

  EnumFacing.Axis getAxis();

  float getAngle();

  boolean shouldRescale();
}
