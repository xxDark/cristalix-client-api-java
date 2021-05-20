package dev.xdark.clientapi.event.chat;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Cancellable;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface TabComplete extends Event, Cancellable {

  EventBus<TabComplete> BUS = SideEffects.objectValue();

  String getInput();

  boolean hasTargetBlock();

  BlockPos getTargetBlock();

  String[] getCompletions();

  void setCompletions(String... completions);
}
