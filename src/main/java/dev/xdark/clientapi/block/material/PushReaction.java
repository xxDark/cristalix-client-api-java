package dev.xdark.clientapi.block.material;

import static dev.xdark.clientapi.util.SideEffects.objectValue;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.SERVER)
public interface PushReaction {

  PushReaction NORMAL = objectValue(),
      DESTROY = objectValue(),
      BLOCK = objectValue(),
      IGNORE = objectValue(),
      PUSH_ONLY = objectValue();
}
