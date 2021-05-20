package dev.xdark.clientapi.event;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

@SidedApi(Side.BOTH)
public interface Event {

  static <E extends Event> EventBus<E> bus(Class<E> event) {
    throw CompileStub.create();
  }
}
