package dev.xdark.clientapi.util;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

@SidedApi(Side.SERVER)
public interface BlockRenderLayer {

  BlockRenderLayer SOLID = objectValue(),
      CUTOUT_MIPPED = objectValue(),
      CUTOUT = objectValue(),
      TRANSLUCENT = objectValue();
}
