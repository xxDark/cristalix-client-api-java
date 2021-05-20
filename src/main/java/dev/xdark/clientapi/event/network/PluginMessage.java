package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.event.Event;
import dev.xdark.clientapi.event.EventBus;
import dev.xdark.clientapi.util.SideEffects;
import io.netty.buffer.ByteBuf;

@SidedApi(Side.BOTH)
public interface PluginMessage extends Event {

  EventBus<PluginMessage> BUS = SideEffects.objectValue();

  String getChannel();

  ByteBuf getData();
}
