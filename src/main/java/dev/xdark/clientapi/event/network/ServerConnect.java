package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface ServerConnect extends ServerJoin {

  EventBus<ServerConnect> BUS = SideEffects.objectValue();
}
