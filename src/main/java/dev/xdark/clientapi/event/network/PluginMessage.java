package dev.xdark.clientapi.event.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import io.netty.buffer.ByteBuf;

@SidedApi(Side.BOTH)
public interface PluginMessage {

  String getChannel();

  ByteBuf getData();
}
