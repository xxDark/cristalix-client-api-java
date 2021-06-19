package dev.xdark.clientapi.network;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.util.concurrent.Executor;

@SidedApi(Side.SERVER)
public interface Packet<T extends NetHandler> {

  void read(ByteBuf buf) throws IOException;

  void write(ByteBuf buf) throws IOException;

  default Executor executor(T handler) {
    return handler.executor();
  }

  void processPacket(T handler);
}
