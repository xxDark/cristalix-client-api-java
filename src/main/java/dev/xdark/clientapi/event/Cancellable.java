package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

@SidedApi(Side.BOTH)
public interface Cancellable {

  boolean isCancelled();

  void setCancelled(boolean cancelled);
}
