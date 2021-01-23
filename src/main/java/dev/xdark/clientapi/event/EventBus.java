package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.function.Consumer;

@SidedApi(Side.BOTH)
public interface EventBus {

  Listener createListener();

  <V> RegisteredListener register(Listener listener, String action, Consumer<V> handler, int priority);

  void unregister(String action, Consumer<?> handler);

  void unregisterAll(Listener listener);

  <V> V post(String action, V value);
}
