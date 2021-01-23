package dev.xdark.clientapi.event;

public interface Cancellable {

  boolean isCancelled();

  void setCancelled(boolean cancelled);
}
