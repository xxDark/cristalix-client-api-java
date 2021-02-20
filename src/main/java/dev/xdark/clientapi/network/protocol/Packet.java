package dev.xdark.clientapi.network.protocol;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import io.netty.buffer.ByteBuf;
import java.io.IOException;

@SidedApi(Side.SERVER)
public interface Packet {

  void read(ByteBuf buf) throws IOException;

  void write(ByteBuf buf) throws IOException;
}
