package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.math.BlockPos;

@SidedApi(Side.BOTH)
public interface TabComplete extends Cancellable {

  String getInput();

  boolean hasTargetBlock();

  BlockPos getTargetBlock();

  String[] getCompletions();

  void setCompletions(String... completions);
}
