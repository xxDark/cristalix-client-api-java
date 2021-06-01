package dev.xdark.clientapi.block.state;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface BlockFaceShape {

  BlockFaceShape SOLID = objectValue(),
      BOWL = objectValue(),
      CENTER_SMALL = objectValue(),
      MIDDLE_POLE_THIN = objectValue(),
      CENTER = objectValue(),
      MIDDLE_POLE = objectValue(),
      CENTER_BIG = objectValue(),
      MIDDLE_POLE_THICK = objectValue(),
      UNDEFINED = objectValue();
}
