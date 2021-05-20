package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;

@SidedApi(Side.BOTH)
public interface ServerJoin extends Event {

  // RealmInfo getRealm();
}
