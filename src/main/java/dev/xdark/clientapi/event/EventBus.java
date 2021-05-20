package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.function.Consumer;

@SidedApi(Side.BOTH)
public interface EventBus<E extends Event> {

  Listener createListener();

  RegisteredListener register(Listener listener, Consumer<E> handler, int priority);

  void fireAndForget(E event);

  E fire(E event);

  @Deprecated
  <V> RegisteredListener register(
      Listener listener, Class<V> action, Consumer<V> handler, int priority);

  @Deprecated
  <V> void unregister(Class<V> action, Consumer<V> handler);

  void unregisterAll(Listener listener);

  @Deprecated
  <V> V post(Class<V> action, V value);

  @Deprecated
  boolean anyListeners(Class<?> action);
}
