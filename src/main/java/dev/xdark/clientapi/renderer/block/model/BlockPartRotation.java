package dev.xdark.clientapi.renderer.block.model;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;
import dev.xdark.clientapi.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;

@SidedApi(Side.SERVER)
public interface BlockPartRotation {

  Vector3f getOrigin();

  EnumFacing.Axis getAxis();

  float getAngle();

  boolean shouldRescale();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder original(Vector3f original);

    Builder axis(EnumFacing.Axis axis);

    Builder angle(float angle);

    Builder rescale(boolean rescale);

    BlockPartRotation build();
  }
}
