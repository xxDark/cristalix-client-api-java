package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import java.util.function.Consumer;

@SidedApi(Side.BOTH)
public interface EventBus {

  Listener createListener();

  <V> RegisteredListener register(Listener listener, Class<V> action, Consumer<V> handler,
      int priority);

  <V> void unregister(Class<V> action, Consumer<V> handler);

  void unregisterAll(Listener listener);

  <V> V post(Class<V> action, V value);

  boolean anyListeners(Class<?> action);
}
