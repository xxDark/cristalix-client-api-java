package dev.xdark.clientapi.math;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.SERVER)
public interface Rotations {

  static Rotations of(float x, float y, float z) {
    throw CompileStub.INSTANCE;
  }

  float getX();

  float getY();

  float getZ();
}
