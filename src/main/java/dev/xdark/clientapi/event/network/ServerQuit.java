package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.SideEffects;

@SidedApi(Side.BOTH)
public interface ServerQuit extends Event {

  EventBus<ServerQuit> BUS = SideEffects.objectValue();

  Text getReason();
}
