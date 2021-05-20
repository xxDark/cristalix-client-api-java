package dev.xdark.clientapi.event.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface BlockLeftClick extends Event, Cancellable {

  EventBus<BlockLeftClick> BUS = SideEffects.objectValue();

  BlockPos getPosition();

  EnumFacing getFacing();
}
