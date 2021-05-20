package dev.xdark.clientapi.event.block;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.math.Vec3d;
import dev.xdark.clientapi.util.ActionResult;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.EnumHand;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.SERVER)
public interface BlockRightClick extends Event {

  EventBus<BlockRightClick> BUS = SideEffects.objectValue();

  BlockPos getPosition();

  EnumFacing getFacing();

  Vec3d getHitVec();

  EnumHand getHand();

  ActionResult getResult();

  void setResult(ActionResult result);
}
