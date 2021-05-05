package dev.xdark.clientapi.event.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.EnumFacing;

@SidedApi(Side.SERVER)
public interface BlockLeftClick extends Cancellable {
  BlockPos getPosition();

  EnumFacing getFacing();
}
