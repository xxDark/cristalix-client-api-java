package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.entry.ScriptMain;
import java.util.function.Consumer;

@SidedApi(Side.BOTH)
public interface EventBus {

  Listener createListener(ScriptMain script);

  <V> void register(Listener listener, String action, Consumer<V> handler, int priority);

  void unregister(Listener listener, String action);

  void unregisterAll(Listener listener);

  <V> V post(String action, V value);
}
