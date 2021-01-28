package dev.xdark.clientapi.util;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface Rotation {

  Rotation NONE = objectValue(),
      CLOCKWISE_90 = objectValue(),
      CLOCKWISE_180 = objectValue(),
      COUNTERCLOCKWISE_90 = objectValue();

  Rotation add(Rotation o);

  EnumFacing rotate(EnumFacing facing);

  int rotate(int rot, int p_rotate_2_);
}
